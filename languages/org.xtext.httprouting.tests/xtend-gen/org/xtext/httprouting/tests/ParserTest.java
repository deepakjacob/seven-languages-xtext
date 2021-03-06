package org.xtext.httprouting.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper.Result;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function3;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.httprouting.RouteInjectorProvider;

@InjectWith(value = RouteInjectorProvider.class)
@RunWith(value = XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private CompilationTestHelper _compilationTestHelper;
  
  @Test
  public void testFirstRuleDoesNotMatch() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GET /client/foo/:id/:name*  when id==\"43\" do response.addHeader(id, null)");
    _builder.newLine();
    _builder.append("GET /client/foo/:id/:name*  when id==\"42\" do response.addHeader(name + \"/\" + id, null)");
    _builder.newLine();
    final Procedure1<Result> _function = new Procedure1<Result>() {
        public void apply(final Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final HttpServlet servlet = ((HttpServlet) _newInstance);
            HttpServletResponse _response = ParserTest.this.response();
            final Procedure1<HttpServletResponse> _function = new Procedure1<HttpServletResponse>() {
                public void apply(final HttpServletResponse it) {
                  try {
                    HttpServletRequest _request = ParserTest.this.request("/client/foo/42/rest/of");
                    servlet.service(_request, it);
                    boolean _containsHeader = it.containsHeader("rest/of/42");
                    Assert.assertTrue("containsHeader(\'rest/of/42\')", _containsHeader);
                  } catch (Exception _e) {
                    throw Exceptions.sneakyThrow(_e);
                  }
                }
              };
            ObjectExtensions.<HttpServletResponse>operator_doubleArrow(_response, _function);
            HttpServletResponse _response_1 = ParserTest.this.response();
            final Procedure1<HttpServletResponse> _function_1 = new Procedure1<HttpServletResponse>() {
                public void apply(final HttpServletResponse it) {
                  try {
                    HttpServletRequest _request = ParserTest.this.request("/client/foo/43/rest/of");
                    servlet.service(_request, it);
                    boolean _containsHeader = it.containsHeader("43");
                    Assert.assertTrue("containsHeader(\'43\')", _containsHeader);
                  } catch (Exception _e) {
                    throw Exceptions.sneakyThrow(_e);
                  }
                }
              };
            ObjectExtensions.<HttpServletResponse>operator_doubleArrow(_response_1, _function_1);
          } catch (Exception _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
    this._compilationTestHelper.compile(_builder, new IAcceptor<Result>() {
        public void accept(Result t) {
          _function.apply(t);
        }
    });
  }
  
  /**
   * creates a HttpServletRequest proxy
   */
  public HttpServletRequest request(final String url) {
    final Function3<Object,Method,Object[],Object> _function = new Function3<Object,Method,Object[],Object>() {
        public Object apply(final Object proxy, final Method method, final Object[] args) {
          Object _switchResult = null;
          String _name = method.getName();
          final String _switchValue = _name;
          boolean _matched = false;
          if (!_matched) {
            if (Objects.equal(_switchValue,"getRequestURL")) {
              _matched=true;
              StringBuffer _stringBuffer = new StringBuffer(url);
              _switchResult = _stringBuffer;
            }
          }
          if (!_matched) {
            if (Objects.equal(_switchValue,"getMethod")) {
              _matched=true;
              _switchResult = "GET";
            }
          }
          return ((Serializable)_switchResult);
        }
      };
    HttpServletRequest _newProxy = this.<HttpServletRequest>newProxy(HttpServletRequest.class, new InvocationHandler() {
        public Object invoke(Object proxy,Method method,Object[] args) {
          return _function.apply(proxy,method,args);
        }
    });
    return _newProxy;
  }
  
  /**
   * creates a HttpServletResponse proxy
   */
  public HttpServletResponse response() {
    HttpServletResponse _xblockexpression = null;
    {
      final HashSet<String> header = CollectionLiterals.<String>newHashSet();
      final Function3<Object,Method,Object[],Boolean> _function = new Function3<Object,Method,Object[],Boolean>() {
          public Boolean apply(final Object proxy, final Method method, final Object[] args) {
            Boolean _switchResult = null;
            String _name = method.getName();
            final String _switchValue = _name;
            boolean _matched = false;
            if (!_matched) {
              if (Objects.equal(_switchValue,"addHeader")) {
                _matched=true;
                Object _get = ((List<Object>)Conversions.doWrapArray(args)).get(0);
                boolean _add = header.add(((String) _get));
                _switchResult = _add;
              }
            }
            if (!_matched) {
              if (Objects.equal(_switchValue,"containsHeader")) {
                _matched=true;
                Object _get_1 = ((List<Object>)Conversions.doWrapArray(args)).get(0);
                boolean _contains = header.contains(_get_1);
                _switchResult = _contains;
              }
            }
            return _switchResult;
          }
        };
      HttpServletResponse _newProxy = this.<HttpServletResponse>newProxy(HttpServletResponse.class, new InvocationHandler() {
          public Object invoke(Object proxy,Method method,Object[] args) {
            return _function.apply(proxy,method,args);
          }
      });
      _xblockexpression = (_newProxy);
    }
    return _xblockexpression;
  }
  
  /**
   * utility to create a proxy for a class and an invocation handler
   */
  private <T extends Object> T newProxy(final Class<T> clazz, final InvocationHandler handler) {
    Class<? extends Object> _class = this.getClass();
    ClassLoader _classLoader = _class.getClassLoader();
    ArrayList<Class<T>> _newArrayList = CollectionLiterals.<Class<T>>newArrayList(clazz);
    Object _newProxyInstance = Proxy.newProxyInstance(_classLoader, ((Class<? extends Object>[])Conversions.unwrapArray(_newArrayList, Class.class)), handler);
    return ((T) _newProxyInstance);
  }
}

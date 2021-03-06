package org.xtext.tortoiseshell.lib.view;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.xtext.tortoiseshell.lib.view.Animation;
import org.xtext.tortoiseshell.lib.view.TortoiseFigure;
import org.xtext.tortoiseshell.lib.view.TortoiseView;

@SuppressWarnings("all")
public class Animator extends UIJob {
  private final int UPDATE_INTERVAL = 20;
  
  @Inject
  private TortoiseView view;
  
  private long lastStart;
  
  private boolean isScheduled;
  
  private Queue<Animation> animationQueue = new Function0<Queue<Animation>>() {
    public Queue<Animation> apply() {
      ConcurrentLinkedQueue<Animation> _concurrentLinkedQueue = new ConcurrentLinkedQueue<Animation>();
      return _concurrentLinkedQueue;
    }
  }.apply();
  
  private boolean isStop;
  
  private boolean isAnimated = true;
  
  public Animator() {
    super("Tortoise Animator");
    this.isScheduled = false;
  }
  
  public long addAnimation(final Animation animation) {
    long _xifexpression = (long) 0;
    if (this.isAnimated) {
      long _xblockexpression = (long) 0;
      {
        this.animationQueue.add(animation);
        long _xifexpression_1 = (long) 0;
        boolean _and = false;
        boolean _not = (!this.isScheduled);
        if (!_not) {
          _and = false;
        } else {
          boolean _not_1 = (!this.isStop);
          _and = (_not && _not_1);
        }
        if (_and) {
          long _xblockexpression_1 = (long) 0;
          {
            this.schedule(this.UPDATE_INTERVAL);
            this.isScheduled = true;
            long _currentTimeMillis = System.currentTimeMillis();
            long _lastStart = this.lastStart = _currentTimeMillis;
            _xblockexpression_1 = (_lastStart);
          }
          _xifexpression_1 = _xblockexpression_1;
        }
        _xblockexpression = (_xifexpression_1);
      }
      _xifexpression = _xblockexpression;
    } else {
      TortoiseFigure _tortoiseFigure = this.view.getTortoiseFigure();
      animation.set(_tortoiseFigure, 1);
    }
    return _xifexpression;
  }
  
  public boolean setAnimated(final boolean isAnimated) {
    boolean _xblockexpression = false;
    {
      this.stop();
      boolean _isAnimated = this.isAnimated = isAnimated;
      _xblockexpression = (_isAnimated);
    }
    return _xblockexpression;
  }
  
  public boolean stop() {
    try {
      boolean _xblockexpression = false;
      {
        this.isStop = true;
        boolean _and = false;
        if (!this.isScheduled) {
          _and = false;
        } else {
          _and = (this.isScheduled && this.isStop);
        }
        boolean _while = _and;
        while (_while) {
          Display _current = Display.getCurrent();
          boolean _notEquals = (!Objects.equal(_current, null));
          if (_notEquals) {
            Display _current_1 = Display.getCurrent();
            _current_1.readAndDispatch();
          } else {
            this.join();
          }
          boolean _and_1 = false;
          if (!this.isScheduled) {
            _and_1 = false;
          } else {
            _and_1 = (this.isScheduled && this.isStop);
          }
          _while = _and_1;
        }
        this.animationQueue.clear();
        this.isStop = false;
        boolean _isScheduled = this.isScheduled = false;
        _xblockexpression = (_isScheduled);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public IStatus runInUIThread(final IProgressMonitor monitor) {
    IStatus _xblockexpression = null;
    {
      if (this.isStop) {
        this.isStop = false;
        this.isScheduled = false;
      } else {
        final long now = System.currentTimeMillis();
        Animation currentAnimation = this.animationQueue.peek();
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(currentAnimation, null));
        if (!_notEquals) {
          _and = false;
        } else {
          int _delay = currentAnimation.getDelay();
          long _plus = (this.lastStart + _delay);
          boolean _greaterEqualsThan = (now >= _plus);
          _and = (_notEquals && _greaterEqualsThan);
        }
        boolean _while = _and;
        while (_while) {
          {
            Animation _poll = this.animationQueue.poll();
            TortoiseFigure _tortoiseFigure = this.view.getTortoiseFigure();
            _poll.set(_tortoiseFigure, 1);
            int _delay_1 = currentAnimation.getDelay();
            long _plus_1 = (this.lastStart + _delay_1);
            this.lastStart = _plus_1;
            Animation _peek = this.animationQueue.peek();
            currentAnimation = _peek;
          }
          boolean _and_1 = false;
          boolean _notEquals_1 = (!Objects.equal(currentAnimation, null));
          if (!_notEquals_1) {
            _and_1 = false;
          } else {
            int _delay_1 = currentAnimation.getDelay();
            long _plus_1 = (this.lastStart + _delay_1);
            boolean _greaterEqualsThan_1 = (now >= _plus_1);
            _and_1 = (_notEquals_1 && _greaterEqualsThan_1);
          }
          _while = _and_1;
        }
        boolean _notEquals_1 = (!Objects.equal(currentAnimation, null));
        if (_notEquals_1) {
          long _minus = (now - this.lastStart);
          int _delay_1 = currentAnimation.getDelay();
          final double alpha = (((double) _minus) / _delay_1);
          TortoiseFigure _tortoiseFigure = this.view.getTortoiseFigure();
          currentAnimation.set(_tortoiseFigure, alpha);
          this.schedule(this.UPDATE_INTERVAL);
        } else {
          this.isScheduled = false;
        }
      }
      _xblockexpression = (Status.OK_STATUS);
    }
    return _xblockexpression;
  }
}

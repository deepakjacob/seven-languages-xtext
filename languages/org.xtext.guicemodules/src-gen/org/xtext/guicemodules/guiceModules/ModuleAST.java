/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.guicemodules.guiceModules;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module AST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.guicemodules.guiceModules.ModuleAST#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.ModuleAST#getMixins <em>Mixins</em>}</li>
 *   <li>{@link org.xtext.guicemodules.guiceModules.ModuleAST#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModuleAST()
 * @model
 * @generated
 */
public interface ModuleAST extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModuleAST_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.guicemodules.guiceModules.ModuleAST#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mixins</b></em>' reference list.
   * The list contents are of type {@link org.xtext.guicemodules.guiceModules.ModuleAST}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixins</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixins</em>' reference list.
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModuleAST_Mixins()
   * @model
   * @generated
   */
  EList<ModuleAST> getMixins();

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.guicemodules.guiceModules.BindingAST}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see org.xtext.guicemodules.guiceModules.GuiceModulesPackage#getModuleAST_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<BindingAST> getBindings();

} // ModuleAST

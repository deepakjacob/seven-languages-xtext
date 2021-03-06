/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.builddsl.build;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.builddsl.build.BuildFactory
 * @model kind="package"
 * @generated
 */
public interface BuildPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "build";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/builddsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "build";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BuildPackage eINSTANCE = org.xtext.builddsl.build.impl.BuildPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.builddsl.build.impl.BuildFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.builddsl.build.impl.BuildFileImpl
   * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getBuildFile()
   * @generated
   */
  int BUILD_FILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_FILE__DECLARATIONS = 2;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILD_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.builddsl.build.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.builddsl.build.impl.ImportDeclarationImpl
   * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getImportDeclaration()
   * @generated
   */
  int IMPORT_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.builddsl.build.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.builddsl.build.impl.DeclarationImpl
   * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.builddsl.build.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.builddsl.build.impl.ParameterImpl
   * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__INIT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.builddsl.build.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.builddsl.build.impl.TaskImpl
   * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getTask()
   * @generated
   */
  int TASK = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Depends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DEPENDS = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ACTION = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.builddsl.build.BuildFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.builddsl.build.BuildFile
   * @generated
   */
  EClass getBuildFile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.builddsl.build.BuildFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.builddsl.build.BuildFile#getName()
   * @see #getBuildFile()
   * @generated
   */
  EAttribute getBuildFile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.builddsl.build.BuildFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.builddsl.build.BuildFile#getImports()
   * @see #getBuildFile()
   * @generated
   */
  EReference getBuildFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.builddsl.build.BuildFile#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.xtext.builddsl.build.BuildFile#getDeclarations()
   * @see #getBuildFile()
   * @generated
   */
  EReference getBuildFile_Declarations();

  /**
   * Returns the meta object for class '{@link org.xtext.builddsl.build.ImportDeclaration <em>Import Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Declaration</em>'.
   * @see org.xtext.builddsl.build.ImportDeclaration
   * @generated
   */
  EClass getImportDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.builddsl.build.ImportDeclaration#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.builddsl.build.ImportDeclaration#getImportedNamespace()
   * @see #getImportDeclaration()
   * @generated
   */
  EAttribute getImportDeclaration_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.builddsl.build.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.xtext.builddsl.build.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.builddsl.build.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.builddsl.build.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.builddsl.build.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.builddsl.build.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.builddsl.build.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.builddsl.build.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.builddsl.build.Parameter#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.xtext.builddsl.build.Parameter#getInit()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Init();

  /**
   * Returns the meta object for class '{@link org.xtext.builddsl.build.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see org.xtext.builddsl.build.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.builddsl.build.Task#getDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Depends</em>'.
   * @see org.xtext.builddsl.build.Task#getDepends()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Depends();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.builddsl.build.Task#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.xtext.builddsl.build.Task#getAction()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Action();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BuildFactory getBuildFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.builddsl.build.impl.BuildFileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.builddsl.build.impl.BuildFileImpl
     * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getBuildFile()
     * @generated
     */
    EClass BUILD_FILE = eINSTANCE.getBuildFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUILD_FILE__NAME = eINSTANCE.getBuildFile_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_FILE__IMPORTS = eINSTANCE.getBuildFile_Imports();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUILD_FILE__DECLARATIONS = eINSTANCE.getBuildFile_Declarations();

    /**
     * The meta object literal for the '{@link org.xtext.builddsl.build.impl.ImportDeclarationImpl <em>Import Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.builddsl.build.impl.ImportDeclarationImpl
     * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getImportDeclaration()
     * @generated
     */
    EClass IMPORT_DECLARATION = eINSTANCE.getImportDeclaration();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_DECLARATION__IMPORTED_NAMESPACE = eINSTANCE.getImportDeclaration_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.builddsl.build.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.builddsl.build.impl.DeclarationImpl
     * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.builddsl.build.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.builddsl.build.impl.ParameterImpl
     * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__INIT = eINSTANCE.getParameter_Init();

    /**
     * The meta object literal for the '{@link org.xtext.builddsl.build.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.builddsl.build.impl.TaskImpl
     * @see org.xtext.builddsl.build.impl.BuildPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__DEPENDS = eINSTANCE.getTask_Depends();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__ACTION = eINSTANCE.getTask_Action();

  }

} //BuildPackage

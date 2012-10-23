/**
 */
package org.xtext.guicemodules.guiceModules;

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
 * @see org.xtext.guicemodules.guiceModules.GuiceModulesFactory
 * @model kind="package"
 * @generated
 */
public interface GuiceModulesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "guiceModules";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/guicemodules/GuiceModules";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "guiceModules";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuiceModulesPackage eINSTANCE = org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.guicemodules.guiceModules.impl.ModulesASTImpl <em>Modules AST</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.guicemodules.guiceModules.impl.ModulesASTImpl
   * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getModulesAST()
   * @generated
   */
  int MODULES_AST = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULES_AST__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULES_AST__MODULES = 1;

  /**
   * The number of structural features of the '<em>Modules AST</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULES_AST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.guicemodules.guiceModules.impl.ModuleASTImpl <em>Module AST</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.guicemodules.guiceModules.impl.ModuleASTImpl
   * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getModuleAST()
   * @generated
   */
  int MODULE_AST = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_AST__NAME = 0;

  /**
   * The feature id for the '<em><b>Mixins</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_AST__MIXINS = 1;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_AST__BINDINGS = 2;

  /**
   * The number of structural features of the '<em>Module AST</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_AST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.guicemodules.guiceModules.impl.BindingASTImpl <em>Binding AST</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.guicemodules.guiceModules.impl.BindingASTImpl
   * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getBindingAST()
   * @generated
   */
  int BINDING_AST = 2;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_AST__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_AST__TO = 1;

  /**
   * The feature id for the '<em><b>To Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_AST__TO_INSTANCE = 2;

  /**
   * The number of structural features of the '<em>Binding AST</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_AST_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.guicemodules.guiceModules.impl.KeyASTImpl <em>Key AST</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.guicemodules.guiceModules.impl.KeyASTImpl
   * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getKeyAST()
   * @generated
   */
  int KEY_AST = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_AST__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_AST__TYPE = 1;

  /**
   * The number of structural features of the '<em>Key AST</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_AST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.guicemodules.guiceModules.impl.ImportASTImpl <em>Import AST</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.guicemodules.guiceModules.impl.ImportASTImpl
   * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getImportAST()
   * @generated
   */
  int IMPORT_AST = 4;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_AST__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import AST</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_AST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.guicemodules.guiceModules.ModulesAST <em>Modules AST</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Modules AST</em>'.
   * @see org.xtext.guicemodules.guiceModules.ModulesAST
   * @generated
   */
  EClass getModulesAST();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.guicemodules.guiceModules.ModulesAST#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.guicemodules.guiceModules.ModulesAST#getImports()
   * @see #getModulesAST()
   * @generated
   */
  EReference getModulesAST_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.guicemodules.guiceModules.ModulesAST#getModules <em>Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modules</em>'.
   * @see org.xtext.guicemodules.guiceModules.ModulesAST#getModules()
   * @see #getModulesAST()
   * @generated
   */
  EReference getModulesAST_Modules();

  /**
   * Returns the meta object for class '{@link org.xtext.guicemodules.guiceModules.ModuleAST <em>Module AST</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module AST</em>'.
   * @see org.xtext.guicemodules.guiceModules.ModuleAST
   * @generated
   */
  EClass getModuleAST();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.guicemodules.guiceModules.ModuleAST#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.guicemodules.guiceModules.ModuleAST#getName()
   * @see #getModuleAST()
   * @generated
   */
  EAttribute getModuleAST_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.guicemodules.guiceModules.ModuleAST#getMixins <em>Mixins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Mixins</em>'.
   * @see org.xtext.guicemodules.guiceModules.ModuleAST#getMixins()
   * @see #getModuleAST()
   * @generated
   */
  EReference getModuleAST_Mixins();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.guicemodules.guiceModules.ModuleAST#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.xtext.guicemodules.guiceModules.ModuleAST#getBindings()
   * @see #getModuleAST()
   * @generated
   */
  EReference getModuleAST_Bindings();

  /**
   * Returns the meta object for class '{@link org.xtext.guicemodules.guiceModules.BindingAST <em>Binding AST</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding AST</em>'.
   * @see org.xtext.guicemodules.guiceModules.BindingAST
   * @generated
   */
  EClass getBindingAST();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.guicemodules.guiceModules.BindingAST#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see org.xtext.guicemodules.guiceModules.BindingAST#getFrom()
   * @see #getBindingAST()
   * @generated
   */
  EReference getBindingAST_From();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.guicemodules.guiceModules.BindingAST#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see org.xtext.guicemodules.guiceModules.BindingAST#getTo()
   * @see #getBindingAST()
   * @generated
   */
  EReference getBindingAST_To();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.guicemodules.guiceModules.BindingAST#getToInstance <em>To Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To Instance</em>'.
   * @see org.xtext.guicemodules.guiceModules.BindingAST#getToInstance()
   * @see #getBindingAST()
   * @generated
   */
  EReference getBindingAST_ToInstance();

  /**
   * Returns the meta object for class '{@link org.xtext.guicemodules.guiceModules.KeyAST <em>Key AST</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key AST</em>'.
   * @see org.xtext.guicemodules.guiceModules.KeyAST
   * @generated
   */
  EClass getKeyAST();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.guicemodules.guiceModules.KeyAST#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see org.xtext.guicemodules.guiceModules.KeyAST#getAnnotation()
   * @see #getKeyAST()
   * @generated
   */
  EReference getKeyAST_Annotation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.guicemodules.guiceModules.KeyAST#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.guicemodules.guiceModules.KeyAST#getType()
   * @see #getKeyAST()
   * @generated
   */
  EReference getKeyAST_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.guicemodules.guiceModules.ImportAST <em>Import AST</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import AST</em>'.
   * @see org.xtext.guicemodules.guiceModules.ImportAST
   * @generated
   */
  EClass getImportAST();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.guicemodules.guiceModules.ImportAST#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.guicemodules.guiceModules.ImportAST#getImportedNamespace()
   * @see #getImportAST()
   * @generated
   */
  EAttribute getImportAST_ImportedNamespace();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GuiceModulesFactory getGuiceModulesFactory();

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
     * The meta object literal for the '{@link org.xtext.guicemodules.guiceModules.impl.ModulesASTImpl <em>Modules AST</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.guicemodules.guiceModules.impl.ModulesASTImpl
     * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getModulesAST()
     * @generated
     */
    EClass MODULES_AST = eINSTANCE.getModulesAST();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULES_AST__IMPORTS = eINSTANCE.getModulesAST_Imports();

    /**
     * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULES_AST__MODULES = eINSTANCE.getModulesAST_Modules();

    /**
     * The meta object literal for the '{@link org.xtext.guicemodules.guiceModules.impl.ModuleASTImpl <em>Module AST</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.guicemodules.guiceModules.impl.ModuleASTImpl
     * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getModuleAST()
     * @generated
     */
    EClass MODULE_AST = eINSTANCE.getModuleAST();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_AST__NAME = eINSTANCE.getModuleAST_Name();

    /**
     * The meta object literal for the '<em><b>Mixins</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_AST__MIXINS = eINSTANCE.getModuleAST_Mixins();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_AST__BINDINGS = eINSTANCE.getModuleAST_Bindings();

    /**
     * The meta object literal for the '{@link org.xtext.guicemodules.guiceModules.impl.BindingASTImpl <em>Binding AST</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.guicemodules.guiceModules.impl.BindingASTImpl
     * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getBindingAST()
     * @generated
     */
    EClass BINDING_AST = eINSTANCE.getBindingAST();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_AST__FROM = eINSTANCE.getBindingAST_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_AST__TO = eINSTANCE.getBindingAST_To();

    /**
     * The meta object literal for the '<em><b>To Instance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING_AST__TO_INSTANCE = eINSTANCE.getBindingAST_ToInstance();

    /**
     * The meta object literal for the '{@link org.xtext.guicemodules.guiceModules.impl.KeyASTImpl <em>Key AST</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.guicemodules.guiceModules.impl.KeyASTImpl
     * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getKeyAST()
     * @generated
     */
    EClass KEY_AST = eINSTANCE.getKeyAST();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_AST__ANNOTATION = eINSTANCE.getKeyAST_Annotation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEY_AST__TYPE = eINSTANCE.getKeyAST_Type();

    /**
     * The meta object literal for the '{@link org.xtext.guicemodules.guiceModules.impl.ImportASTImpl <em>Import AST</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.guicemodules.guiceModules.impl.ImportASTImpl
     * @see org.xtext.guicemodules.guiceModules.impl.GuiceModulesPackageImpl#getImportAST()
     * @generated
     */
    EClass IMPORT_AST = eINSTANCE.getImportAST();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_AST__IMPORTED_NAMESPACE = eINSTANCE.getImportAST_ImportedNamespace();

  }

} //GuiceModulesPackage
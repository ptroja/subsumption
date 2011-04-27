/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption;

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
 * @see subsumption.SubsumptionFactory
 * @model kind="package"
 * @generated
 */
public interface SubsumptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "subsumption";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subsumption/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "subsumption";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SubsumptionPackage eINSTANCE = subsumption.impl.SubsumptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link subsumption.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subsumption.impl.SystemImpl
	 * @see subsumption.impl.SubsumptionPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 1;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link subsumption.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subsumption.impl.ModuleImpl
	 * @see subsumption.impl.SubsumptionPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUTPUTS = 2;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PERIOD = 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link subsumption.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subsumption.impl.OutputImpl
	 * @see subsumption.impl.SubsumptionPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SINK = 1;

	/**
	 * The feature id for the '<em><b>Activates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ACTIVATES = 2;

	/**
	 * The feature id for the '<em><b>Inhibited By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__INHIBITED_BY = 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link subsumption.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subsumption.impl.InputImpl
	 * @see subsumption.impl.SubsumptionPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Suppressed By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SUPPRESSED_BY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link subsumption.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subsumption.impl.ModifierImpl
	 * @see subsumption.impl.SubsumptionPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 6;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__CONTROLLED_BY = 0;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link subsumption.impl.SuppressorImpl <em>Suppressor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subsumption.impl.SuppressorImpl
	 * @see subsumption.impl.SubsumptionPackageImpl#getSuppressor()
	 * @generated
	 */
	int SUPPRESSOR = 4;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPRESSOR__CONTROLLED_BY = MODIFIER__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPRESSOR__TIME = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suppress</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPRESSOR__SUPPRESS = MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Suppressor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPRESSOR_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link subsumption.impl.InhibitorImpl <em>Inhibitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subsumption.impl.InhibitorImpl
	 * @see subsumption.impl.SubsumptionPackageImpl#getInhibitor()
	 * @generated
	 */
	int INHIBITOR = 5;

	/**
	 * The feature id for the '<em><b>Controlled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR__CONTROLLED_BY = MODIFIER__CONTROLLED_BY;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR__TIME = MODIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inhibits</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR__INHIBITS = MODIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inhibitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHIBITOR_FEATURE_COUNT = MODIFIER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link subsumption.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see subsumption.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link subsumption.System#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see subsumption.System#getModules()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Modules();

	/**
	 * Returns the meta object for the attribute '{@link subsumption.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subsumption.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for class '{@link subsumption.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see subsumption.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link subsumption.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subsumption.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link subsumption.Module#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see subsumption.Module#getInputs()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link subsumption.Module#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see subsumption.Module#getOutputs()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link subsumption.Module#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see subsumption.Module#getPeriod()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Period();

	/**
	 * Returns the meta object for class '{@link subsumption.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see subsumption.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link subsumption.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subsumption.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the reference list '{@link subsumption.Output#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sink</em>'.
	 * @see subsumption.Output#getSink()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Sink();

	/**
	 * Returns the meta object for the reference list '{@link subsumption.Output#getActivates <em>Activates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activates</em>'.
	 * @see subsumption.Output#getActivates()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Activates();

	/**
	 * Returns the meta object for the containment reference list '{@link subsumption.Output#getInhibitedBy <em>Inhibited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inhibited By</em>'.
	 * @see subsumption.Output#getInhibitedBy()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_InhibitedBy();

	/**
	 * Returns the meta object for class '{@link subsumption.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see subsumption.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference '{@link subsumption.Input#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see subsumption.Input#getSource()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link subsumption.Input#getSuppressedBy <em>Suppressed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Suppressed By</em>'.
	 * @see subsumption.Input#getSuppressedBy()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_SuppressedBy();

	/**
	 * Returns the meta object for the attribute '{@link subsumption.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subsumption.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for class '{@link subsumption.Suppressor <em>Suppressor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suppressor</em>'.
	 * @see subsumption.Suppressor
	 * @generated
	 */
	EClass getSuppressor();

	/**
	 * Returns the meta object for the attribute '{@link subsumption.Suppressor#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see subsumption.Suppressor#getTime()
	 * @see #getSuppressor()
	 * @generated
	 */
	EAttribute getSuppressor_Time();

	/**
	 * Returns the meta object for the container reference '{@link subsumption.Suppressor#getSuppress <em>Suppress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Suppress</em>'.
	 * @see subsumption.Suppressor#getSuppress()
	 * @see #getSuppressor()
	 * @generated
	 */
	EReference getSuppressor_Suppress();

	/**
	 * Returns the meta object for class '{@link subsumption.Inhibitor <em>Inhibitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inhibitor</em>'.
	 * @see subsumption.Inhibitor
	 * @generated
	 */
	EClass getInhibitor();

	/**
	 * Returns the meta object for the attribute '{@link subsumption.Inhibitor#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see subsumption.Inhibitor#getTime()
	 * @see #getInhibitor()
	 * @generated
	 */
	EAttribute getInhibitor_Time();

	/**
	 * Returns the meta object for the container reference '{@link subsumption.Inhibitor#getInhibits <em>Inhibits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Inhibits</em>'.
	 * @see subsumption.Inhibitor#getInhibits()
	 * @see #getInhibitor()
	 * @generated
	 */
	EReference getInhibitor_Inhibits();

	/**
	 * Returns the meta object for class '{@link subsumption.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see subsumption.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for the reference '{@link subsumption.Modifier#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlled By</em>'.
	 * @see subsumption.Modifier#getControlledBy()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_ControlledBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SubsumptionFactory getSubsumptionFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link subsumption.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subsumption.impl.SystemImpl
		 * @see subsumption.impl.SubsumptionPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__MODULES = eINSTANCE.getSystem_Modules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '{@link subsumption.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subsumption.impl.ModuleImpl
		 * @see subsumption.impl.SubsumptionPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__INPUTS = eINSTANCE.getModule_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OUTPUTS = eINSTANCE.getModule_Outputs();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__PERIOD = eINSTANCE.getModule_Period();

		/**
		 * The meta object literal for the '{@link subsumption.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subsumption.impl.OutputImpl
		 * @see subsumption.impl.SubsumptionPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__SINK = eINSTANCE.getOutput_Sink();

		/**
		 * The meta object literal for the '<em><b>Activates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__ACTIVATES = eINSTANCE.getOutput_Activates();

		/**
		 * The meta object literal for the '<em><b>Inhibited By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__INHIBITED_BY = eINSTANCE.getOutput_InhibitedBy();

		/**
		 * The meta object literal for the '{@link subsumption.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subsumption.impl.InputImpl
		 * @see subsumption.impl.SubsumptionPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__SOURCE = eINSTANCE.getInput_Source();

		/**
		 * The meta object literal for the '<em><b>Suppressed By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__SUPPRESSED_BY = eINSTANCE.getInput_SuppressedBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '{@link subsumption.impl.SuppressorImpl <em>Suppressor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subsumption.impl.SuppressorImpl
		 * @see subsumption.impl.SubsumptionPackageImpl#getSuppressor()
		 * @generated
		 */
		EClass SUPPRESSOR = eINSTANCE.getSuppressor();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPRESSOR__TIME = eINSTANCE.getSuppressor_Time();

		/**
		 * The meta object literal for the '<em><b>Suppress</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPRESSOR__SUPPRESS = eINSTANCE.getSuppressor_Suppress();

		/**
		 * The meta object literal for the '{@link subsumption.impl.InhibitorImpl <em>Inhibitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subsumption.impl.InhibitorImpl
		 * @see subsumption.impl.SubsumptionPackageImpl#getInhibitor()
		 * @generated
		 */
		EClass INHIBITOR = eINSTANCE.getInhibitor();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHIBITOR__TIME = eINSTANCE.getInhibitor_Time();

		/**
		 * The meta object literal for the '<em><b>Inhibits</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHIBITOR__INHIBITS = eINSTANCE.getInhibitor_Inhibits();

		/**
		 * The meta object literal for the '{@link subsumption.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subsumption.impl.ModifierImpl
		 * @see subsumption.impl.SubsumptionPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '<em><b>Controlled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__CONTROLLED_BY = eINSTANCE.getModifier_ControlledBy();

	}

} //SubsumptionPackage

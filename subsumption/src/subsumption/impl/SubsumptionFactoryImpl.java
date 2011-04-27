/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import subsumption.Inhibitor;
import subsumption.Input;
import subsumption.Module;
import subsumption.Output;
import subsumption.SubsumptionFactory;
import subsumption.SubsumptionPackage;
import subsumption.Suppressor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubsumptionFactoryImpl extends EFactoryImpl implements SubsumptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubsumptionFactory init() {
		try {
			SubsumptionFactory theSubsumptionFactory = (SubsumptionFactory)EPackage.Registry.INSTANCE.getEFactory("http://subsumption/1.0"); 
			if (theSubsumptionFactory != null) {
				return theSubsumptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SubsumptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsumptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SubsumptionPackage.SYSTEM: return createSystem();
			case SubsumptionPackage.MODULE: return createModule();
			case SubsumptionPackage.OUTPUT: return createOutput();
			case SubsumptionPackage.INPUT: return createInput();
			case SubsumptionPackage.SUPPRESSOR: return createSuppressor();
			case SubsumptionPackage.INHIBITOR: return createInhibitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subsumption.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Suppressor createSuppressor() {
		SuppressorImpl suppressor = new SuppressorImpl();
		return suppressor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inhibitor createInhibitor() {
		InhibitorImpl inhibitor = new InhibitorImpl();
		return inhibitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsumptionPackage getSubsumptionPackage() {
		return (SubsumptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SubsumptionPackage getPackage() {
		return SubsumptionPackage.eINSTANCE;
	}

} //SubsumptionFactoryImpl

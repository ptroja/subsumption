/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import subsumption.Inhibitor;
import subsumption.Input;
import subsumption.Modifier;
import subsumption.Output;
import subsumption.SubsumptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subsumption.impl.OutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link subsumption.impl.OutputImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link subsumption.impl.OutputImpl#getActivates <em>Activates</em>}</li>
 *   <li>{@link subsumption.impl.OutputImpl#getInhibitedBy <em>Inhibited By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputImpl extends EObjectImpl implements Output {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> sink;

	/**
	 * The cached value of the '{@link #getActivates() <em>Activates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivates()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier> activates;

	/**
	 * The cached value of the '{@link #getInhibitedBy() <em>Inhibited By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhibitedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Inhibitor> inhibitedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubsumptionPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubsumptionPackage.OUTPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getSink() {
		if (sink == null) {
			sink = new EObjectWithInverseResolvingEList<Input>(Input.class, this, SubsumptionPackage.OUTPUT__SINK, SubsumptionPackage.INPUT__SOURCE);
		}
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modifier> getActivates() {
		if (activates == null) {
			activates = new EObjectWithInverseResolvingEList<Modifier>(Modifier.class, this, SubsumptionPackage.OUTPUT__ACTIVATES, SubsumptionPackage.MODIFIER__CONTROLLED_BY);
		}
		return activates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Inhibitor> getInhibitedBy() {
		if (inhibitedBy == null) {
			inhibitedBy = new EObjectContainmentWithInverseEList<Inhibitor>(Inhibitor.class, this, SubsumptionPackage.OUTPUT__INHIBITED_BY, SubsumptionPackage.INHIBITOR__INHIBITS);
		}
		return inhibitedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubsumptionPackage.OUTPUT__SINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSink()).basicAdd(otherEnd, msgs);
			case SubsumptionPackage.OUTPUT__ACTIVATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivates()).basicAdd(otherEnd, msgs);
			case SubsumptionPackage.OUTPUT__INHIBITED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInhibitedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubsumptionPackage.OUTPUT__SINK:
				return ((InternalEList<?>)getSink()).basicRemove(otherEnd, msgs);
			case SubsumptionPackage.OUTPUT__ACTIVATES:
				return ((InternalEList<?>)getActivates()).basicRemove(otherEnd, msgs);
			case SubsumptionPackage.OUTPUT__INHIBITED_BY:
				return ((InternalEList<?>)getInhibitedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubsumptionPackage.OUTPUT__NAME:
				return getName();
			case SubsumptionPackage.OUTPUT__SINK:
				return getSink();
			case SubsumptionPackage.OUTPUT__ACTIVATES:
				return getActivates();
			case SubsumptionPackage.OUTPUT__INHIBITED_BY:
				return getInhibitedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubsumptionPackage.OUTPUT__NAME:
				setName((String)newValue);
				return;
			case SubsumptionPackage.OUTPUT__SINK:
				getSink().clear();
				getSink().addAll((Collection<? extends Input>)newValue);
				return;
			case SubsumptionPackage.OUTPUT__ACTIVATES:
				getActivates().clear();
				getActivates().addAll((Collection<? extends Modifier>)newValue);
				return;
			case SubsumptionPackage.OUTPUT__INHIBITED_BY:
				getInhibitedBy().clear();
				getInhibitedBy().addAll((Collection<? extends Inhibitor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SubsumptionPackage.OUTPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SubsumptionPackage.OUTPUT__SINK:
				getSink().clear();
				return;
			case SubsumptionPackage.OUTPUT__ACTIVATES:
				getActivates().clear();
				return;
			case SubsumptionPackage.OUTPUT__INHIBITED_BY:
				getInhibitedBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SubsumptionPackage.OUTPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SubsumptionPackage.OUTPUT__SINK:
				return sink != null && !sink.isEmpty();
			case SubsumptionPackage.OUTPUT__ACTIVATES:
				return activates != null && !activates.isEmpty();
			case SubsumptionPackage.OUTPUT__INHIBITED_BY:
				return inhibitedBy != null && !inhibitedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OutputImpl

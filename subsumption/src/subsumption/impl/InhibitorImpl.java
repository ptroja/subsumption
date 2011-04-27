/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import subsumption.Inhibitor;
import subsumption.Output;
import subsumption.SubsumptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inhibitor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subsumption.impl.InhibitorImpl#getTime <em>Time</em>}</li>
 *   <li>{@link subsumption.impl.InhibitorImpl#getInhibits <em>Inhibits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InhibitorImpl extends ModifierImpl implements Inhibitor {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected float time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InhibitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubsumptionPackage.Literals.INHIBITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(float newTime) {
		float oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubsumptionPackage.INHIBITOR__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getInhibits() {
		if (eContainerFeatureID() != SubsumptionPackage.INHIBITOR__INHIBITS) return null;
		return (Output)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInhibits(Output newInhibits, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInhibits, SubsumptionPackage.INHIBITOR__INHIBITS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInhibits(Output newInhibits) {
		if (newInhibits != eInternalContainer() || (eContainerFeatureID() != SubsumptionPackage.INHIBITOR__INHIBITS && newInhibits != null)) {
			if (EcoreUtil.isAncestor(this, newInhibits))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInhibits != null)
				msgs = ((InternalEObject)newInhibits).eInverseAdd(this, SubsumptionPackage.OUTPUT__INHIBITED_BY, Output.class, msgs);
			msgs = basicSetInhibits(newInhibits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubsumptionPackage.INHIBITOR__INHIBITS, newInhibits, newInhibits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubsumptionPackage.INHIBITOR__INHIBITS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInhibits((Output)otherEnd, msgs);
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
			case SubsumptionPackage.INHIBITOR__INHIBITS:
				return basicSetInhibits(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SubsumptionPackage.INHIBITOR__INHIBITS:
				return eInternalContainer().eInverseRemove(this, SubsumptionPackage.OUTPUT__INHIBITED_BY, Output.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SubsumptionPackage.INHIBITOR__TIME:
				return getTime();
			case SubsumptionPackage.INHIBITOR__INHIBITS:
				return getInhibits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SubsumptionPackage.INHIBITOR__TIME:
				setTime((Float)newValue);
				return;
			case SubsumptionPackage.INHIBITOR__INHIBITS:
				setInhibits((Output)newValue);
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
			case SubsumptionPackage.INHIBITOR__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SubsumptionPackage.INHIBITOR__INHIBITS:
				setInhibits((Output)null);
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
			case SubsumptionPackage.INHIBITOR__TIME:
				return time != TIME_EDEFAULT;
			case SubsumptionPackage.INHIBITOR__INHIBITS:
				return getInhibits() != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //InhibitorImpl

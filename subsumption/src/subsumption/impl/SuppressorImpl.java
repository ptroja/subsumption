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

import subsumption.Input;
import subsumption.SubsumptionPackage;
import subsumption.Suppressor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suppressor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subsumption.impl.SuppressorImpl#getTime <em>Time</em>}</li>
 *   <li>{@link subsumption.impl.SuppressorImpl#getSuppress <em>Suppress</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuppressorImpl extends ModifierImpl implements Suppressor {
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
	protected SuppressorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubsumptionPackage.Literals.SUPPRESSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SubsumptionPackage.SUPPRESSOR__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getSuppress() {
		if (eContainerFeatureID() != SubsumptionPackage.SUPPRESSOR__SUPPRESS) return null;
		return (Input)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuppress(Input newSuppress, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuppress, SubsumptionPackage.SUPPRESSOR__SUPPRESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuppress(Input newSuppress) {
		if (newSuppress != eInternalContainer() || (eContainerFeatureID() != SubsumptionPackage.SUPPRESSOR__SUPPRESS && newSuppress != null)) {
			if (EcoreUtil.isAncestor(this, newSuppress))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuppress != null)
				msgs = ((InternalEObject)newSuppress).eInverseAdd(this, SubsumptionPackage.INPUT__SUPPRESSED_BY, Input.class, msgs);
			msgs = basicSetSuppress(newSuppress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubsumptionPackage.SUPPRESSOR__SUPPRESS, newSuppress, newSuppress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubsumptionPackage.SUPPRESSOR__SUPPRESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuppress((Input)otherEnd, msgs);
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
			case SubsumptionPackage.SUPPRESSOR__SUPPRESS:
				return basicSetSuppress(null, msgs);
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
			case SubsumptionPackage.SUPPRESSOR__SUPPRESS:
				return eInternalContainer().eInverseRemove(this, SubsumptionPackage.INPUT__SUPPRESSED_BY, Input.class, msgs);
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
			case SubsumptionPackage.SUPPRESSOR__TIME:
				return getTime();
			case SubsumptionPackage.SUPPRESSOR__SUPPRESS:
				return getSuppress();
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
			case SubsumptionPackage.SUPPRESSOR__TIME:
				setTime((Float)newValue);
				return;
			case SubsumptionPackage.SUPPRESSOR__SUPPRESS:
				setSuppress((Input)newValue);
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
			case SubsumptionPackage.SUPPRESSOR__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SubsumptionPackage.SUPPRESSOR__SUPPRESS:
				setSuppress((Input)null);
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
			case SubsumptionPackage.SUPPRESSOR__TIME:
				return time != TIME_EDEFAULT;
			case SubsumptionPackage.SUPPRESSOR__SUPPRESS:
				return getSuppress() != null;
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

} //SuppressorImpl

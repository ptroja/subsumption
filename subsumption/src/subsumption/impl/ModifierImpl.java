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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import subsumption.Modifier;
import subsumption.Output;
import subsumption.SubsumptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subsumption.impl.ModifierImpl#getControlledBy <em>Controlled By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModifierImpl extends EObjectImpl implements Modifier {
	/**
	 * The cached value of the '{@link #getControlledBy() <em>Controlled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledBy()
	 * @generated
	 * @ordered
	 */
	protected Output controlledBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SubsumptionPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getControlledBy() {
		if (controlledBy != null && controlledBy.eIsProxy()) {
			InternalEObject oldControlledBy = (InternalEObject)controlledBy;
			controlledBy = (Output)eResolveProxy(oldControlledBy);
			if (controlledBy != oldControlledBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SubsumptionPackage.MODIFIER__CONTROLLED_BY, oldControlledBy, controlledBy));
			}
		}
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetControlledBy() {
		return controlledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlledBy(Output newControlledBy, NotificationChain msgs) {
		Output oldControlledBy = controlledBy;
		controlledBy = newControlledBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SubsumptionPackage.MODIFIER__CONTROLLED_BY, oldControlledBy, newControlledBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlledBy(Output newControlledBy) {
		if (newControlledBy != controlledBy) {
			NotificationChain msgs = null;
			if (controlledBy != null)
				msgs = ((InternalEObject)controlledBy).eInverseRemove(this, SubsumptionPackage.OUTPUT__ACTIVATES, Output.class, msgs);
			if (newControlledBy != null)
				msgs = ((InternalEObject)newControlledBy).eInverseAdd(this, SubsumptionPackage.OUTPUT__ACTIVATES, Output.class, msgs);
			msgs = basicSetControlledBy(newControlledBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SubsumptionPackage.MODIFIER__CONTROLLED_BY, newControlledBy, newControlledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SubsumptionPackage.MODIFIER__CONTROLLED_BY:
				if (controlledBy != null)
					msgs = ((InternalEObject)controlledBy).eInverseRemove(this, SubsumptionPackage.OUTPUT__ACTIVATES, Output.class, msgs);
				return basicSetControlledBy((Output)otherEnd, msgs);
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
			case SubsumptionPackage.MODIFIER__CONTROLLED_BY:
				return basicSetControlledBy(null, msgs);
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
			case SubsumptionPackage.MODIFIER__CONTROLLED_BY:
				if (resolve) return getControlledBy();
				return basicGetControlledBy();
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
			case SubsumptionPackage.MODIFIER__CONTROLLED_BY:
				setControlledBy((Output)newValue);
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
			case SubsumptionPackage.MODIFIER__CONTROLLED_BY:
				setControlledBy((Output)null);
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
			case SubsumptionPackage.MODIFIER__CONTROLLED_BY:
				return controlledBy != null;
		}
		return super.eIsSet(featureID);
	}

} //ModifierImpl

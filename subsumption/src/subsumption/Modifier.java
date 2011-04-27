/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subsumption.Modifier#getControlledBy <em>Controlled By</em>}</li>
 * </ul>
 * </p>
 *
 * @see subsumption.SubsumptionPackage#getModifier()
 * @model abstract="true"
 * @generated
 */
public interface Modifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Controlled By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link subsumption.Output#getActivates <em>Activates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controlled By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlled By</em>' reference.
	 * @see #setControlledBy(Output)
	 * @see subsumption.SubsumptionPackage#getModifier_ControlledBy()
	 * @see subsumption.Output#getActivates
	 * @model opposite="activates" required="true"
	 * @generated
	 */
	Output getControlledBy();

	/**
	 * Sets the value of the '{@link subsumption.Modifier#getControlledBy <em>Controlled By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controlled By</em>' reference.
	 * @see #getControlledBy()
	 * @generated
	 */
	void setControlledBy(Output value);

} // Modifier

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suppressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subsumption.Suppressor#getTime <em>Time</em>}</li>
 *   <li>{@link subsumption.Suppressor#getSuppress <em>Suppress</em>}</li>
 * </ul>
 * </p>
 *
 * @see subsumption.SubsumptionPackage#getSuppressor()
 * @model
 * @generated
 */
public interface Suppressor extends Modifier {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see subsumption.SubsumptionPackage#getSuppressor_Time()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link subsumption.Suppressor#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

	/**
	 * Returns the value of the '<em><b>Suppress</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link subsumption.Input#getSuppressedBy <em>Suppressed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppress</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppress</em>' container reference.
	 * @see #setSuppress(Input)
	 * @see subsumption.SubsumptionPackage#getSuppressor_Suppress()
	 * @see subsumption.Input#getSuppressedBy
	 * @model opposite="suppressedBy" required="true" transient="false"
	 * @generated
	 */
	Input getSuppress();

	/**
	 * Sets the value of the '{@link subsumption.Suppressor#getSuppress <em>Suppress</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppress</em>' container reference.
	 * @see #getSuppress()
	 * @generated
	 */
	void setSuppress(Input value);

} // Suppressor

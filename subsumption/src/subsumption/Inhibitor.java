/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inhibitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subsumption.Inhibitor#getTime <em>Time</em>}</li>
 *   <li>{@link subsumption.Inhibitor#getInhibits <em>Inhibits</em>}</li>
 * </ul>
 * </p>
 *
 * @see subsumption.SubsumptionPackage#getInhibitor()
 * @model
 * @generated
 */
public interface Inhibitor extends Modifier {
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
	 * @see subsumption.SubsumptionPackage#getInhibitor_Time()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link subsumption.Inhibitor#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

	/**
	 * Returns the value of the '<em><b>Inhibits</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link subsumption.Output#getInhibitedBy <em>Inhibited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inhibits</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhibits</em>' container reference.
	 * @see #setInhibits(Output)
	 * @see subsumption.SubsumptionPackage#getInhibitor_Inhibits()
	 * @see subsumption.Output#getInhibitedBy
	 * @model opposite="inhibitedBy" required="true" transient="false"
	 * @generated
	 */
	Output getInhibits();

	/**
	 * Sets the value of the '{@link subsumption.Inhibitor#getInhibits <em>Inhibits</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhibits</em>' container reference.
	 * @see #getInhibits()
	 * @generated
	 */
	void setInhibits(Output value);

} // Inhibitor

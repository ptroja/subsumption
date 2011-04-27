/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subsumption.Output#getName <em>Name</em>}</li>
 *   <li>{@link subsumption.Output#getSink <em>Sink</em>}</li>
 *   <li>{@link subsumption.Output#getActivates <em>Activates</em>}</li>
 *   <li>{@link subsumption.Output#getInhibitedBy <em>Inhibited By</em>}</li>
 * </ul>
 * </p>
 *
 * @see subsumption.SubsumptionPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see subsumption.SubsumptionPackage#getOutput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link subsumption.Output#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sink</b></em>' reference list.
	 * The list contents are of type {@link subsumption.Input}.
	 * It is bidirectional and its opposite is '{@link subsumption.Input#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' reference list.
	 * @see subsumption.SubsumptionPackage#getOutput_Sink()
	 * @see subsumption.Input#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Input> getSink();

	/**
	 * Returns the value of the '<em><b>Activates</b></em>' reference list.
	 * The list contents are of type {@link subsumption.Modifier}.
	 * It is bidirectional and its opposite is '{@link subsumption.Modifier#getControlledBy <em>Controlled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activates</em>' reference list.
	 * @see subsumption.SubsumptionPackage#getOutput_Activates()
	 * @see subsumption.Modifier#getControlledBy
	 * @model opposite="controlledBy"
	 * @generated
	 */
	EList<Modifier> getActivates();

	/**
	 * Returns the value of the '<em><b>Inhibited By</b></em>' containment reference list.
	 * The list contents are of type {@link subsumption.Inhibitor}.
	 * It is bidirectional and its opposite is '{@link subsumption.Inhibitor#getInhibits <em>Inhibits</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inhibited By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhibited By</em>' containment reference list.
	 * @see subsumption.SubsumptionPackage#getOutput_InhibitedBy()
	 * @see subsumption.Inhibitor#getInhibits
	 * @model opposite="inhibits" containment="true"
	 * @generated
	 */
	EList<Inhibitor> getInhibitedBy();

} // Output

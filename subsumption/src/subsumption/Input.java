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
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subsumption.Input#getSource <em>Source</em>}</li>
 *   <li>{@link subsumption.Input#getSuppressedBy <em>Suppressed By</em>}</li>
 *   <li>{@link subsumption.Input#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see subsumption.SubsumptionPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link subsumption.Output#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Output)
	 * @see subsumption.SubsumptionPackage#getInput_Source()
	 * @see subsumption.Output#getSink
	 * @model opposite="sink"
	 * @generated
	 */
	Output getSource();

	/**
	 * Sets the value of the '{@link subsumption.Input#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Output value);

	/**
	 * Returns the value of the '<em><b>Suppressed By</b></em>' containment reference list.
	 * The list contents are of type {@link subsumption.Suppressor}.
	 * It is bidirectional and its opposite is '{@link subsumption.Suppressor#getSuppress <em>Suppress</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppressed By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppressed By</em>' containment reference list.
	 * @see subsumption.SubsumptionPackage#getInput_SuppressedBy()
	 * @see subsumption.Suppressor#getSuppress
	 * @model opposite="suppress" containment="true"
	 * @generated
	 */
	EList<Suppressor> getSuppressedBy();

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
	 * @see subsumption.SubsumptionPackage#getInput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link subsumption.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Input

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package subsumption.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import subsumption.Input;
import subsumption.SubsumptionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputTest extends TestCase {

	/**
	 * The fixture for this Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Input fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputTest.class);
	}

	/**
	 * Constructs a new Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Input fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Input getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SubsumptionFactory.eINSTANCE.createInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InputTest

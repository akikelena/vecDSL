/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddl Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.DdlMethod#getDdlConcept <em>Ddl Concept</em>}</li>
 *   <li>{@link vecdslMM.DdlMethod#getDdlNode <em>Ddl Node</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getDdlMethod()
 * @model abstract="true"
 * @generated
 */
public interface DdlMethod extends Method {
	/**
	 * Returns the value of the '<em><b>Ddl Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddl Concept</em>' containment reference.
	 * @see #setDdlConcept(Concept)
	 * @see vecdslMM.VecdslMMPackage#getDdlMethod_DdlConcept()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Concept getDdlConcept();

	/**
	 * Sets the value of the '{@link vecdslMM.DdlMethod#getDdlConcept <em>Ddl Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ddl Concept</em>' containment reference.
	 * @see #getDdlConcept()
	 * @generated
	 */
	void setDdlConcept(Concept value);

	/**
	 * Returns the value of the '<em><b>Ddl Node</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.DdlMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ddl Node</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getDdlMethod_DdlNode()
	 * @model
	 * @generated
	 */
	EList<DdlMethod> getDdlNode();

} // DdlMethod

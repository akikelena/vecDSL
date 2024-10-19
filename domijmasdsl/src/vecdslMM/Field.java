/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Field#getColFieldOwner <em>Col Field Owner</em>}</li>
 *   <li>{@link vecdslMM.Field#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link vecdslMM.Field#getFieldLimits <em>Field Limits</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getField()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='fieldLimitsNames'"
 * @generated
 */
public interface Field extends Concept {
	/**
	 * Returns the value of the '<em><b>Col Field Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vecdslMM.VectorCollection#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Field Owner</em>' reference.
	 * @see #setColFieldOwner(VectorCollection)
	 * @see vecdslMM.VecdslMMPackage#getField_ColFieldOwner()
	 * @see vecdslMM.VectorCollection#getFields
	 * @model opposite="fields" required="true"
	 * @generated
	 */
	VectorCollection getColFieldOwner();

	/**
	 * Sets the value of the '{@link vecdslMM.Field#getColFieldOwner <em>Col Field Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Field Owner</em>' reference.
	 * @see #getColFieldOwner()
	 * @generated
	 */
	void setColFieldOwner(VectorCollection value);

	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #setIsPrimary(boolean)
	 * @see vecdslMM.VecdslMMPackage#getField_IsPrimary()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsPrimary();

	/**
	 * Sets the value of the '{@link vecdslMM.Field#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #isIsPrimary()
	 * @generated
	 */
	void setIsPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Field Limits</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.FieldLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Limits</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getField_FieldLimits()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldLimit> getFieldLimits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Field limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.fieldLimits-&gt;forAll(lim1, lim2 | lim1 &lt;&gt; lim2 implies lim1.name &lt;&gt; lim2.name)\n}.status'"
	 * @generated
	 */
	boolean fieldLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Field

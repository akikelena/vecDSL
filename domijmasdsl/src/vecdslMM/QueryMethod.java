/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.QueryMethod#getTopK <em>Top K</em>}</li>
 *   <li>{@link vecdslMM.QueryMethod#getQueryCollection <em>Query Collection</em>}</li>
 *   <li>{@link vecdslMM.QueryMethod#getOutputFields <em>Output Fields</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getQueryMethod()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TopKValue'"
 * @generated
 */
public interface QueryMethod extends Method {
	/**
	 * Returns the value of the '<em><b>Top K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top K</em>' attribute.
	 * @see #setTopK(int)
	 * @see vecdslMM.VecdslMMPackage#getQueryMethod_TopK()
	 * @model required="true"
	 * @generated
	 */
	int getTopK();

	/**
	 * Sets the value of the '{@link vecdslMM.QueryMethod#getTopK <em>Top K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top K</em>' attribute.
	 * @see #getTopK()
	 * @generated
	 */
	void setTopK(int value);

	/**
	 * Returns the value of the '<em><b>Query Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Collection</em>' containment reference.
	 * @see #setQueryCollection(VectorCollection)
	 * @see vecdslMM.VecdslMMPackage#getQueryMethod_QueryCollection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VectorCollection getQueryCollection();

	/**
	 * Sets the value of the '{@link vecdslMM.QueryMethod#getQueryCollection <em>Query Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Collection</em>' containment reference.
	 * @see #getQueryCollection()
	 * @generated
	 */
	void setQueryCollection(VectorCollection value);

	/**
	 * Returns the value of the '<em><b>Output Fields</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Fields</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getQueryMethod_OutputFields()
	 * @model required="true"
	 * @generated
	 */
	EList<Field> getOutputFields();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Output fields must be from the list of query collection field list!\',\n\tstatus : Boolean = \n    \t\tself.outputFields-&gt;forAll(of | self.queryCollection.fields-&gt;includes(of))\n}.status'"
	 * @generated
	 */
	boolean OutputFieldsQVC(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Top K value must at least one!\',\n\tstatus : Boolean = \n    \t\tself.topK &gt;= 1\n}.status'"
	 * @generated
	 */
	boolean TopKValue(DiagnosticChain diagnostics, Map<Object, Object> context);

} // QueryMethod

/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Delete#getIds <em>Ids</em>}</li>
 *   <li>{@link vecdslMM.Delete#getDeleteCond <em>Delete Cond</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getDelete()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueIDsInDelete'"
 * @generated
 */
public interface Delete extends DmlMethod {
	/**
	 * Returns the value of the '<em><b>Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' attribute.
	 * @see #setIds(EList)
	 * @see vecdslMM.VecdslMMPackage#getDelete_Ids()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getIds();

	/**
	 * Sets the value of the '{@link vecdslMM.Delete#getIds <em>Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ids</em>' attribute.
	 * @see #getIds()
	 * @generated
	 */
	void setIds(EList<?> value);

	/**
	 * Returns the value of the '<em><b>Delete Cond</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Cond</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getDelete_DeleteCond()
	 * @model
	 * @generated
	 */
	EList<Filter> getDeleteCond();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Identifiers must not repeat!\',\n\tstatus : Boolean = \n    \t\tself.ids-&gt;isUnique(id | id)\n}.status'"
	 * @generated
	 */
	boolean UniqueIDsInDelete(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Delete

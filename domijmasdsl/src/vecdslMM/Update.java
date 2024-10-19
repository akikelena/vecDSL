/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Update#getPath <em>Path</em>}</li>
 *   <li>{@link vecdslMM.Update#getNofRecords <em>Nof Records</em>}</li>
 *   <li>{@link vecdslMM.Update#getUpdateCond <em>Update Cond</em>}</li>
 *   <li>{@link vecdslMM.Update#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getUpdate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NofRecordsInUpdate'"
 * @generated
 */
public interface Update extends DmlMethod {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see vecdslMM.VecdslMMPackage#getUpdate_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link vecdslMM.Update#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Nof Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nof Records</em>' attribute.
	 * @see #setNofRecords(int)
	 * @see vecdslMM.VecdslMMPackage#getUpdate_NofRecords()
	 * @model required="true"
	 * @generated
	 */
	int getNofRecords();

	/**
	 * Sets the value of the '{@link vecdslMM.Update#getNofRecords <em>Nof Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nof Records</em>' attribute.
	 * @see #getNofRecords()
	 * @generated
	 */
	void setNofRecords(int value);

	/**
	 * Returns the value of the '<em><b>Update Cond</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Cond</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getUpdate_UpdateCond()
	 * @model required="true"
	 * @generated
	 */
	EList<Filter> getUpdateCond();

	/**
	 * Returns the value of the '<em><b>Ids</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' attribute.
	 * @see #setIds(EList)
	 * @see vecdslMM.VecdslMMPackage#getUpdate_Ids()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<?> getIds();

	/**
	 * Sets the value of the '{@link vecdslMM.Update#getIds <em>Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ids</em>' attribute.
	 * @see #getIds()
	 * @generated
	 */
	void setIds(EList<?> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Identifiers must not repeat!\',\n\tstatus : Boolean = \n    \t\tself.ids-&gt;isUnique(id | id)\n}.status'"
	 * @generated
	 */
	boolean UniqueIDsInUpdate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Number of records must be greater than zero!\',\n\tstatus : Boolean = \n    \t\tself.nofRecords-&gt;notEmpty() implies self.nofRecords &gt; 0\n}.status'"
	 * @generated
	 */
	boolean NofRecordsInUpdate(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Update

/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Insert#getPath <em>Path</em>}</li>
 *   <li>{@link vecdslMM.Insert#getNofRecords <em>Nof Records</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getInsert()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoOfRecordsInInsert'"
 * @generated
 */
public interface Insert extends DmlMethod {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see vecdslMM.VecdslMMPackage#getInsert_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link vecdslMM.Insert#getPath <em>Path</em>}' attribute.
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
	 * @see vecdslMM.VecdslMMPackage#getInsert_NofRecords()
	 * @model required="true"
	 * @generated
	 */
	int getNofRecords();

	/**
	 * Sets the value of the '{@link vecdslMM.Insert#getNofRecords <em>Nof Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nof Records</em>' attribute.
	 * @see #getNofRecords()
	 * @generated
	 */
	void setNofRecords(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Number of records must be greater than zero!\',\n\tstatus : Boolean = \n    \t\tself.nofRecords-&gt;notEmpty() implies self.nofRecords &gt; 0\n}.status'"
	 * @generated
	 */
	boolean NoOfRecordsInInsert(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Insert

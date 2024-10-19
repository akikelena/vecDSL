/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Partition#getColPartOwner <em>Col Part Owner</em>}</li>
 *   <li>{@link vecdslMM.Partition#getPartitionKey <em>Partition Key</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getPartition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SinglePartitionKey'"
 * @generated
 */
public interface Partition extends Concept {
	/**
	 * Returns the value of the '<em><b>Col Part Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vecdslMM.VectorCollection#getPartitions <em>Partitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Part Owner</em>' reference.
	 * @see #setColPartOwner(VectorCollection)
	 * @see vecdslMM.VecdslMMPackage#getPartition_ColPartOwner()
	 * @see vecdslMM.VectorCollection#getPartitions
	 * @model opposite="partitions" required="true"
	 * @generated
	 */
	VectorCollection getColPartOwner();

	/**
	 * Sets the value of the '{@link vecdslMM.Partition#getColPartOwner <em>Col Part Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Part Owner</em>' reference.
	 * @see #getColPartOwner()
	 * @generated
	 */
	void setColPartOwner(VectorCollection value);

	/**
	 * Returns the value of the '<em><b>Partition Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Key</em>' reference.
	 * @see #setPartitionKey(Field)
	 * @see vecdslMM.VecdslMMPackage#getPartition_PartitionKey()
	 * @model required="true"
	 * @generated
	 */
	Field getPartitionKey();

	/**
	 * Sets the value of the '{@link vecdslMM.Partition#getPartitionKey <em>Partition Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Key</em>' reference.
	 * @see #getPartitionKey()
	 * @generated
	 */
	void setPartitionKey(Field value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'There must be just one partition key for each partition!\',\n\tstatus : Boolean = \n    \t\tself.partitionKey-&gt;size() &lt;= 1\n}.status'"
	 * @generated
	 */
	boolean SinglePartitionKey(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Partition

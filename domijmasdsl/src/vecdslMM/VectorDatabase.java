/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.VectorDatabase#getClusters <em>Clusters</em>}</li>
 *   <li>{@link vecdslMM.VectorDatabase#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getVectorDatabase()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueClusterName'"
 * @generated
 */
public interface VectorDatabase extends Concept {
	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Cluster}.
	 * It is bidirectional and its opposite is '{@link vecdslMM.Cluster#getVectordb <em>Vectordb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getVectorDatabase_Clusters()
	 * @see vecdslMM.Cluster#getVectordb
	 * @model opposite="vectordb"
	 * @generated
	 */
	EList<Cluster> getClusters();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference.
	 * @see #setConnection(Connection)
	 * @see vecdslMM.VecdslMMPackage#getVectorDatabase_Connection()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorDatabase#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Cluster name must be unique within specific vector database!\',\n\tstatus : Boolean = \n    \t\tself.clusters-&gt;forAll(c1, c2 | c1 &lt;&gt; c2 implies c1.name &lt;&gt; c2.name)\n}.status'"
	 * @generated
	 */
	boolean UniqueClusterName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // VectorDatabase

/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Cluster#getCollections <em>Collections</em>}</li>
 *   <li>{@link vecdslMM.Cluster#getNofCollections <em>Nof Collections</em>}</li>
 *   <li>{@link vecdslMM.Cluster#getVectordb <em>Vectordb</em>}</li>
 *   <li>{@link vecdslMM.Cluster#getClusterLimits <em>Cluster Limits</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getCluster()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueCollectionNameInCluster'"
 * @generated
 */
public interface Cluster extends Concept {
	/**
	 * Returns the value of the '<em><b>Collections</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.VectorCollection}.
	 * It is bidirectional and its opposite is '{@link vecdslMM.VectorCollection#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getCluster_Collections()
	 * @see vecdslMM.VectorCollection#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	EList<VectorCollection> getCollections();

	/**
	 * Returns the value of the '<em><b>Nof Collections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nof Collections</em>' attribute.
	 * @see #setNofCollections(int)
	 * @see vecdslMM.VecdslMMPackage#getCluster_NofCollections()
	 * @model required="true"
	 * @generated
	 */
	int getNofCollections();

	/**
	 * Sets the value of the '{@link vecdslMM.Cluster#getNofCollections <em>Nof Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nof Collections</em>' attribute.
	 * @see #getNofCollections()
	 * @generated
	 */
	void setNofCollections(int value);

	/**
	 * Returns the value of the '<em><b>Vectordb</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vecdslMM.VectorDatabase#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectordb</em>' reference.
	 * @see #setVectordb(VectorDatabase)
	 * @see vecdslMM.VecdslMMPackage#getCluster_Vectordb()
	 * @see vecdslMM.VectorDatabase#getClusters
	 * @model opposite="clusters" required="true"
	 * @generated
	 */
	VectorDatabase getVectordb();

	/**
	 * Sets the value of the '{@link vecdslMM.Cluster#getVectordb <em>Vectordb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectordb</em>' reference.
	 * @see #getVectordb()
	 * @generated
	 */
	void setVectordb(VectorDatabase value);

	/**
	 * Returns the value of the '<em><b>Cluster Limits</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.ClusterLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Limits</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getCluster_ClusterLimits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClusterLimit> getClusterLimits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Number of collections in cluster must be greater than zero!\',\n\tstatus : Boolean = \n    \t\tself.nofCollections &gt; 0\n}.status'"
	 * @generated
	 */
	boolean NoOfCollectionsGT(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Cluster limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.clusterLimits-&gt;forAll(lim1, lim2 | lim1 &lt;&gt; lim2 implies lim1.name &lt;&gt; lim2.name)\n}.status'"
	 * @generated
	 */
	boolean clusterLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Collection name must be unique within specific cluster!\',\n\tstatus : Boolean = \n    \t\tself.collections-&gt;forAll(col1, col2 | col1 &lt;&gt; col2 implies col1.name &lt;&gt; col2.name)\n}.status'"
	 * @generated
	 */
	boolean UniqueCollectionNameInCluster(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Cluster

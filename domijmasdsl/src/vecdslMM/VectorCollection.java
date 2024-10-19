/**
 */
package vecdslMM;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.VectorCollection#getCluster <em>Cluster</em>}</li>
 *   <li>{@link vecdslMM.VectorCollection#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link vecdslMM.VectorCollection#getFields <em>Fields</em>}</li>
 *   <li>{@link vecdslMM.VectorCollection#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link vecdslMM.VectorCollection#getPodtype <em>Podtype</em>}</li>
 *   <li>{@link vecdslMM.VectorCollection#getPodSize <em>Pod Size</em>}</li>
 *   <li>{@link vecdslMM.VectorCollection#getPodEnv <em>Pod Env</em>}</li>
 *   <li>{@link vecdslMM.VectorCollection#getCollectionLimits <em>Collection Limits</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getVectorCollection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='colLimitsNames'"
 * @generated
 */
public interface VectorCollection extends Concept {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vecdslMM.Cluster#getCollections <em>Collections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference.
	 * @see #setCluster(Cluster)
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_Cluster()
	 * @see vecdslMM.Cluster#getCollections
	 * @model opposite="collections" required="true"
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorCollection#getCluster <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Partition}.
	 * It is bidirectional and its opposite is '{@link vecdslMM.Partition#getColPartOwner <em>Col Part Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_Partitions()
	 * @see vecdslMM.Partition#getColPartOwner
	 * @model opposite="colPartOwner"
	 * @generated
	 */
	EList<Partition> getPartitions();

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link vecdslMM.Field}.
	 * It is bidirectional and its opposite is '{@link vecdslMM.Field#getColFieldOwner <em>Col Field Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_Fields()
	 * @see vecdslMM.Field#getColFieldOwner
	 * @model opposite="colFieldOwner"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(boolean)
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_Dynamic()
	 * @model required="true"
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorCollection#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>Podtype</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EPodTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Podtype</em>' attribute.
	 * @see vecdslMM.EPodTypes
	 * @see #setPodtype(EPodTypes)
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_Podtype()
	 * @model
	 * @generated
	 */
	EPodTypes getPodtype();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorCollection#getPodtype <em>Podtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Podtype</em>' attribute.
	 * @see vecdslMM.EPodTypes
	 * @see #getPodtype()
	 * @generated
	 */
	void setPodtype(EPodTypes value);

	/**
	 * Returns the value of the '<em><b>Pod Size</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EPodSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pod Size</em>' attribute.
	 * @see vecdslMM.EPodSize
	 * @see #setPodSize(EPodSize)
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_PodSize()
	 * @model
	 * @generated
	 */
	EPodSize getPodSize();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorCollection#getPodSize <em>Pod Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pod Size</em>' attribute.
	 * @see vecdslMM.EPodSize
	 * @see #getPodSize()
	 * @generated
	 */
	void setPodSize(EPodSize value);

	/**
	 * Returns the value of the '<em><b>Pod Env</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EPodEnv}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pod Env</em>' attribute.
	 * @see vecdslMM.EPodEnv
	 * @see #setPodEnv(EPodEnv)
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_PodEnv()
	 * @model
	 * @generated
	 */
	EPodEnv getPodEnv();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorCollection#getPodEnv <em>Pod Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pod Env</em>' attribute.
	 * @see vecdslMM.EPodEnv
	 * @see #getPodEnv()
	 * @generated
	 */
	void setPodEnv(EPodEnv value);

	/**
	 * Returns the value of the '<em><b>Collection Limits</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.CollectionLimit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Limits</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getVectorCollection_CollectionLimits()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectionLimit> getCollectionLimits();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple {\n\tmessage : String = \'Collection limit names must be unique!\',\n\tstatus : Boolean = \n\t\t\tself.collectionLimits-&gt;forAll(lim1, lim2 | lim1 &lt;&gt; lim2 implies lim1.name &lt;&gt; lim2.name)\n}.status'"
	 * @generated
	 */
	boolean colLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context);

} // VectorCollection

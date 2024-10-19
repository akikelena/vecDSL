/**
 */
package vecdslMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vecdslMM.Cluster;
import vecdslMM.ClusterLimit;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorCollection;
import vecdslMM.VectorDatabase;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.ClusterImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link vecdslMM.impl.ClusterImpl#getNofCollections <em>Nof Collections</em>}</li>
 *   <li>{@link vecdslMM.impl.ClusterImpl#getVectordb <em>Vectordb</em>}</li>
 *   <li>{@link vecdslMM.impl.ClusterImpl#getClusterLimits <em>Cluster Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends ConceptImpl implements Cluster {
	/**
	 * The cached value of the '{@link #getCollections() <em>Collections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<VectorCollection> collections;

	/**
	 * The default value of the '{@link #getNofCollections() <em>Nof Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofCollections()
	 * @generated
	 * @ordered
	 */
	protected static final int NOF_COLLECTIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNofCollections() <em>Nof Collections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofCollections()
	 * @generated
	 * @ordered
	 */
	protected int nofCollections = NOF_COLLECTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVectordb() <em>Vectordb</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectordb()
	 * @generated
	 * @ordered
	 */
	protected VectorDatabase vectordb;

	/**
	 * The cached value of the '{@link #getClusterLimits() <em>Cluster Limits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<ClusterLimit> clusterLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VectorCollection> getCollections() {
		if (collections == null) {
			collections = new EObjectWithInverseResolvingEList<VectorCollection>(VectorCollection.class, this, VecdslMMPackage.CLUSTER__COLLECTIONS, VecdslMMPackage.VECTOR_COLLECTION__CLUSTER);
		}
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNofCollections() {
		return nofCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNofCollections(int newNofCollections) {
		int oldNofCollections = nofCollections;
		nofCollections = newNofCollections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CLUSTER__NOF_COLLECTIONS, oldNofCollections, nofCollections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorDatabase getVectordb() {
		if (vectordb != null && vectordb.eIsProxy()) {
			InternalEObject oldVectordb = (InternalEObject)vectordb;
			vectordb = (VectorDatabase)eResolveProxy(oldVectordb);
			if (vectordb != oldVectordb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VecdslMMPackage.CLUSTER__VECTORDB, oldVectordb, vectordb));
			}
		}
		return vectordb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorDatabase basicGetVectordb() {
		return vectordb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVectordb(VectorDatabase newVectordb, NotificationChain msgs) {
		VectorDatabase oldVectordb = vectordb;
		vectordb = newVectordb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CLUSTER__VECTORDB, oldVectordb, newVectordb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectordb(VectorDatabase newVectordb) {
		if (newVectordb != vectordb) {
			NotificationChain msgs = null;
			if (vectordb != null)
				msgs = ((InternalEObject)vectordb).eInverseRemove(this, VecdslMMPackage.VECTOR_DATABASE__CLUSTERS, VectorDatabase.class, msgs);
			if (newVectordb != null)
				msgs = ((InternalEObject)newVectordb).eInverseAdd(this, VecdslMMPackage.VECTOR_DATABASE__CLUSTERS, VectorDatabase.class, msgs);
			msgs = basicSetVectordb(newVectordb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.CLUSTER__VECTORDB, newVectordb, newVectordb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClusterLimit> getClusterLimits() {
		if (clusterLimits == null) {
			clusterLimits = new EObjectContainmentEList<ClusterLimit>(ClusterLimit.class, this, VecdslMMPackage.CLUSTER__CLUSTER_LIMITS);
		}
		return clusterLimits;
	}

	/**
	 * The cached validation expression for the '{@link #NoOfCollectionsGT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Of Collections GT</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NoOfCollectionsGT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NO_OF_COLLECTIONS_GT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Number of collections in cluster must be greater than zero!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.nofCollections > 0\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoOfCollectionsGT(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.CLUSTER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.CLUSTER___NO_OF_COLLECTIONS_GT__DIAGNOSTICCHAIN_MAP,
				 NO_OF_COLLECTIONS_GT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.CLUSTER__NO_OF_COLLECTIONS_GT);
	}

	/**
	 * The cached validation expression for the '{@link #clusterLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cluster Limits Names</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clusterLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Cluster limit names must be unique!',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.clusterLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean clusterLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.CLUSTER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.CLUSTER___CLUSTER_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP,
				 CLUSTER_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.CLUSTER__CLUSTER_LIMITS_NAMES);
	}

	/**
	 * The cached validation expression for the '{@link #UniqueCollectionNameInCluster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Collection Name In Cluster</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueCollectionNameInCluster(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_COLLECTION_NAME_IN_CLUSTER_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Collection name must be unique within specific cluster!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.collections->forAll(col1, col2 | col1 <> col2 implies col1.name <> col2.name)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueCollectionNameInCluster(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.CLUSTER,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.CLUSTER___UNIQUE_COLLECTION_NAME_IN_CLUSTER__DIAGNOSTICCHAIN_MAP,
				 UNIQUE_COLLECTION_NAME_IN_CLUSTER_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.CLUSTER__UNIQUE_COLLECTION_NAME_IN_CLUSTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.CLUSTER__COLLECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCollections()).basicAdd(otherEnd, msgs);
			case VecdslMMPackage.CLUSTER__VECTORDB:
				if (vectordb != null)
					msgs = ((InternalEObject)vectordb).eInverseRemove(this, VecdslMMPackage.VECTOR_DATABASE__CLUSTERS, VectorDatabase.class, msgs);
				return basicSetVectordb((VectorDatabase)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.CLUSTER__COLLECTIONS:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
			case VecdslMMPackage.CLUSTER__VECTORDB:
				return basicSetVectordb(null, msgs);
			case VecdslMMPackage.CLUSTER__CLUSTER_LIMITS:
				return ((InternalEList<?>)getClusterLimits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.CLUSTER__COLLECTIONS:
				return getCollections();
			case VecdslMMPackage.CLUSTER__NOF_COLLECTIONS:
				return getNofCollections();
			case VecdslMMPackage.CLUSTER__VECTORDB:
				if (resolve) return getVectordb();
				return basicGetVectordb();
			case VecdslMMPackage.CLUSTER__CLUSTER_LIMITS:
				return getClusterLimits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VecdslMMPackage.CLUSTER__COLLECTIONS:
				getCollections().clear();
				getCollections().addAll((Collection<? extends VectorCollection>)newValue);
				return;
			case VecdslMMPackage.CLUSTER__NOF_COLLECTIONS:
				setNofCollections((Integer)newValue);
				return;
			case VecdslMMPackage.CLUSTER__VECTORDB:
				setVectordb((VectorDatabase)newValue);
				return;
			case VecdslMMPackage.CLUSTER__CLUSTER_LIMITS:
				getClusterLimits().clear();
				getClusterLimits().addAll((Collection<? extends ClusterLimit>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VecdslMMPackage.CLUSTER__COLLECTIONS:
				getCollections().clear();
				return;
			case VecdslMMPackage.CLUSTER__NOF_COLLECTIONS:
				setNofCollections(NOF_COLLECTIONS_EDEFAULT);
				return;
			case VecdslMMPackage.CLUSTER__VECTORDB:
				setVectordb((VectorDatabase)null);
				return;
			case VecdslMMPackage.CLUSTER__CLUSTER_LIMITS:
				getClusterLimits().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VecdslMMPackage.CLUSTER__COLLECTIONS:
				return collections != null && !collections.isEmpty();
			case VecdslMMPackage.CLUSTER__NOF_COLLECTIONS:
				return nofCollections != NOF_COLLECTIONS_EDEFAULT;
			case VecdslMMPackage.CLUSTER__VECTORDB:
				return vectordb != null;
			case VecdslMMPackage.CLUSTER__CLUSTER_LIMITS:
				return clusterLimits != null && !clusterLimits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case VecdslMMPackage.CLUSTER___NO_OF_COLLECTIONS_GT__DIAGNOSTICCHAIN_MAP:
				return NoOfCollectionsGT((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case VecdslMMPackage.CLUSTER___CLUSTER_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP:
				return clusterLimitsNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case VecdslMMPackage.CLUSTER___UNIQUE_COLLECTION_NAME_IN_CLUSTER__DIAGNOSTICCHAIN_MAP:
				return UniqueCollectionNameInCluster((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nofCollections: ");
		result.append(nofCollections);
		result.append(')');
		return result.toString();
	}

} //ClusterImpl

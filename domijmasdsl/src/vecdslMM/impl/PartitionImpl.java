/**
 */
package vecdslMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vecdslMM.Field;
import vecdslMM.Partition;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorCollection;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.PartitionImpl#getColPartOwner <em>Col Part Owner</em>}</li>
 *   <li>{@link vecdslMM.impl.PartitionImpl#getPartitionKey <em>Partition Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionImpl extends ConceptImpl implements Partition {
	/**
	 * The cached value of the '{@link #getColPartOwner() <em>Col Part Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColPartOwner()
	 * @generated
	 * @ordered
	 */
	protected VectorCollection colPartOwner;

	/**
	 * The cached value of the '{@link #getPartitionKey() <em>Partition Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionKey()
	 * @generated
	 * @ordered
	 */
	protected Field partitionKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorCollection getColPartOwner() {
		if (colPartOwner != null && colPartOwner.eIsProxy()) {
			InternalEObject oldColPartOwner = (InternalEObject)colPartOwner;
			colPartOwner = (VectorCollection)eResolveProxy(oldColPartOwner);
			if (colPartOwner != oldColPartOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VecdslMMPackage.PARTITION__COL_PART_OWNER, oldColPartOwner, colPartOwner));
			}
		}
		return colPartOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorCollection basicGetColPartOwner() {
		return colPartOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColPartOwner(VectorCollection newColPartOwner, NotificationChain msgs) {
		VectorCollection oldColPartOwner = colPartOwner;
		colPartOwner = newColPartOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.PARTITION__COL_PART_OWNER, oldColPartOwner, newColPartOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColPartOwner(VectorCollection newColPartOwner) {
		if (newColPartOwner != colPartOwner) {
			NotificationChain msgs = null;
			if (colPartOwner != null)
				msgs = ((InternalEObject)colPartOwner).eInverseRemove(this, VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS, VectorCollection.class, msgs);
			if (newColPartOwner != null)
				msgs = ((InternalEObject)newColPartOwner).eInverseAdd(this, VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS, VectorCollection.class, msgs);
			msgs = basicSetColPartOwner(newColPartOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.PARTITION__COL_PART_OWNER, newColPartOwner, newColPartOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getPartitionKey() {
		if (partitionKey != null && partitionKey.eIsProxy()) {
			InternalEObject oldPartitionKey = (InternalEObject)partitionKey;
			partitionKey = (Field)eResolveProxy(oldPartitionKey);
			if (partitionKey != oldPartitionKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VecdslMMPackage.PARTITION__PARTITION_KEY, oldPartitionKey, partitionKey));
			}
		}
		return partitionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetPartitionKey() {
		return partitionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionKey(Field newPartitionKey) {
		Field oldPartitionKey = partitionKey;
		partitionKey = newPartitionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.PARTITION__PARTITION_KEY, oldPartitionKey, partitionKey));
	}

	/**
	 * The cached validation expression for the '{@link #SinglePartitionKey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Single Partition Key</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SinglePartitionKey(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLE_PARTITION_KEY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There must be just one partition key for each partition!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.partitionKey->size() <= 1\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SinglePartitionKey(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.PARTITION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.PARTITION___SINGLE_PARTITION_KEY__DIAGNOSTICCHAIN_MAP,
				 SINGLE_PARTITION_KEY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.PARTITION__SINGLE_PARTITION_KEY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.PARTITION__COL_PART_OWNER:
				if (colPartOwner != null)
					msgs = ((InternalEObject)colPartOwner).eInverseRemove(this, VecdslMMPackage.VECTOR_COLLECTION__PARTITIONS, VectorCollection.class, msgs);
				return basicSetColPartOwner((VectorCollection)otherEnd, msgs);
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
			case VecdslMMPackage.PARTITION__COL_PART_OWNER:
				return basicSetColPartOwner(null, msgs);
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
			case VecdslMMPackage.PARTITION__COL_PART_OWNER:
				if (resolve) return getColPartOwner();
				return basicGetColPartOwner();
			case VecdslMMPackage.PARTITION__PARTITION_KEY:
				if (resolve) return getPartitionKey();
				return basicGetPartitionKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VecdslMMPackage.PARTITION__COL_PART_OWNER:
				setColPartOwner((VectorCollection)newValue);
				return;
			case VecdslMMPackage.PARTITION__PARTITION_KEY:
				setPartitionKey((Field)newValue);
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
			case VecdslMMPackage.PARTITION__COL_PART_OWNER:
				setColPartOwner((VectorCollection)null);
				return;
			case VecdslMMPackage.PARTITION__PARTITION_KEY:
				setPartitionKey((Field)null);
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
			case VecdslMMPackage.PARTITION__COL_PART_OWNER:
				return colPartOwner != null;
			case VecdslMMPackage.PARTITION__PARTITION_KEY:
				return partitionKey != null;
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
			case VecdslMMPackage.PARTITION___SINGLE_PARTITION_KEY__DIAGNOSTICCHAIN_MAP:
				return SinglePartitionKey((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PartitionImpl

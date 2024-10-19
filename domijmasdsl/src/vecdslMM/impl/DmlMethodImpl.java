/**
 */
package vecdslMM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vecdslMM.DmlMethod;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dml Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.DmlMethodImpl#getDmlCollection <em>Dml Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DmlMethodImpl extends MethodImpl implements DmlMethod {
	/**
	 * The cached value of the '{@link #getDmlCollection() <em>Dml Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmlCollection()
	 * @generated
	 * @ordered
	 */
	protected VectorCollection dmlCollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DmlMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.DML_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorCollection getDmlCollection() {
		return dmlCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDmlCollection(VectorCollection newDmlCollection, NotificationChain msgs) {
		VectorCollection oldDmlCollection = dmlCollection;
		dmlCollection = newDmlCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.DML_METHOD__DML_COLLECTION, oldDmlCollection, newDmlCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmlCollection(VectorCollection newDmlCollection) {
		if (newDmlCollection != dmlCollection) {
			NotificationChain msgs = null;
			if (dmlCollection != null)
				msgs = ((InternalEObject)dmlCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.DML_METHOD__DML_COLLECTION, null, msgs);
			if (newDmlCollection != null)
				msgs = ((InternalEObject)newDmlCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.DML_METHOD__DML_COLLECTION, null, msgs);
			msgs = basicSetDmlCollection(newDmlCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.DML_METHOD__DML_COLLECTION, newDmlCollection, newDmlCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.DML_METHOD__DML_COLLECTION:
				return basicSetDmlCollection(null, msgs);
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
			case VecdslMMPackage.DML_METHOD__DML_COLLECTION:
				return getDmlCollection();
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
			case VecdslMMPackage.DML_METHOD__DML_COLLECTION:
				setDmlCollection((VectorCollection)newValue);
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
			case VecdslMMPackage.DML_METHOD__DML_COLLECTION:
				setDmlCollection((VectorCollection)null);
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
			case VecdslMMPackage.DML_METHOD__DML_COLLECTION:
				return dmlCollection != null;
		}
		return super.eIsSet(featureID);
	}

} //DmlMethodImpl

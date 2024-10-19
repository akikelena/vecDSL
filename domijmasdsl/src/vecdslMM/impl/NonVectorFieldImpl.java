/**
 */
package vecdslMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import vecdslMM.EScalarDType;
import vecdslMM.NonVectorField;
import vecdslMM.NonVectorIndex;
import vecdslMM.VecdslMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Vector Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.NonVectorFieldImpl#getNonVectorIndexes <em>Non Vector Indexes</em>}</li>
 *   <li>{@link vecdslMM.impl.NonVectorFieldImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonVectorFieldImpl extends FieldImpl implements NonVectorField {
	/**
	 * The cached value of the '{@link #getNonVectorIndexes() <em>Non Vector Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonVectorIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList<NonVectorIndex> nonVectorIndexes;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EScalarDType TYPE_EDEFAULT = EScalarDType.INT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EScalarDType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonVectorFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.NON_VECTOR_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonVectorIndex> getNonVectorIndexes() {
		if (nonVectorIndexes == null) {
			nonVectorIndexes = new EObjectContainmentEList<NonVectorIndex>(NonVectorIndex.class, this, VecdslMMPackage.NON_VECTOR_FIELD__NON_VECTOR_INDEXES);
		}
		return nonVectorIndexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EScalarDType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EScalarDType newType) {
		EScalarDType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.NON_VECTOR_FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.NON_VECTOR_FIELD__NON_VECTOR_INDEXES:
				return ((InternalEList<?>)getNonVectorIndexes()).basicRemove(otherEnd, msgs);
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
			case VecdslMMPackage.NON_VECTOR_FIELD__NON_VECTOR_INDEXES:
				return getNonVectorIndexes();
			case VecdslMMPackage.NON_VECTOR_FIELD__TYPE:
				return getType();
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
			case VecdslMMPackage.NON_VECTOR_FIELD__NON_VECTOR_INDEXES:
				getNonVectorIndexes().clear();
				getNonVectorIndexes().addAll((Collection<? extends NonVectorIndex>)newValue);
				return;
			case VecdslMMPackage.NON_VECTOR_FIELD__TYPE:
				setType((EScalarDType)newValue);
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
			case VecdslMMPackage.NON_VECTOR_FIELD__NON_VECTOR_INDEXES:
				getNonVectorIndexes().clear();
				return;
			case VecdslMMPackage.NON_VECTOR_FIELD__TYPE:
				setType(TYPE_EDEFAULT);
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
			case VecdslMMPackage.NON_VECTOR_FIELD__NON_VECTOR_INDEXES:
				return nonVectorIndexes != null && !nonVectorIndexes.isEmpty();
			case VecdslMMPackage.NON_VECTOR_FIELD__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //NonVectorFieldImpl

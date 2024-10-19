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

import vecdslMM.EVectorDType;
import vecdslMM.EmbeddingModel;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorField;
import vecdslMM.VectorIndex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vector Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.VectorFieldImpl#getVectorIndexes <em>Vector Indexes</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link vecdslMM.impl.VectorFieldImpl#getEmbModel <em>Emb Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VectorFieldImpl extends FieldImpl implements VectorField {
	/**
	 * The cached value of the '{@link #getVectorIndexes() <em>Vector Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList<VectorIndex> vectorIndexes;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EVectorDType TYPE_EDEFAULT = EVectorDType.BINARY_VECTOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EVectorDType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmbModel() <em>Emb Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbModel()
	 * @generated
	 * @ordered
	 */
	protected EmbeddingModel embModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VectorFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.VECTOR_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VectorIndex> getVectorIndexes() {
		if (vectorIndexes == null) {
			vectorIndexes = new EObjectContainmentEList<VectorIndex>(VectorIndex.class, this, VecdslMMPackage.VECTOR_FIELD__VECTOR_INDEXES);
		}
		return vectorIndexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVectorDType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EVectorDType newType) {
		EVectorDType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddingModel getEmbModel() {
		if (embModel != null && embModel.eIsProxy()) {
			InternalEObject oldEmbModel = (InternalEObject)embModel;
			embModel = (EmbeddingModel)eResolveProxy(oldEmbModel);
			if (embModel != oldEmbModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VecdslMMPackage.VECTOR_FIELD__EMB_MODEL, oldEmbModel, embModel));
			}
		}
		return embModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddingModel basicGetEmbModel() {
		return embModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbModel(EmbeddingModel newEmbModel) {
		EmbeddingModel oldEmbModel = embModel;
		embModel = newEmbModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.VECTOR_FIELD__EMB_MODEL, oldEmbModel, embModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.VECTOR_FIELD__VECTOR_INDEXES:
				return ((InternalEList<?>)getVectorIndexes()).basicRemove(otherEnd, msgs);
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
			case VecdslMMPackage.VECTOR_FIELD__VECTOR_INDEXES:
				return getVectorIndexes();
			case VecdslMMPackage.VECTOR_FIELD__TYPE:
				return getType();
			case VecdslMMPackage.VECTOR_FIELD__EMB_MODEL:
				if (resolve) return getEmbModel();
				return basicGetEmbModel();
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
			case VecdslMMPackage.VECTOR_FIELD__VECTOR_INDEXES:
				getVectorIndexes().clear();
				getVectorIndexes().addAll((Collection<? extends VectorIndex>)newValue);
				return;
			case VecdslMMPackage.VECTOR_FIELD__TYPE:
				setType((EVectorDType)newValue);
				return;
			case VecdslMMPackage.VECTOR_FIELD__EMB_MODEL:
				setEmbModel((EmbeddingModel)newValue);
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
			case VecdslMMPackage.VECTOR_FIELD__VECTOR_INDEXES:
				getVectorIndexes().clear();
				return;
			case VecdslMMPackage.VECTOR_FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case VecdslMMPackage.VECTOR_FIELD__EMB_MODEL:
				setEmbModel((EmbeddingModel)null);
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
			case VecdslMMPackage.VECTOR_FIELD__VECTOR_INDEXES:
				return vectorIndexes != null && !vectorIndexes.isEmpty();
			case VecdslMMPackage.VECTOR_FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case VecdslMMPackage.VECTOR_FIELD__EMB_MODEL:
				return embModel != null;
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

} //VectorFieldImpl

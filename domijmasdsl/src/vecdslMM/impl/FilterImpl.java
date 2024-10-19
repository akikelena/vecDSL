/**
 */
package vecdslMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import vecdslMM.Concept;
import vecdslMM.EOperator;
import vecdslMM.Filter;
import vecdslMM.VecdslMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.FilterImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link vecdslMM.impl.FilterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link vecdslMM.impl.FilterImpl#getFilterField <em>Filter Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends MinimalEObjectImpl.Container implements Filter {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EOperator OPERATOR_EDEFAULT = EOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilterField() <em>Filter Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterField()
	 * @generated
	 * @ordered
	 */
	protected Concept filterField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(EOperator newOperator) {
		EOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.FILTER__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.FILTER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getFilterField() {
		if (filterField != null && filterField.eIsProxy()) {
			InternalEObject oldFilterField = (InternalEObject)filterField;
			filterField = (Concept)eResolveProxy(oldFilterField);
			if (filterField != oldFilterField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VecdslMMPackage.FILTER__FILTER_FIELD, oldFilterField, filterField));
			}
		}
		return filterField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetFilterField() {
		return filterField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterField(Concept newFilterField) {
		Concept oldFilterField = filterField;
		filterField = newFilterField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.FILTER__FILTER_FIELD, oldFilterField, filterField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.FILTER__OPERATOR:
				return getOperator();
			case VecdslMMPackage.FILTER__VALUE:
				return getValue();
			case VecdslMMPackage.FILTER__FILTER_FIELD:
				if (resolve) return getFilterField();
				return basicGetFilterField();
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
			case VecdslMMPackage.FILTER__OPERATOR:
				setOperator((EOperator)newValue);
				return;
			case VecdslMMPackage.FILTER__VALUE:
				setValue((String)newValue);
				return;
			case VecdslMMPackage.FILTER__FILTER_FIELD:
				setFilterField((Concept)newValue);
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
			case VecdslMMPackage.FILTER__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case VecdslMMPackage.FILTER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case VecdslMMPackage.FILTER__FILTER_FIELD:
				setFilterField((Concept)null);
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
			case VecdslMMPackage.FILTER__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case VecdslMMPackage.FILTER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case VecdslMMPackage.FILTER__FILTER_FIELD:
				return filterField != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //FilterImpl

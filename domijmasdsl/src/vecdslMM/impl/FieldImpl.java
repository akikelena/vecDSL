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
import org.eclipse.emf.ecore.util.InternalEList;

import vecdslMM.Field;
import vecdslMM.FieldLimit;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorCollection;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.FieldImpl#getColFieldOwner <em>Col Field Owner</em>}</li>
 *   <li>{@link vecdslMM.impl.FieldImpl#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link vecdslMM.impl.FieldImpl#getFieldLimits <em>Field Limits</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FieldImpl extends ConceptImpl implements Field {
	/**
	 * The cached value of the '{@link #getColFieldOwner() <em>Col Field Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColFieldOwner()
	 * @generated
	 * @ordered
	 */
	protected VectorCollection colFieldOwner;

	/**
	 * The default value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPrimary() <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean isPrimary = IS_PRIMARY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFieldLimits() <em>Field Limits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLimits()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldLimit> fieldLimits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorCollection getColFieldOwner() {
		if (colFieldOwner != null && colFieldOwner.eIsProxy()) {
			InternalEObject oldColFieldOwner = (InternalEObject)colFieldOwner;
			colFieldOwner = (VectorCollection)eResolveProxy(oldColFieldOwner);
			if (colFieldOwner != oldColFieldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VecdslMMPackage.FIELD__COL_FIELD_OWNER, oldColFieldOwner, colFieldOwner));
			}
		}
		return colFieldOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorCollection basicGetColFieldOwner() {
		return colFieldOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColFieldOwner(VectorCollection newColFieldOwner, NotificationChain msgs) {
		VectorCollection oldColFieldOwner = colFieldOwner;
		colFieldOwner = newColFieldOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.FIELD__COL_FIELD_OWNER, oldColFieldOwner, newColFieldOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColFieldOwner(VectorCollection newColFieldOwner) {
		if (newColFieldOwner != colFieldOwner) {
			NotificationChain msgs = null;
			if (colFieldOwner != null)
				msgs = ((InternalEObject)colFieldOwner).eInverseRemove(this, VecdslMMPackage.VECTOR_COLLECTION__FIELDS, VectorCollection.class, msgs);
			if (newColFieldOwner != null)
				msgs = ((InternalEObject)newColFieldOwner).eInverseAdd(this, VecdslMMPackage.VECTOR_COLLECTION__FIELDS, VectorCollection.class, msgs);
			msgs = basicSetColFieldOwner(newColFieldOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.FIELD__COL_FIELD_OWNER, newColFieldOwner, newColFieldOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPrimary() {
		return isPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPrimary(boolean newIsPrimary) {
		boolean oldIsPrimary = isPrimary;
		isPrimary = newIsPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.FIELD__IS_PRIMARY, oldIsPrimary, isPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldLimit> getFieldLimits() {
		if (fieldLimits == null) {
			fieldLimits = new EObjectContainmentEList<FieldLimit>(FieldLimit.class, this, VecdslMMPackage.FIELD__FIELD_LIMITS);
		}
		return fieldLimits;
	}

	/**
	 * The cached validation expression for the '{@link #fieldLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Field Limits Names</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #fieldLimitsNames(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Field limit names must be unique!',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tself.fieldLimits->forAll(lim1, lim2 | lim1 <> lim2 implies lim1.name <> lim2.name)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean fieldLimitsNames(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.FIELD,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP,
				 FIELD_LIMITS_NAMES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.FIELD__FIELD_LIMITS_NAMES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.FIELD__COL_FIELD_OWNER:
				if (colFieldOwner != null)
					msgs = ((InternalEObject)colFieldOwner).eInverseRemove(this, VecdslMMPackage.VECTOR_COLLECTION__FIELDS, VectorCollection.class, msgs);
				return basicSetColFieldOwner((VectorCollection)otherEnd, msgs);
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
			case VecdslMMPackage.FIELD__COL_FIELD_OWNER:
				return basicSetColFieldOwner(null, msgs);
			case VecdslMMPackage.FIELD__FIELD_LIMITS:
				return ((InternalEList<?>)getFieldLimits()).basicRemove(otherEnd, msgs);
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
			case VecdslMMPackage.FIELD__COL_FIELD_OWNER:
				if (resolve) return getColFieldOwner();
				return basicGetColFieldOwner();
			case VecdslMMPackage.FIELD__IS_PRIMARY:
				return isIsPrimary();
			case VecdslMMPackage.FIELD__FIELD_LIMITS:
				return getFieldLimits();
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
			case VecdslMMPackage.FIELD__COL_FIELD_OWNER:
				setColFieldOwner((VectorCollection)newValue);
				return;
			case VecdslMMPackage.FIELD__IS_PRIMARY:
				setIsPrimary((Boolean)newValue);
				return;
			case VecdslMMPackage.FIELD__FIELD_LIMITS:
				getFieldLimits().clear();
				getFieldLimits().addAll((Collection<? extends FieldLimit>)newValue);
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
			case VecdslMMPackage.FIELD__COL_FIELD_OWNER:
				setColFieldOwner((VectorCollection)null);
				return;
			case VecdslMMPackage.FIELD__IS_PRIMARY:
				setIsPrimary(IS_PRIMARY_EDEFAULT);
				return;
			case VecdslMMPackage.FIELD__FIELD_LIMITS:
				getFieldLimits().clear();
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
			case VecdslMMPackage.FIELD__COL_FIELD_OWNER:
				return colFieldOwner != null;
			case VecdslMMPackage.FIELD__IS_PRIMARY:
				return isPrimary != IS_PRIMARY_EDEFAULT;
			case VecdslMMPackage.FIELD__FIELD_LIMITS:
				return fieldLimits != null && !fieldLimits.isEmpty();
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
			case VecdslMMPackage.FIELD___FIELD_LIMITS_NAMES__DIAGNOSTICCHAIN_MAP:
				return fieldLimitsNames((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (isPrimary: ");
		result.append(isPrimary);
		result.append(')');
		return result.toString();
	}

} //FieldImpl

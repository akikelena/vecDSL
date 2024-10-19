/**
 */
package vecdslMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vecdslMM.Delete;
import vecdslMM.Filter;
import vecdslMM.VecdslMMPackage;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.DeleteImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link vecdslMM.impl.DeleteImpl#getDeleteCond <em>Delete Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteImpl extends DmlMethodImpl implements Delete {
	/**
	 * The cached value of the '{@link #getIds() <em>Ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<?> ids;

	/**
	 * The cached value of the '{@link #getDeleteCond() <em>Delete Cond</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteCond()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> deleteCond;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.DELETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<?> getIds() {
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIds(EList<?> newIds) {
		EList<?> oldIds = ids;
		ids = newIds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.DELETE__IDS, oldIds, ids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getDeleteCond() {
		if (deleteCond == null) {
			deleteCond = new EObjectResolvingEList<Filter>(Filter.class, this, VecdslMMPackage.DELETE__DELETE_COND);
		}
		return deleteCond;
	}

	/**
	 * The cached validation expression for the '{@link #UniqueIDsInDelete(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique IDs In Delete</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueIDsInDelete(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_IDS_IN_DELETE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Identifiers must not repeat!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.ids->isUnique(id | id)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueIDsInDelete(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.DELETE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.DELETE___UNIQUE_IDS_IN_DELETE__DIAGNOSTICCHAIN_MAP,
				 UNIQUE_IDS_IN_DELETE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.DELETE__UNIQUE_IDS_IN_DELETE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.DELETE__IDS:
				return getIds();
			case VecdslMMPackage.DELETE__DELETE_COND:
				return getDeleteCond();
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
			case VecdslMMPackage.DELETE__IDS:
				setIds((EList<?>)newValue);
				return;
			case VecdslMMPackage.DELETE__DELETE_COND:
				getDeleteCond().clear();
				getDeleteCond().addAll((Collection<? extends Filter>)newValue);
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
			case VecdslMMPackage.DELETE__IDS:
				setIds((EList<?>)null);
				return;
			case VecdslMMPackage.DELETE__DELETE_COND:
				getDeleteCond().clear();
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
			case VecdslMMPackage.DELETE__IDS:
				return ids != null;
			case VecdslMMPackage.DELETE__DELETE_COND:
				return deleteCond != null && !deleteCond.isEmpty();
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
			case VecdslMMPackage.DELETE___UNIQUE_IDS_IN_DELETE__DIAGNOSTICCHAIN_MAP:
				return UniqueIDsInDelete((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (ids: ");
		result.append(ids);
		result.append(')');
		return result.toString();
	}

} //DeleteImpl

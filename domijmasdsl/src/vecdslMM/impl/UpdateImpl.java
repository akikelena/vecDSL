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

import vecdslMM.Filter;
import vecdslMM.Update;
import vecdslMM.VecdslMMPackage;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.UpdateImpl#getPath <em>Path</em>}</li>
 *   <li>{@link vecdslMM.impl.UpdateImpl#getNofRecords <em>Nof Records</em>}</li>
 *   <li>{@link vecdslMM.impl.UpdateImpl#getUpdateCond <em>Update Cond</em>}</li>
 *   <li>{@link vecdslMM.impl.UpdateImpl#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateImpl extends DmlMethodImpl implements Update {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNofRecords() <em>Nof Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofRecords()
	 * @generated
	 * @ordered
	 */
	protected static final int NOF_RECORDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNofRecords() <em>Nof Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNofRecords()
	 * @generated
	 * @ordered
	 */
	protected int nofRecords = NOF_RECORDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdateCond() <em>Update Cond</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCond()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> updateCond;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.UPDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.UPDATE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNofRecords() {
		return nofRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNofRecords(int newNofRecords) {
		int oldNofRecords = nofRecords;
		nofRecords = newNofRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.UPDATE__NOF_RECORDS, oldNofRecords, nofRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getUpdateCond() {
		if (updateCond == null) {
			updateCond = new EObjectResolvingEList<Filter>(Filter.class, this, VecdslMMPackage.UPDATE__UPDATE_COND);
		}
		return updateCond;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.UPDATE__IDS, oldIds, ids));
	}

	/**
	 * The cached validation expression for the '{@link #UniqueIDsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique IDs In Update</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UniqueIDsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_IDS_IN_UPDATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Identifiers must not repeat!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.ids->isUnique(id | id)\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UniqueIDsInUpdate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.UPDATE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.UPDATE___UNIQUE_IDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP,
				 UNIQUE_IDS_IN_UPDATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.UPDATE__UNIQUE_IDS_IN_UPDATE);
	}

	/**
	 * The cached validation expression for the '{@link #NofRecordsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nof Records In Update</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NofRecordsInUpdate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NOF_RECORDS_IN_UPDATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Number of records must be greater than zero!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.nofRecords->notEmpty() implies self.nofRecords > 0\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NofRecordsInUpdate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.UPDATE,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.UPDATE___NOF_RECORDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP,
				 NOF_RECORDS_IN_UPDATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.UPDATE__NOF_RECORDS_IN_UPDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.UPDATE__PATH:
				return getPath();
			case VecdslMMPackage.UPDATE__NOF_RECORDS:
				return getNofRecords();
			case VecdslMMPackage.UPDATE__UPDATE_COND:
				return getUpdateCond();
			case VecdslMMPackage.UPDATE__IDS:
				return getIds();
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
			case VecdslMMPackage.UPDATE__PATH:
				setPath((String)newValue);
				return;
			case VecdslMMPackage.UPDATE__NOF_RECORDS:
				setNofRecords((Integer)newValue);
				return;
			case VecdslMMPackage.UPDATE__UPDATE_COND:
				getUpdateCond().clear();
				getUpdateCond().addAll((Collection<? extends Filter>)newValue);
				return;
			case VecdslMMPackage.UPDATE__IDS:
				setIds((EList<?>)newValue);
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
			case VecdslMMPackage.UPDATE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case VecdslMMPackage.UPDATE__NOF_RECORDS:
				setNofRecords(NOF_RECORDS_EDEFAULT);
				return;
			case VecdslMMPackage.UPDATE__UPDATE_COND:
				getUpdateCond().clear();
				return;
			case VecdslMMPackage.UPDATE__IDS:
				setIds((EList<?>)null);
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
			case VecdslMMPackage.UPDATE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case VecdslMMPackage.UPDATE__NOF_RECORDS:
				return nofRecords != NOF_RECORDS_EDEFAULT;
			case VecdslMMPackage.UPDATE__UPDATE_COND:
				return updateCond != null && !updateCond.isEmpty();
			case VecdslMMPackage.UPDATE__IDS:
				return ids != null;
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
			case VecdslMMPackage.UPDATE___UNIQUE_IDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP:
				return UniqueIDsInUpdate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case VecdslMMPackage.UPDATE___NOF_RECORDS_IN_UPDATE__DIAGNOSTICCHAIN_MAP:
				return NofRecordsInUpdate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (path: ");
		result.append(path);
		result.append(", nofRecords: ");
		result.append(nofRecords);
		result.append(", ids: ");
		result.append(ids);
		result.append(')');
		return result.toString();
	}

} //UpdateImpl

/**
 */
package vecdslMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vecdslMM.Insert;
import vecdslMM.VecdslMMPackage;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.InsertImpl#getPath <em>Path</em>}</li>
 *   <li>{@link vecdslMM.impl.InsertImpl#getNofRecords <em>Nof Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertImpl extends DmlMethodImpl implements Insert {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.INSERT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.INSERT__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.INSERT__NOF_RECORDS, oldNofRecords, nofRecords));
	}

	/**
	 * The cached validation expression for the '{@link #NoOfRecordsInInsert(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Of Records In Insert</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NoOfRecordsInInsert(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NO_OF_RECORDS_IN_INSERT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Number of records must be greater than zero!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.nofRecords->notEmpty() implies self.nofRecords > 0\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NoOfRecordsInInsert(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.INSERT,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.INSERT___NO_OF_RECORDS_IN_INSERT__DIAGNOSTICCHAIN_MAP,
				 NO_OF_RECORDS_IN_INSERT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.INSERT__NO_OF_RECORDS_IN_INSERT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VecdslMMPackage.INSERT__PATH:
				return getPath();
			case VecdslMMPackage.INSERT__NOF_RECORDS:
				return getNofRecords();
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
			case VecdslMMPackage.INSERT__PATH:
				setPath((String)newValue);
				return;
			case VecdslMMPackage.INSERT__NOF_RECORDS:
				setNofRecords((Integer)newValue);
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
			case VecdslMMPackage.INSERT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case VecdslMMPackage.INSERT__NOF_RECORDS:
				setNofRecords(NOF_RECORDS_EDEFAULT);
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
			case VecdslMMPackage.INSERT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case VecdslMMPackage.INSERT__NOF_RECORDS:
				return nofRecords != NOF_RECORDS_EDEFAULT;
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
			case VecdslMMPackage.INSERT___NO_OF_RECORDS_IN_INSERT__DIAGNOSTICCHAIN_MAP:
				return NoOfRecordsInInsert((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(')');
		return result.toString();
	}

} //InsertImpl

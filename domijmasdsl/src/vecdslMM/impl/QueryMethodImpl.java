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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import vecdslMM.Field;
import vecdslMM.QueryMethod;
import vecdslMM.VecdslMMPackage;
import vecdslMM.VectorCollection;

import vecdslMM.util.VecdslMMValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.QueryMethodImpl#getTopK <em>Top K</em>}</li>
 *   <li>{@link vecdslMM.impl.QueryMethodImpl#getQueryCollection <em>Query Collection</em>}</li>
 *   <li>{@link vecdslMM.impl.QueryMethodImpl#getOutputFields <em>Output Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QueryMethodImpl extends MethodImpl implements QueryMethod {
	/**
	 * The default value of the '{@link #getTopK() <em>Top K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopK()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_K_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTopK() <em>Top K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopK()
	 * @generated
	 * @ordered
	 */
	protected int topK = TOP_K_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQueryCollection() <em>Query Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryCollection()
	 * @generated
	 * @ordered
	 */
	protected VectorCollection queryCollection;

	/**
	 * The cached value of the '{@link #getOutputFields() <em>Output Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> outputFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.QUERY_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTopK() {
		return topK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopK(int newTopK) {
		int oldTopK = topK;
		topK = newTopK;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.QUERY_METHOD__TOP_K, oldTopK, topK));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorCollection getQueryCollection() {
		return queryCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryCollection(VectorCollection newQueryCollection, NotificationChain msgs) {
		VectorCollection oldQueryCollection = queryCollection;
		queryCollection = newQueryCollection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION, oldQueryCollection, newQueryCollection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryCollection(VectorCollection newQueryCollection) {
		if (newQueryCollection != queryCollection) {
			NotificationChain msgs = null;
			if (queryCollection != null)
				msgs = ((InternalEObject)queryCollection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION, null, msgs);
			if (newQueryCollection != null)
				msgs = ((InternalEObject)newQueryCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION, null, msgs);
			msgs = basicSetQueryCollection(newQueryCollection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION, newQueryCollection, newQueryCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOutputFields() {
		if (outputFields == null) {
			outputFields = new EObjectResolvingEList<Field>(Field.class, this, VecdslMMPackage.QUERY_METHOD__OUTPUT_FIELDS);
		}
		return outputFields;
	}

	/**
	 * The cached validation expression for the '{@link #OutputFieldsQVC(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Output Fields QVC</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OutputFieldsQVC(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FIELDS_QVC_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Output fields must be from the list of query collection field list!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.outputFields->forAll(of | self.queryCollection.fields->includes(of))\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OutputFieldsQVC(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.QUERY_METHOD,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.QUERY_METHOD___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP,
				 OUTPUT_FIELDS_QVC_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.QUERY_METHOD__OUTPUT_FIELDS_QVC);
	}

	/**
	 * The cached validation expression for the '{@link #TopKValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Top KValue</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TopKValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_KVALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Top K value must at least one!',\n" +
		"\tstatus : Boolean = \n" +
		"    \t\tself.topK >= 1\n" +
		"}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TopKValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			VecdslMMValidator.validate
				(VecdslMMPackage.Literals.QUERY_METHOD,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 VecdslMMPackage.Literals.QUERY_METHOD___TOP_KVALUE__DIAGNOSTICCHAIN_MAP,
				 TOP_KVALUE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 VecdslMMValidator.DIAGNOSTIC_SOURCE,
				 VecdslMMValidator.QUERY_METHOD__TOP_KVALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION:
				return basicSetQueryCollection(null, msgs);
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
			case VecdslMMPackage.QUERY_METHOD__TOP_K:
				return getTopK();
			case VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION:
				return getQueryCollection();
			case VecdslMMPackage.QUERY_METHOD__OUTPUT_FIELDS:
				return getOutputFields();
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
			case VecdslMMPackage.QUERY_METHOD__TOP_K:
				setTopK((Integer)newValue);
				return;
			case VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION:
				setQueryCollection((VectorCollection)newValue);
				return;
			case VecdslMMPackage.QUERY_METHOD__OUTPUT_FIELDS:
				getOutputFields().clear();
				getOutputFields().addAll((Collection<? extends Field>)newValue);
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
			case VecdslMMPackage.QUERY_METHOD__TOP_K:
				setTopK(TOP_K_EDEFAULT);
				return;
			case VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION:
				setQueryCollection((VectorCollection)null);
				return;
			case VecdslMMPackage.QUERY_METHOD__OUTPUT_FIELDS:
				getOutputFields().clear();
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
			case VecdslMMPackage.QUERY_METHOD__TOP_K:
				return topK != TOP_K_EDEFAULT;
			case VecdslMMPackage.QUERY_METHOD__QUERY_COLLECTION:
				return queryCollection != null;
			case VecdslMMPackage.QUERY_METHOD__OUTPUT_FIELDS:
				return outputFields != null && !outputFields.isEmpty();
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
			case VecdslMMPackage.QUERY_METHOD___OUTPUT_FIELDS_QVC__DIAGNOSTICCHAIN_MAP:
				return OutputFieldsQVC((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case VecdslMMPackage.QUERY_METHOD___TOP_KVALUE__DIAGNOSTICCHAIN_MAP:
				return TopKValue((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (topK: ");
		result.append(topK);
		result.append(')');
		return result.toString();
	}

} //QueryMethodImpl

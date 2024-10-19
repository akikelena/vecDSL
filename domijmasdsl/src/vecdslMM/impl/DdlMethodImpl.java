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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import vecdslMM.Concept;
import vecdslMM.DdlMethod;
import vecdslMM.VecdslMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ddl Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.impl.DdlMethodImpl#getDdlConcept <em>Ddl Concept</em>}</li>
 *   <li>{@link vecdslMM.impl.DdlMethodImpl#getDdlNode <em>Ddl Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DdlMethodImpl extends MethodImpl implements DdlMethod {
	/**
	 * The cached value of the '{@link #getDdlConcept() <em>Ddl Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdlConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept ddlConcept;

	/**
	 * The cached value of the '{@link #getDdlNode() <em>Ddl Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDdlNode()
	 * @generated
	 * @ordered
	 */
	protected EList<DdlMethod> ddlNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DdlMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VecdslMMPackage.Literals.DDL_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getDdlConcept() {
		return ddlConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDdlConcept(Concept newDdlConcept, NotificationChain msgs) {
		Concept oldDdlConcept = ddlConcept;
		ddlConcept = newDdlConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VecdslMMPackage.DDL_METHOD__DDL_CONCEPT, oldDdlConcept, newDdlConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDdlConcept(Concept newDdlConcept) {
		if (newDdlConcept != ddlConcept) {
			NotificationChain msgs = null;
			if (ddlConcept != null)
				msgs = ((InternalEObject)ddlConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.DDL_METHOD__DDL_CONCEPT, null, msgs);
			if (newDdlConcept != null)
				msgs = ((InternalEObject)newDdlConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VecdslMMPackage.DDL_METHOD__DDL_CONCEPT, null, msgs);
			msgs = basicSetDdlConcept(newDdlConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VecdslMMPackage.DDL_METHOD__DDL_CONCEPT, newDdlConcept, newDdlConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdlMethod> getDdlNode() {
		if (ddlNode == null) {
			ddlNode = new EObjectResolvingEList<DdlMethod>(DdlMethod.class, this, VecdslMMPackage.DDL_METHOD__DDL_NODE);
		}
		return ddlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VecdslMMPackage.DDL_METHOD__DDL_CONCEPT:
				return basicSetDdlConcept(null, msgs);
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
			case VecdslMMPackage.DDL_METHOD__DDL_CONCEPT:
				return getDdlConcept();
			case VecdslMMPackage.DDL_METHOD__DDL_NODE:
				return getDdlNode();
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
			case VecdslMMPackage.DDL_METHOD__DDL_CONCEPT:
				setDdlConcept((Concept)newValue);
				return;
			case VecdslMMPackage.DDL_METHOD__DDL_NODE:
				getDdlNode().clear();
				getDdlNode().addAll((Collection<? extends DdlMethod>)newValue);
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
			case VecdslMMPackage.DDL_METHOD__DDL_CONCEPT:
				setDdlConcept((Concept)null);
				return;
			case VecdslMMPackage.DDL_METHOD__DDL_NODE:
				getDdlNode().clear();
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
			case VecdslMMPackage.DDL_METHOD__DDL_CONCEPT:
				return ddlConcept != null;
			case VecdslMMPackage.DDL_METHOD__DDL_NODE:
				return ddlNode != null && !ddlNode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DdlMethodImpl

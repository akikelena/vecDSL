/**
 */
package vecdslMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Filter#getOperator <em>Operator</em>}</li>
 *   <li>{@link vecdslMM.Filter#getValue <em>Value</em>}</li>
 *   <li>{@link vecdslMM.Filter#getFilterField <em>Filter Field</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see vecdslMM.EOperator
	 * @see #setOperator(EOperator)
	 * @see vecdslMM.VecdslMMPackage#getFilter_Operator()
	 * @model required="true"
	 * @generated
	 */
	EOperator getOperator();

	/**
	 * Sets the value of the '{@link vecdslMM.Filter#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see vecdslMM.EOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(EOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see vecdslMM.VecdslMMPackage#getFilter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link vecdslMM.Filter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Filter Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Field</em>' reference.
	 * @see #setFilterField(Concept)
	 * @see vecdslMM.VecdslMMPackage#getFilter_FilterField()
	 * @model required="true"
	 * @generated
	 */
	Concept getFilterField();

	/**
	 * Sets the value of the '{@link vecdslMM.Filter#getFilterField <em>Filter Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Field</em>' reference.
	 * @see #getFilterField()
	 * @generated
	 */
	void setFilterField(Concept value);

} // Filter

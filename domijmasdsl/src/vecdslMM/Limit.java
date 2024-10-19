/**
 */
package vecdslMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.Limit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getLimit()
 * @model abstract="true"
 * @generated
 */
public interface Limit extends Concept {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see vecdslMM.VecdslMMPackage#getLimit_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link vecdslMM.Limit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Limit

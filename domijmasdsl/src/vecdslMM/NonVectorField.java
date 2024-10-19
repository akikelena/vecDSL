/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Vector Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.NonVectorField#getNonVectorIndexes <em>Non Vector Indexes</em>}</li>
 *   <li>{@link vecdslMM.NonVectorField#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getNonVectorField()
 * @model
 * @generated
 */
public interface NonVectorField extends Field {
	/**
	 * Returns the value of the '<em><b>Non Vector Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.NonVectorIndex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Vector Indexes</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getNonVectorField_NonVectorIndexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NonVectorIndex> getNonVectorIndexes();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EScalarDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EScalarDType
	 * @see #setType(EScalarDType)
	 * @see vecdslMM.VecdslMMPackage#getNonVectorField_Type()
	 * @model required="true"
	 * @generated
	 */
	EScalarDType getType();

	/**
	 * Sets the value of the '{@link vecdslMM.NonVectorField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EScalarDType
	 * @see #getType()
	 * @generated
	 */
	void setType(EScalarDType value);

} // NonVectorField

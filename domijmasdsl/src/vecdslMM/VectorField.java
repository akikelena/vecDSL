/**
 */
package vecdslMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vecdslMM.VectorField#getVectorIndexes <em>Vector Indexes</em>}</li>
 *   <li>{@link vecdslMM.VectorField#getType <em>Type</em>}</li>
 *   <li>{@link vecdslMM.VectorField#getEmbModel <em>Emb Model</em>}</li>
 * </ul>
 *
 * @see vecdslMM.VecdslMMPackage#getVectorField()
 * @model
 * @generated
 */
public interface VectorField extends Field {
	/**
	 * Returns the value of the '<em><b>Vector Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link vecdslMM.VectorIndex}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector Indexes</em>' containment reference list.
	 * @see vecdslMM.VecdslMMPackage#getVectorField_VectorIndexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<VectorIndex> getVectorIndexes();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link vecdslMM.EVectorDType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EVectorDType
	 * @see #setType(EVectorDType)
	 * @see vecdslMM.VecdslMMPackage#getVectorField_Type()
	 * @model required="true"
	 * @generated
	 */
	EVectorDType getType();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see vecdslMM.EVectorDType
	 * @see #getType()
	 * @generated
	 */
	void setType(EVectorDType value);

	/**
	 * Returns the value of the '<em><b>Emb Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emb Model</em>' reference.
	 * @see #setEmbModel(EmbeddingModel)
	 * @see vecdslMM.VecdslMMPackage#getVectorField_EmbModel()
	 * @model
	 * @generated
	 */
	EmbeddingModel getEmbModel();

	/**
	 * Sets the value of the '{@link vecdslMM.VectorField#getEmbModel <em>Emb Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emb Model</em>' reference.
	 * @see #getEmbModel()
	 * @generated
	 */
	void setEmbModel(EmbeddingModel value);

} // VectorField

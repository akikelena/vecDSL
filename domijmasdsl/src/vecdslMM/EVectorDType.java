/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EVector DType</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEVectorDType()
 * @model
 * @generated
 */
public enum EVectorDType implements Enumerator {
	/**
	 * The '<em><b>BINARY VECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_VECTOR(0, "BINARY_VECTOR", "BINARY_VECTOR"),

	/**
	 * The '<em><b>FLOAT VECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT_VECTOR(1, "FLOAT_VECTOR", "FLOAT_VECTOR");

	/**
	 * The '<em><b>BINARY VECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VECTOR_VALUE = 0;

	/**
	 * The '<em><b>FLOAT VECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VECTOR_VALUE = 1;

	/**
	 * An array of all the '<em><b>EVector DType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EVectorDType[] VALUES_ARRAY =
		new EVectorDType[] {
			BINARY_VECTOR,
			FLOAT_VECTOR,
		};

	/**
	 * A public read-only list of all the '<em><b>EVector DType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EVectorDType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EVector DType</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVectorDType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVectorDType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EVector DType</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVectorDType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVectorDType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EVector DType</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVectorDType get(int value) {
		switch (value) {
			case BINARY_VECTOR_VALUE: return BINARY_VECTOR;
			case FLOAT_VECTOR_VALUE: return FLOAT_VECTOR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EVectorDType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EVectorDType

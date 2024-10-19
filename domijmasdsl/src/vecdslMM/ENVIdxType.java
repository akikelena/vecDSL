/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENV Idx Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getENVIdxType()
 * @model
 * @generated
 */
public enum ENVIdxType implements Enumerator {
	/**
	 * The '<em><b>STANDARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(0, "STANDARD", "STANDARD"),

	/**
	 * The '<em><b>FULL TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_TEXT(1, "FULL_TEXT", "FULL_TEXT"),

	/**
	 * The '<em><b>INTEGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(2, "INTEGER", "INTEGER"),

	/**
	 * The '<em><b>PARAM INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAM_INT_VALUE
	 * @generated
	 * @ordered
	 */
	PARAM_INT(3, "PARAM_INT", "PARAM_INT");

	/**
	 * The '<em><b>STANDARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 0;

	/**
	 * The '<em><b>FULL TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULL_TEXT_VALUE = 1;

	/**
	 * The '<em><b>INTEGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 2;

	/**
	 * The '<em><b>PARAM INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAM_INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAM_INT_VALUE = 3;

	/**
	 * An array of all the '<em><b>ENV Idx Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENVIdxType[] VALUES_ARRAY =
		new ENVIdxType[] {
			STANDARD,
			FULL_TEXT,
			INTEGER,
			PARAM_INT,
		};

	/**
	 * A public read-only list of all the '<em><b>ENV Idx Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENVIdxType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENV Idx Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENVIdxType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENVIdxType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENV Idx Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENVIdxType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENVIdxType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENV Idx Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENVIdxType get(int value) {
		switch (value) {
			case STANDARD_VALUE: return STANDARD;
			case FULL_TEXT_VALUE: return FULL_TEXT;
			case INTEGER_VALUE: return INTEGER;
			case PARAM_INT_VALUE: return PARAM_INT;
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
	private ENVIdxType(int value, String name, String literal) {
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
	
} //ENVIdxType

/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EScalar DType</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEScalarDType()
 * @model
 * @generated
 */
public enum EScalarDType implements Enumerator {
	/**
	 * The '<em><b>INT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(0, "INT", "INT"),

	/**
	 * The '<em><b>VARCHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	VARCHAR(1, "VARCHAR", "VARCHAR"),

	/**
	 * The '<em><b>DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE(2, "DOUBLE", "DOUBLE"),

	/**
	 * The '<em><b>FLOAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(3, "FLOAT", "FLOAT"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(4, "DATE", "DATE"),

	/**
	 * The '<em><b>DATETIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATETIME(5, "DATETIME", "DATETIME"),

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(6, "JSON", "JSON");

	/**
	 * The '<em><b>INT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 0;

	/**
	 * The '<em><b>VARCHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VARCHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VARCHAR_VALUE = 1;

	/**
	 * The '<em><b>DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_VALUE = 2;

	/**
	 * The '<em><b>FLOAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 3;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 4;

	/**
	 * The '<em><b>DATETIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATETIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATETIME_VALUE = 5;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 6;

	/**
	 * An array of all the '<em><b>EScalar DType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EScalarDType[] VALUES_ARRAY =
		new EScalarDType[] {
			INT,
			VARCHAR,
			DOUBLE,
			FLOAT,
			DATE,
			DATETIME,
			JSON,
		};

	/**
	 * A public read-only list of all the '<em><b>EScalar DType</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EScalarDType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EScalar DType</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EScalarDType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EScalarDType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EScalar DType</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EScalarDType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EScalarDType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EScalar DType</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EScalarDType get(int value) {
		switch (value) {
			case INT_VALUE: return INT;
			case VARCHAR_VALUE: return VARCHAR;
			case DOUBLE_VALUE: return DOUBLE;
			case FLOAT_VALUE: return FLOAT;
			case DATE_VALUE: return DATE;
			case DATETIME_VALUE: return DATETIME;
			case JSON_VALUE: return JSON;
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
	private EScalarDType(int value, String name, String literal) {
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
	
} //EScalarDType

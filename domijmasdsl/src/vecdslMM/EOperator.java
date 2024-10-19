/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EOperator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEOperator()
 * @model
 * @generated
 */
public enum EOperator implements Enumerator {
	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(0, "AND", "AND"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(1, "OR", "OR"),

	/**
	 * The '<em><b>NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(2, "NOT", "NOT"),

	/**
	 * The '<em><b>LIKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE_VALUE
	 * @generated
	 * @ordered
	 */
	LIKE(3, "LIKE", "LIKE"),

	/**
	 * The '<em><b>EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(4, "EQ", "EQ"),

	/**
	 * The '<em><b>NEQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEQ_VALUE
	 * @generated
	 * @ordered
	 */
	NEQ(5, "NEQ", "NEQ"),

	/**
	 * The '<em><b>GT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(6, "GT", "GT"),

	/**
	 * The '<em><b>GTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTE_VALUE
	 * @generated
	 * @ordered
	 */
	GTE(7, "GTE", "GTE"),

	/**
	 * The '<em><b>LT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(8, "LT", "LT"),

	/**
	 * The '<em><b>LTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE_VALUE
	 * @generated
	 * @ordered
	 */
	LTE(9, "LTE", "LTE");

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 0;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 1;

	/**
	 * The '<em><b>NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 2;

	/**
	 * The '<em><b>LIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIKE_VALUE = 3;

	/**
	 * The '<em><b>EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 4;

	/**
	 * The '<em><b>NEQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEQ_VALUE = 5;

	/**
	 * The '<em><b>GT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 6;

	/**
	 * The '<em><b>GTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GTE_VALUE = 7;

	/**
	 * The '<em><b>LT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 8;

	/**
	 * The '<em><b>LTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LTE_VALUE = 9;

	/**
	 * An array of all the '<em><b>EOperator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EOperator[] VALUES_ARRAY =
		new EOperator[] {
			AND,
			OR,
			NOT,
			LIKE,
			EQ,
			NEQ,
			GT,
			GTE,
			LT,
			LTE,
		};

	/**
	 * A public read-only list of all the '<em><b>EOperator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EOperator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EOperator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EOperator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EOperator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EOperator get(int value) {
		switch (value) {
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case NOT_VALUE: return NOT;
			case LIKE_VALUE: return LIKE;
			case EQ_VALUE: return EQ;
			case NEQ_VALUE: return NEQ;
			case GT_VALUE: return GT;
			case GTE_VALUE: return GTE;
			case LT_VALUE: return LT;
			case LTE_VALUE: return LTE;
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
	private EOperator(int value, String name, String literal) {
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
	
} //EOperator

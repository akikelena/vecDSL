/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EField Limit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEFieldLimit()
 * @model
 * @generated
 */
public enum EFieldLimit implements Enumerator {
	/**
	 * The '<em><b>VECTORDIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORDIM_VALUE
	 * @generated
	 * @ordered
	 */
	VECTORDIM(0, "VECTORDIM", "VECTORDIM"),

	/**
	 * The '<em><b>ARRAYLEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAYLEN_VALUE
	 * @generated
	 * @ordered
	 */
	ARRAYLEN(1, "ARRAYLEN", "ARRAYLEN"),

	/**
	 * The '<em><b>MAXSIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXSIZE_VALUE
	 * @generated
	 * @ordered
	 */
	MAXSIZE(2, "MAXSIZE", "MAXSIZE");

	/**
	 * The '<em><b>VECTORDIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORDIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VECTORDIM_VALUE = 0;

	/**
	 * The '<em><b>ARRAYLEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARRAYLEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARRAYLEN_VALUE = 1;

	/**
	 * The '<em><b>MAXSIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXSIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAXSIZE_VALUE = 2;

	/**
	 * An array of all the '<em><b>EField Limit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EFieldLimit[] VALUES_ARRAY =
		new EFieldLimit[] {
			VECTORDIM,
			ARRAYLEN,
			MAXSIZE,
		};

	/**
	 * A public read-only list of all the '<em><b>EField Limit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EFieldLimit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EField Limit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EFieldLimit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EFieldLimit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EField Limit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EFieldLimit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EFieldLimit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EField Limit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EFieldLimit get(int value) {
		switch (value) {
			case VECTORDIM_VALUE: return VECTORDIM;
			case ARRAYLEN_VALUE: return ARRAYLEN;
			case MAXSIZE_VALUE: return MAXSIZE;
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
	private EFieldLimit(int value, String name, String literal) {
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
	
} //EFieldLimit

/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EIndex Limit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEIndexLimit()
 * @model
 * @generated
 */
public enum EIndexLimit implements Enumerator {
	/**
	 * The '<em><b>NOFCLUSTERUNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFCLUSTERUNIT_VALUE
	 * @generated
	 * @ordered
	 */
	NOFCLUSTERUNIT(0, "NOFCLUSTERUNIT", "NOFCLUSTERUNIT"),

	/**
	 * The '<em><b>NOFFACTORSPQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFFACTORSPQ_VALUE
	 * @generated
	 * @ordered
	 */
	NOFFACTORSPQ(1, "NOFFACTORSPQ", "NOFFACTORSPQ"),

	/**
	 * The '<em><b>MAXNODEDGRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXNODEDGRE_VALUE
	 * @generated
	 * @ordered
	 */
	MAXNODEDGRE(2, "MAXNODEDGRE", "MAXNODEDGRE");

	/**
	 * The '<em><b>NOFCLUSTERUNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFCLUSTERUNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOFCLUSTERUNIT_VALUE = 0;

	/**
	 * The '<em><b>NOFFACTORSPQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFFACTORSPQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOFFACTORSPQ_VALUE = 1;

	/**
	 * The '<em><b>MAXNODEDGRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXNODEDGRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAXNODEDGRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>EIndex Limit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EIndexLimit[] VALUES_ARRAY =
		new EIndexLimit[] {
			NOFCLUSTERUNIT,
			NOFFACTORSPQ,
			MAXNODEDGRE,
		};

	/**
	 * A public read-only list of all the '<em><b>EIndex Limit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EIndexLimit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EIndex Limit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EIndexLimit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EIndexLimit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EIndex Limit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EIndexLimit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EIndexLimit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EIndex Limit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EIndexLimit get(int value) {
		switch (value) {
			case NOFCLUSTERUNIT_VALUE: return NOFCLUSTERUNIT;
			case NOFFACTORSPQ_VALUE: return NOFFACTORSPQ;
			case MAXNODEDGRE_VALUE: return MAXNODEDGRE;
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
	private EIndexLimit(int value, String name, String literal) {
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
	
} //EIndexLimit

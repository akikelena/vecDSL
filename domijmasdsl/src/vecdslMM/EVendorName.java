/**
 */
package vecdslMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EVendor Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vecdslMM.VecdslMMPackage#getEVendorName()
 * @model
 * @generated
 */
public enum EVendorName implements Enumerator {
	/**
	 * The '<em><b>PINECONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINECONE_VALUE
	 * @generated
	 * @ordered
	 */
	PINECONE(0, "PINECONE", "PINECONE"),

	/**
	 * The '<em><b>MILVUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILVUS_VALUE
	 * @generated
	 * @ordered
	 */
	MILVUS(1, "MILVUS", "MILVUS"),

	/**
	 * The '<em><b>CHROMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHROMA_VALUE
	 * @generated
	 * @ordered
	 */
	CHROMA(2, "CHROMA", "CHROMA"),

	/**
	 * The '<em><b>WEAVIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAVIATE_VALUE
	 * @generated
	 * @ordered
	 */
	WEAVIATE(3, "WEAVIATE", "WEAVIATE"),

	/**
	 * The '<em><b>QDRANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QDRANT_VALUE
	 * @generated
	 * @ordered
	 */
	QDRANT(4, "QDRANT", "QDRANT");

	/**
	 * The '<em><b>PINECONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINECONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PINECONE_VALUE = 0;

	/**
	 * The '<em><b>MILVUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILVUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MILVUS_VALUE = 1;

	/**
	 * The '<em><b>CHROMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHROMA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHROMA_VALUE = 2;

	/**
	 * The '<em><b>WEAVIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAVIATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEAVIATE_VALUE = 3;

	/**
	 * The '<em><b>QDRANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QDRANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QDRANT_VALUE = 4;

	/**
	 * An array of all the '<em><b>EVendor Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EVendorName[] VALUES_ARRAY =
		new EVendorName[] {
			PINECONE,
			MILVUS,
			CHROMA,
			WEAVIATE,
			QDRANT,
		};

	/**
	 * A public read-only list of all the '<em><b>EVendor Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EVendorName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EVendor Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVendorName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVendorName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EVendor Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVendorName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EVendorName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EVendor Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EVendorName get(int value) {
		switch (value) {
			case PINECONE_VALUE: return PINECONE;
			case MILVUS_VALUE: return MILVUS;
			case CHROMA_VALUE: return CHROMA;
			case WEAVIATE_VALUE: return WEAVIATE;
			case QDRANT_VALUE: return QDRANT;
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
	private EVendorName(int value, String name, String literal) {
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
	
} //EVendorName

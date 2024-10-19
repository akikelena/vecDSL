package org.xtext.example.domij.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import vecdslMM.Script;
import vecdslMM.VectorDatabase;

@SuppressWarnings("all")
public class MilvusGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject eObject : _contents) {
      if ((eObject instanceof Script)) {
        this.generate(((Script) eObject), fsa);
      }
    }
  }

  public void generate(final Script s, final IFileSystemAccess2 fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field vdbCode is undefined"
      + "\nThe method or field connectionCode is undefined"
      + "\nThe method or field embeddingModelCode is undefined"
      + "\nThe method or field clustersCode is undefined"
      + "\nThe method or field methodsCode is undefined");
  }

  public CharSequence generateVdbCode(final VectorDatabase vdb) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field methods is undefined for the type VectorDatabase"
      + "\nThe method generateMethodCode(VectorDatabase, Method) from the type MilvusGenerator refers to the missing type Method");
  }

  public CharSequence generateConnectionCode(final /* Connection */Object conn) {
    throw new Error("Unresolved compilation problems:"
      + "\nhost cannot be resolved"
      + "\nport cannot be resolved");
  }

  public CharSequence generateClusterCode(final /* Cluster */Object cluster) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generateCollectionCode(Colection) from the type MilvusGenerator refers to the missing type Colection"
      + "\nname cannot be resolved"
      + "\ncolections cannot be resolved");
  }

  public CharSequence generateCollectionCode(final /* Colection */Object collection) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generateFieldSchema(Field) from the type MilvusGenerator refers to the missing type Field"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nfields cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\npartitions cannot be resolved"
      + "\ndynamic cannot be resolved");
  }

  public CharSequence generatePartitionCode(final /* Colection */Object collection, final /* Partition */Object partition) {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\npartition_key cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\nname cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nname cannot be resolved");
  }

  public String generateEmbeddingModelCode(final VectorDatabase db) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field colections is undefined"
      + "\nThe method or field fields is undefined"
      + "\nThe method or field embModel is undefined"
      + "\nThe method or field embModel is undefined"
      + "\n!== cannot be resolved"
      + "\nsource cannot be resolved");
  }

  public CharSequence generateFieldSchema(final /* Field */Object field) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field type is undefined"
      + "\nThe method or field EFieldLimit is undefined"
      + "\nThe method or field type is undefined"
      + "\nThe method or field EFieldLimit is undefined"
      + "\nThe method or field type is undefined"
      + "\nThe method or field EFieldLimit is undefined"
      + "\nThe method or field type is undefined"
      + "\nThe method or field EFieldLimit is undefined"
      + "\nname cannot be resolved"
      + "\ndataType cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoUpperCase cannot be resolved"
      + "\nisPrimary cannot be resolved"
      + "\nisPrimary cannot be resolved"
      + "\nfield_limits cannot be resolved"
      + "\nexists cannot be resolved"
      + "\n== cannot be resolved"
      + "\nMAXSIZE cannot be resolved"
      + "\nfield_limits cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\n== cannot be resolved"
      + "\nMAXSIZE cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nfield_limits cannot be resolved"
      + "\nexists cannot be resolved"
      + "\n== cannot be resolved"
      + "\nVECTORDIM cannot be resolved"
      + "\nfield_limits cannot be resolved"
      + "\nfindFirst cannot be resolved"
      + "\n== cannot be resolved"
      + "\nVECTORDIM cannot be resolved"
      + "\nvalue cannot be resolved");
  }

  public String getConvertedDataType(final /* EDataType */Object dataType) {
    throw new Error("Unresolved compilation problems:"
      + "\nEDataType cannot be resolved to a type."
      + "\nINT cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoUpperCase cannot be resolved");
  }

  public CharSequence generateIndex(final /* Index */Object index) {
    throw new Error("Unresolved compilation problems:"
      + "\nStdIndex cannot be resolved to a type."
      + "\nVectorIndex cannot be resolved to a type."
      + "\ntype cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nmetric cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nincludeRawData cannot be resolved"
      + "\nindexLimits cannot be resolved"
      + "\ntype cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\nname cannot be resolved");
  }

  public CharSequence generateMethodCode(final VectorDatabase db, final /* Method */Object method) {
    throw new Error("Unresolved compilation problems:"
      + "\nInsert cannot be resolved to a type."
      + "\nInsert cannot be resolved to a type."
      + "\nUpsert cannot be resolved to a type."
      + "\nUpsert cannot be resolved to a type."
      + "\nDelete cannot be resolved to a type."
      + "\nDelete cannot be resolved to a type."
      + "\nFilter cannot be resolved to a type."
      + "\nFilter cannot be resolved to a type."
      + "\nVectorSearch cannot be resolved to a type."
      + "\nVectorSearch cannot be resolved to a type."
      + "\nThe method or field methods is undefined for the type VectorDatabase"
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nUnreachable code: The case can never match. It is already handled by a previous condition."
      + "\nThe method generateInsertMethod(Insert) from the type MilvusGenerator refers to the missing type Insert"
      + "\nThe method generateUpsertMethod(Upsert) from the type MilvusGenerator refers to the missing type Upsert"
      + "\nThe method generateDeleteMethod(Delete) from the type MilvusGenerator refers to the missing type Delete"
      + "\nThe method generateFilterMethod(Filter) from the type MilvusGenerator refers to the missing type Filter"
      + "\nThe method generateVectorSearchMethod(VectorSearch) from the type MilvusGenerator refers to the missing type VectorSearch"
      + "\ncontains cannot be resolved"
      + "\n! cannot be resolved");
  }

  public CharSequence generateInsertMethod(final /* Insert */Object insert) {
    throw new Error("Unresolved compilation problems:"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nfields cannot be resolved"
      + "\ndataType cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\n== cannot be resolved"
      + "\n|| cannot be resolved"
      + "\ndataType cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nfields cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\n+ cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nfields cannot be resolved"
      + "\nindexOf cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nnofRecords cannot be resolved"
      + "\npath cannot be resolved");
  }

  public CharSequence generateUpsertMethod(final /* Upsert */Object upsert) {
    throw new Error("Unresolved compilation problems:"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved"
      + "\npath cannot be resolved"
      + "\nnofRecords cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved");
  }

  public CharSequence generateDeleteMethod(final /* Delete */Object delete) {
    throw new Error("Unresolved compilation problems:"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved"
      + "\ndeleteIds cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved");
  }

  public CharSequence generateFilterMethod(final /* Filter */Object filter) {
    throw new Error("Unresolved compilation problems:"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved"
      + "\nleft_side_field cannot be resolved"
      + "\nname cannot be resolved"
      + "\noperator cannot be resolved"
      + "\nvalue cannot be resolved"
      + "\noutput_fields cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ntopK cannot be resolved"
      + "\ntopK cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved");
  }

  public CharSequence generateVectorSearchMethod(final /* VectorSearch */Object search) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type Object"
      + "\nThe method or field name is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved"
      + "\ntopK cannot be resolved"
      + "\nmetric cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\nsearch_vectors cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\noutput_fields cannot be resolved"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved"
      + "\ncolection cannot be resolved"
      + "\nname cannot be resolved");
  }
}

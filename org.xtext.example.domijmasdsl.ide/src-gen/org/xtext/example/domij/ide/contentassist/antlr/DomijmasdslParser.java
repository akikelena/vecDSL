/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.domij.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.domij.ide.contentassist.antlr.internal.InternalDomijmasdslParser;
import org.xtext.example.domij.services.DomijmasdslGrammarAccess;

public class DomijmasdslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DomijmasdslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DomijmasdslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
			builder.put(grammarAccess.getConceptAccess().getAlternatives(), "rule__Concept__Alternatives");
			builder.put(grammarAccess.getFieldAccess().getAlternatives(), "rule__Field__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getEVendorNameAccess().getAlternatives(), "rule__EVendorName__Alternatives");
			builder.put(grammarAccess.getEPodTypesAccess().getAlternatives(), "rule__EPodTypes__Alternatives");
			builder.put(grammarAccess.getEPodSizeAccess().getAlternatives(), "rule__EPodSize__Alternatives");
			builder.put(grammarAccess.getEPodEnvAccess().getAlternatives(), "rule__EPodEnv__Alternatives");
			builder.put(grammarAccess.getEScalarDTypeAccess().getAlternatives(), "rule__EScalarDType__Alternatives");
			builder.put(grammarAccess.getEVectorDTypeAccess().getAlternatives(), "rule__EVectorDType__Alternatives");
			builder.put(grammarAccess.getEFieldLimitAccess().getAlternatives(), "rule__EFieldLimit__Alternatives");
			builder.put(grammarAccess.getEColectionLimitAccess().getAlternatives(), "rule__EColectionLimit__Alternatives");
			builder.put(grammarAccess.getEIndexLimitAccess().getAlternatives(), "rule__EIndexLimit__Alternatives");
			builder.put(grammarAccess.getEMetricTypeAccess().getAlternatives(), "rule__EMetricType__Alternatives");
			builder.put(grammarAccess.getEVIdxTypeAccess().getAlternatives(), "rule__EVIdxType__Alternatives");
			builder.put(grammarAccess.getENVIdxTypeAccess().getAlternatives(), "rule__ENVIdxType__Alternatives");
			builder.put(grammarAccess.getEOperatorAccess().getAlternatives(), "rule__EOperator__Alternatives");
			builder.put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
			builder.put(grammarAccess.getScriptAccess().getGroup_3(), "rule__Script__Group_3__0");
			builder.put(grammarAccess.getCreateAccess().getGroup(), "rule__Create__Group__0");
			builder.put(grammarAccess.getCreateAccess().getGroup_3(), "rule__Create__Group_3__0");
			builder.put(grammarAccess.getAlterAccess().getGroup(), "rule__Alter__Group__0");
			builder.put(grammarAccess.getAlterAccess().getGroup_3(), "rule__Alter__Group_3__0");
			builder.put(grammarAccess.getAlterAccess().getGroup_7(), "rule__Alter__Group_7__0");
			builder.put(grammarAccess.getDropAccess().getGroup(), "rule__Drop__Group__0");
			builder.put(grammarAccess.getDropAccess().getGroup_4(), "rule__Drop__Group_4__0");
			builder.put(grammarAccess.getDropAccess().getGroup_6(), "rule__Drop__Group_6__0");
			builder.put(grammarAccess.getDropAccess().getGroup_6_2(), "rule__Drop__Group_6_2__0");
			builder.put(grammarAccess.getInsertAccess().getGroup(), "rule__Insert__Group__0");
			builder.put(grammarAccess.getInsertAccess().getGroup_8(), "rule__Insert__Group_8__0");
			builder.put(grammarAccess.getUpdateAccess().getGroup(), "rule__Update__Group__0");
			builder.put(grammarAccess.getUpdateAccess().getGroup_7(), "rule__Update__Group_7__0");
			builder.put(grammarAccess.getUpdateAccess().getGroup_11(), "rule__Update__Group_11__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup_4(), "rule__Delete__Group_4__0");
			builder.put(grammarAccess.getDeleteAccess().getGroup_4_3(), "rule__Delete__Group_4_3__0");
			builder.put(grammarAccess.getVectorSearchAccess().getGroup(), "rule__VectorSearch__Group__0");
			builder.put(grammarAccess.getVectorSearchAccess().getGroup_12(), "rule__VectorSearch__Group_12__0");
			builder.put(grammarAccess.getVectorSearchAccess().getGroup_18(), "rule__VectorSearch__Group_18__0");
			builder.put(grammarAccess.getVectorSearchAccess().getGroup_20(), "rule__VectorSearch__Group_20__0");
			builder.put(grammarAccess.getVectorSearchAccess().getGroup_20_4(), "rule__VectorSearch__Group_20_4__0");
			builder.put(grammarAccess.getNonVectorSearchAccess().getGroup(), "rule__NonVectorSearch__Group__0");
			builder.put(grammarAccess.getNonVectorSearchAccess().getGroup_12(), "rule__NonVectorSearch__Group_12__0");
			builder.put(grammarAccess.getNonVectorSearchAccess().getGroup_14(), "rule__NonVectorSearch__Group_14__0");
			builder.put(grammarAccess.getNonVectorSearchAccess().getGroup_14_4(), "rule__NonVectorSearch__Group_14_4__0");
			builder.put(grammarAccess.getVectorDatabaseAccess().getGroup(), "rule__VectorDatabase__Group__0");
			builder.put(grammarAccess.getVectorDatabaseAccess().getGroup_6(), "rule__VectorDatabase__Group_6__0");
			builder.put(grammarAccess.getVectorDatabaseAccess().getGroup_7(), "rule__VectorDatabase__Group_7__0");
			builder.put(grammarAccess.getClusterAccess().getGroup(), "rule__Cluster__Group__0");
			builder.put(grammarAccess.getClusterAccess().getGroup_4(), "rule__Cluster__Group_4__0");
			builder.put(grammarAccess.getClusterAccess().getGroup_5(), "rule__Cluster__Group_5__0");
			builder.put(grammarAccess.getClusterAccess().getGroup_6(), "rule__Cluster__Group_6__0");
			builder.put(grammarAccess.getClusterAccess().getGroup_7(), "rule__Cluster__Group_7__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup(), "rule__VectorCollection__Group__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup_6(), "rule__VectorCollection__Group_6__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup_7(), "rule__VectorCollection__Group_7__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup_8(), "rule__VectorCollection__Group_8__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup_9(), "rule__VectorCollection__Group_9__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup_10(), "rule__VectorCollection__Group_10__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup_11(), "rule__VectorCollection__Group_11__0");
			builder.put(grammarAccess.getVectorCollectionAccess().getGroup_12(), "rule__VectorCollection__Group_12__0");
			builder.put(grammarAccess.getPartitionAccess().getGroup(), "rule__Partition__Group__0");
			builder.put(grammarAccess.getPartitionAccess().getGroup_4(), "rule__Partition__Group_4__0");
			builder.put(grammarAccess.getEmbeddingModelAccess().getGroup(), "rule__EmbeddingModel__Group__0");
			builder.put(grammarAccess.getEmbeddingModelAccess().getGroup_2(), "rule__EmbeddingModel__Group_2__0");
			builder.put(grammarAccess.getFieldLimitAccess().getGroup(), "rule__FieldLimit__Group__0");
			builder.put(grammarAccess.getFieldLimitAccess().getGroup_9(), "rule__FieldLimit__Group_9__0");
			builder.put(grammarAccess.getCollectionLimitAccess().getGroup(), "rule__CollectionLimit__Group__0");
			builder.put(grammarAccess.getCollectionLimitAccess().getGroup_9(), "rule__CollectionLimit__Group_9__0");
			builder.put(grammarAccess.getClusterLimitAccess().getGroup(), "rule__ClusterLimit__Group__0");
			builder.put(grammarAccess.getClusterLimitAccess().getGroup_9(), "rule__ClusterLimit__Group_9__0");
			builder.put(grammarAccess.getIndexLimitAccess().getGroup(), "rule__IndexLimit__Group__0");
			builder.put(grammarAccess.getIndexLimitAccess().getGroup_9(), "rule__IndexLimit__Group_9__0");
			builder.put(grammarAccess.getVectorIndexAccess().getGroup(), "rule__VectorIndex__Group__0");
			builder.put(grammarAccess.getVectorIndexAccess().getGroup_3(), "rule__VectorIndex__Group_3__0");
			builder.put(grammarAccess.getVectorIndexAccess().getGroup_10(), "rule__VectorIndex__Group_10__0");
			builder.put(grammarAccess.getNonVectorIndexAccess().getGroup(), "rule__NonVectorIndex__Group__0");
			builder.put(grammarAccess.getNonVectorIndexAccess().getGroup_6(), "rule__NonVectorIndex__Group_6__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_7(), "rule__Connection__Group_7__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_8(), "rule__Connection__Group_8__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_9(), "rule__Connection__Group_9__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_10(), "rule__Connection__Group_10__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_11(), "rule__Connection__Group_11__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_12(), "rule__Connection__Group_12__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_13(), "rule__Connection__Group_13__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup_14(), "rule__Connection__Group_14__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getNonVectorFieldAccess().getGroup(), "rule__NonVectorField__Group__0");
			builder.put(grammarAccess.getNonVectorFieldAccess().getGroup_9(), "rule__NonVectorField__Group_9__0");
			builder.put(grammarAccess.getNonVectorFieldAccess().getGroup_10(), "rule__NonVectorField__Group_10__0");
			builder.put(grammarAccess.getVectorFieldAccess().getGroup(), "rule__VectorField__Group__0");
			builder.put(grammarAccess.getVectorFieldAccess().getGroup_9(), "rule__VectorField__Group_9__0");
			builder.put(grammarAccess.getVectorFieldAccess().getGroup_10(), "rule__VectorField__Group_10__0");
			builder.put(grammarAccess.getVectorFieldAccess().getGroup_11(), "rule__VectorField__Group_11__0");
			builder.put(grammarAccess.getFilterAccess().getGroup(), "rule__Filter__Group__0");
			builder.put(grammarAccess.getScriptAccess().getVendorAssignment_2(), "rule__Script__VendorAssignment_2");
			builder.put(grammarAccess.getScriptAccess().getMethodsAssignment_3_3(), "rule__Script__MethodsAssignment_3_3");
			builder.put(grammarAccess.getScriptAccess().getMethodsAssignment_3_4(), "rule__Script__MethodsAssignment_3_4");
			builder.put(grammarAccess.getCreateAccess().getDdlConceptAssignment_2(), "rule__Create__DdlConceptAssignment_2");
			builder.put(grammarAccess.getCreateAccess().getDdlNodeAssignment_3_1(), "rule__Create__DdlNodeAssignment_3_1");
			builder.put(grammarAccess.getCreateAccess().getDdlNodeAssignment_3_2(), "rule__Create__DdlNodeAssignment_3_2");
			builder.put(grammarAccess.getAlterAccess().getDdlConceptAssignment_2(), "rule__Alter__DdlConceptAssignment_2");
			builder.put(grammarAccess.getAlterAccess().getDdlNodeAssignment_3_1(), "rule__Alter__DdlNodeAssignment_3_1");
			builder.put(grammarAccess.getAlterAccess().getDdlNodeAssignment_3_2(), "rule__Alter__DdlNodeAssignment_3_2");
			builder.put(grammarAccess.getAlterAccess().getAlterCondAssignment_6(), "rule__Alter__AlterCondAssignment_6");
			builder.put(grammarAccess.getAlterAccess().getAlterCondAssignment_7_1(), "rule__Alter__AlterCondAssignment_7_1");
			builder.put(grammarAccess.getDropAccess().getDdlConceptAssignment_2(), "rule__Drop__DdlConceptAssignment_2");
			builder.put(grammarAccess.getDropAccess().getDdlNodeAssignment_4_1(), "rule__Drop__DdlNodeAssignment_4_1");
			builder.put(grammarAccess.getDropAccess().getDdlNodeAssignment_4_2(), "rule__Drop__DdlNodeAssignment_4_2");
			builder.put(grammarAccess.getDropAccess().getDropCondAssignment_6_1(), "rule__Drop__DropCondAssignment_6_1");
			builder.put(grammarAccess.getDropAccess().getDropCondAssignment_6_2_1(), "rule__Drop__DropCondAssignment_6_2_1");
			builder.put(grammarAccess.getInsertAccess().getDmlCollectionAssignment_3(), "rule__Insert__DmlCollectionAssignment_3");
			builder.put(grammarAccess.getInsertAccess().getPathAssignment_7(), "rule__Insert__PathAssignment_7");
			builder.put(grammarAccess.getInsertAccess().getNofRecordsAssignment_8_4(), "rule__Insert__NofRecordsAssignment_8_4");
			builder.put(grammarAccess.getUpdateAccess().getDmlCollectionAssignment_2(), "rule__Update__DmlCollectionAssignment_2");
			builder.put(grammarAccess.getUpdateAccess().getPathAssignment_6(), "rule__Update__PathAssignment_6");
			builder.put(grammarAccess.getUpdateAccess().getNofRecordsAssignment_7_4(), "rule__Update__NofRecordsAssignment_7_4");
			builder.put(grammarAccess.getUpdateAccess().getUpdateCondAssignment_10(), "rule__Update__UpdateCondAssignment_10");
			builder.put(grammarAccess.getUpdateAccess().getUpdateCondAssignment_11_1(), "rule__Update__UpdateCondAssignment_11_1");
			builder.put(grammarAccess.getDeleteAccess().getDmlCollectionAssignment_3(), "rule__Delete__DmlCollectionAssignment_3");
			builder.put(grammarAccess.getDeleteAccess().getDeleteCondAssignment_4_2(), "rule__Delete__DeleteCondAssignment_4_2");
			builder.put(grammarAccess.getDeleteAccess().getDeleteCondAssignment_4_3_1(), "rule__Delete__DeleteCondAssignment_4_3_1");
			builder.put(grammarAccess.getVectorSearchAccess().getQueryCollectionAssignment_4(), "rule__VectorSearch__QueryCollectionAssignment_4");
			builder.put(grammarAccess.getVectorSearchAccess().getTopKAssignment_8(), "rule__VectorSearch__TopKAssignment_8");
			builder.put(grammarAccess.getVectorSearchAccess().getMetricAssignment_11(), "rule__VectorSearch__MetricAssignment_11");
			builder.put(grammarAccess.getVectorSearchAccess().getNumUnitsProbeAssignment_12_2(), "rule__VectorSearch__NumUnitsProbeAssignment_12_2");
			builder.put(grammarAccess.getVectorSearchAccess().getOutputFieldsAssignment_17(), "rule__VectorSearch__OutputFieldsAssignment_17");
			builder.put(grammarAccess.getVectorSearchAccess().getOutputFieldsAssignment_18_1(), "rule__VectorSearch__OutputFieldsAssignment_18_1");
			builder.put(grammarAccess.getVectorSearchAccess().getVecSearchFiltersAssignment_20_3(), "rule__VectorSearch__VecSearchFiltersAssignment_20_3");
			builder.put(grammarAccess.getVectorSearchAccess().getVecSearchFiltersAssignment_20_4_1(), "rule__VectorSearch__VecSearchFiltersAssignment_20_4_1");
			builder.put(grammarAccess.getNonVectorSearchAccess().getQueryCollectionAssignment_3(), "rule__NonVectorSearch__QueryCollectionAssignment_3");
			builder.put(grammarAccess.getNonVectorSearchAccess().getTopKAssignment_7(), "rule__NonVectorSearch__TopKAssignment_7");
			builder.put(grammarAccess.getNonVectorSearchAccess().getOutputFieldsAssignment_11(), "rule__NonVectorSearch__OutputFieldsAssignment_11");
			builder.put(grammarAccess.getNonVectorSearchAccess().getOutputFieldsAssignment_12_1(), "rule__NonVectorSearch__OutputFieldsAssignment_12_1");
			builder.put(grammarAccess.getNonVectorSearchAccess().getNonVecFiltersAssignment_14_3(), "rule__NonVectorSearch__NonVecFiltersAssignment_14_3");
			builder.put(grammarAccess.getNonVectorSearchAccess().getNonVecFiltersAssignment_14_4_1(), "rule__NonVectorSearch__NonVecFiltersAssignment_14_4_1");
			builder.put(grammarAccess.getVectorDatabaseAccess().getNameAssignment_2(), "rule__VectorDatabase__NameAssignment_2");
			builder.put(grammarAccess.getVectorDatabaseAccess().getConnectionAssignment_5(), "rule__VectorDatabase__ConnectionAssignment_5");
			builder.put(grammarAccess.getVectorDatabaseAccess().getDescriptionAssignment_6_2(), "rule__VectorDatabase__DescriptionAssignment_6_2");
			builder.put(grammarAccess.getVectorDatabaseAccess().getClustersAssignment_7_3(), "rule__VectorDatabase__ClustersAssignment_7_3");
			builder.put(grammarAccess.getVectorDatabaseAccess().getClustersAssignment_7_4(), "rule__VectorDatabase__ClustersAssignment_7_4");
			builder.put(grammarAccess.getClusterAccess().getNameAssignment_1(), "rule__Cluster__NameAssignment_1");
			builder.put(grammarAccess.getClusterAccess().getVectordbAssignment_3(), "rule__Cluster__VectordbAssignment_3");
			builder.put(grammarAccess.getClusterAccess().getDescriptionAssignment_4_2(), "rule__Cluster__DescriptionAssignment_4_2");
			builder.put(grammarAccess.getClusterAccess().getNofCollectionsAssignment_5_4(), "rule__Cluster__NofCollectionsAssignment_5_4");
			builder.put(grammarAccess.getClusterAccess().getCollectionsAssignment_6_3(), "rule__Cluster__CollectionsAssignment_6_3");
			builder.put(grammarAccess.getClusterAccess().getCollectionsAssignment_6_4(), "rule__Cluster__CollectionsAssignment_6_4");
			builder.put(grammarAccess.getClusterAccess().getClusterLimitsAssignment_7_4(), "rule__Cluster__ClusterLimitsAssignment_7_4");
			builder.put(grammarAccess.getClusterAccess().getClusterLimitsAssignment_7_5(), "rule__Cluster__ClusterLimitsAssignment_7_5");
			builder.put(grammarAccess.getVectorCollectionAccess().getNameAssignment_2(), "rule__VectorCollection__NameAssignment_2");
			builder.put(grammarAccess.getVectorCollectionAccess().getClusterAssignment_4(), "rule__VectorCollection__ClusterAssignment_4");
			builder.put(grammarAccess.getVectorCollectionAccess().getDynamicAssignment_5(), "rule__VectorCollection__DynamicAssignment_5");
			builder.put(grammarAccess.getVectorCollectionAccess().getDescriptionAssignment_6_2(), "rule__VectorCollection__DescriptionAssignment_6_2");
			builder.put(grammarAccess.getVectorCollectionAccess().getCollectionLimitsAssignment_7_3(), "rule__VectorCollection__CollectionLimitsAssignment_7_3");
			builder.put(grammarAccess.getVectorCollectionAccess().getCollectionLimitsAssignment_7_4(), "rule__VectorCollection__CollectionLimitsAssignment_7_4");
			builder.put(grammarAccess.getVectorCollectionAccess().getFieldsAssignment_8_3(), "rule__VectorCollection__FieldsAssignment_8_3");
			builder.put(grammarAccess.getVectorCollectionAccess().getFieldsAssignment_8_4(), "rule__VectorCollection__FieldsAssignment_8_4");
			builder.put(grammarAccess.getVectorCollectionAccess().getPartitionsAssignment_9_3(), "rule__VectorCollection__PartitionsAssignment_9_3");
			builder.put(grammarAccess.getVectorCollectionAccess().getPartitionsAssignment_9_4(), "rule__VectorCollection__PartitionsAssignment_9_4");
			builder.put(grammarAccess.getVectorCollectionAccess().getPodtypeAssignment_10_2(), "rule__VectorCollection__PodtypeAssignment_10_2");
			builder.put(grammarAccess.getVectorCollectionAccess().getPodSizeAssignment_11_2(), "rule__VectorCollection__PodSizeAssignment_11_2");
			builder.put(grammarAccess.getVectorCollectionAccess().getPodEnvAssignment_12_2(), "rule__VectorCollection__PodEnvAssignment_12_2");
			builder.put(grammarAccess.getPartitionAccess().getNameAssignment_1(), "rule__Partition__NameAssignment_1");
			builder.put(grammarAccess.getPartitionAccess().getColPartOwnerAssignment_3(), "rule__Partition__ColPartOwnerAssignment_3");
			builder.put(grammarAccess.getPartitionAccess().getDescriptionAssignment_4_2(), "rule__Partition__DescriptionAssignment_4_2");
			builder.put(grammarAccess.getPartitionAccess().getPartitionKeyAssignment_8(), "rule__Partition__PartitionKeyAssignment_8");
			builder.put(grammarAccess.getEmbeddingModelAccess().getNameAssignment_1(), "rule__EmbeddingModel__NameAssignment_1");
			builder.put(grammarAccess.getEmbeddingModelAccess().getDescriptionAssignment_2_2(), "rule__EmbeddingModel__DescriptionAssignment_2_2");
			builder.put(grammarAccess.getFieldLimitAccess().getNameAssignment_2(), "rule__FieldLimit__NameAssignment_2");
			builder.put(grammarAccess.getFieldLimitAccess().getTypeAssignment_5(), "rule__FieldLimit__TypeAssignment_5");
			builder.put(grammarAccess.getFieldLimitAccess().getValueAssignment_8(), "rule__FieldLimit__ValueAssignment_8");
			builder.put(grammarAccess.getFieldLimitAccess().getDescriptionAssignment_9_2(), "rule__FieldLimit__DescriptionAssignment_9_2");
			builder.put(grammarAccess.getCollectionLimitAccess().getNameAssignment_2(), "rule__CollectionLimit__NameAssignment_2");
			builder.put(grammarAccess.getCollectionLimitAccess().getTypeAssignment_5(), "rule__CollectionLimit__TypeAssignment_5");
			builder.put(grammarAccess.getCollectionLimitAccess().getValueAssignment_8(), "rule__CollectionLimit__ValueAssignment_8");
			builder.put(grammarAccess.getCollectionLimitAccess().getDescriptionAssignment_9_2(), "rule__CollectionLimit__DescriptionAssignment_9_2");
			builder.put(grammarAccess.getClusterLimitAccess().getNameAssignment_2(), "rule__ClusterLimit__NameAssignment_2");
			builder.put(grammarAccess.getClusterLimitAccess().getTypeAssignment_5(), "rule__ClusterLimit__TypeAssignment_5");
			builder.put(grammarAccess.getClusterLimitAccess().getValueAssignment_8(), "rule__ClusterLimit__ValueAssignment_8");
			builder.put(grammarAccess.getClusterLimitAccess().getDescriptionAssignment_9_2(), "rule__ClusterLimit__DescriptionAssignment_9_2");
			builder.put(grammarAccess.getIndexLimitAccess().getNameAssignment_2(), "rule__IndexLimit__NameAssignment_2");
			builder.put(grammarAccess.getIndexLimitAccess().getTypeAssignment_5(), "rule__IndexLimit__TypeAssignment_5");
			builder.put(grammarAccess.getIndexLimitAccess().getValueAssignment_8(), "rule__IndexLimit__ValueAssignment_8");
			builder.put(grammarAccess.getIndexLimitAccess().getDescriptionAssignment_9_2(), "rule__IndexLimit__DescriptionAssignment_9_2");
			builder.put(grammarAccess.getVectorIndexAccess().getNameAssignment_2(), "rule__VectorIndex__NameAssignment_2");
			builder.put(grammarAccess.getVectorIndexAccess().getDescriptionAssignment_3_2(), "rule__VectorIndex__DescriptionAssignment_3_2");
			builder.put(grammarAccess.getVectorIndexAccess().getMetricAssignment_6(), "rule__VectorIndex__MetricAssignment_6");
			builder.put(grammarAccess.getVectorIndexAccess().getTypeAssignment_9(), "rule__VectorIndex__TypeAssignment_9");
			builder.put(grammarAccess.getVectorIndexAccess().getVIndexLimitsAssignment_10_3(), "rule__VectorIndex__VIndexLimitsAssignment_10_3");
			builder.put(grammarAccess.getVectorIndexAccess().getVIndexLimitsAssignment_10_4(), "rule__VectorIndex__VIndexLimitsAssignment_10_4");
			builder.put(grammarAccess.getNonVectorIndexAccess().getNameAssignment_2(), "rule__NonVectorIndex__NameAssignment_2");
			builder.put(grammarAccess.getNonVectorIndexAccess().getTypeAssignment_5(), "rule__NonVectorIndex__TypeAssignment_5");
			builder.put(grammarAccess.getNonVectorIndexAccess().getDescriptionAssignment_6_2(), "rule__NonVectorIndex__DescriptionAssignment_6_2");
			builder.put(grammarAccess.getConnectionAccess().getHostAssignment_3(), "rule__Connection__HostAssignment_3");
			builder.put(grammarAccess.getConnectionAccess().getPortAssignment_6(), "rule__Connection__PortAssignment_6");
			builder.put(grammarAccess.getConnectionAccess().getApiKeyAssignment_7_2(), "rule__Connection__ApiKeyAssignment_7_2");
			builder.put(grammarAccess.getConnectionAccess().getUsernameAssignment_8_2(), "rule__Connection__UsernameAssignment_8_2");
			builder.put(grammarAccess.getConnectionAccess().getPasswordAssignment_9_2(), "rule__Connection__PasswordAssignment_9_2");
			builder.put(grammarAccess.getConnectionAccess().getRegionAssignment_10_2(), "rule__Connection__RegionAssignment_10_2");
			builder.put(grammarAccess.getConnectionAccess().getUserRoleAssignment_11_2(), "rule__Connection__UserRoleAssignment_11_2");
			builder.put(grammarAccess.getConnectionAccess().getUserPrivillegeAssignment_12_2(), "rule__Connection__UserPrivillegeAssignment_12_2");
			builder.put(grammarAccess.getConnectionAccess().getCloudAssignment_13_2(), "rule__Connection__CloudAssignment_13_2");
			builder.put(grammarAccess.getConnectionAccess().getEnvironmentAssignment_14_2(), "rule__Connection__EnvironmentAssignment_14_2");
			builder.put(grammarAccess.getNonVectorFieldAccess().getNameAssignment_2(), "rule__NonVectorField__NameAssignment_2");
			builder.put(grammarAccess.getNonVectorFieldAccess().getColFieldOwnerAssignment_4(), "rule__NonVectorField__ColFieldOwnerAssignment_4");
			builder.put(grammarAccess.getNonVectorFieldAccess().getIsPrimaryAssignment_5(), "rule__NonVectorField__IsPrimaryAssignment_5");
			builder.put(grammarAccess.getNonVectorFieldAccess().getTypeAssignment_8(), "rule__NonVectorField__TypeAssignment_8");
			builder.put(grammarAccess.getNonVectorFieldAccess().getFieldLimitsAssignment_9_3(), "rule__NonVectorField__FieldLimitsAssignment_9_3");
			builder.put(grammarAccess.getNonVectorFieldAccess().getFieldLimitsAssignment_9_4(), "rule__NonVectorField__FieldLimitsAssignment_9_4");
			builder.put(grammarAccess.getNonVectorFieldAccess().getNonVectorIndexesAssignment_10_4(), "rule__NonVectorField__NonVectorIndexesAssignment_10_4");
			builder.put(grammarAccess.getNonVectorFieldAccess().getNonVectorIndexesAssignment_10_5(), "rule__NonVectorField__NonVectorIndexesAssignment_10_5");
			builder.put(grammarAccess.getVectorFieldAccess().getNameAssignment_2(), "rule__VectorField__NameAssignment_2");
			builder.put(grammarAccess.getVectorFieldAccess().getColFieldOwnerAssignment_4(), "rule__VectorField__ColFieldOwnerAssignment_4");
			builder.put(grammarAccess.getVectorFieldAccess().getIsPrimaryAssignment_5(), "rule__VectorField__IsPrimaryAssignment_5");
			builder.put(grammarAccess.getVectorFieldAccess().getTypeAssignment_8(), "rule__VectorField__TypeAssignment_8");
			builder.put(grammarAccess.getVectorFieldAccess().getEmbModelAssignment_9_4(), "rule__VectorField__EmbModelAssignment_9_4");
			builder.put(grammarAccess.getVectorFieldAccess().getFieldLimitsAssignment_10_3(), "rule__VectorField__FieldLimitsAssignment_10_3");
			builder.put(grammarAccess.getVectorFieldAccess().getFieldLimitsAssignment_10_4(), "rule__VectorField__FieldLimitsAssignment_10_4");
			builder.put(grammarAccess.getVectorFieldAccess().getVectorIndexesAssignment_11_4(), "rule__VectorField__VectorIndexesAssignment_11_4");
			builder.put(grammarAccess.getVectorFieldAccess().getVectorIndexesAssignment_11_5(), "rule__VectorField__VectorIndexesAssignment_11_5");
			builder.put(grammarAccess.getFilterAccess().getFilterFieldAssignment_0(), "rule__Filter__FilterFieldAssignment_0");
			builder.put(grammarAccess.getFilterAccess().getOperatorAssignment_1(), "rule__Filter__OperatorAssignment_1");
			builder.put(grammarAccess.getFilterAccess().getValueAssignment_2(), "rule__Filter__ValueAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DomijmasdslGrammarAccess grammarAccess;

	@Override
	protected InternalDomijmasdslParser createParser() {
		InternalDomijmasdslParser result = new InternalDomijmasdslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DomijmasdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomijmasdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

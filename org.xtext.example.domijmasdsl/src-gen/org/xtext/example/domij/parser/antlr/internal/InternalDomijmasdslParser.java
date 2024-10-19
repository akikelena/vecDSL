package org.xtext.example.domij.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.domij.services.DomijmasdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomijmasdslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SCRIPT'", "'FOR'", "'WITH'", "'METHODS'", "'['", "']'", "'CREATE'", "'ALTER'", "'WHEN'", "','", "';'", "'DROP'", "'INSERT'", "'INTO'", "'COLLECTION'", "'FROM'", "'path'", "'='", "'number'", "'of'", "'records'", "'UPDATE'", "'DELETE'", "'IN'", "'VECTOR'", "'SEARCH'", "'top'", "'K'", "'metric'", "'numUnitsProbe'", "'OUT'", "'FIELDS'", "'('", "')'", "'FILTERS'", "'QUERY'", "'ON'", "'DATABASE'", "'CONNECTION'", "'description'", "'CLUSTERS'", "'CLUSTER'", "'collections'", "'COLLECTIONS'", "'LIMITS'", "'dynamic'", "'PARTITIONS'", "'podType'", "'podSize'", "'podEnv'", "'PARTITION'", "'partition'", "'key'", "'FIELD'", "'LIMIT'", "'type'", "'value'", "'INDEX'", "'NONVECTOR'", "'host'", "'port'", "'apiKey'", "'username'", "'password'", "'region'", "'userRole'", "'userPrivillege'", "'cloud'", "'environment'", "'-'", "'primary'", "'INDEXES'", "'EMBEDDING'", "'MODEL'", "'PINECONE'", "'MILVUS'", "'CHROMA'", "'WEAVIATE'", "'QDRANT'", "'S1'", "'P1'", "'P2'", "'X1'", "'X2'", "'X4'", "'X8'", "'US_W1_GCP'", "'US_C1_GCP'", "'US_W4_GCP'", "'US_E4_GCP'", "'NA_NE1_GCP'", "'A_NE1_GCP'", "'A_SE1_GCP'", "'US_E1_GCP'", "'EU_W1_GCP'", "'EU_W4_GCP'", "'US_E1_AWS'", "'AZURE'", "'INT'", "'VARCHAR'", "'DOUBLE'", "'FLOAT'", "'DATE'", "'DATETIME'", "'JSON'", "'BINARY_VECTOR'", "'FLOAT_VECTOR'", "'VECTORDIM'", "'ARRAYLEN'", "'MAXSIZE'", "'NOFPARTITIONS'", "'NOFFIELDS'", "'NOFSHARDS'", "'NOFCOLLECTIONS'", "'NOFCLUSTERUNIT'", "'NOFFACTORSPQ'", "'MAXNODEDGRE'", "'EUCLIDEAN'", "'MANHATTAN'", "'DOT'", "'COSINE'", "'FLAT'", "'IVF_FLAT'", "'IVF_SQ8'", "'IVF_PQ'", "'HNSW'", "'SCANN'", "'STANDARD'", "'FULL_TEXT'", "'INTEGER'", "'PARAM_INT'", "'AND'", "'OR'", "'NOT'", "'LIKE'", "'!='", "'>'", "'>='", "'<'", "'<='"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__150=150;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalDomijmasdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomijmasdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomijmasdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomijmasdsl.g"; }



     	private DomijmasdslGrammarAccess grammarAccess;

        public InternalDomijmasdslParser(TokenStream input, DomijmasdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Script";
       	}

       	@Override
       	protected DomijmasdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleScript"
    // InternalDomijmasdsl.g:65:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalDomijmasdsl.g:65:47: (iv_ruleScript= ruleScript EOF )
            // InternalDomijmasdsl.g:66:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalDomijmasdsl.g:72:1: ruleScript returns [EObject current=null] : (otherlv_0= 'SCRIPT' otherlv_1= 'FOR' ( (lv_vendor_2_0= ruleEVendorName ) ) (otherlv_3= 'WITH' otherlv_4= 'METHODS' otherlv_5= '[' ( (lv_methods_6_0= ruleMethod ) ) ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= ']' )? ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Enumerator lv_vendor_2_0 = null;

        EObject lv_methods_6_0 = null;

        EObject lv_methods_7_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:78:2: ( (otherlv_0= 'SCRIPT' otherlv_1= 'FOR' ( (lv_vendor_2_0= ruleEVendorName ) ) (otherlv_3= 'WITH' otherlv_4= 'METHODS' otherlv_5= '[' ( (lv_methods_6_0= ruleMethod ) ) ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= ']' )? ) )
            // InternalDomijmasdsl.g:79:2: (otherlv_0= 'SCRIPT' otherlv_1= 'FOR' ( (lv_vendor_2_0= ruleEVendorName ) ) (otherlv_3= 'WITH' otherlv_4= 'METHODS' otherlv_5= '[' ( (lv_methods_6_0= ruleMethod ) ) ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= ']' )? )
            {
            // InternalDomijmasdsl.g:79:2: (otherlv_0= 'SCRIPT' otherlv_1= 'FOR' ( (lv_vendor_2_0= ruleEVendorName ) ) (otherlv_3= 'WITH' otherlv_4= 'METHODS' otherlv_5= '[' ( (lv_methods_6_0= ruleMethod ) ) ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= ']' )? )
            // InternalDomijmasdsl.g:80:3: otherlv_0= 'SCRIPT' otherlv_1= 'FOR' ( (lv_vendor_2_0= ruleEVendorName ) ) (otherlv_3= 'WITH' otherlv_4= 'METHODS' otherlv_5= '[' ( (lv_methods_6_0= ruleMethod ) ) ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getSCRIPTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScriptAccess().getFORKeyword_1());
            		
            // InternalDomijmasdsl.g:88:3: ( (lv_vendor_2_0= ruleEVendorName ) )
            // InternalDomijmasdsl.g:89:4: (lv_vendor_2_0= ruleEVendorName )
            {
            // InternalDomijmasdsl.g:89:4: (lv_vendor_2_0= ruleEVendorName )
            // InternalDomijmasdsl.g:90:5: lv_vendor_2_0= ruleEVendorName
            {

            					newCompositeNode(grammarAccess.getScriptAccess().getVendorEVendorNameEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_vendor_2_0=ruleEVendorName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScriptRule());
            					}
            					set(
            						current,
            						"vendor",
            						lv_vendor_2_0,
            						"org.xtext.example.domij.Domijmasdsl.EVendorName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:107:3: (otherlv_3= 'WITH' otherlv_4= 'METHODS' otherlv_5= '[' ( (lv_methods_6_0= ruleMethod ) ) ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= ']' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomijmasdsl.g:108:4: otherlv_3= 'WITH' otherlv_4= 'METHODS' otherlv_5= '[' ( (lv_methods_6_0= ruleMethod ) ) ( (lv_methods_7_0= ruleMethod ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getScriptAccess().getWITHKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getScriptAccess().getMETHODSKeyword_3_1());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getScriptAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalDomijmasdsl.g:120:4: ( (lv_methods_6_0= ruleMethod ) )
                    // InternalDomijmasdsl.g:121:5: (lv_methods_6_0= ruleMethod )
                    {
                    // InternalDomijmasdsl.g:121:5: (lv_methods_6_0= ruleMethod )
                    // InternalDomijmasdsl.g:122:6: lv_methods_6_0= ruleMethod
                    {

                    						newCompositeNode(grammarAccess.getScriptAccess().getMethodsMethodParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_methods_6_0=ruleMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScriptRule());
                    						}
                    						add(
                    							current,
                    							"methods",
                    							lv_methods_6_0,
                    							"org.xtext.example.domij.Domijmasdsl.Method");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:139:4: ( (lv_methods_7_0= ruleMethod ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=17 && LA1_0<=18)||(LA1_0>=22 && LA1_0<=23)||(LA1_0>=32 && LA1_0<=33)||LA1_0==35||LA1_0==46) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:140:5: (lv_methods_7_0= ruleMethod )
                    	    {
                    	    // InternalDomijmasdsl.g:140:5: (lv_methods_7_0= ruleMethod )
                    	    // InternalDomijmasdsl.g:141:6: lv_methods_7_0= ruleMethod
                    	    {

                    	    						newCompositeNode(grammarAccess.getScriptAccess().getMethodsMethodParserRuleCall_3_4_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_methods_7_0=ruleMethod();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScriptRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"methods",
                    	    							lv_methods_7_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.Method");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getScriptAccess().getRightSquareBracketKeyword_3_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleMethod"
    // InternalDomijmasdsl.g:167:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalDomijmasdsl.g:167:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalDomijmasdsl.g:168:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalDomijmasdsl.g:174:1: ruleMethod returns [EObject current=null] : (this_Create_0= ruleCreate | this_Alter_1= ruleAlter | this_Drop_2= ruleDrop | this_Insert_3= ruleInsert | this_Update_4= ruleUpdate | this_Delete_5= ruleDelete | this_VectorSearch_6= ruleVectorSearch | this_NonVectorSearch_7= ruleNonVectorSearch ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Alter_1 = null;

        EObject this_Drop_2 = null;

        EObject this_Insert_3 = null;

        EObject this_Update_4 = null;

        EObject this_Delete_5 = null;

        EObject this_VectorSearch_6 = null;

        EObject this_NonVectorSearch_7 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:180:2: ( (this_Create_0= ruleCreate | this_Alter_1= ruleAlter | this_Drop_2= ruleDrop | this_Insert_3= ruleInsert | this_Update_4= ruleUpdate | this_Delete_5= ruleDelete | this_VectorSearch_6= ruleVectorSearch | this_NonVectorSearch_7= ruleNonVectorSearch ) )
            // InternalDomijmasdsl.g:181:2: (this_Create_0= ruleCreate | this_Alter_1= ruleAlter | this_Drop_2= ruleDrop | this_Insert_3= ruleInsert | this_Update_4= ruleUpdate | this_Delete_5= ruleDelete | this_VectorSearch_6= ruleVectorSearch | this_NonVectorSearch_7= ruleNonVectorSearch )
            {
            // InternalDomijmasdsl.g:181:2: (this_Create_0= ruleCreate | this_Alter_1= ruleAlter | this_Drop_2= ruleDrop | this_Insert_3= ruleInsert | this_Update_4= ruleUpdate | this_Delete_5= ruleDelete | this_VectorSearch_6= ruleVectorSearch | this_NonVectorSearch_7= ruleNonVectorSearch )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 33:
                {
                alt3=6;
                }
                break;
            case 35:
                {
                alt3=7;
                }
                break;
            case 46:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDomijmasdsl.g:182:3: this_Create_0= ruleCreate
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_0=ruleCreate();

                    state._fsp--;


                    			current = this_Create_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:191:3: this_Alter_1= ruleAlter
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getAlterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alter_1=ruleAlter();

                    state._fsp--;


                    			current = this_Alter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:200:3: this_Drop_2= ruleDrop
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getDropParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drop_2=ruleDrop();

                    state._fsp--;


                    			current = this_Drop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:209:3: this_Insert_3= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getInsertParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_3=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDomijmasdsl.g:218:3: this_Update_4= ruleUpdate
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getUpdateParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Update_4=ruleUpdate();

                    state._fsp--;


                    			current = this_Update_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDomijmasdsl.g:227:3: this_Delete_5= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getDeleteParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_5=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDomijmasdsl.g:236:3: this_VectorSearch_6= ruleVectorSearch
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getVectorSearchParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_VectorSearch_6=ruleVectorSearch();

                    state._fsp--;


                    			current = this_VectorSearch_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDomijmasdsl.g:245:3: this_NonVectorSearch_7= ruleNonVectorSearch
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getNonVectorSearchParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonVectorSearch_7=ruleNonVectorSearch();

                    state._fsp--;


                    			current = this_NonVectorSearch_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleConcept"
    // InternalDomijmasdsl.g:257:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalDomijmasdsl.g:257:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalDomijmasdsl.g:258:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalDomijmasdsl.g:264:1: ruleConcept returns [EObject current=null] : (this_VectorDatabase_0= ruleVectorDatabase | this_Cluster_1= ruleCluster | this_VectorCollection_2= ruleVectorCollection | this_Partition_3= rulePartition | this_EmbeddingModel_4= ruleEmbeddingModel | this_FieldLimit_5= ruleFieldLimit | this_CollectionLimit_6= ruleCollectionLimit | this_ClusterLimit_7= ruleClusterLimit | this_IndexLimit_8= ruleIndexLimit | this_VectorIndex_9= ruleVectorIndex | this_NonVectorIndex_10= ruleNonVectorIndex | this_NonVectorField_11= ruleNonVectorField | this_VectorField_12= ruleVectorField ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_VectorDatabase_0 = null;

        EObject this_Cluster_1 = null;

        EObject this_VectorCollection_2 = null;

        EObject this_Partition_3 = null;

        EObject this_EmbeddingModel_4 = null;

        EObject this_FieldLimit_5 = null;

        EObject this_CollectionLimit_6 = null;

        EObject this_ClusterLimit_7 = null;

        EObject this_IndexLimit_8 = null;

        EObject this_VectorIndex_9 = null;

        EObject this_NonVectorIndex_10 = null;

        EObject this_NonVectorField_11 = null;

        EObject this_VectorField_12 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:270:2: ( (this_VectorDatabase_0= ruleVectorDatabase | this_Cluster_1= ruleCluster | this_VectorCollection_2= ruleVectorCollection | this_Partition_3= rulePartition | this_EmbeddingModel_4= ruleEmbeddingModel | this_FieldLimit_5= ruleFieldLimit | this_CollectionLimit_6= ruleCollectionLimit | this_ClusterLimit_7= ruleClusterLimit | this_IndexLimit_8= ruleIndexLimit | this_VectorIndex_9= ruleVectorIndex | this_NonVectorIndex_10= ruleNonVectorIndex | this_NonVectorField_11= ruleNonVectorField | this_VectorField_12= ruleVectorField ) )
            // InternalDomijmasdsl.g:271:2: (this_VectorDatabase_0= ruleVectorDatabase | this_Cluster_1= ruleCluster | this_VectorCollection_2= ruleVectorCollection | this_Partition_3= rulePartition | this_EmbeddingModel_4= ruleEmbeddingModel | this_FieldLimit_5= ruleFieldLimit | this_CollectionLimit_6= ruleCollectionLimit | this_ClusterLimit_7= ruleClusterLimit | this_IndexLimit_8= ruleIndexLimit | this_VectorIndex_9= ruleVectorIndex | this_NonVectorIndex_10= ruleNonVectorIndex | this_NonVectorField_11= ruleNonVectorField | this_VectorField_12= ruleVectorField )
            {
            // InternalDomijmasdsl.g:271:2: (this_VectorDatabase_0= ruleVectorDatabase | this_Cluster_1= ruleCluster | this_VectorCollection_2= ruleVectorCollection | this_Partition_3= rulePartition | this_EmbeddingModel_4= ruleEmbeddingModel | this_FieldLimit_5= ruleFieldLimit | this_CollectionLimit_6= ruleCollectionLimit | this_ClusterLimit_7= ruleClusterLimit | this_IndexLimit_8= ruleIndexLimit | this_VectorIndex_9= ruleVectorIndex | this_NonVectorIndex_10= ruleNonVectorIndex | this_NonVectorField_11= ruleNonVectorField | this_VectorField_12= ruleVectorField )
            int alt4=13;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalDomijmasdsl.g:272:3: this_VectorDatabase_0= ruleVectorDatabase
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getVectorDatabaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VectorDatabase_0=ruleVectorDatabase();

                    state._fsp--;


                    			current = this_VectorDatabase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:281:3: this_Cluster_1= ruleCluster
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getClusterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cluster_1=ruleCluster();

                    state._fsp--;


                    			current = this_Cluster_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:290:3: this_VectorCollection_2= ruleVectorCollection
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getVectorCollectionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VectorCollection_2=ruleVectorCollection();

                    state._fsp--;


                    			current = this_VectorCollection_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:299:3: this_Partition_3= rulePartition
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getPartitionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Partition_3=rulePartition();

                    state._fsp--;


                    			current = this_Partition_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDomijmasdsl.g:308:3: this_EmbeddingModel_4= ruleEmbeddingModel
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getEmbeddingModelParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmbeddingModel_4=ruleEmbeddingModel();

                    state._fsp--;


                    			current = this_EmbeddingModel_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDomijmasdsl.g:317:3: this_FieldLimit_5= ruleFieldLimit
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getFieldLimitParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_FieldLimit_5=ruleFieldLimit();

                    state._fsp--;


                    			current = this_FieldLimit_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDomijmasdsl.g:326:3: this_CollectionLimit_6= ruleCollectionLimit
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getCollectionLimitParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_CollectionLimit_6=ruleCollectionLimit();

                    state._fsp--;


                    			current = this_CollectionLimit_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDomijmasdsl.g:335:3: this_ClusterLimit_7= ruleClusterLimit
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getClusterLimitParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClusterLimit_7=ruleClusterLimit();

                    state._fsp--;


                    			current = this_ClusterLimit_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDomijmasdsl.g:344:3: this_IndexLimit_8= ruleIndexLimit
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getIndexLimitParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexLimit_8=ruleIndexLimit();

                    state._fsp--;


                    			current = this_IndexLimit_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDomijmasdsl.g:353:3: this_VectorIndex_9= ruleVectorIndex
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getVectorIndexParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_VectorIndex_9=ruleVectorIndex();

                    state._fsp--;


                    			current = this_VectorIndex_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDomijmasdsl.g:362:3: this_NonVectorIndex_10= ruleNonVectorIndex
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getNonVectorIndexParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonVectorIndex_10=ruleNonVectorIndex();

                    state._fsp--;


                    			current = this_NonVectorIndex_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDomijmasdsl.g:371:3: this_NonVectorField_11= ruleNonVectorField
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getNonVectorFieldParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonVectorField_11=ruleNonVectorField();

                    state._fsp--;


                    			current = this_NonVectorField_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDomijmasdsl.g:380:3: this_VectorField_12= ruleVectorField
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getVectorFieldParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_VectorField_12=ruleVectorField();

                    state._fsp--;


                    			current = this_VectorField_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleEString"
    // InternalDomijmasdsl.g:392:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDomijmasdsl.g:392:47: (iv_ruleEString= ruleEString EOF )
            // InternalDomijmasdsl.g:393:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDomijmasdsl.g:399:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:405:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDomijmasdsl.g:406:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDomijmasdsl.g:406:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomijmasdsl.g:407:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:415:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleCreate"
    // InternalDomijmasdsl.g:426:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalDomijmasdsl.g:426:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalDomijmasdsl.g:427:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalDomijmasdsl.g:433:1: ruleCreate returns [EObject current=null] : ( () otherlv_1= 'CREATE' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_ddlConcept_2_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:439:2: ( ( () otherlv_1= 'CREATE' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? ) )
            // InternalDomijmasdsl.g:440:2: ( () otherlv_1= 'CREATE' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? )
            {
            // InternalDomijmasdsl.g:440:2: ( () otherlv_1= 'CREATE' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? )
            // InternalDomijmasdsl.g:441:3: () otherlv_1= 'CREATE' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )?
            {
            // InternalDomijmasdsl.g:441:3: ()
            // InternalDomijmasdsl.g:442:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateAccess().getCreateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCREATEKeyword_1());
            		
            // InternalDomijmasdsl.g:452:3: ( (lv_ddlConcept_2_0= ruleConcept ) )
            // InternalDomijmasdsl.g:453:4: (lv_ddlConcept_2_0= ruleConcept )
            {
            // InternalDomijmasdsl.g:453:4: (lv_ddlConcept_2_0= ruleConcept )
            // InternalDomijmasdsl.g:454:5: lv_ddlConcept_2_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getDdlConceptConceptParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_ddlConcept_2_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					set(
            						current,
            						"ddlConcept",
            						lv_ddlConcept_2_0,
            						"org.xtext.example.domij.Domijmasdsl.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:471:3: (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomijmasdsl.g:472:4: otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDomijmasdsl.g:476:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:477:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:477:5: ( ruleEString )
                    // InternalDomijmasdsl.g:478:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCreateRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCreateAccess().getDdlNodeDdlMethodCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:492:4: ( ( ruleEString ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:493:5: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:493:5: ( ruleEString )
                    	    // InternalDomijmasdsl.g:494:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getCreateRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getCreateAccess().getDdlNodeDdlMethodCrossReference_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCreateAccess().getRightSquareBracketKeyword_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleAlter"
    // InternalDomijmasdsl.g:517:1: entryRuleAlter returns [EObject current=null] : iv_ruleAlter= ruleAlter EOF ;
    public final EObject entryRuleAlter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlter = null;


        try {
            // InternalDomijmasdsl.g:517:46: (iv_ruleAlter= ruleAlter EOF )
            // InternalDomijmasdsl.g:518:2: iv_ruleAlter= ruleAlter EOF
            {
             newCompositeNode(grammarAccess.getAlterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlter=ruleAlter();

            state._fsp--;

             current =iv_ruleAlter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlter"


    // $ANTLR start "ruleAlter"
    // InternalDomijmasdsl.g:524:1: ruleAlter returns [EObject current=null] : ( () otherlv_1= 'ALTER' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? otherlv_7= 'WHEN' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= ';' ) ;
    public final EObject ruleAlter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_ddlConcept_2_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:530:2: ( ( () otherlv_1= 'ALTER' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? otherlv_7= 'WHEN' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= ';' ) )
            // InternalDomijmasdsl.g:531:2: ( () otherlv_1= 'ALTER' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? otherlv_7= 'WHEN' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= ';' )
            {
            // InternalDomijmasdsl.g:531:2: ( () otherlv_1= 'ALTER' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? otherlv_7= 'WHEN' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= ';' )
            // InternalDomijmasdsl.g:532:3: () otherlv_1= 'ALTER' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )? otherlv_7= 'WHEN' otherlv_8= '[' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ']' otherlv_13= ';'
            {
            // InternalDomijmasdsl.g:532:3: ()
            // InternalDomijmasdsl.g:533:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlterAccess().getAlterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterAccess().getALTERKeyword_1());
            		
            // InternalDomijmasdsl.g:543:3: ( (lv_ddlConcept_2_0= ruleConcept ) )
            // InternalDomijmasdsl.g:544:4: (lv_ddlConcept_2_0= ruleConcept )
            {
            // InternalDomijmasdsl.g:544:4: (lv_ddlConcept_2_0= ruleConcept )
            // InternalDomijmasdsl.g:545:5: lv_ddlConcept_2_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getAlterAccess().getDdlConceptConceptParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_ddlConcept_2_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlterRule());
            					}
            					set(
            						current,
            						"ddlConcept",
            						lv_ddlConcept_2_0,
            						"org.xtext.example.domij.Domijmasdsl.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:562:3: (otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomijmasdsl.g:563:4: otherlv_3= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_6= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlterAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDomijmasdsl.g:567:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:568:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:568:5: ( ruleEString )
                    // InternalDomijmasdsl.g:569:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlterAccess().getDdlNodeDdlMethodCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:583:4: ( ( ruleEString ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:584:5: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:584:5: ( ruleEString )
                    	    // InternalDomijmasdsl.g:585:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getAlterRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getAlterAccess().getDdlNodeDdlMethodCrossReference_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlterAccess().getRightSquareBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAlterAccess().getWHENKeyword_4());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getAlterAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalDomijmasdsl.g:612:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:613:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:613:4: ( ruleEString )
            // InternalDomijmasdsl.g:614:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAlterAccess().getAlterCondFilterCrossReference_6_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:628:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDomijmasdsl.g:629:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,20,FOLLOW_12); 

            	    				newLeafNode(otherlv_10, grammarAccess.getAlterAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalDomijmasdsl.g:633:4: ( ( ruleEString ) )
            	    // InternalDomijmasdsl.g:634:5: ( ruleEString )
            	    {
            	    // InternalDomijmasdsl.g:634:5: ( ruleEString )
            	    // InternalDomijmasdsl.g:635:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAlterRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAlterAccess().getAlterCondFilterCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getAlterAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAlterAccess().getSemicolonKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlter"


    // $ANTLR start "entryRuleDrop"
    // InternalDomijmasdsl.g:662:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalDomijmasdsl.g:662:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalDomijmasdsl.g:663:2: iv_ruleDrop= ruleDrop EOF
            {
             newCompositeNode(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrop=ruleDrop();

            state._fsp--;

             current =iv_ruleDrop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalDomijmasdsl.g:669:1: ruleDrop returns [EObject current=null] : ( () otherlv_1= 'DROP' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= ';' )? (otherlv_4= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_7= ']' )? (otherlv_8= 'WHEN' )? (otherlv_9= '[' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ']' )? otherlv_14= ';' ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_ddlConcept_2_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:675:2: ( ( () otherlv_1= 'DROP' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= ';' )? (otherlv_4= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_7= ']' )? (otherlv_8= 'WHEN' )? (otherlv_9= '[' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ']' )? otherlv_14= ';' ) )
            // InternalDomijmasdsl.g:676:2: ( () otherlv_1= 'DROP' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= ';' )? (otherlv_4= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_7= ']' )? (otherlv_8= 'WHEN' )? (otherlv_9= '[' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ']' )? otherlv_14= ';' )
            {
            // InternalDomijmasdsl.g:676:2: ( () otherlv_1= 'DROP' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= ';' )? (otherlv_4= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_7= ']' )? (otherlv_8= 'WHEN' )? (otherlv_9= '[' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ']' )? otherlv_14= ';' )
            // InternalDomijmasdsl.g:677:3: () otherlv_1= 'DROP' ( (lv_ddlConcept_2_0= ruleConcept ) ) (otherlv_3= ';' )? (otherlv_4= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_7= ']' )? (otherlv_8= 'WHEN' )? (otherlv_9= '[' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ']' )? otherlv_14= ';'
            {
            // InternalDomijmasdsl.g:677:3: ()
            // InternalDomijmasdsl.g:678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDropAccess().getDropAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDropAccess().getDROPKeyword_1());
            		
            // InternalDomijmasdsl.g:688:3: ( (lv_ddlConcept_2_0= ruleConcept ) )
            // InternalDomijmasdsl.g:689:4: (lv_ddlConcept_2_0= ruleConcept )
            {
            // InternalDomijmasdsl.g:689:4: (lv_ddlConcept_2_0= ruleConcept )
            // InternalDomijmasdsl.g:690:5: lv_ddlConcept_2_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getDropAccess().getDdlConceptConceptParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_ddlConcept_2_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropRule());
            					}
            					set(
            						current,
            						"ddlConcept",
            						lv_ddlConcept_2_0,
            						"org.xtext.example.domij.Domijmasdsl.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:707:3: (otherlv_3= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==15||LA11_1==19||LA11_1==21) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalDomijmasdsl.g:708:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getDropAccess().getSemicolonKeyword_3());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:713:3: (otherlv_4= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_7= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_STRING) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>=RULE_STRING && LA13_3<=RULE_ID)||LA13_3==16) ) {
                        alt13=1;
                    }
                }
                else if ( (LA13_1==RULE_ID) ) {
                    int LA13_4 = input.LA(3);

                    if ( ((LA13_4>=RULE_STRING && LA13_4<=RULE_ID)||LA13_4==16) ) {
                        alt13=1;
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalDomijmasdsl.g:714:4: otherlv_4= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_7= ']'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDropAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalDomijmasdsl.g:718:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:719:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:719:5: ( ruleEString )
                    // InternalDomijmasdsl.g:720:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDropRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDropAccess().getDdlNodeDdlMethodCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:734:4: ( ( ruleEString ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:735:5: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:735:5: ( ruleEString )
                    	    // InternalDomijmasdsl.g:736:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getDropRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getDropAccess().getDdlNodeDdlMethodCrossReference_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getDropAccess().getRightSquareBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:755:3: (otherlv_8= 'WHEN' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomijmasdsl.g:756:4: otherlv_8= 'WHEN'
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getDropAccess().getWHENKeyword_5());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:761:3: (otherlv_9= '[' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomijmasdsl.g:762:4: otherlv_9= '[' ( ( ruleEString ) ) (otherlv_11= ',' ( ( ruleEString ) ) )* otherlv_13= ']'
                    {
                    otherlv_9=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getDropAccess().getLeftSquareBracketKeyword_6_0());
                    			
                    // InternalDomijmasdsl.g:766:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:767:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:767:5: ( ruleEString )
                    // InternalDomijmasdsl.g:768:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDropRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDropAccess().getDropCondFilterCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:782:4: (otherlv_11= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:783:5: otherlv_11= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,20,FOLLOW_12); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDropAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalDomijmasdsl.g:787:5: ( ( ruleEString ) )
                    	    // InternalDomijmasdsl.g:788:6: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:788:6: ( ruleEString )
                    	    // InternalDomijmasdsl.g:789:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDropRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDropAccess().getDropCondFilterCrossReference_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getDropAccess().getRightSquareBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDropAccess().getSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleInsert"
    // InternalDomijmasdsl.g:817:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalDomijmasdsl.g:817:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalDomijmasdsl.g:818:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalDomijmasdsl.g:824:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'INSERT' otherlv_1= 'INTO' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'FROM' otherlv_5= 'path' otherlv_6= '=' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'number' otherlv_9= 'of' otherlv_10= 'records' otherlv_11= '=' ( (lv_nofRecords_12_0= ruleEInt ) ) )? otherlv_13= ';' ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_dmlCollection_3_0 = null;

        AntlrDatatypeRuleToken lv_path_7_0 = null;

        AntlrDatatypeRuleToken lv_nofRecords_12_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:830:2: ( (otherlv_0= 'INSERT' otherlv_1= 'INTO' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'FROM' otherlv_5= 'path' otherlv_6= '=' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'number' otherlv_9= 'of' otherlv_10= 'records' otherlv_11= '=' ( (lv_nofRecords_12_0= ruleEInt ) ) )? otherlv_13= ';' ) )
            // InternalDomijmasdsl.g:831:2: (otherlv_0= 'INSERT' otherlv_1= 'INTO' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'FROM' otherlv_5= 'path' otherlv_6= '=' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'number' otherlv_9= 'of' otherlv_10= 'records' otherlv_11= '=' ( (lv_nofRecords_12_0= ruleEInt ) ) )? otherlv_13= ';' )
            {
            // InternalDomijmasdsl.g:831:2: (otherlv_0= 'INSERT' otherlv_1= 'INTO' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'FROM' otherlv_5= 'path' otherlv_6= '=' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'number' otherlv_9= 'of' otherlv_10= 'records' otherlv_11= '=' ( (lv_nofRecords_12_0= ruleEInt ) ) )? otherlv_13= ';' )
            // InternalDomijmasdsl.g:832:3: otherlv_0= 'INSERT' otherlv_1= 'INTO' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'FROM' otherlv_5= 'path' otherlv_6= '=' ( (lv_path_7_0= ruleEString ) ) (otherlv_8= 'number' otherlv_9= 'of' otherlv_10= 'records' otherlv_11= '=' ( (lv_nofRecords_12_0= ruleEInt ) ) )? otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getINSERTKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getINTOKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertAccess().getCOLLECTIONKeyword_2());
            		
            // InternalDomijmasdsl.g:844:3: ( (lv_dmlCollection_3_0= ruleVectorCollection ) )
            // InternalDomijmasdsl.g:845:4: (lv_dmlCollection_3_0= ruleVectorCollection )
            {
            // InternalDomijmasdsl.g:845:4: (lv_dmlCollection_3_0= ruleVectorCollection )
            // InternalDomijmasdsl.g:846:5: lv_dmlCollection_3_0= ruleVectorCollection
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getDmlCollectionVectorCollectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_dmlCollection_3_0=ruleVectorCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"dmlCollection",
            						lv_dmlCollection_3_0,
            						"org.xtext.example.domij.Domijmasdsl.VectorCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertAccess().getFROMKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertAccess().getPathKeyword_5());
            		
            otherlv_6=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertAccess().getEqualsSignKeyword_6());
            		
            // InternalDomijmasdsl.g:875:3: ( (lv_path_7_0= ruleEString ) )
            // InternalDomijmasdsl.g:876:4: (lv_path_7_0= ruleEString )
            {
            // InternalDomijmasdsl.g:876:4: (lv_path_7_0= ruleEString )
            // InternalDomijmasdsl.g:877:5: lv_path_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getPathEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
            lv_path_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_7_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:894:3: (otherlv_8= 'number' otherlv_9= 'of' otherlv_10= 'records' otherlv_11= '=' ( (lv_nofRecords_12_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDomijmasdsl.g:895:4: otherlv_8= 'number' otherlv_9= 'of' otherlv_10= 'records' otherlv_11= '=' ( (lv_nofRecords_12_0= ruleEInt ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getInsertAccess().getNumberKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getInsertAccess().getOfKeyword_8_1());
                    			
                    otherlv_10=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getInsertAccess().getRecordsKeyword_8_2());
                    			
                    otherlv_11=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_11, grammarAccess.getInsertAccess().getEqualsSignKeyword_8_3());
                    			
                    // InternalDomijmasdsl.g:911:4: ( (lv_nofRecords_12_0= ruleEInt ) )
                    // InternalDomijmasdsl.g:912:5: (lv_nofRecords_12_0= ruleEInt )
                    {
                    // InternalDomijmasdsl.g:912:5: (lv_nofRecords_12_0= ruleEInt )
                    // InternalDomijmasdsl.g:913:6: lv_nofRecords_12_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getInsertAccess().getNofRecordsEIntParserRuleCall_8_4_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_nofRecords_12_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInsertRule());
                    						}
                    						set(
                    							current,
                    							"nofRecords",
                    							lv_nofRecords_12_0,
                    							"org.xtext.example.domij.Domijmasdsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getInsertAccess().getSemicolonKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleUpdate"
    // InternalDomijmasdsl.g:939:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalDomijmasdsl.g:939:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalDomijmasdsl.g:940:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalDomijmasdsl.g:946:1: ruleUpdate returns [EObject current=null] : (otherlv_0= 'UPDATE' otherlv_1= 'COLLECTION' ( (lv_dmlCollection_2_0= ruleVectorCollection ) ) otherlv_3= 'FROM' otherlv_4= 'path' otherlv_5= '=' ( (lv_path_6_0= ruleEString ) ) (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'records' otherlv_10= '=' ( (lv_nofRecords_11_0= ruleEInt ) ) )? otherlv_12= 'WHEN' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' otherlv_18= ';' ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_dmlCollection_2_0 = null;

        AntlrDatatypeRuleToken lv_path_6_0 = null;

        AntlrDatatypeRuleToken lv_nofRecords_11_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:952:2: ( (otherlv_0= 'UPDATE' otherlv_1= 'COLLECTION' ( (lv_dmlCollection_2_0= ruleVectorCollection ) ) otherlv_3= 'FROM' otherlv_4= 'path' otherlv_5= '=' ( (lv_path_6_0= ruleEString ) ) (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'records' otherlv_10= '=' ( (lv_nofRecords_11_0= ruleEInt ) ) )? otherlv_12= 'WHEN' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' otherlv_18= ';' ) )
            // InternalDomijmasdsl.g:953:2: (otherlv_0= 'UPDATE' otherlv_1= 'COLLECTION' ( (lv_dmlCollection_2_0= ruleVectorCollection ) ) otherlv_3= 'FROM' otherlv_4= 'path' otherlv_5= '=' ( (lv_path_6_0= ruleEString ) ) (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'records' otherlv_10= '=' ( (lv_nofRecords_11_0= ruleEInt ) ) )? otherlv_12= 'WHEN' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' otherlv_18= ';' )
            {
            // InternalDomijmasdsl.g:953:2: (otherlv_0= 'UPDATE' otherlv_1= 'COLLECTION' ( (lv_dmlCollection_2_0= ruleVectorCollection ) ) otherlv_3= 'FROM' otherlv_4= 'path' otherlv_5= '=' ( (lv_path_6_0= ruleEString ) ) (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'records' otherlv_10= '=' ( (lv_nofRecords_11_0= ruleEInt ) ) )? otherlv_12= 'WHEN' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' otherlv_18= ';' )
            // InternalDomijmasdsl.g:954:3: otherlv_0= 'UPDATE' otherlv_1= 'COLLECTION' ( (lv_dmlCollection_2_0= ruleVectorCollection ) ) otherlv_3= 'FROM' otherlv_4= 'path' otherlv_5= '=' ( (lv_path_6_0= ruleEString ) ) (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'records' otherlv_10= '=' ( (lv_nofRecords_11_0= ruleEInt ) ) )? otherlv_12= 'WHEN' otherlv_13= '[' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ']' otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getUPDATEKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getCOLLECTIONKeyword_1());
            		
            // InternalDomijmasdsl.g:962:3: ( (lv_dmlCollection_2_0= ruleVectorCollection ) )
            // InternalDomijmasdsl.g:963:4: (lv_dmlCollection_2_0= ruleVectorCollection )
            {
            // InternalDomijmasdsl.g:963:4: (lv_dmlCollection_2_0= ruleVectorCollection )
            // InternalDomijmasdsl.g:964:5: lv_dmlCollection_2_0= ruleVectorCollection
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getDmlCollectionVectorCollectionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_dmlCollection_2_0=ruleVectorCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"dmlCollection",
            						lv_dmlCollection_2_0,
            						"org.xtext.example.domij.Domijmasdsl.VectorCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getFROMKeyword_3());
            		
            otherlv_4=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getPathKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateAccess().getEqualsSignKeyword_5());
            		
            // InternalDomijmasdsl.g:993:3: ( (lv_path_6_0= ruleEString ) )
            // InternalDomijmasdsl.g:994:4: (lv_path_6_0= ruleEString )
            {
            // InternalDomijmasdsl.g:994:4: (lv_path_6_0= ruleEString )
            // InternalDomijmasdsl.g:995:5: lv_path_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getPathEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_30);
            lv_path_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_6_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1012:3: (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'records' otherlv_10= '=' ( (lv_nofRecords_11_0= ruleEInt ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDomijmasdsl.g:1013:4: otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'records' otherlv_10= '=' ( (lv_nofRecords_11_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getUpdateAccess().getNumberKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getUpdateAccess().getOfKeyword_7_1());
                    			
                    otherlv_9=(Token)match(input,31,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getUpdateAccess().getRecordsKeyword_7_2());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getUpdateAccess().getEqualsSignKeyword_7_3());
                    			
                    // InternalDomijmasdsl.g:1029:4: ( (lv_nofRecords_11_0= ruleEInt ) )
                    // InternalDomijmasdsl.g:1030:5: (lv_nofRecords_11_0= ruleEInt )
                    {
                    // InternalDomijmasdsl.g:1030:5: (lv_nofRecords_11_0= ruleEInt )
                    // InternalDomijmasdsl.g:1031:6: lv_nofRecords_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getUpdateAccess().getNofRecordsEIntParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_nofRecords_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateRule());
                    						}
                    						set(
                    							current,
                    							"nofRecords",
                    							lv_nofRecords_11_0,
                    							"org.xtext.example.domij.Domijmasdsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getUpdateAccess().getWHENKeyword_8());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getUpdateAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalDomijmasdsl.g:1057:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:1058:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:1058:4: ( ruleEString )
            // InternalDomijmasdsl.g:1059:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getUpdateAccess().getUpdateCondFilterCrossReference_10_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1073:3: (otherlv_15= ',' ( ( ruleEString ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDomijmasdsl.g:1074:4: otherlv_15= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_12); 

            	    				newLeafNode(otherlv_15, grammarAccess.getUpdateAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalDomijmasdsl.g:1078:4: ( ( ruleEString ) )
            	    // InternalDomijmasdsl.g:1079:5: ( ruleEString )
            	    {
            	    // InternalDomijmasdsl.g:1079:5: ( ruleEString )
            	    // InternalDomijmasdsl.g:1080:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUpdateRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getUpdateCondFilterCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_17=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_17, grammarAccess.getUpdateAccess().getRightSquareBracketKeyword_12());
            		
            otherlv_18=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getUpdateAccess().getSemicolonKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleDelete"
    // InternalDomijmasdsl.g:1107:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalDomijmasdsl.g:1107:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalDomijmasdsl.g:1108:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalDomijmasdsl.g:1114:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= 'IN' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) (otherlv_4= 'WHEN' otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' )? otherlv_10= ';' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_dmlCollection_3_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:1120:2: ( (otherlv_0= 'DELETE' otherlv_1= 'IN' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) (otherlv_4= 'WHEN' otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' )? otherlv_10= ';' ) )
            // InternalDomijmasdsl.g:1121:2: (otherlv_0= 'DELETE' otherlv_1= 'IN' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) (otherlv_4= 'WHEN' otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' )? otherlv_10= ';' )
            {
            // InternalDomijmasdsl.g:1121:2: (otherlv_0= 'DELETE' otherlv_1= 'IN' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) (otherlv_4= 'WHEN' otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' )? otherlv_10= ';' )
            // InternalDomijmasdsl.g:1122:3: otherlv_0= 'DELETE' otherlv_1= 'IN' otherlv_2= 'COLLECTION' ( (lv_dmlCollection_3_0= ruleVectorCollection ) ) (otherlv_4= 'WHEN' otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDELETEKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getINKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getCOLLECTIONKeyword_2());
            		
            // InternalDomijmasdsl.g:1134:3: ( (lv_dmlCollection_3_0= ruleVectorCollection ) )
            // InternalDomijmasdsl.g:1135:4: (lv_dmlCollection_3_0= ruleVectorCollection )
            {
            // InternalDomijmasdsl.g:1135:4: (lv_dmlCollection_3_0= ruleVectorCollection )
            // InternalDomijmasdsl.g:1136:5: lv_dmlCollection_3_0= ruleVectorCollection
            {

            					newCompositeNode(grammarAccess.getDeleteAccess().getDmlCollectionVectorCollectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_dmlCollection_3_0=ruleVectorCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteRule());
            					}
            					set(
            						current,
            						"dmlCollection",
            						lv_dmlCollection_3_0,
            						"org.xtext.example.domij.Domijmasdsl.VectorCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1153:3: (otherlv_4= 'WHEN' otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDomijmasdsl.g:1154:4: otherlv_4= 'WHEN' otherlv_5= '[' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeleteAccess().getWHENKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeleteAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalDomijmasdsl.g:1162:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:1163:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:1163:5: ( ruleEString )
                    // InternalDomijmasdsl.g:1164:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeleteRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDeleteAccess().getDeleteCondFilterCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:1178:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==20) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:1179:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDeleteAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDomijmasdsl.g:1183:5: ( ( ruleEString ) )
                    	    // InternalDomijmasdsl.g:1184:6: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:1184:6: ( ruleEString )
                    	    // InternalDomijmasdsl.g:1185:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDeleteRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDeleteAccess().getDeleteCondFilterCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeleteAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDeleteAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleVectorSearch"
    // InternalDomijmasdsl.g:1213:1: entryRuleVectorSearch returns [EObject current=null] : iv_ruleVectorSearch= ruleVectorSearch EOF ;
    public final EObject entryRuleVectorSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorSearch = null;


        try {
            // InternalDomijmasdsl.g:1213:53: (iv_ruleVectorSearch= ruleVectorSearch EOF )
            // InternalDomijmasdsl.g:1214:2: iv_ruleVectorSearch= ruleVectorSearch EOF
            {
             newCompositeNode(grammarAccess.getVectorSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVectorSearch=ruleVectorSearch();

            state._fsp--;

             current =iv_ruleVectorSearch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorSearch"


    // $ANTLR start "ruleVectorSearch"
    // InternalDomijmasdsl.g:1220:1: ruleVectorSearch returns [EObject current=null] : (otherlv_0= 'VECTOR' otherlv_1= 'SEARCH' otherlv_2= 'IN' otherlv_3= 'COLLECTION' ( (lv_queryCollection_4_0= ruleVectorCollection ) ) otherlv_5= 'top' otherlv_6= 'K' otherlv_7= '=' ( (lv_topK_8_0= ruleEInt ) ) otherlv_9= 'metric' otherlv_10= '=' ( (lv_metric_11_0= ruleEMetricType ) ) (otherlv_12= 'numUnitsProbe' otherlv_13= '=' ( (lv_numUnitsProbe_14_0= ruleEInt ) ) )? otherlv_15= ';' otherlv_16= 'OUT' otherlv_17= 'FIELDS' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' (otherlv_23= 'WITH' otherlv_24= 'FILTERS' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' ) ;
    public final EObject ruleVectorSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        EObject lv_queryCollection_4_0 = null;

        AntlrDatatypeRuleToken lv_topK_8_0 = null;

        Enumerator lv_metric_11_0 = null;

        AntlrDatatypeRuleToken lv_numUnitsProbe_14_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:1226:2: ( (otherlv_0= 'VECTOR' otherlv_1= 'SEARCH' otherlv_2= 'IN' otherlv_3= 'COLLECTION' ( (lv_queryCollection_4_0= ruleVectorCollection ) ) otherlv_5= 'top' otherlv_6= 'K' otherlv_7= '=' ( (lv_topK_8_0= ruleEInt ) ) otherlv_9= 'metric' otherlv_10= '=' ( (lv_metric_11_0= ruleEMetricType ) ) (otherlv_12= 'numUnitsProbe' otherlv_13= '=' ( (lv_numUnitsProbe_14_0= ruleEInt ) ) )? otherlv_15= ';' otherlv_16= 'OUT' otherlv_17= 'FIELDS' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' (otherlv_23= 'WITH' otherlv_24= 'FILTERS' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' ) )
            // InternalDomijmasdsl.g:1227:2: (otherlv_0= 'VECTOR' otherlv_1= 'SEARCH' otherlv_2= 'IN' otherlv_3= 'COLLECTION' ( (lv_queryCollection_4_0= ruleVectorCollection ) ) otherlv_5= 'top' otherlv_6= 'K' otherlv_7= '=' ( (lv_topK_8_0= ruleEInt ) ) otherlv_9= 'metric' otherlv_10= '=' ( (lv_metric_11_0= ruleEMetricType ) ) (otherlv_12= 'numUnitsProbe' otherlv_13= '=' ( (lv_numUnitsProbe_14_0= ruleEInt ) ) )? otherlv_15= ';' otherlv_16= 'OUT' otherlv_17= 'FIELDS' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' (otherlv_23= 'WITH' otherlv_24= 'FILTERS' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' )
            {
            // InternalDomijmasdsl.g:1227:2: (otherlv_0= 'VECTOR' otherlv_1= 'SEARCH' otherlv_2= 'IN' otherlv_3= 'COLLECTION' ( (lv_queryCollection_4_0= ruleVectorCollection ) ) otherlv_5= 'top' otherlv_6= 'K' otherlv_7= '=' ( (lv_topK_8_0= ruleEInt ) ) otherlv_9= 'metric' otherlv_10= '=' ( (lv_metric_11_0= ruleEMetricType ) ) (otherlv_12= 'numUnitsProbe' otherlv_13= '=' ( (lv_numUnitsProbe_14_0= ruleEInt ) ) )? otherlv_15= ';' otherlv_16= 'OUT' otherlv_17= 'FIELDS' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' (otherlv_23= 'WITH' otherlv_24= 'FILTERS' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' )
            // InternalDomijmasdsl.g:1228:3: otherlv_0= 'VECTOR' otherlv_1= 'SEARCH' otherlv_2= 'IN' otherlv_3= 'COLLECTION' ( (lv_queryCollection_4_0= ruleVectorCollection ) ) otherlv_5= 'top' otherlv_6= 'K' otherlv_7= '=' ( (lv_topK_8_0= ruleEInt ) ) otherlv_9= 'metric' otherlv_10= '=' ( (lv_metric_11_0= ruleEMetricType ) ) (otherlv_12= 'numUnitsProbe' otherlv_13= '=' ( (lv_numUnitsProbe_14_0= ruleEInt ) ) )? otherlv_15= ';' otherlv_16= 'OUT' otherlv_17= 'FIELDS' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' (otherlv_23= 'WITH' otherlv_24= 'FILTERS' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorSearchAccess().getVECTORKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getVectorSearchAccess().getSEARCHKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVectorSearchAccess().getINKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getVectorSearchAccess().getCOLLECTIONKeyword_3());
            		
            // InternalDomijmasdsl.g:1244:3: ( (lv_queryCollection_4_0= ruleVectorCollection ) )
            // InternalDomijmasdsl.g:1245:4: (lv_queryCollection_4_0= ruleVectorCollection )
            {
            // InternalDomijmasdsl.g:1245:4: (lv_queryCollection_4_0= ruleVectorCollection )
            // InternalDomijmasdsl.g:1246:5: lv_queryCollection_4_0= ruleVectorCollection
            {

            					newCompositeNode(grammarAccess.getVectorSearchAccess().getQueryCollectionVectorCollectionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_34);
            lv_queryCollection_4_0=ruleVectorCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorSearchRule());
            					}
            					set(
            						current,
            						"queryCollection",
            						lv_queryCollection_4_0,
            						"org.xtext.example.domij.Domijmasdsl.VectorCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getVectorSearchAccess().getTopKeyword_5());
            		
            otherlv_6=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getVectorSearchAccess().getKKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getVectorSearchAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:1275:3: ( (lv_topK_8_0= ruleEInt ) )
            // InternalDomijmasdsl.g:1276:4: (lv_topK_8_0= ruleEInt )
            {
            // InternalDomijmasdsl.g:1276:4: (lv_topK_8_0= ruleEInt )
            // InternalDomijmasdsl.g:1277:5: lv_topK_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVectorSearchAccess().getTopKEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_36);
            lv_topK_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorSearchRule());
            					}
            					set(
            						current,
            						"topK",
            						lv_topK_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_9, grammarAccess.getVectorSearchAccess().getMetricKeyword_9());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_37); 

            			newLeafNode(otherlv_10, grammarAccess.getVectorSearchAccess().getEqualsSignKeyword_10());
            		
            // InternalDomijmasdsl.g:1302:3: ( (lv_metric_11_0= ruleEMetricType ) )
            // InternalDomijmasdsl.g:1303:4: (lv_metric_11_0= ruleEMetricType )
            {
            // InternalDomijmasdsl.g:1303:4: (lv_metric_11_0= ruleEMetricType )
            // InternalDomijmasdsl.g:1304:5: lv_metric_11_0= ruleEMetricType
            {

            					newCompositeNode(grammarAccess.getVectorSearchAccess().getMetricEMetricTypeEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_38);
            lv_metric_11_0=ruleEMetricType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorSearchRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_11_0,
            						"org.xtext.example.domij.Domijmasdsl.EMetricType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1321:3: (otherlv_12= 'numUnitsProbe' otherlv_13= '=' ( (lv_numUnitsProbe_14_0= ruleEInt ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDomijmasdsl.g:1322:4: otherlv_12= 'numUnitsProbe' otherlv_13= '=' ( (lv_numUnitsProbe_14_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getVectorSearchAccess().getNumUnitsProbeKeyword_12_0());
                    			
                    otherlv_13=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_13, grammarAccess.getVectorSearchAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalDomijmasdsl.g:1330:4: ( (lv_numUnitsProbe_14_0= ruleEInt ) )
                    // InternalDomijmasdsl.g:1331:5: (lv_numUnitsProbe_14_0= ruleEInt )
                    {
                    // InternalDomijmasdsl.g:1331:5: (lv_numUnitsProbe_14_0= ruleEInt )
                    // InternalDomijmasdsl.g:1332:6: lv_numUnitsProbe_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getVectorSearchAccess().getNumUnitsProbeEIntParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_numUnitsProbe_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorSearchRule());
                    						}
                    						set(
                    							current,
                    							"numUnitsProbe",
                    							lv_numUnitsProbe_14_0,
                    							"org.xtext.example.domij.Domijmasdsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,21,FOLLOW_39); 

            			newLeafNode(otherlv_15, grammarAccess.getVectorSearchAccess().getSemicolonKeyword_13());
            		
            otherlv_16=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_16, grammarAccess.getVectorSearchAccess().getOUTKeyword_14());
            		
            otherlv_17=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_17, grammarAccess.getVectorSearchAccess().getFIELDSKeyword_15());
            		
            otherlv_18=(Token)match(input,43,FOLLOW_12); 

            			newLeafNode(otherlv_18, grammarAccess.getVectorSearchAccess().getLeftParenthesisKeyword_16());
            		
            // InternalDomijmasdsl.g:1366:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:1367:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:1367:4: ( ruleEString )
            // InternalDomijmasdsl.g:1368:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVectorSearchRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVectorSearchAccess().getOutputFieldsFieldCrossReference_17_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1382:3: (otherlv_20= ',' ( ( ruleEString ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDomijmasdsl.g:1383:4: otherlv_20= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,20,FOLLOW_12); 

            	    				newLeafNode(otherlv_20, grammarAccess.getVectorSearchAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalDomijmasdsl.g:1387:4: ( ( ruleEString ) )
            	    // InternalDomijmasdsl.g:1388:5: ( ruleEString )
            	    {
            	    // InternalDomijmasdsl.g:1388:5: ( ruleEString )
            	    // InternalDomijmasdsl.g:1389:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVectorSearchRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getVectorSearchAccess().getOutputFieldsFieldCrossReference_18_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_22=(Token)match(input,44,FOLLOW_43); 

            			newLeafNode(otherlv_22, grammarAccess.getVectorSearchAccess().getRightParenthesisKeyword_19());
            		
            // InternalDomijmasdsl.g:1408:3: (otherlv_23= 'WITH' otherlv_24= 'FILTERS' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDomijmasdsl.g:1409:4: otherlv_23= 'WITH' otherlv_24= 'FILTERS' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')'
                    {
                    otherlv_23=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_23, grammarAccess.getVectorSearchAccess().getWITHKeyword_20_0());
                    			
                    otherlv_24=(Token)match(input,45,FOLLOW_41); 

                    				newLeafNode(otherlv_24, grammarAccess.getVectorSearchAccess().getFILTERSKeyword_20_1());
                    			
                    otherlv_25=(Token)match(input,43,FOLLOW_12); 

                    				newLeafNode(otherlv_25, grammarAccess.getVectorSearchAccess().getLeftParenthesisKeyword_20_2());
                    			
                    // InternalDomijmasdsl.g:1421:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:1422:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:1422:5: ( ruleEString )
                    // InternalDomijmasdsl.g:1423:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVectorSearchRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVectorSearchAccess().getVecSearchFiltersFilterCrossReference_20_3_0());
                    					
                    pushFollow(FOLLOW_42);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:1437:4: (otherlv_27= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==20) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:1438:5: otherlv_27= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_27=(Token)match(input,20,FOLLOW_12); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getVectorSearchAccess().getCommaKeyword_20_4_0());
                    	    				
                    	    // InternalDomijmasdsl.g:1442:5: ( ( ruleEString ) )
                    	    // InternalDomijmasdsl.g:1443:6: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:1443:6: ( ruleEString )
                    	    // InternalDomijmasdsl.g:1444:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVectorSearchRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getVectorSearchAccess().getVecSearchFiltersFilterCrossReference_20_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_42);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,44,FOLLOW_17); 

                    				newLeafNode(otherlv_29, grammarAccess.getVectorSearchAccess().getRightParenthesisKeyword_20_5());
                    			

                    }
                    break;

            }

            otherlv_30=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_30, grammarAccess.getVectorSearchAccess().getSemicolonKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorSearch"


    // $ANTLR start "entryRuleNonVectorSearch"
    // InternalDomijmasdsl.g:1472:1: entryRuleNonVectorSearch returns [EObject current=null] : iv_ruleNonVectorSearch= ruleNonVectorSearch EOF ;
    public final EObject entryRuleNonVectorSearch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonVectorSearch = null;


        try {
            // InternalDomijmasdsl.g:1472:56: (iv_ruleNonVectorSearch= ruleNonVectorSearch EOF )
            // InternalDomijmasdsl.g:1473:2: iv_ruleNonVectorSearch= ruleNonVectorSearch EOF
            {
             newCompositeNode(grammarAccess.getNonVectorSearchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonVectorSearch=ruleNonVectorSearch();

            state._fsp--;

             current =iv_ruleNonVectorSearch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonVectorSearch"


    // $ANTLR start "ruleNonVectorSearch"
    // InternalDomijmasdsl.g:1479:1: ruleNonVectorSearch returns [EObject current=null] : (otherlv_0= 'QUERY' otherlv_1= 'ON' otherlv_2= 'COLLECTION' ( (lv_queryCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'top' otherlv_5= 'K' otherlv_6= '=' ( (lv_topK_7_0= ruleEInt ) ) otherlv_8= 'OUT' otherlv_9= 'FIELDS' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'WITH' otherlv_16= 'FILTERS' otherlv_17= '[' ( (lv_nonVecFilters_18_0= ruleFilter ) ) (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )* otherlv_21= ']' )? otherlv_22= ';' ) ;
    public final EObject ruleNonVectorSearch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_queryCollection_3_0 = null;

        AntlrDatatypeRuleToken lv_topK_7_0 = null;

        EObject lv_nonVecFilters_18_0 = null;

        EObject lv_nonVecFilters_20_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:1485:2: ( (otherlv_0= 'QUERY' otherlv_1= 'ON' otherlv_2= 'COLLECTION' ( (lv_queryCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'top' otherlv_5= 'K' otherlv_6= '=' ( (lv_topK_7_0= ruleEInt ) ) otherlv_8= 'OUT' otherlv_9= 'FIELDS' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'WITH' otherlv_16= 'FILTERS' otherlv_17= '[' ( (lv_nonVecFilters_18_0= ruleFilter ) ) (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )* otherlv_21= ']' )? otherlv_22= ';' ) )
            // InternalDomijmasdsl.g:1486:2: (otherlv_0= 'QUERY' otherlv_1= 'ON' otherlv_2= 'COLLECTION' ( (lv_queryCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'top' otherlv_5= 'K' otherlv_6= '=' ( (lv_topK_7_0= ruleEInt ) ) otherlv_8= 'OUT' otherlv_9= 'FIELDS' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'WITH' otherlv_16= 'FILTERS' otherlv_17= '[' ( (lv_nonVecFilters_18_0= ruleFilter ) ) (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )* otherlv_21= ']' )? otherlv_22= ';' )
            {
            // InternalDomijmasdsl.g:1486:2: (otherlv_0= 'QUERY' otherlv_1= 'ON' otherlv_2= 'COLLECTION' ( (lv_queryCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'top' otherlv_5= 'K' otherlv_6= '=' ( (lv_topK_7_0= ruleEInt ) ) otherlv_8= 'OUT' otherlv_9= 'FIELDS' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'WITH' otherlv_16= 'FILTERS' otherlv_17= '[' ( (lv_nonVecFilters_18_0= ruleFilter ) ) (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )* otherlv_21= ']' )? otherlv_22= ';' )
            // InternalDomijmasdsl.g:1487:3: otherlv_0= 'QUERY' otherlv_1= 'ON' otherlv_2= 'COLLECTION' ( (lv_queryCollection_3_0= ruleVectorCollection ) ) otherlv_4= 'top' otherlv_5= 'K' otherlv_6= '=' ( (lv_topK_7_0= ruleEInt ) ) otherlv_8= 'OUT' otherlv_9= 'FIELDS' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' (otherlv_15= 'WITH' otherlv_16= 'FILTERS' otherlv_17= '[' ( (lv_nonVecFilters_18_0= ruleFilter ) ) (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )* otherlv_21= ']' )? otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getNonVectorSearchAccess().getQUERYKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getNonVectorSearchAccess().getONKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getNonVectorSearchAccess().getCOLLECTIONKeyword_2());
            		
            // InternalDomijmasdsl.g:1499:3: ( (lv_queryCollection_3_0= ruleVectorCollection ) )
            // InternalDomijmasdsl.g:1500:4: (lv_queryCollection_3_0= ruleVectorCollection )
            {
            // InternalDomijmasdsl.g:1500:4: (lv_queryCollection_3_0= ruleVectorCollection )
            // InternalDomijmasdsl.g:1501:5: lv_queryCollection_3_0= ruleVectorCollection
            {

            					newCompositeNode(grammarAccess.getNonVectorSearchAccess().getQueryCollectionVectorCollectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_queryCollection_3_0=ruleVectorCollection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonVectorSearchRule());
            					}
            					set(
            						current,
            						"queryCollection",
            						lv_queryCollection_3_0,
            						"org.xtext.example.domij.Domijmasdsl.VectorCollection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_4, grammarAccess.getNonVectorSearchAccess().getTopKeyword_4());
            		
            otherlv_5=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getNonVectorSearchAccess().getKKeyword_5());
            		
            otherlv_6=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_6, grammarAccess.getNonVectorSearchAccess().getEqualsSignKeyword_6());
            		
            // InternalDomijmasdsl.g:1530:3: ( (lv_topK_7_0= ruleEInt ) )
            // InternalDomijmasdsl.g:1531:4: (lv_topK_7_0= ruleEInt )
            {
            // InternalDomijmasdsl.g:1531:4: (lv_topK_7_0= ruleEInt )
            // InternalDomijmasdsl.g:1532:5: lv_topK_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNonVectorSearchAccess().getTopKEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_39);
            lv_topK_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonVectorSearchRule());
            					}
            					set(
            						current,
            						"topK",
            						lv_topK_7_0,
            						"org.xtext.example.domij.Domijmasdsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,41,FOLLOW_40); 

            			newLeafNode(otherlv_8, grammarAccess.getNonVectorSearchAccess().getOUTKeyword_8());
            		
            otherlv_9=(Token)match(input,42,FOLLOW_41); 

            			newLeafNode(otherlv_9, grammarAccess.getNonVectorSearchAccess().getFIELDSKeyword_9());
            		
            otherlv_10=(Token)match(input,43,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getNonVectorSearchAccess().getLeftParenthesisKeyword_10());
            		
            // InternalDomijmasdsl.g:1561:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:1562:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:1562:4: ( ruleEString )
            // InternalDomijmasdsl.g:1563:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonVectorSearchRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNonVectorSearchAccess().getOutputFieldsFieldCrossReference_11_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1577:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDomijmasdsl.g:1578:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FOLLOW_12); 

            	    				newLeafNode(otherlv_12, grammarAccess.getNonVectorSearchAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalDomijmasdsl.g:1582:4: ( ( ruleEString ) )
            	    // InternalDomijmasdsl.g:1583:5: ( ruleEString )
            	    {
            	    // InternalDomijmasdsl.g:1583:5: ( ruleEString )
            	    // InternalDomijmasdsl.g:1584:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getNonVectorSearchRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getNonVectorSearchAccess().getOutputFieldsFieldCrossReference_12_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_14=(Token)match(input,44,FOLLOW_43); 

            			newLeafNode(otherlv_14, grammarAccess.getNonVectorSearchAccess().getRightParenthesisKeyword_13());
            		
            // InternalDomijmasdsl.g:1603:3: (otherlv_15= 'WITH' otherlv_16= 'FILTERS' otherlv_17= '[' ( (lv_nonVecFilters_18_0= ruleFilter ) ) (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )* otherlv_21= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDomijmasdsl.g:1604:4: otherlv_15= 'WITH' otherlv_16= 'FILTERS' otherlv_17= '[' ( (lv_nonVecFilters_18_0= ruleFilter ) ) (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )* otherlv_21= ']'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_15, grammarAccess.getNonVectorSearchAccess().getWITHKeyword_14_0());
                    			
                    otherlv_16=(Token)match(input,45,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonVectorSearchAccess().getFILTERSKeyword_14_1());
                    			
                    otherlv_17=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getNonVectorSearchAccess().getLeftSquareBracketKeyword_14_2());
                    			
                    // InternalDomijmasdsl.g:1616:4: ( (lv_nonVecFilters_18_0= ruleFilter ) )
                    // InternalDomijmasdsl.g:1617:5: (lv_nonVecFilters_18_0= ruleFilter )
                    {
                    // InternalDomijmasdsl.g:1617:5: (lv_nonVecFilters_18_0= ruleFilter )
                    // InternalDomijmasdsl.g:1618:6: lv_nonVecFilters_18_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getNonVectorSearchAccess().getNonVecFiltersFilterParserRuleCall_14_3_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_nonVecFilters_18_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonVectorSearchRule());
                    						}
                    						add(
                    							current,
                    							"nonVecFilters",
                    							lv_nonVecFilters_18_0,
                    							"org.xtext.example.domij.Domijmasdsl.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:1635:4: (otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==20) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:1636:5: otherlv_19= ',' ( (lv_nonVecFilters_20_0= ruleFilter ) )
                    	    {
                    	    otherlv_19=(Token)match(input,20,FOLLOW_12); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getNonVectorSearchAccess().getCommaKeyword_14_4_0());
                    	    				
                    	    // InternalDomijmasdsl.g:1640:5: ( (lv_nonVecFilters_20_0= ruleFilter ) )
                    	    // InternalDomijmasdsl.g:1641:6: (lv_nonVecFilters_20_0= ruleFilter )
                    	    {
                    	    // InternalDomijmasdsl.g:1641:6: (lv_nonVecFilters_20_0= ruleFilter )
                    	    // InternalDomijmasdsl.g:1642:7: lv_nonVecFilters_20_0= ruleFilter
                    	    {

                    	    							newCompositeNode(grammarAccess.getNonVectorSearchAccess().getNonVecFiltersFilterParserRuleCall_14_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_nonVecFilters_20_0=ruleFilter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNonVectorSearchRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nonVecFilters",
                    	    								lv_nonVecFilters_20_0,
                    	    								"org.xtext.example.domij.Domijmasdsl.Filter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_21, grammarAccess.getNonVectorSearchAccess().getRightSquareBracketKeyword_14_5());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getNonVectorSearchAccess().getSemicolonKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonVectorSearch"


    // $ANTLR start "entryRuleVectorDatabase"
    // InternalDomijmasdsl.g:1673:1: entryRuleVectorDatabase returns [EObject current=null] : iv_ruleVectorDatabase= ruleVectorDatabase EOF ;
    public final EObject entryRuleVectorDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorDatabase = null;


        try {
            // InternalDomijmasdsl.g:1673:55: (iv_ruleVectorDatabase= ruleVectorDatabase EOF )
            // InternalDomijmasdsl.g:1674:2: iv_ruleVectorDatabase= ruleVectorDatabase EOF
            {
             newCompositeNode(grammarAccess.getVectorDatabaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVectorDatabase=ruleVectorDatabase();

            state._fsp--;

             current =iv_ruleVectorDatabase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorDatabase"


    // $ANTLR start "ruleVectorDatabase"
    // InternalDomijmasdsl.g:1680:1: ruleVectorDatabase returns [EObject current=null] : (otherlv_0= 'VECTOR' otherlv_1= 'DATABASE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'WITH' otherlv_4= 'CONNECTION' ( (lv_connection_5_0= ruleConnection ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'CLUSTERS' otherlv_11= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_14= ']' )? ) ;
    public final EObject ruleVectorDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_connection_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:1686:2: ( (otherlv_0= 'VECTOR' otherlv_1= 'DATABASE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'WITH' otherlv_4= 'CONNECTION' ( (lv_connection_5_0= ruleConnection ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'CLUSTERS' otherlv_11= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_14= ']' )? ) )
            // InternalDomijmasdsl.g:1687:2: (otherlv_0= 'VECTOR' otherlv_1= 'DATABASE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'WITH' otherlv_4= 'CONNECTION' ( (lv_connection_5_0= ruleConnection ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'CLUSTERS' otherlv_11= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_14= ']' )? )
            {
            // InternalDomijmasdsl.g:1687:2: (otherlv_0= 'VECTOR' otherlv_1= 'DATABASE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'WITH' otherlv_4= 'CONNECTION' ( (lv_connection_5_0= ruleConnection ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'CLUSTERS' otherlv_11= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_14= ']' )? )
            // InternalDomijmasdsl.g:1688:3: otherlv_0= 'VECTOR' otherlv_1= 'DATABASE' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'WITH' otherlv_4= 'CONNECTION' ( (lv_connection_5_0= ruleConnection ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'CLUSTERS' otherlv_11= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_14= ']' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorDatabaseAccess().getVECTORKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVectorDatabaseAccess().getDATABASEKeyword_1());
            		
            // InternalDomijmasdsl.g:1696:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomijmasdsl.g:1697:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomijmasdsl.g:1697:4: (lv_name_2_0= ruleEString )
            // InternalDomijmasdsl.g:1698:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVectorDatabaseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorDatabaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getVectorDatabaseAccess().getWITHKeyword_3());
            		
            otherlv_4=(Token)match(input,49,FOLLOW_48); 

            			newLeafNode(otherlv_4, grammarAccess.getVectorDatabaseAccess().getCONNECTIONKeyword_4());
            		
            // InternalDomijmasdsl.g:1723:3: ( (lv_connection_5_0= ruleConnection ) )
            // InternalDomijmasdsl.g:1724:4: (lv_connection_5_0= ruleConnection )
            {
            // InternalDomijmasdsl.g:1724:4: (lv_connection_5_0= ruleConnection )
            // InternalDomijmasdsl.g:1725:5: lv_connection_5_0= ruleConnection
            {

            					newCompositeNode(grammarAccess.getVectorDatabaseAccess().getConnectionConnectionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_49);
            lv_connection_5_0=ruleConnection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorDatabaseRule());
            					}
            					set(
            						current,
            						"connection",
            						lv_connection_5_0,
            						"org.xtext.example.domij.Domijmasdsl.Connection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1742:3: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==50) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDomijmasdsl.g:1743:4: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getVectorDatabaseAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getVectorDatabaseAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalDomijmasdsl.g:1751:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDomijmasdsl.g:1752:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:1752:5: (lv_description_8_0= ruleEString )
                    // InternalDomijmasdsl.g:1753:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVectorDatabaseAccess().getDescriptionEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorDatabaseRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:1771:3: (otherlv_9= 'WITH' otherlv_10= 'CLUSTERS' otherlv_11= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_14= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDomijmasdsl.g:1772:4: otherlv_9= 'WITH' otherlv_10= 'CLUSTERS' otherlv_11= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getVectorDatabaseAccess().getWITHKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,51,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getVectorDatabaseAccess().getCLUSTERSKeyword_7_1());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getVectorDatabaseAccess().getLeftSquareBracketKeyword_7_2());
                    			
                    // InternalDomijmasdsl.g:1784:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:1785:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:1785:5: ( ruleEString )
                    // InternalDomijmasdsl.g:1786:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVectorDatabaseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVectorDatabaseAccess().getClustersClusterCrossReference_7_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:1800:4: ( ( ruleEString ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:1801:5: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:1801:5: ( ruleEString )
                    	    // InternalDomijmasdsl.g:1802:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getVectorDatabaseRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getVectorDatabaseAccess().getClustersClusterCrossReference_7_4_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getVectorDatabaseAccess().getRightSquareBracketKeyword_7_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorDatabase"


    // $ANTLR start "entryRuleCluster"
    // InternalDomijmasdsl.g:1825:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // InternalDomijmasdsl.g:1825:48: (iv_ruleCluster= ruleCluster EOF )
            // InternalDomijmasdsl.g:1826:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // InternalDomijmasdsl.g:1832:1: ruleCluster returns [EObject current=null] : (otherlv_0= 'CLUSTER' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'IN' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'collections' otherlv_10= '=' ( (lv_nofCollections_11_0= ruleEInt ) ) )? (otherlv_12= 'WITH' otherlv_13= 'COLLECTIONS' otherlv_14= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_17= ']' )? (otherlv_18= 'WITH' otherlv_19= 'CLUSTER' otherlv_20= 'LIMITS' otherlv_21= '[' ( (lv_clusterLimits_22_0= ruleClusterLimit ) ) ( (lv_clusterLimits_23_0= ruleClusterLimit ) )* otherlv_24= ']' )? ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_nofCollections_11_0 = null;

        EObject lv_clusterLimits_22_0 = null;

        EObject lv_clusterLimits_23_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:1838:2: ( (otherlv_0= 'CLUSTER' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'IN' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'collections' otherlv_10= '=' ( (lv_nofCollections_11_0= ruleEInt ) ) )? (otherlv_12= 'WITH' otherlv_13= 'COLLECTIONS' otherlv_14= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_17= ']' )? (otherlv_18= 'WITH' otherlv_19= 'CLUSTER' otherlv_20= 'LIMITS' otherlv_21= '[' ( (lv_clusterLimits_22_0= ruleClusterLimit ) ) ( (lv_clusterLimits_23_0= ruleClusterLimit ) )* otherlv_24= ']' )? ) )
            // InternalDomijmasdsl.g:1839:2: (otherlv_0= 'CLUSTER' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'IN' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'collections' otherlv_10= '=' ( (lv_nofCollections_11_0= ruleEInt ) ) )? (otherlv_12= 'WITH' otherlv_13= 'COLLECTIONS' otherlv_14= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_17= ']' )? (otherlv_18= 'WITH' otherlv_19= 'CLUSTER' otherlv_20= 'LIMITS' otherlv_21= '[' ( (lv_clusterLimits_22_0= ruleClusterLimit ) ) ( (lv_clusterLimits_23_0= ruleClusterLimit ) )* otherlv_24= ']' )? )
            {
            // InternalDomijmasdsl.g:1839:2: (otherlv_0= 'CLUSTER' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'IN' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'collections' otherlv_10= '=' ( (lv_nofCollections_11_0= ruleEInt ) ) )? (otherlv_12= 'WITH' otherlv_13= 'COLLECTIONS' otherlv_14= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_17= ']' )? (otherlv_18= 'WITH' otherlv_19= 'CLUSTER' otherlv_20= 'LIMITS' otherlv_21= '[' ( (lv_clusterLimits_22_0= ruleClusterLimit ) ) ( (lv_clusterLimits_23_0= ruleClusterLimit ) )* otherlv_24= ']' )? )
            // InternalDomijmasdsl.g:1840:3: otherlv_0= 'CLUSTER' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'IN' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'collections' otherlv_10= '=' ( (lv_nofCollections_11_0= ruleEInt ) ) )? (otherlv_12= 'WITH' otherlv_13= 'COLLECTIONS' otherlv_14= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_17= ']' )? (otherlv_18= 'WITH' otherlv_19= 'CLUSTER' otherlv_20= 'LIMITS' otherlv_21= '[' ( (lv_clusterLimits_22_0= ruleClusterLimit ) ) ( (lv_clusterLimits_23_0= ruleClusterLimit ) )* otherlv_24= ']' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getClusterAccess().getCLUSTERKeyword_0());
            		
            // InternalDomijmasdsl.g:1844:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDomijmasdsl.g:1845:4: (lv_name_1_0= ruleEString )
            {
            // InternalDomijmasdsl.g:1845:4: (lv_name_1_0= ruleEString )
            // InternalDomijmasdsl.g:1846:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClusterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClusterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getINKeyword_2());
            		
            // InternalDomijmasdsl.g:1867:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:1868:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:1868:4: ( ruleEString )
            // InternalDomijmasdsl.g:1869:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClusterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClusterAccess().getVectordbVectorDatabaseCrossReference_3_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:1883:3: (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDomijmasdsl.g:1884:4: otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getClusterAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getClusterAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalDomijmasdsl.g:1892:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalDomijmasdsl.g:1893:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:1893:5: (lv_description_6_0= ruleEString )
                    // InternalDomijmasdsl.g:1894:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClusterAccess().getDescriptionEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClusterRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:1912:3: (otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'collections' otherlv_10= '=' ( (lv_nofCollections_11_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDomijmasdsl.g:1913:4: otherlv_7= 'number' otherlv_8= 'of' otherlv_9= 'collections' otherlv_10= '=' ( (lv_nofCollections_11_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getClusterAccess().getNumberKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,30,FOLLOW_53); 

                    				newLeafNode(otherlv_8, grammarAccess.getClusterAccess().getOfKeyword_5_1());
                    			
                    otherlv_9=(Token)match(input,53,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getClusterAccess().getCollectionsKeyword_5_2());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getClusterAccess().getEqualsSignKeyword_5_3());
                    			
                    // InternalDomijmasdsl.g:1929:4: ( (lv_nofCollections_11_0= ruleEInt ) )
                    // InternalDomijmasdsl.g:1930:5: (lv_nofCollections_11_0= ruleEInt )
                    {
                    // InternalDomijmasdsl.g:1930:5: (lv_nofCollections_11_0= ruleEInt )
                    // InternalDomijmasdsl.g:1931:6: lv_nofCollections_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getClusterAccess().getNofCollectionsEIntParserRuleCall_5_4_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_nofCollections_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClusterRule());
                    						}
                    						set(
                    							current,
                    							"nofCollections",
                    							lv_nofCollections_11_0,
                    							"org.xtext.example.domij.Domijmasdsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:1949:3: (otherlv_12= 'WITH' otherlv_13= 'COLLECTIONS' otherlv_14= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_17= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==13) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==54) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalDomijmasdsl.g:1950:4: otherlv_12= 'WITH' otherlv_13= 'COLLECTIONS' otherlv_14= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_17= ']'
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_54); 

                    				newLeafNode(otherlv_12, grammarAccess.getClusterAccess().getWITHKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,54,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getClusterAccess().getCOLLECTIONSKeyword_6_1());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getClusterAccess().getLeftSquareBracketKeyword_6_2());
                    			
                    // InternalDomijmasdsl.g:1962:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:1963:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:1963:5: ( ruleEString )
                    // InternalDomijmasdsl.g:1964:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClusterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClusterAccess().getCollectionsVectorCollectionCrossReference_6_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:1978:4: ( ( ruleEString ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:1979:5: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:1979:5: ( ruleEString )
                    	    // InternalDomijmasdsl.g:1980:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getClusterRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getClusterAccess().getCollectionsVectorCollectionCrossReference_6_4_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getClusterAccess().getRightSquareBracketKeyword_6_5());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:1999:3: (otherlv_18= 'WITH' otherlv_19= 'CLUSTER' otherlv_20= 'LIMITS' otherlv_21= '[' ( (lv_clusterLimits_22_0= ruleClusterLimit ) ) ( (lv_clusterLimits_23_0= ruleClusterLimit ) )* otherlv_24= ']' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDomijmasdsl.g:2000:4: otherlv_18= 'WITH' otherlv_19= 'CLUSTER' otherlv_20= 'LIMITS' otherlv_21= '[' ( (lv_clusterLimits_22_0= ruleClusterLimit ) ) ( (lv_clusterLimits_23_0= ruleClusterLimit ) )* otherlv_24= ']'
                    {
                    otherlv_18=(Token)match(input,13,FOLLOW_55); 

                    				newLeafNode(otherlv_18, grammarAccess.getClusterAccess().getWITHKeyword_7_0());
                    			
                    otherlv_19=(Token)match(input,52,FOLLOW_56); 

                    				newLeafNode(otherlv_19, grammarAccess.getClusterAccess().getCLUSTERKeyword_7_1());
                    			
                    otherlv_20=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_20, grammarAccess.getClusterAccess().getLIMITSKeyword_7_2());
                    			
                    otherlv_21=(Token)match(input,15,FOLLOW_55); 

                    				newLeafNode(otherlv_21, grammarAccess.getClusterAccess().getLeftSquareBracketKeyword_7_3());
                    			
                    // InternalDomijmasdsl.g:2016:4: ( (lv_clusterLimits_22_0= ruleClusterLimit ) )
                    // InternalDomijmasdsl.g:2017:5: (lv_clusterLimits_22_0= ruleClusterLimit )
                    {
                    // InternalDomijmasdsl.g:2017:5: (lv_clusterLimits_22_0= ruleClusterLimit )
                    // InternalDomijmasdsl.g:2018:6: lv_clusterLimits_22_0= ruleClusterLimit
                    {

                    						newCompositeNode(grammarAccess.getClusterAccess().getClusterLimitsClusterLimitParserRuleCall_7_4_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_clusterLimits_22_0=ruleClusterLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClusterRule());
                    						}
                    						add(
                    							current,
                    							"clusterLimits",
                    							lv_clusterLimits_22_0,
                    							"org.xtext.example.domij.Domijmasdsl.ClusterLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:2035:4: ( (lv_clusterLimits_23_0= ruleClusterLimit ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==52) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:2036:5: (lv_clusterLimits_23_0= ruleClusterLimit )
                    	    {
                    	    // InternalDomijmasdsl.g:2036:5: (lv_clusterLimits_23_0= ruleClusterLimit )
                    	    // InternalDomijmasdsl.g:2037:6: lv_clusterLimits_23_0= ruleClusterLimit
                    	    {

                    	    						newCompositeNode(grammarAccess.getClusterAccess().getClusterLimitsClusterLimitParserRuleCall_7_5_0());
                    	    					
                    	    pushFollow(FOLLOW_57);
                    	    lv_clusterLimits_23_0=ruleClusterLimit();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClusterRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"clusterLimits",
                    	    							lv_clusterLimits_23_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.ClusterLimit");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getClusterAccess().getRightSquareBracketKeyword_7_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleVectorCollection"
    // InternalDomijmasdsl.g:2063:1: entryRuleVectorCollection returns [EObject current=null] : iv_ruleVectorCollection= ruleVectorCollection EOF ;
    public final EObject entryRuleVectorCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorCollection = null;


        try {
            // InternalDomijmasdsl.g:2063:57: (iv_ruleVectorCollection= ruleVectorCollection EOF )
            // InternalDomijmasdsl.g:2064:2: iv_ruleVectorCollection= ruleVectorCollection EOF
            {
             newCompositeNode(grammarAccess.getVectorCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVectorCollection=ruleVectorCollection();

            state._fsp--;

             current =iv_ruleVectorCollection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorCollection"


    // $ANTLR start "ruleVectorCollection"
    // InternalDomijmasdsl.g:2070:1: ruleVectorCollection returns [EObject current=null] : (otherlv_0= 'VECTOR' otherlv_1= 'COLLECTION' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_dynamic_5_0= 'dynamic' ) )? (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_collectionLimits_12_0= ruleCollectionLimit ) ) ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'FIELDS' otherlv_17= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_20= ']' ) (otherlv_21= 'WITH' otherlv_22= 'PARTITIONS' otherlv_23= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_26= ']' )? (otherlv_27= 'podType' otherlv_28= '=' ( (lv_podtype_29_0= ruleEPodTypes ) ) )? (otherlv_30= 'podSize' otherlv_31= '=' ( (lv_podSize_32_0= ruleEPodSize ) ) )? (otherlv_33= 'podEnv' otherlv_34= '=' ( (lv_podEnv_35_0= ruleEPodEnv ) ) )? ) ;
    public final EObject ruleVectorCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_dynamic_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_collectionLimits_12_0 = null;

        EObject lv_collectionLimits_13_0 = null;

        Enumerator lv_podtype_29_0 = null;

        Enumerator lv_podSize_32_0 = null;

        Enumerator lv_podEnv_35_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:2076:2: ( (otherlv_0= 'VECTOR' otherlv_1= 'COLLECTION' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_dynamic_5_0= 'dynamic' ) )? (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_collectionLimits_12_0= ruleCollectionLimit ) ) ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'FIELDS' otherlv_17= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_20= ']' ) (otherlv_21= 'WITH' otherlv_22= 'PARTITIONS' otherlv_23= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_26= ']' )? (otherlv_27= 'podType' otherlv_28= '=' ( (lv_podtype_29_0= ruleEPodTypes ) ) )? (otherlv_30= 'podSize' otherlv_31= '=' ( (lv_podSize_32_0= ruleEPodSize ) ) )? (otherlv_33= 'podEnv' otherlv_34= '=' ( (lv_podEnv_35_0= ruleEPodEnv ) ) )? ) )
            // InternalDomijmasdsl.g:2077:2: (otherlv_0= 'VECTOR' otherlv_1= 'COLLECTION' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_dynamic_5_0= 'dynamic' ) )? (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_collectionLimits_12_0= ruleCollectionLimit ) ) ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'FIELDS' otherlv_17= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_20= ']' ) (otherlv_21= 'WITH' otherlv_22= 'PARTITIONS' otherlv_23= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_26= ']' )? (otherlv_27= 'podType' otherlv_28= '=' ( (lv_podtype_29_0= ruleEPodTypes ) ) )? (otherlv_30= 'podSize' otherlv_31= '=' ( (lv_podSize_32_0= ruleEPodSize ) ) )? (otherlv_33= 'podEnv' otherlv_34= '=' ( (lv_podEnv_35_0= ruleEPodEnv ) ) )? )
            {
            // InternalDomijmasdsl.g:2077:2: (otherlv_0= 'VECTOR' otherlv_1= 'COLLECTION' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_dynamic_5_0= 'dynamic' ) )? (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_collectionLimits_12_0= ruleCollectionLimit ) ) ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'FIELDS' otherlv_17= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_20= ']' ) (otherlv_21= 'WITH' otherlv_22= 'PARTITIONS' otherlv_23= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_26= ']' )? (otherlv_27= 'podType' otherlv_28= '=' ( (lv_podtype_29_0= ruleEPodTypes ) ) )? (otherlv_30= 'podSize' otherlv_31= '=' ( (lv_podSize_32_0= ruleEPodSize ) ) )? (otherlv_33= 'podEnv' otherlv_34= '=' ( (lv_podEnv_35_0= ruleEPodEnv ) ) )? )
            // InternalDomijmasdsl.g:2078:3: otherlv_0= 'VECTOR' otherlv_1= 'COLLECTION' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_dynamic_5_0= 'dynamic' ) )? (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_collectionLimits_12_0= ruleCollectionLimit ) ) ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'FIELDS' otherlv_17= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_20= ']' ) (otherlv_21= 'WITH' otherlv_22= 'PARTITIONS' otherlv_23= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_26= ']' )? (otherlv_27= 'podType' otherlv_28= '=' ( (lv_podtype_29_0= ruleEPodTypes ) ) )? (otherlv_30= 'podSize' otherlv_31= '=' ( (lv_podSize_32_0= ruleEPodSize ) ) )? (otherlv_33= 'podEnv' otherlv_34= '=' ( (lv_podEnv_35_0= ruleEPodEnv ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorCollectionAccess().getVECTORKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVectorCollectionAccess().getCOLLECTIONKeyword_1());
            		
            // InternalDomijmasdsl.g:2086:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomijmasdsl.g:2087:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomijmasdsl.g:2087:4: (lv_name_2_0= ruleEString )
            // InternalDomijmasdsl.g:2088:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVectorCollectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorCollectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getVectorCollectionAccess().getINKeyword_3());
            		
            // InternalDomijmasdsl.g:2109:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:2110:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:2110:4: ( ruleEString )
            // InternalDomijmasdsl.g:2111:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVectorCollectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVectorCollectionAccess().getClusterClusterCrossReference_4_0());
            				
            pushFollow(FOLLOW_58);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:2125:3: ( (lv_dynamic_5_0= 'dynamic' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDomijmasdsl.g:2126:4: (lv_dynamic_5_0= 'dynamic' )
                    {
                    // InternalDomijmasdsl.g:2126:4: (lv_dynamic_5_0= 'dynamic' )
                    // InternalDomijmasdsl.g:2127:5: lv_dynamic_5_0= 'dynamic'
                    {
                    lv_dynamic_5_0=(Token)match(input,56,FOLLOW_59); 

                    					newLeafNode(lv_dynamic_5_0, grammarAccess.getVectorCollectionAccess().getDynamicDynamicKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVectorCollectionRule());
                    					}
                    					setWithLastConsumed(current, "dynamic", lv_dynamic_5_0 != null, "dynamic");
                    				

                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:2139:3: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDomijmasdsl.g:2140:4: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getVectorCollectionAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getVectorCollectionAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalDomijmasdsl.g:2148:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDomijmasdsl.g:2149:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2149:5: (lv_description_8_0= ruleEString )
                    // InternalDomijmasdsl.g:2150:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getDescriptionEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorCollectionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:2168:3: (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_collectionLimits_12_0= ruleCollectionLimit ) ) ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )* otherlv_14= ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==13) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==55) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalDomijmasdsl.g:2169:4: otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_collectionLimits_12_0= ruleCollectionLimit ) ) ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_56); 

                    				newLeafNode(otherlv_9, grammarAccess.getVectorCollectionAccess().getWITHKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getVectorCollectionAccess().getLIMITSKeyword_7_1());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_21); 

                    				newLeafNode(otherlv_11, grammarAccess.getVectorCollectionAccess().getLeftSquareBracketKeyword_7_2());
                    			
                    // InternalDomijmasdsl.g:2181:4: ( (lv_collectionLimits_12_0= ruleCollectionLimit ) )
                    // InternalDomijmasdsl.g:2182:5: (lv_collectionLimits_12_0= ruleCollectionLimit )
                    {
                    // InternalDomijmasdsl.g:2182:5: (lv_collectionLimits_12_0= ruleCollectionLimit )
                    // InternalDomijmasdsl.g:2183:6: lv_collectionLimits_12_0= ruleCollectionLimit
                    {

                    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getCollectionLimitsCollectionLimitParserRuleCall_7_3_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_collectionLimits_12_0=ruleCollectionLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorCollectionRule());
                    						}
                    						add(
                    							current,
                    							"collectionLimits",
                    							lv_collectionLimits_12_0,
                    							"org.xtext.example.domij.Domijmasdsl.CollectionLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:2200:4: ( (lv_collectionLimits_13_0= ruleCollectionLimit ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==25) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:2201:5: (lv_collectionLimits_13_0= ruleCollectionLimit )
                    	    {
                    	    // InternalDomijmasdsl.g:2201:5: (lv_collectionLimits_13_0= ruleCollectionLimit )
                    	    // InternalDomijmasdsl.g:2202:6: lv_collectionLimits_13_0= ruleCollectionLimit
                    	    {

                    	    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getCollectionLimitsCollectionLimitParserRuleCall_7_4_0());
                    	    					
                    	    pushFollow(FOLLOW_60);
                    	    lv_collectionLimits_13_0=ruleCollectionLimit();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVectorCollectionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"collectionLimits",
                    	    							lv_collectionLimits_13_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.CollectionLimit");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_47); 

                    				newLeafNode(otherlv_14, grammarAccess.getVectorCollectionAccess().getRightSquareBracketKeyword_7_5());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:2224:3: (otherlv_15= 'WITH' otherlv_16= 'FIELDS' otherlv_17= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_20= ']' )
            // InternalDomijmasdsl.g:2225:4: otherlv_15= 'WITH' otherlv_16= 'FIELDS' otherlv_17= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_20= ']'
            {
            otherlv_15=(Token)match(input,13,FOLLOW_40); 

            				newLeafNode(otherlv_15, grammarAccess.getVectorCollectionAccess().getWITHKeyword_8_0());
            			
            otherlv_16=(Token)match(input,42,FOLLOW_7); 

            				newLeafNode(otherlv_16, grammarAccess.getVectorCollectionAccess().getFIELDSKeyword_8_1());
            			
            otherlv_17=(Token)match(input,15,FOLLOW_12); 

            				newLeafNode(otherlv_17, grammarAccess.getVectorCollectionAccess().getLeftSquareBracketKeyword_8_2());
            			
            // InternalDomijmasdsl.g:2237:4: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:2238:5: ( ruleEString )
            {
            // InternalDomijmasdsl.g:2238:5: ( ruleEString )
            // InternalDomijmasdsl.g:2239:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getVectorCollectionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getVectorCollectionAccess().getFieldsFieldCrossReference_8_3_0());
            					
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalDomijmasdsl.g:2253:4: ( ( ruleEString ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalDomijmasdsl.g:2254:5: ( ruleEString )
            	    {
            	    // InternalDomijmasdsl.g:2254:5: ( ruleEString )
            	    // InternalDomijmasdsl.g:2255:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVectorCollectionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getFieldsFieldCrossReference_8_4_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_20=(Token)match(input,16,FOLLOW_61); 

            				newLeafNode(otherlv_20, grammarAccess.getVectorCollectionAccess().getRightSquareBracketKeyword_8_5());
            			

            }

            // InternalDomijmasdsl.g:2274:3: (otherlv_21= 'WITH' otherlv_22= 'PARTITIONS' otherlv_23= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_26= ']' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==13) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDomijmasdsl.g:2275:4: otherlv_21= 'WITH' otherlv_22= 'PARTITIONS' otherlv_23= '[' ( ( ruleEString ) ) ( ( ruleEString ) )* otherlv_26= ']'
                    {
                    otherlv_21=(Token)match(input,13,FOLLOW_62); 

                    				newLeafNode(otherlv_21, grammarAccess.getVectorCollectionAccess().getWITHKeyword_9_0());
                    			
                    otherlv_22=(Token)match(input,57,FOLLOW_7); 

                    				newLeafNode(otherlv_22, grammarAccess.getVectorCollectionAccess().getPARTITIONSKeyword_9_1());
                    			
                    otherlv_23=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_23, grammarAccess.getVectorCollectionAccess().getLeftSquareBracketKeyword_9_2());
                    			
                    // InternalDomijmasdsl.g:2287:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:2288:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:2288:5: ( ruleEString )
                    // InternalDomijmasdsl.g:2289:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVectorCollectionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getPartitionsPartitionCrossReference_9_3_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:2303:4: ( ( ruleEString ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:2304:5: ( ruleEString )
                    	    {
                    	    // InternalDomijmasdsl.g:2304:5: ( ruleEString )
                    	    // InternalDomijmasdsl.g:2305:6: ruleEString
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getVectorCollectionRule());
                    	    						}
                    	    					

                    	    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getPartitionsPartitionCrossReference_9_4_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_63); 

                    				newLeafNode(otherlv_26, grammarAccess.getVectorCollectionAccess().getRightSquareBracketKeyword_9_5());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:2324:3: (otherlv_27= 'podType' otherlv_28= '=' ( (lv_podtype_29_0= ruleEPodTypes ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==58) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDomijmasdsl.g:2325:4: otherlv_27= 'podType' otherlv_28= '=' ( (lv_podtype_29_0= ruleEPodTypes ) )
                    {
                    otherlv_27=(Token)match(input,58,FOLLOW_25); 

                    				newLeafNode(otherlv_27, grammarAccess.getVectorCollectionAccess().getPodTypeKeyword_10_0());
                    			
                    otherlv_28=(Token)match(input,28,FOLLOW_64); 

                    				newLeafNode(otherlv_28, grammarAccess.getVectorCollectionAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalDomijmasdsl.g:2333:4: ( (lv_podtype_29_0= ruleEPodTypes ) )
                    // InternalDomijmasdsl.g:2334:5: (lv_podtype_29_0= ruleEPodTypes )
                    {
                    // InternalDomijmasdsl.g:2334:5: (lv_podtype_29_0= ruleEPodTypes )
                    // InternalDomijmasdsl.g:2335:6: lv_podtype_29_0= ruleEPodTypes
                    {

                    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getPodtypeEPodTypesEnumRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_podtype_29_0=ruleEPodTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorCollectionRule());
                    						}
                    						set(
                    							current,
                    							"podtype",
                    							lv_podtype_29_0,
                    							"org.xtext.example.domij.Domijmasdsl.EPodTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:2353:3: (otherlv_30= 'podSize' otherlv_31= '=' ( (lv_podSize_32_0= ruleEPodSize ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDomijmasdsl.g:2354:4: otherlv_30= 'podSize' otherlv_31= '=' ( (lv_podSize_32_0= ruleEPodSize ) )
                    {
                    otherlv_30=(Token)match(input,59,FOLLOW_25); 

                    				newLeafNode(otherlv_30, grammarAccess.getVectorCollectionAccess().getPodSizeKeyword_11_0());
                    			
                    otherlv_31=(Token)match(input,28,FOLLOW_66); 

                    				newLeafNode(otherlv_31, grammarAccess.getVectorCollectionAccess().getEqualsSignKeyword_11_1());
                    			
                    // InternalDomijmasdsl.g:2362:4: ( (lv_podSize_32_0= ruleEPodSize ) )
                    // InternalDomijmasdsl.g:2363:5: (lv_podSize_32_0= ruleEPodSize )
                    {
                    // InternalDomijmasdsl.g:2363:5: (lv_podSize_32_0= ruleEPodSize )
                    // InternalDomijmasdsl.g:2364:6: lv_podSize_32_0= ruleEPodSize
                    {

                    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getPodSizeEPodSizeEnumRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_podSize_32_0=ruleEPodSize();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorCollectionRule());
                    						}
                    						set(
                    							current,
                    							"podSize",
                    							lv_podSize_32_0,
                    							"org.xtext.example.domij.Domijmasdsl.EPodSize");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:2382:3: (otherlv_33= 'podEnv' otherlv_34= '=' ( (lv_podEnv_35_0= ruleEPodEnv ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==60) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDomijmasdsl.g:2383:4: otherlv_33= 'podEnv' otherlv_34= '=' ( (lv_podEnv_35_0= ruleEPodEnv ) )
                    {
                    otherlv_33=(Token)match(input,60,FOLLOW_25); 

                    				newLeafNode(otherlv_33, grammarAccess.getVectorCollectionAccess().getPodEnvKeyword_12_0());
                    			
                    otherlv_34=(Token)match(input,28,FOLLOW_68); 

                    				newLeafNode(otherlv_34, grammarAccess.getVectorCollectionAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalDomijmasdsl.g:2391:4: ( (lv_podEnv_35_0= ruleEPodEnv ) )
                    // InternalDomijmasdsl.g:2392:5: (lv_podEnv_35_0= ruleEPodEnv )
                    {
                    // InternalDomijmasdsl.g:2392:5: (lv_podEnv_35_0= ruleEPodEnv )
                    // InternalDomijmasdsl.g:2393:6: lv_podEnv_35_0= ruleEPodEnv
                    {

                    						newCompositeNode(grammarAccess.getVectorCollectionAccess().getPodEnvEPodEnvEnumRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_podEnv_35_0=ruleEPodEnv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorCollectionRule());
                    						}
                    						set(
                    							current,
                    							"podEnv",
                    							lv_podEnv_35_0,
                    							"org.xtext.example.domij.Domijmasdsl.EPodEnv");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorCollection"


    // $ANTLR start "entryRulePartition"
    // InternalDomijmasdsl.g:2415:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalDomijmasdsl.g:2415:50: (iv_rulePartition= rulePartition EOF )
            // InternalDomijmasdsl.g:2416:2: iv_rulePartition= rulePartition EOF
            {
             newCompositeNode(grammarAccess.getPartitionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePartition=rulePartition();

            state._fsp--;

             current =iv_rulePartition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePartition"


    // $ANTLR start "rulePartition"
    // InternalDomijmasdsl.g:2422:1: rulePartition returns [EObject current=null] : (otherlv_0= 'PARTITION' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'FOR' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= 'partition' otherlv_8= 'key' otherlv_9= '=' ( ( ruleEString ) ) ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:2428:2: ( (otherlv_0= 'PARTITION' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'FOR' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= 'partition' otherlv_8= 'key' otherlv_9= '=' ( ( ruleEString ) ) ) )
            // InternalDomijmasdsl.g:2429:2: (otherlv_0= 'PARTITION' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'FOR' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= 'partition' otherlv_8= 'key' otherlv_9= '=' ( ( ruleEString ) ) )
            {
            // InternalDomijmasdsl.g:2429:2: (otherlv_0= 'PARTITION' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'FOR' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= 'partition' otherlv_8= 'key' otherlv_9= '=' ( ( ruleEString ) ) )
            // InternalDomijmasdsl.g:2430:3: otherlv_0= 'PARTITION' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'FOR' ( ( ruleEString ) ) (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= 'partition' otherlv_8= 'key' otherlv_9= '=' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getPartitionAccess().getPARTITIONKeyword_0());
            		
            // InternalDomijmasdsl.g:2434:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDomijmasdsl.g:2435:4: (lv_name_1_0= ruleEString )
            {
            // InternalDomijmasdsl.g:2435:4: (lv_name_1_0= ruleEString )
            // InternalDomijmasdsl.g:2436:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPartitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPartitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPartitionAccess().getFORKeyword_2());
            		
            // InternalDomijmasdsl.g:2457:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:2458:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:2458:4: ( ruleEString )
            // InternalDomijmasdsl.g:2459:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPartitionAccess().getColPartOwnerVectorCollectionCrossReference_3_0());
            				
            pushFollow(FOLLOW_69);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:2473:3: (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDomijmasdsl.g:2474:4: otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getPartitionAccess().getDescriptionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getPartitionAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalDomijmasdsl.g:2482:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalDomijmasdsl.g:2483:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2483:5: (lv_description_6_0= ruleEString )
                    // InternalDomijmasdsl.g:2484:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPartitionAccess().getDescriptionEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPartitionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,62,FOLLOW_71); 

            			newLeafNode(otherlv_7, grammarAccess.getPartitionAccess().getPartitionKeyword_5());
            		
            otherlv_8=(Token)match(input,63,FOLLOW_25); 

            			newLeafNode(otherlv_8, grammarAccess.getPartitionAccess().getKeyKeyword_6());
            		
            otherlv_9=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getPartitionAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:2514:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:2515:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:2515:4: ( ruleEString )
            // InternalDomijmasdsl.g:2516:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPartitionAccess().getPartitionKeyFieldCrossReference_8_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePartition"


    // $ANTLR start "entryRuleEmbeddingModel"
    // InternalDomijmasdsl.g:2534:1: entryRuleEmbeddingModel returns [EObject current=null] : iv_ruleEmbeddingModel= ruleEmbeddingModel EOF ;
    public final EObject entryRuleEmbeddingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmbeddingModel = null;


        try {
            // InternalDomijmasdsl.g:2534:55: (iv_ruleEmbeddingModel= ruleEmbeddingModel EOF )
            // InternalDomijmasdsl.g:2535:2: iv_ruleEmbeddingModel= ruleEmbeddingModel EOF
            {
             newCompositeNode(grammarAccess.getEmbeddingModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmbeddingModel=ruleEmbeddingModel();

            state._fsp--;

             current =iv_ruleEmbeddingModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmbeddingModel"


    // $ANTLR start "ruleEmbeddingModel"
    // InternalDomijmasdsl.g:2541:1: ruleEmbeddingModel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= '=' ( (lv_description_4_0= ruleEString ) ) )? ) ;
    public final EObject ruleEmbeddingModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:2547:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= '=' ( (lv_description_4_0= ruleEString ) ) )? ) )
            // InternalDomijmasdsl.g:2548:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= '=' ( (lv_description_4_0= ruleEString ) ) )? )
            {
            // InternalDomijmasdsl.g:2548:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= '=' ( (lv_description_4_0= ruleEString ) ) )? )
            // InternalDomijmasdsl.g:2549:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'description' otherlv_3= '=' ( (lv_description_4_0= ruleEString ) ) )?
            {
            // InternalDomijmasdsl.g:2549:3: ()
            // InternalDomijmasdsl.g:2550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmbeddingModelAccess().getEmbeddingModelAction_0(),
            					current);
            			

            }

            // InternalDomijmasdsl.g:2556:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDomijmasdsl.g:2557:4: (lv_name_1_0= ruleEString )
            {
            // InternalDomijmasdsl.g:2557:4: (lv_name_1_0= ruleEString )
            // InternalDomijmasdsl.g:2558:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEmbeddingModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_72);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEmbeddingModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:2575:3: (otherlv_2= 'description' otherlv_3= '=' ( (lv_description_4_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDomijmasdsl.g:2576:4: otherlv_2= 'description' otherlv_3= '=' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getEmbeddingModelAccess().getDescriptionKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmbeddingModelAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalDomijmasdsl.g:2584:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalDomijmasdsl.g:2585:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2585:5: (lv_description_4_0= ruleEString )
                    // InternalDomijmasdsl.g:2586:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEmbeddingModelAccess().getDescriptionEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmbeddingModelRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmbeddingModel"


    // $ANTLR start "entryRuleFieldLimit"
    // InternalDomijmasdsl.g:2608:1: entryRuleFieldLimit returns [EObject current=null] : iv_ruleFieldLimit= ruleFieldLimit EOF ;
    public final EObject entryRuleFieldLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldLimit = null;


        try {
            // InternalDomijmasdsl.g:2608:51: (iv_ruleFieldLimit= ruleFieldLimit EOF )
            // InternalDomijmasdsl.g:2609:2: iv_ruleFieldLimit= ruleFieldLimit EOF
            {
             newCompositeNode(grammarAccess.getFieldLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldLimit=ruleFieldLimit();

            state._fsp--;

             current =iv_ruleFieldLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldLimit"


    // $ANTLR start "ruleFieldLimit"
    // InternalDomijmasdsl.g:2615:1: ruleFieldLimit returns [EObject current=null] : (otherlv_0= 'FIELD' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEFieldLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) ;
    public final EObject ruleFieldLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_description_11_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:2621:2: ( (otherlv_0= 'FIELD' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEFieldLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) )
            // InternalDomijmasdsl.g:2622:2: (otherlv_0= 'FIELD' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEFieldLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            {
            // InternalDomijmasdsl.g:2622:2: (otherlv_0= 'FIELD' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEFieldLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            // InternalDomijmasdsl.g:2623:3: otherlv_0= 'FIELD' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEFieldLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,64,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldLimitAccess().getFIELDKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldLimitAccess().getLIMITKeyword_1());
            		
            // InternalDomijmasdsl.g:2631:3: ( (lv_name_2_0= ruleEString ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDomijmasdsl.g:2632:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2632:4: (lv_name_2_0= ruleEString )
                    // InternalDomijmasdsl.g:2633:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getFieldLimitAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_75);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFieldLimitRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.domij.Domijmasdsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldLimitAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_76); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldLimitAccess().getEqualsSignKeyword_4());
            		
            // InternalDomijmasdsl.g:2658:3: ( (lv_type_5_0= ruleEFieldLimit ) )
            // InternalDomijmasdsl.g:2659:4: (lv_type_5_0= ruleEFieldLimit )
            {
            // InternalDomijmasdsl.g:2659:4: (lv_type_5_0= ruleEFieldLimit )
            // InternalDomijmasdsl.g:2660:5: lv_type_5_0= ruleEFieldLimit
            {

            					newCompositeNode(grammarAccess.getFieldLimitAccess().getTypeEFieldLimitEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_77);
            lv_type_5_0=ruleEFieldLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldLimitRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.example.domij.Domijmasdsl.EFieldLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,67,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getFieldLimitAccess().getValueKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getFieldLimitAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:2685:3: ( (lv_value_8_0= ruleEString ) )
            // InternalDomijmasdsl.g:2686:4: (lv_value_8_0= ruleEString )
            {
            // InternalDomijmasdsl.g:2686:4: (lv_value_8_0= ruleEString )
            // InternalDomijmasdsl.g:2687:5: lv_value_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldLimitAccess().getValueEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_72);
            lv_value_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldLimitRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:2704:3: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDomijmasdsl.g:2705:4: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getFieldLimitAccess().getDescriptionKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getFieldLimitAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalDomijmasdsl.g:2713:4: ( (lv_description_11_0= ruleEString ) )
                    // InternalDomijmasdsl.g:2714:5: (lv_description_11_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2714:5: (lv_description_11_0= ruleEString )
                    // InternalDomijmasdsl.g:2715:6: lv_description_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getFieldLimitAccess().getDescriptionEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldLimitRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_11_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldLimit"


    // $ANTLR start "entryRuleCollectionLimit"
    // InternalDomijmasdsl.g:2737:1: entryRuleCollectionLimit returns [EObject current=null] : iv_ruleCollectionLimit= ruleCollectionLimit EOF ;
    public final EObject entryRuleCollectionLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLimit = null;


        try {
            // InternalDomijmasdsl.g:2737:56: (iv_ruleCollectionLimit= ruleCollectionLimit EOF )
            // InternalDomijmasdsl.g:2738:2: iv_ruleCollectionLimit= ruleCollectionLimit EOF
            {
             newCompositeNode(grammarAccess.getCollectionLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLimit=ruleCollectionLimit();

            state._fsp--;

             current =iv_ruleCollectionLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLimit"


    // $ANTLR start "ruleCollectionLimit"
    // InternalDomijmasdsl.g:2744:1: ruleCollectionLimit returns [EObject current=null] : (otherlv_0= 'COLLECTION' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEColectionLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) ;
    public final EObject ruleCollectionLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_description_11_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:2750:2: ( (otherlv_0= 'COLLECTION' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEColectionLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) )
            // InternalDomijmasdsl.g:2751:2: (otherlv_0= 'COLLECTION' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEColectionLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            {
            // InternalDomijmasdsl.g:2751:2: (otherlv_0= 'COLLECTION' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEColectionLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            // InternalDomijmasdsl.g:2752:3: otherlv_0= 'COLLECTION' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEColectionLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionLimitAccess().getCOLLECTIONKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionLimitAccess().getLIMITKeyword_1());
            		
            // InternalDomijmasdsl.g:2760:3: ( (lv_name_2_0= ruleEString ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDomijmasdsl.g:2761:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2761:4: (lv_name_2_0= ruleEString )
                    // InternalDomijmasdsl.g:2762:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getCollectionLimitAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_75);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCollectionLimitRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.domij.Domijmasdsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionLimitAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_78); 

            			newLeafNode(otherlv_4, grammarAccess.getCollectionLimitAccess().getEqualsSignKeyword_4());
            		
            // InternalDomijmasdsl.g:2787:3: ( (lv_type_5_0= ruleEColectionLimit ) )
            // InternalDomijmasdsl.g:2788:4: (lv_type_5_0= ruleEColectionLimit )
            {
            // InternalDomijmasdsl.g:2788:4: (lv_type_5_0= ruleEColectionLimit )
            // InternalDomijmasdsl.g:2789:5: lv_type_5_0= ruleEColectionLimit
            {

            					newCompositeNode(grammarAccess.getCollectionLimitAccess().getTypeEColectionLimitEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_77);
            lv_type_5_0=ruleEColectionLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLimitRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.example.domij.Domijmasdsl.EColectionLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,67,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getCollectionLimitAccess().getValueKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getCollectionLimitAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:2814:3: ( (lv_value_8_0= ruleEString ) )
            // InternalDomijmasdsl.g:2815:4: (lv_value_8_0= ruleEString )
            {
            // InternalDomijmasdsl.g:2815:4: (lv_value_8_0= ruleEString )
            // InternalDomijmasdsl.g:2816:5: lv_value_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCollectionLimitAccess().getValueEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_72);
            lv_value_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLimitRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:2833:3: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==50) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDomijmasdsl.g:2834:4: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getCollectionLimitAccess().getDescriptionKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getCollectionLimitAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalDomijmasdsl.g:2842:4: ( (lv_description_11_0= ruleEString ) )
                    // InternalDomijmasdsl.g:2843:5: (lv_description_11_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2843:5: (lv_description_11_0= ruleEString )
                    // InternalDomijmasdsl.g:2844:6: lv_description_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCollectionLimitAccess().getDescriptionEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollectionLimitRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_11_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLimit"


    // $ANTLR start "entryRuleClusterLimit"
    // InternalDomijmasdsl.g:2866:1: entryRuleClusterLimit returns [EObject current=null] : iv_ruleClusterLimit= ruleClusterLimit EOF ;
    public final EObject entryRuleClusterLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClusterLimit = null;


        try {
            // InternalDomijmasdsl.g:2866:53: (iv_ruleClusterLimit= ruleClusterLimit EOF )
            // InternalDomijmasdsl.g:2867:2: iv_ruleClusterLimit= ruleClusterLimit EOF
            {
             newCompositeNode(grammarAccess.getClusterLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClusterLimit=ruleClusterLimit();

            state._fsp--;

             current =iv_ruleClusterLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClusterLimit"


    // $ANTLR start "ruleClusterLimit"
    // InternalDomijmasdsl.g:2873:1: ruleClusterLimit returns [EObject current=null] : (otherlv_0= 'CLUSTER' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEClusterLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) ;
    public final EObject ruleClusterLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_description_11_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:2879:2: ( (otherlv_0= 'CLUSTER' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEClusterLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) )
            // InternalDomijmasdsl.g:2880:2: (otherlv_0= 'CLUSTER' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEClusterLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            {
            // InternalDomijmasdsl.g:2880:2: (otherlv_0= 'CLUSTER' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEClusterLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            // InternalDomijmasdsl.g:2881:3: otherlv_0= 'CLUSTER' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEClusterLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getClusterLimitAccess().getCLUSTERKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getClusterLimitAccess().getLIMITKeyword_1());
            		
            // InternalDomijmasdsl.g:2889:3: ( (lv_name_2_0= ruleEString ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_ID)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDomijmasdsl.g:2890:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2890:4: (lv_name_2_0= ruleEString )
                    // InternalDomijmasdsl.g:2891:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getClusterLimitAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_75);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterLimitRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.domij.Domijmasdsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getClusterLimitAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_79); 

            			newLeafNode(otherlv_4, grammarAccess.getClusterLimitAccess().getEqualsSignKeyword_4());
            		
            // InternalDomijmasdsl.g:2916:3: ( (lv_type_5_0= ruleEClusterLimit ) )
            // InternalDomijmasdsl.g:2917:4: (lv_type_5_0= ruleEClusterLimit )
            {
            // InternalDomijmasdsl.g:2917:4: (lv_type_5_0= ruleEClusterLimit )
            // InternalDomijmasdsl.g:2918:5: lv_type_5_0= ruleEClusterLimit
            {

            					newCompositeNode(grammarAccess.getClusterLimitAccess().getTypeEClusterLimitEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_77);
            lv_type_5_0=ruleEClusterLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClusterLimitRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.example.domij.Domijmasdsl.EClusterLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,67,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getClusterLimitAccess().getValueKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getClusterLimitAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:2943:3: ( (lv_value_8_0= ruleEString ) )
            // InternalDomijmasdsl.g:2944:4: (lv_value_8_0= ruleEString )
            {
            // InternalDomijmasdsl.g:2944:4: (lv_value_8_0= ruleEString )
            // InternalDomijmasdsl.g:2945:5: lv_value_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClusterLimitAccess().getValueEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_72);
            lv_value_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClusterLimitRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:2962:3: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==50) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDomijmasdsl.g:2963:4: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getClusterLimitAccess().getDescriptionKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getClusterLimitAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalDomijmasdsl.g:2971:4: ( (lv_description_11_0= ruleEString ) )
                    // InternalDomijmasdsl.g:2972:5: (lv_description_11_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:2972:5: (lv_description_11_0= ruleEString )
                    // InternalDomijmasdsl.g:2973:6: lv_description_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClusterLimitAccess().getDescriptionEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClusterLimitRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_11_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClusterLimit"


    // $ANTLR start "entryRuleIndexLimit"
    // InternalDomijmasdsl.g:2995:1: entryRuleIndexLimit returns [EObject current=null] : iv_ruleIndexLimit= ruleIndexLimit EOF ;
    public final EObject entryRuleIndexLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexLimit = null;


        try {
            // InternalDomijmasdsl.g:2995:51: (iv_ruleIndexLimit= ruleIndexLimit EOF )
            // InternalDomijmasdsl.g:2996:2: iv_ruleIndexLimit= ruleIndexLimit EOF
            {
             newCompositeNode(grammarAccess.getIndexLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexLimit=ruleIndexLimit();

            state._fsp--;

             current =iv_ruleIndexLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexLimit"


    // $ANTLR start "ruleIndexLimit"
    // InternalDomijmasdsl.g:3002:1: ruleIndexLimit returns [EObject current=null] : (otherlv_0= 'INDEX' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEIndexLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) ;
    public final EObject ruleIndexLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_description_11_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:3008:2: ( (otherlv_0= 'INDEX' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEIndexLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? ) )
            // InternalDomijmasdsl.g:3009:2: (otherlv_0= 'INDEX' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEIndexLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            {
            // InternalDomijmasdsl.g:3009:2: (otherlv_0= 'INDEX' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEIndexLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )? )
            // InternalDomijmasdsl.g:3010:3: otherlv_0= 'INDEX' otherlv_1= 'LIMIT' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleEIndexLimit ) ) otherlv_6= 'value' otherlv_7= '=' ( (lv_value_8_0= ruleEString ) ) (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexLimitAccess().getINDEXKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getIndexLimitAccess().getLIMITKeyword_1());
            		
            // InternalDomijmasdsl.g:3018:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomijmasdsl.g:3019:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomijmasdsl.g:3019:4: (lv_name_2_0= ruleEString )
            // InternalDomijmasdsl.g:3020:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndexLimitAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_75);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexLimitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getIndexLimitAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_80); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexLimitAccess().getEqualsSignKeyword_4());
            		
            // InternalDomijmasdsl.g:3045:3: ( (lv_type_5_0= ruleEIndexLimit ) )
            // InternalDomijmasdsl.g:3046:4: (lv_type_5_0= ruleEIndexLimit )
            {
            // InternalDomijmasdsl.g:3046:4: (lv_type_5_0= ruleEIndexLimit )
            // InternalDomijmasdsl.g:3047:5: lv_type_5_0= ruleEIndexLimit
            {

            					newCompositeNode(grammarAccess.getIndexLimitAccess().getTypeEIndexLimitEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_77);
            lv_type_5_0=ruleEIndexLimit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexLimitRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.example.domij.Domijmasdsl.EIndexLimit");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,67,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getIndexLimitAccess().getValueKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getIndexLimitAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:3072:3: ( (lv_value_8_0= ruleEString ) )
            // InternalDomijmasdsl.g:3073:4: (lv_value_8_0= ruleEString )
            {
            // InternalDomijmasdsl.g:3073:4: (lv_value_8_0= ruleEString )
            // InternalDomijmasdsl.g:3074:5: lv_value_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIndexLimitAccess().getValueEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_72);
            lv_value_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexLimitRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:3091:3: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalDomijmasdsl.g:3092:4: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getIndexLimitAccess().getDescriptionKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getIndexLimitAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalDomijmasdsl.g:3100:4: ( (lv_description_11_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3101:5: (lv_description_11_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3101:5: (lv_description_11_0= ruleEString )
                    // InternalDomijmasdsl.g:3102:6: lv_description_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIndexLimitAccess().getDescriptionEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIndexLimitRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_11_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexLimit"


    // $ANTLR start "entryRuleVectorIndex"
    // InternalDomijmasdsl.g:3124:1: entryRuleVectorIndex returns [EObject current=null] : iv_ruleVectorIndex= ruleVectorIndex EOF ;
    public final EObject entryRuleVectorIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorIndex = null;


        try {
            // InternalDomijmasdsl.g:3124:52: (iv_ruleVectorIndex= ruleVectorIndex EOF )
            // InternalDomijmasdsl.g:3125:2: iv_ruleVectorIndex= ruleVectorIndex EOF
            {
             newCompositeNode(grammarAccess.getVectorIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVectorIndex=ruleVectorIndex();

            state._fsp--;

             current =iv_ruleVectorIndex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorIndex"


    // $ANTLR start "ruleVectorIndex"
    // InternalDomijmasdsl.g:3131:1: ruleVectorIndex returns [EObject current=null] : (otherlv_0= 'VECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? (otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'metric' otherlv_7= '=' ( (lv_metric_8_0= ruleEMetricType ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= ruleEVIdxType ) ) (otherlv_12= 'WITH' otherlv_13= 'LIMITS' otherlv_14= '[' ( (lv_vIndexLimits_15_0= ruleIndexLimit ) ) ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )* otherlv_17= ']' )? ) ;
    public final EObject ruleVectorIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_metric_8_0 = null;

        Enumerator lv_type_11_0 = null;

        EObject lv_vIndexLimits_15_0 = null;

        EObject lv_vIndexLimits_16_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:3137:2: ( (otherlv_0= 'VECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? (otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'metric' otherlv_7= '=' ( (lv_metric_8_0= ruleEMetricType ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= ruleEVIdxType ) ) (otherlv_12= 'WITH' otherlv_13= 'LIMITS' otherlv_14= '[' ( (lv_vIndexLimits_15_0= ruleIndexLimit ) ) ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )* otherlv_17= ']' )? ) )
            // InternalDomijmasdsl.g:3138:2: (otherlv_0= 'VECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? (otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'metric' otherlv_7= '=' ( (lv_metric_8_0= ruleEMetricType ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= ruleEVIdxType ) ) (otherlv_12= 'WITH' otherlv_13= 'LIMITS' otherlv_14= '[' ( (lv_vIndexLimits_15_0= ruleIndexLimit ) ) ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )* otherlv_17= ']' )? )
            {
            // InternalDomijmasdsl.g:3138:2: (otherlv_0= 'VECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? (otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'metric' otherlv_7= '=' ( (lv_metric_8_0= ruleEMetricType ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= ruleEVIdxType ) ) (otherlv_12= 'WITH' otherlv_13= 'LIMITS' otherlv_14= '[' ( (lv_vIndexLimits_15_0= ruleIndexLimit ) ) ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )* otherlv_17= ']' )? )
            // InternalDomijmasdsl.g:3139:3: otherlv_0= 'VECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? (otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'metric' otherlv_7= '=' ( (lv_metric_8_0= ruleEMetricType ) ) otherlv_9= 'type' otherlv_10= '=' ( (lv_type_11_0= ruleEVIdxType ) ) (otherlv_12= 'WITH' otherlv_13= 'LIMITS' otherlv_14= '[' ( (lv_vIndexLimits_15_0= ruleIndexLimit ) ) ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )* otherlv_17= ']' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_81); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorIndexAccess().getVECTORKeyword_0());
            		
            otherlv_1=(Token)match(input,68,FOLLOW_82); 

            			newLeafNode(otherlv_1, grammarAccess.getVectorIndexAccess().getINDEXKeyword_1());
            		
            // InternalDomijmasdsl.g:3147:3: ( (lv_name_2_0= ruleEString ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDomijmasdsl.g:3148:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3148:4: (lv_name_2_0= ruleEString )
                    // InternalDomijmasdsl.g:3149:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getVectorIndexAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_83);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVectorIndexRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.domij.Domijmasdsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3166:3: (otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==50) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalDomijmasdsl.g:3167:4: otherlv_3= 'description' otherlv_4= '=' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getVectorIndexAccess().getDescriptionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getVectorIndexAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalDomijmasdsl.g:3175:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3176:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3176:5: (lv_description_5_0= ruleEString )
                    // InternalDomijmasdsl.g:3177:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVectorIndexAccess().getDescriptionEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorIndexRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getVectorIndexAccess().getMetricKeyword_4());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getVectorIndexAccess().getEqualsSignKeyword_5());
            		
            // InternalDomijmasdsl.g:3203:3: ( (lv_metric_8_0= ruleEMetricType ) )
            // InternalDomijmasdsl.g:3204:4: (lv_metric_8_0= ruleEMetricType )
            {
            // InternalDomijmasdsl.g:3204:4: (lv_metric_8_0= ruleEMetricType )
            // InternalDomijmasdsl.g:3205:5: lv_metric_8_0= ruleEMetricType
            {

            					newCompositeNode(grammarAccess.getVectorIndexAccess().getMetricEMetricTypeEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_75);
            lv_metric_8_0=ruleEMetricType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorIndexRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EMetricType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_9, grammarAccess.getVectorIndexAccess().getTypeKeyword_7());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_84); 

            			newLeafNode(otherlv_10, grammarAccess.getVectorIndexAccess().getEqualsSignKeyword_8());
            		
            // InternalDomijmasdsl.g:3230:3: ( (lv_type_11_0= ruleEVIdxType ) )
            // InternalDomijmasdsl.g:3231:4: (lv_type_11_0= ruleEVIdxType )
            {
            // InternalDomijmasdsl.g:3231:4: (lv_type_11_0= ruleEVIdxType )
            // InternalDomijmasdsl.g:3232:5: lv_type_11_0= ruleEVIdxType
            {

            					newCompositeNode(grammarAccess.getVectorIndexAccess().getTypeEVIdxTypeEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_11_0=ruleEVIdxType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorIndexRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_11_0,
            						"org.xtext.example.domij.Domijmasdsl.EVIdxType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:3249:3: (otherlv_12= 'WITH' otherlv_13= 'LIMITS' otherlv_14= '[' ( (lv_vIndexLimits_15_0= ruleIndexLimit ) ) ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )* otherlv_17= ']' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==13) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDomijmasdsl.g:3250:4: otherlv_12= 'WITH' otherlv_13= 'LIMITS' otherlv_14= '[' ( (lv_vIndexLimits_15_0= ruleIndexLimit ) ) ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )* otherlv_17= ']'
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_56); 

                    				newLeafNode(otherlv_12, grammarAccess.getVectorIndexAccess().getWITHKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getVectorIndexAccess().getLIMITSKeyword_10_1());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_81); 

                    				newLeafNode(otherlv_14, grammarAccess.getVectorIndexAccess().getLeftSquareBracketKeyword_10_2());
                    			
                    // InternalDomijmasdsl.g:3262:4: ( (lv_vIndexLimits_15_0= ruleIndexLimit ) )
                    // InternalDomijmasdsl.g:3263:5: (lv_vIndexLimits_15_0= ruleIndexLimit )
                    {
                    // InternalDomijmasdsl.g:3263:5: (lv_vIndexLimits_15_0= ruleIndexLimit )
                    // InternalDomijmasdsl.g:3264:6: lv_vIndexLimits_15_0= ruleIndexLimit
                    {

                    						newCompositeNode(grammarAccess.getVectorIndexAccess().getVIndexLimitsIndexLimitParserRuleCall_10_3_0());
                    					
                    pushFollow(FOLLOW_85);
                    lv_vIndexLimits_15_0=ruleIndexLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorIndexRule());
                    						}
                    						add(
                    							current,
                    							"vIndexLimits",
                    							lv_vIndexLimits_15_0,
                    							"org.xtext.example.domij.Domijmasdsl.IndexLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:3281:4: ( (lv_vIndexLimits_16_0= ruleIndexLimit ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==68) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:3282:5: (lv_vIndexLimits_16_0= ruleIndexLimit )
                    	    {
                    	    // InternalDomijmasdsl.g:3282:5: (lv_vIndexLimits_16_0= ruleIndexLimit )
                    	    // InternalDomijmasdsl.g:3283:6: lv_vIndexLimits_16_0= ruleIndexLimit
                    	    {

                    	    						newCompositeNode(grammarAccess.getVectorIndexAccess().getVIndexLimitsIndexLimitParserRuleCall_10_4_0());
                    	    					
                    	    pushFollow(FOLLOW_85);
                    	    lv_vIndexLimits_16_0=ruleIndexLimit();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVectorIndexRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"vIndexLimits",
                    	    							lv_vIndexLimits_16_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.IndexLimit");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getVectorIndexAccess().getRightSquareBracketKeyword_10_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorIndex"


    // $ANTLR start "entryRuleNonVectorIndex"
    // InternalDomijmasdsl.g:3309:1: entryRuleNonVectorIndex returns [EObject current=null] : iv_ruleNonVectorIndex= ruleNonVectorIndex EOF ;
    public final EObject entryRuleNonVectorIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonVectorIndex = null;


        try {
            // InternalDomijmasdsl.g:3309:55: (iv_ruleNonVectorIndex= ruleNonVectorIndex EOF )
            // InternalDomijmasdsl.g:3310:2: iv_ruleNonVectorIndex= ruleNonVectorIndex EOF
            {
             newCompositeNode(grammarAccess.getNonVectorIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonVectorIndex=ruleNonVectorIndex();

            state._fsp--;

             current =iv_ruleNonVectorIndex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonVectorIndex"


    // $ANTLR start "ruleNonVectorIndex"
    // InternalDomijmasdsl.g:3316:1: ruleNonVectorIndex returns [EObject current=null] : (otherlv_0= 'NONVECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleENVIdxType ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? ) ;
    public final EObject ruleNonVectorIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:3322:2: ( (otherlv_0= 'NONVECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleENVIdxType ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? ) )
            // InternalDomijmasdsl.g:3323:2: (otherlv_0= 'NONVECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleENVIdxType ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? )
            {
            // InternalDomijmasdsl.g:3323:2: (otherlv_0= 'NONVECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleENVIdxType ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )? )
            // InternalDomijmasdsl.g:3324:3: otherlv_0= 'NONVECTOR' otherlv_1= 'INDEX' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleENVIdxType ) ) (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_81); 

            			newLeafNode(otherlv_0, grammarAccess.getNonVectorIndexAccess().getNONVECTORKeyword_0());
            		
            otherlv_1=(Token)match(input,68,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getNonVectorIndexAccess().getINDEXKeyword_1());
            		
            // InternalDomijmasdsl.g:3332:3: ( (lv_name_2_0= ruleEString ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_ID)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDomijmasdsl.g:3333:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3333:4: (lv_name_2_0= ruleEString )
                    // InternalDomijmasdsl.g:3334:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getNonVectorIndexAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_75);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonVectorIndexRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.domij.Domijmasdsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getNonVectorIndexAccess().getTypeKeyword_3());
            		
            otherlv_4=(Token)match(input,28,FOLLOW_86); 

            			newLeafNode(otherlv_4, grammarAccess.getNonVectorIndexAccess().getEqualsSignKeyword_4());
            		
            // InternalDomijmasdsl.g:3359:3: ( (lv_type_5_0= ruleENVIdxType ) )
            // InternalDomijmasdsl.g:3360:4: (lv_type_5_0= ruleENVIdxType )
            {
            // InternalDomijmasdsl.g:3360:4: (lv_type_5_0= ruleENVIdxType )
            // InternalDomijmasdsl.g:3361:5: lv_type_5_0= ruleENVIdxType
            {

            					newCompositeNode(grammarAccess.getNonVectorIndexAccess().getTypeENVIdxTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_72);
            lv_type_5_0=ruleENVIdxType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonVectorIndexRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"org.xtext.example.domij.Domijmasdsl.ENVIdxType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:3378:3: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==50) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalDomijmasdsl.g:3379:4: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getNonVectorIndexAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getNonVectorIndexAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalDomijmasdsl.g:3387:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3388:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3388:5: (lv_description_8_0= ruleEString )
                    // InternalDomijmasdsl.g:3389:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNonVectorIndexAccess().getDescriptionEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonVectorIndexRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonVectorIndex"


    // $ANTLR start "entryRuleConnection"
    // InternalDomijmasdsl.g:3411:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalDomijmasdsl.g:3411:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalDomijmasdsl.g:3412:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalDomijmasdsl.g:3418:1: ruleConnection returns [EObject current=null] : (otherlv_0= 'CONNECTION' otherlv_1= 'host' otherlv_2= '=' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= '=' ( (lv_port_6_0= ruleEInt ) ) (otherlv_7= 'apiKey' otherlv_8= '=' ( (lv_apiKey_9_0= ruleEString ) ) )? (otherlv_10= 'username' otherlv_11= '=' ( (lv_username_12_0= ruleEString ) ) )? (otherlv_13= 'password' otherlv_14= '=' ( (lv_password_15_0= ruleEString ) ) )? (otherlv_16= 'region' otherlv_17= '=' ( (lv_region_18_0= ruleEString ) ) )? (otherlv_19= 'userRole' otherlv_20= '=' ( (lv_userRole_21_0= ruleEString ) ) )? (otherlv_22= 'userPrivillege' otherlv_23= '=' ( (lv_userPrivillege_24_0= ruleEString ) ) )? (otherlv_25= 'cloud' otherlv_26= '=' ( (lv_cloud_27_0= ruleEString ) ) )? (otherlv_28= 'environment' otherlv_29= '=' ( (lv_environment_30_0= ruleEString ) ) )? ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_host_3_0 = null;

        AntlrDatatypeRuleToken lv_port_6_0 = null;

        AntlrDatatypeRuleToken lv_apiKey_9_0 = null;

        AntlrDatatypeRuleToken lv_username_12_0 = null;

        AntlrDatatypeRuleToken lv_password_15_0 = null;

        AntlrDatatypeRuleToken lv_region_18_0 = null;

        AntlrDatatypeRuleToken lv_userRole_21_0 = null;

        AntlrDatatypeRuleToken lv_userPrivillege_24_0 = null;

        AntlrDatatypeRuleToken lv_cloud_27_0 = null;

        AntlrDatatypeRuleToken lv_environment_30_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:3424:2: ( (otherlv_0= 'CONNECTION' otherlv_1= 'host' otherlv_2= '=' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= '=' ( (lv_port_6_0= ruleEInt ) ) (otherlv_7= 'apiKey' otherlv_8= '=' ( (lv_apiKey_9_0= ruleEString ) ) )? (otherlv_10= 'username' otherlv_11= '=' ( (lv_username_12_0= ruleEString ) ) )? (otherlv_13= 'password' otherlv_14= '=' ( (lv_password_15_0= ruleEString ) ) )? (otherlv_16= 'region' otherlv_17= '=' ( (lv_region_18_0= ruleEString ) ) )? (otherlv_19= 'userRole' otherlv_20= '=' ( (lv_userRole_21_0= ruleEString ) ) )? (otherlv_22= 'userPrivillege' otherlv_23= '=' ( (lv_userPrivillege_24_0= ruleEString ) ) )? (otherlv_25= 'cloud' otherlv_26= '=' ( (lv_cloud_27_0= ruleEString ) ) )? (otherlv_28= 'environment' otherlv_29= '=' ( (lv_environment_30_0= ruleEString ) ) )? ) )
            // InternalDomijmasdsl.g:3425:2: (otherlv_0= 'CONNECTION' otherlv_1= 'host' otherlv_2= '=' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= '=' ( (lv_port_6_0= ruleEInt ) ) (otherlv_7= 'apiKey' otherlv_8= '=' ( (lv_apiKey_9_0= ruleEString ) ) )? (otherlv_10= 'username' otherlv_11= '=' ( (lv_username_12_0= ruleEString ) ) )? (otherlv_13= 'password' otherlv_14= '=' ( (lv_password_15_0= ruleEString ) ) )? (otherlv_16= 'region' otherlv_17= '=' ( (lv_region_18_0= ruleEString ) ) )? (otherlv_19= 'userRole' otherlv_20= '=' ( (lv_userRole_21_0= ruleEString ) ) )? (otherlv_22= 'userPrivillege' otherlv_23= '=' ( (lv_userPrivillege_24_0= ruleEString ) ) )? (otherlv_25= 'cloud' otherlv_26= '=' ( (lv_cloud_27_0= ruleEString ) ) )? (otherlv_28= 'environment' otherlv_29= '=' ( (lv_environment_30_0= ruleEString ) ) )? )
            {
            // InternalDomijmasdsl.g:3425:2: (otherlv_0= 'CONNECTION' otherlv_1= 'host' otherlv_2= '=' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= '=' ( (lv_port_6_0= ruleEInt ) ) (otherlv_7= 'apiKey' otherlv_8= '=' ( (lv_apiKey_9_0= ruleEString ) ) )? (otherlv_10= 'username' otherlv_11= '=' ( (lv_username_12_0= ruleEString ) ) )? (otherlv_13= 'password' otherlv_14= '=' ( (lv_password_15_0= ruleEString ) ) )? (otherlv_16= 'region' otherlv_17= '=' ( (lv_region_18_0= ruleEString ) ) )? (otherlv_19= 'userRole' otherlv_20= '=' ( (lv_userRole_21_0= ruleEString ) ) )? (otherlv_22= 'userPrivillege' otherlv_23= '=' ( (lv_userPrivillege_24_0= ruleEString ) ) )? (otherlv_25= 'cloud' otherlv_26= '=' ( (lv_cloud_27_0= ruleEString ) ) )? (otherlv_28= 'environment' otherlv_29= '=' ( (lv_environment_30_0= ruleEString ) ) )? )
            // InternalDomijmasdsl.g:3426:3: otherlv_0= 'CONNECTION' otherlv_1= 'host' otherlv_2= '=' ( (lv_host_3_0= ruleEString ) ) otherlv_4= 'port' otherlv_5= '=' ( (lv_port_6_0= ruleEInt ) ) (otherlv_7= 'apiKey' otherlv_8= '=' ( (lv_apiKey_9_0= ruleEString ) ) )? (otherlv_10= 'username' otherlv_11= '=' ( (lv_username_12_0= ruleEString ) ) )? (otherlv_13= 'password' otherlv_14= '=' ( (lv_password_15_0= ruleEString ) ) )? (otherlv_16= 'region' otherlv_17= '=' ( (lv_region_18_0= ruleEString ) ) )? (otherlv_19= 'userRole' otherlv_20= '=' ( (lv_userRole_21_0= ruleEString ) ) )? (otherlv_22= 'userPrivillege' otherlv_23= '=' ( (lv_userPrivillege_24_0= ruleEString ) ) )? (otherlv_25= 'cloud' otherlv_26= '=' ( (lv_cloud_27_0= ruleEString ) ) )? (otherlv_28= 'environment' otherlv_29= '=' ( (lv_environment_30_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_87); 

            			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getCONNECTIONKeyword_0());
            		
            otherlv_1=(Token)match(input,70,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getHostKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getConnectionAccess().getEqualsSignKeyword_2());
            		
            // InternalDomijmasdsl.g:3438:3: ( (lv_host_3_0= ruleEString ) )
            // InternalDomijmasdsl.g:3439:4: (lv_host_3_0= ruleEString )
            {
            // InternalDomijmasdsl.g:3439:4: (lv_host_3_0= ruleEString )
            // InternalDomijmasdsl.g:3440:5: lv_host_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getHostEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_88);
            lv_host_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"host",
            						lv_host_3_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,71,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getConnectionAccess().getPortKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getEqualsSignKeyword_5());
            		
            // InternalDomijmasdsl.g:3465:3: ( (lv_port_6_0= ruleEInt ) )
            // InternalDomijmasdsl.g:3466:4: (lv_port_6_0= ruleEInt )
            {
            // InternalDomijmasdsl.g:3466:4: (lv_port_6_0= ruleEInt )
            // InternalDomijmasdsl.g:3467:5: lv_port_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getPortEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_89);
            lv_port_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"port",
            						lv_port_6_0,
            						"org.xtext.example.domij.Domijmasdsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:3484:3: (otherlv_7= 'apiKey' otherlv_8= '=' ( (lv_apiKey_9_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==72) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDomijmasdsl.g:3485:4: otherlv_7= 'apiKey' otherlv_8= '=' ( (lv_apiKey_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,72,FOLLOW_25); 

                    				newLeafNode(otherlv_7, grammarAccess.getConnectionAccess().getApiKeyKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getConnectionAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalDomijmasdsl.g:3493:4: ( (lv_apiKey_9_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3494:5: (lv_apiKey_9_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3494:5: (lv_apiKey_9_0= ruleEString )
                    // InternalDomijmasdsl.g:3495:6: lv_apiKey_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getApiKeyEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_90);
                    lv_apiKey_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"apiKey",
                    							lv_apiKey_9_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3513:3: (otherlv_10= 'username' otherlv_11= '=' ( (lv_username_12_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==73) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDomijmasdsl.g:3514:4: otherlv_10= 'username' otherlv_11= '=' ( (lv_username_12_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,73,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getConnectionAccess().getUsernameKeyword_8_0());
                    			
                    otherlv_11=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getConnectionAccess().getEqualsSignKeyword_8_1());
                    			
                    // InternalDomijmasdsl.g:3522:4: ( (lv_username_12_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3523:5: (lv_username_12_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3523:5: (lv_username_12_0= ruleEString )
                    // InternalDomijmasdsl.g:3524:6: lv_username_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getUsernameEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_91);
                    lv_username_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"username",
                    							lv_username_12_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3542:3: (otherlv_13= 'password' otherlv_14= '=' ( (lv_password_15_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==74) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalDomijmasdsl.g:3543:4: otherlv_13= 'password' otherlv_14= '=' ( (lv_password_15_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,74,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getConnectionAccess().getPasswordKeyword_9_0());
                    			
                    otherlv_14=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_14, grammarAccess.getConnectionAccess().getEqualsSignKeyword_9_1());
                    			
                    // InternalDomijmasdsl.g:3551:4: ( (lv_password_15_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3552:5: (lv_password_15_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3552:5: (lv_password_15_0= ruleEString )
                    // InternalDomijmasdsl.g:3553:6: lv_password_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getPasswordEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_92);
                    lv_password_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_15_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3571:3: (otherlv_16= 'region' otherlv_17= '=' ( (lv_region_18_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==75) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDomijmasdsl.g:3572:4: otherlv_16= 'region' otherlv_17= '=' ( (lv_region_18_0= ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,75,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getConnectionAccess().getRegionKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getConnectionAccess().getEqualsSignKeyword_10_1());
                    			
                    // InternalDomijmasdsl.g:3580:4: ( (lv_region_18_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3581:5: (lv_region_18_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3581:5: (lv_region_18_0= ruleEString )
                    // InternalDomijmasdsl.g:3582:6: lv_region_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getRegionEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_region_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"region",
                    							lv_region_18_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3600:3: (otherlv_19= 'userRole' otherlv_20= '=' ( (lv_userRole_21_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==76) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDomijmasdsl.g:3601:4: otherlv_19= 'userRole' otherlv_20= '=' ( (lv_userRole_21_0= ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,76,FOLLOW_25); 

                    				newLeafNode(otherlv_19, grammarAccess.getConnectionAccess().getUserRoleKeyword_11_0());
                    			
                    otherlv_20=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_20, grammarAccess.getConnectionAccess().getEqualsSignKeyword_11_1());
                    			
                    // InternalDomijmasdsl.g:3609:4: ( (lv_userRole_21_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3610:5: (lv_userRole_21_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3610:5: (lv_userRole_21_0= ruleEString )
                    // InternalDomijmasdsl.g:3611:6: lv_userRole_21_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getUserRoleEStringParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_94);
                    lv_userRole_21_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"userRole",
                    							lv_userRole_21_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3629:3: (otherlv_22= 'userPrivillege' otherlv_23= '=' ( (lv_userPrivillege_24_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==77) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDomijmasdsl.g:3630:4: otherlv_22= 'userPrivillege' otherlv_23= '=' ( (lv_userPrivillege_24_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,77,FOLLOW_25); 

                    				newLeafNode(otherlv_22, grammarAccess.getConnectionAccess().getUserPrivillegeKeyword_12_0());
                    			
                    otherlv_23=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_23, grammarAccess.getConnectionAccess().getEqualsSignKeyword_12_1());
                    			
                    // InternalDomijmasdsl.g:3638:4: ( (lv_userPrivillege_24_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3639:5: (lv_userPrivillege_24_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3639:5: (lv_userPrivillege_24_0= ruleEString )
                    // InternalDomijmasdsl.g:3640:6: lv_userPrivillege_24_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getUserPrivillegeEStringParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_95);
                    lv_userPrivillege_24_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"userPrivillege",
                    							lv_userPrivillege_24_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3658:3: (otherlv_25= 'cloud' otherlv_26= '=' ( (lv_cloud_27_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==78) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalDomijmasdsl.g:3659:4: otherlv_25= 'cloud' otherlv_26= '=' ( (lv_cloud_27_0= ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,78,FOLLOW_25); 

                    				newLeafNode(otherlv_25, grammarAccess.getConnectionAccess().getCloudKeyword_13_0());
                    			
                    otherlv_26=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_26, grammarAccess.getConnectionAccess().getEqualsSignKeyword_13_1());
                    			
                    // InternalDomijmasdsl.g:3667:4: ( (lv_cloud_27_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3668:5: (lv_cloud_27_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3668:5: (lv_cloud_27_0= ruleEString )
                    // InternalDomijmasdsl.g:3669:6: lv_cloud_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getCloudEStringParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_cloud_27_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"cloud",
                    							lv_cloud_27_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:3687:3: (otherlv_28= 'environment' otherlv_29= '=' ( (lv_environment_30_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==79) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDomijmasdsl.g:3688:4: otherlv_28= 'environment' otherlv_29= '=' ( (lv_environment_30_0= ruleEString ) )
                    {
                    otherlv_28=(Token)match(input,79,FOLLOW_25); 

                    				newLeafNode(otherlv_28, grammarAccess.getConnectionAccess().getEnvironmentKeyword_14_0());
                    			
                    otherlv_29=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_29, grammarAccess.getConnectionAccess().getEqualsSignKeyword_14_1());
                    			
                    // InternalDomijmasdsl.g:3696:4: ( (lv_environment_30_0= ruleEString ) )
                    // InternalDomijmasdsl.g:3697:5: (lv_environment_30_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3697:5: (lv_environment_30_0= ruleEString )
                    // InternalDomijmasdsl.g:3698:6: lv_environment_30_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConnectionAccess().getEnvironmentEStringParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_environment_30_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConnectionRule());
                    						}
                    						set(
                    							current,
                    							"environment",
                    							lv_environment_30_0,
                    							"org.xtext.example.domij.Domijmasdsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleEInt"
    // InternalDomijmasdsl.g:3720:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDomijmasdsl.g:3720:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDomijmasdsl.g:3721:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDomijmasdsl.g:3727:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:3733:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDomijmasdsl.g:3734:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDomijmasdsl.g:3734:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDomijmasdsl.g:3735:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDomijmasdsl.g:3735:3: (kw= '-' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==80) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalDomijmasdsl.g:3736:4: kw= '-'
                    {
                    kw=(Token)match(input,80,FOLLOW_97); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleNonVectorField"
    // InternalDomijmasdsl.g:3753:1: entryRuleNonVectorField returns [EObject current=null] : iv_ruleNonVectorField= ruleNonVectorField EOF ;
    public final EObject entryRuleNonVectorField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonVectorField = null;


        try {
            // InternalDomijmasdsl.g:3753:55: (iv_ruleNonVectorField= ruleNonVectorField EOF )
            // InternalDomijmasdsl.g:3754:2: iv_ruleNonVectorField= ruleNonVectorField EOF
            {
             newCompositeNode(grammarAccess.getNonVectorFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonVectorField=ruleNonVectorField();

            state._fsp--;

             current =iv_ruleNonVectorField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonVectorField"


    // $ANTLR start "ruleNonVectorField"
    // InternalDomijmasdsl.g:3760:1: ruleNonVectorField returns [EObject current=null] : (otherlv_0= 'NONVECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEScalarDType ) ) (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_fieldLimits_12_0= ruleFieldLimit ) ) ( (lv_fieldLimits_13_0= ruleFieldLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'NONVECTOR' otherlv_17= 'INDEXES' otherlv_18= '[' ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) ) ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )* otherlv_21= ']' )? ) ;
    public final EObject ruleNonVectorField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isPrimary_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_8_0 = null;

        EObject lv_fieldLimits_12_0 = null;

        EObject lv_fieldLimits_13_0 = null;

        EObject lv_nonVectorIndexes_19_0 = null;

        EObject lv_nonVectorIndexes_20_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:3766:2: ( (otherlv_0= 'NONVECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEScalarDType ) ) (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_fieldLimits_12_0= ruleFieldLimit ) ) ( (lv_fieldLimits_13_0= ruleFieldLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'NONVECTOR' otherlv_17= 'INDEXES' otherlv_18= '[' ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) ) ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )* otherlv_21= ']' )? ) )
            // InternalDomijmasdsl.g:3767:2: (otherlv_0= 'NONVECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEScalarDType ) ) (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_fieldLimits_12_0= ruleFieldLimit ) ) ( (lv_fieldLimits_13_0= ruleFieldLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'NONVECTOR' otherlv_17= 'INDEXES' otherlv_18= '[' ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) ) ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )* otherlv_21= ']' )? )
            {
            // InternalDomijmasdsl.g:3767:2: (otherlv_0= 'NONVECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEScalarDType ) ) (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_fieldLimits_12_0= ruleFieldLimit ) ) ( (lv_fieldLimits_13_0= ruleFieldLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'NONVECTOR' otherlv_17= 'INDEXES' otherlv_18= '[' ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) ) ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )* otherlv_21= ']' )? )
            // InternalDomijmasdsl.g:3768:3: otherlv_0= 'NONVECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEScalarDType ) ) (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_fieldLimits_12_0= ruleFieldLimit ) ) ( (lv_fieldLimits_13_0= ruleFieldLimit ) )* otherlv_14= ']' )? (otherlv_15= 'WITH' otherlv_16= 'NONVECTOR' otherlv_17= 'INDEXES' otherlv_18= '[' ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) ) ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )* otherlv_21= ']' )?
            {
            otherlv_0=(Token)match(input,69,FOLLOW_98); 

            			newLeafNode(otherlv_0, grammarAccess.getNonVectorFieldAccess().getNONVECTORKeyword_0());
            		
            otherlv_1=(Token)match(input,64,FOLLOW_99); 

            			newLeafNode(otherlv_1, grammarAccess.getNonVectorFieldAccess().getFIELDKeyword_1());
            		
            // InternalDomijmasdsl.g:3776:3: ( (lv_name_2_0= ruleEString ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_STRING && LA72_0<=RULE_ID)) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDomijmasdsl.g:3777:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:3777:4: (lv_name_2_0= ruleEString )
                    // InternalDomijmasdsl.g:3778:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getNonVectorFieldAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonVectorFieldRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.domij.Domijmasdsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getNonVectorFieldAccess().getINKeyword_3());
            		
            // InternalDomijmasdsl.g:3799:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:3800:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:3800:4: ( ruleEString )
            // InternalDomijmasdsl.g:3801:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonVectorFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNonVectorFieldAccess().getColFieldOwnerVectorCollectionCrossReference_4_0());
            				
            pushFollow(FOLLOW_100);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:3815:3: ( (lv_isPrimary_5_0= 'primary' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==81) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDomijmasdsl.g:3816:4: (lv_isPrimary_5_0= 'primary' )
                    {
                    // InternalDomijmasdsl.g:3816:4: (lv_isPrimary_5_0= 'primary' )
                    // InternalDomijmasdsl.g:3817:5: lv_isPrimary_5_0= 'primary'
                    {
                    lv_isPrimary_5_0=(Token)match(input,81,FOLLOW_75); 

                    					newLeafNode(lv_isPrimary_5_0, grammarAccess.getNonVectorFieldAccess().getIsPrimaryPrimaryKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNonVectorFieldRule());
                    					}
                    					setWithLastConsumed(current, "isPrimary", lv_isPrimary_5_0 != null, "primary");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getNonVectorFieldAccess().getTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_101); 

            			newLeafNode(otherlv_7, grammarAccess.getNonVectorFieldAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:3837:3: ( (lv_type_8_0= ruleEScalarDType ) )
            // InternalDomijmasdsl.g:3838:4: (lv_type_8_0= ruleEScalarDType )
            {
            // InternalDomijmasdsl.g:3838:4: (lv_type_8_0= ruleEScalarDType )
            // InternalDomijmasdsl.g:3839:5: lv_type_8_0= ruleEScalarDType
            {

            					newCompositeNode(grammarAccess.getNonVectorFieldAccess().getTypeEScalarDTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_8_0=ruleEScalarDType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonVectorFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EScalarDType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:3856:3: (otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_fieldLimits_12_0= ruleFieldLimit ) ) ( (lv_fieldLimits_13_0= ruleFieldLimit ) )* otherlv_14= ']' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==13) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==55) ) {
                    alt75=1;
                }
            }
            switch (alt75) {
                case 1 :
                    // InternalDomijmasdsl.g:3857:4: otherlv_9= 'WITH' otherlv_10= 'LIMITS' otherlv_11= '[' ( (lv_fieldLimits_12_0= ruleFieldLimit ) ) ( (lv_fieldLimits_13_0= ruleFieldLimit ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_56); 

                    				newLeafNode(otherlv_9, grammarAccess.getNonVectorFieldAccess().getWITHKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getNonVectorFieldAccess().getLIMITSKeyword_9_1());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_98); 

                    				newLeafNode(otherlv_11, grammarAccess.getNonVectorFieldAccess().getLeftSquareBracketKeyword_9_2());
                    			
                    // InternalDomijmasdsl.g:3869:4: ( (lv_fieldLimits_12_0= ruleFieldLimit ) )
                    // InternalDomijmasdsl.g:3870:5: (lv_fieldLimits_12_0= ruleFieldLimit )
                    {
                    // InternalDomijmasdsl.g:3870:5: (lv_fieldLimits_12_0= ruleFieldLimit )
                    // InternalDomijmasdsl.g:3871:6: lv_fieldLimits_12_0= ruleFieldLimit
                    {

                    						newCompositeNode(grammarAccess.getNonVectorFieldAccess().getFieldLimitsFieldLimitParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_fieldLimits_12_0=ruleFieldLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonVectorFieldRule());
                    						}
                    						add(
                    							current,
                    							"fieldLimits",
                    							lv_fieldLimits_12_0,
                    							"org.xtext.example.domij.Domijmasdsl.FieldLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:3888:4: ( (lv_fieldLimits_13_0= ruleFieldLimit ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==64) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:3889:5: (lv_fieldLimits_13_0= ruleFieldLimit )
                    	    {
                    	    // InternalDomijmasdsl.g:3889:5: (lv_fieldLimits_13_0= ruleFieldLimit )
                    	    // InternalDomijmasdsl.g:3890:6: lv_fieldLimits_13_0= ruleFieldLimit
                    	    {

                    	    						newCompositeNode(grammarAccess.getNonVectorFieldAccess().getFieldLimitsFieldLimitParserRuleCall_9_4_0());
                    	    					
                    	    pushFollow(FOLLOW_102);
                    	    lv_fieldLimits_13_0=ruleFieldLimit();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNonVectorFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldLimits",
                    	    							lv_fieldLimits_13_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.FieldLimit");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getNonVectorFieldAccess().getRightSquareBracketKeyword_9_5());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:3912:3: (otherlv_15= 'WITH' otherlv_16= 'NONVECTOR' otherlv_17= 'INDEXES' otherlv_18= '[' ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) ) ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )* otherlv_21= ']' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==13) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDomijmasdsl.g:3913:4: otherlv_15= 'WITH' otherlv_16= 'NONVECTOR' otherlv_17= 'INDEXES' otherlv_18= '[' ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) ) ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )* otherlv_21= ']'
                    {
                    otherlv_15=(Token)match(input,13,FOLLOW_103); 

                    				newLeafNode(otherlv_15, grammarAccess.getNonVectorFieldAccess().getWITHKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,69,FOLLOW_104); 

                    				newLeafNode(otherlv_16, grammarAccess.getNonVectorFieldAccess().getNONVECTORKeyword_10_1());
                    			
                    otherlv_17=(Token)match(input,82,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getNonVectorFieldAccess().getINDEXESKeyword_10_2());
                    			
                    otherlv_18=(Token)match(input,15,FOLLOW_103); 

                    				newLeafNode(otherlv_18, grammarAccess.getNonVectorFieldAccess().getLeftSquareBracketKeyword_10_3());
                    			
                    // InternalDomijmasdsl.g:3929:4: ( (lv_nonVectorIndexes_19_0= ruleNonVectorIndex ) )
                    // InternalDomijmasdsl.g:3930:5: (lv_nonVectorIndexes_19_0= ruleNonVectorIndex )
                    {
                    // InternalDomijmasdsl.g:3930:5: (lv_nonVectorIndexes_19_0= ruleNonVectorIndex )
                    // InternalDomijmasdsl.g:3931:6: lv_nonVectorIndexes_19_0= ruleNonVectorIndex
                    {

                    						newCompositeNode(grammarAccess.getNonVectorFieldAccess().getNonVectorIndexesNonVectorIndexParserRuleCall_10_4_0());
                    					
                    pushFollow(FOLLOW_105);
                    lv_nonVectorIndexes_19_0=ruleNonVectorIndex();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNonVectorFieldRule());
                    						}
                    						add(
                    							current,
                    							"nonVectorIndexes",
                    							lv_nonVectorIndexes_19_0,
                    							"org.xtext.example.domij.Domijmasdsl.NonVectorIndex");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:3948:4: ( (lv_nonVectorIndexes_20_0= ruleNonVectorIndex ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==69) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:3949:5: (lv_nonVectorIndexes_20_0= ruleNonVectorIndex )
                    	    {
                    	    // InternalDomijmasdsl.g:3949:5: (lv_nonVectorIndexes_20_0= ruleNonVectorIndex )
                    	    // InternalDomijmasdsl.g:3950:6: lv_nonVectorIndexes_20_0= ruleNonVectorIndex
                    	    {

                    	    						newCompositeNode(grammarAccess.getNonVectorFieldAccess().getNonVectorIndexesNonVectorIndexParserRuleCall_10_5_0());
                    	    					
                    	    pushFollow(FOLLOW_105);
                    	    lv_nonVectorIndexes_20_0=ruleNonVectorIndex();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNonVectorFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nonVectorIndexes",
                    	    							lv_nonVectorIndexes_20_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.NonVectorIndex");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getNonVectorFieldAccess().getRightSquareBracketKeyword_10_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonVectorField"


    // $ANTLR start "entryRuleVectorField"
    // InternalDomijmasdsl.g:3976:1: entryRuleVectorField returns [EObject current=null] : iv_ruleVectorField= ruleVectorField EOF ;
    public final EObject entryRuleVectorField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorField = null;


        try {
            // InternalDomijmasdsl.g:3976:52: (iv_ruleVectorField= ruleVectorField EOF )
            // InternalDomijmasdsl.g:3977:2: iv_ruleVectorField= ruleVectorField EOF
            {
             newCompositeNode(grammarAccess.getVectorFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVectorField=ruleVectorField();

            state._fsp--;

             current =iv_ruleVectorField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorField"


    // $ANTLR start "ruleVectorField"
    // InternalDomijmasdsl.g:3983:1: ruleVectorField returns [EObject current=null] : (otherlv_0= 'VECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEVectorDType ) ) (otherlv_9= 'WITH' otherlv_10= 'EMBEDDING' otherlv_11= 'MODEL' otherlv_12= '=' ( ( ruleEString ) ) )? (otherlv_14= 'WITH' otherlv_15= 'LIMITS' otherlv_16= '[' ( (lv_fieldLimits_17_0= ruleFieldLimit ) ) ( (lv_fieldLimits_18_0= ruleFieldLimit ) )* otherlv_19= ']' )? (otherlv_20= 'WITH' otherlv_21= 'VECTOR' otherlv_22= 'INDEXES' otherlv_23= '[' ( (lv_vectorIndexes_24_0= ruleVectorIndex ) ) ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )* otherlv_26= ']' )? ) ;
    public final EObject ruleVectorField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_isPrimary_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_8_0 = null;

        EObject lv_fieldLimits_17_0 = null;

        EObject lv_fieldLimits_18_0 = null;

        EObject lv_vectorIndexes_24_0 = null;

        EObject lv_vectorIndexes_25_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:3989:2: ( (otherlv_0= 'VECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEVectorDType ) ) (otherlv_9= 'WITH' otherlv_10= 'EMBEDDING' otherlv_11= 'MODEL' otherlv_12= '=' ( ( ruleEString ) ) )? (otherlv_14= 'WITH' otherlv_15= 'LIMITS' otherlv_16= '[' ( (lv_fieldLimits_17_0= ruleFieldLimit ) ) ( (lv_fieldLimits_18_0= ruleFieldLimit ) )* otherlv_19= ']' )? (otherlv_20= 'WITH' otherlv_21= 'VECTOR' otherlv_22= 'INDEXES' otherlv_23= '[' ( (lv_vectorIndexes_24_0= ruleVectorIndex ) ) ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )* otherlv_26= ']' )? ) )
            // InternalDomijmasdsl.g:3990:2: (otherlv_0= 'VECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEVectorDType ) ) (otherlv_9= 'WITH' otherlv_10= 'EMBEDDING' otherlv_11= 'MODEL' otherlv_12= '=' ( ( ruleEString ) ) )? (otherlv_14= 'WITH' otherlv_15= 'LIMITS' otherlv_16= '[' ( (lv_fieldLimits_17_0= ruleFieldLimit ) ) ( (lv_fieldLimits_18_0= ruleFieldLimit ) )* otherlv_19= ']' )? (otherlv_20= 'WITH' otherlv_21= 'VECTOR' otherlv_22= 'INDEXES' otherlv_23= '[' ( (lv_vectorIndexes_24_0= ruleVectorIndex ) ) ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )* otherlv_26= ']' )? )
            {
            // InternalDomijmasdsl.g:3990:2: (otherlv_0= 'VECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEVectorDType ) ) (otherlv_9= 'WITH' otherlv_10= 'EMBEDDING' otherlv_11= 'MODEL' otherlv_12= '=' ( ( ruleEString ) ) )? (otherlv_14= 'WITH' otherlv_15= 'LIMITS' otherlv_16= '[' ( (lv_fieldLimits_17_0= ruleFieldLimit ) ) ( (lv_fieldLimits_18_0= ruleFieldLimit ) )* otherlv_19= ']' )? (otherlv_20= 'WITH' otherlv_21= 'VECTOR' otherlv_22= 'INDEXES' otherlv_23= '[' ( (lv_vectorIndexes_24_0= ruleVectorIndex ) ) ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )* otherlv_26= ']' )? )
            // InternalDomijmasdsl.g:3991:3: otherlv_0= 'VECTOR' otherlv_1= 'FIELD' ( (lv_name_2_0= ruleEString ) )? otherlv_3= 'IN' ( ( ruleEString ) ) ( (lv_isPrimary_5_0= 'primary' ) )? otherlv_6= 'type' otherlv_7= '=' ( (lv_type_8_0= ruleEVectorDType ) ) (otherlv_9= 'WITH' otherlv_10= 'EMBEDDING' otherlv_11= 'MODEL' otherlv_12= '=' ( ( ruleEString ) ) )? (otherlv_14= 'WITH' otherlv_15= 'LIMITS' otherlv_16= '[' ( (lv_fieldLimits_17_0= ruleFieldLimit ) ) ( (lv_fieldLimits_18_0= ruleFieldLimit ) )* otherlv_19= ']' )? (otherlv_20= 'WITH' otherlv_21= 'VECTOR' otherlv_22= 'INDEXES' otherlv_23= '[' ( (lv_vectorIndexes_24_0= ruleVectorIndex ) ) ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )* otherlv_26= ']' )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_98); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorFieldAccess().getVECTORKeyword_0());
            		
            otherlv_1=(Token)match(input,64,FOLLOW_99); 

            			newLeafNode(otherlv_1, grammarAccess.getVectorFieldAccess().getFIELDKeyword_1());
            		
            // InternalDomijmasdsl.g:3999:3: ( (lv_name_2_0= ruleEString ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_STRING && LA78_0<=RULE_ID)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalDomijmasdsl.g:4000:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalDomijmasdsl.g:4000:4: (lv_name_2_0= ruleEString )
                    // InternalDomijmasdsl.g:4001:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getVectorFieldAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_31);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVectorFieldRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.domij.Domijmasdsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getVectorFieldAccess().getINKeyword_3());
            		
            // InternalDomijmasdsl.g:4022:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:4023:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:4023:4: ( ruleEString )
            // InternalDomijmasdsl.g:4024:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVectorFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVectorFieldAccess().getColFieldOwnerVectorCollectionCrossReference_4_0());
            				
            pushFollow(FOLLOW_100);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:4038:3: ( (lv_isPrimary_5_0= 'primary' ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==81) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDomijmasdsl.g:4039:4: (lv_isPrimary_5_0= 'primary' )
                    {
                    // InternalDomijmasdsl.g:4039:4: (lv_isPrimary_5_0= 'primary' )
                    // InternalDomijmasdsl.g:4040:5: lv_isPrimary_5_0= 'primary'
                    {
                    lv_isPrimary_5_0=(Token)match(input,81,FOLLOW_75); 

                    					newLeafNode(lv_isPrimary_5_0, grammarAccess.getVectorFieldAccess().getIsPrimaryPrimaryKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVectorFieldRule());
                    					}
                    					setWithLastConsumed(current, "isPrimary", lv_isPrimary_5_0 != null, "primary");
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,66,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getVectorFieldAccess().getTypeKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_106); 

            			newLeafNode(otherlv_7, grammarAccess.getVectorFieldAccess().getEqualsSignKeyword_7());
            		
            // InternalDomijmasdsl.g:4060:3: ( (lv_type_8_0= ruleEVectorDType ) )
            // InternalDomijmasdsl.g:4061:4: (lv_type_8_0= ruleEVectorDType )
            {
            // InternalDomijmasdsl.g:4061:4: (lv_type_8_0= ruleEVectorDType )
            // InternalDomijmasdsl.g:4062:5: lv_type_8_0= ruleEVectorDType
            {

            					newCompositeNode(grammarAccess.getVectorFieldAccess().getTypeEVectorDTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_8_0=ruleEVectorDType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"org.xtext.example.domij.Domijmasdsl.EVectorDType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:4079:3: (otherlv_9= 'WITH' otherlv_10= 'EMBEDDING' otherlv_11= 'MODEL' otherlv_12= '=' ( ( ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==13) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==83) ) {
                    alt80=1;
                }
            }
            switch (alt80) {
                case 1 :
                    // InternalDomijmasdsl.g:4080:4: otherlv_9= 'WITH' otherlv_10= 'EMBEDDING' otherlv_11= 'MODEL' otherlv_12= '=' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_107); 

                    				newLeafNode(otherlv_9, grammarAccess.getVectorFieldAccess().getWITHKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,83,FOLLOW_108); 

                    				newLeafNode(otherlv_10, grammarAccess.getVectorFieldAccess().getEMBEDDINGKeyword_9_1());
                    			
                    otherlv_11=(Token)match(input,84,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getVectorFieldAccess().getMODELKeyword_9_2());
                    			
                    otherlv_12=(Token)match(input,28,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getVectorFieldAccess().getEqualsSignKeyword_9_3());
                    			
                    // InternalDomijmasdsl.g:4096:4: ( ( ruleEString ) )
                    // InternalDomijmasdsl.g:4097:5: ( ruleEString )
                    {
                    // InternalDomijmasdsl.g:4097:5: ( ruleEString )
                    // InternalDomijmasdsl.g:4098:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVectorFieldRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVectorFieldAccess().getEmbModelEmbeddingModelCrossReference_9_4_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomijmasdsl.g:4113:3: (otherlv_14= 'WITH' otherlv_15= 'LIMITS' otherlv_16= '[' ( (lv_fieldLimits_17_0= ruleFieldLimit ) ) ( (lv_fieldLimits_18_0= ruleFieldLimit ) )* otherlv_19= ']' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==13) ) {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==55) ) {
                    alt82=1;
                }
            }
            switch (alt82) {
                case 1 :
                    // InternalDomijmasdsl.g:4114:4: otherlv_14= 'WITH' otherlv_15= 'LIMITS' otherlv_16= '[' ( (lv_fieldLimits_17_0= ruleFieldLimit ) ) ( (lv_fieldLimits_18_0= ruleFieldLimit ) )* otherlv_19= ']'
                    {
                    otherlv_14=(Token)match(input,13,FOLLOW_56); 

                    				newLeafNode(otherlv_14, grammarAccess.getVectorFieldAccess().getWITHKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,55,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getVectorFieldAccess().getLIMITSKeyword_10_1());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_98); 

                    				newLeafNode(otherlv_16, grammarAccess.getVectorFieldAccess().getLeftSquareBracketKeyword_10_2());
                    			
                    // InternalDomijmasdsl.g:4126:4: ( (lv_fieldLimits_17_0= ruleFieldLimit ) )
                    // InternalDomijmasdsl.g:4127:5: (lv_fieldLimits_17_0= ruleFieldLimit )
                    {
                    // InternalDomijmasdsl.g:4127:5: (lv_fieldLimits_17_0= ruleFieldLimit )
                    // InternalDomijmasdsl.g:4128:6: lv_fieldLimits_17_0= ruleFieldLimit
                    {

                    						newCompositeNode(grammarAccess.getVectorFieldAccess().getFieldLimitsFieldLimitParserRuleCall_10_3_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_fieldLimits_17_0=ruleFieldLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorFieldRule());
                    						}
                    						add(
                    							current,
                    							"fieldLimits",
                    							lv_fieldLimits_17_0,
                    							"org.xtext.example.domij.Domijmasdsl.FieldLimit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:4145:4: ( (lv_fieldLimits_18_0= ruleFieldLimit ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==64) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:4146:5: (lv_fieldLimits_18_0= ruleFieldLimit )
                    	    {
                    	    // InternalDomijmasdsl.g:4146:5: (lv_fieldLimits_18_0= ruleFieldLimit )
                    	    // InternalDomijmasdsl.g:4147:6: lv_fieldLimits_18_0= ruleFieldLimit
                    	    {

                    	    						newCompositeNode(grammarAccess.getVectorFieldAccess().getFieldLimitsFieldLimitParserRuleCall_10_4_0());
                    	    					
                    	    pushFollow(FOLLOW_102);
                    	    lv_fieldLimits_18_0=ruleFieldLimit();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVectorFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"fieldLimits",
                    	    							lv_fieldLimits_18_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.FieldLimit");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_19, grammarAccess.getVectorFieldAccess().getRightSquareBracketKeyword_10_5());
                    			

                    }
                    break;

            }

            // InternalDomijmasdsl.g:4169:3: (otherlv_20= 'WITH' otherlv_21= 'VECTOR' otherlv_22= 'INDEXES' otherlv_23= '[' ( (lv_vectorIndexes_24_0= ruleVectorIndex ) ) ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )* otherlv_26= ']' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==13) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalDomijmasdsl.g:4170:4: otherlv_20= 'WITH' otherlv_21= 'VECTOR' otherlv_22= 'INDEXES' otherlv_23= '[' ( (lv_vectorIndexes_24_0= ruleVectorIndex ) ) ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )* otherlv_26= ']'
                    {
                    otherlv_20=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_20, grammarAccess.getVectorFieldAccess().getWITHKeyword_11_0());
                    			
                    otherlv_21=(Token)match(input,35,FOLLOW_104); 

                    				newLeafNode(otherlv_21, grammarAccess.getVectorFieldAccess().getVECTORKeyword_11_1());
                    			
                    otherlv_22=(Token)match(input,82,FOLLOW_7); 

                    				newLeafNode(otherlv_22, grammarAccess.getVectorFieldAccess().getINDEXESKeyword_11_2());
                    			
                    otherlv_23=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_23, grammarAccess.getVectorFieldAccess().getLeftSquareBracketKeyword_11_3());
                    			
                    // InternalDomijmasdsl.g:4186:4: ( (lv_vectorIndexes_24_0= ruleVectorIndex ) )
                    // InternalDomijmasdsl.g:4187:5: (lv_vectorIndexes_24_0= ruleVectorIndex )
                    {
                    // InternalDomijmasdsl.g:4187:5: (lv_vectorIndexes_24_0= ruleVectorIndex )
                    // InternalDomijmasdsl.g:4188:6: lv_vectorIndexes_24_0= ruleVectorIndex
                    {

                    						newCompositeNode(grammarAccess.getVectorFieldAccess().getVectorIndexesVectorIndexParserRuleCall_11_4_0());
                    					
                    pushFollow(FOLLOW_109);
                    lv_vectorIndexes_24_0=ruleVectorIndex();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVectorFieldRule());
                    						}
                    						add(
                    							current,
                    							"vectorIndexes",
                    							lv_vectorIndexes_24_0,
                    							"org.xtext.example.domij.Domijmasdsl.VectorIndex");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomijmasdsl.g:4205:4: ( (lv_vectorIndexes_25_0= ruleVectorIndex ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==35) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:4206:5: (lv_vectorIndexes_25_0= ruleVectorIndex )
                    	    {
                    	    // InternalDomijmasdsl.g:4206:5: (lv_vectorIndexes_25_0= ruleVectorIndex )
                    	    // InternalDomijmasdsl.g:4207:6: lv_vectorIndexes_25_0= ruleVectorIndex
                    	    {

                    	    						newCompositeNode(grammarAccess.getVectorFieldAccess().getVectorIndexesVectorIndexParserRuleCall_11_5_0());
                    	    					
                    	    pushFollow(FOLLOW_109);
                    	    lv_vectorIndexes_25_0=ruleVectorIndex();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getVectorFieldRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"vectorIndexes",
                    	    							lv_vectorIndexes_25_0,
                    	    							"org.xtext.example.domij.Domijmasdsl.VectorIndex");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_26, grammarAccess.getVectorFieldAccess().getRightSquareBracketKeyword_11_6());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorField"


    // $ANTLR start "entryRuleFilter"
    // InternalDomijmasdsl.g:4233:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalDomijmasdsl.g:4233:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalDomijmasdsl.g:4234:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalDomijmasdsl.g:4240:1: ruleFilter returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleEOperator ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDomijmasdsl.g:4246:2: ( ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleEOperator ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDomijmasdsl.g:4247:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleEOperator ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDomijmasdsl.g:4247:2: ( ( ( ruleEString ) ) ( (lv_operator_1_0= ruleEOperator ) ) ( (lv_value_2_0= ruleEString ) ) )
            // InternalDomijmasdsl.g:4248:3: ( ( ruleEString ) ) ( (lv_operator_1_0= ruleEOperator ) ) ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDomijmasdsl.g:4248:3: ( ( ruleEString ) )
            // InternalDomijmasdsl.g:4249:4: ( ruleEString )
            {
            // InternalDomijmasdsl.g:4249:4: ( ruleEString )
            // InternalDomijmasdsl.g:4250:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFilterAccess().getFilterFieldConceptCrossReference_0_0());
            				
            pushFollow(FOLLOW_110);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:4264:3: ( (lv_operator_1_0= ruleEOperator ) )
            // InternalDomijmasdsl.g:4265:4: (lv_operator_1_0= ruleEOperator )
            {
            // InternalDomijmasdsl.g:4265:4: (lv_operator_1_0= ruleEOperator )
            // InternalDomijmasdsl.g:4266:5: lv_operator_1_0= ruleEOperator
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getOperatorEOperatorEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_operator_1_0=ruleEOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.example.domij.Domijmasdsl.EOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomijmasdsl.g:4283:3: ( (lv_value_2_0= ruleEString ) )
            // InternalDomijmasdsl.g:4284:4: (lv_value_2_0= ruleEString )
            {
            // InternalDomijmasdsl.g:4284:4: (lv_value_2_0= ruleEString )
            // InternalDomijmasdsl.g:4285:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.domij.Domijmasdsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "ruleEVendorName"
    // InternalDomijmasdsl.g:4306:1: ruleEVendorName returns [Enumerator current=null] : ( (enumLiteral_0= 'PINECONE' ) | (enumLiteral_1= 'MILVUS' ) | (enumLiteral_2= 'CHROMA' ) | (enumLiteral_3= 'WEAVIATE' ) | (enumLiteral_4= 'QDRANT' ) ) ;
    public final Enumerator ruleEVendorName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4312:2: ( ( (enumLiteral_0= 'PINECONE' ) | (enumLiteral_1= 'MILVUS' ) | (enumLiteral_2= 'CHROMA' ) | (enumLiteral_3= 'WEAVIATE' ) | (enumLiteral_4= 'QDRANT' ) ) )
            // InternalDomijmasdsl.g:4313:2: ( (enumLiteral_0= 'PINECONE' ) | (enumLiteral_1= 'MILVUS' ) | (enumLiteral_2= 'CHROMA' ) | (enumLiteral_3= 'WEAVIATE' ) | (enumLiteral_4= 'QDRANT' ) )
            {
            // InternalDomijmasdsl.g:4313:2: ( (enumLiteral_0= 'PINECONE' ) | (enumLiteral_1= 'MILVUS' ) | (enumLiteral_2= 'CHROMA' ) | (enumLiteral_3= 'WEAVIATE' ) | (enumLiteral_4= 'QDRANT' ) )
            int alt85=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt85=1;
                }
                break;
            case 86:
                {
                alt85=2;
                }
                break;
            case 87:
                {
                alt85=3;
                }
                break;
            case 88:
                {
                alt85=4;
                }
                break;
            case 89:
                {
                alt85=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalDomijmasdsl.g:4314:3: (enumLiteral_0= 'PINECONE' )
                    {
                    // InternalDomijmasdsl.g:4314:3: (enumLiteral_0= 'PINECONE' )
                    // InternalDomijmasdsl.g:4315:4: enumLiteral_0= 'PINECONE'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getEVendorNameAccess().getPINECONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEVendorNameAccess().getPINECONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4322:3: (enumLiteral_1= 'MILVUS' )
                    {
                    // InternalDomijmasdsl.g:4322:3: (enumLiteral_1= 'MILVUS' )
                    // InternalDomijmasdsl.g:4323:4: enumLiteral_1= 'MILVUS'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getEVendorNameAccess().getMILVUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEVendorNameAccess().getMILVUSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4330:3: (enumLiteral_2= 'CHROMA' )
                    {
                    // InternalDomijmasdsl.g:4330:3: (enumLiteral_2= 'CHROMA' )
                    // InternalDomijmasdsl.g:4331:4: enumLiteral_2= 'CHROMA'
                    {
                    enumLiteral_2=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getEVendorNameAccess().getCHROMAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEVendorNameAccess().getCHROMAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4338:3: (enumLiteral_3= 'WEAVIATE' )
                    {
                    // InternalDomijmasdsl.g:4338:3: (enumLiteral_3= 'WEAVIATE' )
                    // InternalDomijmasdsl.g:4339:4: enumLiteral_3= 'WEAVIATE'
                    {
                    enumLiteral_3=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getEVendorNameAccess().getWEAVIATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEVendorNameAccess().getWEAVIATEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomijmasdsl.g:4346:3: (enumLiteral_4= 'QDRANT' )
                    {
                    // InternalDomijmasdsl.g:4346:3: (enumLiteral_4= 'QDRANT' )
                    // InternalDomijmasdsl.g:4347:4: enumLiteral_4= 'QDRANT'
                    {
                    enumLiteral_4=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getEVendorNameAccess().getQDRANTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEVendorNameAccess().getQDRANTEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVendorName"


    // $ANTLR start "ruleEPodTypes"
    // InternalDomijmasdsl.g:4357:1: ruleEPodTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'S1' ) | (enumLiteral_1= 'P1' ) | (enumLiteral_2= 'P2' ) ) ;
    public final Enumerator ruleEPodTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4363:2: ( ( (enumLiteral_0= 'S1' ) | (enumLiteral_1= 'P1' ) | (enumLiteral_2= 'P2' ) ) )
            // InternalDomijmasdsl.g:4364:2: ( (enumLiteral_0= 'S1' ) | (enumLiteral_1= 'P1' ) | (enumLiteral_2= 'P2' ) )
            {
            // InternalDomijmasdsl.g:4364:2: ( (enumLiteral_0= 'S1' ) | (enumLiteral_1= 'P1' ) | (enumLiteral_2= 'P2' ) )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt86=1;
                }
                break;
            case 91:
                {
                alt86=2;
                }
                break;
            case 92:
                {
                alt86=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalDomijmasdsl.g:4365:3: (enumLiteral_0= 'S1' )
                    {
                    // InternalDomijmasdsl.g:4365:3: (enumLiteral_0= 'S1' )
                    // InternalDomijmasdsl.g:4366:4: enumLiteral_0= 'S1'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getEPodTypesAccess().getS1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEPodTypesAccess().getS1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4373:3: (enumLiteral_1= 'P1' )
                    {
                    // InternalDomijmasdsl.g:4373:3: (enumLiteral_1= 'P1' )
                    // InternalDomijmasdsl.g:4374:4: enumLiteral_1= 'P1'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getEPodTypesAccess().getP1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEPodTypesAccess().getP1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4381:3: (enumLiteral_2= 'P2' )
                    {
                    // InternalDomijmasdsl.g:4381:3: (enumLiteral_2= 'P2' )
                    // InternalDomijmasdsl.g:4382:4: enumLiteral_2= 'P2'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getEPodTypesAccess().getP2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEPodTypesAccess().getP2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPodTypes"


    // $ANTLR start "ruleEPodSize"
    // InternalDomijmasdsl.g:4392:1: ruleEPodSize returns [Enumerator current=null] : ( (enumLiteral_0= 'X1' ) | (enumLiteral_1= 'X2' ) | (enumLiteral_2= 'X4' ) | (enumLiteral_3= 'X8' ) ) ;
    public final Enumerator ruleEPodSize() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4398:2: ( ( (enumLiteral_0= 'X1' ) | (enumLiteral_1= 'X2' ) | (enumLiteral_2= 'X4' ) | (enumLiteral_3= 'X8' ) ) )
            // InternalDomijmasdsl.g:4399:2: ( (enumLiteral_0= 'X1' ) | (enumLiteral_1= 'X2' ) | (enumLiteral_2= 'X4' ) | (enumLiteral_3= 'X8' ) )
            {
            // InternalDomijmasdsl.g:4399:2: ( (enumLiteral_0= 'X1' ) | (enumLiteral_1= 'X2' ) | (enumLiteral_2= 'X4' ) | (enumLiteral_3= 'X8' ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt87=1;
                }
                break;
            case 94:
                {
                alt87=2;
                }
                break;
            case 95:
                {
                alt87=3;
                }
                break;
            case 96:
                {
                alt87=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalDomijmasdsl.g:4400:3: (enumLiteral_0= 'X1' )
                    {
                    // InternalDomijmasdsl.g:4400:3: (enumLiteral_0= 'X1' )
                    // InternalDomijmasdsl.g:4401:4: enumLiteral_0= 'X1'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getEPodSizeAccess().getX1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEPodSizeAccess().getX1EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4408:3: (enumLiteral_1= 'X2' )
                    {
                    // InternalDomijmasdsl.g:4408:3: (enumLiteral_1= 'X2' )
                    // InternalDomijmasdsl.g:4409:4: enumLiteral_1= 'X2'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getEPodSizeAccess().getX2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEPodSizeAccess().getX2EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4416:3: (enumLiteral_2= 'X4' )
                    {
                    // InternalDomijmasdsl.g:4416:3: (enumLiteral_2= 'X4' )
                    // InternalDomijmasdsl.g:4417:4: enumLiteral_2= 'X4'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getEPodSizeAccess().getX4EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEPodSizeAccess().getX4EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4424:3: (enumLiteral_3= 'X8' )
                    {
                    // InternalDomijmasdsl.g:4424:3: (enumLiteral_3= 'X8' )
                    // InternalDomijmasdsl.g:4425:4: enumLiteral_3= 'X8'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getEPodSizeAccess().getX8EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEPodSizeAccess().getX8EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPodSize"


    // $ANTLR start "ruleEPodEnv"
    // InternalDomijmasdsl.g:4435:1: ruleEPodEnv returns [Enumerator current=null] : ( (enumLiteral_0= 'US_W1_GCP' ) | (enumLiteral_1= 'US_C1_GCP' ) | (enumLiteral_2= 'US_W4_GCP' ) | (enumLiteral_3= 'US_E4_GCP' ) | (enumLiteral_4= 'NA_NE1_GCP' ) | (enumLiteral_5= 'A_NE1_GCP' ) | (enumLiteral_6= 'A_SE1_GCP' ) | (enumLiteral_7= 'US_E1_GCP' ) | (enumLiteral_8= 'EU_W1_GCP' ) | (enumLiteral_9= 'EU_W4_GCP' ) | (enumLiteral_10= 'US_E1_AWS' ) | (enumLiteral_11= 'AZURE' ) ) ;
    public final Enumerator ruleEPodEnv() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4441:2: ( ( (enumLiteral_0= 'US_W1_GCP' ) | (enumLiteral_1= 'US_C1_GCP' ) | (enumLiteral_2= 'US_W4_GCP' ) | (enumLiteral_3= 'US_E4_GCP' ) | (enumLiteral_4= 'NA_NE1_GCP' ) | (enumLiteral_5= 'A_NE1_GCP' ) | (enumLiteral_6= 'A_SE1_GCP' ) | (enumLiteral_7= 'US_E1_GCP' ) | (enumLiteral_8= 'EU_W1_GCP' ) | (enumLiteral_9= 'EU_W4_GCP' ) | (enumLiteral_10= 'US_E1_AWS' ) | (enumLiteral_11= 'AZURE' ) ) )
            // InternalDomijmasdsl.g:4442:2: ( (enumLiteral_0= 'US_W1_GCP' ) | (enumLiteral_1= 'US_C1_GCP' ) | (enumLiteral_2= 'US_W4_GCP' ) | (enumLiteral_3= 'US_E4_GCP' ) | (enumLiteral_4= 'NA_NE1_GCP' ) | (enumLiteral_5= 'A_NE1_GCP' ) | (enumLiteral_6= 'A_SE1_GCP' ) | (enumLiteral_7= 'US_E1_GCP' ) | (enumLiteral_8= 'EU_W1_GCP' ) | (enumLiteral_9= 'EU_W4_GCP' ) | (enumLiteral_10= 'US_E1_AWS' ) | (enumLiteral_11= 'AZURE' ) )
            {
            // InternalDomijmasdsl.g:4442:2: ( (enumLiteral_0= 'US_W1_GCP' ) | (enumLiteral_1= 'US_C1_GCP' ) | (enumLiteral_2= 'US_W4_GCP' ) | (enumLiteral_3= 'US_E4_GCP' ) | (enumLiteral_4= 'NA_NE1_GCP' ) | (enumLiteral_5= 'A_NE1_GCP' ) | (enumLiteral_6= 'A_SE1_GCP' ) | (enumLiteral_7= 'US_E1_GCP' ) | (enumLiteral_8= 'EU_W1_GCP' ) | (enumLiteral_9= 'EU_W4_GCP' ) | (enumLiteral_10= 'US_E1_AWS' ) | (enumLiteral_11= 'AZURE' ) )
            int alt88=12;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt88=1;
                }
                break;
            case 98:
                {
                alt88=2;
                }
                break;
            case 99:
                {
                alt88=3;
                }
                break;
            case 100:
                {
                alt88=4;
                }
                break;
            case 101:
                {
                alt88=5;
                }
                break;
            case 102:
                {
                alt88=6;
                }
                break;
            case 103:
                {
                alt88=7;
                }
                break;
            case 104:
                {
                alt88=8;
                }
                break;
            case 105:
                {
                alt88=9;
                }
                break;
            case 106:
                {
                alt88=10;
                }
                break;
            case 107:
                {
                alt88=11;
                }
                break;
            case 108:
                {
                alt88=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalDomijmasdsl.g:4443:3: (enumLiteral_0= 'US_W1_GCP' )
                    {
                    // InternalDomijmasdsl.g:4443:3: (enumLiteral_0= 'US_W1_GCP' )
                    // InternalDomijmasdsl.g:4444:4: enumLiteral_0= 'US_W1_GCP'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getUS_W1_GCPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEPodEnvAccess().getUS_W1_GCPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4451:3: (enumLiteral_1= 'US_C1_GCP' )
                    {
                    // InternalDomijmasdsl.g:4451:3: (enumLiteral_1= 'US_C1_GCP' )
                    // InternalDomijmasdsl.g:4452:4: enumLiteral_1= 'US_C1_GCP'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getUS_C1_GCPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEPodEnvAccess().getUS_C1_GCPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4459:3: (enumLiteral_2= 'US_W4_GCP' )
                    {
                    // InternalDomijmasdsl.g:4459:3: (enumLiteral_2= 'US_W4_GCP' )
                    // InternalDomijmasdsl.g:4460:4: enumLiteral_2= 'US_W4_GCP'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getUS_W4_GCPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEPodEnvAccess().getUS_W4_GCPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4467:3: (enumLiteral_3= 'US_E4_GCP' )
                    {
                    // InternalDomijmasdsl.g:4467:3: (enumLiteral_3= 'US_E4_GCP' )
                    // InternalDomijmasdsl.g:4468:4: enumLiteral_3= 'US_E4_GCP'
                    {
                    enumLiteral_3=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getUS_E4_GCPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEPodEnvAccess().getUS_E4_GCPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomijmasdsl.g:4475:3: (enumLiteral_4= 'NA_NE1_GCP' )
                    {
                    // InternalDomijmasdsl.g:4475:3: (enumLiteral_4= 'NA_NE1_GCP' )
                    // InternalDomijmasdsl.g:4476:4: enumLiteral_4= 'NA_NE1_GCP'
                    {
                    enumLiteral_4=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getNA_NE1_GCPEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEPodEnvAccess().getNA_NE1_GCPEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomijmasdsl.g:4483:3: (enumLiteral_5= 'A_NE1_GCP' )
                    {
                    // InternalDomijmasdsl.g:4483:3: (enumLiteral_5= 'A_NE1_GCP' )
                    // InternalDomijmasdsl.g:4484:4: enumLiteral_5= 'A_NE1_GCP'
                    {
                    enumLiteral_5=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getA_NE1_GCPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEPodEnvAccess().getA_NE1_GCPEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDomijmasdsl.g:4491:3: (enumLiteral_6= 'A_SE1_GCP' )
                    {
                    // InternalDomijmasdsl.g:4491:3: (enumLiteral_6= 'A_SE1_GCP' )
                    // InternalDomijmasdsl.g:4492:4: enumLiteral_6= 'A_SE1_GCP'
                    {
                    enumLiteral_6=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getA_SE1_GCPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEPodEnvAccess().getA_SE1_GCPEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDomijmasdsl.g:4499:3: (enumLiteral_7= 'US_E1_GCP' )
                    {
                    // InternalDomijmasdsl.g:4499:3: (enumLiteral_7= 'US_E1_GCP' )
                    // InternalDomijmasdsl.g:4500:4: enumLiteral_7= 'US_E1_GCP'
                    {
                    enumLiteral_7=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getUS_E1_GCPEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEPodEnvAccess().getUS_E1_GCPEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDomijmasdsl.g:4507:3: (enumLiteral_8= 'EU_W1_GCP' )
                    {
                    // InternalDomijmasdsl.g:4507:3: (enumLiteral_8= 'EU_W1_GCP' )
                    // InternalDomijmasdsl.g:4508:4: enumLiteral_8= 'EU_W1_GCP'
                    {
                    enumLiteral_8=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getEU_W1_GCPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEPodEnvAccess().getEU_W1_GCPEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDomijmasdsl.g:4515:3: (enumLiteral_9= 'EU_W4_GCP' )
                    {
                    // InternalDomijmasdsl.g:4515:3: (enumLiteral_9= 'EU_W4_GCP' )
                    // InternalDomijmasdsl.g:4516:4: enumLiteral_9= 'EU_W4_GCP'
                    {
                    enumLiteral_9=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getEU_W4_GCPEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getEPodEnvAccess().getEU_W4_GCPEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDomijmasdsl.g:4523:3: (enumLiteral_10= 'US_E1_AWS' )
                    {
                    // InternalDomijmasdsl.g:4523:3: (enumLiteral_10= 'US_E1_AWS' )
                    // InternalDomijmasdsl.g:4524:4: enumLiteral_10= 'US_E1_AWS'
                    {
                    enumLiteral_10=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getUS_E1_AWSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getEPodEnvAccess().getUS_E1_AWSEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDomijmasdsl.g:4531:3: (enumLiteral_11= 'AZURE' )
                    {
                    // InternalDomijmasdsl.g:4531:3: (enumLiteral_11= 'AZURE' )
                    // InternalDomijmasdsl.g:4532:4: enumLiteral_11= 'AZURE'
                    {
                    enumLiteral_11=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getEPodEnvAccess().getAZUREEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getEPodEnvAccess().getAZUREEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPodEnv"


    // $ANTLR start "ruleEScalarDType"
    // InternalDomijmasdsl.g:4542:1: ruleEScalarDType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'FLOAT' ) | (enumLiteral_4= 'DATE' ) | (enumLiteral_5= 'DATETIME' ) | (enumLiteral_6= 'JSON' ) ) ;
    public final Enumerator ruleEScalarDType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4548:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'FLOAT' ) | (enumLiteral_4= 'DATE' ) | (enumLiteral_5= 'DATETIME' ) | (enumLiteral_6= 'JSON' ) ) )
            // InternalDomijmasdsl.g:4549:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'FLOAT' ) | (enumLiteral_4= 'DATE' ) | (enumLiteral_5= 'DATETIME' ) | (enumLiteral_6= 'JSON' ) )
            {
            // InternalDomijmasdsl.g:4549:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'VARCHAR' ) | (enumLiteral_2= 'DOUBLE' ) | (enumLiteral_3= 'FLOAT' ) | (enumLiteral_4= 'DATE' ) | (enumLiteral_5= 'DATETIME' ) | (enumLiteral_6= 'JSON' ) )
            int alt89=7;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt89=1;
                }
                break;
            case 110:
                {
                alt89=2;
                }
                break;
            case 111:
                {
                alt89=3;
                }
                break;
            case 112:
                {
                alt89=4;
                }
                break;
            case 113:
                {
                alt89=5;
                }
                break;
            case 114:
                {
                alt89=6;
                }
                break;
            case 115:
                {
                alt89=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // InternalDomijmasdsl.g:4550:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalDomijmasdsl.g:4550:3: (enumLiteral_0= 'INT' )
                    // InternalDomijmasdsl.g:4551:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getEScalarDTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEScalarDTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4558:3: (enumLiteral_1= 'VARCHAR' )
                    {
                    // InternalDomijmasdsl.g:4558:3: (enumLiteral_1= 'VARCHAR' )
                    // InternalDomijmasdsl.g:4559:4: enumLiteral_1= 'VARCHAR'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getEScalarDTypeAccess().getVARCHAREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEScalarDTypeAccess().getVARCHAREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4566:3: (enumLiteral_2= 'DOUBLE' )
                    {
                    // InternalDomijmasdsl.g:4566:3: (enumLiteral_2= 'DOUBLE' )
                    // InternalDomijmasdsl.g:4567:4: enumLiteral_2= 'DOUBLE'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getEScalarDTypeAccess().getDOUBLEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEScalarDTypeAccess().getDOUBLEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4574:3: (enumLiteral_3= 'FLOAT' )
                    {
                    // InternalDomijmasdsl.g:4574:3: (enumLiteral_3= 'FLOAT' )
                    // InternalDomijmasdsl.g:4575:4: enumLiteral_3= 'FLOAT'
                    {
                    enumLiteral_3=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getEScalarDTypeAccess().getFLOATEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEScalarDTypeAccess().getFLOATEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomijmasdsl.g:4582:3: (enumLiteral_4= 'DATE' )
                    {
                    // InternalDomijmasdsl.g:4582:3: (enumLiteral_4= 'DATE' )
                    // InternalDomijmasdsl.g:4583:4: enumLiteral_4= 'DATE'
                    {
                    enumLiteral_4=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getEScalarDTypeAccess().getDATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEScalarDTypeAccess().getDATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomijmasdsl.g:4590:3: (enumLiteral_5= 'DATETIME' )
                    {
                    // InternalDomijmasdsl.g:4590:3: (enumLiteral_5= 'DATETIME' )
                    // InternalDomijmasdsl.g:4591:4: enumLiteral_5= 'DATETIME'
                    {
                    enumLiteral_5=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getEScalarDTypeAccess().getDATETIMEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEScalarDTypeAccess().getDATETIMEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDomijmasdsl.g:4598:3: (enumLiteral_6= 'JSON' )
                    {
                    // InternalDomijmasdsl.g:4598:3: (enumLiteral_6= 'JSON' )
                    // InternalDomijmasdsl.g:4599:4: enumLiteral_6= 'JSON'
                    {
                    enumLiteral_6=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getEScalarDTypeAccess().getJSONEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEScalarDTypeAccess().getJSONEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEScalarDType"


    // $ANTLR start "ruleEVectorDType"
    // InternalDomijmasdsl.g:4609:1: ruleEVectorDType returns [Enumerator current=null] : ( (enumLiteral_0= 'BINARY_VECTOR' ) | (enumLiteral_1= 'FLOAT_VECTOR' ) ) ;
    public final Enumerator ruleEVectorDType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4615:2: ( ( (enumLiteral_0= 'BINARY_VECTOR' ) | (enumLiteral_1= 'FLOAT_VECTOR' ) ) )
            // InternalDomijmasdsl.g:4616:2: ( (enumLiteral_0= 'BINARY_VECTOR' ) | (enumLiteral_1= 'FLOAT_VECTOR' ) )
            {
            // InternalDomijmasdsl.g:4616:2: ( (enumLiteral_0= 'BINARY_VECTOR' ) | (enumLiteral_1= 'FLOAT_VECTOR' ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==116) ) {
                alt90=1;
            }
            else if ( (LA90_0==117) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalDomijmasdsl.g:4617:3: (enumLiteral_0= 'BINARY_VECTOR' )
                    {
                    // InternalDomijmasdsl.g:4617:3: (enumLiteral_0= 'BINARY_VECTOR' )
                    // InternalDomijmasdsl.g:4618:4: enumLiteral_0= 'BINARY_VECTOR'
                    {
                    enumLiteral_0=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getEVectorDTypeAccess().getBINARY_VECTOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEVectorDTypeAccess().getBINARY_VECTOREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4625:3: (enumLiteral_1= 'FLOAT_VECTOR' )
                    {
                    // InternalDomijmasdsl.g:4625:3: (enumLiteral_1= 'FLOAT_VECTOR' )
                    // InternalDomijmasdsl.g:4626:4: enumLiteral_1= 'FLOAT_VECTOR'
                    {
                    enumLiteral_1=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getEVectorDTypeAccess().getFLOAT_VECTOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEVectorDTypeAccess().getFLOAT_VECTOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVectorDType"


    // $ANTLR start "ruleEFieldLimit"
    // InternalDomijmasdsl.g:4636:1: ruleEFieldLimit returns [Enumerator current=null] : ( (enumLiteral_0= 'VECTORDIM' ) | (enumLiteral_1= 'ARRAYLEN' ) | (enumLiteral_2= 'MAXSIZE' ) ) ;
    public final Enumerator ruleEFieldLimit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4642:2: ( ( (enumLiteral_0= 'VECTORDIM' ) | (enumLiteral_1= 'ARRAYLEN' ) | (enumLiteral_2= 'MAXSIZE' ) ) )
            // InternalDomijmasdsl.g:4643:2: ( (enumLiteral_0= 'VECTORDIM' ) | (enumLiteral_1= 'ARRAYLEN' ) | (enumLiteral_2= 'MAXSIZE' ) )
            {
            // InternalDomijmasdsl.g:4643:2: ( (enumLiteral_0= 'VECTORDIM' ) | (enumLiteral_1= 'ARRAYLEN' ) | (enumLiteral_2= 'MAXSIZE' ) )
            int alt91=3;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt91=1;
                }
                break;
            case 119:
                {
                alt91=2;
                }
                break;
            case 120:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalDomijmasdsl.g:4644:3: (enumLiteral_0= 'VECTORDIM' )
                    {
                    // InternalDomijmasdsl.g:4644:3: (enumLiteral_0= 'VECTORDIM' )
                    // InternalDomijmasdsl.g:4645:4: enumLiteral_0= 'VECTORDIM'
                    {
                    enumLiteral_0=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getEFieldLimitAccess().getVECTORDIMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEFieldLimitAccess().getVECTORDIMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4652:3: (enumLiteral_1= 'ARRAYLEN' )
                    {
                    // InternalDomijmasdsl.g:4652:3: (enumLiteral_1= 'ARRAYLEN' )
                    // InternalDomijmasdsl.g:4653:4: enumLiteral_1= 'ARRAYLEN'
                    {
                    enumLiteral_1=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getEFieldLimitAccess().getARRAYLENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEFieldLimitAccess().getARRAYLENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4660:3: (enumLiteral_2= 'MAXSIZE' )
                    {
                    // InternalDomijmasdsl.g:4660:3: (enumLiteral_2= 'MAXSIZE' )
                    // InternalDomijmasdsl.g:4661:4: enumLiteral_2= 'MAXSIZE'
                    {
                    enumLiteral_2=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getEFieldLimitAccess().getMAXSIZEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEFieldLimitAccess().getMAXSIZEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFieldLimit"


    // $ANTLR start "ruleEColectionLimit"
    // InternalDomijmasdsl.g:4671:1: ruleEColectionLimit returns [Enumerator current=null] : ( (enumLiteral_0= 'NOFPARTITIONS' ) | (enumLiteral_1= 'NOFFIELDS' ) | (enumLiteral_2= 'NOFSHARDS' ) | (enumLiteral_3= 'VECTORDIM' ) ) ;
    public final Enumerator ruleEColectionLimit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4677:2: ( ( (enumLiteral_0= 'NOFPARTITIONS' ) | (enumLiteral_1= 'NOFFIELDS' ) | (enumLiteral_2= 'NOFSHARDS' ) | (enumLiteral_3= 'VECTORDIM' ) ) )
            // InternalDomijmasdsl.g:4678:2: ( (enumLiteral_0= 'NOFPARTITIONS' ) | (enumLiteral_1= 'NOFFIELDS' ) | (enumLiteral_2= 'NOFSHARDS' ) | (enumLiteral_3= 'VECTORDIM' ) )
            {
            // InternalDomijmasdsl.g:4678:2: ( (enumLiteral_0= 'NOFPARTITIONS' ) | (enumLiteral_1= 'NOFFIELDS' ) | (enumLiteral_2= 'NOFSHARDS' ) | (enumLiteral_3= 'VECTORDIM' ) )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt92=1;
                }
                break;
            case 122:
                {
                alt92=2;
                }
                break;
            case 123:
                {
                alt92=3;
                }
                break;
            case 118:
                {
                alt92=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalDomijmasdsl.g:4679:3: (enumLiteral_0= 'NOFPARTITIONS' )
                    {
                    // InternalDomijmasdsl.g:4679:3: (enumLiteral_0= 'NOFPARTITIONS' )
                    // InternalDomijmasdsl.g:4680:4: enumLiteral_0= 'NOFPARTITIONS'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getEColectionLimitAccess().getNOFPARTITIONSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEColectionLimitAccess().getNOFPARTITIONSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4687:3: (enumLiteral_1= 'NOFFIELDS' )
                    {
                    // InternalDomijmasdsl.g:4687:3: (enumLiteral_1= 'NOFFIELDS' )
                    // InternalDomijmasdsl.g:4688:4: enumLiteral_1= 'NOFFIELDS'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getEColectionLimitAccess().getNOFFIELDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEColectionLimitAccess().getNOFFIELDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4695:3: (enumLiteral_2= 'NOFSHARDS' )
                    {
                    // InternalDomijmasdsl.g:4695:3: (enumLiteral_2= 'NOFSHARDS' )
                    // InternalDomijmasdsl.g:4696:4: enumLiteral_2= 'NOFSHARDS'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getEColectionLimitAccess().getNOFSHARDSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEColectionLimitAccess().getNOFSHARDSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4703:3: (enumLiteral_3= 'VECTORDIM' )
                    {
                    // InternalDomijmasdsl.g:4703:3: (enumLiteral_3= 'VECTORDIM' )
                    // InternalDomijmasdsl.g:4704:4: enumLiteral_3= 'VECTORDIM'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getEColectionLimitAccess().getVECTORDIMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEColectionLimitAccess().getVECTORDIMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEColectionLimit"


    // $ANTLR start "ruleEClusterLimit"
    // InternalDomijmasdsl.g:4714:1: ruleEClusterLimit returns [Enumerator current=null] : (enumLiteral_0= 'NOFCOLLECTIONS' ) ;
    public final Enumerator ruleEClusterLimit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4720:2: ( (enumLiteral_0= 'NOFCOLLECTIONS' ) )
            // InternalDomijmasdsl.g:4721:2: (enumLiteral_0= 'NOFCOLLECTIONS' )
            {
            // InternalDomijmasdsl.g:4721:2: (enumLiteral_0= 'NOFCOLLECTIONS' )
            // InternalDomijmasdsl.g:4722:3: enumLiteral_0= 'NOFCOLLECTIONS'
            {
            enumLiteral_0=(Token)match(input,124,FOLLOW_2); 

            			current = grammarAccess.getEClusterLimitAccess().getNOFCOLLECTIONSEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getEClusterLimitAccess().getNOFCOLLECTIONSEnumLiteralDeclaration());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEClusterLimit"


    // $ANTLR start "ruleEIndexLimit"
    // InternalDomijmasdsl.g:4731:1: ruleEIndexLimit returns [Enumerator current=null] : ( (enumLiteral_0= 'NOFCLUSTERUNIT' ) | (enumLiteral_1= 'NOFFACTORSPQ' ) | (enumLiteral_2= 'MAXNODEDGRE' ) ) ;
    public final Enumerator ruleEIndexLimit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4737:2: ( ( (enumLiteral_0= 'NOFCLUSTERUNIT' ) | (enumLiteral_1= 'NOFFACTORSPQ' ) | (enumLiteral_2= 'MAXNODEDGRE' ) ) )
            // InternalDomijmasdsl.g:4738:2: ( (enumLiteral_0= 'NOFCLUSTERUNIT' ) | (enumLiteral_1= 'NOFFACTORSPQ' ) | (enumLiteral_2= 'MAXNODEDGRE' ) )
            {
            // InternalDomijmasdsl.g:4738:2: ( (enumLiteral_0= 'NOFCLUSTERUNIT' ) | (enumLiteral_1= 'NOFFACTORSPQ' ) | (enumLiteral_2= 'MAXNODEDGRE' ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt93=1;
                }
                break;
            case 126:
                {
                alt93=2;
                }
                break;
            case 127:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalDomijmasdsl.g:4739:3: (enumLiteral_0= 'NOFCLUSTERUNIT' )
                    {
                    // InternalDomijmasdsl.g:4739:3: (enumLiteral_0= 'NOFCLUSTERUNIT' )
                    // InternalDomijmasdsl.g:4740:4: enumLiteral_0= 'NOFCLUSTERUNIT'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getEIndexLimitAccess().getNOFCLUSTERUNITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEIndexLimitAccess().getNOFCLUSTERUNITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4747:3: (enumLiteral_1= 'NOFFACTORSPQ' )
                    {
                    // InternalDomijmasdsl.g:4747:3: (enumLiteral_1= 'NOFFACTORSPQ' )
                    // InternalDomijmasdsl.g:4748:4: enumLiteral_1= 'NOFFACTORSPQ'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getEIndexLimitAccess().getNOFFACTORSPQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEIndexLimitAccess().getNOFFACTORSPQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4755:3: (enumLiteral_2= 'MAXNODEDGRE' )
                    {
                    // InternalDomijmasdsl.g:4755:3: (enumLiteral_2= 'MAXNODEDGRE' )
                    // InternalDomijmasdsl.g:4756:4: enumLiteral_2= 'MAXNODEDGRE'
                    {
                    enumLiteral_2=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getEIndexLimitAccess().getMAXNODEDGREEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEIndexLimitAccess().getMAXNODEDGREEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIndexLimit"


    // $ANTLR start "ruleEMetricType"
    // InternalDomijmasdsl.g:4766:1: ruleEMetricType returns [Enumerator current=null] : ( (enumLiteral_0= 'EUCLIDEAN' ) | (enumLiteral_1= 'MANHATTAN' ) | (enumLiteral_2= 'DOT' ) | (enumLiteral_3= 'COSINE' ) ) ;
    public final Enumerator ruleEMetricType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4772:2: ( ( (enumLiteral_0= 'EUCLIDEAN' ) | (enumLiteral_1= 'MANHATTAN' ) | (enumLiteral_2= 'DOT' ) | (enumLiteral_3= 'COSINE' ) ) )
            // InternalDomijmasdsl.g:4773:2: ( (enumLiteral_0= 'EUCLIDEAN' ) | (enumLiteral_1= 'MANHATTAN' ) | (enumLiteral_2= 'DOT' ) | (enumLiteral_3= 'COSINE' ) )
            {
            // InternalDomijmasdsl.g:4773:2: ( (enumLiteral_0= 'EUCLIDEAN' ) | (enumLiteral_1= 'MANHATTAN' ) | (enumLiteral_2= 'DOT' ) | (enumLiteral_3= 'COSINE' ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case 128:
                {
                alt94=1;
                }
                break;
            case 129:
                {
                alt94=2;
                }
                break;
            case 130:
                {
                alt94=3;
                }
                break;
            case 131:
                {
                alt94=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalDomijmasdsl.g:4774:3: (enumLiteral_0= 'EUCLIDEAN' )
                    {
                    // InternalDomijmasdsl.g:4774:3: (enumLiteral_0= 'EUCLIDEAN' )
                    // InternalDomijmasdsl.g:4775:4: enumLiteral_0= 'EUCLIDEAN'
                    {
                    enumLiteral_0=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getEMetricTypeAccess().getEUCLIDEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEMetricTypeAccess().getEUCLIDEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4782:3: (enumLiteral_1= 'MANHATTAN' )
                    {
                    // InternalDomijmasdsl.g:4782:3: (enumLiteral_1= 'MANHATTAN' )
                    // InternalDomijmasdsl.g:4783:4: enumLiteral_1= 'MANHATTAN'
                    {
                    enumLiteral_1=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getEMetricTypeAccess().getMANHATTANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEMetricTypeAccess().getMANHATTANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4790:3: (enumLiteral_2= 'DOT' )
                    {
                    // InternalDomijmasdsl.g:4790:3: (enumLiteral_2= 'DOT' )
                    // InternalDomijmasdsl.g:4791:4: enumLiteral_2= 'DOT'
                    {
                    enumLiteral_2=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getEMetricTypeAccess().getDOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEMetricTypeAccess().getDOTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4798:3: (enumLiteral_3= 'COSINE' )
                    {
                    // InternalDomijmasdsl.g:4798:3: (enumLiteral_3= 'COSINE' )
                    // InternalDomijmasdsl.g:4799:4: enumLiteral_3= 'COSINE'
                    {
                    enumLiteral_3=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getEMetricTypeAccess().getCOSINEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEMetricTypeAccess().getCOSINEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMetricType"


    // $ANTLR start "ruleEVIdxType"
    // InternalDomijmasdsl.g:4809:1: ruleEVIdxType returns [Enumerator current=null] : ( (enumLiteral_0= 'FLAT' ) | (enumLiteral_1= 'IVF_FLAT' ) | (enumLiteral_2= 'IVF_SQ8' ) | (enumLiteral_3= 'IVF_PQ' ) | (enumLiteral_4= 'HNSW' ) | (enumLiteral_5= 'SCANN' ) ) ;
    public final Enumerator ruleEVIdxType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4815:2: ( ( (enumLiteral_0= 'FLAT' ) | (enumLiteral_1= 'IVF_FLAT' ) | (enumLiteral_2= 'IVF_SQ8' ) | (enumLiteral_3= 'IVF_PQ' ) | (enumLiteral_4= 'HNSW' ) | (enumLiteral_5= 'SCANN' ) ) )
            // InternalDomijmasdsl.g:4816:2: ( (enumLiteral_0= 'FLAT' ) | (enumLiteral_1= 'IVF_FLAT' ) | (enumLiteral_2= 'IVF_SQ8' ) | (enumLiteral_3= 'IVF_PQ' ) | (enumLiteral_4= 'HNSW' ) | (enumLiteral_5= 'SCANN' ) )
            {
            // InternalDomijmasdsl.g:4816:2: ( (enumLiteral_0= 'FLAT' ) | (enumLiteral_1= 'IVF_FLAT' ) | (enumLiteral_2= 'IVF_SQ8' ) | (enumLiteral_3= 'IVF_PQ' ) | (enumLiteral_4= 'HNSW' ) | (enumLiteral_5= 'SCANN' ) )
            int alt95=6;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt95=1;
                }
                break;
            case 133:
                {
                alt95=2;
                }
                break;
            case 134:
                {
                alt95=3;
                }
                break;
            case 135:
                {
                alt95=4;
                }
                break;
            case 136:
                {
                alt95=5;
                }
                break;
            case 137:
                {
                alt95=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalDomijmasdsl.g:4817:3: (enumLiteral_0= 'FLAT' )
                    {
                    // InternalDomijmasdsl.g:4817:3: (enumLiteral_0= 'FLAT' )
                    // InternalDomijmasdsl.g:4818:4: enumLiteral_0= 'FLAT'
                    {
                    enumLiteral_0=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getEVIdxTypeAccess().getFLATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEVIdxTypeAccess().getFLATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4825:3: (enumLiteral_1= 'IVF_FLAT' )
                    {
                    // InternalDomijmasdsl.g:4825:3: (enumLiteral_1= 'IVF_FLAT' )
                    // InternalDomijmasdsl.g:4826:4: enumLiteral_1= 'IVF_FLAT'
                    {
                    enumLiteral_1=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getEVIdxTypeAccess().getIVF_FLATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEVIdxTypeAccess().getIVF_FLATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4833:3: (enumLiteral_2= 'IVF_SQ8' )
                    {
                    // InternalDomijmasdsl.g:4833:3: (enumLiteral_2= 'IVF_SQ8' )
                    // InternalDomijmasdsl.g:4834:4: enumLiteral_2= 'IVF_SQ8'
                    {
                    enumLiteral_2=(Token)match(input,134,FOLLOW_2); 

                    				current = grammarAccess.getEVIdxTypeAccess().getIVF_SQ8EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEVIdxTypeAccess().getIVF_SQ8EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4841:3: (enumLiteral_3= 'IVF_PQ' )
                    {
                    // InternalDomijmasdsl.g:4841:3: (enumLiteral_3= 'IVF_PQ' )
                    // InternalDomijmasdsl.g:4842:4: enumLiteral_3= 'IVF_PQ'
                    {
                    enumLiteral_3=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getEVIdxTypeAccess().getIVF_PQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEVIdxTypeAccess().getIVF_PQEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomijmasdsl.g:4849:3: (enumLiteral_4= 'HNSW' )
                    {
                    // InternalDomijmasdsl.g:4849:3: (enumLiteral_4= 'HNSW' )
                    // InternalDomijmasdsl.g:4850:4: enumLiteral_4= 'HNSW'
                    {
                    enumLiteral_4=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getEVIdxTypeAccess().getHNSWEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEVIdxTypeAccess().getHNSWEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomijmasdsl.g:4857:3: (enumLiteral_5= 'SCANN' )
                    {
                    // InternalDomijmasdsl.g:4857:3: (enumLiteral_5= 'SCANN' )
                    // InternalDomijmasdsl.g:4858:4: enumLiteral_5= 'SCANN'
                    {
                    enumLiteral_5=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getEVIdxTypeAccess().getSCANNEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEVIdxTypeAccess().getSCANNEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEVIdxType"


    // $ANTLR start "ruleENVIdxType"
    // InternalDomijmasdsl.g:4868:1: ruleENVIdxType returns [Enumerator current=null] : ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'FULL_TEXT' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'PARAM_INT' ) ) ;
    public final Enumerator ruleENVIdxType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4874:2: ( ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'FULL_TEXT' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'PARAM_INT' ) ) )
            // InternalDomijmasdsl.g:4875:2: ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'FULL_TEXT' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'PARAM_INT' ) )
            {
            // InternalDomijmasdsl.g:4875:2: ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'FULL_TEXT' ) | (enumLiteral_2= 'INTEGER' ) | (enumLiteral_3= 'PARAM_INT' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt96=1;
                }
                break;
            case 139:
                {
                alt96=2;
                }
                break;
            case 140:
                {
                alt96=3;
                }
                break;
            case 141:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalDomijmasdsl.g:4876:3: (enumLiteral_0= 'STANDARD' )
                    {
                    // InternalDomijmasdsl.g:4876:3: (enumLiteral_0= 'STANDARD' )
                    // InternalDomijmasdsl.g:4877:4: enumLiteral_0= 'STANDARD'
                    {
                    enumLiteral_0=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getENVIdxTypeAccess().getSTANDARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getENVIdxTypeAccess().getSTANDARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4884:3: (enumLiteral_1= 'FULL_TEXT' )
                    {
                    // InternalDomijmasdsl.g:4884:3: (enumLiteral_1= 'FULL_TEXT' )
                    // InternalDomijmasdsl.g:4885:4: enumLiteral_1= 'FULL_TEXT'
                    {
                    enumLiteral_1=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getENVIdxTypeAccess().getFULL_TEXTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getENVIdxTypeAccess().getFULL_TEXTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4892:3: (enumLiteral_2= 'INTEGER' )
                    {
                    // InternalDomijmasdsl.g:4892:3: (enumLiteral_2= 'INTEGER' )
                    // InternalDomijmasdsl.g:4893:4: enumLiteral_2= 'INTEGER'
                    {
                    enumLiteral_2=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getENVIdxTypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getENVIdxTypeAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4900:3: (enumLiteral_3= 'PARAM_INT' )
                    {
                    // InternalDomijmasdsl.g:4900:3: (enumLiteral_3= 'PARAM_INT' )
                    // InternalDomijmasdsl.g:4901:4: enumLiteral_3= 'PARAM_INT'
                    {
                    enumLiteral_3=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getENVIdxTypeAccess().getPARAM_INTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getENVIdxTypeAccess().getPARAM_INTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENVIdxType"


    // $ANTLR start "ruleEOperator"
    // InternalDomijmasdsl.g:4911:1: ruleEOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'LIKE' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) ) ;
    public final Enumerator ruleEOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalDomijmasdsl.g:4917:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'LIKE' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) ) )
            // InternalDomijmasdsl.g:4918:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'LIKE' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) )
            {
            // InternalDomijmasdsl.g:4918:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) | (enumLiteral_2= 'NOT' ) | (enumLiteral_3= 'LIKE' ) | (enumLiteral_4= '=' ) | (enumLiteral_5= '!=' ) | (enumLiteral_6= '>' ) | (enumLiteral_7= '>=' ) | (enumLiteral_8= '<' ) | (enumLiteral_9= '<=' ) )
            int alt97=10;
            switch ( input.LA(1) ) {
            case 142:
                {
                alt97=1;
                }
                break;
            case 143:
                {
                alt97=2;
                }
                break;
            case 144:
                {
                alt97=3;
                }
                break;
            case 145:
                {
                alt97=4;
                }
                break;
            case 28:
                {
                alt97=5;
                }
                break;
            case 146:
                {
                alt97=6;
                }
                break;
            case 147:
                {
                alt97=7;
                }
                break;
            case 148:
                {
                alt97=8;
                }
                break;
            case 149:
                {
                alt97=9;
                }
                break;
            case 150:
                {
                alt97=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalDomijmasdsl.g:4919:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDomijmasdsl.g:4919:3: (enumLiteral_0= 'AND' )
                    // InternalDomijmasdsl.g:4920:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEOperatorAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:4927:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalDomijmasdsl.g:4927:3: (enumLiteral_1= 'OR' )
                    // InternalDomijmasdsl.g:4928:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEOperatorAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomijmasdsl.g:4935:3: (enumLiteral_2= 'NOT' )
                    {
                    // InternalDomijmasdsl.g:4935:3: (enumLiteral_2= 'NOT' )
                    // InternalDomijmasdsl.g:4936:4: enumLiteral_2= 'NOT'
                    {
                    enumLiteral_2=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getNOTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEOperatorAccess().getNOTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomijmasdsl.g:4943:3: (enumLiteral_3= 'LIKE' )
                    {
                    // InternalDomijmasdsl.g:4943:3: (enumLiteral_3= 'LIKE' )
                    // InternalDomijmasdsl.g:4944:4: enumLiteral_3= 'LIKE'
                    {
                    enumLiteral_3=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getLIKEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEOperatorAccess().getLIKEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDomijmasdsl.g:4951:3: (enumLiteral_4= '=' )
                    {
                    // InternalDomijmasdsl.g:4951:3: (enumLiteral_4= '=' )
                    // InternalDomijmasdsl.g:4952:4: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getEOperatorAccess().getEQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDomijmasdsl.g:4959:3: (enumLiteral_5= '!=' )
                    {
                    // InternalDomijmasdsl.g:4959:3: (enumLiteral_5= '!=' )
                    // InternalDomijmasdsl.g:4960:4: enumLiteral_5= '!='
                    {
                    enumLiteral_5=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getNEQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getEOperatorAccess().getNEQEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDomijmasdsl.g:4967:3: (enumLiteral_6= '>' )
                    {
                    // InternalDomijmasdsl.g:4967:3: (enumLiteral_6= '>' )
                    // InternalDomijmasdsl.g:4968:4: enumLiteral_6= '>'
                    {
                    enumLiteral_6=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getGTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getEOperatorAccess().getGTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDomijmasdsl.g:4975:3: (enumLiteral_7= '>=' )
                    {
                    // InternalDomijmasdsl.g:4975:3: (enumLiteral_7= '>=' )
                    // InternalDomijmasdsl.g:4976:4: enumLiteral_7= '>='
                    {
                    enumLiteral_7=(Token)match(input,148,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getGTEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getEOperatorAccess().getGTEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDomijmasdsl.g:4983:3: (enumLiteral_8= '<' )
                    {
                    // InternalDomijmasdsl.g:4983:3: (enumLiteral_8= '<' )
                    // InternalDomijmasdsl.g:4984:4: enumLiteral_8= '<'
                    {
                    enumLiteral_8=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getLTEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getEOperatorAccess().getLTEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDomijmasdsl.g:4991:3: (enumLiteral_9= '<=' )
                    {
                    // InternalDomijmasdsl.g:4991:3: (enumLiteral_9= '<=' )
                    // InternalDomijmasdsl.g:4992:4: enumLiteral_9= '<='
                    {
                    enumLiteral_9=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getEOperatorAccess().getLTEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getEOperatorAccess().getLTEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOperator"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\4\1\31\1\4\5\uffff\1\100\10\uffff";
    static final String dfa_3s = "\1\105\1\104\1\101\5\uffff\1\104\10\uffff";
    static final String dfa_4s = "\3\uffff\1\4\1\5\1\6\1\7\1\11\1\uffff\1\15\1\12\1\3\1\1\1\2\1\10\1\14\1\13";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\2\4\23\uffff\1\6\11\uffff\1\1\20\uffff\1\2\10\uffff\1\3\2\uffff\1\5\3\uffff\1\7\1\10",
            "\1\13\26\uffff\1\14\17\uffff\1\11\3\uffff\1\12",
            "\2\15\73\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "\1\17\3\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "271:2: (this_VectorDatabase_0= ruleVectorDatabase | this_Cluster_1= ruleCluster | this_VectorCollection_2= ruleVectorCollection | this_Partition_3= rulePartition | this_EmbeddingModel_4= ruleEmbeddingModel | this_FieldLimit_5= ruleFieldLimit | this_CollectionLimit_6= ruleCollectionLimit | this_ClusterLimit_7= ruleClusterLimit | this_IndexLimit_8= ruleIndexLimit | this_VectorIndex_9= ruleVectorIndex | this_NonVectorIndex_10= ruleNonVectorIndex | this_NonVectorField_11= ruleNonVectorField | this_VectorField_12= ruleVectorField )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400B00C60000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400B00C70000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2010000802000030L,0x0000000000000031L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L,0x0000000000010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000002002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000020002002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000020002002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0104000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0004000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1C00000000002002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x00001FFE00000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4004000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0E40000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0004008000000030L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0004008000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003F0L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000010L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FF00L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FE00L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x000000000000FC00L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F800L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x000000000000E000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020004L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x000FE00000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000020L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0030000000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x00000000007FC000L});

}
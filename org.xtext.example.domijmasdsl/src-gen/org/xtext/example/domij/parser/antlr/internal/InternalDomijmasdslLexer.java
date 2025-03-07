package org.xtext.example.domij.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomijmasdslLexer extends Lexer {
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

    public InternalDomijmasdslLexer() {;} 
    public InternalDomijmasdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDomijmasdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDomijmasdsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:11:7: ( 'SCRIPT' )
            // InternalDomijmasdsl.g:11:9: 'SCRIPT'
            {
            match("SCRIPT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:12:7: ( 'FOR' )
            // InternalDomijmasdsl.g:12:9: 'FOR'
            {
            match("FOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:13:7: ( 'WITH' )
            // InternalDomijmasdsl.g:13:9: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:14:7: ( 'METHODS' )
            // InternalDomijmasdsl.g:14:9: 'METHODS'
            {
            match("METHODS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:15:7: ( '[' )
            // InternalDomijmasdsl.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:16:7: ( ']' )
            // InternalDomijmasdsl.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:17:7: ( 'CREATE' )
            // InternalDomijmasdsl.g:17:9: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:18:7: ( 'ALTER' )
            // InternalDomijmasdsl.g:18:9: 'ALTER'
            {
            match("ALTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:19:7: ( 'WHEN' )
            // InternalDomijmasdsl.g:19:9: 'WHEN'
            {
            match("WHEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:20:7: ( ',' )
            // InternalDomijmasdsl.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:21:7: ( ';' )
            // InternalDomijmasdsl.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:22:7: ( 'DROP' )
            // InternalDomijmasdsl.g:22:9: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:23:7: ( 'INSERT' )
            // InternalDomijmasdsl.g:23:9: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:24:7: ( 'INTO' )
            // InternalDomijmasdsl.g:24:9: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:25:7: ( 'COLLECTION' )
            // InternalDomijmasdsl.g:25:9: 'COLLECTION'
            {
            match("COLLECTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:26:7: ( 'FROM' )
            // InternalDomijmasdsl.g:26:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:27:7: ( 'path' )
            // InternalDomijmasdsl.g:27:9: 'path'
            {
            match("path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:28:7: ( '=' )
            // InternalDomijmasdsl.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:29:7: ( 'number' )
            // InternalDomijmasdsl.g:29:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:30:7: ( 'of' )
            // InternalDomijmasdsl.g:30:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:31:7: ( 'records' )
            // InternalDomijmasdsl.g:31:9: 'records'
            {
            match("records"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:32:7: ( 'UPDATE' )
            // InternalDomijmasdsl.g:32:9: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:33:7: ( 'DELETE' )
            // InternalDomijmasdsl.g:33:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:34:7: ( 'IN' )
            // InternalDomijmasdsl.g:34:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:35:7: ( 'VECTOR' )
            // InternalDomijmasdsl.g:35:9: 'VECTOR'
            {
            match("VECTOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:36:7: ( 'SEARCH' )
            // InternalDomijmasdsl.g:36:9: 'SEARCH'
            {
            match("SEARCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:37:7: ( 'top' )
            // InternalDomijmasdsl.g:37:9: 'top'
            {
            match("top"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:38:7: ( 'K' )
            // InternalDomijmasdsl.g:38:9: 'K'
            {
            match('K'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:39:7: ( 'metric' )
            // InternalDomijmasdsl.g:39:9: 'metric'
            {
            match("metric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:40:7: ( 'numUnitsProbe' )
            // InternalDomijmasdsl.g:40:9: 'numUnitsProbe'
            {
            match("numUnitsProbe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:41:7: ( 'OUT' )
            // InternalDomijmasdsl.g:41:9: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:42:7: ( 'FIELDS' )
            // InternalDomijmasdsl.g:42:9: 'FIELDS'
            {
            match("FIELDS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:43:7: ( '(' )
            // InternalDomijmasdsl.g:43:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:44:7: ( ')' )
            // InternalDomijmasdsl.g:44:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:45:7: ( 'FILTERS' )
            // InternalDomijmasdsl.g:45:9: 'FILTERS'
            {
            match("FILTERS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:46:7: ( 'QUERY' )
            // InternalDomijmasdsl.g:46:9: 'QUERY'
            {
            match("QUERY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:47:7: ( 'ON' )
            // InternalDomijmasdsl.g:47:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:48:7: ( 'DATABASE' )
            // InternalDomijmasdsl.g:48:9: 'DATABASE'
            {
            match("DATABASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:49:7: ( 'CONNECTION' )
            // InternalDomijmasdsl.g:49:9: 'CONNECTION'
            {
            match("CONNECTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:50:7: ( 'description' )
            // InternalDomijmasdsl.g:50:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:51:7: ( 'CLUSTERS' )
            // InternalDomijmasdsl.g:51:9: 'CLUSTERS'
            {
            match("CLUSTERS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:52:7: ( 'CLUSTER' )
            // InternalDomijmasdsl.g:52:9: 'CLUSTER'
            {
            match("CLUSTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:53:7: ( 'collections' )
            // InternalDomijmasdsl.g:53:9: 'collections'
            {
            match("collections"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:54:7: ( 'COLLECTIONS' )
            // InternalDomijmasdsl.g:54:9: 'COLLECTIONS'
            {
            match("COLLECTIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:55:7: ( 'LIMITS' )
            // InternalDomijmasdsl.g:55:9: 'LIMITS'
            {
            match("LIMITS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:56:7: ( 'dynamic' )
            // InternalDomijmasdsl.g:56:9: 'dynamic'
            {
            match("dynamic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:57:7: ( 'PARTITIONS' )
            // InternalDomijmasdsl.g:57:9: 'PARTITIONS'
            {
            match("PARTITIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:58:7: ( 'podType' )
            // InternalDomijmasdsl.g:58:9: 'podType'
            {
            match("podType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:59:7: ( 'podSize' )
            // InternalDomijmasdsl.g:59:9: 'podSize'
            {
            match("podSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:60:7: ( 'podEnv' )
            // InternalDomijmasdsl.g:60:9: 'podEnv'
            {
            match("podEnv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:61:7: ( 'PARTITION' )
            // InternalDomijmasdsl.g:61:9: 'PARTITION'
            {
            match("PARTITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:62:7: ( 'partition' )
            // InternalDomijmasdsl.g:62:9: 'partition'
            {
            match("partition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:63:7: ( 'key' )
            // InternalDomijmasdsl.g:63:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:64:7: ( 'FIELD' )
            // InternalDomijmasdsl.g:64:9: 'FIELD'
            {
            match("FIELD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:65:7: ( 'LIMIT' )
            // InternalDomijmasdsl.g:65:9: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:66:7: ( 'type' )
            // InternalDomijmasdsl.g:66:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:67:7: ( 'value' )
            // InternalDomijmasdsl.g:67:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:68:7: ( 'INDEX' )
            // InternalDomijmasdsl.g:68:9: 'INDEX'
            {
            match("INDEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:69:7: ( 'NONVECTOR' )
            // InternalDomijmasdsl.g:69:9: 'NONVECTOR'
            {
            match("NONVECTOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:70:7: ( 'host' )
            // InternalDomijmasdsl.g:70:9: 'host'
            {
            match("host"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:71:7: ( 'port' )
            // InternalDomijmasdsl.g:71:9: 'port'
            {
            match("port"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:72:7: ( 'apiKey' )
            // InternalDomijmasdsl.g:72:9: 'apiKey'
            {
            match("apiKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:73:7: ( 'username' )
            // InternalDomijmasdsl.g:73:9: 'username'
            {
            match("username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:74:7: ( 'password' )
            // InternalDomijmasdsl.g:74:9: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:75:7: ( 'region' )
            // InternalDomijmasdsl.g:75:9: 'region'
            {
            match("region"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:76:7: ( 'userRole' )
            // InternalDomijmasdsl.g:76:9: 'userRole'
            {
            match("userRole"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:77:7: ( 'userPrivillege' )
            // InternalDomijmasdsl.g:77:9: 'userPrivillege'
            {
            match("userPrivillege"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:78:7: ( 'cloud' )
            // InternalDomijmasdsl.g:78:9: 'cloud'
            {
            match("cloud"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:79:7: ( 'environment' )
            // InternalDomijmasdsl.g:79:9: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:80:7: ( '-' )
            // InternalDomijmasdsl.g:80:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:81:7: ( 'primary' )
            // InternalDomijmasdsl.g:81:9: 'primary'
            {
            match("primary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:82:7: ( 'INDEXES' )
            // InternalDomijmasdsl.g:82:9: 'INDEXES'
            {
            match("INDEXES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:83:7: ( 'EMBEDDING' )
            // InternalDomijmasdsl.g:83:9: 'EMBEDDING'
            {
            match("EMBEDDING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:84:7: ( 'MODEL' )
            // InternalDomijmasdsl.g:84:9: 'MODEL'
            {
            match("MODEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:85:7: ( 'PINECONE' )
            // InternalDomijmasdsl.g:85:9: 'PINECONE'
            {
            match("PINECONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:86:7: ( 'MILVUS' )
            // InternalDomijmasdsl.g:86:9: 'MILVUS'
            {
            match("MILVUS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:87:7: ( 'CHROMA' )
            // InternalDomijmasdsl.g:87:9: 'CHROMA'
            {
            match("CHROMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:88:7: ( 'WEAVIATE' )
            // InternalDomijmasdsl.g:88:9: 'WEAVIATE'
            {
            match("WEAVIATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:89:7: ( 'QDRANT' )
            // InternalDomijmasdsl.g:89:9: 'QDRANT'
            {
            match("QDRANT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:90:7: ( 'S1' )
            // InternalDomijmasdsl.g:90:9: 'S1'
            {
            match("S1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:91:7: ( 'P1' )
            // InternalDomijmasdsl.g:91:9: 'P1'
            {
            match("P1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:92:7: ( 'P2' )
            // InternalDomijmasdsl.g:92:9: 'P2'
            {
            match("P2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:93:7: ( 'X1' )
            // InternalDomijmasdsl.g:93:9: 'X1'
            {
            match("X1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:94:7: ( 'X2' )
            // InternalDomijmasdsl.g:94:9: 'X2'
            {
            match("X2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:95:7: ( 'X4' )
            // InternalDomijmasdsl.g:95:9: 'X4'
            {
            match("X4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:96:7: ( 'X8' )
            // InternalDomijmasdsl.g:96:9: 'X8'
            {
            match("X8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:97:7: ( 'US_W1_GCP' )
            // InternalDomijmasdsl.g:97:9: 'US_W1_GCP'
            {
            match("US_W1_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:98:7: ( 'US_C1_GCP' )
            // InternalDomijmasdsl.g:98:9: 'US_C1_GCP'
            {
            match("US_C1_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:99:7: ( 'US_W4_GCP' )
            // InternalDomijmasdsl.g:99:9: 'US_W4_GCP'
            {
            match("US_W4_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:100:8: ( 'US_E4_GCP' )
            // InternalDomijmasdsl.g:100:10: 'US_E4_GCP'
            {
            match("US_E4_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:101:8: ( 'NA_NE1_GCP' )
            // InternalDomijmasdsl.g:101:10: 'NA_NE1_GCP'
            {
            match("NA_NE1_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:102:8: ( 'A_NE1_GCP' )
            // InternalDomijmasdsl.g:102:10: 'A_NE1_GCP'
            {
            match("A_NE1_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:103:8: ( 'A_SE1_GCP' )
            // InternalDomijmasdsl.g:103:10: 'A_SE1_GCP'
            {
            match("A_SE1_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:104:8: ( 'US_E1_GCP' )
            // InternalDomijmasdsl.g:104:10: 'US_E1_GCP'
            {
            match("US_E1_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:105:8: ( 'EU_W1_GCP' )
            // InternalDomijmasdsl.g:105:10: 'EU_W1_GCP'
            {
            match("EU_W1_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:106:8: ( 'EU_W4_GCP' )
            // InternalDomijmasdsl.g:106:10: 'EU_W4_GCP'
            {
            match("EU_W4_GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:107:8: ( 'US_E1_AWS' )
            // InternalDomijmasdsl.g:107:10: 'US_E1_AWS'
            {
            match("US_E1_AWS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:108:8: ( 'AZURE' )
            // InternalDomijmasdsl.g:108:10: 'AZURE'
            {
            match("AZURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:109:8: ( 'INT' )
            // InternalDomijmasdsl.g:109:10: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:110:8: ( 'VARCHAR' )
            // InternalDomijmasdsl.g:110:10: 'VARCHAR'
            {
            match("VARCHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:111:8: ( 'DOUBLE' )
            // InternalDomijmasdsl.g:111:10: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:112:8: ( 'FLOAT' )
            // InternalDomijmasdsl.g:112:10: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:113:8: ( 'DATE' )
            // InternalDomijmasdsl.g:113:10: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:114:8: ( 'DATETIME' )
            // InternalDomijmasdsl.g:114:10: 'DATETIME'
            {
            match("DATETIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:115:8: ( 'JSON' )
            // InternalDomijmasdsl.g:115:10: 'JSON'
            {
            match("JSON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:116:8: ( 'BINARY_VECTOR' )
            // InternalDomijmasdsl.g:116:10: 'BINARY_VECTOR'
            {
            match("BINARY_VECTOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:117:8: ( 'FLOAT_VECTOR' )
            // InternalDomijmasdsl.g:117:10: 'FLOAT_VECTOR'
            {
            match("FLOAT_VECTOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:118:8: ( 'VECTORDIM' )
            // InternalDomijmasdsl.g:118:10: 'VECTORDIM'
            {
            match("VECTORDIM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:119:8: ( 'ARRAYLEN' )
            // InternalDomijmasdsl.g:119:10: 'ARRAYLEN'
            {
            match("ARRAYLEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:120:8: ( 'MAXSIZE' )
            // InternalDomijmasdsl.g:120:10: 'MAXSIZE'
            {
            match("MAXSIZE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:121:8: ( 'NOFPARTITIONS' )
            // InternalDomijmasdsl.g:121:10: 'NOFPARTITIONS'
            {
            match("NOFPARTITIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:122:8: ( 'NOFFIELDS' )
            // InternalDomijmasdsl.g:122:10: 'NOFFIELDS'
            {
            match("NOFFIELDS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:123:8: ( 'NOFSHARDS' )
            // InternalDomijmasdsl.g:123:10: 'NOFSHARDS'
            {
            match("NOFSHARDS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:124:8: ( 'NOFCOLLECTIONS' )
            // InternalDomijmasdsl.g:124:10: 'NOFCOLLECTIONS'
            {
            match("NOFCOLLECTIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:125:8: ( 'NOFCLUSTERUNIT' )
            // InternalDomijmasdsl.g:125:10: 'NOFCLUSTERUNIT'
            {
            match("NOFCLUSTERUNIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:126:8: ( 'NOFFACTORSPQ' )
            // InternalDomijmasdsl.g:126:10: 'NOFFACTORSPQ'
            {
            match("NOFFACTORSPQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:127:8: ( 'MAXNODEDGRE' )
            // InternalDomijmasdsl.g:127:10: 'MAXNODEDGRE'
            {
            match("MAXNODEDGRE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:128:8: ( 'EUCLIDEAN' )
            // InternalDomijmasdsl.g:128:10: 'EUCLIDEAN'
            {
            match("EUCLIDEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:129:8: ( 'MANHATTAN' )
            // InternalDomijmasdsl.g:129:10: 'MANHATTAN'
            {
            match("MANHATTAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:130:8: ( 'DOT' )
            // InternalDomijmasdsl.g:130:10: 'DOT'
            {
            match("DOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:131:8: ( 'COSINE' )
            // InternalDomijmasdsl.g:131:10: 'COSINE'
            {
            match("COSINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:132:8: ( 'FLAT' )
            // InternalDomijmasdsl.g:132:10: 'FLAT'
            {
            match("FLAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:133:8: ( 'IVF_FLAT' )
            // InternalDomijmasdsl.g:133:10: 'IVF_FLAT'
            {
            match("IVF_FLAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:134:8: ( 'IVF_SQ8' )
            // InternalDomijmasdsl.g:134:10: 'IVF_SQ8'
            {
            match("IVF_SQ8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:135:8: ( 'IVF_PQ' )
            // InternalDomijmasdsl.g:135:10: 'IVF_PQ'
            {
            match("IVF_PQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:136:8: ( 'HNSW' )
            // InternalDomijmasdsl.g:136:10: 'HNSW'
            {
            match("HNSW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:137:8: ( 'SCANN' )
            // InternalDomijmasdsl.g:137:10: 'SCANN'
            {
            match("SCANN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:138:8: ( 'STANDARD' )
            // InternalDomijmasdsl.g:138:10: 'STANDARD'
            {
            match("STANDARD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:139:8: ( 'FULL_TEXT' )
            // InternalDomijmasdsl.g:139:10: 'FULL_TEXT'
            {
            match("FULL_TEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:140:8: ( 'INTEGER' )
            // InternalDomijmasdsl.g:140:10: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:141:8: ( 'PARAM_INT' )
            // InternalDomijmasdsl.g:141:10: 'PARAM_INT'
            {
            match("PARAM_INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:142:8: ( 'AND' )
            // InternalDomijmasdsl.g:142:10: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:143:8: ( 'OR' )
            // InternalDomijmasdsl.g:143:10: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:144:8: ( 'NOT' )
            // InternalDomijmasdsl.g:144:10: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:145:8: ( 'LIKE' )
            // InternalDomijmasdsl.g:145:10: 'LIKE'
            {
            match("LIKE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:146:8: ( '!=' )
            // InternalDomijmasdsl.g:146:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:147:8: ( '>' )
            // InternalDomijmasdsl.g:147:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:148:8: ( '>=' )
            // InternalDomijmasdsl.g:148:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:149:8: ( '<' )
            // InternalDomijmasdsl.g:149:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:150:8: ( '<=' )
            // InternalDomijmasdsl.g:150:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:5001:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDomijmasdsl.g:5001:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDomijmasdsl.g:5001:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomijmasdsl.g:5001:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDomijmasdsl.g:5001:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomijmasdsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:5003:10: ( ( '0' .. '9' )+ )
            // InternalDomijmasdsl.g:5003:12: ( '0' .. '9' )+
            {
            // InternalDomijmasdsl.g:5003:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomijmasdsl.g:5003:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:5005:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDomijmasdsl.g:5005:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDomijmasdsl.g:5005:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomijmasdsl.g:5005:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDomijmasdsl.g:5005:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:5005:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomijmasdsl.g:5005:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDomijmasdsl.g:5005:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDomijmasdsl.g:5005:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDomijmasdsl.g:5005:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDomijmasdsl.g:5005:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:5007:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDomijmasdsl.g:5007:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDomijmasdsl.g:5007:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomijmasdsl.g:5007:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:5009:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDomijmasdsl.g:5009:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDomijmasdsl.g:5009:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomijmasdsl.g:5009:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDomijmasdsl.g:5009:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomijmasdsl.g:5009:41: ( '\\r' )? '\\n'
                    {
                    // InternalDomijmasdsl.g:5009:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDomijmasdsl.g:5009:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:5011:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDomijmasdsl.g:5011:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDomijmasdsl.g:5011:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDomijmasdsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDomijmasdsl.g:5013:16: ( . )
            // InternalDomijmasdsl.g:5013:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDomijmasdsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=147;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalDomijmasdsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalDomijmasdsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalDomijmasdsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalDomijmasdsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalDomijmasdsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalDomijmasdsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalDomijmasdsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalDomijmasdsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalDomijmasdsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalDomijmasdsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalDomijmasdsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalDomijmasdsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalDomijmasdsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalDomijmasdsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalDomijmasdsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalDomijmasdsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalDomijmasdsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalDomijmasdsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalDomijmasdsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalDomijmasdsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalDomijmasdsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalDomijmasdsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalDomijmasdsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalDomijmasdsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalDomijmasdsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalDomijmasdsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalDomijmasdsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalDomijmasdsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalDomijmasdsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalDomijmasdsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalDomijmasdsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalDomijmasdsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalDomijmasdsl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalDomijmasdsl.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalDomijmasdsl.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalDomijmasdsl.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalDomijmasdsl.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalDomijmasdsl.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalDomijmasdsl.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalDomijmasdsl.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalDomijmasdsl.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalDomijmasdsl.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalDomijmasdsl.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalDomijmasdsl.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalDomijmasdsl.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalDomijmasdsl.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalDomijmasdsl.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalDomijmasdsl.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalDomijmasdsl.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalDomijmasdsl.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalDomijmasdsl.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalDomijmasdsl.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalDomijmasdsl.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalDomijmasdsl.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalDomijmasdsl.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalDomijmasdsl.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalDomijmasdsl.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalDomijmasdsl.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalDomijmasdsl.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalDomijmasdsl.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalDomijmasdsl.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalDomijmasdsl.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalDomijmasdsl.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalDomijmasdsl.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalDomijmasdsl.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalDomijmasdsl.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalDomijmasdsl.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalDomijmasdsl.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalDomijmasdsl.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalDomijmasdsl.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalDomijmasdsl.g:1:430: T__81
                {
                mT__81(); 

                }
                break;
            case 72 :
                // InternalDomijmasdsl.g:1:436: T__82
                {
                mT__82(); 

                }
                break;
            case 73 :
                // InternalDomijmasdsl.g:1:442: T__83
                {
                mT__83(); 

                }
                break;
            case 74 :
                // InternalDomijmasdsl.g:1:448: T__84
                {
                mT__84(); 

                }
                break;
            case 75 :
                // InternalDomijmasdsl.g:1:454: T__85
                {
                mT__85(); 

                }
                break;
            case 76 :
                // InternalDomijmasdsl.g:1:460: T__86
                {
                mT__86(); 

                }
                break;
            case 77 :
                // InternalDomijmasdsl.g:1:466: T__87
                {
                mT__87(); 

                }
                break;
            case 78 :
                // InternalDomijmasdsl.g:1:472: T__88
                {
                mT__88(); 

                }
                break;
            case 79 :
                // InternalDomijmasdsl.g:1:478: T__89
                {
                mT__89(); 

                }
                break;
            case 80 :
                // InternalDomijmasdsl.g:1:484: T__90
                {
                mT__90(); 

                }
                break;
            case 81 :
                // InternalDomijmasdsl.g:1:490: T__91
                {
                mT__91(); 

                }
                break;
            case 82 :
                // InternalDomijmasdsl.g:1:496: T__92
                {
                mT__92(); 

                }
                break;
            case 83 :
                // InternalDomijmasdsl.g:1:502: T__93
                {
                mT__93(); 

                }
                break;
            case 84 :
                // InternalDomijmasdsl.g:1:508: T__94
                {
                mT__94(); 

                }
                break;
            case 85 :
                // InternalDomijmasdsl.g:1:514: T__95
                {
                mT__95(); 

                }
                break;
            case 86 :
                // InternalDomijmasdsl.g:1:520: T__96
                {
                mT__96(); 

                }
                break;
            case 87 :
                // InternalDomijmasdsl.g:1:526: T__97
                {
                mT__97(); 

                }
                break;
            case 88 :
                // InternalDomijmasdsl.g:1:532: T__98
                {
                mT__98(); 

                }
                break;
            case 89 :
                // InternalDomijmasdsl.g:1:538: T__99
                {
                mT__99(); 

                }
                break;
            case 90 :
                // InternalDomijmasdsl.g:1:544: T__100
                {
                mT__100(); 

                }
                break;
            case 91 :
                // InternalDomijmasdsl.g:1:551: T__101
                {
                mT__101(); 

                }
                break;
            case 92 :
                // InternalDomijmasdsl.g:1:558: T__102
                {
                mT__102(); 

                }
                break;
            case 93 :
                // InternalDomijmasdsl.g:1:565: T__103
                {
                mT__103(); 

                }
                break;
            case 94 :
                // InternalDomijmasdsl.g:1:572: T__104
                {
                mT__104(); 

                }
                break;
            case 95 :
                // InternalDomijmasdsl.g:1:579: T__105
                {
                mT__105(); 

                }
                break;
            case 96 :
                // InternalDomijmasdsl.g:1:586: T__106
                {
                mT__106(); 

                }
                break;
            case 97 :
                // InternalDomijmasdsl.g:1:593: T__107
                {
                mT__107(); 

                }
                break;
            case 98 :
                // InternalDomijmasdsl.g:1:600: T__108
                {
                mT__108(); 

                }
                break;
            case 99 :
                // InternalDomijmasdsl.g:1:607: T__109
                {
                mT__109(); 

                }
                break;
            case 100 :
                // InternalDomijmasdsl.g:1:614: T__110
                {
                mT__110(); 

                }
                break;
            case 101 :
                // InternalDomijmasdsl.g:1:621: T__111
                {
                mT__111(); 

                }
                break;
            case 102 :
                // InternalDomijmasdsl.g:1:628: T__112
                {
                mT__112(); 

                }
                break;
            case 103 :
                // InternalDomijmasdsl.g:1:635: T__113
                {
                mT__113(); 

                }
                break;
            case 104 :
                // InternalDomijmasdsl.g:1:642: T__114
                {
                mT__114(); 

                }
                break;
            case 105 :
                // InternalDomijmasdsl.g:1:649: T__115
                {
                mT__115(); 

                }
                break;
            case 106 :
                // InternalDomijmasdsl.g:1:656: T__116
                {
                mT__116(); 

                }
                break;
            case 107 :
                // InternalDomijmasdsl.g:1:663: T__117
                {
                mT__117(); 

                }
                break;
            case 108 :
                // InternalDomijmasdsl.g:1:670: T__118
                {
                mT__118(); 

                }
                break;
            case 109 :
                // InternalDomijmasdsl.g:1:677: T__119
                {
                mT__119(); 

                }
                break;
            case 110 :
                // InternalDomijmasdsl.g:1:684: T__120
                {
                mT__120(); 

                }
                break;
            case 111 :
                // InternalDomijmasdsl.g:1:691: T__121
                {
                mT__121(); 

                }
                break;
            case 112 :
                // InternalDomijmasdsl.g:1:698: T__122
                {
                mT__122(); 

                }
                break;
            case 113 :
                // InternalDomijmasdsl.g:1:705: T__123
                {
                mT__123(); 

                }
                break;
            case 114 :
                // InternalDomijmasdsl.g:1:712: T__124
                {
                mT__124(); 

                }
                break;
            case 115 :
                // InternalDomijmasdsl.g:1:719: T__125
                {
                mT__125(); 

                }
                break;
            case 116 :
                // InternalDomijmasdsl.g:1:726: T__126
                {
                mT__126(); 

                }
                break;
            case 117 :
                // InternalDomijmasdsl.g:1:733: T__127
                {
                mT__127(); 

                }
                break;
            case 118 :
                // InternalDomijmasdsl.g:1:740: T__128
                {
                mT__128(); 

                }
                break;
            case 119 :
                // InternalDomijmasdsl.g:1:747: T__129
                {
                mT__129(); 

                }
                break;
            case 120 :
                // InternalDomijmasdsl.g:1:754: T__130
                {
                mT__130(); 

                }
                break;
            case 121 :
                // InternalDomijmasdsl.g:1:761: T__131
                {
                mT__131(); 

                }
                break;
            case 122 :
                // InternalDomijmasdsl.g:1:768: T__132
                {
                mT__132(); 

                }
                break;
            case 123 :
                // InternalDomijmasdsl.g:1:775: T__133
                {
                mT__133(); 

                }
                break;
            case 124 :
                // InternalDomijmasdsl.g:1:782: T__134
                {
                mT__134(); 

                }
                break;
            case 125 :
                // InternalDomijmasdsl.g:1:789: T__135
                {
                mT__135(); 

                }
                break;
            case 126 :
                // InternalDomijmasdsl.g:1:796: T__136
                {
                mT__136(); 

                }
                break;
            case 127 :
                // InternalDomijmasdsl.g:1:803: T__137
                {
                mT__137(); 

                }
                break;
            case 128 :
                // InternalDomijmasdsl.g:1:810: T__138
                {
                mT__138(); 

                }
                break;
            case 129 :
                // InternalDomijmasdsl.g:1:817: T__139
                {
                mT__139(); 

                }
                break;
            case 130 :
                // InternalDomijmasdsl.g:1:824: T__140
                {
                mT__140(); 

                }
                break;
            case 131 :
                // InternalDomijmasdsl.g:1:831: T__141
                {
                mT__141(); 

                }
                break;
            case 132 :
                // InternalDomijmasdsl.g:1:838: T__142
                {
                mT__142(); 

                }
                break;
            case 133 :
                // InternalDomijmasdsl.g:1:845: T__143
                {
                mT__143(); 

                }
                break;
            case 134 :
                // InternalDomijmasdsl.g:1:852: T__144
                {
                mT__144(); 

                }
                break;
            case 135 :
                // InternalDomijmasdsl.g:1:859: T__145
                {
                mT__145(); 

                }
                break;
            case 136 :
                // InternalDomijmasdsl.g:1:866: T__146
                {
                mT__146(); 

                }
                break;
            case 137 :
                // InternalDomijmasdsl.g:1:873: T__147
                {
                mT__147(); 

                }
                break;
            case 138 :
                // InternalDomijmasdsl.g:1:880: T__148
                {
                mT__148(); 

                }
                break;
            case 139 :
                // InternalDomijmasdsl.g:1:887: T__149
                {
                mT__149(); 

                }
                break;
            case 140 :
                // InternalDomijmasdsl.g:1:894: T__150
                {
                mT__150(); 

                }
                break;
            case 141 :
                // InternalDomijmasdsl.g:1:901: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 142 :
                // InternalDomijmasdsl.g:1:909: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 143 :
                // InternalDomijmasdsl.g:1:918: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 144 :
                // InternalDomijmasdsl.g:1:930: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 145 :
                // InternalDomijmasdsl.g:1:946: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 146 :
                // InternalDomijmasdsl.g:1:962: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 147 :
                // InternalDomijmasdsl.g:1:970: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\73\2\uffff\2\73\2\uffff\3\73\1\uffff\6\73\1\150\2\73\2\uffff\14\73\1\uffff\5\73\1\66\1\u008e\1\u0090\1\66\2\uffff\3\66\2\uffff\2\73\1\u0099\1\73\1\uffff\14\73\2\uffff\11\73\2\uffff\4\73\1\u00be\4\73\1\uffff\1\73\1\u00c7\7\73\1\uffff\2\73\1\u00d2\1\u00d3\2\uffff\11\73\1\u00de\1\u00df\10\73\1\uffff\2\73\1\u00ed\1\u00ee\1\u00ef\1\u00f0\3\73\12\uffff\3\73\1\uffff\1\73\1\u00f8\31\73\1\u0113\4\73\1\u0119\1\73\1\u011d\1\73\1\uffff\10\73\1\uffff\6\73\1\u0132\2\73\1\u0135\2\uffff\12\73\2\uffff\1\u0141\3\73\1\u0148\10\73\4\uffff\7\73\1\uffff\1\u0158\3\73\1\u015c\1\73\1\u015e\1\u015f\22\73\1\uffff\1\u0172\2\73\1\u0176\1\73\1\uffff\1\73\1\u0179\1\73\1\uffff\2\73\1\u017f\5\73\1\u0185\13\73\1\uffff\1\u0193\1\73\1\uffff\7\73\1\u019c\3\73\1\uffff\6\73\1\uffff\1\73\1\u01a9\6\73\1\u01b3\1\73\1\u01b5\1\73\1\u01b7\2\73\1\uffff\1\u01bb\1\73\1\u01be\1\uffff\1\73\2\uffff\2\73\1\u01c2\12\73\1\u01cd\2\73\1\u01d0\1\73\1\uffff\3\73\1\uffff\2\73\1\uffff\1\73\1\u01d9\3\73\1\uffff\5\73\1\uffff\15\73\1\uffff\1\73\1\u01f0\4\73\1\u01f5\1\u01f7\1\uffff\3\73\1\u01fb\10\73\1\uffff\11\73\1\uffff\1\73\1\uffff\1\u020e\1\uffff\1\u020f\1\73\1\u0211\1\uffff\2\73\1\uffff\3\73\1\uffff\1\u0217\3\73\1\u021b\2\73\1\u021e\1\73\1\u0220\1\uffff\2\73\1\uffff\1\73\1\u0224\2\73\1\u0227\1\u0228\2\73\1\uffff\2\73\1\u022d\4\73\1\u0232\1\73\1\u0234\2\73\1\u0237\1\u0238\5\73\1\u0240\1\73\1\u0242\1\uffff\1\u0243\3\73\1\uffff\1\u0247\1\uffff\3\73\1\uffff\10\73\1\u0253\11\73\2\uffff\1\73\1\uffff\1\u025e\3\73\1\u0262\1\uffff\1\u0263\2\73\1\uffff\2\73\1\uffff\1\u0269\1\uffff\3\73\1\uffff\2\73\2\uffff\1\u026f\1\u0270\1\73\1\u0272\1\uffff\2\73\1\u0275\1\u0276\1\uffff\1\u0277\1\uffff\1\73\1\u0279\2\uffff\7\73\1\uffff\1\u0281\2\uffff\1\73\1\u0283\1\73\1\uffff\13\73\1\uffff\11\73\1\u0299\1\uffff\2\73\1\u029c\2\uffff\4\73\1\u02a1\1\uffff\2\73\1\u02a4\1\u02a5\1\u02a6\2\uffff\1\u02a7\1\uffff\1\73\1\u02a9\3\uffff\1\73\1\uffff\7\73\1\uffff\1\73\1\uffff\3\73\1\u02b6\10\73\1\u02bf\1\u02c0\7\73\1\uffff\1\73\1\u02c9\1\uffff\1\73\1\u02cb\2\73\1\uffff\1\u02ce\1\u02cf\4\uffff\1\u02d0\1\uffff\1\73\1\u02d2\1\u02d3\1\u02d4\1\u02d5\1\u02d6\1\u02d7\1\u02d8\2\73\1\u02dc\1\u02dd\1\uffff\1\u02de\1\73\1\u02e0\1\73\1\u02e2\3\73\2\uffff\2\73\1\u02e8\1\u02e9\1\u02ea\1\u02eb\2\73\1\uffff\1\73\1\uffff\1\u02f0\1\u02f1\3\uffff\1\73\7\uffff\2\73\1\u02f5\3\uffff\1\73\1\uffff\1\73\1\uffff\2\73\1\u02fa\2\73\4\uffff\2\73\1\u02ff\1\u0300\2\uffff\1\73\1\u0302\1\u0303\1\uffff\4\73\1\uffff\1\73\1\u0309\1\73\1\u030b\2\uffff\1\73\2\uffff\1\73\1\u030e\3\73\1\uffff\1\73\1\uffff\1\u0313\1\u0314\1\uffff\3\73\1\u0318\2\uffff\1\u0319\1\u031a\1\u031b\4\uffff";
    static final String DFA12_eofS =
        "\u031c\uffff";
    static final String DFA12_minS =
        "\1\0\1\61\1\111\1\105\1\101\2\uffff\1\110\1\114\2\uffff\1\101\1\116\1\141\1\uffff\1\165\1\146\1\145\1\120\1\101\1\157\1\60\1\145\1\116\2\uffff\1\104\1\145\1\154\1\111\1\61\1\145\1\141\1\101\1\157\1\160\1\163\1\156\1\uffff\1\115\1\61\1\123\1\111\1\116\3\75\1\101\2\uffff\2\0\1\52\2\uffff\2\101\1\60\1\101\1\uffff\1\122\1\117\1\105\1\101\1\114\1\124\1\105\1\101\1\124\1\104\1\114\1\116\2\uffff\1\105\1\114\1\125\1\122\1\124\1\116\1\125\1\122\1\104\2\uffff\1\117\1\114\2\124\1\60\1\106\1\162\1\144\1\151\1\uffff\1\155\1\60\1\143\1\104\1\137\1\103\1\122\2\160\1\uffff\1\164\1\124\2\60\2\uffff\1\105\1\122\1\163\1\156\1\154\1\157\1\113\1\122\1\116\2\60\1\171\1\154\1\106\1\137\1\163\1\151\1\145\1\166\1\uffff\1\102\1\103\4\60\1\117\1\116\1\123\12\uffff\1\111\1\116\1\122\1\uffff\1\116\1\60\1\115\1\114\1\124\1\101\1\124\1\114\1\110\1\116\1\126\1\110\1\105\1\126\1\116\1\110\1\101\1\114\1\116\1\111\1\123\1\117\3\105\1\122\1\101\1\60\1\120\1\105\1\101\1\102\1\60\1\105\1\60\1\105\1\uffff\1\137\1\150\1\164\1\163\1\105\1\164\1\155\1\125\1\uffff\1\157\1\151\1\101\1\103\1\124\1\103\1\60\1\145\1\162\1\60\2\uffff\1\122\1\101\1\143\1\141\1\154\1\165\1\111\1\105\1\101\1\105\2\uffff\1\60\1\165\1\126\1\103\1\60\1\116\1\164\1\113\1\162\1\151\1\105\1\127\1\114\4\uffff\1\116\1\101\1\127\1\120\1\116\1\103\1\104\1\uffff\1\60\1\104\1\105\1\124\1\60\1\137\2\60\1\111\1\117\1\114\1\125\1\111\1\117\1\101\1\124\2\105\1\116\1\124\1\115\1\122\2\61\1\105\1\131\1\uffff\1\60\1\124\1\102\1\60\1\114\1\uffff\1\122\1\60\1\107\1\uffff\1\130\1\106\1\60\1\151\1\167\1\171\1\151\1\156\1\60\1\141\1\145\1\156\1\162\1\157\1\124\3\61\1\117\1\110\1\uffff\1\60\1\151\1\uffff\1\131\1\116\1\162\1\155\1\145\1\144\1\124\1\60\1\111\1\115\1\103\1\uffff\1\145\1\105\2\101\1\110\1\114\1\uffff\1\105\1\60\1\145\1\120\1\162\1\104\1\61\1\111\1\60\1\122\1\60\1\124\1\60\1\110\1\101\1\uffff\1\60\1\122\1\60\1\uffff\1\124\2\uffff\1\101\1\104\1\60\1\123\1\132\1\104\1\124\1\105\2\103\2\105\1\101\1\60\2\137\1\60\1\114\1\uffff\1\105\1\101\1\111\1\uffff\1\105\1\124\1\uffff\1\105\1\60\1\114\2\121\1\uffff\1\164\1\157\1\160\1\172\1\166\1\uffff\2\162\1\151\1\144\1\156\1\105\5\137\1\122\1\101\1\uffff\1\143\1\60\1\124\2\151\1\143\2\60\1\uffff\1\124\1\137\1\117\1\60\1\103\1\122\1\105\1\103\1\101\1\114\1\125\1\61\1\uffff\1\171\1\141\1\157\1\162\1\157\1\104\2\137\1\104\1\uffff\1\131\1\uffff\1\60\1\uffff\1\60\1\122\1\60\1\uffff\1\123\1\126\1\uffff\1\105\1\124\1\123\1\uffff\1\60\2\105\1\124\1\60\2\124\1\60\1\122\1\60\1\uffff\2\107\1\uffff\1\105\1\60\1\123\1\115\2\60\1\122\1\123\1\uffff\1\101\1\70\1\60\1\151\1\162\2\145\1\60\1\171\1\60\1\164\1\163\2\60\4\107\1\101\1\60\1\122\1\60\1\uffff\1\60\1\160\1\143\1\164\1\uffff\1\60\1\uffff\2\111\1\116\1\uffff\2\124\1\114\1\124\1\122\1\114\1\123\1\137\1\60\1\155\1\154\1\151\1\156\1\111\2\107\1\105\1\137\2\uffff\1\104\1\uffff\1\60\1\105\1\130\1\105\1\60\1\uffff\1\60\1\104\1\101\1\uffff\2\111\1\uffff\1\60\1\uffff\2\103\1\116\1\uffff\2\105\2\uffff\2\60\1\124\1\60\1\uffff\1\157\1\144\2\60\1\uffff\1\60\1\uffff\1\163\1\60\2\uffff\5\103\1\127\1\111\1\uffff\1\60\2\uffff\1\164\1\60\1\151\1\uffff\1\117\1\116\1\105\1\117\1\111\1\104\1\117\1\104\1\105\1\124\1\107\1\uffff\2\145\1\166\1\155\1\116\2\103\1\101\1\126\1\60\1\uffff\1\103\1\124\1\60\2\uffff\1\107\1\116\2\117\1\60\1\uffff\2\120\3\60\2\uffff\1\60\1\uffff\1\156\1\60\3\uffff\1\120\1\uffff\5\120\1\123\1\115\1\uffff\1\151\1\uffff\1\157\1\116\1\124\1\60\1\122\1\124\1\123\1\122\1\123\1\103\1\105\1\103\2\60\1\151\1\145\1\107\2\120\1\116\1\105\1\uffff\1\124\1\60\1\uffff\1\122\1\60\2\116\1\uffff\2\60\4\uffff\1\60\1\uffff\1\162\7\60\1\157\1\156\2\60\1\uffff\1\60\1\111\1\60\1\123\1\60\1\124\1\122\1\120\2\uffff\1\154\1\156\4\60\1\103\1\117\1\uffff\1\105\1\uffff\2\60\3\uffff\1\157\7\uffff\1\156\1\163\1\60\3\uffff\1\117\1\uffff\1\120\1\uffff\1\111\1\125\1\60\1\154\1\164\4\uffff\1\124\1\122\2\60\2\uffff\1\142\2\60\1\uffff\1\116\1\121\1\117\1\116\1\uffff\1\145\1\60\1\117\1\60\2\uffff\1\145\2\uffff\1\123\1\60\1\116\1\111\1\147\1\uffff\1\122\1\uffff\2\60\1\uffff\1\123\1\124\1\145\1\60\2\uffff\3\60\4\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\124\1\125\1\111\1\117\2\uffff\1\122\1\137\2\uffff\1\122\1\126\1\162\1\uffff\1\165\1\146\1\145\1\123\1\105\1\171\1\172\1\145\1\125\2\uffff\1\125\1\171\1\157\2\111\1\145\1\141\1\117\1\157\1\160\1\163\1\156\1\uffff\1\125\1\70\1\123\1\111\1\116\3\75\1\172\2\uffff\2\uffff\1\57\2\uffff\1\122\1\101\1\172\1\101\1\uffff\1\122\1\117\1\114\1\117\1\114\1\124\1\105\1\101\1\124\1\104\1\114\1\130\2\uffff\1\105\1\123\1\125\1\122\1\124\1\123\1\125\1\122\1\104\2\uffff\1\117\1\114\1\124\1\125\1\172\1\106\1\164\1\162\1\151\1\uffff\1\155\1\172\1\147\1\104\1\137\1\103\1\122\2\160\1\uffff\1\164\1\124\2\172\2\uffff\1\105\1\122\1\163\1\156\1\154\1\157\1\115\1\122\1\116\2\172\1\171\1\154\1\124\1\137\1\163\1\151\1\145\1\166\1\uffff\1\102\1\137\4\172\1\117\1\116\1\123\12\uffff\1\111\1\116\1\122\1\uffff\1\116\1\172\1\115\1\114\1\124\1\101\1\124\1\114\1\110\1\116\1\126\1\110\1\105\1\126\1\123\1\110\1\101\1\114\1\116\1\111\1\123\1\117\3\105\1\122\1\101\1\172\1\120\2\105\1\102\1\172\1\105\1\172\1\105\1\uffff\1\137\1\150\1\164\1\163\1\124\1\164\1\155\1\142\1\uffff\1\157\1\151\1\101\1\127\1\124\1\103\1\172\1\145\1\162\1\172\2\uffff\1\122\1\101\1\143\1\141\1\154\1\165\1\111\1\105\1\124\1\105\2\uffff\1\172\1\165\1\126\1\123\1\172\1\116\1\164\1\113\1\162\1\151\1\105\1\127\1\114\4\uffff\1\116\1\101\1\127\1\120\1\116\1\103\1\104\1\uffff\1\172\1\104\1\105\1\124\1\172\1\137\2\172\1\111\1\117\1\114\1\125\1\111\1\117\1\101\1\124\2\105\1\116\1\124\1\115\1\122\2\61\1\105\1\131\1\uffff\1\172\1\124\1\102\1\172\1\114\1\uffff\1\122\1\172\1\107\1\uffff\1\130\1\123\1\172\1\151\1\167\1\171\1\151\1\156\1\172\1\141\1\145\1\156\1\162\1\157\1\124\1\64\1\61\1\64\1\117\1\110\1\uffff\1\172\1\151\1\uffff\1\131\1\116\1\162\1\155\1\145\1\144\1\124\1\172\1\111\1\115\1\103\1\uffff\1\145\1\105\1\101\1\111\1\110\1\117\1\uffff\1\105\1\172\1\145\1\156\1\162\1\104\1\64\1\111\1\172\1\122\1\172\1\124\1\172\1\110\1\101\1\uffff\1\172\1\122\1\172\1\uffff\1\124\2\uffff\1\101\1\104\1\172\1\123\1\132\1\104\1\124\1\105\2\103\2\105\1\101\1\172\2\137\1\172\1\114\1\uffff\1\105\1\101\1\111\1\uffff\1\105\1\124\1\uffff\1\105\1\172\1\114\2\121\1\uffff\1\164\1\157\1\160\1\172\1\166\1\uffff\2\162\1\151\1\144\1\156\1\105\5\137\1\122\1\101\1\uffff\1\143\1\172\1\124\2\151\1\143\2\172\1\uffff\1\124\1\137\1\117\1\172\1\103\1\122\1\105\1\103\1\101\1\114\1\125\1\61\1\uffff\1\171\1\141\1\157\1\162\1\157\1\104\2\137\1\104\1\uffff\1\131\1\uffff\1\172\1\uffff\1\172\1\122\1\172\1\uffff\1\123\1\126\1\uffff\1\105\1\124\1\123\1\uffff\1\172\2\105\1\124\1\172\2\124\1\172\1\122\1\172\1\uffff\2\107\1\uffff\1\105\1\172\1\123\1\115\2\172\1\122\1\123\1\uffff\1\101\1\70\1\172\1\151\1\162\2\145\1\172\1\171\1\172\1\164\1\163\2\172\5\107\1\172\1\122\1\172\1\uffff\1\172\1\160\1\143\1\164\1\uffff\1\172\1\uffff\2\111\1\116\1\uffff\2\124\1\114\1\124\1\122\1\114\1\123\1\137\1\172\1\155\1\154\1\151\1\156\1\111\2\107\1\105\1\137\2\uffff\1\104\1\uffff\1\172\1\105\1\130\1\105\1\172\1\uffff\1\172\1\104\1\101\1\uffff\2\111\1\uffff\1\172\1\uffff\2\103\1\116\1\uffff\2\105\2\uffff\2\172\1\124\1\172\1\uffff\1\157\1\144\2\172\1\uffff\1\172\1\uffff\1\163\1\172\2\uffff\5\103\1\127\1\111\1\uffff\1\172\2\uffff\1\164\1\172\1\151\1\uffff\1\117\1\116\1\105\1\117\1\111\1\104\1\117\1\104\1\105\1\124\1\107\1\uffff\2\145\1\166\1\155\1\116\2\103\1\101\1\126\1\172\1\uffff\1\103\1\124\1\172\2\uffff\1\107\1\116\2\117\1\172\1\uffff\2\120\3\172\2\uffff\1\172\1\uffff\1\156\1\172\3\uffff\1\120\1\uffff\5\120\1\123\1\115\1\uffff\1\151\1\uffff\1\157\1\116\1\124\1\172\1\122\1\124\1\123\1\122\1\123\1\103\1\105\1\103\2\172\1\151\1\145\1\107\2\120\1\116\1\105\1\uffff\1\124\1\172\1\uffff\1\122\1\172\2\116\1\uffff\2\172\4\uffff\1\172\1\uffff\1\162\7\172\1\157\1\156\2\172\1\uffff\1\172\1\111\1\172\1\123\1\172\1\124\1\122\1\120\2\uffff\1\154\1\156\4\172\1\103\1\117\1\uffff\1\105\1\uffff\2\172\3\uffff\1\157\7\uffff\1\156\1\163\1\172\3\uffff\1\117\1\uffff\1\120\1\uffff\1\111\1\125\1\172\1\154\1\164\4\uffff\1\124\1\122\2\172\2\uffff\1\142\2\172\1\uffff\1\116\1\121\1\117\1\116\1\uffff\1\145\1\172\1\117\1\172\2\uffff\1\145\2\uffff\1\123\1\172\1\116\1\111\1\147\1\uffff\1\122\1\uffff\2\172\1\uffff\1\123\1\124\1\145\1\172\2\uffff\3\172\4\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\5\1\6\2\uffff\1\12\1\13\3\uffff\1\22\11\uffff\1\41\1\42\14\uffff\1\106\11\uffff\1\u008d\1\u008e\3\uffff\1\u0092\1\u0093\4\uffff\1\u008d\14\uffff\1\5\1\6\11\uffff\1\12\1\13\11\uffff\1\22\11\uffff\1\34\4\uffff\1\41\1\42\23\uffff\1\106\11\uffff\1\u0088\1\u008a\1\u0089\1\u008c\1\u008b\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\3\uffff\1\120\44\uffff\1\30\10\uffff\1\24\12\uffff\1\45\1\u0085\12\uffff\1\121\1\122\15\uffff\1\123\1\124\1\125\1\126\7\uffff\1\2\32\uffff\1\u0084\5\uffff\1\170\3\uffff\1\143\24\uffff\1\33\2\uffff\1\37\13\uffff\1\65\6\uffff\1\u0086\17\uffff\1\20\3\uffff\1\172\1\uffff\1\3\1\11\22\uffff\1\14\3\uffff\1\147\2\uffff\1\16\5\uffff\1\21\5\uffff\1\75\15\uffff\1\70\10\uffff\1\u0087\14\uffff\1\74\11\uffff\1\151\1\uffff\1\176\1\uffff\1\177\3\uffff\1\66\2\uffff\1\146\3\uffff\1\112\12\uffff\1\10\2\uffff\1\142\10\uffff\1\72\26\uffff\1\44\4\uffff\1\104\1\uffff\1\67\3\uffff\1\71\22\uffff\1\1\1\32\1\uffff\1\40\5\uffff\1\114\3\uffff\1\7\2\uffff\1\171\1\uffff\1\115\3\uffff\1\27\2\uffff\1\145\1\15\4\uffff\1\175\4\uffff\1\62\1\uffff\1\23\2\uffff\1\101\1\26\7\uffff\1\31\1\uffff\1\35\1\117\3\uffff\1\55\13\uffff\1\76\12\uffff\1\43\3\uffff\1\4\1\156\5\uffff\1\52\5\uffff\1\u0082\1\110\1\uffff\1\174\2\uffff\1\60\1\61\1\107\1\uffff\1\25\7\uffff\1\144\1\uffff\1\56\25\uffff\1\u0080\2\uffff\1\116\4\uffff\1\51\2\uffff\1\155\1\46\1\150\1\173\1\uffff\1\100\14\uffff\1\113\10\uffff\1\77\1\102\10\uffff\1\u0081\1\uffff\1\167\2\uffff\1\134\1\135\1\64\1\uffff\1\127\1\131\1\130\1\132\1\136\1\141\1\154\3\uffff\1\63\1\u0083\1\73\1\uffff\1\160\1\uffff\1\161\5\uffff\1\111\1\137\1\140\1\166\4\uffff\1\17\1\47\3\uffff\1\57\4\uffff\1\133\4\uffff\1\165\1\54\1\uffff\1\50\1\53\5\uffff\1\105\1\uffff\1\153\2\uffff\1\164\4\uffff\1\36\1\157\3\uffff\1\152\1\162\1\163\1\103";
    static final String DFA12_specialS =
        "\1\2\61\uffff\1\0\1\1\u02e8\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\54\1\62\4\66\1\63\1\30\1\31\2\66\1\11\1\46\1\66\1\64\12\61\1\66\1\12\1\56\1\16\1\55\2\66\1\10\1\52\1\7\1\13\1\47\1\2\1\60\1\53\1\14\1\51\1\25\1\35\1\4\1\41\1\27\1\36\1\32\1\60\1\1\1\60\1\22\1\23\1\3\1\50\2\60\1\5\1\66\1\6\1\57\1\60\1\66\1\43\1\60\1\34\1\33\1\45\2\60\1\42\2\60\1\37\1\60\1\26\1\17\1\20\1\15\1\60\1\21\1\60\1\24\1\44\1\40\4\60\uff85\66",
            "\1\71\21\uffff\1\67\1\uffff\1\70\16\uffff\1\72",
            "\1\76\2\uffff\1\77\2\uffff\1\74\2\uffff\1\75\2\uffff\1\100",
            "\1\103\2\uffff\1\102\1\101",
            "\1\107\3\uffff\1\104\3\uffff\1\106\5\uffff\1\105",
            "",
            "",
            "\1\115\3\uffff\1\114\2\uffff\1\113\2\uffff\1\112",
            "\1\116\1\uffff\1\122\3\uffff\1\121\7\uffff\1\120\4\uffff\1\117",
            "",
            "",
            "\1\127\3\uffff\1\126\11\uffff\1\130\2\uffff\1\125",
            "\1\131\7\uffff\1\132",
            "\1\133\15\uffff\1\134\2\uffff\1\135",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142\2\uffff\1\143",
            "\1\145\3\uffff\1\144",
            "\1\146\11\uffff\1\147",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\151",
            "\1\153\3\uffff\1\154\2\uffff\1\152",
            "",
            "",
            "\1\160\20\uffff\1\157",
            "\1\161\23\uffff\1\162",
            "\1\164\2\uffff\1\163",
            "\1\165",
            "\1\170\1\171\16\uffff\1\166\7\uffff\1\167",
            "\1\172",
            "\1\173",
            "\1\175\15\uffff\1\174",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\u0083\7\uffff\1\u0084",
            "\1\u0085\1\u0086\1\uffff\1\u0087\3\uffff\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008f",
            "\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\0\u0092",
            "\0\u0092",
            "\1\u0093\4\uffff\1\u0094",
            "",
            "",
            "\1\u0097\20\uffff\1\u0096",
            "\1\u0098",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d\6\uffff\1\u009e",
            "\1\u00a0\15\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a9\11\uffff\1\u00a8",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab\1\uffff\1\u00ac\4\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1\4\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00ba\1\u00b9",
            "\12\73\7\uffff\3\73\1\u00bd\16\73\1\u00bb\1\u00bc\6\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00bf",
            "\1\u00c1\1\u00c2\1\u00c0",
            "\1\u00c3\15\uffff\1\u00c4",
            "\1\u00c5",
            "",
            "\1\u00c6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00c8\3\uffff\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00db\1\uffff\1\u00da",
            "\1\u00dc",
            "\1\u00dd",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e3\7\uffff\1\u00e2\5\uffff\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "\1\u00ec\33\uffff\1\u00eb",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0106\4\uffff\1\u0105",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116\3\uffff\1\u0117",
            "\1\u0118",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u011a",
            "\12\73\7\uffff\4\73\1\u011c\11\73\1\u011b\13\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0125\15\uffff\1\u0124\1\u0123",
            "\1\u0126",
            "\1\u0127",
            "\1\u0129\14\uffff\1\u0128",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012e\1\uffff\1\u012f\21\uffff\1\u012d",
            "\1\u0130",
            "\1\u0131",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0133",
            "\1\u0134",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013f\22\uffff\1\u013e",
            "\1\u0140",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0142",
            "\1\u0143",
            "\1\u0147\2\uffff\1\u0145\11\uffff\1\u0144\2\uffff\1\u0146",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "",
            "",
            "",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u015d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0173",
            "\1\u0174",
            "\12\73\7\uffff\23\73\1\u0175\6\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0177",
            "",
            "\1\u0178",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u017a",
            "",
            "\1\u017b",
            "\1\u017c\11\uffff\1\u017e\2\uffff\1\u017d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c\2\uffff\1\u018d",
            "\1\u018e",
            "\1\u0190\2\uffff\1\u018f",
            "\1\u0191",
            "\1\u0192",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a4\7\uffff\1\u01a3",
            "\1\u01a5",
            "\1\u01a7\2\uffff\1\u01a6",
            "",
            "\1\u01a8",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01aa",
            "\1\u01ad\1\uffff\1\u01ac\33\uffff\1\u01ab",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0\2\uffff\1\u01b1",
            "\1\u01b2",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01b4",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01b6",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01b8",
            "\1\u01b9",
            "",
            "\12\73\7\uffff\22\73\1\u01ba\7\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01bc",
            "\12\73\7\uffff\32\73\4\uffff\1\u01bd\1\uffff\32\73",
            "",
            "\1\u01bf",
            "",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01ce",
            "\1\u01cf",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01d1",
            "",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "",
            "\1\u01d5",
            "\1\u01d6",
            "",
            "\1\u01d7",
            "\12\73\7\uffff\4\73\1\u01d8\25\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "",
            "\1\u01ef",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\22\73\1\u01f6\7\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "",
            "\1\u020d",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0210",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0212",
            "\1\u0213",
            "",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u021c",
            "\1\u021d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u021f",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0221",
            "\1\u0222",
            "",
            "\1\u0223",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0225",
            "\1\u0226",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0229",
            "\1\u022a",
            "",
            "\1\u022b",
            "\1\u022c",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0233",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0235",
            "\1\u0236",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023e\5\uffff\1\u023d",
            "\12\73\7\uffff\3\73\1\u023f\26\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0241",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "",
            "",
            "\1\u025d",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0264",
            "\1\u0265",
            "",
            "\1\u0266",
            "\1\u0267",
            "",
            "\12\73\7\uffff\22\73\1\u0268\7\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "",
            "\1\u026d",
            "\1\u026e",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0271",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0273",
            "\1\u0274",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0278",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u0282",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u0284",
            "",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u029a",
            "\1\u029b",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u02a2",
            "\1\u02a3",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u02a8",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "\1\u02aa",
            "",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "",
            "\1\u02b2",
            "",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "",
            "\1\u02c8",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u02ca",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02cc",
            "\1\u02cd",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u02d1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02d9",
            "\1\u02da",
            "\12\73\7\uffff\22\73\1\u02db\7\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02df",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02e1",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "",
            "",
            "\1\u02e6",
            "\1\u02e7",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02ec",
            "\1\u02ed",
            "",
            "\1\u02ee",
            "",
            "\12\73\7\uffff\22\73\1\u02ef\7\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "\1\u02f2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u02f3",
            "\1\u02f4",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            "\1\u02f6",
            "",
            "\1\u02f7",
            "",
            "\1\u02f8",
            "\1\u02f9",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u02fb",
            "\1\u02fc",
            "",
            "",
            "",
            "",
            "\1\u02fd",
            "\1\u02fe",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u0301",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "",
            "\1\u0308",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u030a",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\1\u030c",
            "",
            "",
            "\1\u030d",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "",
            "\1\u0312",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "\12\73\7\uffff\32\73\4\uffff\1\73\1\uffff\32\73",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( ((LA12_50>='\u0000' && LA12_50<='\uFFFF')) ) {s = 146;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( ((LA12_51>='\u0000' && LA12_51<='\uFFFF')) ) {s = 146;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='F') ) {s = 2;}

                        else if ( (LA12_0=='W') ) {s = 3;}

                        else if ( (LA12_0=='M') ) {s = 4;}

                        else if ( (LA12_0=='[') ) {s = 5;}

                        else if ( (LA12_0==']') ) {s = 6;}

                        else if ( (LA12_0=='C') ) {s = 7;}

                        else if ( (LA12_0=='A') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0==';') ) {s = 10;}

                        else if ( (LA12_0=='D') ) {s = 11;}

                        else if ( (LA12_0=='I') ) {s = 12;}

                        else if ( (LA12_0=='p') ) {s = 13;}

                        else if ( (LA12_0=='=') ) {s = 14;}

                        else if ( (LA12_0=='n') ) {s = 15;}

                        else if ( (LA12_0=='o') ) {s = 16;}

                        else if ( (LA12_0=='r') ) {s = 17;}

                        else if ( (LA12_0=='U') ) {s = 18;}

                        else if ( (LA12_0=='V') ) {s = 19;}

                        else if ( (LA12_0=='t') ) {s = 20;}

                        else if ( (LA12_0=='K') ) {s = 21;}

                        else if ( (LA12_0=='m') ) {s = 22;}

                        else if ( (LA12_0=='O') ) {s = 23;}

                        else if ( (LA12_0=='(') ) {s = 24;}

                        else if ( (LA12_0==')') ) {s = 25;}

                        else if ( (LA12_0=='Q') ) {s = 26;}

                        else if ( (LA12_0=='d') ) {s = 27;}

                        else if ( (LA12_0=='c') ) {s = 28;}

                        else if ( (LA12_0=='L') ) {s = 29;}

                        else if ( (LA12_0=='P') ) {s = 30;}

                        else if ( (LA12_0=='k') ) {s = 31;}

                        else if ( (LA12_0=='v') ) {s = 32;}

                        else if ( (LA12_0=='N') ) {s = 33;}

                        else if ( (LA12_0=='h') ) {s = 34;}

                        else if ( (LA12_0=='a') ) {s = 35;}

                        else if ( (LA12_0=='u') ) {s = 36;}

                        else if ( (LA12_0=='e') ) {s = 37;}

                        else if ( (LA12_0=='-') ) {s = 38;}

                        else if ( (LA12_0=='E') ) {s = 39;}

                        else if ( (LA12_0=='X') ) {s = 40;}

                        else if ( (LA12_0=='J') ) {s = 41;}

                        else if ( (LA12_0=='B') ) {s = 42;}

                        else if ( (LA12_0=='H') ) {s = 43;}

                        else if ( (LA12_0=='!') ) {s = 44;}

                        else if ( (LA12_0=='>') ) {s = 45;}

                        else if ( (LA12_0=='<') ) {s = 46;}

                        else if ( (LA12_0=='^') ) {s = 47;}

                        else if ( (LA12_0=='G'||LA12_0=='R'||LA12_0=='T'||(LA12_0>='Y' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='f' && LA12_0<='g')||(LA12_0>='i' && LA12_0<='j')||LA12_0=='l'||LA12_0=='q'||LA12_0=='s'||(LA12_0>='w' && LA12_0<='z')) ) {s = 48;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 49;}

                        else if ( (LA12_0=='\"') ) {s = 50;}

                        else if ( (LA12_0=='\'') ) {s = 51;}

                        else if ( (LA12_0=='/') ) {s = 52;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 53;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='.'||LA12_0==':'||(LA12_0>='?' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
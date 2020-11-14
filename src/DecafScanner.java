// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: Lexer.flex


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class DecafScanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\1\1\2\0\1\1\22\0\1\2\1\3\1\4"+
    "\1\0\1\5\1\6\1\7\1\0\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\11\21\1\0"+
    "\1\22\1\23\1\24\1\25\2\0\1\26\3\27\1\30"+
    "\1\27\2\5\1\31\2\5\1\32\1\5\1\33\1\5"+
    "\1\34\1\5\1\35\5\5\1\36\2\5\1\37\1\0"+
    "\1\40\1\0\1\5\1\0\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\5\1\52\1\53"+
    "\1\54\1\55\1\56\1\57\1\5\1\60\1\61\1\62"+
    "\1\63\1\64\1\65\1\66\1\67\1\5\1\70\1\71"+
    "\1\72\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\1"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\2\16\1\17\1\20\1\21\1\22\3\4\1\23\1\24"+
    "\15\4\1\25\1\2\1\26\1\27\1\0\1\30\1\31"+
    "\2\0\1\32\1\0\1\33\1\34\1\35\16\4\1\36"+
    "\15\4\1\37\1\2\2\0\1\16\15\4\1\40\1\4"+
    "\1\41\1\4\1\42\12\4\2\0\1\2\1\0\1\32"+
    "\3\4\1\43\1\4\1\44\3\4\1\45\1\46\4\4"+
    "\1\47\1\50\1\51\5\4\1\52\1\53\1\54\2\4"+
    "\1\55\2\4\1\56\1\57\3\4\1\60\7\4\1\61"+
    "\4\4\1\62\5\4\1\63\1\64\1\65\4\4\1\66"+
    "\2\4\1\67\1\4\1\70\1\4\1\71\1\72\5\4"+
    "\1\73\1\74\1\4\1\75\1\76";

  private static int [] zzUnpackAction() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\73\0\73\0\166\0\261\0\354\0\73\0\u0127"+
    "\0\73\0\73\0\73\0\73\0\73\0\73\0\73\0\u0162"+
    "\0\u019d\0\u01d8\0\73\0\u0213\0\u024e\0\u0289\0\u02c4\0\u02ff"+
    "\0\u033a\0\73\0\73\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461"+
    "\0\u049c\0\u04d7\0\u0512\0\u054d\0\u0588\0\u05c3\0\u05fe\0\u0639"+
    "\0\73\0\u0674\0\73\0\73\0\261\0\73\0\73\0\u06af"+
    "\0\u06ea\0\u0725\0\u0760\0\73\0\73\0\73\0\u079b\0\u07d6"+
    "\0\u0811\0\u084c\0\u0887\0\u08c2\0\u08fd\0\u0938\0\u0973\0\u09ae"+
    "\0\u09e9\0\u0a24\0\u0a5f\0\u0a9a\0\354\0\u0ad5\0\u0b10\0\u0b4b"+
    "\0\u0b86\0\u0bc1\0\u0bfc\0\u0c37\0\u0c72\0\u0cad\0\u0ce8\0\u0d23"+
    "\0\u0d5e\0\u0d99\0\73\0\u0dd4\0\u0e0f\0\u0e4a\0\u0760\0\u0e85"+
    "\0\u0ec0\0\u0efb\0\u0f36\0\u0f71\0\u0fac\0\u0fe7\0\u1022\0\u105d"+
    "\0\u1098\0\u10d3\0\u110e\0\u1149\0\354\0\u1184\0\u11bf\0\u11fa"+
    "\0\354\0\u1235\0\u1270\0\u12ab\0\u12e6\0\u1321\0\u135c\0\u1397"+
    "\0\u13d2\0\u140d\0\u1448\0\u0dd4\0\u1483\0\u06af\0\u14be\0\u14be"+
    "\0\u14f9\0\u1534\0\u156f\0\354\0\u15aa\0\354\0\u15e5\0\u1620"+
    "\0\u165b\0\354\0\354\0\u1696\0\u16d1\0\u170c\0\u1747\0\354"+
    "\0\354\0\354\0\u1782\0\u17bd\0\u17f8\0\u1833\0\u186e\0\354"+
    "\0\354\0\354\0\u18a9\0\u18e4\0\354\0\u191f\0\u195a\0\354"+
    "\0\354\0\u1995\0\u19d0\0\u1a0b\0\354\0\u1a46\0\u1a81\0\u1abc"+
    "\0\u1af7\0\u1b32\0\u1b6d\0\u1ba8\0\354\0\u1be3\0\u1c1e\0\u1c59"+
    "\0\u1c94\0\354\0\u1ccf\0\u1d0a\0\u1d45\0\u1d80\0\u1dbb\0\354"+
    "\0\354\0\354\0\u1df6\0\u1e31\0\u1e6c\0\u1ea7\0\354\0\u1ee2"+
    "\0\u1f1d\0\354\0\u1f58\0\354\0\u1f93\0\354\0\354\0\u1fce"+
    "\0\u2009\0\u2044\0\u207f\0\u20ba\0\354\0\354\0\u20f5\0\354"+
    "\0\354";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\5\6\1\27\1\30"+
    "\1\31\1\6\1\32\1\33\1\6\1\34\1\35\1\36"+
    "\1\37\1\40\2\6\1\41\3\6\1\42\1\6\1\43"+
    "\1\44\1\45\1\46\1\6\1\47\1\50\2\6\1\51"+
    "\1\52\1\53\117\0\1\54\46\0\4\55\1\56\66\55"+
    "\5\0\1\6\12\0\2\6\4\0\11\6\2\0\27\6"+
    "\12\0\1\57\63\0\1\60\1\3\10\60\1\61\56\60"+
    "\1\3\1\60\16\0\1\62\1\0\2\22\14\0\1\63"+
    "\27\0\1\63\2\0\1\63\17\0\1\62\1\0\2\22"+
    "\75\0\1\64\72\0\1\65\72\0\1\66\53\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\4\6\1\67\22\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\17\6"+
    "\1\70\7\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\4\6\1\71\22\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\15\6\1\72\1\6\1\73\1\6"+
    "\1\74\5\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\12\6\1\75\2\6\1\76\11\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\15\6\1\77\3\6"+
    "\1\100\5\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\12\6\1\101\12\6\1\102\1\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\1\103\14\6\1\104"+
    "\11\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\5\6\1\105\5\6\1\106\1\107\4\6\1\110\5\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\4\6"+
    "\1\111\15\6\1\112\4\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\17\6\1\113\2\6\1\114\4\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\4\6"+
    "\1\115\22\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\21\6\1\116\5\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\7\6\1\117\7\6\1\120\7\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\15\6"+
    "\1\121\11\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\7\6\1\122\17\6\74\0\1\123\1\0\1\60"+
    "\1\3\67\60\1\3\1\60\1\61\1\124\10\61\1\125"+
    "\56\61\1\124\1\61\20\0\2\62\6\0\1\126\14\0"+
    "\1\126\23\0\1\126\21\0\2\127\4\0\3\127\10\0"+
    "\6\127\31\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\24\6\1\130\2\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\10\6\1\131\16\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\1\132\26\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\15\6\1\133\11\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\4\6"+
    "\1\134\22\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\15\6\1\135\11\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\1\136\26\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\14\6\1\137\12\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\22\6\1\140"+
    "\4\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\15\6\1\141\11\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\20\6\1\142\6\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\21\6\1\143\5\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\12\6\1\144"+
    "\14\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\17\6\1\145\7\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\16\6\1\146\10\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\21\6\1\147\5\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\15\6\1\150"+
    "\11\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\24\6\1\151\2\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\12\6\1\152\14\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\10\6\1\153\4\6\1\154"+
    "\11\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\1\6\1\155\25\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\21\6\1\156\5\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\17\6\1\157\7\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\10\6\1\160"+
    "\16\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\22\6\1\161\4\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\10\6\1\162\16\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\10\6\1\163\16\6\3\0"+
    "\12\164\1\165\60\164\1\61\1\124\10\61\1\125\4\61"+
    "\1\166\51\61\1\124\1\61\13\0\1\167\1\0\1\167"+
    "\2\0\2\170\47\0\1\167\6\0\1\6\12\0\2\6"+
    "\4\0\1\171\10\6\2\0\27\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\14\6\1\172\12\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\3\6\1\173"+
    "\23\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\12\6\1\174\14\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\1\175\26\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\10\6\1\176\16\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\20\6\1\177\6\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\21\6"+
    "\1\200\5\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\1\6\1\201\25\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\10\6\1\202\16\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\4\6\1\203\22\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\4\6"+
    "\1\204\22\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\20\6\1\205\6\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\12\6\1\206\14\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\4\6\1\207\22\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\1\6"+
    "\1\210\1\6\1\211\23\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\12\6\1\212\14\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\23\6\1\213\3\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\21\6"+
    "\1\214\5\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\12\6\1\215\14\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\22\6\1\216\4\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\10\6\1\217\16\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\20\6"+
    "\1\220\6\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\4\6\1\221\22\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\3\6\1\222\23\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\12\6\1\223\14\6"+
    "\3\0\12\164\1\165\4\164\1\3\53\164\20\0\2\170"+
    "\56\0\1\6\12\0\2\6\4\0\11\6\2\0\17\6"+
    "\1\224\7\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\21\6\1\225\5\6\10\0\1\6\12\0\2\6"+
    "\4\0\3\6\1\226\1\227\4\6\2\0\27\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\11\6\1\230"+
    "\15\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\20\6\1\231\6\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\10\6\1\232\16\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\12\6\1\233\14\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\14\6\1\234"+
    "\12\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\4\6\1\235\22\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\4\6\1\236\22\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\17\6\1\237\7\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\1\240\26\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\4\6"+
    "\1\241\22\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\10\6\1\242\16\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\17\6\1\243\7\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\14\6\1\244\12\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\4\6"+
    "\1\245\22\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\17\6\1\246\7\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\14\6\1\247\12\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\10\6\1\250\16\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\14\6"+
    "\1\251\12\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\4\6\1\252\22\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\3\6\1\253\23\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\13\6\1\254\13\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\5\6"+
    "\1\255\21\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\21\6\1\256\5\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\2\6\1\257\24\6\10\0\1\6"+
    "\12\0\2\6\4\0\11\6\2\0\2\6\1\260\24\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\14\6"+
    "\1\261\12\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\6\6\1\262\20\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\1\263\26\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\21\6\1\264\5\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\14\6\1\265"+
    "\12\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\22\6\1\266\4\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\20\6\1\267\6\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\4\6\1\270\22\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\1\271\26\6"+
    "\10\0\1\6\12\0\2\6\4\0\11\6\2\0\4\6"+
    "\1\272\22\6\10\0\1\6\12\0\2\6\4\0\11\6"+
    "\2\0\21\6\1\273\5\6\10\0\1\6\12\0\2\6"+
    "\4\0\11\6\2\0\26\6\1\274\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\4\6\1\275\22\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\4\6\1\276"+
    "\22\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\4\6\1\277\22\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\14\6\1\300\12\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\2\6\1\301\24\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\4\6\1\302"+
    "\22\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\6\6\1\303\20\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\21\6\1\304\5\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\4\6\1\305\22\6\10\0"+
    "\1\6\12\0\2\6\4\0\11\6\2\0\3\6\1\306"+
    "\23\6\10\0\1\6\12\0\2\6\4\0\11\6\2\0"+
    "\4\6\1\307\22\6\10\0\1\6\12\0\2\6\4\0"+
    "\11\6\2\0\20\6\1\310\6\6\10\0\1\6\12\0"+
    "\2\6\4\0\11\6\2\0\17\6\1\311\7\6\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8496];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\1\11\1\1\7\11\3\1\1\11"+
    "\6\1\2\11\15\1\1\11\1\1\2\11\1\0\2\11"+
    "\2\0\1\1\1\0\3\11\34\1\1\11\1\1\2\0"+
    "\35\1\2\0\1\1\1\0\122\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[201];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    // nothing was necessary here edit :: -Arya


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public DecafScanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.print(yytext());
            }
            // fall through
          case 63: break;
          case 2:
            { /* no operation*/
            }
            // fall through
          case 64: break;
          case 3:
            { OutputHandler.handle(Token.T_NOT);
            }
            // fall through
          case 65: break;
          case 4:
            { OutputHandler.handle(yytext(),Token.T_ID);
            }
            // fall through
          case 66: break;
          case 5:
            { OutputHandler.handle(Token.T_Modulus);
            }
            // fall through
          case 67: break;
          case 6:
            { OutputHandler.handle(Token.T_OParen);
            }
            // fall through
          case 68: break;
          case 7:
            { OutputHandler.handle(Token.T_CParen);
            }
            // fall through
          case 69: break;
          case 8:
            { OutputHandler.handle(Token.T_Star);
            }
            // fall through
          case 70: break;
          case 9:
            { OutputHandler.handle(Token.T_Plus);
            }
            // fall through
          case 71: break;
          case 10:
            { OutputHandler.handle(Token.T_Comma);
            }
            // fall through
          case 72: break;
          case 11:
            { OutputHandler.handle(Token.T_Minus);
            }
            // fall through
          case 73: break;
          case 12:
            { OutputHandler.handle(Token.T_Dot);
            }
            // fall through
          case 74: break;
          case 13:
            { OutputHandler.handle(Token.T_Slash);
            }
            // fall through
          case 75: break;
          case 14:
            { OutputHandler.handle(yytext(),Token.T_INTLITERAL);
            }
            // fall through
          case 76: break;
          case 15:
            { OutputHandler.handle(Token.T_SemiColon);
            }
            // fall through
          case 77: break;
          case 16:
            { OutputHandler.handle(Token.T_LT);
            }
            // fall through
          case 78: break;
          case 17:
            { OutputHandler.handle(Token.T_Assign);
            }
            // fall through
          case 79: break;
          case 18:
            { OutputHandler.handle(Token.T_GT);
            }
            // fall through
          case 80: break;
          case 19:
            { OutputHandler.handle(Token.T_OBracket);
            }
            // fall through
          case 81: break;
          case 20:
            { OutputHandler.handle(Token.T_CBracket);
            }
            // fall through
          case 82: break;
          case 21:
            { OutputHandler.handle(Token.T_OCB);
            }
            // fall through
          case 83: break;
          case 22:
            { OutputHandler.handle(Token.T_CCB);
            }
            // fall through
          case 84: break;
          case 23:
            { OutputHandler.handle(Token.T_NE);
            }
            // fall through
          case 85: break;
          case 24:
            { OutputHandler.handle(yytext(),Token.T_STRINGLITERAL);
            }
            // fall through
          case 86: break;
          case 25:
            { OutputHandler.handle(Token.T_AND);
            }
            // fall through
          case 87: break;
          case 26:
            { OutputHandler.handle(yytext(),Token.T_DOUBLELITERAL);
            }
            // fall through
          case 88: break;
          case 27:
            { OutputHandler.handle(Token.T_LE);
            }
            // fall through
          case 89: break;
          case 28:
            { OutputHandler.handle(Token.T_EQ);
            }
            // fall through
          case 90: break;
          case 29:
            { OutputHandler.handle(Token.T_GE);
            }
            // fall through
          case 91: break;
          case 30:
            { OutputHandler.handle(Token.T_if);
            }
            // fall through
          case 92: break;
          case 31:
            { OutputHandler.handle(Token.T_OR);
            }
            // fall through
          case 93: break;
          case 32:
            { OutputHandler.handle(Token.T_for);
            }
            // fall through
          case 94: break;
          case 33:
            { OutputHandler.handle(Token.T_int);
            }
            // fall through
          case 95: break;
          case 34:
            { OutputHandler.handle(Token.T_new);
            }
            // fall through
          case 96: break;
          case 35:
            { OutputHandler.handle(Token.T_bool);
            }
            // fall through
          case 97: break;
          case 36:
            { OutputHandler.handle(Token.T_btoi);
            }
            // fall through
          case 98: break;
          case 37:
            { OutputHandler.handle(Token.T_dtoi);
            }
            // fall through
          case 99: break;
          case 38:
            { OutputHandler.handle(Token.T_else);
            }
            // fall through
          case 100: break;
          case 39:
            { OutputHandler.handle(Token.T_itob);
            }
            // fall through
          case 101: break;
          case 40:
            { OutputHandler.handle(Token.T_itod);
            }
            // fall through
          case 102: break;
          case 41:
            { OutputHandler.handle(Token.T_null);
            }
            // fall through
          case 103: break;
          case 42:
            { OutputHandler.handle(Token.T_this);
            }
            // fall through
          case 104: break;
          case 43:
            { OutputHandler.handle("true", Token.T_BOOLEANLITERAL);
            }
            // fall through
          case 105: break;
          case 44:
            { OutputHandler.handle(Token.T_void);
            }
            // fall through
          case 106: break;
          case 45:
            { OutputHandler.handle(Token.T_Print);
            }
            // fall through
          case 107: break;
          case 46:
            { OutputHandler.handle(Token.T_break);
            }
            // fall through
          case 108: break;
          case 47:
            { OutputHandler.handle(Token.T_class);
            }
            // fall through
          case 109: break;
          case 48:
            { OutputHandler.handle("false", Token.T_BOOLEANLITERAL);
            }
            // fall through
          case 110: break;
          case 49:
            { OutputHandler.handle(Token.T_while);
            }
            // fall through
          case 111: break;
          case 50:
            { OutputHandler.handle(Token.T_double);
            }
            // fall through
          case 112: break;
          case 51:
            { OutputHandler.handle(Token.T_public);
            }
            // fall through
          case 113: break;
          case 52:
            { OutputHandler.handle(Token.T_return);
            }
            // fall through
          case 114: break;
          case 53:
            { OutputHandler.handle(Token.T_string);
            }
            // fall through
          case 115: break;
          case 54:
            { OutputHandler.handle(Token.T_extends);
            }
            // fall through
          case 116: break;
          case 55:
            { OutputHandler.handle(Token.T_private);
            }
            // fall through
          case 117: break;
          case 56:
            { OutputHandler.handle(Token.T_NewArray);
            }
            // fall through
          case 118: break;
          case 57:
            { OutputHandler.handle(Token.T_ReadLine);
            }
            // fall through
          case 119: break;
          case 58:
            { OutputHandler.handle(Token.T_continue);
            }
            // fall through
          case 120: break;
          case 59:
            { OutputHandler.handle(Token.T_interface);
            }
            // fall through
          case 121: break;
          case 60:
            { OutputHandler.handle(Token.T_protected);
            }
            // fall through
          case 122: break;
          case 61:
            { OutputHandler.handle(Token.T_implements);
            }
            // fall through
          case 123: break;
          case 62:
            { OutputHandler.handle(Token.T_ReadInteger);
            }
            // fall through
          case 124: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java DecafScanner [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        DecafScanner scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new DecafScanner(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
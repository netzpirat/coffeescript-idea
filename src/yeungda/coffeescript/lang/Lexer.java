/* The following code was generated by JFlex 1.4.3 on 3/25/10 10:41 PM */

package yeungda.coffeescript.lang;


import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/25/10 10:41 PM from the specification file
 * <tt>/Users/dyeung/Projects/coffeescript/src/yeungda/coffeescript/lang/lexer.flex</tt>
 */
class Lexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int SINGLE_QUOTE_STRING = 6;
  public static final int VERB = 10;
  public static final int NOUN = 2;
  public static final int YYINITIAL = 0;
  public static final int REGULAR_EXPRESSION = 8;
  public static final int DOUBLE_QUOTE_STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\21\2\0\1\30\22\0\1\1\1\23\1\25\1\22"+
    "\1\13\1\16\1\16\1\26\1\65\1\64\1\16\1\17\1\63\1\12"+
    "\1\10\1\31\1\4\11\3\1\24\1\62\1\23\1\20\1\23\1\16"+
    "\1\14\6\7\11\2\1\60\7\2\1\6\2\2\1\61\1\27\1\61"+
    "\1\0\1\57\1\0\1\46\1\51\1\45\1\53\1\11\1\35\1\56"+
    "\1\47\1\34\1\2\1\52\1\36\1\33\1\40\1\50\1\54\1\2"+
    "\1\41\1\37\1\42\1\43\1\55\1\15\1\5\1\44\1\2\1\32"+
    "\1\16\1\32\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\1\2\1\3\2\4\1\5\1\3\1\6"+
    "\1\3\1\7\1\10\1\11\1\12\1\7\1\13\20\3"+
    "\1\14\1\15\1\16\1\17\1\2\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\1\1\24\1\1\1\26\1\27"+
    "\1\1\1\30\3\31\1\32\1\31\1\32\1\33\3\0"+
    "\5\3\1\0\1\3\3\34\11\3\1\35\12\3\1\34"+
    "\1\35\2\3\1\36\3\3\1\37\1\40\1\41\2\4"+
    "\1\0\1\4\107\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[181];
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
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0144\0\u0252\0\u0144\0\u0288\0\u02be"+
    "\0\u02f4\0\u0144\0\u0144\0\u0144\0\u0144\0\u032a\0\u0360\0\u0396"+
    "\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4\0\u04da\0\u0510\0\u0546"+
    "\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654\0\u0144\0\u0144\0\u0144"+
    "\0\u0144\0\u068a\0\u0144\0\u0144\0\u0144\0\u0144\0\u06c0\0\u0144"+
    "\0\u06f6\0\u072c\0\u0762\0\u0798\0\u0144\0\u07ce\0\u0144\0\u0804"+
    "\0\u0144\0\u083a\0\u0870\0\u0870\0\u08a6\0\u0144\0\u08dc\0\u0912"+
    "\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u02be\0\u0a8c"+
    "\0\u01b0\0\u0ac2\0\u0af8\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06"+
    "\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\u0db6"+
    "\0\u0dec\0\u0e22\0\u0e58\0\u0e8e\0\u0ec4\0\u0efa\0\u0f30\0\u0f66"+
    "\0\u01b0\0\u0f9c\0\u0fd2\0\u01b0\0\u1008\0\u103e\0\u1074\0\u0144"+
    "\0\u0144\0\u0144\0\u10aa\0\u10e0\0\u10e0\0\u0948\0\u1116\0\u114c"+
    "\0\u1182\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u0d14\0\u1290\0\u12c6"+
    "\0\u12fc\0\u1332\0\u1368\0\u139e\0\u13d4\0\u140a\0\u1440\0\u1476"+
    "\0\u14ac\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0\0\u1626"+
    "\0\u165c\0\u1692\0\u16c8\0\u16fe\0\u1734\0\u176a\0\u17a0\0\u17d6"+
    "\0\u180c\0\u1842\0\u1878\0\u18ae\0\u18e4\0\u191a\0\u1950\0\u1986"+
    "\0\u19bc\0\u19f2\0\u1a28\0\u1a5e\0\u1a94\0\u1aca\0\u1b00\0\u1b36"+
    "\0\u1b6c\0\u1ba2\0\u1bd8\0\u1c0e\0\u1c44\0\u1c7a\0\u1cb0\0\u1ce6"+
    "\0\u1d1c\0\u1d52\0\u1d88\0\u1dbe\0\u1df4\0\u1e2a\0\u1e60\0\u1e96"+
    "\0\u1ecc\0\u1f02\0\u1f38\0\u1f6e\0\u1fa4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[181];
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
    "\1\7\1\10\1\11\1\12\1\13\3\11\1\14\1\15"+
    "\1\7\1\11\1\16\1\17\3\7\1\20\1\21\2\7"+
    "\1\22\1\23\1\7\1\24\1\7\1\25\1\11\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\11\1\41\1\42\1\11\1\43\1\11"+
    "\1\44\1\11\1\45\1\11\1\46\1\47\1\50\1\7"+
    "\1\51\1\7\1\52\1\11\1\12\1\13\3\11\1\7"+
    "\1\11\1\7\1\11\1\7\1\11\2\7\1\53\1\54"+
    "\3\7\1\22\1\23\1\7\1\54\1\55\1\7\26\11"+
    "\3\7\1\56\1\51\21\57\1\24\3\57\1\60\1\57"+
    "\1\61\1\24\35\57\21\62\1\24\4\62\1\60\1\63"+
    "\1\24\35\62\21\64\1\65\5\64\1\66\1\65\1\67"+
    "\34\64\1\7\1\52\10\7\1\70\3\7\1\71\1\72"+
    "\1\73\1\54\1\7\1\74\1\75\3\7\1\54\1\71"+
    "\32\7\1\76\1\51\67\0\1\10\20\0\1\21\45\0"+
    "\6\11\1\0\1\11\1\0\1\11\1\0\1\11\15\0"+
    "\26\11\10\0\2\12\3\0\1\77\1\100\57\0\2\12"+
    "\2\101\1\0\1\77\1\100\56\0\3\11\1\102\2\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\3\11"+
    "\1\103\1\11\1\104\20\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\1\11\1\105\12\11"+
    "\1\106\11\11\6\0\1\107\20\0\1\21\43\0\21\21"+
    "\1\107\44\21\2\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\1\110\1\11\1\111\1\11\1\112"+
    "\1\113\20\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\1\11\1\114\6\11\1\115\2\11"+
    "\1\116\1\11\1\117\10\11\7\0\6\11\1\0\1\120"+
    "\1\0\1\11\1\0\1\11\15\0\26\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\121\15\0\10\11"+
    "\1\122\15\11\7\0\6\11\1\0\1\123\1\0\1\11"+
    "\1\0\1\11\15\0\13\11\1\124\1\11\1\125\10\11"+
    "\7\0\6\11\1\0\1\126\1\0\1\11\1\0\1\11"+
    "\15\0\26\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\6\11\1\127\2\11\1\130\2\11"+
    "\1\131\11\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\5\11\1\132\20\11\7\0\6\11"+
    "\1\0\1\133\1\0\1\11\1\0\1\11\15\0\26\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\3\11\1\134\7\11\1\135\1\11\1\136\10\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\5\11\1\137\20\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\2\11\1\140\2\11"+
    "\1\141\1\111\17\11\7\0\6\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\15\0\6\11\1\142\2\11\1\111"+
    "\14\11\7\0\6\11\1\0\1\143\1\0\1\11\1\0"+
    "\1\11\15\0\15\11\1\144\10\11\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\13\11\1\145"+
    "\1\11\1\146\10\11\7\0\6\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\15\0\24\11\1\147\1\11\6\0"+
    "\1\52\64\0\21\57\1\0\3\57\1\0\1\57\2\0"+
    "\35\57\21\150\1\0\3\150\1\151\1\150\1\151\10\150"+
    "\1\151\25\150\21\62\1\0\4\62\3\0\35\62\21\150"+
    "\1\0\4\150\2\151\10\150\1\151\25\150\21\64\1\0"+
    "\5\64\3\0\34\64\13\152\1\0\52\152\12\0\1\71"+
    "\72\0\1\71\66\0\1\71\71\0\1\71\44\0\2\153"+
    "\64\0\2\154\5\0\1\155\4\0\1\155\51\0\2\156"+
    "\2\0\1\156\1\0\1\156\23\0\1\156\7\0\2\156"+
    "\2\0\1\156\1\0\1\156\14\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\7\11\1\157\11\11"+
    "\1\160\4\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\4\11\1\161\21\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\10\11"+
    "\1\162\15\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\7\11\1\163\16\11\7\0\6\11"+
    "\1\0\1\164\1\0\1\11\1\0\1\11\15\0\1\11"+
    "\1\165\24\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\21\11\1\160\4\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\5\11"+
    "\1\166\20\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\4\11\1\167\21\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\5\11"+
    "\1\170\20\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\5\11\1\171\20\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\3\11"+
    "\1\172\22\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\6\11\1\111\17\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\7\11"+
    "\1\144\16\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\1\11\1\173\24\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\21\11"+
    "\1\174\4\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\111\15\0\26\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\7\11\1\175\16\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\7\11\1\111\16\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\7\11\1\176\16\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\10\11\1\177\1\111\14\11\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\21\11\1\200"+
    "\4\11\7\0\6\11\1\0\1\201\1\0\1\11\1\0"+
    "\1\11\15\0\6\11\1\202\17\11\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\3\11\1\203"+
    "\22\11\7\0\6\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\15\0\4\11\1\141\21\11\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\13\11\1\204"+
    "\12\11\7\0\6\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\15\0\4\11\1\205\2\11\1\206\16\11\7\0"+
    "\6\11\1\0\1\11\1\0\1\11\1\0\1\11\15\0"+
    "\5\11\1\207\20\11\7\0\6\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\15\0\20\11\1\111\5\11\7\0"+
    "\6\11\1\0\1\11\1\0\1\11\1\0\1\11\15\0"+
    "\2\11\1\141\23\11\7\0\6\11\1\0\1\210\1\0"+
    "\1\11\1\0\1\11\15\0\26\11\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\2\11\1\211"+
    "\1\212\12\11\1\213\7\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\6\11\1\144\17\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\1\11\1\214\24\11\7\0\6\11\1\0\1\215"+
    "\1\0\1\11\1\0\1\11\15\0\14\11\1\216\11\11"+
    "\10\0\2\153\4\0\1\100\57\0\2\154\63\0\6\11"+
    "\1\0\1\217\1\0\1\11\1\0\1\11\15\0\26\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\15\11\1\220\10\11\7\0\6\11\1\0\1\111"+
    "\1\0\1\11\1\0\1\11\15\0\26\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\1\144"+
    "\25\11\7\0\6\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\15\0\14\11\1\144\11\11\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\5\11\1\111"+
    "\1\161\17\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\3\11\1\161\22\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\7\11"+
    "\1\221\16\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\13\11\1\222\12\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\12\11"+
    "\1\223\13\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\4\11\1\177\21\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\7\11"+
    "\1\206\16\11\7\0\6\11\1\0\1\117\1\0\1\11"+
    "\1\0\1\11\15\0\26\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\1\11\1\224\24\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\10\11\1\225\15\11\7\0\6\11\1\0\1\141"+
    "\1\0\1\11\1\0\1\11\15\0\26\11\7\0\6\11"+
    "\1\0\1\226\1\0\1\11\1\0\1\11\15\0\26\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\5\11\1\111\20\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\15\11\1\123\10\11"+
    "\7\0\6\11\1\0\1\204\1\0\1\11\1\0\1\11"+
    "\15\0\26\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\4\11\1\227\21\11\7\0\6\11"+
    "\1\0\1\144\1\0\1\11\1\0\1\11\15\0\26\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\12\11\1\230\13\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\4\11\1\120\2\11"+
    "\1\231\16\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\13\11\1\232\12\11\7\0\6\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\13\11"+
    "\1\233\12\11\7\0\6\11\1\0\1\234\1\0\1\11"+
    "\1\0\1\11\15\0\26\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\10\11\1\235\15\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\20\11\1\144\5\11\7\0\3\11\1\236\2\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\15\0\26\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\13\11\1\237\12\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\5\11\1\240\20\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\6\11\1\120\17\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\13\11\1\241\12\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\3\11\1\242\22\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\7\11\1\243\16\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\22\11\1\205\3\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\6\11\1\201\17\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\15\11\1\244\10\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\4\11\1\111\21\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\14\11\1\111\11\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\1\11\1\245\24\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\17\11\1\111\6\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\10\11\1\246\15\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\7\11\1\161\16\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\23\11\1\247\2\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\7\11\1\250\16\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\4\11\1\251\21\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\20\11\1\227\5\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\5\11\1\252\20\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\3\11\1\253\22\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\1\11\1\254\24\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\2\11\1\111\23\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\5\11\1\255\20\11"+
    "\7\0\6\11\1\0\1\11\1\0\1\11\1\0\1\11"+
    "\15\0\3\11\1\120\22\11\7\0\6\11\1\0\1\11"+
    "\1\0\1\11\1\0\1\11\15\0\23\11\1\256\2\11"+
    "\7\0\6\11\1\0\1\257\1\0\1\11\1\0\1\11"+
    "\15\0\26\11\7\0\6\11\1\0\1\11\1\0\1\11"+
    "\1\0\1\11\15\0\25\11\1\260\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\12\11\1\200"+
    "\13\11\7\0\6\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\15\0\11\11\1\111\14\11\7\0\6\11\1\0"+
    "\1\11\1\0\1\11\1\0\1\11\15\0\15\11\1\261"+
    "\10\11\7\0\6\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\15\0\10\11\1\161\15\11\7\0\6\11\1\0"+
    "\1\145\1\0\1\11\1\0\1\11\15\0\26\11\7\0"+
    "\6\11\1\0\1\11\1\0\1\11\1\0\1\11\15\0"+
    "\5\11\1\262\20\11\7\0\6\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\15\0\6\11\1\263\17\11\7\0"+
    "\6\11\1\0\1\11\1\0\1\11\1\0\1\11\15\0"+
    "\5\11\1\144\20\11\7\0\6\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\15\0\20\11\1\264\5\11\7\0"+
    "\6\11\1\0\1\11\1\0\1\11\1\0\1\11\15\0"+
    "\15\11\1\265\10\11\7\0\6\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11\15\0\4\11\1\144\21\11\7\0"+
    "\6\11\1\0\1\11\1\0\1\11\1\0\1\11\15\0"+
    "\21\11\1\144\4\11\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8154];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\1\11\4\1\1\11\1\1\1\11\3\1\4\11"+
    "\20\1\4\11\1\1\4\11\1\1\1\11\4\1\1\11"+
    "\1\1\1\11\1\1\1\11\4\1\1\11\3\0\5\1"+
    "\1\0\40\1\3\11\2\1\1\0\110\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[181];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  // For Demetra compatibility
  public void reset(CharSequence buffer, int initialState){
    zzBuffer = buffer;
    zzBufferArray = null; 
    zzCurrentPos = zzMarkedPos = zzStartRead = 0;
    zzPushbackPos = 0;
    zzAtEOF = false;
    zzAtBOL = true;
    zzEndRead = buffer.length();
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
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
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 29: 
          { return Tokens.BOOLEAN;
          }
        case 34: break;
        case 10: 
          { yybegin(SINGLE_QUOTE_STRING); return Tokens.STRING;
          }
        case 35: break;
        case 33: 
          { return Tokens.REGULAR_EXPRESSION_LITERAL;
          }
        case 36: break;
        case 8: 
          { return Tokens.COMMENT;
          }
        case 37: break;
        case 21: 
          { yybegin(VERB); return Tokens.STRING;
          }
        case 38: break;
        case 12: 
          { return Tokens.BRACKET;
          }
        case 39: break;
        case 28: 
          { return Tokens.KEYWORD;
          }
        case 40: break;
        case 14: 
          { return Tokens.COMMA;
          }
        case 41: break;
        case 4: 
          { yybegin(VERB); return Tokens.NUMBER;
          }
        case 42: break;
        case 15: 
          { yybegin(NOUN); return Tokens.PARENTHESIS;
          }
        case 43: break;
        case 31: 
          { return Tokens.BAD_CHARACTER;
          }
        case 44: break;
        case 19: 
          { yybegin(VERB); return Tokens.PARENTHESIS;
          }
        case 45: break;
        case 27: 
          { return Tokens.PARENTHESIS;
          }
        case 46: break;
        case 3: 
          { yybegin(VERB); return Tokens.IDENTIFIER;
          }
        case 47: break;
        case 5: 
          { return Tokens.DOT;
          }
        case 48: break;
        case 17: 
          { yybegin(YYINITIAL); return Tokens.LINE_TERMINATOR;
          }
        case 49: break;
        case 2: 
          { return Tokens.WHITESPACE;
          }
        case 50: break;
        case 18: 
          { yybegin(REGULAR_EXPRESSION); return Tokens.REGULAR_EXPRESSION;
          }
        case 51: break;
        case 7: 
          { return Tokens.LINE_TERMINATOR;
          }
        case 52: break;
        case 25: 
          { yybegin(NOUN); return Tokens.OPERATOR;
          }
        case 53: break;
        case 22: 
          { return Tokens.REGULAR_EXPRESSION;
          }
        case 54: break;
        case 24: 
          { yybegin(VERB); return Tokens.REGULAR_EXPRESSION;
          }
        case 55: break;
        case 23: 
          { yybegin(YYINITIAL); return Tokens.BAD_CHARACTER;
          }
        case 56: break;
        case 1: 
          { yybegin(YYINITIAL);   return Tokens.BAD_CHARACTER;
          }
        case 57: break;
        case 30: 
          { return Tokens.RESERVED_WORD;
          }
        case 58: break;
        case 9: 
          { yybegin(DOUBLE_QUOTE_STRING); return Tokens.STRING;
          }
        case 59: break;
        case 26: 
          { yybegin(NOUN); return Tokens.ASSIGNMENT;
          }
        case 60: break;
        case 6: 
          { return Tokens.ACCESSOR;
          }
        case 61: break;
        case 20: 
          { return Tokens.STRING;
          }
        case 62: break;
        case 11: 
          { return Tokens.BRACE;
          }
        case 63: break;
        case 16: 
          { return Tokens.ASSIGNMENT;
          }
        case 64: break;
        case 32: 
          { return Tokens.STRING_LITERAL;
          }
        case 65: break;
        case 13: 
          { return Tokens.SEMI_COLON;
          }
        case 66: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

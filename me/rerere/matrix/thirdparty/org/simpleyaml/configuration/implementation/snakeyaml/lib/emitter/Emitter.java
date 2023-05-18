package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentEventsCollector;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentLine;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.NodeEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.ScalarEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner.Constant;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util.ArrayStack;

public final class Emitter implements Emitable {
  private final Queue events;
  
  private static final Set INVALID_ANCHOR;
  
  private final boolean splitLines;
  
  private Map tagPrefixes;
  
  private static final Pattern LEADING_ZERO_PATTERN;
  
  private String preparedTag;
  
  public static final int MIN_INDENT = 1;
  
  private final int indicatorIndent;
  
  private int flowLevel;
  
  private boolean simpleKeyContext;
  
  private Integer indent;
  
  private boolean indention;
  
  private DumperOptions.ScalarStyle style;
  
  private int column;
  
  private final Boolean prettyFlow;
  
  private final boolean indentWithIndicator;
  
  private int bestIndent;
  
  private final char[] bestLineBreak;
  
  private static final Pattern SPACES_PATTERN;
  
  private EmitterState state;
  
  private static final Map ESCAPE_REPLACEMENTS;
  
  private final ArrayStack states;
  
  private static final Map DEFAULT_TAG_PREFIXES;
  
  private final Writer stream;
  
  private static final char[] SPACE;
  
  private int bestWidth;
  
  private final CommentEventsCollector inlineCommentsCollector;
  
  private final ArrayStack indents;
  
  private final boolean allowUnicode;
  
  private String preparedAnchor;
  
  private final int maxSimpleKeyLength;
  
  private boolean rootContext;
  
  private boolean openEnded;
  
  private boolean whitespace;
  
  private Event event;
  
  public static final int MAX_INDENT = 10;
  
  private final boolean emitComments;
  
  private final CommentEventsCollector blockCommentsCollector;
  
  private boolean mappingContext;
  
  private static final Pattern HANDLE_FORMAT;
  
  private ScalarAnalysis analysis;
  
  private final Boolean canonical;
  
  private static final long a = o3.a(3030816697459318343L, -1689491449691450779L, MethodHandles.lookup().lookupClass()).a(88190852001353L);
  
  public void writeFolded(String paramString, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter.a : J
    //   3: ldc2_w 80174182725005
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: aload_1
    //   10: invokespecial determineBlockHints : (Ljava/lang/String;)Ljava/lang/String;
    //   13: astore #5
    //   15: aload_0
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: ldc '>'
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: aload #5
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: iconst_1
    //   37: iconst_0
    //   38: iconst_0
    //   39: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   42: aload #5
    //   44: invokevirtual length : ()I
    //   47: ifle -> 86
    //   50: aload #5
    //   52: aload #5
    //   54: invokevirtual length : ()I
    //   57: iconst_1
    //   58: isub
    //   59: invokevirtual charAt : (I)C
    //   62: bipush #43
    //   64: if_icmpne -> 86
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield openEnded : Z
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: invokespecial writeInlineComments : ()Z
    //   90: ifne -> 105
    //   93: aload_0
    //   94: aconst_null
    //   95: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: iconst_1
    //   106: istore #6
    //   108: iconst_0
    //   109: istore #7
    //   111: iconst_1
    //   112: istore #8
    //   114: iconst_0
    //   115: istore #9
    //   117: iconst_0
    //   118: istore #10
    //   120: iload #10
    //   122: aload_1
    //   123: invokevirtual length : ()I
    //   126: if_icmpgt -> 581
    //   129: iconst_0
    //   130: istore #11
    //   132: iload #10
    //   134: aload_1
    //   135: invokevirtual length : ()I
    //   138: if_icmpge -> 149
    //   141: aload_1
    //   142: iload #10
    //   144: invokevirtual charAt : (I)C
    //   147: istore #11
    //   149: iload #8
    //   151: ifeq -> 366
    //   154: iload #11
    //   156: ifeq -> 184
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   169: iload #11
    //   171: invokevirtual hasNo : (I)Z
    //   174: ifeq -> 542
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   183: athrow
    //   184: iload #6
    //   186: ifne -> 252
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   195: athrow
    //   196: iload #11
    //   198: ifeq -> 252
    //   201: goto -> 208
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: iload #11
    //   210: bipush #32
    //   212: if_icmpeq -> 252
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload_1
    //   223: iload #9
    //   225: invokevirtual charAt : (I)C
    //   228: bipush #10
    //   230: if_icmpne -> 252
    //   233: goto -> 240
    //   236: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   239: athrow
    //   240: aload_0
    //   241: aconst_null
    //   242: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: iload #11
    //   254: bipush #32
    //   256: if_icmpne -> 267
    //   259: iconst_1
    //   260: goto -> 268
    //   263: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   266: athrow
    //   267: iconst_0
    //   268: istore #6
    //   270: aload_1
    //   271: iload #9
    //   273: iload #10
    //   275: invokevirtual substring : (II)Ljava/lang/String;
    //   278: astore #12
    //   280: aload #12
    //   282: invokevirtual toCharArray : ()[C
    //   285: astore #13
    //   287: aload #13
    //   289: arraylength
    //   290: istore #14
    //   292: iconst_0
    //   293: istore #15
    //   295: iload #15
    //   297: iload #14
    //   299: if_icmpge -> 343
    //   302: aload #13
    //   304: iload #15
    //   306: caload
    //   307: istore #16
    //   309: iload #16
    //   311: bipush #10
    //   313: if_icmpne -> 328
    //   316: aload_0
    //   317: aconst_null
    //   318: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   321: goto -> 337
    //   324: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   327: athrow
    //   328: aload_0
    //   329: iload #16
    //   331: invokestatic valueOf : (C)Ljava/lang/String;
    //   334: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   337: iinc #15, 1
    //   340: goto -> 295
    //   343: iload #11
    //   345: ifeq -> 359
    //   348: aload_0
    //   349: invokevirtual writeIndent : ()V
    //   352: goto -> 359
    //   355: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   358: athrow
    //   359: iload #10
    //   361: istore #9
    //   363: goto -> 542
    //   366: iload #7
    //   368: ifeq -> 478
    //   371: iload #11
    //   373: bipush #32
    //   375: if_icmpeq -> 542
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   384: athrow
    //   385: iload #9
    //   387: iconst_1
    //   388: iadd
    //   389: iload #10
    //   391: if_icmpne -> 441
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   400: athrow
    //   401: aload_0
    //   402: getfield column : I
    //   405: aload_0
    //   406: getfield bestWidth : I
    //   409: if_icmple -> 441
    //   412: goto -> 419
    //   415: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   418: athrow
    //   419: iload_2
    //   420: ifeq -> 441
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   429: athrow
    //   430: aload_0
    //   431: invokevirtual writeIndent : ()V
    //   434: goto -> 471
    //   437: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   440: athrow
    //   441: iload #10
    //   443: iload #9
    //   445: isub
    //   446: istore #12
    //   448: aload_0
    //   449: dup
    //   450: getfield column : I
    //   453: iload #12
    //   455: iadd
    //   456: putfield column : I
    //   459: aload_0
    //   460: getfield stream : Ljava/io/Writer;
    //   463: aload_1
    //   464: iload #9
    //   466: iload #12
    //   468: invokevirtual write : (Ljava/lang/String;II)V
    //   471: iload #10
    //   473: istore #9
    //   475: goto -> 542
    //   478: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   481: iload #11
    //   483: ldc '  '
    //   485: invokevirtual has : (ILjava/lang/String;)Z
    //   488: ifeq -> 542
    //   491: iload #10
    //   493: iload #9
    //   495: isub
    //   496: istore #12
    //   498: aload_0
    //   499: dup
    //   500: getfield column : I
    //   503: iload #12
    //   505: iadd
    //   506: putfield column : I
    //   509: aload_0
    //   510: getfield stream : Ljava/io/Writer;
    //   513: aload_1
    //   514: iload #9
    //   516: iload #12
    //   518: invokevirtual write : (Ljava/lang/String;II)V
    //   521: iload #11
    //   523: ifne -> 538
    //   526: aload_0
    //   527: aconst_null
    //   528: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   531: goto -> 538
    //   534: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   537: athrow
    //   538: iload #10
    //   540: istore #9
    //   542: iload #11
    //   544: ifeq -> 575
    //   547: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   550: iload #11
    //   552: invokevirtual has : (I)Z
    //   555: istore #8
    //   557: iload #11
    //   559: bipush #32
    //   561: if_icmpne -> 572
    //   564: iconst_1
    //   565: goto -> 573
    //   568: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   571: athrow
    //   572: iconst_0
    //   573: istore #7
    //   575: iinc #10, 1
    //   578: goto -> 120
    //   581: return
    // Exception table:
    //   from	to	target	type
    //   15	67	70	java/io/IOException
    //   50	79	82	java/io/IOException
    //   86	98	101	java/io/IOException
    //   149	159	162	java/io/IOException
    //   154	177	180	java/io/IOException
    //   166	189	192	java/io/IOException
    //   184	201	204	java/io/IOException
    //   196	215	218	java/io/IOException
    //   208	233	236	java/io/IOException
    //   222	245	248	java/io/IOException
    //   252	263	263	java/io/IOException
    //   309	324	324	java/io/IOException
    //   343	352	355	java/io/IOException
    //   366	378	381	java/io/IOException
    //   371	394	397	java/io/IOException
    //   385	412	415	java/io/IOException
    //   401	423	426	java/io/IOException
    //   419	437	437	java/io/IOException
    //   498	531	534	java/io/IOException
    //   557	568	568	java/io/IOException
  }
  
  public Emitter(Writer paramWriter, DumperOptions paramDumperOptions) {
    this.stream = paramWriter;
    this.states = new ArrayStack(100);
    this.state = new Emitter$ExpectStreamStart(this, null);
    this.events = new ArrayDeque(100);
    this.event = null;
    this.indents = new ArrayStack(10);
    this.indent = null;
    this.flowLevel = 0;
    this.mappingContext = false;
    this.simpleKeyContext = false;
    this.column = 0;
    this.whitespace = true;
    this.indention = true;
    this.openEnded = false;
    this.canonical = Boolean.valueOf(paramDumperOptions.isCanonical());
    this.prettyFlow = Boolean.valueOf(paramDumperOptions.isPrettyFlow());
    this.allowUnicode = paramDumperOptions.isAllowUnicode();
    this.bestIndent = 2;
    if (paramDumperOptions.getIndent() > 1)
      try {
        if (paramDumperOptions.getIndent() < 10)
          this.bestIndent = paramDumperOptions.getIndent(); 
      } catch (EmitterException emitterException) {
        throw a(null);
      }  
    try {
      this.indicatorIndent = paramDumperOptions.getIndicatorIndent();
      this.indentWithIndicator = paramDumperOptions.getIndentWithIndicator();
      this.bestWidth = 80;
      if (paramDumperOptions.getWidth() > this.bestIndent * 2)
        this.bestWidth = paramDumperOptions.getWidth(); 
    } catch (EmitterException emitterException) {
      throw a(null);
    } 
    this.bestLineBreak = paramDumperOptions.getLineBreak().getString().toCharArray();
    this.splitLines = paramDumperOptions.getSplitLines();
    this.maxSimpleKeyLength = paramDumperOptions.getMaxSimpleKeyLength();
    this.emitComments = paramDumperOptions.isProcessComments();
    this.tagPrefixes = new LinkedHashMap<>();
    this.preparedAnchor = null;
    this.preparedTag = null;
    this.analysis = null;
    this.style = null;
    this.blockCommentsCollector = new CommentEventsCollector(this.events, new CommentType[] { CommentType.BLANK_LINE, CommentType.BLOCK });
    this.inlineCommentsCollector = new CommentEventsCollector(this.events, new CommentType[] { CommentType.IN_LINE });
  }
  
  public void writePlain(String paramString, boolean paramBoolean) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter.a : J
    //   3: ldc2_w 45305704276012
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: getfield rootContext : Z
    //   12: ifeq -> 27
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield openEnded : Z
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_1
    //   28: invokevirtual length : ()I
    //   31: ifne -> 39
    //   34: return
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: aload_0
    //   40: getfield whitespace : Z
    //   43: ifne -> 73
    //   46: aload_0
    //   47: dup
    //   48: getfield column : I
    //   51: iconst_1
    //   52: iadd
    //   53: putfield column : I
    //   56: aload_0
    //   57: getfield stream : Ljava/io/Writer;
    //   60: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter.SPACE : [C
    //   63: invokevirtual write : ([C)V
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: aload_0
    //   74: iconst_0
    //   75: putfield whitespace : Z
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield indention : Z
    //   83: iconst_0
    //   84: istore #5
    //   86: iconst_0
    //   87: istore #6
    //   89: iconst_0
    //   90: istore #7
    //   92: iconst_0
    //   93: istore #8
    //   95: iload #8
    //   97: aload_1
    //   98: invokevirtual length : ()I
    //   101: if_icmpgt -> 486
    //   104: iconst_0
    //   105: istore #9
    //   107: iload #8
    //   109: aload_1
    //   110: invokevirtual length : ()I
    //   113: if_icmpge -> 124
    //   116: aload_1
    //   117: iload #8
    //   119: invokevirtual charAt : (I)C
    //   122: istore #9
    //   124: iload #5
    //   126: ifeq -> 246
    //   129: iload #9
    //   131: bipush #32
    //   133: if_icmpeq -> 440
    //   136: goto -> 143
    //   139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: iload #7
    //   145: iconst_1
    //   146: iadd
    //   147: iload #8
    //   149: if_icmpne -> 209
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: aload_0
    //   160: getfield column : I
    //   163: aload_0
    //   164: getfield bestWidth : I
    //   167: if_icmple -> 209
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   176: athrow
    //   177: iload_2
    //   178: ifeq -> 209
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: aload_0
    //   189: invokevirtual writeIndent : ()V
    //   192: aload_0
    //   193: iconst_0
    //   194: putfield whitespace : Z
    //   197: aload_0
    //   198: iconst_0
    //   199: putfield indention : Z
    //   202: goto -> 239
    //   205: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   208: athrow
    //   209: iload #8
    //   211: iload #7
    //   213: isub
    //   214: istore #10
    //   216: aload_0
    //   217: dup
    //   218: getfield column : I
    //   221: iload #10
    //   223: iadd
    //   224: putfield column : I
    //   227: aload_0
    //   228: getfield stream : Ljava/io/Writer;
    //   231: aload_1
    //   232: iload #7
    //   234: iload #10
    //   236: invokevirtual write : (Ljava/lang/String;II)V
    //   239: iload #8
    //   241: istore #7
    //   243: goto -> 440
    //   246: iload #6
    //   248: ifeq -> 393
    //   251: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   254: iload #9
    //   256: invokevirtual hasNo : (I)Z
    //   259: ifeq -> 440
    //   262: goto -> 269
    //   265: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   268: athrow
    //   269: aload_1
    //   270: iload #7
    //   272: invokevirtual charAt : (I)C
    //   275: bipush #10
    //   277: if_icmpne -> 299
    //   280: goto -> 287
    //   283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   286: athrow
    //   287: aload_0
    //   288: aconst_null
    //   289: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   292: goto -> 299
    //   295: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   298: athrow
    //   299: aload_1
    //   300: iload #7
    //   302: iload #8
    //   304: invokevirtual substring : (II)Ljava/lang/String;
    //   307: astore #10
    //   309: aload #10
    //   311: invokevirtual toCharArray : ()[C
    //   314: astore #11
    //   316: aload #11
    //   318: arraylength
    //   319: istore #12
    //   321: iconst_0
    //   322: istore #13
    //   324: iload #13
    //   326: iload #12
    //   328: if_icmpge -> 372
    //   331: aload #11
    //   333: iload #13
    //   335: caload
    //   336: istore #14
    //   338: iload #14
    //   340: bipush #10
    //   342: if_icmpne -> 357
    //   345: aload_0
    //   346: aconst_null
    //   347: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   350: goto -> 366
    //   353: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   356: athrow
    //   357: aload_0
    //   358: iload #14
    //   360: invokestatic valueOf : (C)Ljava/lang/String;
    //   363: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   366: iinc #13, 1
    //   369: goto -> 324
    //   372: aload_0
    //   373: invokevirtual writeIndent : ()V
    //   376: aload_0
    //   377: iconst_0
    //   378: putfield whitespace : Z
    //   381: aload_0
    //   382: iconst_0
    //   383: putfield indention : Z
    //   386: iload #8
    //   388: istore #7
    //   390: goto -> 440
    //   393: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   396: iload #9
    //   398: ldc '  '
    //   400: invokevirtual has : (ILjava/lang/String;)Z
    //   403: ifeq -> 440
    //   406: iload #8
    //   408: iload #7
    //   410: isub
    //   411: istore #10
    //   413: aload_0
    //   414: dup
    //   415: getfield column : I
    //   418: iload #10
    //   420: iadd
    //   421: putfield column : I
    //   424: aload_0
    //   425: getfield stream : Ljava/io/Writer;
    //   428: aload_1
    //   429: iload #7
    //   431: iload #10
    //   433: invokevirtual write : (Ljava/lang/String;II)V
    //   436: iload #8
    //   438: istore #7
    //   440: iload #9
    //   442: ifeq -> 480
    //   445: iload #9
    //   447: bipush #32
    //   449: if_icmpne -> 467
    //   452: goto -> 459
    //   455: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   458: athrow
    //   459: iconst_1
    //   460: goto -> 468
    //   463: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   466: athrow
    //   467: iconst_0
    //   468: istore #5
    //   470: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   473: iload #9
    //   475: invokevirtual has : (I)Z
    //   478: istore #6
    //   480: iinc #8, 1
    //   483: goto -> 95
    //   486: return
    // Exception table:
    //   from	to	target	type
    //   8	20	23	java/io/IOException
    //   27	35	35	java/io/IOException
    //   39	66	69	java/io/IOException
    //   124	136	139	java/io/IOException
    //   129	152	155	java/io/IOException
    //   143	170	173	java/io/IOException
    //   159	181	184	java/io/IOException
    //   177	205	205	java/io/IOException
    //   246	262	265	java/io/IOException
    //   251	280	283	java/io/IOException
    //   269	292	295	java/io/IOException
    //   338	353	353	java/io/IOException
    //   440	452	455	java/io/IOException
    //   445	463	463	java/io/IOException
  }
  
  public static String prepareAnchor(String paramString) {
    long l = a ^ 0x309718F1A0A9L;
    try {
      if (paramString.length() == 0)
        throw new EmitterException("anchor must not be empty"); 
    } catch (EmitterException emitterException) {
      throw a(null);
    } 
    for (Character character : INVALID_ANCHOR) {
      try {
        if (paramString.indexOf(character.charValue()) > -1)
          throw new EmitterException("Invalid character '" + character + "' in the anchor: " + paramString); 
      } catch (EmitterException emitterException) {
        throw a(null);
      } 
    } 
    Matcher matcher = SPACES_PATTERN.matcher(paramString);
    try {
      if (matcher.find())
        throw new EmitterException("Anchor may not contain spaces: " + paramString); 
    } catch (EmitterException emitterException) {
      throw a(null);
    } 
    return paramString;
  }
  
  public void writeLiteral(String paramString) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial determineBlockHints : (Ljava/lang/String;)Ljava/lang/String;
    //   5: astore_2
    //   6: aload_0
    //   7: new java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: ldc_w '|'
    //   17: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: aload_2
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual toString : ()Ljava/lang/String;
    //   27: iconst_1
    //   28: iconst_0
    //   29: iconst_0
    //   30: invokevirtual writeIndicator : (Ljava/lang/String;ZZZ)V
    //   33: aload_2
    //   34: invokevirtual length : ()I
    //   37: ifle -> 74
    //   40: aload_2
    //   41: aload_2
    //   42: invokevirtual length : ()I
    //   45: iconst_1
    //   46: isub
    //   47: invokevirtual charAt : (I)C
    //   50: bipush #43
    //   52: if_icmpne -> 74
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_0
    //   63: iconst_1
    //   64: putfield openEnded : Z
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   73: athrow
    //   74: aload_0
    //   75: invokespecial writeInlineComments : ()Z
    //   78: ifne -> 93
    //   81: aload_0
    //   82: aconst_null
    //   83: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iconst_1
    //   94: istore_3
    //   95: iconst_0
    //   96: istore #4
    //   98: iconst_0
    //   99: istore #5
    //   101: iload #5
    //   103: aload_1
    //   104: invokevirtual length : ()I
    //   107: if_icmpgt -> 346
    //   110: iconst_0
    //   111: istore #6
    //   113: iload #5
    //   115: aload_1
    //   116: invokevirtual length : ()I
    //   119: if_icmpge -> 130
    //   122: aload_1
    //   123: iload #5
    //   125: invokevirtual charAt : (I)C
    //   128: istore #6
    //   130: iload_3
    //   131: ifeq -> 260
    //   134: iload #6
    //   136: ifeq -> 164
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   149: iload #6
    //   151: invokevirtual hasNo : (I)Z
    //   154: ifeq -> 326
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload_1
    //   165: iload #4
    //   167: iload #5
    //   169: invokevirtual substring : (II)Ljava/lang/String;
    //   172: astore #7
    //   174: aload #7
    //   176: invokevirtual toCharArray : ()[C
    //   179: astore #8
    //   181: aload #8
    //   183: arraylength
    //   184: istore #9
    //   186: iconst_0
    //   187: istore #10
    //   189: iload #10
    //   191: iload #9
    //   193: if_icmpge -> 237
    //   196: aload #8
    //   198: iload #10
    //   200: caload
    //   201: istore #11
    //   203: iload #11
    //   205: bipush #10
    //   207: if_icmpne -> 222
    //   210: aload_0
    //   211: aconst_null
    //   212: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   215: goto -> 231
    //   218: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   221: athrow
    //   222: aload_0
    //   223: iload #11
    //   225: invokestatic valueOf : (C)Ljava/lang/String;
    //   228: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   231: iinc #10, 1
    //   234: goto -> 189
    //   237: iload #6
    //   239: ifeq -> 253
    //   242: aload_0
    //   243: invokevirtual writeIndent : ()V
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   252: athrow
    //   253: iload #5
    //   255: istore #4
    //   257: goto -> 326
    //   260: iload #6
    //   262: ifeq -> 283
    //   265: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   268: iload #6
    //   270: invokevirtual has : (I)Z
    //   273: ifeq -> 326
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   282: athrow
    //   283: aload_0
    //   284: getfield stream : Ljava/io/Writer;
    //   287: aload_1
    //   288: iload #4
    //   290: iload #5
    //   292: iload #4
    //   294: isub
    //   295: invokevirtual write : (Ljava/lang/String;II)V
    //   298: iload #6
    //   300: ifne -> 322
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   309: athrow
    //   310: aload_0
    //   311: aconst_null
    //   312: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   321: athrow
    //   322: iload #5
    //   324: istore #4
    //   326: iload #6
    //   328: ifeq -> 340
    //   331: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   334: iload #6
    //   336: invokevirtual has : (I)Z
    //   339: istore_3
    //   340: iinc #5, 1
    //   343: goto -> 101
    //   346: return
    // Exception table:
    //   from	to	target	type
    //   6	55	58	java/io/IOException
    //   40	67	70	java/io/IOException
    //   74	86	89	java/io/IOException
    //   130	139	142	java/io/IOException
    //   134	157	160	java/io/IOException
    //   203	218	218	java/io/IOException
    //   237	246	249	java/io/IOException
    //   260	276	279	java/io/IOException
    //   265	303	306	java/io/IOException
    //   283	315	318	java/io/IOException
  }
  
  public void writeStreamStart() {}
  
  public void writeIndicator(String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield whitespace : Z
    //   4: ifne -> 45
    //   7: iload_2
    //   8: ifeq -> 45
    //   11: goto -> 18
    //   14: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   17: athrow
    //   18: aload_0
    //   19: dup
    //   20: getfield column : I
    //   23: iconst_1
    //   24: iadd
    //   25: putfield column : I
    //   28: aload_0
    //   29: getfield stream : Ljava/io/Writer;
    //   32: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/emitter/Emitter.SPACE : [C
    //   35: invokevirtual write : ([C)V
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: aload_0
    //   46: iload_3
    //   47: putfield whitespace : Z
    //   50: aload_0
    //   51: aload_0
    //   52: getfield indention : Z
    //   55: ifeq -> 78
    //   58: iload #4
    //   60: ifeq -> 78
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: iconst_1
    //   71: goto -> 79
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iconst_0
    //   79: putfield indention : Z
    //   82: aload_0
    //   83: dup
    //   84: getfield column : I
    //   87: aload_1
    //   88: invokevirtual length : ()I
    //   91: iadd
    //   92: putfield column : I
    //   95: aload_0
    //   96: iconst_0
    //   97: putfield openEnded : Z
    //   100: aload_0
    //   101: getfield stream : Ljava/io/Writer;
    //   104: aload_1
    //   105: invokevirtual write : (Ljava/lang/String;)V
    //   108: return
    // Exception table:
    //   from	to	target	type
    //   0	11	14	java/io/IOException
    //   7	38	41	java/io/IOException
    //   45	63	66	java/io/IOException
    //   58	74	74	java/io/IOException
  }
  
  public void writeStreamEnd() throws IOException {
    flushStream();
  }
  
  public void writeIndent() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield indent : Ljava/lang/Integer;
    //   4: ifnull -> 18
    //   7: aload_0
    //   8: getfield indent : Ljava/lang/Integer;
    //   11: invokevirtual intValue : ()I
    //   14: istore_1
    //   15: goto -> 20
    //   18: iconst_0
    //   19: istore_1
    //   20: aload_0
    //   21: getfield indention : Z
    //   24: ifeq -> 71
    //   27: aload_0
    //   28: getfield column : I
    //   31: iload_1
    //   32: if_icmpgt -> 71
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: getfield column : I
    //   46: iload_1
    //   47: if_icmpne -> 83
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: aload_0
    //   58: getfield whitespace : Z
    //   61: ifne -> 83
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: aconst_null
    //   73: invokespecial writeLineBreak : (Ljava/lang/String;)V
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: iload_1
    //   85: aload_0
    //   86: getfield column : I
    //   89: isub
    //   90: invokespecial writeWhitespace : (I)V
    //   93: return
    // Exception table:
    //   from	to	target	type
    //   20	35	38	java/io/IOException
    //   27	50	53	java/io/IOException
    //   42	64	67	java/io/IOException
    //   57	76	79	java/io/IOException
  }
  
  static {
    long l = a ^ 0x6800F1EC28F8L;
    SPACE = new char[] { ' ' };
    SPACES_PATTERN = Pattern.compile("\\s");
    INVALID_ANCHOR = new HashSet();
    INVALID_ANCHOR.add(Character.valueOf('['));
    INVALID_ANCHOR.add(Character.valueOf(']'));
    INVALID_ANCHOR.add(Character.valueOf('{'));
    INVALID_ANCHOR.add(Character.valueOf('}'));
    INVALID_ANCHOR.add(Character.valueOf(','));
    INVALID_ANCHOR.add(Character.valueOf('*'));
    INVALID_ANCHOR.add(Character.valueOf('&'));
    ESCAPE_REPLACEMENTS = new HashMap<>();
    ESCAPE_REPLACEMENTS.put(Character.valueOf(false), "0");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\007'), "a");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\b'), "b");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\t'), "t");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\n'), "n");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\013'), "v");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\f'), "f");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\r'), "r");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\033'), "e");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('"'), "\"");
    ESCAPE_REPLACEMENTS.put(Character.valueOf('\\'), "\\");
    ESCAPE_REPLACEMENTS.put(Character.valueOf(''), "N");
    ESCAPE_REPLACEMENTS.put(Character.valueOf(' '), "_");
    ESCAPE_REPLACEMENTS.put(Character.valueOf(' '), "L");
    ESCAPE_REPLACEMENTS.put(Character.valueOf(' '), "P");
    DEFAULT_TAG_PREFIXES = new LinkedHashMap<>();
    DEFAULT_TAG_PREFIXES.put("!", "!");
    DEFAULT_TAG_PREFIXES.put("tag:yaml.org,2002:", "!!");
    HANDLE_FORMAT = Pattern.compile("^![-_\\w]*!$");
    LEADING_ZERO_PATTERN = Pattern.compile("0[0-9_]+");
  }
  
  public void writeVersionDirective(String paramString) throws IOException {
    long l = a ^ 0x726572023238L;
    this.stream.write("%YAML ");
    this.stream.write(paramString);
    writeLineBreak(null);
  }
  
  public void flushStream() throws IOException {
    this.stream.flush();
  }
  
  public void writeTagDirective(String paramString1, String paramString2) throws IOException {
    long l = a ^ 0xAD45EC98688L;
    this.stream.write("%TAG ");
    this.stream.write(paramString1);
    this.stream.write(SPACE);
    this.stream.write(paramString2);
    writeLineBreak(null);
  }
  
  public void emit(Event paramEvent) throws IOException {
    this.events.add(paramEvent);
    try {
      while (!needMoreEvents()) {
        this.event = this.events.poll();
        this.state.expect();
        this.event = null;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
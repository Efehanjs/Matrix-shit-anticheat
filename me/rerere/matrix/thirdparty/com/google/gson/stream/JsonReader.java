package me.rerere.matrix.thirdparty.com.google.gson.stream;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.internal.JsonReaderInternalAccess;

public class JsonReader implements Closeable {
  private static final int PEEKED_LONG = 15;
  
  private int stackSize = 0;
  
  private final char[] buffer = new char[1024];
  
  private static final int NUMBER_CHAR_NONE = 0;
  
  private static final int PEEKED_END_OBJECT = 2;
  
  private static final int NUMBER_CHAR_EXP_E = 5;
  
  private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
  
  private String peekedString;
  
  private static final int PEEKED_BUFFERED = 11;
  
  private static final int PEEKED_NONE = 0;
  
  private static final int PEEKED_NUMBER = 16;
  
  private int peekedNumberLength;
  
  private static final int PEEKED_NULL = 7;
  
  private static final char[] NON_EXECUTE_PREFIX;
  
  private static final int PEEKED_UNQUOTED = 10;
  
  private int[] stack = new int[32];
  
  private int limit = 0;
  
  private String[] pathNames;
  
  private final Reader in;
  
  private static final int PEEKED_DOUBLE_QUOTED = 9;
  
  private boolean lenient = false;
  
  private static final int PEEKED_TRUE = 5;
  
  private long peekedLong;
  
  private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
  
  private static final int NUMBER_CHAR_DECIMAL = 3;
  
  private static final int NUMBER_CHAR_DIGIT = 2;
  
  private int[] pathIndices;
  
  private static final int PEEKED_EOF = 17;
  
  private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
  
  private int lineStart = 0;
  
  private static final int NUMBER_CHAR_EXP_DIGIT = 7;
  
  private static final int PEEKED_BEGIN_ARRAY = 3;
  
  private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
  
  private static final int NUMBER_CHAR_EXP_SIGN = 6;
  
  private static final int PEEKED_END_ARRAY = 4;
  
  private static final int PEEKED_BEGIN_OBJECT = 1;
  
  private int pos = 0;
  
  private int lineNumber = 0;
  
  private static final int PEEKED_FALSE = 6;
  
  public int peeked = 0;
  
  private static final int PEEKED_UNQUOTED_NAME = 14;
  
  private static final int PEEKED_SINGLE_QUOTED = 8;
  
  private static final int NUMBER_CHAR_SIGN = 1;
  
  private static final long b = o3.a(-5831479905761929315L, -8862323930545912908L, null).a(120487531088795L);
  
  static {
    long l = b ^ 0x7E7A2D69EB1DL;
    NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
    JsonReaderInternalAccess.INSTANCE = new JsonReader$1();
  }
  
  public double nextDouble() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/com/google/gson/stream/JsonReader.b : J
    //   3: ldc2_w 30806470004817
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield peeked : I
    //   12: istore_3
    //   13: iload_3
    //   14: ifne -> 22
    //   17: aload_0
    //   18: invokevirtual doPeek : ()I
    //   21: istore_3
    //   22: iload_3
    //   23: bipush #15
    //   25: if_icmpne -> 58
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield peeked : I
    //   33: aload_0
    //   34: getfield pathIndices : [I
    //   37: aload_0
    //   38: getfield stackSize : I
    //   41: iconst_1
    //   42: isub
    //   43: dup2
    //   44: iaload
    //   45: iconst_1
    //   46: iadd
    //   47: iastore
    //   48: aload_0
    //   49: getfield peekedLong : J
    //   52: l2d
    //   53: dreturn
    //   54: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: iload_3
    //   59: bipush #16
    //   61: if_icmpne -> 107
    //   64: aload_0
    //   65: new java/lang/String
    //   68: dup
    //   69: aload_0
    //   70: getfield buffer : [C
    //   73: aload_0
    //   74: getfield pos : I
    //   77: aload_0
    //   78: getfield peekedNumberLength : I
    //   81: invokespecial <init> : ([CII)V
    //   84: putfield peekedString : Ljava/lang/String;
    //   87: aload_0
    //   88: dup
    //   89: getfield pos : I
    //   92: aload_0
    //   93: getfield peekedNumberLength : I
    //   96: iadd
    //   97: putfield pos : I
    //   100: goto -> 229
    //   103: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: iload_3
    //   108: bipush #8
    //   110: if_icmpeq -> 126
    //   113: iload_3
    //   114: bipush #9
    //   116: if_icmpne -> 161
    //   119: goto -> 126
    //   122: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   125: athrow
    //   126: aload_0
    //   127: aload_0
    //   128: iload_3
    //   129: bipush #8
    //   131: if_icmpne -> 150
    //   134: goto -> 141
    //   137: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: bipush #39
    //   143: goto -> 152
    //   146: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   149: athrow
    //   150: bipush #34
    //   152: invokespecial nextQuotedValue : (C)Ljava/lang/String;
    //   155: putfield peekedString : Ljava/lang/String;
    //   158: goto -> 229
    //   161: iload_3
    //   162: bipush #10
    //   164: if_icmpne -> 182
    //   167: aload_0
    //   168: aload_0
    //   169: invokespecial nextUnquotedValue : ()Ljava/lang/String;
    //   172: putfield peekedString : Ljava/lang/String;
    //   175: goto -> 229
    //   178: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: iload_3
    //   183: bipush #11
    //   185: if_icmpeq -> 229
    //   188: new java/lang/IllegalStateException
    //   191: dup
    //   192: new java/lang/StringBuilder
    //   195: dup
    //   196: invokespecial <init> : ()V
    //   199: ldc 'Expected a double but was '
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: aload_0
    //   205: invokevirtual peek : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonToken;
    //   208: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   211: aload_0
    //   212: invokevirtual locationString : ()Ljava/lang/String;
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: invokespecial <init> : (Ljava/lang/String;)V
    //   224: athrow
    //   225: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aload_0
    //   230: bipush #11
    //   232: putfield peeked : I
    //   235: aload_0
    //   236: getfield peekedString : Ljava/lang/String;
    //   239: invokestatic parseDouble : (Ljava/lang/String;)D
    //   242: dstore #4
    //   244: aload_0
    //   245: getfield lenient : Z
    //   248: ifne -> 320
    //   251: dload #4
    //   253: invokestatic isNaN : (D)Z
    //   256: ifne -> 281
    //   259: goto -> 266
    //   262: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   265: athrow
    //   266: dload #4
    //   268: invokestatic isInfinite : (D)Z
    //   271: ifeq -> 320
    //   274: goto -> 281
    //   277: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   280: athrow
    //   281: new me/rerere/matrix/thirdparty/com/google/gson/stream/MalformedJsonException
    //   284: dup
    //   285: new java/lang/StringBuilder
    //   288: dup
    //   289: invokespecial <init> : ()V
    //   292: ldc 'JSON forbids NaN and infinities: '
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: dload #4
    //   299: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   302: aload_0
    //   303: invokevirtual locationString : ()Ljava/lang/String;
    //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: invokevirtual toString : ()Ljava/lang/String;
    //   312: invokespecial <init> : (Ljava/lang/String;)V
    //   315: athrow
    //   316: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   319: athrow
    //   320: aload_0
    //   321: aconst_null
    //   322: putfield peekedString : Ljava/lang/String;
    //   325: aload_0
    //   326: iconst_0
    //   327: putfield peeked : I
    //   330: aload_0
    //   331: getfield pathIndices : [I
    //   334: aload_0
    //   335: getfield stackSize : I
    //   338: iconst_1
    //   339: isub
    //   340: dup2
    //   341: iaload
    //   342: iconst_1
    //   343: iadd
    //   344: iastore
    //   345: dload #4
    //   347: dreturn
    // Exception table:
    //   from	to	target	type
    //   22	54	54	java/io/IOException
    //   58	103	103	java/io/IOException
    //   107	119	122	java/io/IOException
    //   113	134	137	java/io/IOException
    //   126	146	146	java/io/IOException
    //   161	178	178	java/io/IOException
    //   182	225	225	java/io/IOException
    //   244	259	262	java/io/IOException
    //   251	274	277	java/io/IOException
    //   266	316	316	java/io/IOException
  }
  
  public void beginObject() throws IOException {
    long l = b ^ 0x779E53A44520L;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      if (i == 1) {
        push(3);
        this.peeked = 0;
      } else {
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + locationString());
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  public boolean nextBoolean() throws IOException {
    long l = b ^ 0xE63292FADCCL;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      if (i == 5) {
        this.peeked = 0;
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1;
        return true;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (i == 6) {
        this.peeked = 0;
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1;
        return false;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
  }
  
  public JsonToken peek() throws IOException {
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      switch (i) {
        case 1:
          return JsonToken.BEGIN_OBJECT;
        case 2:
          return JsonToken.END_OBJECT;
        case 3:
          return JsonToken.BEGIN_ARRAY;
        case 4:
          return JsonToken.END_ARRAY;
        case 12:
        case 13:
        case 14:
          return JsonToken.NAME;
        case 5:
        case 6:
          return JsonToken.BOOLEAN;
        case 7:
          return JsonToken.NULL;
        case 8:
        case 9:
        case 10:
        case 11:
          return JsonToken.STRING;
        case 15:
        case 16:
          return JsonToken.NUMBER;
        case 17:
          return JsonToken.END_DOCUMENT;
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
    throw new AssertionError();
  }
  
  public void endArray() throws IOException {
    long l = b ^ 0x12AA5DA9D280L;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      if (i == 4) {
        this.stackSize--;
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1;
        this.peeked = 0;
      } else {
        throw new IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  public JsonReader(Reader paramReader) {
    this.stack[this.stackSize++] = 6;
    this.pathNames = new String[32];
    this.pathIndices = new int[32];
    if (paramReader == null)
      throw new NullPointerException("in == null"); 
    this.in = paramReader;
  }
  
  public void skipValue() throws IOException {
    long l = b ^ 0x32453FE2E846L;
    boolean bool = false;
    while (true) {
      while (true) {
        int i = this.peeked;
        break;
      } 
      if (!bool) {
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1;
        this.pathNames[this.stackSize - 1] = "null";
        return;
      } 
    } 
  }
  
  public void beginArray() throws IOException {
    long l = b ^ 0x730979FBD249L;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      if (i == 3) {
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
      } else {
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  public boolean hasNext() throws IOException {
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      if (i != 2)
        try {
          if (i != 4);
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
    return false;
  }
  
  public int nextInt() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/com/google/gson/stream/JsonReader.b : J
    //   3: ldc2_w 33817749379701
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield peeked : I
    //   12: istore_3
    //   13: iload_3
    //   14: ifne -> 22
    //   17: aload_0
    //   18: invokevirtual doPeek : ()I
    //   21: istore_3
    //   22: iload_3
    //   23: bipush #15
    //   25: if_icmpne -> 111
    //   28: aload_0
    //   29: getfield peekedLong : J
    //   32: l2i
    //   33: istore #4
    //   35: aload_0
    //   36: getfield peekedLong : J
    //   39: iload #4
    //   41: i2l
    //   42: lcmp
    //   43: ifeq -> 88
    //   46: new java/lang/NumberFormatException
    //   49: dup
    //   50: new java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: ldc_w 'Expected an int but was '
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: aload_0
    //   64: getfield peekedLong : J
    //   67: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   70: aload_0
    //   71: invokevirtual locationString : ()Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual toString : ()Ljava/lang/String;
    //   80: invokespecial <init> : (Ljava/lang/String;)V
    //   83: athrow
    //   84: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: aload_0
    //   89: iconst_0
    //   90: putfield peeked : I
    //   93: aload_0
    //   94: getfield pathIndices : [I
    //   97: aload_0
    //   98: getfield stackSize : I
    //   101: iconst_1
    //   102: isub
    //   103: dup2
    //   104: iaload
    //   105: iconst_1
    //   106: iadd
    //   107: iastore
    //   108: iload #4
    //   110: ireturn
    //   111: iload_3
    //   112: bipush #16
    //   114: if_icmpne -> 160
    //   117: aload_0
    //   118: new java/lang/String
    //   121: dup
    //   122: aload_0
    //   123: getfield buffer : [C
    //   126: aload_0
    //   127: getfield pos : I
    //   130: aload_0
    //   131: getfield peekedNumberLength : I
    //   134: invokespecial <init> : ([CII)V
    //   137: putfield peekedString : Ljava/lang/String;
    //   140: aload_0
    //   141: dup
    //   142: getfield pos : I
    //   145: aload_0
    //   146: getfield peekedNumberLength : I
    //   149: iadd
    //   150: putfield pos : I
    //   153: goto -> 320
    //   156: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   159: athrow
    //   160: iload_3
    //   161: bipush #8
    //   163: if_icmpeq -> 192
    //   166: iload_3
    //   167: bipush #9
    //   169: if_icmpeq -> 192
    //   172: goto -> 179
    //   175: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: iload_3
    //   180: bipush #10
    //   182: if_icmpne -> 282
    //   185: goto -> 192
    //   188: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: iload_3
    //   193: bipush #10
    //   195: if_icmpne -> 220
    //   198: goto -> 205
    //   201: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   204: athrow
    //   205: aload_0
    //   206: aload_0
    //   207: invokespecial nextUnquotedValue : ()Ljava/lang/String;
    //   210: putfield peekedString : Ljava/lang/String;
    //   213: goto -> 245
    //   216: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   219: athrow
    //   220: aload_0
    //   221: aload_0
    //   222: iload_3
    //   223: bipush #8
    //   225: if_icmpne -> 237
    //   228: bipush #39
    //   230: goto -> 239
    //   233: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   236: athrow
    //   237: bipush #34
    //   239: invokespecial nextQuotedValue : (C)Ljava/lang/String;
    //   242: putfield peekedString : Ljava/lang/String;
    //   245: aload_0
    //   246: getfield peekedString : Ljava/lang/String;
    //   249: invokestatic parseInt : (Ljava/lang/String;)I
    //   252: istore #4
    //   254: aload_0
    //   255: iconst_0
    //   256: putfield peeked : I
    //   259: aload_0
    //   260: getfield pathIndices : [I
    //   263: aload_0
    //   264: getfield stackSize : I
    //   267: iconst_1
    //   268: isub
    //   269: dup2
    //   270: iaload
    //   271: iconst_1
    //   272: iadd
    //   273: iastore
    //   274: iload #4
    //   276: ireturn
    //   277: astore #5
    //   279: goto -> 320
    //   282: new java/lang/IllegalStateException
    //   285: dup
    //   286: new java/lang/StringBuilder
    //   289: dup
    //   290: invokespecial <init> : ()V
    //   293: ldc_w 'Expected an int but was '
    //   296: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: aload_0
    //   300: invokevirtual peek : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonToken;
    //   303: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   306: aload_0
    //   307: invokevirtual locationString : ()Ljava/lang/String;
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual toString : ()Ljava/lang/String;
    //   316: invokespecial <init> : (Ljava/lang/String;)V
    //   319: athrow
    //   320: aload_0
    //   321: bipush #11
    //   323: putfield peeked : I
    //   326: aload_0
    //   327: getfield peekedString : Ljava/lang/String;
    //   330: invokestatic parseDouble : (Ljava/lang/String;)D
    //   333: dstore #5
    //   335: dload #5
    //   337: d2i
    //   338: istore #4
    //   340: iload #4
    //   342: i2d
    //   343: dload #5
    //   345: dcmpl
    //   346: ifeq -> 391
    //   349: new java/lang/NumberFormatException
    //   352: dup
    //   353: new java/lang/StringBuilder
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: ldc_w 'Expected an int but was '
    //   363: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: aload_0
    //   367: getfield peekedString : Ljava/lang/String;
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: aload_0
    //   374: invokevirtual locationString : ()Ljava/lang/String;
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: invokevirtual toString : ()Ljava/lang/String;
    //   383: invokespecial <init> : (Ljava/lang/String;)V
    //   386: athrow
    //   387: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   390: athrow
    //   391: aload_0
    //   392: aconst_null
    //   393: putfield peekedString : Ljava/lang/String;
    //   396: aload_0
    //   397: iconst_0
    //   398: putfield peeked : I
    //   401: aload_0
    //   402: getfield pathIndices : [I
    //   405: aload_0
    //   406: getfield stackSize : I
    //   409: iconst_1
    //   410: isub
    //   411: dup2
    //   412: iaload
    //   413: iconst_1
    //   414: iadd
    //   415: iastore
    //   416: iload #4
    //   418: ireturn
    // Exception table:
    //   from	to	target	type
    //   35	84	84	java/lang/NumberFormatException
    //   111	156	156	java/lang/NumberFormatException
    //   160	172	175	java/lang/NumberFormatException
    //   166	185	188	java/lang/NumberFormatException
    //   179	198	201	java/lang/NumberFormatException
    //   192	216	216	java/lang/NumberFormatException
    //   220	233	233	java/lang/NumberFormatException
    //   245	276	277	java/lang/NumberFormatException
    //   340	387	387	java/lang/NumberFormatException
  }
  
  public long nextLong() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/com/google/gson/stream/JsonReader.b : J
    //   3: ldc2_w 37413552661252
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield peeked : I
    //   12: istore_3
    //   13: iload_3
    //   14: ifne -> 22
    //   17: aload_0
    //   18: invokevirtual doPeek : ()I
    //   21: istore_3
    //   22: iload_3
    //   23: bipush #15
    //   25: if_icmpne -> 57
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield peeked : I
    //   33: aload_0
    //   34: getfield pathIndices : [I
    //   37: aload_0
    //   38: getfield stackSize : I
    //   41: iconst_1
    //   42: isub
    //   43: dup2
    //   44: iaload
    //   45: iconst_1
    //   46: iadd
    //   47: iastore
    //   48: aload_0
    //   49: getfield peekedLong : J
    //   52: lreturn
    //   53: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   56: athrow
    //   57: iload_3
    //   58: bipush #16
    //   60: if_icmpne -> 106
    //   63: aload_0
    //   64: new java/lang/String
    //   67: dup
    //   68: aload_0
    //   69: getfield buffer : [C
    //   72: aload_0
    //   73: getfield pos : I
    //   76: aload_0
    //   77: getfield peekedNumberLength : I
    //   80: invokespecial <init> : ([CII)V
    //   83: putfield peekedString : Ljava/lang/String;
    //   86: aload_0
    //   87: dup
    //   88: getfield pos : I
    //   91: aload_0
    //   92: getfield peekedNumberLength : I
    //   95: iadd
    //   96: putfield pos : I
    //   99: goto -> 266
    //   102: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: iload_3
    //   107: bipush #8
    //   109: if_icmpeq -> 138
    //   112: iload_3
    //   113: bipush #9
    //   115: if_icmpeq -> 138
    //   118: goto -> 125
    //   121: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: iload_3
    //   126: bipush #10
    //   128: if_icmpne -> 228
    //   131: goto -> 138
    //   134: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: iload_3
    //   139: bipush #10
    //   141: if_icmpne -> 166
    //   144: goto -> 151
    //   147: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload_0
    //   152: aload_0
    //   153: invokespecial nextUnquotedValue : ()Ljava/lang/String;
    //   156: putfield peekedString : Ljava/lang/String;
    //   159: goto -> 191
    //   162: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: aload_0
    //   167: aload_0
    //   168: iload_3
    //   169: bipush #8
    //   171: if_icmpne -> 183
    //   174: bipush #39
    //   176: goto -> 185
    //   179: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   182: athrow
    //   183: bipush #34
    //   185: invokespecial nextQuotedValue : (C)Ljava/lang/String;
    //   188: putfield peekedString : Ljava/lang/String;
    //   191: aload_0
    //   192: getfield peekedString : Ljava/lang/String;
    //   195: invokestatic parseLong : (Ljava/lang/String;)J
    //   198: lstore #4
    //   200: aload_0
    //   201: iconst_0
    //   202: putfield peeked : I
    //   205: aload_0
    //   206: getfield pathIndices : [I
    //   209: aload_0
    //   210: getfield stackSize : I
    //   213: iconst_1
    //   214: isub
    //   215: dup2
    //   216: iaload
    //   217: iconst_1
    //   218: iadd
    //   219: iastore
    //   220: lload #4
    //   222: lreturn
    //   223: astore #4
    //   225: goto -> 266
    //   228: new java/lang/IllegalStateException
    //   231: dup
    //   232: new java/lang/StringBuilder
    //   235: dup
    //   236: invokespecial <init> : ()V
    //   239: ldc_w 'Expected a long but was '
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: aload_0
    //   246: invokevirtual peek : ()Lme/rerere/matrix/thirdparty/com/google/gson/stream/JsonToken;
    //   249: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   252: aload_0
    //   253: invokevirtual locationString : ()Ljava/lang/String;
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: invokevirtual toString : ()Ljava/lang/String;
    //   262: invokespecial <init> : (Ljava/lang/String;)V
    //   265: athrow
    //   266: aload_0
    //   267: bipush #11
    //   269: putfield peeked : I
    //   272: aload_0
    //   273: getfield peekedString : Ljava/lang/String;
    //   276: invokestatic parseDouble : (Ljava/lang/String;)D
    //   279: dstore #4
    //   281: dload #4
    //   283: d2l
    //   284: lstore #6
    //   286: lload #6
    //   288: l2d
    //   289: dload #4
    //   291: dcmpl
    //   292: ifeq -> 337
    //   295: new java/lang/NumberFormatException
    //   298: dup
    //   299: new java/lang/StringBuilder
    //   302: dup
    //   303: invokespecial <init> : ()V
    //   306: ldc_w 'Expected a long but was '
    //   309: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: aload_0
    //   313: getfield peekedString : Ljava/lang/String;
    //   316: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: aload_0
    //   320: invokevirtual locationString : ()Ljava/lang/String;
    //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: invokevirtual toString : ()Ljava/lang/String;
    //   329: invokespecial <init> : (Ljava/lang/String;)V
    //   332: athrow
    //   333: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   336: athrow
    //   337: aload_0
    //   338: aconst_null
    //   339: putfield peekedString : Ljava/lang/String;
    //   342: aload_0
    //   343: iconst_0
    //   344: putfield peeked : I
    //   347: aload_0
    //   348: getfield pathIndices : [I
    //   351: aload_0
    //   352: getfield stackSize : I
    //   355: iconst_1
    //   356: isub
    //   357: dup2
    //   358: iaload
    //   359: iconst_1
    //   360: iadd
    //   361: iastore
    //   362: lload #6
    //   364: lreturn
    // Exception table:
    //   from	to	target	type
    //   22	53	53	java/lang/NumberFormatException
    //   57	102	102	java/lang/NumberFormatException
    //   106	118	121	java/lang/NumberFormatException
    //   112	131	134	java/lang/NumberFormatException
    //   125	144	147	java/lang/NumberFormatException
    //   138	162	162	java/lang/NumberFormatException
    //   166	179	179	java/lang/NumberFormatException
    //   191	222	223	java/lang/NumberFormatException
    //   286	333	333	java/lang/NumberFormatException
  }
  
  public final boolean isLenient() {
    return this.lenient;
  }
  
  public void close() throws IOException {
    this.peeked = 0;
    this.stack[0] = 8;
    this.stackSize = 1;
    this.in.close();
  }
  
  public String nextString() throws IOException {
    String str;
    long l = b ^ 0x357D3DF1A2FFL;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    if (i == 10) {
      str = nextUnquotedValue();
    } else if (i == 8) {
      str = nextQuotedValue('\'');
    } else if (i == 9) {
      str = nextQuotedValue('"');
    } else if (i == 11) {
      str = this.peekedString;
      this.peekedString = null;
    } else if (i == 15) {
      str = Long.toString(this.peekedLong);
    } else if (i == 16) {
      str = new String(this.buffer, this.pos, this.peekedNumberLength);
      this.pos += this.peekedNumberLength;
    } else {
      throw new IllegalStateException("Expected a string but was " + peek() + locationString());
    } 
    this.peeked = 0;
    this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1;
    return str;
  }
  
  public String nextName() throws IOException {
    String str;
    long l = b ^ 0x6A617A505E1CL;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    if (i == 14) {
      str = nextUnquotedValue();
    } else if (i == 12) {
      str = nextQuotedValue('\'');
    } else if (i == 13) {
      str = nextQuotedValue('"');
    } else {
      throw new IllegalStateException("Expected a name but was " + peek() + locationString());
    } 
    this.peeked = 0;
    this.pathNames[this.stackSize - 1] = str;
    return str;
  }
  
  public String locationString() {
    long l = b ^ 0xE229277AF1L;
    int i = this.lineNumber + 1;
    int j = this.pos - this.lineStart + 1;
    return " at line " + i + " column " + j + " path " + getPath();
  }
  
  public String getPath() {
    StringBuilder stringBuilder = (new StringBuilder()).append('$');
    byte b = 0;
    int i = this.stackSize;
    while (true) {
      try {
        if (b < i) {
          try {
            switch (this.stack[b]) {
              case 1:
              case 2:
                stringBuilder.append('[').append(this.pathIndices[b]).append(']');
                break;
              case 3:
              case 4:
              case 5:
                try {
                  stringBuilder.append('.');
                  if (this.pathNames[b] != null)
                    stringBuilder.append(this.pathNames[b]); 
                } catch (NullPointerException nullPointerException) {
                  throw b(null);
                } 
                break;
            } 
          } catch (NullPointerException nullPointerException) {
            throw b(null);
          } 
          b++;
          continue;
        } 
      } catch (NullPointerException nullPointerException) {
        throw b(null);
      } 
      return stringBuilder.toString();
    } 
  }
  
  public String toString() {
    return getClass().getSimpleName() + locationString();
  }
  
  public final void setLenient(boolean paramBoolean) {
    this.lenient = paramBoolean;
  }
  
  public int doPeek() throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/com/google/gson/stream/JsonReader.b : J
    //   3: ldc2_w 137774840619700
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield stack : [I
    //   12: aload_0
    //   13: getfield stackSize : I
    //   16: iconst_1
    //   17: isub
    //   18: iaload
    //   19: istore_3
    //   20: iload_3
    //   21: iconst_1
    //   22: if_icmpne -> 44
    //   25: aload_0
    //   26: getfield stack : [I
    //   29: aload_0
    //   30: getfield stackSize : I
    //   33: iconst_1
    //   34: isub
    //   35: iconst_2
    //   36: iastore
    //   37: goto -> 618
    //   40: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: iload_3
    //   45: iconst_2
    //   46: if_icmpne -> 121
    //   49: aload_0
    //   50: iconst_1
    //   51: invokespecial nextNonWhitespace : (Z)I
    //   54: istore #4
    //   56: iload #4
    //   58: lookupswitch default -> 110, 44 -> 107, 59 -> 103, 93 -> 92
    //   92: aload_0
    //   93: iconst_4
    //   94: dup_x1
    //   95: putfield peeked : I
    //   98: ireturn
    //   99: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   102: athrow
    //   103: aload_0
    //   104: invokespecial checkLenient : ()V
    //   107: goto -> 118
    //   110: aload_0
    //   111: ldc_w 'Unterminated array'
    //   114: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
    //   117: athrow
    //   118: goto -> 618
    //   121: iload_3
    //   122: iconst_3
    //   123: if_icmpeq -> 138
    //   126: iload_3
    //   127: iconst_5
    //   128: if_icmpne -> 364
    //   131: goto -> 138
    //   134: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: aload_0
    //   139: getfield stack : [I
    //   142: aload_0
    //   143: getfield stackSize : I
    //   146: iconst_1
    //   147: isub
    //   148: iconst_4
    //   149: iastore
    //   150: iload_3
    //   151: iconst_5
    //   152: if_icmpne -> 230
    //   155: goto -> 162
    //   158: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: aload_0
    //   163: iconst_1
    //   164: invokespecial nextNonWhitespace : (Z)I
    //   167: istore #4
    //   169: iload #4
    //   171: lookupswitch default -> 222, 44 -> 219, 59 -> 215, 125 -> 204
    //   204: aload_0
    //   205: iconst_2
    //   206: dup_x1
    //   207: putfield peeked : I
    //   210: ireturn
    //   211: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   214: athrow
    //   215: aload_0
    //   216: invokespecial checkLenient : ()V
    //   219: goto -> 230
    //   222: aload_0
    //   223: ldc_w 'Unterminated object'
    //   226: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
    //   229: athrow
    //   230: aload_0
    //   231: iconst_1
    //   232: invokespecial nextNonWhitespace : (Z)I
    //   235: istore #4
    //   237: iload #4
    //   239: lookupswitch default -> 320, 34 -> 272, 39 -> 284, 125 -> 296
    //   272: aload_0
    //   273: bipush #13
    //   275: dup_x1
    //   276: putfield peeked : I
    //   279: ireturn
    //   280: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   283: athrow
    //   284: aload_0
    //   285: invokespecial checkLenient : ()V
    //   288: aload_0
    //   289: bipush #12
    //   291: dup_x1
    //   292: putfield peeked : I
    //   295: ireturn
    //   296: iload_3
    //   297: iconst_5
    //   298: if_icmpeq -> 312
    //   301: aload_0
    //   302: iconst_2
    //   303: dup_x1
    //   304: putfield peeked : I
    //   307: ireturn
    //   308: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   311: athrow
    //   312: aload_0
    //   313: ldc_w 'Expected name'
    //   316: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
    //   319: athrow
    //   320: aload_0
    //   321: invokespecial checkLenient : ()V
    //   324: aload_0
    //   325: dup
    //   326: getfield pos : I
    //   329: iconst_1
    //   330: isub
    //   331: putfield pos : I
    //   334: aload_0
    //   335: iload #4
    //   337: i2c
    //   338: invokespecial isLiteral : (C)Z
    //   341: ifeq -> 356
    //   344: aload_0
    //   345: bipush #14
    //   347: dup_x1
    //   348: putfield peeked : I
    //   351: ireturn
    //   352: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   355: athrow
    //   356: aload_0
    //   357: ldc_w 'Expected name'
    //   360: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
    //   363: athrow
    //   364: iload_3
    //   365: iconst_4
    //   366: if_icmpne -> 502
    //   369: aload_0
    //   370: getfield stack : [I
    //   373: aload_0
    //   374: getfield stackSize : I
    //   377: iconst_1
    //   378: isub
    //   379: iconst_5
    //   380: iastore
    //   381: aload_0
    //   382: iconst_1
    //   383: invokespecial nextNonWhitespace : (Z)I
    //   386: istore #4
    //   388: iload #4
    //   390: lookupswitch default -> 491, 58 -> 416, 61 -> 423
    //   416: goto -> 499
    //   419: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   422: athrow
    //   423: aload_0
    //   424: invokespecial checkLenient : ()V
    //   427: aload_0
    //   428: getfield pos : I
    //   431: aload_0
    //   432: getfield limit : I
    //   435: if_icmplt -> 453
    //   438: aload_0
    //   439: iconst_1
    //   440: invokespecial fillBuffer : (I)Z
    //   443: ifeq -> 499
    //   446: goto -> 453
    //   449: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   452: athrow
    //   453: aload_0
    //   454: getfield buffer : [C
    //   457: aload_0
    //   458: getfield pos : I
    //   461: caload
    //   462: bipush #62
    //   464: if_icmpne -> 499
    //   467: goto -> 474
    //   470: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   473: athrow
    //   474: aload_0
    //   475: dup
    //   476: getfield pos : I
    //   479: iconst_1
    //   480: iadd
    //   481: putfield pos : I
    //   484: goto -> 499
    //   487: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   490: athrow
    //   491: aload_0
    //   492: ldc_w 'Expected ':''
    //   495: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
    //   498: athrow
    //   499: goto -> 618
    //   502: iload_3
    //   503: bipush #6
    //   505: if_icmpne -> 549
    //   508: aload_0
    //   509: getfield lenient : Z
    //   512: ifeq -> 533
    //   515: goto -> 522
    //   518: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   521: athrow
    //   522: aload_0
    //   523: invokespecial consumeNonExecutePrefix : ()V
    //   526: goto -> 533
    //   529: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   532: athrow
    //   533: aload_0
    //   534: getfield stack : [I
    //   537: aload_0
    //   538: getfield stackSize : I
    //   541: iconst_1
    //   542: isub
    //   543: bipush #7
    //   545: iastore
    //   546: goto -> 618
    //   549: iload_3
    //   550: bipush #7
    //   552: if_icmpne -> 597
    //   555: aload_0
    //   556: iconst_0
    //   557: invokespecial nextNonWhitespace : (Z)I
    //   560: istore #4
    //   562: iload #4
    //   564: iconst_m1
    //   565: if_icmpne -> 580
    //   568: aload_0
    //   569: bipush #17
    //   571: dup_x1
    //   572: putfield peeked : I
    //   575: ireturn
    //   576: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   579: athrow
    //   580: aload_0
    //   581: invokespecial checkLenient : ()V
    //   584: aload_0
    //   585: dup
    //   586: getfield pos : I
    //   589: iconst_1
    //   590: isub
    //   591: putfield pos : I
    //   594: goto -> 618
    //   597: iload_3
    //   598: bipush #8
    //   600: if_icmpne -> 618
    //   603: new java/lang/IllegalStateException
    //   606: dup
    //   607: ldc_w 'JsonReader is closed'
    //   610: invokespecial <init> : (Ljava/lang/String;)V
    //   613: athrow
    //   614: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   617: athrow
    //   618: aload_0
    //   619: iconst_1
    //   620: invokespecial nextNonWhitespace : (Z)I
    //   623: istore #4
    //   625: iload #4
    //   627: lookupswitch default -> 800, 34 -> 778, 39 -> 766, 44 -> 715, 59 -> 715, 91 -> 786, 93 -> 692, 123 -> 793
    //   692: iload_3
    //   693: iconst_1
    //   694: if_icmpne -> 715
    //   697: goto -> 704
    //   700: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   703: athrow
    //   704: aload_0
    //   705: iconst_4
    //   706: dup_x1
    //   707: putfield peeked : I
    //   710: ireturn
    //   711: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   714: athrow
    //   715: iload_3
    //   716: iconst_1
    //   717: if_icmpeq -> 732
    //   720: iload_3
    //   721: iconst_2
    //   722: if_icmpne -> 758
    //   725: goto -> 732
    //   728: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   731: athrow
    //   732: aload_0
    //   733: invokespecial checkLenient : ()V
    //   736: aload_0
    //   737: dup
    //   738: getfield pos : I
    //   741: iconst_1
    //   742: isub
    //   743: putfield pos : I
    //   746: aload_0
    //   747: bipush #7
    //   749: dup_x1
    //   750: putfield peeked : I
    //   753: ireturn
    //   754: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   757: athrow
    //   758: aload_0
    //   759: ldc_w 'Unexpected value'
    //   762: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
    //   765: athrow
    //   766: aload_0
    //   767: invokespecial checkLenient : ()V
    //   770: aload_0
    //   771: bipush #8
    //   773: dup_x1
    //   774: putfield peeked : I
    //   777: ireturn
    //   778: aload_0
    //   779: bipush #9
    //   781: dup_x1
    //   782: putfield peeked : I
    //   785: ireturn
    //   786: aload_0
    //   787: iconst_3
    //   788: dup_x1
    //   789: putfield peeked : I
    //   792: ireturn
    //   793: aload_0
    //   794: iconst_1
    //   795: dup_x1
    //   796: putfield peeked : I
    //   799: ireturn
    //   800: aload_0
    //   801: dup
    //   802: getfield pos : I
    //   805: iconst_1
    //   806: isub
    //   807: putfield pos : I
    //   810: aload_0
    //   811: invokespecial peekKeyword : ()I
    //   814: istore #5
    //   816: iload #5
    //   818: ifeq -> 828
    //   821: iload #5
    //   823: ireturn
    //   824: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   827: athrow
    //   828: aload_0
    //   829: invokespecial peekNumber : ()I
    //   832: istore #5
    //   834: iload #5
    //   836: ifeq -> 846
    //   839: iload #5
    //   841: ireturn
    //   842: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   845: athrow
    //   846: aload_0
    //   847: aload_0
    //   848: getfield buffer : [C
    //   851: aload_0
    //   852: getfield pos : I
    //   855: caload
    //   856: invokespecial isLiteral : (C)Z
    //   859: ifne -> 874
    //   862: aload_0
    //   863: ldc_w 'Expected value'
    //   866: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
    //   869: athrow
    //   870: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   873: athrow
    //   874: aload_0
    //   875: invokespecial checkLenient : ()V
    //   878: aload_0
    //   879: bipush #10
    //   881: dup_x1
    //   882: putfield peeked : I
    //   885: ireturn
    // Exception table:
    //   from	to	target	type
    //   20	40	40	java/io/IOException
    //   56	99	99	java/io/IOException
    //   121	131	134	java/io/IOException
    //   126	155	158	java/io/IOException
    //   169	211	211	java/io/IOException
    //   237	280	280	java/io/IOException
    //   296	308	308	java/io/IOException
    //   320	352	352	java/io/IOException
    //   388	419	419	java/io/IOException
    //   423	446	449	java/io/IOException
    //   438	467	470	java/io/IOException
    //   453	487	487	java/io/IOException
    //   502	515	518	java/io/IOException
    //   508	526	529	java/io/IOException
    //   562	576	576	java/io/IOException
    //   597	614	614	java/io/IOException
    //   625	697	700	java/io/IOException
    //   692	711	711	java/io/IOException
    //   715	725	728	java/io/IOException
    //   720	754	754	java/io/IOException
    //   816	824	824	java/io/IOException
    //   834	842	842	java/io/IOException
    //   846	870	870	java/io/IOException
  }
  
  public void nextNull() throws IOException {
    long l = b ^ 0x7E96D5F4DBB1L;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      if (i == 7) {
        this.peeked = 0;
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1;
      } else {
        throw new IllegalStateException("Expected null but was " + peek() + locationString());
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  public void endObject() throws IOException {
    long l = b ^ 0x25C14DD8E0D0L;
    int i = this.peeked;
    if (i == 0)
      i = doPeek(); 
    try {
      if (i == 2) {
        this.stackSize--;
        this.pathNames[this.stackSize] = null;
        this.pathIndices[this.stackSize - 1] = this.pathIndices[this.stackSize - 1] + 1;
        this.peeked = 0;
      } else {
        throw new IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
      } 
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\stream\JsonReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
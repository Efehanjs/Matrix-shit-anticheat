package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;

public class StreamReader {
  private int index = 0;
  
  private int column = 0;
  
  private boolean eof;
  
  private final Reader stream;
  
  private String name = "'reader'";
  
  private int line = 0;
  
  private int dataLength = 0;
  
  private int pointer = 0;
  
  private static final int BUFFER_SIZE = 1025;
  
  private final char[] buffer;
  
  private int[] dataWindow = new int[0];
  
  private static final long a = o3.a(-5352802244922622487L, -781417401115387205L, MethodHandles.lookup().lookupClass()).a(24715743221822L);
  
  public void forward() {
    forward(1);
  }
  
  public String prefixForward(int paramInt) {
    String str = prefix(paramInt);
    this.pointer += paramInt;
    this.index += paramInt;
    this.column += paramInt;
    return str;
  }
  
  public int getIndex() {
    return this.index;
  }
  
  public String prefix(int paramInt) {
    try {
      if (paramInt == 0)
        return ""; 
    } catch (ReaderException readerException) {
      throw a(null);
    } 
    try {
      if (ensureEnoughData(paramInt))
        return new String(this.dataWindow, this.pointer, paramInt); 
    } catch (ReaderException readerException) {
      throw a(null);
    } 
    return new String(this.dataWindow, this.pointer, Math.min(paramInt, this.dataLength - this.pointer));
  }
  
  public int getLine() {
    return this.line;
  }
  
  public int peek() {
    try {
    
    } catch (ReaderException readerException) {
      throw a(null);
    } 
    return ensureEnoughData() ? this.dataWindow[this.pointer] : 0;
  }
  
  public StreamReader(String paramString) {
    this(new StringReader(paramString));
    this.name = "'string'";
  }
  
  public void forward(int paramInt) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iload_2
    //   3: iload_1
    //   4: if_icmpge -> 157
    //   7: aload_0
    //   8: invokespecial ensureEnoughData : ()Z
    //   11: ifeq -> 157
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_0
    //   22: getfield dataWindow : [I
    //   25: aload_0
    //   26: dup
    //   27: getfield pointer : I
    //   30: dup_x1
    //   31: iconst_1
    //   32: iadd
    //   33: putfield pointer : I
    //   36: iaload
    //   37: istore_3
    //   38: aload_0
    //   39: dup
    //   40: getfield index : I
    //   43: iconst_1
    //   44: iadd
    //   45: putfield index : I
    //   48: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant.LINEBR : Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/scanner/Constant;
    //   51: iload_3
    //   52: invokevirtual has : (I)Z
    //   55: ifne -> 106
    //   58: iload_3
    //   59: bipush #13
    //   61: if_icmpne -> 128
    //   64: goto -> 71
    //   67: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   70: athrow
    //   71: aload_0
    //   72: invokespecial ensureEnoughData : ()Z
    //   75: ifeq -> 128
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: aload_0
    //   86: getfield dataWindow : [I
    //   89: aload_0
    //   90: getfield pointer : I
    //   93: iaload
    //   94: bipush #10
    //   96: if_icmpeq -> 128
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: aload_0
    //   107: dup
    //   108: getfield line : I
    //   111: iconst_1
    //   112: iadd
    //   113: putfield line : I
    //   116: aload_0
    //   117: iconst_0
    //   118: putfield column : I
    //   121: goto -> 151
    //   124: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   127: athrow
    //   128: iload_3
    //   129: ldc 65279
    //   131: if_icmpeq -> 151
    //   134: aload_0
    //   135: dup
    //   136: getfield column : I
    //   139: iconst_1
    //   140: iadd
    //   141: putfield column : I
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: iinc #2, 1
    //   154: goto -> 2
    //   157: return
    // Exception table:
    //   from	to	target	type
    //   2	14	17	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   38	64	67	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   58	78	81	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   71	99	102	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   85	124	124	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   128	144	147	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
  }
  
  public int peek(int paramInt) {
    try {
    
    } catch (ReaderException readerException) {
      throw a(null);
    } 
    return ensureEnoughData(paramInt) ? this.dataWindow[this.pointer + paramInt] : 0;
  }
  
  public int getColumn() {
    return this.column;
  }
  
  public static boolean isPrintable(int paramInt) {
    // Byte code:
    //   0: iload_0
    //   1: bipush #32
    //   3: if_icmplt -> 19
    //   6: iload_0
    //   7: bipush #126
    //   9: if_icmple -> 151
    //   12: goto -> 19
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: iload_0
    //   20: bipush #9
    //   22: if_icmpeq -> 151
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: iload_0
    //   33: bipush #10
    //   35: if_icmpeq -> 151
    //   38: goto -> 45
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iload_0
    //   46: bipush #13
    //   48: if_icmpeq -> 151
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: iload_0
    //   59: sipush #133
    //   62: if_icmpeq -> 151
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: iload_0
    //   73: sipush #160
    //   76: if_icmplt -> 99
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: iload_0
    //   87: ldc 55295
    //   89: if_icmple -> 151
    //   92: goto -> 99
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: iload_0
    //   100: ldc 57344
    //   102: if_icmplt -> 125
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: iload_0
    //   113: ldc 65533
    //   115: if_icmple -> 151
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: iload_0
    //   126: ldc 65536
    //   128: if_icmplt -> 159
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: iload_0
    //   139: ldc 1114111
    //   141: if_icmpgt -> 159
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: iconst_1
    //   152: goto -> 160
    //   155: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   158: athrow
    //   159: iconst_0
    //   160: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	12	15	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   6	25	28	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   19	38	41	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   32	51	54	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   45	65	68	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   58	79	82	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   72	92	95	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   86	105	108	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   99	118	121	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   112	131	134	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   125	144	147	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
    //   138	155	155	me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/ReaderException
  }
  
  public static boolean isPrintable(String paramString) {
    int i = paramString.length();
    for (int j = 0; j < i; j += Character.charCount(k)) {
      int k = paramString.codePointAt(j);
      try {
        if (!isPrintable(k))
          return false; 
      } catch (ReaderException readerException) {
        throw a(null);
      } 
    } 
    return true;
  }
  
  public Mark getMark() {
    return new Mark(this.name, this.index, this.line, this.column, this.dataWindow, this.pointer);
  }
  
  public StreamReader(Reader paramReader) {
    this.stream = paramReader;
    this.eof = false;
    this.buffer = new char[1025];
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\reader\StreamReader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UnicodeReader extends Reader {
  private static final Charset UTF16LE;
  
  private static final Charset UTF8 = StandardCharsets.UTF_8;
  
  public InputStreamReader internalIn2 = null;
  
  private static final int BOM_SIZE = 3;
  
  private static final Charset UTF16BE = StandardCharsets.UTF_16BE;
  
  public PushbackInputStream internalIn;
  
  public String getEncoding() {
    return this.internalIn2.getEncoding();
  }
  
  public void close() throws IOException {
    init();
    this.internalIn2.close();
  }
  
  public void init() throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield internalIn2 : Ljava/io/InputStreamReader;
    //   4: ifnull -> 12
    //   7: return
    //   8: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   11: athrow
    //   12: iconst_3
    //   13: newarray byte
    //   15: astore_2
    //   16: aload_0
    //   17: getfield internalIn : Ljava/io/PushbackInputStream;
    //   20: aload_2
    //   21: iconst_0
    //   22: aload_2
    //   23: arraylength
    //   24: invokevirtual read : ([BII)I
    //   27: istore_3
    //   28: aload_2
    //   29: iconst_0
    //   30: baload
    //   31: bipush #-17
    //   33: if_icmpne -> 78
    //   36: aload_2
    //   37: iconst_1
    //   38: baload
    //   39: bipush #-69
    //   41: if_icmpne -> 78
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: aload_2
    //   52: iconst_2
    //   53: baload
    //   54: bipush #-65
    //   56: if_icmpne -> 78
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/UnicodeReader.UTF8 : Ljava/nio/charset/Charset;
    //   69: astore_1
    //   70: iload_3
    //   71: iconst_3
    //   72: isub
    //   73: istore #4
    //   75: goto -> 153
    //   78: aload_2
    //   79: iconst_0
    //   80: baload
    //   81: bipush #-2
    //   83: if_icmpne -> 112
    //   86: aload_2
    //   87: iconst_1
    //   88: baload
    //   89: iconst_m1
    //   90: if_icmpne -> 112
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   99: athrow
    //   100: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/UnicodeReader.UTF16BE : Ljava/nio/charset/Charset;
    //   103: astore_1
    //   104: iload_3
    //   105: iconst_2
    //   106: isub
    //   107: istore #4
    //   109: goto -> 153
    //   112: aload_2
    //   113: iconst_0
    //   114: baload
    //   115: iconst_m1
    //   116: if_icmpne -> 146
    //   119: aload_2
    //   120: iconst_1
    //   121: baload
    //   122: bipush #-2
    //   124: if_icmpne -> 146
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   133: athrow
    //   134: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/UnicodeReader.UTF16LE : Ljava/nio/charset/Charset;
    //   137: astore_1
    //   138: iload_3
    //   139: iconst_2
    //   140: isub
    //   141: istore #4
    //   143: goto -> 153
    //   146: getstatic me/rerere/matrix/thirdparty/org/simpleyaml/configuration/implementation/snakeyaml/lib/reader/UnicodeReader.UTF8 : Ljava/nio/charset/Charset;
    //   149: astore_1
    //   150: iload_3
    //   151: istore #4
    //   153: iload #4
    //   155: ifle -> 179
    //   158: aload_0
    //   159: getfield internalIn : Ljava/io/PushbackInputStream;
    //   162: aload_2
    //   163: iload_3
    //   164: iload #4
    //   166: isub
    //   167: iload #4
    //   169: invokevirtual unread : ([BII)V
    //   172: goto -> 179
    //   175: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   178: athrow
    //   179: aload_1
    //   180: invokevirtual newDecoder : ()Ljava/nio/charset/CharsetDecoder;
    //   183: getstatic java/nio/charset/CodingErrorAction.REPORT : Ljava/nio/charset/CodingErrorAction;
    //   186: invokevirtual onUnmappableCharacter : (Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;
    //   189: astore #5
    //   191: aload_0
    //   192: new java/io/InputStreamReader
    //   195: dup
    //   196: aload_0
    //   197: getfield internalIn : Ljava/io/PushbackInputStream;
    //   200: aload #5
    //   202: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/CharsetDecoder;)V
    //   205: putfield internalIn2 : Ljava/io/InputStreamReader;
    //   208: return
    // Exception table:
    //   from	to	target	type
    //   0	8	8	java/io/IOException
    //   28	44	47	java/io/IOException
    //   36	59	62	java/io/IOException
    //   78	93	96	java/io/IOException
    //   112	127	130	java/io/IOException
    //   153	172	175	java/io/IOException
  }
  
  public int read(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    init();
    return this.internalIn2.read(paramArrayOfchar, paramInt1, paramInt2);
  }
  
  static {
    UTF16LE = StandardCharsets.UTF_16LE;
  }
  
  public UnicodeReader(InputStream paramInputStream) {
    this.internalIn = new PushbackInputStream(paramInputStream, 3);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\reader\UnicodeReader.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
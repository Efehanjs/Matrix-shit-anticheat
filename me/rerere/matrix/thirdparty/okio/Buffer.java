package me.rerere.matrix.thirdparty.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.okio.internal._BufferKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
  private long size;
  
  @JvmField
  @Nullable
  public Segment head;
  
  private static final long a = o3.a(3425578466278264807L, -3062289180658727476L, MethodHandles.lookup().lookupClass()).a(89076827971597L);
  
  public boolean rangeEquals(long paramLong, @NotNull ByteString paramByteString) {
    long l = a ^ 0x2B041EDBF120L;
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    return rangeEquals(paramLong, paramByteString, 0, paramByteString.size());
  }
  
  @NotNull
  public String readUtf8LineStrict() throws EOFException {
    return readUtf8LineStrict(Long.MAX_VALUE);
  }
  
  @NotNull
  public Buffer writeByte(int paramInt) {
    Buffer buffer1 = this;
    boolean bool = false;
    Segment segment1 = buffer1.writableSegment$okio(1);
    Segment segment2 = segment1;
    int i = segment2.limit;
    segment2.limit = i + 1;
    segment1.data[i] = (byte)paramInt;
    Buffer buffer2 = buffer1;
    buffer2.setSize$okio(buffer2.size() + 1L);
    return buffer1;
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer writeTo(@NotNull OutputStream paramOutputStream, long paramLong) throws IOException {
    long l1 = a ^ 0x1C3354F6D7E2L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    long l2 = paramLong;
    _UtilKt.checkOffsetAndCount(this.size, 0L, l2);
    Segment segment = this.head;
    while (l2 > 0L) {
      Intrinsics.checkNotNull(segment);
      int j = segment.limit - segment.pos;
      boolean bool1 = false;
      long l = j;
      boolean bool2 = false;
      int i = (int)Math.min(l2, l);
      paramOutputStream.write(segment.data, segment.pos, i);
      Segment segment1 = segment;
      segment1.pos += i;
      Buffer buffer = this;
      buffer.size -= i;
      l2 -= i;
      if (segment.pos == segment.limit) {
        Segment segment2 = segment;
        segment = segment2.pop();
        this.head = segment;
        SegmentPool.recycle(segment2);
      } 
    } 
    return this;
  }
  
  @NotNull
  public final ByteString sha256() {
    long l = a ^ 0x51D31C37CCEFL;
    return digest("SHA-256");
  }
  
  @NotNull
  public Buffer write(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x9D32675AA3EL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "source");
    Buffer buffer = this;
    boolean bool = false;
    return buffer.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  @NotNull
  public Buffer write(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x7341CB557EADL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "source");
    Buffer buffer1 = this;
    boolean bool = false;
    int i = paramInt1;
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, i, paramInt2);
    int j = i + paramInt2;
    while (i < j) {
      Segment segment1 = buffer1.writableSegment$okio(1);
      int k = j - i;
      int m = 8192 - segment1.limit;
      boolean bool1 = false;
      int n = Math.min(k, m);
      ArraysKt.copyInto(paramArrayOfbyte, segment1.data, segment1.limit, i, i + n);
      i += n;
      Segment segment2 = segment1;
      segment2.limit += n;
    } 
    Buffer buffer2 = buffer1;
    buffer2.setSize$okio(buffer2.size() + paramInt2);
    return buffer1;
  }
  
  public short readShort() throws EOFException {
    Buffer buffer1 = this;
    boolean bool1 = false;
    try {
      if (buffer1.size() < 2L)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(buffer1.head);
    Segment segment = buffer1.head;
    int i = segment.pos;
    int j = segment.limit;
    byte b = buffer1.readByte();
    int m = 255;
    char c = Character.MIN_VALUE;
    b = buffer1.readByte();
    m = 255;
    c = Character.MIN_VALUE;
    int n = (b & m) << 8 | b & m;
    byte[] arrayOfByte = segment.data;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    c = 'ÿ';
    boolean bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    c = 'ÿ';
    bool2 = false;
    int k = (m & c) << 8 | m & c;
    Buffer buffer2 = buffer1;
    try {
      buffer2.setSize$okio(buffer2.size() - 2L);
      if (i == j) {
        buffer1.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return (j - i < 2) ? (short)n : (short)k;
  }
  
  @NotNull
  public String readUtf8() {
    return readString(this.size, Charsets.UTF_8);
  }
  
  public long indexOfElement(@NotNull ByteString paramByteString) {
    long l = a ^ 0x2157814DEEAL;
    Intrinsics.checkNotNullParameter(paramByteString, "targetBytes");
    return indexOfElement(paramByteString, 0L);
  }
  
  @NotNull
  public final Buffer copy() {
    Buffer buffer1 = this;
    boolean bool = false;
    Buffer buffer2 = new Buffer();
    try {
      Intrinsics.checkNotNull(buffer1.head);
      Segment segment1 = buffer1.head;
      Segment segment2 = segment1.sharedCopy();
      buffer2.head = segment2;
      segment2.prev = buffer2.head;
      segment2.next = segment2.prev;
      for (Segment segment3 = segment1.next; segment3 != segment1; segment3 = segment3.next) {
        Intrinsics.checkNotNull(segment2.prev);
        Intrinsics.checkNotNull(segment3);
        segment2.prev.push(segment3.sharedCopy());
      } 
      buffer2.setSize$okio(buffer1.size());
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (buffer1.size() == 0L) ? buffer2 : buffer2;
  }
  
  public long readLong() throws EOFException {
    Buffer buffer1 = this;
    boolean bool1 = false;
    try {
      if (buffer1.size() < 8L)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(buffer1.head);
    Segment segment = buffer1.head;
    int i = segment.pos;
    int j = segment.limit;
    int k = buffer1.readInt();
    long l1 = 4294967295L;
    int m = 0;
    k = buffer1.readInt();
    l1 = 4294967295L;
    m = 0;
    byte[] arrayOfByte = segment.data;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    long l2 = 255L;
    boolean bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    l2 = 255L;
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    l2 = 255L;
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    l2 = 255L;
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    l2 = 255L;
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    l2 = 255L;
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    l2 = 255L;
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    l2 = 255L;
    bool2 = false;
    l1 = (m & l2) << 56L | (m & l2) << 48L | (m & l2) << 40L | (m & l2) << 32L | (m & l2) << 24L | (m & l2) << 16L | (m & l2) << 8L | m & l2;
    Buffer buffer2 = buffer1;
    try {
      buffer2.setSize$okio(buffer2.size() - 8L);
      if (i == j) {
        buffer1.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return ((j - i) < 8L) ? ((k & l1) << 32L | k & l1) : l1;
  }
  
  @NotNull
  public Buffer writeString(@NotNull String paramString, int paramInt1, int paramInt2, @NotNull Charset paramCharset) {
    long l = a ^ 0x5217285A4C07L;
    try {
      Intrinsics.checkNotNullParameter(paramString, "string");
      Intrinsics.checkNotNullParameter(paramCharset, "charset");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool1 = (paramInt1 >= 0) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str1 = Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(paramInt1));
      throw (Throwable)new IllegalArgumentException(str1.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool1 = (paramInt2 >= paramInt1) ? true : false;
    bool2 = false;
    bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str1 = "endIndex < beginIndex: " + paramInt2 + " < " + paramInt1;
      throw (Throwable)new IllegalArgumentException(str1.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool1 = (paramInt2 <= paramString.length()) ? true : false;
    bool2 = false;
    bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str1 = "endIndex > string.length: " + paramInt2 + " > " + paramString.length();
      throw (Throwable)new IllegalArgumentException(str1.toString());
    } 
    try {
      if (Intrinsics.areEqual(paramCharset, Charsets.UTF_8))
        return writeUtf8(paramString, paramInt1, paramInt2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    String str = paramString;
    bool3 = false;
    Intrinsics.checkNotNullExpressionValue(str.substring(paramInt1, paramInt2), "(this as java.lang.Strin…ing(startIndex, endIndex)");
    str = str.substring(paramInt1, paramInt2);
    bool3 = false;
    try {
      if (str == null)
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(str.getBytes(paramCharset), "(this as java.lang.String).getBytes(charset)");
    byte[] arrayOfByte = str.getBytes(paramCharset);
    return write(arrayOfByte, 0, arrayOfByte.length);
  }
  
  public void flush() {}
  
  @NotNull
  public final Buffer readFrom(@NotNull InputStream paramInputStream, long paramLong) throws IOException {
    long l = a ^ 0x34F29858BC32L;
    try {
      Intrinsics.checkNotNullParameter(paramInputStream, "input");
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool1 = (paramLong >= 0L) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    readFrom(paramInputStream, paramLong, false);
    return this;
  }
  
  @NotNull
  public Buffer writeHexadecimalUnsignedLong(long paramLong) {
    Buffer buffer1 = this;
    boolean bool1 = false;
    long l1 = paramLong;
    byte b = 48;
    boolean bool2 = false;
    long l2 = l1;
    l2 |= l2 >>> 1L;
    l2 |= l2 >>> 2L;
    l2 |= l2 >>> 4L;
    l2 |= l2 >>> 8L;
    l2 |= l2 >>> 16L;
    l2 |= l2 >>> 32L;
    l2 -= l2 >>> 1L & 0x5555555555555555L;
    l2 = (l2 >>> 2L & 0x3333333333333333L) + (l2 & 0x3333333333333333L);
    l2 = (l2 >>> 4L) + l2 & 0xF0F0F0F0F0F0F0FL;
    l2 += l2 >>> 8L;
    l2 += l2 >>> 16L;
    l2 = (l2 & 0x3FL) + (l2 >>> 32L & 0x3FL);
    int i = (int)((l2 + 3L) / 4L);
    Segment segment1 = buffer1.writableSegment$okio(i);
    byte[] arrayOfByte = segment1.data;
    int j = segment1.limit + i - 1;
    int k = segment1.limit;
    while (j >= k) {
      arrayOfByte[j] = _BufferKt.getHEX_DIGIT_BYTES()[(int)(l1 & 0xFL)];
      l1 >>>= 4L;
      int m = j;
      j = m + -1;
    } 
    Segment segment2 = segment1;
    segment2.limit += i;
    Buffer buffer2 = buffer1;
    buffer2.setSize$okio(buffer2.size() + i);
    return (l1 == 0L) ? buffer1.writeByte(b) : buffer1;
  }
  
  @NotNull
  public String readString(long paramLong, @NotNull Charset paramCharset) throws EOFException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 93435296723927
    //   6: lxor
    //   7: lstore #4
    //   9: aload_3
    //   10: ldc_w 'charset'
    //   13: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   16: lload_1
    //   17: lconst_0
    //   18: lcmp
    //   19: iflt -> 45
    //   22: lload_1
    //   23: ldc2_w 2147483647
    //   26: lcmp
    //   27: ifgt -> 45
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iconst_1
    //   38: goto -> 46
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: iconst_0
    //   46: istore #6
    //   48: iconst_0
    //   49: istore #7
    //   51: iconst_0
    //   52: istore #8
    //   54: iload #6
    //   56: ifne -> 90
    //   59: iconst_0
    //   60: istore #9
    //   62: ldc_w 'byteCount: '
    //   65: lload_1
    //   66: invokestatic valueOf : (J)Ljava/lang/Long;
    //   69: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   72: astore #8
    //   74: new java/lang/IllegalArgumentException
    //   77: dup
    //   78: aload #8
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: invokespecial <init> : (Ljava/lang/String;)V
    //   86: checkcast java/lang/Throwable
    //   89: athrow
    //   90: aload_0
    //   91: getfield size : J
    //   94: lload_1
    //   95: lcmp
    //   96: ifge -> 111
    //   99: new java/io/EOFException
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: athrow
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: lload_1
    //   112: lconst_0
    //   113: lcmp
    //   114: ifne -> 125
    //   117: ldc_w ''
    //   120: areturn
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload_0
    //   126: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   129: dup
    //   130: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   133: astore #6
    //   135: aload #6
    //   137: getfield pos : I
    //   140: i2l
    //   141: lload_1
    //   142: ladd
    //   143: aload #6
    //   145: getfield limit : I
    //   148: i2l
    //   149: lcmp
    //   150: ifle -> 174
    //   153: aload_0
    //   154: lload_1
    //   155: invokevirtual readByteArray : (J)[B
    //   158: astore #7
    //   160: iconst_0
    //   161: istore #8
    //   163: new java/lang/String
    //   166: dup
    //   167: aload #7
    //   169: aload_3
    //   170: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   173: areturn
    //   174: aload #6
    //   176: getfield data : [B
    //   179: astore #8
    //   181: aload #6
    //   183: getfield pos : I
    //   186: istore #9
    //   188: lload_1
    //   189: l2i
    //   190: istore #10
    //   192: iconst_0
    //   193: istore #11
    //   195: new java/lang/String
    //   198: dup
    //   199: aload #8
    //   201: iload #9
    //   203: iload #10
    //   205: aload_3
    //   206: invokespecial <init> : ([BIILjava/nio/charset/Charset;)V
    //   209: astore #7
    //   211: aload #6
    //   213: astore #8
    //   215: aload #8
    //   217: aload #8
    //   219: getfield pos : I
    //   222: lload_1
    //   223: l2i
    //   224: iadd
    //   225: putfield pos : I
    //   228: aload_0
    //   229: astore #8
    //   231: aload #8
    //   233: aload #8
    //   235: getfield size : J
    //   238: lload_1
    //   239: lsub
    //   240: putfield size : J
    //   243: aload #6
    //   245: getfield pos : I
    //   248: aload #6
    //   250: getfield limit : I
    //   253: if_icmpne -> 277
    //   256: aload_0
    //   257: aload #6
    //   259: invokevirtual pop : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   262: putfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   265: aload #6
    //   267: invokestatic recycle : (Lme/rerere/matrix/thirdparty/okio/Segment;)V
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: aload #7
    //   279: areturn
    // Exception table:
    //   from	to	target	type
    //   9	30	33	java/io/EOFException
    //   22	41	41	java/io/EOFException
    //   90	107	107	java/io/EOFException
    //   111	121	121	java/io/EOFException
    //   231	270	273	java/io/EOFException
  }
  
  @NotNull
  public Buffer write(@NotNull ByteString paramByteString) {
    long l = a ^ 0x740357CAB861L;
    Intrinsics.checkNotNullParameter(paramByteString, "byteString");
    Buffer buffer = this;
    boolean bool1 = false;
    int i = paramByteString.size();
    boolean bool2 = false;
    paramByteString.write$okio(buffer, bool1, i);
    return buffer;
  }
  
  @NotNull
  public Buffer writeShort(int paramInt) {
    Buffer buffer1 = this;
    boolean bool = false;
    Segment segment = buffer1.writableSegment$okio(2);
    byte[] arrayOfByte = segment.data;
    int i = segment.limit;
    int j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt >>> 8 & 0xFF);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt & 0xFF);
    segment.limit = i;
    Buffer buffer2 = buffer1;
    buffer2.setSize$okio(buffer2.size() + 2L);
    return buffer1;
  }
  
  public void readFully(@NotNull byte[] paramArrayOfbyte) throws EOFException {
    long l = a ^ 0x4A93E27558AFL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    Buffer buffer = this;
    boolean bool = false;
    int i;
    for (i = 0; i < paramArrayOfbyte.length; i += j) {
      int j = buffer.read(paramArrayOfbyte, i, paramArrayOfbyte.length - i);
      try {
        if (j == -1)
          throw new EOFException(); 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
    } 
  }
  
  public final byte getByte(long paramLong) {
    Buffer buffer1 = this;
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(buffer1.size(), paramLong, 1L);
    Buffer buffer2 = buffer1;
    boolean bool2 = false;
    Segment segment1 = buffer2.head;
    long l = -1L;
    Segment segment2 = (Segment)null;
    boolean bool3 = false;
    Intrinsics.checkNotNull(segment2);
    Segment segment3 = segment1;
    if (buffer2.size() - paramLong < paramLong) {
      long l1;
      for (l1 = buffer2.size(); l1 > paramLong; l1 -= (segment3.limit - segment3.pos)) {
        Intrinsics.checkNotNull(segment3.prev);
        segment3 = segment3.prev;
      } 
      long l2 = l1;
      Segment segment = segment3;
      boolean bool = false;
      Intrinsics.checkNotNull(segment);
    } else {
      for (long l1 = 0L;; l1 = l) {
        l = l1 + (segment3.limit - segment3.pos);
        try {
          if (l > paramLong) {
            long l2 = l1;
            Segment segment = segment3;
            boolean bool = false;
            Intrinsics.checkNotNull(segment);
            return segment.data[(int)(segment.pos + paramLong - l2)];
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Intrinsics.checkNotNull(segment3.next);
        segment3 = segment3.next;
      } 
    } 
    return (segment1 == null) ? segment2.data[(int)(segment2.pos + paramLong - l)] : "JD-Core does not support Kotlin";
  }
  
  public int hashCode() {
    // Byte code:
    //   0: aload_0
    //   1: astore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_1
    //   5: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   8: astore_3
    //   9: aload_3
    //   10: ifnonnull -> 21
    //   13: iconst_0
    //   14: goto -> 95
    //   17: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: aload_3
    //   22: astore #4
    //   24: iconst_1
    //   25: istore_3
    //   26: aload #4
    //   28: getfield pos : I
    //   31: istore #5
    //   33: aload #4
    //   35: getfield limit : I
    //   38: istore #6
    //   40: iload #5
    //   42: iload #6
    //   44: if_icmpge -> 74
    //   47: bipush #31
    //   49: iload_3
    //   50: imul
    //   51: aload #4
    //   53: getfield data : [B
    //   56: iload #5
    //   58: baload
    //   59: iadd
    //   60: istore_3
    //   61: iload #5
    //   63: istore #7
    //   65: iload #7
    //   67: iconst_1
    //   68: iadd
    //   69: istore #5
    //   71: goto -> 40
    //   74: aload #4
    //   76: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   79: dup
    //   80: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   83: astore #4
    //   85: aload #4
    //   87: aload_1
    //   88: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   91: if_acmpne -> 26
    //   94: iload_3
    //   95: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	17	17	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public byte[] readByteArray(long paramLong) throws EOFException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 124036030152263
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: lload_1
    //   15: lconst_0
    //   16: lcmp
    //   17: iflt -> 43
    //   20: lload_1
    //   21: ldc2_w 2147483647
    //   24: lcmp
    //   25: ifgt -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: iconst_0
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #8
    //   49: iconst_0
    //   50: istore #9
    //   52: iload #7
    //   54: ifne -> 88
    //   57: iconst_0
    //   58: istore #10
    //   60: ldc_w 'byteCount: '
    //   63: lload_1
    //   64: invokestatic valueOf : (J)Ljava/lang/Long;
    //   67: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   70: astore #9
    //   72: new java/lang/IllegalArgumentException
    //   75: dup
    //   76: aload #9
    //   78: invokevirtual toString : ()Ljava/lang/String;
    //   81: invokespecial <init> : (Ljava/lang/String;)V
    //   84: checkcast java/lang/Throwable
    //   87: athrow
    //   88: aload #5
    //   90: invokevirtual size : ()J
    //   93: lload_1
    //   94: lcmp
    //   95: ifge -> 110
    //   98: new java/io/EOFException
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: athrow
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: lload_1
    //   111: l2i
    //   112: newarray byte
    //   114: astore #7
    //   116: aload #5
    //   118: aload #7
    //   120: invokevirtual readFully : ([B)V
    //   123: aload #7
    //   125: areturn
    // Exception table:
    //   from	to	target	type
    //   14	28	31	java/io/EOFException
    //   20	39	39	java/io/EOFException
    //   88	106	106	java/io/EOFException
  }
  
  @NotNull
  public final Buffer copyTo(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x605F3450751DL;
    Intrinsics.checkNotNullParameter(paramBuffer, "out");
    return copyTo(paramBuffer, paramLong, this.size - paramLong);
  }
  
  @NotNull
  public ByteString readByteString(long paramLong) throws EOFException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 41632569214692
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: lload_1
    //   15: lconst_0
    //   16: lcmp
    //   17: iflt -> 43
    //   20: lload_1
    //   21: ldc2_w 2147483647
    //   24: lcmp
    //   25: ifgt -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: iconst_0
    //   44: istore #7
    //   46: iconst_0
    //   47: istore #8
    //   49: iconst_0
    //   50: istore #9
    //   52: iload #7
    //   54: ifne -> 88
    //   57: iconst_0
    //   58: istore #10
    //   60: ldc_w 'byteCount: '
    //   63: lload_1
    //   64: invokestatic valueOf : (J)Ljava/lang/Long;
    //   67: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   70: astore #9
    //   72: new java/lang/IllegalArgumentException
    //   75: dup
    //   76: aload #9
    //   78: invokevirtual toString : ()Ljava/lang/String;
    //   81: invokespecial <init> : (Ljava/lang/String;)V
    //   84: checkcast java/lang/Throwable
    //   87: athrow
    //   88: aload #5
    //   90: invokevirtual size : ()J
    //   93: lload_1
    //   94: lcmp
    //   95: ifge -> 110
    //   98: new java/io/EOFException
    //   101: dup
    //   102: invokespecial <init> : ()V
    //   105: athrow
    //   106: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   109: athrow
    //   110: lload_1
    //   111: ldc2_w 4096
    //   114: lcmp
    //   115: iflt -> 151
    //   118: aload #5
    //   120: lload_1
    //   121: l2i
    //   122: invokevirtual snapshot : (I)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   125: astore #7
    //   127: iconst_0
    //   128: istore #8
    //   130: iconst_0
    //   131: istore #9
    //   133: aload #7
    //   135: astore #10
    //   137: iconst_0
    //   138: istore #11
    //   140: aload #5
    //   142: lload_1
    //   143: invokevirtual skip : (J)V
    //   146: aload #7
    //   148: goto -> 164
    //   151: new me/rerere/matrix/thirdparty/okio/ByteString
    //   154: dup
    //   155: aload #5
    //   157: lload_1
    //   158: invokevirtual readByteArray : (J)[B
    //   161: invokespecial <init> : ([B)V
    //   164: areturn
    // Exception table:
    //   from	to	target	type
    //   14	28	31	java/io/EOFException
    //   20	39	39	java/io/EOFException
    //   88	106	106	java/io/EOFException
  }
  
  public boolean rangeEquals(long paramLong, @NotNull ByteString paramByteString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 95233654717468
    //   6: lxor
    //   7: lstore #6
    //   9: aload_3
    //   10: ldc 'bytes'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #8
    //   18: iconst_0
    //   19: istore #9
    //   21: lload_1
    //   22: lconst_0
    //   23: lcmp
    //   24: iflt -> 91
    //   27: iload #4
    //   29: iflt -> 91
    //   32: goto -> 39
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: iload #5
    //   41: iflt -> 91
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: aload #8
    //   53: invokevirtual size : ()J
    //   56: lload_1
    //   57: lsub
    //   58: iload #5
    //   60: i2l
    //   61: lcmp
    //   62: iflt -> 91
    //   65: goto -> 72
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_3
    //   73: invokevirtual size : ()I
    //   76: iload #4
    //   78: isub
    //   79: iload #5
    //   81: if_icmpge -> 99
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: iconst_0
    //   92: goto -> 150
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: iconst_0
    //   100: istore #10
    //   102: iload #10
    //   104: iload #5
    //   106: if_icmpge -> 149
    //   109: iload #10
    //   111: istore #11
    //   113: iinc #10, 1
    //   116: aload #8
    //   118: lload_1
    //   119: iload #11
    //   121: i2l
    //   122: ladd
    //   123: invokevirtual getByte : (J)B
    //   126: aload_3
    //   127: iload #4
    //   129: iload #11
    //   131: iadd
    //   132: invokevirtual getByte : (I)B
    //   135: if_icmpeq -> 142
    //   138: iconst_0
    //   139: goto -> 150
    //   142: iload #10
    //   144: iload #5
    //   146: if_icmplt -> 109
    //   149: iconst_1
    //   150: ireturn
    // Exception table:
    //   from	to	target	type
    //   21	32	35	java/lang/IllegalArgumentException
    //   27	44	47	java/lang/IllegalArgumentException
    //   39	65	68	java/lang/IllegalArgumentException
    //   51	84	87	java/lang/IllegalArgumentException
    //   72	95	95	java/lang/IllegalArgumentException
  }
  
  public long indexOf(byte paramByte, long paramLong) {
    return indexOf(paramByte, paramLong, Long.MAX_VALUE);
  }
  
  @NotNull
  public Buffer writeIntLe(int paramInt) {
    return writeInt(_UtilKt.reverseBytes(paramInt));
  }
  
  @NotNull
  public final ByteString hmacSha512(@NotNull ByteString paramByteString) {
    long l = a ^ 0x280E3754A72CL;
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return hmac("HmacSHA512", paramByteString);
  }
  
  @NotNull
  public final ByteString sha1() {
    long l = a ^ 0x6268B764E59AL;
    return digest("SHA-1");
  }
  
  public int select(@NotNull Options paramOptions) {
    long l = a ^ 0x5024F40E3180L;
    Intrinsics.checkNotNullParameter(paramOptions, "options");
    Buffer buffer = this;
    boolean bool = false;
    int i = _BufferKt.selectPrefix$default(buffer, paramOptions, false, 2, null);
    try {
      int j = paramOptions.getByteStrings$okio()[i].size();
      buffer.skip(j);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i == -1) ? -1 : i;
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer$UnsafeCursor readAndWriteUnsafe() {
    return readAndWriteUnsafe$default(this, null, 1, null);
  }
  
  @NotNull
  public final ByteString hmacSha256(@NotNull ByteString paramByteString) {
    long l = a ^ 0x651F4248D4D4L;
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return hmac("HmacSHA256", paramByteString);
  }
  
  public short readShortLe() throws EOFException {
    return _UtilKt.reverseBytes(readShort());
  }
  
  @NotNull
  public final ByteString md5() {
    long l = a ^ 0x32E11BE4FE1BL;
    return digest("MD5");
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer copyTo(@NotNull OutputStream paramOutputStream, long paramLong1, long paramLong2) throws IOException {
    long l1 = a ^ 0x5F966E124D4L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    long l2 = paramLong1;
    long l3 = paramLong2;
    try {
      _UtilKt.checkOffsetAndCount(this.size, l2, l3);
      if (l3 == 0L)
        return this; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Segment segment = this.head;
    Intrinsics.checkNotNull(segment);
    while (l2 >= (segment.limit - segment.pos)) {
      l2 -= (segment.limit - segment.pos);
      segment = segment.next;
    } 
    while (l3 > 0L) {
      Intrinsics.checkNotNull(segment);
      int i = (int)(segment.pos + l2);
      int k = segment.limit - i;
      boolean bool1 = false;
      long l = k;
      boolean bool2 = false;
      int j = (int)Math.min(l, l3);
      paramOutputStream.write(segment.data, i, j);
      l3 -= j;
      l2 = 0L;
      segment = segment.next;
    } 
    return this;
  }
  
  @NotNull
  public final Buffer copyTo(@NotNull Buffer paramBuffer, long paramLong1, long paramLong2) {
    long l1 = a ^ 0x462274E548B9L;
    Intrinsics.checkNotNullParameter(paramBuffer, "out");
    Buffer buffer = this;
    boolean bool = false;
    long l2 = paramLong1;
    long l3 = paramLong2;
    try {
      _UtilKt.checkOffsetAndCount(buffer.size(), l2, l3);
      Buffer buffer1 = paramBuffer;
      buffer1.setSize$okio(buffer1.size() + l3);
      Segment segment = buffer.head;
      Intrinsics.checkNotNull(segment);
      while (l2 >= (segment.limit - segment.pos)) {
        l2 -= (segment.limit - segment.pos);
        segment = segment.next;
      } 
      while (l3 > 0L) {
        Intrinsics.checkNotNull(segment);
        Segment segment1 = segment.sharedCopy();
        Segment segment2 = segment1;
        segment2.pos += (int)l2;
        int i = segment1.pos + (int)l3;
        int j = segment1.limit;
        boolean bool1 = false;
        try {
          segment1.limit = Math.min(i, j);
          if (paramBuffer.head == null) {
            segment1.prev = segment1;
            segment1.next = segment1.prev;
            paramBuffer.head = segment1.next;
          } else {
            Intrinsics.checkNotNull(paramBuffer.head);
            Intrinsics.checkNotNull(paramBuffer.head.prev);
            paramBuffer.head.prev.push(segment1);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        l3 -= (segment1.limit - segment1.pos);
        l2 = 0L;
        segment = segment.next;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (l3 == 0L) ? buffer : buffer;
  }
  
  public long indexOf(@NotNull ByteString paramByteString) throws IOException {
    long l = a ^ 0x4F4473F33B03L;
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    return indexOf(paramByteString, 0L);
  }
  
  @NotNull
  public Buffer writeInt(int paramInt) {
    Buffer buffer1 = this;
    boolean bool = false;
    Segment segment = buffer1.writableSegment$okio(4);
    byte[] arrayOfByte = segment.data;
    int i = segment.limit;
    int j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt >>> 24 & 0xFF);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt >>> 16 & 0xFF);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt >>> 8 & 0xFF);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt & 0xFF);
    segment.limit = i;
    Buffer buffer2 = buffer1;
    buffer2.setSize$okio(buffer2.size() + 4L);
    return buffer1;
  }
  
  @NotNull
  public final Buffer readFrom(@NotNull InputStream paramInputStream) throws IOException {
    long l = a ^ 0x39F1236C30DDL;
    Intrinsics.checkNotNullParameter(paramInputStream, "input");
    readFrom(paramInputStream, Long.MAX_VALUE, true);
    return this;
  }
  
  public long readLongLe() throws EOFException {
    return _UtilKt.reverseBytes(readLong());
  }
  
  public long readAll(@NotNull Sink paramSink) throws IOException {
    long l1 = a ^ 0x528837BE691FL;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    Buffer buffer = this;
    boolean bool = false;
    long l2 = buffer.size();
    try {
      if (l2 > 0L)
        paramSink.write(buffer, l2); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return l2;
  }
  
  public long indexOf(byte paramByte) {
    return indexOf(paramByte, 0L, Long.MAX_VALUE);
  }
  
  @NotNull
  public BufferedSource peek() {
    return Okio.buffer(new PeekSource(this));
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer$UnsafeCursor readAndWriteUnsafe(@NotNull Buffer$UnsafeCursor paramBuffer$UnsafeCursor) {
    long l = a ^ 0x38B41A49DB05L;
    Intrinsics.checkNotNullParameter(paramBuffer$UnsafeCursor, "unsafeCursor");
    return _BufferKt.commonReadAndWriteUnsafe(this, paramBuffer$UnsafeCursor);
  }
  
  public int write(@NotNull ByteBuffer paramByteBuffer) throws IOException {
    long l = a ^ 0x42B8AB37B2F2L;
    Intrinsics.checkNotNullParameter(paramByteBuffer, "source");
    int i = paramByteBuffer.remaining();
    int j = i;
    while (j > 0) {
      Segment segment1 = writableSegment$okio(1);
      int m = 8192 - segment1.limit;
      boolean bool = false;
      int k = Math.min(j, m);
      paramByteBuffer.get(segment1.data, segment1.limit, k);
      j -= k;
      Segment segment2 = segment1;
      segment2.limit += k;
    } 
    Buffer buffer = this;
    buffer.size += i;
    return i;
  }
  
  @NotNull
  public Buffer write(@NotNull ByteString paramByteString, int paramInt1, int paramInt2) {
    long l = a ^ 0x3C9F28B94DA6L;
    Intrinsics.checkNotNullParameter(paramByteString, "byteString");
    Buffer buffer = this;
    boolean bool = false;
    paramByteString.write$okio(buffer, paramInt1, paramInt2);
    return buffer;
  }
  
  @NotNull
  public String readUtf8(long paramLong) throws EOFException {
    return readString(paramLong, Charsets.UTF_8);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}), level = DeprecationLevel.ERROR)
  public final long -deprecated_size() {
    return this.size;
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer$UnsafeCursor readUnsafe(@NotNull Buffer$UnsafeCursor paramBuffer$UnsafeCursor) {
    long l = a ^ 0x70B4051BE352L;
    Intrinsics.checkNotNullParameter(paramBuffer$UnsafeCursor, "unsafeCursor");
    return _BufferKt.commonReadUnsafe(this, paramBuffer$UnsafeCursor);
  }
  
  @NotNull
  public Buffer buffer() {
    return this;
  }
  
  public boolean request(long paramLong) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.size >= paramLong);
  }
  
  public int readInt() throws EOFException {
    Buffer buffer1 = this;
    boolean bool1 = false;
    try {
      if (buffer1.size() < 4L)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(buffer1.head);
    Segment segment = buffer1.head;
    int i = segment.pos;
    int j = segment.limit;
    byte b = buffer1.readByte();
    int k = 255;
    int m = 0;
    b = buffer1.readByte();
    k = 255;
    m = 0;
    b = buffer1.readByte();
    k = 255;
    m = 0;
    b = buffer1.readByte();
    k = 255;
    m = 0;
    byte[] arrayOfByte = segment.data;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    char c = 'ÿ';
    boolean bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    c = 'ÿ';
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    c = 'ÿ';
    bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    c = 'ÿ';
    bool2 = false;
    k = (m & c) << 24 | (m & c) << 16 | (m & c) << 8 | m & c;
    Buffer buffer2 = buffer1;
    try {
      buffer2.setSize$okio(buffer2.size() - 4L);
      if (i == j) {
        buffer1.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return ((j - i) < 4L) ? ((b & k) << 24 | (b & k) << 16 | (b & k) << 8 | b & k) : k;
  }
  
  public long indexOf(byte paramByte, long paramLong1, long paramLong2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 140657100680439
    //   6: lxor
    //   7: lstore #6
    //   9: aload_0
    //   10: astore #8
    //   12: iconst_0
    //   13: istore #9
    //   15: lconst_0
    //   16: lstore #51
    //   18: lload_2
    //   19: lstore #51
    //   21: lconst_0
    //   22: lstore #53
    //   24: lload #4
    //   26: lstore #53
    //   28: lconst_0
    //   29: lload #51
    //   31: lcmp
    //   32: ifgt -> 62
    //   35: lload #51
    //   37: lload #53
    //   39: lcmp
    //   40: ifgt -> 58
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: iconst_1
    //   51: goto -> 63
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: iconst_0
    //   59: goto -> 63
    //   62: iconst_0
    //   63: istore #10
    //   65: iconst_0
    //   66: istore #11
    //   68: iconst_0
    //   69: istore #12
    //   71: iload #10
    //   73: ifne -> 143
    //   76: iconst_0
    //   77: istore #13
    //   79: new java/lang/StringBuilder
    //   82: dup
    //   83: invokespecial <init> : ()V
    //   86: ldc_w 'size='
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: aload #8
    //   94: invokevirtual size : ()J
    //   97: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   100: ldc_w ' fromIndex='
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: lload #51
    //   108: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   111: ldc_w ' toIndex='
    //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: lload #53
    //   119: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   122: invokevirtual toString : ()Ljava/lang/String;
    //   125: astore #12
    //   127: new java/lang/IllegalArgumentException
    //   130: dup
    //   131: aload #12
    //   133: invokevirtual toString : ()Ljava/lang/String;
    //   136: invokespecial <init> : (Ljava/lang/String;)V
    //   139: checkcast java/lang/Throwable
    //   142: athrow
    //   143: lload #53
    //   145: aload #8
    //   147: invokevirtual size : ()J
    //   150: lcmp
    //   151: ifle -> 161
    //   154: aload #8
    //   156: invokevirtual size : ()J
    //   159: lstore #53
    //   161: lload #51
    //   163: lload #53
    //   165: lcmp
    //   166: ifne -> 179
    //   169: ldc2_w -1
    //   172: goto -> 739
    //   175: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   178: athrow
    //   179: aload #8
    //   181: astore #10
    //   183: lload #51
    //   185: lstore #14
    //   187: iconst_0
    //   188: istore #13
    //   190: aload #10
    //   192: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   195: astore #16
    //   197: aload #16
    //   199: ifnonnull -> 226
    //   202: aconst_null
    //   203: ldc2_w -1
    //   206: lstore #17
    //   208: checkcast me/rerere/matrix/thirdparty/okio/Segment
    //   211: astore #19
    //   213: iconst_0
    //   214: istore #20
    //   216: aload #19
    //   218: astore #21
    //   220: ldc2_w -1
    //   223: goto -> 739
    //   226: aload #16
    //   228: astore #34
    //   230: aload #10
    //   232: invokevirtual size : ()J
    //   235: lload #14
    //   237: lsub
    //   238: lload #14
    //   240: lcmp
    //   241: ifge -> 489
    //   244: aload #10
    //   246: invokevirtual size : ()J
    //   249: lstore #35
    //   251: lload #35
    //   253: lload #14
    //   255: lcmp
    //   256: ifle -> 290
    //   259: aload #34
    //   261: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   264: dup
    //   265: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   268: astore #34
    //   270: lload #35
    //   272: aload #34
    //   274: getfield limit : I
    //   277: aload #34
    //   279: getfield pos : I
    //   282: isub
    //   283: i2l
    //   284: lsub
    //   285: lstore #35
    //   287: goto -> 251
    //   290: aload #34
    //   292: lload #35
    //   294: lstore #17
    //   296: astore #19
    //   298: iconst_0
    //   299: istore #20
    //   301: aload #19
    //   303: astore #21
    //   305: aload #21
    //   307: ifnonnull -> 320
    //   310: ldc2_w -1
    //   313: goto -> 739
    //   316: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   319: athrow
    //   320: aload #21
    //   322: astore #22
    //   324: lload #17
    //   326: lstore #23
    //   328: lload #23
    //   330: lload #53
    //   332: lcmp
    //   333: ifge -> 483
    //   336: aload #22
    //   338: getfield data : [B
    //   341: astore #25
    //   343: aload #22
    //   345: getfield limit : I
    //   348: i2l
    //   349: lstore #26
    //   351: aload #22
    //   353: getfield pos : I
    //   356: i2l
    //   357: lload #53
    //   359: ladd
    //   360: lload #23
    //   362: lsub
    //   363: lstore #28
    //   365: iconst_0
    //   366: istore #30
    //   368: lload #26
    //   370: lload #28
    //   372: invokestatic min : (JJ)J
    //   375: l2i
    //   376: istore #31
    //   378: aload #22
    //   380: getfield pos : I
    //   383: i2l
    //   384: lload #51
    //   386: ladd
    //   387: lload #23
    //   389: lsub
    //   390: l2i
    //   391: istore #32
    //   393: iload #32
    //   395: iload #31
    //   397: if_icmpge -> 448
    //   400: aload #25
    //   402: iload #32
    //   404: baload
    //   405: iload_1
    //   406: if_icmpne -> 435
    //   409: goto -> 416
    //   412: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   415: athrow
    //   416: iload #32
    //   418: aload #22
    //   420: getfield pos : I
    //   423: isub
    //   424: i2l
    //   425: lload #23
    //   427: ladd
    //   428: goto -> 739
    //   431: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   434: athrow
    //   435: iload #32
    //   437: istore #33
    //   439: iload #33
    //   441: iconst_1
    //   442: iadd
    //   443: istore #32
    //   445: goto -> 393
    //   448: lload #23
    //   450: aload #22
    //   452: getfield limit : I
    //   455: aload #22
    //   457: getfield pos : I
    //   460: isub
    //   461: i2l
    //   462: ladd
    //   463: lstore #23
    //   465: lload #23
    //   467: lstore #51
    //   469: aload #22
    //   471: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   474: dup
    //   475: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   478: astore #22
    //   480: goto -> 328
    //   483: ldc2_w -1
    //   486: goto -> 739
    //   489: lconst_0
    //   490: lstore #35
    //   492: nop
    //   493: lload #35
    //   495: aload #34
    //   497: getfield limit : I
    //   500: aload #34
    //   502: getfield pos : I
    //   505: isub
    //   506: i2l
    //   507: ladd
    //   508: lstore #37
    //   510: lload #37
    //   512: lload #14
    //   514: lcmp
    //   515: ifle -> 525
    //   518: goto -> 543
    //   521: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   524: athrow
    //   525: aload #34
    //   527: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   530: dup
    //   531: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   534: astore #34
    //   536: lload #37
    //   538: lstore #35
    //   540: goto -> 492
    //   543: aload #34
    //   545: lload #35
    //   547: lstore #39
    //   549: astore #41
    //   551: iconst_0
    //   552: istore #22
    //   554: aload #41
    //   556: astore #42
    //   558: aload #42
    //   560: ifnonnull -> 573
    //   563: ldc2_w -1
    //   566: goto -> 739
    //   569: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   572: athrow
    //   573: aload #42
    //   575: astore #43
    //   577: lload #39
    //   579: lstore #44
    //   581: lload #44
    //   583: lload #53
    //   585: lcmp
    //   586: ifge -> 736
    //   589: aload #43
    //   591: getfield data : [B
    //   594: astore #46
    //   596: aload #43
    //   598: getfield limit : I
    //   601: i2l
    //   602: lstore #28
    //   604: aload #43
    //   606: getfield pos : I
    //   609: i2l
    //   610: lload #53
    //   612: ladd
    //   613: lload #44
    //   615: lsub
    //   616: lstore #47
    //   618: iconst_0
    //   619: istore #32
    //   621: lload #28
    //   623: lload #47
    //   625: invokestatic min : (JJ)J
    //   628: l2i
    //   629: istore #33
    //   631: aload #43
    //   633: getfield pos : I
    //   636: i2l
    //   637: lload #51
    //   639: ladd
    //   640: lload #44
    //   642: lsub
    //   643: l2i
    //   644: istore #49
    //   646: iload #49
    //   648: iload #33
    //   650: if_icmpge -> 701
    //   653: aload #46
    //   655: iload #49
    //   657: baload
    //   658: iload_1
    //   659: if_icmpne -> 688
    //   662: goto -> 669
    //   665: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   668: athrow
    //   669: iload #49
    //   671: aload #43
    //   673: getfield pos : I
    //   676: isub
    //   677: i2l
    //   678: lload #44
    //   680: ladd
    //   681: goto -> 739
    //   684: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   687: athrow
    //   688: iload #49
    //   690: istore #50
    //   692: iload #50
    //   694: iconst_1
    //   695: iadd
    //   696: istore #49
    //   698: goto -> 646
    //   701: lload #44
    //   703: aload #43
    //   705: getfield limit : I
    //   708: aload #43
    //   710: getfield pos : I
    //   713: isub
    //   714: i2l
    //   715: ladd
    //   716: lstore #44
    //   718: lload #44
    //   720: lstore #51
    //   722: aload #43
    //   724: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   727: dup
    //   728: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   731: astore #43
    //   733: goto -> 581
    //   736: ldc2_w -1
    //   739: lreturn
    // Exception table:
    //   from	to	target	type
    //   28	43	46	java/lang/IllegalArgumentException
    //   35	54	54	java/lang/IllegalArgumentException
    //   161	175	175	java/lang/IllegalArgumentException
    //   305	316	316	java/lang/IllegalArgumentException
    //   393	409	412	java/lang/IllegalArgumentException
    //   400	431	431	java/lang/IllegalArgumentException
    //   510	521	521	java/lang/IllegalArgumentException
    //   558	569	569	java/lang/IllegalArgumentException
    //   646	662	665	java/lang/IllegalArgumentException
    //   653	684	684	java/lang/IllegalArgumentException
  }
  
  public int read(@NotNull ByteBuffer paramByteBuffer) throws IOException {
    long l = a ^ 0x27CAE129C1BCL;
    Intrinsics.checkNotNullParameter(paramByteBuffer, "sink");
    Segment segment2 = this.head;
    try {
      if (segment2 == null)
        return -1; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Segment segment1 = segment2;
    int j = paramByteBuffer.remaining();
    int k = segment1.limit - segment1.pos;
    boolean bool = false;
    int i = Math.min(j, k);
    paramByteBuffer.put(segment1.data, segment1.pos, i);
    Segment segment3 = segment1;
    segment3.pos += i;
    Buffer buffer = this;
    try {
      buffer.size -= i;
      if (segment1.pos == segment1.limit) {
        this.head = segment1.pop();
        SegmentPool.recycle(segment1);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return i;
  }
  
  @NotNull
  public String readUtf8LineStrict(long paramLong) throws EOFException {
    long l1 = a ^ 0x1A9BFEB63E3DL;
    Buffer buffer = this;
    boolean bool1 = false;
    try {
    
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    boolean bool2 = (paramLong >= 0L) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("limit < 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    long l2 = (paramLong == Long.MAX_VALUE) ? Long.MAX_VALUE : (paramLong + 1L);
    byte b1 = 10;
    byte b2 = 0;
    long l3 = buffer.indexOf((byte)b1, 0L, l2);
    try {
      b1 = 13;
      b2 = 0;
      if (l2 < buffer.size() && buffer.getByte(l2 - 1L) == (byte)b1) {
        b1 = 10;
        b2 = 0;
        try {
          if (buffer.getByte(l2) == (byte)b1) {
          
          } else {
            Buffer buffer1 = new Buffer();
            b2 = 32;
            long l4 = buffer.size();
            boolean bool5 = false;
            long l5 = b2;
            boolean bool6 = false;
            buffer.copyTo(buffer1, 0L, Math.min(l5, l4));
            long l6 = buffer.size();
            boolean bool7 = false;
            throw new EOFException("\\n not found: limit=" + Math.min(l6, paramLong) + " content=" + buffer1.readByteString().hex() + '…');
          } 
        } catch (EOFException eOFException) {
          throw a(null);
        } 
      } else {
        Buffer buffer1 = new Buffer();
        b2 = 32;
        long l4 = buffer.size();
        boolean bool5 = false;
        long l5 = b2;
        boolean bool6 = false;
        buffer.copyTo(buffer1, 0L, Math.min(l5, l4));
        long l6 = buffer.size();
        boolean bool7 = false;
        throw new EOFException("\\n not found: limit=" + Math.min(l6, paramLong) + " content=" + buffer1.readByteString().hex() + '…');
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return (l3 != -1L) ? _BufferKt.readUtf8Line(buffer, l3) : "JD-Core does not support Kotlin";
  }
  
  public int read(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x6438FBA9A31CL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    Buffer buffer = this;
    boolean bool = false;
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, paramInt1, paramInt2);
    Segment segment = buffer.head;
    try {
      Segment segment1 = segment;
      int j = segment1.limit - segment1.pos;
      boolean bool1 = false;
      int i = Math.min(paramInt2, j);
      ArraysKt.copyInto(segment1.data, paramArrayOfbyte, paramInt1, segment1.pos, segment1.pos + i);
      Segment segment2 = segment1;
      segment2.pos += i;
      Buffer buffer1 = buffer;
      try {
        buffer1.setSize$okio(buffer1.size() - i);
        if (segment1.pos == segment1.limit) {
          buffer.head = segment1.pop();
          SegmentPool.recycle(segment1);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (segment == null) ? -1 : i;
  }
  
  @NotNull
  public Buffer writeUtf8(@NotNull String paramString) {
    long l = a ^ 0x7564D7E458A9L;
    Intrinsics.checkNotNullParameter(paramString, "string");
    return writeUtf8(paramString, 0, paramString.length());
  }
  
  public int readIntLe() throws EOFException {
    return _UtilKt.reverseBytes(readInt());
  }
  
  @NotNull
  public Buffer writeUtf8(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0x198DCC7F3E75L;
    Intrinsics.checkNotNullParameter(paramString, "string");
    Buffer buffer = this;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = (paramInt1 >= 0) ? 1 : 0;
    int j = 0;
    char c = Character.MIN_VALUE;
    if (!i) {
      boolean bool1 = false;
      String str = Intrinsics.stringPlus("beginIndex < 0: ", Integer.valueOf(paramInt1));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    i = (paramInt2 >= paramInt1) ? 1 : 0;
    j = 0;
    c = Character.MIN_VALUE;
    if (!i) {
      boolean bool1 = false;
      String str = "endIndex < beginIndex: " + paramInt2 + " < " + paramInt1;
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    i = (paramInt2 <= paramString.length()) ? 1 : 0;
    j = 0;
    c = Character.MIN_VALUE;
    if (!i) {
      boolean bool1 = false;
      String str = "endIndex > string.length: " + paramInt2 + " > " + paramString.length();
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    for (i = paramInt1; i < paramInt2; i = k + 1) {
      c = paramString.charAt(i);
      int k = 0;
      j = c;
      if (j < 128) {
        Segment segment1 = buffer.writableSegment$okio(1);
        byte[] arrayOfByte = segment1.data;
        int m = segment1.limit - i;
        int n = 8192 - m;
        boolean bool2 = false;
        int i1 = Math.min(paramInt2, n);
        n = i;
        i = n + 1;
        arrayOfByte[m + n] = (byte)j;
        while (i < i1) {
          n = paramString.charAt(i);
          bool2 = false;
          j = n;
          try {
            if (j >= 128)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          n = i;
          i = n + 1;
          arrayOfByte[m + n] = (byte)j;
        } 
        n = i + m - segment1.limit;
        Segment segment2 = segment1;
        segment2.limit += n;
        Buffer buffer1 = buffer;
        buffer1.setSize$okio(buffer1.size() + n);
        continue;
      } 
      if (j < 2048) {
        Segment segment1 = buffer.writableSegment$okio(2);
        segment1.data[segment1.limit] = (byte)(j >> 6 | 0xC0);
        segment1.data[segment1.limit + 1] = (byte)(j & 0x3F | 0x80);
        Segment segment2 = segment1;
        segment2.limit += 2;
        Buffer buffer1 = buffer;
        buffer1.setSize$okio(buffer1.size() + 2L);
        int m = i;
        i = m + 1;
        continue;
      } 
      try {
        if (j < 55296 || j > 57343) {
          Segment segment1 = buffer.writableSegment$okio(3);
          segment1.data[segment1.limit] = (byte)(j >> 12 | 0xE0);
          segment1.data[segment1.limit + 1] = (byte)(j >> 6 & 0x3F | 0x80);
          segment1.data[segment1.limit + 2] = (byte)(j & 0x3F | 0x80);
          Segment segment2 = segment1;
          segment2.limit += 3;
          Buffer buffer1 = buffer;
          buffer1.setSize$okio(buffer1.size() + 3L);
          int m = i;
          i = m + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      k = paramString.charAt(i + 1);
      boolean bool1 = false;
      c = (i + 1 < paramInt2) ? k : Character.MIN_VALUE;
      try {
        if (j <= 56319) {
          try {
            if ('?' <= c) {
              try {
              
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } else {
            
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          if (false) {
            k = 65536 + ((j & 0x3FF) << 10 | c & 0x3FF);
            Segment segment1 = buffer.writableSegment$okio(4);
            segment1.data[segment1.limit] = (byte)(k >> 18 | 0xF0);
            segment1.data[segment1.limit + 1] = (byte)(k >> 12 & 0x3F | 0x80);
            segment1.data[segment1.limit + 2] = (byte)(k >> 6 & 0x3F | 0x80);
            segment1.data[segment1.limit + 3] = (byte)(k & 0x3F | 0x80);
            Segment segment2 = segment1;
            segment2.limit += 4;
            Buffer buffer1 = buffer;
            buffer1.setSize$okio(buffer1.size() + 4L);
            i += 2;
            continue;
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      k = 63;
      bool1 = false;
      buffer.writeByte(k);
      k = i;
    } 
    return buffer;
  }
  
  @NotNull
  public Buffer writeLongLe(long paramLong) {
    return writeLong(_UtilKt.reverseBytes(paramLong));
  }
  
  @NotNull
  public Buffer clone() {
    return copy();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aload_2
    //   5: aload_1
    //   6: if_acmpne -> 17
    //   9: iconst_1
    //   10: goto -> 297
    //   13: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   16: athrow
    //   17: aload_1
    //   18: instanceof me/rerere/matrix/thirdparty/okio/Buffer
    //   21: ifne -> 32
    //   24: iconst_0
    //   25: goto -> 297
    //   28: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   31: athrow
    //   32: aload_2
    //   33: invokevirtual size : ()J
    //   36: aload_1
    //   37: checkcast me/rerere/matrix/thirdparty/okio/Buffer
    //   40: invokevirtual size : ()J
    //   43: lcmp
    //   44: ifeq -> 55
    //   47: iconst_0
    //   48: goto -> 297
    //   51: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   54: athrow
    //   55: aload_2
    //   56: invokevirtual size : ()J
    //   59: lconst_0
    //   60: lcmp
    //   61: ifne -> 72
    //   64: iconst_1
    //   65: goto -> 297
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_2
    //   73: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   76: dup
    //   77: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   80: astore #4
    //   82: aload_1
    //   83: checkcast me/rerere/matrix/thirdparty/okio/Buffer
    //   86: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   89: dup
    //   90: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   93: astore #5
    //   95: aload #4
    //   97: getfield pos : I
    //   100: istore #6
    //   102: aload #5
    //   104: getfield pos : I
    //   107: istore #7
    //   109: lconst_0
    //   110: lstore #8
    //   112: lconst_0
    //   113: lstore #10
    //   115: lload #8
    //   117: aload_2
    //   118: invokevirtual size : ()J
    //   121: lcmp
    //   122: ifge -> 296
    //   125: aload #4
    //   127: getfield limit : I
    //   130: iload #6
    //   132: isub
    //   133: istore #12
    //   135: aload #5
    //   137: getfield limit : I
    //   140: iload #7
    //   142: isub
    //   143: istore #13
    //   145: iconst_0
    //   146: istore #14
    //   148: iload #12
    //   150: iload #13
    //   152: invokestatic min : (II)I
    //   155: i2l
    //   156: lstore #10
    //   158: lconst_0
    //   159: lstore #15
    //   161: lload #15
    //   163: lload #10
    //   165: lcmp
    //   166: ifge -> 230
    //   169: lload #15
    //   171: lstore #17
    //   173: lload #15
    //   175: lconst_1
    //   176: ladd
    //   177: lstore #15
    //   179: aload #4
    //   181: getfield data : [B
    //   184: iload #6
    //   186: istore #19
    //   188: iload #19
    //   190: iconst_1
    //   191: iadd
    //   192: istore #6
    //   194: iload #19
    //   196: baload
    //   197: aload #5
    //   199: getfield data : [B
    //   202: iload #7
    //   204: istore #19
    //   206: iload #19
    //   208: iconst_1
    //   209: iadd
    //   210: istore #7
    //   212: iload #19
    //   214: baload
    //   215: if_icmpeq -> 222
    //   218: iconst_0
    //   219: goto -> 297
    //   222: lload #15
    //   224: lload #10
    //   226: lcmp
    //   227: iflt -> 169
    //   230: iload #6
    //   232: aload #4
    //   234: getfield limit : I
    //   237: if_icmpne -> 258
    //   240: aload #4
    //   242: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   245: dup
    //   246: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   249: astore #4
    //   251: aload #4
    //   253: getfield pos : I
    //   256: istore #6
    //   258: iload #7
    //   260: aload #5
    //   262: getfield limit : I
    //   265: if_icmpne -> 286
    //   268: aload #5
    //   270: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   273: dup
    //   274: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   277: astore #5
    //   279: aload #5
    //   281: getfield pos : I
    //   284: istore #7
    //   286: lload #8
    //   288: lload #10
    //   290: ladd
    //   291: lstore #8
    //   293: goto -> 115
    //   296: iconst_1
    //   297: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	13	13	java/lang/IllegalArgumentException
    //   17	28	28	java/lang/IllegalArgumentException
    //   32	51	51	java/lang/IllegalArgumentException
    //   55	68	68	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public final Segment writableSegment$okio(int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 75394637148849
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: astore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: iload_1
    //   15: iconst_1
    //   16: if_icmplt -> 41
    //   19: iload_1
    //   20: sipush #8192
    //   23: if_icmpgt -> 41
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   32: athrow
    //   33: iconst_1
    //   34: goto -> 42
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: iconst_0
    //   42: istore #6
    //   44: iconst_0
    //   45: istore #7
    //   47: iconst_0
    //   48: istore #8
    //   50: iload #6
    //   52: ifne -> 79
    //   55: iconst_0
    //   56: istore #9
    //   58: ldc_w 'unexpected capacity'
    //   61: astore #8
    //   63: new java/lang/IllegalArgumentException
    //   66: dup
    //   67: aload #8
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: checkcast java/lang/Throwable
    //   78: athrow
    //   79: aload #4
    //   81: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   84: ifnonnull -> 118
    //   87: invokestatic take : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   90: astore #6
    //   92: aload #4
    //   94: aload #6
    //   96: putfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   99: aload #6
    //   101: aload #6
    //   103: putfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   106: aload #6
    //   108: aload #6
    //   110: putfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   113: aload #6
    //   115: goto -> 176
    //   118: aload #4
    //   120: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   123: dup
    //   124: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   127: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   130: astore #6
    //   132: aload #6
    //   134: dup
    //   135: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   138: getfield limit : I
    //   141: iload_1
    //   142: iadd
    //   143: sipush #8192
    //   146: if_icmpgt -> 164
    //   149: aload #6
    //   151: getfield owner : Z
    //   154: ifne -> 174
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   163: athrow
    //   164: aload #6
    //   166: invokestatic take : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   169: invokevirtual push : (Lme/rerere/matrix/thirdparty/okio/Segment;)Lme/rerere/matrix/thirdparty/okio/Segment;
    //   172: astore #6
    //   174: aload #6
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   14	26	29	java/lang/IllegalArgumentException
    //   19	37	37	java/lang/IllegalArgumentException
    //   132	157	160	java/lang/IllegalArgumentException
  }
  
  public final void clear() {
    Buffer buffer = this;
    boolean bool = false;
    buffer.skip(buffer.size());
  }
  
  public void close() {}
  
  public long indexOf(@NotNull ByteString paramByteString, long paramLong) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 38773814871656
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'bytes'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #6
    //   18: iconst_0
    //   19: istore #7
    //   21: lconst_0
    //   22: lstore #63
    //   24: lload_2
    //   25: lstore #63
    //   27: aload_1
    //   28: invokevirtual size : ()I
    //   31: ifle -> 42
    //   34: iconst_1
    //   35: goto -> 43
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: iconst_0
    //   43: istore #8
    //   45: iconst_0
    //   46: istore #9
    //   48: iconst_0
    //   49: istore #10
    //   51: iload #8
    //   53: ifne -> 80
    //   56: iconst_0
    //   57: istore #11
    //   59: ldc_w 'bytes is empty'
    //   62: astore #10
    //   64: new java/lang/IllegalArgumentException
    //   67: dup
    //   68: aload #10
    //   70: invokevirtual toString : ()Ljava/lang/String;
    //   73: invokespecial <init> : (Ljava/lang/String;)V
    //   76: checkcast java/lang/Throwable
    //   79: athrow
    //   80: lload #63
    //   82: lconst_0
    //   83: lcmp
    //   84: iflt -> 95
    //   87: iconst_1
    //   88: goto -> 96
    //   91: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   94: athrow
    //   95: iconst_0
    //   96: istore #8
    //   98: iconst_0
    //   99: istore #9
    //   101: iconst_0
    //   102: istore #10
    //   104: iload #8
    //   106: ifne -> 141
    //   109: iconst_0
    //   110: istore #11
    //   112: ldc_w 'fromIndex < 0: '
    //   115: lload #63
    //   117: invokestatic valueOf : (J)Ljava/lang/Long;
    //   120: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   123: astore #10
    //   125: new java/lang/IllegalArgumentException
    //   128: dup
    //   129: aload #10
    //   131: invokevirtual toString : ()Ljava/lang/String;
    //   134: invokespecial <init> : (Ljava/lang/String;)V
    //   137: checkcast java/lang/Throwable
    //   140: athrow
    //   141: aload #6
    //   143: astore #8
    //   145: lload #63
    //   147: lstore #12
    //   149: iconst_0
    //   150: istore #11
    //   152: aload #8
    //   154: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   157: astore #14
    //   159: aload #14
    //   161: ifnonnull -> 188
    //   164: aconst_null
    //   165: ldc2_w -1
    //   168: lstore #15
    //   170: checkcast me/rerere/matrix/thirdparty/okio/Segment
    //   173: astore #17
    //   175: iconst_0
    //   176: istore #18
    //   178: aload #17
    //   180: astore #19
    //   182: ldc2_w -1
    //   185: goto -> 803
    //   188: aload #14
    //   190: astore #38
    //   192: aload #8
    //   194: invokevirtual size : ()J
    //   197: lload #12
    //   199: lsub
    //   200: lload #12
    //   202: lcmp
    //   203: ifge -> 502
    //   206: aload #8
    //   208: invokevirtual size : ()J
    //   211: lstore #39
    //   213: lload #39
    //   215: lload #12
    //   217: lcmp
    //   218: ifle -> 252
    //   221: aload #38
    //   223: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   226: dup
    //   227: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   230: astore #38
    //   232: lload #39
    //   234: aload #38
    //   236: getfield limit : I
    //   239: aload #38
    //   241: getfield pos : I
    //   244: isub
    //   245: i2l
    //   246: lsub
    //   247: lstore #39
    //   249: goto -> 213
    //   252: aload #38
    //   254: lload #39
    //   256: lstore #15
    //   258: astore #17
    //   260: iconst_0
    //   261: istore #18
    //   263: aload #17
    //   265: astore #19
    //   267: aload #19
    //   269: ifnonnull -> 282
    //   272: ldc2_w -1
    //   275: goto -> 803
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: aload #19
    //   284: astore #20
    //   286: lload #15
    //   288: lstore #21
    //   290: aload_1
    //   291: invokevirtual internalArray$okio : ()[B
    //   294: astore #23
    //   296: aload #23
    //   298: iconst_0
    //   299: baload
    //   300: istore #24
    //   302: aload_1
    //   303: invokevirtual size : ()I
    //   306: istore #25
    //   308: aload #6
    //   310: invokevirtual size : ()J
    //   313: iload #25
    //   315: i2l
    //   316: lsub
    //   317: lconst_1
    //   318: ladd
    //   319: lstore #26
    //   321: lload #21
    //   323: lload #26
    //   325: lcmp
    //   326: ifge -> 496
    //   329: aload #20
    //   331: getfield data : [B
    //   334: astore #28
    //   336: aload #20
    //   338: getfield limit : I
    //   341: istore #29
    //   343: aload #20
    //   345: getfield pos : I
    //   348: i2l
    //   349: lload #26
    //   351: ladd
    //   352: lload #21
    //   354: lsub
    //   355: lstore #30
    //   357: iconst_0
    //   358: istore #32
    //   360: iload #29
    //   362: i2l
    //   363: lstore #33
    //   365: iconst_0
    //   366: istore #35
    //   368: lload #33
    //   370: lload #30
    //   372: invokestatic min : (JJ)J
    //   375: nop
    //   376: l2i
    //   377: istore #36
    //   379: aload #20
    //   381: getfield pos : I
    //   384: i2l
    //   385: lload #63
    //   387: ladd
    //   388: lload #21
    //   390: lsub
    //   391: l2i
    //   392: istore #29
    //   394: iload #29
    //   396: iload #36
    //   398: if_icmpge -> 461
    //   401: iload #29
    //   403: istore #37
    //   405: iinc #29, 1
    //   408: aload #28
    //   410: iload #37
    //   412: baload
    //   413: iload #24
    //   415: if_icmpne -> 454
    //   418: aload #20
    //   420: iload #37
    //   422: iconst_1
    //   423: iadd
    //   424: aload #23
    //   426: iconst_1
    //   427: iload #25
    //   429: invokestatic rangeEquals : (Lme/rerere/matrix/thirdparty/okio/Segment;I[BII)Z
    //   432: ifeq -> 454
    //   435: iload #37
    //   437: aload #20
    //   439: getfield pos : I
    //   442: isub
    //   443: i2l
    //   444: lload #21
    //   446: ladd
    //   447: goto -> 803
    //   450: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   453: athrow
    //   454: iload #29
    //   456: iload #36
    //   458: if_icmplt -> 401
    //   461: lload #21
    //   463: aload #20
    //   465: getfield limit : I
    //   468: aload #20
    //   470: getfield pos : I
    //   473: isub
    //   474: i2l
    //   475: ladd
    //   476: lstore #21
    //   478: lload #21
    //   480: lstore #63
    //   482: aload #20
    //   484: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   487: dup
    //   488: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   491: astore #20
    //   493: goto -> 321
    //   496: ldc2_w -1
    //   499: goto -> 803
    //   502: lconst_0
    //   503: lstore #39
    //   505: nop
    //   506: lload #39
    //   508: aload #38
    //   510: getfield limit : I
    //   513: aload #38
    //   515: getfield pos : I
    //   518: isub
    //   519: i2l
    //   520: ladd
    //   521: lstore #41
    //   523: lload #41
    //   525: lload #12
    //   527: lcmp
    //   528: ifle -> 538
    //   531: goto -> 556
    //   534: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   537: athrow
    //   538: aload #38
    //   540: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   543: dup
    //   544: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   547: astore #38
    //   549: lload #41
    //   551: lstore #39
    //   553: goto -> 505
    //   556: aload #38
    //   558: lload #39
    //   560: lstore #43
    //   562: astore #45
    //   564: iconst_0
    //   565: istore #20
    //   567: aload #45
    //   569: astore #46
    //   571: aload #46
    //   573: ifnonnull -> 586
    //   576: ldc2_w -1
    //   579: goto -> 803
    //   582: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   585: athrow
    //   586: aload #46
    //   588: astore #47
    //   590: lload #43
    //   592: lstore #48
    //   594: aload_1
    //   595: invokevirtual internalArray$okio : ()[B
    //   598: astore #25
    //   600: aload #25
    //   602: iconst_0
    //   603: baload
    //   604: istore #50
    //   606: aload_1
    //   607: invokevirtual size : ()I
    //   610: istore #51
    //   612: aload #6
    //   614: invokevirtual size : ()J
    //   617: iload #51
    //   619: i2l
    //   620: lsub
    //   621: lconst_1
    //   622: ladd
    //   623: lstore #52
    //   625: lload #48
    //   627: lload #52
    //   629: lcmp
    //   630: ifge -> 800
    //   633: aload #47
    //   635: getfield data : [B
    //   638: astore #54
    //   640: aload #47
    //   642: getfield limit : I
    //   645: istore #55
    //   647: aload #47
    //   649: getfield pos : I
    //   652: i2l
    //   653: lload #52
    //   655: ladd
    //   656: lload #48
    //   658: lsub
    //   659: lstore #56
    //   661: iconst_0
    //   662: istore #58
    //   664: iload #55
    //   666: i2l
    //   667: lstore #59
    //   669: iconst_0
    //   670: istore #37
    //   672: lload #59
    //   674: lload #56
    //   676: invokestatic min : (JJ)J
    //   679: nop
    //   680: l2i
    //   681: istore #61
    //   683: aload #47
    //   685: getfield pos : I
    //   688: i2l
    //   689: lload #63
    //   691: ladd
    //   692: lload #48
    //   694: lsub
    //   695: l2i
    //   696: istore #55
    //   698: iload #55
    //   700: iload #61
    //   702: if_icmpge -> 765
    //   705: iload #55
    //   707: istore #62
    //   709: iinc #55, 1
    //   712: aload #54
    //   714: iload #62
    //   716: baload
    //   717: iload #50
    //   719: if_icmpne -> 758
    //   722: aload #47
    //   724: iload #62
    //   726: iconst_1
    //   727: iadd
    //   728: aload #25
    //   730: iconst_1
    //   731: iload #51
    //   733: invokestatic rangeEquals : (Lme/rerere/matrix/thirdparty/okio/Segment;I[BII)Z
    //   736: ifeq -> 758
    //   739: iload #62
    //   741: aload #47
    //   743: getfield pos : I
    //   746: isub
    //   747: i2l
    //   748: lload #48
    //   750: ladd
    //   751: goto -> 803
    //   754: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   757: athrow
    //   758: iload #55
    //   760: iload #61
    //   762: if_icmplt -> 705
    //   765: lload #48
    //   767: aload #47
    //   769: getfield limit : I
    //   772: aload #47
    //   774: getfield pos : I
    //   777: isub
    //   778: i2l
    //   779: ladd
    //   780: lstore #48
    //   782: lload #48
    //   784: lstore #63
    //   786: aload #47
    //   788: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   791: dup
    //   792: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   795: astore #47
    //   797: goto -> 625
    //   800: ldc2_w -1
    //   803: lreturn
    // Exception table:
    //   from	to	target	type
    //   27	38	38	java/io/IOException
    //   80	91	91	java/io/IOException
    //   267	278	278	java/io/IOException
    //   418	450	450	java/io/IOException
    //   523	534	534	java/io/IOException
    //   571	582	582	java/io/IOException
    //   722	754	754	java/io/IOException
  }
  
  public boolean exhausted() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.size == 0L);
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer copyTo(@NotNull OutputStream paramOutputStream, long paramLong) throws IOException {
    long l = a ^ 0x23E8C8EBA356L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    return copyTo$default(this, paramOutputStream, paramLong, 0L, 4, (Object)null);
  }
  
  @NotNull
  public byte[] readByteArray() {
    Buffer buffer = this;
    boolean bool = false;
    return buffer.readByteArray(buffer.size());
  }
  
  public int readUtf8CodePoint() throws EOFException {
    long l = a ^ 0x761F2876E2CBL;
    Buffer buffer = this;
    boolean bool = false;
    try {
      if (buffer.size() == 0L)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    int i = buffer.getByte(0L);
    int j = 0;
    byte b = 0;
    int k = 0;
    int m = i;
    int n = 128;
    byte b1 = 0;
    if ((m & n) == 0) {
      m = i;
      n = 127;
      b1 = 0;
      j = m & n;
      b = 1;
      k = 0;
    } else {
      m = i;
      n = 224;
      b1 = 0;
      if ((m & n) == 192) {
        m = i;
        n = 31;
        b1 = 0;
        j = m & n;
        b = 2;
        k = 128;
      } else {
        m = i;
        n = 240;
        b1 = 0;
        if ((m & n) == 224) {
          m = i;
          n = 15;
          b1 = 0;
          j = m & n;
          b = 3;
          k = 2048;
        } else {
          m = i;
          n = 248;
          b1 = 0;
          if ((m & n) == 240) {
            m = i;
            n = 7;
            b1 = 0;
            j = m & n;
            b = 4;
            k = 65536;
          } else {
            buffer.skip(1L);
          } 
        } 
      } 
    } 
    try {
      if (buffer.size() < b)
        throw new EOFException("size < " + b + ": " + buffer.size() + " (to read code point prefixed 0x" + _UtilKt.toHexString(i) + ')'); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    m = 1;
    if (m < b)
      do {
        n = m;
        m++;
        b1 = buffer.getByte(n);
        byte b2 = b1;
        char c = 'À';
        boolean bool1 = false;
        if ((b2 & c) == 128) {
          j <<= 6;
          b2 = b1;
          c = '?';
          bool1 = false;
          j |= b2 & c;
        } else {
          buffer.skip(n);
        } 
      } while (m < b); 
    try {
      buffer.skip(b);
      try {
        if (55296 <= j) {
          try {
          
          } catch (EOFException eOFException) {
            throw a(null);
          } 
        } else {
        
        } 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
      try {
        try {
        
        } catch (EOFException eOFException) {
          throw a(null);
        } 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return (j > 1114111) ? 65533 : (false ? 65533 : ((j < k) ? 65533 : j));
  }
  
  public boolean isOpen() {
    return true;
  }
  
  public void skip(long paramLong) throws EOFException {
    Buffer buffer = this;
    boolean bool = false;
    long l = paramLong;
    while (l > 0L) {
      Segment segment1 = buffer.head;
      try {
        if (segment1 == null)
          throw new EOFException(); 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
      Segment segment2 = segment1;
      int j = segment2.limit - segment2.pos;
      boolean bool1 = false;
      long l1 = j;
      boolean bool2 = false;
      int i = (int)Math.min(l, l1);
      Buffer buffer1 = buffer;
      buffer1.setSize$okio(buffer1.size() - i);
      l -= i;
      Segment segment3 = segment2;
      segment3.pos += i;
      if (segment2.pos == segment2.limit) {
        buffer.head = segment2.pop();
        SegmentPool.recycle(segment2);
      } 
    } 
  }
  
  public final long size() {
    return this.size;
  }
  
  @NotNull
  public String toString() {
    return snapshot().toString();
  }
  
  @NotNull
  public Buffer writeLong(long paramLong) {
    Buffer buffer1 = this;
    boolean bool = false;
    Segment segment = buffer1.writableSegment$okio(8);
    byte[] arrayOfByte = segment.data;
    int i = segment.limit;
    int j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 56L & 0xFFL);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 48L & 0xFFL);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 40L & 0xFFL);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 32L & 0xFFL);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 24L & 0xFFL);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 16L & 0xFFL);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong >>> 8L & 0xFFL);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(int)(paramLong & 0xFFL);
    segment.limit = i;
    Buffer buffer2 = buffer1;
    buffer2.setSize$okio(buffer2.size() + 8L);
    return buffer1;
  }
  
  @NotNull
  public Buffer writeShortLe(int paramInt) {
    return writeShort(_UtilKt.reverseBytes((short)paramInt));
  }
  
  @NotNull
  public final ByteString snapshot(int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 122029263108442
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: astore #4
    //   11: iconst_0
    //   12: istore #5
    //   14: iload_1
    //   15: ifne -> 28
    //   18: getstatic me/rerere/matrix/thirdparty/okio/ByteString.EMPTY : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   21: goto -> 268
    //   24: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload #4
    //   30: invokevirtual size : ()J
    //   33: lconst_0
    //   34: iload_1
    //   35: i2l
    //   36: invokestatic checkOffsetAndCount : (JJJ)V
    //   39: iconst_0
    //   40: istore #6
    //   42: iconst_0
    //   43: istore #7
    //   45: aload #4
    //   47: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   50: astore #8
    //   52: iload #6
    //   54: iload_1
    //   55: if_icmpge -> 133
    //   58: aload #8
    //   60: dup
    //   61: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   64: getfield limit : I
    //   67: aload #8
    //   69: getfield pos : I
    //   72: if_icmpne -> 97
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   81: athrow
    //   82: new java/lang/AssertionError
    //   85: dup
    //   86: ldc_w 's.limit == s.pos'
    //   89: invokespecial <init> : (Ljava/lang/Object;)V
    //   92: athrow
    //   93: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   96: athrow
    //   97: iload #6
    //   99: aload #8
    //   101: getfield limit : I
    //   104: aload #8
    //   106: getfield pos : I
    //   109: isub
    //   110: iadd
    //   111: istore #6
    //   113: iload #7
    //   115: istore #9
    //   117: iload #9
    //   119: iconst_1
    //   120: iadd
    //   121: istore #7
    //   123: aload #8
    //   125: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   128: astore #8
    //   130: goto -> 52
    //   133: iload #7
    //   135: anewarray [B
    //   138: astore #9
    //   140: iload #7
    //   142: iconst_2
    //   143: imul
    //   144: newarray int
    //   146: astore #10
    //   148: iconst_0
    //   149: istore #6
    //   151: iconst_0
    //   152: istore #7
    //   154: aload #4
    //   156: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   159: astore #8
    //   161: iload #6
    //   163: iload_1
    //   164: if_icmpge -> 254
    //   167: aload #9
    //   169: iload #7
    //   171: aload #8
    //   173: dup
    //   174: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   177: getfield data : [B
    //   180: aastore
    //   181: iload #6
    //   183: aload #8
    //   185: getfield limit : I
    //   188: aload #8
    //   190: getfield pos : I
    //   193: isub
    //   194: iadd
    //   195: istore #6
    //   197: aload #10
    //   199: iload #7
    //   201: iconst_0
    //   202: istore #11
    //   204: iload #6
    //   206: iload_1
    //   207: invokestatic min : (II)I
    //   210: iastore
    //   211: aload #10
    //   213: iload #7
    //   215: aload #9
    //   217: checkcast [Ljava/lang/Object;
    //   220: arraylength
    //   221: iadd
    //   222: aload #8
    //   224: getfield pos : I
    //   227: iastore
    //   228: aload #8
    //   230: iconst_1
    //   231: putfield shared : Z
    //   234: iload #7
    //   236: istore #11
    //   238: iload #11
    //   240: iconst_1
    //   241: iadd
    //   242: istore #7
    //   244: aload #8
    //   246: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   249: astore #8
    //   251: goto -> 161
    //   254: new me/rerere/matrix/thirdparty/okio/SegmentedByteString
    //   257: dup
    //   258: aload #9
    //   260: aload #10
    //   262: invokespecial <init> : ([[B[I)V
    //   265: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   268: areturn
    // Exception table:
    //   from	to	target	type
    //   14	24	24	java/lang/IllegalArgumentException
    //   52	75	78	java/lang/IllegalArgumentException
    //   58	93	93	java/lang/IllegalArgumentException
  }
  
  @Nullable
  public String readUtf8Line() throws EOFException {
    Buffer buffer = this;
    boolean bool1 = false;
    byte b = 10;
    boolean bool2 = false;
    long l = buffer.indexOf((byte)b);
    try {
      try {
      
      } catch (EOFException eOFException) {
        throw a(null);
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return (l != -1L) ? _BufferKt.readUtf8Line(buffer, l) : ((buffer.size() != 0L) ? buffer.readUtf8(buffer.size()) : null);
  }
  
  @NotNull
  public final ByteString snapshot() {
    long l = a ^ 0x7D36CCD8C90AL;
    Buffer buffer = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (buffer.size() <= 2147483647L) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("size > Int.MAX_VALUE: ", Long.valueOf(buffer.size()));
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    return buffer.snapshot((int)buffer.size());
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer$UnsafeCursor readUnsafe() {
    return readUnsafe$default(this, null, 1, null);
  }
  
  public byte readByte() throws EOFException {
    Buffer buffer1 = this;
    boolean bool = false;
    try {
      if (buffer1.size() == 0L)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(buffer1.head);
    Segment segment = buffer1.head;
    int i = segment.pos;
    int j = segment.limit;
    byte[] arrayOfByte = segment.data;
    int k = i;
    i = k + 1;
    byte b = arrayOfByte[k];
    Buffer buffer2 = buffer1;
    try {
      buffer2.setSize$okio(buffer2.size() - 1L);
      if (i == j) {
        buffer1.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return b;
  }
  
  public final void setSize$okio(long paramLong) {
    this.size = paramLong;
  }
  
  @NotNull
  public Buffer emit() {
    return this;
  }
  
  @NotNull
  public OutputStream outputStream() {
    return new Buffer$outputStream$1(this);
  }
  
  @NotNull
  public InputStream inputStream() {
    return new Buffer$inputStream$1(this);
  }
  
  @NotNull
  public final ByteString sha512() {
    long l = a ^ 0x345B84677213L;
    return digest("SHA-512");
  }
  
  @NotNull
  public final ByteString hmacSha1(@NotNull ByteString paramByteString) {
    long l = a ^ 0x27D183B32432L;
    Intrinsics.checkNotNullParameter(paramByteString, "key");
    return hmac("HmacSHA1", paramByteString);
  }
  
  public void require(long paramLong) throws EOFException {
    try {
      if (this.size < paramLong)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public Buffer writeUtf8CodePoint(int paramInt) {
    long l = a ^ 0x43A5505772D1L;
    Buffer buffer = this;
    boolean bool = false;
    try {
      if (paramInt < 128) {
        buffer.writeByte(paramInt);
      } else if (paramInt < 2048) {
        Segment segment1 = buffer.writableSegment$okio(2);
        segment1.data[segment1.limit] = (byte)(paramInt >> 6 | 0xC0);
        segment1.data[segment1.limit + 1] = (byte)(paramInt & 0x3F | 0x80);
        Segment segment2 = segment1;
        segment2.limit += 2;
        Buffer buffer1 = buffer;
        buffer1.setSize$okio(buffer1.size() + 2L);
      } else {
        try {
          if (55296 <= paramInt) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
          
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        if (false) {
          byte b = 63;
          boolean bool1 = false;
          buffer.writeByte(b);
        } else if (paramInt < 65536) {
          Segment segment1 = buffer.writableSegment$okio(3);
          segment1.data[segment1.limit] = (byte)(paramInt >> 12 | 0xE0);
          segment1.data[segment1.limit + 1] = (byte)(paramInt >> 6 & 0x3F | 0x80);
          segment1.data[segment1.limit + 2] = (byte)(paramInt & 0x3F | 0x80);
          Segment segment2 = segment1;
          segment2.limit += 3;
          Buffer buffer1 = buffer;
          buffer1.setSize$okio(buffer1.size() + 3L);
        } else if (paramInt <= 1114111) {
          Segment segment1 = buffer.writableSegment$okio(4);
          segment1.data[segment1.limit] = (byte)(paramInt >> 18 | 0xF0);
          segment1.data[segment1.limit + 1] = (byte)(paramInt >> 12 & 0x3F | 0x80);
          segment1.data[segment1.limit + 2] = (byte)(paramInt >> 6 & 0x3F | 0x80);
          segment1.data[segment1.limit + 3] = (byte)(paramInt & 0x3F | 0x80);
          Segment segment2 = segment1;
          segment2.limit += 4;
          Buffer buffer1 = buffer;
          buffer1.setSize$okio(buffer1.size() + 4L);
        } else {
          throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected code point: 0x", _UtilKt.toHexString(paramInt)));
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return buffer;
  }
  
  public long readDecimalLong() throws EOFException {
    long l1 = a ^ 0x35F980A57EAAL;
    Buffer buffer1 = this;
    boolean bool1 = false;
    try {
      if (buffer1.size() == 0L)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    long l2 = 0L;
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    long l3 = -7L;
    while (true) {
      Intrinsics.checkNotNull(buffer1.head);
      Segment segment = buffer1.head;
      byte[] arrayOfByte = segment.data;
      int j = segment.pos;
      int k = segment.limit;
      while (true) {
        m = j;
        j = m + 1;
        m = i;
        i = m + 1;
      } 
      try {
        if (j == k) {
          buffer1.head = segment.pop();
          SegmentPool.recycle(segment);
        } else {
          segment.pos = j;
        } 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
      continue;
      try {
        if (bool3 || buffer1.head == null)
          break; 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
    } 
    Buffer buffer2 = buffer1;
    try {
      buffer2.setSize$okio(buffer2.size() - i);
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    byte b = bool2 ? 2 : 1;
    try {
      if (i < b) {
        try {
          if (buffer1.size() == 0L)
            throw new EOFException(); 
        } catch (EOFException eOFException) {
          throw a(null);
        } 
        try {
        
        } catch (EOFException eOFException) {
          throw a(null);
        } 
        String str = bool2 ? "Expected a digit" : "Expected a digit or '-'";
        throw new NumberFormatException(str + " but was 0x" + _UtilKt.toHexString(buffer1.getByte(0L)));
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    try {
    
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    return bool2 ? l2 : -l2;
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer writeTo(@NotNull OutputStream paramOutputStream) throws IOException {
    long l = a ^ 0x3789D452C312L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    return writeTo$default(this, paramOutputStream, 0L, 2, null);
  }
  
  @Deprecated(message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}), level = DeprecationLevel.ERROR)
  public final byte -deprecated_getByte(long paramLong) {
    return getByte(paramLong);
  }
  
  @NotNull
  public ByteString readByteString() {
    Buffer buffer = this;
    boolean bool = false;
    return buffer.readByteString(buffer.size());
  }
  
  @NotNull
  public Buffer writeDecimalLong(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 12006983280880
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: lload_1
    //   15: lstore #7
    //   17: lload #7
    //   19: lconst_0
    //   20: lcmp
    //   21: ifne -> 41
    //   24: aload #5
    //   26: bipush #48
    //   28: istore #9
    //   30: iconst_0
    //   31: istore #10
    //   33: iload #9
    //   35: invokevirtual writeByte : (I)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   38: goto -> 570
    //   41: iconst_0
    //   42: istore #9
    //   44: lload #7
    //   46: lconst_0
    //   47: lcmp
    //   48: ifge -> 81
    //   51: lload #7
    //   53: lneg
    //   54: lstore #7
    //   56: lload #7
    //   58: lconst_0
    //   59: lcmp
    //   60: ifge -> 78
    //   63: aload #5
    //   65: ldc_w '-9223372036854775808'
    //   68: invokevirtual writeUtf8 : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   71: goto -> 570
    //   74: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   77: athrow
    //   78: iconst_1
    //   79: istore #9
    //   81: lload #7
    //   83: ldc2_w 100000000
    //   86: lcmp
    //   87: ifge -> 232
    //   90: lload #7
    //   92: ldc2_w 10000
    //   95: lcmp
    //   96: ifge -> 171
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   105: athrow
    //   106: lload #7
    //   108: ldc2_w 100
    //   111: lcmp
    //   112: ifge -> 150
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   121: athrow
    //   122: lload #7
    //   124: ldc2_w 10
    //   127: lcmp
    //   128: ifge -> 146
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   137: athrow
    //   138: iconst_1
    //   139: goto -> 426
    //   142: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   145: athrow
    //   146: iconst_2
    //   147: goto -> 426
    //   150: lload #7
    //   152: ldc2_w 1000
    //   155: lcmp
    //   156: ifge -> 167
    //   159: iconst_3
    //   160: goto -> 426
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: iconst_4
    //   168: goto -> 426
    //   171: lload #7
    //   173: ldc2_w 1000000
    //   176: lcmp
    //   177: ifge -> 209
    //   180: lload #7
    //   182: ldc2_w 100000
    //   185: lcmp
    //   186: ifge -> 204
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   195: athrow
    //   196: iconst_5
    //   197: goto -> 426
    //   200: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   203: athrow
    //   204: bipush #6
    //   206: goto -> 426
    //   209: lload #7
    //   211: ldc2_w 10000000
    //   214: lcmp
    //   215: ifge -> 227
    //   218: bipush #7
    //   220: goto -> 426
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: bipush #8
    //   229: goto -> 426
    //   232: lload #7
    //   234: ldc2_w 1000000000000
    //   237: lcmp
    //   238: ifge -> 310
    //   241: lload #7
    //   243: ldc2_w 10000000000
    //   246: lcmp
    //   247: ifge -> 287
    //   250: goto -> 257
    //   253: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   256: athrow
    //   257: lload #7
    //   259: ldc2_w 1000000000
    //   262: lcmp
    //   263: ifge -> 282
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   272: athrow
    //   273: bipush #9
    //   275: goto -> 426
    //   278: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   281: athrow
    //   282: bipush #10
    //   284: goto -> 426
    //   287: lload #7
    //   289: ldc2_w 100000000000
    //   292: lcmp
    //   293: ifge -> 305
    //   296: bipush #11
    //   298: goto -> 426
    //   301: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   304: athrow
    //   305: bipush #12
    //   307: goto -> 426
    //   310: lload #7
    //   312: ldc2_w 1000000000000000
    //   315: lcmp
    //   316: ifge -> 367
    //   319: lload #7
    //   321: ldc2_w 10000000000000
    //   324: lcmp
    //   325: ifge -> 344
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   334: athrow
    //   335: bipush #13
    //   337: goto -> 426
    //   340: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   343: athrow
    //   344: lload #7
    //   346: ldc2_w 100000000000000
    //   349: lcmp
    //   350: ifge -> 362
    //   353: bipush #14
    //   355: goto -> 426
    //   358: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   361: athrow
    //   362: bipush #15
    //   364: goto -> 426
    //   367: lload #7
    //   369: ldc2_w 100000000000000000
    //   372: lcmp
    //   373: ifge -> 406
    //   376: lload #7
    //   378: ldc2_w 10000000000000000
    //   381: lcmp
    //   382: ifge -> 401
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   391: athrow
    //   392: bipush #16
    //   394: goto -> 426
    //   397: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   400: athrow
    //   401: bipush #17
    //   403: goto -> 426
    //   406: lload #7
    //   408: ldc2_w 1000000000000000000
    //   411: lcmp
    //   412: ifge -> 424
    //   415: bipush #18
    //   417: goto -> 426
    //   420: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   423: athrow
    //   424: bipush #19
    //   426: istore #10
    //   428: iload #9
    //   430: ifeq -> 443
    //   433: iinc #10, 1
    //   436: goto -> 443
    //   439: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   442: athrow
    //   443: aload #5
    //   445: iload #10
    //   447: invokevirtual writableSegment$okio : (I)Lme/rerere/matrix/thirdparty/okio/Segment;
    //   450: astore #11
    //   452: aload #11
    //   454: getfield data : [B
    //   457: astore #12
    //   459: aload #11
    //   461: getfield limit : I
    //   464: iload #10
    //   466: iadd
    //   467: istore #13
    //   469: lload #7
    //   471: lconst_0
    //   472: lcmp
    //   473: ifeq -> 510
    //   476: lload #7
    //   478: bipush #10
    //   480: i2l
    //   481: lrem
    //   482: l2i
    //   483: istore #14
    //   485: aload #12
    //   487: iinc #13, -1
    //   490: iload #13
    //   492: invokestatic getHEX_DIGIT_BYTES : ()[B
    //   495: iload #14
    //   497: baload
    //   498: bastore
    //   499: lload #7
    //   501: bipush #10
    //   503: i2l
    //   504: ldiv
    //   505: lstore #7
    //   507: goto -> 469
    //   510: iload #9
    //   512: ifeq -> 533
    //   515: aload #12
    //   517: iinc #13, -1
    //   520: iload #13
    //   522: bipush #45
    //   524: istore #14
    //   526: iconst_0
    //   527: istore #15
    //   529: iload #14
    //   531: i2b
    //   532: bastore
    //   533: aload #11
    //   535: astore #14
    //   537: aload #14
    //   539: aload #14
    //   541: getfield limit : I
    //   544: iload #10
    //   546: iadd
    //   547: putfield limit : I
    //   550: aload #5
    //   552: astore #14
    //   554: aload #14
    //   556: aload #14
    //   558: invokevirtual size : ()J
    //   561: iload #10
    //   563: i2l
    //   564: ladd
    //   565: invokevirtual setSize$okio : (J)V
    //   568: aload #5
    //   570: areturn
    // Exception table:
    //   from	to	target	type
    //   56	74	74	java/lang/IllegalArgumentException
    //   81	99	102	java/lang/IllegalArgumentException
    //   90	115	118	java/lang/IllegalArgumentException
    //   106	131	134	java/lang/IllegalArgumentException
    //   122	142	142	java/lang/IllegalArgumentException
    //   150	163	163	java/lang/IllegalArgumentException
    //   171	189	192	java/lang/IllegalArgumentException
    //   180	200	200	java/lang/IllegalArgumentException
    //   209	223	223	java/lang/IllegalArgumentException
    //   232	250	253	java/lang/IllegalArgumentException
    //   241	266	269	java/lang/IllegalArgumentException
    //   257	278	278	java/lang/IllegalArgumentException
    //   287	301	301	java/lang/IllegalArgumentException
    //   310	328	331	java/lang/IllegalArgumentException
    //   319	340	340	java/lang/IllegalArgumentException
    //   344	358	358	java/lang/IllegalArgumentException
    //   367	385	388	java/lang/IllegalArgumentException
    //   376	397	397	java/lang/IllegalArgumentException
    //   406	420	420	java/lang/IllegalArgumentException
    //   428	436	439	java/lang/IllegalArgumentException
  }
  
  public int read(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x66AF9A647EB6L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    Buffer buffer = this;
    boolean bool = false;
    return buffer.read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  @NotNull
  public Timeout timeout() {
    return Timeout.NONE;
  }
  
  @NotNull
  public String readString(@NotNull Charset paramCharset) {
    long l = a ^ 0x5DBB23499721L;
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    return readString(this.size, paramCharset);
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x4EC2423C7590L;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    Buffer buffer = this;
    boolean bool1 = false;
    long l2 = 0L;
    l2 = paramLong;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (l2 >= 0L) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(l2));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
      if (l2 > buffer.size())
        l2 = buffer.size(); 
      paramBuffer.write(buffer, l2);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (buffer.size() == 0L) ? -1L : l2;
  }
  
  public long writeAll(@NotNull Source paramSource) throws IOException {
    long l1 = a ^ 0x5A6E7B87C19BL;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    Buffer buffer = this;
    boolean bool = false;
    for (long l2 = 0L;; l2 += l) {
      long l = paramSource.read(buffer, 8192L);
      try {
        if (l == -1L)
          return l2; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  @JvmOverloads
  @NotNull
  public final Buffer copyTo(@NotNull OutputStream paramOutputStream) throws IOException {
    long l = a ^ 0x7BC16160F4C9L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "out");
    return copyTo$default(this, paramOutputStream, 0L, 0L, 6, (Object)null);
  }
  
  public long indexOfElement(@NotNull ByteString paramByteString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer.a : J
    //   3: ldc2_w 139110967554012
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'targetBytes'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #6
    //   18: iconst_0
    //   19: istore #7
    //   21: lconst_0
    //   22: lstore #46
    //   24: lload_2
    //   25: lstore #46
    //   27: lload #46
    //   29: lconst_0
    //   30: lcmp
    //   31: iflt -> 42
    //   34: iconst_1
    //   35: goto -> 43
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: iconst_0
    //   43: istore #8
    //   45: iconst_0
    //   46: istore #9
    //   48: iconst_0
    //   49: istore #10
    //   51: iload #8
    //   53: ifne -> 88
    //   56: iconst_0
    //   57: istore #11
    //   59: ldc_w 'fromIndex < 0: '
    //   62: lload #46
    //   64: invokestatic valueOf : (J)Ljava/lang/Long;
    //   67: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   70: astore #10
    //   72: new java/lang/IllegalArgumentException
    //   75: dup
    //   76: aload #10
    //   78: invokevirtual toString : ()Ljava/lang/String;
    //   81: invokespecial <init> : (Ljava/lang/String;)V
    //   84: checkcast java/lang/Throwable
    //   87: athrow
    //   88: aload #6
    //   90: astore #8
    //   92: lload #46
    //   94: lstore #12
    //   96: iconst_0
    //   97: istore #11
    //   99: aload #8
    //   101: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   104: astore #14
    //   106: aload #14
    //   108: ifnonnull -> 135
    //   111: aconst_null
    //   112: ldc2_w -1
    //   115: lstore #15
    //   117: checkcast me/rerere/matrix/thirdparty/okio/Segment
    //   120: astore #17
    //   122: iconst_0
    //   123: istore #18
    //   125: aload #17
    //   127: astore #19
    //   129: ldc2_w -1
    //   132: goto -> 984
    //   135: aload #14
    //   137: astore #32
    //   139: aload #8
    //   141: invokevirtual size : ()J
    //   144: lload #12
    //   146: lsub
    //   147: lload #12
    //   149: lcmp
    //   150: ifge -> 566
    //   153: aload #8
    //   155: invokevirtual size : ()J
    //   158: lstore #33
    //   160: lload #33
    //   162: lload #12
    //   164: lcmp
    //   165: ifle -> 199
    //   168: aload #32
    //   170: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   173: dup
    //   174: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   177: astore #32
    //   179: lload #33
    //   181: aload #32
    //   183: getfield limit : I
    //   186: aload #32
    //   188: getfield pos : I
    //   191: isub
    //   192: i2l
    //   193: lsub
    //   194: lstore #33
    //   196: goto -> 160
    //   199: aload #32
    //   201: lload #33
    //   203: lstore #15
    //   205: astore #17
    //   207: iconst_0
    //   208: istore #18
    //   210: aload #17
    //   212: astore #19
    //   214: aload #19
    //   216: ifnonnull -> 229
    //   219: ldc2_w -1
    //   222: goto -> 984
    //   225: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   228: athrow
    //   229: aload #19
    //   231: astore #20
    //   233: lload #15
    //   235: lstore #21
    //   237: aload_1
    //   238: invokevirtual size : ()I
    //   241: iconst_2
    //   242: if_icmpne -> 401
    //   245: aload_1
    //   246: iconst_0
    //   247: invokevirtual getByte : (I)B
    //   250: istore #23
    //   252: aload_1
    //   253: iconst_1
    //   254: invokevirtual getByte : (I)B
    //   257: istore #24
    //   259: lload #21
    //   261: aload #6
    //   263: invokevirtual size : ()J
    //   266: lcmp
    //   267: ifge -> 560
    //   270: aload #20
    //   272: getfield data : [B
    //   275: astore #25
    //   277: aload #20
    //   279: getfield pos : I
    //   282: i2l
    //   283: lload #46
    //   285: ladd
    //   286: lload #21
    //   288: lsub
    //   289: l2i
    //   290: istore #26
    //   292: aload #20
    //   294: getfield limit : I
    //   297: istore #27
    //   299: iload #26
    //   301: iload #27
    //   303: if_icmpge -> 366
    //   306: aload #25
    //   308: iload #26
    //   310: baload
    //   311: istore #28
    //   313: iload #28
    //   315: iload #23
    //   317: if_icmpeq -> 334
    //   320: iload #28
    //   322: iload #24
    //   324: if_icmpne -> 353
    //   327: goto -> 334
    //   330: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   333: athrow
    //   334: iload #26
    //   336: aload #20
    //   338: getfield pos : I
    //   341: isub
    //   342: i2l
    //   343: lload #21
    //   345: ladd
    //   346: goto -> 984
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: iload #26
    //   355: istore #29
    //   357: iload #29
    //   359: iconst_1
    //   360: iadd
    //   361: istore #26
    //   363: goto -> 299
    //   366: lload #21
    //   368: aload #20
    //   370: getfield limit : I
    //   373: aload #20
    //   375: getfield pos : I
    //   378: isub
    //   379: i2l
    //   380: ladd
    //   381: lstore #21
    //   383: lload #21
    //   385: lstore #46
    //   387: aload #20
    //   389: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   392: dup
    //   393: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   396: astore #20
    //   398: goto -> 259
    //   401: aload_1
    //   402: invokevirtual internalArray$okio : ()[B
    //   405: astore #23
    //   407: lload #21
    //   409: aload #6
    //   411: invokevirtual size : ()J
    //   414: lcmp
    //   415: ifge -> 560
    //   418: aload #20
    //   420: getfield data : [B
    //   423: astore #24
    //   425: aload #20
    //   427: getfield pos : I
    //   430: i2l
    //   431: lload #46
    //   433: ladd
    //   434: lload #21
    //   436: lsub
    //   437: l2i
    //   438: istore #25
    //   440: aload #20
    //   442: getfield limit : I
    //   445: istore #26
    //   447: iload #25
    //   449: iload #26
    //   451: if_icmpge -> 525
    //   454: aload #24
    //   456: iload #25
    //   458: baload
    //   459: istore #27
    //   461: aload #23
    //   463: astore #28
    //   465: iconst_0
    //   466: istore #29
    //   468: aload #28
    //   470: arraylength
    //   471: istore #30
    //   473: iload #29
    //   475: iload #30
    //   477: if_icmpge -> 512
    //   480: aload #28
    //   482: iload #29
    //   484: baload
    //   485: istore #31
    //   487: iinc #29, 1
    //   490: iload #27
    //   492: iload #31
    //   494: if_icmpne -> 473
    //   497: iload #25
    //   499: aload #20
    //   501: getfield pos : I
    //   504: isub
    //   505: i2l
    //   506: lload #21
    //   508: ladd
    //   509: goto -> 984
    //   512: iload #25
    //   514: istore #28
    //   516: iload #28
    //   518: iconst_1
    //   519: iadd
    //   520: istore #25
    //   522: goto -> 447
    //   525: lload #21
    //   527: aload #20
    //   529: getfield limit : I
    //   532: aload #20
    //   534: getfield pos : I
    //   537: isub
    //   538: i2l
    //   539: ladd
    //   540: lstore #21
    //   542: lload #21
    //   544: lstore #46
    //   546: aload #20
    //   548: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   551: dup
    //   552: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   555: astore #20
    //   557: goto -> 407
    //   560: ldc2_w -1
    //   563: goto -> 984
    //   566: lconst_0
    //   567: lstore #33
    //   569: nop
    //   570: lload #33
    //   572: aload #32
    //   574: getfield limit : I
    //   577: aload #32
    //   579: getfield pos : I
    //   582: isub
    //   583: i2l
    //   584: ladd
    //   585: lstore #35
    //   587: lload #35
    //   589: lload #12
    //   591: lcmp
    //   592: ifle -> 602
    //   595: goto -> 620
    //   598: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   601: athrow
    //   602: aload #32
    //   604: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   607: dup
    //   608: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   611: astore #32
    //   613: lload #35
    //   615: lstore #33
    //   617: goto -> 569
    //   620: aload #32
    //   622: lload #33
    //   624: lstore #37
    //   626: astore #39
    //   628: iconst_0
    //   629: istore #20
    //   631: aload #39
    //   633: astore #40
    //   635: aload #40
    //   637: ifnonnull -> 650
    //   640: ldc2_w -1
    //   643: goto -> 984
    //   646: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   649: athrow
    //   650: aload #40
    //   652: astore #41
    //   654: lload #37
    //   656: lstore #42
    //   658: aload_1
    //   659: invokevirtual size : ()I
    //   662: iconst_2
    //   663: if_icmpne -> 822
    //   666: aload_1
    //   667: iconst_0
    //   668: invokevirtual getByte : (I)B
    //   671: istore #25
    //   673: aload_1
    //   674: iconst_1
    //   675: invokevirtual getByte : (I)B
    //   678: istore #26
    //   680: lload #42
    //   682: aload #6
    //   684: invokevirtual size : ()J
    //   687: lcmp
    //   688: ifge -> 981
    //   691: aload #41
    //   693: getfield data : [B
    //   696: astore #27
    //   698: aload #41
    //   700: getfield pos : I
    //   703: i2l
    //   704: lload #46
    //   706: ladd
    //   707: lload #42
    //   709: lsub
    //   710: l2i
    //   711: istore #28
    //   713: aload #41
    //   715: getfield limit : I
    //   718: istore #29
    //   720: iload #28
    //   722: iload #29
    //   724: if_icmpge -> 787
    //   727: aload #27
    //   729: iload #28
    //   731: baload
    //   732: istore #30
    //   734: iload #30
    //   736: iload #25
    //   738: if_icmpeq -> 755
    //   741: iload #30
    //   743: iload #26
    //   745: if_icmpne -> 774
    //   748: goto -> 755
    //   751: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   754: athrow
    //   755: iload #28
    //   757: aload #41
    //   759: getfield pos : I
    //   762: isub
    //   763: i2l
    //   764: lload #42
    //   766: ladd
    //   767: goto -> 984
    //   770: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   773: athrow
    //   774: iload #28
    //   776: istore #31
    //   778: iload #31
    //   780: iconst_1
    //   781: iadd
    //   782: istore #28
    //   784: goto -> 720
    //   787: lload #42
    //   789: aload #41
    //   791: getfield limit : I
    //   794: aload #41
    //   796: getfield pos : I
    //   799: isub
    //   800: i2l
    //   801: ladd
    //   802: lstore #42
    //   804: lload #42
    //   806: lstore #46
    //   808: aload #41
    //   810: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   813: dup
    //   814: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   817: astore #41
    //   819: goto -> 680
    //   822: aload_1
    //   823: invokevirtual internalArray$okio : ()[B
    //   826: astore #25
    //   828: lload #42
    //   830: aload #6
    //   832: invokevirtual size : ()J
    //   835: lcmp
    //   836: ifge -> 981
    //   839: aload #41
    //   841: getfield data : [B
    //   844: astore #26
    //   846: aload #41
    //   848: getfield pos : I
    //   851: i2l
    //   852: lload #46
    //   854: ladd
    //   855: lload #42
    //   857: lsub
    //   858: l2i
    //   859: istore #27
    //   861: aload #41
    //   863: getfield limit : I
    //   866: istore #28
    //   868: iload #27
    //   870: iload #28
    //   872: if_icmpge -> 946
    //   875: aload #26
    //   877: iload #27
    //   879: baload
    //   880: istore #29
    //   882: aload #25
    //   884: astore #30
    //   886: iconst_0
    //   887: istore #31
    //   889: aload #30
    //   891: arraylength
    //   892: istore #44
    //   894: iload #31
    //   896: iload #44
    //   898: if_icmpge -> 933
    //   901: aload #30
    //   903: iload #31
    //   905: baload
    //   906: istore #45
    //   908: iinc #31, 1
    //   911: iload #29
    //   913: iload #45
    //   915: if_icmpne -> 894
    //   918: iload #27
    //   920: aload #41
    //   922: getfield pos : I
    //   925: isub
    //   926: i2l
    //   927: lload #42
    //   929: ladd
    //   930: goto -> 984
    //   933: iload #27
    //   935: istore #30
    //   937: iload #30
    //   939: iconst_1
    //   940: iadd
    //   941: istore #27
    //   943: goto -> 868
    //   946: lload #42
    //   948: aload #41
    //   950: getfield limit : I
    //   953: aload #41
    //   955: getfield pos : I
    //   958: isub
    //   959: i2l
    //   960: ladd
    //   961: lstore #42
    //   963: lload #42
    //   965: lstore #46
    //   967: aload #41
    //   969: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   972: dup
    //   973: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   976: astore #41
    //   978: goto -> 828
    //   981: ldc2_w -1
    //   984: lreturn
    // Exception table:
    //   from	to	target	type
    //   27	38	38	java/lang/IllegalArgumentException
    //   214	225	225	java/lang/IllegalArgumentException
    //   313	327	330	java/lang/IllegalArgumentException
    //   320	349	349	java/lang/IllegalArgumentException
    //   587	598	598	java/lang/IllegalArgumentException
    //   635	646	646	java/lang/IllegalArgumentException
    //   734	748	751	java/lang/IllegalArgumentException
    //   741	770	770	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public Buffer emitCompleteSegments() {
    return this;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x369148412946L;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    Buffer buffer = this;
    boolean bool1 = false;
    long l2 = paramLong;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramBuffer != buffer) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "source == this";
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    _UtilKt.checkOffsetAndCount(paramBuffer.size(), 0L, l2);
    while (true) {
      try {
        if (l2 > 0L) {
          try {
            Intrinsics.checkNotNull(paramBuffer.head);
            Intrinsics.checkNotNull(paramBuffer.head);
            if (l2 < (paramBuffer.head.limit - paramBuffer.head.pos)) {
              try {
                Intrinsics.checkNotNull(buffer.head);
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              Segment segment1 = (buffer.head != null) ? buffer.head.prev : null;
              try {
                if (segment1 != null)
                  try {
                    if (segment1.owner)
                      try {
                        if (l2 + segment1.limit - (segment1.shared ? 0L : segment1.pos) <= 8192L) {
                          Intrinsics.checkNotNull(paramBuffer.head);
                          paramBuffer.head.writeTo(segment1, (int)l2);
                          Buffer buffer2 = paramBuffer;
                          buffer2.setSize$okio(buffer2.size() - l2);
                          buffer2 = buffer;
                          buffer2.setSize$okio(buffer2.size() + l2);
                          break;
                        } 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw a(null);
                      }  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              Intrinsics.checkNotNull(paramBuffer.head);
              paramBuffer.head = paramBuffer.head.split((int)l2);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          Segment segment = paramBuffer.head;
          Intrinsics.checkNotNull(segment);
          long l = (segment.limit - segment.pos);
          try {
            paramBuffer.head = segment.pop();
            if (buffer.head == null) {
              buffer.head = segment;
              segment.prev = segment;
              segment.next = segment.prev;
            } else {
              Intrinsics.checkNotNull(buffer.head);
              Segment segment1 = buffer.head.prev;
              Intrinsics.checkNotNull(segment1);
              segment1 = segment1.push(segment);
              segment1.compact();
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          Buffer buffer1 = paramBuffer;
          buffer1.setSize$okio(buffer1.size() - l);
          buffer1 = buffer;
          buffer1.setSize$okio(buffer1.size() + l);
          l2 -= l;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  @NotNull
  public Buffer getBuffer() {
    return this;
  }
  
  @NotNull
  public Buffer writeString(@NotNull String paramString, @NotNull Charset paramCharset) {
    long l = a ^ 0x5E93B3FFEA99L;
    Intrinsics.checkNotNullParameter(paramString, "string");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    return writeString(paramString, 0, paramString.length(), paramCharset);
  }
  
  @NotNull
  public Buffer write(@NotNull Source paramSource, long paramLong) throws IOException {
    long l1 = a ^ 0x7F3DB41814B0L;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    Buffer buffer = this;
    boolean bool = false;
    long l2;
    for (l2 = paramLong; l2 > 0L; l2 -= l) {
      long l = paramSource.read(buffer, l2);
      try {
        if (l == -1L)
          throw new EOFException(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return buffer;
  }
  
  public long readHexadecimalUnsignedLong() throws EOFException {
    long l1 = a ^ 0x569479C9B1FL;
    Buffer buffer1 = this;
    boolean bool1 = false;
    try {
      if (buffer1.size() == 0L)
        throw new EOFException(); 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    long l2 = 0L;
    int i = 0;
    boolean bool2 = false;
    while (true) {
      Intrinsics.checkNotNull(buffer1.head);
      Segment segment = buffer1.head;
      byte[] arrayOfByte = segment.data;
      int j = segment.pos;
      int k = segment.limit;
      while (j < k) {
        int m = 0;
        byte b = arrayOfByte[j];
        int n = 48;
        boolean bool = false;
        n = 57;
        bool = false;
        if (b >= (byte)n && b <= (byte)n) {
          n = 48;
          bool = false;
          m = b - (byte)n;
        } else {
          n = 97;
          bool = false;
          n = 102;
          bool = false;
          if (b >= (byte)n && b <= (byte)n) {
            n = 97;
            bool = false;
            m = b - (byte)n + 10;
          } else {
            n = 65;
            bool = false;
            n = 70;
            bool = false;
            if (b >= (byte)n && b <= (byte)n) {
              n = 65;
              bool = false;
              m = b - (byte)n + 10;
            } else {
              try {
                if (!i)
                  throw new NumberFormatException(Intrinsics.stringPlus("Expected leading [0-9a-fA-F] character but was 0x", _UtilKt.toHexString(b))); 
              } catch (EOFException eOFException) {
                throw a(null);
              } 
              bool2 = true;
              break;
            } 
          } 
        } 
        if ((l2 & 0xF000000000000000L) != 0L) {
          Buffer buffer = (new Buffer()).writeHexadecimalUnsignedLong(l2).writeByte(b);
          throw new NumberFormatException(Intrinsics.stringPlus("Number too large: ", buffer.readUtf8()));
        } 
        l2 <<= 4L;
        l2 |= m;
        n = j;
        j = n + 1;
        n = i;
        i = n + 1;
      } 
      try {
        if (j == k) {
          buffer1.head = segment.pop();
          SegmentPool.recycle(segment);
        } else {
          segment.pos = j;
        } 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
      try {
        if (bool2 || buffer1.head == null)
          break; 
      } catch (EOFException eOFException) {
        throw a(null);
      } 
    } 
    Buffer buffer2 = buffer1;
    buffer2.setSize$okio(buffer2.size() - i);
    return l2;
  }
  
  public final long completeSegmentByteCount() {
    Buffer buffer = this;
    boolean bool = false;
    long l = buffer.size();
    try {
      Intrinsics.checkNotNull(buffer.head);
      Intrinsics.checkNotNull(buffer.head.prev);
      Segment segment = buffer.head.prev;
      try {
        if (segment.limit < 8192 && segment.owner)
          l -= (segment.limit - segment.pos); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (l == 0L) ? 0L : l;
  }
  
  public void readFully(@NotNull Buffer paramBuffer, long paramLong) throws EOFException {
    long l = a ^ 0xFE5B3497B63L;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    Buffer buffer = this;
    boolean bool = false;
    try {
      if (buffer.size() < paramLong) {
        paramBuffer.write(buffer, buffer.size());
        throw new EOFException();
      } 
    } catch (EOFException eOFException) {
      throw a(null);
    } 
    paramBuffer.write(buffer, paramLong);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Buffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
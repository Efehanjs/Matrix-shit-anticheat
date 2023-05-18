package me.rerere.matrix.thirdparty.okio;

import java.io.EOFException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.internal._BufferKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealBufferedSource implements BufferedSource {
  @JvmField
  public boolean closed;
  
  @JvmField
  @NotNull
  public final Buffer bufferField;
  
  @JvmField
  @NotNull
  public final Source source;
  
  private static final long a = o3.a(-349412933383930449L, 7615867843855017613L, MethodHandles.lookup().lookupClass()).a(91538200174189L);
  
  public long indexOfElement(@NotNull ByteString paramByteString) {
    long l = a ^ 0x78131F4F40D5L;
    Intrinsics.checkNotNullParameter(paramByteString, "targetBytes");
    return indexOfElement(paramByteString, 0L);
  }
  
  @NotNull
  public String readString(long paramLong, @NotNull Charset paramCharset) {
    long l = a ^ 0x2EFCFEF02DE8L;
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    require(paramLong);
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    return realBufferedSource.bufferField.readString(paramLong, paramCharset);
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x34C42567EBAFL;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramLong >= 0L) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool2 = !realBufferedSource1.closed ? true : false;
    bool3 = false;
    bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    bool3 = false;
    if (realBufferedSource2.bufferField.size() == 0L) {
      RealBufferedSource realBufferedSource = realBufferedSource1;
      boolean bool = false;
      long l = realBufferedSource1.source.read(realBufferedSource.bufferField, 8192L);
      try {
        if (l == -1L);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    RealBufferedSource realBufferedSource3 = realBufferedSource1;
    boolean bool5 = false;
    long l3 = realBufferedSource3.bufferField.size();
    boolean bool6 = false;
    long l2 = Math.min(paramLong, l3);
    realBufferedSource3 = realBufferedSource1;
    bool5 = false;
    return realBufferedSource3.bufferField.read(paramBuffer, l2);
  }
  
  @Nullable
  public String readUtf8Line() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    byte b = 10;
    boolean bool2 = false;
    long l = realBufferedSource1.indexOf((byte)b);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    return (l == -1L) ? ((realBufferedSource2.bufferField.size() != 0L) ? realBufferedSource1.readUtf8(realBufferedSource2.bufferField.size()) : (String)null) : _BufferKt.readUtf8Line(realBufferedSource2.bufferField, l);
  }
  
  public RealBufferedSource(@NotNull Source paramSource) {
    this.source = paramSource;
    this.bufferField = new Buffer();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x5497DE1A3B03L;
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    return "buffer(" + realBufferedSource.source + ')';
  }
  
  public long indexOf(@NotNull ByteString paramByteString) {
    long l = a ^ 0x354214A8A53CL;
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    return indexOf(paramByteString, 0L);
  }
  
  public boolean rangeEquals(long paramLong, @NotNull ByteString paramByteString) {
    long l = a ^ 0x510279806F1FL;
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    return rangeEquals(paramLong, paramByteString, 0, paramByteString.size());
  }
  
  @NotNull
  public InputStream inputStream() {
    return new RealBufferedSource$inputStream$1(this);
  }
  
  public short readShort() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(2L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readShort();
  }
  
  @NotNull
  public Timeout timeout() {
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    return realBufferedSource.source.timeout();
  }
  
  @NotNull
  public Buffer getBuffer() {
    boolean bool = false;
    return this.bufferField;
  }
  
  public void require(long paramLong) {
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    try {
      if (!realBufferedSource.request(paramLong))
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public short readShortLe() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(2L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readShortLe();
  }
  
  @NotNull
  public String readUtf8() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    realBufferedSource2.bufferField.writeAll(realBufferedSource1.source);
    realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    return realBufferedSource2.bufferField.readUtf8();
  }
  
  public boolean exhausted() {
    long l = a ^ 0x7DEE85606166L;
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSource1.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    bool3 = false;
    if (realBufferedSource2.bufferField.exhausted()) {
      realBufferedSource2 = realBufferedSource1;
      bool3 = false;
      try {
        if (realBufferedSource1.source.read(realBufferedSource2.bufferField, 8192L) == -1L);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public void close() {
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    try {
      if (!realBufferedSource.closed) {
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        RealBufferedSource realBufferedSource1 = realBufferedSource;
        boolean bool1 = false;
        realBufferedSource1.bufferField.clear();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public long indexOfElement(@NotNull ByteString paramByteString, long paramLong) {
    long l1 = a ^ 0x4832C95B1E3L;
    Intrinsics.checkNotNullParameter(paramByteString, "targetBytes");
    RealBufferedSource realBufferedSource = this;
    boolean bool1 = false;
    long l2 = paramLong;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSource.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    while (true) {
      RealBufferedSource realBufferedSource1 = realBufferedSource;
      boolean bool = false;
      long l = realBufferedSource1.bufferField.indexOfElement(paramByteString, l2);
      try {
        RealBufferedSource realBufferedSource2 = realBufferedSource;
        boolean bool5 = false;
        long l3 = realBufferedSource2.bufferField.size();
        realBufferedSource2 = realBufferedSource;
        bool5 = false;
        try {
          if (realBufferedSource.source.read(realBufferedSource2.bufferField, 8192L) == -1L) {
          
          } else {
            boolean bool6 = false;
            l2 = Math.max(l2, l3);
            continue;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return (l != -1L) ? l : "JD-Core does not support Kotlin";
    } 
  }
  
  public boolean isOpen() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return !this.closed;
  }
  
  @NotNull
  public String readUtf8(long paramLong) {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(paramLong);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readUtf8(paramLong);
  }
  
  public int read(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l1 = a ^ 0x1E3E9CF23D23L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, paramInt1, paramInt2);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    if (realBufferedSource2.bufferField.size() == 0L) {
      RealBufferedSource realBufferedSource = realBufferedSource1;
      boolean bool = false;
      long l = realBufferedSource1.source.read(realBufferedSource.bufferField, 8192L);
      try {
        if (l == -1L);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    RealBufferedSource realBufferedSource3 = realBufferedSource1;
    boolean bool3 = false;
    long l2 = realBufferedSource3.bufferField.size();
    boolean bool4 = false;
    long l3 = paramInt2;
    boolean bool5 = false;
    int i = (int)Math.min(l3, l2);
    realBufferedSource3 = realBufferedSource1;
    bool3 = false;
    return realBufferedSource3.bufferField.read(paramArrayOfbyte, paramInt1, i);
  }
  
  @NotNull
  public Buffer buffer() {
    return this.bufferField;
  }
  
  public long readHexadecimalUnsignedLong() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/RealBufferedSource.a : J
    //   3: ldc2_w 140115268011296
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: astore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: aload_3
    //   14: lconst_1
    //   15: invokevirtual require : (J)V
    //   18: iconst_0
    //   19: istore #5
    //   21: aload_3
    //   22: iload #5
    //   24: iconst_1
    //   25: iadd
    //   26: i2l
    //   27: invokevirtual request : (J)Z
    //   30: ifeq -> 225
    //   33: aload_3
    //   34: astore #6
    //   36: iconst_0
    //   37: istore #7
    //   39: aload #6
    //   41: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   44: iload #5
    //   46: i2l
    //   47: invokevirtual getByte : (J)B
    //   50: istore #8
    //   52: iload #8
    //   54: bipush #48
    //   56: istore #6
    //   58: iconst_0
    //   59: istore #7
    //   61: iload #6
    //   63: i2b
    //   64: if_icmplt -> 82
    //   67: iload #8
    //   69: bipush #57
    //   71: istore #6
    //   73: iconst_0
    //   74: istore #7
    //   76: iload #6
    //   78: i2b
    //   79: if_icmple -> 212
    //   82: iload #8
    //   84: bipush #97
    //   86: istore #6
    //   88: iconst_0
    //   89: istore #7
    //   91: iload #6
    //   93: i2b
    //   94: if_icmplt -> 112
    //   97: iload #8
    //   99: bipush #102
    //   101: istore #6
    //   103: iconst_0
    //   104: istore #7
    //   106: iload #6
    //   108: i2b
    //   109: if_icmple -> 212
    //   112: iload #8
    //   114: bipush #65
    //   116: istore #6
    //   118: iconst_0
    //   119: istore #7
    //   121: iload #6
    //   123: i2b
    //   124: if_icmplt -> 142
    //   127: iload #8
    //   129: bipush #70
    //   131: istore #6
    //   133: iconst_0
    //   134: istore #7
    //   136: iload #6
    //   138: i2b
    //   139: if_icmple -> 212
    //   142: iload #5
    //   144: ifne -> 209
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: new java/lang/NumberFormatException
    //   157: dup
    //   158: ldc 'Expected leading [0-9a-fA-F] character but was 0x'
    //   160: iload #8
    //   162: istore #6
    //   164: bipush #16
    //   166: istore #7
    //   168: iconst_0
    //   169: istore #9
    //   171: iload #6
    //   173: istore #10
    //   175: iload #7
    //   177: invokestatic checkRadix : (I)I
    //   180: istore #11
    //   182: iconst_0
    //   183: istore #12
    //   185: iload #10
    //   187: iload #11
    //   189: invokestatic checkRadix : (I)I
    //   192: invokestatic toString : (II)Ljava/lang/String;
    //   195: dup
    //   196: ldc_w 'java.lang.Integer.toStri…(this, checkRadix(radix))'
    //   199: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   202: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   205: invokespecial <init> : (Ljava/lang/String;)V
    //   208: athrow
    //   209: goto -> 225
    //   212: iload #5
    //   214: istore #6
    //   216: iload #6
    //   218: iconst_1
    //   219: iadd
    //   220: istore #5
    //   222: goto -> 21
    //   225: aload_3
    //   226: astore #8
    //   228: iconst_0
    //   229: istore #6
    //   231: aload #8
    //   233: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   236: invokevirtual readHexadecimalUnsignedLong : ()J
    //   239: lreturn
    // Exception table:
    //   from	to	target	type
    //   136	147	150	java/lang/IllegalArgumentException
  }
  
  public int select(@NotNull Options paramOptions) {
    long l = a ^ 0x2A229355AFBFL;
    Intrinsics.checkNotNullParameter(paramOptions, "options");
    RealBufferedSource realBufferedSource = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = !realBufferedSource.closed ? 1 : 0;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!i) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    while (true) {
      RealBufferedSource realBufferedSource2;
      boolean bool4;
      RealBufferedSource realBufferedSource1 = realBufferedSource;
      bool3 = false;
      i = _BufferKt.selectPrefix(realBufferedSource1.bufferField, paramOptions, true);
      int j = i;
      switch (j) {
        case -1:
        
        case -2:
          realBufferedSource2 = realBufferedSource;
          bool4 = false;
          if (realBufferedSource.source.read(realBufferedSource2.bufferField, 8192L) == -1L);
          continue;
      } 
      int k = paramOptions.getByteStrings$okio()[i].size();
      RealBufferedSource realBufferedSource3 = realBufferedSource;
      boolean bool5 = false;
      realBufferedSource3.bufferField.skip(k);
    } 
  }
  
  @NotNull
  public ByteString readByteString() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    realBufferedSource2.bufferField.writeAll(realBufferedSource1.source);
    realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    return realBufferedSource2.bufferField.readByteString();
  }
  
  @NotNull
  public String readUtf8LineStrict() {
    return readUtf8LineStrict(Long.MAX_VALUE);
  }
  
  public int readUtf8CodePoint() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(1L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    byte b = realBufferedSource2.bufferField.getByte(0L);
    try {
      if ((b & 0xE0) == 192) {
        realBufferedSource1.require(2L);
      } else {
        try {
          if ((b & 0xF0) == 224) {
            realBufferedSource1.require(3L);
          } else {
            try {
              if ((b & 0xF8) == 240)
                realBufferedSource1.require(4L); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    return realBufferedSource2.bufferField.readUtf8CodePoint();
  }
  
  public long indexOf(byte paramByte, long paramLong) {
    return indexOf(paramByte, paramLong, Long.MAX_VALUE);
  }
  
  public long indexOf(byte paramByte, long paramLong1, long paramLong2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/RealBufferedSource.a : J
    //   3: ldc2_w 6507678593736
    //   6: lxor
    //   7: lstore #6
    //   9: aload_0
    //   10: astore #8
    //   12: iconst_0
    //   13: istore #9
    //   15: lconst_0
    //   16: lstore #23
    //   18: lload_2
    //   19: lstore #23
    //   21: aload #8
    //   23: getfield closed : Z
    //   26: ifne -> 37
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #10
    //   40: iconst_0
    //   41: istore #11
    //   43: iconst_0
    //   44: istore #12
    //   46: iload #10
    //   48: ifne -> 74
    //   51: iconst_0
    //   52: istore #13
    //   54: ldc 'closed'
    //   56: astore #12
    //   58: new java/lang/IllegalStateException
    //   61: dup
    //   62: aload #12
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: checkcast java/lang/Throwable
    //   73: athrow
    //   74: lconst_0
    //   75: lload #23
    //   77: lcmp
    //   78: ifgt -> 108
    //   81: lload #23
    //   83: lload #4
    //   85: lcmp
    //   86: ifgt -> 104
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: iconst_1
    //   97: goto -> 109
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: iconst_0
    //   105: goto -> 109
    //   108: iconst_0
    //   109: istore #10
    //   111: iconst_0
    //   112: istore #11
    //   114: iconst_0
    //   115: istore #12
    //   117: iload #10
    //   119: ifne -> 175
    //   122: iconst_0
    //   123: istore #13
    //   125: new java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: ldc_w 'fromIndex='
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: lload #23
    //   140: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   143: ldc_w ' toIndex='
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: lload #4
    //   151: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   154: invokevirtual toString : ()Ljava/lang/String;
    //   157: astore #12
    //   159: new java/lang/IllegalArgumentException
    //   162: dup
    //   163: aload #12
    //   165: invokevirtual toString : ()Ljava/lang/String;
    //   168: invokespecial <init> : (Ljava/lang/String;)V
    //   171: checkcast java/lang/Throwable
    //   174: athrow
    //   175: lload #23
    //   177: lload #4
    //   179: lcmp
    //   180: ifge -> 309
    //   183: aload #8
    //   185: astore #12
    //   187: iconst_0
    //   188: istore #13
    //   190: aload #12
    //   192: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   195: iload_1
    //   196: lload #23
    //   198: lload #4
    //   200: invokevirtual indexOf : (BJJ)J
    //   203: lstore #14
    //   205: lload #14
    //   207: ldc2_w -1
    //   210: lcmp
    //   211: ifeq -> 223
    //   214: lload #14
    //   216: goto -> 312
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload #8
    //   225: astore #16
    //   227: iconst_0
    //   228: istore #17
    //   230: aload #16
    //   232: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   235: invokevirtual size : ()J
    //   238: lstore #18
    //   240: lload #18
    //   242: lload #4
    //   244: lcmp
    //   245: ifge -> 280
    //   248: aload #8
    //   250: getfield source : Lme/rerere/matrix/thirdparty/okio/Source;
    //   253: aload #8
    //   255: astore #16
    //   257: iconst_0
    //   258: istore #17
    //   260: aload #16
    //   262: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   265: ldc2_w 8192
    //   268: invokeinterface read : (Lme/rerere/matrix/thirdparty/okio/Buffer;J)J
    //   273: ldc2_w -1
    //   276: lcmp
    //   277: ifne -> 290
    //   280: ldc2_w -1
    //   283: goto -> 312
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: lload #23
    //   292: lstore #20
    //   294: iconst_0
    //   295: istore #22
    //   297: lload #20
    //   299: lload #18
    //   301: invokestatic max : (JJ)J
    //   304: lstore #23
    //   306: goto -> 175
    //   309: ldc2_w -1
    //   312: lreturn
    // Exception table:
    //   from	to	target	type
    //   21	33	33	java/lang/IllegalArgumentException
    //   74	89	92	java/lang/IllegalArgumentException
    //   81	100	100	java/lang/IllegalArgumentException
    //   205	219	219	java/lang/IllegalArgumentException
    //   260	286	286	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public ByteString readByteString(long paramLong) {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(paramLong);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readByteString(paramLong);
  }
  
  public int read(@NotNull ByteBuffer paramByteBuffer) {
    long l = a ^ 0x164ED6DBC078L;
    Intrinsics.checkNotNullParameter(paramByteBuffer, "sink");
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    if (realBufferedSource.bufferField.size() == 0L) {
      RealBufferedSource realBufferedSource1 = this;
      boolean bool1 = false;
      long l1 = this.source.read(realBufferedSource1.bufferField, 8192L);
      try {
        if (l1 == -1L)
          return -1; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    realBufferedSource = this;
    bool = false;
    return realBufferedSource.bufferField.read(paramByteBuffer);
  }
  
  @NotNull
  public byte[] readByteArray() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    realBufferedSource2.bufferField.writeAll(realBufferedSource1.source);
    realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    return realBufferedSource2.bufferField.readByteArray();
  }
  
  @NotNull
  public String readString(@NotNull Charset paramCharset) {
    long l = a ^ 0x27BD4412091EL;
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    realBufferedSource.bufferField.writeAll(this.source);
    realBufferedSource = this;
    bool = false;
    return realBufferedSource.bufferField.readString(paramCharset);
  }
  
  public long readAll(@NotNull Sink paramSink) {
    long l1 = a ^ 0x288E50E5F720L;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    long l2 = 0L;
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    while (realBufferedSource1.source.read(realBufferedSource2.bufferField, 8192L) != -1L) {
      RealBufferedSource realBufferedSource = realBufferedSource1;
      boolean bool = false;
      long l = realBufferedSource.bufferField.completeSegmentByteCount();
      if (l > 0L) {
        l2 += l;
        realBufferedSource = realBufferedSource1;
        bool = false;
        paramSink.write(realBufferedSource.bufferField, l);
      } 
    } 
    realBufferedSource2 = realBufferedSource1;
    bool2 = false;
    if (realBufferedSource2.bufferField.size() > 0L) {
      realBufferedSource2 = realBufferedSource1;
      bool2 = false;
      l2 += realBufferedSource2.bufferField.size();
      realBufferedSource2 = realBufferedSource1;
      bool2 = false;
      realBufferedSource2 = realBufferedSource1;
      bool2 = false;
      paramSink.write(realBufferedSource2.bufferField, realBufferedSource2.bufferField.size());
    } 
    return l2;
  }
  
  public byte readByte() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(1L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readByte();
  }
  
  @NotNull
  public byte[] readByteArray(long paramLong) {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(paramLong);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readByteArray(paramLong);
  }
  
  public long readLongLe() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(8L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readLongLe();
  }
  
  public boolean rangeEquals(long paramLong, @NotNull ByteString paramByteString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/RealBufferedSource.a : J
    //   3: ldc2_w 49045161861667
    //   6: lxor
    //   7: lstore #6
    //   9: aload_3
    //   10: ldc 'bytes'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: astore #8
    //   18: iconst_0
    //   19: istore #9
    //   21: aload #8
    //   23: getfield closed : Z
    //   26: ifne -> 37
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #10
    //   40: iconst_0
    //   41: istore #11
    //   43: iconst_0
    //   44: istore #12
    //   46: iload #10
    //   48: ifne -> 74
    //   51: iconst_0
    //   52: istore #13
    //   54: ldc 'closed'
    //   56: astore #12
    //   58: new java/lang/IllegalStateException
    //   61: dup
    //   62: aload #12
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: checkcast java/lang/Throwable
    //   73: athrow
    //   74: lload_1
    //   75: lconst_0
    //   76: lcmp
    //   77: iflt -> 123
    //   80: iload #4
    //   82: iflt -> 123
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   91: athrow
    //   92: iload #5
    //   94: iflt -> 123
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   103: athrow
    //   104: aload_3
    //   105: invokevirtual size : ()I
    //   108: iload #4
    //   110: isub
    //   111: iload #5
    //   113: if_icmpge -> 131
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: iconst_0
    //   124: goto -> 216
    //   127: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   130: athrow
    //   131: iconst_0
    //   132: istore #10
    //   134: iload #10
    //   136: iload #5
    //   138: if_icmpge -> 215
    //   141: iload #10
    //   143: istore #11
    //   145: iinc #10, 1
    //   148: lload_1
    //   149: iload #11
    //   151: i2l
    //   152: ladd
    //   153: lstore #14
    //   155: aload #8
    //   157: lload #14
    //   159: lconst_1
    //   160: ladd
    //   161: invokevirtual request : (J)Z
    //   164: ifne -> 171
    //   167: iconst_0
    //   168: goto -> 216
    //   171: aload #8
    //   173: astore #16
    //   175: iconst_0
    //   176: istore #17
    //   178: aload #16
    //   180: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   183: lload #14
    //   185: invokevirtual getByte : (J)B
    //   188: aload_3
    //   189: iload #4
    //   191: iload #11
    //   193: iadd
    //   194: invokevirtual getByte : (I)B
    //   197: if_icmpeq -> 208
    //   200: iconst_0
    //   201: goto -> 216
    //   204: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   207: athrow
    //   208: iload #10
    //   210: iload #5
    //   212: if_icmplt -> 141
    //   215: iconst_1
    //   216: ireturn
    // Exception table:
    //   from	to	target	type
    //   21	33	33	java/lang/IllegalArgumentException
    //   74	85	88	java/lang/IllegalArgumentException
    //   80	97	100	java/lang/IllegalArgumentException
    //   92	116	119	java/lang/IllegalArgumentException
    //   104	127	127	java/lang/IllegalArgumentException
    //   178	204	204	java/lang/IllegalArgumentException
  }
  
  public void skip(long paramLong) {
    long l1 = a ^ 0x2240C149D14FL;
    RealBufferedSource realBufferedSource = this;
    boolean bool1 = false;
    long l2 = paramLong;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSource.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    while (l2 > 0L) {
      RealBufferedSource realBufferedSource1 = realBufferedSource;
      bool3 = false;
      if (realBufferedSource1.bufferField.size() == 0L) {
        realBufferedSource1 = realBufferedSource;
        bool3 = false;
        try {
          if (realBufferedSource.source.read(realBufferedSource1.bufferField, 8192L) == -1L)
            throw new EOFException(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
      RealBufferedSource realBufferedSource2 = realBufferedSource;
      boolean bool5 = false;
      long l3 = realBufferedSource2.bufferField.size();
      boolean bool6 = false;
      long l4 = Math.min(l2, l3);
      realBufferedSource2 = realBufferedSource;
      bool5 = false;
      realBufferedSource2.bufferField.skip(l4);
      l2 -= l4;
    } 
  }
  
  public long readDecimalLong() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/RealBufferedSource.a : J
    //   3: ldc2_w 87960527495317
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: astore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: aload_3
    //   14: lconst_1
    //   15: invokevirtual require : (J)V
    //   18: lconst_0
    //   19: lstore #5
    //   21: aload_3
    //   22: lload #5
    //   24: lconst_1
    //   25: ladd
    //   26: invokevirtual request : (J)Z
    //   29: ifeq -> 198
    //   32: aload_3
    //   33: astore #7
    //   35: iconst_0
    //   36: istore #8
    //   38: aload #7
    //   40: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   43: lload #5
    //   45: invokevirtual getByte : (J)B
    //   48: istore #9
    //   50: iload #9
    //   52: bipush #48
    //   54: istore #7
    //   56: iconst_0
    //   57: istore #8
    //   59: iload #7
    //   61: i2b
    //   62: if_icmplt -> 80
    //   65: iload #9
    //   67: bipush #57
    //   69: istore #7
    //   71: iconst_0
    //   72: istore #8
    //   74: iload #7
    //   76: i2b
    //   77: if_icmple -> 182
    //   80: lload #5
    //   82: lconst_0
    //   83: lcmp
    //   84: ifne -> 109
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: iload #9
    //   96: bipush #45
    //   98: istore #7
    //   100: iconst_0
    //   101: istore #8
    //   103: iload #7
    //   105: i2b
    //   106: if_icmpeq -> 182
    //   109: lload #5
    //   111: lconst_0
    //   112: lcmp
    //   113: ifne -> 179
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: new java/lang/NumberFormatException
    //   126: dup
    //   127: ldc_w 'Expected a digit or '-' but was 0x'
    //   130: iload #9
    //   132: istore #7
    //   134: bipush #16
    //   136: istore #8
    //   138: iconst_0
    //   139: istore #10
    //   141: iload #7
    //   143: istore #11
    //   145: iload #8
    //   147: invokestatic checkRadix : (I)I
    //   150: istore #12
    //   152: iconst_0
    //   153: istore #13
    //   155: iload #11
    //   157: iload #12
    //   159: invokestatic checkRadix : (I)I
    //   162: invokestatic toString : (II)Ljava/lang/String;
    //   165: dup
    //   166: ldc_w 'java.lang.Integer.toStri…(this, checkRadix(radix))'
    //   169: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   172: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: athrow
    //   179: goto -> 198
    //   182: lload #5
    //   184: lstore #14
    //   186: lload #14
    //   188: lconst_1
    //   189: ladd
    //   190: lstore #5
    //   192: lload #14
    //   194: pop2
    //   195: goto -> 21
    //   198: aload_3
    //   199: astore #9
    //   201: iconst_0
    //   202: istore #7
    //   204: aload #9
    //   206: getfield bufferField : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   209: invokevirtual readDecimalLong : ()J
    //   212: lreturn
    // Exception table:
    //   from	to	target	type
    //   74	87	90	java/lang/IllegalArgumentException
    //   103	116	119	java/lang/IllegalArgumentException
  }
  
  public int read(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x1CA9FD3FE089L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int readIntLe() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(4L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readIntLe();
  }
  
  @NotNull
  public String readUtf8LineStrict(long paramLong) {
    long l1 = a ^ 0x609D99EDA002L;
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
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
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = (paramLong == Long.MAX_VALUE) ? Long.MAX_VALUE : (paramLong + 1L);
    byte b = 10;
    boolean bool5 = false;
    long l3 = realBufferedSource1.indexOf((byte)b, 0L, l2);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    bool5 = false;
    try {
      if (l2 < Long.MAX_VALUE && realBufferedSource1.request(l2)) {
        realBufferedSource2 = realBufferedSource1;
        bool5 = false;
        byte b1 = 13;
        bool5 = false;
        try {
          RealBufferedSource realBufferedSource = realBufferedSource1;
          bool5 = false;
          byte b2 = 10;
          bool5 = false;
          if (realBufferedSource2.bufferField.getByte(l2 - 1L) == (byte)b1 && realBufferedSource1.request(l2 + 1L) && realBufferedSource.bufferField.getByte(l2) == (byte)b2) {
            RealBufferedSource realBufferedSource3 = realBufferedSource1;
            bool5 = false;
          } else {
            Buffer buffer = new Buffer();
            RealBufferedSource realBufferedSource4 = realBufferedSource1;
            boolean bool7 = false;
            byte b3 = 32;
            RealBufferedSource realBufferedSource5 = realBufferedSource1;
            boolean bool8 = false;
            long l4 = realBufferedSource5.bufferField.size();
            boolean bool9 = false;
            long l5 = b3;
            boolean bool10 = false;
            realBufferedSource4.bufferField.copyTo(buffer, 0L, Math.min(l5, l4));
            RealBufferedSource realBufferedSource3 = realBufferedSource1;
            boolean bool6 = false;
            long l6 = realBufferedSource3.bufferField.size();
            bool8 = false;
            throw new EOFException("\\n not found: limit=" + Math.min(l6, paramLong) + " content=" + buffer.readByteString().hex() + '…');
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        Buffer buffer = new Buffer();
        RealBufferedSource realBufferedSource4 = realBufferedSource1;
        boolean bool7 = false;
        byte b1 = 32;
        RealBufferedSource realBufferedSource5 = realBufferedSource1;
        boolean bool8 = false;
        long l4 = realBufferedSource5.bufferField.size();
        boolean bool9 = false;
        long l5 = b1;
        boolean bool10 = false;
        realBufferedSource4.bufferField.copyTo(buffer, 0L, Math.min(l5, l4));
        RealBufferedSource realBufferedSource3 = realBufferedSource1;
        boolean bool6 = false;
        long l6 = realBufferedSource3.bufferField.size();
        bool8 = false;
        throw new EOFException("\\n not found: limit=" + Math.min(l6, paramLong) + " content=" + buffer.readByteString().hex() + '…');
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (l3 != -1L) ? _BufferKt.readUtf8Line(realBufferedSource2.bufferField, l3) : "JD-Core does not support Kotlin";
  }
  
  public boolean request(long paramLong) {
    long l = a ^ 0x5B442A69E87BL;
    RealBufferedSource realBufferedSource = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramLong >= 0L) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool2 = !realBufferedSource.closed ? true : false;
    bool3 = false;
    bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    while (true) {
      RealBufferedSource realBufferedSource1 = realBufferedSource;
      bool3 = false;
      if (realBufferedSource1.bufferField.size() < paramLong) {
        realBufferedSource1 = realBufferedSource;
        bool3 = false;
        if (realBufferedSource.source.read(realBufferedSource1.bufferField, 8192L) == -1L);
        continue;
      } 
      return true;
    } 
  }
  
  public void readFully(@NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x3095852EC690L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    try {
      realBufferedSource1.require(paramArrayOfbyte.length);
    } catch (EOFException eOFException) {
      int i = 0;
      while (true) {
        RealBufferedSource realBufferedSource = realBufferedSource1;
        boolean bool = false;
        if (realBufferedSource.bufferField.size() > 0L) {
          RealBufferedSource realBufferedSource3 = realBufferedSource1;
          boolean bool3 = false;
          realBufferedSource3 = realBufferedSource1;
          bool3 = false;
          int j = realBufferedSource3.bufferField.read(paramArrayOfbyte, i, (int)realBufferedSource3.bufferField.size());
          try {
            if (j == -1)
              throw new AssertionError(); 
          } catch (EOFException eOFException1) {
            throw a(null);
          } 
          i += j;
          continue;
        } 
        throw eOFException;
      } 
    } 
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    realBufferedSource2.bufferField.readFully(paramArrayOfbyte);
  }
  
  public long indexOf(@NotNull ByteString paramByteString, long paramLong) {
    long l1 = a ^ 0x5945DC2DD857L;
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    RealBufferedSource realBufferedSource = this;
    boolean bool1 = false;
    long l2 = paramLong;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = !realBufferedSource.closed ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    while (true) {
      RealBufferedSource realBufferedSource1 = realBufferedSource;
      boolean bool = false;
      long l = realBufferedSource1.bufferField.indexOf(paramByteString, l2);
      try {
        RealBufferedSource realBufferedSource2 = realBufferedSource;
        boolean bool5 = false;
        long l3 = realBufferedSource2.bufferField.size();
        realBufferedSource2 = realBufferedSource;
        bool5 = false;
        try {
          if (realBufferedSource.source.read(realBufferedSource2.bufferField, 8192L) == -1L) {
          
          } else {
            long l4 = l3 - paramByteString.size() + 1L;
            boolean bool6 = false;
            l2 = Math.max(l2, l4);
            continue;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return (l != -1L) ? l : "JD-Core does not support Kotlin";
    } 
  }
  
  public void readFully(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x75E3D412E55CL;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    try {
      realBufferedSource1.require(paramLong);
    } catch (EOFException eOFException) {
      RealBufferedSource realBufferedSource = realBufferedSource1;
      boolean bool = false;
      paramBuffer.writeAll(realBufferedSource.bufferField);
      throw eOFException;
    } 
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    realBufferedSource2.bufferField.readFully(paramBuffer, paramLong);
  }
  
  public long readLong() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(8L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readLong();
  }
  
  @NotNull
  public BufferedSource peek() {
    RealBufferedSource realBufferedSource = this;
    boolean bool = false;
    return Okio.buffer(new PeekSource(realBufferedSource));
  }
  
  public int readInt() {
    RealBufferedSource realBufferedSource1 = this;
    boolean bool1 = false;
    realBufferedSource1.require(4L);
    RealBufferedSource realBufferedSource2 = realBufferedSource1;
    boolean bool2 = false;
    return realBufferedSource2.bufferField.readInt();
  }
  
  public long indexOf(byte paramByte) {
    return indexOf(paramByte, 0L, Long.MAX_VALUE);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\RealBufferedSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
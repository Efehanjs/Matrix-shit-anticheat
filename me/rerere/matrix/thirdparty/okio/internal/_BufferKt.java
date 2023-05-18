package me.rerere.matrix.thirdparty.okio.internal;

import java.io.EOFException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio.Options;
import me.rerere.matrix.thirdparty.okio.Segment;
import me.rerere.matrix.thirdparty.okio.SegmentPool;
import me.rerere.matrix.thirdparty.okio.SegmentedByteString;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.okio._JvmPlatformKt;
import me.rerere.matrix.thirdparty.okio._UtilKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class _BufferKt {
  @NotNull
  private static final byte[] HEX_DIGIT_BYTES;
  
  public static final long OVERFLOW_DIGIT_START = -7L;
  
  public static final long OVERFLOW_ZONE = -922337203685477580L;
  
  public static final int SEGMENTING_THRESHOLD = 4096;
  
  private static final long a = o3.a(-2325603443224233049L, 7242813081995404238L, MethodHandles.lookup().lookupClass()).a(217022789023466L);
  
  public static final void commonReadFully(@NotNull Buffer paramBuffer1, @NotNull Buffer paramBuffer2, long paramLong) {
    long l = a ^ 0x2BDCE16B2BFDL;
    Intrinsics.checkNotNullParameter(paramBuffer1, "<this>");
    Intrinsics.checkNotNullParameter(paramBuffer2, "sink");
    boolean bool = false;
    try {
      if (paramBuffer1.size() < paramLong) {
        paramBuffer2.write(paramBuffer1, paramBuffer1.size());
        throw new EOFException();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramBuffer2.write(paramBuffer1, paramLong);
  }
  
  public static final void commonWrite(@NotNull Buffer paramBuffer1, @NotNull Buffer paramBuffer2, long paramLong) {
    long l1 = a ^ 0x22438D4D89D8L;
    Intrinsics.checkNotNullParameter(paramBuffer1, "<this>");
    Intrinsics.checkNotNullParameter(paramBuffer2, "source");
    boolean bool1 = false;
    long l2 = paramLong;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramBuffer2 != paramBuffer1) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "source == this";
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    _UtilKt.checkOffsetAndCount(paramBuffer2.size(), 0L, l2);
    while (true) {
      try {
        if (l2 > 0L) {
          try {
            Intrinsics.checkNotNull(paramBuffer2.head);
            Intrinsics.checkNotNull(paramBuffer2.head);
            if (l2 < (paramBuffer2.head.limit - paramBuffer2.head.pos)) {
              try {
                Intrinsics.checkNotNull(paramBuffer1.head);
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              Segment segment1 = (paramBuffer1.head != null) ? paramBuffer1.head.prev : null;
              try {
                if (segment1 != null)
                  try {
                    if (segment1.owner)
                      try {
                        if (l2 + segment1.limit - (segment1.shared ? 0L : segment1.pos) <= 8192L) {
                          Intrinsics.checkNotNull(paramBuffer2.head);
                          paramBuffer2.head.writeTo(segment1, (int)l2);
                          Buffer buffer1 = paramBuffer2;
                          buffer1.setSize$okio(buffer1.size() - l2);
                          buffer1 = paramBuffer1;
                          buffer1.setSize$okio(buffer1.size() + l2);
                          return;
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
              Intrinsics.checkNotNull(paramBuffer2.head);
              paramBuffer2.head = paramBuffer2.head.split((int)l2);
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          Segment segment = paramBuffer2.head;
          Intrinsics.checkNotNull(segment);
          long l = (segment.limit - segment.pos);
          try {
            paramBuffer2.head = segment.pop();
            if (paramBuffer1.head == null) {
              paramBuffer1.head = segment;
              segment.prev = segment;
              segment.next = segment.prev;
            } else {
              Intrinsics.checkNotNull(paramBuffer1.head);
              Segment segment1 = paramBuffer1.head.prev;
              Intrinsics.checkNotNull(segment1);
              segment1 = segment1.push(segment);
              segment1.compact();
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          Buffer buffer = paramBuffer2;
          buffer.setSize$okio(buffer.size() - l);
          buffer = paramBuffer1;
          buffer.setSize$okio(buffer.size() + l);
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
  public static final Buffer commonWrite(@NotNull Buffer paramBuffer, @NotNull Source paramSource, long paramLong) {
    long l1 = a ^ 0x34BE7C3CD631L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramSource, "source");
    boolean bool = false;
    long l2;
    for (l2 = paramLong; l2 > 0L; l2 -= l) {
      long l = paramSource.read(paramBuffer, l2);
      try {
        if (l == -1L)
          throw new EOFException(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return paramBuffer;
  }
  
  @NotNull
  public static final ByteString commonReadByteString(@NotNull Buffer paramBuffer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_BufferKt.a : J
    //   3: ldc2_w 75495274568321
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #5
    //   17: lload_1
    //   18: lconst_0
    //   19: lcmp
    //   20: iflt -> 46
    //   23: lload_1
    //   24: ldc2_w 2147483647
    //   27: lcmp
    //   28: ifgt -> 46
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: iconst_0
    //   47: istore #6
    //   49: iconst_0
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #8
    //   55: iload #6
    //   57: ifne -> 90
    //   60: iconst_0
    //   61: istore #9
    //   63: ldc 'byteCount: '
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
    //   91: invokevirtual size : ()J
    //   94: lload_1
    //   95: lcmp
    //   96: ifge -> 111
    //   99: new java/io/EOFException
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: athrow
    //   107: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   110: athrow
    //   111: lload_1
    //   112: ldc2_w 4096
    //   115: lcmp
    //   116: iflt -> 148
    //   119: aload_0
    //   120: lload_1
    //   121: l2i
    //   122: invokevirtual snapshot : (I)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   125: astore #6
    //   127: iconst_0
    //   128: istore #7
    //   130: iconst_0
    //   131: istore #8
    //   133: aload #6
    //   135: astore #9
    //   137: iconst_0
    //   138: istore #10
    //   140: aload_0
    //   141: lload_1
    //   142: invokevirtual skip : (J)V
    //   145: aload #6
    //   147: areturn
    //   148: new me/rerere/matrix/thirdparty/okio/ByteString
    //   151: dup
    //   152: aload_0
    //   153: lload_1
    //   154: invokevirtual readByteArray : (J)[B
    //   157: invokespecial <init> : ([B)V
    //   160: areturn
    // Exception table:
    //   from	to	target	type
    //   17	31	34	java/lang/IllegalArgumentException
    //   23	42	42	java/lang/IllegalArgumentException
    //   90	107	107	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final byte[] commonReadByteArray(@NotNull Buffer paramBuffer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_BufferKt.a : J
    //   3: ldc2_w 45780823912346
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #5
    //   17: lload_1
    //   18: lconst_0
    //   19: lcmp
    //   20: iflt -> 46
    //   23: lload_1
    //   24: ldc2_w 2147483647
    //   27: lcmp
    //   28: ifgt -> 46
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: iconst_0
    //   47: istore #6
    //   49: iconst_0
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #8
    //   55: iload #6
    //   57: ifne -> 90
    //   60: iconst_0
    //   61: istore #9
    //   63: ldc 'byteCount: '
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
    //   91: invokevirtual size : ()J
    //   94: lload_1
    //   95: lcmp
    //   96: ifge -> 111
    //   99: new java/io/EOFException
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: athrow
    //   107: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   110: athrow
    //   111: lload_1
    //   112: l2i
    //   113: newarray byte
    //   115: astore #6
    //   117: aload_0
    //   118: aload #6
    //   120: invokevirtual readFully : ([B)V
    //   123: aload #6
    //   125: areturn
    // Exception table:
    //   from	to	target	type
    //   17	31	34	java/lang/IllegalArgumentException
    //   23	42	42	java/lang/IllegalArgumentException
    //   90	107	107	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull Buffer paramBuffer, @NotNull Buffer.UnsafeCursor paramUnsafeCursor) {
    long l = a ^ 0x789338F91273L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "unsafeCursor");
    Buffer.UnsafeCursor unsafeCursor = _UtilKt.resolveDefaultParameter(paramUnsafeCursor);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool1 = (unsafeCursor.buffer == null) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = "already attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    unsafeCursor.buffer = paramBuffer;
    unsafeCursor.readWrite = true;
    return unsafeCursor;
  }
  
  public static final void commonSkip(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0xE837C0C3CF8L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    long l2 = paramLong;
    while (l2 > 0L) {
      Segment segment2 = paramBuffer.head;
      try {
        if (segment2 == null)
          throw new EOFException(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Segment segment1 = segment2;
      int j = segment1.limit - segment1.pos;
      boolean bool1 = false;
      long l = j;
      boolean bool2 = false;
      int i = (int)Math.min(l2, l);
      Buffer buffer = paramBuffer;
      buffer.setSize$okio(buffer.size() - i);
      l2 -= i;
      Segment segment3 = segment1;
      segment3.pos += i;
      if (segment1.pos == segment1.limit) {
        paramBuffer.head = segment1.pop();
        SegmentPool.recycle(segment1);
      } 
    } 
  }
  
  public static final int commonRead(@NotNull Buffer paramBuffer, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x177F836DAA5FL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, paramInt1, paramInt2);
    Segment segment2 = paramBuffer.head;
    try {
      if (segment2 == null)
        return -1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Segment segment1 = segment2;
    int j = segment1.limit - segment1.pos;
    boolean bool2 = false;
    int i = Math.min(paramInt2, j);
    ArraysKt.copyInto(segment1.data, paramArrayOfbyte, paramInt1, segment1.pos, segment1.pos + i);
    Segment segment3 = segment1;
    segment3.pos += i;
    Buffer buffer = paramBuffer;
    try {
      buffer.setSize$okio(buffer.size() - i);
      if (segment1.pos == segment1.limit) {
        paramBuffer.head = segment1.pop();
        SegmentPool.recycle(segment1);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return i;
  }
  
  @NotNull
  public static final Buffer commonWrite(@NotNull Buffer paramBuffer, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x561C8767D2B0L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "source");
    boolean bool = false;
    return paramBuffer.write(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static final boolean rangeEquals(@NotNull Segment paramSegment, int paramInt1, @NotNull byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    long l = a ^ 0x454678CAC72EL;
    Intrinsics.checkNotNullParameter(paramSegment, "segment");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "bytes");
    Segment segment = paramSegment;
    int i = paramInt1;
    int j = segment.limit;
    byte[] arrayOfByte = segment.data;
    int k = paramInt2;
    while (true) {
      try {
        if (k < paramInt3) {
          if (i == j) {
            Intrinsics.checkNotNull(segment.next);
            segment = segment.next;
            arrayOfByte = segment.data;
            i = segment.pos;
            j = segment.limit;
          } 
          try {
            if (arrayOfByte[i] != paramArrayOfbyte[k])
              return false; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          int m = i;
          i = m + 1;
          m = k;
          k = m + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return true;
    } 
  }
  
  static {
    long l = a ^ 0x2C2EDF9C54B4L;
    HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
  }
  
  public static final long commonIndexOfElement(@NotNull Buffer paramBuffer, @NotNull ByteString paramByteString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_BufferKt.a : J
    //   3: ldc2_w 138347590497588
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'targetBytes'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: iconst_0
    //   23: istore #6
    //   25: lconst_0
    //   26: lstore #43
    //   28: lload_2
    //   29: lstore #43
    //   31: lload #43
    //   33: lconst_0
    //   34: lcmp
    //   35: iflt -> 46
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: iconst_0
    //   47: istore #7
    //   49: iconst_0
    //   50: istore #8
    //   52: iconst_0
    //   53: istore #9
    //   55: iload #7
    //   57: ifne -> 92
    //   60: iconst_0
    //   61: istore #10
    //   63: ldc_w 'fromIndex < 0: '
    //   66: lload #43
    //   68: invokestatic valueOf : (J)Ljava/lang/Long;
    //   71: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   74: astore #9
    //   76: new java/lang/IllegalArgumentException
    //   79: dup
    //   80: aload #9
    //   82: invokevirtual toString : ()Ljava/lang/String;
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: checkcast java/lang/Throwable
    //   91: athrow
    //   92: aload_0
    //   93: astore #7
    //   95: lload #43
    //   97: lstore #8
    //   99: iconst_0
    //   100: istore #10
    //   102: aload #7
    //   104: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   107: astore #11
    //   109: aload #11
    //   111: ifnonnull -> 136
    //   114: aconst_null
    //   115: ldc2_w -1
    //   118: lstore #12
    //   120: checkcast me/rerere/matrix/thirdparty/okio/Segment
    //   123: astore #14
    //   125: iconst_0
    //   126: istore #15
    //   128: aload #14
    //   130: astore #16
    //   132: ldc2_w -1
    //   135: lreturn
    //   136: aload #11
    //   138: astore #29
    //   140: aload #7
    //   142: invokevirtual size : ()J
    //   145: lload #8
    //   147: lsub
    //   148: lload #8
    //   150: lcmp
    //   151: ifge -> 557
    //   154: aload #7
    //   156: invokevirtual size : ()J
    //   159: lstore #30
    //   161: lload #30
    //   163: lload #8
    //   165: lcmp
    //   166: ifle -> 200
    //   169: aload #29
    //   171: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   174: dup
    //   175: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   178: astore #29
    //   180: lload #30
    //   182: aload #29
    //   184: getfield limit : I
    //   187: aload #29
    //   189: getfield pos : I
    //   192: isub
    //   193: i2l
    //   194: lsub
    //   195: lstore #30
    //   197: goto -> 161
    //   200: aload #29
    //   202: lload #30
    //   204: lstore #12
    //   206: astore #14
    //   208: iconst_0
    //   209: istore #15
    //   211: aload #14
    //   213: astore #16
    //   215: aload #16
    //   217: ifnonnull -> 228
    //   220: ldc2_w -1
    //   223: lreturn
    //   224: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   227: athrow
    //   228: aload #16
    //   230: astore #17
    //   232: lload #12
    //   234: lstore #18
    //   236: aload_1
    //   237: invokevirtual size : ()I
    //   240: iconst_2
    //   241: if_icmpne -> 397
    //   244: aload_1
    //   245: iconst_0
    //   246: invokevirtual getByte : (I)B
    //   249: istore #20
    //   251: aload_1
    //   252: iconst_1
    //   253: invokevirtual getByte : (I)B
    //   256: istore #21
    //   258: lload #18
    //   260: aload_0
    //   261: invokevirtual size : ()J
    //   264: lcmp
    //   265: ifge -> 553
    //   268: aload #17
    //   270: getfield data : [B
    //   273: astore #22
    //   275: aload #17
    //   277: getfield pos : I
    //   280: i2l
    //   281: lload #43
    //   283: ladd
    //   284: lload #18
    //   286: lsub
    //   287: l2i
    //   288: istore #23
    //   290: aload #17
    //   292: getfield limit : I
    //   295: istore #24
    //   297: iload #23
    //   299: iload #24
    //   301: if_icmpge -> 362
    //   304: aload #22
    //   306: iload #23
    //   308: baload
    //   309: istore #25
    //   311: iload #25
    //   313: iload #20
    //   315: if_icmpeq -> 332
    //   318: iload #25
    //   320: iload #21
    //   322: if_icmpne -> 349
    //   325: goto -> 332
    //   328: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   331: athrow
    //   332: iload #23
    //   334: aload #17
    //   336: getfield pos : I
    //   339: isub
    //   340: i2l
    //   341: lload #18
    //   343: ladd
    //   344: lreturn
    //   345: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   348: athrow
    //   349: iload #23
    //   351: istore #26
    //   353: iload #26
    //   355: iconst_1
    //   356: iadd
    //   357: istore #23
    //   359: goto -> 297
    //   362: lload #18
    //   364: aload #17
    //   366: getfield limit : I
    //   369: aload #17
    //   371: getfield pos : I
    //   374: isub
    //   375: i2l
    //   376: ladd
    //   377: lstore #18
    //   379: lload #18
    //   381: lstore #43
    //   383: aload #17
    //   385: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   388: dup
    //   389: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   392: astore #17
    //   394: goto -> 258
    //   397: aload_1
    //   398: invokevirtual internalArray$okio : ()[B
    //   401: astore #20
    //   403: lload #18
    //   405: aload_0
    //   406: invokevirtual size : ()J
    //   409: lcmp
    //   410: ifge -> 553
    //   413: aload #17
    //   415: getfield data : [B
    //   418: astore #21
    //   420: aload #17
    //   422: getfield pos : I
    //   425: i2l
    //   426: lload #43
    //   428: ladd
    //   429: lload #18
    //   431: lsub
    //   432: l2i
    //   433: istore #22
    //   435: aload #17
    //   437: getfield limit : I
    //   440: istore #23
    //   442: iload #22
    //   444: iload #23
    //   446: if_icmpge -> 518
    //   449: aload #21
    //   451: iload #22
    //   453: baload
    //   454: istore #24
    //   456: aload #20
    //   458: astore #25
    //   460: iconst_0
    //   461: istore #26
    //   463: aload #25
    //   465: arraylength
    //   466: istore #27
    //   468: iload #26
    //   470: iload #27
    //   472: if_icmpge -> 505
    //   475: aload #25
    //   477: iload #26
    //   479: baload
    //   480: istore #28
    //   482: iinc #26, 1
    //   485: iload #24
    //   487: iload #28
    //   489: if_icmpne -> 468
    //   492: iload #22
    //   494: aload #17
    //   496: getfield pos : I
    //   499: isub
    //   500: i2l
    //   501: lload #18
    //   503: ladd
    //   504: lreturn
    //   505: iload #22
    //   507: istore #25
    //   509: iload #25
    //   511: iconst_1
    //   512: iadd
    //   513: istore #22
    //   515: goto -> 442
    //   518: lload #18
    //   520: aload #17
    //   522: getfield limit : I
    //   525: aload #17
    //   527: getfield pos : I
    //   530: isub
    //   531: i2l
    //   532: ladd
    //   533: lstore #18
    //   535: lload #18
    //   537: lstore #43
    //   539: aload #17
    //   541: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   544: dup
    //   545: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   548: astore #17
    //   550: goto -> 403
    //   553: ldc2_w -1
    //   556: lreturn
    //   557: lconst_0
    //   558: lstore #30
    //   560: nop
    //   561: lload #30
    //   563: aload #29
    //   565: getfield limit : I
    //   568: aload #29
    //   570: getfield pos : I
    //   573: isub
    //   574: i2l
    //   575: ladd
    //   576: lstore #32
    //   578: lload #32
    //   580: lload #8
    //   582: lcmp
    //   583: ifle -> 593
    //   586: goto -> 611
    //   589: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   592: athrow
    //   593: aload #29
    //   595: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   598: dup
    //   599: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   602: astore #29
    //   604: lload #32
    //   606: lstore #30
    //   608: goto -> 560
    //   611: aload #29
    //   613: lload #30
    //   615: lstore #34
    //   617: astore #36
    //   619: iconst_0
    //   620: istore #17
    //   622: aload #36
    //   624: astore #37
    //   626: aload #37
    //   628: ifnonnull -> 639
    //   631: ldc2_w -1
    //   634: lreturn
    //   635: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   638: athrow
    //   639: aload #37
    //   641: astore #38
    //   643: lload #34
    //   645: lstore #39
    //   647: aload_1
    //   648: invokevirtual size : ()I
    //   651: iconst_2
    //   652: if_icmpne -> 808
    //   655: aload_1
    //   656: iconst_0
    //   657: invokevirtual getByte : (I)B
    //   660: istore #22
    //   662: aload_1
    //   663: iconst_1
    //   664: invokevirtual getByte : (I)B
    //   667: istore #23
    //   669: lload #39
    //   671: aload_0
    //   672: invokevirtual size : ()J
    //   675: lcmp
    //   676: ifge -> 964
    //   679: aload #38
    //   681: getfield data : [B
    //   684: astore #24
    //   686: aload #38
    //   688: getfield pos : I
    //   691: i2l
    //   692: lload #43
    //   694: ladd
    //   695: lload #39
    //   697: lsub
    //   698: l2i
    //   699: istore #25
    //   701: aload #38
    //   703: getfield limit : I
    //   706: istore #26
    //   708: iload #25
    //   710: iload #26
    //   712: if_icmpge -> 773
    //   715: aload #24
    //   717: iload #25
    //   719: baload
    //   720: istore #27
    //   722: iload #27
    //   724: iload #22
    //   726: if_icmpeq -> 743
    //   729: iload #27
    //   731: iload #23
    //   733: if_icmpne -> 760
    //   736: goto -> 743
    //   739: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   742: athrow
    //   743: iload #25
    //   745: aload #38
    //   747: getfield pos : I
    //   750: isub
    //   751: i2l
    //   752: lload #39
    //   754: ladd
    //   755: lreturn
    //   756: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   759: athrow
    //   760: iload #25
    //   762: istore #28
    //   764: iload #28
    //   766: iconst_1
    //   767: iadd
    //   768: istore #25
    //   770: goto -> 708
    //   773: lload #39
    //   775: aload #38
    //   777: getfield limit : I
    //   780: aload #38
    //   782: getfield pos : I
    //   785: isub
    //   786: i2l
    //   787: ladd
    //   788: lstore #39
    //   790: lload #39
    //   792: lstore #43
    //   794: aload #38
    //   796: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   799: dup
    //   800: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   803: astore #38
    //   805: goto -> 669
    //   808: aload_1
    //   809: invokevirtual internalArray$okio : ()[B
    //   812: astore #22
    //   814: lload #39
    //   816: aload_0
    //   817: invokevirtual size : ()J
    //   820: lcmp
    //   821: ifge -> 964
    //   824: aload #38
    //   826: getfield data : [B
    //   829: astore #23
    //   831: aload #38
    //   833: getfield pos : I
    //   836: i2l
    //   837: lload #43
    //   839: ladd
    //   840: lload #39
    //   842: lsub
    //   843: l2i
    //   844: istore #24
    //   846: aload #38
    //   848: getfield limit : I
    //   851: istore #25
    //   853: iload #24
    //   855: iload #25
    //   857: if_icmpge -> 929
    //   860: aload #23
    //   862: iload #24
    //   864: baload
    //   865: istore #26
    //   867: aload #22
    //   869: astore #27
    //   871: iconst_0
    //   872: istore #28
    //   874: aload #27
    //   876: arraylength
    //   877: istore #41
    //   879: iload #28
    //   881: iload #41
    //   883: if_icmpge -> 916
    //   886: aload #27
    //   888: iload #28
    //   890: baload
    //   891: istore #42
    //   893: iinc #28, 1
    //   896: iload #26
    //   898: iload #42
    //   900: if_icmpne -> 879
    //   903: iload #24
    //   905: aload #38
    //   907: getfield pos : I
    //   910: isub
    //   911: i2l
    //   912: lload #39
    //   914: ladd
    //   915: lreturn
    //   916: iload #24
    //   918: istore #27
    //   920: iload #27
    //   922: iconst_1
    //   923: iadd
    //   924: istore #24
    //   926: goto -> 853
    //   929: lload #39
    //   931: aload #38
    //   933: getfield limit : I
    //   936: aload #38
    //   938: getfield pos : I
    //   941: isub
    //   942: i2l
    //   943: ladd
    //   944: lstore #39
    //   946: lload #39
    //   948: lstore #43
    //   950: aload #38
    //   952: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   955: dup
    //   956: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   959: astore #38
    //   961: goto -> 814
    //   964: ldc2_w -1
    //   967: lreturn
    // Exception table:
    //   from	to	target	type
    //   31	42	42	java/lang/IllegalArgumentException
    //   215	224	224	java/lang/IllegalArgumentException
    //   311	325	328	java/lang/IllegalArgumentException
    //   318	345	345	java/lang/IllegalArgumentException
    //   578	589	589	java/lang/IllegalArgumentException
    //   626	635	635	java/lang/IllegalArgumentException
    //   722	736	739	java/lang/IllegalArgumentException
    //   729	756	756	java/lang/IllegalArgumentException
  }
  
  public static final byte commonGet(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x3821CA5C283BL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    _UtilKt.checkOffsetAndCount(paramBuffer.size(), paramLong, 1L);
    Buffer buffer = paramBuffer;
    boolean bool2 = false;
    Segment segment1 = buffer.head;
    if (segment1 == null) {
      long l = -1L;
      Segment segment = (Segment)null;
      boolean bool = false;
      Intrinsics.checkNotNull(segment);
      return segment.data[(int)(segment.pos + paramLong - l)];
    } 
    Segment segment2 = segment1;
    if (buffer.size() - paramLong < paramLong) {
      long l3;
      for (l3 = buffer.size(); l3 > paramLong; l3 -= (segment2.limit - segment2.pos)) {
        Intrinsics.checkNotNull(segment2.prev);
        segment2 = segment2.prev;
      } 
      long l4 = l3;
      Segment segment = segment2;
      boolean bool = false;
      Intrinsics.checkNotNull(segment);
      return segment.data[(int)(segment.pos + paramLong - l4)];
    } 
    for (long l2 = 0L;; l2 = l) {
      long l = l2 + (segment2.limit - segment2.pos);
      try {
        if (l > paramLong) {
          long l3 = l2;
          Segment segment = segment2;
          boolean bool = false;
          Intrinsics.checkNotNull(segment);
          return segment.data[(int)(segment.pos + paramLong - l3)];
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Intrinsics.checkNotNull(segment2.next);
      segment2 = segment2.next;
    } 
  }
  
  @NotNull
  public static final byte[] commonReadByteArray(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x126E636C2907L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    return paramBuffer.readByteArray(paramBuffer.size());
  }
  
  @NotNull
  public static final ByteString commonSnapshot(@NotNull Buffer paramBuffer, int paramInt) {
    long l = a ^ 0x3562EA2205BDL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    try {
      if (paramInt == 0)
        return ByteString.EMPTY; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    _UtilKt.checkOffsetAndCount(paramBuffer.size(), 0L, paramInt);
    int i = 0;
    int j = 0;
    Segment segment = paramBuffer.head;
    while (true) {
      try {
        if (i < paramInt) {
          try {
            Intrinsics.checkNotNull(segment);
            if (segment.limit == segment.pos)
              throw new AssertionError("s.limit == s.pos"); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          i += segment.limit - segment.pos;
          int k = j;
          j = k + 1;
          segment = segment.next;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      byte[][] arrayOfByte = new byte[j][];
      int[] arrayOfInt = new int[j * 2];
      i = 0;
      j = 0;
      for (segment = paramBuffer.head; i < paramInt; segment = segment.next) {
        Intrinsics.checkNotNull(segment);
        arrayOfByte[j] = segment.data;
        i += segment.limit - segment.pos;
        int k = 0;
        arrayOfInt[j] = Math.min(i, paramInt);
        arrayOfInt[j + ((Object[])arrayOfByte).length] = segment.pos;
        segment.shared = true;
        k = j;
        j = k + 1;
      } 
      return (ByteString)new SegmentedByteString(arrayOfByte, arrayOfInt);
    } 
  }
  
  @NotNull
  public static final String commonReadUtf8LineStrict(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x5CDC4C0472CL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
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
    byte b1 = 10;
    byte b2 = 0;
    long l3 = paramBuffer.indexOf((byte)b1, 0L, l2);
    try {
      if (l3 != -1L)
        return readUtf8Line(paramBuffer, l3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    b1 = 13;
    b2 = 0;
    if (l2 < paramBuffer.size() && paramBuffer.getByte(l2 - 1L) == (byte)b1) {
      b1 = 10;
      b2 = 0;
      try {
        if (paramBuffer.getByte(l2) == (byte)b1)
          return readUtf8Line(paramBuffer, l2); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    Buffer buffer = new Buffer();
    b2 = 32;
    long l5 = paramBuffer.size();
    boolean bool6 = false;
    long l6 = b2;
    boolean bool7 = false;
    paramBuffer.copyTo(buffer, 0L, Math.min(l6, l5));
    long l4 = paramBuffer.size();
    boolean bool5 = false;
    throw new EOFException("\\n not found: limit=" + Math.min(l4, paramLong) + " content=" + buffer.readByteString().hex() + '…');
  }
  
  public static final long commonCompleteSegmentByteCount(@NotNull Buffer paramBuffer) {
    long l1 = a ^ 0x3828DFDD853AL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    long l2 = paramBuffer.size();
    try {
      if (l2 == 0L)
        return 0L; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(paramBuffer.head);
    Intrinsics.checkNotNull(paramBuffer.head.prev);
    Segment segment = paramBuffer.head.prev;
    try {
      if (segment.limit < 8192 && segment.owner)
        l2 -= (segment.limit - segment.pos); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return l2;
  }
  
  @NotNull
  public static final Buffer commonWriteUtf8CodePoint(@NotNull Buffer paramBuffer, int paramInt) {
    long l = a ^ 0x51B996E16C30L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    try {
      if (paramInt < 128) {
        paramBuffer.writeByte(paramInt);
      } else if (paramInt < 2048) {
        Segment segment1 = paramBuffer.writableSegment$okio(2);
        segment1.data[segment1.limit] = (byte)(paramInt >> 6 | 0xC0);
        segment1.data[segment1.limit + 1] = (byte)(paramInt & 0x3F | 0x80);
        Segment segment2 = segment1;
        segment2.limit += 2;
        Buffer buffer = paramBuffer;
        buffer.setSize$okio(buffer.size() + 2L);
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
          paramBuffer.writeByte(b);
        } else if (paramInt < 65536) {
          Segment segment1 = paramBuffer.writableSegment$okio(3);
          segment1.data[segment1.limit] = (byte)(paramInt >> 12 | 0xE0);
          segment1.data[segment1.limit + 1] = (byte)(paramInt >> 6 & 0x3F | 0x80);
          segment1.data[segment1.limit + 2] = (byte)(paramInt & 0x3F | 0x80);
          Segment segment2 = segment1;
          segment2.limit += 3;
          Buffer buffer = paramBuffer;
          buffer.setSize$okio(buffer.size() + 3L);
        } else if (paramInt <= 1114111) {
          Segment segment1 = paramBuffer.writableSegment$okio(4);
          segment1.data[segment1.limit] = (byte)(paramInt >> 18 | 0xF0);
          segment1.data[segment1.limit + 1] = (byte)(paramInt >> 12 & 0x3F | 0x80);
          segment1.data[segment1.limit + 2] = (byte)(paramInt >> 6 & 0x3F | 0x80);
          segment1.data[segment1.limit + 3] = (byte)(paramInt & 0x3F | 0x80);
          Segment segment2 = segment1;
          segment2.limit += 4;
          Buffer buffer = paramBuffer;
          buffer.setSize$okio(buffer.size() + 4L);
        } else {
          throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected code point: 0x", _UtilKt.toHexString(paramInt)));
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramBuffer;
  }
  
  public static final void commonReadFully(@NotNull Buffer paramBuffer, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x6613E71D61F7L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    boolean bool = false;
    int i;
    for (i = 0; i < paramArrayOfbyte.length; i += j) {
      int j = paramBuffer.read(paramArrayOfbyte, i, paramArrayOfbyte.length - i);
      try {
        if (j == -1)
          throw new EOFException(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  @NotNull
  public static final Buffer commonWriteInt(@NotNull Buffer paramBuffer, int paramInt) {
    long l = a ^ 0x399FCFD50094L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    Segment segment = paramBuffer.writableSegment$okio(4);
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
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() + 4L);
    return paramBuffer;
  }
  
  @NotNull
  public static final String readUtf8Line(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x20EB9110B32DL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    byte b = 13;
    boolean bool = false;
    String str = paramBuffer.readUtf8(paramLong - 1L);
    paramBuffer.skip(2L);
    str = paramBuffer.readUtf8(paramLong);
    paramBuffer.skip(1L);
    return (paramLong > 0L && paramBuffer.getByte(paramLong - 1L) == (byte)b) ? str : str;
  }
  
  public static final boolean commonEquals(@NotNull Buffer paramBuffer, @Nullable Object paramObject) {
    long l1 = a ^ 0x205FA7BCA582L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    try {
      if (paramBuffer == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Buffer))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramBuffer.size() != ((Buffer)paramObject).size())
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramBuffer.size() == 0L)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(paramBuffer.head);
    Segment segment1 = paramBuffer.head;
    Intrinsics.checkNotNull(((Buffer)paramObject).head);
    Segment segment2 = ((Buffer)paramObject).head;
    int i = segment1.pos;
    int j = segment2.pos;
    long l2 = 0L;
    long l3 = 0L;
    while (l2 < paramBuffer.size()) {
      int k = segment1.limit - i;
      int m = segment2.limit - j;
      boolean bool1 = false;
      l3 = Math.min(k, m);
      long l = 0L;
      if (l < l3)
        do {
          long l4 = l;
          l++;
          int n = i;
          i = n + 1;
          n = j;
          j = n + 1;
          if (segment1.data[n] != segment2.data[n])
            return false; 
        } while (l < l3); 
      if (i == segment1.limit) {
        Intrinsics.checkNotNull(segment1.next);
        segment1 = segment1.next;
        i = segment1.pos;
      } 
      if (j == segment2.limit) {
        Intrinsics.checkNotNull(segment2.next);
        segment2 = segment2.next;
        j = segment2.pos;
      } 
      l2 += l3;
    } 
    return true;
  }
  
  public static final long commonReadAll(@NotNull Buffer paramBuffer, @NotNull Sink paramSink) {
    long l1 = a ^ 0x3005248CAA93L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    boolean bool = false;
    long l2 = paramBuffer.size();
    try {
      if (l2 > 0L)
        paramSink.write(paramBuffer, l2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return l2;
  }
  
  @NotNull
  public static final ByteString commonReadByteString(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x4B0ECE3B2E37L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    return paramBuffer.readByteString(paramBuffer.size());
  }
  
  public static final int commonHashCode(@NotNull Buffer paramBuffer) {
    long l = a ^ 0xDF19BD21962L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    Segment segment2 = paramBuffer.head;
    try {
      if (segment2 == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Segment segment1 = segment2;
    int i = 1;
    while (true) {
      int j = segment1.pos;
      int k = segment1.limit;
      while (j < k) {
        i = 31 * i + segment1.data[j];
        int m = j;
        j = m + 1;
      } 
      Intrinsics.checkNotNull(segment1.next);
      segment1 = segment1.next;
      if (segment1 == paramBuffer.head)
        return i; 
    } 
  }
  
  public static final int commonSelect(@NotNull Buffer paramBuffer, @NotNull Options paramOptions) {
    long l = a ^ 0x7457406EFC03L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramOptions, "options");
    boolean bool = false;
    int i = selectPrefix$default(paramBuffer, paramOptions, false, 2, null);
    try {
      if (i == -1)
        return -1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int j = paramOptions.getByteStrings$okio()[i].size();
    paramBuffer.skip(j);
    return i;
  }
  
  public static final int commonReadUtf8CodePoint(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x53BE922BAE5AL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    try {
      if (paramBuffer.size() == 0L)
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = paramBuffer.getByte(0L);
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
            paramBuffer.skip(1L);
            return 65533;
          } 
        } 
      } 
    } 
    try {
      if (paramBuffer.size() < b)
        throw new EOFException("size < " + b + ": " + paramBuffer.size() + " (to read code point prefixed 0x" + _UtilKt.toHexString(i) + ')'); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    m = 1;
    if (m < b)
      do {
        n = m;
        m++;
        b1 = paramBuffer.getByte(n);
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
          paramBuffer.skip(n);
          return 65533;
        } 
      } while (m < b); 
    try {
      paramBuffer.skip(b);
      try {
        if (55296 <= j) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } else {
        
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (j > 1114111) ? 65533 : (false ? 65533 : ((j < k) ? 65533 : j));
  }
  
  @NotNull
  public static final Segment commonWritableSegment(@NotNull Buffer paramBuffer, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_BufferKt.a : J
    //   3: ldc2_w 37134383321281
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #4
    //   17: iload_1
    //   18: iconst_1
    //   19: if_icmplt -> 44
    //   22: iload_1
    //   23: sipush #8192
    //   26: if_icmpgt -> 44
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   35: athrow
    //   36: iconst_1
    //   37: goto -> 45
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: iconst_0
    //   45: istore #5
    //   47: iconst_0
    //   48: istore #6
    //   50: iconst_0
    //   51: istore #7
    //   53: iload #5
    //   55: ifne -> 82
    //   58: iconst_0
    //   59: istore #8
    //   61: ldc_w 'unexpected capacity'
    //   64: astore #7
    //   66: new java/lang/IllegalArgumentException
    //   69: dup
    //   70: aload #7
    //   72: invokevirtual toString : ()Ljava/lang/String;
    //   75: invokespecial <init> : (Ljava/lang/String;)V
    //   78: checkcast java/lang/Throwable
    //   81: athrow
    //   82: aload_0
    //   83: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   86: ifnonnull -> 117
    //   89: invokestatic take : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   92: astore #5
    //   94: aload_0
    //   95: aload #5
    //   97: putfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   100: aload #5
    //   102: aload #5
    //   104: putfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   107: aload #5
    //   109: aload #5
    //   111: putfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   114: aload #5
    //   116: areturn
    //   117: aload_0
    //   118: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   121: dup
    //   122: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   125: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   128: astore #5
    //   130: aload #5
    //   132: dup
    //   133: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   136: getfield limit : I
    //   139: iload_1
    //   140: iadd
    //   141: sipush #8192
    //   144: if_icmpgt -> 162
    //   147: aload #5
    //   149: getfield owner : Z
    //   152: ifne -> 172
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   161: athrow
    //   162: aload #5
    //   164: invokestatic take : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   167: invokevirtual push : (Lme/rerere/matrix/thirdparty/okio/Segment;)Lme/rerere/matrix/thirdparty/okio/Segment;
    //   170: astore #5
    //   172: aload #5
    //   174: areturn
    // Exception table:
    //   from	to	target	type
    //   17	29	32	java/lang/IllegalArgumentException
    //   22	40	40	java/lang/IllegalArgumentException
    //   130	155	158	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final Buffer commonWriteLong(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x21DE52DD997L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    Segment segment = paramBuffer.writableSegment$okio(8);
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
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() + 8L);
    return paramBuffer;
  }
  
  public static final int commonNext(@NotNull Buffer.UnsafeCursor paramUnsafeCursor) {
    long l = a ^ 0x3DA838E07675L;
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "<this>");
    boolean bool1 = false;
    try {
      Intrinsics.checkNotNull(paramUnsafeCursor.buffer);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramUnsafeCursor.offset != paramUnsafeCursor.buffer.size()) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "no more bytes";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramUnsafeCursor.offset == -1L) ? paramUnsafeCursor.seek(0L) : paramUnsafeCursor.seek(paramUnsafeCursor.offset + (paramUnsafeCursor.end - paramUnsafeCursor.start));
  }
  
  @NotNull
  public static final Buffer commonWriteByte(@NotNull Buffer paramBuffer, int paramInt) {
    long l = a ^ 0x18AB8E1005CAL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    Segment segment1 = paramBuffer.writableSegment$okio(1);
    Segment segment2 = segment1;
    int i = segment2.limit;
    segment2.limit = i + 1;
    segment1.data[i] = (byte)paramInt;
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() + 1L);
    return paramBuffer;
  }
  
  @NotNull
  public static final ByteString commonSnapshot(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x259634864603L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramBuffer.size() <= 2147483647L) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("size > Int.MAX_VALUE: ", Long.valueOf(paramBuffer.size()));
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    return paramBuffer.snapshot((int)paramBuffer.size());
  }
  
  public static final void commonClear(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x611E72180943L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    paramBuffer.skip(paramBuffer.size());
  }
  
  public static final boolean commonRangeEquals(@NotNull Buffer paramBuffer, long paramLong, @NotNull ByteString paramByteString, int paramInt1, int paramInt2) {
    long l = a ^ 0x68645F43E14EL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString, "bytes");
    boolean bool = false;
    try {
      if (paramLong >= 0L)
        try {
          if (paramInt1 >= 0)
            try {
              if (paramInt2 >= 0)
                try {
                  if (paramBuffer.size() - paramLong >= paramInt2)
                    try {
                      if (paramByteString.size() - paramInt1 >= paramInt2) {
                        byte b = 0;
                        if (b < paramInt2)
                          do {
                            byte b1 = b;
                            b++;
                            if (paramBuffer.getByte(paramLong + b1) != paramByteString.getByte(paramInt1 + b1))
                              return false; 
                          } while (b < paramInt2); 
                        return true;
                      } 
                      return false;
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
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
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public static final byte commonReadByte(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x5ADFE5DAC243L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    try {
      if (paramBuffer.size() == 0L)
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(paramBuffer.head);
    Segment segment = paramBuffer.head;
    int i = segment.pos;
    int j = segment.limit;
    byte[] arrayOfByte = segment.data;
    int k = i;
    i = k + 1;
    byte b = arrayOfByte[k];
    Buffer buffer = paramBuffer;
    try {
      buffer.setSize$okio(buffer.size() - 1L);
      if (i == j) {
        paramBuffer.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return b;
  }
  
  @NotNull
  public static final Buffer commonWriteHexadecimalUnsignedLong(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x365FBC02B422L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    long l2 = paramLong;
    if (l2 == 0L) {
      byte b = 48;
      boolean bool1 = false;
      return paramBuffer.writeByte(b);
    } 
    long l3 = l2;
    l3 |= l3 >>> 1L;
    l3 |= l3 >>> 2L;
    l3 |= l3 >>> 4L;
    l3 |= l3 >>> 8L;
    l3 |= l3 >>> 16L;
    l3 |= l3 >>> 32L;
    l3 -= l3 >>> 1L & 0x5555555555555555L;
    l3 = (l3 >>> 2L & 0x3333333333333333L) + (l3 & 0x3333333333333333L);
    l3 = (l3 >>> 4L) + l3 & 0xF0F0F0F0F0F0F0FL;
    l3 += l3 >>> 8L;
    l3 += l3 >>> 16L;
    l3 = (l3 & 0x3FL) + (l3 >>> 32L & 0x3FL);
    int i = (int)((l3 + 3L) / 4L);
    Segment segment1 = paramBuffer.writableSegment$okio(i);
    byte[] arrayOfByte = segment1.data;
    int j = segment1.limit + i - 1;
    int k = segment1.limit;
    while (j >= k) {
      arrayOfByte[j] = getHEX_DIGIT_BYTES()[(int)(l2 & 0xFL)];
      l2 >>>= 4L;
      int m = j;
      j = m + -1;
    } 
    Segment segment2 = segment1;
    segment2.limit += i;
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() + i);
    return paramBuffer;
  }
  
  public static final short commonReadShort(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x2A4A19518F44L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    try {
      if (paramBuffer.size() < 2L)
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(paramBuffer.head);
    Segment segment = paramBuffer.head;
    int i = segment.pos;
    int j = segment.limit;
    if (j - i < 2) {
      byte b = paramBuffer.readByte();
      char c1 = 'ÿ';
      boolean bool = false;
      b = paramBuffer.readByte();
      c1 = 'ÿ';
      bool = false;
      int n = (b & c1) << 8 | b & c1;
      return (short)n;
    } 
    byte[] arrayOfByte = segment.data;
    int m = i;
    i = m + 1;
    m = arrayOfByte[m];
    char c = 'ÿ';
    boolean bool2 = false;
    m = i;
    i = m + 1;
    m = arrayOfByte[m];
    c = 'ÿ';
    bool2 = false;
    int k = (m & c) << 8 | m & c;
    Buffer buffer = paramBuffer;
    try {
      buffer.setSize$okio(buffer.size() - 2L);
      if (i == j) {
        paramBuffer.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (short)k;
  }
  
  @NotNull
  public static final Buffer.UnsafeCursor commonReadUnsafe(@NotNull Buffer paramBuffer, @NotNull Buffer.UnsafeCursor paramUnsafeCursor) {
    long l = a ^ 0x7463A7377238L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "unsafeCursor");
    Buffer.UnsafeCursor unsafeCursor = _UtilKt.resolveDefaultParameter(paramUnsafeCursor);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool1 = (unsafeCursor.buffer == null) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = "already attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    unsafeCursor.buffer = paramBuffer;
    unsafeCursor.readWrite = false;
    return unsafeCursor;
  }
  
  @NotNull
  public static final Buffer commonWriteUtf8(@NotNull Buffer paramBuffer, @NotNull String paramString, int paramInt1, int paramInt2) {
    long l = a ^ 0x173D2DF055D9L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "string");
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
        Segment segment1 = paramBuffer.writableSegment$okio(1);
        byte[] arrayOfByte = segment1.data;
        int m = segment1.limit - i;
        int i1 = 8192 - m;
        boolean bool2 = false;
        int n = Math.min(paramInt2, i1);
        i1 = i;
        i = i1 + 1;
        arrayOfByte[m + i1] = (byte)j;
        while (i < n) {
          i1 = paramString.charAt(i);
          bool2 = false;
          j = i1;
          try {
            if (j >= 128)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          i1 = i;
          i = i1 + 1;
          arrayOfByte[m + i1] = (byte)j;
        } 
        i1 = i + m - segment1.limit;
        Segment segment2 = segment1;
        segment2.limit += i1;
        Buffer buffer = paramBuffer;
        buffer.setSize$okio(buffer.size() + i1);
        continue;
      } 
      if (j < 2048) {
        Segment segment1 = paramBuffer.writableSegment$okio(2);
        segment1.data[segment1.limit] = (byte)(j >> 6 | 0xC0);
        segment1.data[segment1.limit + 1] = (byte)(j & 0x3F | 0x80);
        Segment segment2 = segment1;
        segment2.limit += 2;
        Buffer buffer = paramBuffer;
        buffer.setSize$okio(buffer.size() + 2L);
        int m = i;
        i = m + 1;
        continue;
      } 
      try {
        if (j < 55296 || j > 57343) {
          Segment segment1 = paramBuffer.writableSegment$okio(3);
          segment1.data[segment1.limit] = (byte)(j >> 12 | 0xE0);
          segment1.data[segment1.limit + 1] = (byte)(j >> 6 & 0x3F | 0x80);
          segment1.data[segment1.limit + 2] = (byte)(j & 0x3F | 0x80);
          Segment segment2 = segment1;
          segment2.limit += 3;
          Buffer buffer = paramBuffer;
          buffer.setSize$okio(buffer.size() + 3L);
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
            Segment segment1 = paramBuffer.writableSegment$okio(4);
            segment1.data[segment1.limit] = (byte)(k >> 18 | 0xF0);
            segment1.data[segment1.limit + 1] = (byte)(k >> 12 & 0x3F | 0x80);
            segment1.data[segment1.limit + 2] = (byte)(k >> 6 & 0x3F | 0x80);
            segment1.data[segment1.limit + 3] = (byte)(k & 0x3F | 0x80);
            Segment segment2 = segment1;
            segment2.limit += 4;
            Buffer buffer = paramBuffer;
            buffer.setSize$okio(buffer.size() + 4L);
            i += 2;
            continue;
          } 
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      k = 63;
      bool1 = false;
      paramBuffer.writeByte(k);
      k = i;
    } 
    return paramBuffer;
  }
  
  public static final long commonRead(@NotNull Buffer paramBuffer1, @NotNull Buffer paramBuffer2, long paramLong) {
    long l1 = a ^ 0x29B010D6CF62L;
    Intrinsics.checkNotNullParameter(paramBuffer1, "<this>");
    Intrinsics.checkNotNullParameter(paramBuffer2, "sink");
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
      if (paramBuffer1.size() == 0L)
        return -1L; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (l2 > paramBuffer1.size())
      l2 = paramBuffer1.size(); 
    paramBuffer2.write(paramBuffer1, l2);
    return l2;
  }
  
  @NotNull
  public static final String commonReadUtf8(@NotNull Buffer paramBuffer, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_BufferKt.a : J
    //   3: ldc2_w 38734978390419
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #5
    //   17: lload_1
    //   18: lconst_0
    //   19: lcmp
    //   20: iflt -> 46
    //   23: lload_1
    //   24: ldc2_w 2147483647
    //   27: lcmp
    //   28: ifgt -> 46
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: iconst_0
    //   47: istore #6
    //   49: iconst_0
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #8
    //   55: iload #6
    //   57: ifne -> 90
    //   60: iconst_0
    //   61: istore #9
    //   63: ldc 'byteCount: '
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
    //   91: invokevirtual size : ()J
    //   94: lload_1
    //   95: lcmp
    //   96: ifge -> 111
    //   99: new java/io/EOFException
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: athrow
    //   107: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   110: athrow
    //   111: lload_1
    //   112: lconst_0
    //   113: lcmp
    //   114: ifne -> 125
    //   117: ldc_w ''
    //   120: areturn
    //   121: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
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
    //   150: ifle -> 170
    //   153: aload_0
    //   154: lload_1
    //   155: invokevirtual readByteArray : (J)[B
    //   158: iconst_0
    //   159: iconst_0
    //   160: iconst_3
    //   161: aconst_null
    //   162: invokestatic commonToUtf8String$default : ([BIIILjava/lang/Object;)Ljava/lang/String;
    //   165: areturn
    //   166: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   169: athrow
    //   170: aload #6
    //   172: getfield data : [B
    //   175: aload #6
    //   177: getfield pos : I
    //   180: aload #6
    //   182: getfield pos : I
    //   185: lload_1
    //   186: l2i
    //   187: iadd
    //   188: invokestatic commonToUtf8String : ([BII)Ljava/lang/String;
    //   191: astore #7
    //   193: aload #6
    //   195: astore #8
    //   197: aload #8
    //   199: aload #8
    //   201: getfield pos : I
    //   204: lload_1
    //   205: l2i
    //   206: iadd
    //   207: putfield pos : I
    //   210: aload_0
    //   211: astore #8
    //   213: aload #8
    //   215: aload #8
    //   217: invokevirtual size : ()J
    //   220: lload_1
    //   221: lsub
    //   222: invokevirtual setSize$okio : (J)V
    //   225: aload #6
    //   227: getfield pos : I
    //   230: aload #6
    //   232: getfield limit : I
    //   235: if_icmpne -> 259
    //   238: aload_0
    //   239: aload #6
    //   241: invokevirtual pop : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   244: putfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   247: aload #6
    //   249: invokestatic recycle : (Lme/rerere/matrix/thirdparty/okio/Segment;)V
    //   252: goto -> 259
    //   255: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   258: athrow
    //   259: aload #7
    //   261: areturn
    // Exception table:
    //   from	to	target	type
    //   17	31	34	java/lang/IllegalArgumentException
    //   23	42	42	java/lang/IllegalArgumentException
    //   90	107	107	java/lang/IllegalArgumentException
    //   111	121	121	java/lang/IllegalArgumentException
    //   135	166	166	java/lang/IllegalArgumentException
    //   213	252	255	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final Buffer commonWrite(@NotNull Buffer paramBuffer, @NotNull ByteString paramByteString, int paramInt1, int paramInt2) {
    long l = a ^ 0x680B6113973FL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramByteString, "byteString");
    boolean bool = false;
    paramByteString.write$okio(paramBuffer, paramInt1, paramInt2);
    return paramBuffer;
  }
  
  public static final int selectPrefix(@NotNull Buffer paramBuffer, @NotNull Options paramOptions, boolean paramBoolean) {
    long l = a ^ 0x64543BD9A0ACL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramOptions, "options");
    Segment segment2 = paramBuffer.head;
    try {
      if (segment2 == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return paramBoolean ? -2 : -1;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Segment segment1 = segment2;
    segment2 = segment1;
    byte[] arrayOfByte = segment1.data;
    int i = segment1.pos;
    int j = segment1.limit;
    int[] arrayOfInt = paramOptions.getTrie$okio();
    int k = 0;
    int m = -1;
    while (true) {
      int i1 = k;
      k = i1 + 1;
      int n = arrayOfInt[i1];
      int i2 = k;
      k = i2 + 1;
      i1 = arrayOfInt[i2];
      if (i1 != -1)
        m = i1; 
      i2 = 0;
      try {
        if (segment2 == null)
          break; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (n < 0) {
        int i7 = -1 * n;
        int i8 = k + i7;
        while (true) {
          int i10 = i;
          i = i10 + 1;
          i10 = arrayOfByte[i10];
          char c = 'ÿ';
          boolean bool1 = false;
          int i9 = i10 & c;
          i10 = k;
          k = i10 + 1;
          if (i9 != arrayOfInt[i10])
            return m; 
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          i10 = (k == i8) ? 1 : 0;
          if (i == j) {
            Intrinsics.checkNotNull(segment2);
            Intrinsics.checkNotNull(segment2.next);
            segment2 = segment2.next;
            i = segment2.pos;
            arrayOfByte = segment2.data;
            j = segment2.limit;
            try {
              if (segment2 == segment1) {
                try {
                  if (i10 == 0)
                    break; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                segment2 = null;
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } 
          if (i10 != 0) {
            i2 = arrayOfInt[k];
          } else {
            continue;
          } 
          try {
            if (i2 >= 0)
              return i2; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          break;
        } 
        break;
      } 
      int i3 = n;
      int i5 = i;
      i = i5 + 1;
      i5 = arrayOfByte[i5];
      int i6 = 255;
      boolean bool = false;
      int i4 = i5 & i6;
      i5 = k + i3;
      while (true) {
        try {
          if (k == i5)
            return m; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        if (i4 == arrayOfInt[k]) {
          i2 = arrayOfInt[k + i3];
        } else {
          i6 = k;
          k = i6 + 1;
          continue;
        } 
        if (i == j) {
          Intrinsics.checkNotNull(segment2.next);
          segment2 = segment2.next;
          i = segment2.pos;
          arrayOfByte = segment2.data;
          j = segment2.limit;
          if (segment2 == segment1)
            segment2 = null; 
        } 
        try {
          if (i2 >= 0)
            return i2; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        break;
      } 
      k = -i2;
    } 
    try {
      if (paramBoolean)
        return -2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return m;
  }
  
  public static final long commonIndexOf(@NotNull Buffer paramBuffer, @NotNull ByteString paramByteString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_BufferKt.a : J
    //   3: ldc2_w 138883697551775
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 'bytes'
    //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   22: iconst_0
    //   23: istore #6
    //   25: lconst_0
    //   26: lstore #60
    //   28: lload_2
    //   29: lstore #60
    //   31: aload_1
    //   32: invokevirtual size : ()I
    //   35: ifle -> 46
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: iconst_0
    //   47: istore #7
    //   49: iconst_0
    //   50: istore #8
    //   52: iconst_0
    //   53: istore #9
    //   55: iload #7
    //   57: ifne -> 84
    //   60: iconst_0
    //   61: istore #10
    //   63: ldc_w 'bytes is empty'
    //   66: astore #9
    //   68: new java/lang/IllegalArgumentException
    //   71: dup
    //   72: aload #9
    //   74: invokevirtual toString : ()Ljava/lang/String;
    //   77: invokespecial <init> : (Ljava/lang/String;)V
    //   80: checkcast java/lang/Throwable
    //   83: athrow
    //   84: lload #60
    //   86: lconst_0
    //   87: lcmp
    //   88: iflt -> 99
    //   91: iconst_1
    //   92: goto -> 100
    //   95: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   98: athrow
    //   99: iconst_0
    //   100: istore #7
    //   102: iconst_0
    //   103: istore #8
    //   105: iconst_0
    //   106: istore #9
    //   108: iload #7
    //   110: ifne -> 145
    //   113: iconst_0
    //   114: istore #10
    //   116: ldc_w 'fromIndex < 0: '
    //   119: lload #60
    //   121: invokestatic valueOf : (J)Ljava/lang/Long;
    //   124: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   127: astore #9
    //   129: new java/lang/IllegalArgumentException
    //   132: dup
    //   133: aload #9
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: invokespecial <init> : (Ljava/lang/String;)V
    //   141: checkcast java/lang/Throwable
    //   144: athrow
    //   145: aload_0
    //   146: astore #7
    //   148: lload #60
    //   150: lstore #8
    //   152: iconst_0
    //   153: istore #10
    //   155: aload #7
    //   157: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   160: astore #11
    //   162: aload #11
    //   164: ifnonnull -> 189
    //   167: aconst_null
    //   168: ldc2_w -1
    //   171: lstore #12
    //   173: checkcast me/rerere/matrix/thirdparty/okio/Segment
    //   176: astore #14
    //   178: iconst_0
    //   179: istore #15
    //   181: aload #14
    //   183: astore #16
    //   185: ldc2_w -1
    //   188: lreturn
    //   189: aload #11
    //   191: astore #35
    //   193: aload #7
    //   195: invokevirtual size : ()J
    //   198: lload #8
    //   200: lsub
    //   201: lload #8
    //   203: lcmp
    //   204: ifge -> 496
    //   207: aload #7
    //   209: invokevirtual size : ()J
    //   212: lstore #36
    //   214: lload #36
    //   216: lload #8
    //   218: lcmp
    //   219: ifle -> 253
    //   222: aload #35
    //   224: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   227: dup
    //   228: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   231: astore #35
    //   233: lload #36
    //   235: aload #35
    //   237: getfield limit : I
    //   240: aload #35
    //   242: getfield pos : I
    //   245: isub
    //   246: i2l
    //   247: lsub
    //   248: lstore #36
    //   250: goto -> 214
    //   253: aload #35
    //   255: lload #36
    //   257: lstore #12
    //   259: astore #14
    //   261: iconst_0
    //   262: istore #15
    //   264: aload #14
    //   266: astore #16
    //   268: aload #16
    //   270: ifnonnull -> 281
    //   273: ldc2_w -1
    //   276: lreturn
    //   277: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   280: athrow
    //   281: aload #16
    //   283: astore #17
    //   285: lload #12
    //   287: lstore #18
    //   289: aload_1
    //   290: invokevirtual internalArray$okio : ()[B
    //   293: astore #20
    //   295: aload #20
    //   297: iconst_0
    //   298: baload
    //   299: istore #21
    //   301: aload_1
    //   302: invokevirtual size : ()I
    //   305: istore #22
    //   307: aload_0
    //   308: invokevirtual size : ()J
    //   311: iload #22
    //   313: i2l
    //   314: lsub
    //   315: lconst_1
    //   316: ladd
    //   317: lstore #23
    //   319: lload #18
    //   321: lload #23
    //   323: lcmp
    //   324: ifge -> 492
    //   327: aload #17
    //   329: getfield data : [B
    //   332: astore #25
    //   334: aload #17
    //   336: getfield limit : I
    //   339: istore #26
    //   341: aload #17
    //   343: getfield pos : I
    //   346: i2l
    //   347: lload #23
    //   349: ladd
    //   350: lload #18
    //   352: lsub
    //   353: lstore #27
    //   355: iconst_0
    //   356: istore #29
    //   358: iload #26
    //   360: i2l
    //   361: lstore #30
    //   363: iconst_0
    //   364: istore #32
    //   366: lload #30
    //   368: lload #27
    //   370: invokestatic min : (JJ)J
    //   373: nop
    //   374: l2i
    //   375: istore #33
    //   377: aload #17
    //   379: getfield pos : I
    //   382: i2l
    //   383: lload #60
    //   385: ladd
    //   386: lload #18
    //   388: lsub
    //   389: l2i
    //   390: istore #26
    //   392: iload #26
    //   394: iload #33
    //   396: if_icmpge -> 457
    //   399: iload #26
    //   401: istore #34
    //   403: iinc #26, 1
    //   406: aload #25
    //   408: iload #34
    //   410: baload
    //   411: iload #21
    //   413: if_icmpne -> 450
    //   416: aload #17
    //   418: iload #34
    //   420: iconst_1
    //   421: iadd
    //   422: aload #20
    //   424: iconst_1
    //   425: iload #22
    //   427: invokestatic rangeEquals : (Lme/rerere/matrix/thirdparty/okio/Segment;I[BII)Z
    //   430: ifeq -> 450
    //   433: iload #34
    //   435: aload #17
    //   437: getfield pos : I
    //   440: isub
    //   441: i2l
    //   442: lload #18
    //   444: ladd
    //   445: lreturn
    //   446: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   449: athrow
    //   450: iload #26
    //   452: iload #33
    //   454: if_icmplt -> 399
    //   457: lload #18
    //   459: aload #17
    //   461: getfield limit : I
    //   464: aload #17
    //   466: getfield pos : I
    //   469: isub
    //   470: i2l
    //   471: ladd
    //   472: lstore #18
    //   474: lload #18
    //   476: lstore #60
    //   478: aload #17
    //   480: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   483: dup
    //   484: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   487: astore #17
    //   489: goto -> 319
    //   492: ldc2_w -1
    //   495: lreturn
    //   496: lconst_0
    //   497: lstore #36
    //   499: nop
    //   500: lload #36
    //   502: aload #35
    //   504: getfield limit : I
    //   507: aload #35
    //   509: getfield pos : I
    //   512: isub
    //   513: i2l
    //   514: ladd
    //   515: lstore #38
    //   517: lload #38
    //   519: lload #8
    //   521: lcmp
    //   522: ifle -> 532
    //   525: goto -> 550
    //   528: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   531: athrow
    //   532: aload #35
    //   534: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   537: dup
    //   538: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   541: astore #35
    //   543: lload #38
    //   545: lstore #36
    //   547: goto -> 499
    //   550: aload #35
    //   552: lload #36
    //   554: lstore #40
    //   556: astore #42
    //   558: iconst_0
    //   559: istore #17
    //   561: aload #42
    //   563: astore #43
    //   565: aload #43
    //   567: ifnonnull -> 578
    //   570: ldc2_w -1
    //   573: lreturn
    //   574: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   577: athrow
    //   578: aload #43
    //   580: astore #44
    //   582: lload #40
    //   584: lstore #45
    //   586: aload_1
    //   587: invokevirtual internalArray$okio : ()[B
    //   590: astore #22
    //   592: aload #22
    //   594: iconst_0
    //   595: baload
    //   596: istore #47
    //   598: aload_1
    //   599: invokevirtual size : ()I
    //   602: istore #48
    //   604: aload_0
    //   605: invokevirtual size : ()J
    //   608: iload #48
    //   610: i2l
    //   611: lsub
    //   612: lconst_1
    //   613: ladd
    //   614: lstore #49
    //   616: lload #45
    //   618: lload #49
    //   620: lcmp
    //   621: ifge -> 789
    //   624: aload #44
    //   626: getfield data : [B
    //   629: astore #51
    //   631: aload #44
    //   633: getfield limit : I
    //   636: istore #52
    //   638: aload #44
    //   640: getfield pos : I
    //   643: i2l
    //   644: lload #49
    //   646: ladd
    //   647: lload #45
    //   649: lsub
    //   650: lstore #53
    //   652: iconst_0
    //   653: istore #55
    //   655: iload #52
    //   657: i2l
    //   658: lstore #56
    //   660: iconst_0
    //   661: istore #34
    //   663: lload #56
    //   665: lload #53
    //   667: invokestatic min : (JJ)J
    //   670: nop
    //   671: l2i
    //   672: istore #58
    //   674: aload #44
    //   676: getfield pos : I
    //   679: i2l
    //   680: lload #60
    //   682: ladd
    //   683: lload #45
    //   685: lsub
    //   686: l2i
    //   687: istore #52
    //   689: iload #52
    //   691: iload #58
    //   693: if_icmpge -> 754
    //   696: iload #52
    //   698: istore #59
    //   700: iinc #52, 1
    //   703: aload #51
    //   705: iload #59
    //   707: baload
    //   708: iload #47
    //   710: if_icmpne -> 747
    //   713: aload #44
    //   715: iload #59
    //   717: iconst_1
    //   718: iadd
    //   719: aload #22
    //   721: iconst_1
    //   722: iload #48
    //   724: invokestatic rangeEquals : (Lme/rerere/matrix/thirdparty/okio/Segment;I[BII)Z
    //   727: ifeq -> 747
    //   730: iload #59
    //   732: aload #44
    //   734: getfield pos : I
    //   737: isub
    //   738: i2l
    //   739: lload #45
    //   741: ladd
    //   742: lreturn
    //   743: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   746: athrow
    //   747: iload #52
    //   749: iload #58
    //   751: if_icmplt -> 696
    //   754: lload #45
    //   756: aload #44
    //   758: getfield limit : I
    //   761: aload #44
    //   763: getfield pos : I
    //   766: isub
    //   767: i2l
    //   768: ladd
    //   769: lstore #45
    //   771: lload #45
    //   773: lstore #60
    //   775: aload #44
    //   777: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   780: dup
    //   781: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   784: astore #44
    //   786: goto -> 616
    //   789: ldc2_w -1
    //   792: lreturn
    // Exception table:
    //   from	to	target	type
    //   31	42	42	java/lang/IllegalArgumentException
    //   84	95	95	java/lang/IllegalArgumentException
    //   268	277	277	java/lang/IllegalArgumentException
    //   416	446	446	java/lang/IllegalArgumentException
    //   517	528	528	java/lang/IllegalArgumentException
    //   565	574	574	java/lang/IllegalArgumentException
    //   713	743	743	java/lang/IllegalArgumentException
  }
  
  public static final long commonResizeBuffer(@NotNull Buffer.UnsafeCursor paramUnsafeCursor, long paramLong) {
    long l1 = a ^ 0x4DD042D89476L;
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "<this>");
    boolean bool1 = false;
    Buffer buffer2 = paramUnsafeCursor.buffer;
    boolean bool2 = false;
    boolean bool3 = false;
    if (buffer2 == null) {
      boolean bool4 = false;
      String str = "not attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    Buffer buffer1 = buffer2;
    boolean bool = paramUnsafeCursor.readWrite;
    bool2 = false;
    bool3 = false;
    if (!bool) {
      boolean bool4 = false;
      String str = "resizeBuffer() only permitted for read/write buffers";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    long l2 = buffer1.size();
    try {
      if (paramLong <= l2) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        bool3 = (paramLong >= 0L) ? true : false;
        boolean bool4 = false;
        boolean bool5 = false;
        if (!bool3) {
          boolean bool6 = false;
          String str = Intrinsics.stringPlus("newSize < 0: ", Long.valueOf(paramLong));
          throw (Throwable)new IllegalArgumentException(str.toString());
        } 
        long l = l2 - paramLong;
        while (l > 0L) {
          Intrinsics.checkNotNull(buffer1.head);
          Segment segment1 = buffer1.head.prev;
          Intrinsics.checkNotNull(segment1);
          int i = segment1.limit - segment1.pos;
          if (i <= l) {
            buffer1.head = segment1.pop();
            SegmentPool.recycle(segment1);
            l -= i;
            continue;
          } 
          Segment segment2 = segment1;
          segment2.limit -= (int)l;
        } 
        paramUnsafeCursor.setSegment$okio(null);
        paramUnsafeCursor.offset = paramLong;
        paramUnsafeCursor.data = null;
        paramUnsafeCursor.start = -1;
        paramUnsafeCursor.end = -1;
      } else if (paramLong > l2) {
        bool3 = true;
        long l = paramLong - l2;
        while (l > 0L) {
          Segment segment1 = buffer1.writableSegment$okio(1);
          int j = 8192 - segment1.limit;
          boolean bool4 = false;
          long l3 = j;
          boolean bool5 = false;
          int i = (int)Math.min(l, l3);
          Segment segment2 = segment1;
          segment2.limit += i;
          l -= i;
          if (bool3) {
            paramUnsafeCursor.setSegment$okio(segment1);
            paramUnsafeCursor.offset = l2;
            paramUnsafeCursor.data = segment1.data;
            paramUnsafeCursor.start = segment1.limit - i;
            paramUnsafeCursor.end = segment1.limit;
            bool3 = false;
          } 
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    buffer1.setSize$okio(paramLong);
    return l2;
  }
  
  public static final long commonExpandBuffer(@NotNull Buffer.UnsafeCursor paramUnsafeCursor, int paramInt) {
    long l1 = a ^ 0x33CBACF1A6F3L;
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "<this>");
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramInt > 0) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool6 = false;
      String str = Intrinsics.stringPlus("minByteCount <= 0: ", Integer.valueOf(paramInt));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    bool2 = (paramInt <= 8192) ? true : false;
    bool3 = false;
    bool4 = false;
    if (!bool2) {
      boolean bool6 = false;
      String str = Intrinsics.stringPlus("minByteCount > Segment.SIZE: ", Integer.valueOf(paramInt));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    Buffer buffer2 = paramUnsafeCursor.buffer;
    bool4 = false;
    boolean bool5 = false;
    if (buffer2 == null) {
      boolean bool6 = false;
      String str = "not attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    Buffer buffer1 = buffer2;
    boolean bool = paramUnsafeCursor.readWrite;
    bool4 = false;
    bool5 = false;
    if (!bool) {
      boolean bool6 = false;
      String str = "expandBuffer() only permitted for read/write buffers";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    long l2 = buffer1.size();
    Segment segment = buffer1.writableSegment$okio(paramInt);
    int i = 8192 - segment.limit;
    segment.limit = 8192;
    buffer1.setSize$okio(l2 + i);
    paramUnsafeCursor.setSegment$okio(segment);
    paramUnsafeCursor.offset = l2;
    paramUnsafeCursor.data = segment.data;
    paramUnsafeCursor.start = 8192 - i;
    paramUnsafeCursor.end = 8192;
    return i;
  }
  
  @NotNull
  public static final Buffer commonWriteShort(@NotNull Buffer paramBuffer, int paramInt) {
    long l = a ^ 0x4535AF91C891L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    Segment segment = paramBuffer.writableSegment$okio(2);
    byte[] arrayOfByte = segment.data;
    int i = segment.limit;
    int j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt >>> 8 & 0xFF);
    j = i;
    i = j + 1;
    arrayOfByte[j] = (byte)(paramInt & 0xFF);
    segment.limit = i;
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() + 2L);
    return paramBuffer;
  }
  
  @NotNull
  public static final Buffer commonWrite(@NotNull Buffer paramBuffer, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = a ^ 0x47442E5A6346L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "source");
    boolean bool = false;
    int i = paramInt1;
    _UtilKt.checkOffsetAndCount(paramArrayOfbyte.length, i, paramInt2);
    int j = i + paramInt2;
    while (i < j) {
      Segment segment1 = paramBuffer.writableSegment$okio(1);
      int m = j - i;
      int n = 8192 - segment1.limit;
      boolean bool1 = false;
      int k = Math.min(m, n);
      ArraysKt.copyInto(paramArrayOfbyte, segment1.data, segment1.limit, i, i + k);
      i += k;
      Segment segment2 = segment1;
      segment2.limit += k;
    } 
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() + paramInt2);
    return paramBuffer;
  }
  
  public static final long commonReadHexadecimalUnsignedLong(@NotNull Buffer paramBuffer) {
    long l1 = a ^ 0x7E7A2BCCA13AL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    try {
      if (paramBuffer.size() == 0L)
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = 0L;
    int i = 0;
    boolean bool2 = false;
    while (true) {
      Intrinsics.checkNotNull(paramBuffer.head);
      Segment segment = paramBuffer.head;
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
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              bool2 = true;
              break;
            } 
          } 
        } 
        if ((l2 & 0xF000000000000000L) != 0L) {
          Buffer buffer1 = (new Buffer()).writeHexadecimalUnsignedLong(l2).writeByte(b);
          throw new NumberFormatException(Intrinsics.stringPlus("Number too large: ", buffer1.readUtf8()));
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
          paramBuffer.head = segment.pop();
          SegmentPool.recycle(segment);
        } else {
          segment.pos = j;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      try {
        if (bool2 || paramBuffer.head == null)
          break; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() - i);
    return l2;
  }
  
  public static final long commonWriteAll(@NotNull Buffer paramBuffer, @NotNull Source paramSource) {
    long l1 = a ^ 0x742D93D5B009L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramSource, "source");
    boolean bool = false;
    for (long l2 = 0L;; l2 += l) {
      long l = paramSource.read(paramBuffer, 8192L);
      try {
        if (l == -1L)
          return l2; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public static final Object seek(@NotNull Buffer paramBuffer, long paramLong, @NotNull Function2 paramFunction2) {
    long l1 = a ^ 0x3319B94BCD2L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "lambda");
    boolean bool = false;
    Segment segment2 = paramBuffer.head;
    try {
      if (segment2 == null)
        return paramFunction2.invoke(null, Long.valueOf(-1L)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Segment segment1 = segment2;
    if (paramBuffer.size() - paramLong < paramLong) {
      long l;
      for (l = paramBuffer.size(); l > paramLong; l -= (segment1.limit - segment1.pos)) {
        Intrinsics.checkNotNull(segment1.prev);
        segment1 = segment1.prev;
      } 
      return paramFunction2.invoke(segment1, Long.valueOf(l));
    } 
    for (long l2 = 0L;; l2 = l) {
      long l = l2 + (segment1.limit - segment1.pos);
      try {
        if (l > paramLong)
          return paramFunction2.invoke(segment1, Long.valueOf(l2)); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Intrinsics.checkNotNull(segment1.next);
      segment1 = segment1.next;
    } 
  }
  
  @Nullable
  public static final String commonReadUtf8Line(@NotNull Buffer paramBuffer) {
    long l1 = a ^ 0x26BD2B9139CBL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    byte b = 10;
    boolean bool2 = false;
    long l2 = paramBuffer.indexOf((byte)b);
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (l2 != -1L) ? readUtf8Line(paramBuffer, l2) : ((paramBuffer.size() != 0L) ? paramBuffer.readUtf8(paramBuffer.size()) : null);
  }
  
  public static final void commonClose(@NotNull Buffer.UnsafeCursor paramUnsafeCursor) {
    long l = a ^ 0x2ABD7FD58E30L;
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "<this>");
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (paramUnsafeCursor.buffer != null) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "not attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    paramUnsafeCursor.buffer = null;
    paramUnsafeCursor.setSegment$okio(null);
    paramUnsafeCursor.offset = -1L;
    paramUnsafeCursor.data = null;
    paramUnsafeCursor.start = -1;
    paramUnsafeCursor.end = -1;
  }
  
  @NotNull
  public static final Buffer commonCopyTo(@NotNull Buffer paramBuffer1, @NotNull Buffer paramBuffer2, long paramLong1, long paramLong2) {
    long l1 = a ^ 0x235DB188648FL;
    Intrinsics.checkNotNullParameter(paramBuffer1, "<this>");
    Intrinsics.checkNotNullParameter(paramBuffer2, "out");
    boolean bool = false;
    long l2 = paramLong1;
    long l3 = paramLong2;
    try {
      _UtilKt.checkOffsetAndCount(paramBuffer1.size(), l2, l3);
      if (l3 == 0L)
        return paramBuffer1; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Buffer buffer = paramBuffer2;
    buffer.setSize$okio(buffer.size() + l3);
    Segment segment = paramBuffer1.head;
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
        if (paramBuffer2.head == null) {
          segment1.prev = segment1;
          segment1.next = segment1.prev;
          paramBuffer2.head = segment1.next;
        } else {
          Intrinsics.checkNotNull(paramBuffer2.head);
          Intrinsics.checkNotNull(paramBuffer2.head.prev);
          paramBuffer2.head.prev.push(segment1);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      l3 -= (segment1.limit - segment1.pos);
      l2 = 0L;
      segment = segment.next;
    } 
    return paramBuffer1;
  }
  
  public static final int commonSeek(@NotNull Buffer.UnsafeCursor paramUnsafeCursor, long paramLong) {
    long l = a ^ 0x53826D7C5885L;
    Intrinsics.checkNotNullParameter(paramUnsafeCursor, "<this>");
    boolean bool1 = false;
    Buffer buffer2 = paramUnsafeCursor.buffer;
    boolean bool2 = false;
    boolean bool3 = false;
    if (buffer2 == null) {
      boolean bool = false;
      String str = "not attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    Buffer buffer1 = buffer2;
    try {
      if (paramLong >= -1L) {
        try {
          if (paramLong > buffer1.size())
            throw new ArrayIndexOutOfBoundsException("offset=" + paramLong + " > size=" + buffer1.size()); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } else {
        throw new ArrayIndexOutOfBoundsException("offset=" + paramLong + " > size=" + buffer1.size());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramLong != -1L)
        try {
          if (paramLong != buffer1.size()) {
            long l1 = 0L;
            long l2 = buffer1.size();
            Segment segment1 = buffer1.head;
            Segment segment2 = buffer1.head;
            if (paramUnsafeCursor.getSegment$okio() != null) {
              Intrinsics.checkNotNull(paramUnsafeCursor.getSegment$okio());
              long l4 = paramUnsafeCursor.offset - (paramUnsafeCursor.start - (paramUnsafeCursor.getSegment$okio()).pos);
              if (l4 > paramLong) {
                l2 = l4;
                segment2 = paramUnsafeCursor.getSegment$okio();
              } else {
                l1 = l4;
                segment1 = paramUnsafeCursor.getSegment$okio();
              } 
            } 
            Segment segment3 = null;
            long l3 = 0L;
            if (l2 - paramLong > paramLong - l1) {
              segment3 = segment1;
              l3 = l1;
              Intrinsics.checkNotNull(segment3);
              while (paramLong >= l3 + (segment3.limit - segment3.pos)) {
                l3 += (segment3.limit - segment3.pos);
                segment3 = segment3.next;
              } 
            } else {
              segment3 = segment2;
              for (l3 = l2; l3 > paramLong; l3 -= (segment3.limit - segment3.pos)) {
                Intrinsics.checkNotNull(segment3);
                segment3 = segment3.prev;
                Intrinsics.checkNotNull(segment3);
              } 
            } 
            try {
              Intrinsics.checkNotNull(segment3);
              if (paramUnsafeCursor.readWrite && segment3.shared) {
                Segment segment = segment3.unsharedCopy();
                try {
                  if (buffer1.head == segment3)
                    buffer1.head = segment; 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                segment3 = segment3.push(segment);
                Intrinsics.checkNotNull(segment3.prev);
                segment3.prev.pop();
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            paramUnsafeCursor.setSegment$okio(segment3);
            paramUnsafeCursor.offset = paramLong;
            Intrinsics.checkNotNull(segment3);
            paramUnsafeCursor.data = segment3.data;
            paramUnsafeCursor.start = segment3.pos + (int)(paramLong - l3);
            paramUnsafeCursor.end = segment3.limit;
            return paramUnsafeCursor.end - paramUnsafeCursor.start;
          } 
          paramUnsafeCursor.setSegment$okio(null);
          paramUnsafeCursor.offset = paramLong;
          paramUnsafeCursor.data = null;
          paramUnsafeCursor.start = -1;
          paramUnsafeCursor.end = -1;
          return -1;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    paramUnsafeCursor.setSegment$okio(null);
    paramUnsafeCursor.offset = paramLong;
    paramUnsafeCursor.data = null;
    paramUnsafeCursor.start = -1;
    paramUnsafeCursor.end = -1;
    return -1;
  }
  
  public static final int commonReadInt(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x4F101F459AE0L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    try {
      if (paramBuffer.size() < 4L)
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(paramBuffer.head);
    Segment segment = paramBuffer.head;
    int i = segment.pos;
    int j = segment.limit;
    if ((j - i) < 4L) {
      byte b = paramBuffer.readByte();
      char c1 = 'ÿ';
      boolean bool = false;
      b = paramBuffer.readByte();
      c1 = 'ÿ';
      bool = false;
      b = paramBuffer.readByte();
      c1 = 'ÿ';
      bool = false;
      b = paramBuffer.readByte();
      c1 = 'ÿ';
      bool = false;
      return (b & c1) << 24 | (b & c1) << 16 | (b & c1) << 8 | b & c1;
    } 
    byte[] arrayOfByte = segment.data;
    int m = i;
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
    int k = (m & c) << 24 | (m & c) << 16 | (m & c) << 8 | m & c;
    Buffer buffer = paramBuffer;
    try {
      buffer.setSize$okio(buffer.size() - 4L);
      if (i == j) {
        paramBuffer.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return k;
  }
  
  public static final long commonReadLong(@NotNull Buffer paramBuffer) {
    long l1 = a ^ 0x63CC1739D72CL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    try {
      if (paramBuffer.size() < 8L)
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(paramBuffer.head);
    Segment segment = paramBuffer.head;
    int i = segment.pos;
    int j = segment.limit;
    if ((j - i) < 8L) {
      int m = paramBuffer.readInt();
      long l = 4294967295L;
      boolean bool = false;
      m = paramBuffer.readInt();
      l = 4294967295L;
      bool = false;
      return (m & l) << 32L | m & l;
    } 
    byte[] arrayOfByte = segment.data;
    int k = i;
    i = k + 1;
    k = arrayOfByte[k];
    long l3 = 255L;
    boolean bool2 = false;
    k = i;
    i = k + 1;
    k = arrayOfByte[k];
    l3 = 255L;
    bool2 = false;
    k = i;
    i = k + 1;
    k = arrayOfByte[k];
    l3 = 255L;
    bool2 = false;
    k = i;
    i = k + 1;
    k = arrayOfByte[k];
    l3 = 255L;
    bool2 = false;
    k = i;
    i = k + 1;
    k = arrayOfByte[k];
    l3 = 255L;
    bool2 = false;
    k = i;
    i = k + 1;
    k = arrayOfByte[k];
    l3 = 255L;
    bool2 = false;
    k = i;
    i = k + 1;
    k = arrayOfByte[k];
    l3 = 255L;
    bool2 = false;
    k = i;
    i = k + 1;
    k = arrayOfByte[k];
    l3 = 255L;
    bool2 = false;
    long l2 = (k & l3) << 56L | (k & l3) << 48L | (k & l3) << 40L | (k & l3) << 32L | (k & l3) << 24L | (k & l3) << 16L | (k & l3) << 8L | k & l3;
    Buffer buffer = paramBuffer;
    try {
      buffer.setSize$okio(buffer.size() - 8L);
      if (i == j) {
        paramBuffer.head = segment.pop();
        SegmentPool.recycle(segment);
      } else {
        segment.pos = i;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return l2;
  }
  
  @NotNull
  public static final byte[] getHEX_DIGIT_BYTES() {
    return HEX_DIGIT_BYTES;
  }
  
  @NotNull
  public static final Buffer commonCopy(@NotNull Buffer paramBuffer) {
    long l = a ^ 0x3E6B8ACED4CCL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool = false;
    Buffer buffer = new Buffer();
    try {
      if (paramBuffer.size() == 0L)
        return buffer; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(paramBuffer.head);
    Segment segment1 = paramBuffer.head;
    Segment segment2 = segment1.sharedCopy();
    buffer.head = segment2;
    segment2.prev = buffer.head;
    segment2.next = segment2.prev;
    for (Segment segment3 = segment1.next; segment3 != segment1; segment3 = segment3.next) {
      Intrinsics.checkNotNull(segment2.prev);
      Intrinsics.checkNotNull(segment3);
      segment2.prev.push(segment3.sharedCopy());
    } 
    buffer.setSize$okio(paramBuffer.size());
    return buffer;
  }
  
  public static final long commonReadDecimalLong(@NotNull Buffer paramBuffer) {
    long l1 = a ^ 0x4A6E797B6309L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    try {
      if (paramBuffer.size() == 0L)
        throw new EOFException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = 0L;
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    long l3 = -7L;
    while (true) {
      Intrinsics.checkNotNull(paramBuffer.head);
      Segment segment = paramBuffer.head;
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
          paramBuffer.head = segment.pop();
          SegmentPool.recycle(segment);
        } else {
          segment.pos = j;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      continue;
      try {
        if (bool3 || paramBuffer.head == null)
          break; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    Buffer buffer = paramBuffer;
    try {
      buffer.setSize$okio(buffer.size() - i);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = bool2 ? 2 : 1;
    try {
      if (i < b) {
        try {
          if (paramBuffer.size() == 0L)
            throw new EOFException(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        String str = bool2 ? "Expected a digit" : "Expected a digit or '-'";
        throw new NumberFormatException(str + " but was 0x" + _UtilKt.toHexString(paramBuffer.getByte(0L)));
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return bool2 ? l2 : -l2;
  }
  
  public static final int commonRead(@NotNull Buffer paramBuffer, @NotNull byte[] paramArrayOfbyte) {
    long l = a ^ 0x4958708CFD8AL;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "sink");
    boolean bool = false;
    return paramBuffer.read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public static final long commonIndexOf(@NotNull Buffer paramBuffer, byte paramByte, long paramLong1, long paramLong2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_BufferKt.a : J
    //   3: ldc2_w 74651321207620
    //   6: lxor
    //   7: lstore #6
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: iconst_0
    //   16: istore #8
    //   18: lconst_0
    //   19: lstore #48
    //   21: lload_2
    //   22: lstore #48
    //   24: lconst_0
    //   25: lstore #50
    //   27: lload #4
    //   29: lstore #50
    //   31: lconst_0
    //   32: lload #48
    //   34: lcmp
    //   35: ifgt -> 65
    //   38: lload #48
    //   40: lload #50
    //   42: lcmp
    //   43: ifgt -> 61
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   52: athrow
    //   53: iconst_1
    //   54: goto -> 66
    //   57: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   60: athrow
    //   61: iconst_0
    //   62: goto -> 66
    //   65: iconst_0
    //   66: istore #9
    //   68: iconst_0
    //   69: istore #10
    //   71: iconst_0
    //   72: istore #11
    //   74: iload #9
    //   76: ifne -> 145
    //   79: iconst_0
    //   80: istore #12
    //   82: new java/lang/StringBuilder
    //   85: dup
    //   86: invokespecial <init> : ()V
    //   89: ldc_w 'size='
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: aload_0
    //   96: invokevirtual size : ()J
    //   99: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   102: ldc_w ' fromIndex='
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: lload #48
    //   110: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   113: ldc_w ' toIndex='
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: lload #50
    //   121: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   124: invokevirtual toString : ()Ljava/lang/String;
    //   127: astore #11
    //   129: new java/lang/IllegalArgumentException
    //   132: dup
    //   133: aload #11
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: invokespecial <init> : (Ljava/lang/String;)V
    //   141: checkcast java/lang/Throwable
    //   144: athrow
    //   145: lload #50
    //   147: aload_0
    //   148: invokevirtual size : ()J
    //   151: lcmp
    //   152: ifle -> 161
    //   155: aload_0
    //   156: invokevirtual size : ()J
    //   159: lstore #50
    //   161: lload #48
    //   163: lload #50
    //   165: lcmp
    //   166: ifne -> 177
    //   169: ldc2_w -1
    //   172: lreturn
    //   173: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   176: athrow
    //   177: aload_0
    //   178: astore #9
    //   180: lload #48
    //   182: lstore #10
    //   184: iconst_0
    //   185: istore #12
    //   187: aload #9
    //   189: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   192: astore #13
    //   194: aload #13
    //   196: ifnonnull -> 221
    //   199: aconst_null
    //   200: ldc2_w -1
    //   203: lstore #14
    //   205: checkcast me/rerere/matrix/thirdparty/okio/Segment
    //   208: astore #16
    //   210: iconst_0
    //   211: istore #17
    //   213: aload #16
    //   215: astore #18
    //   217: ldc2_w -1
    //   220: lreturn
    //   221: aload #13
    //   223: astore #31
    //   225: aload #9
    //   227: invokevirtual size : ()J
    //   230: lload #10
    //   232: lsub
    //   233: lload #10
    //   235: lcmp
    //   236: ifge -> 478
    //   239: aload #9
    //   241: invokevirtual size : ()J
    //   244: lstore #32
    //   246: lload #32
    //   248: lload #10
    //   250: lcmp
    //   251: ifle -> 285
    //   254: aload #31
    //   256: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   259: dup
    //   260: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   263: astore #31
    //   265: lload #32
    //   267: aload #31
    //   269: getfield limit : I
    //   272: aload #31
    //   274: getfield pos : I
    //   277: isub
    //   278: i2l
    //   279: lsub
    //   280: lstore #32
    //   282: goto -> 246
    //   285: aload #31
    //   287: lload #32
    //   289: lstore #14
    //   291: astore #16
    //   293: iconst_0
    //   294: istore #17
    //   296: aload #16
    //   298: astore #18
    //   300: aload #18
    //   302: ifnonnull -> 313
    //   305: ldc2_w -1
    //   308: lreturn
    //   309: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   312: athrow
    //   313: aload #18
    //   315: astore #19
    //   317: lload #14
    //   319: lstore #20
    //   321: lload #20
    //   323: lload #50
    //   325: lcmp
    //   326: ifge -> 474
    //   329: aload #19
    //   331: getfield data : [B
    //   334: astore #22
    //   336: aload #19
    //   338: getfield limit : I
    //   341: i2l
    //   342: lstore #23
    //   344: aload #19
    //   346: getfield pos : I
    //   349: i2l
    //   350: lload #50
    //   352: ladd
    //   353: lload #20
    //   355: lsub
    //   356: lstore #25
    //   358: iconst_0
    //   359: istore #27
    //   361: lload #23
    //   363: lload #25
    //   365: invokestatic min : (JJ)J
    //   368: l2i
    //   369: istore #28
    //   371: aload #19
    //   373: getfield pos : I
    //   376: i2l
    //   377: lload #48
    //   379: ladd
    //   380: lload #20
    //   382: lsub
    //   383: l2i
    //   384: istore #29
    //   386: iload #29
    //   388: iload #28
    //   390: if_icmpge -> 439
    //   393: aload #22
    //   395: iload #29
    //   397: baload
    //   398: iload_1
    //   399: if_icmpne -> 426
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   408: athrow
    //   409: iload #29
    //   411: aload #19
    //   413: getfield pos : I
    //   416: isub
    //   417: i2l
    //   418: lload #20
    //   420: ladd
    //   421: lreturn
    //   422: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   425: athrow
    //   426: iload #29
    //   428: istore #30
    //   430: iload #30
    //   432: iconst_1
    //   433: iadd
    //   434: istore #29
    //   436: goto -> 386
    //   439: lload #20
    //   441: aload #19
    //   443: getfield limit : I
    //   446: aload #19
    //   448: getfield pos : I
    //   451: isub
    //   452: i2l
    //   453: ladd
    //   454: lstore #20
    //   456: lload #20
    //   458: lstore #48
    //   460: aload #19
    //   462: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   465: dup
    //   466: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   469: astore #19
    //   471: goto -> 321
    //   474: ldc2_w -1
    //   477: lreturn
    //   478: lconst_0
    //   479: lstore #32
    //   481: nop
    //   482: lload #32
    //   484: aload #31
    //   486: getfield limit : I
    //   489: aload #31
    //   491: getfield pos : I
    //   494: isub
    //   495: i2l
    //   496: ladd
    //   497: lstore #34
    //   499: lload #34
    //   501: lload #10
    //   503: lcmp
    //   504: ifle -> 514
    //   507: goto -> 532
    //   510: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   513: athrow
    //   514: aload #31
    //   516: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   519: dup
    //   520: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   523: astore #31
    //   525: lload #34
    //   527: lstore #32
    //   529: goto -> 481
    //   532: aload #31
    //   534: lload #32
    //   536: lstore #36
    //   538: astore #38
    //   540: iconst_0
    //   541: istore #19
    //   543: aload #38
    //   545: astore #39
    //   547: aload #39
    //   549: ifnonnull -> 560
    //   552: ldc2_w -1
    //   555: lreturn
    //   556: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   559: athrow
    //   560: aload #39
    //   562: astore #40
    //   564: lload #36
    //   566: lstore #41
    //   568: lload #41
    //   570: lload #50
    //   572: lcmp
    //   573: ifge -> 721
    //   576: aload #40
    //   578: getfield data : [B
    //   581: astore #43
    //   583: aload #40
    //   585: getfield limit : I
    //   588: i2l
    //   589: lstore #25
    //   591: aload #40
    //   593: getfield pos : I
    //   596: i2l
    //   597: lload #50
    //   599: ladd
    //   600: lload #41
    //   602: lsub
    //   603: lstore #44
    //   605: iconst_0
    //   606: istore #29
    //   608: lload #25
    //   610: lload #44
    //   612: invokestatic min : (JJ)J
    //   615: l2i
    //   616: istore #30
    //   618: aload #40
    //   620: getfield pos : I
    //   623: i2l
    //   624: lload #48
    //   626: ladd
    //   627: lload #41
    //   629: lsub
    //   630: l2i
    //   631: istore #46
    //   633: iload #46
    //   635: iload #30
    //   637: if_icmpge -> 686
    //   640: aload #43
    //   642: iload #46
    //   644: baload
    //   645: iload_1
    //   646: if_icmpne -> 673
    //   649: goto -> 656
    //   652: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   655: athrow
    //   656: iload #46
    //   658: aload #40
    //   660: getfield pos : I
    //   663: isub
    //   664: i2l
    //   665: lload #41
    //   667: ladd
    //   668: lreturn
    //   669: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   672: athrow
    //   673: iload #46
    //   675: istore #47
    //   677: iload #47
    //   679: iconst_1
    //   680: iadd
    //   681: istore #46
    //   683: goto -> 633
    //   686: lload #41
    //   688: aload #40
    //   690: getfield limit : I
    //   693: aload #40
    //   695: getfield pos : I
    //   698: isub
    //   699: i2l
    //   700: ladd
    //   701: lstore #41
    //   703: lload #41
    //   705: lstore #48
    //   707: aload #40
    //   709: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   712: dup
    //   713: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   716: astore #40
    //   718: goto -> 568
    //   721: ldc2_w -1
    //   724: lreturn
    // Exception table:
    //   from	to	target	type
    //   31	46	49	java/lang/IllegalArgumentException
    //   38	57	57	java/lang/IllegalArgumentException
    //   161	173	173	java/lang/IllegalArgumentException
    //   300	309	309	java/lang/IllegalArgumentException
    //   386	402	405	java/lang/IllegalArgumentException
    //   393	422	422	java/lang/IllegalArgumentException
    //   499	510	510	java/lang/IllegalArgumentException
    //   547	556	556	java/lang/IllegalArgumentException
    //   633	649	652	java/lang/IllegalArgumentException
    //   640	669	669	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final Buffer commonWriteDecimalLong(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x4C0414984E69L;
    Intrinsics.checkNotNullParameter(paramBuffer, "<this>");
    boolean bool1 = false;
    long l2 = paramLong;
    if (l2 == 0L) {
      byte b1 = 48;
      boolean bool = false;
      return paramBuffer.writeByte(b1);
    } 
    boolean bool2 = false;
    if (l2 < 0L) {
      l2 = -l2;
      try {
        if (l2 < 0L)
          return paramBuffer.writeUtf8("-9223372036854775808"); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      bool2 = true;
    } 
    try {
      if (l2 < 100000000L) {
        try {
          if (l2 < 10000L) {
            try {
              if (l2 < 100L) {
                try {
                
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } else {
                try {
                
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
            try {
              if (l2 < 1000000L) {
                try {
                
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } else {
                try {
                
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
      } else {
        try {
          if (l2 < 1000000000000L) {
            try {
              if (l2 < 10000000000L) {
                try {
                
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } else {
                try {
                
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
          } else {
            try {
              if (l2 < 1000000000000000L) {
                try {
                  try {
                  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
              } else {
                try {
                  if (l2 < 100000000000000000L) {
                    try {
                    
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    } 
                  } else {
                    try {
                    
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
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = (l2 < 1000000000000000000L) ? 18 : 19;
    try {
      if (bool2)
        b++; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Segment segment1 = paramBuffer.writableSegment$okio(b);
    byte[] arrayOfByte = segment1.data;
    int i = segment1.limit + b;
    while (l2 != 0L) {
      int j = (int)(l2 % 10L);
      arrayOfByte[--i] = getHEX_DIGIT_BYTES()[j];
      l2 /= 10L;
    } 
    if (bool2) {
      byte b1 = 45;
      boolean bool = false;
      arrayOfByte[--i] = (byte)b1;
    } 
    Segment segment2 = segment1;
    segment2.limit += b;
    Buffer buffer = paramBuffer;
    buffer.setSize$okio(buffer.size() + b);
    return paramBuffer;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_BufferKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
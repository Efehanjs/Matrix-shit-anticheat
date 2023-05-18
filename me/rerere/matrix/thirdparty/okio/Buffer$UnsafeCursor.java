package me.rerere.matrix.thirdparty.okio;

import java.io.Closeable;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Buffer$UnsafeCursor implements Closeable {
  @JvmField
  public boolean readWrite;
  
  @Nullable
  private Segment segment;
  
  @JvmField
  @Nullable
  public Buffer buffer;
  
  @JvmField
  public int start = -1;
  
  @JvmField
  public int end = -1;
  
  @JvmField
  @Nullable
  public byte[] data;
  
  @JvmField
  public long offset = -1L;
  
  private static final long a = o3.a(7387969772182839883L, 6779799883925284208L, MethodHandles.lookup().lookupClass()).a(220505455893117L);
  
  @Nullable
  public final Segment getSegment$okio() {
    return this.segment;
  }
  
  public final long expandBuffer(int paramInt) {
    long l1 = a ^ 0x2471902B72AEL;
    Buffer$UnsafeCursor buffer$UnsafeCursor = this;
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
    Buffer buffer2 = buffer$UnsafeCursor.buffer;
    bool4 = false;
    boolean bool5 = false;
    if (buffer2 == null) {
      boolean bool6 = false;
      String str = "not attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    Buffer buffer1 = buffer2;
    boolean bool = buffer$UnsafeCursor.readWrite;
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
    buffer$UnsafeCursor.setSegment$okio(segment);
    buffer$UnsafeCursor.offset = l2;
    buffer$UnsafeCursor.data = segment.data;
    buffer$UnsafeCursor.start = 8192 - i;
    buffer$UnsafeCursor.end = 8192;
    return i;
  }
  
  public void close() {
    long l = a ^ 0x194DF4B37CB8L;
    Buffer$UnsafeCursor buffer$UnsafeCursor = this;
    boolean bool1 = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (buffer$UnsafeCursor.buffer != null) ? true : false;
    boolean bool3 = false;
    boolean bool4 = false;
    if (!bool2) {
      boolean bool = false;
      String str = "not attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    buffer$UnsafeCursor.buffer = null;
    buffer$UnsafeCursor.setSegment$okio(null);
    buffer$UnsafeCursor.offset = -1L;
    buffer$UnsafeCursor.data = null;
    buffer$UnsafeCursor.start = -1;
    buffer$UnsafeCursor.end = -1;
  }
  
  public final int seek(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Buffer$UnsafeCursor.a : J
    //   3: ldc2_w 126493422472639
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: aload #5
    //   16: getfield buffer : Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   19: astore #7
    //   21: iconst_0
    //   22: istore #8
    //   24: iconst_0
    //   25: istore #9
    //   27: aload #7
    //   29: ifnonnull -> 55
    //   32: iconst_0
    //   33: istore #10
    //   35: ldc 'not attached to a buffer'
    //   37: astore #9
    //   39: new java/lang/IllegalStateException
    //   42: dup
    //   43: aload #9
    //   45: invokevirtual toString : ()Ljava/lang/String;
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: checkcast java/lang/Throwable
    //   54: athrow
    //   55: aload #7
    //   57: astore #11
    //   59: lload_1
    //   60: ldc2_w -1
    //   63: lcmp
    //   64: iflt -> 84
    //   67: lload_1
    //   68: aload #11
    //   70: invokevirtual size : ()J
    //   73: lcmp
    //   74: ifle -> 128
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   83: athrow
    //   84: new java/lang/ArrayIndexOutOfBoundsException
    //   87: dup
    //   88: new java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: ldc 'offset='
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: lload_1
    //   101: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   104: ldc ' > size='
    //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: aload #11
    //   111: invokevirtual size : ()J
    //   114: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   117: invokevirtual toString : ()Ljava/lang/String;
    //   120: invokespecial <init> : (Ljava/lang/String;)V
    //   123: athrow
    //   124: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   127: athrow
    //   128: lload_1
    //   129: ldc2_w -1
    //   132: lcmp
    //   133: ifeq -> 153
    //   136: lload_1
    //   137: aload #11
    //   139: invokevirtual size : ()J
    //   142: lcmp
    //   143: ifne -> 191
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   152: athrow
    //   153: aload #5
    //   155: aconst_null
    //   156: invokevirtual setSegment$okio : (Lme/rerere/matrix/thirdparty/okio/Segment;)V
    //   159: aload #5
    //   161: lload_1
    //   162: putfield offset : J
    //   165: aload #5
    //   167: aconst_null
    //   168: putfield data : [B
    //   171: aload #5
    //   173: iconst_m1
    //   174: putfield start : I
    //   177: aload #5
    //   179: iconst_m1
    //   180: putfield end : I
    //   183: iconst_m1
    //   184: goto -> 553
    //   187: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   190: athrow
    //   191: lconst_0
    //   192: lstore #12
    //   194: aload #11
    //   196: invokevirtual size : ()J
    //   199: lstore #14
    //   201: aload #11
    //   203: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   206: astore #16
    //   208: aload #11
    //   210: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   213: astore #17
    //   215: aload #5
    //   217: invokevirtual getSegment$okio : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   220: ifnull -> 282
    //   223: aload #5
    //   225: getfield offset : J
    //   228: aload #5
    //   230: getfield start : I
    //   233: aload #5
    //   235: invokevirtual getSegment$okio : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   238: dup
    //   239: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   242: getfield pos : I
    //   245: isub
    //   246: i2l
    //   247: lsub
    //   248: lstore #18
    //   250: lload #18
    //   252: lload_1
    //   253: lcmp
    //   254: ifle -> 271
    //   257: lload #18
    //   259: lstore #14
    //   261: aload #5
    //   263: invokevirtual getSegment$okio : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   266: astore #17
    //   268: goto -> 282
    //   271: lload #18
    //   273: lstore #12
    //   275: aload #5
    //   277: invokevirtual getSegment$okio : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   280: astore #16
    //   282: aconst_null
    //   283: astore #20
    //   285: lconst_0
    //   286: lstore #21
    //   288: lload #14
    //   290: lload_1
    //   291: lsub
    //   292: lload_1
    //   293: lload #12
    //   295: lsub
    //   296: lcmp
    //   297: ifle -> 359
    //   300: aload #16
    //   302: astore #20
    //   304: lload #12
    //   306: lstore #21
    //   308: lload_1
    //   309: lload #21
    //   311: aload #20
    //   313: dup
    //   314: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   317: getfield limit : I
    //   320: aload #20
    //   322: getfield pos : I
    //   325: isub
    //   326: i2l
    //   327: ladd
    //   328: lcmp
    //   329: iflt -> 409
    //   332: lload #21
    //   334: aload #20
    //   336: getfield limit : I
    //   339: aload #20
    //   341: getfield pos : I
    //   344: isub
    //   345: i2l
    //   346: ladd
    //   347: lstore #21
    //   349: aload #20
    //   351: getfield next : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   354: astore #20
    //   356: goto -> 308
    //   359: aload #17
    //   361: astore #20
    //   363: lload #14
    //   365: lstore #21
    //   367: lload #21
    //   369: lload_1
    //   370: lcmp
    //   371: ifle -> 409
    //   374: aload #20
    //   376: dup
    //   377: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   380: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   383: astore #20
    //   385: lload #21
    //   387: aload #20
    //   389: dup
    //   390: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   393: getfield limit : I
    //   396: aload #20
    //   398: getfield pos : I
    //   401: isub
    //   402: i2l
    //   403: lsub
    //   404: lstore #21
    //   406: goto -> 367
    //   409: aload #5
    //   411: getfield readWrite : Z
    //   414: ifeq -> 489
    //   417: aload #20
    //   419: dup
    //   420: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   423: getfield shared : Z
    //   426: ifeq -> 489
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   435: athrow
    //   436: aload #20
    //   438: invokevirtual unsharedCopy : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   441: astore #23
    //   443: aload #11
    //   445: getfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   448: aload #20
    //   450: if_acmpne -> 467
    //   453: aload #11
    //   455: aload #23
    //   457: putfield head : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   466: athrow
    //   467: aload #20
    //   469: aload #23
    //   471: invokevirtual push : (Lme/rerere/matrix/thirdparty/okio/Segment;)Lme/rerere/matrix/thirdparty/okio/Segment;
    //   474: astore #20
    //   476: aload #20
    //   478: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   481: dup
    //   482: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   485: invokevirtual pop : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   488: pop
    //   489: aload #5
    //   491: aload #20
    //   493: invokevirtual setSegment$okio : (Lme/rerere/matrix/thirdparty/okio/Segment;)V
    //   496: aload #5
    //   498: lload_1
    //   499: putfield offset : J
    //   502: aload #5
    //   504: aload #20
    //   506: dup
    //   507: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   510: getfield data : [B
    //   513: putfield data : [B
    //   516: aload #5
    //   518: aload #20
    //   520: getfield pos : I
    //   523: lload_1
    //   524: lload #21
    //   526: lsub
    //   527: l2i
    //   528: iadd
    //   529: putfield start : I
    //   532: aload #5
    //   534: aload #20
    //   536: getfield limit : I
    //   539: putfield end : I
    //   542: aload #5
    //   544: getfield end : I
    //   547: aload #5
    //   549: getfield start : I
    //   552: isub
    //   553: ireturn
    // Exception table:
    //   from	to	target	type
    //   59	77	80	java/lang/IllegalArgumentException
    //   67	124	124	java/lang/IllegalArgumentException
    //   128	146	149	java/lang/IllegalArgumentException
    //   136	187	187	java/lang/IllegalArgumentException
    //   409	429	432	java/lang/IllegalArgumentException
    //   443	460	463	java/lang/IllegalArgumentException
  }
  
  public final long resizeBuffer(long paramLong) {
    long l1 = a ^ 0x649F8D4655ECL;
    Buffer$UnsafeCursor buffer$UnsafeCursor = this;
    boolean bool1 = false;
    Buffer buffer1 = buffer$UnsafeCursor.buffer;
    boolean bool2 = false;
    boolean bool3 = false;
    if (buffer1 == null) {
      boolean bool4 = false;
      String str = "not attached to a buffer";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    Buffer buffer2 = buffer1;
    boolean bool = buffer$UnsafeCursor.readWrite;
    bool2 = false;
    bool3 = false;
    if (!bool) {
      boolean bool4 = false;
      String str = "resizeBuffer() only permitted for read/write buffers";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    long l2 = buffer2.size();
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
          Intrinsics.checkNotNull(buffer2.head);
          Segment segment1 = buffer2.head.prev;
          Intrinsics.checkNotNull(segment1);
          int i = segment1.limit - segment1.pos;
          if (i <= l) {
            buffer2.head = segment1.pop();
            SegmentPool.recycle(segment1);
            l -= i;
            continue;
          } 
          Segment segment2 = segment1;
          segment2.limit -= (int)l;
        } 
        buffer$UnsafeCursor.setSegment$okio(null);
        buffer$UnsafeCursor.offset = paramLong;
        buffer$UnsafeCursor.data = null;
        buffer$UnsafeCursor.start = -1;
        buffer$UnsafeCursor.end = -1;
      } else if (paramLong > l2) {
        bool3 = true;
        long l = paramLong - l2;
        while (l > 0L) {
          Segment segment1 = buffer2.writableSegment$okio(1);
          int j = 8192 - segment1.limit;
          boolean bool4 = false;
          long l3 = j;
          boolean bool5 = false;
          int i = (int)Math.min(l, l3);
          Segment segment2 = segment1;
          segment2.limit += i;
          l -= i;
          if (bool3) {
            buffer$UnsafeCursor.setSegment$okio(segment1);
            buffer$UnsafeCursor.offset = l2;
            buffer$UnsafeCursor.data = segment1.data;
            buffer$UnsafeCursor.start = segment1.limit - i;
            buffer$UnsafeCursor.end = segment1.limit;
            bool3 = false;
          } 
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    buffer2.setSize$okio(paramLong);
    return l2;
  }
  
  public final void setSegment$okio(@Nullable Segment paramSegment) {
    this.segment = paramSegment;
  }
  
  public final int next() {
    long l = a ^ 0xA898D15FD7AL;
    Buffer$UnsafeCursor buffer$UnsafeCursor = this;
    boolean bool1 = false;
    try {
      Intrinsics.checkNotNull(buffer$UnsafeCursor.buffer);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool2 = (buffer$UnsafeCursor.offset != buffer$UnsafeCursor.buffer.size()) ? true : false;
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
    return (buffer$UnsafeCursor.offset == -1L) ? buffer$UnsafeCursor.seek(0L) : buffer$UnsafeCursor.seek(buffer$UnsafeCursor.offset + (buffer$UnsafeCursor.end - buffer$UnsafeCursor.start));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Buffer$UnsafeCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
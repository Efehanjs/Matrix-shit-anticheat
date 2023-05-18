package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Segment {
  @JvmField
  @Nullable
  public Segment prev;
  
  @JvmField
  public boolean owner;
  
  @JvmField
  @NotNull
  public final byte[] data;
  
  @JvmField
  public int limit;
  
  @JvmField
  public boolean shared;
  
  public static final int SIZE = 8192;
  
  @NotNull
  public static final Segment$Companion Companion;
  
  @JvmField
  @Nullable
  public Segment next;
  
  @JvmField
  public int pos;
  
  public static final int SHARE_MINIMUM = 1024;
  
  private static final long a = o3.a(7604152102670205641L, 3873018083797981807L, MethodHandles.lookup().lookupClass()).a(188871974016843L);
  
  @NotNull
  public final Segment unsharedCopy() {
    long l = a ^ 0xB2B3819A41FL;
    byte[] arrayOfByte = this.data;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte, arrayOfByte.length), "java.util.Arrays.copyOf(this, size)");
    return new Segment(Arrays.copyOf(arrayOfByte, arrayOfByte.length), this.pos, this.limit, false, true);
  }
  
  @NotNull
  public final Segment push(@NotNull Segment paramSegment) {
    long l = a ^ 0x2F311E00300L;
    Intrinsics.checkNotNullParameter(paramSegment, "segment");
    paramSegment.prev = this;
    paramSegment.next = this.next;
    Intrinsics.checkNotNull(this.next);
    this.next.prev = paramSegment;
    this.next = paramSegment;
    return paramSegment;
  }
  
  static {
    Companion = new Segment$Companion(null);
  }
  
  public final void compact() {
    long l = a ^ 0x4D9320979601L;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = (this.prev != this) ? 1 : 0;
    int j = 0;
    boolean bool = false;
    if (!i) {
      boolean bool1 = false;
      String str = "cannot compact";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    try {
      Intrinsics.checkNotNull(this.prev);
      if (!this.prev.owner)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    i = this.limit - this.pos;
    try {
      Intrinsics.checkNotNull(this.prev);
      Intrinsics.checkNotNull(this.prev);
      Intrinsics.checkNotNull(this.prev);
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    j = 8192 - this.prev.limit + (this.prev.shared ? 0 : this.prev.pos);
    try {
      if (i > j)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.prev);
    writeTo(this.prev, i);
    pop();
    SegmentPool.recycle(this);
  }
  
  @NotNull
  public final Segment split(int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Segment.a : J
    //   3: ldc2_w 67606572717731
    //   6: lxor
    //   7: lstore_2
    //   8: iload_1
    //   9: ifle -> 40
    //   12: iload_1
    //   13: aload_0
    //   14: getfield limit : I
    //   17: aload_0
    //   18: getfield pos : I
    //   21: isub
    //   22: if_icmpgt -> 40
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   31: athrow
    //   32: iconst_1
    //   33: goto -> 41
    //   36: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   39: athrow
    //   40: iconst_0
    //   41: istore #4
    //   43: iconst_0
    //   44: istore #5
    //   46: iconst_0
    //   47: istore #6
    //   49: iload #4
    //   51: ifne -> 77
    //   54: iconst_0
    //   55: istore #7
    //   57: ldc 'byteCount out of range'
    //   59: astore #6
    //   61: new java/lang/IllegalArgumentException
    //   64: dup
    //   65: aload #6
    //   67: invokevirtual toString : ()Ljava/lang/String;
    //   70: invokespecial <init> : (Ljava/lang/String;)V
    //   73: checkcast java/lang/Throwable
    //   76: athrow
    //   77: aconst_null
    //   78: astore #4
    //   80: iload_1
    //   81: sipush #1024
    //   84: if_icmplt -> 96
    //   87: aload_0
    //   88: invokevirtual sharedCopy : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   91: astore #4
    //   93: goto -> 127
    //   96: invokestatic take : ()Lme/rerere/matrix/thirdparty/okio/Segment;
    //   99: astore #4
    //   101: aload_0
    //   102: getfield data : [B
    //   105: aload #4
    //   107: getfield data : [B
    //   110: iconst_0
    //   111: aload_0
    //   112: getfield pos : I
    //   115: aload_0
    //   116: getfield pos : I
    //   119: iload_1
    //   120: iadd
    //   121: iconst_2
    //   122: aconst_null
    //   123: invokestatic copyInto$default : ([B[BIIIILjava/lang/Object;)[B
    //   126: pop
    //   127: aload #4
    //   129: aload #4
    //   131: getfield pos : I
    //   134: iload_1
    //   135: iadd
    //   136: putfield limit : I
    //   139: aload_0
    //   140: astore #5
    //   142: aload #5
    //   144: aload #5
    //   146: getfield pos : I
    //   149: iload_1
    //   150: iadd
    //   151: putfield pos : I
    //   154: aload_0
    //   155: getfield prev : Lme/rerere/matrix/thirdparty/okio/Segment;
    //   158: dup
    //   159: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   162: aload #4
    //   164: invokevirtual push : (Lme/rerere/matrix/thirdparty/okio/Segment;)Lme/rerere/matrix/thirdparty/okio/Segment;
    //   167: pop
    //   168: aload #4
    //   170: areturn
    // Exception table:
    //   from	to	target	type
    //   8	25	28	java/lang/IllegalStateException
    //   12	36	36	java/lang/IllegalStateException
  }
  
  @NotNull
  public final Segment sharedCopy() {
    this.shared = true;
    return new Segment(this.data, this.pos, this.limit, true, false);
  }
  
  public final void writeTo(@NotNull Segment paramSegment, int paramInt) {
    long l = a ^ 0x396598C4A4BL;
    Intrinsics.checkNotNullParameter(paramSegment, "sink");
    boolean bool = paramSegment.owner;
    boolean bool1 = false;
    boolean bool2 = false;
    if (!bool) {
      boolean bool3 = false;
      String str = "only owner can write";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    try {
      if (paramSegment.limit + paramInt > 8192) {
        try {
          if (paramSegment.shared)
            throw new IllegalArgumentException(); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          if (paramSegment.limit + paramInt - paramSegment.pos > 8192)
            throw new IllegalArgumentException(); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        ArraysKt.copyInto$default(paramSegment.data, paramSegment.data, 0, paramSegment.pos, paramSegment.limit, 2, null);
        Segment segment1 = paramSegment;
        segment1.limit -= paramSegment.pos;
        paramSegment.pos = 0;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    ArraysKt.copyInto(this.data, paramSegment.data, paramSegment.limit, this.pos, this.pos + paramInt);
    Segment segment = paramSegment;
    segment.limit += paramInt;
    segment = this;
    segment.pos += paramInt;
  }
  
  public Segment(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    this.data = paramArrayOfbyte;
    this.pos = paramInt1;
    this.limit = paramInt2;
    this.shared = paramBoolean1;
    this.owner = paramBoolean2;
  }
  
  public Segment() {
    this.data = new byte[8192];
    this.owner = true;
    this.shared = false;
  }
  
  @Nullable
  public final Segment pop() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Segment segment = (this.next != this) ? this.next : null;
    Intrinsics.checkNotNull(this.prev);
    this.prev.next = this.next;
    Intrinsics.checkNotNull(this.next);
    this.next.prev = this.prev;
    this.next = null;
    this.prev = null;
    return segment;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Segment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
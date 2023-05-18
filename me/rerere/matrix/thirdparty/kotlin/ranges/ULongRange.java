package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalUnsignedTypes;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class ULongRange extends ULongProgression implements ClosedRange, OpenEndRange {
  @NotNull
  private static final ULongRange EMPTY;
  
  @NotNull
  public static final ULongRange$Companion Companion;
  
  private static final long b = o3.a(-2356836375327105554L, -5793762498917644075L, null).a(93733032213012L);
  
  public long getEndInclusive-s-VKNKU() {
    return getLast-s-VKNKU();
  }
  
  static {
    Companion = new ULongRange$Companion(null);
    EMPTY = new ULongRange(-1L, 0L, null);
  }
  
  @NotNull
  public String toString() {
    long l = b ^ 0x5536A01F8E03L;
    return ULong.toString-impl(getFirst-s-VKNKU()) + ".." + ULong.toString-impl(getLast-s-VKNKU());
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/ULongRange
    //   4: ifeq -> 90
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ULongRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 82
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual getFirst-s-VKNKU : ()J
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ULongRange
    //   46: invokevirtual getFirst-s-VKNKU : ()J
    //   49: lcmp
    //   50: ifne -> 90
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   59: athrow
    //   60: aload_0
    //   61: invokevirtual getLast-s-VKNKU : ()J
    //   64: aload_1
    //   65: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ULongRange
    //   68: invokevirtual getLast-s-VKNKU : ()J
    //   71: lcmp
    //   72: ifne -> 90
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   81: athrow
    //   82: iconst_1
    //   83: goto -> 91
    //   86: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   89: athrow
    //   90: iconst_0
    //   91: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/IllegalStateException
    //   7	31	34	java/lang/IllegalStateException
    //   21	53	56	java/lang/IllegalStateException
    //   38	75	78	java/lang/IllegalStateException
    //   60	86	86	java/lang/IllegalStateException
  }
  
  public boolean contains-VKZWuLQ(long paramLong) {
    try {
      if (UnsignedKt.ulongCompare(getFirst-s-VKNKU(), paramLong) <= 0)
        try {
          if (UnsignedKt.ulongCompare(paramLong, getLast-s-VKNKU()) <= 0);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public long getStart-s-VKNKU() {
    return getFirst-s-VKNKU();
  }
  
  public long getEndExclusive-s-VKNKU() {
    long l1 = b ^ 0x60CC67D61C9L;
    try {
      if (getLast-s-VKNKU() == -1L)
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString()); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    long l2 = getLast-s-VKNKU();
    boolean bool = true;
    return ULong.constructor-impl(l2 + ULong.constructor-impl(bool & 0xFFFFFFFFL));
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * (int)ULong.constructor-impl(getFirst-s-VKNKU() ^ ULong.constructor-impl(getFirst-s-VKNKU() >>> 32L)) + (int)ULong.constructor-impl(getLast-s-VKNKU() ^ ULong.constructor-impl(getLast-s-VKNKU() >>> 32L)));
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (UnsignedKt.ulongCompare(getFirst-s-VKNKU(), getLast-s-VKNKU()) > 0);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ULongRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
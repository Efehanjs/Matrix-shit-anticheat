package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class LongRange extends LongProgression implements ClosedRange, OpenEndRange {
  @NotNull
  public static final LongRange$Companion Companion;
  
  @NotNull
  private static final LongRange EMPTY;
  
  private static final long b = o3.a(8346832527418873953L, -1713633075581621515L, null).a(67895014970609L);
  
  @NotNull
  public String toString() {
    long l = b ^ 0x439E3492F9E6L;
    return getFirst() + ".." + getLast();
  }
  
  @NotNull
  public Long getEndInclusive() {
    return Long.valueOf(getLast());
  }
  
  public boolean contains(long paramLong) {
    try {
      if (getFirst() <= paramLong)
        try {
          if (paramLong <= getLast());
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    Companion = new LongRange$Companion(null);
    EMPTY = new LongRange(1L, 0L);
  }
  
  @NotNull
  public Long getEndExclusive() {
    long l = b ^ 0x343923BA0590L;
    try {
      if (getLast() == Long.MAX_VALUE)
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString()); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Long.valueOf(getLast() + 1L);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/LongRange
    //   4: ifeq -> 90
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/LongRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 82
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual getFirst : ()J
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/LongRange
    //   46: invokevirtual getFirst : ()J
    //   49: lcmp
    //   50: ifne -> 90
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   59: athrow
    //   60: aload_0
    //   61: invokevirtual getLast : ()J
    //   64: aload_1
    //   65: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/LongRange
    //   68: invokevirtual getLast : ()J
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
  
  @NotNull
  public Long getStart() {
    return Long.valueOf(getFirst());
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (getFirst() > getLast());
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (int)(31L * (getFirst() ^ getFirst() >>> 32L) + (getLast() ^ getLast() >>> 32L));
  }
  
  public LongRange(long paramLong1, long paramLong2) {
    super(paramLong1, paramLong2, 1L);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\LongRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
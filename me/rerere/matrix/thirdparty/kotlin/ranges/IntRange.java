package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class IntRange extends IntProgression implements ClosedRange, OpenEndRange {
  @NotNull
  private static final IntRange EMPTY;
  
  @NotNull
  public static final IntRange$Companion Companion;
  
  private static final long b = o3.a(-8969450911788676499L, 8876985450915187145L, null).a(157557531935685L);
  
  static {
    Companion = new IntRange$Companion(null);
    EMPTY = new IntRange(1, 0);
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
    return isEmpty() ? -1 : (31 * getFirst() + getLast());
  }
  
  @NotNull
  public Integer getEndExclusive() {
    long l = b ^ 0x48313A349D03L;
    try {
      if (getLast() == Integer.MAX_VALUE)
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString()); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Integer.valueOf(getLast() + 1);
  }
  
  public boolean contains(int paramInt) {
    try {
      if (getFirst() <= paramInt)
        try {
          if (paramInt <= getLast());
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   4: ifeq -> 88
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 80
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual getFirst : ()I
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   46: invokevirtual getFirst : ()I
    //   49: if_icmpne -> 88
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   58: athrow
    //   59: aload_0
    //   60: invokevirtual getLast : ()I
    //   63: aload_1
    //   64: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   67: invokevirtual getLast : ()I
    //   70: if_icmpne -> 88
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   79: athrow
    //   80: iconst_1
    //   81: goto -> 89
    //   84: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/IllegalStateException
    //   7	31	34	java/lang/IllegalStateException
    //   21	52	55	java/lang/IllegalStateException
    //   38	73	76	java/lang/IllegalStateException
    //   59	84	84	java/lang/IllegalStateException
  }
  
  @NotNull
  public Integer getEndInclusive() {
    return Integer.valueOf(getLast());
  }
  
  public IntRange(int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2, 1);
  }
  
  @NotNull
  public String toString() {
    long l = b ^ 0x3EF932AE39FFL;
    return getFirst() + ".." + getLast();
  }
  
  @NotNull
  public Integer getStart() {
    return Integer.valueOf(getFirst());
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\IntRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
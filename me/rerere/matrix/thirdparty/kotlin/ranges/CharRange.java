package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CharRange extends CharProgression implements ClosedRange, OpenEndRange {
  @NotNull
  public static final CharRange$Companion Companion;
  
  @NotNull
  private static final CharRange EMPTY;
  
  private static final long b = o3.a(-3335482739001765553L, 651360526209297919L, null).a(53335334864737L);
  
  @NotNull
  public Character getEndExclusive() {
    long l = b ^ 0x44BACB01F91EL;
    try {
      if (getLast() == Character.MAX_VALUE)
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString()); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return Character.valueOf((char)(getLast() + 1));
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * getFirst() + getLast());
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/CharRange
    //   4: ifeq -> 88
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/CharRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 80
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual getFirst : ()C
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/CharRange
    //   46: invokevirtual getFirst : ()C
    //   49: if_icmpne -> 88
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   58: athrow
    //   59: aload_0
    //   60: invokevirtual getLast : ()C
    //   63: aload_1
    //   64: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/CharRange
    //   67: invokevirtual getLast : ()C
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
  
  public CharRange(char paramChar1, char paramChar2) {
    super(paramChar1, paramChar2, 1);
  }
  
  static {
    Companion = new CharRange$Companion(null);
    EMPTY = new CharRange('\001', false);
  }
  
  @NotNull
  public String toString() {
    long l = b ^ 0x247122EBADA4L;
    return getFirst() + ".." + getLast();
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (Intrinsics.compare(getFirst(), getLast()) > 0);
  }
  
  public boolean contains(char paramChar) {
    try {
      if (Intrinsics.compare(getFirst(), paramChar) <= 0)
        try {
          if (Intrinsics.compare(paramChar, getLast()) <= 0);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public Character getEndInclusive() {
    return Character.valueOf(getLast());
  }
  
  @NotNull
  public Character getStart() {
    return Character.valueOf(getFirst());
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\CharRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class ComparableRange implements ClosedRange {
  @NotNull
  private final Comparable endInclusive;
  
  @NotNull
  private final Comparable start;
  
  private static final long a = o3.a(-423316845907466465L, 10367374121168559L, null).a(36206730229609L);
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * getStart().hashCode() + getEndInclusive().hashCode());
  }
  
  public ComparableRange(@NotNull Comparable paramComparable1, @NotNull Comparable paramComparable2) {
    this.start = paramComparable1;
    this.endInclusive = paramComparable2;
  }
  
  @NotNull
  public Comparable getEndInclusive() {
    return this.endInclusive;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x420F1D7592FCL;
    return getStart() + ".." + getEndInclusive();
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/ComparableRange
    //   4: ifeq -> 94
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ComparableRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 86
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual getStart : ()Ljava/lang/Comparable;
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ComparableRange
    //   46: invokevirtual getStart : ()Ljava/lang/Comparable;
    //   49: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   52: ifeq -> 94
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   61: athrow
    //   62: aload_0
    //   63: invokevirtual getEndInclusive : ()Ljava/lang/Comparable;
    //   66: aload_1
    //   67: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ComparableRange
    //   70: invokevirtual getEndInclusive : ()Ljava/lang/Comparable;
    //   73: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   76: ifeq -> 94
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: iconst_1
    //   87: goto -> 95
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: iconst_0
    //   95: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/RuntimeException
    //   7	31	34	java/lang/RuntimeException
    //   21	55	58	java/lang/RuntimeException
    //   38	79	82	java/lang/RuntimeException
    //   62	90	90	java/lang/RuntimeException
  }
  
  @NotNull
  public Comparable getStart() {
    return this.start;
  }
  
  public boolean contains(@NotNull Comparable paramComparable) {
    return ClosedRange$DefaultImpls.contains(this, paramComparable);
  }
  
  public boolean isEmpty() {
    return ClosedRange$DefaultImpls.isEmpty(this);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ComparableRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
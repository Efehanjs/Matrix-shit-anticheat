package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ClosedDoubleRange implements ClosedFloatingPointRange {
  private final double _start;
  
  private final double _endInclusive;
  
  private static final long a = o3.a(-2046128801048608077L, 5229563123926110102L, null).a(98196123305185L);
  
  @NotNull
  public Double getEndInclusive() {
    return Double.valueOf(this._endInclusive);
  }
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * Double.valueOf(this._start).hashCode() + Double.valueOf(this._endInclusive).hashCode());
  }
  
  public boolean contains(double paramDouble) {
    try {
      if (paramDouble >= this._start)
        try {
          if (paramDouble <= this._endInclusive);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public Double getStart() {
    return Double.valueOf(this._start);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x20A3D562AB06L;
    return this._start + ".." + this._endInclusive;
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this._start > this._endInclusive);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/ClosedDoubleRange
    //   4: ifeq -> 114
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ClosedDoubleRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 106
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield _start : D
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ClosedDoubleRange
    //   46: getfield _start : D
    //   49: dcmpg
    //   50: ifne -> 68
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   59: athrow
    //   60: iconst_1
    //   61: goto -> 69
    //   64: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   67: athrow
    //   68: iconst_0
    //   69: ifeq -> 114
    //   72: aload_0
    //   73: getfield _endInclusive : D
    //   76: aload_1
    //   77: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ClosedDoubleRange
    //   80: getfield _endInclusive : D
    //   83: dcmpg
    //   84: ifne -> 102
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: iconst_1
    //   95: goto -> 103
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: iconst_0
    //   103: ifeq -> 114
    //   106: iconst_1
    //   107: goto -> 115
    //   110: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   113: athrow
    //   114: iconst_0
    //   115: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/RuntimeException
    //   7	31	34	java/lang/RuntimeException
    //   21	53	56	java/lang/RuntimeException
    //   38	64	64	java/lang/RuntimeException
    //   69	87	90	java/lang/RuntimeException
    //   72	98	98	java/lang/RuntimeException
    //   103	110	110	java/lang/RuntimeException
  }
  
  public boolean lessThanOrEquals(double paramDouble1, double paramDouble2) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramDouble1 <= paramDouble2);
  }
  
  public ClosedDoubleRange(double paramDouble1, double paramDouble2) {
    this._start = paramDouble1;
    this._endInclusive = paramDouble2;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ClosedDoubleRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
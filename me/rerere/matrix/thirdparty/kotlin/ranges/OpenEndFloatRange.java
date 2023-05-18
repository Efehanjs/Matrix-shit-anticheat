package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class OpenEndFloatRange implements OpenEndRange {
  private final float _start;
  
  private final float _endExclusive;
  
  private static final long a = o3.a(-8884513630088685091L, -7012252826758295336L, null).a(135017902547399L);
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * Float.valueOf(this._start).hashCode() + Float.valueOf(this._endExclusive).hashCode());
  }
  
  @NotNull
  public Float getEndExclusive() {
    return Float.valueOf(this._endExclusive);
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this._start >= this._endExclusive);
  }
  
  public OpenEndFloatRange(float paramFloat1, float paramFloat2) {
    this._start = paramFloat1;
    this._endExclusive = paramFloat2;
  }
  
  public boolean contains(float paramFloat) {
    try {
      if (paramFloat >= this._start)
        try {
          if (paramFloat < this._endExclusive);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x601C7B6CF9FAL;
    return this._start + "..<" + this._endExclusive;
  }
  
  @NotNull
  public Float getStart() {
    return Float.valueOf(this._start);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/OpenEndFloatRange
    //   4: ifeq -> 114
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/OpenEndFloatRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 106
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield _start : F
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/OpenEndFloatRange
    //   46: getfield _start : F
    //   49: fcmpg
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
    //   73: getfield _endExclusive : F
    //   76: aload_1
    //   77: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/OpenEndFloatRange
    //   80: getfield _endExclusive : F
    //   83: fcmpg
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
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\OpenEndFloatRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.internal.ProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class IntProgression implements Iterable, KMappedMarker {
  @NotNull
  public static final IntProgression$Companion Companion;
  
  private final int first;
  
  private final int last;
  
  private final int step;
  
  private static final long a = o3.a(-1078011320425643034L, -1873474627775911897L, null).a(199008804950698L);
  
  @NotNull
  public IntIterator iterator() {
    return new IntProgressionIterator(this.first, this.last, this.step);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   4: ifeq -> 109
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 101
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield first : I
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   46: getfield first : I
    //   49: if_icmpne -> 109
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   58: athrow
    //   59: aload_0
    //   60: getfield last : I
    //   63: aload_1
    //   64: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   67: getfield last : I
    //   70: if_icmpne -> 109
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   79: athrow
    //   80: aload_0
    //   81: getfield step : I
    //   84: aload_1
    //   85: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   88: getfield step : I
    //   91: if_icmpne -> 109
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   100: athrow
    //   101: iconst_1
    //   102: goto -> 110
    //   105: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   108: athrow
    //   109: iconst_0
    //   110: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/IllegalArgumentException
    //   7	31	34	java/lang/IllegalArgumentException
    //   21	52	55	java/lang/IllegalArgumentException
    //   38	73	76	java/lang/IllegalArgumentException
    //   59	94	97	java/lang/IllegalArgumentException
    //   80	105	105	java/lang/IllegalArgumentException
  }
  
  public boolean isEmpty() {
    try {
      if (this.step > 0) {
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
    return (this.first < this.last);
  }
  
  public final int getFirst() {
    return this.first;
  }
  
  public final int getStep() {
    return this.step;
  }
  
  public IntProgression(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt3 == 0)
      throw new IllegalArgumentException("Step must be non-zero."); 
    try {
      if (paramInt3 == Integer.MIN_VALUE)
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.first = paramInt1;
    this.last = ProgressionUtilKt.getProgressionLastElement(paramInt1, paramInt2, paramInt3);
    this.step = paramInt3;
  }
  
  public final int getLast() {
    return this.last;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x4FAF4F018FL;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.step > 0) ? (this.first + ".." + this.last + " step " + this.step) : (this.first + " downTo " + this.last + " step " + -this.step);
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * (31 * this.first + this.last) + this.step);
  }
  
  static {
    Companion = new IntProgression$Companion(null);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\IntProgression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
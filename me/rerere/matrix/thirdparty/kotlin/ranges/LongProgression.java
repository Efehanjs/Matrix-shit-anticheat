package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.LongIterator;
import me.rerere.matrix.thirdparty.kotlin.internal.ProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class LongProgression implements Iterable, KMappedMarker {
  private final long last;
  
  @NotNull
  public static final LongProgression$Companion Companion;
  
  private final long first;
  
  private final long step;
  
  private static final long a = o3.a(6464642032628485031L, 5562845144220601626L, null).a(14110298942649L);
  
  public int hashCode() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (int)(31L * (31L * (this.first ^ this.first >>> 32L) + (this.last ^ this.last >>> 32L)) + (this.step ^ this.step >>> 32L));
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x6B247C697B88L;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.step > 0L) ? (this.first + ".." + this.last + " step " + this.step) : (this.first + " downTo " + this.last + " step " + -this.step);
  }
  
  @NotNull
  public LongIterator iterator() {
    return new LongProgressionIterator(this.first, this.last, this.step);
  }
  
  public boolean isEmpty() {
    try {
      if (this.step > 0L) {
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
  
  public LongProgression(long paramLong1, long paramLong2, long paramLong3) {
    if (paramLong3 == 0L)
      throw new IllegalArgumentException("Step must be non-zero."); 
    try {
      if (paramLong3 == Long.MIN_VALUE)
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.first = paramLong1;
    this.last = ProgressionUtilKt.getProgressionLastElement(paramLong1, paramLong2, paramLong3);
    this.step = paramLong3;
  }
  
  static {
    Companion = new LongProgression$Companion(null);
  }
  
  public final long getLast() {
    return this.last;
  }
  
  public final long getStep() {
    return this.step;
  }
  
  public final long getFirst() {
    return this.first;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/LongProgression
    //   4: ifeq -> 112
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/LongProgression
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 104
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield first : J
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/LongProgression
    //   46: getfield first : J
    //   49: lcmp
    //   50: ifne -> 112
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   59: athrow
    //   60: aload_0
    //   61: getfield last : J
    //   64: aload_1
    //   65: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/LongProgression
    //   68: getfield last : J
    //   71: lcmp
    //   72: ifne -> 112
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   81: athrow
    //   82: aload_0
    //   83: getfield step : J
    //   86: aload_1
    //   87: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/LongProgression
    //   90: getfield step : J
    //   93: lcmp
    //   94: ifne -> 112
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   103: athrow
    //   104: iconst_1
    //   105: goto -> 113
    //   108: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   111: athrow
    //   112: iconst_0
    //   113: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/IllegalArgumentException
    //   7	31	34	java/lang/IllegalArgumentException
    //   21	53	56	java/lang/IllegalArgumentException
    //   38	75	78	java/lang/IllegalArgumentException
    //   60	97	100	java/lang/IllegalArgumentException
    //   82	108	108	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\LongProgression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
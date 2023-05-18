package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalUnsignedTypes;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.UProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class UIntProgression implements Iterable, KMappedMarker {
  private final int first;
  
  private final int step;
  
  @NotNull
  public static final UIntProgression$Companion Companion;
  
  private final int last;
  
  private static final long a = o3.a(-2155005324434553898L, -8026627515210359886L, null).a(144347038689232L);
  
  public final int getFirst-pVg5ArA() {
    return this.first;
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * (31 * this.first + this.last) + this.step);
  }
  
  public final int getLast-pVg5ArA() {
    return this.last;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0xA2BB2EA1E95L;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.step > 0) ? (UInt.toString-impl(this.first) + ".." + UInt.toString-impl(this.last) + " step " + this.step) : (UInt.toString-impl(this.first) + " downTo " + UInt.toString-impl(this.last) + " step " + -this.step);
  }
  
  public final int getStep() {
    return this.step;
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
    return (UnsignedKt.uintCompare(this.first, this.last) < 0);
  }
  
  static {
    Companion = new UIntProgression$Companion(null);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/UIntProgression
    //   4: ifeq -> 109
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/UIntProgression
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 101
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield first : I
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/UIntProgression
    //   46: getfield first : I
    //   49: if_icmpne -> 109
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   58: athrow
    //   59: aload_0
    //   60: getfield last : I
    //   63: aload_1
    //   64: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/UIntProgression
    //   67: getfield last : I
    //   70: if_icmpne -> 109
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   79: athrow
    //   80: aload_0
    //   81: getfield step : I
    //   84: aload_1
    //   85: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/UIntProgression
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
  
  @NotNull
  public final Iterator iterator() {
    return new UIntProgressionIterator(this.first, this.last, this.step, null);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\UIntProgression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
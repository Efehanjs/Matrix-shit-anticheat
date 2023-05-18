package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalUnsignedTypes;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ULong;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.UProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class ULongProgression implements Iterable, KMappedMarker {
  @NotNull
  public static final ULongProgression$Companion Companion;
  
  private final long last;
  
  private final long first;
  
  private final long step;
  
  private static final long a = o3.a(-7705845903231837421L, 7680045723441245260L, null).a(89973130832951L);
  
  @NotNull
  public final Iterator iterator() {
    return new ULongProgressionIterator(this.first, this.last, this.step, null);
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x43E9A429079FL;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (this.step > 0L) ? (ULong.toString-impl(this.first) + ".." + ULong.toString-impl(this.last) + " step " + this.step) : (ULong.toString-impl(this.first) + " downTo " + ULong.toString-impl(this.last) + " step " + -this.step);
  }
  
  public final long getStep() {
    return this.step;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    // Byte code:
    //   0: aload_1
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/ULongProgression
    //   4: ifeq -> 112
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ULongProgression
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 104
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: getfield first : J
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ULongProgression
    //   46: getfield first : J
    //   49: lcmp
    //   50: ifne -> 112
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   59: athrow
    //   60: aload_0
    //   61: getfield last : J
    //   64: aload_1
    //   65: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ULongProgression
    //   68: getfield last : J
    //   71: lcmp
    //   72: ifne -> 112
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   81: athrow
    //   82: aload_0
    //   83: getfield step : J
    //   86: aload_1
    //   87: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/ULongProgression
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
  
  public final long getLast-s-VKNKU() {
    return this.last;
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
    return (UnsignedKt.ulongCompare(this.first, this.last) < 0);
  }
  
  public final long getFirst-s-VKNKU() {
    return this.first;
  }
  
  public int hashCode() {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * (31 * (int)ULong.constructor-impl(this.first ^ ULong.constructor-impl(this.first >>> 32L)) + (int)ULong.constructor-impl(this.last ^ ULong.constructor-impl(this.last >>> 32L))) + (int)(this.step ^ this.step >>> 32L));
  }
  
  static {
    Companion = new ULongProgression$Companion(null);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\ULongProgression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
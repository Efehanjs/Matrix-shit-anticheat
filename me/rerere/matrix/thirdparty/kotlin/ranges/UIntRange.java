package me.rerere.matrix.thirdparty.kotlin.ranges;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalUnsignedTypes;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.UInt;
import me.rerere.matrix.thirdparty.kotlin.UnsignedKt;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UIntRange extends UIntProgression implements ClosedRange, OpenEndRange {
  @NotNull
  private static final UIntRange EMPTY;
  
  @NotNull
  public static final UIntRange$Companion Companion;
  
  private static final long b = o3.a(5127555082017443083L, 6703295218455269797L, null).a(242084158551373L);
  
  public int getEndExclusive-pVg5ArA() {
    long l = b ^ 0x26967AD3DC3AL;
    try {
      if (getLast-pVg5ArA() == -1)
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString()); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return UInt.constructor-impl(getLast-pVg5ArA() + 1);
  }
  
  static {
    Companion = new UIntRange$Companion(null);
    EMPTY = new UIntRange(-1, 0, null);
  }
  
  @NotNull
  public String toString() {
    long l = b ^ 0x45EB9546D285L;
    return UInt.toString-impl(getFirst-pVg5ArA()) + ".." + UInt.toString-impl(getLast-pVg5ArA());
  }
  
  public int getStart-pVg5ArA() {
    return getFirst-pVg5ArA();
  }
  
  public int getEndInclusive-pVg5ArA() {
    return getLast-pVg5ArA();
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (UnsignedKt.uintCompare(getFirst-pVg5ArA(), getLast-pVg5ArA()) > 0);
  }
  
  public boolean contains-WZ4Q5Ns(int paramInt) {
    try {
      if (UnsignedKt.uintCompare(getFirst-pVg5ArA(), paramInt) <= 0)
        try {
          if (UnsignedKt.uintCompare(paramInt, getLast-pVg5ArA()) <= 0);
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
    //   1: instanceof me/rerere/matrix/thirdparty/kotlin/ranges/UIntRange
    //   4: ifeq -> 88
    //   7: aload_0
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 38
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   20: athrow
    //   21: aload_1
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/UIntRange
    //   25: invokevirtual isEmpty : ()Z
    //   28: ifne -> 80
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   37: athrow
    //   38: aload_0
    //   39: invokevirtual getFirst-pVg5ArA : ()I
    //   42: aload_1
    //   43: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/UIntRange
    //   46: invokevirtual getFirst-pVg5ArA : ()I
    //   49: if_icmpne -> 88
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   58: athrow
    //   59: aload_0
    //   60: invokevirtual getLast-pVg5ArA : ()I
    //   63: aload_1
    //   64: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/UIntRange
    //   67: invokevirtual getLast-pVg5ArA : ()I
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
  
  public int hashCode() {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return isEmpty() ? -1 : (31 * getFirst-pVg5ArA() + getLast-pVg5ArA());
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\UIntRange.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
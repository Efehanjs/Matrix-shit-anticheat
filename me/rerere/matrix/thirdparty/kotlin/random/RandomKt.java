package me.rerere.matrix.thirdparty.kotlin.random;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.LongRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RandomKt {
  private static final long a = o3.a(-33010896830622176L, -279208970581983548L, null).a(199833520266635L);
  
  public static final int takeUpperBits(int paramInt1, int paramInt2) {
    return paramInt1 >>> 32 - paramInt2 & -paramInt2 >> 31;
  }
  
  public static final void checkRangeBounds(double paramDouble1, double paramDouble2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramDouble2 > paramDouble1) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = boundsErrorMessage(Double.valueOf(paramDouble1), Double.valueOf(paramDouble2));
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Random Random(int paramInt) {
    return new XorWowRandom(paramInt, paramInt >> 31);
  }
  
  @SinceKotlin(version = "1.3")
  public static final long nextLong(@NotNull Random paramRandom, @NotNull LongRange paramLongRange) {
    long l = a ^ 0x7B83EDBD6467L;
    try {
      Intrinsics.checkNotNullParameter(paramRandom, "<this>");
      Intrinsics.checkNotNullParameter(paramLongRange, "range");
      if (paramLongRange.isEmpty())
        throw new IllegalArgumentException("Cannot get random in empty range: " + paramLongRange); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramLongRange.getLast() < Long.MAX_VALUE) ? paramRandom.nextLong(paramLongRange.getFirst(), paramLongRange.getLast() + 1L) : ((paramLongRange.getFirst() > Long.MIN_VALUE) ? (paramRandom.nextLong(paramLongRange.getFirst() - 1L, paramLongRange.getLast()) + 1L) : paramRandom.nextLong());
  }
  
  public static final void checkRangeBounds(long paramLong1, long paramLong2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramLong2 > paramLong1) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = boundsErrorMessage(Long.valueOf(paramLong1), Long.valueOf(paramLong2));
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  public static final void checkRangeBounds(int paramInt1, int paramInt2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = (paramInt2 > paramInt1) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = boundsErrorMessage(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Random Random(long paramLong) {
    return new XorWowRandom((int)paramLong, (int)(paramLong >> 32L));
  }
  
  @SinceKotlin(version = "1.3")
  public static final int nextInt(@NotNull Random paramRandom, @NotNull IntRange paramIntRange) {
    long l = a ^ 0x2ECB80869DEEL;
    try {
      Intrinsics.checkNotNullParameter(paramRandom, "<this>");
      Intrinsics.checkNotNullParameter(paramIntRange, "range");
      if (paramIntRange.isEmpty())
        throw new IllegalArgumentException("Cannot get random in empty range: " + paramIntRange); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramIntRange.getLast() < Integer.MAX_VALUE) ? paramRandom.nextInt(paramIntRange.getFirst(), paramIntRange.getLast() + 1) : ((paramIntRange.getFirst() > Integer.MIN_VALUE) ? (paramRandom.nextInt(paramIntRange.getFirst() - 1, paramIntRange.getLast()) + 1) : paramRandom.nextInt());
  }
  
  public static final int fastLog2(int paramInt) {
    return 31 - Integer.numberOfLeadingZeros(paramInt);
  }
  
  @NotNull
  public static final String boundsErrorMessage(@NotNull Object paramObject1, @NotNull Object paramObject2) {
    long l = a ^ 0x14E58870F6FBL;
    Intrinsics.checkNotNullParameter(paramObject1, "from");
    Intrinsics.checkNotNullParameter(paramObject2, "until");
    return "Random range is empty: [" + paramObject1 + ", " + paramObject2 + ").";
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\RandomKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
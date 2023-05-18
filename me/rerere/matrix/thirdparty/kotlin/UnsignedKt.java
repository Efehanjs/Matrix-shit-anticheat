package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.CharsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class UnsignedKt {
  private static final long a = o3.a(3498244608727396305L, 6675934517006763035L, null).a(200820795297440L);
  
  @PublishedApi
  public static final int ulongCompare(long paramLong1, long paramLong2) {
    return Intrinsics.compare(paramLong1 ^ Long.MIN_VALUE, paramLong2 ^ Long.MIN_VALUE);
  }
  
  @PublishedApi
  public static final long doubleToULong(double paramDouble) {
    try {
      try {
        try {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Double.isNaN(paramDouble) ? 0L : ((paramDouble <= ulongToDouble(0L)) ? 0L : ((paramDouble >= ulongToDouble(-1L)) ? -1L : ((paramDouble < 9.223372036854776E18D) ? ULong.constructor-impl((long)paramDouble) : ULong.constructor-impl(ULong.constructor-impl((long)(paramDouble - 9.223372036854776E18D)) + Long.MIN_VALUE))));
  }
  
  @PublishedApi
  public static final int uintDivide-J1ME1BU(int paramInt1, int paramInt2) {
    return UInt.constructor-impl((int)((paramInt1 & 0xFFFFFFFFL) / (paramInt2 & 0xFFFFFFFFL)));
  }
  
  @PublishedApi
  public static final long ulongDivide-eb3DHEI(long paramLong1, long paramLong2) {
    long l1 = paramLong1;
    long l2 = paramLong2;
    try {
      if (l2 < 0L) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (ulongCompare(paramLong1, paramLong2) < 0) ? ULong.constructor-impl(0L) : ULong.constructor-impl(1L);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (l1 >= 0L)
        return ULong.constructor-impl(l1 / l2); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l3 = (l1 >>> 1L) / l2 << 1L;
    long l4 = l1 - l3 * l2;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ULong.constructor-impl(l3 + ((ulongCompare(ULong.constructor-impl(l4), ULong.constructor-impl(l2)) >= 0) ? 1L : 0L));
  }
  
  @PublishedApi
  public static final int uintRemainder-J1ME1BU(int paramInt1, int paramInt2) {
    return UInt.constructor-impl((int)((paramInt1 & 0xFFFFFFFFL) % (paramInt2 & 0xFFFFFFFFL)));
  }
  
  @PublishedApi
  public static final double ulongToDouble(long paramLong) {
    return (paramLong >>> 11L) * 'ࠀ' + (paramLong & 0x7FFL);
  }
  
  @NotNull
  public static final String ulongToString(long paramLong, int paramInt) {
    long l1 = a ^ 0x4DEEA999F77L;
    try {
      if (paramLong >= 0L) {
        Intrinsics.checkNotNullExpressionValue(Long.toString(paramLong, CharsKt.checkRadix(paramInt)), "toString(this, checkRadix(radix))");
        return Long.toString(paramLong, CharsKt.checkRadix(paramInt));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l2 = (paramLong >>> 1L) / paramInt << 1L;
    long l3 = paramLong - l2 * paramInt;
    if (l3 >= paramInt) {
      l3 -= paramInt;
      l2++;
    } 
    Intrinsics.checkNotNullExpressionValue(Long.toString(l2, CharsKt.checkRadix(paramInt)), "toString(this, checkRadix(radix))");
    Intrinsics.checkNotNullExpressionValue(Long.toString(l3, CharsKt.checkRadix(paramInt)), "toString(this, checkRadix(radix))");
    return Long.toString(l2, CharsKt.checkRadix(paramInt)) + Long.toString(l3, CharsKt.checkRadix(paramInt));
  }
  
  @NotNull
  public static final String ulongToString(long paramLong) {
    return ulongToString(paramLong, 10);
  }
  
  @PublishedApi
  public static final long ulongRemainder-eb3DHEI(long paramLong1, long paramLong2) {
    long l1 = paramLong1;
    long l2 = paramLong2;
    try {
      if (l2 < 0L) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (ulongCompare(paramLong1, paramLong2) < 0) ? paramLong1 : ULong.constructor-impl(paramLong1 - paramLong2);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (l1 >= 0L)
        return ULong.constructor-impl(l1 % l2); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l3 = (l1 >>> 1L) / l2 << 1L;
    long l4 = l1 - l3 * l2;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ULong.constructor-impl(l4 - ((ulongCompare(ULong.constructor-impl(l4), ULong.constructor-impl(l2)) >= 0) ? l2 : 0L));
  }
  
  @PublishedApi
  public static final int doubleToUInt(double paramDouble) {
    try {
      try {
        try {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Double.isNaN(paramDouble) ? 0 : ((paramDouble <= uintToDouble(0)) ? 0 : ((paramDouble >= uintToDouble(-1)) ? -1 : ((paramDouble <= 2.147483647E9D) ? UInt.constructor-impl((int)paramDouble) : UInt.constructor-impl(UInt.constructor-impl((int)(paramDouble - 2147483647)) + UInt.constructor-impl(2147483647)))));
  }
  
  @PublishedApi
  public static final double uintToDouble(int paramInt) {
    return (paramInt & Integer.MAX_VALUE) + (paramInt >>> 31 << 30) * 2;
  }
  
  @PublishedApi
  public static final int uintCompare(int paramInt1, int paramInt2) {
    return Intrinsics.compare(paramInt1 ^ Integer.MIN_VALUE, paramInt2 ^ Integer.MIN_VALUE);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\UnsignedKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
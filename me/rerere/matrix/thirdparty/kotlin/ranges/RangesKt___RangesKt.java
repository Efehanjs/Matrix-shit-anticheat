package me.rerere.matrix.thirdparty.kotlin.ranges;

import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.kotlin.random.RandomKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class RangesKt___RangesKt extends RangesKt__RangesKt {
  private static final long b = o3.a(2425986105708755334L, 2461680381158187452L, null).a(32974412561346L);
  
  @NotNull
  public static final IntRange until(short paramShort, byte paramByte) {
    return new IntRange(paramShort, paramByte - 1);
  }
  
  @Nullable
  public static final Short toShortExactOrNull(int paramInt) {
    return (new IntRange(-32768, 32767)).contains(paramInt) ? Short.valueOf((short)paramInt) : null;
  }
  
  public static final byte coerceAtMost(byte paramByte1, byte paramByte2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramByte1 > paramByte2) ? paramByte2 : paramByte1;
  }
  
  @NotNull
  public static final LongRange until(long paramLong, short paramShort) {
    return new LongRange(paramLong, paramShort - 1L);
  }
  
  @NotNull
  public static final Comparable coerceIn(@NotNull Comparable<Comparable> paramComparable, @NotNull ClosedRange paramClosedRange) {
    long l = b ^ 0x37EE2385AD6DL;
    try {
      Intrinsics.checkNotNullParameter(paramComparable, "<this>");
      Intrinsics.checkNotNullParameter(paramClosedRange, "range");
      if (paramClosedRange instanceof ClosedFloatingPointRange)
        return RangesKt.coerceIn(paramComparable, (ClosedFloatingPointRange)paramClosedRange); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramClosedRange.isEmpty())
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + paramClosedRange + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramComparable.compareTo(paramClosedRange.getStart()) < 0) ? paramClosedRange.getStart() : ((paramComparable.compareTo(paramClosedRange.getEndInclusive()) > 0) ? paramClosedRange.getEndInclusive() : paramComparable);
  }
  
  @NotNull
  public static final IntProgression reversed(@NotNull IntProgression paramIntProgression) {
    long l = b ^ 0x347F91DD2A3L;
    Intrinsics.checkNotNullParameter(paramIntProgression, "<this>");
    return IntProgression.Companion.fromClosedRange(paramIntProgression.getLast(), paramIntProgression.getFirst(), -paramIntProgression.getStep());
  }
  
  @NotNull
  public static final IntProgression downTo(int paramInt1, int paramInt2) {
    return IntProgression.Companion.fromClosedRange(paramInt1, paramInt2, -1);
  }
  
  @SinceKotlin(version = "1.7")
  public static final char first(@NotNull CharProgression paramCharProgression) {
    long l = b ^ 0x19B7EB88B619L;
    try {
      Intrinsics.checkNotNullParameter(paramCharProgression, "<this>");
      if (paramCharProgression.isEmpty())
        throw new NoSuchElementException("Progression " + paramCharProgression + " is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramCharProgression.getFirst();
  }
  
  @Nullable
  public static final Short toShortExactOrNull(double paramDouble) {
    try {
      if (-32768.0D <= paramDouble) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Short.valueOf((short)(int)paramDouble) : null;
  }
  
  @Nullable
  public static final Byte toByteExactOrNull(float paramFloat) {
    try {
      if (-128.0F <= paramFloat) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Byte.valueOf((byte)(int)paramFloat) : null;
  }
  
  @Nullable
  public static final Byte toByteExactOrNull(double paramDouble) {
    try {
      if (-128.0D <= paramDouble) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Byte.valueOf((byte)(int)paramDouble) : null;
  }
  
  @Nullable
  public static final Short toShortExactOrNull(float paramFloat) {
    try {
      if (-32768.0F <= paramFloat) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Short.valueOf((short)(int)paramFloat) : null;
  }
  
  public static final boolean shortRangeContains(@NotNull ClosedRange paramClosedRange, long paramLong) {
    long l = b ^ 0x91759A8D46DL;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    Short short_1 = RangesKt.toShortExactOrNull(paramLong);
    Short short_2 = short_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (short_2 != null) ? paramClosedRange.contains(short_2) : false;
  }
  
  @Nullable
  public static final Long toLongExactOrNull(double paramDouble) {
    try {
      if (-9.223372036854776E18D <= paramDouble) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Long.valueOf((long)paramDouble) : null;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean intRangeContains(@NotNull OpenEndRange paramOpenEndRange, long paramLong) {
    long l = b ^ 0x36FCAE43D85L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    Integer integer1 = RangesKt.toIntExactOrNull(paramLong);
    Integer integer2 = integer1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (integer2 != null) ? paramOpenEndRange.contains(integer2) : false;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean doubleRangeContains(@NotNull OpenEndRange paramOpenEndRange, float paramFloat) {
    long l = b ^ 0x789CB3891372L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    return paramOpenEndRange.contains(Double.valueOf(paramFloat));
  }
  
  @NotNull
  public static final LongRange until(long paramLong, int paramInt) {
    return new LongRange(paramLong, paramInt - 1L);
  }
  
  public static final short coerceIn(short paramShort1, short paramShort2, short paramShort3) {
    long l = b ^ 0x9499B245361L;
    try {
      if (paramShort2 > paramShort3)
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramShort3 + " is less than minimum " + paramShort2 + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramShort1 < paramShort2)
        return paramShort2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramShort1 > paramShort3)
        return paramShort3; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramShort1;
  }
  
  public static final boolean shortRangeContains(@NotNull ClosedRange paramClosedRange, int paramInt) {
    long l = b ^ 0x602EBB1683FCL;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    Short short_1 = RangesKt.toShortExactOrNull(paramInt);
    Short short_2 = short_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (short_2 != null) ? paramClosedRange.contains(short_2) : false;
  }
  
  @SinceKotlin(version = "1.3")
  public static final char random(@NotNull CharRange paramCharRange, @NotNull Random paramRandom) {
    long l = b ^ 0x5392FD6FE697L;
    Intrinsics.checkNotNullParameter(paramCharRange, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    try {
      return (char)paramRandom.nextInt(paramCharRange.getFirst(), paramCharRange.getLast() + 1);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new NoSuchElementException(illegalArgumentException.getMessage());
    } 
  }
  
  public static final boolean doubleRangeContains(@NotNull ClosedRange paramClosedRange, float paramFloat) {
    long l = b ^ 0x5C2790BC152AL;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Double.valueOf(paramFloat));
  }
  
  @NotNull
  public static final CharProgression reversed(@NotNull CharProgression paramCharProgression) {
    long l = b ^ 0x51570F868121L;
    Intrinsics.checkNotNullParameter(paramCharProgression, "<this>");
    return CharProgression.Companion.fromClosedRange(paramCharProgression.getLast(), paramCharProgression.getFirst(), -paramCharProgression.getStep());
  }
  
  @Nullable
  public static final Integer toIntExactOrNull(float paramFloat) {
    try {
      if (-2.14748365E9F <= paramFloat) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Integer.valueOf((int)paramFloat) : null;
  }
  
  @NotNull
  public static final IntProgression downTo(byte paramByte, short paramShort) {
    return IntProgression.Companion.fromClosedRange(paramByte, paramShort, -1);
  }
  
  @NotNull
  public static final IntRange until(int paramInt, short paramShort) {
    return new IntRange(paramInt, paramShort - 1);
  }
  
  @Nullable
  public static final Byte toByteExactOrNull(short paramShort) {
    return RangesKt.intRangeContains(new IntRange(-128, 127), paramShort) ? Byte.valueOf((byte)paramShort) : null;
  }
  
  @NotNull
  public static final IntRange until(byte paramByte1, byte paramByte2) {
    return new IntRange(paramByte1, paramByte2 - 1);
  }
  
  public static final byte coerceIn(byte paramByte1, byte paramByte2, byte paramByte3) {
    long l = b ^ 0x23F80DC22EC4L;
    try {
      if (paramByte2 > paramByte3)
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramByte3 + " is less than minimum " + paramByte2 + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramByte1 < paramByte2)
        return paramByte2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramByte1 > paramByte3)
        return paramByte3; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramByte1;
  }
  
  @NotNull
  public static final IntProgression downTo(int paramInt, byte paramByte) {
    return IntProgression.Companion.fromClosedRange(paramInt, paramByte, -1);
  }
  
  @NotNull
  public static final IntRange until(int paramInt1, int paramInt2) {
    try {
      if (paramInt2 <= Integer.MIN_VALUE)
        return IntRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new IntRange(paramInt1, paramInt2 - 1);
  }
  
  public static final long coerceIn(long paramLong1, long paramLong2, long paramLong3) {
    long l = b ^ 0x1E992332A478L;
    try {
      if (paramLong2 > paramLong3)
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramLong3 + " is less than minimum " + paramLong2 + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramLong1 < paramLong2)
        return paramLong2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramLong1 > paramLong3)
        return paramLong3; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramLong1;
  }
  
  public static final boolean longRangeContains(@NotNull ClosedRange paramClosedRange, byte paramByte) {
    long l = b ^ 0x41014D03A8A6L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Long.valueOf(paramByte));
  }
  
  @Nullable
  public static final Byte toByteExactOrNull(int paramInt) {
    return (new IntRange(-128, 127)).contains(paramInt) ? Byte.valueOf((byte)paramInt) : null;
  }
  
  @Nullable
  public static final Integer toIntExactOrNull(double paramDouble) {
    try {
      if (-2.147483648E9D <= paramDouble) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Integer.valueOf((int)paramDouble) : null;
  }
  
  @NotNull
  public static final CharProgression downTo(char paramChar1, char paramChar2) {
    return CharProgression.Companion.fromClosedRange(paramChar1, paramChar2, -1);
  }
  
  @NotNull
  public static final IntProgression downTo(byte paramByte, int paramInt) {
    return IntProgression.Companion.fromClosedRange(paramByte, paramInt, -1);
  }
  
  public static final boolean floatRangeContains(@NotNull ClosedRange paramClosedRange, double paramDouble) {
    long l = b ^ 0x18D5162478D7L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Float.valueOf((float)paramDouble));
  }
  
  public static final int coerceIn(int paramInt1, int paramInt2, int paramInt3) {
    long l = b ^ 0x3E285C03924AL;
    try {
      if (paramInt2 > paramInt3)
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramInt3 + " is less than minimum " + paramInt2 + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt1 < paramInt2)
        return paramInt2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramInt1 > paramInt3)
        return paramInt3; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramInt1;
  }
  
  public static final boolean intRangeContains(@NotNull ClosedRange paramClosedRange, byte paramByte) {
    long l = b ^ 0x6DBE7EA5BCC8L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Integer.valueOf(paramByte));
  }
  
  @SinceKotlin(version = "1.7")
  @Nullable
  public static final Integer lastOrNull(@NotNull IntProgression paramIntProgression) {
    long l = b ^ 0x1C62C3F74903L;
    try {
      Intrinsics.checkNotNullParameter(paramIntProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramIntProgression.isEmpty() ? null : Integer.valueOf(paramIntProgression.getLast());
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean shortRangeContains(@NotNull OpenEndRange paramOpenEndRange, long paramLong) {
    long l = b ^ 0x252DA429FFB4L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    Short short_1 = RangesKt.toShortExactOrNull(paramLong);
    Short short_2 = short_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (short_2 != null) ? paramOpenEndRange.contains(short_2) : false;
  }
  
  public static final boolean byteRangeContains(@NotNull ClosedRange paramClosedRange, short paramShort) {
    long l = b ^ 0x4D927177A05DL;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    Byte byte_1 = RangesKt.toByteExactOrNull(paramShort);
    Byte byte_2 = byte_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (byte_2 != null) ? paramClosedRange.contains(byte_2) : false;
  }
  
  @NotNull
  public static final LongProgression step(@NotNull LongProgression paramLongProgression, long paramLong) {
    long l = b ^ 0x639659D10F4DL;
    try {
      Intrinsics.checkNotNullParameter(paramLongProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      RangesKt.checkStepIsPositive((paramLong > 0L), Long.valueOf(paramLong));
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return LongProgression.Companion.fromClosedRange(paramLongProgression.getFirst(), paramLongProgression.getLast(), (paramLongProgression.getStep() > 0L) ? paramLong : -paramLong);
  }
  
  public static final byte coerceAtLeast(byte paramByte1, byte paramByte2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramByte1 < paramByte2) ? paramByte2 : paramByte1;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Integer randomOrNull(@NotNull IntRange paramIntRange, @NotNull Random paramRandom) {
    long l = b ^ 0x77CFCBBB89C4L;
    try {
      Intrinsics.checkNotNullParameter(paramIntRange, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (paramIntRange.isEmpty())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Integer.valueOf(RandomKt.nextInt(paramRandom, paramIntRange));
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean longRangeContains(@NotNull OpenEndRange paramOpenEndRange, byte paramByte) {
    long l = b ^ 0x756D04CA2577L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    return paramOpenEndRange.contains(Long.valueOf(paramByte));
  }
  
  @NotNull
  public static final CharRange until(char paramChar1, char paramChar2) {
    try {
      if (Intrinsics.compare(paramChar2, 0) <= 0)
        return CharRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new CharRange(paramChar1, (char)(paramChar2 - 1));
  }
  
  public static final double coerceIn(double paramDouble1, double paramDouble2, double paramDouble3) {
    long l = b ^ 0x30C725EE935EL;
    try {
      if (paramDouble2 > paramDouble3)
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramDouble3 + " is less than minimum " + paramDouble2 + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramDouble1 < paramDouble2)
        return paramDouble2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramDouble1 > paramDouble3)
        return paramDouble3; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramDouble1;
  }
  
  @NotNull
  public static final IntRange until(byte paramByte, short paramShort) {
    return new IntRange(paramByte, paramShort - 1);
  }
  
  @SinceKotlin(version = "1.7")
  @Nullable
  public static final Integer firstOrNull(@NotNull IntProgression paramIntProgression) {
    long l = b ^ 0x540591B99AAEL;
    try {
      Intrinsics.checkNotNullParameter(paramIntProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramIntProgression.isEmpty() ? null : Integer.valueOf(paramIntProgression.getFirst());
  }
  
  public static final boolean longRangeContains(@NotNull ClosedRange paramClosedRange, int paramInt) {
    long l = b ^ 0x609FC4020D46L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Long.valueOf(paramInt));
  }
  
  @NotNull
  public static final IntProgression downTo(short paramShort1, short paramShort2) {
    return IntProgression.Companion.fromClosedRange(paramShort1, paramShort2, -1);
  }
  
  @NotNull
  public static final LongProgression downTo(short paramShort, long paramLong) {
    return LongProgression.Companion.fromClosedRange(paramShort, paramLong, -1L);
  }
  
  @NotNull
  public static final LongProgression downTo(int paramInt, long paramLong) {
    return LongProgression.Companion.fromClosedRange(paramInt, paramLong, -1L);
  }
  
  public static final long coerceAtMost(long paramLong1, long paramLong2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramLong1 > paramLong2) ? paramLong2 : paramLong1;
  }
  
  @NotNull
  public static final IntProgression downTo(short paramShort, int paramInt) {
    return IntProgression.Companion.fromClosedRange(paramShort, paramInt, -1);
  }
  
  @SinceKotlin(version = "1.7")
  @Nullable
  public static final Long lastOrNull(@NotNull LongProgression paramLongProgression) {
    long l = b ^ 0xD067B776B49L;
    try {
      Intrinsics.checkNotNullParameter(paramLongProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramLongProgression.isEmpty() ? null : Long.valueOf(paramLongProgression.getLast());
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean shortRangeContains(@NotNull OpenEndRange paramOpenEndRange, int paramInt) {
    long l = b ^ 0x8829A64B847L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    Short short_1 = RangesKt.toShortExactOrNull(paramInt);
    Short short_2 = short_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (short_2 != null) ? paramOpenEndRange.contains(short_2) : false;
  }
  
  public static final boolean byteRangeContains(@NotNull ClosedRange paramClosedRange, long paramLong) {
    long l = b ^ 0x34625D97961AL;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    Byte byte_1 = RangesKt.toByteExactOrNull(paramLong);
    Byte byte_2 = byte_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (byte_2 != null) ? paramClosedRange.contains(byte_2) : false;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean intRangeContains(@NotNull OpenEndRange paramOpenEndRange, byte paramByte) {
    long l = b ^ 0x741893221C97L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    return paramOpenEndRange.contains(Integer.valueOf(paramByte));
  }
  
  @NotNull
  public static final IntRange until(int paramInt, byte paramByte) {
    return new IntRange(paramInt, paramByte - 1);
  }
  
  public static final double coerceAtLeast(double paramDouble1, double paramDouble2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramDouble1 < paramDouble2) ? paramDouble2 : paramDouble1;
  }
  
  @SinceKotlin(version = "1.7")
  @Nullable
  public static final Character firstOrNull(@NotNull CharProgression paramCharProgression) {
    long l = b ^ 0xE30752361FBL;
    try {
      Intrinsics.checkNotNullParameter(paramCharProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramCharProgression.isEmpty() ? null : Character.valueOf(paramCharProgression.getFirst());
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Character randomOrNull(@NotNull CharRange paramCharRange, @NotNull Random paramRandom) {
    long l = b ^ 0x54B6861A21F6L;
    try {
      Intrinsics.checkNotNullParameter(paramCharRange, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (paramCharRange.isEmpty())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Character.valueOf((char)paramRandom.nextInt(paramCharRange.getFirst(), paramCharRange.getLast() + 1));
  }
  
  @SinceKotlin(version = "1.7")
  @Nullable
  public static final Character lastOrNull(@NotNull CharProgression paramCharProgression) {
    long l = b ^ 0x1FCE5BBAFB01L;
    try {
      Intrinsics.checkNotNullParameter(paramCharProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramCharProgression.isEmpty() ? null : Character.valueOf(paramCharProgression.getLast());
  }
  
  @NotNull
  public static final LongProgression downTo(long paramLong, short paramShort) {
    return LongProgression.Companion.fromClosedRange(paramLong, paramShort, -1L);
  }
  
  public static final long coerceAtLeast(long paramLong1, long paramLong2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramLong1 < paramLong2) ? paramLong2 : paramLong1;
  }
  
  @SinceKotlin(version = "1.3")
  public static final int random(@NotNull IntRange paramIntRange, @NotNull Random paramRandom) {
    long l = b ^ 0x423E95D9B13BL;
    Intrinsics.checkNotNullParameter(paramIntRange, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    try {
      return RandomKt.nextInt(paramRandom, paramIntRange);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new NoSuchElementException(illegalArgumentException.getMessage());
    } 
  }
  
  public static final boolean longRangeContains(@NotNull ClosedRange paramClosedRange, short paramShort) {
    long l = b ^ 0x21473252080AL;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Long.valueOf(paramShort));
  }
  
  @NotNull
  public static final LongRange until(short paramShort, long paramLong) {
    try {
      if (paramLong <= Long.MIN_VALUE)
        return LongRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new LongRange(paramShort, paramLong - 1L);
  }
  
  @Nullable
  public static final Short toShortExactOrNull(long paramLong) {
    return (new LongRange(-32768L, 32767L)).contains(paramLong) ? Short.valueOf((short)(int)paramLong) : null;
  }
  
  @SinceKotlin(version = "1.3")
  public static final long random(@NotNull LongRange paramLongRange, @NotNull Random paramRandom) {
    long l = b ^ 0x4EB2FCA58237L;
    Intrinsics.checkNotNullParameter(paramLongRange, "<this>");
    Intrinsics.checkNotNullParameter(paramRandom, "random");
    try {
      return RandomKt.nextLong(paramRandom, paramLongRange);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new NoSuchElementException(illegalArgumentException.getMessage());
    } 
  }
  
  @NotNull
  public static final LongRange until(long paramLong, byte paramByte) {
    return new LongRange(paramLong, paramByte - 1L);
  }
  
  public static final int coerceAtMost(int paramInt1, int paramInt2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramInt1 > paramInt2) ? paramInt2 : paramInt1;
  }
  
  @NotNull
  public static final LongProgression downTo(long paramLong, byte paramByte) {
    return LongProgression.Companion.fromClosedRange(paramLong, paramByte, -1L);
  }
  
  @NotNull
  public static final IntRange until(byte paramByte, int paramInt) {
    try {
      if (paramInt <= Integer.MIN_VALUE)
        return IntRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new IntRange(paramByte, paramInt - 1);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean longRangeContains(@NotNull OpenEndRange paramOpenEndRange, int paramInt) {
    long l = b ^ 0x73E7AA15109DL;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    return paramOpenEndRange.contains(Long.valueOf(paramInt));
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean byteRangeContains(@NotNull OpenEndRange paramOpenEndRange, int paramInt) {
    long l = b ^ 0x67574D36BC76L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    Byte byte_1 = RangesKt.toByteExactOrNull(paramInt);
    Byte byte_2 = byte_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (byte_2 != null) ? paramOpenEndRange.contains(byte_2) : false;
  }
  
  @NotNull
  public static final LongProgression downTo(byte paramByte, long paramLong) {
    return LongProgression.Companion.fromClosedRange(paramByte, paramLong, -1L);
  }
  
  @SinceKotlin(version = "1.7")
  public static final int first(@NotNull IntProgression paramIntProgression) {
    long l = b ^ 0x52BEA18DF866L;
    try {
      Intrinsics.checkNotNullParameter(paramIntProgression, "<this>");
      if (paramIntProgression.isEmpty())
        throw new NoSuchElementException("Progression " + paramIntProgression + " is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramIntProgression.getFirst();
  }
  
  @NotNull
  public static final LongRange until(long paramLong1, long paramLong2) {
    try {
      if (paramLong2 <= Long.MIN_VALUE)
        return LongRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new LongRange(paramLong1, paramLong2 - 1L);
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean shortRangeContains(@NotNull OpenEndRange paramOpenEndRange, byte paramByte) {
    long l = b ^ 0xB1CF3650FC9L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    return paramOpenEndRange.contains(Short.valueOf((short)paramByte));
  }
  
  @SinceKotlin(version = "1.7")
  public static final char last(@NotNull CharProgression paramCharProgression) {
    long l = b ^ 0x782FED5A7A02L;
    try {
      Intrinsics.checkNotNullParameter(paramCharProgression, "<this>");
      if (paramCharProgression.isEmpty())
        throw new NoSuchElementException("Progression " + paramCharProgression + " is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramCharProgression.getLast();
  }
  
  @NotNull
  public static final LongRange until(int paramInt, long paramLong) {
    try {
      if (paramLong <= Long.MIN_VALUE)
        return LongRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new LongRange(paramInt, paramLong - 1L);
  }
  
  @NotNull
  public static final LongProgression downTo(long paramLong, int paramInt) {
    return LongProgression.Companion.fromClosedRange(paramLong, paramInt, -1L);
  }
  
  @SinceKotlin(version = "1.1")
  @NotNull
  public static final Comparable coerceIn(@NotNull Comparable paramComparable, @NotNull ClosedFloatingPointRange paramClosedFloatingPointRange) {
    long l = b ^ 0x7C922C8D7E12L;
    try {
      Intrinsics.checkNotNullParameter(paramComparable, "<this>");
      Intrinsics.checkNotNullParameter(paramClosedFloatingPointRange, "range");
      if (paramClosedFloatingPointRange.isEmpty())
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + paramClosedFloatingPointRange + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramClosedFloatingPointRange.lessThanOrEquals(paramComparable, paramClosedFloatingPointRange.getStart()))
        try {
          if (!paramClosedFloatingPointRange.lessThanOrEquals(paramClosedFloatingPointRange.getStart(), paramComparable));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramClosedFloatingPointRange.lessThanOrEquals(paramClosedFloatingPointRange.getEndInclusive(), paramComparable))
        try {
          if (!paramClosedFloatingPointRange.lessThanOrEquals(paramComparable, paramClosedFloatingPointRange.getEndInclusive()));
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramComparable;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean byteRangeContains(@NotNull OpenEndRange paramOpenEndRange, short paramShort) {
    long l = b ^ 0x517D1596D194L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    Byte byte_1 = RangesKt.toByteExactOrNull(paramShort);
    Byte byte_2 = byte_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (byte_2 != null) ? paramOpenEndRange.contains(byte_2) : false;
  }
  
  public static final boolean shortRangeContains(@NotNull ClosedRange paramClosedRange, byte paramByte) {
    long l = b ^ 0x410B2C789E57L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Short.valueOf((short)paramByte));
  }
  
  public static final short coerceAtMost(short paramShort1, short paramShort2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramShort1 > paramShort2) ? paramShort2 : paramShort1;
  }
  
  @NotNull
  public static final LongProgression downTo(long paramLong1, long paramLong2) {
    return LongProgression.Companion.fromClosedRange(paramLong1, paramLong2, -1L);
  }
  
  public static final boolean intRangeContains(@NotNull ClosedRange paramClosedRange, long paramLong) {
    long l = b ^ 0x295AFB642993L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    Integer integer1 = RangesKt.toIntExactOrNull(paramLong);
    Integer integer2 = integer1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (integer2 != null) ? paramClosedRange.contains(integer2) : false;
  }
  
  @NotNull
  public static final IntRange until(short paramShort1, short paramShort2) {
    return new IntRange(paramShort1, paramShort2 - 1);
  }
  
  @NotNull
  public static final IntProgression downTo(int paramInt, short paramShort) {
    return IntProgression.Companion.fromClosedRange(paramInt, paramShort, -1);
  }
  
  public static final float coerceIn(float paramFloat1, float paramFloat2, float paramFloat3) {
    long l = b ^ 0x70A4F5140A54L;
    try {
      if (paramFloat2 > paramFloat3)
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramFloat3 + " is less than minimum " + paramFloat2 + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramFloat1 < paramFloat2)
        return paramFloat2; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramFloat1 > paramFloat3)
        return paramFloat3; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramFloat1;
  }
  
  @SinceKotlin(version = "1.7")
  public static final long last(@NotNull LongProgression paramLongProgression) {
    long l = b ^ 0x4E4D2722EB5CL;
    try {
      Intrinsics.checkNotNullParameter(paramLongProgression, "<this>");
      if (paramLongProgression.isEmpty())
        throw new NoSuchElementException("Progression " + paramLongProgression + " is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramLongProgression.getLast();
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean intRangeContains(@NotNull OpenEndRange paramOpenEndRange, short paramShort) {
    long l = b ^ 0x78C2045C1744L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    return paramOpenEndRange.contains(Integer.valueOf(paramShort));
  }
  
  @SinceKotlin(version = "1.7")
  @Nullable
  public static final Long firstOrNull(@NotNull LongProgression paramLongProgression) {
    long l = b ^ 0xD0F4A9F8E2BL;
    try {
      Intrinsics.checkNotNullParameter(paramLongProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramLongProgression.isEmpty() ? null : Long.valueOf(paramLongProgression.getFirst());
  }
  
  @NotNull
  public static final LongRange until(byte paramByte, long paramLong) {
    try {
      if (paramLong <= Long.MIN_VALUE)
        return LongRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new LongRange(paramByte, paramLong - 1L);
  }
  
  @NotNull
  public static final IntProgression step(@NotNull IntProgression paramIntProgression, int paramInt) {
    long l = b ^ 0x5B76E15D7291L;
    try {
      Intrinsics.checkNotNullParameter(paramIntProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      RangesKt.checkStepIsPositive((paramInt > 0), Integer.valueOf(paramInt));
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return IntProgression.Companion.fromClosedRange(paramIntProgression.getFirst(), paramIntProgression.getLast(), (paramIntProgression.getStep() > 0) ? paramInt : -paramInt);
  }
  
  @Nullable
  public static final Byte toByteExactOrNull(long paramLong) {
    return (new LongRange(-128L, 127L)).contains(paramLong) ? Byte.valueOf((byte)(int)paramLong) : null;
  }
  
  @NotNull
  public static final IntProgression downTo(short paramShort, byte paramByte) {
    return IntProgression.Companion.fromClosedRange(paramShort, paramByte, -1);
  }
  
  public static final double coerceAtMost(double paramDouble1, double paramDouble2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramDouble1 > paramDouble2) ? paramDouble2 : paramDouble1;
  }
  
  public static final float coerceAtMost(float paramFloat1, float paramFloat2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramFloat1 > paramFloat2) ? paramFloat2 : paramFloat1;
  }
  
  public static final long coerceIn(long paramLong, @NotNull ClosedRange paramClosedRange) {
    long l = b ^ 0x793BD6E7EFB6L;
    try {
      Intrinsics.checkNotNullParameter(paramClosedRange, "range");
      if (paramClosedRange instanceof ClosedFloatingPointRange)
        return ((Number)RangesKt.coerceIn(Long.valueOf(paramLong), (ClosedFloatingPointRange)paramClosedRange)).longValue(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramClosedRange.isEmpty())
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + paramClosedRange + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramLong < ((Number)paramClosedRange.getStart()).longValue()) ? ((Number)paramClosedRange.getStart()).longValue() : ((paramLong > ((Number)paramClosedRange.getEndInclusive()).longValue()) ? ((Number)paramClosedRange.getEndInclusive()).longValue() : paramLong);
  }
  
  public static final float coerceAtLeast(float paramFloat1, float paramFloat2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramFloat1 < paramFloat2) ? paramFloat2 : paramFloat1;
  }
  
  public static final boolean byteRangeContains(@NotNull ClosedRange paramClosedRange, int paramInt) {
    long l = b ^ 0x54CAEA19517L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    Byte byte_1 = RangesKt.toByteExactOrNull(paramInt);
    Byte byte_2 = byte_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (byte_2 != null) ? paramClosedRange.contains(byte_2) : false;
  }
  
  @Nullable
  public static final Integer toIntExactOrNull(long paramLong) {
    return (new LongRange(-2147483648L, 2147483647L)).contains(paramLong) ? Integer.valueOf((int)paramLong) : null;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean byteRangeContains(@NotNull OpenEndRange paramOpenEndRange, long paramLong) {
    long l = b ^ 0x5B1567023A2DL;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    Byte byte_1 = RangesKt.toByteExactOrNull(paramLong);
    Byte byte_2 = byte_1;
    boolean bool = false;
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (byte_2 != null) ? paramOpenEndRange.contains(byte_2) : false;
  }
  
  @SinceKotlin(version = "1.7")
  @ExperimentalStdlibApi
  public static final boolean longRangeContains(@NotNull OpenEndRange paramOpenEndRange, short paramShort) {
    long l = b ^ 0x3A7150635F04L;
    Intrinsics.checkNotNullParameter(paramOpenEndRange, "<this>");
    return paramOpenEndRange.contains(Long.valueOf(paramShort));
  }
  
  public static final int coerceIn(int paramInt, @NotNull ClosedRange paramClosedRange) {
    long l = b ^ 0x5D02C9B18F4L;
    try {
      Intrinsics.checkNotNullParameter(paramClosedRange, "range");
      if (paramClosedRange instanceof ClosedFloatingPointRange)
        return ((Number)RangesKt.coerceIn(Integer.valueOf(paramInt), (ClosedFloatingPointRange)paramClosedRange)).intValue(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramClosedRange.isEmpty())
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + paramClosedRange + '.'); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      try {
      
      } catch (NoSuchElementException noSuchElementException) {
        throw a(null);
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramInt < ((Number)paramClosedRange.getStart()).intValue()) ? ((Number)paramClosedRange.getStart()).intValue() : ((paramInt > ((Number)paramClosedRange.getEndInclusive()).intValue()) ? ((Number)paramClosedRange.getEndInclusive()).intValue() : paramInt);
  }
  
  @NotNull
  public static final LongProgression reversed(@NotNull LongProgression paramLongProgression) {
    long l = b ^ 0x2AA8C63C883EL;
    Intrinsics.checkNotNullParameter(paramLongProgression, "<this>");
    return LongProgression.Companion.fromClosedRange(paramLongProgression.getLast(), paramLongProgression.getFirst(), -paramLongProgression.getStep());
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Long randomOrNull(@NotNull LongRange paramLongRange, @NotNull Random paramRandom) {
    long l = b ^ 0x114337C60373L;
    try {
      Intrinsics.checkNotNullParameter(paramLongRange, "<this>");
      Intrinsics.checkNotNullParameter(paramRandom, "random");
      if (paramLongRange.isEmpty())
        return null; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return Long.valueOf(RandomKt.nextLong(paramRandom, paramLongRange));
  }
  
  public static final boolean intRangeContains(@NotNull ClosedRange paramClosedRange, short paramShort) {
    long l = b ^ 0x2462953B61A4L;
    Intrinsics.checkNotNullParameter(paramClosedRange, "<this>");
    return paramClosedRange.contains(Integer.valueOf(paramShort));
  }
  
  @SinceKotlin(version = "1.7")
  public static final long first(@NotNull LongProgression paramLongProgression) {
    long l = b ^ 0x436699B33CA6L;
    try {
      Intrinsics.checkNotNullParameter(paramLongProgression, "<this>");
      if (paramLongProgression.isEmpty())
        throw new NoSuchElementException("Progression " + paramLongProgression + " is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramLongProgression.getFirst();
  }
  
  @NotNull
  public static final Comparable coerceAtMost(@NotNull Comparable<Comparable> paramComparable1, @NotNull Comparable paramComparable2) {
    long l = b ^ 0x4C8DF957DA63L;
    try {
      Intrinsics.checkNotNullParameter(paramComparable1, "<this>");
      Intrinsics.checkNotNullParameter(paramComparable2, "maximumValue");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramComparable1.compareTo(paramComparable2) > 0) ? paramComparable2 : paramComparable1;
  }
  
  @SinceKotlin(version = "1.7")
  public static final int last(@NotNull IntProgression paramIntProgression) {
    long l = b ^ 0x1D8FF3F9F68FL;
    try {
      Intrinsics.checkNotNullParameter(paramIntProgression, "<this>");
      if (paramIntProgression.isEmpty())
        throw new NoSuchElementException("Progression " + paramIntProgression + " is empty."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramIntProgression.getLast();
  }
  
  public static final int coerceAtLeast(int paramInt1, int paramInt2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramInt1 < paramInt2) ? paramInt2 : paramInt1;
  }
  
  @NotNull
  public static final IntRange until(short paramShort, int paramInt) {
    try {
      if (paramInt <= Integer.MIN_VALUE)
        return IntRange.Companion.getEMPTY(); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new IntRange(paramShort, paramInt - 1);
  }
  
  @NotNull
  public static final Comparable coerceIn(@NotNull Comparable<Comparable<Comparable>> paramComparable1, @Nullable Comparable<Comparable> paramComparable2, @Nullable Comparable<Comparable> paramComparable3) {
    long l = b ^ 0x5AF09963CCCCL;
    try {
      Intrinsics.checkNotNullParameter(paramComparable1, "<this>");
      if (paramComparable2 != null)
        try {
          if (paramComparable3 != null) {
            try {
              if (paramComparable2.compareTo(paramComparable3) > 0)
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + paramComparable3 + " is less than minimum " + paramComparable2 + '.'); 
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            } 
            try {
              if (paramComparable1.compareTo(paramComparable2) < 0)
                return paramComparable2; 
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            } 
            try {
              if (paramComparable1.compareTo(paramComparable3) > 0)
                return paramComparable3; 
            } catch (NoSuchElementException noSuchElementException) {
              throw a(null);
            } 
            return paramComparable1;
          } 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramComparable2 != null)
        try {
          if (paramComparable1.compareTo(paramComparable2) < 0)
            return paramComparable2; 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      if (paramComparable3 != null)
        try {
          if (paramComparable1.compareTo(paramComparable3) > 0)
            return paramComparable3; 
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        }  
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return paramComparable1;
  }
  
  public static final short coerceAtLeast(short paramShort1, short paramShort2) {
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramShort1 < paramShort2) ? paramShort2 : paramShort1;
  }
  
  @NotNull
  public static final Comparable coerceAtLeast(@NotNull Comparable<Comparable> paramComparable1, @NotNull Comparable paramComparable2) {
    long l = b ^ 0x11E4E2E52049L;
    try {
      Intrinsics.checkNotNullParameter(paramComparable1, "<this>");
      Intrinsics.checkNotNullParameter(paramComparable2, "minimumValue");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (paramComparable1.compareTo(paramComparable2) < 0) ? paramComparable2 : paramComparable1;
  }
  
  @NotNull
  public static final IntProgression downTo(byte paramByte1, byte paramByte2) {
    return IntProgression.Companion.fromClosedRange(paramByte1, paramByte2, -1);
  }
  
  @Nullable
  public static final Long toLongExactOrNull(float paramFloat) {
    try {
      if (-9.223372E18F <= paramFloat) {
        try {
        
        } catch (NoSuchElementException noSuchElementException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return false ? Long.valueOf((long)paramFloat) : null;
  }
  
  @NotNull
  public static final CharProgression step(@NotNull CharProgression paramCharProgression, int paramInt) {
    long l = b ^ 0x42236AFD8E8EL;
    try {
      Intrinsics.checkNotNullParameter(paramCharProgression, "<this>");
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    try {
      RangesKt.checkStepIsPositive((paramInt > 0), Integer.valueOf(paramInt));
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return CharProgression.Companion.fromClosedRange(paramCharProgression.getFirst(), paramCharProgression.getLast(), (paramCharProgression.getStep() > 0) ? paramInt : -paramInt);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ranges\RangesKt___RangesKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
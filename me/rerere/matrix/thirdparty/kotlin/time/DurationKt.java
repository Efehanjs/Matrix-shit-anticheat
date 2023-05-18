package me.rerere.matrix.thirdparty.kotlin.time;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.math.MathKt;
import me.rerere.matrix.thirdparty.kotlin.ranges.LongRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DurationKt {
  public static final int NANOS_IN_MILLIS = 1000000;
  
  public static final long MAX_NANOS = 4611686018426999999L;
  
  public static final long MAX_MILLIS = 4611686018427387903L;
  
  private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
  
  private static final long a = o3.a(-5647004778342551791L, -277016426930436083L, null).a(31432078276185L);
  
  public static final long getSeconds(long paramLong) {
    return toDuration(paramLong, DurationUnit.SECONDS);
  }
  
  public static final long getMilliseconds(long paramLong) {
    return toDuration(paramLong, DurationUnit.MILLISECONDS);
  }
  
  @SinceKotlin(version = "1.6")
  @WasExperimental(markerClass = {ExperimentalTime.class})
  public static final long toDuration(double paramDouble, @NotNull DurationUnit paramDurationUnit) {
    long l1 = a ^ 0x4A76DB2BDCBL;
    Intrinsics.checkNotNullParameter(paramDurationUnit, "unit");
    double d = DurationUnitKt.convertDurationUnit(paramDouble, paramDurationUnit, DurationUnit.NANOSECONDS);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    boolean bool = !Double.isNaN(d) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Duration value cannot be NaN.";
      throw new IllegalArgumentException(str.toString());
    } 
    long l2 = MathKt.roundToLong(d);
    long l3 = MathKt.roundToLong(DurationUnitKt.convertDurationUnit(paramDouble, paramDurationUnit, DurationUnit.MILLISECONDS));
    return (new LongRange(-4611686018426999999L, 4611686018426999999L)).contains(l2) ? durationOfNanos(l2) : durationOfMillisNormalized(l3);
  }
  
  public static final long getHours(double paramDouble) {
    return toDuration(paramDouble, DurationUnit.HOURS);
  }
  
  public static final long getDays(double paramDouble) {
    return toDuration(paramDouble, DurationUnit.DAYS);
  }
  
  public static final long getMilliseconds(double paramDouble) {
    return toDuration(paramDouble, DurationUnit.MILLISECONDS);
  }
  
  public static final long getHours(int paramInt) {
    return toDuration(paramInt, DurationUnit.HOURS);
  }
  
  public static final long getMicroseconds(double paramDouble) {
    return toDuration(paramDouble, DurationUnit.MICROSECONDS);
  }
  
  @SinceKotlin(version = "1.6")
  @WasExperimental(markerClass = {ExperimentalTime.class})
  public static final long toDuration(long paramLong, @NotNull DurationUnit paramDurationUnit) {
    long l1 = a ^ 0x7ED64872087AL;
    Intrinsics.checkNotNullParameter(paramDurationUnit, "unit");
    long l2 = DurationUnitKt.convertDurationUnitOverflow(4611686018426999999L, DurationUnit.NANOSECONDS, paramDurationUnit);
    if ((new LongRange(-l2, l2)).contains(paramLong))
      return durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(paramLong, paramDurationUnit, DurationUnit.NANOSECONDS)); 
    long l3 = DurationUnitKt.convertDurationUnit(paramLong, paramDurationUnit, DurationUnit.MILLISECONDS);
    return durationOfMillis(RangesKt.coerceIn(l3, -4611686018427387903L, 4611686018427387903L));
  }
  
  public static final long getMicroseconds(int paramInt) {
    return toDuration(paramInt, DurationUnit.MICROSECONDS);
  }
  
  @SinceKotlin(version = "1.6")
  @WasExperimental(markerClass = {ExperimentalTime.class})
  public static final long toDuration(int paramInt, @NotNull DurationUnit paramDurationUnit) {
    long l = a ^ 0x492FD95F7148L;
    try {
      Intrinsics.checkNotNullParameter(paramDurationUnit, "unit");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramDurationUnit.compareTo((E)DurationUnit.SECONDS) <= 0) ? durationOfNanos(DurationUnitKt.convertDurationUnitOverflow(paramInt, paramDurationUnit, DurationUnit.NANOSECONDS)) : toDuration(paramInt, paramDurationUnit);
  }
  
  public static final long getMicroseconds(long paramLong) {
    return toDuration(paramLong, DurationUnit.MICROSECONDS);
  }
  
  public static final long getMinutes(long paramLong) {
    return toDuration(paramLong, DurationUnit.MINUTES);
  }
  
  public static final long getNanoseconds(long paramLong) {
    return toDuration(paramLong, DurationUnit.NANOSECONDS);
  }
  
  public static final long getSeconds(int paramInt) {
    return toDuration(paramInt, DurationUnit.SECONDS);
  }
  
  public static final long getSeconds(double paramDouble) {
    return toDuration(paramDouble, DurationUnit.SECONDS);
  }
  
  public static final long getNanoseconds(int paramInt) {
    return toDuration(paramInt, DurationUnit.NANOSECONDS);
  }
  
  public static final long getHours(long paramLong) {
    return toDuration(paramLong, DurationUnit.HOURS);
  }
  
  public static final long getMilliseconds(int paramInt) {
    return toDuration(paramInt, DurationUnit.MILLISECONDS);
  }
  
  public static final long getMinutes(double paramDouble) {
    return toDuration(paramDouble, DurationUnit.MINUTES);
  }
  
  public static final long getMinutes(int paramInt) {
    return toDuration(paramInt, DurationUnit.MINUTES);
  }
  
  public static final long getDays(int paramInt) {
    return toDuration(paramInt, DurationUnit.DAYS);
  }
  
  public static final long getDays(long paramLong) {
    return toDuration(paramLong, DurationUnit.DAYS);
  }
  
  public static final long getNanoseconds(double paramDouble) {
    return toDuration(paramDouble, DurationUnit.NANOSECONDS);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\DurationKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
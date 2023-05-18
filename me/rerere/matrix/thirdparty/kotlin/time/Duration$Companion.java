package me.rerere.matrix.thirdparty.kotlin.time;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Duration$Companion {
  private static final long a = o3.a(-1431151696442647107L, 1019209674760044256L, null).a(258191104524724L);
  
  public final long getNEG_INFINITE-UwyO8pc$kotlin_stdlib() {
    return Duration.access$getNEG_INFINITE$cp();
  }
  
  @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.seconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long seconds-UwyO8pc(int paramInt) {
    return DurationKt.toDuration(paramInt, DurationUnit.SECONDS);
  }
  
  @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.seconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long seconds-UwyO8pc(long paramLong) {
    return DurationKt.toDuration(paramLong, DurationUnit.SECONDS);
  }
  
  @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.seconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long seconds-UwyO8pc(double paramDouble) {
    return DurationKt.toDuration(paramDouble, DurationUnit.SECONDS);
  }
  
  @ExperimentalTime
  public final double convert(double paramDouble, @NotNull DurationUnit paramDurationUnit1, @NotNull DurationUnit paramDurationUnit2) {
    long l = a ^ 0x129175BED46AL;
    Intrinsics.checkNotNullParameter(paramDurationUnit1, "sourceUnit");
    Intrinsics.checkNotNullParameter(paramDurationUnit2, "targetUnit");
    return DurationUnitKt.convertDurationUnit(paramDouble, paramDurationUnit1, paramDurationUnit2);
  }
  
  @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.minutes"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long minutes-UwyO8pc(long paramLong) {
    return DurationKt.toDuration(paramLong, DurationUnit.MINUTES);
  }
  
  public final long getINFINITE-UwyO8pc() {
    return Duration.access$getINFINITE$cp();
  }
  
  @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.minutes"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long minutes-UwyO8pc(int paramInt) {
    return DurationKt.toDuration(paramInt, DurationUnit.MINUTES);
  }
  
  @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.microseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long microseconds-UwyO8pc(double paramDouble) {
    return DurationKt.toDuration(paramDouble, DurationUnit.MICROSECONDS);
  }
  
  @Nullable
  public final Duration parseOrNull-FghU774(@NotNull String paramString) {
    Duration duration;
    long l = a ^ 0x1528AF836750L;
    Intrinsics.checkNotNullParameter(paramString, "value");
    try {
      duration = Duration.box-impl(DurationKt.access$parseDuration(paramString, false));
    } catch (IllegalArgumentException illegalArgumentException) {
      duration = (Duration)null;
    } 
    return duration;
  }
  
  @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.milliseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long milliseconds-UwyO8pc(double paramDouble) {
    return DurationKt.toDuration(paramDouble, DurationUnit.MILLISECONDS);
  }
  
  @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.nanoseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long nanoseconds-UwyO8pc(double paramDouble) {
    return DurationKt.toDuration(paramDouble, DurationUnit.NANOSECONDS);
  }
  
  @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.minutes"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long minutes-UwyO8pc(double paramDouble) {
    return DurationKt.toDuration(paramDouble, DurationUnit.MINUTES);
  }
  
  @Nullable
  public final Duration parseIsoStringOrNull-FghU774(@NotNull String paramString) {
    Duration duration;
    long l = a ^ 0x67C9DE6BD99EL;
    Intrinsics.checkNotNullParameter(paramString, "value");
    try {
      duration = Duration.box-impl(DurationKt.access$parseDuration(paramString, true));
    } catch (IllegalArgumentException illegalArgumentException) {
      duration = (Duration)null;
    } 
    return duration;
  }
  
  @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.nanoseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long nanoseconds-UwyO8pc(long paramLong) {
    return DurationKt.toDuration(paramLong, DurationUnit.NANOSECONDS);
  }
  
  @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.microseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long microseconds-UwyO8pc(int paramInt) {
    return DurationKt.toDuration(paramInt, DurationUnit.MICROSECONDS);
  }
  
  @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.hours"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long hours-UwyO8pc(double paramDouble) {
    return DurationKt.toDuration(paramDouble, DurationUnit.HOURS);
  }
  
  @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.days"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long days-UwyO8pc(int paramInt) {
    return DurationKt.toDuration(paramInt, DurationUnit.DAYS);
  }
  
  @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.microseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long microseconds-UwyO8pc(long paramLong) {
    return DurationKt.toDuration(paramLong, DurationUnit.MICROSECONDS);
  }
  
  @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.hours"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long hours-UwyO8pc(int paramInt) {
    return DurationKt.toDuration(paramInt, DurationUnit.HOURS);
  }
  
  @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.milliseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long milliseconds-UwyO8pc(long paramLong) {
    return DurationKt.toDuration(paramLong, DurationUnit.MILLISECONDS);
  }
  
  @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.nanoseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long nanoseconds-UwyO8pc(int paramInt) {
    return DurationKt.toDuration(paramInt, DurationUnit.NANOSECONDS);
  }
  
  public final long parseIsoString-UwyO8pc(@NotNull String paramString) {
    long l2;
    long l1 = a ^ 0x5347A584DB1BL;
    Intrinsics.checkNotNullParameter(paramString, "value");
    try {
      l2 = DurationKt.access$parseDuration(paramString, true);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new IllegalArgumentException("Invalid ISO duration string format: '" + paramString + "'.", (Throwable)illegalArgumentException);
    } 
    return l2;
  }
  
  public final long getZERO-UwyO8pc() {
    return Duration.access$getZERO$cp();
  }
  
  @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.days"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long days-UwyO8pc(long paramLong) {
    return DurationKt.toDuration(paramLong, DurationUnit.DAYS);
  }
  
  public final long parse-UwyO8pc(@NotNull String paramString) {
    long l2;
    long l1 = a ^ 0x513219EFC94CL;
    Intrinsics.checkNotNullParameter(paramString, "value");
    try {
      l2 = DurationKt.access$parseDuration(paramString, false);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new IllegalArgumentException("Invalid duration string format: '" + paramString + "'.", (Throwable)illegalArgumentException);
    } 
    return l2;
  }
  
  @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.milliseconds"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long milliseconds-UwyO8pc(int paramInt) {
    return DurationKt.toDuration(paramInt, DurationUnit.MILLISECONDS);
  }
  
  @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.hours"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long hours-UwyO8pc(long paramLong) {
    return DurationKt.toDuration(paramLong, DurationUnit.HOURS);
  }
  
  @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"me.rerere.matrix.thirdparty.kotlin.time.Duration.Companion.days"}))
  @DeprecatedSinceKotlin(warningSince = "1.6")
  @SinceKotlin(version = "1.5")
  @ExperimentalTime
  public final long days-UwyO8pc(double paramDouble) {
    return DurationKt.toDuration(paramDouble, DurationUnit.DAYS);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\Duration$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
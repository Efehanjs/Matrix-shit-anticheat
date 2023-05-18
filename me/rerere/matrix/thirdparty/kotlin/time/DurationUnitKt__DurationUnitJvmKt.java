package me.rerere.matrix.thirdparty.kotlin.time;

import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.NoWhenBranchMatchedException;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class DurationUnitKt__DurationUnitJvmKt {
  private static final long a = o3.a(3834090159187757633L, 5309234201354938612L, null).a(122765146101112L);
  
  @SinceKotlin(version = "1.3")
  public static final double convertDurationUnit(double paramDouble, @NotNull DurationUnit paramDurationUnit1, @NotNull DurationUnit paramDurationUnit2) {
    long l1 = a ^ 0x68CE4D36CC15L;
    Intrinsics.checkNotNullParameter(paramDurationUnit1, "sourceUnit");
    Intrinsics.checkNotNullParameter(paramDurationUnit2, "targetUnit");
    long l2 = paramDurationUnit2.getTimeUnit$kotlin_stdlib().convert(1L, paramDurationUnit1.getTimeUnit$kotlin_stdlib());
    try {
      if (l2 > 0L)
        return paramDouble * l2; 
    } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
      throw a(null);
    } 
    long l3 = paramDurationUnit1.getTimeUnit$kotlin_stdlib().convert(1L, paramDurationUnit2.getTimeUnit$kotlin_stdlib());
    return paramDouble / l3;
  }
  
  @SinceKotlin(version = "1.5")
  public static final long convertDurationUnitOverflow(long paramLong, @NotNull DurationUnit paramDurationUnit1, @NotNull DurationUnit paramDurationUnit2) {
    long l = a ^ 0x1CC15D4CE0D0L;
    Intrinsics.checkNotNullParameter(paramDurationUnit1, "sourceUnit");
    Intrinsics.checkNotNullParameter(paramDurationUnit2, "targetUnit");
    return paramDurationUnit2.getTimeUnit$kotlin_stdlib().convert(paramLong, paramDurationUnit1.getTimeUnit$kotlin_stdlib());
  }
  
  @SinceKotlin(version = "1.6")
  @ExperimentalTime
  @NotNull
  public static final TimeUnit toTimeUnit(@NotNull DurationUnit paramDurationUnit) {
    long l = a ^ 0x6F08877A2C16L;
    Intrinsics.checkNotNullParameter(paramDurationUnit, "<this>");
    return paramDurationUnit.getTimeUnit$kotlin_stdlib();
  }
  
  @SinceKotlin(version = "1.5")
  public static final long convertDurationUnit(long paramLong, @NotNull DurationUnit paramDurationUnit1, @NotNull DurationUnit paramDurationUnit2) {
    long l = a ^ 0x2C0BB5DE12F0L;
    Intrinsics.checkNotNullParameter(paramDurationUnit1, "sourceUnit");
    Intrinsics.checkNotNullParameter(paramDurationUnit2, "targetUnit");
    return paramDurationUnit2.getTimeUnit$kotlin_stdlib().convert(paramLong, paramDurationUnit1.getTimeUnit$kotlin_stdlib());
  }
  
  @SinceKotlin(version = "1.6")
  @ExperimentalTime
  @NotNull
  public static final DurationUnit toDurationUnit(@NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x59B17FC64DB5L;
    try {
      Intrinsics.checkNotNullParameter(paramTimeUnit, "<this>");
      switch (DurationUnitKt__DurationUnitJvmKt$WhenMappings.$EnumSwitchMapping$0[paramTimeUnit.ordinal()]) {
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
      } 
    } catch (NoWhenBranchMatchedException noWhenBranchMatchedException) {
      throw a(null);
    } 
    throw new NoWhenBranchMatchedException();
  }
  
  private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException paramNoWhenBranchMatchedException) {
    return paramNoWhenBranchMatchedException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\DurationUnitKt__DurationUnitJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
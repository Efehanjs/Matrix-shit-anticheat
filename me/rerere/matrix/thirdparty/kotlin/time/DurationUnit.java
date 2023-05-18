package me.rerere.matrix.thirdparty.kotlin.time;

import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = {ExperimentalTime.class})
public enum DurationUnit {
  MILLISECONDS,
  HOURS,
  MINUTES,
  MICROSECONDS,
  SECONDS,
  DAYS,
  NANOSECONDS(TimeUnit.NANOSECONDS);
  
  @NotNull
  private final TimeUnit timeUnit;
  
  static {
    MICROSECONDS = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    MILLISECONDS = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    SECONDS = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
    MINUTES = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
    HOURS = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
    DAYS = new DurationUnit("DAYS", 6, TimeUnit.DAYS);
    $VALUES = $values();
  }
  
  @NotNull
  public final TimeUnit getTimeUnit$kotlin_stdlib() {
    return this.timeUnit;
  }
  
  DurationUnit(TimeUnit paramTimeUnit) {
    this.timeUnit = paramTimeUnit;
  }
  
  static {
    long l = o3.a(-4780024620561402546L, -5712451104559984302L, null).a(244922242646019L) ^ 0x258B2CC6CB8BL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\DurationUnit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
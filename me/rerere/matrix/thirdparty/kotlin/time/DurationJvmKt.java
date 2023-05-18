package me.rerere.matrix.thirdparty.kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DurationJvmKt {
  @NotNull
  private static final ThreadLocal[] precisionFormats;
  
  private static final boolean durationAssertionsEnabled;
  
  private static final long a = o3.a(-5040371047007701295L, 4508993177744971531L, null).a(55892124298708L);
  
  public static final boolean getDurationAssertionsEnabled() {
    return durationAssertionsEnabled;
  }
  
  @NotNull
  public static final String formatUpToDecimals(double paramDouble, int paramInt) {
    long l = a ^ 0x6F7F7F4733BEL;
    DecimalFormat decimalFormat1 = createFormatForDecimals(0);
    DecimalFormat decimalFormat2 = decimalFormat1;
    boolean bool = false;
    decimalFormat2.setMaximumFractionDigits(paramInt);
    Intrinsics.checkNotNullExpressionValue(decimalFormat1.format(paramDouble), "createFormatForDecimals(… }\n        .format(value)");
    return decimalFormat1.format(paramDouble);
  }
  
  @NotNull
  public static final String formatToExactDecimals(double paramDouble, int paramInt) {
    long l = a ^ 0x4BCA4D50D3D7L;
    ThreadLocal<Object> threadLocal = precisionFormats[paramInt];
    DecimalFormat decimalFormat2 = (DecimalFormat)threadLocal.get();
    boolean bool = false;
    DecimalFormat decimalFormat3 = createFormatForDecimals(paramInt);
    DecimalFormat decimalFormat4 = decimalFormat3;
    threadLocal.set(decimalFormat4);
    Intrinsics.checkNotNullExpressionValue(decimalFormat2, "get() ?: default().also(this::set)");
    DecimalFormat decimalFormat1 = (paramInt < precisionFormats.length) ? ((decimalFormat2 == null) ? decimalFormat3 : decimalFormat2) : createFormatForDecimals(paramInt);
    Intrinsics.checkNotNullExpressionValue(decimalFormat1.format(paramDouble), "format.format(value)");
    return decimalFormat1.format(paramDouble);
  }
  
  static {
    durationAssertionsEnabled = Duration.class.desiredAssertionStatus();
    byte b = 0;
    ThreadLocal[] arrayOfThreadLocal = new ThreadLocal[4];
    while (b < 4) {
      byte b1 = b;
      arrayOfThreadLocal[b1] = new ThreadLocal();
      b++;
    } 
    precisionFormats = arrayOfThreadLocal;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\DurationJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
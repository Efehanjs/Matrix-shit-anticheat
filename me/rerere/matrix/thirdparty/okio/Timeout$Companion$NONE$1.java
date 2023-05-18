package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Timeout$Companion$NONE$1 extends Timeout {
  private static final long a = o3.a(-7049405719582829946L, -4495114166454175479L, MethodHandles.lookup().lookupClass()).a(12473530667091L);
  
  public void throwIfReached() {}
  
  @NotNull
  public Timeout deadlineNanoTime(long paramLong) {
    return this;
  }
  
  @NotNull
  public Timeout timeout(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x4E99E7BCFB5AL;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    return this;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Timeout$Companion$NONE$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
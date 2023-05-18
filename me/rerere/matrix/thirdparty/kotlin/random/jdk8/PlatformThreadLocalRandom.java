package me.rerere.matrix.thirdparty.kotlin.random.jdk8;

import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.random.AbstractPlatformRandom;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
  private static final long b = o3.a(-3912092309784290858L, -4029788336551771789L, MethodHandles.lookup().lookupClass()).a(123065188813392L);
  
  public double nextDouble(double paramDouble) {
    return ThreadLocalRandom.current().nextDouble(paramDouble);
  }
  
  @NotNull
  public Random getImpl() {
    long l = b ^ 0x4871E391F76L;
    Intrinsics.checkNotNullExpressionValue(ThreadLocalRandom.current(), "current()");
    return ThreadLocalRandom.current();
  }
  
  public int nextInt(int paramInt1, int paramInt2) {
    return ThreadLocalRandom.current().nextInt(paramInt1, paramInt2);
  }
  
  public long nextLong(long paramLong) {
    return ThreadLocalRandom.current().nextLong(paramLong);
  }
  
  public long nextLong(long paramLong1, long paramLong2) {
    return ThreadLocalRandom.current().nextLong(paramLong1, paramLong2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\jdk8\PlatformThreadLocalRandom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
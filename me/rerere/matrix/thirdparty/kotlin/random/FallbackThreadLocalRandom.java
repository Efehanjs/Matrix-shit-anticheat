package me.rerere.matrix.thirdparty.kotlin.random;

import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {
  @NotNull
  private final FallbackThreadLocalRandom$implStorage$1 implStorage = new FallbackThreadLocalRandom$implStorage$1();
  
  private static final long b = o3.a(4550579748007532976L, -1829859706556051864L, null).a(204097088813410L);
  
  @NotNull
  public Random getImpl() {
    long l = b ^ 0x71FC25E00D1AL;
    Intrinsics.checkNotNullExpressionValue(this.implStorage.get(), "implStorage.get()");
    return (Random)this.implStorage.get();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\random\FallbackThreadLocalRandom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
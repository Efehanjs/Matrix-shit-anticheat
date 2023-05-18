package me.rerere.matrix.thirdparty.kotlin.reflect;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class KTypeProjection$Companion {
  private static final long a = o3.a(-7601486017975999094L, 8986985958186721117L, null).a(156592782318374L);
  
  @NotNull
  public final KTypeProjection getSTAR() {
    return KTypeProjection.star;
  }
  
  @NotNull
  public final KTypeProjection invariant(@NotNull KType paramKType) {
    long l = a ^ 0x71EFC36A36A4L;
    Intrinsics.checkNotNullParameter(paramKType, "type");
    return new KTypeProjection(KVariance.INVARIANT, paramKType);
  }
  
  @NotNull
  public final KTypeProjection contravariant(@NotNull KType paramKType) {
    long l = a ^ 0x4AB1E8FDD151L;
    Intrinsics.checkNotNullParameter(paramKType, "type");
    return new KTypeProjection(KVariance.IN, paramKType);
  }
  
  @NotNull
  public final KTypeProjection covariant(@NotNull KType paramKType) {
    long l = a ^ 0x7262F8ACF4E2L;
    Intrinsics.checkNotNullParameter(paramKType, "type");
    return new KTypeProjection(KVariance.OUT, paramKType);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\reflect\KTypeProjection$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class LazyKt__LazyKt extends LazyKt__LazyJVMKt {
  private static final long b = o3.a(-5675507245421991835L, 2856320814615780604L, null).a(22398309550624L);
  
  @NotNull
  public static final Lazy lazyOf(Object paramObject) {
    return new InitializedLazyImpl(paramObject);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\LazyKt__LazyKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
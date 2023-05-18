package me.rerere.matrix.thirdparty.kotlin;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ResultKt {
  private static final long a = o3.a(2778396943855682793L, -3191059020033788435L, null).a(174941482037555L);
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Object createFailure(@NotNull Throwable paramThrowable) {
    long l = a ^ 0x6D57684372D8L;
    Intrinsics.checkNotNullParameter(paramThrowable, "exception");
    return new Result$Failure(paramThrowable);
  }
  
  @PublishedApi
  @SinceKotlin(version = "1.3")
  public static final void throwOnFailure(@NotNull Object paramObject) {
    try {
      if (paramObject instanceof Result$Failure)
        throw ((Result$Failure)paramObject).exception; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\ResultKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
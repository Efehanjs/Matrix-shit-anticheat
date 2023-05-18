package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CoroutineContext$DefaultImpls {
  private static final long a = o3.a(-2000291627778480510L, -6477369124262623153L, null).a(141070905094312L);
  
  @NotNull
  public static CoroutineContext plus(@NotNull CoroutineContext paramCoroutineContext1, @NotNull CoroutineContext paramCoroutineContext2) {
    long l = a ^ 0xED7D391E9FFL;
    try {
      Intrinsics.checkNotNullParameter(paramCoroutineContext2, "context");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramCoroutineContext2 == EmptyCoroutineContext.INSTANCE) ? paramCoroutineContext1 : (CoroutineContext)paramCoroutineContext2.fold(paramCoroutineContext1, CoroutineContext$plus$1.INSTANCE);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\CoroutineContext$DefaultImpls.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
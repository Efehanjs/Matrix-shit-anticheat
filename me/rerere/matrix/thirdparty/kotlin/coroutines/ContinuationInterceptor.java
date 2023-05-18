package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public interface ContinuationInterceptor extends CoroutineContext$Element {
  @NotNull
  public static final ContinuationInterceptor$Key Key = ContinuationInterceptor$Key.$$INSTANCE;
  
  @NotNull
  CoroutineContext minusKey(@NotNull CoroutineContext$Key paramCoroutineContext$Key);
  
  @NotNull
  Continuation interceptContinuation(@NotNull Continuation paramContinuation);
  
  void releaseInterceptedContinuation(@NotNull Continuation paramContinuation);
  
  @Nullable
  CoroutineContext$Element get(@NotNull CoroutineContext$Key paramCoroutineContext$Key);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\ContinuationInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
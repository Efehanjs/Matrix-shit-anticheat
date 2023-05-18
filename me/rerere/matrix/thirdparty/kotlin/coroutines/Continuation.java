package me.rerere.matrix.thirdparty.kotlin.coroutines;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
public interface Continuation {
  void resumeWith(@NotNull Object paramObject);
  
  @NotNull
  CoroutineContext getContext();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\Continuation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
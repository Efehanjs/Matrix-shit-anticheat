package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.CoroutineContext;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CompletedContinuation implements Continuation {
  @NotNull
  public static final CompletedContinuation INSTANCE;
  
  private static final long a = o3.a(5636671505571357549L, -1354505053086398081L, null).a(132452477230368L);
  
  @NotNull
  public CoroutineContext getContext() {
    long l = a ^ 0x36CB82922BCAL;
    throw new IllegalStateException("This continuation is already complete".toString());
  }
  
  static {
    INSTANCE = new CompletedContinuation();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x544BE44054AL;
    return "This continuation is already complete";
  }
  
  public void resumeWith(@NotNull Object paramObject) {
    long l = a ^ 0x52148E052069L;
    throw new IllegalStateException("This continuation is already complete".toString());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\CompletedContinuation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
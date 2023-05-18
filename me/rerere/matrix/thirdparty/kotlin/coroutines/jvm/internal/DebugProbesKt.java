package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class DebugProbesKt {
  private static final long a = o3.a(689893806622027249L, -4882034005459098421L, null).a(60642806327764L);
  
  @SinceKotlin(version = "1.3")
  public static final void probeCoroutineSuspended(@NotNull Continuation paramContinuation) {
    long l = a ^ 0xC0608DCE8AL;
    Intrinsics.checkNotNullParameter(paramContinuation, "frame");
  }
  
  @SinceKotlin(version = "1.3")
  public static final void probeCoroutineResumed(@NotNull Continuation paramContinuation) {
    long l = a ^ 0x5A00522ECB82L;
    Intrinsics.checkNotNullParameter(paramContinuation, "frame");
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Continuation probeCoroutineCreated(@NotNull Continuation paramContinuation) {
    long l = a ^ 0x46277FC5D735L;
    Intrinsics.checkNotNullParameter(paramContinuation, "completion");
    return paramContinuation;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\DebugProbesKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
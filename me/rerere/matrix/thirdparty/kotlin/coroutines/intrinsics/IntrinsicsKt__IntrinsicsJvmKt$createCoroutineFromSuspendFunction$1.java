package me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 extends RestrictedContinuationImpl {
  private int label;
  
  private static final long a = o3.a(801337018461087666L, -5175310392029916915L, null).a(3800827181305L);
  
  @Nullable
  public Object invokeSuspend(@NotNull Object paramObject) {
    Object object;
    long l = a ^ 0x21C4BFBFEF1DL;
    switch (this.label) {
      case 0:
        this.label = 1;
        object = paramObject;
        ResultKt.throwOnFailure(object);
      case 1:
        this.label = 2;
        object = paramObject;
        ResultKt.throwOnFailure(object);
    } 
    throw new IllegalStateException("This coroutine had already completed".toString());
  }
  
  public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1(Continuation paramContinuation, Function1 paramFunction1) {
    super(paramContinuation);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\intrinsics\IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
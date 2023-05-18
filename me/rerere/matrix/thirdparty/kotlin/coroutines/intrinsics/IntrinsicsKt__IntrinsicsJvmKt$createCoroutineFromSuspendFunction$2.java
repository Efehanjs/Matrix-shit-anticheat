package me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.CoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 extends ContinuationImpl {
  private int label;
  
  private static final long a = o3.a(7364356278686019546L, -7996053844374647741L, null).a(6415806910592L);
  
  public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2(Continuation paramContinuation, CoroutineContext paramCoroutineContext, Function1 paramFunction1) {
    super(paramContinuation, paramCoroutineContext);
  }
  
  @Nullable
  public Object invokeSuspend(@NotNull Object paramObject) {
    Object object;
    long l = a ^ 0x7014471B1B6EL;
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\intrinsics\IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
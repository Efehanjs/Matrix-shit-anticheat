package me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1 extends RestrictedContinuationImpl {
  private int label;
  
  private static final long a = o3.a(7519033761942997495L, -7452493686985815133L, null).a(64211318663396L);
  
  @Nullable
  public Object invokeSuspend(@NotNull Object paramObject) {
    Continuation continuation;
    Object object;
    boolean bool;
    long l = a ^ 0x2FC4E691A5E9L;
    switch (this.label) {
      case 0:
        this.label = 1;
        ResultKt.throwOnFailure(paramObject);
        continuation = (Continuation)this;
        bool = false;
        Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
      case 1:
        this.label = 2;
        object = paramObject;
        ResultKt.throwOnFailure(object);
    } 
    throw new IllegalStateException("This coroutine had already completed".toString());
  }
  
  public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(Continuation paramContinuation, Function1 paramFunction1) {
    super(paramContinuation);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\intrinsics\IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
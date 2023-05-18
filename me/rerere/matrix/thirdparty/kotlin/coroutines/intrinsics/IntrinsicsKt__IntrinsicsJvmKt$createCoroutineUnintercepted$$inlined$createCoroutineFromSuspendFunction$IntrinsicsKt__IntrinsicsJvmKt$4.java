package me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.CoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 extends ContinuationImpl {
  private int label;
  
  private static final long a = o3.a(871763367314575184L, -3164378202866868521L, null).a(36374911403073L);
  
  public IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(Continuation paramContinuation, CoroutineContext paramCoroutineContext, Function2 paramFunction2, Object paramObject) {
    super(paramContinuation, paramCoroutineContext);
  }
  
  @Nullable
  public Object invokeSuspend(@NotNull Object paramObject) {
    Continuation continuation;
    Object object;
    boolean bool;
    long l = a ^ 0x624C67B69DADL;
    switch (this.label) {
      case 0:
        this.label = 1;
        ResultKt.throwOnFailure(paramObject);
        continuation = (Continuation)this;
        bool = false;
        Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
      case 1:
        this.label = 2;
        object = paramObject;
        ResultKt.throwOnFailure(object);
    } 
    throw new IllegalStateException("This coroutine had already completed".toString());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\intrinsics\IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
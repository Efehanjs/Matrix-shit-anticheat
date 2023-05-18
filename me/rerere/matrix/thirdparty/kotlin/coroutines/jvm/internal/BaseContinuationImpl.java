package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Result;
import me.rerere.matrix.thirdparty.kotlin.ResultKt;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics.IntrinsicsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public abstract class BaseContinuationImpl implements Continuation, CoroutineStackFrame, Serializable {
  @Nullable
  private final Continuation completion;
  
  private static final long b = o3.a(-4931811836172806655L, 5767676899950091456L, null).a(57109812353073L);
  
  public void releaseIntercepted() {}
  
  @Nullable
  public abstract Object invokeSuspend(@NotNull Object paramObject);
  
  @NotNull
  public Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    long l = b ^ 0x380858D0075L;
    Intrinsics.checkNotNullParameter(paramContinuation, "completion");
    throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
  }
  
  public final void resumeWith(@NotNull Object paramObject) {
    Object object2;
    BaseContinuationImpl baseContinuationImpl1 = null;
    baseContinuationImpl1 = this;
    Object object1 = null;
    object1 = paramObject;
    DebugProbesKt.probeCoroutineResumed(baseContinuationImpl1);
    BaseContinuationImpl baseContinuationImpl2 = baseContinuationImpl1;
    BaseContinuationImpl baseContinuationImpl3 = baseContinuationImpl2;
    boolean bool = false;
    Intrinsics.checkNotNull(baseContinuationImpl3.completion);
    Continuation continuation = baseContinuationImpl3.completion;
    try {
      object2 = baseContinuationImpl3.invokeSuspend(object1);
      try {
        if (object2 == IntrinsicsKt.getCOROUTINE_SUSPENDED())
          return; 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      object2 = Result.constructor-impl(object2);
    } catch (Throwable throwable) {
      object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
    } 
    Object object3 = object2;
    baseContinuationImpl3.releaseIntercepted();
    if (continuation instanceof BaseContinuationImpl) {
      Continuation continuation1 = continuation;
      object1 = object3;
    } else {
      continuation.resumeWith(object3);
      return;
    } 
  }
  
  @NotNull
  public Continuation create(@NotNull Continuation paramContinuation) {
    long l = b ^ 0x3E286E599A71L;
    Intrinsics.checkNotNullParameter(paramContinuation, "completion");
    throw new UnsupportedOperationException("create(Continuation) has not been overridden");
  }
  
  @Nullable
  public StackTraceElement getStackTraceElement() {
    return DebugMetadataKt.getStackTraceElement(this);
  }
  
  @Nullable
  public final Continuation getCompletion() {
    return this.completion;
  }
  
  @NotNull
  public String toString() {
    long l = b ^ 0x326033D82224L;
    getStackTraceElement();
    return "Continuation at " + ((getStackTraceElement() != null) ? (String)getStackTraceElement() : getClass().getName());
  }
  
  @Nullable
  public CoroutineStackFrame getCallerFrame() {
    Continuation continuation = this.completion;
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (continuation instanceof CoroutineStackFrame) ? (CoroutineStackFrame)continuation : null;
  }
  
  public BaseContinuationImpl(@Nullable Continuation paramContinuation) {
    this.completion = paramContinuation;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\BaseContinuationImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
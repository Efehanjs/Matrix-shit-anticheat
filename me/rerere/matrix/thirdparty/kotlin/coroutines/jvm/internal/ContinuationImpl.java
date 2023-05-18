package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.ContinuationInterceptor;
import me.rerere.matrix.thirdparty.kotlin.coroutines.CoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public abstract class ContinuationImpl extends BaseContinuationImpl {
  @Nullable
  private final CoroutineContext _context;
  
  @Nullable
  private transient Continuation intercepted;
  
  public ContinuationImpl(@Nullable Continuation paramContinuation) {
    this(paramContinuation, (paramContinuation != null) ? paramContinuation.getContext() : null);
  }
  
  public ContinuationImpl(@Nullable Continuation paramContinuation, @Nullable CoroutineContext paramCoroutineContext) {
    super(paramContinuation);
    this._context = paramCoroutineContext;
  }
  
  public void releaseIntercepted() {
    Continuation continuation = this.intercepted;
    try {
      if (continuation != null)
        try {
          if (continuation != this) {
            Intrinsics.checkNotNull(getContext().get((CoroutineContext.Key)ContinuationInterceptor.Key));
            ((ContinuationInterceptor)getContext().get((CoroutineContext.Key)ContinuationInterceptor.Key)).releaseInterceptedContinuation(continuation);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.intercepted = CompletedContinuation.INSTANCE;
  }
  
  @NotNull
  public CoroutineContext getContext() {
    Intrinsics.checkNotNull(this._context);
    return this._context;
  }
  
  @NotNull
  public final Continuation intercepted() {
    // Byte code:
    //   0: aload_0
    //   1: getfield intercepted : Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;
    //   4: dup
    //   5: ifnonnull -> 81
    //   8: pop
    //   9: aload_0
    //   10: invokevirtual getContext : ()Lme/rerere/matrix/thirdparty/kotlin/coroutines/CoroutineContext;
    //   13: getstatic me/rerere/matrix/thirdparty/kotlin/coroutines/ContinuationInterceptor.Key : Lme/rerere/matrix/thirdparty/kotlin/coroutines/ContinuationInterceptor$Key;
    //   16: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/CoroutineContext$Key
    //   19: invokeinterface get : (Lme/rerere/matrix/thirdparty/kotlin/coroutines/CoroutineContext$Key;)Lme/rerere/matrix/thirdparty/kotlin/coroutines/CoroutineContext$Element;
    //   24: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/ContinuationInterceptor
    //   27: dup
    //   28: ifnull -> 58
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   37: athrow
    //   38: aload_0
    //   39: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   42: invokeinterface interceptContinuation : (Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;
    //   47: dup
    //   48: ifnonnull -> 70
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   57: athrow
    //   58: pop
    //   59: aload_0
    //   60: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   69: athrow
    //   70: astore_1
    //   71: aload_1
    //   72: astore_2
    //   73: iconst_0
    //   74: istore_3
    //   75: aload_0
    //   76: aload_2
    //   77: putfield intercepted : Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;
    //   80: aload_1
    //   81: areturn
    // Exception table:
    //   from	to	target	type
    //   0	31	34	java/lang/RuntimeException
    //   8	51	54	java/lang/RuntimeException
    //   38	63	66	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\ContinuationImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
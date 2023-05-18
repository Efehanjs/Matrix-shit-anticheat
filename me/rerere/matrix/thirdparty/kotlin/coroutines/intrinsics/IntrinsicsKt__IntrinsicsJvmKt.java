package me.rerere.matrix.thirdparty.kotlin.coroutines.intrinsics;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.CoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.coroutines.EmptyCoroutineContext;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.DebugProbesKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.TypeIntrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class IntrinsicsKt__IntrinsicsJvmKt {
  private static final long a = o3.a(-5972007921229736602L, 8696508782510003982L, null).a(234954135822072L);
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Continuation intercepted(@NotNull Continuation paramContinuation) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt.a : J
    //   3: ldc2_w 37912453623354
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: instanceof me/rerere/matrix/thirdparty/kotlin/coroutines/jvm/internal/ContinuationImpl
    //   18: ifeq -> 32
    //   21: aload_0
    //   22: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/jvm/internal/ContinuationImpl
    //   25: goto -> 33
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: aconst_null
    //   33: dup
    //   34: ifnull -> 51
    //   37: invokevirtual intercepted : ()Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;
    //   40: dup
    //   41: ifnonnull -> 60
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: pop
    //   52: aload_0
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   59: athrow
    //   60: areturn
    // Exception table:
    //   from	to	target	type
    //   8	28	28	java/lang/RuntimeException
    //   33	44	47	java/lang/RuntimeException
    //   37	53	56	java/lang/RuntimeException
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Continuation createCoroutineUnintercepted(@NotNull Function1 paramFunction1, @NotNull Continuation paramContinuation) {
    long l = a ^ 0x27C0F72C98E6L;
    Intrinsics.checkNotNullParameter(paramFunction1, "<this>");
    Intrinsics.checkNotNullParameter(paramContinuation, "completion");
    Continuation continuation = DebugProbesKt.probeCoroutineCreated(paramContinuation);
    try {
      boolean bool = false;
      CoroutineContext coroutineContext = continuation.getContext();
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramFunction1 instanceof BaseContinuationImpl) ? ((BaseContinuationImpl)paramFunction1).create(continuation) : ((coroutineContext == EmptyCoroutineContext.INSTANCE) ? (Continuation)new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1(continuation, paramFunction1) : (Continuation)new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2(continuation, coroutineContext, paramFunction1));
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final Continuation createCoroutineUnintercepted(@NotNull Function2 paramFunction2, Object paramObject, @NotNull Continuation paramContinuation) {
    long l = a ^ 0x164FFEA80329L;
    Intrinsics.checkNotNullParameter(paramFunction2, "<this>");
    Intrinsics.checkNotNullParameter(paramContinuation, "completion");
    Continuation continuation = DebugProbesKt.probeCoroutineCreated(paramContinuation);
    try {
      boolean bool = false;
      CoroutineContext coroutineContext = continuation.getContext();
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramFunction2 instanceof BaseContinuationImpl) ? ((BaseContinuationImpl)paramFunction2).create(paramObject, continuation) : ((coroutineContext == EmptyCoroutineContext.INSTANCE) ? (Continuation)new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3(continuation, paramFunction2, paramObject) : (Continuation)new IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4(continuation, coroutineContext, paramFunction2, paramObject));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\intrinsics\IntrinsicsKt__IntrinsicsJvmKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
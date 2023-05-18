package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesKt$runningFold$1 extends RestrictedSuspendLambda implements Function2 {
  public int label;
  
  public Object L$2;
  
  public Object L$1;
  
  private static final long a = o3.a(3826009881242931522L, -4575368946176580236L, null).a(143262840274209L);
  
  public SequencesKt___SequencesKt$runningFold$1(Object paramObject, Sequence paramSequence, Function2 paramFunction2, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt$runningFold$1.a : J
    //   3: ldc2_w 26323897468520
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #8
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 244, 0 -> 44, 1 -> 94, 2 -> 207
    //   44: aload_1
    //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   48: aload_0
    //   49: getfield L$0 : Ljava/lang/Object;
    //   52: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   55: astore #4
    //   57: aload #4
    //   59: aload_0
    //   60: getfield $initial : Ljava/lang/Object;
    //   63: aload_0
    //   64: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   67: aload_0
    //   68: aload #4
    //   70: putfield L$0 : Ljava/lang/Object;
    //   73: aload_0
    //   74: iconst_1
    //   75: putfield label : I
    //   78: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   81: dup
    //   82: aload #8
    //   84: if_acmpne -> 108
    //   87: aload #8
    //   89: areturn
    //   90: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   93: athrow
    //   94: aload_0
    //   95: getfield L$0 : Ljava/lang/Object;
    //   98: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   101: astore #4
    //   103: aload_1
    //   104: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   107: aload_1
    //   108: pop
    //   109: aload_0
    //   110: getfield $initial : Ljava/lang/Object;
    //   113: astore #5
    //   115: aload_0
    //   116: getfield $this_runningFold : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   119: invokeinterface iterator : ()Ljava/util/Iterator;
    //   124: astore #6
    //   126: aload #6
    //   128: invokeinterface hasNext : ()Z
    //   133: ifeq -> 240
    //   136: aload #6
    //   138: invokeinterface next : ()Ljava/lang/Object;
    //   143: astore #7
    //   145: aload_0
    //   146: getfield $operation : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;
    //   149: aload #5
    //   151: aload #7
    //   153: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   158: astore #5
    //   160: aload #4
    //   162: aload #5
    //   164: aload_0
    //   165: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   168: aload_0
    //   169: aload #4
    //   171: putfield L$0 : Ljava/lang/Object;
    //   174: aload_0
    //   175: aload #5
    //   177: putfield L$1 : Ljava/lang/Object;
    //   180: aload_0
    //   181: aload #6
    //   183: putfield L$2 : Ljava/lang/Object;
    //   186: aload_0
    //   187: iconst_2
    //   188: putfield label : I
    //   191: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   194: dup
    //   195: aload #8
    //   197: if_acmpne -> 236
    //   200: aload #8
    //   202: areturn
    //   203: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   206: athrow
    //   207: aload_0
    //   208: getfield L$2 : Ljava/lang/Object;
    //   211: checkcast java/util/Iterator
    //   214: astore #6
    //   216: aload_0
    //   217: getfield L$1 : Ljava/lang/Object;
    //   220: astore #5
    //   222: aload_0
    //   223: getfield L$0 : Ljava/lang/Object;
    //   226: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   229: astore #4
    //   231: aload_1
    //   232: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   235: aload_1
    //   236: pop
    //   237: goto -> 126
    //   240: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   243: areturn
    //   244: new java/lang/IllegalStateException
    //   247: dup
    //   248: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   250: invokespecial <init> : (Ljava/lang/String;)V
    //   253: athrow
    // Exception table:
    //   from	to	target	type
    //   57	90	90	java/lang/IllegalStateException
    //   160	203	203	java/lang/IllegalStateException
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt___SequencesKt$runningFold$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, paramContinuation);
    sequencesKt___SequencesKt$runningFold$1.L$0 = paramObject;
    return (Continuation)sequencesKt___SequencesKt$runningFold$1;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$runningFold$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
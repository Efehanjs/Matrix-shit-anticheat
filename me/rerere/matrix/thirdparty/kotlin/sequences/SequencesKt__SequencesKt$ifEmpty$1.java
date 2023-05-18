package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements Function2 {
  public int label;
  
  private static final long a = o3.a(-4272479882357675654L, 4399456682248534147L, null).a(165787320230130L);
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1.a : J
    //   3: ldc2_w 94335343289655
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #6
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 172, 0 -> 44, 1 -> 114, 2 -> 162
    //   44: aload_1
    //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   48: aload_0
    //   49: getfield L$0 : Ljava/lang/Object;
    //   52: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   55: astore #4
    //   57: aload_0
    //   58: getfield $this_ifEmpty : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   61: invokeinterface iterator : ()Ljava/util/Iterator;
    //   66: astore #5
    //   68: aload #5
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 123
    //   78: aload #4
    //   80: aload #5
    //   82: aload_0
    //   83: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   86: aload_0
    //   87: iconst_1
    //   88: putfield label : I
    //   91: invokevirtual yieldAll : (Ljava/util/Iterator;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   94: dup
    //   95: aload #6
    //   97: if_acmpne -> 119
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   106: athrow
    //   107: aload #6
    //   109: areturn
    //   110: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   113: athrow
    //   114: aload_1
    //   115: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   118: aload_1
    //   119: pop
    //   120: goto -> 168
    //   123: aload #4
    //   125: aload_0
    //   126: getfield $defaultValue : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function0;
    //   129: invokeinterface invoke : ()Ljava/lang/Object;
    //   134: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/Sequence
    //   137: aload_0
    //   138: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   141: aload_0
    //   142: iconst_2
    //   143: putfield label : I
    //   146: invokevirtual yieldAll : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   149: dup
    //   150: aload #6
    //   152: if_acmpne -> 167
    //   155: aload #6
    //   157: areturn
    //   158: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   161: athrow
    //   162: aload_1
    //   163: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   166: aload_1
    //   167: pop
    //   168: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   171: areturn
    //   172: new java/lang/IllegalStateException
    //   175: dup
    //   176: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   178: invokespecial <init> : (Ljava/lang/String;)V
    //   181: athrow
    // Exception table:
    //   from	to	target	type
    //   68	100	103	java/lang/IllegalStateException
    //   78	110	110	java/lang/IllegalStateException
    //   123	158	158	java/lang/IllegalStateException
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt__SequencesKt$ifEmpty$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, paramContinuation);
    sequencesKt__SequencesKt$ifEmpty$1.L$0 = paramObject;
    return (Continuation)sequencesKt__SequencesKt$ifEmpty$1;
  }
  
  public SequencesKt__SequencesKt$ifEmpty$1(Sequence paramSequence, Function0 paramFunction0, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt__SequencesKt$ifEmpty$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
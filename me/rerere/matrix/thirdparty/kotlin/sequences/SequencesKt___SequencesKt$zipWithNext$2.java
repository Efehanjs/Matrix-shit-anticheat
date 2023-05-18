package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements Function2 {
  public Object L$2;
  
  public int label;
  
  public Object L$1;
  
  private static final long a = o3.a(7414554311526289659L, 52990463886067415L, null).a(162470624582950L);
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, paramContinuation);
    sequencesKt___SequencesKt$zipWithNext$2.L$0 = paramObject;
    return (Continuation)sequencesKt___SequencesKt$zipWithNext$2;
  }
  
  public SequencesKt___SequencesKt$zipWithNext$2(Sequence paramSequence, Function2 paramFunction2, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt$zipWithNext$2.a : J
    //   3: ldc2_w 1425005766315
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #8
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 209, 0 -> 40, 1 -> 168
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield L$0 : Ljava/lang/Object;
    //   48: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   51: astore #4
    //   53: aload_0
    //   54: getfield $this_zipWithNext : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   57: invokeinterface iterator : ()Ljava/util/Iterator;
    //   62: astore #5
    //   64: aload #5
    //   66: invokeinterface hasNext : ()Z
    //   71: ifne -> 82
    //   74: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   77: areturn
    //   78: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   81: athrow
    //   82: aload #5
    //   84: invokeinterface next : ()Ljava/lang/Object;
    //   89: astore #6
    //   91: aload #5
    //   93: invokeinterface hasNext : ()Z
    //   98: ifeq -> 205
    //   101: aload #5
    //   103: invokeinterface next : ()Ljava/lang/Object;
    //   108: astore #7
    //   110: aload #4
    //   112: aload_0
    //   113: getfield $transform : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;
    //   116: aload #6
    //   118: aload #7
    //   120: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   125: aload_0
    //   126: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   129: aload_0
    //   130: aload #4
    //   132: putfield L$0 : Ljava/lang/Object;
    //   135: aload_0
    //   136: aload #5
    //   138: putfield L$1 : Ljava/lang/Object;
    //   141: aload_0
    //   142: aload #7
    //   144: putfield L$2 : Ljava/lang/Object;
    //   147: aload_0
    //   148: iconst_1
    //   149: putfield label : I
    //   152: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   155: dup
    //   156: aload #8
    //   158: if_acmpne -> 197
    //   161: aload #8
    //   163: areturn
    //   164: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   167: athrow
    //   168: aload_0
    //   169: getfield L$2 : Ljava/lang/Object;
    //   172: astore #7
    //   174: aload_0
    //   175: getfield L$1 : Ljava/lang/Object;
    //   178: checkcast java/util/Iterator
    //   181: astore #5
    //   183: aload_0
    //   184: getfield L$0 : Ljava/lang/Object;
    //   187: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   190: astore #4
    //   192: aload_1
    //   193: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   196: aload_1
    //   197: pop
    //   198: aload #7
    //   200: astore #6
    //   202: goto -> 91
    //   205: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   208: areturn
    //   209: new java/lang/IllegalStateException
    //   212: dup
    //   213: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   215: invokespecial <init> : (Ljava/lang/String;)V
    //   218: athrow
    // Exception table:
    //   from	to	target	type
    //   64	78	78	java/lang/IllegalStateException
    //   110	164	164	java/lang/IllegalStateException
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt___SequencesKt$zipWithNext$2)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$zipWithNext$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.random.Random;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt__SequencesKt$shuffled$1 extends RestrictedSuspendLambda implements Function2 {
  public Object L$1;
  
  public int label;
  
  private static final long a = o3.a(-5799280589172256484L, 5693654031496868543L, null).a(18505828750327L);
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt__SequencesKt$shuffled$1.a : J
    //   3: ldc2_w 87335075139602
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #9
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 216, 0 -> 40, 1 -> 185
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield L$0 : Ljava/lang/Object;
    //   48: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   51: astore #4
    //   53: aload_0
    //   54: getfield $this_shuffled : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   57: invokestatic toMutableList : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;)Ljava/util/List;
    //   60: astore #5
    //   62: aload #5
    //   64: checkcast java/util/Collection
    //   67: invokeinterface isEmpty : ()Z
    //   72: ifne -> 83
    //   75: iconst_1
    //   76: goto -> 84
    //   79: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   82: athrow
    //   83: iconst_0
    //   84: ifeq -> 212
    //   87: aload_0
    //   88: getfield $random : Lme/rerere/matrix/thirdparty/kotlin/random/Random;
    //   91: aload #5
    //   93: invokeinterface size : ()I
    //   98: invokevirtual nextInt : (I)I
    //   101: istore #6
    //   103: aload #5
    //   105: invokestatic removeLast : (Ljava/util/List;)Ljava/lang/Object;
    //   108: astore #7
    //   110: iload #6
    //   112: aload #5
    //   114: invokeinterface size : ()I
    //   119: if_icmpge -> 140
    //   122: aload #5
    //   124: iload #6
    //   126: aload #7
    //   128: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   133: goto -> 142
    //   136: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   139: athrow
    //   140: aload #7
    //   142: astore #8
    //   144: aload #4
    //   146: aload #8
    //   148: aload_0
    //   149: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   152: aload_0
    //   153: aload #4
    //   155: putfield L$0 : Ljava/lang/Object;
    //   158: aload_0
    //   159: aload #5
    //   161: putfield L$1 : Ljava/lang/Object;
    //   164: aload_0
    //   165: iconst_1
    //   166: putfield label : I
    //   169: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   172: dup
    //   173: aload #9
    //   175: if_acmpne -> 208
    //   178: aload #9
    //   180: areturn
    //   181: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   184: athrow
    //   185: aload_0
    //   186: getfield L$1 : Ljava/lang/Object;
    //   189: checkcast java/util/List
    //   192: astore #5
    //   194: aload_0
    //   195: getfield L$0 : Ljava/lang/Object;
    //   198: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   201: astore #4
    //   203: aload_1
    //   204: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   207: aload_1
    //   208: pop
    //   209: goto -> 62
    //   212: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   215: areturn
    //   216: new java/lang/IllegalStateException
    //   219: dup
    //   220: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   222: invokespecial <init> : (Ljava/lang/String;)V
    //   225: athrow
    // Exception table:
    //   from	to	target	type
    //   62	79	79	java/lang/IllegalStateException
    //   110	136	136	java/lang/IllegalStateException
    //   144	181	181	java/lang/IllegalStateException
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt__SequencesKt$shuffled$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt__SequencesKt$shuffled$1 sequencesKt__SequencesKt$shuffled$1 = new SequencesKt__SequencesKt$shuffled$1(this.$this_shuffled, this.$random, paramContinuation);
    sequencesKt__SequencesKt$shuffled$1.L$0 = paramObject;
    return (Continuation)sequencesKt__SequencesKt$shuffled$1;
  }
  
  public SequencesKt__SequencesKt$shuffled$1(Sequence paramSequence, Random paramRandom, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt__SequencesKt$shuffled$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
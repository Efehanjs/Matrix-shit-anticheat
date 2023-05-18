package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt__SequencesKt$flatMapIndexed$1 extends RestrictedSuspendLambda implements Function2 {
  public int label;
  
  public Object L$1;
  
  public int I$0;
  
  private static final long a = o3.a(-5497596251882167390L, -7097563189863305284L, null).a(264993429144061L);
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt__SequencesKt$flatMapIndexed$1.a : J
    //   3: ldc2_w 49443834807754
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #10
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 222, 0 -> 40, 1 -> 185
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield L$0 : Ljava/lang/Object;
    //   48: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   51: astore #4
    //   53: iconst_0
    //   54: istore #5
    //   56: aload_0
    //   57: getfield $source : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   60: invokeinterface iterator : ()Ljava/util/Iterator;
    //   65: astore #6
    //   67: aload #6
    //   69: invokeinterface hasNext : ()Z
    //   74: ifeq -> 218
    //   77: aload #6
    //   79: invokeinterface next : ()Ljava/lang/Object;
    //   84: astore #7
    //   86: aload_0
    //   87: getfield $transform : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;
    //   90: iload #5
    //   92: iinc #5, 1
    //   95: istore #9
    //   97: iload #9
    //   99: ifge -> 112
    //   102: invokestatic throwIndexOverflow : ()V
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   111: athrow
    //   112: iload #9
    //   114: invokestatic boxInt : (I)Ljava/lang/Integer;
    //   117: aload #7
    //   119: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   124: astore #8
    //   126: aload #4
    //   128: aload_0
    //   129: getfield $iterator : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   132: aload #8
    //   134: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   139: checkcast java/util/Iterator
    //   142: aload_0
    //   143: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   146: aload_0
    //   147: aload #4
    //   149: putfield L$0 : Ljava/lang/Object;
    //   152: aload_0
    //   153: aload #6
    //   155: putfield L$1 : Ljava/lang/Object;
    //   158: aload_0
    //   159: iload #5
    //   161: putfield I$0 : I
    //   164: aload_0
    //   165: iconst_1
    //   166: putfield label : I
    //   169: invokevirtual yieldAll : (Ljava/util/Iterator;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   172: dup
    //   173: aload #10
    //   175: if_acmpne -> 214
    //   178: aload #10
    //   180: areturn
    //   181: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   184: athrow
    //   185: aload_0
    //   186: getfield I$0 : I
    //   189: istore #5
    //   191: aload_0
    //   192: getfield L$1 : Ljava/lang/Object;
    //   195: checkcast java/util/Iterator
    //   198: astore #6
    //   200: aload_0
    //   201: getfield L$0 : Ljava/lang/Object;
    //   204: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   207: astore #4
    //   209: aload_1
    //   210: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   213: aload_1
    //   214: pop
    //   215: goto -> 67
    //   218: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   221: areturn
    //   222: new java/lang/IllegalStateException
    //   225: dup
    //   226: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   228: invokespecial <init> : (Ljava/lang/String;)V
    //   231: athrow
    // Exception table:
    //   from	to	target	type
    //   97	105	108	java/lang/IllegalStateException
    //   126	181	181	java/lang/IllegalStateException
  }
  
  public SequencesKt__SequencesKt$flatMapIndexed$1(Sequence paramSequence, Function2 paramFunction2, Function1 paramFunction1, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt__SequencesKt$flatMapIndexed$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt__SequencesKt$flatMapIndexed$1 sequencesKt__SequencesKt$flatMapIndexed$1 = new SequencesKt__SequencesKt$flatMapIndexed$1(this.$source, this.$transform, this.$iterator, paramContinuation);
    sequencesKt__SequencesKt$flatMapIndexed$1.L$0 = paramObject;
    return (Continuation)sequencesKt__SequencesKt$flatMapIndexed$1;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt__SequencesKt$flatMapIndexed$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
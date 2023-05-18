package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesKt$runningReduceIndexed$1 extends RestrictedSuspendLambda implements Function2 {
  public Object L$2;
  
  public int label;
  
  public int I$0;
  
  public Object L$1;
  
  private static final long a = o3.a(8054141433623800070L, 8698015969095593488L, null).a(210309500740530L);
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt___SequencesKt$runningReduceIndexed$1 sequencesKt___SequencesKt$runningReduceIndexed$1 = new SequencesKt___SequencesKt$runningReduceIndexed$1(this.$this_runningReduceIndexed, this.$operation, paramContinuation);
    sequencesKt___SequencesKt$runningReduceIndexed$1.L$0 = paramObject;
    return (Continuation)sequencesKt___SequencesKt$runningReduceIndexed$1;
  }
  
  public SequencesKt___SequencesKt$runningReduceIndexed$1(Sequence paramSequence, Function3 paramFunction3, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt___SequencesKt$runningReduceIndexed$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt$runningReduceIndexed$1.a : J
    //   3: ldc2_w 9646544365196
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #9
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 320, 0 -> 44, 1 -> 134, 2 -> 277
    //   44: aload_1
    //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   48: aload_0
    //   49: getfield L$0 : Ljava/lang/Object;
    //   52: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   55: astore #4
    //   57: aload_0
    //   58: getfield $this_runningReduceIndexed : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   61: invokeinterface iterator : ()Ljava/util/Iterator;
    //   66: astore #5
    //   68: aload #5
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 316
    //   78: aload #5
    //   80: invokeinterface next : ()Ljava/lang/Object;
    //   85: astore #6
    //   87: aload #4
    //   89: aload #6
    //   91: aload_0
    //   92: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   95: aload_0
    //   96: aload #4
    //   98: putfield L$0 : Ljava/lang/Object;
    //   101: aload_0
    //   102: aload #5
    //   104: putfield L$1 : Ljava/lang/Object;
    //   107: aload_0
    //   108: aload #6
    //   110: putfield L$2 : Ljava/lang/Object;
    //   113: aload_0
    //   114: iconst_1
    //   115: putfield label : I
    //   118: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   121: dup
    //   122: aload #9
    //   124: if_acmpne -> 163
    //   127: aload #9
    //   129: areturn
    //   130: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   133: athrow
    //   134: aload_0
    //   135: getfield L$2 : Ljava/lang/Object;
    //   138: astore #6
    //   140: aload_0
    //   141: getfield L$1 : Ljava/lang/Object;
    //   144: checkcast java/util/Iterator
    //   147: astore #5
    //   149: aload_0
    //   150: getfield L$0 : Ljava/lang/Object;
    //   153: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   156: astore #4
    //   158: aload_1
    //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   162: aload_1
    //   163: pop
    //   164: iconst_1
    //   165: istore #7
    //   167: aload #5
    //   169: invokeinterface hasNext : ()Z
    //   174: ifeq -> 316
    //   177: aload_0
    //   178: getfield $operation : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function3;
    //   181: iload #7
    //   183: iinc #7, 1
    //   186: istore #8
    //   188: iload #8
    //   190: ifge -> 203
    //   193: invokestatic throwIndexOverflow : ()V
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   202: athrow
    //   203: iload #8
    //   205: invokestatic boxInt : (I)Ljava/lang/Integer;
    //   208: aload #6
    //   210: aload #5
    //   212: invokeinterface next : ()Ljava/lang/Object;
    //   217: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   222: astore #6
    //   224: aload #4
    //   226: aload #6
    //   228: aload_0
    //   229: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   232: aload_0
    //   233: aload #4
    //   235: putfield L$0 : Ljava/lang/Object;
    //   238: aload_0
    //   239: aload #5
    //   241: putfield L$1 : Ljava/lang/Object;
    //   244: aload_0
    //   245: aload #6
    //   247: putfield L$2 : Ljava/lang/Object;
    //   250: aload_0
    //   251: iload #7
    //   253: putfield I$0 : I
    //   256: aload_0
    //   257: iconst_2
    //   258: putfield label : I
    //   261: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   264: dup
    //   265: aload #9
    //   267: if_acmpne -> 312
    //   270: aload #9
    //   272: areturn
    //   273: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   276: athrow
    //   277: aload_0
    //   278: getfield I$0 : I
    //   281: istore #7
    //   283: aload_0
    //   284: getfield L$2 : Ljava/lang/Object;
    //   287: astore #6
    //   289: aload_0
    //   290: getfield L$1 : Ljava/lang/Object;
    //   293: checkcast java/util/Iterator
    //   296: astore #5
    //   298: aload_0
    //   299: getfield L$0 : Ljava/lang/Object;
    //   302: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   305: astore #4
    //   307: aload_1
    //   308: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   311: aload_1
    //   312: pop
    //   313: goto -> 167
    //   316: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   319: areturn
    //   320: new java/lang/IllegalStateException
    //   323: dup
    //   324: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   326: invokespecial <init> : (Ljava/lang/String;)V
    //   329: athrow
    // Exception table:
    //   from	to	target	type
    //   87	130	130	java/lang/IllegalStateException
    //   188	196	199	java/lang/IllegalStateException
    //   224	273	273	java/lang/IllegalStateException
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$runningReduceIndexed$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
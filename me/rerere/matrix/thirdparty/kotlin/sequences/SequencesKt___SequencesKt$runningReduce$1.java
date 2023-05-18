package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesKt$runningReduce$1 extends RestrictedSuspendLambda implements Function2 {
  public Object L$2;
  
  public Object L$1;
  
  public int label;
  
  private static final long a = o3.a(6381145795313445942L, -9110696113099975569L, null).a(50950140969440L);
  
  public SequencesKt___SequencesKt$runningReduce$1(Sequence paramSequence, Function2 paramFunction2, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt___SequencesKt$runningReduce$1 sequencesKt___SequencesKt$runningReduce$1 = new SequencesKt___SequencesKt$runningReduce$1(this.$this_runningReduce, this.$operation, paramContinuation);
    sequencesKt___SequencesKt$runningReduce$1.L$0 = paramObject;
    return (Continuation)sequencesKt___SequencesKt$runningReduce$1;
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt$runningReduce$1.a : J
    //   3: ldc2_w 48665511940899
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #7
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 278, 0 -> 44, 1 -> 134, 2 -> 241
    //   44: aload_1
    //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   48: aload_0
    //   49: getfield L$0 : Ljava/lang/Object;
    //   52: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   55: astore #4
    //   57: aload_0
    //   58: getfield $this_runningReduce : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   61: invokeinterface iterator : ()Ljava/util/Iterator;
    //   66: astore #5
    //   68: aload #5
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 274
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
    //   122: aload #7
    //   124: if_acmpne -> 163
    //   127: aload #7
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
    //   164: aload #5
    //   166: invokeinterface hasNext : ()Z
    //   171: ifeq -> 274
    //   174: aload_0
    //   175: getfield $operation : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function2;
    //   178: aload #6
    //   180: aload #5
    //   182: invokeinterface next : ()Ljava/lang/Object;
    //   187: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   192: astore #6
    //   194: aload #4
    //   196: aload #6
    //   198: aload_0
    //   199: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   202: aload_0
    //   203: aload #4
    //   205: putfield L$0 : Ljava/lang/Object;
    //   208: aload_0
    //   209: aload #5
    //   211: putfield L$1 : Ljava/lang/Object;
    //   214: aload_0
    //   215: aload #6
    //   217: putfield L$2 : Ljava/lang/Object;
    //   220: aload_0
    //   221: iconst_2
    //   222: putfield label : I
    //   225: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   228: dup
    //   229: aload #7
    //   231: if_acmpne -> 270
    //   234: aload #7
    //   236: areturn
    //   237: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   240: athrow
    //   241: aload_0
    //   242: getfield L$2 : Ljava/lang/Object;
    //   245: astore #6
    //   247: aload_0
    //   248: getfield L$1 : Ljava/lang/Object;
    //   251: checkcast java/util/Iterator
    //   254: astore #5
    //   256: aload_0
    //   257: getfield L$0 : Ljava/lang/Object;
    //   260: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   263: astore #4
    //   265: aload_1
    //   266: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   269: aload_1
    //   270: pop
    //   271: goto -> 164
    //   274: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   277: areturn
    //   278: new java/lang/IllegalStateException
    //   281: dup
    //   282: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: athrow
    // Exception table:
    //   from	to	target	type
    //   87	130	130	java/lang/IllegalStateException
    //   194	237	237	java/lang/IllegalStateException
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt___SequencesKt$runningReduce$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$runningReduce$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
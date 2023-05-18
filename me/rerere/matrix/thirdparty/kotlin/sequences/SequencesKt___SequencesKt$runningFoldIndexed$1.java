package me.rerere.matrix.thirdparty.kotlin.sequences;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SequencesKt___SequencesKt$runningFoldIndexed$1 extends RestrictedSuspendLambda implements Function2 {
  public Object L$1;
  
  public int label;
  
  public Object L$2;
  
  public int I$0;
  
  private static final long a = o3.a(7675232104076164438L, -4309299477238796574L, null).a(31482013507146L);
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SequencesKt___SequencesKt$runningFoldIndexed$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SequencesKt___SequencesKt$runningFoldIndexed$1 sequencesKt___SequencesKt$runningFoldIndexed$1 = new SequencesKt___SequencesKt$runningFoldIndexed$1(this.$initial, this.$this_runningFoldIndexed, this.$operation, paramContinuation);
    sequencesKt___SequencesKt$runningFoldIndexed$1.L$0 = paramObject;
    return (Continuation)sequencesKt___SequencesKt$runningFoldIndexed$1;
  }
  
  public SequencesKt___SequencesKt$runningFoldIndexed$1(Object paramObject, Sequence paramSequence, Function3 paramFunction3, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/sequences/SequencesKt___SequencesKt$runningFoldIndexed$1.a : J
    //   3: ldc2_w 9397378398997
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #10
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 286, 0 -> 44, 1 -> 94, 2 -> 243
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
    //   82: aload #10
    //   84: if_acmpne -> 108
    //   87: aload #10
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
    //   109: iconst_0
    //   110: istore #5
    //   112: aload_0
    //   113: getfield $initial : Ljava/lang/Object;
    //   116: astore #6
    //   118: aload_0
    //   119: getfield $this_runningFoldIndexed : Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   122: invokeinterface iterator : ()Ljava/util/Iterator;
    //   127: astore #7
    //   129: aload #7
    //   131: invokeinterface hasNext : ()Z
    //   136: ifeq -> 282
    //   139: aload #7
    //   141: invokeinterface next : ()Ljava/lang/Object;
    //   146: astore #8
    //   148: aload_0
    //   149: getfield $operation : Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function3;
    //   152: iload #5
    //   154: iinc #5, 1
    //   157: istore #9
    //   159: iload #9
    //   161: ifge -> 174
    //   164: invokestatic throwIndexOverflow : ()V
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   173: athrow
    //   174: iload #9
    //   176: invokestatic boxInt : (I)Ljava/lang/Integer;
    //   179: aload #6
    //   181: aload #8
    //   183: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   188: astore #6
    //   190: aload #4
    //   192: aload #6
    //   194: aload_0
    //   195: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   198: aload_0
    //   199: aload #4
    //   201: putfield L$0 : Ljava/lang/Object;
    //   204: aload_0
    //   205: aload #6
    //   207: putfield L$1 : Ljava/lang/Object;
    //   210: aload_0
    //   211: aload #7
    //   213: putfield L$2 : Ljava/lang/Object;
    //   216: aload_0
    //   217: iload #5
    //   219: putfield I$0 : I
    //   222: aload_0
    //   223: iconst_2
    //   224: putfield label : I
    //   227: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   230: dup
    //   231: aload #10
    //   233: if_acmpne -> 278
    //   236: aload #10
    //   238: areturn
    //   239: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   242: athrow
    //   243: aload_0
    //   244: getfield I$0 : I
    //   247: istore #5
    //   249: aload_0
    //   250: getfield L$2 : Ljava/lang/Object;
    //   253: checkcast java/util/Iterator
    //   256: astore #7
    //   258: aload_0
    //   259: getfield L$1 : Ljava/lang/Object;
    //   262: astore #6
    //   264: aload_0
    //   265: getfield L$0 : Ljava/lang/Object;
    //   268: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   271: astore #4
    //   273: aload_1
    //   274: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   277: aload_1
    //   278: pop
    //   279: goto -> 129
    //   282: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   285: areturn
    //   286: new java/lang/IllegalStateException
    //   289: dup
    //   290: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   292: invokespecial <init> : (Ljava/lang/String;)V
    //   295: athrow
    // Exception table:
    //   from	to	target	type
    //   57	90	90	java/lang/IllegalStateException
    //   159	167	170	java/lang/IllegalStateException
    //   190	239	239	java/lang/IllegalStateException
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\sequences\SequencesKt___SequencesKt$runningFoldIndexed$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequenceScope;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Regex$splitToSequence$1 extends RestrictedSuspendLambda implements Function2 {
  public int I$0;
  
  public int label;
  
  public Object L$1;
  
  private static final long a = o3.a(-650929444265207956L, 8106542512622440214L, null).a(101442764776216L);
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((Regex$splitToSequence$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  public Regex$splitToSequence$1(CharSequence paramCharSequence, int paramInt, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/Regex$splitToSequence$1.a : J
    //   3: ldc2_w 63956288733420
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #8
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 353, 0 -> 48, 1 -> 141, 2 -> 217, 3 -> 343
    //   48: aload_1
    //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   52: aload_0
    //   53: getfield L$0 : Ljava/lang/Object;
    //   56: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   59: astore #4
    //   61: aload_0
    //   62: getfield this$0 : Lme/rerere/matrix/thirdparty/kotlin/text/Regex;
    //   65: invokestatic access$getNativePattern$p : (Lme/rerere/matrix/thirdparty/kotlin/text/Regex;)Ljava/util/regex/Pattern;
    //   68: aload_0
    //   69: getfield $input : Ljava/lang/CharSequence;
    //   72: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   75: astore #5
    //   77: aload_0
    //   78: getfield $limit : I
    //   81: iconst_1
    //   82: if_icmpeq -> 100
    //   85: aload #5
    //   87: invokevirtual find : ()Z
    //   90: ifne -> 151
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   99: athrow
    //   100: aload #4
    //   102: aload_0
    //   103: getfield $input : Ljava/lang/CharSequence;
    //   106: invokevirtual toString : ()Ljava/lang/String;
    //   109: aload_0
    //   110: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   113: aload_0
    //   114: iconst_1
    //   115: putfield label : I
    //   118: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   121: dup
    //   122: aload #8
    //   124: if_acmpne -> 146
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   133: athrow
    //   134: aload #8
    //   136: areturn
    //   137: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   140: athrow
    //   141: aload_1
    //   142: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   145: aload_1
    //   146: pop
    //   147: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   150: areturn
    //   151: iconst_0
    //   152: istore #6
    //   154: iconst_0
    //   155: istore #7
    //   157: aload #4
    //   159: aload_0
    //   160: getfield $input : Ljava/lang/CharSequence;
    //   163: iload #6
    //   165: aload #5
    //   167: invokevirtual start : ()I
    //   170: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   175: invokevirtual toString : ()Ljava/lang/String;
    //   178: aload_0
    //   179: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   182: aload_0
    //   183: aload #4
    //   185: putfield L$0 : Ljava/lang/Object;
    //   188: aload_0
    //   189: aload #5
    //   191: putfield L$1 : Ljava/lang/Object;
    //   194: aload_0
    //   195: iload #7
    //   197: putfield I$0 : I
    //   200: aload_0
    //   201: iconst_2
    //   202: putfield label : I
    //   205: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   208: dup
    //   209: aload #8
    //   211: if_acmpne -> 246
    //   214: aload #8
    //   216: areturn
    //   217: aload_0
    //   218: getfield I$0 : I
    //   221: istore #7
    //   223: aload_0
    //   224: getfield L$1 : Ljava/lang/Object;
    //   227: checkcast java/util/regex/Matcher
    //   230: astore #5
    //   232: aload_0
    //   233: getfield L$0 : Ljava/lang/Object;
    //   236: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   239: astore #4
    //   241: aload_1
    //   242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   245: aload_1
    //   246: pop
    //   247: aload #5
    //   249: invokevirtual end : ()I
    //   252: istore #6
    //   254: iinc #7, 1
    //   257: iload #7
    //   259: aload_0
    //   260: getfield $limit : I
    //   263: iconst_1
    //   264: isub
    //   265: if_icmpeq -> 283
    //   268: aload #5
    //   270: invokevirtual find : ()Z
    //   273: ifne -> 157
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   282: athrow
    //   283: aload #4
    //   285: aload_0
    //   286: getfield $input : Ljava/lang/CharSequence;
    //   289: iload #6
    //   291: aload_0
    //   292: getfield $input : Ljava/lang/CharSequence;
    //   295: invokeinterface length : ()I
    //   300: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   305: invokevirtual toString : ()Ljava/lang/String;
    //   308: aload_0
    //   309: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   312: aload_0
    //   313: aconst_null
    //   314: putfield L$0 : Ljava/lang/Object;
    //   317: aload_0
    //   318: aconst_null
    //   319: putfield L$1 : Ljava/lang/Object;
    //   322: aload_0
    //   323: iconst_3
    //   324: putfield label : I
    //   327: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   330: dup
    //   331: aload #8
    //   333: if_acmpne -> 348
    //   336: aload #8
    //   338: areturn
    //   339: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   342: athrow
    //   343: aload_1
    //   344: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   347: aload_1
    //   348: pop
    //   349: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   352: areturn
    //   353: new java/lang/IllegalStateException
    //   356: dup
    //   357: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   359: invokespecial <init> : (Ljava/lang/String;)V
    //   362: athrow
    // Exception table:
    //   from	to	target	type
    //   77	93	96	java/lang/IllegalStateException
    //   85	127	130	java/lang/IllegalStateException
    //   100	137	137	java/lang/IllegalStateException
    //   254	276	279	java/lang/IllegalStateException
    //   283	339	339	java/lang/IllegalStateException
  }
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    Regex$splitToSequence$1 regex$splitToSequence$1 = new Regex$splitToSequence$1(this.$input, this.$limit, paramContinuation);
    regex$splitToSequence$1.L$0 = paramObject;
    return (Continuation)regex$splitToSequence$1;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\Regex$splitToSequence$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
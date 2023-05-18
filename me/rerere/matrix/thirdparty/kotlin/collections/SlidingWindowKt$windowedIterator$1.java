package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.coroutines.Continuation;
import me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequenceScope;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2 {
  public int I$0;
  
  public Object L$1;
  
  public Object L$2;
  
  public int label;
  
  private static final long a = o3.a(3544600208593933960L, -6552795122544628832L, null).a(344764561746L);
  
  @NotNull
  public final Continuation create(@Nullable Object paramObject, @NotNull Continuation paramContinuation) {
    SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, paramContinuation);
    slidingWindowKt$windowedIterator$1.L$0 = paramObject;
    return (Continuation)slidingWindowKt$windowedIterator$1;
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/SlidingWindowKt$windowedIterator$1.a : J
    //   3: ldc2_w 105663267249100
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   11: astore #11
    //   13: aload_0
    //   14: getfield label : I
    //   17: tableswitch default -> 854, 0 -> 56, 1 -> 224, 2 -> 411, 3 -> 576, 4 -> 732, 5 -> 844
    //   56: aload_1
    //   57: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   60: aload_0
    //   61: getfield L$0 : Ljava/lang/Object;
    //   64: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   67: astore #4
    //   69: aload_0
    //   70: getfield $size : I
    //   73: sipush #1024
    //   76: invokestatic coerceAtMost : (II)I
    //   79: istore #5
    //   81: aload_0
    //   82: getfield $step : I
    //   85: aload_0
    //   86: getfield $size : I
    //   89: isub
    //   90: istore #6
    //   92: iload #6
    //   94: iflt -> 420
    //   97: new java/util/ArrayList
    //   100: dup
    //   101: iload #5
    //   103: invokespecial <init> : (I)V
    //   106: astore #7
    //   108: iconst_0
    //   109: istore #8
    //   111: aload_0
    //   112: getfield $iterator : Ljava/util/Iterator;
    //   115: astore #9
    //   117: aload #9
    //   119: invokeinterface hasNext : ()Z
    //   124: ifeq -> 302
    //   127: aload #9
    //   129: invokeinterface next : ()Ljava/lang/Object;
    //   134: astore #10
    //   136: iload #8
    //   138: ifle -> 151
    //   141: iinc #8, -1
    //   144: goto -> 117
    //   147: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   150: athrow
    //   151: aload #7
    //   153: aload #10
    //   155: invokevirtual add : (Ljava/lang/Object;)Z
    //   158: pop
    //   159: aload #7
    //   161: invokevirtual size : ()I
    //   164: aload_0
    //   165: getfield $size : I
    //   168: if_icmpne -> 117
    //   171: aload #4
    //   173: aload #7
    //   175: aload_0
    //   176: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   179: aload_0
    //   180: aload #4
    //   182: putfield L$0 : Ljava/lang/Object;
    //   185: aload_0
    //   186: aload #7
    //   188: putfield L$1 : Ljava/lang/Object;
    //   191: aload_0
    //   192: aload #9
    //   194: putfield L$2 : Ljava/lang/Object;
    //   197: aload_0
    //   198: iload #6
    //   200: putfield I$0 : I
    //   203: aload_0
    //   204: iconst_1
    //   205: putfield label : I
    //   208: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   211: dup
    //   212: aload #11
    //   214: if_acmpne -> 262
    //   217: aload #11
    //   219: areturn
    //   220: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   223: athrow
    //   224: aload_0
    //   225: getfield I$0 : I
    //   228: istore #6
    //   230: aload_0
    //   231: getfield L$2 : Ljava/lang/Object;
    //   234: checkcast java/util/Iterator
    //   237: astore #9
    //   239: aload_0
    //   240: getfield L$1 : Ljava/lang/Object;
    //   243: checkcast java/util/ArrayList
    //   246: astore #7
    //   248: aload_0
    //   249: getfield L$0 : Ljava/lang/Object;
    //   252: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   255: astore #4
    //   257: aload_1
    //   258: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   261: aload_1
    //   262: pop
    //   263: aload_0
    //   264: getfield $reuseBuffer : Z
    //   267: ifeq -> 282
    //   270: aload #7
    //   272: invokevirtual clear : ()V
    //   275: goto -> 295
    //   278: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   281: athrow
    //   282: new java/util/ArrayList
    //   285: dup
    //   286: aload_0
    //   287: getfield $size : I
    //   290: invokespecial <init> : (I)V
    //   293: astore #7
    //   295: iload #6
    //   297: istore #8
    //   299: goto -> 117
    //   302: aload #7
    //   304: checkcast java/util/Collection
    //   307: invokeinterface isEmpty : ()Z
    //   312: ifne -> 323
    //   315: iconst_1
    //   316: goto -> 324
    //   319: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   322: athrow
    //   323: iconst_0
    //   324: ifeq -> 850
    //   327: aload_0
    //   328: getfield $partialWindows : Z
    //   331: ifne -> 360
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   340: athrow
    //   341: aload #7
    //   343: invokevirtual size : ()I
    //   346: aload_0
    //   347: getfield $size : I
    //   350: if_icmpne -> 850
    //   353: goto -> 360
    //   356: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   359: athrow
    //   360: aload #4
    //   362: aload #7
    //   364: aload_0
    //   365: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   368: aload_0
    //   369: aconst_null
    //   370: putfield L$0 : Ljava/lang/Object;
    //   373: aload_0
    //   374: aconst_null
    //   375: putfield L$1 : Ljava/lang/Object;
    //   378: aload_0
    //   379: aconst_null
    //   380: putfield L$2 : Ljava/lang/Object;
    //   383: aload_0
    //   384: iconst_2
    //   385: putfield label : I
    //   388: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   391: dup
    //   392: aload #11
    //   394: if_acmpne -> 416
    //   397: goto -> 404
    //   400: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   403: athrow
    //   404: aload #11
    //   406: areturn
    //   407: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   410: athrow
    //   411: aload_1
    //   412: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   415: aload_1
    //   416: pop
    //   417: goto -> 850
    //   420: new me/rerere/matrix/thirdparty/kotlin/collections/RingBuffer
    //   423: dup
    //   424: iload #5
    //   426: invokespecial <init> : (I)V
    //   429: astore #7
    //   431: aload_0
    //   432: getfield $iterator : Ljava/util/Iterator;
    //   435: astore #8
    //   437: aload #8
    //   439: invokeinterface hasNext : ()Z
    //   444: ifeq -> 621
    //   447: aload #8
    //   449: invokeinterface next : ()Ljava/lang/Object;
    //   454: astore #9
    //   456: aload #7
    //   458: aload #9
    //   460: invokevirtual add : (Ljava/lang/Object;)V
    //   463: aload #7
    //   465: invokevirtual isFull : ()Z
    //   468: ifeq -> 437
    //   471: aload #7
    //   473: invokevirtual size : ()I
    //   476: aload_0
    //   477: getfield $size : I
    //   480: if_icmpge -> 497
    //   483: aload #7
    //   485: aload_0
    //   486: getfield $size : I
    //   489: invokevirtual expanded : (I)Lme/rerere/matrix/thirdparty/kotlin/collections/RingBuffer;
    //   492: astore #7
    //   494: goto -> 437
    //   497: aload #4
    //   499: aload_0
    //   500: getfield $reuseBuffer : Z
    //   503: ifeq -> 518
    //   506: aload #7
    //   508: checkcast java/util/List
    //   511: goto -> 533
    //   514: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   517: athrow
    //   518: new java/util/ArrayList
    //   521: dup
    //   522: aload #7
    //   524: checkcast java/util/Collection
    //   527: invokespecial <init> : (Ljava/util/Collection;)V
    //   530: checkcast java/util/List
    //   533: aload_0
    //   534: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   537: aload_0
    //   538: aload #4
    //   540: putfield L$0 : Ljava/lang/Object;
    //   543: aload_0
    //   544: aload #7
    //   546: putfield L$1 : Ljava/lang/Object;
    //   549: aload_0
    //   550: aload #8
    //   552: putfield L$2 : Ljava/lang/Object;
    //   555: aload_0
    //   556: iconst_3
    //   557: putfield label : I
    //   560: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   563: dup
    //   564: aload #11
    //   566: if_acmpne -> 608
    //   569: aload #11
    //   571: areturn
    //   572: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   575: athrow
    //   576: aload_0
    //   577: getfield L$2 : Ljava/lang/Object;
    //   580: checkcast java/util/Iterator
    //   583: astore #8
    //   585: aload_0
    //   586: getfield L$1 : Ljava/lang/Object;
    //   589: checkcast me/rerere/matrix/thirdparty/kotlin/collections/RingBuffer
    //   592: astore #7
    //   594: aload_0
    //   595: getfield L$0 : Ljava/lang/Object;
    //   598: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   601: astore #4
    //   603: aload_1
    //   604: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   607: aload_1
    //   608: pop
    //   609: aload #7
    //   611: aload_0
    //   612: getfield $step : I
    //   615: invokevirtual removeFirst : (I)V
    //   618: goto -> 437
    //   621: aload_0
    //   622: getfield $partialWindows : Z
    //   625: ifeq -> 850
    //   628: aload #7
    //   630: invokevirtual size : ()I
    //   633: aload_0
    //   634: getfield $step : I
    //   637: if_icmple -> 768
    //   640: goto -> 647
    //   643: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   646: athrow
    //   647: aload #4
    //   649: aload_0
    //   650: getfield $reuseBuffer : Z
    //   653: ifeq -> 675
    //   656: goto -> 663
    //   659: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   662: athrow
    //   663: aload #7
    //   665: checkcast java/util/List
    //   668: goto -> 690
    //   671: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   674: athrow
    //   675: new java/util/ArrayList
    //   678: dup
    //   679: aload #7
    //   681: checkcast java/util/Collection
    //   684: invokespecial <init> : (Ljava/util/Collection;)V
    //   687: checkcast java/util/List
    //   690: aload_0
    //   691: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   694: aload_0
    //   695: aload #4
    //   697: putfield L$0 : Ljava/lang/Object;
    //   700: aload_0
    //   701: aload #7
    //   703: putfield L$1 : Ljava/lang/Object;
    //   706: aload_0
    //   707: aconst_null
    //   708: putfield L$2 : Ljava/lang/Object;
    //   711: aload_0
    //   712: iconst_4
    //   713: putfield label : I
    //   716: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   719: dup
    //   720: aload #11
    //   722: if_acmpne -> 755
    //   725: aload #11
    //   727: areturn
    //   728: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   731: athrow
    //   732: aload_0
    //   733: getfield L$1 : Ljava/lang/Object;
    //   736: checkcast me/rerere/matrix/thirdparty/kotlin/collections/RingBuffer
    //   739: astore #7
    //   741: aload_0
    //   742: getfield L$0 : Ljava/lang/Object;
    //   745: checkcast me/rerere/matrix/thirdparty/kotlin/sequences/SequenceScope
    //   748: astore #4
    //   750: aload_1
    //   751: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   754: aload_1
    //   755: pop
    //   756: aload #7
    //   758: aload_0
    //   759: getfield $step : I
    //   762: invokevirtual removeFirst : (I)V
    //   765: goto -> 628
    //   768: aload #7
    //   770: checkcast java/util/Collection
    //   773: invokeinterface isEmpty : ()Z
    //   778: ifne -> 789
    //   781: iconst_1
    //   782: goto -> 790
    //   785: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   788: athrow
    //   789: iconst_0
    //   790: ifeq -> 850
    //   793: aload #4
    //   795: aload #7
    //   797: aload_0
    //   798: checkcast me/rerere/matrix/thirdparty/kotlin/coroutines/Continuation
    //   801: aload_0
    //   802: aconst_null
    //   803: putfield L$0 : Ljava/lang/Object;
    //   806: aload_0
    //   807: aconst_null
    //   808: putfield L$1 : Ljava/lang/Object;
    //   811: aload_0
    //   812: aconst_null
    //   813: putfield L$2 : Ljava/lang/Object;
    //   816: aload_0
    //   817: iconst_5
    //   818: putfield label : I
    //   821: invokevirtual yield : (Ljava/lang/Object;Lme/rerere/matrix/thirdparty/kotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   824: dup
    //   825: aload #11
    //   827: if_acmpne -> 849
    //   830: goto -> 837
    //   833: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   836: athrow
    //   837: aload #11
    //   839: areturn
    //   840: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   843: athrow
    //   844: aload_1
    //   845: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   848: aload_1
    //   849: pop
    //   850: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   853: areturn
    //   854: new java/lang/IllegalStateException
    //   857: dup
    //   858: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   860: invokespecial <init> : (Ljava/lang/String;)V
    //   863: athrow
    // Exception table:
    //   from	to	target	type
    //   136	147	147	java/lang/IllegalStateException
    //   171	220	220	java/lang/IllegalStateException
    //   262	278	278	java/lang/IllegalStateException
    //   302	319	319	java/lang/IllegalStateException
    //   324	334	337	java/lang/IllegalStateException
    //   327	353	356	java/lang/IllegalStateException
    //   341	397	400	java/lang/IllegalStateException
    //   360	407	407	java/lang/IllegalStateException
    //   497	514	514	java/lang/IllegalStateException
    //   533	572	572	java/lang/IllegalStateException
    //   621	640	643	java/lang/IllegalStateException
    //   628	656	659	java/lang/IllegalStateException
    //   647	671	671	java/lang/IllegalStateException
    //   690	728	728	java/lang/IllegalStateException
    //   768	785	785	java/lang/IllegalStateException
    //   790	830	833	java/lang/IllegalStateException
    //   793	840	840	java/lang/IllegalStateException
  }
  
  public SlidingWindowKt$windowedIterator$1(int paramInt1, int paramInt2, Iterator paramIterator, boolean paramBoolean1, boolean paramBoolean2, Continuation paramContinuation) {
    super(2, paramContinuation);
  }
  
  @Nullable
  public final Object invoke(@NotNull SequenceScope paramSequenceScope, @Nullable Continuation paramContinuation) {
    return ((SlidingWindowKt$windowedIterator$1)create(paramSequenceScope, paramContinuation)).invokeSuspend(Unit.INSTANCE);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\SlidingWindowKt$windowedIterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
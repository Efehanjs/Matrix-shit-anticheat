package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CacheControl$Companion {
  private static final long a = o3.a(8409065574168836679L, -3455895415619987086L, MethodHandles.lookup().lookupClass()).a(140378554842022L);
  
  @NotNull
  public final CacheControl parse(@NotNull Headers paramHeaders) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/CacheControl$Companion.a : J
    //   3: ldc2_w 7718445621058
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'headers'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_0
    //   15: istore #4
    //   17: iconst_0
    //   18: istore #5
    //   20: iconst_m1
    //   21: istore #6
    //   23: iconst_m1
    //   24: istore #7
    //   26: iconst_0
    //   27: istore #8
    //   29: iconst_0
    //   30: istore #9
    //   32: iconst_0
    //   33: istore #10
    //   35: iconst_m1
    //   36: istore #11
    //   38: iconst_m1
    //   39: istore #12
    //   41: iconst_0
    //   42: istore #13
    //   44: iconst_0
    //   45: istore #14
    //   47: iconst_0
    //   48: istore #15
    //   50: iconst_1
    //   51: istore #16
    //   53: aconst_null
    //   54: astore #17
    //   56: iconst_0
    //   57: istore #18
    //   59: aload_1
    //   60: invokevirtual size : ()I
    //   63: istore #19
    //   65: iload #18
    //   67: iload #19
    //   69: if_icmpge -> 651
    //   72: iload #18
    //   74: istore #20
    //   76: iinc #18, 1
    //   79: aload_1
    //   80: iload #20
    //   82: invokevirtual name : (I)Ljava/lang/String;
    //   85: astore #21
    //   87: aload_1
    //   88: iload #20
    //   90: invokevirtual value : (I)Ljava/lang/String;
    //   93: astore #22
    //   95: nop
    //   96: aload #21
    //   98: ldc 'Cache-Control'
    //   100: iconst_1
    //   101: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   104: ifeq -> 132
    //   107: aload #17
    //   109: ifnull -> 125
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: iconst_0
    //   120: istore #16
    //   122: goto -> 152
    //   125: aload #22
    //   127: astore #17
    //   129: goto -> 152
    //   132: aload #21
    //   134: ldc 'Pragma'
    //   136: iconst_1
    //   137: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   140: ifeq -> 149
    //   143: iconst_0
    //   144: istore #16
    //   146: goto -> 152
    //   149: goto -> 65
    //   152: iconst_0
    //   153: istore #23
    //   155: iload #23
    //   157: aload #22
    //   159: invokevirtual length : ()I
    //   162: if_icmpge -> 65
    //   165: iload #23
    //   167: istore #24
    //   169: aload_0
    //   170: aload #22
    //   172: ldc '=,;'
    //   174: iload #23
    //   176: invokespecial indexOfElement : (Ljava/lang/String;Ljava/lang/String;I)I
    //   179: istore #23
    //   181: aload #22
    //   183: iload #24
    //   185: iload #23
    //   187: invokevirtual substring : (II)Ljava/lang/String;
    //   190: dup
    //   191: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   193: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   196: checkcast java/lang/CharSequence
    //   199: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   202: invokevirtual toString : ()Ljava/lang/String;
    //   205: astore #25
    //   207: aconst_null
    //   208: astore #26
    //   210: iload #23
    //   212: aload #22
    //   214: invokevirtual length : ()I
    //   217: if_icmpeq -> 258
    //   220: aload #22
    //   222: iload #23
    //   224: invokevirtual charAt : (I)C
    //   227: bipush #44
    //   229: if_icmpeq -> 258
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: aload #22
    //   241: iload #23
    //   243: invokevirtual charAt : (I)C
    //   246: bipush #59
    //   248: if_icmpne -> 274
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: iload #23
    //   260: istore #27
    //   262: iload #27
    //   264: iconst_1
    //   265: iadd
    //   266: istore #23
    //   268: aconst_null
    //   269: astore #26
    //   271: goto -> 425
    //   274: iload #23
    //   276: istore #27
    //   278: iload #27
    //   280: iconst_1
    //   281: iadd
    //   282: istore #23
    //   284: aload #22
    //   286: iload #23
    //   288: invokestatic indexOfNonWhitespace : (Ljava/lang/String;I)I
    //   291: istore #23
    //   293: iload #23
    //   295: aload #22
    //   297: invokevirtual length : ()I
    //   300: if_icmpge -> 383
    //   303: aload #22
    //   305: iload #23
    //   307: invokevirtual charAt : (I)C
    //   310: bipush #34
    //   312: if_icmpne -> 383
    //   315: goto -> 322
    //   318: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   321: athrow
    //   322: iload #23
    //   324: istore #27
    //   326: iload #27
    //   328: iconst_1
    //   329: iadd
    //   330: istore #23
    //   332: iload #23
    //   334: istore #27
    //   336: aload #22
    //   338: checkcast java/lang/CharSequence
    //   341: bipush #34
    //   343: iload #23
    //   345: iconst_0
    //   346: iconst_4
    //   347: aconst_null
    //   348: invokestatic indexOf$default : (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
    //   351: istore #23
    //   353: aload #22
    //   355: iload #27
    //   357: iload #23
    //   359: invokevirtual substring : (II)Ljava/lang/String;
    //   362: dup
    //   363: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   365: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   368: astore #26
    //   370: iload #23
    //   372: istore #28
    //   374: iload #28
    //   376: iconst_1
    //   377: iadd
    //   378: istore #23
    //   380: goto -> 425
    //   383: iload #23
    //   385: istore #27
    //   387: aload_0
    //   388: aload #22
    //   390: ldc ',;'
    //   392: iload #23
    //   394: invokespecial indexOfElement : (Ljava/lang/String;Ljava/lang/String;I)I
    //   397: istore #23
    //   399: aload #22
    //   401: iload #27
    //   403: iload #23
    //   405: invokevirtual substring : (II)Ljava/lang/String;
    //   408: dup
    //   409: ldc 'this as java.lang.String…ing(startIndex, endIndex)'
    //   411: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   414: checkcast java/lang/CharSequence
    //   417: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   420: invokevirtual toString : ()Ljava/lang/String;
    //   423: astore #26
    //   425: nop
    //   426: ldc 'no-cache'
    //   428: aload #25
    //   430: iconst_1
    //   431: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   434: ifeq -> 443
    //   437: iconst_1
    //   438: istore #4
    //   440: goto -> 155
    //   443: ldc 'no-store'
    //   445: aload #25
    //   447: iconst_1
    //   448: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   451: ifeq -> 460
    //   454: iconst_1
    //   455: istore #5
    //   457: goto -> 155
    //   460: ldc 'max-age'
    //   462: aload #25
    //   464: iconst_1
    //   465: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   468: ifeq -> 482
    //   471: aload #26
    //   473: iconst_m1
    //   474: invokestatic toNonNegativeInt : (Ljava/lang/String;I)I
    //   477: istore #6
    //   479: goto -> 155
    //   482: ldc 's-maxage'
    //   484: aload #25
    //   486: iconst_1
    //   487: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   490: ifeq -> 504
    //   493: aload #26
    //   495: iconst_m1
    //   496: invokestatic toNonNegativeInt : (Ljava/lang/String;I)I
    //   499: istore #7
    //   501: goto -> 155
    //   504: ldc 'private'
    //   506: aload #25
    //   508: iconst_1
    //   509: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   512: ifeq -> 521
    //   515: iconst_1
    //   516: istore #8
    //   518: goto -> 155
    //   521: ldc 'public'
    //   523: aload #25
    //   525: iconst_1
    //   526: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   529: ifeq -> 538
    //   532: iconst_1
    //   533: istore #9
    //   535: goto -> 155
    //   538: ldc 'must-revalidate'
    //   540: aload #25
    //   542: iconst_1
    //   543: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   546: ifeq -> 555
    //   549: iconst_1
    //   550: istore #10
    //   552: goto -> 155
    //   555: ldc 'max-stale'
    //   557: aload #25
    //   559: iconst_1
    //   560: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   563: ifeq -> 578
    //   566: aload #26
    //   568: ldc 2147483647
    //   570: invokestatic toNonNegativeInt : (Ljava/lang/String;I)I
    //   573: istore #11
    //   575: goto -> 155
    //   578: ldc 'min-fresh'
    //   580: aload #25
    //   582: iconst_1
    //   583: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   586: ifeq -> 600
    //   589: aload #26
    //   591: iconst_m1
    //   592: invokestatic toNonNegativeInt : (Ljava/lang/String;I)I
    //   595: istore #12
    //   597: goto -> 155
    //   600: ldc 'only-if-cached'
    //   602: aload #25
    //   604: iconst_1
    //   605: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   608: ifeq -> 617
    //   611: iconst_1
    //   612: istore #13
    //   614: goto -> 155
    //   617: ldc 'no-transform'
    //   619: aload #25
    //   621: iconst_1
    //   622: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   625: ifeq -> 634
    //   628: iconst_1
    //   629: istore #14
    //   631: goto -> 155
    //   634: ldc 'immutable'
    //   636: aload #25
    //   638: iconst_1
    //   639: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   642: ifeq -> 155
    //   645: iconst_1
    //   646: istore #15
    //   648: goto -> 155
    //   651: iload #16
    //   653: ifne -> 659
    //   656: aconst_null
    //   657: astore #17
    //   659: new me/rerere/matrix/thirdparty/okhttp3/CacheControl
    //   662: dup
    //   663: iload #4
    //   665: iload #5
    //   667: iload #6
    //   669: iload #7
    //   671: iload #8
    //   673: iload #9
    //   675: iload #10
    //   677: iload #11
    //   679: iload #12
    //   681: iload #13
    //   683: iload #14
    //   685: iload #15
    //   687: aload #17
    //   689: aconst_null
    //   690: invokespecial <init> : (ZZIIZZZIIZZZLjava/lang/String;Lme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   693: areturn
    // Exception table:
    //   from	to	target	type
    //   95	112	115	java/lang/RuntimeException
    //   210	232	235	java/lang/RuntimeException
    //   220	251	254	java/lang/RuntimeException
    //   293	315	318	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CacheControl$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
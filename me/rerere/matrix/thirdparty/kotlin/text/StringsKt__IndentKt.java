package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.IntrinsicConstEvaluation;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class StringsKt__IndentKt extends StringsKt__AppendableKt {
  private static final long b = o3.a(-1894854870847728L, -6435229988117087941L, null).a(160477846499224L);
  
  @NotNull
  public static final String prependIndent(@NotNull String paramString1, @NotNull String paramString2) {
    long l = b ^ 0x67D1AE121962L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "indent");
    return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence(paramString1), new StringsKt__IndentKt$prependIndent$1(paramString2)), "\n", null, null, 0, null, null, 62, null);
  }
  
  @NotNull
  public static final String replaceIndent(@NotNull String paramString1, @NotNull String paramString2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__IndentKt.b : J
    //   3: ldc2_w 134551735068292
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'newIndent'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: checkcast java/lang/CharSequence
    //   24: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
    //   27: astore #4
    //   29: aload #4
    //   31: checkcast java/lang/Iterable
    //   34: astore #7
    //   36: nop
    //   37: iconst_0
    //   38: istore #8
    //   40: aload #7
    //   42: astore #9
    //   44: new java/util/ArrayList
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: checkcast java/util/Collection
    //   54: astore #10
    //   56: iconst_0
    //   57: istore #11
    //   59: aload #9
    //   61: invokeinterface iterator : ()Ljava/util/Iterator;
    //   66: astore #12
    //   68: aload #12
    //   70: invokeinterface hasNext : ()Z
    //   75: ifeq -> 133
    //   78: aload #12
    //   80: invokeinterface next : ()Ljava/lang/Object;
    //   85: astore #13
    //   87: aload #13
    //   89: checkcast java/lang/String
    //   92: astore #14
    //   94: iconst_0
    //   95: istore #15
    //   97: aload #14
    //   99: checkcast java/lang/CharSequence
    //   102: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   105: ifne -> 116
    //   108: iconst_1
    //   109: goto -> 117
    //   112: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   115: athrow
    //   116: iconst_0
    //   117: ifeq -> 68
    //   120: aload #10
    //   122: aload #13
    //   124: invokeinterface add : (Ljava/lang/Object;)Z
    //   129: pop
    //   130: goto -> 68
    //   133: aload #10
    //   135: checkcast java/util/List
    //   138: nop
    //   139: checkcast java/lang/Iterable
    //   142: astore #7
    //   144: nop
    //   145: iconst_0
    //   146: istore #8
    //   148: aload #7
    //   150: astore #9
    //   152: new java/util/ArrayList
    //   155: dup
    //   156: aload #7
    //   158: bipush #10
    //   160: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   163: invokespecial <init> : (I)V
    //   166: checkcast java/util/Collection
    //   169: astore #10
    //   171: iconst_0
    //   172: istore #11
    //   174: aload #9
    //   176: invokeinterface iterator : ()Ljava/util/Iterator;
    //   181: astore #12
    //   183: aload #12
    //   185: invokeinterface hasNext : ()Z
    //   190: ifeq -> 236
    //   193: aload #12
    //   195: invokeinterface next : ()Ljava/lang/Object;
    //   200: astore #13
    //   202: aload #10
    //   204: aload #13
    //   206: checkcast java/lang/String
    //   209: astore #14
    //   211: astore #34
    //   213: iconst_0
    //   214: istore #15
    //   216: aload #14
    //   218: invokestatic indentWidth$StringsKt__IndentKt : (Ljava/lang/String;)I
    //   221: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   224: aload #34
    //   226: swap
    //   227: invokeinterface add : (Ljava/lang/Object;)Z
    //   232: pop
    //   233: goto -> 183
    //   236: aload #10
    //   238: checkcast java/util/List
    //   241: nop
    //   242: checkcast java/lang/Iterable
    //   245: invokestatic minOrNull : (Ljava/lang/Iterable;)Ljava/lang/Comparable;
    //   248: checkcast java/lang/Integer
    //   251: dup
    //   252: ifnull -> 265
    //   255: invokevirtual intValue : ()I
    //   258: goto -> 267
    //   261: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   264: athrow
    //   265: pop
    //   266: iconst_0
    //   267: istore #5
    //   269: aload #4
    //   271: astore #6
    //   273: aload_0
    //   274: invokevirtual length : ()I
    //   277: aload_1
    //   278: invokevirtual length : ()I
    //   281: aload #4
    //   283: invokeinterface size : ()I
    //   288: imul
    //   289: iadd
    //   290: istore #7
    //   292: aload_1
    //   293: invokestatic getIndentFunction$StringsKt__IndentKt : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   296: astore #8
    //   298: iconst_0
    //   299: istore #9
    //   301: aload #6
    //   303: invokestatic getLastIndex : (Ljava/util/List;)I
    //   306: istore #10
    //   308: aload #6
    //   310: checkcast java/lang/Iterable
    //   313: astore #11
    //   315: iconst_0
    //   316: istore #12
    //   318: aload #11
    //   320: astore #13
    //   322: new java/util/ArrayList
    //   325: dup
    //   326: invokespecial <init> : ()V
    //   329: checkcast java/util/Collection
    //   332: astore #14
    //   334: iconst_0
    //   335: istore #15
    //   337: aload #13
    //   339: astore #16
    //   341: iconst_0
    //   342: istore #17
    //   344: iconst_0
    //   345: istore #18
    //   347: aload #16
    //   349: invokeinterface iterator : ()Ljava/util/Iterator;
    //   354: astore #19
    //   356: aload #19
    //   358: invokeinterface hasNext : ()Z
    //   363: ifeq -> 546
    //   366: aload #19
    //   368: invokeinterface next : ()Ljava/lang/Object;
    //   373: astore #20
    //   375: iload #18
    //   377: iinc #18, 1
    //   380: istore #21
    //   382: iload #21
    //   384: ifge -> 397
    //   387: invokestatic throwIndexOverflow : ()V
    //   390: goto -> 397
    //   393: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   396: athrow
    //   397: iload #21
    //   399: aload #20
    //   401: astore #22
    //   403: istore #23
    //   405: iconst_0
    //   406: istore #24
    //   408: iload #23
    //   410: aload #22
    //   412: checkcast java/lang/String
    //   415: astore #25
    //   417: istore #26
    //   419: iconst_0
    //   420: istore #27
    //   422: iload #26
    //   424: ifeq -> 441
    //   427: iload #26
    //   429: iload #10
    //   431: if_icmpne -> 467
    //   434: goto -> 441
    //   437: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   440: athrow
    //   441: aload #25
    //   443: checkcast java/lang/CharSequence
    //   446: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   449: ifeq -> 467
    //   452: goto -> 459
    //   455: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   458: athrow
    //   459: aconst_null
    //   460: goto -> 513
    //   463: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   466: athrow
    //   467: aload #25
    //   469: astore #28
    //   471: iconst_0
    //   472: istore #29
    //   474: aload #28
    //   476: iload #5
    //   478: invokestatic drop : (Ljava/lang/String;I)Ljava/lang/String;
    //   481: dup
    //   482: ifnull -> 503
    //   485: astore #30
    //   487: aload #8
    //   489: aload #30
    //   491: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   496: checkcast java/lang/String
    //   499: dup
    //   500: ifnonnull -> 513
    //   503: pop
    //   504: aload #25
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   512: athrow
    //   513: nop
    //   514: dup
    //   515: ifnull -> 540
    //   518: astore #31
    //   520: aload #31
    //   522: astore #32
    //   524: iconst_0
    //   525: istore #33
    //   527: aload #14
    //   529: aload #32
    //   531: invokeinterface add : (Ljava/lang/Object;)Z
    //   536: pop
    //   537: goto -> 542
    //   540: pop
    //   541: nop
    //   542: nop
    //   543: goto -> 356
    //   546: nop
    //   547: aload #14
    //   549: checkcast java/util/List
    //   552: nop
    //   553: checkcast java/lang/Iterable
    //   556: new java/lang/StringBuilder
    //   559: dup
    //   560: iload #7
    //   562: invokespecial <init> : (I)V
    //   565: checkcast java/lang/Appendable
    //   568: ldc '\\n'
    //   570: checkcast java/lang/CharSequence
    //   573: aconst_null
    //   574: aconst_null
    //   575: iconst_0
    //   576: aconst_null
    //   577: aconst_null
    //   578: bipush #124
    //   580: aconst_null
    //   581: invokestatic joinTo$default : (Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
    //   584: checkcast java/lang/StringBuilder
    //   587: invokevirtual toString : ()Ljava/lang/String;
    //   590: dup
    //   591: ldc 'mapIndexedNotNull { inde…"\n")\\n        .toString()'
    //   593: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   596: nop
    //   597: areturn
    // Exception table:
    //   from	to	target	type
    //   97	112	112	java/lang/IllegalArgumentException
    //   236	261	261	java/lang/IllegalArgumentException
    //   382	390	393	java/lang/IllegalArgumentException
    //   422	434	437	java/lang/IllegalArgumentException
    //   427	452	455	java/lang/IllegalArgumentException
    //   441	463	463	java/lang/IllegalArgumentException
    //   487	506	509	java/lang/IllegalArgumentException
  }
  
  @IntrinsicConstEvaluation
  @NotNull
  public static final String trimMargin(@NotNull String paramString1, @NotNull String paramString2) {
    long l = b ^ 0x4145FE1E4C43L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "marginPrefix");
    return StringsKt.replaceIndentByMargin(paramString1, "", paramString2);
  }
  
  @IntrinsicConstEvaluation
  @NotNull
  public static final String trimIndent(@NotNull String paramString) {
    long l = b ^ 0x35CA4A497CFEL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.replaceIndent(paramString, "");
  }
  
  @NotNull
  public static final String replaceIndentByMargin(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__IndentKt.b : J
    //   3: ldc2_w 131670154564031
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'newIndent'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_2
    //   21: ldc 'marginPrefix'
    //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   26: aload_2
    //   27: checkcast java/lang/CharSequence
    //   30: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   33: ifne -> 44
    //   36: iconst_1
    //   37: goto -> 45
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: iconst_0
    //   45: istore #5
    //   47: iload #5
    //   49: ifne -> 72
    //   52: iconst_0
    //   53: istore #6
    //   55: ldc 'marginPrefix must be non-blank string.'
    //   57: astore #6
    //   59: new java/lang/IllegalArgumentException
    //   62: dup
    //   63: aload #6
    //   65: invokevirtual toString : ()Ljava/lang/String;
    //   68: invokespecial <init> : (Ljava/lang/String;)V
    //   71: athrow
    //   72: aload_0
    //   73: checkcast java/lang/CharSequence
    //   76: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
    //   79: astore #5
    //   81: aload #5
    //   83: astore #6
    //   85: aload_0
    //   86: invokevirtual length : ()I
    //   89: aload_1
    //   90: invokevirtual length : ()I
    //   93: aload #5
    //   95: invokeinterface size : ()I
    //   100: imul
    //   101: iadd
    //   102: istore #7
    //   104: aload_1
    //   105: invokestatic getIndentFunction$StringsKt__IndentKt : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;
    //   108: astore #8
    //   110: iconst_0
    //   111: istore #9
    //   113: aload #6
    //   115: invokestatic getLastIndex : (Ljava/util/List;)I
    //   118: istore #10
    //   120: aload #6
    //   122: checkcast java/lang/Iterable
    //   125: astore #11
    //   127: iconst_0
    //   128: istore #12
    //   130: aload #11
    //   132: astore #13
    //   134: new java/util/ArrayList
    //   137: dup
    //   138: invokespecial <init> : ()V
    //   141: checkcast java/util/Collection
    //   144: astore #14
    //   146: iconst_0
    //   147: istore #15
    //   149: aload #13
    //   151: astore #16
    //   153: iconst_0
    //   154: istore #17
    //   156: iconst_0
    //   157: istore #18
    //   159: aload #16
    //   161: invokeinterface iterator : ()Ljava/util/Iterator;
    //   166: astore #19
    //   168: aload #19
    //   170: invokeinterface hasNext : ()Z
    //   175: ifeq -> 499
    //   178: aload #19
    //   180: invokeinterface next : ()Ljava/lang/Object;
    //   185: astore #20
    //   187: iload #18
    //   189: iinc #18, 1
    //   192: istore #21
    //   194: iload #21
    //   196: ifge -> 209
    //   199: invokestatic throwIndexOverflow : ()V
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   208: athrow
    //   209: iload #21
    //   211: aload #20
    //   213: astore #22
    //   215: istore #23
    //   217: iconst_0
    //   218: istore #24
    //   220: iload #23
    //   222: aload #22
    //   224: checkcast java/lang/String
    //   227: astore #25
    //   229: istore #26
    //   231: iconst_0
    //   232: istore #27
    //   234: iload #26
    //   236: ifeq -> 253
    //   239: iload #26
    //   241: iload #10
    //   243: if_icmpne -> 279
    //   246: goto -> 253
    //   249: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   252: athrow
    //   253: aload #25
    //   255: checkcast java/lang/CharSequence
    //   258: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
    //   261: ifeq -> 279
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   270: athrow
    //   271: aconst_null
    //   272: goto -> 466
    //   275: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   278: athrow
    //   279: aload #25
    //   281: astore #28
    //   283: iconst_0
    //   284: istore #29
    //   286: aload #28
    //   288: checkcast java/lang/CharSequence
    //   291: astore #30
    //   293: iconst_0
    //   294: istore #31
    //   296: iconst_0
    //   297: istore #32
    //   299: aload #30
    //   301: invokeinterface length : ()I
    //   306: istore #33
    //   308: iload #32
    //   310: iload #33
    //   312: if_icmpge -> 364
    //   315: aload #30
    //   317: iload #32
    //   319: invokeinterface charAt : (I)C
    //   324: istore #34
    //   326: iconst_0
    //   327: istore #35
    //   329: iload #34
    //   331: invokestatic isWhitespace : (C)Z
    //   334: ifne -> 345
    //   337: iconst_1
    //   338: goto -> 346
    //   341: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   344: athrow
    //   345: iconst_0
    //   346: ifeq -> 358
    //   349: iload #32
    //   351: goto -> 365
    //   354: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   357: athrow
    //   358: iinc #32, 1
    //   361: goto -> 308
    //   364: iconst_m1
    //   365: istore #36
    //   367: nop
    //   368: iload #36
    //   370: iconst_m1
    //   371: if_icmpne -> 382
    //   374: aconst_null
    //   375: goto -> 433
    //   378: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   381: athrow
    //   382: aload #28
    //   384: aload_2
    //   385: iload #36
    //   387: iconst_0
    //   388: iconst_4
    //   389: aconst_null
    //   390: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z
    //   393: ifeq -> 432
    //   396: aload #28
    //   398: astore #30
    //   400: iload #36
    //   402: aload_2
    //   403: invokevirtual length : ()I
    //   406: iadd
    //   407: istore #31
    //   409: aload #30
    //   411: ldc 'null cannot be cast to non-null type java.lang.String'
    //   413: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   416: aload #30
    //   418: iload #31
    //   420: invokevirtual substring : (I)Ljava/lang/String;
    //   423: dup
    //   424: ldc 'this as java.lang.String).substring(startIndex)'
    //   426: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   429: goto -> 433
    //   432: aconst_null
    //   433: nop
    //   434: dup
    //   435: ifnull -> 456
    //   438: astore #37
    //   440: aload #8
    //   442: aload #37
    //   444: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   449: checkcast java/lang/String
    //   452: dup
    //   453: ifnonnull -> 466
    //   456: pop
    //   457: aload #25
    //   459: goto -> 466
    //   462: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   465: athrow
    //   466: nop
    //   467: dup
    //   468: ifnull -> 493
    //   471: astore #38
    //   473: aload #38
    //   475: astore #39
    //   477: iconst_0
    //   478: istore #40
    //   480: aload #14
    //   482: aload #39
    //   484: invokeinterface add : (Ljava/lang/Object;)Z
    //   489: pop
    //   490: goto -> 495
    //   493: pop
    //   494: nop
    //   495: nop
    //   496: goto -> 168
    //   499: nop
    //   500: aload #14
    //   502: checkcast java/util/List
    //   505: nop
    //   506: checkcast java/lang/Iterable
    //   509: new java/lang/StringBuilder
    //   512: dup
    //   513: iload #7
    //   515: invokespecial <init> : (I)V
    //   518: checkcast java/lang/Appendable
    //   521: ldc '\\n'
    //   523: checkcast java/lang/CharSequence
    //   526: aconst_null
    //   527: aconst_null
    //   528: iconst_0
    //   529: aconst_null
    //   530: aconst_null
    //   531: bipush #124
    //   533: aconst_null
    //   534: invokestatic joinTo$default : (Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/Appendable;
    //   537: checkcast java/lang/StringBuilder
    //   540: invokevirtual toString : ()Ljava/lang/String;
    //   543: dup
    //   544: ldc 'mapIndexedNotNull { inde…"\n")\\n        .toString()'
    //   546: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   549: nop
    //   550: areturn
    // Exception table:
    //   from	to	target	type
    //   8	40	40	java/lang/IllegalArgumentException
    //   194	202	205	java/lang/IllegalArgumentException
    //   234	246	249	java/lang/IllegalArgumentException
    //   239	264	267	java/lang/IllegalArgumentException
    //   253	275	275	java/lang/IllegalArgumentException
    //   329	341	341	java/lang/IllegalArgumentException
    //   346	354	354	java/lang/IllegalArgumentException
    //   367	378	378	java/lang/IllegalArgumentException
    //   440	459	462	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__IndentKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
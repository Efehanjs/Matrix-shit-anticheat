package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Options$Companion {
  private static final long a = o3.a(-3407288238598541251L, -7841710365839995505L, MethodHandles.lookup().lookupClass()).a(174847124476737L);
  
  @NotNull
  public final Options of(@NotNull ByteString... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/Options$Companion.a : J
    //   3: ldc2_w 28165924343676
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'byteStrings'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: astore #4
    //   17: iconst_0
    //   18: istore #5
    //   20: aload #4
    //   22: arraylength
    //   23: ifne -> 34
    //   26: iconst_1
    //   27: goto -> 35
    //   30: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   33: athrow
    //   34: iconst_0
    //   35: ifeq -> 68
    //   38: new me/rerere/matrix/thirdparty/okio/Options
    //   41: dup
    //   42: iconst_0
    //   43: anewarray me/rerere/matrix/thirdparty/okio/ByteString
    //   46: iconst_2
    //   47: newarray int
    //   49: astore #4
    //   51: aload #4
    //   53: iconst_0
    //   54: iconst_0
    //   55: iastore
    //   56: aload #4
    //   58: iconst_1
    //   59: iconst_m1
    //   60: iastore
    //   61: aload #4
    //   63: aconst_null
    //   64: invokespecial <init> : ([Lme/rerere/matrix/thirdparty/okio/ByteString;[ILme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   67: areturn
    //   68: aload_1
    //   69: invokestatic toMutableList : ([Ljava/lang/Object;)Ljava/util/List;
    //   72: astore #4
    //   74: aload #4
    //   76: invokestatic sort : (Ljava/util/List;)V
    //   79: aload_1
    //   80: astore #7
    //   82: iconst_0
    //   83: istore #8
    //   85: aload #7
    //   87: astore #9
    //   89: new java/util/ArrayList
    //   92: dup
    //   93: aload #7
    //   95: arraylength
    //   96: invokespecial <init> : (I)V
    //   99: checkcast java/util/Collection
    //   102: astore #10
    //   104: iconst_0
    //   105: istore #11
    //   107: aload #9
    //   109: astore #12
    //   111: aload #12
    //   113: arraylength
    //   114: istore #13
    //   116: iconst_0
    //   117: istore #14
    //   119: iload #14
    //   121: iload #13
    //   123: if_icmpge -> 166
    //   126: aload #12
    //   128: iload #14
    //   130: aaload
    //   131: astore #15
    //   133: aload #10
    //   135: aload #15
    //   137: astore #16
    //   139: astore #18
    //   141: iconst_0
    //   142: istore #17
    //   144: iconst_m1
    //   145: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   148: astore #19
    //   150: aload #18
    //   152: aload #19
    //   154: invokeinterface add : (Ljava/lang/Object;)Z
    //   159: pop
    //   160: iinc #14, 1
    //   163: goto -> 119
    //   166: aload #10
    //   168: checkcast java/util/List
    //   171: nop
    //   172: checkcast java/util/Collection
    //   175: astore #7
    //   177: nop
    //   178: iconst_0
    //   179: istore #8
    //   181: aload #7
    //   183: astore #9
    //   185: aload #9
    //   187: iconst_0
    //   188: anewarray java/lang/Integer
    //   191: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   196: dup
    //   197: ifnonnull -> 214
    //   200: new java/lang/NullPointerException
    //   203: dup
    //   204: ldc 'null cannot be cast to non-null type kotlin.Array<T>'
    //   206: invokespecial <init> : (Ljava/lang/String;)V
    //   209: athrow
    //   210: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   213: athrow
    //   214: checkcast [Ljava/lang/Integer;
    //   217: astore #6
    //   219: aload #6
    //   221: aload #6
    //   223: arraylength
    //   224: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   227: invokestatic mutableListOf : ([Ljava/lang/Object;)Ljava/util/List;
    //   230: astore #5
    //   232: aload_1
    //   233: astore #6
    //   235: iconst_0
    //   236: istore #7
    //   238: iconst_0
    //   239: istore #8
    //   241: aload #6
    //   243: astore #9
    //   245: aload #9
    //   247: arraylength
    //   248: istore #10
    //   250: iconst_0
    //   251: istore #11
    //   253: iload #11
    //   255: iload #10
    //   257: if_icmpge -> 320
    //   260: aload #9
    //   262: iload #11
    //   264: aaload
    //   265: astore #12
    //   267: iload #8
    //   269: iinc #8, 1
    //   272: aload #12
    //   274: astore #13
    //   276: istore #14
    //   278: iconst_0
    //   279: istore #15
    //   281: aload #4
    //   283: aload #13
    //   285: checkcast java/lang/Comparable
    //   288: iconst_0
    //   289: iconst_0
    //   290: bipush #6
    //   292: aconst_null
    //   293: invokestatic binarySearch$default : (Ljava/util/List;Ljava/lang/Comparable;IIILjava/lang/Object;)I
    //   296: istore #16
    //   298: aload #5
    //   300: iload #16
    //   302: iload #14
    //   304: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   307: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
    //   312: pop
    //   313: nop
    //   314: iinc #11, 1
    //   317: goto -> 253
    //   320: nop
    //   321: aload #4
    //   323: iconst_0
    //   324: invokeinterface get : (I)Ljava/lang/Object;
    //   329: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   332: invokevirtual size : ()I
    //   335: ifle -> 346
    //   338: iconst_1
    //   339: goto -> 347
    //   342: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   345: athrow
    //   346: iconst_0
    //   347: istore #6
    //   349: iconst_0
    //   350: istore #7
    //   352: iconst_0
    //   353: istore #8
    //   355: iload #6
    //   357: ifne -> 383
    //   360: iconst_0
    //   361: istore #9
    //   363: ldc 'the empty byte string is not a supported option'
    //   365: astore #8
    //   367: new java/lang/IllegalArgumentException
    //   370: dup
    //   371: aload #8
    //   373: invokevirtual toString : ()Ljava/lang/String;
    //   376: invokespecial <init> : (Ljava/lang/String;)V
    //   379: checkcast java/lang/Throwable
    //   382: athrow
    //   383: iconst_0
    //   384: istore #6
    //   386: iload #6
    //   388: aload #4
    //   390: invokeinterface size : ()I
    //   395: if_icmpge -> 610
    //   398: aload #4
    //   400: iload #6
    //   402: invokeinterface get : (I)Ljava/lang/Object;
    //   407: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   410: astore #7
    //   412: iload #6
    //   414: iconst_1
    //   415: iadd
    //   416: istore #8
    //   418: iload #8
    //   420: aload #4
    //   422: invokeinterface size : ()I
    //   427: if_icmpge -> 597
    //   430: aload #4
    //   432: iload #8
    //   434: invokeinterface get : (I)Ljava/lang/Object;
    //   439: checkcast me/rerere/matrix/thirdparty/okio/ByteString
    //   442: astore #9
    //   444: aload #9
    //   446: aload #7
    //   448: invokevirtual startsWith : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Z
    //   451: ifne -> 461
    //   454: goto -> 597
    //   457: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   460: athrow
    //   461: aload #9
    //   463: invokevirtual size : ()I
    //   466: aload #7
    //   468: invokevirtual size : ()I
    //   471: if_icmpeq -> 482
    //   474: iconst_1
    //   475: goto -> 483
    //   478: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   481: athrow
    //   482: iconst_0
    //   483: istore #10
    //   485: iconst_0
    //   486: istore #11
    //   488: iconst_0
    //   489: istore #12
    //   491: iload #10
    //   493: ifne -> 524
    //   496: iconst_0
    //   497: istore #13
    //   499: ldc 'duplicate option: '
    //   501: aload #9
    //   503: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   506: astore #12
    //   508: new java/lang/IllegalArgumentException
    //   511: dup
    //   512: aload #12
    //   514: invokevirtual toString : ()Ljava/lang/String;
    //   517: invokespecial <init> : (Ljava/lang/String;)V
    //   520: checkcast java/lang/Throwable
    //   523: athrow
    //   524: aload #5
    //   526: iload #8
    //   528: invokeinterface get : (I)Ljava/lang/Object;
    //   533: checkcast java/lang/Number
    //   536: invokevirtual intValue : ()I
    //   539: aload #5
    //   541: iload #6
    //   543: invokeinterface get : (I)Ljava/lang/Object;
    //   548: checkcast java/lang/Number
    //   551: invokevirtual intValue : ()I
    //   554: if_icmple -> 584
    //   557: aload #4
    //   559: iload #8
    //   561: invokeinterface remove : (I)Ljava/lang/Object;
    //   566: pop
    //   567: aload #5
    //   569: iload #8
    //   571: invokeinterface remove : (I)Ljava/lang/Object;
    //   576: pop
    //   577: goto -> 418
    //   580: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   583: athrow
    //   584: iload #8
    //   586: istore #10
    //   588: iload #10
    //   590: iconst_1
    //   591: iadd
    //   592: istore #8
    //   594: goto -> 418
    //   597: iload #6
    //   599: istore #9
    //   601: iload #9
    //   603: iconst_1
    //   604: iadd
    //   605: istore #6
    //   607: goto -> 386
    //   610: new me/rerere/matrix/thirdparty/okio/Buffer
    //   613: dup
    //   614: invokespecial <init> : ()V
    //   617: astore #7
    //   619: aload_0
    //   620: lconst_0
    //   621: aload #7
    //   623: iconst_0
    //   624: aload #4
    //   626: iconst_0
    //   627: iconst_0
    //   628: aload #5
    //   630: bipush #53
    //   632: aconst_null
    //   633: invokestatic buildTrieRecursive$default : (Lme/rerere/matrix/thirdparty/okio/Options$Companion;JLme/rerere/matrix/thirdparty/okio/Buffer;ILjava/util/List;IILjava/util/List;ILjava/lang/Object;)V
    //   636: aload_0
    //   637: aload #7
    //   639: invokespecial getIntCount : (Lme/rerere/matrix/thirdparty/okio/Buffer;)J
    //   642: l2i
    //   643: newarray int
    //   645: astore #8
    //   647: iconst_0
    //   648: istore #9
    //   650: aload #7
    //   652: invokevirtual exhausted : ()Z
    //   655: ifne -> 681
    //   658: aload #8
    //   660: iload #9
    //   662: istore #10
    //   664: iload #10
    //   666: iconst_1
    //   667: iadd
    //   668: istore #9
    //   670: iload #10
    //   672: aload #7
    //   674: invokevirtual readInt : ()I
    //   677: iastore
    //   678: goto -> 650
    //   681: new me/rerere/matrix/thirdparty/okio/Options
    //   684: dup
    //   685: aload_1
    //   686: astore #10
    //   688: iconst_0
    //   689: istore #11
    //   691: aload #10
    //   693: aload #10
    //   695: arraylength
    //   696: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   699: dup
    //   700: ldc 'java.util.Arrays.copyOf(this, size)'
    //   702: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   705: checkcast [Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   708: aload #8
    //   710: aconst_null
    //   711: invokespecial <init> : ([Lme/rerere/matrix/thirdparty/okio/ByteString;[ILme/rerere/matrix/thirdparty/kotlin/jvm/internal/DefaultConstructorMarker;)V
    //   714: areturn
    // Exception table:
    //   from	to	target	type
    //   20	30	30	java/lang/IllegalArgumentException
    //   185	210	210	java/lang/IllegalArgumentException
    //   320	342	342	java/lang/IllegalArgumentException
    //   444	457	457	java/lang/IllegalArgumentException
    //   461	478	478	java/lang/IllegalArgumentException
    //   524	580	580	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Options$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
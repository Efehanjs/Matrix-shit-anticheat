package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class di {
  private static final long a = o3.a(-7693031626492065817L, -8897956209817337809L, MethodHandles.lookup().lookupClass()).a(60842888270002L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public static final void b(byte paramByte, long paramLong) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #56
    //   4: lshl
    //   5: lload_1
    //   6: bipush #8
    //   8: lshl
    //   9: bipush #8
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/di.a : J
    //   16: lxor
    //   17: lstore_3
    //   18: lload_3
    //   19: dup2
    //   20: ldc2_w 80156733348369
    //   23: lxor
    //   24: lstore #5
    //   26: dup2
    //   27: ldc2_w 87137994677698
    //   30: lxor
    //   31: dup2
    //   32: bipush #32
    //   34: lushr
    //   35: l2i
    //   36: istore #7
    //   38: dup2
    //   39: bipush #32
    //   41: lshl
    //   42: bipush #32
    //   44: lushr
    //   45: l2i
    //   46: istore #8
    //   48: pop2
    //   49: pop2
    //   50: invokestatic r : ()I
    //   53: istore #9
    //   55: iload #7
    //   57: iload #8
    //   59: invokestatic a : (II)[Ljava/lang/Object;
    //   62: ldc2_w -7624195793931318071
    //   65: lload_3
    //   66: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   69: swap
    //   70: aconst_null
    //   71: swap
    //   72: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   75: checkcast java/lang/Boolean
    //   78: invokevirtual booleanValue : ()Z
    //   81: goto -> 88
    //   84: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   87: athrow
    //   88: ifne -> 96
    //   91: return
    //   92: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   95: athrow
    //   96: lload #5
    //   98: invokestatic a : (J)[Ljava/lang/Object;
    //   101: ldc2_w -7612711525663258955
    //   104: lload_3
    //   105: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   108: swap
    //   109: aconst_null
    //   110: swap
    //   111: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   114: checkcast java/lang/Object
    //   117: goto -> 124
    //   120: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   123: athrow
    //   124: astore #10
    //   126: aload #10
    //   128: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   131: ldc2_w -7618062833168821157
    //   134: lload_3
    //   135: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   138: swap
    //   139: aconst_null
    //   140: swap
    //   141: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   144: checkcast java/lang/Boolean
    //   147: invokevirtual booleanValue : ()Z
    //   150: goto -> 157
    //   153: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   156: athrow
    //   157: ifeq -> 168
    //   160: aconst_null
    //   161: goto -> 170
    //   164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   167: athrow
    //   168: aload #10
    //   170: checkcast java/util/List
    //   173: iload #9
    //   175: ifeq -> 199
    //   178: dup
    //   179: ifnull -> 1297
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   188: athrow
    //   189: checkcast java/lang/Iterable
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   198: athrow
    //   199: astore #11
    //   201: iconst_0
    //   202: istore #12
    //   204: aload #11
    //   206: astore #13
    //   208: new java/util/ArrayList
    //   211: dup
    //   212: invokespecial <init> : ()V
    //   215: checkcast java/util/Collection
    //   218: astore #14
    //   220: iconst_0
    //   221: istore #15
    //   223: aload #13
    //   225: invokestatic b : ()[Ljava/lang/Object;
    //   228: ldc2_w -7616066509518852108
    //   231: lload_3
    //   232: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   235: dup_x2
    //   236: pop
    //   237: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   240: checkcast java/util/Iterator
    //   243: goto -> 250
    //   246: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   249: athrow
    //   250: astore #16
    //   252: aload #16
    //   254: invokestatic b : ()[Ljava/lang/Object;
    //   257: ldc2_w -7611929308297230210
    //   260: lload_3
    //   261: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   264: dup_x2
    //   265: pop
    //   266: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   269: checkcast java/lang/Boolean
    //   272: invokevirtual booleanValue : ()Z
    //   275: goto -> 282
    //   278: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   281: athrow
    //   282: ifeq -> 468
    //   285: aload #16
    //   287: invokestatic b : ()[Ljava/lang/Object;
    //   290: ldc2_w -7616255319972435950
    //   293: lload_3
    //   294: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   297: dup_x2
    //   298: pop
    //   299: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   302: checkcast java/lang/Object
    //   305: goto -> 312
    //   308: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   311: athrow
    //   312: astore #17
    //   314: aload #17
    //   316: checkcast me/rerere/matrix/internal/cc
    //   319: astore #18
    //   321: iconst_0
    //   322: istore #19
    //   324: aload #18
    //   326: invokestatic b : ()[Ljava/lang/Object;
    //   329: ldc2_w -7618987529115740796
    //   332: lload_3
    //   333: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   336: dup_x2
    //   337: pop
    //   338: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   341: goto -> 348
    //   344: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   347: athrow
    //   348: checkcast java/lang/CharSequence
    //   351: sipush #9642
    //   354: ldc2_w 3673070743229736079
    //   357: lload_3
    //   358: lxor
    //   359: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   364: checkcast java/lang/CharSequence
    //   367: iconst_0
    //   368: iconst_2
    //   369: aconst_null
    //   370: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;ZILjava/lang/Object;)[Ljava/lang/Object;
    //   373: ldc2_w -7616877716462103282
    //   376: lload_3
    //   377: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   380: swap
    //   381: aconst_null
    //   382: swap
    //   383: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   386: checkcast java/lang/Boolean
    //   389: invokevirtual booleanValue : ()Z
    //   392: goto -> 399
    //   395: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   398: athrow
    //   399: iload #9
    //   401: iload_0
    //   402: iflt -> 410
    //   405: ifeq -> 484
    //   408: iload #9
    //   410: ifeq -> 462
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   419: athrow
    //   420: ifeq -> 252
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   429: athrow
    //   430: aload #14
    //   432: aload #17
    //   434: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   437: ldc2_w -7614695616050518790
    //   440: lload_3
    //   441: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   444: dup_x2
    //   445: pop
    //   446: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   449: checkcast java/lang/Boolean
    //   452: invokevirtual booleanValue : ()Z
    //   455: goto -> 462
    //   458: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   461: athrow
    //   462: pop
    //   463: iload #9
    //   465: ifne -> 252
    //   468: aload #14
    //   470: checkcast java/util/List
    //   473: nop
    //   474: checkcast java/lang/Iterable
    //   477: astore #11
    //   479: iload_0
    //   480: iflt -> 486
    //   483: iconst_0
    //   484: istore #12
    //   486: aload #11
    //   488: invokestatic b : ()[Ljava/lang/Object;
    //   491: ldc2_w -7616066509518852108
    //   494: lload_3
    //   495: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   498: dup_x2
    //   499: pop
    //   500: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   503: checkcast java/util/Iterator
    //   506: goto -> 513
    //   509: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   512: athrow
    //   513: astore #13
    //   515: aload #13
    //   517: invokestatic b : ()[Ljava/lang/Object;
    //   520: ldc2_w -7611929308297230210
    //   523: lload_3
    //   524: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   527: dup_x2
    //   528: pop
    //   529: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   532: checkcast java/lang/Boolean
    //   535: invokevirtual booleanValue : ()Z
    //   538: goto -> 545
    //   541: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   544: athrow
    //   545: ifeq -> 1289
    //   548: aload #13
    //   550: invokestatic b : ()[Ljava/lang/Object;
    //   553: ldc2_w -7616255319972435950
    //   556: lload_3
    //   557: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   560: dup_x2
    //   561: pop
    //   562: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   565: checkcast java/lang/Object
    //   568: goto -> 575
    //   571: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   574: athrow
    //   575: astore #14
    //   577: aload #14
    //   579: checkcast me/rerere/matrix/internal/cc
    //   582: astore #15
    //   584: iconst_0
    //   585: istore #16
    //   587: nop
    //   588: sipush #2770
    //   591: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   594: pop
    //   595: ldc2_w 8794257959545015295
    //   598: lload_3
    //   599: lxor
    //   600: iconst_0
    //   601: istore #17
    //   603: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   608: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   611: swap
    //   612: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   615: ldc2_w -7618540201067920489
    //   618: lload_3
    //   619: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   622: dup_x2
    //   623: pop
    //   624: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   627: pop
    //   628: goto -> 635
    //   631: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   634: athrow
    //   635: sipush #2395
    //   638: ldc2_w 7620803308428626034
    //   641: lload_3
    //   642: lxor
    //   643: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   648: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   651: swap
    //   652: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   655: ldc2_w -7618540201067920489
    //   658: lload_3
    //   659: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   662: dup_x2
    //   663: pop
    //   664: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   667: pop
    //   668: goto -> 675
    //   671: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   674: athrow
    //   675: sipush #4315
    //   678: ldc2_w 8153014599745147376
    //   681: lload_3
    //   682: lxor
    //   683: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   688: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   691: swap
    //   692: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   695: ldc2_w -7618540201067920489
    //   698: lload_3
    //   699: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   702: dup_x2
    //   703: pop
    //   704: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   707: pop
    //   708: goto -> 715
    //   711: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   714: athrow
    //   715: sipush #31214
    //   718: ldc2_w 4452532641068906692
    //   721: lload_3
    //   722: lxor
    //   723: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   728: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   731: swap
    //   732: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   735: ldc2_w -7618540201067920489
    //   738: lload_3
    //   739: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   742: dup_x2
    //   743: pop
    //   744: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   747: pop
    //   748: goto -> 755
    //   751: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   754: athrow
    //   755: ldc2_w 3000
    //   758: invokestatic a : (J)[Ljava/lang/Object;
    //   761: ldc2_w -7619299987186932319
    //   764: lload_3
    //   765: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   768: swap
    //   769: aconst_null
    //   770: swap
    //   771: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   774: pop
    //   775: goto -> 782
    //   778: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   781: athrow
    //   782: invokestatic b : ()[Ljava/lang/Object;
    //   785: ldc2_w -7619764529730592516
    //   788: lload_3
    //   789: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   792: swap
    //   793: aconst_null
    //   794: swap
    //   795: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   798: goto -> 805
    //   801: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   804: athrow
    //   805: sipush #13235
    //   808: ldc2_w 1732470654052446868
    //   811: lload_3
    //   812: lxor
    //   813: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   818: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   821: ldc2_w -7614021820503284648
    //   824: lload_3
    //   825: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   828: dup_x2
    //   829: pop
    //   830: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   833: goto -> 840
    //   836: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   839: athrow
    //   840: pop
    //   841: invokestatic b : ()[Ljava/lang/Object;
    //   844: ldc2_w -7619764529730592516
    //   847: lload_3
    //   848: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   851: swap
    //   852: aconst_null
    //   853: swap
    //   854: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   857: goto -> 864
    //   860: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   863: athrow
    //   864: new java/lang/StringBuilder
    //   867: dup
    //   868: invokespecial <init> : ()V
    //   871: sipush #13109
    //   874: ldc2_w 5785986982634304025
    //   877: lload_3
    //   878: lxor
    //   879: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   884: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   887: ldc2_w -7619941090181922550
    //   890: lload_3
    //   891: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   894: dup_x2
    //   895: pop
    //   896: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   899: goto -> 906
    //   902: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   905: athrow
    //   906: aload #15
    //   908: invokestatic b : ()[Ljava/lang/Object;
    //   911: ldc2_w -7616192635948788919
    //   914: lload_3
    //   915: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   918: dup_x2
    //   919: pop
    //   920: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   923: goto -> 930
    //   926: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   929: athrow
    //   930: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   933: ldc2_w -7619941090181922550
    //   936: lload_3
    //   937: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   940: dup_x2
    //   941: pop
    //   942: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   945: goto -> 952
    //   948: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   951: athrow
    //   952: invokestatic b : ()[Ljava/lang/Object;
    //   955: ldc2_w -7623876415984870308
    //   958: lload_3
    //   959: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   962: dup_x2
    //   963: pop
    //   964: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   967: goto -> 974
    //   970: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   973: athrow
    //   974: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   977: ldc2_w -7614021820503284648
    //   980: lload_3
    //   981: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   984: dup_x2
    //   985: pop
    //   986: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   989: goto -> 996
    //   992: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   995: athrow
    //   996: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   999: ldc2_w -7611911012444537513
    //   1002: lload_3
    //   1003: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1006: swap
    //   1007: aconst_null
    //   1008: swap
    //   1009: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1012: checkcast java/lang/Object
    //   1015: goto -> 1022
    //   1018: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1021: athrow
    //   1022: astore #17
    //   1024: iload #9
    //   1026: ifeq -> 1294
    //   1029: goto -> 1095
    //   1032: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1035: athrow
    //   1036: astore #18
    //   1038: getstatic me/rerere/matrix/thirdparty/kotlin/Result.Companion : Lme/rerere/matrix/thirdparty/kotlin/Result$Companion;
    //   1041: pop
    //   1042: aload #18
    //   1044: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1047: ldc2_w -7623493678083302410
    //   1050: lload_3
    //   1051: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1054: swap
    //   1055: aconst_null
    //   1056: swap
    //   1057: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1060: goto -> 1067
    //   1063: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1066: athrow
    //   1067: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1070: ldc2_w -7611911012444537513
    //   1073: lload_3
    //   1074: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1077: swap
    //   1078: aconst_null
    //   1079: swap
    //   1080: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1083: checkcast java/lang/Object
    //   1086: goto -> 1093
    //   1089: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1092: athrow
    //   1093: astore #17
    //   1095: aload #17
    //   1097: astore #17
    //   1099: aload #17
    //   1101: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1104: ldc2_w -7618429108205648738
    //   1107: lload_3
    //   1108: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1111: swap
    //   1112: aconst_null
    //   1113: swap
    //   1114: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1117: checkcast java/lang/Throwable
    //   1120: goto -> 1127
    //   1123: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1126: athrow
    //   1127: dup
    //   1128: ifnull -> 1281
    //   1131: astore #18
    //   1133: aload #18
    //   1135: astore #19
    //   1137: iconst_0
    //   1138: istore #20
    //   1140: new java/lang/StringBuilder
    //   1143: dup
    //   1144: invokespecial <init> : ()V
    //   1147: sipush #2152
    //   1150: ldc2_w 5481748093428468032
    //   1153: lload_3
    //   1154: lxor
    //   1155: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   1160: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1163: ldc2_w -7619941090181922550
    //   1166: lload_3
    //   1167: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1170: dup_x2
    //   1171: pop
    //   1172: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1175: goto -> 1182
    //   1178: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1181: athrow
    //   1182: aload #19
    //   1184: invokestatic b : ()[Ljava/lang/Object;
    //   1187: ldc2_w -7614553525718690411
    //   1190: lload_3
    //   1191: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1194: dup_x2
    //   1195: pop
    //   1196: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1199: goto -> 1206
    //   1202: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1205: athrow
    //   1206: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1209: ldc2_w -7619941090181922550
    //   1212: lload_3
    //   1213: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1216: dup_x2
    //   1217: pop
    //   1218: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1221: goto -> 1228
    //   1224: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1227: athrow
    //   1228: invokestatic b : ()[Ljava/lang/Object;
    //   1231: ldc2_w -7623876415984870308
    //   1234: lload_3
    //   1235: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1238: dup_x2
    //   1239: pop
    //   1240: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1243: goto -> 1250
    //   1246: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1249: athrow
    //   1250: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1253: swap
    //   1254: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1257: ldc2_w -7618540201067920489
    //   1260: lload_3
    //   1261: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1264: dup_x2
    //   1265: pop
    //   1266: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1269: pop
    //   1270: goto -> 1277
    //   1273: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1276: athrow
    //   1277: nop
    //   1278: goto -> 1282
    //   1281: pop
    //   1282: nop
    //   1283: nop
    //   1284: iload #9
    //   1286: ifne -> 515
    //   1289: iload_0
    //   1290: iflt -> 577
    //   1293: nop
    //   1294: goto -> 1299
    //   1297: pop
    //   1298: nop
    //   1299: return
    // Exception table:
    //   from	to	target	type
    //   55	92	92	java/lang/Throwable
    //   72	81	84	java/lang/reflect/InvocationTargetException
    //   111	117	120	java/lang/reflect/InvocationTargetException
    //   126	164	164	java/lang/Throwable
    //   141	150	153	java/lang/reflect/InvocationTargetException
    //   170	182	185	java/lang/Throwable
    //   178	192	195	java/lang/Throwable
    //   237	243	246	java/lang/reflect/InvocationTargetException
    //   266	275	278	java/lang/reflect/InvocationTargetException
    //   299	305	308	java/lang/reflect/InvocationTargetException
    //   324	413	416	java/lang/Throwable
    //   338	341	344	java/lang/reflect/InvocationTargetException
    //   383	392	395	java/lang/reflect/InvocationTargetException
    //   408	423	426	java/lang/Throwable
    //   446	455	458	java/lang/reflect/InvocationTargetException
    //   500	506	509	java/lang/reflect/InvocationTargetException
    //   529	538	541	java/lang/reflect/InvocationTargetException
    //   562	568	571	java/lang/reflect/InvocationTargetException
    //   587	1024	1036	java/lang/Throwable
    //   624	628	631	java/lang/reflect/InvocationTargetException
    //   664	668	671	java/lang/reflect/InvocationTargetException
    //   704	708	711	java/lang/reflect/InvocationTargetException
    //   744	748	751	java/lang/reflect/InvocationTargetException
    //   771	775	778	java/lang/reflect/InvocationTargetException
    //   795	798	801	java/lang/reflect/InvocationTargetException
    //   830	833	836	java/lang/reflect/InvocationTargetException
    //   854	857	860	java/lang/reflect/InvocationTargetException
    //   896	899	902	java/lang/reflect/InvocationTargetException
    //   920	923	926	java/lang/reflect/InvocationTargetException
    //   942	945	948	java/lang/reflect/InvocationTargetException
    //   964	967	970	java/lang/reflect/InvocationTargetException
    //   986	989	992	java/lang/reflect/InvocationTargetException
    //   1009	1015	1018	java/lang/reflect/InvocationTargetException
    //   1024	1032	1032	java/lang/Throwable
    //   1057	1060	1063	java/lang/reflect/InvocationTargetException
    //   1080	1086	1089	java/lang/reflect/InvocationTargetException
    //   1114	1120	1123	java/lang/reflect/InvocationTargetException
    //   1172	1175	1178	java/lang/reflect/InvocationTargetException
    //   1196	1199	1202	java/lang/reflect/InvocationTargetException
    //   1218	1221	1224	java/lang/reflect/InvocationTargetException
    //   1240	1243	1246	java/lang/reflect/InvocationTargetException
    //   1266	1270	1273	java/lang/reflect/InvocationTargetException
  }
  
  static {
    long l = a ^ 0xA6E93BB073FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[15];
    boolean bool = false;
    String str;
    int i = (str = ".[(m}\0005m\033Â]Uêº/`9~ÿ,µ­R\016ú\001]º²A!\023ç\033Ó!è\033ú#pSj8Ôá³§a?& W``SÔ§Ôn={¯ëûÄ+\024©¦÷Îã¬\001\021\031?´aYrT#+n^\020 j\032Ìp|¬\020ø\022\004æ\024bRÝD¥W¶REX\030ùä\000Á\037ïÛÝÐ·\034òWºêèwúºb\n?&¡ðDXF\004,5¯«aóO¼C\004#}!¼;\0239V\013Å>ù÷Cz±h4ä=U­NÂÄSØx¶&\fÎ¸ìz0MgÅG\037o³hÇ>8I«duJÊÛ #\000_ñ¿\016\021öü\b\0009ß´KûV\005._?x-_ª]T\035.\026Ï\021¥óé¸ÀElî5\fÌ¡<!8°¹_¨úÎú»c\b¥zÊéð\fó·\032¼.9=kç\035¹ÊI=\027uqùpí\023ªã½£\000¸Wb©,Äÿ\027M~³dF9Ê\001Fe(^;HÞ¸\016íøÍd·¯Õ\tã¿«`«\bØX#:\0062\005òvZ\013÷éô$á[+\034\024jÃzw÷ÂË¿eO$? r#_\r¾æuP»æ»+o\013uWÜ?¼³îËà²ãaêFuÜ¡îî`OèVKF>?x¿ÿi÷\024\t\021ÚÚóL%~&Ì6¶×\036\002ù9ÁãÞrv(*5\tÂË3_p\033{amzp¦LøÓYlå\027ì\022\"\004f1.\002¿ý7YîÕøÌ²\\¸\004F\000Î0®UNUài>Û7ãáZRZ@^õ}½téØñÈÝè[I«õ0@ò\007\004®1©ó\024·.Û`ø\032ý©Y¡\026`Vº\031\016Mxö\006\007µ\016ß÷Îxv\022\" cK®X\n5·âæ¨sÙó\002PfV¿ø\031.Ã>tàJ\006,pc\021\005öJ JzµÓ'ç\bÐå¸ÒÔ××§×zmV0²-\007¸Ö¤ä#q\034Ù\004ì  îÞx¹e\006\021Ôú]îø\n*Ä>ì¸¾L\025\024jþî?\002ÕMõô-\rÔ`õ\021\0237Q¹ß9ët®\021#\004¨ÜòÁ6æ\t\016mìQH½¡zªzå±Ó-×q\003'þ/7xAèºm9\004®VU<í&í\004dôDÛøÐöcÜ\007^\002Ï6\\\002\000FcPiÈIÓº\tªV\020/\037ÌY-m\020k\016÷¢èó\013º\016­ôH").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x175E;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/di", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/internal/di'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\di.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
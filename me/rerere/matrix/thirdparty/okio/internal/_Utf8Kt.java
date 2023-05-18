package me.rerere.matrix.thirdparty.okio.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class _Utf8Kt {
  private static final long a = o3.a(-7265959789770771334L, 8551343321137191320L, MethodHandles.lookup().lookupClass()).a(181404767610764L);
  
  @NotNull
  public static final String commonToUtf8String(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_Utf8Kt.a : J
    //   3: ldc2_w 139484903775474
    //   6: lxor
    //   7: lstore_3
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iload_1
    //   15: iflt -> 43
    //   18: iload_2
    //   19: aload_0
    //   20: arraylength
    //   21: if_icmpgt -> 43
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   30: athrow
    //   31: iload_1
    //   32: iload_2
    //   33: if_icmple -> 93
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   42: athrow
    //   43: new java/lang/ArrayIndexOutOfBoundsException
    //   46: dup
    //   47: new java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial <init> : ()V
    //   54: ldc 'size='
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: aload_0
    //   60: arraylength
    //   61: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   64: ldc ' beginIndex='
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: iload_1
    //   70: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   73: ldc ' endIndex='
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: iload_2
    //   79: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   82: invokevirtual toString : ()Ljava/lang/String;
    //   85: invokespecial <init> : (Ljava/lang/String;)V
    //   88: athrow
    //   89: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   92: athrow
    //   93: iload_2
    //   94: iload_1
    //   95: isub
    //   96: newarray char
    //   98: astore #5
    //   100: iconst_0
    //   101: istore #6
    //   103: aload_0
    //   104: astore #7
    //   106: iconst_0
    //   107: istore #8
    //   109: iload_1
    //   110: istore #9
    //   112: iload #9
    //   114: iload_2
    //   115: if_icmpge -> 2473
    //   118: aload #7
    //   120: iload #9
    //   122: baload
    //   123: istore #10
    //   125: nop
    //   126: iload #10
    //   128: iflt -> 233
    //   131: iload #10
    //   133: i2c
    //   134: istore #11
    //   136: iconst_0
    //   137: istore #12
    //   139: aload #5
    //   141: iload #6
    //   143: istore #13
    //   145: iload #13
    //   147: iconst_1
    //   148: iadd
    //   149: istore #6
    //   151: iload #13
    //   153: iload #11
    //   155: castore
    //   156: nop
    //   157: iload #9
    //   159: istore #14
    //   161: iload #14
    //   163: iconst_1
    //   164: iadd
    //   165: istore #9
    //   167: iload #14
    //   169: pop
    //   170: iload #9
    //   172: iload_2
    //   173: if_icmpge -> 112
    //   176: aload #7
    //   178: iload #9
    //   180: baload
    //   181: iflt -> 112
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   190: athrow
    //   191: aload #7
    //   193: iload #9
    //   195: istore #14
    //   197: iload #14
    //   199: iconst_1
    //   200: iadd
    //   201: istore #9
    //   203: iload #14
    //   205: baload
    //   206: i2c
    //   207: istore #11
    //   209: iconst_0
    //   210: istore #12
    //   212: aload #5
    //   214: iload #6
    //   216: istore #13
    //   218: iload #13
    //   220: iconst_1
    //   221: iadd
    //   222: istore #6
    //   224: iload #13
    //   226: iload #11
    //   228: castore
    //   229: nop
    //   230: goto -> 170
    //   233: iload #10
    //   235: istore #14
    //   237: iconst_5
    //   238: istore #15
    //   240: iconst_0
    //   241: istore #16
    //   243: iload #14
    //   245: iload #15
    //   247: ishr
    //   248: bipush #-2
    //   250: if_icmpne -> 533
    //   253: iload #9
    //   255: aload #7
    //   257: astore #14
    //   259: iconst_0
    //   260: istore #15
    //   262: iload_2
    //   263: iload #9
    //   265: iconst_1
    //   266: iadd
    //   267: if_icmpgt -> 316
    //   270: ldc 65533
    //   272: istore #16
    //   274: istore #17
    //   276: iconst_0
    //   277: istore #18
    //   279: iload #16
    //   281: i2c
    //   282: istore #11
    //   284: iconst_0
    //   285: istore #12
    //   287: aload #5
    //   289: iload #6
    //   291: istore #13
    //   293: iload #13
    //   295: iconst_1
    //   296: iadd
    //   297: istore #6
    //   299: iload #13
    //   301: iload #11
    //   303: castore
    //   304: nop
    //   305: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   308: astore #19
    //   310: iload #17
    //   312: iconst_1
    //   313: goto -> 527
    //   316: aload #14
    //   318: iload #9
    //   320: baload
    //   321: istore #20
    //   323: aload #14
    //   325: iload #9
    //   327: iconst_1
    //   328: iadd
    //   329: baload
    //   330: istore #21
    //   332: iconst_0
    //   333: istore #22
    //   335: iload #21
    //   337: istore #23
    //   339: sipush #192
    //   342: istore #24
    //   344: iconst_0
    //   345: istore #25
    //   347: iload #23
    //   349: iload #24
    //   351: iand
    //   352: sipush #128
    //   355: if_icmpne -> 366
    //   358: iconst_1
    //   359: goto -> 367
    //   362: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   365: athrow
    //   366: iconst_0
    //   367: ifne -> 416
    //   370: ldc 65533
    //   372: istore #16
    //   374: istore #17
    //   376: iconst_0
    //   377: istore #18
    //   379: iload #16
    //   381: i2c
    //   382: istore #11
    //   384: iconst_0
    //   385: istore #12
    //   387: aload #5
    //   389: iload #6
    //   391: istore #13
    //   393: iload #13
    //   395: iconst_1
    //   396: iadd
    //   397: istore #6
    //   399: iload #13
    //   401: iload #11
    //   403: castore
    //   404: nop
    //   405: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   408: astore #19
    //   410: iload #17
    //   412: iconst_1
    //   413: goto -> 527
    //   416: sipush #3968
    //   419: iload #21
    //   421: ixor
    //   422: iload #20
    //   424: bipush #6
    //   426: ishl
    //   427: ixor
    //   428: istore #22
    //   430: nop
    //   431: iload #22
    //   433: sipush #128
    //   436: if_icmpge -> 484
    //   439: ldc 65533
    //   441: istore #16
    //   443: istore #17
    //   445: iconst_0
    //   446: istore #18
    //   448: iload #16
    //   450: i2c
    //   451: istore #11
    //   453: iconst_0
    //   454: istore #12
    //   456: aload #5
    //   458: iload #6
    //   460: istore #13
    //   462: iload #13
    //   464: iconst_1
    //   465: iadd
    //   466: istore #6
    //   468: iload #13
    //   470: iload #11
    //   472: castore
    //   473: nop
    //   474: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   477: astore #19
    //   479: iload #17
    //   481: goto -> 526
    //   484: iload #22
    //   486: istore #16
    //   488: istore #17
    //   490: iconst_0
    //   491: istore #18
    //   493: iload #16
    //   495: i2c
    //   496: istore #11
    //   498: iconst_0
    //   499: istore #12
    //   501: aload #5
    //   503: iload #6
    //   505: istore #13
    //   507: iload #13
    //   509: iconst_1
    //   510: iadd
    //   511: istore #6
    //   513: iload #13
    //   515: iload #11
    //   517: castore
    //   518: nop
    //   519: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   522: astore #19
    //   524: iload #17
    //   526: iconst_2
    //   527: iadd
    //   528: istore #9
    //   530: goto -> 112
    //   533: iload #10
    //   535: istore #14
    //   537: iconst_4
    //   538: istore #15
    //   540: iconst_0
    //   541: istore #16
    //   543: iload #14
    //   545: iload #15
    //   547: ishr
    //   548: bipush #-2
    //   550: if_icmpne -> 1076
    //   553: iload #9
    //   555: aload #7
    //   557: astore #14
    //   559: iconst_0
    //   560: istore #15
    //   562: iload_2
    //   563: iload #9
    //   565: iconst_2
    //   566: iadd
    //   567: if_icmpgt -> 679
    //   570: ldc 65533
    //   572: istore #16
    //   574: istore #17
    //   576: iconst_0
    //   577: istore #18
    //   579: iload #16
    //   581: i2c
    //   582: istore #11
    //   584: iconst_0
    //   585: istore #12
    //   587: aload #5
    //   589: iload #6
    //   591: istore #13
    //   593: iload #13
    //   595: iconst_1
    //   596: iadd
    //   597: istore #6
    //   599: iload #13
    //   601: iload #11
    //   603: castore
    //   604: nop
    //   605: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   608: astore #19
    //   610: iload #17
    //   612: iload_2
    //   613: iload #9
    //   615: iconst_1
    //   616: iadd
    //   617: if_icmple -> 667
    //   620: aload #14
    //   622: iload #9
    //   624: iconst_1
    //   625: iadd
    //   626: baload
    //   627: istore #20
    //   629: iconst_0
    //   630: istore #21
    //   632: iload #20
    //   634: istore #22
    //   636: sipush #192
    //   639: istore #23
    //   641: iconst_0
    //   642: istore #24
    //   644: iload #22
    //   646: iload #23
    //   648: iand
    //   649: sipush #128
    //   652: if_icmpne -> 663
    //   655: iconst_1
    //   656: goto -> 664
    //   659: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   662: athrow
    //   663: iconst_0
    //   664: ifne -> 675
    //   667: iconst_1
    //   668: goto -> 1070
    //   671: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   674: athrow
    //   675: iconst_2
    //   676: goto -> 1070
    //   679: aload #14
    //   681: iload #9
    //   683: baload
    //   684: istore #20
    //   686: aload #14
    //   688: iload #9
    //   690: iconst_1
    //   691: iadd
    //   692: baload
    //   693: istore #21
    //   695: iconst_0
    //   696: istore #22
    //   698: iload #21
    //   700: istore #23
    //   702: sipush #192
    //   705: istore #24
    //   707: iconst_0
    //   708: istore #25
    //   710: iload #23
    //   712: iload #24
    //   714: iand
    //   715: sipush #128
    //   718: if_icmpne -> 729
    //   721: iconst_1
    //   722: goto -> 730
    //   725: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   728: athrow
    //   729: iconst_0
    //   730: ifne -> 779
    //   733: ldc 65533
    //   735: istore #16
    //   737: istore #17
    //   739: iconst_0
    //   740: istore #18
    //   742: iload #16
    //   744: i2c
    //   745: istore #11
    //   747: iconst_0
    //   748: istore #12
    //   750: aload #5
    //   752: iload #6
    //   754: istore #13
    //   756: iload #13
    //   758: iconst_1
    //   759: iadd
    //   760: istore #6
    //   762: iload #13
    //   764: iload #11
    //   766: castore
    //   767: nop
    //   768: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   771: astore #19
    //   773: iload #17
    //   775: iconst_1
    //   776: goto -> 1070
    //   779: aload #14
    //   781: iload #9
    //   783: iconst_2
    //   784: iadd
    //   785: baload
    //   786: istore #22
    //   788: iconst_0
    //   789: istore #23
    //   791: iload #22
    //   793: istore #24
    //   795: sipush #192
    //   798: istore #25
    //   800: iconst_0
    //   801: istore #26
    //   803: iload #24
    //   805: iload #25
    //   807: iand
    //   808: sipush #128
    //   811: if_icmpne -> 822
    //   814: iconst_1
    //   815: goto -> 823
    //   818: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   821: athrow
    //   822: iconst_0
    //   823: ifne -> 872
    //   826: ldc 65533
    //   828: istore #16
    //   830: istore #17
    //   832: iconst_0
    //   833: istore #18
    //   835: iload #16
    //   837: i2c
    //   838: istore #11
    //   840: iconst_0
    //   841: istore #12
    //   843: aload #5
    //   845: iload #6
    //   847: istore #13
    //   849: iload #13
    //   851: iconst_1
    //   852: iadd
    //   853: istore #6
    //   855: iload #13
    //   857: iload #11
    //   859: castore
    //   860: nop
    //   861: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   864: astore #19
    //   866: iload #17
    //   868: iconst_2
    //   869: goto -> 1070
    //   872: ldc -123008
    //   874: iload #22
    //   876: ixor
    //   877: iload #21
    //   879: bipush #6
    //   881: ishl
    //   882: ixor
    //   883: iload #20
    //   885: bipush #12
    //   887: ishl
    //   888: ixor
    //   889: istore #23
    //   891: nop
    //   892: iload #23
    //   894: sipush #2048
    //   897: if_icmpge -> 945
    //   900: ldc 65533
    //   902: istore #16
    //   904: istore #17
    //   906: iconst_0
    //   907: istore #18
    //   909: iload #16
    //   911: i2c
    //   912: istore #11
    //   914: iconst_0
    //   915: istore #12
    //   917: aload #5
    //   919: iload #6
    //   921: istore #13
    //   923: iload #13
    //   925: iconst_1
    //   926: iadd
    //   927: istore #6
    //   929: iload #13
    //   931: iload #11
    //   933: castore
    //   934: nop
    //   935: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   938: astore #19
    //   940: iload #17
    //   942: goto -> 1069
    //   945: ldc 55296
    //   947: iload #23
    //   949: if_icmpgt -> 978
    //   952: iload #23
    //   954: ldc 57343
    //   956: if_icmpgt -> 974
    //   959: goto -> 966
    //   962: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   965: athrow
    //   966: iconst_1
    //   967: goto -> 979
    //   970: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   973: athrow
    //   974: iconst_0
    //   975: goto -> 979
    //   978: iconst_0
    //   979: ifeq -> 1027
    //   982: ldc 65533
    //   984: istore #16
    //   986: istore #17
    //   988: iconst_0
    //   989: istore #18
    //   991: iload #16
    //   993: i2c
    //   994: istore #11
    //   996: iconst_0
    //   997: istore #12
    //   999: aload #5
    //   1001: iload #6
    //   1003: istore #13
    //   1005: iload #13
    //   1007: iconst_1
    //   1008: iadd
    //   1009: istore #6
    //   1011: iload #13
    //   1013: iload #11
    //   1015: castore
    //   1016: nop
    //   1017: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1020: astore #19
    //   1022: iload #17
    //   1024: goto -> 1069
    //   1027: iload #23
    //   1029: istore #16
    //   1031: istore #17
    //   1033: iconst_0
    //   1034: istore #18
    //   1036: iload #16
    //   1038: i2c
    //   1039: istore #11
    //   1041: iconst_0
    //   1042: istore #12
    //   1044: aload #5
    //   1046: iload #6
    //   1048: istore #13
    //   1050: iload #13
    //   1052: iconst_1
    //   1053: iadd
    //   1054: istore #6
    //   1056: iload #13
    //   1058: iload #11
    //   1060: castore
    //   1061: nop
    //   1062: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1065: astore #19
    //   1067: iload #17
    //   1069: iconst_3
    //   1070: iadd
    //   1071: istore #9
    //   1073: goto -> 112
    //   1076: iload #10
    //   1078: istore #14
    //   1080: iconst_3
    //   1081: istore #15
    //   1083: iconst_0
    //   1084: istore #16
    //   1086: iload #14
    //   1088: iload #15
    //   1090: ishr
    //   1091: bipush #-2
    //   1093: if_icmpne -> 2432
    //   1096: iload #9
    //   1098: aload #7
    //   1100: astore #14
    //   1102: iconst_0
    //   1103: istore #15
    //   1105: iload_2
    //   1106: iload #9
    //   1108: iconst_3
    //   1109: iadd
    //   1110: if_icmpgt -> 1360
    //   1113: ldc 65533
    //   1115: istore #16
    //   1117: istore #17
    //   1119: iconst_0
    //   1120: istore #18
    //   1122: iload #16
    //   1124: ldc 65533
    //   1126: if_icmpeq -> 1197
    //   1129: iload #16
    //   1131: bipush #10
    //   1133: iushr
    //   1134: ldc 55232
    //   1136: iadd
    //   1137: i2c
    //   1138: istore #11
    //   1140: iconst_0
    //   1141: istore #12
    //   1143: aload #5
    //   1145: iload #6
    //   1147: istore #13
    //   1149: iload #13
    //   1151: iconst_1
    //   1152: iadd
    //   1153: istore #6
    //   1155: iload #13
    //   1157: iload #11
    //   1159: castore
    //   1160: nop
    //   1161: iload #16
    //   1163: sipush #1023
    //   1166: iand
    //   1167: ldc 56320
    //   1169: iadd
    //   1170: i2c
    //   1171: istore #11
    //   1173: iconst_0
    //   1174: istore #12
    //   1176: aload #5
    //   1178: iload #6
    //   1180: istore #13
    //   1182: iload #13
    //   1184: iconst_1
    //   1185: iadd
    //   1186: istore #6
    //   1188: iload #13
    //   1190: iload #11
    //   1192: castore
    //   1193: nop
    //   1194: goto -> 1222
    //   1197: ldc 65533
    //   1199: istore #11
    //   1201: iconst_0
    //   1202: istore #12
    //   1204: aload #5
    //   1206: iload #6
    //   1208: istore #13
    //   1210: iload #13
    //   1212: iconst_1
    //   1213: iadd
    //   1214: istore #6
    //   1216: iload #13
    //   1218: iload #11
    //   1220: castore
    //   1221: nop
    //   1222: nop
    //   1223: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1226: astore #19
    //   1228: iload #17
    //   1230: iload_2
    //   1231: iload #9
    //   1233: iconst_1
    //   1234: iadd
    //   1235: if_icmple -> 1285
    //   1238: aload #14
    //   1240: iload #9
    //   1242: iconst_1
    //   1243: iadd
    //   1244: baload
    //   1245: istore #20
    //   1247: iconst_0
    //   1248: istore #21
    //   1250: iload #20
    //   1252: istore #22
    //   1254: sipush #192
    //   1257: istore #23
    //   1259: iconst_0
    //   1260: istore #24
    //   1262: iload #22
    //   1264: iload #23
    //   1266: iand
    //   1267: sipush #128
    //   1270: if_icmpne -> 1281
    //   1273: iconst_1
    //   1274: goto -> 1282
    //   1277: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   1280: athrow
    //   1281: iconst_0
    //   1282: ifne -> 1293
    //   1285: iconst_1
    //   1286: goto -> 2426
    //   1289: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   1292: athrow
    //   1293: iload_2
    //   1294: iload #9
    //   1296: iconst_2
    //   1297: iadd
    //   1298: if_icmple -> 1348
    //   1301: aload #14
    //   1303: iload #9
    //   1305: iconst_2
    //   1306: iadd
    //   1307: baload
    //   1308: istore #20
    //   1310: iconst_0
    //   1311: istore #21
    //   1313: iload #20
    //   1315: istore #22
    //   1317: sipush #192
    //   1320: istore #23
    //   1322: iconst_0
    //   1323: istore #24
    //   1325: iload #22
    //   1327: iload #23
    //   1329: iand
    //   1330: sipush #128
    //   1333: if_icmpne -> 1344
    //   1336: iconst_1
    //   1337: goto -> 1345
    //   1340: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   1343: athrow
    //   1344: iconst_0
    //   1345: ifne -> 1356
    //   1348: iconst_2
    //   1349: goto -> 2426
    //   1352: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   1355: athrow
    //   1356: iconst_3
    //   1357: goto -> 2426
    //   1360: aload #14
    //   1362: iload #9
    //   1364: baload
    //   1365: istore #20
    //   1367: aload #14
    //   1369: iload #9
    //   1371: iconst_1
    //   1372: iadd
    //   1373: baload
    //   1374: istore #21
    //   1376: iconst_0
    //   1377: istore #22
    //   1379: iload #21
    //   1381: istore #23
    //   1383: sipush #192
    //   1386: istore #24
    //   1388: iconst_0
    //   1389: istore #25
    //   1391: iload #23
    //   1393: iload #24
    //   1395: iand
    //   1396: sipush #128
    //   1399: if_icmpne -> 1410
    //   1402: iconst_1
    //   1403: goto -> 1411
    //   1406: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   1409: athrow
    //   1410: iconst_0
    //   1411: ifne -> 1535
    //   1414: ldc 65533
    //   1416: istore #16
    //   1418: istore #17
    //   1420: iconst_0
    //   1421: istore #18
    //   1423: iload #16
    //   1425: ldc 65533
    //   1427: if_icmpeq -> 1498
    //   1430: iload #16
    //   1432: bipush #10
    //   1434: iushr
    //   1435: ldc 55232
    //   1437: iadd
    //   1438: i2c
    //   1439: istore #11
    //   1441: iconst_0
    //   1442: istore #12
    //   1444: aload #5
    //   1446: iload #6
    //   1448: istore #13
    //   1450: iload #13
    //   1452: iconst_1
    //   1453: iadd
    //   1454: istore #6
    //   1456: iload #13
    //   1458: iload #11
    //   1460: castore
    //   1461: nop
    //   1462: iload #16
    //   1464: sipush #1023
    //   1467: iand
    //   1468: ldc 56320
    //   1470: iadd
    //   1471: i2c
    //   1472: istore #11
    //   1474: iconst_0
    //   1475: istore #12
    //   1477: aload #5
    //   1479: iload #6
    //   1481: istore #13
    //   1483: iload #13
    //   1485: iconst_1
    //   1486: iadd
    //   1487: istore #6
    //   1489: iload #13
    //   1491: iload #11
    //   1493: castore
    //   1494: nop
    //   1495: goto -> 1523
    //   1498: ldc 65533
    //   1500: istore #11
    //   1502: iconst_0
    //   1503: istore #12
    //   1505: aload #5
    //   1507: iload #6
    //   1509: istore #13
    //   1511: iload #13
    //   1513: iconst_1
    //   1514: iadd
    //   1515: istore #6
    //   1517: iload #13
    //   1519: iload #11
    //   1521: castore
    //   1522: nop
    //   1523: nop
    //   1524: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1527: astore #19
    //   1529: iload #17
    //   1531: iconst_1
    //   1532: goto -> 2426
    //   1535: aload #14
    //   1537: iload #9
    //   1539: iconst_2
    //   1540: iadd
    //   1541: baload
    //   1542: istore #22
    //   1544: iconst_0
    //   1545: istore #23
    //   1547: iload #22
    //   1549: istore #24
    //   1551: sipush #192
    //   1554: istore #25
    //   1556: iconst_0
    //   1557: istore #26
    //   1559: iload #24
    //   1561: iload #25
    //   1563: iand
    //   1564: sipush #128
    //   1567: if_icmpne -> 1578
    //   1570: iconst_1
    //   1571: goto -> 1579
    //   1574: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   1577: athrow
    //   1578: iconst_0
    //   1579: ifne -> 1703
    //   1582: ldc 65533
    //   1584: istore #16
    //   1586: istore #17
    //   1588: iconst_0
    //   1589: istore #18
    //   1591: iload #16
    //   1593: ldc 65533
    //   1595: if_icmpeq -> 1666
    //   1598: iload #16
    //   1600: bipush #10
    //   1602: iushr
    //   1603: ldc 55232
    //   1605: iadd
    //   1606: i2c
    //   1607: istore #11
    //   1609: iconst_0
    //   1610: istore #12
    //   1612: aload #5
    //   1614: iload #6
    //   1616: istore #13
    //   1618: iload #13
    //   1620: iconst_1
    //   1621: iadd
    //   1622: istore #6
    //   1624: iload #13
    //   1626: iload #11
    //   1628: castore
    //   1629: nop
    //   1630: iload #16
    //   1632: sipush #1023
    //   1635: iand
    //   1636: ldc 56320
    //   1638: iadd
    //   1639: i2c
    //   1640: istore #11
    //   1642: iconst_0
    //   1643: istore #12
    //   1645: aload #5
    //   1647: iload #6
    //   1649: istore #13
    //   1651: iload #13
    //   1653: iconst_1
    //   1654: iadd
    //   1655: istore #6
    //   1657: iload #13
    //   1659: iload #11
    //   1661: castore
    //   1662: nop
    //   1663: goto -> 1691
    //   1666: ldc 65533
    //   1668: istore #11
    //   1670: iconst_0
    //   1671: istore #12
    //   1673: aload #5
    //   1675: iload #6
    //   1677: istore #13
    //   1679: iload #13
    //   1681: iconst_1
    //   1682: iadd
    //   1683: istore #6
    //   1685: iload #13
    //   1687: iload #11
    //   1689: castore
    //   1690: nop
    //   1691: nop
    //   1692: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1695: astore #19
    //   1697: iload #17
    //   1699: iconst_2
    //   1700: goto -> 2426
    //   1703: aload #14
    //   1705: iload #9
    //   1707: iconst_3
    //   1708: iadd
    //   1709: baload
    //   1710: istore #23
    //   1712: iconst_0
    //   1713: istore #24
    //   1715: iload #23
    //   1717: istore #25
    //   1719: sipush #192
    //   1722: istore #26
    //   1724: iconst_0
    //   1725: istore #27
    //   1727: iload #25
    //   1729: iload #26
    //   1731: iand
    //   1732: sipush #128
    //   1735: if_icmpne -> 1746
    //   1738: iconst_1
    //   1739: goto -> 1747
    //   1742: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   1745: athrow
    //   1746: iconst_0
    //   1747: ifne -> 1871
    //   1750: ldc 65533
    //   1752: istore #16
    //   1754: istore #17
    //   1756: iconst_0
    //   1757: istore #18
    //   1759: iload #16
    //   1761: ldc 65533
    //   1763: if_icmpeq -> 1834
    //   1766: iload #16
    //   1768: bipush #10
    //   1770: iushr
    //   1771: ldc 55232
    //   1773: iadd
    //   1774: i2c
    //   1775: istore #11
    //   1777: iconst_0
    //   1778: istore #12
    //   1780: aload #5
    //   1782: iload #6
    //   1784: istore #13
    //   1786: iload #13
    //   1788: iconst_1
    //   1789: iadd
    //   1790: istore #6
    //   1792: iload #13
    //   1794: iload #11
    //   1796: castore
    //   1797: nop
    //   1798: iload #16
    //   1800: sipush #1023
    //   1803: iand
    //   1804: ldc 56320
    //   1806: iadd
    //   1807: i2c
    //   1808: istore #11
    //   1810: iconst_0
    //   1811: istore #12
    //   1813: aload #5
    //   1815: iload #6
    //   1817: istore #13
    //   1819: iload #13
    //   1821: iconst_1
    //   1822: iadd
    //   1823: istore #6
    //   1825: iload #13
    //   1827: iload #11
    //   1829: castore
    //   1830: nop
    //   1831: goto -> 1859
    //   1834: ldc 65533
    //   1836: istore #11
    //   1838: iconst_0
    //   1839: istore #12
    //   1841: aload #5
    //   1843: iload #6
    //   1845: istore #13
    //   1847: iload #13
    //   1849: iconst_1
    //   1850: iadd
    //   1851: istore #6
    //   1853: iload #13
    //   1855: iload #11
    //   1857: castore
    //   1858: nop
    //   1859: nop
    //   1860: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   1863: astore #19
    //   1865: iload #17
    //   1867: iconst_3
    //   1868: goto -> 2426
    //   1871: ldc 3678080
    //   1873: iload #23
    //   1875: ixor
    //   1876: iload #22
    //   1878: bipush #6
    //   1880: ishl
    //   1881: ixor
    //   1882: iload #21
    //   1884: bipush #12
    //   1886: ishl
    //   1887: ixor
    //   1888: iload #20
    //   1890: bipush #18
    //   1892: ishl
    //   1893: ixor
    //   1894: istore #24
    //   1896: nop
    //   1897: iload #24
    //   1899: ldc 1114111
    //   1901: if_icmple -> 2024
    //   1904: ldc 65533
    //   1906: istore #16
    //   1908: istore #17
    //   1910: iconst_0
    //   1911: istore #18
    //   1913: iload #16
    //   1915: ldc 65533
    //   1917: if_icmpeq -> 1988
    //   1920: iload #16
    //   1922: bipush #10
    //   1924: iushr
    //   1925: ldc 55232
    //   1927: iadd
    //   1928: i2c
    //   1929: istore #11
    //   1931: iconst_0
    //   1932: istore #12
    //   1934: aload #5
    //   1936: iload #6
    //   1938: istore #13
    //   1940: iload #13
    //   1942: iconst_1
    //   1943: iadd
    //   1944: istore #6
    //   1946: iload #13
    //   1948: iload #11
    //   1950: castore
    //   1951: nop
    //   1952: iload #16
    //   1954: sipush #1023
    //   1957: iand
    //   1958: ldc 56320
    //   1960: iadd
    //   1961: i2c
    //   1962: istore #11
    //   1964: iconst_0
    //   1965: istore #12
    //   1967: aload #5
    //   1969: iload #6
    //   1971: istore #13
    //   1973: iload #13
    //   1975: iconst_1
    //   1976: iadd
    //   1977: istore #6
    //   1979: iload #13
    //   1981: iload #11
    //   1983: castore
    //   1984: nop
    //   1985: goto -> 2013
    //   1988: ldc 65533
    //   1990: istore #11
    //   1992: iconst_0
    //   1993: istore #12
    //   1995: aload #5
    //   1997: iload #6
    //   1999: istore #13
    //   2001: iload #13
    //   2003: iconst_1
    //   2004: iadd
    //   2005: istore #6
    //   2007: iload #13
    //   2009: iload #11
    //   2011: castore
    //   2012: nop
    //   2013: nop
    //   2014: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   2017: astore #19
    //   2019: iload #17
    //   2021: goto -> 2425
    //   2024: ldc 55296
    //   2026: iload #24
    //   2028: if_icmpgt -> 2057
    //   2031: iload #24
    //   2033: ldc 57343
    //   2035: if_icmpgt -> 2053
    //   2038: goto -> 2045
    //   2041: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   2044: athrow
    //   2045: iconst_1
    //   2046: goto -> 2058
    //   2049: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   2052: athrow
    //   2053: iconst_0
    //   2054: goto -> 2058
    //   2057: iconst_0
    //   2058: ifeq -> 2181
    //   2061: ldc 65533
    //   2063: istore #16
    //   2065: istore #17
    //   2067: iconst_0
    //   2068: istore #18
    //   2070: iload #16
    //   2072: ldc 65533
    //   2074: if_icmpeq -> 2145
    //   2077: iload #16
    //   2079: bipush #10
    //   2081: iushr
    //   2082: ldc 55232
    //   2084: iadd
    //   2085: i2c
    //   2086: istore #11
    //   2088: iconst_0
    //   2089: istore #12
    //   2091: aload #5
    //   2093: iload #6
    //   2095: istore #13
    //   2097: iload #13
    //   2099: iconst_1
    //   2100: iadd
    //   2101: istore #6
    //   2103: iload #13
    //   2105: iload #11
    //   2107: castore
    //   2108: nop
    //   2109: iload #16
    //   2111: sipush #1023
    //   2114: iand
    //   2115: ldc 56320
    //   2117: iadd
    //   2118: i2c
    //   2119: istore #11
    //   2121: iconst_0
    //   2122: istore #12
    //   2124: aload #5
    //   2126: iload #6
    //   2128: istore #13
    //   2130: iload #13
    //   2132: iconst_1
    //   2133: iadd
    //   2134: istore #6
    //   2136: iload #13
    //   2138: iload #11
    //   2140: castore
    //   2141: nop
    //   2142: goto -> 2170
    //   2145: ldc 65533
    //   2147: istore #11
    //   2149: iconst_0
    //   2150: istore #12
    //   2152: aload #5
    //   2154: iload #6
    //   2156: istore #13
    //   2158: iload #13
    //   2160: iconst_1
    //   2161: iadd
    //   2162: istore #6
    //   2164: iload #13
    //   2166: iload #11
    //   2168: castore
    //   2169: nop
    //   2170: nop
    //   2171: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   2174: astore #19
    //   2176: iload #17
    //   2178: goto -> 2425
    //   2181: iload #24
    //   2183: ldc 65536
    //   2185: if_icmpge -> 2308
    //   2188: ldc 65533
    //   2190: istore #16
    //   2192: istore #17
    //   2194: iconst_0
    //   2195: istore #18
    //   2197: iload #16
    //   2199: ldc 65533
    //   2201: if_icmpeq -> 2272
    //   2204: iload #16
    //   2206: bipush #10
    //   2208: iushr
    //   2209: ldc 55232
    //   2211: iadd
    //   2212: i2c
    //   2213: istore #11
    //   2215: iconst_0
    //   2216: istore #12
    //   2218: aload #5
    //   2220: iload #6
    //   2222: istore #13
    //   2224: iload #13
    //   2226: iconst_1
    //   2227: iadd
    //   2228: istore #6
    //   2230: iload #13
    //   2232: iload #11
    //   2234: castore
    //   2235: nop
    //   2236: iload #16
    //   2238: sipush #1023
    //   2241: iand
    //   2242: ldc 56320
    //   2244: iadd
    //   2245: i2c
    //   2246: istore #11
    //   2248: iconst_0
    //   2249: istore #12
    //   2251: aload #5
    //   2253: iload #6
    //   2255: istore #13
    //   2257: iload #13
    //   2259: iconst_1
    //   2260: iadd
    //   2261: istore #6
    //   2263: iload #13
    //   2265: iload #11
    //   2267: castore
    //   2268: nop
    //   2269: goto -> 2297
    //   2272: ldc 65533
    //   2274: istore #11
    //   2276: iconst_0
    //   2277: istore #12
    //   2279: aload #5
    //   2281: iload #6
    //   2283: istore #13
    //   2285: iload #13
    //   2287: iconst_1
    //   2288: iadd
    //   2289: istore #6
    //   2291: iload #13
    //   2293: iload #11
    //   2295: castore
    //   2296: nop
    //   2297: nop
    //   2298: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   2301: astore #19
    //   2303: iload #17
    //   2305: goto -> 2425
    //   2308: iload #24
    //   2310: istore #16
    //   2312: istore #17
    //   2314: iconst_0
    //   2315: istore #18
    //   2317: iload #16
    //   2319: ldc 65533
    //   2321: if_icmpeq -> 2392
    //   2324: iload #16
    //   2326: bipush #10
    //   2328: iushr
    //   2329: ldc 55232
    //   2331: iadd
    //   2332: i2c
    //   2333: istore #11
    //   2335: iconst_0
    //   2336: istore #12
    //   2338: aload #5
    //   2340: iload #6
    //   2342: istore #13
    //   2344: iload #13
    //   2346: iconst_1
    //   2347: iadd
    //   2348: istore #6
    //   2350: iload #13
    //   2352: iload #11
    //   2354: castore
    //   2355: nop
    //   2356: iload #16
    //   2358: sipush #1023
    //   2361: iand
    //   2362: ldc 56320
    //   2364: iadd
    //   2365: i2c
    //   2366: istore #11
    //   2368: iconst_0
    //   2369: istore #12
    //   2371: aload #5
    //   2373: iload #6
    //   2375: istore #13
    //   2377: iload #13
    //   2379: iconst_1
    //   2380: iadd
    //   2381: istore #6
    //   2383: iload #13
    //   2385: iload #11
    //   2387: castore
    //   2388: nop
    //   2389: goto -> 2417
    //   2392: ldc 65533
    //   2394: istore #11
    //   2396: iconst_0
    //   2397: istore #12
    //   2399: aload #5
    //   2401: iload #6
    //   2403: istore #13
    //   2405: iload #13
    //   2407: iconst_1
    //   2408: iadd
    //   2409: istore #6
    //   2411: iload #13
    //   2413: iload #11
    //   2415: castore
    //   2416: nop
    //   2417: nop
    //   2418: getstatic me/rerere/matrix/thirdparty/kotlin/Unit.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/Unit;
    //   2421: astore #19
    //   2423: iload #17
    //   2425: iconst_4
    //   2426: iadd
    //   2427: istore #9
    //   2429: goto -> 112
    //   2432: ldc 65533
    //   2434: istore #11
    //   2436: iconst_0
    //   2437: istore #12
    //   2439: aload #5
    //   2441: iload #6
    //   2443: istore #13
    //   2445: iload #13
    //   2447: iconst_1
    //   2448: iadd
    //   2449: istore #6
    //   2451: iload #13
    //   2453: iload #11
    //   2455: castore
    //   2456: nop
    //   2457: iload #9
    //   2459: istore #14
    //   2461: iload #14
    //   2463: iconst_1
    //   2464: iadd
    //   2465: istore #9
    //   2467: iload #14
    //   2469: pop
    //   2470: goto -> 112
    //   2473: nop
    //   2474: aload #5
    //   2476: iconst_0
    //   2477: iload #6
    //   2479: invokestatic concatToString : ([CII)Ljava/lang/String;
    //   2482: areturn
    // Exception table:
    //   from	to	target	type
    //   8	24	27	java/lang/ArrayIndexOutOfBoundsException
    //   18	36	39	java/lang/ArrayIndexOutOfBoundsException
    //   31	89	89	java/lang/ArrayIndexOutOfBoundsException
    //   170	184	187	java/lang/ArrayIndexOutOfBoundsException
    //   347	362	362	java/lang/ArrayIndexOutOfBoundsException
    //   644	659	659	java/lang/ArrayIndexOutOfBoundsException
    //   664	671	671	java/lang/ArrayIndexOutOfBoundsException
    //   710	725	725	java/lang/ArrayIndexOutOfBoundsException
    //   803	818	818	java/lang/ArrayIndexOutOfBoundsException
    //   945	959	962	java/lang/ArrayIndexOutOfBoundsException
    //   952	970	970	java/lang/ArrayIndexOutOfBoundsException
    //   1262	1277	1277	java/lang/ArrayIndexOutOfBoundsException
    //   1282	1289	1289	java/lang/ArrayIndexOutOfBoundsException
    //   1325	1340	1340	java/lang/ArrayIndexOutOfBoundsException
    //   1345	1352	1352	java/lang/ArrayIndexOutOfBoundsException
    //   1391	1406	1406	java/lang/ArrayIndexOutOfBoundsException
    //   1559	1574	1574	java/lang/ArrayIndexOutOfBoundsException
    //   1727	1742	1742	java/lang/ArrayIndexOutOfBoundsException
    //   2024	2038	2041	java/lang/ArrayIndexOutOfBoundsException
    //   2031	2049	2049	java/lang/ArrayIndexOutOfBoundsException
  }
  
  @NotNull
  public static final byte[] commonAsUtf8ToByteArray(@NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/_Utf8Kt.a : J
    //   3: ldc2_w 84441350355818
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: iconst_4
    //   15: aload_0
    //   16: invokevirtual length : ()I
    //   19: imul
    //   20: newarray byte
    //   22: astore_3
    //   23: iconst_0
    //   24: istore #4
    //   26: aload_0
    //   27: invokevirtual length : ()I
    //   30: istore #5
    //   32: iload #4
    //   34: iload #5
    //   36: if_icmpge -> 841
    //   39: iload #4
    //   41: istore #6
    //   43: iinc #4, 1
    //   46: aload_0
    //   47: iload #6
    //   49: invokevirtual charAt : (I)C
    //   52: istore #7
    //   54: iload #7
    //   56: sipush #128
    //   59: invokestatic compare : (II)I
    //   62: iflt -> 820
    //   65: iconst_0
    //   66: istore #8
    //   68: iload #6
    //   70: istore #8
    //   72: aload_0
    //   73: astore #9
    //   75: aload_0
    //   76: invokevirtual length : ()I
    //   79: istore #10
    //   81: iconst_0
    //   82: istore #11
    //   84: iload #6
    //   86: istore #12
    //   88: iload #12
    //   90: iload #10
    //   92: if_icmpge -> 795
    //   95: aload #9
    //   97: iload #12
    //   99: invokevirtual charAt : (I)C
    //   102: istore #13
    //   104: nop
    //   105: iload #13
    //   107: sipush #128
    //   110: invokestatic compare : (II)I
    //   113: ifge -> 238
    //   116: iload #13
    //   118: istore #14
    //   120: iconst_0
    //   121: istore #15
    //   123: iload #14
    //   125: i2b
    //   126: istore #16
    //   128: iconst_0
    //   129: istore #17
    //   131: aload_3
    //   132: iload #8
    //   134: istore #18
    //   136: iload #18
    //   138: iconst_1
    //   139: iadd
    //   140: istore #8
    //   142: iload #18
    //   144: iload #16
    //   146: bastore
    //   147: nop
    //   148: iload #12
    //   150: istore #14
    //   152: iload #14
    //   154: iconst_1
    //   155: iadd
    //   156: istore #12
    //   158: iload #12
    //   160: iload #10
    //   162: if_icmpge -> 88
    //   165: aload #9
    //   167: iload #12
    //   169: invokevirtual charAt : (I)C
    //   172: sipush #128
    //   175: invokestatic compare : (II)I
    //   178: ifge -> 88
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   187: athrow
    //   188: aload #9
    //   190: iload #12
    //   192: istore #14
    //   194: iload #14
    //   196: iconst_1
    //   197: iadd
    //   198: istore #12
    //   200: iload #14
    //   202: invokevirtual charAt : (I)C
    //   205: istore #14
    //   207: iconst_0
    //   208: istore #15
    //   210: iload #14
    //   212: i2b
    //   213: istore #16
    //   215: iconst_0
    //   216: istore #17
    //   218: aload_3
    //   219: iload #8
    //   221: istore #18
    //   223: iload #18
    //   225: iconst_1
    //   226: iadd
    //   227: istore #8
    //   229: iload #18
    //   231: iload #16
    //   233: bastore
    //   234: nop
    //   235: goto -> 158
    //   238: iload #13
    //   240: sipush #2048
    //   243: invokestatic compare : (II)I
    //   246: ifge -> 340
    //   249: iload #13
    //   251: istore #14
    //   253: iconst_0
    //   254: istore #15
    //   256: iload #14
    //   258: bipush #6
    //   260: ishr
    //   261: sipush #192
    //   264: ior
    //   265: i2b
    //   266: istore #16
    //   268: iconst_0
    //   269: istore #17
    //   271: aload_3
    //   272: iload #8
    //   274: istore #18
    //   276: iload #18
    //   278: iconst_1
    //   279: iadd
    //   280: istore #8
    //   282: iload #18
    //   284: iload #16
    //   286: bastore
    //   287: nop
    //   288: iload #13
    //   290: istore #14
    //   292: iconst_0
    //   293: istore #15
    //   295: iload #14
    //   297: bipush #63
    //   299: iand
    //   300: sipush #128
    //   303: ior
    //   304: i2b
    //   305: istore #16
    //   307: iconst_0
    //   308: istore #17
    //   310: aload_3
    //   311: iload #8
    //   313: istore #18
    //   315: iload #18
    //   317: iconst_1
    //   318: iadd
    //   319: istore #8
    //   321: iload #18
    //   323: iload #16
    //   325: bastore
    //   326: nop
    //   327: iload #12
    //   329: istore #14
    //   331: iload #14
    //   333: iconst_1
    //   334: iadd
    //   335: istore #12
    //   337: goto -> 88
    //   340: ldc 55296
    //   342: iload #13
    //   344: if_icmpgt -> 373
    //   347: iload #13
    //   349: ldc 57343
    //   351: if_icmpgt -> 369
    //   354: goto -> 361
    //   357: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   360: athrow
    //   361: iconst_1
    //   362: goto -> 374
    //   365: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   368: athrow
    //   369: iconst_0
    //   370: goto -> 374
    //   373: iconst_0
    //   374: ifne -> 510
    //   377: iload #13
    //   379: istore #14
    //   381: iconst_0
    //   382: istore #15
    //   384: iload #14
    //   386: bipush #12
    //   388: ishr
    //   389: sipush #224
    //   392: ior
    //   393: i2b
    //   394: istore #16
    //   396: iconst_0
    //   397: istore #17
    //   399: aload_3
    //   400: iload #8
    //   402: istore #18
    //   404: iload #18
    //   406: iconst_1
    //   407: iadd
    //   408: istore #8
    //   410: iload #18
    //   412: iload #16
    //   414: bastore
    //   415: nop
    //   416: iload #13
    //   418: istore #14
    //   420: iconst_0
    //   421: istore #15
    //   423: iload #14
    //   425: bipush #6
    //   427: ishr
    //   428: bipush #63
    //   430: iand
    //   431: sipush #128
    //   434: ior
    //   435: i2b
    //   436: istore #16
    //   438: iconst_0
    //   439: istore #17
    //   441: aload_3
    //   442: iload #8
    //   444: istore #18
    //   446: iload #18
    //   448: iconst_1
    //   449: iadd
    //   450: istore #8
    //   452: iload #18
    //   454: iload #16
    //   456: bastore
    //   457: nop
    //   458: iload #13
    //   460: istore #14
    //   462: iconst_0
    //   463: istore #15
    //   465: iload #14
    //   467: bipush #63
    //   469: iand
    //   470: sipush #128
    //   473: ior
    //   474: i2b
    //   475: istore #16
    //   477: iconst_0
    //   478: istore #17
    //   480: aload_3
    //   481: iload #8
    //   483: istore #18
    //   485: iload #18
    //   487: iconst_1
    //   488: iadd
    //   489: istore #8
    //   491: iload #18
    //   493: iload #16
    //   495: bastore
    //   496: nop
    //   497: iload #12
    //   499: istore #14
    //   501: iload #14
    //   503: iconst_1
    //   504: iadd
    //   505: istore #12
    //   507: goto -> 88
    //   510: iload #13
    //   512: ldc 56319
    //   514: invokestatic compare : (II)I
    //   517: ifgt -> 584
    //   520: iload #10
    //   522: iload #12
    //   524: iconst_1
    //   525: iadd
    //   526: if_icmple -> 584
    //   529: goto -> 536
    //   532: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   535: athrow
    //   536: aload #9
    //   538: iload #12
    //   540: iconst_1
    //   541: iadd
    //   542: invokevirtual charAt : (I)C
    //   545: istore #14
    //   547: ldc 56320
    //   549: iload #14
    //   551: if_icmpgt -> 580
    //   554: iload #14
    //   556: ldc 57343
    //   558: if_icmpgt -> 576
    //   561: goto -> 568
    //   564: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   567: athrow
    //   568: iconst_1
    //   569: goto -> 581
    //   572: invokestatic a : (Ljava/lang/ArrayIndexOutOfBoundsException;)Ljava/lang/ArrayIndexOutOfBoundsException;
    //   575: athrow
    //   576: iconst_0
    //   577: goto -> 581
    //   580: iconst_0
    //   581: ifne -> 621
    //   584: bipush #63
    //   586: istore #16
    //   588: iconst_0
    //   589: istore #17
    //   591: aload_3
    //   592: iload #8
    //   594: istore #18
    //   596: iload #18
    //   598: iconst_1
    //   599: iadd
    //   600: istore #8
    //   602: iload #18
    //   604: iload #16
    //   606: bastore
    //   607: nop
    //   608: iload #12
    //   610: istore #14
    //   612: iload #14
    //   614: iconst_1
    //   615: iadd
    //   616: istore #12
    //   618: goto -> 88
    //   621: iload #13
    //   623: istore #15
    //   625: iconst_0
    //   626: istore #16
    //   628: iload #15
    //   630: bipush #10
    //   632: ishl
    //   633: aload #9
    //   635: iload #12
    //   637: iconst_1
    //   638: iadd
    //   639: invokevirtual charAt : (I)C
    //   642: istore #15
    //   644: iconst_0
    //   645: istore #16
    //   647: iload #15
    //   649: iadd
    //   650: ldc -56613888
    //   652: iadd
    //   653: istore #14
    //   655: iload #14
    //   657: bipush #18
    //   659: ishr
    //   660: sipush #240
    //   663: ior
    //   664: i2b
    //   665: istore #17
    //   667: iconst_0
    //   668: istore #18
    //   670: aload_3
    //   671: iload #8
    //   673: istore #19
    //   675: iload #19
    //   677: iconst_1
    //   678: iadd
    //   679: istore #8
    //   681: iload #19
    //   683: iload #17
    //   685: bastore
    //   686: nop
    //   687: iload #14
    //   689: bipush #12
    //   691: ishr
    //   692: bipush #63
    //   694: iand
    //   695: sipush #128
    //   698: ior
    //   699: i2b
    //   700: istore #17
    //   702: iconst_0
    //   703: istore #18
    //   705: aload_3
    //   706: iload #8
    //   708: istore #19
    //   710: iload #19
    //   712: iconst_1
    //   713: iadd
    //   714: istore #8
    //   716: iload #19
    //   718: iload #17
    //   720: bastore
    //   721: nop
    //   722: iload #14
    //   724: bipush #6
    //   726: ishr
    //   727: bipush #63
    //   729: iand
    //   730: sipush #128
    //   733: ior
    //   734: i2b
    //   735: istore #17
    //   737: iconst_0
    //   738: istore #18
    //   740: aload_3
    //   741: iload #8
    //   743: istore #19
    //   745: iload #19
    //   747: iconst_1
    //   748: iadd
    //   749: istore #8
    //   751: iload #19
    //   753: iload #17
    //   755: bastore
    //   756: nop
    //   757: iload #14
    //   759: bipush #63
    //   761: iand
    //   762: sipush #128
    //   765: ior
    //   766: i2b
    //   767: istore #17
    //   769: iconst_0
    //   770: istore #18
    //   772: aload_3
    //   773: iload #8
    //   775: istore #19
    //   777: iload #19
    //   779: iconst_1
    //   780: iadd
    //   781: istore #8
    //   783: iload #19
    //   785: iload #17
    //   787: bastore
    //   788: nop
    //   789: iinc #12, 2
    //   792: goto -> 88
    //   795: nop
    //   796: aload_3
    //   797: astore #9
    //   799: iload #8
    //   801: istore #10
    //   803: iconst_0
    //   804: istore #11
    //   806: aload #9
    //   808: iload #10
    //   810: invokestatic copyOf : ([BI)[B
    //   813: dup
    //   814: ldc 'java.util.Arrays.copyOf(this, newSize)'
    //   816: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   819: areturn
    //   820: aload_3
    //   821: iload #6
    //   823: iload #7
    //   825: istore #8
    //   827: iconst_0
    //   828: istore #9
    //   830: iload #8
    //   832: i2b
    //   833: bastore
    //   834: iload #4
    //   836: iload #5
    //   838: if_icmplt -> 39
    //   841: aload_3
    //   842: astore #4
    //   844: aload_0
    //   845: invokevirtual length : ()I
    //   848: istore #5
    //   850: iconst_0
    //   851: istore #6
    //   853: aload #4
    //   855: iload #5
    //   857: invokestatic copyOf : ([BI)[B
    //   860: dup
    //   861: ldc 'java.util.Arrays.copyOf(this, newSize)'
    //   863: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   866: areturn
    // Exception table:
    //   from	to	target	type
    //   158	181	184	java/lang/ArrayIndexOutOfBoundsException
    //   340	354	357	java/lang/ArrayIndexOutOfBoundsException
    //   347	365	365	java/lang/ArrayIndexOutOfBoundsException
    //   510	529	532	java/lang/ArrayIndexOutOfBoundsException
    //   547	561	564	java/lang/ArrayIndexOutOfBoundsException
    //   554	572	572	java/lang/ArrayIndexOutOfBoundsException
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\_Utf8Kt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
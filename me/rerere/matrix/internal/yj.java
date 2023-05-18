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
import me.rerere.matrix.api.exception.UnknownMinecraftVersionException;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class yj {
  public k i;
  
  private static boolean a;
  
  private static final long b = o3.a(6130123183725349443L, -4753764020100878764L, MethodHandles.lookup().lookupClass()).a(244500772287047L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public final void b(@NotNull k paramk) {
    this.i = paramk;
  }
  
  public final void b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yj.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 113982890311096
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 2636771794870
    //   17: lxor
    //   18: lstore #5
    //   20: dup2
    //   21: ldc2_w 74215002948016
    //   24: lxor
    //   25: dup2
    //   26: bipush #48
    //   28: lushr
    //   29: l2i
    //   30: istore #7
    //   32: dup2
    //   33: bipush #16
    //   35: lshl
    //   36: bipush #32
    //   38: lushr
    //   39: l2i
    //   40: istore #8
    //   42: dup2
    //   43: bipush #48
    //   45: lshl
    //   46: bipush #48
    //   48: lushr
    //   49: l2i
    //   50: istore #9
    //   52: pop2
    //   53: dup2
    //   54: ldc2_w 40698668190201
    //   57: lxor
    //   58: lstore #10
    //   60: dup2
    //   61: ldc2_w 21077349475420
    //   64: lxor
    //   65: lstore #12
    //   67: dup2
    //   68: ldc2_w 19286114077144
    //   71: lxor
    //   72: lstore #14
    //   74: dup2
    //   75: ldc2_w 70702124165024
    //   78: lxor
    //   79: lstore #16
    //   81: pop2
    //   82: invokestatic a : ()I
    //   85: istore #18
    //   87: lload_3
    //   88: invokestatic b : (J)Ljava/lang/String;
    //   91: astore #19
    //   93: aload_0
    //   94: aload #19
    //   96: astore #20
    //   98: aload #20
    //   100: iload #18
    //   102: ifne -> 117
    //   105: ifnull -> 913
    //   108: goto -> 115
    //   111: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   114: athrow
    //   115: aload #20
    //   117: invokevirtual hashCode : ()I
    //   120: iload #18
    //   122: ifne -> 293
    //   125: lookupswitch default -> 913, -1497165255 -> 607, -1497135464 -> 663, -1497135463 -> 635, -1497105673 -> 495, -1497075882 -> 383, -1497046091 -> 299, -1497046090 -> 411, -1497046089 -> 439, -1497016300 -> 327, -1497016299 -> 268, -1497016298 -> 467, -1496986509 -> 579, -1496986508 -> 355, -1496956718 -> 523, -1496956717 -> 551, -1156422964 -> 691
    //   264: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   267: athrow
    //   268: aload #20
    //   270: sipush #10018
    //   273: ldc2_w 4679998139933210897
    //   276: lload_1
    //   277: lxor
    //   278: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   283: invokevirtual equals : (Ljava/lang/Object;)Z
    //   286: goto -> 293
    //   289: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   292: athrow
    //   293: ifne -> 837
    //   296: goto -> 913
    //   299: aload #20
    //   301: sipush #19487
    //   304: ldc2_w 7644147223319138862
    //   307: lload_1
    //   308: lxor
    //   309: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   314: invokevirtual equals : (Ljava/lang/Object;)Z
    //   317: ifne -> 798
    //   320: goto -> 913
    //   323: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   326: athrow
    //   327: aload #20
    //   329: sipush #20825
    //   332: ldc2_w 4030307619587247972
    //   335: lload_1
    //   336: lxor
    //   337: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   342: invokevirtual equals : (Ljava/lang/Object;)Z
    //   345: ifne -> 837
    //   348: goto -> 913
    //   351: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   354: athrow
    //   355: aload #20
    //   357: sipush #11029
    //   360: ldc2_w 6276862825934009637
    //   363: lload_1
    //   364: lxor
    //   365: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   370: invokevirtual equals : (Ljava/lang/Object;)Z
    //   373: ifne -> 863
    //   376: goto -> 913
    //   379: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   382: athrow
    //   383: aload #20
    //   385: sipush #23625
    //   388: ldc2_w 3163808575313592946
    //   391: lload_1
    //   392: lxor
    //   393: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   398: invokevirtual equals : (Ljava/lang/Object;)Z
    //   401: ifne -> 785
    //   404: goto -> 913
    //   407: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   410: athrow
    //   411: aload #20
    //   413: sipush #28766
    //   416: ldc2_w 1500870552269680228
    //   419: lload_1
    //   420: lxor
    //   421: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   426: invokevirtual equals : (Ljava/lang/Object;)Z
    //   429: ifne -> 811
    //   432: goto -> 913
    //   435: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   438: athrow
    //   439: aload #20
    //   441: sipush #12431
    //   444: ldc2_w 1884505000369073846
    //   447: lload_1
    //   448: lxor
    //   449: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   454: invokevirtual equals : (Ljava/lang/Object;)Z
    //   457: ifne -> 824
    //   460: goto -> 913
    //   463: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   466: athrow
    //   467: aload #20
    //   469: sipush #27553
    //   472: ldc2_w 3300263333104776606
    //   475: lload_1
    //   476: lxor
    //   477: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   482: invokevirtual equals : (Ljava/lang/Object;)Z
    //   485: ifne -> 837
    //   488: goto -> 913
    //   491: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   494: athrow
    //   495: aload #20
    //   497: sipush #27951
    //   500: ldc2_w 2490631293130863374
    //   503: lload_1
    //   504: lxor
    //   505: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   510: invokevirtual equals : (Ljava/lang/Object;)Z
    //   513: ifne -> 772
    //   516: goto -> 913
    //   519: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   522: athrow
    //   523: aload #20
    //   525: sipush #22211
    //   528: ldc2_w 428651920716548325
    //   531: lload_1
    //   532: lxor
    //   533: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   538: invokevirtual equals : (Ljava/lang/Object;)Z
    //   541: ifne -> 878
    //   544: goto -> 913
    //   547: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   550: athrow
    //   551: aload #20
    //   553: sipush #14560
    //   556: ldc2_w 3714263457347938012
    //   559: lload_1
    //   560: lxor
    //   561: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   566: invokevirtual equals : (Ljava/lang/Object;)Z
    //   569: ifne -> 898
    //   572: goto -> 913
    //   575: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   578: athrow
    //   579: aload #20
    //   581: sipush #18101
    //   584: ldc2_w 2695453028103182475
    //   587: lload_1
    //   588: lxor
    //   589: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   594: invokevirtual equals : (Ljava/lang/Object;)Z
    //   597: ifne -> 850
    //   600: goto -> 913
    //   603: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   606: athrow
    //   607: aload #20
    //   609: sipush #23784
    //   612: ldc2_w 529428552603648732
    //   615: lload_1
    //   616: lxor
    //   617: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   622: invokevirtual equals : (Ljava/lang/Object;)Z
    //   625: ifne -> 731
    //   628: goto -> 913
    //   631: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   634: athrow
    //   635: aload #20
    //   637: sipush #1791
    //   640: ldc2_w 7538543982251088073
    //   643: lload_1
    //   644: lxor
    //   645: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   650: invokevirtual equals : (Ljava/lang/Object;)Z
    //   653: ifne -> 759
    //   656: goto -> 913
    //   659: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   662: athrow
    //   663: aload #20
    //   665: sipush #18491
    //   668: ldc2_w 1261316136502384152
    //   671: lload_1
    //   672: lxor
    //   673: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   678: invokevirtual equals : (Ljava/lang/Object;)Z
    //   681: ifne -> 746
    //   684: goto -> 913
    //   687: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   690: athrow
    //   691: aload #20
    //   693: sipush #11945
    //   696: ldc2_w 661250384483561627
    //   699: lload_1
    //   700: lxor
    //   701: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   706: invokevirtual equals : (Ljava/lang/Object;)Z
    //   709: ifeq -> 913
    //   712: new me/rerere/matrix/internal/pg
    //   715: dup
    //   716: lload #14
    //   718: invokespecial <init> : (J)V
    //   721: checkcast me/rerere/matrix/internal/k
    //   724: goto -> 952
    //   727: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   730: athrow
    //   731: new me/rerere/matrix/internal/zn
    //   734: dup
    //   735: lload #5
    //   737: invokespecial <init> : (J)V
    //   740: checkcast me/rerere/matrix/internal/k
    //   743: goto -> 952
    //   746: new me/rerere/matrix/internal/ff
    //   749: dup
    //   750: invokespecial <init> : ()V
    //   753: checkcast me/rerere/matrix/internal/k
    //   756: goto -> 952
    //   759: new me/rerere/matrix/internal/xe
    //   762: dup
    //   763: invokespecial <init> : ()V
    //   766: checkcast me/rerere/matrix/internal/k
    //   769: goto -> 952
    //   772: new me/rerere/matrix/internal/tf
    //   775: dup
    //   776: invokespecial <init> : ()V
    //   779: checkcast me/rerere/matrix/internal/k
    //   782: goto -> 952
    //   785: new me/rerere/matrix/internal/ag
    //   788: dup
    //   789: invokespecial <init> : ()V
    //   792: checkcast me/rerere/matrix/internal/k
    //   795: goto -> 952
    //   798: new me/rerere/matrix/internal/qe
    //   801: dup
    //   802: invokespecial <init> : ()V
    //   805: checkcast me/rerere/matrix/internal/k
    //   808: goto -> 952
    //   811: new me/rerere/matrix/internal/id
    //   814: dup
    //   815: invokespecial <init> : ()V
    //   818: checkcast me/rerere/matrix/internal/k
    //   821: goto -> 952
    //   824: new me/rerere/matrix/internal/ej
    //   827: dup
    //   828: invokespecial <init> : ()V
    //   831: checkcast me/rerere/matrix/internal/k
    //   834: goto -> 952
    //   837: new me/rerere/matrix/internal/ek
    //   840: dup
    //   841: invokespecial <init> : ()V
    //   844: checkcast me/rerere/matrix/internal/k
    //   847: goto -> 952
    //   850: new me/rerere/matrix/internal/og
    //   853: dup
    //   854: invokespecial <init> : ()V
    //   857: checkcast me/rerere/matrix/internal/k
    //   860: goto -> 952
    //   863: new me/rerere/matrix/internal/je
    //   866: dup
    //   867: lload #12
    //   869: invokespecial <init> : (J)V
    //   872: checkcast me/rerere/matrix/internal/k
    //   875: goto -> 952
    //   878: new me/rerere/matrix/internal/vf
    //   881: dup
    //   882: iload #7
    //   884: i2c
    //   885: iload #8
    //   887: iload #9
    //   889: invokespecial <init> : (CII)V
    //   892: checkcast me/rerere/matrix/internal/k
    //   895: goto -> 952
    //   898: new me/rerere/matrix/internal/td
    //   901: dup
    //   902: lload #10
    //   904: invokespecial <init> : (J)V
    //   907: checkcast me/rerere/matrix/internal/k
    //   910: goto -> 952
    //   913: new me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   916: dup
    //   917: new java/lang/StringBuilder
    //   920: dup
    //   921: invokespecial <init> : ()V
    //   924: sipush #17481
    //   927: ldc2_w 3120955234965576316
    //   930: lload_1
    //   931: lxor
    //   932: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   937: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   940: aload #19
    //   942: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   945: invokevirtual toString : ()Ljava/lang/String;
    //   948: invokespecial <init> : (Ljava/lang/String;)V
    //   951: athrow
    //   952: invokevirtual b : (Lme/rerere/matrix/internal/k;)V
    //   955: invokestatic b : ()I
    //   958: istore #20
    //   960: bipush #13
    //   962: iload #20
    //   964: lload_1
    //   965: lconst_0
    //   966: lcmp
    //   967: ifle -> 1008
    //   970: iload #18
    //   972: ifne -> 1008
    //   975: if_icmpgt -> 1023
    //   978: goto -> 985
    //   981: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   984: athrow
    //   985: iload #20
    //   987: iload #18
    //   989: ifne -> 1020
    //   992: goto -> 999
    //   995: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   998: athrow
    //   999: bipush #17
    //   1001: goto -> 1008
    //   1004: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   1007: athrow
    //   1008: if_icmpge -> 1019
    //   1011: iconst_1
    //   1012: goto -> 1024
    //   1015: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   1018: athrow
    //   1019: iconst_0
    //   1020: goto -> 1024
    //   1023: iconst_0
    //   1024: ifeq -> 1115
    //   1027: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   1030: lload #16
    //   1032: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   1035: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   1038: sipush #12181
    //   1041: ldc2_w 8509720215890047413
    //   1044: lload_1
    //   1045: lxor
    //   1046: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   1051: invokevirtual warning : (Ljava/lang/String;)V
    //   1054: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   1057: lload #16
    //   1059: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   1062: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   1065: sipush #3726
    //   1068: ldc2_w 6364529954598752428
    //   1071: lload_1
    //   1072: lxor
    //   1073: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   1078: invokevirtual warning : (Ljava/lang/String;)V
    //   1081: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   1084: lload #16
    //   1086: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   1089: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   1092: sipush #5111
    //   1095: ldc2_w 2901588867613822415
    //   1098: lload_1
    //   1099: lxor
    //   1100: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   1105: invokevirtual warning : (Ljava/lang/String;)V
    //   1108: goto -> 1115
    //   1111: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   1114: athrow
    //   1115: return
    // Exception table:
    //   from	to	target	type
    //   98	108	111	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   117	264	264	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   125	286	289	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   299	323	323	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   327	351	351	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   355	379	379	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   383	407	407	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   411	435	435	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   439	463	463	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   467	491	491	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   495	519	519	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   523	547	547	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   551	575	575	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   579	603	603	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   607	631	631	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   635	659	659	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   663	687	687	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   691	727	727	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   960	978	981	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   975	992	995	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   985	1001	1004	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   1008	1015	1015	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
    //   1024	1108	1111	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
  }
  
  @NotNull
  public final k b(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/yj.b : J
    //   26: lxor
    //   27: lstore #4
    //   29: aload_0
    //   30: getfield i : Lme/rerere/matrix/internal/k;
    //   33: dup
    //   34: ifnull -> 42
    //   37: areturn
    //   38: invokestatic a : (Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;)Lme/rerere/matrix/api/exception/UnknownMinecraftVersionException;
    //   41: athrow
    //   42: pop
    //   43: sipush #23986
    //   46: ldc2_w 6675488842551735402
    //   49: lload #4
    //   51: lxor
    //   52: <illegal opcode> a : (IJ)Ljava/lang/String;
    //   57: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   60: aconst_null
    //   61: areturn
    // Exception table:
    //   from	to	target	type
    //   29	38	38	me/rerere/matrix/api/exception/UnknownMinecraftVersionException
  }
  
  public static void i(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean U() {
    return a;
  }
  
  public static boolean J() {
    boolean bool = U();
    try {
      if (!bool)
        return true; 
    } catch (UnknownMinecraftVersionException unknownMinecraftVersionException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = b ^ 0x61345D2AC507L;
    i(true);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[21];
    boolean bool = false;
    String str;
    int i = (str = "¹\005þ£±¾â\020ÅÄó\0173·\030ÚR¹ïÚQÔâ\022$éÔÔzlØµ*<t\\\030,*Ä)¯ÿâÅGÄfÑ¢iÍwghÔPù\000\006Ù 4¨*OÅ;/NéeKfr\00292ëÆU\bI\007\007JÁi® \026¨ÉÎ¹h¨§&gwkðl<\035øWW8¹Ì*õF±Çff\020\034ä]EØ8õÐÕÃÉ\030Øm\016 ÝÕ\0209\004i I^c'ÄÙî+Âv\nOTÕ¬Nª\r\03798LÖo(ÀæÖ¦\031)PrÈ(¿Q\031»×wýßð\025ÌnÂÍ°ÄÀFjC'\025_Ä\0059ÞuÐÙÊìuî\030d °rÉcSM½ðiÈÎÆ-\013fj»m»\0304NÏ\\I:+Fy\031[cÀj¥øMWIç2h0­\017kãÍU¯Ä\021~C\002 ßÏ\t~,Ä÷Y£9ÛïÇ pCYõOtñ¬Ã©l$Ã\032rÝLyï½Av·ÓªµÝ{,»uÙ\016\fö}{ \032À|\017®ÜIç¥3Ó§ÀÓ·h2é7Ä\030\037âÙ¬JùÙ&ü\016¸\037EýA}MÓ# ô\0039J9ÿ\030#ù,ye[òCä£õ\013ª3T ÅøßoBE\030\037-\027Vú§d'ª\032ü\t\0012{»\f[Á\030/é\036W3± ¹ÚôÄËaÕÍ\001fîÑÞåå Ç\b`©3ÅÅ ßm\023nÚöWÇH\025DÅ(ehÀ\027Í}ÙÓx\005Ób}=5×ÒTQýBøë^=ÐW2éR\027­¦Î{\002çLÇD=ê6êa³s0©®%ÔÇD¶%àýJK¾5 E1iúPê&ô_\006aá+\n$ö;Ña\032PüÍ\003~;^ê<l§ À_l\031ïUj§@Ð´\005\005Ý?[=a'/W}\006lMö&pÕ®;bÜ\001\016óì\n î\023Ç\033¼¨¶J§!ïÇX\034&9\n\020cè§Ã\025Â/@7*u7\027\\\033áC\002)ûÍ\\Ñé|ã'§C¬®¿\000\003\020Ê\036Â¹¥s÷¾×4×Âb]%Æ?\027s\023\003èæÅ¿ìóôî;*").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static UnknownMinecraftVersionException a(UnknownMinecraftVersionException paramUnknownMinecraftVersionException) {
    return paramUnknownMinecraftVersionException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4741;
    if (d[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])e.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          e.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/yj", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/yj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\yj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
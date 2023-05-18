package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ge extends uj {
  public static boolean y;
  
  @NotNull
  public static final Map m;
  
  public static boolean o;
  
  public static String q;
  
  public static int t;
  
  public static boolean g;
  
  public static boolean a;
  
  public static boolean s;
  
  public static int u;
  
  public static boolean w;
  
  public static List f;
  
  public static double l;
  
  public static int r;
  
  public static boolean x;
  
  public static boolean z;
  
  public static boolean k;
  
  @NotNull
  public static final Map v;
  
  public static long b;
  
  public static int i;
  
  private static String[] d;
  
  private static final long e = o3.a(7776387319094838467L, 4697164084569501653L, MethodHandles.lookup().lookupClass()).a(107581440500656L);
  
  private static final String[] j;
  
  private static final String[] n;
  
  private static final Map p = new HashMap<>(13);
  
  public void b(byte paramByte, long paramLong) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #56
    //   4: lshl
    //   5: lload_2
    //   6: bipush #8
    //   8: lshl
    //   9: bipush #8
    //   11: lushr
    //   12: lor
    //   13: lstore #4
    //   15: lload #4
    //   17: dup2
    //   18: ldc2_w 0
    //   21: lxor
    //   22: dup2
    //   23: bipush #56
    //   25: lushr
    //   26: l2i
    //   27: istore #6
    //   29: dup2
    //   30: bipush #8
    //   32: lshl
    //   33: bipush #8
    //   35: lushr
    //   36: lstore #7
    //   38: pop2
    //   39: pop2
    //   40: aload_0
    //   41: iload #6
    //   43: i2b
    //   44: lload #7
    //   46: invokespecial b : (BJ)V
    //   49: getstatic me/rerere/matrix/internal/ge.m : Ljava/util/Map;
    //   52: invokeinterface clear : ()V
    //   57: getstatic me/rerere/matrix/internal/ge.v : Ljava/util/Map;
    //   60: invokeinterface clear : ()V
    //   65: invokestatic a : ()I
    //   68: aload_0
    //   69: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   72: sipush #26457
    //   75: ldc2_w 8622776771896357755
    //   78: lload #4
    //   80: lxor
    //   81: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   86: iconst_0
    //   87: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   90: putstatic me/rerere/matrix/internal/ge.z : Z
    //   93: aload_0
    //   94: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   97: sipush #23048
    //   100: ldc2_w 580737375403413027
    //   103: lload #4
    //   105: lxor
    //   106: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   111: iconst_0
    //   112: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   115: putstatic me/rerere/matrix/internal/ge.s : Z
    //   118: aload_0
    //   119: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   122: sipush #6275
    //   125: ldc2_w 5971722358250327211
    //   128: lload #4
    //   130: lxor
    //   131: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   136: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   139: putstatic me/rerere/matrix/internal/ge.y : Z
    //   142: aload_0
    //   143: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   146: sipush #15818
    //   149: ldc2_w 3078200124335417849
    //   152: lload #4
    //   154: lxor
    //   155: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   160: ldc2_w 17.0
    //   163: invokevirtual getDouble : (Ljava/lang/String;D)D
    //   166: putstatic me/rerere/matrix/internal/ge.l : D
    //   169: aload_0
    //   170: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   173: sipush #30847
    //   176: ldc2_w 8927377168487132225
    //   179: lload #4
    //   181: lxor
    //   182: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   187: ldc2_w 155
    //   190: invokevirtual getLong : (Ljava/lang/String;J)J
    //   193: putstatic me/rerere/matrix/internal/ge.b : J
    //   196: aload_0
    //   197: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   200: sipush #17379
    //   203: ldc2_w 4752424064310351820
    //   206: lload #4
    //   208: lxor
    //   209: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   214: iconst_0
    //   215: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   218: putstatic me/rerere/matrix/internal/ge.x : Z
    //   221: aload_0
    //   222: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   225: sipush #19260
    //   228: ldc2_w 1301423457884446495
    //   231: lload #4
    //   233: lxor
    //   234: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   239: invokevirtual getStringList : (Ljava/lang/String;)Ljava/util/List;
    //   242: putstatic me/rerere/matrix/internal/ge.f : Ljava/util/List;
    //   245: aload_0
    //   246: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   249: sipush #9216
    //   252: ldc2_w 1571634649591541820
    //   255: lload #4
    //   257: lxor
    //   258: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   263: iconst_1
    //   264: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   267: putstatic me/rerere/matrix/internal/ge.o : Z
    //   270: istore #9
    //   272: aload_0
    //   273: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   276: sipush #2045
    //   279: ldc2_w 745318241233589191
    //   282: lload #4
    //   284: lxor
    //   285: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   290: iconst_0
    //   291: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   294: putstatic me/rerere/matrix/internal/ge.k : Z
    //   297: aload_0
    //   298: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   301: sipush #22104
    //   304: ldc2_w 5108926878850089571
    //   307: lload #4
    //   309: lxor
    //   310: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   315: iconst_m1
    //   316: invokevirtual getInt : (Ljava/lang/String;I)I
    //   319: putstatic me/rerere/matrix/internal/ge.i : I
    //   322: aload_0
    //   323: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   326: sipush #5793
    //   329: ldc2_w 7126897896675066512
    //   332: lload #4
    //   334: lxor
    //   335: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   340: iconst_0
    //   341: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   344: putstatic me/rerere/matrix/internal/ge.w : Z
    //   347: aload_0
    //   348: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   351: sipush #6768
    //   354: ldc2_w 1080208038374559322
    //   357: lload #4
    //   359: lxor
    //   360: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   365: bipush #15
    //   367: invokevirtual getInt : (Ljava/lang/String;I)I
    //   370: putstatic me/rerere/matrix/internal/ge.r : I
    //   373: aload_0
    //   374: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   377: sipush #23569
    //   380: ldc2_w 8975884823187228709
    //   383: lload #4
    //   385: lxor
    //   386: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   391: iconst_1
    //   392: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   395: putstatic me/rerere/matrix/internal/ge.a : Z
    //   398: aload_0
    //   399: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   402: sipush #21954
    //   405: ldc2_w 8111084650091545074
    //   408: lload #4
    //   410: lxor
    //   411: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   416: iconst_0
    //   417: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   420: putstatic me/rerere/matrix/internal/ge.g : Z
    //   423: aload_0
    //   424: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   427: sipush #6272
    //   430: ldc2_w 4435813222012439735
    //   433: lload #4
    //   435: lxor
    //   436: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   441: bipush #30
    //   443: invokevirtual getInt : (Ljava/lang/String;I)I
    //   446: putstatic me/rerere/matrix/internal/ge.t : I
    //   449: aload_0
    //   450: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   453: sipush #3511
    //   456: ldc2_w 7466315975760730510
    //   459: lload #4
    //   461: lxor
    //   462: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   467: bipush #11
    //   469: invokevirtual getInt : (Ljava/lang/String;I)I
    //   472: putstatic me/rerere/matrix/internal/ge.u : I
    //   475: invokestatic getenv : ()Ljava/util/Map;
    //   478: sipush #29869
    //   481: ldc2_w 2610677927856152705
    //   484: lload #4
    //   486: lxor
    //   487: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   492: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   497: iload #9
    //   499: ifne -> 572
    //   502: ifeq -> 544
    //   505: goto -> 512
    //   508: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   511: athrow
    //   512: sipush #6469
    //   515: ldc2_w 524612801318243
    //   518: lload #4
    //   520: lxor
    //   521: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   526: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
    //   529: putstatic me/rerere/matrix/internal/ge.q : Ljava/lang/String;
    //   532: iload #9
    //   534: ifeq -> 747
    //   537: goto -> 544
    //   540: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   543: athrow
    //   544: aload_0
    //   545: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   548: sipush #30494
    //   551: ldc2_w 6098686135081902892
    //   554: lload #4
    //   556: lxor
    //   557: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   562: invokevirtual contains : (Ljava/lang/String;)Z
    //   565: goto -> 572
    //   568: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   571: athrow
    //   572: iload_1
    //   573: iflt -> 636
    //   576: iload #9
    //   578: ifne -> 636
    //   581: ifeq -> 639
    //   584: goto -> 591
    //   587: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   590: athrow
    //   591: aload_0
    //   592: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   595: sipush #31963
    //   598: ldc2_w 222826436700317926
    //   601: lload #4
    //   603: lxor
    //   604: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   609: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   612: iload #9
    //   614: ifne -> 744
    //   617: goto -> 624
    //   620: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   623: athrow
    //   624: ldc ''
    //   626: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   629: goto -> 636
    //   632: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   635: athrow
    //   636: ifeq -> 721
    //   639: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   642: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   645: sipush #28221
    //   648: ldc2_w 4571862746399160860
    //   651: lload #4
    //   653: lxor
    //   654: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   659: invokevirtual warning : (Ljava/lang/String;)V
    //   662: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   665: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   668: sipush #7609
    //   671: ldc2_w 8262015640239360390
    //   674: lload #4
    //   676: lxor
    //   677: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   682: invokevirtual warning : (Ljava/lang/String;)V
    //   685: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   688: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   691: sipush #23816
    //   694: ldc2_w 2676292423614531902
    //   697: lload #4
    //   699: lxor
    //   700: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   705: invokevirtual warning : (Ljava/lang/String;)V
    //   708: ldc2_w 5000
    //   711: invokestatic b : (J)V
    //   714: goto -> 721
    //   717: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   720: athrow
    //   721: aload_0
    //   722: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   725: sipush #31963
    //   728: ldc2_w 222826436700317926
    //   731: lload #4
    //   733: lxor
    //   734: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   739: ldc ''
    //   741: invokevirtual getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   744: putstatic me/rerere/matrix/internal/ge.q : Ljava/lang/String;
    //   747: aload_0
    //   748: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   751: sipush #361
    //   754: ldc2_w 4827040295605196105
    //   757: lload #4
    //   759: lxor
    //   760: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   765: invokevirtual getConfigurationSection : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   768: astore #10
    //   770: aload #10
    //   772: iload #9
    //   774: iload_1
    //   775: iflt -> 794
    //   778: ifne -> 793
    //   781: ifnull -> 969
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   790: athrow
    //   791: aload #10
    //   793: iconst_0
    //   794: invokeinterface getKeys : (Z)Ljava/util/Set;
    //   799: invokeinterface iterator : ()Ljava/util/Iterator;
    //   804: astore #11
    //   806: aload #11
    //   808: invokeinterface hasNext : ()Z
    //   813: ifeq -> 969
    //   816: aload #11
    //   818: invokeinterface next : ()Ljava/lang/Object;
    //   823: checkcast java/lang/String
    //   826: astore #12
    //   828: aload #10
    //   830: aload #12
    //   832: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
    //   837: astore #13
    //   839: aload #13
    //   841: invokestatic valueOf : (Ljava/lang/String;)Lorg/bukkit/event/EventPriority;
    //   844: astore #14
    //   846: getstatic me/rerere/matrix/internal/ge.m : Ljava/util/Map;
    //   849: aload #12
    //   851: aload #14
    //   853: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   858: pop
    //   859: new java/lang/StringBuilder
    //   862: dup
    //   863: invokespecial <init> : ()V
    //   866: sipush #2262
    //   869: ldc2_w 5030872717238328547
    //   872: lload #4
    //   874: lxor
    //   875: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   880: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   883: aload #12
    //   885: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   888: sipush #13903
    //   891: ldc2_w 5612372725237932641
    //   894: lload #4
    //   896: lxor
    //   897: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   902: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   905: aload #14
    //   907: invokevirtual name : ()Ljava/lang/String;
    //   910: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   913: invokevirtual toString : ()Ljava/lang/String;
    //   916: invokestatic b : (Ljava/lang/String;)V
    //   919: goto -> 964
    //   922: astore #14
    //   924: aload #14
    //   926: invokevirtual printStackTrace : ()V
    //   929: new java/lang/StringBuilder
    //   932: dup
    //   933: invokespecial <init> : ()V
    //   936: sipush #27981
    //   939: ldc2_w 3171704907003967850
    //   942: lload #4
    //   944: lxor
    //   945: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   950: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   953: aload #13
    //   955: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   958: invokevirtual toString : ()Ljava/lang/String;
    //   961: invokestatic b : (Ljava/lang/String;)V
    //   964: iload #9
    //   966: ifeq -> 806
    //   969: aload_0
    //   970: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/file/YamlFile;
    //   973: sipush #16474
    //   976: ldc2_w 4861030888278791287
    //   979: lload #4
    //   981: lxor
    //   982: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   987: invokevirtual getStringList : (Ljava/lang/String;)Ljava/util/List;
    //   990: astore #11
    //   992: aload #11
    //   994: invokeinterface iterator : ()Ljava/util/Iterator;
    //   999: astore #12
    //   1001: aload #12
    //   1003: invokeinterface hasNext : ()Z
    //   1008: ifeq -> 1184
    //   1011: aload #12
    //   1013: invokeinterface next : ()Ljava/lang/Object;
    //   1018: checkcast java/lang/String
    //   1021: astore #13
    //   1023: aload #13
    //   1025: ldc_w ':'
    //   1028: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   1031: astore #14
    //   1033: aload #14
    //   1035: iload #9
    //   1037: iload_1
    //   1038: iflt -> 1118
    //   1041: ifne -> 1117
    //   1044: arraylength
    //   1045: iconst_2
    //   1046: if_icmpge -> 1115
    //   1049: goto -> 1056
    //   1052: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1055: athrow
    //   1056: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   1059: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   1062: new java/lang/StringBuilder
    //   1065: dup
    //   1066: invokespecial <init> : ()V
    //   1069: sipush #15913
    //   1072: ldc2_w 6470894293343660544
    //   1075: lload #4
    //   1077: lxor
    //   1078: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   1083: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1086: aload #13
    //   1088: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1091: invokevirtual toString : ()Ljava/lang/String;
    //   1094: invokevirtual warning : (Ljava/lang/String;)V
    //   1097: iload #9
    //   1099: lload_2
    //   1100: lconst_0
    //   1101: lcmp
    //   1102: iflt -> 1008
    //   1105: ifeq -> 1001
    //   1108: goto -> 1115
    //   1111: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1114: athrow
    //   1115: aload #14
    //   1117: iconst_0
    //   1118: aaload
    //   1119: astore #15
    //   1121: aload #14
    //   1123: iconst_1
    //   1124: aaload
    //   1125: invokestatic b : (Ljava/lang/String;)Z
    //   1128: iload #9
    //   1130: ifne -> 1157
    //   1133: ifeq -> 1160
    //   1136: goto -> 1143
    //   1139: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1142: athrow
    //   1143: aload #14
    //   1145: iconst_1
    //   1146: aaload
    //   1147: invokestatic parseInt : (Ljava/lang/String;)I
    //   1150: goto -> 1157
    //   1153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   1156: athrow
    //   1157: goto -> 1161
    //   1160: iconst_1
    //   1161: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1164: astore #16
    //   1166: getstatic me/rerere/matrix/internal/ge.v : Ljava/util/Map;
    //   1169: aload #15
    //   1171: aload #16
    //   1173: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1178: pop
    //   1179: iload #9
    //   1181: ifeq -> 1001
    //   1184: iload_1
    //   1185: iflt -> 1001
    //   1188: return
    // Exception table:
    //   from	to	target	type
    //   272	505	508	java/lang/Exception
    //   502	537	540	java/lang/Exception
    //   512	565	568	java/lang/Exception
    //   572	584	587	java/lang/Exception
    //   581	617	620	java/lang/Exception
    //   591	629	632	java/lang/Exception
    //   636	714	717	java/lang/Exception
    //   770	784	787	java/lang/Exception
    //   839	919	922	java/lang/Exception
    //   1033	1049	1052	java/lang/Exception
    //   1044	1108	1111	java/lang/Exception
    //   1121	1136	1139	java/lang/Exception
    //   1133	1150	1153	java/lang/Exception
  }
  
  public ge(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ge.e : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 133660926887577
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: aload_0
    //   15: lload_3
    //   16: sipush #32631
    //   19: ldc2_w 4113796176924233994
    //   22: lload_1
    //   23: lxor
    //   24: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   29: invokespecial <init> : (JLjava/lang/String;)V
    //   32: return
  }
  
  static {
    n(new String[4]);
    long l = e ^ 0x690B8A8A5EC5L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[30];
    boolean bool = false;
    String str;
    int i = (str = "l+ÙIÁHz\021¡Q£ÝV<RC¥XÆ\030Ö/Øec#½U\bný\033ÿ\004zl\033N\017(R\030ï]Ë¤jÍ@$æíþÒã\034Í¸\0200h®4¡~ÿ\030LôCÐ\007¥É\fk ÅlkpBä\036=W/$j&b'\021/3Q2\030+5PêµðxS@úûØ¾\022}ðòz[S\003Ò®í\027s)Îú+\001m\007\023Höí?ÎÎ\017k·p±¿P\rk\004tTwÛgÜúëÐåÙ?Zùu\013\bm0\027ÈßMg¡Þ~¡Ð\006¤\0329äTB¢{¿Ëú<X\032HÝ,¢öb¶\002\020ëWá\b\026ú\004¬­ª\030ÅÓB{?ÈgdàÅO¿zîÚQÍ¬Ê\034î \0357u\nÞ<60@Ó\"Þ¶d\0327¹êø-ÜîAè¯Wrg¶(\\\n\022*V§+#Bv5³:\024àRu®B@²7\004ënÈRÌ¸1òlµ\rð^ ¹÷jK8ðQ.jlÆ²µ|ùÂdæ4\007nüû(Î.\024¤\002:g¨)íaúÁ¤WÛ?îûÓvÿàb\024\013ç¢\027ÿÇÐºG½±+(\024lh\025Dæt^é°`LÃñV,ÖA\027)Wg1N]Õ¶¦È¦5hý¥\034üº\030î\fi§\035i\003<FgVÊQïÁÏ[&ÐXÃ(\036z~ã£.ýÛ`öð²W\025¬À\004ºQÎ1õó'\"&O¶ÀB\bL~¶Dõ\035#£èßÖå5)\031Êw©Æçyo]\035·÷°bcka¦îÁB[¸÷uKÀO(î;´M\022v¦JRYQr\033Ú!(í¥<î£)ã\0002ã\003^\035÷O!ð\027³ôÙ(\007Kp×o£X=ûjÐþð¶Ä8S²\016MüðrÃÄ[`½!\035®W,\020\030?ÚQZ\001Mcà\035ÛPOUa\n£&Pz=[ù8ô¦m×ë¹\031Ô\000Ã¶xû­~ ù°ûð!´\r.é§\034ç\016ª÷\fà\003\\ÈÚ\b¨\020LHÿw\023S UBû8\fDyÌ= Ä(ÙàÚ70\021\004\023(K:öq­àPf`\0316\025®û>Þq¹\032x~¸,_z½ÉsÜy(é<ô´`_\001Ì\022E\036Qhs§òÔÿ[?Òzx»ÑÕð; Ù\007KXó89ÎXvp¬Ò®¤WY\"LL9q\"_\013Ë\024ò\riv+\bÃ'j\001\025\000ºû.Jñ\013~àOTî\\\020ø~\037=ÙCë\030âCXý\002Ô(#Y\000p®´ùbØ×¢â:RªôÐMÕÐ\037ð\035Ò\007ÄL¬8u#Âjõh(ah¡öG\0213 £Ê3ËêT°¤\001Ïd)àk¿jYÊû\036\033ÓF4Å¼¶³_(Å´BeVv?\020LÍÂ¶\030¹\002]ô¡á8\036\003V\031O>Â(/n¾e\f{ô_(¥\031_9Ã¸e£-6`þLgrä¼\035SÊÇ}ìt ÌÍÿC³ÂTI\\æP\t(0n/\002FÁZiúÕ0\006lÍ2læ\020¹GF×§õs½x`\017á\027¡À<lJi_¶1Î8}$F®è\001?óX¯\034ïïmð-6\032 î5GøB>¹ ¯¤ì\017odEøT2y\016²kùf\033äÈ^ä\035­Ì$ÆõE").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  public static void n(String[] paramArrayOfString) {
    d = paramArrayOfString;
  }
  
  public static String[] l() {
    return d;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2E66;
    if (n[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])p.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          p.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ge", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = j[i].getBytes("ISO-8859-1");
      n[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return n[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/ge'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
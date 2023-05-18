package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
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
import me.rerere.matrix.thirdparty.kotlin.math.MathKt;
import me.rerere.matrix.thirdparty.kotlin.ranges.ClosedRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class en extends zk {
  private float g;
  
  private float a;
  
  private final double s = ((float)Math.pow(0.2F, 3) * 8) * 0.15D - 0.001D;
  
  private int u;
  
  private float w;
  
  private final int f = 10;
  
  private int l;
  
  private float r;
  
  private final int x = 60;
  
  private float z;
  
  @NotNull
  private final sb k = new sb(this.x);
  
  @NotNull
  private final sb v = new sb(this.x);
  
  private float b;
  
  private final double i = 1.2E-4D;
  
  private static final long c = o3.a(-5323552105181091466L, 3749681942777714584L, MethodHandles.lookup().lookupClass()).a(147332148831817L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  public void b(int paramInt1, int paramInt2) {
    if (this.u > 0) {
      int i = this.u;
      try {
        this.u = i + -1;
        if (this.u == 0) {
          this.w = 0.0F;
          this.z = 0.0F;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public en(@NotNull yl paramyl) {
    super(paramyl, yk.n);
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 57264538460161
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 48574722703755
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 53778054797842
    //   19: lxor
    //   20: lstore #9
    //   22: dup2
    //   23: ldc2_w 52958254738473
    //   26: lxor
    //   27: lstore #11
    //   29: dup2
    //   30: ldc2_w 84775703317961
    //   33: lxor
    //   34: dup2
    //   35: bipush #32
    //   37: lushr
    //   38: l2i
    //   39: istore #13
    //   41: dup2
    //   42: bipush #32
    //   44: lshl
    //   45: bipush #48
    //   47: lushr
    //   48: l2i
    //   49: istore #14
    //   51: dup2
    //   52: bipush #48
    //   54: lshl
    //   55: bipush #48
    //   57: lushr
    //   58: l2i
    //   59: istore #15
    //   61: pop2
    //   62: pop2
    //   63: lload #5
    //   65: aload #4
    //   67: invokestatic b : (JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   70: ifeq -> 86
    //   73: aload_0
    //   74: bipush #20
    //   76: putfield u : I
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: lload #9
    //   88: aload_1
    //   89: invokestatic p : (JLcom/comphenix/protocol/PacketType;)Z
    //   92: ifeq -> 2507
    //   95: aload #4
    //   97: iconst_0
    //   98: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)F
    //   101: fstore #16
    //   103: aload #4
    //   105: iconst_1
    //   106: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)F
    //   109: fstore #17
    //   111: fload #16
    //   113: aload_0
    //   114: getfield w : F
    //   117: fsub
    //   118: invokestatic abs : (F)F
    //   121: fstore #18
    //   123: fload #17
    //   125: aload_0
    //   126: getfield z : F
    //   129: fsub
    //   130: invokestatic abs : (F)F
    //   133: fstore #19
    //   135: fconst_0
    //   136: fload #18
    //   138: fcmpg
    //   139: ifgt -> 169
    //   142: fload #18
    //   144: ldc 5.0
    //   146: fcmpg
    //   147: ifgt -> 165
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: iconst_1
    //   158: goto -> 170
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: iconst_0
    //   166: goto -> 170
    //   169: iconst_0
    //   170: ifeq -> 227
    //   173: aload_0
    //   174: fload #18
    //   176: f2d
    //   177: aload_0
    //   178: getfield a : F
    //   181: f2d
    //   182: invokespecial b : (DD)D
    //   185: dstore #20
    //   187: dload #20
    //   189: aload_0
    //   190: getfield s : D
    //   193: dcmpl
    //   194: ifle -> 227
    //   197: aload_0
    //   198: getfield k : Lme/rerere/matrix/internal/sb;
    //   201: dload #20
    //   203: invokestatic valueOf : (D)Ljava/lang/Double;
    //   206: iload #13
    //   208: swap
    //   209: iload #14
    //   211: i2c
    //   212: swap
    //   213: iload #15
    //   215: i2s
    //   216: swap
    //   217: invokevirtual j : (ICSLjava/lang/Object;)V
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: fconst_0
    //   228: fload #19
    //   230: fcmpg
    //   231: ifgt -> 261
    //   234: fload #19
    //   236: ldc 5.0
    //   238: fcmpg
    //   239: ifgt -> 257
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: iconst_1
    //   250: goto -> 262
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: iconst_0
    //   258: goto -> 262
    //   261: iconst_0
    //   262: ifeq -> 319
    //   265: aload_0
    //   266: fload #19
    //   268: f2d
    //   269: aload_0
    //   270: getfield b : F
    //   273: f2d
    //   274: invokespecial b : (DD)D
    //   277: dstore #20
    //   279: dload #20
    //   281: aload_0
    //   282: getfield s : D
    //   285: dcmpl
    //   286: ifle -> 319
    //   289: aload_0
    //   290: getfield v : Lme/rerere/matrix/internal/sb;
    //   293: dload #20
    //   295: invokestatic valueOf : (D)Ljava/lang/Double;
    //   298: iload #13
    //   300: swap
    //   301: iload #14
    //   303: i2c
    //   304: swap
    //   305: iload #15
    //   307: i2s
    //   308: swap
    //   309: invokevirtual j : (ICSLjava/lang/Object;)V
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   318: athrow
    //   319: aload_0
    //   320: getfield k : Lme/rerere/matrix/internal/sb;
    //   323: lload #7
    //   325: invokevirtual p : (J)Z
    //   328: ifeq -> 2483
    //   331: aload_0
    //   332: getfield v : Lme/rerere/matrix/internal/sb;
    //   335: lload #7
    //   337: invokevirtual p : (J)Z
    //   340: ifeq -> 2483
    //   343: goto -> 350
    //   346: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   349: athrow
    //   350: aload_0
    //   351: getfield k : Lme/rerere/matrix/internal/sb;
    //   354: checkcast java/lang/Iterable
    //   357: astore #21
    //   359: nop
    //   360: iconst_0
    //   361: istore #22
    //   363: aload #21
    //   365: astore #23
    //   367: new java/util/ArrayList
    //   370: dup
    //   371: aload #21
    //   373: bipush #10
    //   375: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   378: invokespecial <init> : (I)V
    //   381: checkcast java/util/Collection
    //   384: astore #24
    //   386: iconst_0
    //   387: istore #25
    //   389: aload #23
    //   391: invokeinterface iterator : ()Ljava/util/Iterator;
    //   396: astore #26
    //   398: aload #26
    //   400: invokeinterface hasNext : ()Z
    //   405: ifeq -> 462
    //   408: aload #26
    //   410: invokeinterface next : ()Ljava/lang/Object;
    //   415: astore #27
    //   417: aload #24
    //   419: aload #27
    //   421: checkcast java/lang/Number
    //   424: invokevirtual doubleValue : ()D
    //   427: dstore #28
    //   429: astore #36
    //   431: iconst_0
    //   432: istore #30
    //   434: aload_0
    //   435: aload_0
    //   436: dload #28
    //   438: d2f
    //   439: invokespecial j : (F)F
    //   442: lload #11
    //   444: invokespecial b : (FJ)I
    //   447: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   450: aload #36
    //   452: swap
    //   453: invokeinterface add : (Ljava/lang/Object;)Z
    //   458: pop
    //   459: goto -> 398
    //   462: aload #24
    //   464: checkcast java/util/List
    //   467: nop
    //   468: astore #20
    //   470: aload_0
    //   471: getfield v : Lme/rerere/matrix/internal/sb;
    //   474: checkcast java/lang/Iterable
    //   477: astore #22
    //   479: nop
    //   480: iconst_0
    //   481: istore #23
    //   483: aload #22
    //   485: astore #24
    //   487: new java/util/ArrayList
    //   490: dup
    //   491: aload #22
    //   493: bipush #10
    //   495: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   498: invokespecial <init> : (I)V
    //   501: checkcast java/util/Collection
    //   504: astore #25
    //   506: iconst_0
    //   507: istore #26
    //   509: aload #24
    //   511: invokeinterface iterator : ()Ljava/util/Iterator;
    //   516: astore #27
    //   518: aload #27
    //   520: invokeinterface hasNext : ()Z
    //   525: ifeq -> 582
    //   528: aload #27
    //   530: invokeinterface next : ()Ljava/lang/Object;
    //   535: astore #28
    //   537: aload #25
    //   539: aload #28
    //   541: checkcast java/lang/Number
    //   544: invokevirtual doubleValue : ()D
    //   547: dstore #29
    //   549: astore #36
    //   551: iconst_0
    //   552: istore #31
    //   554: aload_0
    //   555: aload_0
    //   556: dload #29
    //   558: d2f
    //   559: invokespecial j : (F)F
    //   562: lload #11
    //   564: invokespecial b : (FJ)I
    //   567: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   570: aload #36
    //   572: swap
    //   573: invokeinterface add : (Ljava/lang/Object;)Z
    //   578: pop
    //   579: goto -> 518
    //   582: aload #25
    //   584: checkcast java/util/List
    //   587: nop
    //   588: astore #21
    //   590: aload #20
    //   592: checkcast java/lang/Iterable
    //   595: astore #24
    //   597: nop
    //   598: iconst_0
    //   599: istore #25
    //   601: new me/rerere/matrix/internal/rh
    //   604: dup
    //   605: aload #24
    //   607: invokespecial <init> : (Ljava/lang/Iterable;)V
    //   610: checkcast me/rerere/matrix/thirdparty/kotlin/collections/Grouping
    //   613: invokestatic eachCount : (Lme/rerere/matrix/thirdparty/kotlin/collections/Grouping;)Ljava/util/Map;
    //   616: astore #24
    //   618: nop
    //   619: iconst_0
    //   620: istore #25
    //   622: aload #24
    //   624: astore #26
    //   626: new java/util/LinkedHashMap
    //   629: dup
    //   630: invokespecial <init> : ()V
    //   633: checkcast java/util/Map
    //   636: astore #27
    //   638: iconst_0
    //   639: istore #28
    //   641: aload #26
    //   643: invokeinterface entrySet : ()Ljava/util/Set;
    //   648: invokeinterface iterator : ()Ljava/util/Iterator;
    //   653: astore #29
    //   655: aload #29
    //   657: invokeinterface hasNext : ()Z
    //   662: ifeq -> 741
    //   665: aload #29
    //   667: invokeinterface next : ()Ljava/lang/Object;
    //   672: checkcast java/util/Map$Entry
    //   675: astore #30
    //   677: aload #30
    //   679: astore #31
    //   681: iconst_0
    //   682: istore #32
    //   684: aload #31
    //   686: invokeinterface getValue : ()Ljava/lang/Object;
    //   691: checkcast java/lang/Number
    //   694: invokevirtual intValue : ()I
    //   697: aload_0
    //   698: getfield f : I
    //   701: if_icmplt -> 712
    //   704: iconst_1
    //   705: goto -> 713
    //   708: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   711: athrow
    //   712: iconst_0
    //   713: ifeq -> 655
    //   716: aload #27
    //   718: aload #30
    //   720: invokeinterface getKey : ()Ljava/lang/Object;
    //   725: aload #30
    //   727: invokeinterface getValue : ()Ljava/lang/Object;
    //   732: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   737: pop
    //   738: goto -> 655
    //   741: aload #27
    //   743: nop
    //   744: invokeinterface entrySet : ()Ljava/util/Set;
    //   749: checkcast java/lang/Iterable
    //   752: astore #25
    //   754: aload #25
    //   756: invokeinterface iterator : ()Ljava/util/Iterator;
    //   761: astore #26
    //   763: aload #26
    //   765: invokeinterface hasNext : ()Z
    //   770: ifne -> 781
    //   773: aconst_null
    //   774: goto -> 895
    //   777: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   780: athrow
    //   781: aload #26
    //   783: invokeinterface next : ()Ljava/lang/Object;
    //   788: astore #27
    //   790: aload #26
    //   792: invokeinterface hasNext : ()Z
    //   797: ifne -> 809
    //   800: aload #27
    //   802: goto -> 895
    //   805: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   808: athrow
    //   809: aload #27
    //   811: checkcast java/util/Map$Entry
    //   814: astore #28
    //   816: iconst_0
    //   817: istore #29
    //   819: aload #28
    //   821: invokeinterface getValue : ()Ljava/lang/Object;
    //   826: checkcast java/lang/Number
    //   829: invokevirtual intValue : ()I
    //   832: istore #28
    //   834: aload #26
    //   836: invokeinterface next : ()Ljava/lang/Object;
    //   841: astore #29
    //   843: aload #29
    //   845: checkcast java/util/Map$Entry
    //   848: astore #30
    //   850: iconst_0
    //   851: istore #31
    //   853: aload #30
    //   855: invokeinterface getValue : ()Ljava/lang/Object;
    //   860: checkcast java/lang/Number
    //   863: invokevirtual intValue : ()I
    //   866: istore #30
    //   868: iload #28
    //   870: iload #30
    //   872: if_icmpge -> 883
    //   875: aload #29
    //   877: astore #27
    //   879: iload #30
    //   881: istore #28
    //   883: aload #26
    //   885: invokeinterface hasNext : ()Z
    //   890: ifne -> 834
    //   893: aload #27
    //   895: checkcast java/util/Map$Entry
    //   898: dup
    //   899: ifnull -> 920
    //   902: invokeinterface getKey : ()Ljava/lang/Object;
    //   907: checkcast java/lang/Number
    //   910: invokevirtual intValue : ()I
    //   913: goto -> 922
    //   916: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   919: athrow
    //   920: pop
    //   921: iconst_m1
    //   922: istore #22
    //   924: aload #21
    //   926: checkcast java/lang/Iterable
    //   929: astore #25
    //   931: nop
    //   932: iconst_0
    //   933: istore #26
    //   935: new me/rerere/matrix/internal/ug
    //   938: dup
    //   939: aload #25
    //   941: invokespecial <init> : (Ljava/lang/Iterable;)V
    //   944: checkcast me/rerere/matrix/thirdparty/kotlin/collections/Grouping
    //   947: invokestatic eachCount : (Lme/rerere/matrix/thirdparty/kotlin/collections/Grouping;)Ljava/util/Map;
    //   950: astore #25
    //   952: nop
    //   953: iconst_0
    //   954: istore #26
    //   956: aload #25
    //   958: astore #27
    //   960: new java/util/LinkedHashMap
    //   963: dup
    //   964: invokespecial <init> : ()V
    //   967: checkcast java/util/Map
    //   970: astore #28
    //   972: iconst_0
    //   973: istore #29
    //   975: aload #27
    //   977: invokeinterface entrySet : ()Ljava/util/Set;
    //   982: invokeinterface iterator : ()Ljava/util/Iterator;
    //   987: astore #30
    //   989: aload #30
    //   991: invokeinterface hasNext : ()Z
    //   996: ifeq -> 1075
    //   999: aload #30
    //   1001: invokeinterface next : ()Ljava/lang/Object;
    //   1006: checkcast java/util/Map$Entry
    //   1009: astore #31
    //   1011: aload #31
    //   1013: astore #32
    //   1015: iconst_0
    //   1016: istore #33
    //   1018: aload #32
    //   1020: invokeinterface getValue : ()Ljava/lang/Object;
    //   1025: checkcast java/lang/Number
    //   1028: invokevirtual intValue : ()I
    //   1031: aload_0
    //   1032: getfield f : I
    //   1035: if_icmplt -> 1046
    //   1038: iconst_1
    //   1039: goto -> 1047
    //   1042: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1045: athrow
    //   1046: iconst_0
    //   1047: ifeq -> 989
    //   1050: aload #28
    //   1052: aload #31
    //   1054: invokeinterface getKey : ()Ljava/lang/Object;
    //   1059: aload #31
    //   1061: invokeinterface getValue : ()Ljava/lang/Object;
    //   1066: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1071: pop
    //   1072: goto -> 989
    //   1075: aload #28
    //   1077: nop
    //   1078: invokeinterface entrySet : ()Ljava/util/Set;
    //   1083: checkcast java/lang/Iterable
    //   1086: astore #26
    //   1088: aload #26
    //   1090: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1095: astore #27
    //   1097: aload #27
    //   1099: invokeinterface hasNext : ()Z
    //   1104: ifne -> 1115
    //   1107: aconst_null
    //   1108: goto -> 1229
    //   1111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1114: athrow
    //   1115: aload #27
    //   1117: invokeinterface next : ()Ljava/lang/Object;
    //   1122: astore #28
    //   1124: aload #27
    //   1126: invokeinterface hasNext : ()Z
    //   1131: ifne -> 1143
    //   1134: aload #28
    //   1136: goto -> 1229
    //   1139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1142: athrow
    //   1143: aload #28
    //   1145: checkcast java/util/Map$Entry
    //   1148: astore #29
    //   1150: iconst_0
    //   1151: istore #30
    //   1153: aload #29
    //   1155: invokeinterface getValue : ()Ljava/lang/Object;
    //   1160: checkcast java/lang/Number
    //   1163: invokevirtual intValue : ()I
    //   1166: istore #29
    //   1168: aload #27
    //   1170: invokeinterface next : ()Ljava/lang/Object;
    //   1175: astore #30
    //   1177: aload #30
    //   1179: checkcast java/util/Map$Entry
    //   1182: astore #31
    //   1184: iconst_0
    //   1185: istore #32
    //   1187: aload #31
    //   1189: invokeinterface getValue : ()Ljava/lang/Object;
    //   1194: checkcast java/lang/Number
    //   1197: invokevirtual intValue : ()I
    //   1200: istore #31
    //   1202: iload #29
    //   1204: iload #31
    //   1206: if_icmpge -> 1217
    //   1209: aload #30
    //   1211: astore #28
    //   1213: iload #31
    //   1215: istore #29
    //   1217: aload #27
    //   1219: invokeinterface hasNext : ()Z
    //   1224: ifne -> 1168
    //   1227: aload #28
    //   1229: checkcast java/util/Map$Entry
    //   1232: dup
    //   1233: ifnull -> 1254
    //   1236: invokeinterface getKey : ()Ljava/lang/Object;
    //   1241: checkcast java/lang/Number
    //   1244: invokevirtual intValue : ()I
    //   1247: goto -> 1256
    //   1250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1253: athrow
    //   1254: pop
    //   1255: iconst_m1
    //   1256: istore #23
    //   1258: iconst_0
    //   1259: iload #22
    //   1261: if_icmpgt -> 1291
    //   1264: iload #22
    //   1266: sipush #201
    //   1269: if_icmpge -> 1287
    //   1272: goto -> 1279
    //   1275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1278: athrow
    //   1279: iconst_1
    //   1280: goto -> 1292
    //   1283: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1286: athrow
    //   1287: iconst_0
    //   1288: goto -> 1292
    //   1291: iconst_0
    //   1292: ifeq -> 2379
    //   1295: iconst_0
    //   1296: iload #23
    //   1298: if_icmpgt -> 1335
    //   1301: goto -> 1308
    //   1304: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1307: athrow
    //   1308: iload #23
    //   1310: sipush #201
    //   1313: if_icmpge -> 1331
    //   1316: goto -> 1323
    //   1319: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1322: athrow
    //   1323: iconst_1
    //   1324: goto -> 1336
    //   1327: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1330: athrow
    //   1331: iconst_0
    //   1332: goto -> 1336
    //   1335: iconst_0
    //   1336: ifeq -> 2379
    //   1339: iload #22
    //   1341: iload #23
    //   1343: isub
    //   1344: invokestatic abs : (I)I
    //   1347: iconst_1
    //   1348: if_icmpgt -> 1366
    //   1351: goto -> 1358
    //   1354: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1357: athrow
    //   1358: iconst_1
    //   1359: goto -> 1367
    //   1362: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1365: athrow
    //   1366: iconst_0
    //   1367: istore #24
    //   1369: iload #24
    //   1371: ifne -> 1446
    //   1374: new java/lang/StringBuilder
    //   1377: dup
    //   1378: invokespecial <init> : ()V
    //   1381: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   1384: invokevirtual toString : ()Ljava/lang/String;
    //   1387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1390: sipush #720
    //   1393: ldc2_w 1022314453820739688
    //   1396: lload_2
    //   1397: lxor
    //   1398: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1403: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1406: iload #22
    //   1408: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1411: sipush #24789
    //   1414: ldc2_w 1503878126127116908
    //   1417: lload_2
    //   1418: lxor
    //   1419: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1427: iload #23
    //   1429: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1432: invokevirtual toString : ()Ljava/lang/String;
    //   1435: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   1438: pop
    //   1439: goto -> 2483
    //   1442: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1445: athrow
    //   1446: aload_0
    //   1447: aload_0
    //   1448: getfield k : Lme/rerere/matrix/internal/sb;
    //   1451: checkcast java/lang/Iterable
    //   1454: astore #26
    //   1456: astore #36
    //   1458: iconst_0
    //   1459: istore #27
    //   1461: aload #26
    //   1463: astore #28
    //   1465: new java/util/ArrayList
    //   1468: dup
    //   1469: aload #26
    //   1471: bipush #10
    //   1473: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   1476: invokespecial <init> : (I)V
    //   1479: checkcast java/util/Collection
    //   1482: astore #29
    //   1484: iconst_0
    //   1485: istore #30
    //   1487: aload #28
    //   1489: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1494: astore #31
    //   1496: aload #31
    //   1498: invokeinterface hasNext : ()Z
    //   1503: ifeq -> 1554
    //   1506: aload #31
    //   1508: invokeinterface next : ()Ljava/lang/Object;
    //   1513: astore #32
    //   1515: aload #29
    //   1517: aload #32
    //   1519: checkcast java/lang/Number
    //   1522: invokevirtual doubleValue : ()D
    //   1525: dstore #33
    //   1527: astore #37
    //   1529: iconst_0
    //   1530: istore #35
    //   1532: aload_0
    //   1533: dload #33
    //   1535: d2f
    //   1536: invokespecial j : (F)F
    //   1539: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1542: aload #37
    //   1544: swap
    //   1545: invokeinterface add : (Ljava/lang/Object;)Z
    //   1550: pop
    //   1551: goto -> 1496
    //   1554: aload #29
    //   1556: checkcast java/util/List
    //   1559: nop
    //   1560: aload #36
    //   1562: swap
    //   1563: checkcast java/lang/Iterable
    //   1566: astore #26
    //   1568: nop
    //   1569: iconst_0
    //   1570: istore #27
    //   1572: new me/rerere/matrix/internal/wm
    //   1575: dup
    //   1576: aload #26
    //   1578: invokespecial <init> : (Ljava/lang/Iterable;)V
    //   1581: checkcast me/rerere/matrix/thirdparty/kotlin/collections/Grouping
    //   1584: invokestatic eachCount : (Lme/rerere/matrix/thirdparty/kotlin/collections/Grouping;)Ljava/util/Map;
    //   1587: astore #26
    //   1589: astore #36
    //   1591: iconst_0
    //   1592: istore #27
    //   1594: aload #26
    //   1596: astore #28
    //   1598: new java/util/LinkedHashMap
    //   1601: dup
    //   1602: invokespecial <init> : ()V
    //   1605: checkcast java/util/Map
    //   1608: astore #29
    //   1610: iconst_0
    //   1611: istore #30
    //   1613: aload #28
    //   1615: invokeinterface entrySet : ()Ljava/util/Set;
    //   1620: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1625: astore #31
    //   1627: aload #31
    //   1629: invokeinterface hasNext : ()Z
    //   1634: ifeq -> 1713
    //   1637: aload #31
    //   1639: invokeinterface next : ()Ljava/lang/Object;
    //   1644: checkcast java/util/Map$Entry
    //   1647: astore #32
    //   1649: aload #32
    //   1651: astore #33
    //   1653: iconst_0
    //   1654: istore #34
    //   1656: aload #33
    //   1658: invokeinterface getValue : ()Ljava/lang/Object;
    //   1663: checkcast java/lang/Number
    //   1666: invokevirtual intValue : ()I
    //   1669: aload_0
    //   1670: getfield f : I
    //   1673: if_icmplt -> 1684
    //   1676: iconst_1
    //   1677: goto -> 1685
    //   1680: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1683: athrow
    //   1684: iconst_0
    //   1685: ifeq -> 1627
    //   1688: aload #29
    //   1690: aload #32
    //   1692: invokeinterface getKey : ()Ljava/lang/Object;
    //   1697: aload #32
    //   1699: invokeinterface getValue : ()Ljava/lang/Object;
    //   1704: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1709: pop
    //   1710: goto -> 1627
    //   1713: aload #29
    //   1715: nop
    //   1716: aload #36
    //   1718: swap
    //   1719: astore #26
    //   1721: astore #36
    //   1723: aload #26
    //   1725: invokeinterface entrySet : ()Ljava/util/Set;
    //   1730: checkcast java/lang/Iterable
    //   1733: astore #27
    //   1735: aload #27
    //   1737: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1742: astore #28
    //   1744: aload #28
    //   1746: invokeinterface hasNext : ()Z
    //   1751: ifne -> 1762
    //   1754: aconst_null
    //   1755: goto -> 1876
    //   1758: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1761: athrow
    //   1762: aload #28
    //   1764: invokeinterface next : ()Ljava/lang/Object;
    //   1769: astore #29
    //   1771: aload #28
    //   1773: invokeinterface hasNext : ()Z
    //   1778: ifne -> 1790
    //   1781: aload #29
    //   1783: goto -> 1876
    //   1786: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1789: athrow
    //   1790: aload #29
    //   1792: checkcast java/util/Map$Entry
    //   1795: astore #30
    //   1797: iconst_0
    //   1798: istore #31
    //   1800: aload #30
    //   1802: invokeinterface getValue : ()Ljava/lang/Object;
    //   1807: checkcast java/lang/Number
    //   1810: invokevirtual intValue : ()I
    //   1813: istore #30
    //   1815: aload #28
    //   1817: invokeinterface next : ()Ljava/lang/Object;
    //   1822: astore #31
    //   1824: aload #31
    //   1826: checkcast java/util/Map$Entry
    //   1829: astore #32
    //   1831: iconst_0
    //   1832: istore #33
    //   1834: aload #32
    //   1836: invokeinterface getValue : ()Ljava/lang/Object;
    //   1841: checkcast java/lang/Number
    //   1844: invokevirtual intValue : ()I
    //   1847: istore #32
    //   1849: iload #30
    //   1851: iload #32
    //   1853: if_icmpge -> 1864
    //   1856: aload #31
    //   1858: astore #29
    //   1860: iload #32
    //   1862: istore #30
    //   1864: aload #28
    //   1866: invokeinterface hasNext : ()Z
    //   1871: ifne -> 1815
    //   1874: aload #29
    //   1876: checkcast java/util/Map$Entry
    //   1879: aload #36
    //   1881: swap
    //   1882: dup
    //   1883: ifnull -> 1904
    //   1886: invokeinterface getKey : ()Ljava/lang/Object;
    //   1891: checkcast java/lang/Number
    //   1894: invokevirtual floatValue : ()F
    //   1897: goto -> 1908
    //   1900: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1903: athrow
    //   1904: pop
    //   1905: ldc_w -1.0
    //   1908: putfield g : F
    //   1911: aload_0
    //   1912: aload_0
    //   1913: getfield v : Lme/rerere/matrix/internal/sb;
    //   1916: checkcast java/lang/Iterable
    //   1919: astore #26
    //   1921: astore #36
    //   1923: iconst_0
    //   1924: istore #27
    //   1926: aload #26
    //   1928: astore #28
    //   1930: new java/util/ArrayList
    //   1933: dup
    //   1934: aload #26
    //   1936: bipush #10
    //   1938: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   1941: invokespecial <init> : (I)V
    //   1944: checkcast java/util/Collection
    //   1947: astore #29
    //   1949: iconst_0
    //   1950: istore #30
    //   1952: aload #28
    //   1954: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1959: astore #31
    //   1961: aload #31
    //   1963: invokeinterface hasNext : ()Z
    //   1968: ifeq -> 2019
    //   1971: aload #31
    //   1973: invokeinterface next : ()Ljava/lang/Object;
    //   1978: astore #32
    //   1980: aload #29
    //   1982: aload #32
    //   1984: checkcast java/lang/Number
    //   1987: invokevirtual doubleValue : ()D
    //   1990: dstore #33
    //   1992: astore #37
    //   1994: iconst_0
    //   1995: istore #35
    //   1997: aload_0
    //   1998: dload #33
    //   2000: d2f
    //   2001: invokespecial j : (F)F
    //   2004: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2007: aload #37
    //   2009: swap
    //   2010: invokeinterface add : (Ljava/lang/Object;)Z
    //   2015: pop
    //   2016: goto -> 1961
    //   2019: aload #29
    //   2021: checkcast java/util/List
    //   2024: nop
    //   2025: aload #36
    //   2027: swap
    //   2028: checkcast java/lang/Iterable
    //   2031: astore #26
    //   2033: nop
    //   2034: iconst_0
    //   2035: istore #27
    //   2037: new me/rerere/matrix/internal/ue
    //   2040: dup
    //   2041: aload #26
    //   2043: invokespecial <init> : (Ljava/lang/Iterable;)V
    //   2046: checkcast me/rerere/matrix/thirdparty/kotlin/collections/Grouping
    //   2049: invokestatic eachCount : (Lme/rerere/matrix/thirdparty/kotlin/collections/Grouping;)Ljava/util/Map;
    //   2052: astore #26
    //   2054: astore #36
    //   2056: iconst_0
    //   2057: istore #27
    //   2059: aload #26
    //   2061: astore #28
    //   2063: new java/util/LinkedHashMap
    //   2066: dup
    //   2067: invokespecial <init> : ()V
    //   2070: checkcast java/util/Map
    //   2073: astore #29
    //   2075: iconst_0
    //   2076: istore #30
    //   2078: aload #28
    //   2080: invokeinterface entrySet : ()Ljava/util/Set;
    //   2085: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2090: astore #31
    //   2092: aload #31
    //   2094: invokeinterface hasNext : ()Z
    //   2099: ifeq -> 2178
    //   2102: aload #31
    //   2104: invokeinterface next : ()Ljava/lang/Object;
    //   2109: checkcast java/util/Map$Entry
    //   2112: astore #32
    //   2114: aload #32
    //   2116: astore #33
    //   2118: iconst_0
    //   2119: istore #34
    //   2121: aload #33
    //   2123: invokeinterface getValue : ()Ljava/lang/Object;
    //   2128: checkcast java/lang/Number
    //   2131: invokevirtual intValue : ()I
    //   2134: aload_0
    //   2135: getfield f : I
    //   2138: if_icmplt -> 2149
    //   2141: iconst_1
    //   2142: goto -> 2150
    //   2145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2148: athrow
    //   2149: iconst_0
    //   2150: ifeq -> 2092
    //   2153: aload #29
    //   2155: aload #32
    //   2157: invokeinterface getKey : ()Ljava/lang/Object;
    //   2162: aload #32
    //   2164: invokeinterface getValue : ()Ljava/lang/Object;
    //   2169: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2174: pop
    //   2175: goto -> 2092
    //   2178: aload #29
    //   2180: nop
    //   2181: aload #36
    //   2183: swap
    //   2184: astore #26
    //   2186: astore #36
    //   2188: aload #26
    //   2190: invokeinterface entrySet : ()Ljava/util/Set;
    //   2195: checkcast java/lang/Iterable
    //   2198: astore #27
    //   2200: aload #27
    //   2202: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2207: astore #28
    //   2209: aload #28
    //   2211: invokeinterface hasNext : ()Z
    //   2216: ifne -> 2227
    //   2219: aconst_null
    //   2220: goto -> 2341
    //   2223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2226: athrow
    //   2227: aload #28
    //   2229: invokeinterface next : ()Ljava/lang/Object;
    //   2234: astore #29
    //   2236: aload #28
    //   2238: invokeinterface hasNext : ()Z
    //   2243: ifne -> 2255
    //   2246: aload #29
    //   2248: goto -> 2341
    //   2251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2254: athrow
    //   2255: aload #29
    //   2257: checkcast java/util/Map$Entry
    //   2260: astore #30
    //   2262: iconst_0
    //   2263: istore #31
    //   2265: aload #30
    //   2267: invokeinterface getValue : ()Ljava/lang/Object;
    //   2272: checkcast java/lang/Number
    //   2275: invokevirtual intValue : ()I
    //   2278: istore #30
    //   2280: aload #28
    //   2282: invokeinterface next : ()Ljava/lang/Object;
    //   2287: astore #31
    //   2289: aload #31
    //   2291: checkcast java/util/Map$Entry
    //   2294: astore #32
    //   2296: iconst_0
    //   2297: istore #33
    //   2299: aload #32
    //   2301: invokeinterface getValue : ()Ljava/lang/Object;
    //   2306: checkcast java/lang/Number
    //   2309: invokevirtual intValue : ()I
    //   2312: istore #32
    //   2314: iload #30
    //   2316: iload #32
    //   2318: if_icmpge -> 2329
    //   2321: aload #31
    //   2323: astore #29
    //   2325: iload #32
    //   2327: istore #30
    //   2329: aload #28
    //   2331: invokeinterface hasNext : ()Z
    //   2336: ifne -> 2280
    //   2339: aload #29
    //   2341: checkcast java/util/Map$Entry
    //   2344: aload #36
    //   2346: swap
    //   2347: dup
    //   2348: ifnull -> 2369
    //   2351: invokeinterface getKey : ()Ljava/lang/Object;
    //   2356: checkcast java/lang/Number
    //   2359: invokevirtual floatValue : ()F
    //   2362: goto -> 2373
    //   2365: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2368: athrow
    //   2369: pop
    //   2370: ldc_w -1.0
    //   2373: putfield r : F
    //   2376: goto -> 2483
    //   2379: iload #22
    //   2381: iconst_m1
    //   2382: if_icmpne -> 2431
    //   2385: new java/lang/StringBuilder
    //   2388: dup
    //   2389: invokespecial <init> : ()V
    //   2392: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   2395: invokevirtual toString : ()Ljava/lang/String;
    //   2398: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2401: sipush #14075
    //   2404: ldc2_w 7631605777500644416
    //   2407: lload_2
    //   2408: lxor
    //   2409: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   2414: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2417: invokevirtual toString : ()Ljava/lang/String;
    //   2420: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   2423: pop
    //   2424: goto -> 2431
    //   2427: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2430: athrow
    //   2431: iload #23
    //   2433: iconst_m1
    //   2434: if_icmpne -> 2483
    //   2437: new java/lang/StringBuilder
    //   2440: dup
    //   2441: invokespecial <init> : ()V
    //   2444: getstatic org/bukkit/ChatColor.RED : Lorg/bukkit/ChatColor;
    //   2447: invokevirtual toString : ()Ljava/lang/String;
    //   2450: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2453: sipush #29397
    //   2456: ldc2_w 7877350975670542447
    //   2459: lload_2
    //   2460: lxor
    //   2461: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   2466: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2469: invokevirtual toString : ()Ljava/lang/String;
    //   2472: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   2475: pop
    //   2476: goto -> 2483
    //   2479: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2482: athrow
    //   2483: aload_0
    //   2484: fload #18
    //   2486: putfield a : F
    //   2489: aload_0
    //   2490: fload #19
    //   2492: putfield b : F
    //   2495: aload_0
    //   2496: fload #16
    //   2498: putfield w : F
    //   2501: aload_0
    //   2502: fload #17
    //   2504: putfield z : F
    //   2507: iconst_0
    //   2508: ireturn
    // Exception table:
    //   from	to	target	type
    //   63	79	82	java/lang/RuntimeException
    //   135	150	153	java/lang/RuntimeException
    //   142	161	161	java/lang/RuntimeException
    //   187	220	223	java/lang/RuntimeException
    //   227	242	245	java/lang/RuntimeException
    //   234	253	253	java/lang/RuntimeException
    //   279	312	315	java/lang/RuntimeException
    //   319	343	346	java/lang/RuntimeException
    //   684	708	708	java/lang/RuntimeException
    //   763	777	777	java/lang/RuntimeException
    //   790	805	805	java/lang/RuntimeException
    //   895	916	916	java/lang/RuntimeException
    //   1018	1042	1042	java/lang/RuntimeException
    //   1097	1111	1111	java/lang/RuntimeException
    //   1124	1139	1139	java/lang/RuntimeException
    //   1229	1250	1250	java/lang/RuntimeException
    //   1258	1272	1275	java/lang/RuntimeException
    //   1264	1283	1283	java/lang/RuntimeException
    //   1292	1301	1304	java/lang/RuntimeException
    //   1295	1316	1319	java/lang/RuntimeException
    //   1308	1327	1327	java/lang/RuntimeException
    //   1336	1351	1354	java/lang/RuntimeException
    //   1339	1362	1362	java/lang/RuntimeException
    //   1369	1442	1442	java/lang/RuntimeException
    //   1656	1680	1680	java/lang/RuntimeException
    //   1744	1758	1758	java/lang/RuntimeException
    //   1771	1786	1786	java/lang/RuntimeException
    //   1876	1900	1900	java/lang/RuntimeException
    //   2121	2145	2145	java/lang/RuntimeException
    //   2209	2223	2223	java/lang/RuntimeException
    //   2236	2251	2251	java/lang/RuntimeException
    //   2341	2365	2365	java/lang/RuntimeException
    //   2379	2424	2427	java/lang/RuntimeException
    //   2431	2476	2479	java/lang/RuntimeException
  }
  
  static {
    long l = c ^ 0x7915D406B4B6L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[4];
    boolean bool = false;
    String str;
    int i = (str = "á\013[Iyu@Bï³âu\004%¿}§Æ\n\034Ð\020ÊtUÍ°FÊX\001DÄòô;").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static String c(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x181;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])h.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          h.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/en", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/en'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\en.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
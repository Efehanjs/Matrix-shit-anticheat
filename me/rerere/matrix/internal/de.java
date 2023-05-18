package me.rerere.matrix.internal;

import com.comphenix.protocol.events.ListenerOptions;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import java.lang.invoke.MethodHandles;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.plugin.Plugin;

public class de extends PacketAdapter {
  @NotNull
  private static final Set i;
  
  private static final long a = o3.a(-2624103359438970825L, 4158248856047922806L, MethodHandles.lookup().lookupClass()).a(144983406494766L);
  
  private static final String b;
  
  public de() {
    super((Plugin)Matrix.b(), ListenerPriority.HIGH, i, new ListenerOptions[] { ListenerOptions.ASYNC });
  }
  
  public void onPacketReceiving(@Nullable PacketEvent paramPacketEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/de.a : J
    //   3: ldc2_w 16395521545509
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 24255384070079
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 62620289072797
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 28823349692980
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 16864014467200
    //   34: lxor
    //   35: lstore #10
    //   37: dup2
    //   38: ldc2_w 29682146992251
    //   41: lxor
    //   42: lstore #12
    //   44: dup2
    //   45: ldc2_w 45199888441212
    //   48: lxor
    //   49: lstore #14
    //   51: dup2
    //   52: ldc2_w 14525920619096
    //   55: lxor
    //   56: lstore #16
    //   58: dup2
    //   59: ldc2_w 21212309221369
    //   62: lxor
    //   63: lstore #18
    //   65: dup2
    //   66: ldc2_w 14186753875612
    //   69: lxor
    //   70: lstore #20
    //   72: dup2
    //   73: ldc2_w 135352918888508
    //   76: lxor
    //   77: dup2
    //   78: bipush #32
    //   80: lushr
    //   81: l2i
    //   82: istore #22
    //   84: dup2
    //   85: bipush #32
    //   87: lshl
    //   88: bipush #48
    //   90: lushr
    //   91: l2i
    //   92: istore #23
    //   94: dup2
    //   95: bipush #48
    //   97: lshl
    //   98: bipush #48
    //   100: lushr
    //   101: l2i
    //   102: istore #24
    //   104: pop2
    //   105: dup2
    //   106: ldc2_w 44188665920682
    //   109: lxor
    //   110: lstore #25
    //   112: pop2
    //   113: invokestatic a : ()I
    //   116: istore #27
    //   118: aload_1
    //   119: iload #27
    //   121: ifne -> 136
    //   124: ifnonnull -> 135
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   133: athrow
    //   134: return
    //   135: aload_1
    //   136: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   139: astore #28
    //   141: aload #28
    //   143: ifnonnull -> 151
    //   146: return
    //   147: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   150: athrow
    //   151: aload_1
    //   152: invokevirtual isPlayerTemporary : ()Z
    //   155: iload #27
    //   157: ifne -> 187
    //   160: ifeq -> 171
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   169: athrow
    //   170: return
    //   171: aload_1
    //   172: iload #27
    //   174: ifne -> 192
    //   177: invokevirtual isCancelled : ()Z
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   186: athrow
    //   187: ifeq -> 191
    //   190: return
    //   191: aload_1
    //   192: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   195: astore #29
    //   197: aload_1
    //   198: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   201: astore #30
    //   203: aload #29
    //   205: ifnull -> 220
    //   208: aload #30
    //   210: ifnonnull -> 225
    //   213: goto -> 220
    //   216: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   219: athrow
    //   220: return
    //   221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   228: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   231: aload #28
    //   233: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   238: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   241: astore #31
    //   243: aload #31
    //   245: iload #27
    //   247: ifne -> 275
    //   250: ifnull -> 1275
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   259: athrow
    //   260: aload #31
    //   262: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   265: pop
    //   266: aload #31
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   274: athrow
    //   275: invokestatic currentTimeMillis : ()J
    //   278: invokevirtual j : (J)V
    //   281: fconst_0
    //   282: fstore #32
    //   284: fconst_0
    //   285: fstore #33
    //   287: aload #29
    //   289: iload #27
    //   291: ifne -> 389
    //   294: lload #4
    //   296: invokestatic h : (Lcom/comphenix/protocol/PacketType;J)Z
    //   299: ifeq -> 387
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: invokestatic b : ()I
    //   312: iload #27
    //   314: ifne -> 358
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   323: athrow
    //   324: bipush #17
    //   326: if_icmplt -> 361
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload #30
    //   338: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   341: iconst_0
    //   342: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   345: checkcast java/lang/Integer
    //   348: invokevirtual intValue : ()I
    //   351: goto -> 358
    //   354: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   357: athrow
    //   358: goto -> 376
    //   361: aload #30
    //   363: invokevirtual getShorts : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   366: iconst_0
    //   367: invokevirtual read : (I)Ljava/lang/Object;
    //   370: checkcast java/lang/Short
    //   373: invokevirtual shortValue : ()S
    //   376: istore #34
    //   378: aload #31
    //   380: lload #10
    //   382: iload #34
    //   384: invokevirtual b : (JI)V
    //   387: aload #29
    //   389: iload #27
    //   391: ifne -> 460
    //   394: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   397: if_acmpeq -> 434
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   406: athrow
    //   407: aload #29
    //   409: iload #27
    //   411: ifne -> 470
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   420: athrow
    //   421: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   424: if_acmpne -> 468
    //   427: goto -> 434
    //   430: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   433: athrow
    //   434: aload #30
    //   436: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   439: iconst_0
    //   440: invokevirtual read : (I)Ljava/lang/Object;
    //   443: checkcast java/lang/Float
    //   446: invokevirtual floatValue : ()F
    //   449: fstore #32
    //   451: aload #30
    //   453: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   456: iconst_1
    //   457: invokevirtual read : (I)Ljava/lang/Object;
    //   460: checkcast java/lang/Float
    //   463: invokevirtual floatValue : ()F
    //   466: fstore #33
    //   468: aload #29
    //   470: iload #27
    //   472: ifne -> 624
    //   475: lload #25
    //   477: dup2_x1
    //   478: pop2
    //   479: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   482: ifeq -> 622
    //   485: goto -> 492
    //   488: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   491: athrow
    //   492: aload #30
    //   494: invokevirtual getBooleans : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   497: iconst_1
    //   498: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   501: checkcast java/lang/Boolean
    //   504: invokevirtual booleanValue : ()Z
    //   507: istore #34
    //   509: iload #34
    //   511: iload #27
    //   513: ifne -> 548
    //   516: ifeq -> 622
    //   519: goto -> 526
    //   522: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   525: athrow
    //   526: aload #30
    //   528: invokevirtual getBooleans : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   531: iconst_0
    //   532: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   535: checkcast java/lang/Boolean
    //   538: invokevirtual booleanValue : ()Z
    //   541: goto -> 548
    //   544: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   547: athrow
    //   548: istore #35
    //   550: aload #30
    //   552: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   555: astore #36
    //   557: aload #36
    //   559: iconst_0
    //   560: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   563: checkcast java/lang/Double
    //   566: invokevirtual doubleValue : ()D
    //   569: dstore #37
    //   571: aload #36
    //   573: iconst_1
    //   574: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   577: checkcast java/lang/Double
    //   580: invokevirtual doubleValue : ()D
    //   583: dstore #39
    //   585: aload #36
    //   587: iconst_2
    //   588: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   591: checkcast java/lang/Double
    //   594: invokevirtual doubleValue : ()D
    //   597: dstore #41
    //   599: aload #31
    //   601: invokevirtual b : ()Lme/rerere/matrix/internal/x;
    //   604: new me/rerere/matrix/internal/o
    //   607: dup
    //   608: dload #37
    //   610: dload #39
    //   612: dload #41
    //   614: invokespecial <init> : (DDD)V
    //   617: iload #35
    //   619: invokevirtual b : (Lme/rerere/matrix/internal/o;Z)V
    //   622: aload #29
    //   624: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   627: iload #27
    //   629: ifne -> 897
    //   632: if_acmpne -> 880
    //   635: goto -> 642
    //   638: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   641: athrow
    //   642: lload #6
    //   644: aload #30
    //   646: invokestatic b : (JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   649: iload #27
    //   651: ifne -> 693
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   660: athrow
    //   661: ifeq -> 880
    //   664: goto -> 671
    //   667: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   670: athrow
    //   671: aload #30
    //   673: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   676: iconst_0
    //   677: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   680: checkcast java/lang/Integer
    //   683: invokevirtual intValue : ()I
    //   686: goto -> 693
    //   689: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   692: athrow
    //   693: istore #34
    //   695: iload #34
    //   697: ifle -> 880
    //   700: aload #31
    //   702: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   705: invokevirtual b : ()Ljava/util/List;
    //   708: invokeinterface iterator : ()Ljava/util/Iterator;
    //   713: astore #35
    //   715: aload #35
    //   717: invokeinterface hasNext : ()Z
    //   722: ifeq -> 880
    //   725: aload #35
    //   727: invokeinterface next : ()Ljava/lang/Object;
    //   732: checkcast me/rerere/matrix/internal/zk
    //   735: astore #36
    //   737: aload #36
    //   739: iload #27
    //   741: ifne -> 916
    //   744: iload #27
    //   746: ifne -> 768
    //   749: goto -> 756
    //   752: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   755: athrow
    //   756: ifnull -> 875
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   765: athrow
    //   766: aload #36
    //   768: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   771: lload #14
    //   773: invokevirtual b : (J)Z
    //   776: iload #27
    //   778: ifne -> 810
    //   781: ifeq -> 875
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   790: athrow
    //   791: aload #31
    //   793: iload #22
    //   795: iload #23
    //   797: i2s
    //   798: iload #24
    //   800: invokevirtual t : (ISI)Z
    //   803: goto -> 810
    //   806: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   809: athrow
    //   810: iload #27
    //   812: ifne -> 863
    //   815: ifne -> 875
    //   818: goto -> 825
    //   821: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   824: athrow
    //   825: aload #36
    //   827: iload #27
    //   829: ifne -> 868
    //   832: goto -> 839
    //   835: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   838: athrow
    //   839: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   842: aload #28
    //   844: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   849: lload #16
    //   851: dup2_x1
    //   852: pop2
    //   853: invokevirtual b : (JLorg/bukkit/World;)Z
    //   856: goto -> 863
    //   859: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   862: athrow
    //   863: ifeq -> 875
    //   866: aload #36
    //   868: iload #34
    //   870: lload #12
    //   872: invokevirtual b : (IJ)V
    //   875: iload #27
    //   877: ifeq -> 715
    //   880: aload #29
    //   882: iload #27
    //   884: ifne -> 916
    //   887: getstatic com/comphenix/protocol/PacketType$Play$Client.TELEPORT_ACCEPT : Lcom/comphenix/protocol/PacketType;
    //   890: goto -> 897
    //   893: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   896: athrow
    //   897: if_acmpne -> 934
    //   900: aload #30
    //   902: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   905: iconst_0
    //   906: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   909: goto -> 916
    //   912: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   915: athrow
    //   916: checkcast java/lang/Integer
    //   919: invokevirtual intValue : ()I
    //   922: istore #34
    //   924: aload #31
    //   926: invokevirtual b : ()Lme/rerere/matrix/internal/gm;
    //   929: iload #34
    //   931: invokevirtual b : (I)V
    //   934: aload #31
    //   936: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   939: invokevirtual b : ()Ljava/util/List;
    //   942: invokeinterface iterator : ()Ljava/util/Iterator;
    //   947: astore #34
    //   949: aload #34
    //   951: invokeinterface hasNext : ()Z
    //   956: ifeq -> 1221
    //   959: aload #34
    //   961: invokeinterface next : ()Ljava/lang/Object;
    //   966: checkcast me/rerere/matrix/internal/zk
    //   969: astore #35
    //   971: iload #27
    //   973: ifne -> 1260
    //   976: aload #35
    //   978: iload #27
    //   980: ifne -> 1002
    //   983: goto -> 990
    //   986: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   989: athrow
    //   990: ifnull -> 1216
    //   993: goto -> 1000
    //   996: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   999: athrow
    //   1000: aload #35
    //   1002: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   1005: lload #14
    //   1007: invokevirtual b : (J)Z
    //   1010: iload #27
    //   1012: ifne -> 1044
    //   1015: ifeq -> 1216
    //   1018: goto -> 1025
    //   1021: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1024: athrow
    //   1025: aload #31
    //   1027: iload #22
    //   1029: iload #23
    //   1031: i2s
    //   1032: iload #24
    //   1034: invokevirtual t : (ISI)Z
    //   1037: goto -> 1044
    //   1040: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1043: athrow
    //   1044: iload #27
    //   1046: ifne -> 1085
    //   1049: ifne -> 1216
    //   1052: goto -> 1059
    //   1055: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1058: athrow
    //   1059: aload #35
    //   1061: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   1064: aload #28
    //   1066: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   1071: lload #16
    //   1073: dup2_x1
    //   1074: pop2
    //   1075: invokevirtual b : (JLorg/bukkit/World;)Z
    //   1078: goto -> 1085
    //   1081: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1084: athrow
    //   1085: iload #27
    //   1087: ifne -> 1118
    //   1090: ifeq -> 1216
    //   1093: goto -> 1100
    //   1096: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1099: athrow
    //   1100: aload #35
    //   1102: aload #29
    //   1104: lload #20
    //   1106: aload #30
    //   1108: invokevirtual j : (Lcom/comphenix/protocol/PacketType;JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   1111: goto -> 1118
    //   1114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1117: athrow
    //   1118: istore #36
    //   1120: iload #36
    //   1122: iload #27
    //   1124: ifne -> 1151
    //   1127: ifeq -> 1149
    //   1130: goto -> 1137
    //   1133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1136: athrow
    //   1137: aload_1
    //   1138: iconst_1
    //   1139: invokevirtual setCancelled : (Z)V
    //   1142: goto -> 1149
    //   1145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1148: athrow
    //   1149: iload #36
    //   1151: ifne -> 1216
    //   1154: aload #29
    //   1156: getstatic com/comphenix/protocol/PacketType$Play$Client.LOOK : Lcom/comphenix/protocol/PacketType;
    //   1159: iload #27
    //   1161: ifne -> 1193
    //   1164: goto -> 1171
    //   1167: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1170: athrow
    //   1171: if_acmpeq -> 1196
    //   1174: goto -> 1181
    //   1177: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1180: athrow
    //   1181: aload #29
    //   1183: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   1186: goto -> 1193
    //   1189: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1192: athrow
    //   1193: if_acmpne -> 1216
    //   1196: aload #35
    //   1198: lload #8
    //   1200: aload #29
    //   1202: fload #32
    //   1204: fload #33
    //   1206: invokevirtual b : (JLcom/comphenix/protocol/PacketType;FF)V
    //   1209: goto -> 1216
    //   1212: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1215: athrow
    //   1216: iload #27
    //   1218: ifeq -> 949
    //   1221: aload #29
    //   1223: iload #27
    //   1225: ifne -> 1254
    //   1228: lload #25
    //   1230: dup2_x1
    //   1231: pop2
    //   1232: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   1235: ifne -> 1260
    //   1238: goto -> 1245
    //   1241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1244: athrow
    //   1245: aload #29
    //   1247: goto -> 1254
    //   1250: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1253: athrow
    //   1254: getstatic com/comphenix/protocol/PacketType$Play$Client.VEHICLE_MOVE : Lcom/comphenix/protocol/PacketType;
    //   1257: if_acmpne -> 1275
    //   1260: aload #31
    //   1262: invokevirtual b : ()Lme/rerere/matrix/internal/gm;
    //   1265: aload_1
    //   1266: aload #28
    //   1268: aload #30
    //   1270: lload #18
    //   1272: invokevirtual b : (Lcom/comphenix/protocol/events/PacketEvent;Lorg/bukkit/entity/Player;Lcom/comphenix/protocol/events/PacketContainer;J)V
    //   1275: return
    // Exception table:
    //   from	to	target	type
    //   118	127	130	java/lang/RuntimeException
    //   141	147	147	java/lang/RuntimeException
    //   151	163	166	java/lang/RuntimeException
    //   171	180	183	java/lang/RuntimeException
    //   203	213	216	java/lang/RuntimeException
    //   208	221	221	java/lang/RuntimeException
    //   243	253	256	java/lang/RuntimeException
    //   250	268	271	java/lang/RuntimeException
    //   287	302	305	java/lang/RuntimeException
    //   294	317	320	java/lang/RuntimeException
    //   309	329	332	java/lang/RuntimeException
    //   324	351	354	java/lang/RuntimeException
    //   389	400	403	java/lang/RuntimeException
    //   394	414	417	java/lang/RuntimeException
    //   407	427	430	java/lang/RuntimeException
    //   470	485	488	java/lang/RuntimeException
    //   509	519	522	java/lang/RuntimeException
    //   516	541	544	java/lang/RuntimeException
    //   624	635	638	java/lang/RuntimeException
    //   632	654	657	java/lang/RuntimeException
    //   642	664	667	java/lang/RuntimeException
    //   661	686	689	java/lang/RuntimeException
    //   737	749	752	java/lang/RuntimeException
    //   744	759	762	java/lang/RuntimeException
    //   768	784	787	java/lang/RuntimeException
    //   781	803	806	java/lang/RuntimeException
    //   810	818	821	java/lang/RuntimeException
    //   815	832	835	java/lang/RuntimeException
    //   825	856	859	java/lang/RuntimeException
    //   880	890	893	java/lang/RuntimeException
    //   897	909	912	java/lang/RuntimeException
    //   971	983	986	java/lang/RuntimeException
    //   976	993	996	java/lang/RuntimeException
    //   1002	1018	1021	java/lang/RuntimeException
    //   1015	1037	1040	java/lang/RuntimeException
    //   1044	1052	1055	java/lang/RuntimeException
    //   1049	1078	1081	java/lang/RuntimeException
    //   1085	1093	1096	java/lang/RuntimeException
    //   1090	1111	1114	java/lang/RuntimeException
    //   1120	1130	1133	java/lang/RuntimeException
    //   1127	1142	1145	java/lang/RuntimeException
    //   1151	1164	1167	java/lang/RuntimeException
    //   1154	1174	1177	java/lang/RuntimeException
    //   1171	1186	1189	java/lang/RuntimeException
    //   1193	1209	1212	java/lang/RuntimeException
    //   1221	1238	1241	java/lang/RuntimeException
    //   1228	1247	1250	java/lang/RuntimeException
  }
  
  public void onPacketSending(@NotNull PacketEvent paramPacketEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/de.a : J
    //   3: ldc2_w 130255601292296
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 138913714872356
    //   13: lxor
    //   14: dup2
    //   15: bipush #48
    //   17: lushr
    //   18: l2i
    //   19: istore #4
    //   21: dup2
    //   22: bipush #16
    //   24: lshl
    //   25: bipush #48
    //   27: lushr
    //   28: l2i
    //   29: istore #5
    //   31: dup2
    //   32: bipush #32
    //   34: lshl
    //   35: bipush #32
    //   37: lushr
    //   38: l2i
    //   39: istore #6
    //   41: pop2
    //   42: dup2
    //   43: ldc2_w 40942685836885
    //   46: lxor
    //   47: lstore #7
    //   49: dup2
    //   50: ldc2_w 71812241467409
    //   53: lxor
    //   54: dup2
    //   55: bipush #48
    //   57: lushr
    //   58: l2i
    //   59: istore #9
    //   61: dup2
    //   62: bipush #16
    //   64: lshl
    //   65: bipush #32
    //   67: lushr
    //   68: l2i
    //   69: istore #10
    //   71: dup2
    //   72: bipush #48
    //   74: lshl
    //   75: bipush #48
    //   77: lushr
    //   78: l2i
    //   79: istore #11
    //   81: pop2
    //   82: dup2
    //   83: ldc2_w 55427606721194
    //   86: lxor
    //   87: lstore #12
    //   89: dup2
    //   90: ldc2_w 89635777666641
    //   93: lxor
    //   94: lstore #14
    //   96: dup2
    //   97: ldc2_w 129364611181429
    //   100: lxor
    //   101: lstore #16
    //   103: dup2
    //   104: ldc2_w 31708164139579
    //   107: lxor
    //   108: lstore #18
    //   110: dup2
    //   111: ldc2_w 3866833899793
    //   114: lxor
    //   115: dup2
    //   116: bipush #32
    //   118: lushr
    //   119: l2i
    //   120: istore #20
    //   122: dup2
    //   123: bipush #32
    //   125: lshl
    //   126: bipush #48
    //   128: lushr
    //   129: l2i
    //   130: istore #21
    //   132: dup2
    //   133: bipush #48
    //   135: lshl
    //   136: bipush #48
    //   138: lushr
    //   139: l2i
    //   140: istore #22
    //   142: pop2
    //   143: pop2
    //   144: invokestatic a : ()I
    //   147: istore #23
    //   149: aload_1
    //   150: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   153: astore #24
    //   155: aload #24
    //   157: ifnonnull -> 165
    //   160: return
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: aload_1
    //   166: invokevirtual isCancelled : ()Z
    //   169: iload #23
    //   171: ifne -> 201
    //   174: ifeq -> 185
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: return
    //   185: aload_1
    //   186: iload #23
    //   188: ifne -> 206
    //   191: invokevirtual isPlayerTemporary : ()Z
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: ifeq -> 205
    //   204: return
    //   205: aload_1
    //   206: invokevirtual getPacketType : ()Lcom/comphenix/protocol/PacketType;
    //   209: astore #25
    //   211: aload_1
    //   212: invokevirtual getPacket : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   215: astore #26
    //   217: iload #23
    //   219: ifne -> 262
    //   222: aload #26
    //   224: ifnull -> 246
    //   227: goto -> 234
    //   230: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   233: athrow
    //   234: aload #25
    //   236: ifnonnull -> 263
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   245: athrow
    //   246: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   249: getstatic me/rerere/matrix/internal/de.b : Ljava/lang/String;
    //   252: invokevirtual println : (Ljava/lang/String;)V
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   261: athrow
    //   262: return
    //   263: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   266: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   269: aload #24
    //   271: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   276: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   279: astore #27
    //   281: aload #27
    //   283: ifnull -> 915
    //   286: aload #25
    //   288: getstatic com/comphenix/protocol/PacketType$Play$Server.ENTITY_VELOCITY : Lcom/comphenix/protocol/PacketType;
    //   291: iload #23
    //   293: ifne -> 454
    //   296: goto -> 303
    //   299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   302: athrow
    //   303: if_acmpne -> 449
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: aload #26
    //   315: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   318: iconst_0
    //   319: invokevirtual read : (I)Ljava/lang/Object;
    //   322: checkcast java/lang/Integer
    //   325: invokevirtual intValue : ()I
    //   328: istore #28
    //   330: iload #28
    //   332: iload #23
    //   334: ifne -> 378
    //   337: aload_1
    //   338: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   341: invokeinterface getEntityId : ()I
    //   346: if_icmpne -> 449
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   355: athrow
    //   356: aload #26
    //   358: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   361: iconst_1
    //   362: invokevirtual read : (I)Ljava/lang/Object;
    //   365: checkcast java/lang/Integer
    //   368: invokevirtual intValue : ()I
    //   371: goto -> 378
    //   374: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   377: athrow
    //   378: i2d
    //   379: ldc2_w 8000.0
    //   382: ddiv
    //   383: dstore #29
    //   385: aload #26
    //   387: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   390: iconst_2
    //   391: invokevirtual read : (I)Ljava/lang/Object;
    //   394: checkcast java/lang/Integer
    //   397: invokevirtual intValue : ()I
    //   400: i2d
    //   401: ldc2_w 8000.0
    //   404: ddiv
    //   405: dstore #31
    //   407: aload #26
    //   409: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   412: iconst_3
    //   413: invokevirtual read : (I)Ljava/lang/Object;
    //   416: checkcast java/lang/Integer
    //   419: invokevirtual intValue : ()I
    //   422: i2d
    //   423: ldc2_w 8000.0
    //   426: ddiv
    //   427: dstore #33
    //   429: aload_0
    //   430: aload #27
    //   432: iload #9
    //   434: i2c
    //   435: dload #29
    //   437: dload #31
    //   439: dload #33
    //   441: iload #10
    //   443: iload #11
    //   445: i2c
    //   446: invokespecial j : (Lme/rerere/matrix/internal/yl;CDDDIC)V
    //   449: aload #25
    //   451: getstatic com/comphenix/protocol/PacketType$Play$Server.EXPLOSION : Lcom/comphenix/protocol/PacketType;
    //   454: iload #23
    //   456: ifne -> 554
    //   459: if_acmpne -> 537
    //   462: goto -> 469
    //   465: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   468: athrow
    //   469: aload #26
    //   471: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   474: iconst_1
    //   475: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   478: checkcast java/lang/Float
    //   481: invokevirtual floatValue : ()F
    //   484: fstore #28
    //   486: aload #26
    //   488: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   491: iconst_2
    //   492: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   495: checkcast java/lang/Float
    //   498: invokevirtual floatValue : ()F
    //   501: fstore #29
    //   503: aload #26
    //   505: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   508: iconst_3
    //   509: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   512: checkcast java/lang/Float
    //   515: invokevirtual floatValue : ()F
    //   518: fstore #30
    //   520: aload_0
    //   521: aload #27
    //   523: fload #28
    //   525: f2d
    //   526: fload #29
    //   528: f2d
    //   529: fload #30
    //   531: f2d
    //   532: lload #12
    //   534: invokespecial b : (Lme/rerere/matrix/internal/yl;DDDJ)V
    //   537: aload #25
    //   539: iload #23
    //   541: ifne -> 573
    //   544: getstatic com/comphenix/protocol/PacketType$Play$Server.POSITION : Lcom/comphenix/protocol/PacketType;
    //   547: goto -> 554
    //   550: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   553: athrow
    //   554: if_acmpne -> 725
    //   557: aload #26
    //   559: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   562: iconst_0
    //   563: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   566: goto -> 573
    //   569: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   572: athrow
    //   573: checkcast java/lang/Double
    //   576: invokevirtual doubleValue : ()D
    //   579: dstore #28
    //   581: aload #26
    //   583: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   586: iconst_1
    //   587: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   590: checkcast java/lang/Double
    //   593: invokevirtual doubleValue : ()D
    //   596: dstore #30
    //   598: aload #26
    //   600: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   603: iconst_2
    //   604: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   607: checkcast java/lang/Double
    //   610: invokevirtual doubleValue : ()D
    //   613: dstore #32
    //   615: new org/bukkit/Location
    //   618: dup
    //   619: aload #24
    //   621: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   626: dload #28
    //   628: dload #30
    //   630: dload #32
    //   632: invokespecial <init> : (Lorg/bukkit/World;DDD)V
    //   635: astore #34
    //   637: invokestatic b : ()I
    //   640: iload #23
    //   642: ifne -> 709
    //   645: bipush #12
    //   647: if_icmpge -> 687
    //   650: goto -> 657
    //   653: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   656: athrow
    //   657: aload #27
    //   659: invokevirtual b : ()Lme/rerere/matrix/internal/gm;
    //   662: iload #4
    //   664: i2c
    //   665: iload #5
    //   667: i2s
    //   668: iload #6
    //   670: aload #34
    //   672: invokevirtual j : (CSILorg/bukkit/Location;)V
    //   675: iload #23
    //   677: ifeq -> 725
    //   680: goto -> 687
    //   683: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   686: athrow
    //   687: aload #26
    //   689: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   692: iconst_0
    //   693: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   696: checkcast java/lang/Integer
    //   699: invokevirtual intValue : ()I
    //   702: goto -> 709
    //   705: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   708: athrow
    //   709: istore #35
    //   711: aload #27
    //   713: invokevirtual b : ()Lme/rerere/matrix/internal/gm;
    //   716: aload #34
    //   718: iload #35
    //   720: lload #18
    //   722: invokevirtual b : (Lorg/bukkit/Location;IJ)V
    //   725: aload #27
    //   727: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   730: invokevirtual b : ()Ljava/util/List;
    //   733: invokeinterface iterator : ()Ljava/util/Iterator;
    //   738: astore #28
    //   740: aload #28
    //   742: invokeinterface hasNext : ()Z
    //   747: ifeq -> 915
    //   750: aload #28
    //   752: invokeinterface next : ()Ljava/lang/Object;
    //   757: checkcast me/rerere/matrix/internal/zk
    //   760: astore #29
    //   762: aload #29
    //   764: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   767: lload #14
    //   769: invokevirtual b : (J)Z
    //   772: iload #23
    //   774: ifne -> 806
    //   777: ifeq -> 910
    //   780: goto -> 787
    //   783: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   786: athrow
    //   787: aload #27
    //   789: iload #20
    //   791: iload #21
    //   793: i2s
    //   794: iload #22
    //   796: invokevirtual t : (ISI)Z
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   805: athrow
    //   806: iload #23
    //   808: ifne -> 847
    //   811: ifne -> 910
    //   814: goto -> 821
    //   817: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   820: athrow
    //   821: aload #29
    //   823: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   826: aload #24
    //   828: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   833: lload #16
    //   835: dup2_x1
    //   836: pop2
    //   837: invokevirtual b : (JLorg/bukkit/World;)Z
    //   840: goto -> 847
    //   843: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   846: athrow
    //   847: iload #23
    //   849: ifne -> 880
    //   852: ifeq -> 910
    //   855: goto -> 862
    //   858: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   861: athrow
    //   862: aload #29
    //   864: aload #25
    //   866: lload #7
    //   868: aload #26
    //   870: invokevirtual b : (Lcom/comphenix/protocol/PacketType;JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   873: goto -> 880
    //   876: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   879: athrow
    //   880: istore #30
    //   882: aload #29
    //   884: aload #25
    //   886: aload #26
    //   888: aload_1
    //   889: invokevirtual b : (Lcom/comphenix/protocol/PacketType;Lcom/comphenix/protocol/events/PacketContainer;Lcom/comphenix/protocol/events/PacketEvent;)Z
    //   892: pop
    //   893: iload #30
    //   895: ifeq -> 910
    //   898: aload_1
    //   899: iconst_1
    //   900: invokevirtual setCancelled : (Z)V
    //   903: goto -> 910
    //   906: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   909: athrow
    //   910: iload #23
    //   912: ifeq -> 740
    //   915: return
    // Exception table:
    //   from	to	target	type
    //   155	161	161	java/lang/RuntimeException
    //   165	177	180	java/lang/RuntimeException
    //   185	194	197	java/lang/RuntimeException
    //   217	227	230	java/lang/RuntimeException
    //   222	239	242	java/lang/RuntimeException
    //   234	255	258	java/lang/RuntimeException
    //   281	296	299	java/lang/RuntimeException
    //   286	306	309	java/lang/RuntimeException
    //   330	349	352	java/lang/RuntimeException
    //   337	371	374	java/lang/RuntimeException
    //   454	462	465	java/lang/RuntimeException
    //   537	547	550	java/lang/RuntimeException
    //   554	566	569	java/lang/RuntimeException
    //   637	650	653	java/lang/RuntimeException
    //   645	680	683	java/lang/RuntimeException
    //   657	702	705	java/lang/RuntimeException
    //   762	780	783	java/lang/RuntimeException
    //   777	799	802	java/lang/RuntimeException
    //   806	814	817	java/lang/RuntimeException
    //   811	840	843	java/lang/RuntimeException
    //   847	855	858	java/lang/RuntimeException
    //   852	873	876	java/lang/RuntimeException
    //   882	903	906	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x7D35AB8D4BB9L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\de.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
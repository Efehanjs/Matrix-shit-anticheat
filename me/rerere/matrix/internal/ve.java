package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.util.Vector;

public class ve extends zk {
  private final Queue za;
  
  private int oa;
  
  private static final Set ma;
  
  private long wa;
  
  private PacketType ya;
  
  private static boolean c;
  
  private static int p;
  
  private long j;
  
  private PacketType d;
  
  private long h;
  
  private final ec e;
  
  private static int n;
  
  private static boolean y;
  
  private static boolean m;
  
  private long o;
  
  private long q;
  
  private int t;
  
  private long g;
  
  private final Queue a;
  
  private PacketType s;
  
  private static int u;
  
  private long w;
  
  private static int f;
  
  private long l;
  
  private long r;
  
  private long x;
  
  private long z;
  
  private BlockFace k;
  
  private static int v;
  
  private long b;
  
  private Vector i;
  
  private static final long A = o3.a(5075888865698439471L, -6800779293451240070L, MethodHandles.lookup().lookupClass()).a(277251754691813L);
  
  private static final String[] F;
  
  private static final String[] G;
  
  private static final Map H = new HashMap<>(13);
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 25653092024530
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 79238690796922
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 111913025362681
    //   19: lxor
    //   20: dup2
    //   21: bipush #56
    //   23: lushr
    //   24: l2i
    //   25: istore #9
    //   27: dup2
    //   28: bipush #8
    //   30: lshl
    //   31: bipush #8
    //   33: lushr
    //   34: lstore #10
    //   36: pop2
    //   37: dup2
    //   38: ldc2_w 47957886284789
    //   41: lxor
    //   42: lstore #12
    //   44: dup2
    //   45: ldc2_w 53778054797842
    //   48: lxor
    //   49: lstore #14
    //   51: dup2
    //   52: ldc2_w 40507544756790
    //   55: lxor
    //   56: lstore #16
    //   58: dup2
    //   59: ldc2_w 92285321630872
    //   62: lxor
    //   63: dup2
    //   64: bipush #48
    //   66: lushr
    //   67: l2i
    //   68: istore #18
    //   70: dup2
    //   71: bipush #16
    //   73: lshl
    //   74: bipush #16
    //   76: lushr
    //   77: lstore #19
    //   79: pop2
    //   80: pop2
    //   81: lload #16
    //   83: aload_1
    //   84: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   87: ifeq -> 123
    //   90: aload_0
    //   91: getfield oa : I
    //   94: bipush #20
    //   96: if_icmpge -> 123
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   105: athrow
    //   106: aload_0
    //   107: dup
    //   108: getfield oa : I
    //   111: iconst_1
    //   112: iadd
    //   113: putfield oa : I
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: aload_1
    //   124: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   127: if_acmpne -> 255
    //   130: aload #4
    //   132: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   135: iconst_0
    //   136: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   139: checkcast java/lang/Integer
    //   142: invokevirtual intValue : ()I
    //   145: istore #21
    //   147: iload #21
    //   149: aload_0
    //   150: getfield t : I
    //   153: if_icmpne -> 249
    //   156: invokestatic j : ()J
    //   159: aload_0
    //   160: getfield z : J
    //   163: lsub
    //   164: ldc2_w 1000
    //   167: lcmp
    //   168: ifgt -> 242
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: invokestatic j : ()J
    //   181: aload_0
    //   182: getfield o : J
    //   185: lsub
    //   186: ldc2_w 1000
    //   189: lcmp
    //   190: ifgt -> 242
    //   193: goto -> 200
    //   196: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   199: athrow
    //   200: aload_0
    //   201: lload #5
    //   203: sipush #16419
    //   206: ldc2_w 7369921066901515549
    //   209: lload_2
    //   210: lxor
    //   211: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   216: sipush #13232
    //   219: ldc2_w 8382211497817792172
    //   222: lload_2
    //   223: lxor
    //   224: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   229: getstatic me/rerere/matrix/internal/ve.v : I
    //   232: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   241: athrow
    //   242: aload_0
    //   243: invokestatic j : ()J
    //   246: putfield o : J
    //   249: aload_0
    //   250: iload #21
    //   252: putfield t : I
    //   255: aload_1
    //   256: lload #7
    //   258: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   261: ifeq -> 421
    //   264: invokestatic b : ()I
    //   267: bipush #8
    //   269: if_icmpne -> 421
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: aload #4
    //   281: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   284: iconst_0
    //   285: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   288: checkcast java/lang/Float
    //   291: invokevirtual floatValue : ()F
    //   294: fstore #21
    //   296: aload #4
    //   298: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   301: iconst_1
    //   302: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   305: checkcast java/lang/Float
    //   308: invokevirtual floatValue : ()F
    //   311: fstore #22
    //   313: aload #4
    //   315: invokevirtual getFloat : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   318: iconst_2
    //   319: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   322: checkcast java/lang/Float
    //   325: invokevirtual floatValue : ()F
    //   328: fstore #23
    //   330: fload #21
    //   332: fconst_0
    //   333: fcmpg
    //   334: iflt -> 407
    //   337: fload #21
    //   339: fconst_1
    //   340: fcmpl
    //   341: ifgt -> 407
    //   344: goto -> 351
    //   347: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   350: athrow
    //   351: fload #22
    //   353: fconst_0
    //   354: fcmpg
    //   355: iflt -> 407
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   364: athrow
    //   365: fload #22
    //   367: fconst_1
    //   368: fcmpl
    //   369: ifgt -> 407
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   378: athrow
    //   379: fload #23
    //   381: fconst_0
    //   382: fcmpg
    //   383: iflt -> 407
    //   386: goto -> 393
    //   389: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   392: athrow
    //   393: fload #23
    //   395: fconst_1
    //   396: fcmpl
    //   397: ifle -> 421
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   406: athrow
    //   407: aload_0
    //   408: invokestatic j : ()J
    //   411: putfield w : J
    //   414: goto -> 421
    //   417: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   420: athrow
    //   421: lload #16
    //   423: aload_1
    //   424: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   427: ifne -> 474
    //   430: aload_1
    //   431: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   434: if_acmpeq -> 474
    //   437: goto -> 444
    //   440: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   443: athrow
    //   444: aload_1
    //   445: lload #7
    //   447: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   450: ifne -> 474
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   459: athrow
    //   460: aload_1
    //   461: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   464: if_acmpne -> 1932
    //   467: goto -> 474
    //   470: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   473: athrow
    //   474: new me/rerere/matrix/internal/ic
    //   477: dup
    //   478: invokespecial <init> : ()V
    //   481: astore #21
    //   483: aload_0
    //   484: getfield e : Lme/rerere/matrix/internal/ec;
    //   487: aload_1
    //   488: invokestatic j : ()J
    //   491: aload_0
    //   492: getfield x : J
    //   495: lsub
    //   496: lload #12
    //   498: aload #21
    //   500: invokevirtual b : (Lcom/comphenix/protocol/PacketType;JJLme/rerere/matrix/internal/ic;)V
    //   503: aload_0
    //   504: invokestatic j : ()J
    //   507: putfield x : J
    //   510: aload_1
    //   511: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   514: if_acmpne -> 537
    //   517: aload #21
    //   519: aload #4
    //   521: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   524: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   527: invokevirtual b : (Ljava/lang/Object;)V
    //   530: goto -> 537
    //   533: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   536: athrow
    //   537: aload_1
    //   538: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   541: if_acmpne -> 565
    //   544: aload #21
    //   546: aload #4
    //   548: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   551: iconst_0
    //   552: invokevirtual readSafely : (I)Ljava/lang/Object;
    //   555: invokevirtual b : (Ljava/lang/Object;)V
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   564: athrow
    //   565: aload_0
    //   566: getfield e : Lme/rerere/matrix/internal/ec;
    //   569: iload #9
    //   571: i2b
    //   572: lload #10
    //   574: invokevirtual b : (BJ)Z
    //   577: ifeq -> 1687
    //   580: aload_0
    //   581: getfield e : Lme/rerere/matrix/internal/ec;
    //   584: iconst_3
    //   585: iload #18
    //   587: i2s
    //   588: lload #19
    //   590: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   593: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   596: lload #7
    //   598: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   601: ifeq -> 769
    //   604: goto -> 611
    //   607: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   610: athrow
    //   611: aload_0
    //   612: getfield e : Lme/rerere/matrix/internal/ec;
    //   615: iconst_3
    //   616: iload #18
    //   618: i2s
    //   619: lload #19
    //   621: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   624: invokevirtual b : ()J
    //   627: ldc2_w 5
    //   630: lcmp
    //   631: ifge -> 769
    //   634: goto -> 641
    //   637: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   640: athrow
    //   641: aload_0
    //   642: getfield e : Lme/rerere/matrix/internal/ec;
    //   645: iconst_2
    //   646: iload #18
    //   648: i2s
    //   649: lload #19
    //   651: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   654: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   657: lload #16
    //   659: dup2_x1
    //   660: pop2
    //   661: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   664: ifeq -> 769
    //   667: goto -> 674
    //   670: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   673: athrow
    //   674: aload_0
    //   675: getfield e : Lme/rerere/matrix/internal/ec;
    //   678: iconst_2
    //   679: iload #18
    //   681: i2s
    //   682: lload #19
    //   684: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   687: invokevirtual b : ()J
    //   690: ldc2_w 40
    //   693: lcmp
    //   694: ifle -> 769
    //   697: goto -> 704
    //   700: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   703: athrow
    //   704: invokestatic j : ()J
    //   707: aload_0
    //   708: getfield z : J
    //   711: lsub
    //   712: ldc2_w 1000
    //   715: lcmp
    //   716: ifge -> 769
    //   719: goto -> 726
    //   722: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   725: athrow
    //   726: invokestatic j : ()J
    //   729: aload_0
    //   730: getfield j : J
    //   733: lsub
    //   734: ldc2_w 1000
    //   737: lcmp
    //   738: ifgt -> 762
    //   741: goto -> 748
    //   744: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   747: athrow
    //   748: aload_0
    //   749: invokestatic j : ()J
    //   752: putfield r : J
    //   755: goto -> 762
    //   758: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   761: athrow
    //   762: aload_0
    //   763: invokestatic j : ()J
    //   766: putfield j : J
    //   769: aload_0
    //   770: getfield e : Lme/rerere/matrix/internal/ec;
    //   773: iconst_0
    //   774: iload #18
    //   776: i2s
    //   777: lload #19
    //   779: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   782: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   785: lload #7
    //   787: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   790: ifeq -> 1108
    //   793: aload_0
    //   794: getfield e : Lme/rerere/matrix/internal/ec;
    //   797: iconst_1
    //   798: iload #18
    //   800: i2s
    //   801: lload #19
    //   803: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   806: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   809: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   812: if_acmpne -> 1108
    //   815: goto -> 822
    //   818: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   821: athrow
    //   822: aload_0
    //   823: getfield e : Lme/rerere/matrix/internal/ec;
    //   826: iconst_1
    //   827: iload #18
    //   829: i2s
    //   830: lload #19
    //   832: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   835: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   838: ldc_w com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction
    //   841: invokevirtual b : (Ljava/lang/Class;)Ljava/lang/Object;
    //   844: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   847: if_acmpne -> 1108
    //   850: goto -> 857
    //   853: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   856: athrow
    //   857: aload_0
    //   858: getfield e : Lme/rerere/matrix/internal/ec;
    //   861: iconst_1
    //   862: iload #18
    //   864: i2s
    //   865: lload #19
    //   867: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   870: invokevirtual b : ()J
    //   873: ldc2_w 5
    //   876: lcmp
    //   877: ifge -> 1108
    //   880: goto -> 887
    //   883: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   886: athrow
    //   887: aload_0
    //   888: getfield e : Lme/rerere/matrix/internal/ec;
    //   891: iconst_2
    //   892: iload #18
    //   894: i2s
    //   895: lload #19
    //   897: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   900: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   903: lload #14
    //   905: dup2_x1
    //   906: pop2
    //   907: invokestatic p : (JLcom/comphenix/protocol/PacketType;)Z
    //   910: ifeq -> 1108
    //   913: goto -> 920
    //   916: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   919: athrow
    //   920: aload_0
    //   921: getfield e : Lme/rerere/matrix/internal/ec;
    //   924: iconst_2
    //   925: iload #18
    //   927: i2s
    //   928: lload #19
    //   930: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   933: invokevirtual b : ()J
    //   936: ldc2_w 5
    //   939: lcmp
    //   940: ifge -> 1108
    //   943: goto -> 950
    //   946: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   949: athrow
    //   950: aload_0
    //   951: getfield e : Lme/rerere/matrix/internal/ec;
    //   954: iconst_3
    //   955: iload #18
    //   957: i2s
    //   958: lload #19
    //   960: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   963: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   966: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   969: if_acmpne -> 1108
    //   972: goto -> 979
    //   975: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   978: athrow
    //   979: aload_0
    //   980: getfield e : Lme/rerere/matrix/internal/ec;
    //   983: iconst_3
    //   984: iload #18
    //   986: i2s
    //   987: lload #19
    //   989: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   992: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   995: ldc_w com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction
    //   998: invokevirtual b : (Ljava/lang/Class;)Ljava/lang/Object;
    //   1001: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.STOP_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   1004: if_acmpne -> 1108
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1013: athrow
    //   1014: aload_0
    //   1015: getfield e : Lme/rerere/matrix/internal/ec;
    //   1018: iconst_3
    //   1019: iload #18
    //   1021: i2s
    //   1022: lload #19
    //   1024: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1027: invokevirtual b : ()J
    //   1030: ldc2_w 40
    //   1033: lcmp
    //   1034: ifle -> 1108
    //   1037: goto -> 1044
    //   1040: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1043: athrow
    //   1044: invokestatic j : ()J
    //   1047: aload_0
    //   1048: getfield z : J
    //   1051: lsub
    //   1052: ldc2_w 1000
    //   1055: lcmp
    //   1056: ifge -> 1108
    //   1059: goto -> 1066
    //   1062: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1065: athrow
    //   1066: aload_0
    //   1067: lload #5
    //   1069: sipush #32695
    //   1072: ldc2_w 7574564529687073449
    //   1075: lload_2
    //   1076: lxor
    //   1077: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1082: sipush #4344
    //   1085: ldc2_w 8118843118032354801
    //   1088: lload_2
    //   1089: lxor
    //   1090: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1095: getstatic me/rerere/matrix/internal/ve.v : I
    //   1098: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1101: goto -> 1108
    //   1104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1107: athrow
    //   1108: aload_0
    //   1109: getfield e : Lme/rerere/matrix/internal/ec;
    //   1112: iconst_0
    //   1113: iload #18
    //   1115: i2s
    //   1116: lload #19
    //   1118: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1121: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   1124: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   1127: if_acmpne -> 1447
    //   1130: aload_0
    //   1131: getfield e : Lme/rerere/matrix/internal/ec;
    //   1134: iconst_0
    //   1135: iload #18
    //   1137: i2s
    //   1138: lload #19
    //   1140: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1143: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   1146: ldc_w com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction
    //   1149: invokevirtual b : (Ljava/lang/Class;)Ljava/lang/Object;
    //   1152: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   1155: if_acmpne -> 1447
    //   1158: goto -> 1165
    //   1161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1164: athrow
    //   1165: aload_0
    //   1166: getfield e : Lme/rerere/matrix/internal/ec;
    //   1169: iconst_1
    //   1170: iload #18
    //   1172: i2s
    //   1173: lload #19
    //   1175: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1178: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   1181: lload #7
    //   1183: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   1186: ifeq -> 1447
    //   1189: goto -> 1196
    //   1192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1195: athrow
    //   1196: aload_0
    //   1197: getfield e : Lme/rerere/matrix/internal/ec;
    //   1200: iconst_1
    //   1201: iload #18
    //   1203: i2s
    //   1204: lload #19
    //   1206: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1209: invokevirtual b : ()J
    //   1212: ldc2_w 5
    //   1215: lcmp
    //   1216: ifge -> 1447
    //   1219: goto -> 1226
    //   1222: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1225: athrow
    //   1226: aload_0
    //   1227: getfield e : Lme/rerere/matrix/internal/ec;
    //   1230: iconst_2
    //   1231: iload #18
    //   1233: i2s
    //   1234: lload #19
    //   1236: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1239: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   1242: lload #14
    //   1244: dup2_x1
    //   1245: pop2
    //   1246: invokestatic p : (JLcom/comphenix/protocol/PacketType;)Z
    //   1249: ifeq -> 1447
    //   1252: goto -> 1259
    //   1255: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1258: athrow
    //   1259: aload_0
    //   1260: getfield e : Lme/rerere/matrix/internal/ec;
    //   1263: iconst_2
    //   1264: iload #18
    //   1266: i2s
    //   1267: lload #19
    //   1269: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1272: invokevirtual b : ()J
    //   1275: ldc2_w 5
    //   1278: lcmp
    //   1279: ifge -> 1447
    //   1282: goto -> 1289
    //   1285: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1288: athrow
    //   1289: aload_0
    //   1290: getfield e : Lme/rerere/matrix/internal/ec;
    //   1293: iconst_3
    //   1294: iload #18
    //   1296: i2s
    //   1297: lload #19
    //   1299: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1302: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   1305: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   1308: if_acmpne -> 1447
    //   1311: goto -> 1318
    //   1314: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1317: athrow
    //   1318: aload_0
    //   1319: getfield e : Lme/rerere/matrix/internal/ec;
    //   1322: iconst_3
    //   1323: iload #18
    //   1325: i2s
    //   1326: lload #19
    //   1328: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1331: invokevirtual b : ()Lme/rerere/matrix/internal/ic;
    //   1334: ldc_w com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction
    //   1337: invokevirtual b : (Ljava/lang/Class;)Ljava/lang/Object;
    //   1340: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.STOP_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   1343: if_acmpne -> 1447
    //   1346: goto -> 1353
    //   1349: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1352: athrow
    //   1353: aload_0
    //   1354: getfield e : Lme/rerere/matrix/internal/ec;
    //   1357: iconst_3
    //   1358: iload #18
    //   1360: i2s
    //   1361: lload #19
    //   1363: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1366: invokevirtual b : ()J
    //   1369: ldc2_w 40
    //   1372: lcmp
    //   1373: ifle -> 1447
    //   1376: goto -> 1383
    //   1379: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1382: athrow
    //   1383: invokestatic j : ()J
    //   1386: aload_0
    //   1387: getfield z : J
    //   1390: lsub
    //   1391: ldc2_w 1000
    //   1394: lcmp
    //   1395: ifge -> 1447
    //   1398: goto -> 1405
    //   1401: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1404: athrow
    //   1405: aload_0
    //   1406: lload #5
    //   1408: sipush #6156
    //   1411: ldc2_w 6680898788147623191
    //   1414: lload_2
    //   1415: lxor
    //   1416: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1421: sipush #9894
    //   1424: ldc2_w 5607575945165065123
    //   1427: lload_2
    //   1428: lxor
    //   1429: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1434: getstatic me/rerere/matrix/internal/ve.v : I
    //   1437: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1440: goto -> 1447
    //   1443: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1446: athrow
    //   1447: aload_0
    //   1448: getfield e : Lme/rerere/matrix/internal/ec;
    //   1451: iconst_3
    //   1452: iload #18
    //   1454: i2s
    //   1455: lload #19
    //   1457: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1460: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   1463: lload #7
    //   1465: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   1468: ifeq -> 1687
    //   1471: aload_0
    //   1472: getfield e : Lme/rerere/matrix/internal/ec;
    //   1475: iconst_3
    //   1476: iload #18
    //   1478: i2s
    //   1479: lload #19
    //   1481: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1484: invokevirtual b : ()J
    //   1487: ldc2_w 5
    //   1490: lcmp
    //   1491: ifge -> 1687
    //   1494: goto -> 1501
    //   1497: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1500: athrow
    //   1501: aload_0
    //   1502: getfield e : Lme/rerere/matrix/internal/ec;
    //   1505: iconst_2
    //   1506: iload #18
    //   1508: i2s
    //   1509: lload #19
    //   1511: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1514: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   1517: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   1520: if_acmpne -> 1687
    //   1523: goto -> 1530
    //   1526: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1529: athrow
    //   1530: aload_0
    //   1531: getfield e : Lme/rerere/matrix/internal/ec;
    //   1534: iconst_2
    //   1535: iload #18
    //   1537: i2s
    //   1538: lload #19
    //   1540: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1543: invokevirtual b : ()J
    //   1546: ldc2_w 5
    //   1549: lcmp
    //   1550: ifge -> 1687
    //   1553: goto -> 1560
    //   1556: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1559: athrow
    //   1560: aload_0
    //   1561: getfield e : Lme/rerere/matrix/internal/ec;
    //   1564: iconst_1
    //   1565: iload #18
    //   1567: i2s
    //   1568: lload #19
    //   1570: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1573: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   1576: lload #16
    //   1578: dup2_x1
    //   1579: pop2
    //   1580: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   1583: ifeq -> 1687
    //   1586: goto -> 1593
    //   1589: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1592: athrow
    //   1593: aload_0
    //   1594: getfield e : Lme/rerere/matrix/internal/ec;
    //   1597: iconst_1
    //   1598: iload #18
    //   1600: i2s
    //   1601: lload #19
    //   1603: invokevirtual b : (ISJ)Lme/rerere/matrix/internal/yc;
    //   1606: invokevirtual b : ()J
    //   1609: ldc2_w 40
    //   1612: lcmp
    //   1613: ifle -> 1687
    //   1616: goto -> 1623
    //   1619: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1622: athrow
    //   1623: invokestatic j : ()J
    //   1626: aload_0
    //   1627: getfield z : J
    //   1630: lsub
    //   1631: ldc2_w 1200
    //   1634: lcmp
    //   1635: ifge -> 1687
    //   1638: goto -> 1645
    //   1641: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1644: athrow
    //   1645: aload_0
    //   1646: lload #5
    //   1648: sipush #13480
    //   1651: ldc2_w 7783944439863499159
    //   1654: lload_2
    //   1655: lxor
    //   1656: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1661: sipush #25047
    //   1664: ldc2_w 6149949382657150192
    //   1667: lload_2
    //   1668: lxor
    //   1669: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1674: getstatic me/rerere/matrix/internal/ve.v : I
    //   1677: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1680: goto -> 1687
    //   1683: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1686: athrow
    //   1687: aload_1
    //   1688: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   1691: if_acmpne -> 1733
    //   1694: aload #4
    //   1696: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1699: invokestatic b : (Lcom/comphenix/protocol/reflect/StructureModifier;)Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   1702: astore #22
    //   1704: aload #22
    //   1706: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   1709: if_acmpeq -> 1733
    //   1712: aload #22
    //   1714: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.STOP_SNEAKING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   1717: if_acmpeq -> 1733
    //   1720: goto -> 1727
    //   1723: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1726: athrow
    //   1727: iconst_0
    //   1728: ireturn
    //   1729: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1732: athrow
    //   1733: getstatic me/rerere/matrix/internal/ve.c : Z
    //   1736: ifeq -> 1911
    //   1739: lload #16
    //   1741: aload_1
    //   1742: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   1745: ifne -> 1911
    //   1748: goto -> 1755
    //   1751: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1754: athrow
    //   1755: aload_0
    //   1756: getfield s : Lcom/comphenix/protocol/PacketType;
    //   1759: ifnull -> 1911
    //   1762: goto -> 1769
    //   1765: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1768: athrow
    //   1769: aload_0
    //   1770: getfield d : Lcom/comphenix/protocol/PacketType;
    //   1773: ifnull -> 1911
    //   1776: goto -> 1783
    //   1779: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1782: athrow
    //   1783: aload_0
    //   1784: getfield ya : Lcom/comphenix/protocol/PacketType;
    //   1787: ifnull -> 1911
    //   1790: goto -> 1797
    //   1793: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1796: athrow
    //   1797: aload_1
    //   1798: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   1801: if_acmpne -> 1911
    //   1804: goto -> 1811
    //   1807: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1810: athrow
    //   1811: aload_0
    //   1812: getfield d : Lcom/comphenix/protocol/PacketType;
    //   1815: lload #7
    //   1817: invokestatic m : (Lcom/comphenix/protocol/PacketType;J)Z
    //   1820: ifeq -> 1911
    //   1823: goto -> 1830
    //   1826: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1829: athrow
    //   1830: aload_0
    //   1831: getfield s : Lcom/comphenix/protocol/PacketType;
    //   1834: getstatic com/comphenix/protocol/PacketType$Play$Client.HELD_ITEM_SLOT : Lcom/comphenix/protocol/PacketType;
    //   1837: if_acmpne -> 1911
    //   1840: goto -> 1847
    //   1843: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1846: athrow
    //   1847: invokestatic j : ()J
    //   1850: aload_0
    //   1851: getfield z : J
    //   1854: lsub
    //   1855: ldc2_w 1500
    //   1858: lcmp
    //   1859: ifge -> 1911
    //   1862: goto -> 1869
    //   1865: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1868: athrow
    //   1869: aload_0
    //   1870: lload #5
    //   1872: sipush #8258
    //   1875: ldc2_w 5937536047833009503
    //   1878: lload_2
    //   1879: lxor
    //   1880: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1885: sipush #31809
    //   1888: ldc2_w 4072011808176443717
    //   1891: lload_2
    //   1892: lxor
    //   1893: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1898: getstatic me/rerere/matrix/internal/ve.v : I
    //   1901: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1904: goto -> 1911
    //   1907: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1910: athrow
    //   1911: aload_0
    //   1912: aload_0
    //   1913: getfield s : Lcom/comphenix/protocol/PacketType;
    //   1916: putfield ya : Lcom/comphenix/protocol/PacketType;
    //   1919: aload_0
    //   1920: aload_0
    //   1921: getfield d : Lcom/comphenix/protocol/PacketType;
    //   1924: putfield s : Lcom/comphenix/protocol/PacketType;
    //   1927: aload_0
    //   1928: aload_1
    //   1929: putfield d : Lcom/comphenix/protocol/PacketType;
    //   1932: iconst_0
    //   1933: ireturn
    // Exception table:
    //   from	to	target	type
    //   81	99	102	java/lang/RuntimeException
    //   90	116	119	java/lang/RuntimeException
    //   147	171	174	java/lang/RuntimeException
    //   156	193	196	java/lang/RuntimeException
    //   178	235	238	java/lang/RuntimeException
    //   255	272	275	java/lang/RuntimeException
    //   330	344	347	java/lang/RuntimeException
    //   337	358	361	java/lang/RuntimeException
    //   351	372	375	java/lang/RuntimeException
    //   365	386	389	java/lang/RuntimeException
    //   379	400	403	java/lang/RuntimeException
    //   393	414	417	java/lang/RuntimeException
    //   421	437	440	java/lang/RuntimeException
    //   430	453	456	java/lang/RuntimeException
    //   444	467	470	java/lang/RuntimeException
    //   483	530	533	java/lang/RuntimeException
    //   537	558	561	java/lang/RuntimeException
    //   565	604	607	java/lang/RuntimeException
    //   580	634	637	java/lang/RuntimeException
    //   611	667	670	java/lang/RuntimeException
    //   641	697	700	java/lang/RuntimeException
    //   674	719	722	java/lang/RuntimeException
    //   704	741	744	java/lang/RuntimeException
    //   726	755	758	java/lang/RuntimeException
    //   769	815	818	java/lang/RuntimeException
    //   793	850	853	java/lang/RuntimeException
    //   822	880	883	java/lang/RuntimeException
    //   857	913	916	java/lang/RuntimeException
    //   887	943	946	java/lang/RuntimeException
    //   920	972	975	java/lang/RuntimeException
    //   950	1007	1010	java/lang/RuntimeException
    //   979	1037	1040	java/lang/RuntimeException
    //   1014	1059	1062	java/lang/RuntimeException
    //   1044	1101	1104	java/lang/RuntimeException
    //   1108	1158	1161	java/lang/RuntimeException
    //   1130	1189	1192	java/lang/RuntimeException
    //   1165	1219	1222	java/lang/RuntimeException
    //   1196	1252	1255	java/lang/RuntimeException
    //   1226	1282	1285	java/lang/RuntimeException
    //   1259	1311	1314	java/lang/RuntimeException
    //   1289	1346	1349	java/lang/RuntimeException
    //   1318	1376	1379	java/lang/RuntimeException
    //   1353	1398	1401	java/lang/RuntimeException
    //   1383	1440	1443	java/lang/RuntimeException
    //   1447	1494	1497	java/lang/RuntimeException
    //   1471	1523	1526	java/lang/RuntimeException
    //   1501	1553	1556	java/lang/RuntimeException
    //   1530	1586	1589	java/lang/RuntimeException
    //   1560	1616	1619	java/lang/RuntimeException
    //   1593	1638	1641	java/lang/RuntimeException
    //   1623	1680	1683	java/lang/RuntimeException
    //   1704	1720	1723	java/lang/RuntimeException
    //   1712	1729	1729	java/lang/RuntimeException
    //   1733	1748	1751	java/lang/RuntimeException
    //   1739	1762	1765	java/lang/RuntimeException
    //   1755	1776	1779	java/lang/RuntimeException
    //   1769	1790	1793	java/lang/RuntimeException
    //   1783	1804	1807	java/lang/RuntimeException
    //   1797	1823	1826	java/lang/RuntimeException
    //   1811	1840	1843	java/lang/RuntimeException
    //   1830	1862	1865	java/lang/RuntimeException
    //   1847	1904	1907	java/lang/RuntimeException
  }
  
  public ve(yl paramyl, long paramLong) {
    super(paramyl);
    this.e = new ec(4, l);
    this.oa = 0;
    this.a = new ArrayDeque();
    this.za = new ArrayDeque();
    b(yk.x);
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    this.wa = pc.j();
  }
  
  @NotNull
  public static String b(@NotNull File paramFile, long paramLong) throws Exception {
    paramLong = A ^ paramLong;
    long l = paramLong ^ 0xB6B44FC59C7L;
    byte[] arrayOfByte = b(l, paramFile);
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b : arrayOfByte)
      stringBuilder.append(Integer.toString((b & 0xFF) + 256, 16).substring(1)); 
    return stringBuilder.toString();
  }
  
  static {
    long l = A ^ 0x275E8BE4C15DL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[51];
    boolean bool = false;
    String str;
    int i = (str = "lÝ«\036M÷¤y>_å\034àÄÛ<n!P¹2LÛØÀ\0002Y\036Æí¦×\000<yÑ½Ú\013Ù± KýgØ\037¢«È\007µ¶ño×T\013:ÙÛ \037|¯ç\001I2j8\021Ú0MÛiì>|´\005ô·\017É9>þß\032\016\rjðs5ÌKP´\bÃk¯\025Z<è\020HnËåòø¬\033s\026æ\026 HÍ)\0300áyò_8\025òM[\023Iç~¨ÍuÛbw\031<É2B(.ãDßR\023r¹+·2/\023kç\034À-\025ª@××\016ÁÄ\0365Ú\020#Â¹~\fH,òK\037¶\024U~ü1¨m9»½Ñ¹â\006óú»{l² K%\005+ü\030¸:Çñ?®Ì<¥fPT;÷Áxc0Dv*#rLO\0361KÈv­(a÷\"MÑ\024'¦v\017µH?ÉsN\0068E]AÄÌ®KNaø~+fªÐ\003·@ø\005\tÅQº\r\031aÔMqÓýÂ7\022dÑ\006¤£¼Jm´í]ÃL4(ðÑ\fJ,\007Y\025X×*M¼æÂålx\033ÓÅ×NÊ@Ó¼¹\0332ðÇZ­éÆÅ*ÃÊ;µC¿Ö|YÄÛV`\026L£}¼\036:smäÓzÛP9\f×o\035]Z\025 \021(<zÒ.\034 yõ6\034Oh\"03K\037\023®ÉñnþÊö\bý\r«ÛgÆIW\030UÀYmZ´¹tÛ\037(×\004Ø'ÊD³<\000b\r»Hß\020]7±ð}Hm¥sq´pQÁ6ëÑáæÿöì¢½:D,\027ÿ-ÏÀ:\001Bå\016É§vüÑ\026.u\t\006Ó·ÓÞÖëÝ~ ë\002i\004ðÞÝ\027\035Ã,N!c\016Ã`\"³9·Õ§±sÓ\030ÚgåY¯B®èãQolÓ*Å\020Å2zeÕ@!B«\0363VI\r?p\f°3ò\nÍìµ&\002ßwmhz7§ñ\037Ý=¤4ýraÃÊö11¦\nà×«ó7í\013C6­c=& é×RáL­\027ÁÑ\"w\fë®¡UýÄÎð®ì\0074\023\001§\027V ¼çÎ&Ën?ú\rTi<}Ì\023ÑÿW\t\b\001yò\016)¯q\020Ì½c¯gQ\n\000;`w Ê\037@^Ô<\003%-6ÛµmèqæËb\006ô\033»_I_v63hê\023LpW\013gÍ##«\027¨0\006&³W¯\bO\032ÕS·\030\005ls@\0321ÞsÒ¶¦*(\f\036ìü;×Û\035­j\006&t¢äRä©\031y£'\032î`qÒÉÑ©ð#7ömB+kýÈ¬\027\biô\001*UË¥\020ÑC'*v\031^83¬ûa@ßx\0271ebÝ»G±9¾;0rE\005\r\020>µ\\\fÅÖEüZI\006\001©t\036&ø'×·âÈÊ W³\031f\035©\fçÇûÅ\032\025L\020KbK\025úäüÝ*}ï@òÚ0DMLû\037G*eæå¾\020ÙD¶sS[¸\013çÂ\027âjÇ\bö\032[¤´ëcûvÿt¯j¸z¡>Eº)Så@J§O3òUt4géñ«\nG¤\037¾ëw#ñÙî(1NÍñå)6±¤&X\013\025?iÆtMk5íi°\006\037R\030\0313ZR\færÚF$Ê1=&;nMTé\006o9\020o\002¥Ö\016´ÐÊå\024ºÿ\006_\031\003 \021päö¬VºJs\033ò/4)ÐL\rL¢C«¥\021\001Ä Ù(-@i\032iÉï7vVÆ¬ßü^cZ±'\rê¡ÅÙÃaæ¬:\"f­DW\030}¢\022r\nC^¶L\fd\020yüØÛq\037ò&\026\007D\003@gÝ\\ÃðºÖù\021Ëæ\006ÐÎ4éêv¨ùØ£¶ðÕ\036º$Þoj«Ö`©§\026Ð\n2:m¥úîá\036lå+À½LÕ­K\rÚ xÏ8ÁgiNí\001ü\013©û^x4éex\020\026o\024r5\000({zÛ÷$/pÖÇý\003RrÄëJ\026 ¥EðïU\020 1\007¶³F÷\006@és÷Ò\005Í»\007\013Xä»òSJ&('\003B°lQymdw]\006\020Èì¡`[ç¹~\020Í¾ÖR%\007KÐ+ºZsIïñÞå`!+ ô\013Îï\030½N\030\023Ø\002JtûÆfã¶)É\001E¶FuEÉ£\020\027\004\004×g}þî«wé*\025é\003P9ø|\003Õã£\030##\031<Ã-_\031÷eÁqþùEY.¨áq?oÄU>ÈÊf^õ°¤\020±(¿8îÔ\034\fDg\037:k^¯û}ØÏ;u)\006l?\001JÞ±8¯\007Óê×\003Qo\\ÌNC<YÕ@Æ\002ó|¿°ÓEdÄEû\016\000Y\025ûP\007b$\020hz+\n.\030%\\@e}\013\007þ©g_#åöE³\022K×æ8X\025Ë-Ð@pÉ9}ºm6ü54Có°ô\024®©ZÄobý\021?Tc\022¶*¥1He+\007áz0:­7\006\006\\5\031LÙÙDVÄ\fêgL;J:èt§Ap $¿jqBÉ\021x|¥BQãÞ\034a!E|îrÚÁ\030+Ï6CA«§w¡ ¾ª~×Ã~\016¶óIï¾WfWE\037Ãðp\024n\017OaG\023\030wf}Á\035ã]õ÷Ô³e»7ý\024M]V\023~|\\ò@Lñ<1½Pª<\n\033\004û\034Ï]\027ã\002,Î$yÅ­ä}ÇÇ\004+Kì«¡\034\bÀ\003Ã©Û[<#\0204\0331Wg\025ª\022hàf(\r\t;ù\025+xs \036@baIå+\\\034=ìïíÃú)#ÜÇ¦R\"áÈîü(Nõ.~éyo]èR¯nÝ¨Ë\0036nlkµÃ-¾\030¯\016RçMá@\022Á©M! Àÿ}¥E^BôKË·PÝj¥UÂ5@i|¬\0244Èø\016±@qC\020tÃ^Ñ;ÏÑ³ÒÕE`ÓÎv)ØÄ\016ÄÖ3Õ\026WºG°ê\023ÂÎQKM\007S2aÐ.Öö¢ó[[\020\020\031{7û%\030\020voÇ|\035,t\031ð3\022è×ÁØÄqýHçÄ®èP]ÕäTÊæíõF\007}\000Ã,¹Ì[·\020úg¯ô{C«ó\034q %Ñò»X¨Ð\017·©Â®ÊSôYxgO2\003LÆqÅ3ÄÙõMó\017").length();
    byte b2 = 48;
    byte b = -1;
    while (true);
  }
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_3
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: lstore #5
    //   26: lload #5
    //   28: dup2
    //   29: ldc2_w 124005624962429
    //   32: lxor
    //   33: dup2
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #7
    //   40: dup2
    //   41: bipush #16
    //   43: lshl
    //   44: bipush #32
    //   46: lushr
    //   47: l2i
    //   48: istore #8
    //   50: dup2
    //   51: bipush #48
    //   53: lshl
    //   54: bipush #48
    //   56: lushr
    //   57: l2i
    //   58: istore #9
    //   60: pop2
    //   61: dup2
    //   62: ldc2_w 137262009759190
    //   65: lxor
    //   66: lstore #10
    //   68: dup2
    //   69: ldc2_w 120344717151345
    //   72: lxor
    //   73: lstore #12
    //   75: dup2
    //   76: ldc2_w 136627988675810
    //   79: lxor
    //   80: lstore #14
    //   82: dup2
    //   83: ldc2_w 52957691994795
    //   86: lxor
    //   87: lstore #16
    //   89: dup2
    //   90: ldc2_w 66941059539971
    //   93: lxor
    //   94: lstore #18
    //   96: dup2
    //   97: ldc2_w 13281692300527
    //   100: lxor
    //   101: lstore #20
    //   103: dup2
    //   104: ldc2_w 7685339062019
    //   107: lxor
    //   108: dup2
    //   109: bipush #8
    //   111: lushr
    //   112: lstore #22
    //   114: dup2
    //   115: bipush #56
    //   117: lshl
    //   118: bipush #56
    //   120: lushr
    //   121: l2i
    //   122: istore #24
    //   124: pop2
    //   125: pop2
    //   126: aload_2
    //   127: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   130: astore #25
    //   132: aload_2
    //   133: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   136: astore #26
    //   138: aload_2
    //   139: invokevirtual getBlockAgainst : ()Lorg/bukkit/block/Block;
    //   142: astore #27
    //   144: aload #25
    //   146: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   151: astore #28
    //   153: iconst_0
    //   154: istore #29
    //   156: getstatic me/rerere/matrix/internal/ve.c : Z
    //   159: ifeq -> 1758
    //   162: aload_2
    //   163: invokevirtual isCancelled : ()Z
    //   166: ifne -> 1758
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   175: athrow
    //   176: aload #28
    //   178: invokevirtual getYaw : ()F
    //   181: aload #28
    //   183: invokevirtual getPitch : ()F
    //   186: invokestatic b : (FF)Z
    //   189: ifeq -> 274
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   198: athrow
    //   199: aload_0
    //   200: lload #10
    //   202: sipush #404
    //   205: ldc2_w 6274110846860417418
    //   208: lload #5
    //   210: lxor
    //   211: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   216: sipush #8028
    //   219: ldc2_w 5928872827167033160
    //   222: lload #5
    //   224: lxor
    //   225: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   230: iconst_1
    //   231: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   234: iconst_1
    //   235: istore #29
    //   237: aload #28
    //   239: invokevirtual clone : ()Lorg/bukkit/Location;
    //   242: astore #30
    //   244: aload #30
    //   246: aload #30
    //   248: invokevirtual getYaw : ()F
    //   251: ldc_w 0.01234
    //   254: fsub
    //   255: invokevirtual setYaw : (F)V
    //   258: aload #30
    //   260: fconst_0
    //   261: invokevirtual setPitch : (F)V
    //   264: aload #25
    //   266: aload #30
    //   268: invokeinterface teleport : (Lorg/bukkit/Location;)Z
    //   273: pop
    //   274: aload_0
    //   275: aload #25
    //   277: aload #26
    //   279: aload #27
    //   281: iload #7
    //   283: i2s
    //   284: iload #8
    //   286: iload #9
    //   288: i2c
    //   289: invokespecial p : (Lorg/bukkit/entity/Player;Lorg/bukkit/block/Block;Lorg/bukkit/block/Block;SIC)Z
    //   292: ifeq -> 298
    //   295: iconst_1
    //   296: istore #29
    //   298: aload_0
    //   299: lload #16
    //   301: aload #25
    //   303: aload #26
    //   305: aload #27
    //   307: invokespecial b : (JLorg/bukkit/entity/Player;Lorg/bukkit/block/Block;Lorg/bukkit/block/Block;)Z
    //   310: ifeq -> 316
    //   313: iconst_1
    //   314: istore #29
    //   316: aload_0
    //   317: aload #26
    //   319: aload #27
    //   321: lload #22
    //   323: aload #25
    //   325: iload #24
    //   327: i2b
    //   328: invokespecial b : (Lorg/bukkit/block/Block;Lorg/bukkit/block/Block;JLorg/bukkit/entity/Player;B)Z
    //   331: ifeq -> 337
    //   334: iconst_1
    //   335: istore #29
    //   337: aload_0
    //   338: lload #14
    //   340: aload #25
    //   342: aload #26
    //   344: aload #27
    //   346: invokespecial j : (JLorg/bukkit/entity/Player;Lorg/bukkit/block/Block;Lorg/bukkit/block/Block;)Z
    //   349: ifeq -> 355
    //   352: iconst_1
    //   353: istore #29
    //   355: invokestatic j : ()J
    //   358: aload_0
    //   359: getfield l : J
    //   362: lsub
    //   363: ldc2_w 1200
    //   366: lcmp
    //   367: ifgt -> 556
    //   370: invokestatic j : ()J
    //   373: aload_0
    //   374: getfield wa : J
    //   377: lsub
    //   378: ldc2_w 1200
    //   381: lcmp
    //   382: ifle -> 556
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   391: athrow
    //   392: aload #26
    //   394: invokeinterface getType : ()Lorg/bukkit/Material;
    //   399: invokevirtual isSolid : ()Z
    //   402: ifeq -> 556
    //   405: goto -> 412
    //   408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   411: athrow
    //   412: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   415: invokevirtual j : ()Z
    //   418: ifeq -> 556
    //   421: goto -> 428
    //   424: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   427: athrow
    //   428: aload #26
    //   430: invokeinterface getY : ()I
    //   435: aload #27
    //   437: invokeinterface getY : ()I
    //   442: if_icmpne -> 556
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   451: athrow
    //   452: aload #26
    //   454: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   457: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   462: invokeinterface getType : ()Lorg/bukkit/Material;
    //   467: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   470: if_acmpne -> 556
    //   473: goto -> 480
    //   476: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   479: athrow
    //   480: aload #25
    //   482: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   487: invokevirtual getY : ()D
    //   490: aload #26
    //   492: invokeinterface getY : ()I
    //   497: iconst_1
    //   498: iadd
    //   499: i2d
    //   500: dcmpl
    //   501: iflt -> 556
    //   504: goto -> 511
    //   507: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   510: athrow
    //   511: aload_0
    //   512: lload #10
    //   514: sipush #12352
    //   517: ldc2_w 6054794355481143378
    //   520: lload #5
    //   522: lxor
    //   523: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   528: sipush #9391
    //   531: ldc2_w 7646402120335948971
    //   534: lload #5
    //   536: lxor
    //   537: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   542: getstatic me/rerere/matrix/internal/ve.v : I
    //   545: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   548: iconst_1
    //   549: istore #29
    //   551: aload_2
    //   552: iconst_1
    //   553: invokevirtual setCancelled : (Z)V
    //   556: invokestatic j : ()J
    //   559: aload_0
    //   560: getfield g : J
    //   563: lsub
    //   564: ldc2_w 75
    //   567: lcmp
    //   568: ifge -> 748
    //   571: invokestatic j : ()J
    //   574: aload_0
    //   575: getfield wa : J
    //   578: lsub
    //   579: ldc2_w 1200
    //   582: lcmp
    //   583: ifle -> 748
    //   586: goto -> 593
    //   589: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   592: athrow
    //   593: aload #26
    //   595: invokeinterface getType : ()Lorg/bukkit/Material;
    //   600: invokevirtual isSolid : ()Z
    //   603: ifeq -> 748
    //   606: goto -> 613
    //   609: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   612: athrow
    //   613: aload #26
    //   615: invokeinterface getY : ()I
    //   620: aload #27
    //   622: invokeinterface getY : ()I
    //   627: if_icmpne -> 748
    //   630: goto -> 637
    //   633: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   636: athrow
    //   637: aload #26
    //   639: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   642: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   647: invokeinterface getType : ()Lorg/bukkit/Material;
    //   652: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   655: if_acmpne -> 748
    //   658: goto -> 665
    //   661: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   664: athrow
    //   665: aload #25
    //   667: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   672: invokevirtual getY : ()D
    //   675: aload #26
    //   677: invokeinterface getY : ()I
    //   682: iconst_1
    //   683: iadd
    //   684: i2d
    //   685: dcmpl
    //   686: iflt -> 748
    //   689: goto -> 696
    //   692: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   695: athrow
    //   696: aload_0
    //   697: lload #10
    //   699: sipush #4639
    //   702: ldc2_w 2416521035494312494
    //   705: lload #5
    //   707: lxor
    //   708: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   713: sipush #25100
    //   716: ldc2_w 7058494169946864135
    //   719: lload #5
    //   721: lxor
    //   722: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   727: getstatic me/rerere/matrix/internal/ve.v : I
    //   730: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   733: iconst_1
    //   734: istore #29
    //   736: aload_2
    //   737: iconst_1
    //   738: invokevirtual setCancelled : (Z)V
    //   741: aload_0
    //   742: invokestatic j : ()J
    //   745: putfield h : J
    //   748: invokestatic j : ()J
    //   751: aload_0
    //   752: getfield h : J
    //   755: lsub
    //   756: ldc2_w 1500
    //   759: lcmp
    //   760: ifgt -> 854
    //   763: aload #26
    //   765: invokeinterface getY : ()I
    //   770: aload #27
    //   772: invokeinterface getY : ()I
    //   777: if_icmpne -> 854
    //   780: goto -> 787
    //   783: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   786: athrow
    //   787: aload #26
    //   789: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   792: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   797: invokeinterface getType : ()Lorg/bukkit/Material;
    //   802: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   805: if_acmpne -> 854
    //   808: goto -> 815
    //   811: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   814: athrow
    //   815: aload #25
    //   817: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   822: invokevirtual getY : ()D
    //   825: aload #26
    //   827: invokeinterface getY : ()I
    //   832: iconst_1
    //   833: iadd
    //   834: i2d
    //   835: dcmpl
    //   836: iflt -> 854
    //   839: goto -> 846
    //   842: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   845: athrow
    //   846: iconst_1
    //   847: istore #29
    //   849: aload_2
    //   850: iconst_1
    //   851: invokevirtual setCancelled : (Z)V
    //   854: invokestatic j : ()J
    //   857: aload_0
    //   858: getfield r : J
    //   861: lsub
    //   862: ldc2_w 400
    //   865: lcmp
    //   866: ifgt -> 1023
    //   869: aload #26
    //   871: invokeinterface getY : ()I
    //   876: aload #27
    //   878: invokeinterface getY : ()I
    //   883: if_icmpne -> 1023
    //   886: goto -> 893
    //   889: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   892: athrow
    //   893: aload #26
    //   895: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   898: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   903: invokeinterface getType : ()Lorg/bukkit/Material;
    //   908: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   911: if_acmpne -> 1023
    //   914: goto -> 921
    //   917: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   920: athrow
    //   921: aload #25
    //   923: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   928: invokevirtual getY : ()D
    //   931: aload #26
    //   933: invokeinterface getY : ()I
    //   938: iconst_1
    //   939: iadd
    //   940: i2d
    //   941: dcmpl
    //   942: iflt -> 1023
    //   945: goto -> 952
    //   948: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   951: athrow
    //   952: aload_0
    //   953: invokevirtual b : ()I
    //   956: bipush #30
    //   958: if_icmpge -> 1023
    //   961: goto -> 968
    //   964: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   967: athrow
    //   968: invokestatic j : ()D
    //   971: ldc2_w 18.0
    //   974: dcmpl
    //   975: ifle -> 1023
    //   978: goto -> 985
    //   981: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   984: athrow
    //   985: aload_0
    //   986: lload #10
    //   988: sipush #24106
    //   991: ldc2_w 7411421646560560698
    //   994: lload #5
    //   996: lxor
    //   997: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1002: sipush #17999
    //   1005: ldc2_w 6680270241748950651
    //   1008: lload #5
    //   1010: lxor
    //   1011: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1016: iconst_2
    //   1017: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1020: iconst_1
    //   1021: istore #29
    //   1023: aload_0
    //   1024: getfield i : Lorg/bukkit/util/Vector;
    //   1027: ifnull -> 1333
    //   1030: aload #25
    //   1032: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1037: invokevirtual getY : ()D
    //   1040: aload_0
    //   1041: getfield i : Lorg/bukkit/util/Vector;
    //   1044: invokevirtual getY : ()D
    //   1047: dcmpl
    //   1048: ifne -> 1333
    //   1051: goto -> 1058
    //   1054: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1057: athrow
    //   1058: aload #26
    //   1060: aload #25
    //   1062: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1067: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1070: invokestatic b : (Lorg/bukkit/block/Block;Lorg/bukkit/util/Vector;)Z
    //   1073: ifeq -> 1333
    //   1076: goto -> 1083
    //   1079: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1082: athrow
    //   1083: aload #27
    //   1085: aload_0
    //   1086: getfield i : Lorg/bukkit/util/Vector;
    //   1089: invokestatic b : (Lorg/bukkit/block/Block;Lorg/bukkit/util/Vector;)Z
    //   1092: ifeq -> 1333
    //   1095: goto -> 1102
    //   1098: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1101: athrow
    //   1102: invokestatic j : ()J
    //   1105: aload_0
    //   1106: getfield q : J
    //   1109: lsub
    //   1110: ldc2_w 60
    //   1113: lcmp
    //   1114: ifgt -> 1333
    //   1117: goto -> 1124
    //   1120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1123: athrow
    //   1124: aload #26
    //   1126: invokeinterface getY : ()I
    //   1131: aload #27
    //   1133: invokeinterface getY : ()I
    //   1138: if_icmpne -> 1333
    //   1141: goto -> 1148
    //   1144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1147: athrow
    //   1148: aload #26
    //   1150: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   1153: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1158: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1163: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   1166: if_acmpne -> 1333
    //   1169: goto -> 1176
    //   1172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1175: athrow
    //   1176: aload #25
    //   1178: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1183: invokevirtual getY : ()D
    //   1186: aload #26
    //   1188: invokeinterface getY : ()I
    //   1193: iconst_1
    //   1194: iadd
    //   1195: i2d
    //   1196: dcmpl
    //   1197: iflt -> 1333
    //   1200: goto -> 1207
    //   1203: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1206: athrow
    //   1207: aload #27
    //   1209: lload #18
    //   1211: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   1214: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   1217: invokestatic b : ([Lme/rerere/matrix/internal/sa;)Z
    //   1220: ifeq -> 1333
    //   1223: goto -> 1230
    //   1226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1229: athrow
    //   1230: aload_0
    //   1231: invokevirtual b : ()I
    //   1234: bipush #20
    //   1236: if_icmpge -> 1333
    //   1239: goto -> 1246
    //   1242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1245: athrow
    //   1246: invokestatic j : ()D
    //   1249: ldc2_w 19.0
    //   1252: dcmpl
    //   1253: ifle -> 1333
    //   1256: goto -> 1263
    //   1259: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1262: athrow
    //   1263: invokestatic j : ()J
    //   1266: aload_0
    //   1267: getfield b : J
    //   1270: lsub
    //   1271: lstore #30
    //   1273: aload_0
    //   1274: invokestatic j : ()J
    //   1277: putfield b : J
    //   1280: lload #30
    //   1282: ldc2_w 300
    //   1285: lcmp
    //   1286: ifgt -> 1333
    //   1289: aload_0
    //   1290: lload #10
    //   1292: sipush #613
    //   1295: ldc2_w 195241772752231001
    //   1298: lload #5
    //   1300: lxor
    //   1301: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1306: sipush #14436
    //   1309: ldc2_w 1526079484449677405
    //   1312: lload #5
    //   1314: lxor
    //   1315: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1320: getstatic me/rerere/matrix/internal/ve.v : I
    //   1323: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1326: goto -> 1333
    //   1329: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1332: athrow
    //   1333: aload #27
    //   1335: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   1338: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1343: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   1346: ifeq -> 1543
    //   1349: aload #26
    //   1351: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   1354: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1359: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   1362: ifeq -> 1543
    //   1365: goto -> 1372
    //   1368: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1371: athrow
    //   1372: aload #27
    //   1374: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1379: aload #26
    //   1381: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1386: if_acmpne -> 1543
    //   1389: goto -> 1396
    //   1392: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1395: athrow
    //   1396: aload #27
    //   1398: invokeinterface getY : ()I
    //   1403: aload #26
    //   1405: invokeinterface getY : ()I
    //   1410: if_icmpne -> 1543
    //   1413: goto -> 1420
    //   1416: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1419: athrow
    //   1420: aload #25
    //   1422: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1427: invokevirtual getY : ()D
    //   1430: aload #26
    //   1432: invokeinterface getY : ()I
    //   1437: iconst_1
    //   1438: iadd
    //   1439: i2d
    //   1440: dcmpl
    //   1441: iflt -> 1543
    //   1444: goto -> 1451
    //   1447: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1450: athrow
    //   1451: aload #26
    //   1453: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1458: invokevirtual isSolid : ()Z
    //   1461: ifeq -> 1543
    //   1464: goto -> 1471
    //   1467: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1470: athrow
    //   1471: invokestatic j : ()J
    //   1474: aload_0
    //   1475: getfield w : J
    //   1478: lsub
    //   1479: ldc2_w 100
    //   1482: lcmp
    //   1483: ifgt -> 1543
    //   1486: goto -> 1493
    //   1489: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1492: athrow
    //   1493: aload_0
    //   1494: lconst_0
    //   1495: putfield w : J
    //   1498: aload_0
    //   1499: lload #10
    //   1501: sipush #18570
    //   1504: ldc2_w 4731015166725853318
    //   1507: lload #5
    //   1509: lxor
    //   1510: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1515: sipush #17917
    //   1518: ldc2_w 8302700202944372192
    //   1521: lload #5
    //   1523: lxor
    //   1524: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1529: getstatic me/rerere/matrix/internal/ve.v : I
    //   1532: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1535: iconst_1
    //   1536: istore #29
    //   1538: aload_2
    //   1539: iconst_1
    //   1540: invokevirtual setCancelled : (Z)V
    //   1543: aload #26
    //   1545: invokeinterface getY : ()I
    //   1550: aload #27
    //   1552: invokeinterface getY : ()I
    //   1557: iconst_1
    //   1558: iadd
    //   1559: if_icmpne -> 1758
    //   1562: aload #26
    //   1564: invokeinterface getX : ()I
    //   1569: aload #27
    //   1571: invokeinterface getX : ()I
    //   1576: if_icmpne -> 1758
    //   1579: goto -> 1586
    //   1582: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1585: athrow
    //   1586: aload #26
    //   1588: invokeinterface getZ : ()I
    //   1593: aload #27
    //   1595: invokeinterface getZ : ()I
    //   1600: if_icmpne -> 1758
    //   1603: goto -> 1610
    //   1606: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1609: athrow
    //   1610: aload #26
    //   1612: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1617: invokevirtual isSolid : ()Z
    //   1620: ifeq -> 1758
    //   1623: goto -> 1630
    //   1626: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1629: athrow
    //   1630: aload #25
    //   1632: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1637: invokevirtual getY : ()D
    //   1640: aload #26
    //   1642: invokeinterface getY : ()I
    //   1647: iconst_1
    //   1648: iadd
    //   1649: i2d
    //   1650: dcmpl
    //   1651: iflt -> 1758
    //   1654: goto -> 1661
    //   1657: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1660: athrow
    //   1661: invokestatic j : ()J
    //   1664: aload_0
    //   1665: getfield w : J
    //   1668: lsub
    //   1669: ldc2_w 100
    //   1672: lcmp
    //   1673: ifgt -> 1758
    //   1676: goto -> 1683
    //   1679: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1682: athrow
    //   1683: aload_2
    //   1684: invokevirtual getBlockPlaced : ()Lorg/bukkit/block/Block;
    //   1687: lload #18
    //   1689: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   1692: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   1695: invokestatic b : ([Lme/rerere/matrix/internal/sa;)Z
    //   1698: ifeq -> 1758
    //   1701: goto -> 1708
    //   1704: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1707: athrow
    //   1708: aload_0
    //   1709: lconst_0
    //   1710: putfield w : J
    //   1713: aload_0
    //   1714: lload #10
    //   1716: sipush #2132
    //   1719: ldc2_w 366379439119945818
    //   1722: lload #5
    //   1724: lxor
    //   1725: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1730: sipush #17428
    //   1733: ldc2_w 8666200036218444805
    //   1736: lload #5
    //   1738: lxor
    //   1739: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1744: getstatic me/rerere/matrix/internal/ve.v : I
    //   1747: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1750: iconst_1
    //   1751: istore #29
    //   1753: aload_2
    //   1754: iconst_1
    //   1755: invokevirtual setCancelled : (Z)V
    //   1758: getstatic me/rerere/matrix/internal/ve.m : Z
    //   1761: ifeq -> 2418
    //   1764: aload #27
    //   1766: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   1769: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1774: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   1777: ifeq -> 2418
    //   1780: goto -> 1787
    //   1783: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1786: athrow
    //   1787: aload #26
    //   1789: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   1792: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1797: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   1800: ifeq -> 2418
    //   1803: goto -> 1810
    //   1806: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1809: athrow
    //   1810: aload #27
    //   1812: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1817: aload #26
    //   1819: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1824: if_acmpne -> 2418
    //   1827: goto -> 1834
    //   1830: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1833: athrow
    //   1834: aload #27
    //   1836: invokeinterface getY : ()I
    //   1841: aload #26
    //   1843: invokeinterface getY : ()I
    //   1848: if_icmpne -> 2418
    //   1851: goto -> 1858
    //   1854: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1857: athrow
    //   1858: aload #25
    //   1860: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1865: invokevirtual getY : ()D
    //   1868: aload #26
    //   1870: invokeinterface getY : ()I
    //   1875: iconst_1
    //   1876: iadd
    //   1877: i2d
    //   1878: dcmpl
    //   1879: iflt -> 2418
    //   1882: goto -> 1889
    //   1885: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1888: athrow
    //   1889: aload #25
    //   1891: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1896: aload #27
    //   1898: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1903: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1906: ldc2_w 1.2
    //   1909: dcmpg
    //   1910: ifge -> 2418
    //   1913: goto -> 1920
    //   1916: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1919: athrow
    //   1920: aload #25
    //   1922: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1927: aload #26
    //   1929: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1934: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1937: ldc2_w 1.2
    //   1940: dcmpg
    //   1941: ifge -> 2418
    //   1944: goto -> 1951
    //   1947: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1950: athrow
    //   1951: aload #26
    //   1953: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1958: invokevirtual isSolid : ()Z
    //   1961: ifeq -> 2418
    //   1964: goto -> 1971
    //   1967: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1970: athrow
    //   1971: aload #27
    //   1973: lload #18
    //   1975: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   1978: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   1981: invokestatic b : ([Lme/rerere/matrix/internal/sa;)Z
    //   1984: ifeq -> 2418
    //   1987: goto -> 1994
    //   1990: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1993: athrow
    //   1994: aload #25
    //   1996: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   1999: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   2004: ifne -> 2418
    //   2007: goto -> 2014
    //   2010: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2013: athrow
    //   2014: aload #26
    //   2016: invokestatic b : (Lorg/bukkit/block/Block;)I
    //   2019: iconst_1
    //   2020: if_icmpgt -> 2418
    //   2023: goto -> 2030
    //   2026: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2029: athrow
    //   2030: aload #25
    //   2032: invokestatic m : (Lorg/bukkit/entity/Player;)Z
    //   2035: ifeq -> 2418
    //   2038: goto -> 2045
    //   2041: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2044: athrow
    //   2045: aload #27
    //   2047: aload #26
    //   2049: invokestatic b : (Lorg/bukkit/block/Block;Lorg/bukkit/block/Block;)Lorg/bukkit/block/BlockFace;
    //   2052: astore #30
    //   2054: aload #30
    //   2056: aload_0
    //   2057: getfield k : Lorg/bukkit/block/BlockFace;
    //   2060: if_acmpne -> 2240
    //   2063: aload_0
    //   2064: getfield a : Ljava/util/Queue;
    //   2067: aload_0
    //   2068: getfield oa : I
    //   2071: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2074: invokeinterface add : (Ljava/lang/Object;)Z
    //   2079: pop
    //   2080: aload_0
    //   2081: getfield a : Ljava/util/Queue;
    //   2084: invokeinterface size : ()I
    //   2089: iconst_5
    //   2090: if_icmplt -> 2407
    //   2093: goto -> 2100
    //   2096: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2099: athrow
    //   2100: new java/util/ArrayList
    //   2103: dup
    //   2104: aload_0
    //   2105: getfield a : Ljava/util/Queue;
    //   2108: invokespecial <init> : (Ljava/util/Collection;)V
    //   2111: lload #20
    //   2113: invokestatic b : (Ljava/util/List;J)I
    //   2116: istore #31
    //   2118: iload #31
    //   2120: getstatic me/rerere/matrix/internal/ve.p : I
    //   2123: if_icmpge -> 2227
    //   2126: aload_0
    //   2127: getfield oa : I
    //   2130: getstatic me/rerere/matrix/internal/ve.p : I
    //   2133: if_icmpge -> 2227
    //   2136: goto -> 2143
    //   2139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2142: athrow
    //   2143: aload_0
    //   2144: lload #10
    //   2146: sipush #12049
    //   2149: ldc2_w 816176012107249430
    //   2152: lload #5
    //   2154: lxor
    //   2155: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   2160: new java/lang/StringBuilder
    //   2163: dup
    //   2164: invokespecial <init> : ()V
    //   2167: sipush #28181
    //   2170: ldc2_w 8954944050277365283
    //   2173: lload #5
    //   2175: lxor
    //   2176: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   2181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2184: aload_0
    //   2185: getfield oa : I
    //   2188: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2191: ldc_w ','
    //   2194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2197: iload #31
    //   2199: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2202: invokevirtual toString : ()Ljava/lang/String;
    //   2205: getstatic me/rerere/matrix/internal/ve.n : I
    //   2208: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2211: getstatic me/rerere/matrix/internal/ve.y : Z
    //   2214: ifeq -> 2227
    //   2217: goto -> 2224
    //   2220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2223: athrow
    //   2224: iconst_1
    //   2225: istore #29
    //   2227: aload_0
    //   2228: getfield a : Ljava/util/Queue;
    //   2231: invokeinterface poll : ()Ljava/lang/Object;
    //   2236: pop
    //   2237: goto -> 2407
    //   2240: aload_0
    //   2241: getfield za : Ljava/util/Queue;
    //   2244: aload_0
    //   2245: getfield oa : I
    //   2248: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2251: invokeinterface add : (Ljava/lang/Object;)Z
    //   2256: pop
    //   2257: aload_0
    //   2258: getfield za : Ljava/util/Queue;
    //   2261: invokeinterface size : ()I
    //   2266: iconst_5
    //   2267: if_icmplt -> 2407
    //   2270: new java/util/ArrayList
    //   2273: dup
    //   2274: aload_0
    //   2275: getfield za : Ljava/util/Queue;
    //   2278: invokespecial <init> : (Ljava/util/Collection;)V
    //   2281: lload #20
    //   2283: invokestatic b : (Ljava/util/List;J)I
    //   2286: istore #31
    //   2288: iload #31
    //   2290: getstatic me/rerere/matrix/internal/ve.u : I
    //   2293: if_icmpge -> 2397
    //   2296: aload_0
    //   2297: getfield oa : I
    //   2300: getstatic me/rerere/matrix/internal/ve.u : I
    //   2303: if_icmpge -> 2397
    //   2306: goto -> 2313
    //   2309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2312: athrow
    //   2313: aload_0
    //   2314: lload #10
    //   2316: sipush #5969
    //   2319: ldc2_w 7622921517008572244
    //   2322: lload #5
    //   2324: lxor
    //   2325: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   2330: new java/lang/StringBuilder
    //   2333: dup
    //   2334: invokespecial <init> : ()V
    //   2337: sipush #23009
    //   2340: ldc2_w 4941775310744027642
    //   2343: lload #5
    //   2345: lxor
    //   2346: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   2351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2354: aload_0
    //   2355: getfield oa : I
    //   2358: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2361: ldc_w ','
    //   2364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2367: iload #31
    //   2369: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2372: invokevirtual toString : ()Ljava/lang/String;
    //   2375: getstatic me/rerere/matrix/internal/ve.n : I
    //   2378: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2381: getstatic me/rerere/matrix/internal/ve.y : Z
    //   2384: ifeq -> 2397
    //   2387: goto -> 2394
    //   2390: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2393: athrow
    //   2394: iconst_1
    //   2395: istore #29
    //   2397: aload_0
    //   2398: getfield za : Ljava/util/Queue;
    //   2401: invokeinterface poll : ()Ljava/lang/Object;
    //   2406: pop
    //   2407: aload_0
    //   2408: iconst_0
    //   2409: putfield oa : I
    //   2412: aload_0
    //   2413: aload #30
    //   2415: putfield k : Lorg/bukkit/block/BlockFace;
    //   2418: iload #29
    //   2420: ifeq -> 2468
    //   2423: aload_0
    //   2424: lload #12
    //   2426: invokevirtual j : (J)I
    //   2429: getstatic me/rerere/matrix/internal/ve.f : I
    //   2432: if_icmplt -> 2468
    //   2435: goto -> 2442
    //   2438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2441: athrow
    //   2442: getstatic me/rerere/matrix/internal/ve.f : I
    //   2445: iconst_m1
    //   2446: if_icmpeq -> 2468
    //   2449: goto -> 2456
    //   2452: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2455: athrow
    //   2456: aload_2
    //   2457: iconst_1
    //   2458: invokevirtual setCancelled : (Z)V
    //   2461: goto -> 2468
    //   2464: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2467: athrow
    //   2468: return
    // Exception table:
    //   from	to	target	type
    //   156	169	172	java/lang/RuntimeException
    //   162	192	195	java/lang/RuntimeException
    //   355	385	388	java/lang/RuntimeException
    //   370	405	408	java/lang/RuntimeException
    //   392	421	424	java/lang/RuntimeException
    //   412	445	448	java/lang/RuntimeException
    //   428	473	476	java/lang/RuntimeException
    //   452	504	507	java/lang/RuntimeException
    //   556	586	589	java/lang/RuntimeException
    //   571	606	609	java/lang/RuntimeException
    //   593	630	633	java/lang/RuntimeException
    //   613	658	661	java/lang/RuntimeException
    //   637	689	692	java/lang/RuntimeException
    //   748	780	783	java/lang/RuntimeException
    //   763	808	811	java/lang/RuntimeException
    //   787	839	842	java/lang/RuntimeException
    //   854	886	889	java/lang/RuntimeException
    //   869	914	917	java/lang/RuntimeException
    //   893	945	948	java/lang/RuntimeException
    //   921	961	964	java/lang/RuntimeException
    //   952	978	981	java/lang/RuntimeException
    //   1023	1051	1054	java/lang/RuntimeException
    //   1030	1076	1079	java/lang/RuntimeException
    //   1058	1095	1098	java/lang/RuntimeException
    //   1083	1117	1120	java/lang/RuntimeException
    //   1102	1141	1144	java/lang/RuntimeException
    //   1124	1169	1172	java/lang/RuntimeException
    //   1148	1200	1203	java/lang/RuntimeException
    //   1176	1223	1226	java/lang/RuntimeException
    //   1207	1239	1242	java/lang/RuntimeException
    //   1230	1256	1259	java/lang/RuntimeException
    //   1273	1326	1329	java/lang/RuntimeException
    //   1333	1365	1368	java/lang/RuntimeException
    //   1349	1389	1392	java/lang/RuntimeException
    //   1372	1413	1416	java/lang/RuntimeException
    //   1396	1444	1447	java/lang/RuntimeException
    //   1420	1464	1467	java/lang/RuntimeException
    //   1451	1486	1489	java/lang/RuntimeException
    //   1543	1579	1582	java/lang/RuntimeException
    //   1562	1603	1606	java/lang/RuntimeException
    //   1586	1623	1626	java/lang/RuntimeException
    //   1610	1654	1657	java/lang/RuntimeException
    //   1630	1676	1679	java/lang/RuntimeException
    //   1661	1701	1704	java/lang/RuntimeException
    //   1758	1780	1783	java/lang/RuntimeException
    //   1764	1803	1806	java/lang/RuntimeException
    //   1787	1827	1830	java/lang/RuntimeException
    //   1810	1851	1854	java/lang/RuntimeException
    //   1834	1882	1885	java/lang/RuntimeException
    //   1858	1913	1916	java/lang/RuntimeException
    //   1889	1944	1947	java/lang/RuntimeException
    //   1920	1964	1967	java/lang/RuntimeException
    //   1951	1987	1990	java/lang/RuntimeException
    //   1971	2007	2010	java/lang/RuntimeException
    //   1994	2023	2026	java/lang/RuntimeException
    //   2014	2038	2041	java/lang/RuntimeException
    //   2054	2093	2096	java/lang/RuntimeException
    //   2118	2136	2139	java/lang/RuntimeException
    //   2126	2217	2220	java/lang/RuntimeException
    //   2288	2306	2309	java/lang/RuntimeException
    //   2296	2387	2390	java/lang/RuntimeException
    //   2418	2435	2438	java/lang/RuntimeException
    //   2423	2449	2452	java/lang/RuntimeException
    //   2442	2461	2464	java/lang/RuntimeException
  }
  
  @NotNull
  public static String b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ve.A : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 973689891779
    //   11: lxor
    //   12: lstore_2
    //   13: pop2
    //   14: sipush #32754
    //   17: ldc2_w 6876222241639969291
    //   20: lload_0
    //   21: lxor
    //   22: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   27: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   30: astore #4
    //   32: aload #4
    //   34: sipush #13467
    //   37: ldc2_w 3025959673917634941
    //   40: lload_0
    //   41: lxor
    //   42: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   47: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   50: astore #5
    //   52: aload #5
    //   54: iconst_1
    //   55: invokevirtual setAccessible : (Z)V
    //   58: aload #5
    //   60: getstatic me/rerere/matrix/Matrix.i : Ljava/lang/ClassLoader;
    //   63: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: checkcast java/io/File
    //   69: astore #6
    //   71: aload #6
    //   73: lload_2
    //   74: invokestatic b : (Ljava/io/File;J)Ljava/lang/String;
    //   77: areturn
    //   78: astore #4
    //   80: sipush #27429
    //   83: aload #4
    //   85: invokevirtual printStackTrace : ()V
    //   88: ldc2_w 4461376648008115912
    //   91: lload_0
    //   92: lxor
    //   93: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   98: areturn
    // Exception table:
    //   from	to	target	type
    //   14	77	78	java/lang/Exception
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ve.A : J
    //   3: ldc2_w 121138018549295
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #5656
    //   15: ldc2_w 1543448649371736042
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/ve.c : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #25704
    //   41: ldc2_w 2840456096491906432
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   51: iconst_5
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/ve.v : I
    //   60: aload_0
    //   61: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   64: sipush #24274
    //   67: ldc2_w 6902353223341449016
    //   70: lload_1
    //   71: lxor
    //   72: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   77: bipush #15
    //   79: invokeinterface getInt : (Ljava/lang/String;I)I
    //   84: putstatic me/rerere/matrix/internal/ve.f : I
    //   87: aload_0
    //   88: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   91: sipush #23283
    //   94: ldc2_w 6307231909311814461
    //   97: lload_1
    //   98: lxor
    //   99: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   104: iconst_1
    //   105: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   110: putstatic me/rerere/matrix/internal/ve.m : Z
    //   113: aload_0
    //   114: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   117: sipush #31012
    //   120: ldc2_w 3599249869488208097
    //   123: lload_1
    //   124: lxor
    //   125: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   130: iconst_5
    //   131: invokeinterface getInt : (Ljava/lang/String;I)I
    //   136: putstatic me/rerere/matrix/internal/ve.n : I
    //   139: aload_0
    //   140: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   143: sipush #13923
    //   146: ldc2_w 7386493152052869005
    //   149: lload_1
    //   150: lxor
    //   151: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   156: iconst_1
    //   157: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   162: putstatic me/rerere/matrix/internal/ve.y : Z
    //   165: aload_0
    //   166: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   169: sipush #29127
    //   172: ldc2_w 2434454073099956229
    //   175: lload_1
    //   176: lxor
    //   177: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   182: bipush #6
    //   184: invokeinterface getInt : (Ljava/lang/String;I)I
    //   189: putstatic me/rerere/matrix/internal/ve.p : I
    //   192: aload_0
    //   193: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   196: sipush #27600
    //   199: ldc2_w 6157317735034300959
    //   202: lload_1
    //   203: lxor
    //   204: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   209: iconst_3
    //   210: invokeinterface getInt : (Ljava/lang/String;I)I
    //   215: putstatic me/rerere/matrix/internal/ve.u : I
    //   218: return
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l1 = A ^ 0x17A8712C5A71L;
    int i = (int)((l1 ^ 0xBEBC281D1E2L) >>> 32L);
    long l2 = (l1 ^ 0xBEBC281D1E2L) << 32L >>> 32L;
    l1 ^ 0xBEBC281D1E2L;
    float f = jb.b(paramLocation2.getYaw(), i, l2, paramLocation1.getYaw());
    try {
      if (f >= 178.0F)
        try {
          if (f <= 180.0F)
            this.l = pc.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f > 83.0F)
        try {
          if (paramLocation2.getPitch() > 70.0F)
            try {
              if (zb.b(paramLocation1, paramLocation2) > 0.2D)
                this.g = pc.j(); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.i = paramLocation1.toVector();
    this.q = pc.j();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7E2F;
    if (G[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])H.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          H.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ve", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = F[i].getBytes("ISO-8859-1");
      G[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return G[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/ve'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ve.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
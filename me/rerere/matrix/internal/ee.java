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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;

public class ee extends zk {
  private static int l;
  
  private int r;
  
  private long x;
  
  private boolean z = false;
  
  private long k;
  
  private long v;
  
  private static boolean b;
  
  private double i;
  
  private static final long a = o3.a(-1809664174316135989L, -3051283758685295440L, MethodHandles.lookup().lookupClass()).a(198885570401198L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public ee(yl paramyl) {
    super(paramyl);
    b(yk.f);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ee.a : J
    //   3: ldc2_w 90331901628467
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   12: invokevirtual b : ()Lme/rerere/matrix/internal/ci;
    //   15: invokevirtual j : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   18: sipush #17800
    //   21: ldc2_w 6303162385899650082
    //   24: lload_1
    //   25: lxor
    //   26: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   31: iconst_1
    //   32: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   37: putstatic me/rerere/matrix/internal/ee.b : Z
    //   40: aload_0
    //   41: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   44: sipush #5193
    //   47: ldc2_w 8607568327537012212
    //   50: lload_1
    //   51: lxor
    //   52: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   57: iconst_3
    //   58: invokeinterface getInt : (Ljava/lang/String;I)I
    //   63: putstatic me/rerere/matrix/internal/ee.l : I
    //   66: return
  }
  
  public void j(char paramChar, short paramShort, @NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, int paramInt) {
    long l1 = paramChar << 48L | paramShort << 48L >>> 16L | paramInt << 32L >>> 32L;
    int i = (int)((l1 ^ 0x23C790E3B07L) >>> 56L);
    long l2 = (l1 ^ 0x23C790E3B07L) << 8L >>> 8L;
    l1 ^ 0x23C790E3B07L;
    try {
      if (paramEntityDamageByEntityEvent.getDamager().getUniqueId().equals(b((byte)i, l2).getUniqueId()))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.k = System.currentTimeMillis();
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ee.a : J
    //   3: ldc2_w 48021447685229
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 52505769969781
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 68606977929682
    //   22: lxor
    //   23: lstore #8
    //   25: dup2
    //   26: ldc2_w 78610039864207
    //   29: lxor
    //   30: lstore #10
    //   32: dup2
    //   33: ldc2_w 137896427525439
    //   36: lxor
    //   37: lstore #12
    //   39: pop2
    //   40: aload_1
    //   41: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   44: astore #14
    //   46: getstatic me/rerere/matrix/internal/ee.b : Z
    //   49: ifne -> 57
    //   52: return
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload_0
    //   58: getfield z : Z
    //   61: ifeq -> 74
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield z : Z
    //   69: return
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload #14
    //   76: invokeinterface isInsideVehicle : ()Z
    //   81: ifeq -> 2600
    //   84: aload #14
    //   86: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   91: instanceof org/bukkit/entity/Vehicle
    //   94: ifne -> 109
    //   97: goto -> 104
    //   100: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   103: athrow
    //   104: return
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: aload #14
    //   111: aload #14
    //   113: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   118: checkcast org/bukkit/entity/Vehicle
    //   121: invokestatic b : (Lorg/bukkit/entity/Player;Lorg/bukkit/entity/Vehicle;)Z
    //   124: ifne -> 132
    //   127: return
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: aload_0
    //   133: dup
    //   134: getfield r : I
    //   137: iconst_1
    //   138: iadd
    //   139: putfield r : I
    //   142: aload_0
    //   143: getfield r : I
    //   146: bipush #20
    //   148: if_icmple -> 164
    //   151: aload_0
    //   152: bipush #20
    //   154: putfield r : I
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   163: athrow
    //   164: aload_2
    //   165: aload_3
    //   166: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   169: dstore #15
    //   171: aload_3
    //   172: invokevirtual getY : ()D
    //   175: aload_2
    //   176: invokevirtual getY : ()D
    //   179: dsub
    //   180: dstore #17
    //   182: aload #14
    //   184: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   189: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   194: invokestatic b : (Lorg/bukkit/entity/EntityType;)Z
    //   197: ifeq -> 335
    //   200: dload #15
    //   202: aload_0
    //   203: getfield i : D
    //   206: ldc2_w 0.2
    //   209: dadd
    //   210: dcmpl
    //   211: ifle -> 335
    //   214: goto -> 221
    //   217: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   220: athrow
    //   221: invokestatic j : ()J
    //   224: aload_0
    //   225: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   228: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   231: invokevirtual j : ()J
    //   234: lsub
    //   235: ldc2_w 1500
    //   238: lcmp
    //   239: ifle -> 335
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: aload_0
    //   250: lload #6
    //   252: sipush #1628
    //   255: ldc2_w 756618531076840362
    //   258: lload #4
    //   260: lxor
    //   261: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   266: new java/lang/StringBuilder
    //   269: dup
    //   270: invokespecial <init> : ()V
    //   273: sipush #12491
    //   276: ldc2_w 3663094419174731066
    //   279: lload #4
    //   281: lxor
    //   282: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: dload #15
    //   292: aload_0
    //   293: getfield i : D
    //   296: dsub
    //   297: invokestatic b : (D)D
    //   300: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   303: invokevirtual toString : ()Ljava/lang/String;
    //   306: iconst_2
    //   307: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   310: getstatic me/rerere/matrix/internal/ee.l : I
    //   313: ifle -> 335
    //   316: goto -> 323
    //   319: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   322: athrow
    //   323: aload_1
    //   324: aload_2
    //   325: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   334: athrow
    //   335: aload_0
    //   336: getfield r : I
    //   339: iconst_1
    //   340: if_icmple -> 2591
    //   343: invokestatic currentTimeMillis : ()J
    //   346: aload_0
    //   347: getfield k : J
    //   350: lsub
    //   351: ldc2_w 3000
    //   354: lcmp
    //   355: ifle -> 2591
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   364: athrow
    //   365: aload #14
    //   367: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   372: checkcast org/bukkit/entity/Vehicle
    //   375: astore #19
    //   377: aload #19
    //   379: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   384: astore #20
    //   386: iconst_0
    //   387: istore #21
    //   389: aload_0
    //   390: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   393: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   396: lload #10
    //   398: invokevirtual j : (J)D
    //   401: dstore #22
    //   403: iconst_0
    //   404: istore #24
    //   406: aload #20
    //   408: invokestatic b : (Lorg/bukkit/entity/EntityType;)Z
    //   411: ifeq -> 1089
    //   414: iconst_1
    //   415: istore #24
    //   417: aload_2
    //   418: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   421: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   424: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   429: astore #25
    //   431: aload_2
    //   432: invokestatic i : (Lorg/bukkit/Location;)Z
    //   435: ifeq -> 591
    //   438: invokestatic b : ()I
    //   441: bipush #13
    //   443: if_icmplt -> 482
    //   446: goto -> 453
    //   449: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   452: athrow
    //   453: aload #14
    //   455: invokestatic i : (Lorg/bukkit/entity/Player;)Z
    //   458: ifeq -> 478
    //   461: goto -> 468
    //   464: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   467: athrow
    //   468: ldc2_w 0.75
    //   471: goto -> 483
    //   474: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   477: athrow
    //   478: dconst_0
    //   479: goto -> 483
    //   482: dconst_0
    //   483: dstore #26
    //   485: dload #15
    //   487: ldc2_w 2.9
    //   490: dload #26
    //   492: dadd
    //   493: dcmpl
    //   494: ifle -> 581
    //   497: aload_0
    //   498: lload #6
    //   500: sipush #9069
    //   503: ldc2_w 4142942068074462878
    //   506: lload #4
    //   508: lxor
    //   509: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   514: new java/lang/StringBuilder
    //   517: dup
    //   518: invokespecial <init> : ()V
    //   521: sipush #13702
    //   524: ldc2_w 1489201415663822973
    //   527: lload #4
    //   529: lxor
    //   530: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   535: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   538: dload #15
    //   540: invokestatic b : (D)D
    //   543: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   546: sipush #18112
    //   549: ldc2_w 3102076648595217189
    //   552: lload #4
    //   554: lxor
    //   555: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   560: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   563: dload #26
    //   565: invokestatic b : (D)D
    //   568: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   571: invokevirtual toString : ()Ljava/lang/String;
    //   574: iconst_1
    //   575: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   578: iconst_1
    //   579: istore #21
    //   581: aload_0
    //   582: invokestatic currentTimeMillis : ()J
    //   585: putfield v : J
    //   588: goto -> 1015
    //   591: aload #25
    //   593: invokeinterface isLiquid : ()Z
    //   598: ifeq -> 737
    //   601: invokestatic currentTimeMillis : ()J
    //   604: aload_0
    //   605: getfield v : J
    //   608: lsub
    //   609: ldc2_w 1500
    //   612: lcmp
    //   613: ifle -> 737
    //   616: goto -> 623
    //   619: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   622: athrow
    //   623: ldc2_w 0.5
    //   626: dstore #26
    //   628: invokestatic currentTimeMillis : ()J
    //   631: aload_0
    //   632: getfield x : J
    //   635: lsub
    //   636: ldc2_w 700
    //   639: lcmp
    //   640: ifge -> 651
    //   643: dload #26
    //   645: ldc2_w 0.5
    //   648: dadd
    //   649: dstore #26
    //   651: aload_2
    //   652: invokestatic d : (Lorg/bukkit/Location;)Z
    //   655: ifeq -> 673
    //   658: dload #26
    //   660: ldc2_w 0.5
    //   663: dadd
    //   664: dstore #26
    //   666: aload_0
    //   667: invokestatic currentTimeMillis : ()J
    //   670: putfield x : J
    //   673: dload #15
    //   675: dload #26
    //   677: dcmpl
    //   678: ifle -> 737
    //   681: aload_0
    //   682: lload #6
    //   684: sipush #9308
    //   687: ldc2_w 5228375647300958650
    //   690: lload #4
    //   692: lxor
    //   693: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   698: new java/lang/StringBuilder
    //   701: dup
    //   702: invokespecial <init> : ()V
    //   705: sipush #7502
    //   708: ldc2_w 1287104752402399419
    //   711: lload #4
    //   713: lxor
    //   714: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   719: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   722: dload #15
    //   724: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   727: invokevirtual toString : ()Ljava/lang/String;
    //   730: iconst_1
    //   731: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   734: iconst_1
    //   735: istore #21
    //   737: aload #25
    //   739: invokeinterface isLiquid : ()Z
    //   744: ifne -> 1015
    //   747: dload #15
    //   749: ldc2_w 0.39
    //   752: dload #22
    //   754: dadd
    //   755: dcmpl
    //   756: ifle -> 1015
    //   759: goto -> 766
    //   762: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   765: athrow
    //   766: aload #25
    //   768: invokeinterface getType : ()Lorg/bukkit/Material;
    //   773: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   776: if_acmpeq -> 1015
    //   779: goto -> 786
    //   782: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   785: athrow
    //   786: aload #25
    //   788: invokeinterface getType : ()Lorg/bukkit/Material;
    //   793: invokevirtual isSolid : ()Z
    //   796: ifeq -> 1015
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   805: athrow
    //   806: aload_2
    //   807: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   810: invokeinterface getType : ()Lorg/bukkit/Material;
    //   815: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   818: if_acmpne -> 1015
    //   821: goto -> 828
    //   824: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   827: athrow
    //   828: invokestatic currentTimeMillis : ()J
    //   831: aload_0
    //   832: getfield v : J
    //   835: lsub
    //   836: ldc2_w 1500
    //   839: lcmp
    //   840: ifle -> 1015
    //   843: goto -> 850
    //   846: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   849: athrow
    //   850: iconst_0
    //   851: istore #26
    //   853: getstatic me/rerere/matrix/internal/na.v : [Lorg/bukkit/block/BlockFace;
    //   856: astore #27
    //   858: aload #27
    //   860: arraylength
    //   861: istore #28
    //   863: iconst_0
    //   864: istore #29
    //   866: iload #29
    //   868: iload #28
    //   870: if_icmpge -> 906
    //   873: aload #27
    //   875: iload #29
    //   877: aaload
    //   878: astore #30
    //   880: aload #25
    //   882: aload #30
    //   884: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   889: invokeinterface isLiquid : ()Z
    //   894: ifeq -> 900
    //   897: iconst_1
    //   898: istore #26
    //   900: iinc #29, 1
    //   903: goto -> 866
    //   906: aload_2
    //   907: lload #12
    //   909: invokestatic n : (Lorg/bukkit/Location;J)Z
    //   912: ifeq -> 918
    //   915: iconst_1
    //   916: istore #26
    //   918: invokestatic currentTimeMillis : ()J
    //   921: aload_0
    //   922: getfield x : J
    //   925: lsub
    //   926: ldc2_w 1000
    //   929: lcmp
    //   930: ifge -> 936
    //   933: iconst_1
    //   934: istore #26
    //   936: invokestatic currentTimeMillis : ()J
    //   939: aload_0
    //   940: getfield v : J
    //   943: lsub
    //   944: ldc2_w 3000
    //   947: lcmp
    //   948: ifge -> 954
    //   951: iconst_1
    //   952: istore #26
    //   954: iload #26
    //   956: ifne -> 1015
    //   959: iconst_1
    //   960: istore #21
    //   962: aload_0
    //   963: lload #6
    //   965: sipush #9308
    //   968: ldc2_w 5228375647300958650
    //   971: lload #4
    //   973: lxor
    //   974: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   979: new java/lang/StringBuilder
    //   982: dup
    //   983: invokespecial <init> : ()V
    //   986: sipush #21200
    //   989: ldc2_w 4949580983830433578
    //   992: lload #4
    //   994: lxor
    //   995: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1000: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1003: dload #15
    //   1005: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1008: invokevirtual toString : ()Ljava/lang/String;
    //   1011: iconst_1
    //   1012: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1015: dload #15
    //   1017: ldc2_w 3.7
    //   1020: dcmpl
    //   1021: ifle -> 1089
    //   1024: aload_0
    //   1025: lload #6
    //   1027: sipush #9308
    //   1030: ldc2_w 5228375647300958650
    //   1033: lload #4
    //   1035: lxor
    //   1036: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1041: new java/lang/StringBuilder
    //   1044: dup
    //   1045: invokespecial <init> : ()V
    //   1048: sipush #17982
    //   1051: ldc2_w 3919082448714128350
    //   1054: lload #4
    //   1056: lxor
    //   1057: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1062: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1065: dload #15
    //   1067: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1070: invokevirtual toString : ()Ljava/lang/String;
    //   1073: bipush #10
    //   1075: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1078: aload #14
    //   1080: invokeinterface leaveVehicle : ()Z
    //   1085: pop
    //   1086: iconst_1
    //   1087: istore #21
    //   1089: aload #20
    //   1091: getstatic org/bukkit/entity/EntityType.HORSE : Lorg/bukkit/entity/EntityType;
    //   1094: if_acmpeq -> 1127
    //   1097: aload #20
    //   1099: getstatic org/bukkit/entity/EntityType.ZOMBIE_HORSE : Lorg/bukkit/entity/EntityType;
    //   1102: if_acmpeq -> 1127
    //   1105: goto -> 1112
    //   1108: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1111: athrow
    //   1112: aload #20
    //   1114: getstatic org/bukkit/entity/EntityType.SKELETON_HORSE : Lorg/bukkit/entity/EntityType;
    //   1117: if_acmpne -> 1557
    //   1120: goto -> 1127
    //   1123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1126: athrow
    //   1127: iconst_1
    //   1128: istore #24
    //   1130: aload #19
    //   1132: checkcast org/bukkit/entity/AbstractHorse
    //   1135: getstatic org/bukkit/attribute/Attribute.GENERIC_MOVEMENT_SPEED : Lorg/bukkit/attribute/Attribute;
    //   1138: invokeinterface getAttribute : (Lorg/bukkit/attribute/Attribute;)Lorg/bukkit/attribute/AttributeInstance;
    //   1143: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1146: checkcast org/bukkit/attribute/AttributeInstance
    //   1149: invokeinterface getValue : ()D
    //   1154: dstore #25
    //   1156: dload #25
    //   1158: ldc2_w 0.196
    //   1161: ddiv
    //   1162: dstore #27
    //   1164: aload #19
    //   1166: checkcast org/bukkit/inventory/InventoryHolder
    //   1169: astore #29
    //   1171: aload #29
    //   1173: invokeinterface getInventory : ()Lorg/bukkit/inventory/Inventory;
    //   1178: astore #30
    //   1180: aload #30
    //   1182: iconst_0
    //   1183: invokeinterface getItem : (I)Lorg/bukkit/inventory/ItemStack;
    //   1188: ifnull -> 1215
    //   1191: aload #30
    //   1193: iconst_0
    //   1194: invokeinterface getItem : (I)Lorg/bukkit/inventory/ItemStack;
    //   1199: invokevirtual getType : ()Lorg/bukkit/Material;
    //   1202: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   1205: if_acmpne -> 1313
    //   1208: goto -> 1215
    //   1211: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1214: athrow
    //   1215: dload #15
    //   1217: ldc2_w 0.33
    //   1220: aload #19
    //   1222: checkcast org/bukkit/entity/AbstractHorse
    //   1225: invokeinterface isLeashed : ()Z
    //   1230: ifeq -> 1248
    //   1233: goto -> 1240
    //   1236: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1239: athrow
    //   1240: dconst_1
    //   1241: goto -> 1249
    //   1244: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1247: athrow
    //   1248: dconst_0
    //   1249: dadd
    //   1250: dcmpl
    //   1251: ifle -> 1313
    //   1254: aload_0
    //   1255: lload #6
    //   1257: sipush #10139
    //   1260: ldc2_w 5898076073665313383
    //   1263: lload #4
    //   1265: lxor
    //   1266: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1271: new java/lang/StringBuilder
    //   1274: dup
    //   1275: invokespecial <init> : ()V
    //   1278: sipush #27615
    //   1281: ldc2_w 8244377963384174120
    //   1284: lload #4
    //   1286: lxor
    //   1287: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1295: dload #15
    //   1297: invokestatic b : (D)D
    //   1300: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1303: invokevirtual toString : ()Ljava/lang/String;
    //   1306: iconst_1
    //   1307: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1310: iconst_1
    //   1311: istore #21
    //   1313: ldc2_w 0.8
    //   1316: dload #27
    //   1318: dmul
    //   1319: aload_3
    //   1320: invokevirtual getY : ()D
    //   1323: aload_2
    //   1324: invokevirtual getY : ()D
    //   1327: ldc2_w 0.25
    //   1330: dadd
    //   1331: dcmpl
    //   1332: ifle -> 1345
    //   1335: ldc2_w 0.4
    //   1338: goto -> 1346
    //   1341: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1344: athrow
    //   1345: dconst_0
    //   1346: dadd
    //   1347: aload_0
    //   1348: getfield r : I
    //   1351: bipush #10
    //   1353: if_icmpgt -> 1371
    //   1356: aload_0
    //   1357: getfield r : I
    //   1360: iconst_1
    //   1361: if_icmpne -> 1390
    //   1364: goto -> 1371
    //   1367: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1370: athrow
    //   1371: aload_0
    //   1372: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1375: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   1378: lload #10
    //   1380: invokevirtual j : (J)D
    //   1383: goto -> 1391
    //   1386: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1389: athrow
    //   1390: dconst_0
    //   1391: dadd
    //   1392: aload #19
    //   1394: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   1399: invokestatic b : (Lorg/bukkit/util/Vector;)D
    //   1402: dadd
    //   1403: dstore #31
    //   1405: aload_2
    //   1406: invokestatic v : (Lorg/bukkit/Location;)Z
    //   1409: ifeq -> 1476
    //   1412: aload_2
    //   1413: invokestatic t : (Lorg/bukkit/Location;)Z
    //   1416: ifne -> 1476
    //   1419: goto -> 1426
    //   1422: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1425: athrow
    //   1426: aload #19
    //   1428: invokeinterface isOnGround : ()Z
    //   1433: ifne -> 1476
    //   1436: goto -> 1443
    //   1439: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1442: athrow
    //   1443: dload #31
    //   1445: aload #20
    //   1447: getstatic org/bukkit/entity/EntityType.HORSE : Lorg/bukkit/entity/EntityType;
    //   1450: if_acmpne -> 1470
    //   1453: goto -> 1460
    //   1456: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1459: athrow
    //   1460: ldc2_w 3.0
    //   1463: goto -> 1473
    //   1466: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1469: athrow
    //   1470: ldc2_w 2.3
    //   1473: ddiv
    //   1474: dstore #31
    //   1476: dload #15
    //   1478: dload #31
    //   1480: dcmpl
    //   1481: ifle -> 1557
    //   1484: aload_0
    //   1485: lload #6
    //   1487: sipush #9308
    //   1490: ldc2_w 5228375647300958650
    //   1493: lload #4
    //   1495: lxor
    //   1496: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1501: new java/lang/StringBuilder
    //   1504: dup
    //   1505: invokespecial <init> : ()V
    //   1508: sipush #27259
    //   1511: ldc2_w 5880425184092125061
    //   1514: lload #4
    //   1516: lxor
    //   1517: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1525: dload #15
    //   1527: invokestatic b : (D)D
    //   1530: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1533: ldc_w '/'
    //   1536: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1539: dload #31
    //   1541: invokestatic b : (D)D
    //   1544: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1547: invokevirtual toString : ()Ljava/lang/String;
    //   1550: iconst_1
    //   1551: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1554: iconst_1
    //   1555: istore #21
    //   1557: invokestatic b : ()I
    //   1560: bipush #12
    //   1562: if_icmplt -> 1839
    //   1565: aload #20
    //   1567: getstatic org/bukkit/entity/EntityType.DONKEY : Lorg/bukkit/entity/EntityType;
    //   1570: if_acmpne -> 1839
    //   1573: goto -> 1580
    //   1576: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1579: athrow
    //   1580: iconst_1
    //   1581: istore #24
    //   1583: aload #19
    //   1585: checkcast org/bukkit/inventory/InventoryHolder
    //   1588: astore #25
    //   1590: aload #25
    //   1592: invokeinterface getInventory : ()Lorg/bukkit/inventory/Inventory;
    //   1597: astore #26
    //   1599: aload #26
    //   1601: iconst_0
    //   1602: invokeinterface getItem : (I)Lorg/bukkit/inventory/ItemStack;
    //   1607: ifnull -> 1634
    //   1610: aload #26
    //   1612: iconst_0
    //   1613: invokeinterface getItem : (I)Lorg/bukkit/inventory/ItemStack;
    //   1618: invokevirtual getType : ()Lorg/bukkit/Material;
    //   1621: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   1624: if_acmpne -> 1732
    //   1627: goto -> 1634
    //   1630: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1633: athrow
    //   1634: dload #15
    //   1636: ldc2_w 0.33
    //   1639: aload #19
    //   1641: checkcast org/bukkit/entity/AbstractHorse
    //   1644: invokeinterface isLeashed : ()Z
    //   1649: ifeq -> 1667
    //   1652: goto -> 1659
    //   1655: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1658: athrow
    //   1659: dconst_1
    //   1660: goto -> 1668
    //   1663: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1666: athrow
    //   1667: dconst_0
    //   1668: dadd
    //   1669: dcmpl
    //   1670: ifle -> 1732
    //   1673: aload_0
    //   1674: lload #6
    //   1676: sipush #28477
    //   1679: ldc2_w 8628117508487639748
    //   1682: lload #4
    //   1684: lxor
    //   1685: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1690: new java/lang/StringBuilder
    //   1693: dup
    //   1694: invokespecial <init> : ()V
    //   1697: sipush #21780
    //   1700: ldc2_w 7917918411160799478
    //   1703: lload #4
    //   1705: lxor
    //   1706: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1711: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1714: dload #15
    //   1716: invokestatic b : (D)D
    //   1719: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1722: invokevirtual toString : ()Ljava/lang/String;
    //   1725: iconst_1
    //   1726: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1729: iconst_1
    //   1730: istore #21
    //   1732: aload_3
    //   1733: invokevirtual getY : ()D
    //   1736: aload_2
    //   1737: invokevirtual getY : ()D
    //   1740: dcmpl
    //   1741: ifne -> 1839
    //   1744: dload #15
    //   1746: ldc2_w 0.8
    //   1749: dcmpl
    //   1750: ifle -> 1839
    //   1753: goto -> 1760
    //   1756: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1759: athrow
    //   1760: aload #19
    //   1762: checkcast org/bukkit/entity/LivingEntity
    //   1765: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   1768: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   1773: ifne -> 1839
    //   1776: goto -> 1783
    //   1779: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1782: athrow
    //   1783: aload_0
    //   1784: lload #6
    //   1786: sipush #9308
    //   1789: ldc2_w 5228375647300958650
    //   1792: lload #4
    //   1794: lxor
    //   1795: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1800: new java/lang/StringBuilder
    //   1803: dup
    //   1804: invokespecial <init> : ()V
    //   1807: sipush #16906
    //   1810: ldc2_w 5284992558740496363
    //   1813: lload #4
    //   1815: lxor
    //   1816: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1821: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1824: dload #15
    //   1826: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1829: invokevirtual toString : ()Ljava/lang/String;
    //   1832: iconst_1
    //   1833: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1836: iconst_1
    //   1837: istore #21
    //   1839: aload #20
    //   1841: getstatic org/bukkit/entity/EntityType.PIG : Lorg/bukkit/entity/EntityType;
    //   1844: if_acmpne -> 2113
    //   1847: iconst_1
    //   1848: istore #24
    //   1850: aload #14
    //   1852: invokeinterface getInventory : ()Lorg/bukkit/inventory/PlayerInventory;
    //   1857: astore #25
    //   1859: aload #25
    //   1861: invokeinterface getItemInMainHand : ()Lorg/bukkit/inventory/ItemStack;
    //   1866: invokevirtual getType : ()Lorg/bukkit/Material;
    //   1869: getstatic me/rerere/matrix/internal/da.a : Lorg/bukkit/Material;
    //   1872: if_acmpeq -> 2006
    //   1875: aload #25
    //   1877: invokeinterface getItemInOffHand : ()Lorg/bukkit/inventory/ItemStack;
    //   1882: invokevirtual getType : ()Lorg/bukkit/Material;
    //   1885: getstatic me/rerere/matrix/internal/da.a : Lorg/bukkit/Material;
    //   1888: if_acmpeq -> 2006
    //   1891: goto -> 1898
    //   1894: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1897: athrow
    //   1898: getstatic me/rerere/matrix/internal/da.a : Lorg/bukkit/Material;
    //   1901: ifnull -> 2006
    //   1904: goto -> 1911
    //   1907: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1910: athrow
    //   1911: dload #15
    //   1913: ldc2_w 0.3
    //   1916: dcmpl
    //   1917: ifle -> 2006
    //   1920: goto -> 1927
    //   1923: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1926: athrow
    //   1927: aload #19
    //   1929: checkcast org/bukkit/entity/LivingEntity
    //   1932: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   1935: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   1940: ifne -> 2006
    //   1943: goto -> 1950
    //   1946: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1949: athrow
    //   1950: aload_0
    //   1951: lload #6
    //   1953: sipush #9308
    //   1956: ldc2_w 5228375647300958650
    //   1959: lload #4
    //   1961: lxor
    //   1962: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1967: new java/lang/StringBuilder
    //   1970: dup
    //   1971: invokespecial <init> : ()V
    //   1974: sipush #19196
    //   1977: ldc2_w 2278652162530367235
    //   1980: lload #4
    //   1982: lxor
    //   1983: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   1988: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1991: dload #15
    //   1993: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1996: invokevirtual toString : ()Ljava/lang/String;
    //   1999: iconst_1
    //   2000: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2003: iconst_1
    //   2004: istore #21
    //   2006: aload_3
    //   2007: invokevirtual getY : ()D
    //   2010: aload_2
    //   2011: invokevirtual getY : ()D
    //   2014: dcmpl
    //   2015: ifne -> 2113
    //   2018: dload #15
    //   2020: ldc2_w 0.5
    //   2023: dcmpl
    //   2024: ifle -> 2113
    //   2027: goto -> 2034
    //   2030: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2033: athrow
    //   2034: aload #19
    //   2036: checkcast org/bukkit/entity/LivingEntity
    //   2039: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   2042: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   2047: ifne -> 2113
    //   2050: goto -> 2057
    //   2053: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2056: athrow
    //   2057: aload_0
    //   2058: lload #6
    //   2060: sipush #9308
    //   2063: ldc2_w 5228375647300958650
    //   2066: lload #4
    //   2068: lxor
    //   2069: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2074: new java/lang/StringBuilder
    //   2077: dup
    //   2078: invokespecial <init> : ()V
    //   2081: sipush #23944
    //   2084: ldc2_w 1645059179535876204
    //   2087: lload #4
    //   2089: lxor
    //   2090: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2095: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2098: dload #15
    //   2100: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2103: invokevirtual toString : ()Ljava/lang/String;
    //   2106: iconst_1
    //   2107: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2110: iconst_1
    //   2111: istore #21
    //   2113: invokestatic b : ()I
    //   2116: bipush #16
    //   2118: if_icmplt -> 2217
    //   2121: aload #20
    //   2123: getstatic org/bukkit/entity/EntityType.STRIDER : Lorg/bukkit/entity/EntityType;
    //   2126: if_acmpne -> 2217
    //   2129: goto -> 2136
    //   2132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2135: athrow
    //   2136: iconst_1
    //   2137: istore #24
    //   2139: dload #15
    //   2141: ldc2_w 0.45
    //   2144: aload_0
    //   2145: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   2148: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   2151: lload #10
    //   2153: invokevirtual j : (J)D
    //   2156: dadd
    //   2157: dcmpl
    //   2158: ifle -> 2217
    //   2161: aload_0
    //   2162: lload #6
    //   2164: sipush #9308
    //   2167: ldc2_w 5228375647300958650
    //   2170: lload #4
    //   2172: lxor
    //   2173: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2178: new java/lang/StringBuilder
    //   2181: dup
    //   2182: invokespecial <init> : ()V
    //   2185: sipush #748
    //   2188: ldc2_w 5012730444255141662
    //   2191: lload #4
    //   2193: lxor
    //   2194: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2199: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2202: dload #15
    //   2204: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2207: invokevirtual toString : ()Ljava/lang/String;
    //   2210: iconst_1
    //   2211: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2214: iconst_1
    //   2215: istore #21
    //   2217: invokestatic b : ()I
    //   2220: bipush #12
    //   2222: if_icmplt -> 2316
    //   2225: aload #19
    //   2227: instanceof org/bukkit/entity/Llama
    //   2230: ifeq -> 2316
    //   2233: goto -> 2240
    //   2236: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2239: athrow
    //   2240: iconst_1
    //   2241: istore #24
    //   2243: dload #15
    //   2245: ldc2_w 0.4
    //   2248: dcmpl
    //   2249: ifle -> 2316
    //   2252: aload_0
    //   2253: lload #6
    //   2255: sipush #9308
    //   2258: ldc2_w 5228375647300958650
    //   2261: lload #4
    //   2263: lxor
    //   2264: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2269: new java/lang/StringBuilder
    //   2272: dup
    //   2273: invokespecial <init> : ()V
    //   2276: sipush #29034
    //   2279: ldc2_w 1074088509266521242
    //   2282: lload #4
    //   2284: lxor
    //   2285: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2293: dload #15
    //   2295: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2298: invokevirtual toString : ()Ljava/lang/String;
    //   2301: iconst_1
    //   2302: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2305: iconst_1
    //   2306: istore #21
    //   2308: aload #14
    //   2310: invokeinterface leaveVehicle : ()Z
    //   2315: pop
    //   2316: iload #24
    //   2318: ifne -> 2424
    //   2321: dload #15
    //   2323: dconst_1
    //   2324: dcmpl
    //   2325: ifle -> 2424
    //   2328: goto -> 2335
    //   2331: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2334: athrow
    //   2335: iconst_1
    //   2336: istore #21
    //   2338: aload_0
    //   2339: lload #6
    //   2341: sipush #9308
    //   2344: ldc2_w 5228375647300958650
    //   2347: lload #4
    //   2349: lxor
    //   2350: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2355: new java/lang/StringBuilder
    //   2358: dup
    //   2359: invokespecial <init> : ()V
    //   2362: sipush #3849
    //   2365: ldc2_w 8208277867522593521
    //   2368: lload #4
    //   2370: lxor
    //   2371: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2376: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2379: aload #19
    //   2381: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   2386: invokevirtual name : ()Ljava/lang/String;
    //   2389: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   2392: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2395: sipush #5624
    //   2398: ldc2_w 2916946761481226271
    //   2401: lload #4
    //   2403: lxor
    //   2404: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2412: dload #15
    //   2414: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2417: invokevirtual toString : ()Ljava/lang/String;
    //   2420: iconst_1
    //   2421: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2424: dload #17
    //   2426: ldc2_w 1.95
    //   2429: dcmpl
    //   2430: iflt -> 2544
    //   2433: aload_2
    //   2434: invokestatic o : (Lorg/bukkit/Location;)Z
    //   2437: ifne -> 2544
    //   2440: goto -> 2447
    //   2443: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2446: athrow
    //   2447: invokestatic j : ()J
    //   2450: aload_0
    //   2451: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   2454: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   2457: invokevirtual j : ()J
    //   2460: lsub
    //   2461: ldc2_w 1000
    //   2464: lcmp
    //   2465: iflt -> 2544
    //   2468: goto -> 2475
    //   2471: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2474: athrow
    //   2475: aload_0
    //   2476: lload #6
    //   2478: sipush #9308
    //   2481: ldc2_w 5228375647300958650
    //   2484: lload #4
    //   2486: lxor
    //   2487: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2492: new java/lang/StringBuilder
    //   2495: dup
    //   2496: invokespecial <init> : ()V
    //   2499: sipush #595
    //   2502: ldc2_w 7991002238900641710
    //   2505: lload #4
    //   2507: lxor
    //   2508: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   2513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2516: dload #17
    //   2518: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2521: invokevirtual toString : ()Ljava/lang/String;
    //   2524: iconst_5
    //   2525: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2528: iconst_1
    //   2529: istore #21
    //   2531: aload #14
    //   2533: invokeinterface leaveVehicle : ()Z
    //   2538: pop
    //   2539: aload_1
    //   2540: aload_2
    //   2541: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2544: iload #21
    //   2546: ifeq -> 2591
    //   2549: aload_0
    //   2550: lload #8
    //   2552: invokevirtual j : (J)I
    //   2555: istore #25
    //   2557: getstatic me/rerere/matrix/internal/ee.l : I
    //   2560: iconst_m1
    //   2561: if_icmpeq -> 2591
    //   2564: iload #25
    //   2566: getstatic me/rerere/matrix/internal/ee.l : I
    //   2569: if_icmplt -> 2591
    //   2572: goto -> 2579
    //   2575: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2578: athrow
    //   2579: aload_1
    //   2580: aload_2
    //   2581: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2584: goto -> 2591
    //   2587: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2590: athrow
    //   2591: aload_0
    //   2592: dload #15
    //   2594: putfield i : D
    //   2597: goto -> 2605
    //   2600: aload_0
    //   2601: iconst_0
    //   2602: putfield r : I
    //   2605: return
    // Exception table:
    //   from	to	target	type
    //   46	53	53	java/lang/RuntimeException
    //   57	70	70	java/lang/RuntimeException
    //   74	97	100	java/lang/RuntimeException
    //   84	105	105	java/lang/RuntimeException
    //   109	128	128	java/lang/RuntimeException
    //   132	157	160	java/lang/RuntimeException
    //   182	214	217	java/lang/RuntimeException
    //   200	242	245	java/lang/RuntimeException
    //   221	316	319	java/lang/RuntimeException
    //   249	328	331	java/lang/RuntimeException
    //   335	358	361	java/lang/RuntimeException
    //   431	446	449	java/lang/RuntimeException
    //   438	461	464	java/lang/RuntimeException
    //   453	474	474	java/lang/RuntimeException
    //   591	616	619	java/lang/RuntimeException
    //   737	759	762	java/lang/RuntimeException
    //   747	779	782	java/lang/RuntimeException
    //   766	799	802	java/lang/RuntimeException
    //   786	821	824	java/lang/RuntimeException
    //   806	843	846	java/lang/RuntimeException
    //   1089	1105	1108	java/lang/RuntimeException
    //   1097	1120	1123	java/lang/RuntimeException
    //   1180	1208	1211	java/lang/RuntimeException
    //   1191	1233	1236	java/lang/RuntimeException
    //   1215	1244	1244	java/lang/RuntimeException
    //   1313	1341	1341	java/lang/RuntimeException
    //   1346	1364	1367	java/lang/RuntimeException
    //   1356	1386	1386	java/lang/RuntimeException
    //   1405	1419	1422	java/lang/RuntimeException
    //   1412	1436	1439	java/lang/RuntimeException
    //   1426	1453	1456	java/lang/RuntimeException
    //   1443	1466	1466	java/lang/RuntimeException
    //   1557	1573	1576	java/lang/RuntimeException
    //   1599	1627	1630	java/lang/RuntimeException
    //   1610	1652	1655	java/lang/RuntimeException
    //   1634	1663	1663	java/lang/RuntimeException
    //   1732	1753	1756	java/lang/RuntimeException
    //   1744	1776	1779	java/lang/RuntimeException
    //   1859	1891	1894	java/lang/RuntimeException
    //   1875	1904	1907	java/lang/RuntimeException
    //   1898	1920	1923	java/lang/RuntimeException
    //   1911	1943	1946	java/lang/RuntimeException
    //   2006	2027	2030	java/lang/RuntimeException
    //   2018	2050	2053	java/lang/RuntimeException
    //   2113	2129	2132	java/lang/RuntimeException
    //   2217	2233	2236	java/lang/RuntimeException
    //   2316	2328	2331	java/lang/RuntimeException
    //   2424	2440	2443	java/lang/RuntimeException
    //   2433	2468	2471	java/lang/RuntimeException
    //   2557	2572	2575	java/lang/RuntimeException
    //   2564	2584	2587	java/lang/RuntimeException
  }
  
  public void b(@NotNull VehicleEnterEvent paramVehicleEnterEvent, long paramLong) {
    this.z = true;
  }
  
  public void b(@NotNull PlayerVelocityEvent paramPlayerVelocityEvent) {
    try {
      if (paramPlayerVelocityEvent.getVelocity().getX() == 0.0D) {
        try {
          if (paramPlayerVelocityEvent.getVelocity().getZ() != 0.0D) {
            this.k = System.currentTimeMillis();
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.k = System.currentTimeMillis();
  }
  
  static {
    long l = a ^ 0x674F65B4DB9DL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[24];
    boolean bool = false;
    String str;
    int i = (str = "=8ø¤î\020ô¢1a\026Ü%\026[}[¤¹·X\017X<ÝAÿ\031¢\t£s³\bª9@`|j1`F§ÖvÃÑ\023 c_Q°\036ÓÇ\034c/?õ\037:§3·ûp\nL\002qÍni¿zÀ[WÿHÅé¾RÛ±¬VËI¤+Àf\036oÿI¦,I\030\r$ÐþO¦/\0264²¤\024¢#û´@ íÿ¯pþ+.:Ú°t¹Ä\rtfBeã\büxe©¶HëL\024JíSÈ\037<:¥B°®£ï<a9Ü\016ÝóSíÅÏP\002¾ÍiVuãO\017 e¿ÓÃ:$¹ÞNÆÂ\016u>\006I0à\bÇ\0048å?2h57§Æ ÷\037kö\007~ \006ÔË;\022¸[Oæ8|-\002\034Ó\r?¯\022ô.(ªô\b\013çx$A\026Ç\"Ñ_ÁÁPUY\nè­6oÚ._h.y1ÖÂóÒVHBÒåç\000(ËÍg_ö\034§ãÅö\nK¨ô(LÚ¢u¹(âf\"\001º¯¿{§\004|-\002E\017¤Ñ1ØO\034fùnaÏ\031Ào¸j»ô¤+\b\030ÄcÃf\022g\035x%Ùåh\002tOïöêË/Àm­ Ë¯¸ÏáE\006F¯ê;þ½\013«\023)\0067¿tì\031¤4OCR@.B¹Ýö­\bX¯\rÙ\\Àt@au¥Ñ]N\007|\034ññ\005<µÄ¸ÈXb®|c$S\032\030 ¥Dï]À÷Ã/àÄ\013\003Û×,£PP!\005©x0×y\r[´EµË²øÒ 8\030\035\033\017L\023i§î\027\n\034@7\002½/¿òÍí²°cX)4uØ×¥\016¸vúöá\030§×?\003[gÂEe`@¸\\c[(\001Óó:\rÍ3J\tE,Ä\026¹6Qµ\000JdßÍâ;T\023é-o} ö)\021r7Å\036Á\005\032ñTxÛÓçáW°P<^ø4\031|Ñ\t\031ÿ\002G8¡\020Mvµ\002pæà7~p ¸CúS8wBtô{\036ò*ÖÚðÿ\\{Óå\n©ÅZÉ\032Èvì@Ðæ\023%Ùíªùìá\033SQ$ö®ýì\t1 ==9!ÃlF3\0271¼#ø$ä\030Úïß'\027Ob~Ð\\ßX\032qôd\034§¥ú\000Â¿KI\tÝeÚÎÈU@Åë^ã\006§!_zNî4G5Á$\017^\000ÃfO$cW\034-\037yK\fØL\016\016Þ¤5Ñ\0276a\001ZÅ2xâ^ïÑwÛÃËXY\024àÓ\023dA\n0\024é\n2É\034s`\037á\fNAù&£ã£1voÎD\"e\017¶[ÚÁ­ë<eâ]DbYY{#nRL\017d\006 õFÕù\f\002Ë#Mu×¡À¼ß@`\nÖünð\007ð\n\002äìò)KÓ\031 00p±Q2£² 8®¯\026\033ag\t±a-ï°\000òDñ¹@Ç\f\bÖ¤\037$YBî\034Á\020Yä?¯-ýÏ\nÏ]Íü2\030 +ÃZ\032Ó\006\tiÊ{Óþ\004tR´¤\031Ð\022\005 yff\032íû­\023E+Ô\026·\037¨$ö0Ë\025Ç9-¦p032ÜHX[WÒø<¢ þaÝÇåÀvÙ½0G»v¹cû\r\025é/Î,yþ)~tüÏâ]Ö\002üýM\016Ù£ÕàN\013nÈ6*\t*æ\réyær¿â%éëjóZy ôP3b»HÜ\ni#,ÅÀ(Ë0JÀ´>kD\0179Zw°oý>\\ÒÖ5>vÉÔï\017òÔüþË'a\"I\016æX\000>¶+\017E:HYÀ«h®ä¦2\004").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x66B;
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
        throw new RuntimeException("me/rerere/matrix/internal/ee", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/ee'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
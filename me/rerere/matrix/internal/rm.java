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
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class rm extends zk {
  private double k = 0.0D;
  
  private static int v;
  
  private long b;
  
  private static final Material i;
  
  private static final long a = o3.a(4915885401356348744L, -7764271056210591621L, MethodHandles.lookup().lookupClass()).a(171897516223061L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  static {
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[12];
    boolean bool = false;
    String str;
    int i = (str = "ÙoöÄ¡\017!±\024»1e\033 Ì6q·úD©ÎY9¤\005n¼à§\007û\030©ázS!\007vZ®[\036\035Ru­¯\n>~s\026o\030;G±s:u\003©V0÷\033ú#º¯¦±äö t¼<¬ãÿ5¿ü\fÀ?WÙ\034É%\017{1Ä~á¶ëi±) ÷S\"Áü=\030¤ i¾\026ÛZ\023Æy\022¤çWeßÆÒÛ\030`\0334ÄÎ(<O\fQN'\rÙ]xÑ[âC ã,k°©º\003ÊzCµn\030\024©ïb9GVf\017êÖ½ö\t\030fÍß&È×zI÷[Çü8ð\007Ç\006Ë°¤Ê\020.\\øGr3\000R\"´^í\016ÇzHQ^¬\033g+Ç¶Wx\035®Ê?D§Yp\025LlýÇ9\024Xìë'iÉÛ\017\037îò«vc Ýz0\020¯­Q©8vyWºT.ýÛä\006").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  public rm(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rm.a : J
    //   3: ldc2_w 3325483642416
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   12: invokevirtual b : ()Lme/rerere/matrix/internal/ci;
    //   15: invokevirtual j : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   18: sipush #21697
    //   21: ldc2_w 1689614972006837894
    //   24: lload_1
    //   25: lxor
    //   26: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   31: bipush #30
    //   33: invokeinterface getInt : (Ljava/lang/String;I)I
    //   38: putstatic me/rerere/matrix/internal/rm.v : I
    //   41: return
  }
  
  public void b(@NotNull EntityDamageEvent paramEntityDamageEvent) {
    this.b = System.currentTimeMillis();
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rm.a : J
    //   3: ldc2_w 134701246925422
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 85848001921336
    //   15: lxor
    //   16: dup2
    //   17: bipush #32
    //   19: lushr
    //   20: l2i
    //   21: istore #6
    //   23: dup2
    //   24: bipush #32
    //   26: lshl
    //   27: bipush #48
    //   29: lushr
    //   30: l2i
    //   31: istore #7
    //   33: dup2
    //   34: bipush #48
    //   36: lshl
    //   37: bipush #48
    //   39: lushr
    //   40: l2i
    //   41: istore #8
    //   43: pop2
    //   44: dup2
    //   45: ldc2_w 52505769969781
    //   48: lxor
    //   49: lstore #9
    //   51: dup2
    //   52: ldc2_w 109639093197543
    //   55: lxor
    //   56: lstore #11
    //   58: dup2
    //   59: ldc2_w 37579749197918
    //   62: lxor
    //   63: dup2
    //   64: bipush #32
    //   66: lushr
    //   67: l2i
    //   68: istore #13
    //   70: dup2
    //   71: bipush #32
    //   73: lshl
    //   74: bipush #48
    //   76: lushr
    //   77: l2i
    //   78: istore #14
    //   80: dup2
    //   81: bipush #48
    //   83: lshl
    //   84: bipush #48
    //   86: lushr
    //   87: l2i
    //   88: istore #15
    //   90: pop2
    //   91: dup2
    //   92: ldc2_w 93785538854403
    //   95: lxor
    //   96: lstore #16
    //   98: dup2
    //   99: ldc2_w 78610039864207
    //   102: lxor
    //   103: lstore #18
    //   105: dup2
    //   106: ldc2_w 100700816736239
    //   109: lxor
    //   110: dup2
    //   111: bipush #8
    //   113: lushr
    //   114: lstore #20
    //   116: dup2
    //   117: bipush #56
    //   119: lshl
    //   120: bipush #56
    //   122: lushr
    //   123: l2i
    //   124: istore #22
    //   126: pop2
    //   127: dup2
    //   128: ldc2_w 31421620104588
    //   131: lxor
    //   132: dup2
    //   133: bipush #32
    //   135: lushr
    //   136: l2i
    //   137: istore #23
    //   139: dup2
    //   140: bipush #32
    //   142: lshl
    //   143: bipush #48
    //   145: lushr
    //   146: l2i
    //   147: istore #24
    //   149: dup2
    //   150: bipush #48
    //   152: lshl
    //   153: bipush #48
    //   155: lushr
    //   156: l2i
    //   157: istore #25
    //   159: pop2
    //   160: pop2
    //   161: aload_1
    //   162: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   165: astore #26
    //   167: iconst_0
    //   168: istore #27
    //   170: invokestatic b : ()I
    //   173: bipush #9
    //   175: if_icmplt -> 198
    //   178: aload #26
    //   180: invokeinterface isGliding : ()Z
    //   185: ifeq -> 198
    //   188: goto -> 195
    //   191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   194: athrow
    //   195: iconst_1
    //   196: istore #27
    //   198: aload #26
    //   200: invokeinterface isFlying : ()Z
    //   205: ifne -> 225
    //   208: aload #26
    //   210: invokeinterface getAllowFlight : ()Z
    //   215: ifeq -> 230
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: return
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: aload #26
    //   232: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   237: ifnull -> 245
    //   240: return
    //   241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   244: athrow
    //   245: aload #26
    //   247: invokeinterface getWalkSpeed : ()F
    //   252: ldc_w 0.2
    //   255: fsub
    //   256: invokestatic abs : (F)F
    //   259: ldc_w 0.02
    //   262: fcmpl
    //   263: ifle -> 271
    //   266: return
    //   267: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   270: athrow
    //   271: aload #26
    //   273: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   278: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   281: if_acmpeq -> 309
    //   284: aload #26
    //   286: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   291: getstatic org/bukkit/GameMode.ADVENTURE : Lorg/bukkit/GameMode;
    //   294: if_acmpeq -> 309
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   303: athrow
    //   304: return
    //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: aload_2
    //   310: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   313: astore #28
    //   315: aload_2
    //   316: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   319: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   322: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   327: astore #29
    //   329: aload #28
    //   331: invokeinterface getType : ()Lorg/bukkit/Material;
    //   336: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   339: if_acmpne -> 592
    //   342: aload #28
    //   344: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   347: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   352: invokeinterface getType : ()Lorg/bukkit/Material;
    //   357: getstatic me/rerere/matrix/internal/rm.i : Lorg/bukkit/Material;
    //   360: if_acmpne -> 592
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   369: athrow
    //   370: iload #13
    //   372: iload #14
    //   374: i2s
    //   375: aload #26
    //   377: iload #15
    //   379: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   382: istore #30
    //   384: aload_2
    //   385: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   388: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   391: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   396: astore #31
    //   398: iload #30
    //   400: ifeq -> 592
    //   403: iconst_0
    //   404: istore #32
    //   406: getstatic me/rerere/matrix/internal/na.v : [Lorg/bukkit/block/BlockFace;
    //   409: astore #33
    //   411: aload #33
    //   413: arraylength
    //   414: istore #34
    //   416: iconst_0
    //   417: istore #35
    //   419: iload #35
    //   421: iload #34
    //   423: if_icmpge -> 486
    //   426: aload #33
    //   428: iload #35
    //   430: aaload
    //   431: astore #36
    //   433: aload #31
    //   435: aload #36
    //   437: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   442: astore #37
    //   444: aload #37
    //   446: invokeinterface getType : ()Lorg/bukkit/Material;
    //   451: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   454: if_acmpeq -> 480
    //   457: aload #37
    //   459: invokeinterface getType : ()Lorg/bukkit/Material;
    //   464: getstatic me/rerere/matrix/internal/rm.i : Lorg/bukkit/Material;
    //   467: if_acmpeq -> 480
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   476: athrow
    //   477: iconst_1
    //   478: istore #32
    //   480: iinc #35, 1
    //   483: goto -> 419
    //   486: aload_3
    //   487: invokevirtual getY : ()D
    //   490: aload_2
    //   491: invokevirtual getY : ()D
    //   494: dcmpg
    //   495: ifge -> 501
    //   498: iconst_1
    //   499: istore #32
    //   501: aload_2
    //   502: invokevirtual getY : ()D
    //   505: dconst_1
    //   506: drem
    //   507: dconst_0
    //   508: dcmpl
    //   509: ifeq -> 515
    //   512: iconst_1
    //   513: istore #32
    //   515: iload #32
    //   517: ifne -> 592
    //   520: aload_0
    //   521: lload #9
    //   523: sipush #31811
    //   526: ldc2_w 798557195735671380
    //   529: lload #4
    //   531: lxor
    //   532: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   537: new java/lang/StringBuilder
    //   540: dup
    //   541: invokespecial <init> : ()V
    //   544: sipush #13342
    //   547: ldc2_w 3345864019955313157
    //   550: lload #4
    //   552: lxor
    //   553: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   558: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: aload_3
    //   562: invokevirtual getY : ()D
    //   565: aload_2
    //   566: invokevirtual getY : ()D
    //   569: dsub
    //   570: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   573: invokevirtual toString : ()Ljava/lang/String;
    //   576: iconst_3
    //   577: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   580: aload_1
    //   581: aload_2
    //   582: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   585: goto -> 592
    //   588: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   591: athrow
    //   592: aload #28
    //   594: invokeinterface getType : ()Lorg/bukkit/Material;
    //   599: getstatic me/rerere/matrix/internal/rm.i : Lorg/bukkit/Material;
    //   602: if_acmpeq -> 625
    //   605: aload #29
    //   607: invokeinterface getType : ()Lorg/bukkit/Material;
    //   612: getstatic me/rerere/matrix/internal/rm.i : Lorg/bukkit/Material;
    //   615: if_acmpne -> 1628
    //   618: goto -> 625
    //   621: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   624: athrow
    //   625: aload_3
    //   626: invokevirtual getY : ()D
    //   629: aload_2
    //   630: invokevirtual getY : ()D
    //   633: dsub
    //   634: dstore #30
    //   636: dload #30
    //   638: dconst_0
    //   639: dcmpl
    //   640: ifeq -> 893
    //   643: ldc2_w 0.1
    //   646: invokestatic j : ()J
    //   649: aload_0
    //   650: getfield b : J
    //   653: lsub
    //   654: ldc2_w 1200
    //   657: lcmp
    //   658: ifgt -> 690
    //   661: goto -> 668
    //   664: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   667: athrow
    //   668: aload_0
    //   669: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   672: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   675: lload #20
    //   677: iload #22
    //   679: i2b
    //   680: invokevirtual b : (JB)D
    //   683: goto -> 691
    //   686: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   689: athrow
    //   690: dconst_0
    //   691: dadd
    //   692: dstore #32
    //   694: dload #30
    //   696: invokestatic abs : (D)D
    //   699: dload #32
    //   701: dcmpl
    //   702: ifle -> 893
    //   705: dload #30
    //   707: invokestatic abs : (D)D
    //   710: aload_0
    //   711: getfield k : D
    //   714: invokestatic abs : (D)D
    //   717: dcmpl
    //   718: iflt -> 893
    //   721: goto -> 728
    //   724: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   727: athrow
    //   728: aload_3
    //   729: invokestatic x : (Lorg/bukkit/Location;)Z
    //   732: ifne -> 893
    //   735: goto -> 742
    //   738: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   741: athrow
    //   742: aload_2
    //   743: getstatic org/bukkit/Material.SOUL_SAND : Lorg/bukkit/Material;
    //   746: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   749: ifne -> 893
    //   752: goto -> 759
    //   755: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   758: athrow
    //   759: dload #30
    //   761: ldc2_w 0.188
    //   764: dcmpl
    //   765: ifeq -> 893
    //   768: goto -> 775
    //   771: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   774: athrow
    //   775: aload_0
    //   776: lload #9
    //   778: sipush #8842
    //   781: ldc2_w 8703676261146786970
    //   784: lload #4
    //   786: lxor
    //   787: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   792: new java/lang/StringBuilder
    //   795: dup
    //   796: invokespecial <init> : ()V
    //   799: sipush #11608
    //   802: ldc2_w 5414428942600926026
    //   805: lload #4
    //   807: lxor
    //   808: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   813: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   816: dload #30
    //   818: invokestatic b : (D)D
    //   821: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   824: sipush #15475
    //   827: ldc2_w 1840668881426768491
    //   830: lload #4
    //   832: lxor
    //   833: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   838: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   841: invokevirtual toString : ()Ljava/lang/String;
    //   844: iconst_2
    //   845: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   848: invokestatic random : ()D
    //   851: ldc2_w 0.5
    //   854: dcmpg
    //   855: iflt -> 881
    //   858: goto -> 865
    //   861: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   864: athrow
    //   865: dload #30
    //   867: ldc2_w 0.5
    //   870: dcmpl
    //   871: ifle -> 893
    //   874: goto -> 881
    //   877: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   880: athrow
    //   881: aload_1
    //   882: aload_2
    //   883: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   886: goto -> 893
    //   889: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   892: athrow
    //   893: aload_2
    //   894: aload_3
    //   895: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   898: dstore #32
    //   900: ldc2_w 0.121
    //   903: dstore #34
    //   905: iload #13
    //   907: iload #14
    //   909: i2s
    //   910: aload #26
    //   912: iload #15
    //   914: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   917: istore #36
    //   919: invokestatic currentTimeMillis : ()J
    //   922: aload_0
    //   923: getfield b : J
    //   926: lsub
    //   927: ldc2_w 1500
    //   930: lcmp
    //   931: ifge -> 942
    //   934: dload #34
    //   936: ldc2_w 0.9
    //   939: dadd
    //   940: dstore #34
    //   942: aload #26
    //   944: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   947: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   952: ifeq -> 981
    //   955: dload #34
    //   957: aload #26
    //   959: iload #6
    //   961: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   964: iload #7
    //   966: i2s
    //   967: iload #8
    //   969: i2s
    //   970: invokestatic b : (Lorg/bukkit/entity/Player;ILorg/bukkit/potion/PotionEffectType;SS)I
    //   973: i2d
    //   974: ldc2_w 0.005
    //   977: dmul
    //   978: dadd
    //   979: dstore #34
    //   981: invokestatic currentTimeMillis : ()J
    //   984: aload_0
    //   985: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   988: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   991: invokevirtual j : ()J
    //   994: lsub
    //   995: ldc2_w 1500
    //   998: lcmp
    //   999: ifgt -> 1019
    //   1002: dload #34
    //   1004: aload_0
    //   1005: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1008: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   1011: lload #18
    //   1013: invokevirtual j : (J)D
    //   1016: dadd
    //   1017: dstore #34
    //   1019: aload #26
    //   1021: invokeinterface isSneaking : ()Z
    //   1026: ifeq -> 1049
    //   1029: iload #36
    //   1031: ifeq -> 1049
    //   1034: goto -> 1041
    //   1037: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1040: athrow
    //   1041: dload #34
    //   1043: ldc2_w 0.06
    //   1046: dsub
    //   1047: dstore #34
    //   1049: invokestatic b : ()I
    //   1052: bipush #9
    //   1054: if_icmplt -> 1082
    //   1057: aload #26
    //   1059: invokeinterface isGliding : ()Z
    //   1064: ifeq -> 1082
    //   1067: goto -> 1074
    //   1070: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1073: athrow
    //   1074: dload #34
    //   1076: ldc2_w 0.2
    //   1079: dadd
    //   1080: dstore #34
    //   1082: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   1085: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   1088: iload #23
    //   1090: iload #24
    //   1092: iload #25
    //   1094: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   1097: aload #26
    //   1099: lload #16
    //   1101: invokeinterface b : (Lorg/bukkit/entity/LivingEntity;J)F
    //   1106: fstore #37
    //   1108: aload #26
    //   1110: invokeinterface isSprinting : ()Z
    //   1115: ifne -> 1126
    //   1118: fload #37
    //   1120: ldc_w 1.3
    //   1123: fmul
    //   1124: fstore #37
    //   1126: fload #37
    //   1128: f2d
    //   1129: ldc2_w 0.14
    //   1132: dcmpl
    //   1133: ifle -> 1144
    //   1136: dload #34
    //   1138: ldc2_w 0.3
    //   1141: dadd
    //   1142: dstore #34
    //   1144: aload_3
    //   1145: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1148: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1153: getstatic me/rerere/matrix/internal/rm.i : Lorg/bukkit/Material;
    //   1156: if_acmpne -> 1531
    //   1159: dload #32
    //   1161: dload #34
    //   1163: dcmpl
    //   1164: ifle -> 1313
    //   1167: goto -> 1174
    //   1170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1173: athrow
    //   1174: aload_0
    //   1175: lload #9
    //   1177: sipush #8842
    //   1180: ldc2_w 8703676261146786970
    //   1183: lload #4
    //   1185: lxor
    //   1186: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1191: new java/lang/StringBuilder
    //   1194: dup
    //   1195: invokespecial <init> : ()V
    //   1198: sipush #11973
    //   1201: ldc2_w 8078095137744842966
    //   1204: lload #4
    //   1206: lxor
    //   1207: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1215: dload #32
    //   1217: invokestatic b : (D)D
    //   1220: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1223: sipush #12752
    //   1226: ldc2_w 3683326671068000197
    //   1229: lload #4
    //   1231: lxor
    //   1232: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1240: invokevirtual toString : ()Ljava/lang/String;
    //   1243: iconst_2
    //   1244: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1247: aload_0
    //   1248: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1251: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   1254: aload_0
    //   1255: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   1258: lload #11
    //   1260: dup2_x1
    //   1261: pop2
    //   1262: invokevirtual b : (JLme/rerere/matrix/internal/yk;)I
    //   1265: getstatic me/rerere/matrix/internal/rm.v : I
    //   1268: if_icmplt -> 1313
    //   1271: goto -> 1278
    //   1274: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1277: athrow
    //   1278: getstatic me/rerere/matrix/internal/rm.v : I
    //   1281: iconst_m1
    //   1282: if_icmpeq -> 1313
    //   1285: goto -> 1292
    //   1288: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1291: athrow
    //   1292: aload_2
    //   1293: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1296: astore #38
    //   1298: aload #38
    //   1300: aload_3
    //   1301: invokevirtual getY : ()D
    //   1304: invokevirtual setY : (D)V
    //   1307: aload_1
    //   1308: aload #38
    //   1310: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1313: iload #36
    //   1315: ifne -> 1628
    //   1318: aload_3
    //   1319: invokevirtual getY : ()D
    //   1322: aload_2
    //   1323: invokevirtual getY : ()D
    //   1326: dcmpg
    //   1327: ifge -> 1628
    //   1330: goto -> 1337
    //   1333: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1336: athrow
    //   1337: ldc2_w 0.075
    //   1340: dstore #34
    //   1342: invokestatic currentTimeMillis : ()J
    //   1345: aload_0
    //   1346: getfield b : J
    //   1349: lsub
    //   1350: ldc2_w 1500
    //   1353: lcmp
    //   1354: ifge -> 1365
    //   1357: dload #34
    //   1359: ldc2_w 0.9
    //   1362: dadd
    //   1363: dstore #34
    //   1365: invokestatic b : ()I
    //   1368: bipush #9
    //   1370: if_icmplt -> 1381
    //   1373: dload #34
    //   1375: ldc2_w 0.01
    //   1378: dadd
    //   1379: dstore #34
    //   1381: dload #32
    //   1383: dload #34
    //   1385: dcmpl
    //   1386: ifle -> 1628
    //   1389: aload_0
    //   1390: lload #9
    //   1392: sipush #8842
    //   1395: ldc2_w 8703676261146786970
    //   1398: lload #4
    //   1400: lxor
    //   1401: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1406: new java/lang/StringBuilder
    //   1409: dup
    //   1410: invokespecial <init> : ()V
    //   1413: sipush #9170
    //   1416: ldc2_w 8067463201205255622
    //   1419: lload #4
    //   1421: lxor
    //   1422: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1430: dload #32
    //   1432: invokestatic b : (D)D
    //   1435: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1438: sipush #10712
    //   1441: ldc2_w 7003151059947386830
    //   1444: lload #4
    //   1446: lxor
    //   1447: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1455: invokevirtual toString : ()Ljava/lang/String;
    //   1458: iconst_4
    //   1459: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1462: aload_0
    //   1463: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1466: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   1469: aload_0
    //   1470: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   1473: lload #11
    //   1475: dup2_x1
    //   1476: pop2
    //   1477: invokevirtual b : (JLme/rerere/matrix/internal/yk;)I
    //   1480: getstatic me/rerere/matrix/internal/rm.v : I
    //   1483: if_icmplt -> 1628
    //   1486: goto -> 1493
    //   1489: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1492: athrow
    //   1493: getstatic me/rerere/matrix/internal/rm.v : I
    //   1496: iconst_m1
    //   1497: if_icmpeq -> 1628
    //   1500: goto -> 1507
    //   1503: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1506: athrow
    //   1507: aload_2
    //   1508: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1511: astore #38
    //   1513: aload #38
    //   1515: aload_3
    //   1516: invokevirtual getY : ()D
    //   1519: invokevirtual setY : (D)V
    //   1522: aload_1
    //   1523: aload #38
    //   1525: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1528: goto -> 1628
    //   1531: dload #32
    //   1533: dload #34
    //   1535: ldc2_w 0.2
    //   1538: dadd
    //   1539: dcmpl
    //   1540: ifle -> 1628
    //   1543: aload_0
    //   1544: lload #9
    //   1546: sipush #8842
    //   1549: ldc2_w 8703676261146786970
    //   1552: lload #4
    //   1554: lxor
    //   1555: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1560: new java/lang/StringBuilder
    //   1563: dup
    //   1564: invokespecial <init> : ()V
    //   1567: sipush #9170
    //   1570: ldc2_w 8067463201205255622
    //   1573: lload #4
    //   1575: lxor
    //   1576: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1584: dload #32
    //   1586: invokestatic b : (D)D
    //   1589: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1592: sipush #16924
    //   1595: ldc2_w 3143613244784319501
    //   1598: lload #4
    //   1600: lxor
    //   1601: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   1606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1609: invokevirtual toString : ()Ljava/lang/String;
    //   1612: iconst_4
    //   1613: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1616: aload_1
    //   1617: aload_2
    //   1618: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1621: goto -> 1628
    //   1624: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1627: athrow
    //   1628: aload_0
    //   1629: aload_3
    //   1630: invokevirtual getY : ()D
    //   1633: aload_2
    //   1634: invokevirtual getY : ()D
    //   1637: dsub
    //   1638: putfield k : D
    //   1641: return
    // Exception table:
    //   from	to	target	type
    //   170	188	191	java/lang/RuntimeException
    //   198	218	221	java/lang/RuntimeException
    //   208	226	226	java/lang/RuntimeException
    //   230	241	241	java/lang/RuntimeException
    //   245	267	267	java/lang/RuntimeException
    //   271	297	300	java/lang/RuntimeException
    //   284	305	305	java/lang/RuntimeException
    //   329	363	366	java/lang/RuntimeException
    //   444	470	473	java/lang/RuntimeException
    //   515	585	588	java/lang/RuntimeException
    //   592	618	621	java/lang/RuntimeException
    //   636	661	664	java/lang/RuntimeException
    //   643	686	686	java/lang/RuntimeException
    //   694	721	724	java/lang/RuntimeException
    //   705	735	738	java/lang/RuntimeException
    //   728	752	755	java/lang/RuntimeException
    //   742	768	771	java/lang/RuntimeException
    //   759	858	861	java/lang/RuntimeException
    //   775	874	877	java/lang/RuntimeException
    //   865	886	889	java/lang/RuntimeException
    //   1019	1034	1037	java/lang/RuntimeException
    //   1049	1067	1070	java/lang/RuntimeException
    //   1144	1167	1170	java/lang/RuntimeException
    //   1159	1271	1274	java/lang/RuntimeException
    //   1174	1285	1288	java/lang/RuntimeException
    //   1313	1330	1333	java/lang/RuntimeException
    //   1381	1486	1489	java/lang/RuntimeException
    //   1389	1500	1503	java/lang/RuntimeException
    //   1531	1621	1624	java/lang/RuntimeException
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x458D;
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
        throw new RuntimeException("me/rerere/matrix/internal/rm", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/rm'
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
  
  static {
    long l = a ^ 0x5AF40E187ED0L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.util.Vector;

public class vn extends zk {
  private static long l;
  
  private static int r;
  
  private boolean x = false;
  
  @Nullable
  private Location z;
  
  @Nullable
  private Vector k;
  
  private static boolean v;
  
  private long b;
  
  private long i;
  
  private static final long a = o3.a(-8059777537942101877L, -6698122441205522732L, MethodHandles.lookup().lookupClass()).a(217443437029109L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(@NotNull PlayerRespawnEvent paramPlayerRespawnEvent) {
    this.i = System.currentTimeMillis();
  }
  
  public void b(@NotNull PlayerChangedWorldEvent paramPlayerChangedWorldEvent, long paramLong) {
    this.z = null;
    this.i = System.currentTimeMillis();
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vn.a : J
    //   3: ldc2_w 4473152391710
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #25733
    //   15: ldc2_w 9181269113907475374
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   25: ldc2_w 500
    //   28: invokeinterface getLong : (Ljava/lang/String;J)J
    //   33: putstatic me/rerere/matrix/internal/vn.l : J
    //   36: aload_0
    //   37: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   40: sipush #23598
    //   43: ldc2_w 217140664549427972
    //   46: lload_1
    //   47: lxor
    //   48: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   53: iconst_5
    //   54: invokeinterface getInt : (Ljava/lang/String;I)I
    //   59: putstatic me/rerere/matrix/internal/vn.r : I
    //   62: aload_0
    //   63: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   66: sipush #29962
    //   69: ldc2_w 8376894616272364071
    //   72: lload_1
    //   73: lxor
    //   74: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   79: iconst_1
    //   80: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   85: putstatic me/rerere/matrix/internal/vn.v : Z
    //   88: return
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/vn.a : J
    //   3: ldc2_w 138081740320320
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
    //   26: ldc2_w 93785538854403
    //   29: lxor
    //   30: lstore #10
    //   32: dup2
    //   33: ldc2_w 65314852799287
    //   36: lxor
    //   37: lstore #12
    //   39: dup2
    //   40: ldc2_w 136466596799638
    //   43: lxor
    //   44: dup2
    //   45: bipush #48
    //   47: lushr
    //   48: l2i
    //   49: istore #14
    //   51: dup2
    //   52: bipush #16
    //   54: lshl
    //   55: bipush #16
    //   57: lushr
    //   58: lstore #15
    //   60: pop2
    //   61: dup2
    //   62: ldc2_w 31421620104588
    //   65: lxor
    //   66: dup2
    //   67: bipush #32
    //   69: lushr
    //   70: l2i
    //   71: istore #17
    //   73: dup2
    //   74: bipush #32
    //   76: lshl
    //   77: bipush #48
    //   79: lushr
    //   80: l2i
    //   81: istore #18
    //   83: dup2
    //   84: bipush #48
    //   86: lshl
    //   87: bipush #48
    //   89: lushr
    //   90: l2i
    //   91: istore #19
    //   93: pop2
    //   94: pop2
    //   95: aload_1
    //   96: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   99: astore #23
    //   101: aload_1
    //   102: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   105: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   108: astore #24
    //   110: aload #23
    //   112: invokeinterface isInsideVehicle : ()Z
    //   117: ifeq -> 125
    //   120: return
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: invokestatic b : ()I
    //   128: bipush #9
    //   130: if_icmplt -> 155
    //   133: aload #23
    //   135: invokeinterface isGliding : ()Z
    //   140: ifeq -> 155
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   149: athrow
    //   150: return
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: invokestatic b : ()I
    //   158: bipush #13
    //   160: if_icmplt -> 202
    //   163: aload #23
    //   165: invokeinterface isRiptiding : ()Z
    //   170: ifne -> 197
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: aload #23
    //   182: invokeinterface isSwimming : ()Z
    //   187: ifeq -> 202
    //   190: goto -> 197
    //   193: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   196: athrow
    //   197: return
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: invokestatic b : ()I
    //   205: bipush #14
    //   207: if_icmplt -> 255
    //   210: aload #23
    //   212: invokeinterface getPose : ()Lorg/bukkit/entity/Pose;
    //   217: getstatic org/bukkit/entity/Pose.STANDING : Lorg/bukkit/entity/Pose;
    //   220: if_acmpeq -> 255
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: aload #23
    //   232: invokeinterface getPose : ()Lorg/bukkit/entity/Pose;
    //   237: getstatic org/bukkit/entity/Pose.SNEAKING : Lorg/bukkit/entity/Pose;
    //   240: if_acmpeq -> 255
    //   243: goto -> 250
    //   246: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   249: athrow
    //   250: return
    //   251: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   254: athrow
    //   255: aload #23
    //   257: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   262: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   265: if_acmpne -> 273
    //   268: return
    //   269: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   272: athrow
    //   273: invokestatic currentTimeMillis : ()J
    //   276: aload_0
    //   277: getfield i : J
    //   280: lsub
    //   281: ldc2_w 4000
    //   284: lcmp
    //   285: ifge -> 293
    //   288: return
    //   289: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   292: athrow
    //   293: aload_2
    //   294: invokestatic x : (Lorg/bukkit/Location;)Z
    //   297: ifeq -> 305
    //   300: return
    //   301: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   304: athrow
    //   305: aload_2
    //   306: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   309: invokeinterface getType : ()Lorg/bukkit/Material;
    //   314: getstatic org/bukkit/Material.LADDER : Lorg/bukkit/Material;
    //   317: if_acmpeq -> 342
    //   320: aload_3
    //   321: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   324: invokeinterface getType : ()Lorg/bukkit/Material;
    //   329: getstatic org/bukkit/Material.LADDER : Lorg/bukkit/Material;
    //   332: if_acmpne -> 347
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   341: athrow
    //   342: return
    //   343: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   346: athrow
    //   347: aload_2
    //   348: aload_3
    //   349: invokestatic p : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   352: ldc2_w 16.0
    //   355: dcmpl
    //   356: ifle -> 364
    //   359: return
    //   360: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   363: athrow
    //   364: invokestatic currentTimeMillis : ()J
    //   367: aload_0
    //   368: getfield b : J
    //   371: lsub
    //   372: getstatic me/rerere/matrix/internal/vn.l : J
    //   375: lcmp
    //   376: ifge -> 389
    //   379: aload_1
    //   380: aload_2
    //   381: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   384: return
    //   385: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   388: athrow
    //   389: aload_0
    //   390: getfield k : Lorg/bukkit/util/Vector;
    //   393: ifnull -> 430
    //   396: aload_0
    //   397: getfield k : Lorg/bukkit/util/Vector;
    //   400: aload_1
    //   401: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   404: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   407: invokevirtual equals : (Ljava/lang/Object;)Z
    //   410: ifeq -> 430
    //   413: goto -> 420
    //   416: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   419: athrow
    //   420: aload_0
    //   421: aconst_null
    //   422: putfield k : Lorg/bukkit/util/Vector;
    //   425: return
    //   426: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   429: athrow
    //   430: iconst_0
    //   431: istore #25
    //   433: aload_2
    //   434: aload_3
    //   435: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   438: dstore #26
    //   440: aload_0
    //   441: getfield x : Z
    //   444: ifne -> 637
    //   447: dload #26
    //   449: ldc2_w 0.4
    //   452: dcmpl
    //   453: ifle -> 637
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   462: athrow
    //   463: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   466: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   469: iload #17
    //   471: iload #18
    //   473: iload #19
    //   475: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   478: aload #23
    //   480: lload #10
    //   482: invokeinterface b : (Lorg/bukkit/entity/LivingEntity;J)F
    //   487: f2d
    //   488: ldc2_w 0.14
    //   491: dcmpg
    //   492: ifge -> 637
    //   495: goto -> 502
    //   498: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   501: athrow
    //   502: aload #23
    //   504: invokeinterface isSneaking : ()Z
    //   509: ifeq -> 637
    //   512: goto -> 519
    //   515: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   518: athrow
    //   519: aload_3
    //   520: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   523: aload_2
    //   524: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   527: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   530: invokevirtual normalize : ()Lorg/bukkit/util/Vector;
    //   533: ldc2_w 0.05
    //   536: invokevirtual multiply : (D)Lorg/bukkit/util/Vector;
    //   539: astore #28
    //   541: new org/bukkit/Location
    //   544: dup
    //   545: aload_2
    //   546: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   549: aload_2
    //   550: invokevirtual getX : ()D
    //   553: aload_2
    //   554: invokevirtual getY : ()D
    //   557: aload_2
    //   558: invokevirtual getZ : ()D
    //   561: invokespecial <init> : (Lorg/bukkit/World;DDD)V
    //   564: aload #28
    //   566: invokevirtual add : (Lorg/bukkit/util/Vector;)Lorg/bukkit/Location;
    //   569: astore #29
    //   571: new org/bukkit/event/player/PlayerMoveEvent
    //   574: dup
    //   575: aload #23
    //   577: aload_2
    //   578: aload #29
    //   580: invokespecial <init> : (Lorg/bukkit/entity/Player;Lorg/bukkit/Location;Lorg/bukkit/Location;)V
    //   583: astore #30
    //   585: aload_0
    //   586: iconst_1
    //   587: putfield x : Z
    //   590: aload_0
    //   591: aload #30
    //   593: aload_1
    //   594: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   597: aload #29
    //   599: invokevirtual b : (Lorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/Location;Lorg/bukkit/Location;)V
    //   602: aload_0
    //   603: iconst_0
    //   604: putfield x : Z
    //   607: aload #30
    //   609: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   612: aload #29
    //   614: invokevirtual equals : (Ljava/lang/Object;)Z
    //   617: ifne -> 637
    //   620: aload_1
    //   621: aload_2
    //   622: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   625: aload_0
    //   626: invokestatic currentTimeMillis : ()J
    //   629: putfield b : J
    //   632: return
    //   633: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   636: athrow
    //   637: aload_3
    //   638: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   641: aload_2
    //   642: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   645: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   648: astore #28
    //   650: lload #12
    //   652: aload #23
    //   654: aload_2
    //   655: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   658: aload_3
    //   659: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   662: aload #24
    //   664: aload_0
    //   665: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   668: invokestatic b : (JLorg/bukkit/entity/Player;Lorg/bukkit/util/Vector;Lorg/bukkit/util/Vector;Lorg/bukkit/World;Lme/rerere/matrix/internal/yl;)Lme/rerere/matrix/internal/la;
    //   671: astore #29
    //   673: aload #29
    //   675: invokevirtual b : ()Ljava/util/Optional;
    //   678: astore #30
    //   680: aload #29
    //   682: invokevirtual b : ()Z
    //   685: ifeq -> 706
    //   688: aload_0
    //   689: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   692: invokevirtual b : ()Lme/rerere/matrix/internal/vk;
    //   695: iconst_1
    //   696: putfield z : Z
    //   699: goto -> 706
    //   702: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   705: athrow
    //   706: aload #30
    //   708: invokevirtual isPresent : ()Z
    //   711: ifeq -> 1128
    //   714: aload_0
    //   715: aload #23
    //   717: aload_3
    //   718: invokespecial b : (Lorg/bukkit/entity/Player;Lorg/bukkit/Location;)Z
    //   721: ifne -> 1128
    //   724: goto -> 731
    //   727: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   730: athrow
    //   731: aload_0
    //   732: sipush #32150
    //   735: ldc2_w 8579086922286747367
    //   738: lload #4
    //   740: lxor
    //   741: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   746: new java/lang/StringBuilder
    //   749: dup
    //   750: invokespecial <init> : ()V
    //   753: sipush #17614
    //   756: ldc2_w 9000947264172423100
    //   759: lload #4
    //   761: lxor
    //   762: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   767: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   770: aload #30
    //   772: invokevirtual get : ()Ljava/lang/Object;
    //   775: checkcast org/bukkit/block/Block
    //   778: invokeinterface getType : ()Lorg/bukkit/Material;
    //   783: invokevirtual name : ()Ljava/lang/String;
    //   786: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   789: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   792: sipush #16047
    //   795: ldc2_w 7774168472992452056
    //   798: lload #4
    //   800: lxor
    //   801: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   806: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   809: aload #28
    //   811: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   814: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   817: sipush #16775
    //   820: ldc2_w 3085261361809257201
    //   823: lload #4
    //   825: lxor
    //   826: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   831: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   834: aload_3
    //   835: iload #14
    //   837: i2c
    //   838: lload #15
    //   840: invokestatic b : (Lorg/bukkit/Location;CJ)Ljava/lang/String;
    //   843: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   846: sipush #7004
    //   849: ldc2_w 5588168243554134060
    //   852: lload #4
    //   854: lxor
    //   855: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   860: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   863: dload #26
    //   865: invokestatic b : (D)D
    //   868: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   871: sipush #14801
    //   874: ldc2_w 7232905287141526185
    //   877: lload #4
    //   879: lxor
    //   880: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   885: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   888: aload_0
    //   889: getfield x : Z
    //   892: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   895: ldc_w ')'
    //   898: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   901: invokevirtual toString : ()Ljava/lang/String;
    //   904: dload #26
    //   906: ldc2_w 0.3
    //   909: dcmpl
    //   910: ifle -> 928
    //   913: goto -> 920
    //   916: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   919: athrow
    //   920: iconst_4
    //   921: goto -> 929
    //   924: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   927: athrow
    //   928: iconst_2
    //   929: istore #20
    //   931: astore #21
    //   933: astore #22
    //   935: lload #6
    //   937: aload #22
    //   939: aload #21
    //   941: iload #20
    //   943: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   946: aload #28
    //   948: invokevirtual getY : ()D
    //   951: ldc2_w 0.4
    //   954: dcmpl
    //   955: ifge -> 1047
    //   958: aload #28
    //   960: invokevirtual getY : ()D
    //   963: ldc2_w -0.08
    //   966: dcmpg
    //   967: iflt -> 1047
    //   970: goto -> 977
    //   973: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   976: athrow
    //   977: dload #26
    //   979: ldc2_w 0.4
    //   982: dcmpl
    //   983: ifgt -> 1047
    //   986: goto -> 993
    //   989: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   992: athrow
    //   993: aload #23
    //   995: invokeinterface getFallDistance : ()F
    //   1000: ldc_w 4.0
    //   1003: fcmpl
    //   1004: ifgt -> 1047
    //   1007: goto -> 1014
    //   1010: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1013: athrow
    //   1014: aload_0
    //   1015: getfield x : Z
    //   1018: ifne -> 1047
    //   1021: goto -> 1028
    //   1024: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1027: athrow
    //   1028: aload_0
    //   1029: lload #8
    //   1031: invokevirtual j : (J)I
    //   1034: getstatic me/rerere/matrix/internal/vn.r : I
    //   1037: if_icmple -> 1065
    //   1040: goto -> 1047
    //   1043: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1046: athrow
    //   1047: aload_0
    //   1048: aload_1
    //   1049: aload #23
    //   1051: aload_0
    //   1052: getfield z : Lorg/bukkit/Location;
    //   1055: invokespecial b : (Lorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/entity/Player;Lorg/bukkit/Location;)V
    //   1058: goto -> 1065
    //   1061: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1064: athrow
    //   1065: aload_0
    //   1066: getfield x : Z
    //   1069: ifeq -> 1100
    //   1072: aload_2
    //   1073: invokestatic t : (Lorg/bukkit/Location;)Z
    //   1076: ifeq -> 1100
    //   1079: goto -> 1086
    //   1082: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1085: athrow
    //   1086: aload_0
    //   1087: invokestatic currentTimeMillis : ()J
    //   1090: putfield b : J
    //   1093: goto -> 1100
    //   1096: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1099: athrow
    //   1100: aload_0
    //   1101: lload #8
    //   1103: invokevirtual j : (J)I
    //   1106: bipush #10
    //   1108: if_icmple -> 1125
    //   1111: aload_0
    //   1112: invokestatic currentTimeMillis : ()J
    //   1115: putfield b : J
    //   1118: goto -> 1125
    //   1121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1124: athrow
    //   1125: iconst_1
    //   1126: istore #25
    //   1128: iload #25
    //   1130: ifne -> 1148
    //   1133: aload_0
    //   1134: aload_3
    //   1135: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1138: putfield z : Lorg/bukkit/Location;
    //   1141: goto -> 1148
    //   1144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1147: athrow
    //   1148: return
    // Exception table:
    //   from	to	target	type
    //   110	121	121	java/lang/RuntimeException
    //   125	143	146	java/lang/RuntimeException
    //   133	151	151	java/lang/RuntimeException
    //   155	173	176	java/lang/RuntimeException
    //   163	190	193	java/lang/RuntimeException
    //   180	198	198	java/lang/RuntimeException
    //   202	223	226	java/lang/RuntimeException
    //   210	243	246	java/lang/RuntimeException
    //   230	251	251	java/lang/RuntimeException
    //   255	269	269	java/lang/RuntimeException
    //   273	289	289	java/lang/RuntimeException
    //   293	301	301	java/lang/RuntimeException
    //   305	335	338	java/lang/RuntimeException
    //   320	343	343	java/lang/RuntimeException
    //   347	360	360	java/lang/RuntimeException
    //   364	385	385	java/lang/RuntimeException
    //   389	413	416	java/lang/RuntimeException
    //   396	426	426	java/lang/RuntimeException
    //   440	456	459	java/lang/RuntimeException
    //   447	495	498	java/lang/RuntimeException
    //   463	512	515	java/lang/RuntimeException
    //   585	633	633	java/lang/RuntimeException
    //   680	699	702	java/lang/RuntimeException
    //   706	724	727	java/lang/RuntimeException
    //   714	913	916	java/lang/RuntimeException
    //   731	924	924	java/lang/RuntimeException
    //   935	970	973	java/lang/RuntimeException
    //   958	986	989	java/lang/RuntimeException
    //   977	1007	1010	java/lang/RuntimeException
    //   993	1021	1024	java/lang/RuntimeException
    //   1014	1040	1043	java/lang/RuntimeException
    //   1028	1058	1061	java/lang/RuntimeException
    //   1065	1079	1082	java/lang/RuntimeException
    //   1072	1093	1096	java/lang/RuntimeException
    //   1100	1118	1121	java/lang/RuntimeException
    //   1128	1141	1144	java/lang/RuntimeException
  }
  
  public void b(char paramChar, int paramInt, @NotNull PlayerInteractEvent paramPlayerInteractEvent, short paramShort) {
    try {
      if (!v)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramPlayerInteractEvent.getClickedBlock() != null)
        try {
          if (paramPlayerInteractEvent.getAction() == Action.RIGHT_CLICK_BLOCK)
            try {
              if (paramPlayerInteractEvent.getItem() != null)
                try {
                  if (paramPlayerInteractEvent.getItem().getType() == Material.ENDER_PEARL)
                    paramPlayerInteractEvent.setCancelled(true); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public vn(yl paramyl) {
    super(paramyl);
    b(yk.c);
    this.i = System.currentTimeMillis();
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    try {
      if (paramPlayerTeleportEvent.getTo() == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.k = paramPlayerTeleportEvent.getTo().toVector();
      if (jb.p(paramPlayerTeleportEvent.getFrom(), paramPlayerTeleportEvent.getTo()) > 20.0D)
        this.i = System.currentTimeMillis(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x33256A173407L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "&áW\022V\007±±gzÇjMD\004\0071J\t> s²`¾eÌEÀoÀ0´-ª¾Uh\fÙ7Ec\031F0*5Û\001*È\016ÇÃ@Q±Â«$\tv?\037U»æ_beLÔn'[$)a¹î\016tÌÐÓ\02578\034ñäþ¾l8½¯\001½Ãß\002\b³\\q[­íþL\026Î]çY½½O82Ì4\n¤Û2Y\006à4ZÛÀNCY­:3 @Ñlø±bÞôfã\000ÓóRs©\027¡àÈ\035Å\"ûr\016ð ðâ÷ÏôD|4\034%XÑ8ìg4æ1}\f!<ñ\nï\020¬Ú\027¡zÎ¶\034\030¬\005¹\025\f").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x28EF;
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
        throw new RuntimeException("me/rerere/matrix/internal/vn", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/vn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
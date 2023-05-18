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
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;

public class km extends zk {
  private int f;
  
  private static List l;
  
  private int r;
  
  private static boolean x;
  
  private int z = 0;
  
  private double k;
  
  private long v;
  
  private static int b;
  
  private static int i;
  
  private static final long a = o3.a(-1907448488890609215L, 6284642029307388123L, MethodHandles.lookup().lookupClass()).a(44954397118942L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/km.a : J
    //   3: ldc2_w 18956575558040
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #13791
    //   15: ldc2_w 3079536983344763530
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/km.x : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #21498
    //   41: ldc2_w 404810380476527783
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   51: iconst_4
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/km.b : I
    //   60: aload_0
    //   61: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   64: sipush #24423
    //   67: ldc2_w 6996049622872537132
    //   70: lload_1
    //   71: lxor
    //   72: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   77: bipush #10
    //   79: invokeinterface getInt : (Ljava/lang/String;I)I
    //   84: putstatic me/rerere/matrix/internal/km.i : I
    //   87: aload_0
    //   88: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   91: sipush #21808
    //   94: ldc2_w 390275950761292408
    //   97: lload_1
    //   98: lxor
    //   99: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   104: invokeinterface getStringList : (Ljava/lang/String;)Ljava/util/List;
    //   109: putstatic me/rerere/matrix/internal/km.l : Ljava/util/List;
    //   112: getstatic me/rerere/matrix/internal/km.l : Ljava/util/List;
    //   115: ifnonnull -> 135
    //   118: new java/util/ArrayList
    //   121: dup
    //   122: invokespecial <init> : ()V
    //   125: putstatic me/rerere/matrix/internal/km.l : Ljava/util/List;
    //   128: goto -> 135
    //   131: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   134: athrow
    //   135: return
    // Exception table:
    //   from	to	target	type
    //   8	128	131	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/km.a : J
    //   3: ldc2_w 115145897405894
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 92193906180532
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 52505769969781
    //   22: lxor
    //   23: lstore #8
    //   25: dup2
    //   26: ldc2_w 68606977929682
    //   29: lxor
    //   30: lstore #10
    //   32: dup2
    //   33: ldc2_w 31452344419112
    //   36: lxor
    //   37: lstore #12
    //   39: dup2
    //   40: ldc2_w 117257801136377
    //   43: lxor
    //   44: lstore #14
    //   46: dup2
    //   47: ldc2_w 126296389291961
    //   50: lxor
    //   51: lstore #16
    //   53: dup2
    //   54: ldc2_w 137896427525439
    //   57: lxor
    //   58: lstore #18
    //   60: pop2
    //   61: aload_1
    //   62: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   65: astore #20
    //   67: getstatic me/rerere/matrix/internal/km.x : Z
    //   70: ifeq -> 2519
    //   73: aload #20
    //   75: invokeinterface isInsideVehicle : ()Z
    //   80: ifeq -> 2519
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   89: athrow
    //   90: aload #20
    //   92: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   97: ifnull -> 2519
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   106: athrow
    //   107: aload #20
    //   109: invokestatic t : (Lorg/bukkit/entity/Player;)Z
    //   112: ifne -> 136
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   121: athrow
    //   122: aload_2
    //   123: invokestatic h : (Lorg/bukkit/Location;)Z
    //   126: ifeq -> 149
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   135: athrow
    //   136: aload_0
    //   137: bipush #100
    //   139: putfield z : I
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: aload_0
    //   150: getfield z : I
    //   153: ifle -> 171
    //   156: aload_0
    //   157: dup
    //   158: getfield z : I
    //   161: iconst_1
    //   162: isub
    //   163: putfield z : I
    //   166: return
    //   167: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   170: athrow
    //   171: aload #20
    //   173: invokeinterface getVehicle : ()Lorg/bukkit/entity/Entity;
    //   178: astore #21
    //   180: aload_2
    //   181: invokestatic i : (Lorg/bukkit/Location;)Z
    //   184: ifne -> 227
    //   187: aload #20
    //   189: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   192: ifne -> 227
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload #21
    //   204: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   209: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   212: invokeinterface isLiquid : ()Z
    //   217: ifeq -> 241
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   226: athrow
    //   227: aload_0
    //   228: invokestatic currentTimeMillis : ()J
    //   231: putfield v : J
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: aload_3
    //   242: invokevirtual getY : ()D
    //   245: aload_2
    //   246: invokevirtual getY : ()D
    //   249: dsub
    //   250: dstore #22
    //   252: iconst_0
    //   253: istore #24
    //   255: aload #21
    //   257: invokeinterface isOnGround : ()Z
    //   262: ifne -> 365
    //   265: aload_2
    //   266: invokestatic f : (Lorg/bukkit/Location;)Z
    //   269: ifeq -> 365
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: aload #20
    //   281: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   284: ifne -> 365
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   293: athrow
    //   294: aload_2
    //   295: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   298: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   301: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   306: invokeinterface getType : ()Lorg/bukkit/Material;
    //   311: invokestatic r : (Lorg/bukkit/Material;)Z
    //   314: ifeq -> 365
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   323: athrow
    //   324: aload_0
    //   325: dup
    //   326: getfield f : I
    //   329: iconst_1
    //   330: iadd
    //   331: putfield f : I
    //   334: dload #22
    //   336: dconst_0
    //   337: dcmpg
    //   338: ifge -> 365
    //   341: goto -> 348
    //   344: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   347: athrow
    //   348: aload_0
    //   349: dup
    //   350: getfield r : I
    //   353: iconst_1
    //   354: iadd
    //   355: putfield r : I
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   364: athrow
    //   365: aload #21
    //   367: invokeinterface isOnGround : ()Z
    //   372: ifne -> 391
    //   375: aload_3
    //   376: lload #12
    //   378: invokestatic p : (Lorg/bukkit/Location;J)Z
    //   381: ifeq -> 408
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   390: athrow
    //   391: aload_0
    //   392: iconst_0
    //   393: putfield f : I
    //   396: aload_0
    //   397: iconst_0
    //   398: putfield r : I
    //   401: goto -> 408
    //   404: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   407: athrow
    //   408: dload #22
    //   410: dconst_0
    //   411: dcmpl
    //   412: ifne -> 492
    //   415: aload #21
    //   417: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   422: invokevirtual getY : ()D
    //   425: dconst_1
    //   426: drem
    //   427: dconst_0
    //   428: dcmpl
    //   429: ifne -> 492
    //   432: goto -> 439
    //   435: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   438: athrow
    //   439: aload #21
    //   441: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   446: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   449: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   452: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   457: invokeinterface getType : ()Lorg/bukkit/Material;
    //   462: invokevirtual isSolid : ()Z
    //   465: ifeq -> 492
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   474: athrow
    //   475: aload_0
    //   476: iconst_0
    //   477: putfield f : I
    //   480: aload_0
    //   481: iconst_0
    //   482: putfield r : I
    //   485: goto -> 492
    //   488: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   491: athrow
    //   492: dload #22
    //   494: dconst_0
    //   495: dcmpl
    //   496: iflt -> 511
    //   499: aload_0
    //   500: iconst_0
    //   501: putfield r : I
    //   504: goto -> 511
    //   507: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   510: athrow
    //   511: aload #21
    //   513: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   518: invokestatic b : (Lorg/bukkit/entity/EntityType;)Z
    //   521: ifeq -> 1184
    //   524: aload_2
    //   525: lload #18
    //   527: invokestatic n : (Lorg/bukkit/Location;J)Z
    //   530: ifne -> 1184
    //   533: goto -> 540
    //   536: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   539: athrow
    //   540: aload_0
    //   541: getfield f : I
    //   544: iconst_2
    //   545: if_icmple -> 690
    //   548: goto -> 555
    //   551: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   554: athrow
    //   555: dload #22
    //   557: dconst_0
    //   558: dcmpl
    //   559: iflt -> 690
    //   562: goto -> 569
    //   565: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   568: athrow
    //   569: aload_0
    //   570: lload #8
    //   572: sipush #6495
    //   575: ldc2_w 8344727067794791002
    //   578: lload #4
    //   580: lxor
    //   581: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   586: new java/lang/StringBuilder
    //   589: dup
    //   590: invokespecial <init> : ()V
    //   593: sipush #27507
    //   596: ldc2_w 7739653788931270781
    //   599: lload #4
    //   601: lxor
    //   602: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   607: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   610: dload #22
    //   612: invokestatic b : (D)D
    //   615: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   618: sipush #5538
    //   621: ldc2_w 782212368570504883
    //   624: lload #4
    //   626: lxor
    //   627: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: aload #21
    //   637: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   642: invokevirtual name : ()Ljava/lang/String;
    //   645: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   648: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   651: sipush #11129
    //   654: ldc2_w 7609688140230092909
    //   657: lload #4
    //   659: lxor
    //   660: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   665: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   668: aload_0
    //   669: getfield f : I
    //   672: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   675: ldc ')'
    //   677: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   680: invokevirtual toString : ()Ljava/lang/String;
    //   683: iconst_2
    //   684: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   687: iconst_1
    //   688: istore #24
    //   690: dload #22
    //   692: dconst_0
    //   693: dcmpg
    //   694: ifge -> 1184
    //   697: aload_0
    //   698: getfield r : I
    //   701: iconst_1
    //   702: if_icmple -> 995
    //   705: goto -> 712
    //   708: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   711: athrow
    //   712: aload_0
    //   713: getfield k : D
    //   716: ldc2_w 0.0399
    //   719: dsub
    //   720: dstore #25
    //   722: dload #25
    //   724: dconst_0
    //   725: dcmpg
    //   726: ifge -> 995
    //   729: dload #22
    //   731: invokestatic abs : (D)D
    //   734: dload #25
    //   736: invokestatic abs : (D)D
    //   739: ldc2_w 0.95
    //   742: dmul
    //   743: dcmpg
    //   744: ifge -> 995
    //   747: goto -> 754
    //   750: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   753: athrow
    //   754: aload_3
    //   755: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   758: invokeinterface getType : ()Lorg/bukkit/Material;
    //   763: invokestatic r : (Lorg/bukkit/Material;)Z
    //   766: ifeq -> 995
    //   769: goto -> 776
    //   772: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   775: athrow
    //   776: aload_3
    //   777: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   780: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   783: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   788: invokeinterface getType : ()Lorg/bukkit/Material;
    //   793: invokestatic r : (Lorg/bukkit/Material;)Z
    //   796: ifeq -> 995
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   805: athrow
    //   806: aload_2
    //   807: invokestatic o : (Lorg/bukkit/Location;)Z
    //   810: ifne -> 995
    //   813: goto -> 820
    //   816: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   819: athrow
    //   820: aload_2
    //   821: invokestatic j : ()Lorg/bukkit/Material;
    //   824: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   827: ifne -> 995
    //   830: goto -> 837
    //   833: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   836: athrow
    //   837: aload_0
    //   838: lload #8
    //   840: sipush #30404
    //   843: ldc2_w 7138898904961398213
    //   846: lload #4
    //   848: lxor
    //   849: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   854: new java/lang/StringBuilder
    //   857: dup
    //   858: invokespecial <init> : ()V
    //   861: sipush #11638
    //   864: ldc2_w 4517046772734357089
    //   867: lload #4
    //   869: lxor
    //   870: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   875: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   878: dload #22
    //   880: invokestatic b : (D)D
    //   883: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   886: sipush #17359
    //   889: ldc2_w 3272841792103874770
    //   892: lload #4
    //   894: lxor
    //   895: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   900: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   903: dload #25
    //   905: invokestatic b : (D)D
    //   908: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   911: bipush #88
    //   913: ldc2_w 5200530396469379921
    //   916: lload #4
    //   918: lxor
    //   919: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   924: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   927: aload #21
    //   929: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   934: invokevirtual name : ()Ljava/lang/String;
    //   937: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   940: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   943: sipush #31192
    //   946: ldc2_w 4041484317510056663
    //   949: lload #4
    //   951: lxor
    //   952: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   957: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   960: aload_0
    //   961: getfield f : I
    //   964: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   967: ldc_w ','
    //   970: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   973: aload_0
    //   974: getfield r : I
    //   977: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   980: ldc ')'
    //   982: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   985: invokevirtual toString : ()Ljava/lang/String;
    //   988: iconst_2
    //   989: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   992: iconst_1
    //   993: istore #24
    //   995: aload_2
    //   996: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   999: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   1002: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1007: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1012: invokestatic r : (Lorg/bukkit/Material;)Z
    //   1015: ifeq -> 1184
    //   1018: invokestatic currentTimeMillis : ()J
    //   1021: aload_0
    //   1022: getfield v : J
    //   1025: lsub
    //   1026: ldc2_w 2000
    //   1029: lcmp
    //   1030: ifle -> 1184
    //   1033: goto -> 1040
    //   1036: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1039: athrow
    //   1040: lload #6
    //   1042: aload #20
    //   1044: invokestatic b : (JLorg/bukkit/entity/LivingEntity;)Lme/rerere/matrix/internal/sa;
    //   1047: ldc2_w 0.5
    //   1050: dconst_1
    //   1051: ldc2_w 0.5
    //   1054: invokevirtual p : (DDD)Lme/rerere/matrix/internal/sa;
    //   1057: astore #25
    //   1059: aload #25
    //   1061: aload_2
    //   1062: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   1065: lload #16
    //   1067: invokevirtual b : (Lorg/bukkit/World;J)Z
    //   1070: ifne -> 1184
    //   1073: aload_2
    //   1074: aload_3
    //   1075: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1078: dstore #26
    //   1080: dload #26
    //   1082: ldc2_w 0.42
    //   1085: dcmpl
    //   1086: ifle -> 1184
    //   1089: aload_0
    //   1090: lload #8
    //   1092: sipush #5665
    //   1095: ldc2_w 1972153837522244901
    //   1098: lload #4
    //   1100: lxor
    //   1101: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1106: new java/lang/StringBuilder
    //   1109: dup
    //   1110: invokespecial <init> : ()V
    //   1113: sipush #3164
    //   1116: ldc2_w 1823905399458942800
    //   1119: lload #4
    //   1121: lxor
    //   1122: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1130: dload #26
    //   1132: invokestatic b : (D)D
    //   1135: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1138: sipush #22753
    //   1141: ldc2_w 8455933704992103393
    //   1144: lload #4
    //   1146: lxor
    //   1147: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1155: invokevirtual toString : ()Ljava/lang/String;
    //   1158: iconst_2
    //   1159: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1162: iconst_1
    //   1163: istore #24
    //   1165: dload #26
    //   1167: dconst_1
    //   1168: dcmpl
    //   1169: ifle -> 1184
    //   1172: aload_1
    //   1173: aload_2
    //   1174: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1177: goto -> 1184
    //   1180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1183: athrow
    //   1184: aload #21
    //   1186: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   1191: getstatic org/bukkit/entity/EntityType.HORSE : Lorg/bukkit/entity/EntityType;
    //   1194: if_acmpeq -> 1257
    //   1197: aload #21
    //   1199: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   1204: getstatic org/bukkit/entity/EntityType.SKELETON_HORSE : Lorg/bukkit/entity/EntityType;
    //   1207: if_acmpeq -> 1257
    //   1210: goto -> 1217
    //   1213: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1216: athrow
    //   1217: aload #21
    //   1219: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   1224: getstatic org/bukkit/entity/EntityType.ZOMBIE_HORSE : Lorg/bukkit/entity/EntityType;
    //   1227: if_acmpeq -> 1257
    //   1230: goto -> 1237
    //   1233: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1236: athrow
    //   1237: aload #21
    //   1239: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   1244: getstatic org/bukkit/entity/EntityType.DONKEY : Lorg/bukkit/entity/EntityType;
    //   1247: if_acmpne -> 1918
    //   1250: goto -> 1257
    //   1253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1256: athrow
    //   1257: aload #21
    //   1259: checkcast org/bukkit/entity/LivingEntity
    //   1262: invokeinterface isLeashed : ()Z
    //   1267: ifeq -> 1350
    //   1270: goto -> 1277
    //   1273: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1276: athrow
    //   1277: aload #21
    //   1279: checkcast org/bukkit/entity/LivingEntity
    //   1282: invokeinterface getLeashHolder : ()Lorg/bukkit/entity/Entity;
    //   1287: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   1292: aload #20
    //   1294: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   1299: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1302: ifeq -> 1350
    //   1305: goto -> 1312
    //   1308: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1311: athrow
    //   1312: aload_0
    //   1313: lload #8
    //   1315: sipush #32232
    //   1318: ldc2_w 275590314001776376
    //   1321: lload #4
    //   1323: lxor
    //   1324: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1329: sipush #24899
    //   1332: ldc2_w 6142631894576308814
    //   1335: lload #4
    //   1337: lxor
    //   1338: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1343: iconst_5
    //   1344: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1347: iconst_1
    //   1348: istore #24
    //   1350: aload #21
    //   1352: checkcast org/bukkit/entity/LivingEntity
    //   1355: invokeinterface isLeashed : ()Z
    //   1360: ifne -> 1918
    //   1363: aload #21
    //   1365: checkcast org/bukkit/entity/AbstractHorse
    //   1368: getstatic org/bukkit/attribute/Attribute.HORSE_JUMP_STRENGTH : Lorg/bukkit/attribute/Attribute;
    //   1371: invokeinterface getAttribute : (Lorg/bukkit/attribute/Attribute;)Lorg/bukkit/attribute/AttributeInstance;
    //   1376: invokeinterface getValue : ()D
    //   1381: dstore #25
    //   1383: aload_0
    //   1384: getfield f : I
    //   1387: bipush #15
    //   1389: if_icmple -> 1659
    //   1392: dload #22
    //   1394: dconst_0
    //   1395: dcmpl
    //   1396: iflt -> 1659
    //   1399: goto -> 1406
    //   1402: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1405: athrow
    //   1406: aload #20
    //   1408: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   1411: ifne -> 1659
    //   1414: goto -> 1421
    //   1417: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1420: athrow
    //   1421: iconst_0
    //   1422: istore #27
    //   1424: invokestatic b : ()I
    //   1427: bipush #14
    //   1429: if_icmplt -> 1452
    //   1432: aload_2
    //   1433: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
    //   1436: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   1439: ifeq -> 1452
    //   1442: goto -> 1449
    //   1445: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1448: athrow
    //   1449: iconst_1
    //   1450: istore #27
    //   1452: iload #27
    //   1454: ifne -> 1659
    //   1457: aload #21
    //   1459: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1464: iconst_0
    //   1465: lload #14
    //   1467: invokestatic j : (Lorg/bukkit/Location;ZJ)Z
    //   1470: ifne -> 1659
    //   1473: goto -> 1480
    //   1476: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1479: athrow
    //   1480: aload #21
    //   1482: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   1487: invokestatic x : (Lorg/bukkit/Location;)Z
    //   1490: ifne -> 1659
    //   1493: goto -> 1500
    //   1496: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1499: athrow
    //   1500: aload_2
    //   1501: invokestatic o : (Lorg/bukkit/Location;)Z
    //   1504: ifne -> 1659
    //   1507: goto -> 1514
    //   1510: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1513: athrow
    //   1514: aload_0
    //   1515: lload #8
    //   1517: bipush #48
    //   1519: ldc2_w 4907007308282151738
    //   1522: lload #4
    //   1524: lxor
    //   1525: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1530: new java/lang/StringBuilder
    //   1533: dup
    //   1534: invokespecial <init> : ()V
    //   1537: sipush #20148
    //   1540: ldc2_w 5795236210706386343
    //   1543: lload #4
    //   1545: lxor
    //   1546: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1551: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1554: dload #22
    //   1556: invokestatic b : (D)D
    //   1559: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1562: sipush #7014
    //   1565: ldc2_w 7970079446147422318
    //   1568: lload #4
    //   1570: lxor
    //   1571: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1576: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1579: aload #21
    //   1581: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   1586: invokevirtual name : ()Ljava/lang/String;
    //   1589: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1595: sipush #31192
    //   1598: ldc2_w 4041484317510056663
    //   1601: lload #4
    //   1603: lxor
    //   1604: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1609: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1612: aload_0
    //   1613: getfield f : I
    //   1616: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1619: sipush #6778
    //   1622: ldc2_w 424422995475356029
    //   1625: lload #4
    //   1627: lxor
    //   1628: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1633: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1636: dload #25
    //   1638: invokestatic b : (D)D
    //   1641: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1644: ldc ')'
    //   1646: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1649: invokevirtual toString : ()Ljava/lang/String;
    //   1652: iconst_2
    //   1653: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1656: iconst_1
    //   1657: istore #24
    //   1659: dload #22
    //   1661: dconst_0
    //   1662: dcmpg
    //   1663: ifge -> 1918
    //   1666: aload_0
    //   1667: getfield k : D
    //   1670: dconst_0
    //   1671: dcmpg
    //   1672: ifge -> 1918
    //   1675: goto -> 1682
    //   1678: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1681: athrow
    //   1682: aload_0
    //   1683: getfield f : I
    //   1686: iconst_5
    //   1687: if_icmple -> 1918
    //   1690: goto -> 1697
    //   1693: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1696: athrow
    //   1697: aload #21
    //   1699: invokeinterface isOnGround : ()Z
    //   1704: ifne -> 1918
    //   1707: goto -> 1714
    //   1710: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1713: athrow
    //   1714: aload_2
    //   1715: lload #18
    //   1717: invokestatic n : (Lorg/bukkit/Location;J)Z
    //   1720: ifne -> 1918
    //   1723: goto -> 1730
    //   1726: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1729: athrow
    //   1730: dload #22
    //   1732: invokestatic abs : (D)D
    //   1735: ldc2_w 0.075
    //   1738: dcmpg
    //   1739: ifge -> 1918
    //   1742: goto -> 1749
    //   1745: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1748: athrow
    //   1749: aload_0
    //   1750: getfield k : D
    //   1753: invokestatic abs : (D)D
    //   1756: ldc2_w 0.075
    //   1759: dcmpg
    //   1760: ifge -> 1918
    //   1763: goto -> 1770
    //   1766: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1769: athrow
    //   1770: aload_3
    //   1771: lload #12
    //   1773: invokestatic p : (Lorg/bukkit/Location;J)Z
    //   1776: ifne -> 1918
    //   1779: goto -> 1786
    //   1782: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1785: athrow
    //   1786: aload_3
    //   1787: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1790: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   1793: ifeq -> 1918
    //   1796: goto -> 1803
    //   1799: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1802: athrow
    //   1803: aload_3
    //   1804: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1807: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   1810: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1815: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1820: invokestatic r : (Lorg/bukkit/Material;)Z
    //   1823: ifeq -> 1918
    //   1826: goto -> 1833
    //   1829: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1832: athrow
    //   1833: aload_2
    //   1834: invokestatic j : ()Lorg/bukkit/Material;
    //   1837: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   1840: ifne -> 1918
    //   1843: goto -> 1850
    //   1846: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1849: athrow
    //   1850: aload_0
    //   1851: lload #8
    //   1853: sipush #12334
    //   1856: ldc2_w 5639752961301934908
    //   1859: lload #4
    //   1861: lxor
    //   1862: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1867: new java/lang/StringBuilder
    //   1870: dup
    //   1871: invokespecial <init> : ()V
    //   1874: sipush #1789
    //   1877: ldc2_w 254312067371320831
    //   1880: lload #4
    //   1882: lxor
    //   1883: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1888: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1891: dload #22
    //   1893: invokestatic b : (D)D
    //   1896: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1899: ldc ')'
    //   1901: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1904: invokevirtual toString : ()Ljava/lang/String;
    //   1907: iconst_1
    //   1908: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1911: goto -> 1918
    //   1914: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1917: athrow
    //   1918: invokestatic b : ()I
    //   1921: bipush #12
    //   1923: if_icmplt -> 2199
    //   1926: aload #21
    //   1928: instanceof org/bukkit/entity/Llama
    //   1931: ifeq -> 2199
    //   1934: goto -> 1941
    //   1937: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1940: athrow
    //   1941: aload_0
    //   1942: getfield f : I
    //   1945: bipush #20
    //   1947: if_icmple -> 2199
    //   1950: goto -> 1957
    //   1953: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1956: athrow
    //   1957: dload #22
    //   1959: dconst_0
    //   1960: dcmpl
    //   1961: iflt -> 2199
    //   1964: goto -> 1971
    //   1967: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1970: athrow
    //   1971: aload #20
    //   1973: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   1976: ifne -> 2199
    //   1979: goto -> 1986
    //   1982: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1985: athrow
    //   1986: iconst_0
    //   1987: istore #25
    //   1989: invokestatic b : ()I
    //   1992: bipush #14
    //   1994: if_icmplt -> 2017
    //   1997: aload_2
    //   1998: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
    //   2001: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   2004: ifeq -> 2017
    //   2007: goto -> 2014
    //   2010: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2013: athrow
    //   2014: iconst_1
    //   2015: istore #25
    //   2017: iload #25
    //   2019: ifne -> 2199
    //   2022: aload #21
    //   2024: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   2029: iconst_0
    //   2030: lload #14
    //   2032: invokestatic j : (Lorg/bukkit/Location;ZJ)Z
    //   2035: ifne -> 2199
    //   2038: goto -> 2045
    //   2041: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2044: athrow
    //   2045: aload #21
    //   2047: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   2052: invokestatic x : (Lorg/bukkit/Location;)Z
    //   2055: ifne -> 2199
    //   2058: goto -> 2065
    //   2061: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2064: athrow
    //   2065: aload_2
    //   2066: invokestatic o : (Lorg/bukkit/Location;)Z
    //   2069: ifne -> 2199
    //   2072: goto -> 2079
    //   2075: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2078: athrow
    //   2079: aload_0
    //   2080: lload #8
    //   2082: bipush #48
    //   2084: ldc2_w 4907007308282151738
    //   2087: lload #4
    //   2089: lxor
    //   2090: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2095: new java/lang/StringBuilder
    //   2098: dup
    //   2099: invokespecial <init> : ()V
    //   2102: sipush #20148
    //   2105: ldc2_w 5795236210706386343
    //   2108: lload #4
    //   2110: lxor
    //   2111: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2119: dload #22
    //   2121: invokestatic b : (D)D
    //   2124: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2127: sipush #7014
    //   2130: ldc2_w 7970079446147422318
    //   2133: lload #4
    //   2135: lxor
    //   2136: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2144: aload #21
    //   2146: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   2151: invokevirtual name : ()Ljava/lang/String;
    //   2154: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   2157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2160: sipush #31192
    //   2163: ldc2_w 4041484317510056663
    //   2166: lload #4
    //   2168: lxor
    //   2169: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2177: aload_0
    //   2178: getfield f : I
    //   2181: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2184: ldc ')'
    //   2186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2189: invokevirtual toString : ()Ljava/lang/String;
    //   2192: iconst_2
    //   2193: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2196: iconst_1
    //   2197: istore #24
    //   2199: aload #21
    //   2201: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   2206: getstatic org/bukkit/entity/EntityType.PIG : Lorg/bukkit/entity/EntityType;
    //   2209: if_acmpne -> 2424
    //   2212: aload #21
    //   2214: checkcast org/bukkit/entity/LivingEntity
    //   2217: invokeinterface isLeashed : ()Z
    //   2222: ifne -> 2424
    //   2225: goto -> 2232
    //   2228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2231: athrow
    //   2232: aload_0
    //   2233: getfield f : I
    //   2236: iconst_5
    //   2237: if_icmple -> 2424
    //   2240: goto -> 2247
    //   2243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2246: athrow
    //   2247: dload #22
    //   2249: dconst_0
    //   2250: dcmpl
    //   2251: iflt -> 2424
    //   2254: goto -> 2261
    //   2257: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2260: athrow
    //   2261: aload #21
    //   2263: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   2268: iconst_0
    //   2269: lload #14
    //   2271: invokestatic j : (Lorg/bukkit/Location;ZJ)Z
    //   2274: ifne -> 2424
    //   2277: goto -> 2284
    //   2280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2283: athrow
    //   2284: aload #21
    //   2286: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   2291: invokestatic x : (Lorg/bukkit/Location;)Z
    //   2294: ifne -> 2424
    //   2297: goto -> 2304
    //   2300: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2303: athrow
    //   2304: aload_0
    //   2305: lload #8
    //   2307: bipush #48
    //   2309: ldc2_w 4907007308282151738
    //   2312: lload #4
    //   2314: lxor
    //   2315: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2320: new java/lang/StringBuilder
    //   2323: dup
    //   2324: invokespecial <init> : ()V
    //   2327: sipush #20148
    //   2330: ldc2_w 5795236210706386343
    //   2333: lload #4
    //   2335: lxor
    //   2336: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2341: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2344: dload #22
    //   2346: invokestatic b : (D)D
    //   2349: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2352: sipush #7014
    //   2355: ldc2_w 7970079446147422318
    //   2358: lload #4
    //   2360: lxor
    //   2361: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2369: aload #21
    //   2371: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   2376: invokevirtual name : ()Ljava/lang/String;
    //   2379: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   2382: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2385: sipush #31192
    //   2388: ldc2_w 4041484317510056663
    //   2391: lload #4
    //   2393: lxor
    //   2394: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   2399: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2402: aload_0
    //   2403: getfield f : I
    //   2406: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2409: ldc ')'
    //   2411: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2414: invokevirtual toString : ()Ljava/lang/String;
    //   2417: iconst_2
    //   2418: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2421: iconst_1
    //   2422: istore #24
    //   2424: iload #24
    //   2426: ifeq -> 2513
    //   2429: getstatic me/rerere/matrix/internal/km.b : I
    //   2432: ifle -> 2473
    //   2435: goto -> 2442
    //   2438: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2441: athrow
    //   2442: aload_0
    //   2443: lload #10
    //   2445: invokevirtual j : (J)I
    //   2448: getstatic me/rerere/matrix/internal/km.b : I
    //   2451: if_icmplt -> 2473
    //   2454: goto -> 2461
    //   2457: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2460: athrow
    //   2461: aload_1
    //   2462: aload_2
    //   2463: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2466: goto -> 2473
    //   2469: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2472: athrow
    //   2473: getstatic me/rerere/matrix/internal/km.i : I
    //   2476: ifle -> 2513
    //   2479: aload_0
    //   2480: lload #10
    //   2482: invokevirtual j : (J)I
    //   2485: getstatic me/rerere/matrix/internal/km.i : I
    //   2488: if_icmplt -> 2513
    //   2491: goto -> 2498
    //   2494: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2497: athrow
    //   2498: aload #20
    //   2500: invokeinterface leaveVehicle : ()Z
    //   2505: pop
    //   2506: goto -> 2513
    //   2509: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2512: athrow
    //   2513: aload_0
    //   2514: dload #22
    //   2516: putfield k : D
    //   2519: return
    // Exception table:
    //   from	to	target	type
    //   67	83	86	java/lang/RuntimeException
    //   73	100	103	java/lang/RuntimeException
    //   90	115	118	java/lang/RuntimeException
    //   107	129	132	java/lang/RuntimeException
    //   122	142	145	java/lang/RuntimeException
    //   149	167	167	java/lang/RuntimeException
    //   180	195	198	java/lang/RuntimeException
    //   187	220	223	java/lang/RuntimeException
    //   202	234	237	java/lang/RuntimeException
    //   255	272	275	java/lang/RuntimeException
    //   265	287	290	java/lang/RuntimeException
    //   279	317	320	java/lang/RuntimeException
    //   294	341	344	java/lang/RuntimeException
    //   324	358	361	java/lang/RuntimeException
    //   365	384	387	java/lang/RuntimeException
    //   375	401	404	java/lang/RuntimeException
    //   408	432	435	java/lang/RuntimeException
    //   415	468	471	java/lang/RuntimeException
    //   439	485	488	java/lang/RuntimeException
    //   492	504	507	java/lang/RuntimeException
    //   511	533	536	java/lang/RuntimeException
    //   524	548	551	java/lang/RuntimeException
    //   540	562	565	java/lang/RuntimeException
    //   690	705	708	java/lang/RuntimeException
    //   722	747	750	java/lang/RuntimeException
    //   729	769	772	java/lang/RuntimeException
    //   754	799	802	java/lang/RuntimeException
    //   776	813	816	java/lang/RuntimeException
    //   806	830	833	java/lang/RuntimeException
    //   995	1033	1036	java/lang/RuntimeException
    //   1165	1177	1180	java/lang/RuntimeException
    //   1184	1210	1213	java/lang/RuntimeException
    //   1197	1230	1233	java/lang/RuntimeException
    //   1217	1250	1253	java/lang/RuntimeException
    //   1237	1270	1273	java/lang/RuntimeException
    //   1257	1305	1308	java/lang/RuntimeException
    //   1383	1399	1402	java/lang/RuntimeException
    //   1392	1414	1417	java/lang/RuntimeException
    //   1424	1442	1445	java/lang/RuntimeException
    //   1452	1473	1476	java/lang/RuntimeException
    //   1457	1493	1496	java/lang/RuntimeException
    //   1480	1507	1510	java/lang/RuntimeException
    //   1659	1675	1678	java/lang/RuntimeException
    //   1666	1690	1693	java/lang/RuntimeException
    //   1682	1707	1710	java/lang/RuntimeException
    //   1697	1723	1726	java/lang/RuntimeException
    //   1714	1742	1745	java/lang/RuntimeException
    //   1730	1763	1766	java/lang/RuntimeException
    //   1749	1779	1782	java/lang/RuntimeException
    //   1770	1796	1799	java/lang/RuntimeException
    //   1786	1826	1829	java/lang/RuntimeException
    //   1803	1843	1846	java/lang/RuntimeException
    //   1833	1911	1914	java/lang/RuntimeException
    //   1918	1934	1937	java/lang/RuntimeException
    //   1926	1950	1953	java/lang/RuntimeException
    //   1941	1964	1967	java/lang/RuntimeException
    //   1957	1979	1982	java/lang/RuntimeException
    //   1989	2007	2010	java/lang/RuntimeException
    //   2017	2038	2041	java/lang/RuntimeException
    //   2022	2058	2061	java/lang/RuntimeException
    //   2045	2072	2075	java/lang/RuntimeException
    //   2199	2225	2228	java/lang/RuntimeException
    //   2212	2240	2243	java/lang/RuntimeException
    //   2232	2254	2257	java/lang/RuntimeException
    //   2247	2277	2280	java/lang/RuntimeException
    //   2261	2297	2300	java/lang/RuntimeException
    //   2424	2435	2438	java/lang/RuntimeException
    //   2429	2454	2457	java/lang/RuntimeException
    //   2442	2466	2469	java/lang/RuntimeException
    //   2473	2491	2494	java/lang/RuntimeException
    //   2479	2506	2509	java/lang/RuntimeException
  }
  
  public void b(@NotNull VehicleEnterEvent paramVehicleEnterEvent, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/km.l : Ljava/util/List;
    //   3: ifnull -> 24
    //   6: getstatic me/rerere/matrix/internal/km.l : Ljava/util/List;
    //   9: invokeinterface isEmpty : ()Z
    //   14: ifeq -> 29
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   23: athrow
    //   24: return
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: aload_1
    //   30: invokevirtual getVehicle : ()Lorg/bukkit/entity/Vehicle;
    //   33: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   38: invokevirtual name : ()Ljava/lang/String;
    //   41: astore #4
    //   43: aload_1
    //   44: invokevirtual getEntered : ()Lorg/bukkit/entity/Entity;
    //   47: checkcast org/bukkit/entity/Player
    //   50: astore #5
    //   52: getstatic me/rerere/matrix/internal/km.l : Ljava/util/List;
    //   55: invokeinterface iterator : ()Ljava/util/Iterator;
    //   60: astore #6
    //   62: aload #6
    //   64: invokeinterface hasNext : ()Z
    //   69: ifeq -> 127
    //   72: aload #6
    //   74: invokeinterface next : ()Ljava/lang/Object;
    //   79: checkcast java/lang/String
    //   82: astore #7
    //   84: aload #4
    //   86: aload #7
    //   88: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   91: ifeq -> 124
    //   94: aload_1
    //   95: iconst_1
    //   96: invokevirtual setCancelled : (Z)V
    //   99: aload #5
    //   101: sipush #27443
    //   104: ldc2_w 2537043449654951926
    //   107: lload_2
    //   108: lxor
    //   109: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   114: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   119: return
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: goto -> 62
    //   127: return
    // Exception table:
    //   from	to	target	type
    //   0	17	20	java/lang/RuntimeException
    //   6	25	25	java/lang/RuntimeException
    //   84	120	120	java/lang/RuntimeException
  }
  
  public km(yl paramyl) {
    super(paramyl);
    b(yk.f);
  }
  
  static {
    long l = a ^ 0x7F5BB81B3C0FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[25];
    boolean bool = false;
    String str;
    int i = (str = "µB\016\017¸ÉbÕ:\0173aG\020 æ?ëÃ47¯!£ì¥VX\023,\020:ú0|\f÷ûð+\016à\020Æ\\æ~8\råñ5tt¥ã¬bª`äÇ¼üÝ\t&\020ñ7«ÿ¤]AWçéÎÊãô=½£ª£¹ïÈn³\013s{Þ\020$Ø\005ËG\"Q\024BÍB«w\024\020Ð%§\tÂaiÆÁxô»·W®(jf)ß\bÿßgÇ5sg±'Ýª`çM\002Rm\0071\025*ÔBÍ\026Ý\001(ãë*øÀhÒ¯ ¶H\027( ¬Fl½#\fÎêèÄ§\fL\037S£:ú±öç@· j³ÿ¶ßïÊÊgA1½½¦~\036´QSl2\031\0353¾\032à\022@ÉøCãµ+¯¤È£º¨D\020;,v\033ÃÝ\033\016Å\tuÙè¦;Sëx)¶\025ub\bÞ¢¬SìÇlDÜK}\034fO\020)\033\002ò\003;C\033\r\035a è(JW>o¹º»¡ø9|\022W¤OµzçÛÀó¥(\r«A\\0\035{S¬uF,ü\\\030_ù\0241u\013Q4_·\013\023GiRÝ\037\027¸T\030`0¡3msåê[\022þ<Â&Ddqî ¯/AÃ ë.SÝÐVõ\030díì2\026¨ÑH\017ÜT\030â\020¦B¼gäâ²-À\\8\017ó@(}þülþ3ÞÐøçÑ ¶K¥üþdÃí\000@²b)_,N³µÒk½®-à\031\020\bbWÃ\006!`ï³ü\006Ô¾ ³b@\021\037\026í\031YLJ\rì=]»çÚ¹ó%\\oÛ\"\036./\bàYþ\034³ZPt\032Ø+\007Àp¹MÒÎðq\033úÆÝ.¨®0f\004\023Ï\027¯4Ù³ñ£§\000gØö?6Q*ÅÁºwÂôñ¦;²øÈîô¸»\026È¿ñw\030»\017qÙÁ%øÜÄ9c\001ãÕ8\037\n\007ÓÏ\020^ÞúÿA8ýÒºà\007Qð=Q(e%\020'W¥Ûckð-$^Ùá\r<õ¤ßÍÇÒôùqäÔB+é}ñ5]").length();
    byte b2 = 16;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x589A;
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
        throw new RuntimeException("me/rerere/matrix/internal/km", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/km'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\km.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class sg extends zk {
  private static boolean ya;
  
  private float c;
  
  private static boolean p;
  
  private int j;
  
  private float d;
  
  private float h;
  
  private int e = 0;
  
  private static boolean n;
  
  private float y;
  
  public static final double m;
  
  private final jc o;
  
  private int q;
  
  private final jc t;
  
  private float g;
  
  private float a;
  
  private static boolean s;
  
  private int u = 3;
  
  private int w;
  
  private static int f;
  
  private static boolean l;
  
  private static boolean r;
  
  private long x;
  
  private float z = 0.0F;
  
  private int k = 0;
  
  private static boolean v;
  
  private int b = 0;
  
  private long i;
  
  private static final long A = o3.a(2553670097805748080L, -4163876402925184608L, MethodHandles.lookup().lookupClass()).a(230463225468129L);
  
  private static final String[] F;
  
  private static final String[] G;
  
  private static final Map H = new HashMap<>(13);
  
  public void b(int paramInt1, int paramInt2) {
    try {
      if (this.j > 0)
        this.j--; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean b(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    try {
      if (paramPacketType == PacketType.Play.Server.POSITION)
        this.i = pc.j(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void b(long paramLong, @NotNull PacketType paramPacketType, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 1671725438074
    //   5: lxor
    //   6: lstore #6
    //   8: dup2
    //   9: ldc2_w 94358325202964
    //   12: lxor
    //   13: lstore #8
    //   15: dup2
    //   16: ldc2_w 44175952743548
    //   19: lxor
    //   20: dup2
    //   21: bipush #16
    //   23: lushr
    //   24: lstore #10
    //   26: dup2
    //   27: bipush #48
    //   29: lshl
    //   30: bipush #48
    //   32: lushr
    //   33: l2i
    //   34: istore #12
    //   36: pop2
    //   37: dup2
    //   38: ldc2_w 41429453540845
    //   41: lxor
    //   42: dup2
    //   43: bipush #32
    //   45: lushr
    //   46: l2i
    //   47: istore #13
    //   49: dup2
    //   50: bipush #32
    //   52: lshl
    //   53: bipush #32
    //   55: lushr
    //   56: lstore #14
    //   58: pop2
    //   59: dup2
    //   60: ldc2_w 39881623504881
    //   63: lxor
    //   64: dup2
    //   65: bipush #32
    //   67: lushr
    //   68: l2i
    //   69: istore #16
    //   71: dup2
    //   72: bipush #32
    //   74: lshl
    //   75: bipush #32
    //   77: lushr
    //   78: l2i
    //   79: istore #17
    //   81: pop2
    //   82: dup2
    //   83: ldc2_w 48233904931133
    //   86: lxor
    //   87: dup2
    //   88: bipush #56
    //   90: lushr
    //   91: l2i
    //   92: istore #18
    //   94: dup2
    //   95: bipush #8
    //   97: lshl
    //   98: bipush #8
    //   100: lushr
    //   101: lstore #19
    //   103: pop2
    //   104: dup2
    //   105: ldc2_w 72512624153611
    //   108: lxor
    //   109: lstore #21
    //   111: pop2
    //   112: fload #4
    //   114: aload_0
    //   115: getfield y : F
    //   118: iload #13
    //   120: swap
    //   121: lload #14
    //   123: dup2_x1
    //   124: pop2
    //   125: invokestatic b : (FIJF)F
    //   128: fstore #23
    //   130: fload #5
    //   132: aload_0
    //   133: getfield c : F
    //   136: iload #13
    //   138: swap
    //   139: lload #14
    //   141: dup2_x1
    //   142: pop2
    //   143: invokestatic b : (FIJF)F
    //   146: fstore #24
    //   148: getstatic me/rerere/matrix/internal/pd.z : Z
    //   151: ifeq -> 258
    //   154: aload_0
    //   155: iload #18
    //   157: i2b
    //   158: lload #19
    //   160: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   163: new java/lang/StringBuilder
    //   166: dup
    //   167: invokespecial <init> : ()V
    //   170: sipush #28156
    //   173: ldc2_w 2539781018058834775
    //   176: lload_1
    //   177: lxor
    //   178: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: fload #23
    //   188: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   191: ldc ','
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: fload #24
    //   198: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   201: sipush #26246
    //   204: ldc2_w 2938690271344609321
    //   207: lload_1
    //   208: lxor
    //   209: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: fload #4
    //   219: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   222: sipush #1611
    //   225: ldc2_w 4072546082632444138
    //   228: lload_1
    //   229: lxor
    //   230: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: fload #5
    //   240: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   243: invokevirtual toString : ()Ljava/lang/String;
    //   246: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   257: athrow
    //   258: aload_0
    //   259: getfield j : I
    //   262: ifle -> 519
    //   265: getstatic me/rerere/matrix/internal/sg.p : Z
    //   268: ifeq -> 519
    //   271: goto -> 278
    //   274: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   277: athrow
    //   278: fload #23
    //   280: fconst_0
    //   281: fcmpl
    //   282: ifle -> 397
    //   285: goto -> 292
    //   288: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   291: athrow
    //   292: fload #23
    //   294: fconst_1
    //   295: frem
    //   296: fconst_0
    //   297: fcmpl
    //   298: ifne -> 397
    //   301: goto -> 308
    //   304: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   307: athrow
    //   308: invokestatic j : ()J
    //   311: aload_0
    //   312: getfield i : J
    //   315: lsub
    //   316: ldc2_w 1500
    //   319: lcmp
    //   320: iflt -> 397
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   329: athrow
    //   330: aload_0
    //   331: dup
    //   332: getfield w : I
    //   335: iconst_1
    //   336: iadd
    //   337: dup_x1
    //   338: putfield w : I
    //   341: iconst_3
    //   342: if_icmple -> 402
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   351: athrow
    //   352: aload_0
    //   353: iconst_1
    //   354: putfield w : I
    //   357: aload_0
    //   358: lload #6
    //   360: sipush #25596
    //   363: ldc2_w 3995772782309494104
    //   366: lload_1
    //   367: lxor
    //   368: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   373: sipush #11790
    //   376: ldc2_w 4186377391372566702
    //   379: lload_1
    //   380: lxor
    //   381: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   386: iconst_1
    //   387: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   390: goto -> 402
    //   393: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   396: athrow
    //   397: aload_0
    //   398: iconst_0
    //   399: putfield w : I
    //   402: fload #24
    //   404: fconst_0
    //   405: fcmpl
    //   406: ifle -> 514
    //   409: fload #24
    //   411: fconst_1
    //   412: frem
    //   413: fconst_0
    //   414: fcmpl
    //   415: ifne -> 514
    //   418: goto -> 425
    //   421: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   424: athrow
    //   425: invokestatic j : ()J
    //   428: aload_0
    //   429: getfield i : J
    //   432: lsub
    //   433: ldc2_w 1500
    //   436: lcmp
    //   437: iflt -> 514
    //   440: goto -> 447
    //   443: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   446: athrow
    //   447: aload_0
    //   448: dup
    //   449: getfield w : I
    //   452: iconst_1
    //   453: iadd
    //   454: dup_x1
    //   455: putfield w : I
    //   458: iconst_3
    //   459: if_icmple -> 519
    //   462: goto -> 469
    //   465: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   468: athrow
    //   469: aload_0
    //   470: iconst_1
    //   471: putfield w : I
    //   474: aload_0
    //   475: lload #6
    //   477: sipush #15165
    //   480: ldc2_w 1035627166743467423
    //   483: lload_1
    //   484: lxor
    //   485: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   490: sipush #18281
    //   493: ldc2_w 5266896567319030228
    //   496: lload_1
    //   497: lxor
    //   498: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   503: iconst_1
    //   504: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   507: goto -> 519
    //   510: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   513: athrow
    //   514: aload_0
    //   515: iconst_0
    //   516: putfield w : I
    //   519: fload #23
    //   521: aload_0
    //   522: getfield d : F
    //   525: fsub
    //   526: invokestatic abs : (F)F
    //   529: fstore #25
    //   531: fload #24
    //   533: aload_0
    //   534: getfield h : F
    //   537: fsub
    //   538: invokestatic abs : (F)F
    //   541: fstore #26
    //   543: aload_0
    //   544: getfield t : Lme/rerere/matrix/internal/jc;
    //   547: fload #25
    //   549: lload #10
    //   551: iload #12
    //   553: i2s
    //   554: invokevirtual b : (FJS)V
    //   557: aload_0
    //   558: getfield o : Lme/rerere/matrix/internal/jc;
    //   561: fload #26
    //   563: lload #10
    //   565: iload #12
    //   567: i2s
    //   568: invokevirtual b : (FJS)V
    //   571: aload_0
    //   572: getfield t : Lme/rerere/matrix/internal/jc;
    //   575: iload #16
    //   577: iload #17
    //   579: invokevirtual b : (II)Z
    //   582: ifeq -> 934
    //   585: aload_0
    //   586: getfield o : Lme/rerere/matrix/internal/jc;
    //   589: iload #16
    //   591: iload #17
    //   593: invokevirtual b : (II)Z
    //   596: ifeq -> 934
    //   599: goto -> 606
    //   602: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   605: athrow
    //   606: aload_0
    //   607: getfield j : I
    //   610: ifle -> 934
    //   613: goto -> 620
    //   616: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   619: athrow
    //   620: getstatic me/rerere/matrix/internal/sg.ya : Z
    //   623: ifeq -> 934
    //   626: goto -> 633
    //   629: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   632: athrow
    //   633: aload_0
    //   634: getfield t : Lme/rerere/matrix/internal/jc;
    //   637: lload #21
    //   639: invokevirtual b : (J)F
    //   642: fstore #27
    //   644: aload_0
    //   645: getfield o : Lme/rerere/matrix/internal/jc;
    //   648: lload #21
    //   650: invokevirtual b : (J)F
    //   653: fstore #28
    //   655: aload_0
    //   656: getfield t : Lme/rerere/matrix/internal/jc;
    //   659: lload #8
    //   661: invokevirtual j : (J)F
    //   664: fstore #29
    //   666: aload_0
    //   667: getfield o : Lme/rerere/matrix/internal/jc;
    //   670: lload #8
    //   672: invokevirtual j : (J)F
    //   675: fstore #30
    //   677: fload #23
    //   679: ldc 1.5
    //   681: fcmpg
    //   682: ifge -> 693
    //   685: iconst_1
    //   686: goto -> 694
    //   689: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   692: athrow
    //   693: iconst_0
    //   694: istore #31
    //   696: fload #27
    //   698: fconst_1
    //   699: fcmpg
    //   700: iflt -> 729
    //   703: fload #28
    //   705: fconst_1
    //   706: fcmpg
    //   707: ifge -> 737
    //   710: goto -> 717
    //   713: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   716: athrow
    //   717: iload #31
    //   719: ifne -> 737
    //   722: goto -> 729
    //   725: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   728: athrow
    //   729: iconst_1
    //   730: goto -> 738
    //   733: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   736: athrow
    //   737: iconst_0
    //   738: istore #32
    //   740: fload #29
    //   742: ldc 5.0
    //   744: fcmpg
    //   745: ifge -> 783
    //   748: fload #30
    //   750: ldc 5.0
    //   752: fcmpl
    //   753: ifle -> 783
    //   756: goto -> 763
    //   759: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   762: athrow
    //   763: iload #31
    //   765: ifne -> 783
    //   768: goto -> 775
    //   771: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   774: athrow
    //   775: iconst_1
    //   776: goto -> 784
    //   779: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   782: athrow
    //   783: iconst_0
    //   784: istore #33
    //   786: iload #32
    //   788: ifeq -> 920
    //   791: iload #33
    //   793: ifeq -> 920
    //   796: goto -> 803
    //   799: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   802: athrow
    //   803: aload_0
    //   804: dup
    //   805: getfield q : I
    //   808: iconst_1
    //   809: iadd
    //   810: putfield q : I
    //   813: aload_0
    //   814: getfield q : I
    //   817: bipush #8
    //   819: if_icmple -> 934
    //   822: goto -> 829
    //   825: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   828: athrow
    //   829: aload_0
    //   830: lload #6
    //   832: sipush #15198
    //   835: ldc2_w 2753102031988299251
    //   838: lload_1
    //   839: lxor
    //   840: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   845: new java/lang/StringBuilder
    //   848: dup
    //   849: invokespecial <init> : ()V
    //   852: sipush #28816
    //   855: ldc2_w 1326087618479775276
    //   858: lload_1
    //   859: lxor
    //   860: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   865: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   868: aload_0
    //   869: getfield q : I
    //   872: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   875: ldc ')'
    //   877: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   880: invokevirtual toString : ()Ljava/lang/String;
    //   883: getstatic me/rerere/matrix/internal/sg.f : I
    //   886: iconst_2
    //   887: idiv
    //   888: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   891: aload_0
    //   892: getfield q : I
    //   895: bipush #10
    //   897: if_icmple -> 934
    //   900: goto -> 907
    //   903: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   906: athrow
    //   907: aload_0
    //   908: bipush #10
    //   910: putfield q : I
    //   913: goto -> 934
    //   916: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   919: athrow
    //   920: aload_0
    //   921: iconst_0
    //   922: aload_0
    //   923: getfield q : I
    //   926: iconst_1
    //   927: isub
    //   928: invokestatic max : (II)I
    //   931: putfield q : I
    //   934: aload_0
    //   935: getfield u : I
    //   938: iconst_3
    //   939: if_icmpge -> 1130
    //   942: aload_0
    //   943: dup
    //   944: getfield u : I
    //   947: iconst_1
    //   948: iadd
    //   949: putfield u : I
    //   952: aload_0
    //   953: getfield u : I
    //   956: iconst_2
    //   957: if_icmpne -> 1118
    //   960: goto -> 967
    //   963: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   966: athrow
    //   967: fload #23
    //   969: ldc 20.0
    //   971: fcmpl
    //   972: ifle -> 1118
    //   975: goto -> 982
    //   978: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   981: athrow
    //   982: aload_0
    //   983: getfield g : F
    //   986: ldc 20.0
    //   988: fcmpl
    //   989: ifle -> 1118
    //   992: goto -> 999
    //   995: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   998: athrow
    //   999: fload #23
    //   1001: aload_0
    //   1002: getfield g : F
    //   1005: fsub
    //   1006: invokestatic abs : (F)F
    //   1009: ldc 3.0
    //   1011: fcmpg
    //   1012: ifgt -> 1118
    //   1015: goto -> 1022
    //   1018: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1021: athrow
    //   1022: fload #24
    //   1024: aload_0
    //   1025: getfield a : F
    //   1028: fsub
    //   1029: invokestatic abs : (F)F
    //   1032: ldc 3.0
    //   1034: fcmpg
    //   1035: ifgt -> 1118
    //   1038: goto -> 1045
    //   1041: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1044: athrow
    //   1045: fload #5
    //   1047: invokestatic abs : (F)F
    //   1050: ldc 60.0
    //   1052: fcmpg
    //   1053: ifgt -> 1118
    //   1056: goto -> 1063
    //   1059: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1062: athrow
    //   1063: getstatic me/rerere/matrix/internal/sg.s : Z
    //   1066: ifeq -> 1118
    //   1069: goto -> 1076
    //   1072: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1075: athrow
    //   1076: aload_0
    //   1077: lload #6
    //   1079: sipush #7202
    //   1082: ldc2_w 3651426703570383495
    //   1085: lload_1
    //   1086: lxor
    //   1087: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1092: sipush #23452
    //   1095: ldc2_w 4795617839825909045
    //   1098: lload_1
    //   1099: lxor
    //   1100: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1105: getstatic me/rerere/matrix/internal/sg.f : I
    //   1108: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1111: goto -> 1118
    //   1114: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1117: athrow
    //   1118: aload_0
    //   1119: fload #23
    //   1121: putfield g : F
    //   1124: aload_0
    //   1125: fload #24
    //   1127: putfield a : F
    //   1130: aload_0
    //   1131: getfield j : I
    //   1134: ifle -> 1570
    //   1137: fload #5
    //   1139: invokestatic abs : (F)F
    //   1142: ldc 75.0
    //   1144: fcmpg
    //   1145: ifgt -> 1378
    //   1148: goto -> 1155
    //   1151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1154: athrow
    //   1155: fload #23
    //   1157: fconst_0
    //   1158: fcmpl
    //   1159: ifle -> 1343
    //   1162: goto -> 1169
    //   1165: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1168: athrow
    //   1169: fload #24
    //   1171: fconst_0
    //   1172: fcmpl
    //   1173: ifeq -> 1202
    //   1176: goto -> 1183
    //   1179: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1182: athrow
    //   1183: aload_0
    //   1184: fload #24
    //   1186: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1189: invokespecial b : (Ljava/lang/Number;)Z
    //   1192: ifeq -> 1343
    //   1195: goto -> 1202
    //   1198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1201: athrow
    //   1202: aload_0
    //   1203: dup
    //   1204: getfield z : F
    //   1207: fload #23
    //   1209: ldc 5.0
    //   1211: invokestatic min : (FF)F
    //   1214: fadd
    //   1215: putfield z : F
    //   1218: fload #24
    //   1220: fconst_0
    //   1221: fcmpl
    //   1222: ifne -> 1265
    //   1225: goto -> 1232
    //   1228: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1231: athrow
    //   1232: fload #23
    //   1234: ldc 10.0
    //   1236: fcmpl
    //   1237: ifle -> 1265
    //   1240: goto -> 1247
    //   1243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1246: athrow
    //   1247: aload_0
    //   1248: dup
    //   1249: getfield z : F
    //   1252: ldc 5.0
    //   1254: fadd
    //   1255: putfield z : F
    //   1258: goto -> 1265
    //   1261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1264: athrow
    //   1265: aload_0
    //   1266: getfield z : F
    //   1269: ldc 50.0
    //   1271: fcmpl
    //   1272: ifle -> 1378
    //   1275: getstatic me/rerere/matrix/internal/sg.v : Z
    //   1278: ifeq -> 1333
    //   1281: goto -> 1288
    //   1284: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1287: athrow
    //   1288: aload_0
    //   1289: lload #6
    //   1291: sipush #14196
    //   1294: ldc2_w 8316605386864499154
    //   1297: lload_1
    //   1298: lxor
    //   1299: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1304: sipush #12168
    //   1307: ldc2_w 1077032307677167920
    //   1310: lload_1
    //   1311: lxor
    //   1312: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1317: iconst_2
    //   1318: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1321: aload_0
    //   1322: iconst_5
    //   1323: putfield b : I
    //   1326: goto -> 1333
    //   1329: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1332: athrow
    //   1333: aload_0
    //   1334: ldc_w 30.0
    //   1337: putfield z : F
    //   1340: goto -> 1378
    //   1343: aload_0
    //   1344: fconst_0
    //   1345: aload_0
    //   1346: getfield z : F
    //   1349: aload_0
    //   1350: getfield z : F
    //   1353: ldc 50.0
    //   1355: fcmpl
    //   1356: ifle -> 1368
    //   1359: ldc 10.0
    //   1361: goto -> 1371
    //   1364: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1367: athrow
    //   1368: ldc_w 4.0
    //   1371: fsub
    //   1372: invokestatic max : (FF)F
    //   1375: putfield z : F
    //   1378: aload_0
    //   1379: fload #24
    //   1381: f2d
    //   1382: getstatic me/rerere/matrix/internal/sg.m : D
    //   1385: dmul
    //   1386: d2l
    //   1387: aload_0
    //   1388: getfield h : F
    //   1391: f2d
    //   1392: getstatic me/rerere/matrix/internal/sg.m : D
    //   1395: dmul
    //   1396: d2l
    //   1397: invokespecial b : (JJ)J
    //   1400: lstore #27
    //   1402: fload #23
    //   1404: fconst_0
    //   1405: fcmpl
    //   1406: ifle -> 1570
    //   1409: fload #24
    //   1411: fconst_0
    //   1412: fcmpl
    //   1413: ifle -> 1570
    //   1416: goto -> 1423
    //   1419: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1422: athrow
    //   1423: aload_0
    //   1424: getfield h : F
    //   1427: fconst_0
    //   1428: fcmpl
    //   1429: ifle -> 1570
    //   1432: goto -> 1439
    //   1435: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1438: athrow
    //   1439: lload #27
    //   1441: ldc2_w 131072
    //   1444: lcmp
    //   1445: ifge -> 1556
    //   1448: goto -> 1455
    //   1451: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1454: athrow
    //   1455: aload_0
    //   1456: dup
    //   1457: getfield k : I
    //   1460: iconst_1
    //   1461: iadd
    //   1462: dup_x1
    //   1463: putfield k : I
    //   1466: bipush #10
    //   1468: if_icmple -> 1570
    //   1471: goto -> 1478
    //   1474: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1477: athrow
    //   1478: aload_0
    //   1479: bipush #10
    //   1481: putfield k : I
    //   1484: getstatic me/rerere/matrix/internal/sg.l : Z
    //   1487: ifeq -> 1570
    //   1490: goto -> 1497
    //   1493: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1496: athrow
    //   1497: aload_0
    //   1498: getfield b : I
    //   1501: ifgt -> 1570
    //   1504: goto -> 1511
    //   1507: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1510: athrow
    //   1511: aload_0
    //   1512: lload #6
    //   1514: sipush #10313
    //   1517: ldc2_w 5663893859232286433
    //   1520: lload_1
    //   1521: lxor
    //   1522: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1527: sipush #8207
    //   1530: ldc2_w 7199596306979360438
    //   1533: lload_1
    //   1534: lxor
    //   1535: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   1540: iconst_0
    //   1541: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1544: aload_0
    //   1545: iconst_5
    //   1546: putfield b : I
    //   1549: goto -> 1570
    //   1552: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1555: athrow
    //   1556: aload_0
    //   1557: iconst_0
    //   1558: aload_0
    //   1559: getfield k : I
    //   1562: iconst_1
    //   1563: isub
    //   1564: invokestatic max : (II)I
    //   1567: putfield k : I
    //   1570: aload_0
    //   1571: fload #4
    //   1573: putfield y : F
    //   1576: aload_0
    //   1577: fload #5
    //   1579: putfield c : F
    //   1582: aload_0
    //   1583: fload #23
    //   1585: putfield d : F
    //   1588: aload_0
    //   1589: fload #24
    //   1591: putfield h : F
    //   1594: return
    // Exception table:
    //   from	to	target	type
    //   148	251	254	java/lang/RuntimeException
    //   258	271	274	java/lang/RuntimeException
    //   265	285	288	java/lang/RuntimeException
    //   278	301	304	java/lang/RuntimeException
    //   292	323	326	java/lang/RuntimeException
    //   308	345	348	java/lang/RuntimeException
    //   330	393	393	java/lang/RuntimeException
    //   402	418	421	java/lang/RuntimeException
    //   409	440	443	java/lang/RuntimeException
    //   425	462	465	java/lang/RuntimeException
    //   447	510	510	java/lang/RuntimeException
    //   543	599	602	java/lang/RuntimeException
    //   585	613	616	java/lang/RuntimeException
    //   606	626	629	java/lang/RuntimeException
    //   677	689	689	java/lang/RuntimeException
    //   696	710	713	java/lang/RuntimeException
    //   703	722	725	java/lang/RuntimeException
    //   717	733	733	java/lang/RuntimeException
    //   740	756	759	java/lang/RuntimeException
    //   748	768	771	java/lang/RuntimeException
    //   763	779	779	java/lang/RuntimeException
    //   786	796	799	java/lang/RuntimeException
    //   791	822	825	java/lang/RuntimeException
    //   803	900	903	java/lang/RuntimeException
    //   829	916	916	java/lang/RuntimeException
    //   934	960	963	java/lang/RuntimeException
    //   942	975	978	java/lang/RuntimeException
    //   967	992	995	java/lang/RuntimeException
    //   982	1015	1018	java/lang/RuntimeException
    //   999	1038	1041	java/lang/RuntimeException
    //   1022	1056	1059	java/lang/RuntimeException
    //   1045	1069	1072	java/lang/RuntimeException
    //   1063	1111	1114	java/lang/RuntimeException
    //   1130	1148	1151	java/lang/RuntimeException
    //   1137	1162	1165	java/lang/RuntimeException
    //   1155	1176	1179	java/lang/RuntimeException
    //   1169	1195	1198	java/lang/RuntimeException
    //   1183	1225	1228	java/lang/RuntimeException
    //   1202	1240	1243	java/lang/RuntimeException
    //   1232	1258	1261	java/lang/RuntimeException
    //   1265	1281	1284	java/lang/RuntimeException
    //   1275	1326	1329	java/lang/RuntimeException
    //   1343	1364	1364	java/lang/RuntimeException
    //   1402	1416	1419	java/lang/RuntimeException
    //   1409	1432	1435	java/lang/RuntimeException
    //   1423	1448	1451	java/lang/RuntimeException
    //   1439	1471	1474	java/lang/RuntimeException
    //   1455	1490	1493	java/lang/RuntimeException
    //   1478	1504	1507	java/lang/RuntimeException
    //   1497	1552	1552	java/lang/RuntimeException
  }
  
  public sg(long paramLong, yl paramyl) {
    super(paramyl);
    this.t = new jc(l, 20);
    this.o = new jc(l, 20);
    this.q = 0;
    this.w = 0;
    b(yk.n);
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    try {
      if (this.b > 0)
        try {
          this.b--;
          if (r)
            paramEntityDamageByEntityEvent.setCancelled(true); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(int paramInt, long paramLong) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 1430875225653
    //   5: lxor
    //   6: lstore #4
    //   8: pop2
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield u : I
    //   14: aload_0
    //   15: bipush #15
    //   17: putfield j : I
    //   20: invokestatic j : ()J
    //   23: aload_0
    //   24: getfield x : J
    //   27: lsub
    //   28: lstore #6
    //   30: lload #6
    //   32: ldc2_w 350
    //   35: lcmp
    //   36: ifgt -> 154
    //   39: aload_0
    //   40: dup
    //   41: getfield e : I
    //   44: bipush #8
    //   46: lload #6
    //   48: l2f
    //   49: ldc 50.0
    //   51: fdiv
    //   52: invokestatic round : (F)I
    //   55: isub
    //   56: iadd
    //   57: putfield e : I
    //   60: aload_0
    //   61: getfield e : I
    //   64: bipush #45
    //   66: if_icmple -> 169
    //   69: goto -> 76
    //   72: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   75: athrow
    //   76: getstatic me/rerere/matrix/internal/sg.n : Z
    //   79: ifeq -> 136
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: aload_0
    //   90: lload #4
    //   92: sipush #2962
    //   95: ldc2_w 7950224670202220386
    //   98: lload_2
    //   99: lxor
    //   100: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   105: sipush #4322
    //   108: ldc2_w 5581289316787639318
    //   111: lload_2
    //   112: lxor
    //   113: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   118: getstatic me/rerere/matrix/internal/sg.f : I
    //   121: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   124: aload_0
    //   125: iconst_3
    //   126: putfield b : I
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   135: athrow
    //   136: aload_0
    //   137: iconst_0
    //   138: aload_0
    //   139: getfield e : I
    //   142: bipush #30
    //   144: isub
    //   145: invokestatic max : (II)I
    //   148: putfield e : I
    //   151: goto -> 169
    //   154: aload_0
    //   155: iconst_0
    //   156: aload_0
    //   157: getfield e : I
    //   160: bipush #6
    //   162: isub
    //   163: invokestatic max : (II)I
    //   166: putfield e : I
    //   169: return
    // Exception table:
    //   from	to	target	type
    //   30	69	72	java/lang/RuntimeException
    //   39	82	85	java/lang/RuntimeException
    //   76	129	132	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    float f = Math.abs(paramLocation2.getPitch() - paramLocation1.getPitch());
    try {
      if (f > 20.0F)
        this.x = pc.j(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  static {
    long l = A ^ 0x168957988DA2L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[25];
    boolean bool = false;
    String str;
    int i = (str = "¹\0169Løè\020ÑÁ°:qÒL\tê8ÒX³t(R0¯\013Â@H\023î\033$Ê;o=Hy.o`Eul\nòÿewV§Ùè_}MÔÊun<\0165Å]£Â\004Èí\025iíÌl Ú\036Î«\032u\032 o\021\001GT\005\f%\013ð»WÀ[oY\036pÚÆöU¬þ«ª@Vª\032R@²DÛô×±²ãÿ\013¥ç\0268Rr+\000¼ßÁËîDgtF£­\020\0268å\030C\bÄ\"â\0307À\"j\032\022*Zmù\022ß¸`\000C0üO9bðÿ¥º }¨\030\b­\035Tjß\006¾@Ã\003Æ7;·4µÂËêA\021\b\nåå¥¤ÖJÓñµn\032äC IEc°w/Zl\022î\nj\0347Ü|5\036ý]Ä\030áMZ\005×²X\020\030²±÷\021\f·\037â¸\037lLCqÐ8Í¸¶Â\t#n>(@?«À´ÝåËã»V´Ï¸õcD\035óÓºøl¨ïÀ`%öO\035zê 8ðÈuJýo5\00266|\032zJñ2~<\ra\000_k\007Úa\000Ë¼s\033HáÂ|Ú1x\037@?\001ÆðtÙ©v \027cÝÅ\005]år\01690±ç\n·¥7Ld«ÑxûiE\032 tYf¤\001qÔ¡\t!q\023é /PÏËÙ\021îÓê\005\035¡ÝÏaH¶¥y\004®\022\r@f¼]\032\013Eª{?Èb\032-©weã\\5Vz\020\"\031þtéØ»\007Æ\0226\0241Njù\007\t\024fÑK\fd)¶Ö\002Z^BËX\037 \b\003¥N\021ö$þØÅO¶?¤\016\034ä$ºk\fx¯\027\025%S \004¸_~ÑNÂR1§ eµþ8`·Øá¸2Ã»ñØbkU\024xË\002ò>(½½\030¿¤/_l\tçÇkJ~HiQàüä[¾¿ïÎ8àiTÿy\034îmÐ\022À\035öL#P¸P0 ðK fÖÔ³@éÓ\\\006¢\\Ù§-1ïÀüGï DÏaó7tÅKF\024r[ßf½$Îx\013ø®OK\n7¢HöG\016\004M<õÍ2Òf0\023\001i~BcÆÃÜ\032½ðÐ|_æ\026I\b\033É>fC\025ì\036\021¦ÚáÁ#P¯v%NmPÞ\006gä{ÆýBÉuù¤ \030°ð t4\001Üm.|&¸-x\030­[éQ±1(ÙpSü>\032¸\021I°ÞO{\"{y\007\003õgøDw­¼äkÔèØ?ÙHß1à¡Ïêt'e·ëM\013ïÅe¿{»Z\026Øëäº¬Ö/V´Åv%û±ml¥©°V=É<_9ÇpóÛ?º\003C\024)øìC¸û±þÄp!©5¨FÛ7,X*²ò\t};´òÂ*\b5'[Á\"ÌØçÊq\031\r\027;\024ö>¶6´\004<8\t¼\02213Óü^ Ä`,;@8ïLyÙF~@s@þû\017P³\013-yßêEOÙ@\033.ç1\007\032¿äA2!¾Õ°d\030[Oé¡Ou\030dê+\007ÚÕ!þÿÍ\020>oS\005\032ð\t%dÏ@_\027ÖPüPtOúw<íÎV³iÔ¹¸¶O®Ð|Yæ·*\\â@v_ÝÜ7Acßv1\022Ô\032R\030\fSÿÒLÛ¾U`\n\021B¦8\013ÄÒTÉ§\004\bç\022\022gý_´\020UìÒó¨³û]àX\004Ô\005î¸®\030X\036¡êêT¾<õªÑl)ùc\021q\\cT>1+ç.s?àÿPê\003Û<V\030µÜ]_þ¼j¼°ãÛù\022`m+OkUQÝ\032\034&\031g«O3¤eÚÆ¢lL%sèïu]Ýè§i¶IHu\b¡J\021¸^y\013\bÓ¡éu©\033!ZF¤Á´}ÔÑ+ü¥1|ú%Ê\006õí¼8{wÃ?Uá0]\006\021b`}\000\"y#ÊU\004\025¾¿={\027bó%]?`\016\031D\006{çÐL_¿·QöÝÉê6\036\034±\t¿D=\021F´Ø8kX\016sNp´qr³0?|+q$m$\001H%\026qEPËIÖRLª¡£ëô3wô\036").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sg.A : J
    //   3: ldc2_w 95856769294900
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: astore_3
    //   13: aload_3
    //   14: sipush #274
    //   17: ldc2_w 4940600148155029481
    //   20: lload_1
    //   21: lxor
    //   22: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   27: bipush #7
    //   29: invokeinterface getInt : (Ljava/lang/String;I)I
    //   34: putstatic me/rerere/matrix/internal/sg.f : I
    //   37: aload_3
    //   38: sipush #31845
    //   41: ldc2_w 5255470488745061018
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   57: putstatic me/rerere/matrix/internal/sg.v : Z
    //   60: aload_3
    //   61: sipush #3126
    //   64: ldc2_w 4191205378001230553
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   74: iconst_1
    //   75: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   80: putstatic me/rerere/matrix/internal/sg.s : Z
    //   83: aload_3
    //   84: sipush #9372
    //   87: ldc2_w 7855594502021640801
    //   90: lload_1
    //   91: lxor
    //   92: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   97: iconst_1
    //   98: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   103: putstatic me/rerere/matrix/internal/sg.n : Z
    //   106: aload_3
    //   107: sipush #22007
    //   110: ldc2_w 808454423005397765
    //   113: lload_1
    //   114: lxor
    //   115: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   120: iconst_1
    //   121: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   126: putstatic me/rerere/matrix/internal/sg.l : Z
    //   129: aload_3
    //   130: sipush #23288
    //   133: ldc2_w 2751822183214386204
    //   136: lload_1
    //   137: lxor
    //   138: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   143: iconst_1
    //   144: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   149: putstatic me/rerere/matrix/internal/sg.ya : Z
    //   152: aload_3
    //   153: sipush #18429
    //   156: ldc2_w 5433651881770357003
    //   159: lload_1
    //   160: lxor
    //   161: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   166: iconst_1
    //   167: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   172: putstatic me/rerere/matrix/internal/sg.p : Z
    //   175: aload_3
    //   176: sipush #19911
    //   179: ldc2_w 5459011392595237676
    //   182: lload_1
    //   183: lxor
    //   184: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   189: iconst_1
    //   190: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   195: putstatic me/rerere/matrix/internal/sg.r : Z
    //   198: return
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x693D;
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
        throw new RuntimeException("me/rerere/matrix/internal/sg", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/sg'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
import org.bukkit.entity.Player;

public class cg implements Runnable {
  @NotNull
  private final yl l;
  
  private int r;
  
  @NotNull
  private final String x;
  
  @NotNull
  private final yk z;
  
  @NotNull
  private final String k;
  
  @NotNull
  private final mn v;
  
  @NotNull
  private final qd b;
  
  @NotNull
  private final Player i;
  
  private static final long a = o3.a(7975802811022316345L, -9148097057804315078L, MethodHandles.lookup().lookupClass()).a(72939200087255L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public cg(short paramShort, @NotNull Player paramPlayer, @NotNull yk paramyk, int paramInt1, int paramInt2, @NotNull String paramString1, @NotNull String paramString2, char paramChar, @NotNull yl paramyl, @NotNull mn parammn, @NotNull qd paramqd) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload #5
    //   7: i2l
    //   8: bipush #32
    //   10: lshl
    //   11: bipush #16
    //   13: lushr
    //   14: lor
    //   15: iload #8
    //   17: i2l
    //   18: bipush #48
    //   20: lshl
    //   21: bipush #48
    //   23: lushr
    //   24: lor
    //   25: getstatic me/rerere/matrix/internal/cg.a : J
    //   28: lxor
    //   29: lstore #12
    //   31: invokestatic r : ()I
    //   34: istore #14
    //   36: aload_0
    //   37: invokespecial <init> : ()V
    //   40: aload_2
    //   41: ifnonnull -> 66
    //   44: new java/lang/NullPointerException
    //   47: dup
    //   48: sipush #11975
    //   51: ldc2_w 5379803834829971298
    //   54: lload #12
    //   56: lxor
    //   57: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   62: invokespecial <init> : (Ljava/lang/String;)V
    //   65: athrow
    //   66: iload #5
    //   68: iflt -> 101
    //   71: aload_3
    //   72: ifnonnull -> 101
    //   75: new java/lang/NullPointerException
    //   78: dup
    //   79: sipush #17169
    //   82: ldc2_w 4644752039716876974
    //   85: lload #12
    //   87: lxor
    //   88: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   93: invokespecial <init> : (Ljava/lang/String;)V
    //   96: athrow
    //   97: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   100: athrow
    //   101: aload #6
    //   103: iload #5
    //   105: iflt -> 151
    //   108: iload #14
    //   110: ifeq -> 151
    //   113: ifnonnull -> 149
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   122: athrow
    //   123: new java/lang/NullPointerException
    //   126: dup
    //   127: sipush #20323
    //   130: ldc2_w 1193898190150926020
    //   133: lload #12
    //   135: lxor
    //   136: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   141: invokespecial <init> : (Ljava/lang/String;)V
    //   144: athrow
    //   145: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   148: athrow
    //   149: aload #7
    //   151: ifnonnull -> 180
    //   154: new java/lang/NullPointerException
    //   157: dup
    //   158: sipush #2562
    //   161: ldc2_w 5131265055090457524
    //   164: lload #12
    //   166: lxor
    //   167: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   172: invokespecial <init> : (Ljava/lang/String;)V
    //   175: athrow
    //   176: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   179: athrow
    //   180: iload_1
    //   181: iflt -> 215
    //   184: aload #9
    //   186: ifnonnull -> 215
    //   189: new java/lang/NullPointerException
    //   192: dup
    //   193: sipush #16682
    //   196: ldc2_w 2683286550022353048
    //   199: lload #12
    //   201: lxor
    //   202: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   207: invokespecial <init> : (Ljava/lang/String;)V
    //   210: athrow
    //   211: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   214: athrow
    //   215: iload_1
    //   216: iflt -> 250
    //   219: aload #10
    //   221: ifnonnull -> 250
    //   224: new java/lang/NullPointerException
    //   227: dup
    //   228: sipush #20751
    //   231: ldc2_w 1849062892841787569
    //   234: lload #12
    //   236: lxor
    //   237: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   242: invokespecial <init> : (Ljava/lang/String;)V
    //   245: athrow
    //   246: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   249: athrow
    //   250: iload #8
    //   252: iflt -> 332
    //   255: aload #11
    //   257: ifnonnull -> 286
    //   260: new java/lang/NullPointerException
    //   263: dup
    //   264: sipush #10931
    //   267: ldc2_w 4768001797635382030
    //   270: lload #12
    //   272: lxor
    //   273: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   278: invokespecial <init> : (Ljava/lang/String;)V
    //   281: athrow
    //   282: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   285: athrow
    //   286: aload_0
    //   287: aload_2
    //   288: putfield i : Lorg/bukkit/entity/Player;
    //   291: aload_0
    //   292: aload_3
    //   293: putfield z : Lme/rerere/matrix/internal/yk;
    //   296: aload_0
    //   297: iload #4
    //   299: putfield r : I
    //   302: aload_0
    //   303: aload #6
    //   305: putfield k : Ljava/lang/String;
    //   308: aload_0
    //   309: aload #7
    //   311: putfield x : Ljava/lang/String;
    //   314: aload_0
    //   315: aload #9
    //   317: putfield l : Lme/rerere/matrix/internal/yl;
    //   320: aload_0
    //   321: aload #10
    //   323: putfield v : Lme/rerere/matrix/internal/mn;
    //   326: aload_0
    //   327: aload #11
    //   329: putfield b : Lme/rerere/matrix/internal/qd;
    //   332: return
    // Exception table:
    //   from	to	target	type
    //   66	97	97	java/lang/NullPointerException
    //   101	116	119	java/lang/NullPointerException
    //   113	145	145	java/lang/NullPointerException
    //   151	176	176	java/lang/NullPointerException
    //   180	211	211	java/lang/NullPointerException
    //   215	246	246	java/lang/NullPointerException
    //   250	282	282	java/lang/NullPointerException
  }
  
  @NotNull
  public String j() {
    return this.k;
  }
  
  @NotNull
  public yk b() {
    return this.z;
  }
  
  @NotNull
  public String b() {
    return this.x;
  }
  
  @NotNull
  public qd b() {
    return this.b;
  }
  
  public int b() {
    return this.r;
  }
  
  @NotNull
  public mn b() {
    return this.v;
  }
  
  @NotNull
  public Player b() {
    return this.i;
  }
  
  public void run() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/cg.a : J
    //   3: ldc2_w 88054955547810
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 66910208007586
    //   13: lxor
    //   14: dup2
    //   15: bipush #32
    //   17: lushr
    //   18: l2i
    //   19: istore_3
    //   20: dup2
    //   21: bipush #32
    //   23: lshl
    //   24: bipush #48
    //   26: lushr
    //   27: l2i
    //   28: istore #4
    //   30: dup2
    //   31: bipush #48
    //   33: lshl
    //   34: bipush #48
    //   36: lushr
    //   37: l2i
    //   38: istore #5
    //   40: pop2
    //   41: dup2
    //   42: ldc2_w 107870217099692
    //   45: lxor
    //   46: lstore #6
    //   48: dup2
    //   49: ldc2_w 126253348352724
    //   52: lxor
    //   53: lstore #8
    //   55: dup2
    //   56: ldc2_w 124769283680543
    //   59: lxor
    //   60: lstore #10
    //   62: dup2
    //   63: ldc2_w 30239013961247
    //   66: lxor
    //   67: dup2
    //   68: bipush #16
    //   70: lushr
    //   71: lstore #12
    //   73: dup2
    //   74: bipush #48
    //   76: lshl
    //   77: bipush #48
    //   79: lushr
    //   80: l2i
    //   81: istore #14
    //   83: pop2
    //   84: dup2
    //   85: ldc2_w 89992722928129
    //   88: lxor
    //   89: dup2
    //   90: bipush #32
    //   92: lushr
    //   93: l2i
    //   94: istore #15
    //   96: dup2
    //   97: bipush #32
    //   99: lshl
    //   100: bipush #56
    //   102: lushr
    //   103: l2i
    //   104: istore #16
    //   106: dup2
    //   107: bipush #40
    //   109: lshl
    //   110: bipush #40
    //   112: lushr
    //   113: l2i
    //   114: istore #17
    //   116: pop2
    //   117: pop2
    //   118: invokestatic r : ()I
    //   121: istore #18
    //   123: lload #8
    //   125: invokestatic b : (J)V
    //   128: getstatic me/rerere/matrix/internal/ge.y : Z
    //   131: iload #18
    //   133: ifeq -> 164
    //   136: ifeq -> 497
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   145: athrow
    //   146: invokestatic j : ()J
    //   149: getstatic me/rerere/matrix/internal/om.i : J
    //   152: lsub
    //   153: ldc2_w 250
    //   156: lcmp
    //   157: goto -> 164
    //   160: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   163: athrow
    //   164: ifgt -> 497
    //   167: aload_0
    //   168: iload #18
    //   170: ifeq -> 407
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   179: athrow
    //   180: getfield z : Lme/rerere/matrix/internal/yk;
    //   183: getstatic me/rerere/matrix/internal/yk.n : Lme/rerere/matrix/internal/yk;
    //   186: if_acmpeq -> 399
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   195: athrow
    //   196: aload_0
    //   197: iload #18
    //   199: ifeq -> 407
    //   202: goto -> 209
    //   205: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   208: athrow
    //   209: getfield z : Lme/rerere/matrix/internal/yk;
    //   212: getstatic me/rerere/matrix/internal/yk.e : Lme/rerere/matrix/internal/yk;
    //   215: if_acmpeq -> 399
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   224: athrow
    //   225: aload_0
    //   226: iload #18
    //   228: ifeq -> 407
    //   231: goto -> 238
    //   234: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   237: athrow
    //   238: getfield z : Lme/rerere/matrix/internal/yk;
    //   241: getstatic me/rerere/matrix/internal/yk.y : Lme/rerere/matrix/internal/yk;
    //   244: if_acmpeq -> 399
    //   247: goto -> 254
    //   250: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   253: athrow
    //   254: aload_0
    //   255: iload #18
    //   257: ifeq -> 407
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   266: athrow
    //   267: getfield z : Lme/rerere/matrix/internal/yk;
    //   270: getstatic me/rerere/matrix/internal/yk.o : Lme/rerere/matrix/internal/yk;
    //   273: if_acmpeq -> 399
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   282: athrow
    //   283: aload_0
    //   284: iload #18
    //   286: ifeq -> 407
    //   289: goto -> 296
    //   292: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   295: athrow
    //   296: getfield z : Lme/rerere/matrix/internal/yk;
    //   299: getstatic me/rerere/matrix/internal/yk.k : Lme/rerere/matrix/internal/yk;
    //   302: if_acmpeq -> 399
    //   305: goto -> 312
    //   308: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   311: athrow
    //   312: aload_0
    //   313: iload #18
    //   315: ifeq -> 407
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   324: athrow
    //   325: getfield z : Lme/rerere/matrix/internal/yk;
    //   328: getstatic me/rerere/matrix/internal/yk.r : Lme/rerere/matrix/internal/yk;
    //   331: if_acmpeq -> 399
    //   334: goto -> 341
    //   337: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   340: athrow
    //   341: aload_0
    //   342: iload #18
    //   344: ifeq -> 407
    //   347: goto -> 354
    //   350: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   353: athrow
    //   354: getfield z : Lme/rerere/matrix/internal/yk;
    //   357: getstatic me/rerere/matrix/internal/yk.c : Lme/rerere/matrix/internal/yk;
    //   360: if_acmpeq -> 399
    //   363: goto -> 370
    //   366: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   369: athrow
    //   370: aload_0
    //   371: iload #18
    //   373: ifeq -> 407
    //   376: goto -> 383
    //   379: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   382: athrow
    //   383: getfield z : Lme/rerere/matrix/internal/yk;
    //   386: getstatic me/rerere/matrix/internal/yk.z : Lme/rerere/matrix/internal/yk;
    //   389: if_acmpne -> 411
    //   392: goto -> 399
    //   395: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   398: athrow
    //   399: aload_0
    //   400: goto -> 407
    //   403: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   406: athrow
    //   407: iconst_0
    //   408: putfield r : I
    //   411: new java/lang/StringBuilder
    //   414: dup
    //   415: invokespecial <init> : ()V
    //   418: sipush #29017
    //   421: ldc2_w 3420710281243322368
    //   424: lload_1
    //   425: lxor
    //   426: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   431: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: aload_0
    //   435: getfield z : Lme/rerere/matrix/internal/yk;
    //   438: invokevirtual j : ()Ljava/lang/String;
    //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: sipush #25795
    //   447: ldc2_w 389309741243661717
    //   450: lload_1
    //   451: lxor
    //   452: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   457: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   460: aload_0
    //   461: getfield l : Lme/rerere/matrix/internal/yl;
    //   464: invokevirtual b : ()Ljava/lang/String;
    //   467: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: sipush #2067
    //   473: ldc2_w 2508122086514397510
    //   476: lload_1
    //   477: lxor
    //   478: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   483: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: invokevirtual toString : ()Ljava/lang/String;
    //   489: lload #12
    //   491: iload #14
    //   493: i2s
    //   494: invokestatic b : (Ljava/lang/String;JS)V
    //   497: aload_0
    //   498: getfield i : Lorg/bukkit/entity/Player;
    //   501: invokeinterface getName : ()Ljava/lang/String;
    //   506: astore #19
    //   508: aload_0
    //   509: getfield z : Lme/rerere/matrix/internal/yk;
    //   512: invokevirtual j : ()Ljava/lang/String;
    //   515: astore #20
    //   517: aload_0
    //   518: getfield i : Lorg/bukkit/entity/Player;
    //   521: lload #10
    //   523: dup2_x1
    //   524: pop2
    //   525: invokestatic b : (JLorg/bukkit/entity/Player;)I
    //   528: istore #21
    //   530: invokestatic j : ()D
    //   533: iconst_2
    //   534: invokestatic b : (DI)D
    //   537: dstore #22
    //   539: aload_0
    //   540: getfield r : I
    //   543: aload_0
    //   544: getfield b : Lme/rerere/matrix/internal/qd;
    //   547: aload_0
    //   548: getfield z : Lme/rerere/matrix/internal/yk;
    //   551: lload #6
    //   553: dup2_x1
    //   554: pop2
    //   555: invokevirtual b : (JLme/rerere/matrix/internal/yk;)I
    //   558: iadd
    //   559: istore #24
    //   561: aload_0
    //   562: getfield l : Lme/rerere/matrix/internal/yl;
    //   565: getfield x : D
    //   568: d2i
    //   569: istore #25
    //   571: getstatic me/rerere/matrix/internal/gl.x : Ljava/lang/String;
    //   574: sipush #26764
    //   577: ldc2_w 3409097541295763920
    //   580: lload_1
    //   581: lxor
    //   582: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   587: aload #19
    //   589: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   592: sipush #27790
    //   595: ldc2_w 6586641523656881607
    //   598: lload_1
    //   599: lxor
    //   600: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   605: aload #20
    //   607: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   610: sipush #12665
    //   613: ldc2_w 4026170254321920050
    //   616: lload_1
    //   617: lxor
    //   618: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   623: aload_0
    //   624: getfield x : Ljava/lang/String;
    //   627: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   630: sipush #30153
    //   633: ldc2_w 679498151329361044
    //   636: lload_1
    //   637: lxor
    //   638: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   643: aload_0
    //   644: getfield r : I
    //   647: invokestatic valueOf : (I)Ljava/lang/String;
    //   650: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   653: sipush #17385
    //   656: ldc2_w 8052684458899364529
    //   659: lload_1
    //   660: lxor
    //   661: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   666: iload #24
    //   668: invokestatic valueOf : (I)Ljava/lang/String;
    //   671: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   674: sipush #7591
    //   677: ldc2_w 8446987563355374832
    //   680: lload_1
    //   681: lxor
    //   682: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   687: iload #21
    //   689: invokestatic valueOf : (I)Ljava/lang/String;
    //   692: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   695: sipush #18316
    //   698: ldc2_w 3276758923092287190
    //   701: lload_1
    //   702: lxor
    //   703: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   708: dload #22
    //   710: invokestatic valueOf : (D)Ljava/lang/String;
    //   713: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   716: sipush #9350
    //   719: ldc2_w 7951125219331489239
    //   722: lload_1
    //   723: lxor
    //   724: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   729: aload_0
    //   730: getfield k : Ljava/lang/String;
    //   733: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   736: sipush #21689
    //   739: ldc2_w 8927696057868078567
    //   742: lload_1
    //   743: lxor
    //   744: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   749: aload_0
    //   750: getfield l : Lme/rerere/matrix/internal/yl;
    //   753: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   756: invokevirtual b : ()Ljava/lang/String;
    //   759: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   762: sipush #8024
    //   765: ldc2_w 1637662333154035212
    //   768: lload_1
    //   769: lxor
    //   770: <illegal opcode> m : (IJ)Ljava/lang/String;
    //   775: iload #25
    //   777: invokestatic valueOf : (I)Ljava/lang/String;
    //   780: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   783: astore #26
    //   785: invokestatic j : ()Z
    //   788: ifeq -> 803
    //   791: aload #26
    //   793: invokestatic b : (Ljava/lang/String;)V
    //   796: goto -> 803
    //   799: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   802: athrow
    //   803: aload_0
    //   804: getfield v : Lme/rerere/matrix/internal/mn;
    //   807: invokevirtual b : ()Ljava/util/Map;
    //   810: invokeinterface values : ()Ljava/util/Collection;
    //   815: invokeinterface iterator : ()Ljava/util/Iterator;
    //   820: astore #27
    //   822: aload #27
    //   824: invokeinterface hasNext : ()Z
    //   829: ifeq -> 1012
    //   832: aload #27
    //   834: invokeinterface next : ()Ljava/lang/Object;
    //   839: checkcast me/rerere/matrix/internal/yl
    //   842: astore #28
    //   844: aload #28
    //   846: iload #18
    //   848: ifeq -> 878
    //   851: invokevirtual b : ()Z
    //   854: iload #18
    //   856: ifeq -> 1015
    //   859: goto -> 866
    //   862: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   865: athrow
    //   866: ifeq -> 1007
    //   869: goto -> 876
    //   872: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   875: athrow
    //   876: aload #28
    //   878: iload #18
    //   880: ifeq -> 971
    //   883: invokevirtual j : ()Ljava/util/UUID;
    //   886: ifnull -> 962
    //   889: goto -> 896
    //   892: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   895: athrow
    //   896: aload #28
    //   898: invokevirtual j : ()Ljava/util/UUID;
    //   901: iload #18
    //   903: ifeq -> 951
    //   906: goto -> 913
    //   909: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   912: athrow
    //   913: ifnull -> 1007
    //   916: goto -> 923
    //   919: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   922: athrow
    //   923: aload_0
    //   924: getfield i : Lorg/bukkit/entity/Player;
    //   927: iload #18
    //   929: ifeq -> 981
    //   932: goto -> 939
    //   935: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   938: athrow
    //   939: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   944: goto -> 951
    //   947: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   950: athrow
    //   951: aload #28
    //   953: invokevirtual j : ()Ljava/util/UUID;
    //   956: invokevirtual equals : (Ljava/lang/Object;)Z
    //   959: ifeq -> 1007
    //   962: aload #28
    //   964: goto -> 971
    //   967: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   970: athrow
    //   971: iload #15
    //   973: iload #16
    //   975: i2b
    //   976: iload #17
    //   978: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   981: new java/lang/StringBuilder
    //   984: dup
    //   985: invokespecial <init> : ()V
    //   988: getstatic me/rerere/matrix/internal/gl.r : Ljava/lang/String;
    //   991: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   994: aload #26
    //   996: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   999: invokevirtual toString : ()Ljava/lang/String;
    //   1002: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   1007: iload #18
    //   1009: ifne -> 822
    //   1012: getstatic me/rerere/matrix/internal/ge.s : Z
    //   1015: ifeq -> 1041
    //   1018: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   1021: invokevirtual b : ()Lme/rerere/matrix/internal/rb;
    //   1024: aload #26
    //   1026: <illegal opcode> run : (Ljava/lang/String;)Ljava/lang/Runnable;
    //   1031: invokevirtual b : (Ljava/lang/Runnable;)V
    //   1034: goto -> 1041
    //   1037: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   1040: athrow
    //   1041: aload_0
    //   1042: getfield b : Lme/rerere/matrix/internal/qd;
    //   1045: aload_0
    //   1046: getfield l : Lme/rerere/matrix/internal/yl;
    //   1049: aload_0
    //   1050: getfield z : Lme/rerere/matrix/internal/yk;
    //   1053: iload_3
    //   1054: swap
    //   1055: aload_0
    //   1056: getfield r : I
    //   1059: aload_0
    //   1060: getfield k : Ljava/lang/String;
    //   1063: aload_0
    //   1064: getfield x : Ljava/lang/String;
    //   1067: iload #4
    //   1069: iload #5
    //   1071: i2c
    //   1072: invokevirtual b : (Lme/rerere/matrix/internal/yl;ILme/rerere/matrix/internal/yk;ILjava/lang/String;Ljava/lang/String;IC)V
    //   1075: return
    // Exception table:
    //   from	to	target	type
    //   123	139	142	java/lang/NullPointerException
    //   136	157	160	java/lang/NullPointerException
    //   164	173	176	java/lang/NullPointerException
    //   167	189	192	java/lang/NullPointerException
    //   180	202	205	java/lang/NullPointerException
    //   196	218	221	java/lang/NullPointerException
    //   209	231	234	java/lang/NullPointerException
    //   225	247	250	java/lang/NullPointerException
    //   238	260	263	java/lang/NullPointerException
    //   254	276	279	java/lang/NullPointerException
    //   267	289	292	java/lang/NullPointerException
    //   283	305	308	java/lang/NullPointerException
    //   296	318	321	java/lang/NullPointerException
    //   312	334	337	java/lang/NullPointerException
    //   325	347	350	java/lang/NullPointerException
    //   341	363	366	java/lang/NullPointerException
    //   354	376	379	java/lang/NullPointerException
    //   370	392	395	java/lang/NullPointerException
    //   383	400	403	java/lang/NullPointerException
    //   785	796	799	java/lang/NullPointerException
    //   844	859	862	java/lang/NullPointerException
    //   851	869	872	java/lang/NullPointerException
    //   878	889	892	java/lang/NullPointerException
    //   883	906	909	java/lang/NullPointerException
    //   896	916	919	java/lang/NullPointerException
    //   913	932	935	java/lang/NullPointerException
    //   923	944	947	java/lang/NullPointerException
    //   951	964	967	java/lang/NullPointerException
    //   1015	1034	1037	java/lang/NullPointerException
  }
  
  @NotNull
  public yl b() {
    return this.l;
  }
  
  static {
    long l = a ^ 0x154CE6A90D35L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[20];
    boolean bool = false;
    String str;
    int i = (str = "ýY®ÁDäñ´n±´¯/(-ö#Íã©<®¶ûG\033tw&î\024äÉfº¶n\017;²\005\031Á!Ñbóem[\020olEà;{\030ËÕÈ\n\"1q@ÌL\033À@\030Â\001y\025¤¹[\017\002VÞkg7G\0023RL'-§éØÄÌX$im¸äb\007^ÉpÍ\003Õ\002wxâ\032X1\022 \r\bdc/0\0136Ùaà·»ÂQtk¹u\"Ö\027x\020\020\b4\0300Ä\030t¢Â¤TÁI\007Só}äg\nõí?Óèý\030Îdu&iåiÙË\036¡¼,XÜÕ\020\r¦/ëPôñòK!áK½'_DããS0/tû6¼vk\031é5yÏÒ\004M-]o\037,»Î\007`\002¿V¦P\003«?[1±\t«êgÅ\033\006%êÿ\030´]ä\b\bñ\036'HÇ²\026¨a¿ñeÏ©ò@X\020fÄq\020ª§G¸V\027OCå»Ýwj@v5÷\032Qí\024môÈ\027úªp§{XK\\bÕª,)±ñÄ/9©Åø±äÍ\r$ \036\0306F5f/]Kú¡P\005S>¤oR¦S¯ßRi¦\002\tÎ\0255P\037ûPïdðJZDîYÛ\027þë¦[A\030Ô÷\032ë}$ºÕ\035\030sz¸º>èÀ©fÑ¯\0246¹èj\031½'s·õs$zÅÍlpåß#¶:E¢ÆÌ\005)0\023AY_\\Xa\034Øøoð0ö\034¬1ÎM]ûÒÞ ¦×ÐÆ&PIð@<\035l¡á\035$½ÚE\022\002\\!\037'#\0266\036\006Y¹3µW\003\025j\t1%9\023\030rÿ\034trEcÙ¸\024A×?û\020Lò\020\031»ãÿw=\b,ÍNü)Â0e\tX\000#yAð¦5¦´aûö3ç§\nñO¿,,»P>¬V$²m\024\f¯\"\002sÆ\tÍWSî(àèêTjÐªN4\016\033Ã\b-ÓsX\024\022´WÞR>\000A=ini_³Ü¯º[\020Ú¨O]e)\\\000Û\007C4o@hä§@*UQöv±Ä0í\017%AFs\b³çéJâÊ\032G)~¸à<6û[>¸z\020ôÇõ8ÖÒJ\006\b\006ó}E\023µD$Æµ\020ñ`#NBª~B½¯L\0260Ç\\").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x418C;
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
        throw new RuntimeException("me/rerere/matrix/internal/cg", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/cg'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\cg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class ab {
  private boolean m;
  
  private boolean o;
  
  private World q;
  
  private double t;
  
  private boolean g;
  
  private boolean a;
  
  private boolean s;
  
  private float u;
  
  private boolean w;
  
  private double f;
  
  private double l;
  
  private double r;
  
  private Set x;
  
  private double z;
  
  private Vector k;
  
  @NotNull
  private final Player v;
  
  private Vector b;
  
  @NotNull
  private final Set i;
  
  private static int c;
  
  private static final long d = o3.a(-203652410962500357L, -3450742460559530821L, MethodHandles.lookup().lookupClass()).a(75747492141752L);
  
  private static final String[] e;
  
  private static final String[] h;
  
  private static final Map j = new HashMap<>(13);
  
  public Set j() {
    return this.x;
  }
  
  public Vector j() {
    return this.k;
  }
  
  public double h() {
    return this.t;
  }
  
  @NotNull
  public static ab b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, boolean paramBoolean1, boolean paramBoolean2, long paramLong, boolean paramBoolean3, float paramFloat, boolean paramBoolean4, boolean paramBoolean5, @NotNull Set paramSet) {
    paramLong = d ^ paramLong;
    long l = (paramLong ^ 0x2F20437A3DEBL) >>> 16L;
    int i = (int)((paramLong ^ 0x2F20437A3DEBL) << 48L >>> 48L);
    paramLong ^ 0x2F20437A3DEBL;
    return new ab(paramPlayerMoveEvent.getPlayer(), paramPlayerMoveEvent.getFrom().getWorld(), paramPlayerMoveEvent.getFrom().toVector(), paramPlayerMoveEvent.getTo().toVector(), l, paramPlayerMoveEvent.getTo().getY() - paramPlayerMoveEvent.getFrom().getY(), zb.b(paramPlayerMoveEvent.getFrom(), paramPlayerMoveEvent.getTo()), paramBoolean1, paramBoolean2, (short)i, paramBoolean3, false, Sets.newLinkedHashSet(), 0.0D, paramFloat, 0.0D, 0.0D, paramBoolean4, paramBoolean5, paramSet);
  }
  
  public void m(double paramDouble) {
    this.t = paramDouble;
  }
  
  public double m() {
    return this.l;
  }
  
  public void p(double paramDouble) {
    this.z = paramDouble;
  }
  
  public ab(@NotNull Player paramPlayer, World paramWorld, Vector paramVector1, Vector paramVector2, long paramLong, double paramDouble1, double paramDouble2, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, boolean paramBoolean4, Set paramSet1, double paramDouble3, float paramFloat, double paramDouble4, double paramDouble5, boolean paramBoolean5, boolean paramBoolean6, @NotNull Set paramSet2) {
    // Byte code:
    //   0: lload #5
    //   2: bipush #16
    //   4: lshl
    //   5: iload #13
    //   7: i2l
    //   8: bipush #48
    //   10: lshl
    //   11: bipush #48
    //   13: lushr
    //   14: lor
    //   15: getstatic me/rerere/matrix/internal/ab.d : J
    //   18: lxor
    //   19: lstore #27
    //   21: aload_0
    //   22: invokespecial <init> : ()V
    //   25: aload_1
    //   26: ifnonnull -> 51
    //   29: new java/lang/NullPointerException
    //   32: dup
    //   33: sipush #7400
    //   36: ldc2_w 3867898340568193653
    //   39: lload #27
    //   41: lxor
    //   42: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   47: invokespecial <init> : (Ljava/lang/String;)V
    //   50: athrow
    //   51: iload #13
    //   53: ifge -> 192
    //   56: aload #26
    //   58: ifnonnull -> 87
    //   61: new java/lang/NullPointerException
    //   64: dup
    //   65: sipush #5041
    //   68: ldc2_w 350041175161558307
    //   71: lload #27
    //   73: lxor
    //   74: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   79: invokespecial <init> : (Ljava/lang/String;)V
    //   82: athrow
    //   83: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   86: athrow
    //   87: aload_0
    //   88: aload_1
    //   89: putfield v : Lorg/bukkit/entity/Player;
    //   92: aload_0
    //   93: aload_2
    //   94: putfield q : Lorg/bukkit/World;
    //   97: aload_0
    //   98: aload_3
    //   99: putfield b : Lorg/bukkit/util/Vector;
    //   102: aload_0
    //   103: aload #4
    //   105: putfield k : Lorg/bukkit/util/Vector;
    //   108: aload_0
    //   109: dload #7
    //   111: putfield f : D
    //   114: aload_0
    //   115: dload #9
    //   117: putfield l : D
    //   120: aload_0
    //   121: iload #11
    //   123: putfield a : Z
    //   126: aload_0
    //   127: iload #12
    //   129: putfield g : Z
    //   132: aload_0
    //   133: iload #14
    //   135: putfield w : Z
    //   138: aload_0
    //   139: iload #15
    //   141: putfield o : Z
    //   144: aload_0
    //   145: aload #16
    //   147: putfield x : Ljava/util/Set;
    //   150: aload_0
    //   151: dload #17
    //   153: putfield r : D
    //   156: aload_0
    //   157: fload #19
    //   159: putfield u : F
    //   162: aload_0
    //   163: dload #20
    //   165: putfield z : D
    //   168: aload_0
    //   169: dload #22
    //   171: putfield t : D
    //   174: aload_0
    //   175: iload #24
    //   177: putfield m : Z
    //   180: aload_0
    //   181: iload #25
    //   183: putfield s : Z
    //   186: aload_0
    //   187: aload #26
    //   189: putfield i : Ljava/util/Set;
    //   192: return
    // Exception table:
    //   from	to	target	type
    //   51	83	83	java/lang/NullPointerException
  }
  
  public boolean t() {
    return this.w;
  }
  
  public boolean h() {
    return this.o;
  }
  
  public double p() {
    return this.r;
  }
  
  public boolean m() {
    return this.a;
  }
  
  public void b(Vector paramVector) {
    this.k = paramVector;
  }
  
  public double j() {
    return this.f;
  }
  
  public void b(float paramFloat) {
    this.u = paramFloat;
  }
  
  @NotNull
  public Block j() {
    return this.q.getBlockAt(this.b.getBlockX(), this.b.getBlockY(), this.b.getBlockZ());
  }
  
  public boolean p() {
    return this.g;
  }
  
  public World b() {
    return this.q;
  }
  
  @NotNull
  public Block b() {
    return this.q.getBlockAt(this.k.getBlockX(), this.k.getBlockY(), this.k.getBlockZ());
  }
  
  @NotNull
  public Set b() {
    return this.i;
  }
  
  @NotNull
  public Player b() {
    return this.v;
  }
  
  public void j(double paramDouble) {
    this.f = paramDouble;
  }
  
  public float b() {
    return this.u;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ab.d : J
    //   3: ldc2_w 33170204496390
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifne -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifne -> 62
    //   42: instanceof me/rerere/matrix/internal/ab
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/ab
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifne -> 106
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   93: athrow
    //   94: aload_0
    //   95: invokevirtual j : ()D
    //   98: aload #5
    //   100: invokevirtual j : ()D
    //   103: invokestatic compare : (DD)I
    //   106: iload #4
    //   108: ifne -> 139
    //   111: ifeq -> 127
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   120: athrow
    //   121: iconst_0
    //   122: ireturn
    //   123: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   126: athrow
    //   127: aload_0
    //   128: invokevirtual m : ()D
    //   131: aload #5
    //   133: invokevirtual m : ()D
    //   136: invokestatic compare : (DD)I
    //   139: iload #4
    //   141: ifne -> 164
    //   144: ifeq -> 160
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   153: athrow
    //   154: iconst_0
    //   155: ireturn
    //   156: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   159: athrow
    //   160: aload_0
    //   161: invokevirtual m : ()Z
    //   164: aload #5
    //   166: invokevirtual m : ()Z
    //   169: iload #4
    //   171: ifne -> 199
    //   174: if_icmpeq -> 190
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   183: athrow
    //   184: iconst_0
    //   185: ireturn
    //   186: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   189: athrow
    //   190: aload_0
    //   191: invokevirtual p : ()Z
    //   194: aload #5
    //   196: invokevirtual p : ()Z
    //   199: iload #4
    //   201: ifne -> 229
    //   204: if_icmpeq -> 220
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   213: athrow
    //   214: iconst_0
    //   215: ireturn
    //   216: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   219: athrow
    //   220: aload_0
    //   221: invokevirtual t : ()Z
    //   224: aload #5
    //   226: invokevirtual t : ()Z
    //   229: iload #4
    //   231: ifne -> 271
    //   234: if_icmpeq -> 250
    //   237: goto -> 244
    //   240: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   243: athrow
    //   244: iconst_0
    //   245: ireturn
    //   246: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   249: athrow
    //   250: aload_0
    //   251: invokevirtual h : ()Z
    //   254: iload #4
    //   256: ifne -> 292
    //   259: aload #5
    //   261: invokevirtual h : ()Z
    //   264: goto -> 271
    //   267: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   270: athrow
    //   271: if_icmpeq -> 280
    //   274: iconst_0
    //   275: ireturn
    //   276: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   279: athrow
    //   280: aload_0
    //   281: invokevirtual p : ()D
    //   284: aload #5
    //   286: invokevirtual p : ()D
    //   289: invokestatic compare : (DD)I
    //   292: iload #4
    //   294: ifne -> 325
    //   297: ifeq -> 313
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   306: athrow
    //   307: iconst_0
    //   308: ireturn
    //   309: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   312: athrow
    //   313: aload_0
    //   314: invokevirtual b : ()F
    //   317: aload #5
    //   319: invokevirtual b : ()F
    //   322: invokestatic compare : (FF)I
    //   325: iload #4
    //   327: ifne -> 358
    //   330: ifeq -> 346
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   339: athrow
    //   340: iconst_0
    //   341: ireturn
    //   342: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   345: athrow
    //   346: aload_0
    //   347: invokevirtual b : ()D
    //   350: aload #5
    //   352: invokevirtual b : ()D
    //   355: invokestatic compare : (DD)I
    //   358: iload #4
    //   360: ifne -> 391
    //   363: ifeq -> 379
    //   366: goto -> 373
    //   369: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   372: athrow
    //   373: iconst_0
    //   374: ireturn
    //   375: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   378: athrow
    //   379: aload_0
    //   380: invokevirtual h : ()D
    //   383: aload #5
    //   385: invokevirtual h : ()D
    //   388: invokestatic compare : (DD)I
    //   391: iload #4
    //   393: ifne -> 416
    //   396: ifeq -> 412
    //   399: goto -> 406
    //   402: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   405: athrow
    //   406: iconst_0
    //   407: ireturn
    //   408: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   411: athrow
    //   412: aload_0
    //   413: invokevirtual b : ()Z
    //   416: aload #5
    //   418: invokevirtual b : ()Z
    //   421: iload #4
    //   423: ifne -> 463
    //   426: if_icmpeq -> 442
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   435: athrow
    //   436: iconst_0
    //   437: ireturn
    //   438: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   441: athrow
    //   442: aload_0
    //   443: iload #4
    //   445: ifne -> 473
    //   448: invokevirtual j : ()Z
    //   451: aload #5
    //   453: invokevirtual j : ()Z
    //   456: goto -> 463
    //   459: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   462: athrow
    //   463: if_icmpeq -> 472
    //   466: iconst_0
    //   467: ireturn
    //   468: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   471: athrow
    //   472: aload_0
    //   473: invokevirtual b : ()Lorg/bukkit/entity/Player;
    //   476: astore #6
    //   478: aload #5
    //   480: invokevirtual b : ()Lorg/bukkit/entity/Player;
    //   483: astore #7
    //   485: aload #6
    //   487: iload #4
    //   489: ifne -> 523
    //   492: ifnonnull -> 521
    //   495: goto -> 502
    //   498: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   501: athrow
    //   502: aload #7
    //   504: ifnull -> 545
    //   507: goto -> 514
    //   510: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   513: athrow
    //   514: goto -> 543
    //   517: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   520: athrow
    //   521: aload #6
    //   523: aload #7
    //   525: invokevirtual equals : (Ljava/lang/Object;)Z
    //   528: iload #4
    //   530: ifne -> 544
    //   533: ifne -> 545
    //   536: goto -> 543
    //   539: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   542: athrow
    //   543: iconst_0
    //   544: ireturn
    //   545: aload_0
    //   546: invokevirtual b : ()Lorg/bukkit/World;
    //   549: astore #8
    //   551: aload #5
    //   553: invokevirtual b : ()Lorg/bukkit/World;
    //   556: astore #9
    //   558: aload #8
    //   560: iload #4
    //   562: ifne -> 596
    //   565: ifnonnull -> 594
    //   568: goto -> 575
    //   571: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   574: athrow
    //   575: aload #9
    //   577: ifnull -> 618
    //   580: goto -> 587
    //   583: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   586: athrow
    //   587: goto -> 616
    //   590: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   593: athrow
    //   594: aload #8
    //   596: aload #9
    //   598: invokevirtual equals : (Ljava/lang/Object;)Z
    //   601: iload #4
    //   603: ifne -> 617
    //   606: ifne -> 618
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   615: athrow
    //   616: iconst_0
    //   617: ireturn
    //   618: aload_0
    //   619: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   622: astore #10
    //   624: aload #5
    //   626: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   629: astore #11
    //   631: aload #10
    //   633: iload #4
    //   635: ifne -> 677
    //   638: ifnonnull -> 675
    //   641: goto -> 648
    //   644: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   647: athrow
    //   648: aload #11
    //   650: iload #4
    //   652: ifne -> 707
    //   655: goto -> 662
    //   658: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   661: athrow
    //   662: ifnull -> 703
    //   665: goto -> 672
    //   668: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   671: athrow
    //   672: goto -> 697
    //   675: aload #10
    //   677: iload #4
    //   679: ifne -> 707
    //   682: aload #11
    //   684: invokevirtual equals : (Ljava/lang/Object;)Z
    //   687: ifne -> 703
    //   690: goto -> 697
    //   693: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   696: athrow
    //   697: iconst_0
    //   698: ireturn
    //   699: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   702: athrow
    //   703: aload_0
    //   704: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   707: astore #12
    //   709: aload #5
    //   711: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   714: astore #13
    //   716: aload #12
    //   718: iload #4
    //   720: ifne -> 754
    //   723: ifnonnull -> 752
    //   726: goto -> 733
    //   729: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   732: athrow
    //   733: aload #13
    //   735: ifnull -> 776
    //   738: goto -> 745
    //   741: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   744: athrow
    //   745: goto -> 774
    //   748: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   751: athrow
    //   752: aload #12
    //   754: aload #13
    //   756: invokevirtual equals : (Ljava/lang/Object;)Z
    //   759: iload #4
    //   761: ifne -> 775
    //   764: ifne -> 776
    //   767: goto -> 774
    //   770: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   773: athrow
    //   774: iconst_0
    //   775: ireturn
    //   776: aload_0
    //   777: invokevirtual j : ()Ljava/util/Set;
    //   780: astore #14
    //   782: aload #5
    //   784: invokevirtual j : ()Ljava/util/Set;
    //   787: astore #15
    //   789: aload #14
    //   791: iload #4
    //   793: ifne -> 835
    //   796: ifnonnull -> 833
    //   799: goto -> 806
    //   802: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   805: athrow
    //   806: aload #15
    //   808: iload #4
    //   810: ifne -> 865
    //   813: goto -> 820
    //   816: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   819: athrow
    //   820: ifnull -> 861
    //   823: goto -> 830
    //   826: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   829: athrow
    //   830: goto -> 855
    //   833: aload #14
    //   835: iload #4
    //   837: ifne -> 865
    //   840: aload #15
    //   842: invokevirtual equals : (Ljava/lang/Object;)Z
    //   845: ifne -> 861
    //   848: goto -> 855
    //   851: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   854: athrow
    //   855: iconst_0
    //   856: ireturn
    //   857: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   860: athrow
    //   861: aload_0
    //   862: invokevirtual b : ()Ljava/util/Set;
    //   865: astore #16
    //   867: aload #5
    //   869: invokevirtual b : ()Ljava/util/Set;
    //   872: astore #17
    //   874: aload #16
    //   876: iload #4
    //   878: ifne -> 912
    //   881: ifnonnull -> 910
    //   884: goto -> 891
    //   887: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   890: athrow
    //   891: aload #17
    //   893: ifnull -> 938
    //   896: goto -> 903
    //   899: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   902: athrow
    //   903: goto -> 932
    //   906: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   909: athrow
    //   910: aload #16
    //   912: aload #17
    //   914: invokevirtual equals : (Ljava/lang/Object;)Z
    //   917: iload #4
    //   919: ifne -> 939
    //   922: ifne -> 938
    //   925: goto -> 932
    //   928: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   931: athrow
    //   932: iconst_0
    //   933: ireturn
    //   934: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   937: athrow
    //   938: iconst_1
    //   939: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/NullPointerException
    //   19	32	32	java/lang/NullPointerException
    //   37	48	51	java/lang/NullPointerException
    //   42	57	57	java/lang/NullPointerException
    //   67	81	84	java/lang/NullPointerException
    //   78	90	90	java/lang/NullPointerException
    //   106	114	117	java/lang/NullPointerException
    //   111	123	123	java/lang/NullPointerException
    //   139	147	150	java/lang/NullPointerException
    //   144	156	156	java/lang/NullPointerException
    //   164	177	180	java/lang/NullPointerException
    //   174	186	186	java/lang/NullPointerException
    //   199	207	210	java/lang/NullPointerException
    //   204	216	216	java/lang/NullPointerException
    //   229	237	240	java/lang/NullPointerException
    //   234	246	246	java/lang/NullPointerException
    //   250	264	267	java/lang/NullPointerException
    //   271	276	276	java/lang/NullPointerException
    //   292	300	303	java/lang/NullPointerException
    //   297	309	309	java/lang/NullPointerException
    //   325	333	336	java/lang/NullPointerException
    //   330	342	342	java/lang/NullPointerException
    //   358	366	369	java/lang/NullPointerException
    //   363	375	375	java/lang/NullPointerException
    //   391	399	402	java/lang/NullPointerException
    //   396	408	408	java/lang/NullPointerException
    //   416	429	432	java/lang/NullPointerException
    //   426	438	438	java/lang/NullPointerException
    //   442	456	459	java/lang/NullPointerException
    //   463	468	468	java/lang/NullPointerException
    //   485	495	498	java/lang/NullPointerException
    //   492	507	510	java/lang/NullPointerException
    //   502	517	517	java/lang/NullPointerException
    //   523	536	539	java/lang/NullPointerException
    //   558	568	571	java/lang/NullPointerException
    //   565	580	583	java/lang/NullPointerException
    //   575	590	590	java/lang/NullPointerException
    //   596	609	612	java/lang/NullPointerException
    //   631	641	644	java/lang/NullPointerException
    //   638	655	658	java/lang/NullPointerException
    //   648	665	668	java/lang/NullPointerException
    //   677	690	693	java/lang/NullPointerException
    //   682	699	699	java/lang/NullPointerException
    //   716	726	729	java/lang/NullPointerException
    //   723	738	741	java/lang/NullPointerException
    //   733	748	748	java/lang/NullPointerException
    //   754	767	770	java/lang/NullPointerException
    //   789	799	802	java/lang/NullPointerException
    //   796	813	816	java/lang/NullPointerException
    //   806	823	826	java/lang/NullPointerException
    //   835	848	851	java/lang/NullPointerException
    //   840	857	857	java/lang/NullPointerException
    //   874	884	887	java/lang/NullPointerException
    //   881	896	899	java/lang/NullPointerException
    //   891	906	906	java/lang/NullPointerException
    //   912	925	928	java/lang/NullPointerException
    //   922	934	934	java/lang/NullPointerException
  }
  
  public String toString() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ab.d : J
    //   3: ldc2_w 89460930030634
    //   6: lxor
    //   7: lstore_1
    //   8: new java/lang/StringBuilder
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: sipush #26024
    //   18: ldc2_w 5903290704577151257
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_0
    //   32: invokevirtual b : ()Lorg/bukkit/entity/Player;
    //   35: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   38: sipush #9827
    //   41: ldc2_w 3773226298232898241
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: aload_0
    //   55: invokevirtual b : ()Lorg/bukkit/World;
    //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: sipush #30992
    //   64: ldc2_w 7957548791664041389
    //   67: lload_1
    //   68: lxor
    //   69: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: aload_0
    //   78: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   81: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   84: sipush #7744
    //   87: ldc2_w 2231626122515036899
    //   90: lload_1
    //   91: lxor
    //   92: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   104: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   107: sipush #27387
    //   110: ldc2_w 7763326405102325316
    //   113: lload_1
    //   114: lxor
    //   115: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: aload_0
    //   124: invokevirtual j : ()D
    //   127: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   130: sipush #12866
    //   133: ldc2_w 3155464152423503612
    //   136: lload_1
    //   137: lxor
    //   138: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: aload_0
    //   147: invokevirtual m : ()D
    //   150: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   153: sipush #4934
    //   156: ldc2_w 6208228324409718759
    //   159: lload_1
    //   160: lxor
    //   161: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: aload_0
    //   170: invokevirtual m : ()Z
    //   173: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   176: sipush #7061
    //   179: ldc2_w 666645088372965157
    //   182: lload_1
    //   183: lxor
    //   184: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: aload_0
    //   193: invokevirtual p : ()Z
    //   196: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   199: sipush #8734
    //   202: ldc2_w 7450511684146202282
    //   205: lload_1
    //   206: lxor
    //   207: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: aload_0
    //   216: invokevirtual t : ()Z
    //   219: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   222: sipush #24032
    //   225: ldc2_w 4405355147982633305
    //   228: lload_1
    //   229: lxor
    //   230: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload_0
    //   239: invokevirtual h : ()Z
    //   242: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   245: sipush #4770
    //   248: ldc2_w 4481661748396930580
    //   251: lload_1
    //   252: lxor
    //   253: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: aload_0
    //   262: invokevirtual j : ()Ljava/util/Set;
    //   265: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   268: sipush #22525
    //   271: ldc2_w 7690423026422215503
    //   274: lload_1
    //   275: lxor
    //   276: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   281: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: aload_0
    //   285: invokevirtual p : ()D
    //   288: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   291: sipush #22839
    //   294: ldc2_w 1840975891068288396
    //   297: lload_1
    //   298: lxor
    //   299: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: aload_0
    //   308: invokevirtual b : ()F
    //   311: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   314: sipush #21431
    //   317: ldc2_w 1651298309446596375
    //   320: lload_1
    //   321: lxor
    //   322: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   327: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: aload_0
    //   331: invokevirtual b : ()D
    //   334: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   337: sipush #8381
    //   340: ldc2_w 304550541977256970
    //   343: lload_1
    //   344: lxor
    //   345: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: aload_0
    //   354: invokevirtual h : ()D
    //   357: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   360: sipush #32534
    //   363: ldc2_w 6222662951829134254
    //   366: lload_1
    //   367: lxor
    //   368: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   373: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: aload_0
    //   377: invokevirtual b : ()Z
    //   380: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   383: sipush #6434
    //   386: ldc2_w 6866841317758516625
    //   389: lload_1
    //   390: lxor
    //   391: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: aload_0
    //   400: invokevirtual j : ()Z
    //   403: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   406: sipush #29136
    //   409: ldc2_w 3703525665869059436
    //   412: lload_1
    //   413: lxor
    //   414: <illegal opcode> w : (IJ)Ljava/lang/String;
    //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: aload_0
    //   423: invokevirtual b : ()Ljava/util/Set;
    //   426: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   429: ldc_w ')'
    //   432: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: invokevirtual toString : ()Ljava/lang/String;
    //   438: areturn
  }
  
  public boolean j() {
    return this.s;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof ab;
  }
  
  public Vector b() {
    return this.b;
  }
  
  public void b(double paramDouble) {
    this.r = paramDouble;
  }
  
  public double b() {
    return this.z;
  }
  
  public void p(boolean paramBoolean) {
    this.w = paramBoolean;
  }
  
  public void b(Set paramSet) {
    this.x = paramSet;
  }
  
  public int hashCode() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ab.d : J
    //   3: ldc2_w 61726189413125
    //   6: lxor
    //   7: lstore_1
    //   8: bipush #59
    //   10: istore #4
    //   12: invokestatic a : ()I
    //   15: iconst_1
    //   16: istore #5
    //   18: istore_3
    //   19: aload_0
    //   20: invokevirtual j : ()D
    //   23: invokestatic doubleToLongBits : (D)J
    //   26: lstore #6
    //   28: iload #5
    //   30: bipush #59
    //   32: imul
    //   33: lload #6
    //   35: bipush #32
    //   37: lushr
    //   38: lload #6
    //   40: lxor
    //   41: l2i
    //   42: iadd
    //   43: istore #5
    //   45: aload_0
    //   46: invokevirtual m : ()D
    //   49: invokestatic doubleToLongBits : (D)J
    //   52: lstore #8
    //   54: iload #5
    //   56: bipush #59
    //   58: imul
    //   59: lload #8
    //   61: bipush #32
    //   63: lushr
    //   64: lload #8
    //   66: lxor
    //   67: l2i
    //   68: iadd
    //   69: istore #5
    //   71: iload #5
    //   73: bipush #59
    //   75: imul
    //   76: aload_0
    //   77: invokevirtual m : ()Z
    //   80: iload_3
    //   81: ifne -> 96
    //   84: ifeq -> 99
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   93: athrow
    //   94: bipush #79
    //   96: goto -> 101
    //   99: bipush #97
    //   101: iadd
    //   102: istore #5
    //   104: iload #5
    //   106: bipush #59
    //   108: imul
    //   109: aload_0
    //   110: invokevirtual p : ()Z
    //   113: iload_3
    //   114: ifne -> 129
    //   117: ifeq -> 132
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   126: athrow
    //   127: bipush #79
    //   129: goto -> 134
    //   132: bipush #97
    //   134: iadd
    //   135: istore #5
    //   137: iload #5
    //   139: bipush #59
    //   141: imul
    //   142: aload_0
    //   143: invokevirtual t : ()Z
    //   146: iload_3
    //   147: ifne -> 162
    //   150: ifeq -> 165
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   159: athrow
    //   160: bipush #79
    //   162: goto -> 167
    //   165: bipush #97
    //   167: iadd
    //   168: istore #5
    //   170: iload #5
    //   172: bipush #59
    //   174: imul
    //   175: aload_0
    //   176: invokevirtual h : ()Z
    //   179: iload_3
    //   180: ifne -> 195
    //   183: ifeq -> 198
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   192: athrow
    //   193: bipush #79
    //   195: goto -> 200
    //   198: bipush #97
    //   200: iadd
    //   201: istore #5
    //   203: aload_0
    //   204: invokevirtual p : ()D
    //   207: invokestatic doubleToLongBits : (D)J
    //   210: lstore #10
    //   212: iload #5
    //   214: bipush #59
    //   216: imul
    //   217: lload #10
    //   219: bipush #32
    //   221: lushr
    //   222: lload #10
    //   224: lxor
    //   225: l2i
    //   226: iadd
    //   227: istore #5
    //   229: iload #5
    //   231: bipush #59
    //   233: imul
    //   234: aload_0
    //   235: invokevirtual b : ()F
    //   238: invokestatic floatToIntBits : (F)I
    //   241: iadd
    //   242: istore #5
    //   244: aload_0
    //   245: invokevirtual b : ()D
    //   248: invokestatic doubleToLongBits : (D)J
    //   251: lstore #12
    //   253: iload #5
    //   255: bipush #59
    //   257: imul
    //   258: lload #12
    //   260: bipush #32
    //   262: lushr
    //   263: lload #12
    //   265: lxor
    //   266: l2i
    //   267: iadd
    //   268: istore #5
    //   270: aload_0
    //   271: invokevirtual h : ()D
    //   274: invokestatic doubleToLongBits : (D)J
    //   277: lstore #14
    //   279: iload #5
    //   281: bipush #59
    //   283: imul
    //   284: lload #14
    //   286: bipush #32
    //   288: lushr
    //   289: lload #14
    //   291: lxor
    //   292: l2i
    //   293: iadd
    //   294: istore #5
    //   296: iload #5
    //   298: bipush #59
    //   300: imul
    //   301: aload_0
    //   302: invokevirtual b : ()Z
    //   305: iload_3
    //   306: ifne -> 321
    //   309: ifeq -> 324
    //   312: goto -> 319
    //   315: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   318: athrow
    //   319: bipush #79
    //   321: goto -> 326
    //   324: bipush #97
    //   326: iadd
    //   327: istore #5
    //   329: iload #5
    //   331: bipush #59
    //   333: imul
    //   334: aload_0
    //   335: invokevirtual j : ()Z
    //   338: iload_3
    //   339: ifne -> 354
    //   342: ifeq -> 357
    //   345: goto -> 352
    //   348: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   351: athrow
    //   352: bipush #79
    //   354: goto -> 359
    //   357: bipush #97
    //   359: iadd
    //   360: istore #5
    //   362: aload_0
    //   363: invokevirtual b : ()Lorg/bukkit/entity/Player;
    //   366: astore #16
    //   368: iload #5
    //   370: bipush #59
    //   372: imul
    //   373: aload #16
    //   375: iload_3
    //   376: ifne -> 400
    //   379: ifnonnull -> 398
    //   382: goto -> 389
    //   385: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   388: athrow
    //   389: bipush #43
    //   391: goto -> 403
    //   394: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   397: athrow
    //   398: aload #16
    //   400: invokevirtual hashCode : ()I
    //   403: iadd
    //   404: istore #5
    //   406: aload_0
    //   407: invokevirtual b : ()Lorg/bukkit/World;
    //   410: astore #17
    //   412: iload #5
    //   414: bipush #59
    //   416: imul
    //   417: aload #17
    //   419: iload_3
    //   420: ifne -> 444
    //   423: ifnonnull -> 442
    //   426: goto -> 433
    //   429: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   432: athrow
    //   433: bipush #43
    //   435: goto -> 447
    //   438: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   441: athrow
    //   442: aload #17
    //   444: invokevirtual hashCode : ()I
    //   447: iadd
    //   448: istore #5
    //   450: aload_0
    //   451: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   454: astore #18
    //   456: iload #5
    //   458: bipush #59
    //   460: imul
    //   461: aload #18
    //   463: iload_3
    //   464: ifne -> 488
    //   467: ifnonnull -> 486
    //   470: goto -> 477
    //   473: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   476: athrow
    //   477: bipush #43
    //   479: goto -> 491
    //   482: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   485: athrow
    //   486: aload #18
    //   488: invokevirtual hashCode : ()I
    //   491: iadd
    //   492: istore #5
    //   494: aload_0
    //   495: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   498: astore #19
    //   500: iload #5
    //   502: bipush #59
    //   504: imul
    //   505: aload #19
    //   507: iload_3
    //   508: ifne -> 532
    //   511: ifnonnull -> 530
    //   514: goto -> 521
    //   517: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   520: athrow
    //   521: bipush #43
    //   523: goto -> 535
    //   526: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   529: athrow
    //   530: aload #19
    //   532: invokevirtual hashCode : ()I
    //   535: iadd
    //   536: istore #5
    //   538: aload_0
    //   539: invokevirtual j : ()Ljava/util/Set;
    //   542: astore #20
    //   544: iload #5
    //   546: bipush #59
    //   548: imul
    //   549: aload #20
    //   551: iload_3
    //   552: ifne -> 576
    //   555: ifnonnull -> 574
    //   558: goto -> 565
    //   561: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   564: athrow
    //   565: bipush #43
    //   567: goto -> 579
    //   570: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   573: athrow
    //   574: aload #20
    //   576: invokevirtual hashCode : ()I
    //   579: iadd
    //   580: istore #5
    //   582: aload_0
    //   583: invokevirtual b : ()Ljava/util/Set;
    //   586: astore #21
    //   588: iload #5
    //   590: bipush #59
    //   592: imul
    //   593: aload #21
    //   595: iload_3
    //   596: ifne -> 620
    //   599: ifnonnull -> 618
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   608: athrow
    //   609: bipush #43
    //   611: goto -> 623
    //   614: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   617: athrow
    //   618: aload #21
    //   620: invokevirtual hashCode : ()I
    //   623: iadd
    //   624: istore #5
    //   626: iload #5
    //   628: invokestatic g : ()Ljava/lang/String;
    //   631: ifnull -> 648
    //   634: iinc #3, 1
    //   637: iload_3
    //   638: invokestatic i : (I)V
    //   641: goto -> 648
    //   644: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   647: athrow
    //   648: ireturn
    // Exception table:
    //   from	to	target	type
    //   71	87	90	java/lang/NullPointerException
    //   104	120	123	java/lang/NullPointerException
    //   137	153	156	java/lang/NullPointerException
    //   170	186	189	java/lang/NullPointerException
    //   296	312	315	java/lang/NullPointerException
    //   329	345	348	java/lang/NullPointerException
    //   368	382	385	java/lang/NullPointerException
    //   379	394	394	java/lang/NullPointerException
    //   412	426	429	java/lang/NullPointerException
    //   423	438	438	java/lang/NullPointerException
    //   456	470	473	java/lang/NullPointerException
    //   467	482	482	java/lang/NullPointerException
    //   500	514	517	java/lang/NullPointerException
    //   511	526	526	java/lang/NullPointerException
    //   544	558	561	java/lang/NullPointerException
    //   555	570	570	java/lang/NullPointerException
    //   588	602	605	java/lang/NullPointerException
    //   599	614	614	java/lang/NullPointerException
    //   626	641	644	java/lang/NullPointerException
  }
  
  public boolean b() {
    return this.m;
  }
  
  public void j(boolean paramBoolean) {
    this.o = paramBoolean;
  }
  
  public void b(boolean paramBoolean) {
    this.m = paramBoolean;
  }
  
  public static void u(int paramInt) {
    c = paramInt;
  }
  
  public static int l() {
    return c;
  }
  
  public static int U() {
    int i = l();
    try {
      if (i == 0)
        return 92; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    long l = d ^ 0x7987BE1BFFF6L;
    u(0);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[20];
    boolean bool = false;
    String str;
    int i = (str = "£rE[!Î²\023Ãøûîr$ì(eYI(á;$\013¶¡W(Æþ- âôÏÌ¾xÊ\024\006\0041>k²F¼v\007\006D!8Ó?\024°<½Û¾QÌ´-þ\030ßnªG\023Bh e¸\001\b[@=¸WE\021\000Òî¬)þ\022~A\032§/ \017©)]\034©[W.\036þ=¾.\fÃSÜý\020DÍ\020dÓÓ*²ß0­i~-ì*\025 í3ß×©gM£üçrÿðaÄeRñª^z0Ù7ø\034þ,j¸\n×\n\t\022@uá\003\004y\026ª°P\016õË\037¿\005t\\ÿµì\001eæ<ãM=×k|ûeJ©ÉH¿¥ÎØ?Ò!>ÂÉIË1©0\027BÈw_\020]¯C¯.õµdãtñ\025|Ô\030ÍñÈÂê`;\036\027çM]Ç¹\007©èðÏv B«¬Rö®péfãcæ4ÈæÓ\013¾´\005ñ]\b\036þ\r{J \030ú\007l5øÒ (\027ú?qÝBr¨ÏuÎÿ=eµ2<me;#@gÚX\005PL®Ç\004roBÕ\0335'ï0E2Odµ\020\025Îæ\\ëÌ9\023;N^³ÕÎblÐ\0027ªP\001$\001öå§?(ßh±ËÚÈ³1Þ\"Ý[\003¸\003'\000yÊÂ\005¦Òx_¼é?\025vkG»G R@Ô¹D ýÒÏ f4áï\036à\022æîGGõëâÝ¼yÇW\020nV\031W\007\033õ\020SÆ\013AÙ§Z0;\\¶Ñæ\021ÎDh¯Â\nó\r®:¨2·ÚKiÖak³\032\027ÂJ¯vL®Í¿;'Py\030#Å\002seQ`\0028aWÙn¸u×P~²Ç6ø ú\013aM7U\030&ò={#lzs\024:¢'Òbh©\013\026Qè·R°}\030wz:B&%I ²Ft88\nÁ?\b%ãy").length();
    byte b2 = 24;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x36CE;
    if (h[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])j.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          j.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/ab", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = e[i].getBytes("ISO-8859-1");
      h[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return h[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/ab'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
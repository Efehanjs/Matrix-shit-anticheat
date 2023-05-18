package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.api.events.PlayerViolationEvent;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.Plugin;

public abstract class zk implements n, c {
  private final yl x;
  
  private final Set z = new HashSet();
  
  private int k;
  
  private static final int v = 100;
  
  private yk b;
  
  private long i;
  
  private static final long B = o3.a(691533485839709405L, 8300294750395571777L, MethodHandles.lookup().lookupClass()).a(210474590481868L);
  
  private static final String[] C;
  
  private static final String[] D;
  
  private static final Map E = new HashMap<>(13);
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!(paramObject instanceof zk))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    zk zk1 = (zk)paramObject;
    try {
      if (!zk1.b(this))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (this.k != zk1.k)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (this.i != zk1.i)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    yl yl1 = b();
    yl yl2 = zk1.b();
    try {
      if (yl1 == null) {
        try {
          if (yl2 != null)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } else {
        try {
          if (!yl1.equals(yl2))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    yk yk1 = b();
    yk yk2 = zk1.b();
    try {
      if (yk1 == null) {
        try {
          if (yk2 != null)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } else {
        try {
          if (!yk1.equals(yk2))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Set set1 = this.z;
    Set set2 = zk1.z;
    try {
      if (set1 == null) {
        try {
          if (set2 != null)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } else {
        try {
          if (!set1.equals(set2))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return true;
  }
  
  public final int j(long paramLong) {
    paramLong = B ^ paramLong;
    long l = paramLong ^ 0x28AE11B6CB7EL;
    return b().b().b(l, b());
  }
  
  @NotNull
  public xm b(short paramShort, int paramInt, char paramChar) {
    long l = (paramShort << 48L | paramInt << 32L >>> 16L | paramChar << 48L >>> 48L) ^ B;
    int i = (int)((l ^ 0x7EB86DC747CAL) >>> 32L);
    int j = (int)((l ^ 0x7EB86DC747CAL) << 32L >>> 48L);
    int k = (int)((l ^ 0x7EB86DC747CAL) << 48L >>> 48L);
    l ^ 0x7EB86DC747CAL;
    return xm.b(i, (short)j, (short)k, b());
  }
  
  public void b(im paramim) {
    this.z.add(paramim);
  }
  
  public void b(yk paramyk) {
    this.b = paramyk;
  }
  
  public void b(long paramLong, @NotNull String paramString1, @NotNull String paramString2, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/zk.B : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 96082689370627
    //   11: lxor
    //   12: dup2
    //   13: bipush #32
    //   15: lushr
    //   16: l2i
    //   17: istore #6
    //   19: dup2
    //   20: bipush #32
    //   22: lshl
    //   23: bipush #32
    //   25: lushr
    //   26: l2i
    //   27: istore #7
    //   29: pop2
    //   30: dup2
    //   31: ldc2_w 14654374511233
    //   34: lxor
    //   35: lstore #8
    //   37: dup2
    //   38: ldc2_w 6447722265520
    //   41: lxor
    //   42: dup2
    //   43: bipush #56
    //   45: lushr
    //   46: l2i
    //   47: istore #10
    //   49: dup2
    //   50: bipush #8
    //   52: lshl
    //   53: bipush #32
    //   55: lushr
    //   56: l2i
    //   57: istore #11
    //   59: dup2
    //   60: bipush #40
    //   62: lshl
    //   63: bipush #40
    //   65: lushr
    //   66: l2i
    //   67: istore #12
    //   69: pop2
    //   70: dup2
    //   71: ldc2_w 68712297256675
    //   74: lxor
    //   75: dup2
    //   76: bipush #32
    //   78: lushr
    //   79: l2i
    //   80: istore #13
    //   82: dup2
    //   83: bipush #32
    //   85: lshl
    //   86: bipush #48
    //   88: lushr
    //   89: l2i
    //   90: istore #14
    //   92: dup2
    //   93: bipush #48
    //   95: lshl
    //   96: bipush #48
    //   98: lushr
    //   99: l2i
    //   100: istore #15
    //   102: pop2
    //   103: dup2
    //   104: ldc2_w 108507227064302
    //   107: lxor
    //   108: dup2
    //   109: bipush #48
    //   111: lushr
    //   112: l2i
    //   113: istore #16
    //   115: dup2
    //   116: bipush #16
    //   118: lshl
    //   119: bipush #32
    //   121: lushr
    //   122: l2i
    //   123: istore #17
    //   125: dup2
    //   126: bipush #48
    //   128: lshl
    //   129: bipush #48
    //   131: lushr
    //   132: l2i
    //   133: istore #18
    //   135: pop2
    //   136: dup2
    //   137: ldc2_w 70990451807594
    //   140: lxor
    //   141: dup2
    //   142: bipush #16
    //   144: lushr
    //   145: lstore #19
    //   147: dup2
    //   148: bipush #48
    //   150: lshl
    //   151: bipush #48
    //   153: lushr
    //   154: l2i
    //   155: istore #21
    //   157: pop2
    //   158: dup2
    //   159: ldc2_w 11859500382580
    //   162: lxor
    //   163: dup2
    //   164: bipush #32
    //   166: lushr
    //   167: l2i
    //   168: istore #22
    //   170: dup2
    //   171: bipush #32
    //   173: lshl
    //   174: bipush #56
    //   176: lushr
    //   177: l2i
    //   178: istore #23
    //   180: dup2
    //   181: bipush #40
    //   183: lshl
    //   184: bipush #40
    //   186: lushr
    //   187: l2i
    //   188: istore #24
    //   190: pop2
    //   191: pop2
    //   192: aload_3
    //   193: sipush #8913
    //   196: ldc2_w 5098512549153328322
    //   199: lload_1
    //   200: lxor
    //   201: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   206: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   209: pop
    //   210: aload #4
    //   212: sipush #14527
    //   215: ldc2_w 4071331002459543209
    //   218: lload_1
    //   219: lxor
    //   220: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   225: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   228: pop
    //   229: iload #5
    //   231: ifge -> 239
    //   234: return
    //   235: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   238: athrow
    //   239: aload_0
    //   240: dup
    //   241: getfield k : I
    //   244: iconst_1
    //   245: iadd
    //   246: putfield k : I
    //   249: invokestatic j : ()J
    //   252: aload_0
    //   253: getfield i : J
    //   256: lsub
    //   257: ldc2_w 1000
    //   260: lcmp
    //   261: ifle -> 283
    //   264: aload_0
    //   265: iconst_0
    //   266: putfield k : I
    //   269: aload_0
    //   270: invokestatic j : ()J
    //   273: putfield i : J
    //   276: goto -> 283
    //   279: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: aload_0
    //   284: getfield k : I
    //   287: bipush #100
    //   289: if_icmple -> 297
    //   292: return
    //   293: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   296: athrow
    //   297: aload_0
    //   298: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   301: ifnonnull -> 309
    //   304: return
    //   305: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: aload_0
    //   310: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   313: iload #22
    //   315: iload #23
    //   317: i2b
    //   318: iload #24
    //   320: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   323: ifnonnull -> 331
    //   326: return
    //   327: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   330: athrow
    //   331: getstatic me/rerere/matrix/internal/ge.f : Ljava/util/List;
    //   334: ifnull -> 361
    //   337: getstatic me/rerere/matrix/internal/ge.f : Ljava/util/List;
    //   340: aload_3
    //   341: invokeinterface contains : (Ljava/lang/Object;)Z
    //   346: ifeq -> 361
    //   349: goto -> 356
    //   352: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   355: athrow
    //   356: return
    //   357: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   360: athrow
    //   361: aload_0
    //   362: getfield x : Lme/rerere/matrix/internal/yl;
    //   365: aload_0
    //   366: getfield b : Lme/rerere/matrix/internal/yk;
    //   369: lload #8
    //   371: dup2_x1
    //   372: pop2
    //   373: invokevirtual b : (JLme/rerere/matrix/internal/yk;)Z
    //   376: ifeq -> 384
    //   379: return
    //   380: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   383: athrow
    //   384: getstatic me/rerere/matrix/internal/ge.v : Ljava/util/Map;
    //   387: ifnull -> 416
    //   390: getstatic me/rerere/matrix/internal/ge.v : Ljava/util/Map;
    //   393: aload_3
    //   394: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   399: checkcast java/lang/Integer
    //   402: astore #25
    //   404: aload #25
    //   406: ifnull -> 416
    //   409: aload #25
    //   411: invokevirtual intValue : ()I
    //   414: istore #5
    //   416: getstatic me/rerere/matrix/internal/ge.y : Z
    //   419: ifeq -> 616
    //   422: invokestatic j : ()D
    //   425: getstatic me/rerere/matrix/internal/ge.l : D
    //   428: dcmpg
    //   429: ifgt -> 616
    //   432: goto -> 439
    //   435: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   438: athrow
    //   439: aload_0
    //   440: getfield b : Lme/rerere/matrix/internal/yk;
    //   443: getstatic me/rerere/matrix/internal/yk.y : Lme/rerere/matrix/internal/yk;
    //   446: if_acmpeq -> 524
    //   449: goto -> 456
    //   452: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   455: athrow
    //   456: aload_0
    //   457: getfield b : Lme/rerere/matrix/internal/yk;
    //   460: getstatic me/rerere/matrix/internal/yk.o : Lme/rerere/matrix/internal/yk;
    //   463: if_acmpeq -> 524
    //   466: goto -> 473
    //   469: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   472: athrow
    //   473: aload_0
    //   474: getfield b : Lme/rerere/matrix/internal/yk;
    //   477: getstatic me/rerere/matrix/internal/yk.k : Lme/rerere/matrix/internal/yk;
    //   480: if_acmpeq -> 524
    //   483: goto -> 490
    //   486: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   489: athrow
    //   490: aload_0
    //   491: getfield b : Lme/rerere/matrix/internal/yk;
    //   494: getstatic me/rerere/matrix/internal/yk.r : Lme/rerere/matrix/internal/yk;
    //   497: if_acmpeq -> 524
    //   500: goto -> 507
    //   503: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   506: athrow
    //   507: aload_0
    //   508: getfield b : Lme/rerere/matrix/internal/yk;
    //   511: getstatic me/rerere/matrix/internal/yk.c : Lme/rerere/matrix/internal/yk;
    //   514: if_acmpne -> 530
    //   517: goto -> 524
    //   520: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   523: athrow
    //   524: iload #5
    //   526: iconst_2
    //   527: idiv
    //   528: istore #5
    //   530: new java/lang/StringBuilder
    //   533: dup
    //   534: invokespecial <init> : ()V
    //   537: sipush #21083
    //   540: ldc2_w 222805767714094156
    //   543: lload_1
    //   544: lxor
    //   545: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   550: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   553: aload_0
    //   554: getfield b : Lme/rerere/matrix/internal/yk;
    //   557: invokevirtual j : ()Ljava/lang/String;
    //   560: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   563: sipush #9971
    //   566: ldc2_w 8433830516937443553
    //   569: lload_1
    //   570: lxor
    //   571: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   576: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: aload_0
    //   580: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   583: invokevirtual b : ()Ljava/lang/String;
    //   586: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   589: sipush #24360
    //   592: ldc2_w 1562521420441399609
    //   595: lload_1
    //   596: lxor
    //   597: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   602: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   605: invokevirtual toString : ()Ljava/lang/String;
    //   608: lload #19
    //   610: iload #21
    //   612: i2s
    //   613: invokestatic b : (Ljava/lang/String;JS)V
    //   616: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   619: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   622: astore #25
    //   624: aload_0
    //   625: getfield x : Lme/rerere/matrix/internal/yl;
    //   628: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   631: astore #26
    //   633: aload_0
    //   634: getfield x : Lme/rerere/matrix/internal/yl;
    //   637: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   640: astore #27
    //   642: aload #26
    //   644: sipush #11294
    //   647: ldc2_w 1195911286656909834
    //   650: lload_1
    //   651: lxor
    //   652: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   657: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   660: pop
    //   661: aload #27
    //   663: sipush #21869
    //   666: ldc2_w 3307308673787149176
    //   669: lload_1
    //   670: lxor
    //   671: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   676: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   679: pop
    //   680: new me/rerere/matrix/api/events/PlayerViolationEvent
    //   683: dup
    //   684: aload_0
    //   685: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   688: iload #22
    //   690: iload #23
    //   692: i2b
    //   693: iload #24
    //   695: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   698: aload_3
    //   699: aload_0
    //   700: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   703: iload #6
    //   705: iload #7
    //   707: invokevirtual b : (II)Lme/rerere/matrix/api/HackType;
    //   710: aload #4
    //   712: iload #5
    //   714: invokespecial <init> : (Lorg/bukkit/entity/Player;Ljava/lang/String;Lme/rerere/matrix/api/HackType;Ljava/lang/String;I)V
    //   717: astore #28
    //   719: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   722: aload #28
    //   724: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   729: aload #28
    //   731: invokevirtual isCancelled : ()Z
    //   734: istore #29
    //   736: iload #29
    //   738: ifeq -> 746
    //   741: return
    //   742: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   745: athrow
    //   746: aload #28
    //   748: invokevirtual getViolations : ()I
    //   751: istore #5
    //   753: aload #27
    //   755: invokevirtual b : ()Ljava/util/List;
    //   758: invokeinterface iterator : ()Ljava/util/Iterator;
    //   763: astore #30
    //   765: aload #30
    //   767: invokeinterface hasNext : ()Z
    //   772: ifeq -> 834
    //   775: aload #30
    //   777: invokeinterface next : ()Ljava/lang/Object;
    //   782: checkcast me/rerere/matrix/internal/zk
    //   785: astore #31
    //   787: aload #31
    //   789: aload_0
    //   790: if_acmpeq -> 831
    //   793: aload #31
    //   795: ifnull -> 831
    //   798: goto -> 805
    //   801: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   804: athrow
    //   805: aload #31
    //   807: aload_0
    //   808: iload #13
    //   810: aload_3
    //   811: aload #4
    //   813: iload #14
    //   815: i2c
    //   816: iload #5
    //   818: iload #15
    //   820: i2c
    //   821: invokevirtual b : (Lme/rerere/matrix/internal/zk;ILjava/lang/String;Ljava/lang/String;CIC)V
    //   824: goto -> 831
    //   827: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   830: athrow
    //   831: goto -> 765
    //   834: aload_0
    //   835: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   838: iload #22
    //   840: iload #23
    //   842: i2b
    //   843: iload #24
    //   845: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   848: astore #30
    //   850: aload_0
    //   851: getfield x : Lme/rerere/matrix/internal/yl;
    //   854: invokevirtual b : ()Lme/rerere/matrix/internal/oc;
    //   857: new java/lang/StringBuilder
    //   860: dup
    //   861: invokespecial <init> : ()V
    //   864: aload_0
    //   865: getfield b : Lme/rerere/matrix/internal/yk;
    //   868: invokevirtual j : ()Ljava/lang/String;
    //   871: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   874: sipush #3010
    //   877: ldc2_w 788742063123686866
    //   880: lload_1
    //   881: lxor
    //   882: <illegal opcode> j : (IJ)Ljava/lang/String;
    //   887: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   890: aload #4
    //   892: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: invokevirtual toString : ()Ljava/lang/String;
    //   898: iload #10
    //   900: i2b
    //   901: iload #11
    //   903: iload #12
    //   905: invokevirtual b : (Ljava/lang/Object;BII)V
    //   908: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   911: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   914: new me/rerere/matrix/internal/cg
    //   917: dup
    //   918: iload #16
    //   920: i2s
    //   921: aload #30
    //   923: aload_0
    //   924: getfield b : Lme/rerere/matrix/internal/yk;
    //   927: iload #5
    //   929: iload #17
    //   931: aload_3
    //   932: aload #4
    //   934: aload_0
    //   935: getfield x : Lme/rerere/matrix/internal/yl;
    //   938: iload #18
    //   940: i2c
    //   941: swap
    //   942: aload #25
    //   944: aload #26
    //   946: invokespecial <init> : (SLorg/bukkit/entity/Player;Lme/rerere/matrix/internal/yk;IILjava/lang/String;Ljava/lang/String;CLme/rerere/matrix/internal/yl;Lme/rerere/matrix/internal/mn;Lme/rerere/matrix/internal/qd;)V
    //   949: invokeinterface runTask : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   954: pop
    //   955: return
    // Exception table:
    //   from	to	target	type
    //   192	235	235	java/lang/RuntimeException
    //   239	276	279	java/lang/RuntimeException
    //   283	293	293	java/lang/RuntimeException
    //   297	305	305	java/lang/RuntimeException
    //   309	327	327	java/lang/RuntimeException
    //   331	349	352	java/lang/RuntimeException
    //   337	357	357	java/lang/RuntimeException
    //   361	380	380	java/lang/RuntimeException
    //   416	432	435	java/lang/RuntimeException
    //   422	449	452	java/lang/RuntimeException
    //   439	466	469	java/lang/RuntimeException
    //   456	483	486	java/lang/RuntimeException
    //   473	500	503	java/lang/RuntimeException
    //   490	517	520	java/lang/RuntimeException
    //   736	742	742	java/lang/RuntimeException
    //   787	798	801	java/lang/RuntimeException
    //   793	824	827	java/lang/RuntimeException
  }
  
  public yl b() {
    return this.x;
  }
  
  public boolean b(@NotNull String paramString1, @NotNull String paramString2, long paramLong, int paramInt) {
    paramLong = B ^ paramLong;
    int i = (int)((paramLong ^ 0xD2843C83594L) >>> 32L);
    int j = (int)((paramLong ^ 0xD2843C83594L) << 32L >>> 32L);
    paramLong ^ 0xD2843C83594L;
    long l = paramLong ^ 0x571941901D16L;
    int k = (int)((paramLong ^ 0x6434E9484974L) >>> 32L);
    int m = (int)((paramLong ^ 0x6434E9484974L) << 32L >>> 48L);
    int i1 = (int)((paramLong ^ 0x6434E9484974L) << 48L >>> 48L);
    paramLong ^ 0x6434E9484974L;
    int i2 = (int)((paramLong ^ 0x38E573E01879L) >>> 48L);
    int i3 = (int)((paramLong ^ 0x38E573E01879L) << 16L >>> 32L);
    int i4 = (int)((paramLong ^ 0x38E573E01879L) << 48L >>> 48L);
    paramLong ^ 0x38E573E01879L;
    int i5 = (int)((paramLong ^ 0x5083FC1726E3L) >>> 32L);
    int i6 = (int)((paramLong ^ 0x5083FC1726E3L) << 32L >>> 56L);
    int i7 = (int)((paramLong ^ 0x5083FC1726E3L) << 40L >>> 40L);
    paramLong ^ 0x5083FC1726E3L;
    try {
      if (paramInt < 0)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      this.k++;
      if (System.currentTimeMillis() - this.i > 1000L) {
        this.k = 0;
        this.i = System.currentTimeMillis();
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (this.k > 100)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (b().j(i5, (byte)i6, i7) == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (ge.f != null)
        try {
          if (ge.f.contains(paramString1))
            return false; 
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (this.x.b(l, this.b))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    if (ge.v != null) {
      Integer integer = (Integer)ge.v.get(paramString1);
      if (integer != null)
        paramInt = integer.intValue(); 
    } 
    try {
      if (ge.y && ia.j() <= ge.l)
        paramInt = 0; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    mn mn = Matrix.b().b();
    qd qd = this.x.b();
    PlayerViolationEvent playerViolationEvent = new PlayerViolationEvent(b().j(i5, (byte)i6, i7), paramString1, b().b(i, j), paramString2, paramInt);
    Bukkit.getPluginManager().callEvent((Event)playerViolationEvent);
    boolean bool = playerViolationEvent.isCancelled();
    try {
      if (bool)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramInt = playerViolationEvent.getViolations();
    for (zk zk1 : b().b().b()) {
      try {
        if (zk1 != this)
          try {
            if (zk1 != null)
              zk1.b(this, k, paramString1, paramString2, (char)m, paramInt, (char)i1); 
          } catch (RuntimeException runtimeException) {
            throw b(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
    } 
    Player player = b().j(i5, (byte)i6, i7);
    try {
      if (player == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Bukkit.getScheduler().runTask((Plugin)Matrix.b(), new cg((short)i2, player, this.b, paramInt, i3, paramString1, paramString2, (char)i4, this.x, mn, qd));
    return true;
  }
  
  @Deprecated
  public void m() {}
  
  @NotNull
  public Player b(byte paramByte, long paramLong) {
    long l = (paramByte << 56L | paramLong << 8L >>> 8L) ^ B;
    int i = (int)((l ^ 0x20922F126C33L) >>> 32L);
    int j = (int)((l ^ 0x20922F126C33L) << 32L >>> 56L);
    int k = (int)((l ^ 0x20922F126C33L) << 40L >>> 40L);
    l ^ 0x20922F126C33L;
    return this.x.j(i, (byte)j, k);
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof zk;
  }
  
  public int hashCode() {
    byte b = 59;
    null = 1;
    null = null * 59 + this.k;
    long l = this.i;
    null = null * 59 + (int)(l >>> 32L ^ l);
    yl yl1 = b();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    null = null * 59 + ((yl1 == null) ? 43 : yl1.hashCode());
    yk yk1 = b();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    null = null * 59 + ((yk1 == null) ? 43 : yk1.hashCode());
    Set set = this.z;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return null * 59 + ((set == null) ? 43 : set.hashCode());
  }
  
  public void b(zk paramzk, int paramInt1, String paramString1, String paramString2, char paramChar1, int paramInt2, char paramChar2) {}
  
  public zk(yl paramyl, yk paramyk) {
    this.x = paramyl;
    this.b = paramyk;
  }
  
  public yk b() {
    return this.b;
  }
  
  @Deprecated
  public zk(yl paramyl) {
    this.x = paramyl;
  }
  
  @NotNull
  public final ConfigurationSection b() {
    return ((ci)Objects.<ci>requireNonNull(b().b())).j();
  }
  
  public int b() {
    return (int)this.x.x;
  }
  
  public void p() {
    this.z.forEach(im::b);
  }
  
  static {
    long l = B ^ 0x2657602FF411L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "jÍ8¡»86Þ\020®ªÆ{\002ÊeÙ5\032F(¨D%`\027ÔºÔå±6ô®õ8Û I_'\024\"£r `»ÑûEªU<F\030o7UHv·\\\033\016\032°nN\035ÉM\030¡c&(Áøf¯ÛEPg&s\007Ï\022ù9ð,3]©§ ÂÀxüà\006DªåîH³\007\020\030\023ùôYfU^ôw47ÓdÅ\nÞ\030­Á4ý¦g V0¦\037ß>à=×b\020¡ \032¯y").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
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
        char c1 = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c1 = (char)(c1 | (char)(j & 0x3F));
        arrayOfChar[b1++] = c1;
      } else if (b2 < i - 2) {
        char c1 = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c1 = (char)(c1 | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c1 = (char)(c1 | (char)(j & 0x3F));
        arrayOfChar[b1++] = c1;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5DB7;
    if (D[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])E.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          E.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/zk", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = C[i].getBytes("ISO-8859-1");
      D[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return D[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/zk'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
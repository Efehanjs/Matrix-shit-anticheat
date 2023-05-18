package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.Set;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class in extends zk {
  private static boolean aa;
  
  private static boolean ja;
  
  private static boolean fa;
  
  private final oc ta;
  
  private long sa;
  
  private boolean ea;
  
  private boolean za;
  
  private double oa;
  
  private static int ma;
  
  private int wa;
  
  private long ya;
  
  private int c;
  
  private int p;
  
  private long j;
  
  private long d;
  
  private double h;
  
  private long e;
  
  private static boolean n;
  
  private static final Set y;
  
  private int m;
  
  private boolean o;
  
  @Nullable
  private Vector q;
  
  private int t;
  
  private int g;
  
  private long a;
  
  private static final Set s;
  
  private int u;
  
  private final ik w;
  
  private int f;
  
  private long l;
  
  private static boolean r;
  
  private int x;
  
  private final ob z;
  
  private long k;
  
  private int v;
  
  private int b;
  
  private long i;
  
  private static final long A = o3.a(-1881944193381195660L, 590313962936582557L, MethodHandles.lookup().lookupClass()).a(268126931839263L);
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l1 = A ^ 0xE8B9F9F7BFAL;
    int i = (int)((l1 ^ 0x222DB79A085EL) >>> 32L);
    int j = (int)((l1 ^ 0x222DB79A085EL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x222DB79A085EL) << 48L >>> 48L);
    l1 ^ 0x222DB79A085EL;
    long l2 = l1 ^ 0x41993A926F9FL;
    long l3 = l1 ^ 0x2AFC2CCFF26AL;
    Player player = paramPlayerMoveEvent.getPlayer();
    boolean bool1 = ta.t(i, (short)j, player, k);
    boolean bool2 = b().b().b(l3, paramLocation2);
    j(paramPlayerMoveEvent, paramLocation1, paramLocation2, bool1, l2, bool2);
  }
  
  public void b(@NotNull PlayerToggleFlightEvent paramPlayerToggleFlightEvent) {
    try {
      if (paramPlayerToggleFlightEvent.isFlying())
        this.g = 4; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(io paramio, int paramInt, char paramChar, short paramShort) {
    long l1 = (paramInt << 32L | paramChar << 48L >>> 32L | paramShort << 48L >>> 48L) ^ A;
    long l2 = l1 ^ 0x53EF13BF52FFL;
    this.z.b(l2, paramio);
  }
  
  public void b(boolean paramBoolean) {
    try {
      if (paramBoolean != this.o)
        try {
          if (!paramBoolean)
            this.j = pc.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.o = paramBoolean;
  }
  
  static {
    long l = A ^ 0x2378FF2E7AA5L;
    y = tb.b("elytra");
    s = tb.b("riptide");
    ma = 30;
  }
  
  public void j(int paramInt) {
    this.p = paramInt;
  }
  
  public void b(int paramInt1, int paramInt2) {
    try {
      if (++this.t >= 23) {
        this.t = 0;
        b().b().b();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerRespawnEvent paramPlayerRespawnEvent) {
    b().b().b();
    (b().b()).l = null;
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    long l = (paramLong ^ 0x51C781002DCFL) >>> 16L;
    int i = (int)((paramLong ^ 0x51C781002DCFL) << 48L >>> 48L);
    paramLong ^ 0x51C781002DCFL;
    try {
      this.e = pc.j();
      this.q = ((Location)Objects.<Location>requireNonNull(paramPlayerTeleportEvent.getTo())).toVector();
      (b().b()).l = paramPlayerTeleportEvent.getTo().clone();
      if (paramPlayerTeleportEvent.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL)
        this.l = pc.j(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (pd.w)
        rg.b("[Tp] " + this.q.toString(), l, (short)i); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(InventoryClickEvent paramInventoryClickEvent, long paramLong) {
    try {
      if (paramInventoryClickEvent.getClickedInventory() != null)
        try {
          if (paramInventoryClickEvent.getClickedInventory().getType() == InventoryType.PLAYER)
            this.a = pc.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void h() {
    try {
      this.p++;
      if (this.p > 15)
        this.p = 15; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void p(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    this.sa = pc.j();
  }
  
  public in(yl paramyl, long paramLong) {
    super(paramyl);
    this.ta = new oc(Long.class, l1, 5);
    this.x = 0;
    this.v = 0;
    this.f = 0;
    this.u = 0;
    this.h = 0.0D;
    this.b = 0;
    this.za = false;
    this.ea = false;
    this.p = 0;
    this.ya = 0L;
    this.i = 0L;
    this.w = new ik();
    this.z = new ob(25);
    this.o = false;
    this.j = 0L;
    b(yk.y);
    if (b() != null) {
      Player player = b((byte)i, l2);
      vk vk = b().b();
      try {
        if (player != null)
          try {
            if (vk != null)
              vk.l = player.getLocation().clone(); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public void j(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2, boolean paramBoolean1, long paramLong, boolean paramBoolean2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/in.A : J
    //   3: lload #5
    //   5: lxor
    //   6: lstore #5
    //   8: lload #5
    //   10: dup2
    //   11: ldc2_w 134536673462159
    //   14: lxor
    //   15: lstore #8
    //   17: dup2
    //   18: ldc2_w 13888723424129
    //   21: lxor
    //   22: lstore #10
    //   24: dup2
    //   25: ldc2_w 140340403736318
    //   28: lxor
    //   29: lstore #12
    //   31: dup2
    //   32: ldc2_w 895850869241
    //   35: lxor
    //   36: lstore #14
    //   38: dup2
    //   39: ldc2_w 79220289680622
    //   42: lxor
    //   43: dup2
    //   44: bipush #56
    //   46: lushr
    //   47: l2i
    //   48: istore #16
    //   50: dup2
    //   51: bipush #8
    //   53: lshl
    //   54: bipush #8
    //   56: lushr
    //   57: lstore #17
    //   59: pop2
    //   60: dup2
    //   61: ldc2_w 33346810075278
    //   64: lxor
    //   65: lstore #19
    //   67: dup2
    //   68: ldc2_w 101195520375698
    //   71: lxor
    //   72: lstore #21
    //   74: dup2
    //   75: ldc2_w 29363135101770
    //   78: lxor
    //   79: lstore #23
    //   81: dup2
    //   82: ldc2_w 118719337037352
    //   85: lxor
    //   86: lstore #25
    //   88: dup2
    //   89: ldc2_w 20446789328949
    //   92: lxor
    //   93: lstore #27
    //   95: dup2
    //   96: ldc2_w 80297109753042
    //   99: lxor
    //   100: lstore #29
    //   102: dup2
    //   103: ldc2_w 44948236998425
    //   106: lxor
    //   107: lstore #31
    //   109: dup2
    //   110: ldc2_w 103867138498072
    //   113: lxor
    //   114: dup2
    //   115: bipush #32
    //   117: lushr
    //   118: l2i
    //   119: istore #33
    //   121: dup2
    //   122: bipush #32
    //   124: lshl
    //   125: bipush #32
    //   127: lushr
    //   128: lstore #34
    //   130: pop2
    //   131: dup2
    //   132: ldc2_w 22962896063334
    //   135: lxor
    //   136: dup2
    //   137: bipush #48
    //   139: lushr
    //   140: l2i
    //   141: istore #36
    //   143: dup2
    //   144: bipush #16
    //   146: lshl
    //   147: bipush #32
    //   149: lushr
    //   150: l2i
    //   151: istore #37
    //   153: dup2
    //   154: bipush #48
    //   156: lshl
    //   157: bipush #48
    //   159: lushr
    //   160: l2i
    //   161: istore #38
    //   163: pop2
    //   164: dup2
    //   165: ldc2_w 52593738481712
    //   168: lxor
    //   169: lstore #39
    //   171: dup2
    //   172: ldc2_w 70545993070508
    //   175: lxor
    //   176: lstore #41
    //   178: dup2
    //   179: ldc2_w 92954966514136
    //   182: lxor
    //   183: lstore #43
    //   185: dup2
    //   186: ldc2_w 4834537609485
    //   189: lxor
    //   190: lstore #45
    //   192: dup2
    //   193: ldc2_w 80330315014774
    //   196: lxor
    //   197: dup2
    //   198: bipush #32
    //   200: lushr
    //   201: l2i
    //   202: istore #47
    //   204: dup2
    //   205: bipush #32
    //   207: lshl
    //   208: bipush #48
    //   210: lushr
    //   211: l2i
    //   212: istore #48
    //   214: dup2
    //   215: bipush #48
    //   217: lshl
    //   218: bipush #48
    //   220: lushr
    //   221: l2i
    //   222: istore #49
    //   224: pop2
    //   225: pop2
    //   226: aload_1
    //   227: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   230: astore #50
    //   232: aload_0
    //   233: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   236: invokevirtual b : ()Lme/rerere/matrix/internal/gb;
    //   239: astore #51
    //   241: aload_0
    //   242: getfield p : I
    //   245: ifle -> 336
    //   248: iload #4
    //   250: iload #7
    //   252: if_icmpne -> 336
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   261: athrow
    //   262: aload_2
    //   263: aload_3
    //   264: invokevirtual distanceSquared : (Lorg/bukkit/Location;)D
    //   267: dconst_0
    //   268: dcmpl
    //   269: ifne -> 336
    //   272: goto -> 279
    //   275: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   278: athrow
    //   279: new me/rerere/matrix/internal/io
    //   282: dup
    //   283: aload_3
    //   284: invokevirtual getX : ()D
    //   287: aload_3
    //   288: invokevirtual getY : ()D
    //   291: aload_3
    //   292: invokevirtual getZ : ()D
    //   295: invokespecial <init> : (DDD)V
    //   298: astore #52
    //   300: aload_0
    //   301: getfield z : Lme/rerere/matrix/internal/ob;
    //   304: aload #52
    //   306: invokevirtual b : (Ljava/lang/Object;)Z
    //   309: ifeq -> 336
    //   312: aload_0
    //   313: getfield z : Lme/rerere/matrix/internal/ob;
    //   316: aload #52
    //   318: invokevirtual j : (Ljava/lang/Object;)V
    //   321: aload_0
    //   322: dup
    //   323: getfield p : I
    //   326: iconst_1
    //   327: isub
    //   328: putfield p : I
    //   331: return
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload_0
    //   337: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   340: invokevirtual b : ()Lme/rerere/matrix/internal/vk;
    //   343: astore #52
    //   345: aload #52
    //   347: getfield w : Lme/rerere/matrix/internal/ka;
    //   350: astore #53
    //   352: aload #50
    //   354: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   359: astore #54
    //   361: aload #53
    //   363: invokevirtual b : ()Lme/rerere/matrix/internal/aa;
    //   366: astore #55
    //   368: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   371: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   374: iload #47
    //   376: iload #48
    //   378: iload #49
    //   380: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   383: astore #56
    //   385: getstatic me/rerere/matrix/internal/pd.x : Z
    //   388: ifeq -> 426
    //   391: new java/lang/StringBuilder
    //   394: dup
    //   395: invokespecial <init> : ()V
    //   398: ldc_w '§7[§6Collision§7] §a'
    //   401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: aload #55
    //   406: invokevirtual toString : ()Ljava/lang/String;
    //   409: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: invokevirtual toString : ()Ljava/lang/String;
    //   415: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   418: pop
    //   419: goto -> 426
    //   422: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   425: athrow
    //   426: aload #50
    //   428: invokeinterface isFlying : ()Z
    //   433: ifne -> 574
    //   436: aload_0
    //   437: getfield u : I
    //   440: ifgt -> 574
    //   443: goto -> 450
    //   446: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   449: athrow
    //   450: aload #50
    //   452: invokeinterface isDead : ()Z
    //   457: ifne -> 574
    //   460: goto -> 467
    //   463: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   466: athrow
    //   467: aload #50
    //   469: invokeinterface isSleeping : ()Z
    //   474: ifne -> 574
    //   477: goto -> 484
    //   480: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   483: athrow
    //   484: aload_0
    //   485: getfield g : I
    //   488: ifgt -> 574
    //   491: goto -> 498
    //   494: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   497: athrow
    //   498: aload #54
    //   500: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   503: if_acmpeq -> 528
    //   506: goto -> 513
    //   509: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   512: athrow
    //   513: aload #54
    //   515: getstatic org/bukkit/GameMode.ADVENTURE : Lorg/bukkit/GameMode;
    //   518: if_acmpne -> 574
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   527: athrow
    //   528: aload #50
    //   530: invokeinterface isInsideVehicle : ()Z
    //   535: ifne -> 574
    //   538: goto -> 545
    //   541: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   544: athrow
    //   545: aload #55
    //   547: iconst_1
    //   548: anewarray org/bukkit/Material
    //   551: dup
    //   552: iconst_0
    //   553: invokestatic j : ()Lorg/bukkit/Material;
    //   556: aastore
    //   557: lload #21
    //   559: dup2_x1
    //   560: pop2
    //   561: invokevirtual j : (J[Lorg/bukkit/Material;)Z
    //   564: ifeq -> 582
    //   567: goto -> 574
    //   570: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   573: athrow
    //   574: iconst_1
    //   575: goto -> 583
    //   578: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   581: athrow
    //   582: iconst_0
    //   583: istore #57
    //   585: aload_0
    //   586: getfield g : I
    //   589: ifle -> 609
    //   592: aload_0
    //   593: dup
    //   594: getfield g : I
    //   597: iconst_1
    //   598: isub
    //   599: putfield g : I
    //   602: goto -> 609
    //   605: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   608: athrow
    //   609: aload_0
    //   610: getfield u : I
    //   613: ifle -> 633
    //   616: aload_0
    //   617: dup
    //   618: getfield u : I
    //   621: iconst_1
    //   622: isub
    //   623: putfield u : I
    //   626: goto -> 633
    //   629: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   632: athrow
    //   633: aload #55
    //   635: invokevirtual j : ()Z
    //   638: ifeq -> 659
    //   641: aload_0
    //   642: bipush #20
    //   644: putfield v : I
    //   647: aload_0
    //   648: iconst_0
    //   649: putfield f : I
    //   652: goto -> 683
    //   655: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   658: athrow
    //   659: aload_0
    //   660: getfield v : I
    //   663: ifle -> 683
    //   666: aload_0
    //   667: dup
    //   668: getfield v : I
    //   671: iconst_1
    //   672: isub
    //   673: putfield v : I
    //   676: goto -> 683
    //   679: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   682: athrow
    //   683: aload_1
    //   684: iload #4
    //   686: iload #7
    //   688: lload #43
    //   690: iload #57
    //   692: aload #56
    //   694: aload #50
    //   696: lload #14
    //   698: invokeinterface b : (Lorg/bukkit/entity/LivingEntity;J)F
    //   703: aload #50
    //   705: invokeinterface isSneaking : ()Z
    //   710: aload #50
    //   712: invokeinterface isSprinting : ()Z
    //   717: aload #50
    //   719: invokeinterface getActivePotionEffects : ()Ljava/util/Collection;
    //   724: lload #31
    //   726: dup2_x1
    //   727: pop2
    //   728: invokestatic b : (JLjava/util/Collection;)Ljava/util/Set;
    //   731: invokestatic b : (Lorg/bukkit/event/player/PlayerMoveEvent;ZZJZFZZLjava/util/Set;)Lme/rerere/matrix/internal/ab;
    //   734: astore #58
    //   736: aload #52
    //   738: aload #58
    //   740: invokevirtual m : ()D
    //   743: putfield x : D
    //   746: iload #57
    //   748: ifeq -> 789
    //   751: aload #50
    //   753: invokeinterface isInsideVehicle : ()Z
    //   758: ifeq -> 789
    //   761: goto -> 768
    //   764: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   767: athrow
    //   768: aload #58
    //   770: invokevirtual j : ()Ljava/util/Set;
    //   773: ldc_w 'vehicle'
    //   776: invokeinterface add : (Ljava/lang/Object;)Z
    //   781: pop
    //   782: goto -> 789
    //   785: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   788: athrow
    //   789: aload #55
    //   791: invokevirtual j : ()Z
    //   794: ifeq -> 818
    //   797: aload #58
    //   799: invokevirtual j : ()Ljava/util/Set;
    //   802: ldc_w 'water'
    //   805: invokeinterface add : (Ljava/lang/Object;)Z
    //   810: pop
    //   811: goto -> 818
    //   814: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   817: athrow
    //   818: aload #58
    //   820: invokevirtual b : ()F
    //   823: ldc_w 0.4
    //   826: fcmpl
    //   827: ifle -> 833
    //   830: iconst_1
    //   831: istore #57
    //   833: invokestatic b : ()I
    //   836: bipush #8
    //   838: if_icmple -> 894
    //   841: iload #57
    //   843: ifne -> 881
    //   846: goto -> 853
    //   849: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   852: athrow
    //   853: aload #50
    //   855: invokeinterface isGliding : ()Z
    //   860: ifeq -> 881
    //   863: goto -> 870
    //   866: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   869: athrow
    //   870: iconst_1
    //   871: istore #57
    //   873: aload #58
    //   875: getstatic me/rerere/matrix/internal/in.y : Ljava/util/Set;
    //   878: invokevirtual b : (Ljava/util/Set;)V
    //   881: aload #50
    //   883: invokeinterface hasGravity : ()Z
    //   888: ifne -> 894
    //   891: iconst_1
    //   892: istore #57
    //   894: invokestatic b : ()I
    //   897: bipush #13
    //   899: if_icmplt -> 1064
    //   902: aload #50
    //   904: invokeinterface isRiptiding : ()Z
    //   909: ifeq -> 1064
    //   912: goto -> 919
    //   915: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   918: athrow
    //   919: iconst_1
    //   920: istore #57
    //   922: aload #58
    //   924: getstatic me/rerere/matrix/internal/in.s : Ljava/util/Set;
    //   927: invokevirtual b : (Ljava/util/Set;)V
    //   930: aload #51
    //   932: invokevirtual b : ()Lme/rerere/matrix/internal/ab;
    //   935: astore #59
    //   937: aload #59
    //   939: ifnull -> 1064
    //   942: aload_3
    //   943: aload_2
    //   944: invokevirtual distance : (Lorg/bukkit/Location;)D
    //   947: dstore #60
    //   949: aload #59
    //   951: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   954: aload #59
    //   956: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   959: invokevirtual distance : (Lorg/bukkit/util/Vector;)D
    //   962: dstore #62
    //   964: dload #60
    //   966: dload #62
    //   968: dsub
    //   969: dstore #64
    //   971: invokestatic currentTimeMillis : ()J
    //   974: aload_0
    //   975: getfield i : J
    //   978: lsub
    //   979: lstore #66
    //   981: dload #64
    //   983: ldc2_w 4.2
    //   986: dcmpl
    //   987: ifle -> 1064
    //   990: lload #66
    //   992: ldc2_w 65
    //   995: lcmp
    //   996: ifge -> 1064
    //   999: goto -> 1006
    //   1002: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1005: athrow
    //   1006: aload_1
    //   1007: aload_2
    //   1008: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1011: aload_0
    //   1012: lload #8
    //   1014: ldc_w 'move.riptide'
    //   1017: new java/lang/StringBuilder
    //   1020: dup
    //   1021: invokespecial <init> : ()V
    //   1024: ldc_w 'riptide boost / a:'
    //   1027: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1030: dload #64
    //   1032: invokestatic b : (D)D
    //   1035: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1038: ldc_w ', d:'
    //   1041: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1044: lload #66
    //   1046: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1049: invokevirtual toString : ()Ljava/lang/String;
    //   1052: bipush #20
    //   1054: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1057: goto -> 1064
    //   1060: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1063: athrow
    //   1064: aload #58
    //   1066: iload #57
    //   1068: invokevirtual p : (Z)V
    //   1071: getstatic me/rerere/matrix/internal/pd.k : Z
    //   1074: ifeq -> 1312
    //   1077: new java/lang/StringBuilder
    //   1080: dup
    //   1081: invokespecial <init> : ()V
    //   1084: ldc_w '§7[§6Move§7] '
    //   1087: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1090: aload #50
    //   1092: invokeinterface getName : ()Ljava/lang/String;
    //   1097: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1100: ldc_w '-> move: '
    //   1103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1106: aload_3
    //   1107: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1110: aload_2
    //   1111: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1114: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   1117: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   1120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1123: ldc_w ', speed: '
    //   1126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1129: aload #58
    //   1131: invokevirtual m : ()D
    //   1134: invokestatic b : (D)D
    //   1137: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1140: ldc_w ', att: '
    //   1143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1146: aload #58
    //   1148: invokevirtual b : ()F
    //   1151: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1154: ldc_w ', ground: '
    //   1157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1160: iconst_2
    //   1161: newarray boolean
    //   1163: dup
    //   1164: iconst_0
    //   1165: iload #4
    //   1167: bastore
    //   1168: dup
    //   1169: iconst_1
    //   1170: iload #7
    //   1172: bastore
    //   1173: invokestatic b : ([Z)Ljava/lang/String;
    //   1176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1179: ldc_w ', yaw/pitch: '
    //   1182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1185: aload_3
    //   1186: invokevirtual getYaw : ()F
    //   1189: aload_2
    //   1190: invokevirtual getYaw : ()F
    //   1193: iload #33
    //   1195: swap
    //   1196: lload #34
    //   1198: dup2_x1
    //   1199: pop2
    //   1200: invokestatic b : (FIJF)F
    //   1203: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1206: ldc_w ','
    //   1209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1212: aload_3
    //   1213: invokevirtual getPitch : ()F
    //   1216: aload_2
    //   1217: invokevirtual getPitch : ()F
    //   1220: fsub
    //   1221: invokestatic abs : (F)F
    //   1224: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1227: ldc_w ', to: '
    //   1230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1233: aload_3
    //   1234: invokevirtual getY : ()D
    //   1237: invokestatic b : (D)D
    //   1240: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1243: ldc_w ', col_ent: '
    //   1246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1249: aload_2
    //   1250: invokestatic c : (Lorg/bukkit/Location;)Z
    //   1253: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   1256: ldc_w ', y: '
    //   1259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1262: aload_2
    //   1263: invokevirtual getY : ()D
    //   1266: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1269: ldc_w '->'
    //   1272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1275: aload_3
    //   1276: invokevirtual getY : ()D
    //   1279: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1282: ldc_w ', fall: '
    //   1285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1288: aload #50
    //   1290: invokeinterface getFallDistance : ()F
    //   1295: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   1298: invokevirtual toString : ()Ljava/lang/String;
    //   1301: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   1304: pop
    //   1305: goto -> 1312
    //   1308: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1311: athrow
    //   1312: iload #57
    //   1314: ifne -> 1387
    //   1317: aload_0
    //   1318: aload_1
    //   1319: aload_2
    //   1320: aload_3
    //   1321: aload #58
    //   1323: lload #27
    //   1325: invokespecial b : (Lorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/Location;Lorg/bukkit/Location;Lme/rerere/matrix/internal/ab;J)Z
    //   1328: istore #59
    //   1330: iload #59
    //   1332: ifeq -> 1387
    //   1335: aload #58
    //   1337: iconst_1
    //   1338: invokevirtual j : (Z)V
    //   1341: aload_0
    //   1342: getfield ea : Z
    //   1345: ifeq -> 1387
    //   1348: goto -> 1355
    //   1351: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1354: athrow
    //   1355: aload #58
    //   1357: invokevirtual m : ()D
    //   1360: ldc2_w 2.0
    //   1363: dcmpl
    //   1364: ifle -> 1387
    //   1367: goto -> 1374
    //   1370: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1373: athrow
    //   1374: aload #58
    //   1376: dconst_0
    //   1377: invokevirtual b : (D)V
    //   1380: goto -> 1387
    //   1383: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1386: athrow
    //   1387: aload #51
    //   1389: invokevirtual b : ()Lme/rerere/matrix/internal/ab;
    //   1392: astore #59
    //   1394: aload #59
    //   1396: ifnull -> 1434
    //   1399: aload_0
    //   1400: getfield w : Lme/rerere/matrix/internal/ik;
    //   1403: aload_2
    //   1404: aload_3
    //   1405: invokestatic j : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1408: aload #59
    //   1410: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   1413: aload #59
    //   1415: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   1418: invokevirtual distance : (Lorg/bukkit/util/Vector;)D
    //   1421: dsub
    //   1422: lload #45
    //   1424: invokevirtual b : (DJ)V
    //   1427: goto -> 1434
    //   1430: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1433: athrow
    //   1434: aload_0
    //   1435: getfield ea : Z
    //   1438: ifeq -> 1462
    //   1441: aload #58
    //   1443: invokevirtual j : ()Ljava/util/Set;
    //   1446: ldc_w 'force_setback'
    //   1449: invokeinterface add : (Ljava/lang/Object;)Z
    //   1454: pop
    //   1455: goto -> 1462
    //   1458: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1461: athrow
    //   1462: aload #52
    //   1464: getfield r : Z
    //   1467: ifeq -> 1552
    //   1470: aload_0
    //   1471: iconst_1
    //   1472: putfield za : Z
    //   1475: aload #58
    //   1477: invokevirtual p : ()Z
    //   1480: ifeq -> 1532
    //   1483: goto -> 1490
    //   1486: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1489: athrow
    //   1490: aload_3
    //   1491: lload #29
    //   1493: invokestatic p : (Lorg/bukkit/Location;J)Z
    //   1496: ifne -> 1532
    //   1499: goto -> 1506
    //   1502: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1505: athrow
    //   1506: aload_3
    //   1507: invokestatic t : (Lorg/bukkit/Location;)Z
    //   1510: ifne -> 1532
    //   1513: goto -> 1520
    //   1516: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1519: athrow
    //   1520: aload_0
    //   1521: iconst_1
    //   1522: putfield ea : Z
    //   1525: goto -> 1532
    //   1528: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1531: athrow
    //   1532: aload #52
    //   1534: getfield k : Z
    //   1537: ifeq -> 1552
    //   1540: aload_0
    //   1541: iconst_1
    //   1542: putfield ea : Z
    //   1545: goto -> 1552
    //   1548: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1551: athrow
    //   1552: aload #52
    //   1554: getfield v : Z
    //   1557: ifeq -> 1583
    //   1560: aload #52
    //   1562: iconst_0
    //   1563: putfield v : Z
    //   1566: aload_0
    //   1567: iconst_1
    //   1568: putfield za : Z
    //   1571: aload_0
    //   1572: iconst_1
    //   1573: putfield ea : Z
    //   1576: goto -> 1583
    //   1579: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1582: athrow
    //   1583: aload #58
    //   1585: invokevirtual m : ()D
    //   1588: ldc2_w 10.0
    //   1591: dcmpl
    //   1592: iflt -> 1702
    //   1595: aload #50
    //   1597: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   1602: getstatic org/bukkit/GameMode.SPECTATOR : Lorg/bukkit/GameMode;
    //   1605: if_acmpeq -> 1702
    //   1608: goto -> 1615
    //   1611: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1614: athrow
    //   1615: aload #50
    //   1617: invokeinterface isInsideVehicle : ()Z
    //   1622: ifne -> 1702
    //   1625: goto -> 1632
    //   1628: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1631: athrow
    //   1632: aload_0
    //   1633: lload #8
    //   1635: ldc_w 'move.tp'
    //   1638: new java/lang/StringBuilder
    //   1641: dup
    //   1642: invokespecial <init> : ()V
    //   1645: ldc_w 'teleport move: '
    //   1648: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1651: aload #58
    //   1653: invokevirtual m : ()D
    //   1656: invokestatic b : (D)D
    //   1659: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1662: invokevirtual toString : ()Ljava/lang/String;
    //   1665: bipush #35
    //   1667: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1670: aload_1
    //   1671: aload_2
    //   1672: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1675: aload #58
    //   1677: iconst_1
    //   1678: invokevirtual j : (Z)V
    //   1681: aload_0
    //   1682: iconst_0
    //   1683: putfield za : Z
    //   1686: aload_0
    //   1687: iconst_0
    //   1688: putfield ea : Z
    //   1691: aload #52
    //   1693: iconst_0
    //   1694: putfield r : Z
    //   1697: return
    //   1698: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1701: athrow
    //   1702: aload_3
    //   1703: invokevirtual getPitch : ()F
    //   1706: invokestatic abs : (F)F
    //   1709: ldc_w 90.0
    //   1712: fcmpl
    //   1713: ifle -> 1751
    //   1716: aload_1
    //   1717: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   1720: invokevirtual clone : ()Lorg/bukkit/Location;
    //   1723: astore #60
    //   1725: aload #60
    //   1727: fconst_0
    //   1728: invokevirtual setPitch : (F)V
    //   1731: aload_1
    //   1732: aload #60
    //   1734: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1737: aload_0
    //   1738: lload #8
    //   1740: ldc_w 'move.derp'
    //   1743: ldc_w 'pitch derp'
    //   1746: bipush #10
    //   1748: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1751: iload #57
    //   1753: ifeq -> 1916
    //   1756: aload #55
    //   1758: iconst_1
    //   1759: anewarray org/bukkit/Material
    //   1762: dup
    //   1763: iconst_0
    //   1764: invokestatic j : ()Lorg/bukkit/Material;
    //   1767: aastore
    //   1768: lload #21
    //   1770: dup2_x1
    //   1771: pop2
    //   1772: invokevirtual j : (J[Lorg/bukkit/Material;)Z
    //   1775: ifeq -> 1916
    //   1778: goto -> 1785
    //   1781: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1784: athrow
    //   1785: aload_0
    //   1786: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1789: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   1792: iload #16
    //   1794: i2b
    //   1795: lload #17
    //   1797: invokevirtual b : (BJ)Z
    //   1800: ifne -> 1916
    //   1803: goto -> 1810
    //   1806: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1809: athrow
    //   1810: aload #59
    //   1812: ifnull -> 1916
    //   1815: goto -> 1822
    //   1818: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1821: athrow
    //   1822: aload_2
    //   1823: aload_3
    //   1824: invokestatic j : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   1827: aload #59
    //   1829: invokevirtual b : ()Lorg/bukkit/util/Vector;
    //   1832: aload #59
    //   1834: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   1837: invokevirtual distance : (Lorg/bukkit/util/Vector;)D
    //   1840: dsub
    //   1841: dstore #60
    //   1843: dload #60
    //   1845: ldc2_w 0.52
    //   1848: dcmpl
    //   1849: ifle -> 1916
    //   1852: aload_0
    //   1853: lload #8
    //   1855: ldc_w 'move.webacel'
    //   1858: new java/lang/StringBuilder
    //   1861: dup
    //   1862: invokespecial <init> : ()V
    //   1865: ldc_w 'illegal web movement: '
    //   1868: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1871: dload #60
    //   1873: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1876: invokevirtual toString : ()Ljava/lang/String;
    //   1879: bipush #20
    //   1881: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1884: aload_1
    //   1885: aload_2
    //   1886: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   1889: aload #58
    //   1891: iconst_1
    //   1892: invokevirtual j : (Z)V
    //   1895: aload_0
    //   1896: iconst_0
    //   1897: putfield za : Z
    //   1900: aload_0
    //   1901: iconst_0
    //   1902: putfield ea : Z
    //   1905: aload #52
    //   1907: iconst_0
    //   1908: putfield r : Z
    //   1911: return
    //   1912: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1915: athrow
    //   1916: aload_0
    //   1917: getfield x : I
    //   1920: ifle -> 1950
    //   1923: aload_0
    //   1924: dup
    //   1925: getfield x : I
    //   1928: iconst_1
    //   1929: isub
    //   1930: putfield x : I
    //   1933: aload_0
    //   1934: iconst_1
    //   1935: putfield za : Z
    //   1938: aload_0
    //   1939: iconst_1
    //   1940: putfield ea : Z
    //   1943: goto -> 1950
    //   1946: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1949: athrow
    //   1950: aload_0
    //   1951: getfield za : Z
    //   1954: ifeq -> 2242
    //   1957: getstatic me/rerere/matrix/internal/in.ma : I
    //   1960: iflt -> 2242
    //   1963: goto -> 1970
    //   1966: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1969: athrow
    //   1970: aload_0
    //   1971: lload #25
    //   1973: invokevirtual j : (J)I
    //   1976: getstatic me/rerere/matrix/internal/in.ma : I
    //   1979: if_icmpge -> 2003
    //   1982: goto -> 1989
    //   1985: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1988: athrow
    //   1989: aload_0
    //   1990: getfield ea : Z
    //   1993: ifeq -> 2336
    //   1996: goto -> 2003
    //   1999: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2002: athrow
    //   2003: getstatic me/rerere/matrix/internal/in.ja : Z
    //   2006: ifeq -> 2134
    //   2009: goto -> 2016
    //   2012: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2015: athrow
    //   2016: lload #10
    //   2018: aload_2
    //   2019: invokestatic b : (JLorg/bukkit/Location;)Z
    //   2022: ifeq -> 2134
    //   2025: goto -> 2032
    //   2028: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2031: athrow
    //   2032: aload_2
    //   2033: lload #29
    //   2035: invokestatic p : (Lorg/bukkit/Location;J)Z
    //   2038: ifne -> 2134
    //   2041: goto -> 2048
    //   2044: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2047: athrow
    //   2048: iload #36
    //   2050: i2c
    //   2051: aload_2
    //   2052: iload #37
    //   2054: iload #38
    //   2056: i2c
    //   2057: invokestatic b : (CLorg/bukkit/Location;IC)Ljava/util/Optional;
    //   2060: invokevirtual isPresent : ()Z
    //   2063: ifne -> 2134
    //   2066: goto -> 2073
    //   2069: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2072: athrow
    //   2073: getstatic me/rerere/matrix/internal/in.n : Z
    //   2076: ifeq -> 2103
    //   2079: goto -> 2086
    //   2082: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2085: athrow
    //   2086: aload #50
    //   2088: ldc2_w 5.0
    //   2091: invokeinterface damage : (D)V
    //   2096: goto -> 2103
    //   2099: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2102: athrow
    //   2103: aload_3
    //   2104: invokevirtual getY : ()D
    //   2107: dconst_0
    //   2108: dcmpl
    //   2109: iflt -> 2126
    //   2112: aload #50
    //   2114: lload #23
    //   2116: invokestatic j : (Lorg/bukkit/entity/Player;J)V
    //   2119: goto -> 2336
    //   2122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2125: athrow
    //   2126: aload_1
    //   2127: aload_2
    //   2128: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2131: goto -> 2336
    //   2134: aload #52
    //   2136: getfield l : Lorg/bukkit/Location;
    //   2139: ifnull -> 2229
    //   2142: aload #52
    //   2144: getfield l : Lorg/bukkit/Location;
    //   2147: aload_0
    //   2148: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   2151: lload #12
    //   2153: invokestatic b : (Lorg/bukkit/Location;Lme/rerere/matrix/internal/yl;J)Z
    //   2156: ifeq -> 2216
    //   2159: goto -> 2166
    //   2162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2165: athrow
    //   2166: aload #52
    //   2168: getfield l : Lorg/bukkit/Location;
    //   2171: aload_2
    //   2172: invokestatic p : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   2175: ldc2_w 32.0
    //   2178: dcmpg
    //   2179: ifgt -> 2208
    //   2182: goto -> 2189
    //   2185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2188: athrow
    //   2189: aload_1
    //   2190: aload #52
    //   2192: getfield l : Lorg/bukkit/Location;
    //   2195: invokevirtual clone : ()Lorg/bukkit/Location;
    //   2198: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2201: goto -> 2336
    //   2204: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2207: athrow
    //   2208: aload_1
    //   2209: aload_2
    //   2210: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2213: goto -> 2336
    //   2216: lload #19
    //   2218: aload #50
    //   2220: getstatic me/rerere/matrix/internal/in.n : Z
    //   2223: invokestatic b : (JLorg/bukkit/entity/Player;Z)V
    //   2226: goto -> 2336
    //   2229: lload #19
    //   2231: aload #50
    //   2233: getstatic me/rerere/matrix/internal/in.n : Z
    //   2236: invokestatic b : (JLorg/bukkit/entity/Player;Z)V
    //   2239: goto -> 2336
    //   2242: aload #58
    //   2244: invokevirtual h : ()Z
    //   2247: ifne -> 2336
    //   2250: aload #58
    //   2252: invokevirtual p : ()Z
    //   2255: ifeq -> 2315
    //   2258: goto -> 2265
    //   2261: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2264: athrow
    //   2265: aload #52
    //   2267: getfield r : Z
    //   2270: ifne -> 2315
    //   2273: goto -> 2280
    //   2276: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2279: athrow
    //   2280: lload #39
    //   2282: aload_3
    //   2283: ldc2_w 0.30000001192092896
    //   2286: invokestatic b : (JLorg/bukkit/Location;D)Z
    //   2289: ifeq -> 2315
    //   2292: goto -> 2299
    //   2295: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2298: athrow
    //   2299: aload #52
    //   2301: aload_3
    //   2302: invokevirtual clone : ()Lorg/bukkit/Location;
    //   2305: putfield l : Lorg/bukkit/Location;
    //   2308: goto -> 2315
    //   2311: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2314: athrow
    //   2315: iload #57
    //   2317: ifeq -> 2336
    //   2320: aload #52
    //   2322: aload_3
    //   2323: invokevirtual clone : ()Lorg/bukkit/Location;
    //   2326: putfield l : Lorg/bukkit/Location;
    //   2329: goto -> 2336
    //   2332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2335: athrow
    //   2336: aload_0
    //   2337: iconst_0
    //   2338: putfield za : Z
    //   2341: aload_0
    //   2342: iconst_0
    //   2343: putfield ea : Z
    //   2346: aload #52
    //   2348: iconst_0
    //   2349: putfield r : Z
    //   2352: aload #58
    //   2354: invokevirtual j : ()Lorg/bukkit/util/Vector;
    //   2357: aload_1
    //   2358: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   2361: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   2364: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2367: ifne -> 2386
    //   2370: aload #58
    //   2372: aload_3
    //   2373: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   2376: invokevirtual b : (Lorg/bukkit/util/Vector;)V
    //   2379: goto -> 2386
    //   2382: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2385: athrow
    //   2386: aload #51
    //   2388: aload #58
    //   2390: lload #41
    //   2392: invokevirtual b : (Lme/rerere/matrix/internal/ab;J)V
    //   2395: return
    // Exception table:
    //   from	to	target	type
    //   241	255	258	java/lang/RuntimeException
    //   248	272	275	java/lang/RuntimeException
    //   300	332	332	java/lang/RuntimeException
    //   385	419	422	java/lang/RuntimeException
    //   426	443	446	java/lang/RuntimeException
    //   436	460	463	java/lang/RuntimeException
    //   450	477	480	java/lang/RuntimeException
    //   467	491	494	java/lang/RuntimeException
    //   484	506	509	java/lang/RuntimeException
    //   498	521	524	java/lang/RuntimeException
    //   513	538	541	java/lang/RuntimeException
    //   528	567	570	java/lang/RuntimeException
    //   545	578	578	java/lang/RuntimeException
    //   585	602	605	java/lang/RuntimeException
    //   609	626	629	java/lang/RuntimeException
    //   633	655	655	java/lang/RuntimeException
    //   659	676	679	java/lang/RuntimeException
    //   736	761	764	java/lang/RuntimeException
    //   751	782	785	java/lang/RuntimeException
    //   789	811	814	java/lang/RuntimeException
    //   833	846	849	java/lang/RuntimeException
    //   841	863	866	java/lang/RuntimeException
    //   894	912	915	java/lang/RuntimeException
    //   981	999	1002	java/lang/RuntimeException
    //   990	1057	1060	java/lang/RuntimeException
    //   1064	1305	1308	java/lang/RuntimeException
    //   1330	1348	1351	java/lang/RuntimeException
    //   1335	1367	1370	java/lang/RuntimeException
    //   1355	1380	1383	java/lang/RuntimeException
    //   1394	1427	1430	java/lang/RuntimeException
    //   1434	1455	1458	java/lang/RuntimeException
    //   1462	1483	1486	java/lang/RuntimeException
    //   1470	1499	1502	java/lang/RuntimeException
    //   1490	1513	1516	java/lang/RuntimeException
    //   1506	1525	1528	java/lang/RuntimeException
    //   1532	1545	1548	java/lang/RuntimeException
    //   1552	1576	1579	java/lang/RuntimeException
    //   1583	1608	1611	java/lang/RuntimeException
    //   1595	1625	1628	java/lang/RuntimeException
    //   1615	1698	1698	java/lang/RuntimeException
    //   1751	1778	1781	java/lang/RuntimeException
    //   1756	1803	1806	java/lang/RuntimeException
    //   1785	1815	1818	java/lang/RuntimeException
    //   1843	1912	1912	java/lang/RuntimeException
    //   1916	1943	1946	java/lang/RuntimeException
    //   1950	1963	1966	java/lang/RuntimeException
    //   1957	1982	1985	java/lang/RuntimeException
    //   1970	1996	1999	java/lang/RuntimeException
    //   1989	2009	2012	java/lang/RuntimeException
    //   2003	2025	2028	java/lang/RuntimeException
    //   2016	2041	2044	java/lang/RuntimeException
    //   2032	2066	2069	java/lang/RuntimeException
    //   2048	2079	2082	java/lang/RuntimeException
    //   2073	2096	2099	java/lang/RuntimeException
    //   2103	2122	2122	java/lang/RuntimeException
    //   2134	2159	2162	java/lang/RuntimeException
    //   2142	2182	2185	java/lang/RuntimeException
    //   2166	2204	2204	java/lang/RuntimeException
    //   2242	2258	2261	java/lang/RuntimeException
    //   2250	2273	2276	java/lang/RuntimeException
    //   2265	2292	2295	java/lang/RuntimeException
    //   2280	2308	2311	java/lang/RuntimeException
    //   2315	2329	2332	java/lang/RuntimeException
    //   2336	2379	2382	java/lang/RuntimeException
  }
  
  public void m() {
    long l = A ^ 0x770F4A235FA4L;
    ma = b().getInt("cancel_vl", 30);
    n = b().getBoolean("apply_damage", true);
    aa = b().getBoolean("check_noslow", true);
    ja = b().getBoolean("allow_setback_to_void", true);
    r = b().getBoolean("strict_kb_handling", false);
    fa = b().getBoolean("allow_bpe_bridge", false);
  }
  
  public void b(@NotNull PlayerChangedWorldEvent paramPlayerChangedWorldEvent, long paramLong) {
    (b().b()).l = null;
    b().b().b();
    b().b().j();
    (b().b()).f.b().clear();
  }
  
  public void j() {
    this.i = System.currentTimeMillis();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\in.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
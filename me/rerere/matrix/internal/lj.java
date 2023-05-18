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
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class lj extends zk {
  private static double y;
  
  private static boolean m;
  
  public static boolean o;
  
  private static boolean q;
  
  private static boolean t;
  
  private static boolean g;
  
  private static double a;
  
  private static int s;
  
  private static boolean u;
  
  private long w;
  
  private static final Predicate f;
  
  private static double l;
  
  private static boolean r;
  
  private static int x;
  
  private int z = 0;
  
  private static int k;
  
  @Nullable
  private f v;
  
  private static int b;
  
  private static final Map i;
  
  private static boolean c;
  
  private static final long d = o3.a(7491559841905240301L, 9044562750424089999L, MethodHandles.lookup().lookupClass()).a(194204622608168L);
  
  private static final String[] e;
  
  private static final String[] h;
  
  private static final Map j = new HashMap<>(13);
  
  public lj(yl paramyl) {
    super(paramyl);
    b(yk.n);
  }
  
  static {
    Q(true);
    long l = d ^ 0x568D8CB63D22L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[16];
    boolean bool = false;
    String str;
    int i = (str = "DüzÀ§±\021ána¦ÈÈ_Y'7ÊyÄN\035Û!\022\013ìr=\027\b\031óÃìv±\r\031£ú\033ÁÒì@?^¢\\ÚCMêÑY\005\004:Zæ\003rfÈw\020\020\024õ0£tÍã¼|E3\\c\004uÞË%Äû*sN\007\034ý#-\031À¹94.kMu°ôÓ,òÕHÇ6L\0028Ô¿òQ ¶SM\007Âå[\022Ö\001!¾nç»\tÈ÷u[ºÕÊñ4¯ø¸5µ>ìÛÔß2Hb}\006Ü©i¡zÖåÄ\000Zr\003\005@î\002B\002!G¡2 ìK]Á\b¦\b$.®`ç­w \032\f\\É\"-ÆNýCË<p¢\033ÍÈtñC97KOT\034¥\002­]H7\b¸zH\t©%­6F\004§\030Tà0.Ï\027Ç\005y¦³-6.°µõz\022ÑOw×Á\026#|ÈµáN¶ª+È&N\t]\032\027sWöx÷wªI\032H»h_Qiû\026½¼ÆäïHêtä¶Pt\003ÂË{w.\nEògl\rkUùÚj\013\006¾OTKEL?Î\000*ºq¨ÚÁ\026H\001nôkÒE\023ª8JIv\024Êú¤÷Ì¼ô«Mßylù^ ý(Ñ./\002Îãì[èi\027\022@/ÔÉü\033®\"[\\ç´í?q\037(ÃÓ\0055Kÿ\032¿è¹biè¿'\005Úqï£¸Á*ÃiªÙ\024õç?\030î\"\tà\0270W\bÝî¶\032 ãðáJî»;IÍÏK!\022TÃ.BÐ¹ÚW::ú8\016~¢¶-þáR2\020\030²^¢yG®!)buðó\004sH;ZCK\022È\rüP\025U\017\0177ºçs>Ý?[\024Ì°*®Ê\\vH9?Ó\003MÌQë&¿>\033]ç!¡}EâÇzÄ.ÍÄYFìÚ4ç0ð{\"S'l\b³ÄdRÕ\031\003Ú/).ü©Q\016ôA\003AÛÑ)^\021Xê}ÈØI\bõÖP+ma'(?e;ko·{¤c-)ÅèlPÚCmû\021n\025\n÷Ô@F\"5Í_0ªj­jõïÛØi9ðÒTPãíÖY¼yBÿBnº2W\016×5\003Ja\f'|\017").length();
    byte b2 = 80;
    byte b = -1;
    while (true);
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    long l1 = paramLong ^ 0x53C8876CB5DBL;
    long l2 = paramLong ^ 0x7F458C26B739L;
    long l3 = paramLong ^ 0x65C398162F57L;
    long l4 = paramLong ^ 0x19AD0899EB6L;
    long l5 = paramLong ^ 0x634CACC20D02L;
    try {
      if (!o)
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramEntityDamageByEntityEvent.getCause() != EntityDamageEvent.DamageCause.ENTITY_ATTACK)
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (ia.j() < 19.0D)
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (this.v == null && !r) {
        Player player = (Player)paramEntityDamageByEntityEvent.getDamager();
        Location location = player.getLocation();
        if (paramEntityDamageByEntityEvent.getEntityType() == EntityType.PLAYER) {
          String str = paramEntityDamageByEntityEvent.getEntity().getName();
          try {
          
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          this.v = new f(player, str, UUID.randomUUID(), oa.b(!t, l2), b(location.clone()));
        } else {
          String str = oa.b(l1);
          try {
          
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          } 
          this.v = new f(player, str, UUID.randomUUID(), oa.b(!t, l2), b(location.clone()));
        } 
        try {
        
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        try {
          this.v.v = !q;
          this.v.w = true;
          this.v.h(l4);
          this.v.t(l5);
          if (q)
            this.v.m(l3); 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        this.z = k;
        return;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.z += s;
  }
  
  public void b(@NotNull PlayerChangedWorldEvent paramPlayerChangedWorldEvent, long paramLong) {
    long l = paramLong ^ 0x2F03E6F12CF5L;
    try {
      if (this.v != null) {
        this.z = 0;
        this.v.i(l);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l1 = d ^ 0x3555C52A4974L;
    long l2 = l1 ^ 0x1C9B11D10328L;
    long l3 = l1 ^ 0x42F2612C3B00L;
    long l4 = l1 ^ 0x32DF501F3087L;
    long l5 = l1 ^ 0x71AD996A7EC2L;
    try {
      if (this.z > 0)
        try {
          if (this.v != null)
            if (g) {
              Location location = b(paramLocation2.clone());
              location.setPitch((float)(Math.random() * 30.0D - 0.5D));
              location.setYaw((float)(location.getYaw() + Math.random()));
              boolean bool = za.p(location, l2);
              Matrix.b().b().b(() -> {
                    long l1 = d ^ 0x3576F3B8C53EL;
                    long l2 = l1 ^ 0x42D157BEB74AL;
                    long l3 = l1 ^ 0x32FC668DBCCDL;
                    long l4 = l1 ^ 0x718EAFF8F288L;
                    try {
                      if (this.v == null)
                        return; 
                    } catch (NullPointerException nullPointerException) {
                      throw a(null);
                    } 
                    try {
                      this.v.b(paramLocation, l2, paramBoolean);
                      double d = Math.random();
                      try {
                        if (d < 0.1D)
                          this.v.t(l4); 
                      } catch (NullPointerException nullPointerException) {
                        throw a(null);
                      } 
                      try {
                        if (d < 0.3D) {
                          try {
                          
                          } catch (NullPointerException nullPointerException) {
                            throw a(null);
                          } 
                          this.v.b(!this.v.w, l3);
                        } 
                      } catch (NullPointerException nullPointerException) {
                        throw a(null);
                      } 
                    } catch (NullPointerException nullPointerException) {}
                  });
            } else {
              Location location = b(paramLocation2.clone());
              location.setPitch((float)(Math.random() * 30.0D - 0.5D));
              location.setYaw((float)(location.getYaw() + Math.random()));
              boolean bool = za.p(location, l2);
              this.v.b(location, l3, bool);
              double d = Math.random();
              try {
                if (d < 0.1D)
                  this.v.t(l5); 
              } catch (NullPointerException nullPointerException) {
                throw a(null);
              } 
              try {
                if (d < 0.3D) {
                  try {
                  
                  } catch (NullPointerException nullPointerException) {
                    throw a(null);
                  } 
                  this.v.b(!this.v.w, l4);
                } 
              } catch (NullPointerException nullPointerException) {
                throw a(null);
              } 
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public void b(int paramInt1, int paramInt2) {
    long l1 = paramInt1 << 32L | paramInt2 << 32L >>> 32L;
    long l2 = l1 ^ 0x11702A78089FL;
    long l3 = l1 ^ 0xDC6450D2B19L;
    long l4 = l1 ^ 0x52966C13605L;
    long l5 = l1 ^ 0x1FAF72F1AE6BL;
    int i = (int)((l1 ^ 0x38F8E5CB63B6L) >>> 32L);
    int j = (int)((l1 ^ 0x38F8E5CB63B6L) << 32L >>> 56L);
    int k = (int)((l1 ^ 0x38F8E5CB63B6L) << 40L >>> 40L);
    l1 ^ 0x38F8E5CB63B6L;
    long l6 = l1 ^ 0x7BF63A6E1F8AL;
    long l7 = l1 ^ 0x3A0BC9E226E9L;
    long l8 = l1 ^ 0x192046258C3EL;
    try {
      if (this.v != null)
        try {
          if (this.z > 0)
            try {
              if (--this.z == 0) {
                this.v.i(l2);
                this.v = null;
              } 
            } catch (NullPointerException nullPointerException) {
              throw a(null);
            }  
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    if (i.size() > 0) {
      Player player = b().j(i, (byte)j, k);
      if (i.containsKey(player)) {
        int m = ((Integer)i.get(player)).intValue();
        try {
          i.remove(player);
          if (this.v != null) {
            this.v.i(l2);
            this.v = null;
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        try {
        
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        this.v = new f(player, b(player, l7), UUID.randomUUID(), oa.b(!t, l4), j(player.getLocation().clone()));
        try {
          this.v.v = !q;
          this.v.w = true;
          this.v.h(l6);
          this.v.t(l8);
          if (q) {
            this.v.m(l5);
          } else {
            this.v.b(l3, new PotionEffect(PotionEffectType.INVISIBILITY, 2147483647, 0, false, false));
          } 
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        this.z = m;
      } 
    } 
  }
  
  public static void b(Player paramPlayer, int paramInt) {
    i.put(paramPlayer, Integer.valueOf(paramInt));
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 57264538460161
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 25653092024530
    //   12: lxor
    //   13: lstore #7
    //   15: pop2
    //   16: aload_0
    //   17: getfield v : Lme/rerere/matrix/internal/f;
    //   20: ifnull -> 161
    //   23: aload_1
    //   24: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   27: if_acmpne -> 161
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   36: athrow
    //   37: lload #5
    //   39: aload #4
    //   41: invokestatic b : (JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   44: ifeq -> 161
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   53: athrow
    //   54: aload #4
    //   56: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   59: iconst_0
    //   60: invokevirtual read : (I)Ljava/lang/Object;
    //   63: checkcast java/lang/Integer
    //   66: invokevirtual intValue : ()I
    //   69: istore #9
    //   71: iload #9
    //   73: aload_0
    //   74: getfield v : Lme/rerere/matrix/internal/f;
    //   77: invokevirtual b : ()I
    //   80: if_icmpne -> 161
    //   83: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   86: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   89: aload_0
    //   90: <illegal opcode> run : (Lme/rerere/matrix/internal/lj;)Ljava/lang/Runnable;
    //   95: invokeinterface runTaskAsynchronously : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;)Lorg/bukkit/scheduler/BukkitTask;
    //   100: pop
    //   101: aload_0
    //   102: lload #7
    //   104: sipush #16133
    //   107: ldc2_w 3885444389351712356
    //   110: lload_2
    //   111: lxor
    //   112: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   117: sipush #158
    //   120: ldc2_w 1363380308945820153
    //   123: lload_2
    //   124: lxor
    //   125: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   130: getstatic me/rerere/matrix/internal/lj.x : I
    //   133: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   136: aload_0
    //   137: dup
    //   138: getfield z : I
    //   141: getstatic me/rerere/matrix/internal/lj.b : I
    //   144: iadd
    //   145: putfield z : I
    //   148: aload_0
    //   149: invokestatic currentTimeMillis : ()J
    //   152: putfield w : J
    //   155: iconst_1
    //   156: ireturn
    //   157: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   160: athrow
    //   161: iconst_0
    //   162: ireturn
    // Exception table:
    //   from	to	target	type
    //   16	30	33	java/lang/NullPointerException
    //   23	47	50	java/lang/NullPointerException
    //   71	157	157	java/lang/NullPointerException
  }
  
  public void h(long paramLong, byte paramByte) {
    long l1 = (paramLong << 8L | paramByte << 56L >>> 56L) ^ d;
    long l2 = l1 ^ 0x37811002A7F7L;
    try {
      if (this.v != null) {
        this.v.i(l2);
        this.v = null;
        this.z = 0;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/lj.d : J
    //   3: ldc2_w 84460810169642
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: astore_3
    //   13: aload_3
    //   14: sipush #19058
    //   17: ldc2_w 5263504691471466468
    //   20: lload_1
    //   21: lxor
    //   22: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   27: iconst_5
    //   28: invokeinterface getInt : (Ljava/lang/String;I)I
    //   33: putstatic me/rerere/matrix/internal/lj.x : I
    //   36: aload_3
    //   37: sipush #7204
    //   40: ldc2_w 6642870693205207476
    //   43: lload_1
    //   44: lxor
    //   45: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   50: iconst_1
    //   51: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   56: putstatic me/rerere/matrix/internal/lj.o : Z
    //   59: aload_3
    //   60: sipush #14506
    //   63: ldc2_w 2455643019951197497
    //   66: lload_1
    //   67: lxor
    //   68: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   73: ldc2_w 3.0
    //   76: invokeinterface getDouble : (Ljava/lang/String;D)D
    //   81: putstatic me/rerere/matrix/internal/lj.a : D
    //   84: aload_3
    //   85: sipush #472
    //   88: ldc2_w 5611278472443688009
    //   91: lload_1
    //   92: lxor
    //   93: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   98: dconst_1
    //   99: invokeinterface getDouble : (Ljava/lang/String;D)D
    //   104: putstatic me/rerere/matrix/internal/lj.y : D
    //   107: aload_3
    //   108: sipush #1846
    //   111: ldc2_w 4551097739092849325
    //   114: lload_1
    //   115: lxor
    //   116: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   121: ldc2_w 2.0
    //   124: invokeinterface getDouble : (Ljava/lang/String;D)D
    //   129: putstatic me/rerere/matrix/internal/lj.l : D
    //   132: aload_3
    //   133: sipush #24289
    //   136: ldc2_w 1379366177620011900
    //   139: lload_1
    //   140: lxor
    //   141: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   146: iconst_1
    //   147: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   152: putstatic me/rerere/matrix/internal/lj.g : Z
    //   155: aload_3
    //   156: sipush #13447
    //   159: ldc2_w 1056798740182155547
    //   162: lload_1
    //   163: lxor
    //   164: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   169: iconst_1
    //   170: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   175: putstatic me/rerere/matrix/internal/lj.t : Z
    //   178: aload_3
    //   179: sipush #2823
    //   182: ldc2_w 832858439075266200
    //   185: lload_1
    //   186: lxor
    //   187: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   192: iconst_0
    //   193: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   198: putstatic me/rerere/matrix/internal/lj.r : Z
    //   201: aload_3
    //   202: sipush #14425
    //   205: ldc2_w 2122724739924053440
    //   208: lload_1
    //   209: lxor
    //   210: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   215: bipush #100
    //   217: invokeinterface getInt : (Ljava/lang/String;I)I
    //   222: putstatic me/rerere/matrix/internal/lj.k : I
    //   225: aload_3
    //   226: sipush #7902
    //   229: ldc2_w 7560873379138988875
    //   232: lload_1
    //   233: lxor
    //   234: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   239: bipush #40
    //   241: invokeinterface getInt : (Ljava/lang/String;I)I
    //   246: putstatic me/rerere/matrix/internal/lj.s : I
    //   249: aload_3
    //   250: sipush #22920
    //   253: ldc2_w 9125740426669239322
    //   256: lload_1
    //   257: lxor
    //   258: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   263: bipush #50
    //   265: invokeinterface getInt : (Ljava/lang/String;I)I
    //   270: putstatic me/rerere/matrix/internal/lj.b : I
    //   273: aload_3
    //   274: sipush #11015
    //   277: ldc2_w 6214290388028481181
    //   280: lload_1
    //   281: lxor
    //   282: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   287: iconst_1
    //   288: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   293: putstatic me/rerere/matrix/internal/lj.q : Z
    //   296: aload_3
    //   297: sipush #7346
    //   300: ldc2_w 7221217076038625573
    //   303: lload_1
    //   304: lxor
    //   305: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   310: iconst_0
    //   311: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   316: putstatic me/rerere/matrix/internal/lj.u : Z
    //   319: aload_3
    //   320: sipush #30726
    //   323: ldc2_w 8665936648709639570
    //   326: lload_1
    //   327: lxor
    //   328: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   333: iconst_0
    //   334: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   339: putstatic me/rerere/matrix/internal/lj.m : Z
    //   342: return
  }
  
  public static void Q(boolean paramBoolean) {
    c = paramBoolean;
  }
  
  public static boolean J() {
    return c;
  }
  
  public static boolean K() {
    boolean bool = J();
    try {
      if (!bool)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4A50;
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
        throw new RuntimeException("me/rerere/matrix/internal/lj", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = e[i].getBytes("ISO-8859-1");
      h[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return h[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/lj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\lj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
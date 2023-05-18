package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class zm extends zk {
  private static int y;
  
  private int m;
  
  private static int o;
  
  @Nullable
  private wl q;
  
  private static int t;
  
  private static boolean g;
  
  private boolean a;
  
  private static int s;
  
  private static int u;
  
  private static int w;
  
  private int f;
  
  private static int l;
  
  private final h r;
  
  private static vm x;
  
  private static int z;
  
  private final oc k;
  
  private static int v;
  
  private static double b;
  
  private final oc i;
  
  private static final long c = o3.a(5157335857711996031L, 8045041050615014286L, MethodHandles.lookup().lookupClass()).a(88650463160180L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    long l1 = paramLong ^ 0x2C84FB240212L;
    long l2 = paramLong ^ 0x713E5DC64AE9L;
    int i = (int)((paramLong ^ 0x177AA8302EF2L) >>> 56L);
    long l3 = (paramLong ^ 0x177AA8302EF2L) << 8L >>> 8L;
    paramLong ^ 0x177AA8302EF2L;
    long l4 = paramLong ^ 0x517EA953286CL;
    Player player = b((byte)i, l3);
    Entity entity = paramEntityDamageByEntityEvent.getEntity();
    try {
      this.f = 20;
      if (entity instanceof LivingEntity)
        try {
          if (!player.isInsideVehicle())
            try {
              if (paramEntityDamageByEntityEvent.getCause() == EntityDamageEvent.DamageCause.ENTITY_ATTACK)
                if (entity instanceof Player) {
                  Player player1 = (Player)entity;
                  try {
                    if (player1.isOnline())
                      b(player, (LivingEntity)player1, l4); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                } else {
                  LivingEntity livingEntity = (LivingEntity)entity;
                  try {
                    if (livingEntity.getType() != EntityType.SLIME) {
                      try {
                        if (livingEntity.getType() != EntityType.ARMOR_STAND) {
                          try {
                            if (livingEntity.getType() == EntityType.ENDER_DRAGON)
                              return; 
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                        } else {
                          return;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                    } else {
                      return;
                    } 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  try {
                    if (b.b() > 8)
                      try {
                        if (livingEntity.getType() == EntityType.SHULKER)
                          return; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      }  
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  try {
                    this.r.b(livingEntity, l2);
                    if (this.r.b() > 10)
                      b(player, livingEntity, l4); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
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
    try {
      if (this.a)
        try {
          if (j(l1) >= z) {
            try {
              this.a = false;
              if (x == vm.v)
                paramEntityDamageByEntityEvent.setDamage(0.0D); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (x == vm.b)
                paramEntityDamageByEntityEvent.setCancelled(true); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public oc b() {
    return this.i;
  }
  
  public void b(long paramLong, @NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 124219204002291
    //   5: lxor
    //   6: lstore #4
    //   8: pop2
    //   9: invokestatic b : ()I
    //   12: bipush #9
    //   14: if_icmple -> 204
    //   17: aload_3
    //   18: invokevirtual getEntityType : ()Lorg/bukkit/entity/EntityType;
    //   21: getstatic org/bukkit/entity/EntityType.ENDER_CRYSTAL : Lorg/bukkit/entity/EntityType;
    //   24: if_acmpne -> 204
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: aload_3
    //   35: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   38: checkcast org/bukkit/entity/Player
    //   41: astore #6
    //   43: aload_3
    //   44: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   47: astore #7
    //   49: aload #6
    //   51: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   56: aload #7
    //   58: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   63: invokevirtual distance : (Lorg/bukkit/Location;)D
    //   66: dstore #8
    //   68: dload #8
    //   70: ldc2_w 5.0
    //   73: aload #6
    //   75: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   80: getstatic org/bukkit/GameMode.CREATIVE : Lorg/bukkit/GameMode;
    //   83: if_acmpne -> 94
    //   86: dconst_1
    //   87: goto -> 95
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: dconst_0
    //   95: dadd
    //   96: dcmpl
    //   97: ifle -> 204
    //   100: aload_0
    //   101: lload #4
    //   103: sipush #10544
    //   106: ldc2_w 3743409161528610762
    //   109: lload_1
    //   110: lxor
    //   111: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   116: new java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial <init> : ()V
    //   123: sipush #18655
    //   126: ldc2_w 2493994521234402869
    //   129: lload_1
    //   130: lxor
    //   131: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   136: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload #7
    //   141: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   146: invokevirtual name : ()Ljava/lang/String;
    //   149: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: sipush #23647
    //   158: ldc2_w 8337287714429532856
    //   161: lload_1
    //   162: lxor
    //   163: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: dload #8
    //   173: invokestatic b : (D)D
    //   176: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   179: ldc_w ')'
    //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: invokevirtual toString : ()Ljava/lang/String;
    //   188: iconst_5
    //   189: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   192: aload_3
    //   193: iconst_1
    //   194: invokevirtual setCancelled : (Z)V
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   203: athrow
    //   204: return
    // Exception table:
    //   from	to	target	type
    //   9	27	30	java/lang/RuntimeException
    //   68	90	90	java/lang/RuntimeException
    //   95	197	200	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l1 = c ^ 0x75B223E6CEF4L;
    long l2 = l1 ^ 0x23373B3E7FBCL;
    if (this.q != null) {
      Location location = paramLocation1.clone();
      location.setYaw(paramLocation2.getYaw());
      location.setPitch(paramLocation2.getPitch());
      b(this.q, location, l2, true);
      this.q = null;
      this.m = 0;
    } 
  }
  
  public void b(int paramInt1, int paramInt2) {
    long l1 = paramInt1 << 32L | paramInt2 << 32L >>> 32L;
    long l2 = l1 ^ 0x4BBAE4718D40L;
    long l3 = l1 ^ 0x7BC9F989A5B0L;
    try {
      if (this.f > 0)
        try {
          this.f--;
          if (this.f <= 0)
            this.r.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.r.b(l3);
      if (this.q != null) {
        try {
          this.m++;
          if (this.m >= 2) {
            b(this.q, wl.b(this.q), l2, false);
            this.q = null;
            this.m = 0;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        this.m = 0;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/zm.c : J
    //   3: ldc2_w 13430200920746
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 14344862353634
    //   13: lxor
    //   14: lstore_3
    //   15: pop2
    //   16: aload_0
    //   17: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   20: sipush #12335
    //   23: ldc2_w 166749443494927108
    //   26: lload_1
    //   27: lxor
    //   28: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   33: ldc2_w 3.1
    //   36: invokeinterface getDouble : (Ljava/lang/String;D)D
    //   41: putstatic me/rerere/matrix/internal/zm.b : D
    //   44: aload_0
    //   45: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   48: sipush #24401
    //   51: ldc2_w 7270110312525902933
    //   54: lload_1
    //   55: lxor
    //   56: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   61: iconst_3
    //   62: invokeinterface getInt : (Ljava/lang/String;I)I
    //   67: putstatic me/rerere/matrix/internal/zm.y : I
    //   70: aload_0
    //   71: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   74: sipush #8535
    //   77: ldc2_w 1469082365382773360
    //   80: lload_1
    //   81: lxor
    //   82: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   87: iconst_2
    //   88: invokeinterface getInt : (Ljava/lang/String;I)I
    //   93: putstatic me/rerere/matrix/internal/zm.w : I
    //   96: aload_0
    //   97: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   100: sipush #32320
    //   103: ldc2_w 7399732854987822442
    //   106: lload_1
    //   107: lxor
    //   108: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   113: bipush #10
    //   115: invokeinterface getInt : (Ljava/lang/String;I)I
    //   120: putstatic me/rerere/matrix/internal/zm.v : I
    //   123: aload_0
    //   124: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   127: sipush #7678
    //   130: ldc2_w 5114882378934613706
    //   133: lload_1
    //   134: lxor
    //   135: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   140: iconst_3
    //   141: invokeinterface getInt : (Ljava/lang/String;I)I
    //   146: putstatic me/rerere/matrix/internal/zm.o : I
    //   149: aload_0
    //   150: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   153: sipush #30145
    //   156: ldc2_w 7277694054321266417
    //   159: lload_1
    //   160: lxor
    //   161: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   166: iconst_1
    //   167: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   172: putstatic me/rerere/matrix/internal/zm.g : Z
    //   175: aload_0
    //   176: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   179: sipush #8197
    //   182: ldc2_w 4060435477543963455
    //   185: lload_1
    //   186: lxor
    //   187: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   192: bipush #10
    //   194: invokeinterface getInt : (Ljava/lang/String;I)I
    //   199: putstatic me/rerere/matrix/internal/zm.u : I
    //   202: aload_0
    //   203: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   206: sipush #3298
    //   209: ldc2_w 8275597532888065994
    //   212: lload_1
    //   213: lxor
    //   214: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   219: iconst_3
    //   220: invokeinterface getInt : (Ljava/lang/String;I)I
    //   225: putstatic me/rerere/matrix/internal/zm.l : I
    //   228: aload_0
    //   229: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   232: sipush #4306
    //   235: ldc2_w 6532500615678950388
    //   238: lload_1
    //   239: lxor
    //   240: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   245: bipush #15
    //   247: invokeinterface getInt : (Ljava/lang/String;I)I
    //   252: putstatic me/rerere/matrix/internal/zm.t : I
    //   255: aload_0
    //   256: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   259: sipush #3861
    //   262: ldc2_w 1130767824688866348
    //   265: lload_1
    //   266: lxor
    //   267: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   272: bipush #15
    //   274: invokeinterface getInt : (Ljava/lang/String;I)I
    //   279: putstatic me/rerere/matrix/internal/zm.s : I
    //   282: aload_0
    //   283: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   286: sipush #13933
    //   289: ldc2_w 8853803454008909160
    //   292: lload_1
    //   293: lxor
    //   294: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   299: sipush #3619
    //   302: ldc2_w 5696002352944538893
    //   305: lload_1
    //   306: lxor
    //   307: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   312: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   317: lload_3
    //   318: dup2_x1
    //   319: pop2
    //   320: invokestatic b : (JLjava/lang/String;)Lme/rerere/matrix/internal/vm;
    //   323: putstatic me/rerere/matrix/internal/zm.x : Lme/rerere/matrix/internal/vm;
    //   326: aload_0
    //   327: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   330: sipush #7382
    //   333: ldc2_w 4866500555048384491
    //   336: lload_1
    //   337: lxor
    //   338: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   343: iconst_5
    //   344: invokeinterface getInt : (Ljava/lang/String;I)I
    //   349: putstatic me/rerere/matrix/internal/zm.z : I
    //   352: return
  }
  
  public zm(yl paramyl, long paramLong) {
    super(paramyl);
    this.i = new oc(Double.class, l, 10);
    this.m = 0;
    this.r = new h();
    this.k = new oc(fi.class, l, 50);
    this.a = false;
    b(yk.e);
  }
  
  static {
    long l = c ^ 0x32990F61D2BAL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[37];
    boolean bool = false;
    String str;
    int i = (str = "ÁÉ_m\006¸B\007ðg«³\025T-)'âÈä8ÍÓÄæÎ1PÕ\002Ãx =cÛÎËûºÏËwæç(>ílìDoÄºô\005ãÛ³ÐvamL3\007Ù³9Ø\0338C$¹d]ßt5íMSw(\037vþ\031\000øM¯Ê\0057=PÅ«ÏZã}\013mÎùØlYî¦8=sô\023 m_Ñ#ÎÒ\0220Fã®\017ê|\004ÀLÈÔ\035§Oì÷öK)\001 ¹¸1ð\027Ì9»æ^jZÛwa¨\004Þo£ôgYÌ\013h«j\020Ö\002ä{D#ý,iÎêÏ\036(0ÀTÐbÞ\025iî¯ë}°\021.$\"¿ìÑã4\027ÒHâ³ôPûá[ÏÛþ\n+ìý \0359[Òj@ÿFE\023\033â#Bîö\000\034\000ÝÎðì\"¯å²H¬4£:\007\016\025ig\003\016[:FEgQllÚö\n&`\007Æ{\025ö}*\002!X¹êE\020õö\024.\031·Ñ7,=Ûq|Õ¾\020åÇõø~ÓÍÿ]\005Õ×Ñ \005XøÈ\022;qäë³û\023/*Ñë7(@XÌ\026ìÿ!8 wNT\033Pë\007Âa£òó\0042(­³\0229JÎILdÃÖ!\023 ÆÔfB~¹í Cßju&|#\002B\022ï@JJ!r¯£1t@Ñ9ôÌ5NXy[Öð|ùj\nÜºÂ¤\007­þÔ\fªò\006öce|dû¥\002\013¢*£ö\005\022GÕ|é=¡óø¦|]*H¸\020éÀÙA\007é¹)o\027\021%ý(ß¢\017(!ÒûËxûÛ\016\001ï\016T\022Ç\025¶óä\036Ó\030¯SeííÁj`\025!ç©Ðlõ%?(\031V{÷ÝÄÃÜÂÖëù\nÕÚq\n\021Btè6M/\tït¸!¼!ZöxÏ¾Ð¿¬\024\026V®Ê¿\027J1ý\021\032\003%k\rLGg8\001Uy$pz~¶0NCUý\026-\020«Û±Óçg\034÷\021Ú%¸ðÔ8ø\006.2\027\026.î\030­{4Û Þûòñ\tÁtÇ$eæùÌrºö,\000^ÅG\0165V\007\030Îªòqp\007÷ -ð|0ßÁü(\037;­Xs02°\000ÏõZ\027ñU\036àæWºw*x0E_PÈa¡\0166F»\005ü¦a¿¯§ Åc¡á®æÌD\035­\032¯½\037î!m¨:\006ÿ\030Ñ#ÕæMÕ\005Hå=U¸JÙWa\035â\023\035\\PÆî¾ã\025øß®M,jV[B§)\n\n\n¼¹\017GÀ\f²s\034Õ²®2n\023åVx\\¢\034\0371r\023M\022\020øÁ&\rÝqÎ\022NE·0\nº(ìÿÔ1\032ÃäÚÔÖ\005ñqX1\037}kÍY\001êÈ¸Uo_¢ìëV8f \000S\020\031£+\0042·³H\023£ê\004msvÎ{%w\r\017\b\002°¢(Vg\034)/`3ªêÒÆÌ\017 °ö®T\026ÿ·¿ê5ÜÑºå#«µAÕÔA¡A\025 çn¹öÏ'ÇÏ#«}%ïþÐ;Ê\034a\005|i\bÃhï®\034A8*ÞÂTd\035j©+Qdénå\037¥ al§I«\022Ïo+\004\016\fô×:Ö\030P±`\025½ÛzÂ\016Õ\bÛ-ë®oä8¤tè'\004\027p \025(\f£PdÅ~¯ª¡°M\033«\006©[:Vëýï»oÂÊãµ>¾\fÐE1+5\004(\034³ÛãøyÙ¥Ôá\025h\031\021²è\026\021ÝÙàdä^ b9þO>°¯\b\030OC·²*\"ìfù Ðä\022ýÊÈùe¡D #fãÉo½Of%d·[Ù×÷uàíè\021ö«\023*¬- b<\002Ú- ^>R¥kA<\\£ãCßè¥4ÆB\013äkÿ\020\016_J2LO4k)°pI\030à^Ñwdu%_\022\020Ãððÿ\036û^1").length();
    byte b2 = 48;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x54E6;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])h.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          h.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/zm", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/zm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\zm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
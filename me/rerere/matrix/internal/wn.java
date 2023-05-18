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
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

@Deprecated
public class wn extends zk {
  private long t;
  
  private int g;
  
  private long a;
  
  private long s;
  
  private long u;
  
  private static boolean w;
  
  private boolean f;
  
  private static int l;
  
  private long r;
  
  private long x;
  
  private long z;
  
  private long k;
  
  private double v;
  
  private double b;
  
  private long i;
  
  private static final long c = o3.a(6376895085152901195L, 6413632441106394696L, MethodHandles.lookup().lookupClass()).a(183153089726860L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  static {
    long l = c ^ 0x713E85246690L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[57];
    boolean bool = false;
    String str;
    int i = (str = "CÊÍæ/ñÐÊ¥½½\016 ÿ\nó\025 òöÑóªjA\fæéTlÃx²\025\\º$\037OD¥\020Båa\037Â\004®?\fµ\001ûáXÒ\031Ý?@9¯üè>W¢sÎ$ö!?\032Ôãn¤eÄ\000¥\\Ôü\t.\006MÉ|OÆ/%Ié,\031kßk\037/3B!8bBäx\017S\002Ò\026k»ô\003\017u¾\036ñ9A÷z96r:\030íMû(H¡ÈD9¯øÀo\"<\020A\016Z{´ þ©üÒEÈMÿÃêãK7æ¨ç¢s8®¥\017kàë}(¢R}\020§\030ë\005Â1³­0w\021Lç\024R/Ph&²Á7YéÑ\bZ÷EËKtßºG^¶²'TÂ¨?;á\013Ü¤'¸1ÝºZ%\022¹²Vóº{4GsãyúbÖxC¦nÞº-ï\tGwà¬\f#Åªt#²×\020T%§`½ÄZ\031¤5X8|!6ß.PJ0dN+òD£\031b;«B(X½h©¸çðô?Kf]2¥¢C\006\007\032bwr2%3!]E\030\n\"\034IÄ¹\035:J\006j¿ýW\005¸&DcØè@\020\016\r)X|*ê½v¸]b\0135§ÔõbÐÄß-½}$Ü\023\r\000òîÙ?\004¶\026-\021\027ÃßÕIcèô\013n¸â«\020^²£\020£1m]hIKí&\036óq\027æ\002Î\030|Ù\037ZK\002'Á\034A\035rP[ï,ªh5,>\020rþÓ\005QÝ«\021\tàZ¦\037h 0jMç\032`¯\016¥\025ØÔÿA\034<\034}ã0Bã\004%\001¬B|z¥\030fÞiÖ$PvòÀ×\fÚi\f:À \017»}è^\030d\036yæ/û»î+ü\013ÃÃ`AgÿG?XÙ §\0133ùé²­¸ D\027}!2WQFôjýrY¦¹*èQÕ\032æ\020!ónÂ+\0173ä½6Â#Í*\0238@\n³²UÀ\nQH®Øy\016\005ÞùLåi\033H\031\b6éÎ¼À®àêj»`Â.=Æ¬\007»êvãL¨Dýo\035Ì\006\003u$\005z³´Ï(p­`|ý/WØJ¼8×nQ!!«èÈÑn\021îóx³ÎÎMÞÒH¤k SMxøV+í4¢{×/ø@lØ'â.\004ÿ×.\002ç¦òp°('f\003ÕÍj*~\001·£¾÷êK¢ð_ûH?\003$qQ!â\00335:¾kH½ç¦wà@øà\002nÒdÛ\\LB=ÉøÔ@\007s|¼©F¦§\\û\033z*pe\004åÖ&Æ­\005\037\034[¿\t)ê\024¸^ÔÆÙ\\¸mº@ÒO;géB)r¡Á±¯Ò§\b\005\\a.Ðólµ31G¬¡3ß\nkè'9\016RèCå´¦ÑÎPJ­7÷~½ij¿æ3Ð\nÅã\020ú*çJ!_Q\005\bw\0307\000\020yþwò8´R\021ëÇAÄßÌm\036 m¤ÝØ\0009`\030m­*ÿÓþÍ¬Î»Lï9\004ãjß|± F½jðáÂç`Xò cé Ý\001\005-(;0|ãëø ÷öw\006 g¾Æ\037lF¹aÂ°f\nJçCo¶n vXØ?À¤!ÉZ\020ÎZöÎ´¡;rC_d\026ø@\030ê ×ü<TÁ\036ý$ø7xð\r]ÔgH\r;g<\030«ÉÌméÔ9Ë¬\032\005C¢\024¦²\027FQßµ \034\004\032\024gà¦ ï;d\016+\016\024\n}ËuïçÚ4;Ç@/nx¬uåw\027ºYL´D8ã\033ÜN \\\024\tb\0300É\002\002\022Ñ¤è.¨b¢ª±\000g\022\026AÈ\0179§}\027Ê\021Ñ\füåòb&\030Rþ¤xËÄÓ),ífsÕ-¡ö2qÙvÁý¨\030ö\027M^1éCË\003f»9ïÖÿ­àAKg:>ÙJ\030\0067\033ìl{x.ØRãÅZCÃH%ÐÍP \001ÔS\007}IÙvêá~>)\026ÑP¡»:\037äÃâ³¤}hL {\026=a¡¯É\027LC¤Æl¦v§|oJÎípæÀ¤¯#V;\016|\0200õ]\tÅ«IOwP'ö\022-F\020ãEÒa®\006A²JöþJ7¥ ñ\t²`ÞFµ\022ìNø §\033+&X\\¡Ð\\¶\035\021gå\016í\013£(ÍÀD\005\bâÔzoÆ\r\tCRí1'¯\t \035B<r%\0339¦84\rü (Ëu<Øé\004 .$âó½.æ<ó%V×Þ\024¬X*mfÍ¤ \";\013Sÿ\017\r,íñD\n\020zz\006BSkyMæ`%2SU\t ÞÁx$ÜzpI \035\017Ô>3Úªã\f¢Zv©±A\033\003\035!»\030×»¤`y\005_+\r\033\003+\016ÏmU3(\025\021\026sòMÞC (.7Æï\013zf\032.ÝJÆ¦\r&Û­f\024ÿ°WÊºè\020ÀÆÃkÙ×Ëï§¨\f/À\020\035\005ã³RW&>\001\t;^\003»£x´u(´ÚìFúìI\002Æøâ0Øs7Ì \030R\005ð\b´¬\035hí\035©¥N[C°Ê¥&Y%*#ÐÆò=åÍ¢R(\030O&<1\013]Ts¾uìC*ß\005+\030´\b¶´\037ý:\025B\007Vþ9P{Ø×ÜÎ\006\026Ó\033y¶x\021Ì\rä4¡(ì48Ä>íjÞn©ëuy¹]ß«\032;B`\030:²^2ðÿJ_{§\025ÝÈ\\æn\020\0300ÚÀRåÉKÏÕ_").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  public void b(@NotNull EntityDamageEvent paramEntityDamageEvent) {
    try {
      if (paramEntityDamageEvent.getCause() != EntityDamageEvent.DamageCause.ENTITY_ATTACK) {
        try {
          if (paramEntityDamageEvent.getCause() == EntityDamageEvent.DamageCause.PROJECTILE) {
            this.i = System.currentTimeMillis();
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.i = System.currentTimeMillis();
  }
  
  public void p(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    this.i = System.currentTimeMillis();
  }
  
  public void b(@NotNull PlayerVelocityEvent paramPlayerVelocityEvent) {
    Vector vector = paramPlayerVelocityEvent.getVelocity();
    this.i = System.currentTimeMillis();
  }
  
  public void b(@NotNull PlayerFishEvent paramPlayerFishEvent) {
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
      if (jb.p(paramPlayerTeleportEvent.getFrom(), paramPlayerTeleportEvent.getTo()) > 10.0D)
        this.s = System.currentTimeMillis(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    Player player = (Player)paramEntityDamageByEntityEvent.getDamager();
    try {
      if (b.b() >= 13)
        try {
          if (player.isSwimming())
            Bukkit.getScheduler().runTask((Plugin)Matrix.b(), () -> paramPlayer.setSprinting(true)); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/wn.c : J
    //   3: ldc2_w 40115552283889
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 47359657191612
    //   15: lxor
    //   16: dup2
    //   17: bipush #32
    //   19: lushr
    //   20: l2i
    //   21: istore #6
    //   23: dup2
    //   24: bipush #32
    //   26: lshl
    //   27: bipush #32
    //   29: lushr
    //   30: l2i
    //   31: istore #7
    //   33: pop2
    //   34: dup2
    //   35: ldc2_w 112088494538051
    //   38: lxor
    //   39: dup2
    //   40: bipush #32
    //   42: lushr
    //   43: l2i
    //   44: istore #8
    //   46: dup2
    //   47: bipush #32
    //   49: lshl
    //   50: bipush #40
    //   52: lushr
    //   53: l2i
    //   54: istore #9
    //   56: dup2
    //   57: bipush #56
    //   59: lshl
    //   60: bipush #56
    //   62: lushr
    //   63: l2i
    //   64: istore #10
    //   66: pop2
    //   67: dup2
    //   68: ldc2_w 52505769969781
    //   71: lxor
    //   72: lstore #11
    //   74: dup2
    //   75: ldc2_w 109639093197543
    //   78: lxor
    //   79: lstore #13
    //   81: dup2
    //   82: ldc2_w 37579749197918
    //   85: lxor
    //   86: dup2
    //   87: bipush #32
    //   89: lushr
    //   90: l2i
    //   91: istore #15
    //   93: dup2
    //   94: bipush #32
    //   96: lshl
    //   97: bipush #48
    //   99: lushr
    //   100: l2i
    //   101: istore #16
    //   103: dup2
    //   104: bipush #48
    //   106: lshl
    //   107: bipush #48
    //   109: lushr
    //   110: l2i
    //   111: istore #17
    //   113: pop2
    //   114: dup2
    //   115: ldc2_w 23294379999197
    //   118: lxor
    //   119: lstore #18
    //   121: dup2
    //   122: ldc2_w 32505794968340
    //   125: lxor
    //   126: dup2
    //   127: bipush #56
    //   129: lushr
    //   130: l2i
    //   131: istore #20
    //   133: dup2
    //   134: bipush #8
    //   136: lshl
    //   137: bipush #8
    //   139: lushr
    //   140: lstore #21
    //   142: pop2
    //   143: dup2
    //   144: ldc2_w 74773481112486
    //   147: lxor
    //   148: dup2
    //   149: bipush #48
    //   151: lushr
    //   152: l2i
    //   153: istore #23
    //   155: dup2
    //   156: bipush #16
    //   158: lshl
    //   159: bipush #32
    //   161: lushr
    //   162: l2i
    //   163: istore #24
    //   165: dup2
    //   166: bipush #48
    //   168: lshl
    //   169: bipush #48
    //   171: lushr
    //   172: l2i
    //   173: istore #25
    //   175: pop2
    //   176: dup2
    //   177: ldc2_w 78610039864207
    //   180: lxor
    //   181: lstore #26
    //   183: dup2
    //   184: ldc2_w 115540221834747
    //   187: lxor
    //   188: lstore #28
    //   190: dup2
    //   191: ldc2_w 137896427525439
    //   194: lxor
    //   195: lstore #30
    //   197: dup2
    //   198: ldc2_w 85848001921336
    //   201: lxor
    //   202: dup2
    //   203: bipush #32
    //   205: lushr
    //   206: l2i
    //   207: istore #32
    //   209: dup2
    //   210: bipush #32
    //   212: lshl
    //   213: bipush #48
    //   215: lushr
    //   216: l2i
    //   217: istore #33
    //   219: dup2
    //   220: bipush #48
    //   222: lshl
    //   223: bipush #48
    //   225: lushr
    //   226: l2i
    //   227: istore #34
    //   229: pop2
    //   230: dup2
    //   231: ldc2_w 59978269095833
    //   234: lxor
    //   235: lstore #35
    //   237: dup2
    //   238: ldc2_w 19693949828265
    //   241: lxor
    //   242: dup2
    //   243: bipush #48
    //   245: lushr
    //   246: l2i
    //   247: istore #37
    //   249: dup2
    //   250: bipush #16
    //   252: lshl
    //   253: bipush #16
    //   255: lushr
    //   256: lstore #38
    //   258: pop2
    //   259: dup2
    //   260: ldc2_w 100700816736239
    //   263: lxor
    //   264: dup2
    //   265: bipush #8
    //   267: lushr
    //   268: lstore #40
    //   270: dup2
    //   271: bipush #56
    //   273: lshl
    //   274: bipush #56
    //   276: lushr
    //   277: l2i
    //   278: istore #42
    //   280: pop2
    //   281: pop2
    //   282: aload_1
    //   283: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   286: astore #43
    //   288: aload_0
    //   289: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   292: invokevirtual b : ()Lme/rerere/matrix/internal/vk;
    //   295: astore #44
    //   297: aload_2
    //   298: aload_3
    //   299: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   302: dstore #45
    //   304: aload #43
    //   306: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   309: ifeq -> 354
    //   312: aload #44
    //   314: dup
    //   315: getfield b : I
    //   318: iconst_1
    //   319: iadd
    //   320: putfield b : I
    //   323: aload #44
    //   325: getfield b : I
    //   328: bipush #40
    //   330: if_icmple -> 386
    //   333: goto -> 340
    //   336: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   339: athrow
    //   340: aload #44
    //   342: bipush #40
    //   344: putfield b : I
    //   347: goto -> 386
    //   350: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   353: athrow
    //   354: aload #44
    //   356: dup
    //   357: getfield b : I
    //   360: iconst_1
    //   361: isub
    //   362: putfield b : I
    //   365: aload #44
    //   367: getfield b : I
    //   370: ifge -> 386
    //   373: aload #44
    //   375: iconst_0
    //   376: putfield b : I
    //   379: goto -> 386
    //   382: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   385: athrow
    //   386: aload #44
    //   388: getfield b : I
    //   391: i2d
    //   392: dstore #47
    //   394: invokestatic j : ()J
    //   397: aload_0
    //   398: getfield i : J
    //   401: lsub
    //   402: ldc2_w 3600
    //   405: lcmp
    //   406: iflt -> 437
    //   409: invokestatic j : ()J
    //   412: aload_0
    //   413: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   416: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   419: invokevirtual j : ()J
    //   422: lsub
    //   423: ldc2_w 2000
    //   426: lcmp
    //   427: ifge -> 445
    //   430: goto -> 437
    //   433: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   436: athrow
    //   437: iconst_1
    //   438: goto -> 446
    //   441: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   444: athrow
    //   445: iconst_0
    //   446: istore #49
    //   448: aload #43
    //   450: invokeinterface getVelocity : ()Lorg/bukkit/util/Vector;
    //   455: astore #50
    //   457: iconst_0
    //   458: istore #51
    //   460: aload #43
    //   462: invokeinterface isFlying : ()Z
    //   467: ifeq -> 475
    //   470: return
    //   471: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   474: athrow
    //   475: aload #43
    //   477: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   482: getstatic org/bukkit/GameMode.SURVIVAL : Lorg/bukkit/GameMode;
    //   485: if_acmpeq -> 513
    //   488: aload #43
    //   490: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   495: getstatic org/bukkit/GameMode.ADVENTURE : Lorg/bukkit/GameMode;
    //   498: if_acmpeq -> 513
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   507: athrow
    //   508: return
    //   509: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   512: athrow
    //   513: aload #43
    //   515: invokeinterface isInsideVehicle : ()Z
    //   520: ifeq -> 541
    //   523: aload_0
    //   524: lload #35
    //   526: aload_1
    //   527: aload_2
    //   528: aload_3
    //   529: aload #44
    //   531: dload #45
    //   533: invokespecial b : (JLorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/Location;Lorg/bukkit/Location;Lme/rerere/matrix/internal/vk;D)V
    //   536: return
    //   537: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   540: athrow
    //   541: invokestatic b : ()I
    //   544: bipush #9
    //   546: if_icmplt -> 578
    //   549: aload #43
    //   551: invokeinterface isGliding : ()Z
    //   556: ifeq -> 578
    //   559: goto -> 566
    //   562: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   565: athrow
    //   566: aload_0
    //   567: invokestatic currentTimeMillis : ()J
    //   570: putfield z : J
    //   573: return
    //   574: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   577: athrow
    //   578: aload_2
    //   579: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   582: invokeinterface isLiquid : ()Z
    //   587: ifne -> 661
    //   590: aload_2
    //   591: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   594: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   597: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   602: invokeinterface isLiquid : ()Z
    //   607: ifne -> 661
    //   610: goto -> 617
    //   613: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   616: athrow
    //   617: aload_2
    //   618: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   621: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   624: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   629: invokeinterface getType : ()Lorg/bukkit/Material;
    //   634: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   637: if_acmpeq -> 661
    //   640: goto -> 647
    //   643: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   646: athrow
    //   647: aload_0
    //   648: invokestatic currentTimeMillis : ()J
    //   651: putfield r : J
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   660: athrow
    //   661: aload #43
    //   663: invokeinterface getWalkSpeed : ()F
    //   668: ldc_w 0.2
    //   671: fsub
    //   672: invokestatic abs : (F)F
    //   675: ldc_w 0.02
    //   678: fcmpl
    //   679: ifle -> 687
    //   682: return
    //   683: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   686: athrow
    //   687: invokestatic b : ()I
    //   690: bipush #9
    //   692: if_icmplt -> 759
    //   695: ldc2_w 0.135
    //   698: dstore #52
    //   700: aload #43
    //   702: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   705: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   710: ifeq -> 738
    //   713: dload #52
    //   715: ldc2_w 0.0265
    //   718: aload #43
    //   720: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   723: invokeinterface getPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Lorg/bukkit/potion/PotionEffect;
    //   728: invokevirtual getAmplifier : ()I
    //   731: iconst_1
    //   732: iadd
    //   733: i2d
    //   734: dmul
    //   735: dadd
    //   736: dstore #52
    //   738: iload #6
    //   740: aload #43
    //   742: iload #7
    //   744: invokestatic b : (ILorg/bukkit/entity/Player;I)F
    //   747: f2d
    //   748: dload #52
    //   750: dcmpl
    //   751: ifle -> 759
    //   754: return
    //   755: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   758: athrow
    //   759: aload #43
    //   761: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   764: istore #52
    //   766: iload #52
    //   768: ifeq -> 810
    //   771: aload_0
    //   772: dup
    //   773: getfield g : I
    //   776: iconst_1
    //   777: iadd
    //   778: putfield g : I
    //   781: aload_0
    //   782: getfield g : I
    //   785: bipush #20
    //   787: if_icmple -> 815
    //   790: goto -> 797
    //   793: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   796: athrow
    //   797: aload_0
    //   798: bipush #20
    //   800: putfield g : I
    //   803: goto -> 815
    //   806: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   809: athrow
    //   810: aload_0
    //   811: iconst_0
    //   812: putfield g : I
    //   815: invokestatic b : ()Z
    //   818: ifeq -> 864
    //   821: invokestatic b : ()I
    //   824: bipush #13
    //   826: if_icmpge -> 864
    //   829: goto -> 836
    //   832: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   835: athrow
    //   836: aload_0
    //   837: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   840: invokevirtual b : ()I
    //   843: sipush #393
    //   846: if_icmplt -> 864
    //   849: goto -> 856
    //   852: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   855: athrow
    //   856: iconst_1
    //   857: goto -> 865
    //   860: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   863: athrow
    //   864: iconst_0
    //   865: istore #53
    //   867: invokestatic b : ()I
    //   870: bipush #13
    //   872: if_icmplt -> 896
    //   875: iload #53
    //   877: ifne -> 896
    //   880: goto -> 887
    //   883: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   886: athrow
    //   887: aload #43
    //   889: invokeinterface isSwimming : ()Z
    //   894: istore #53
    //   896: invokestatic b : ()I
    //   899: bipush #14
    //   901: if_icmplt -> 947
    //   904: iload #53
    //   906: ifne -> 947
    //   909: goto -> 916
    //   912: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   915: athrow
    //   916: aload #43
    //   918: invokeinterface getPose : ()Lorg/bukkit/entity/Pose;
    //   923: getstatic org/bukkit/entity/Pose.SWIMMING : Lorg/bukkit/entity/Pose;
    //   926: if_acmpne -> 944
    //   929: goto -> 936
    //   932: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   935: athrow
    //   936: iconst_1
    //   937: goto -> 945
    //   940: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   943: athrow
    //   944: iconst_0
    //   945: istore #53
    //   947: iload #53
    //   949: ifeq -> 966
    //   952: aload_0
    //   953: invokestatic currentTimeMillis : ()J
    //   956: putfield t : J
    //   959: goto -> 966
    //   962: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   965: athrow
    //   966: invokestatic b : ()I
    //   969: bipush #13
    //   971: if_icmplt -> 990
    //   974: getstatic me/rerere/matrix/internal/wn.w : Z
    //   977: ifeq -> 990
    //   980: goto -> 987
    //   983: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   986: athrow
    //   987: iconst_1
    //   988: istore #53
    //   990: aload_3
    //   991: invokevirtual getY : ()D
    //   994: aload_2
    //   995: invokevirtual getY : ()D
    //   998: dsub
    //   999: dstore #54
    //   1001: iload #15
    //   1003: iload #16
    //   1005: i2s
    //   1006: aload #43
    //   1008: iload #17
    //   1010: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   1013: istore #56
    //   1015: iconst_0
    //   1016: istore #57
    //   1018: invokestatic b : ()I
    //   1021: bipush #13
    //   1023: if_icmplt -> 1054
    //   1026: aload #43
    //   1028: invokeinterface isRiptiding : ()Z
    //   1033: istore #57
    //   1035: iload #57
    //   1037: ifeq -> 1054
    //   1040: aload_0
    //   1041: invokestatic currentTimeMillis : ()J
    //   1044: putfield u : J
    //   1047: goto -> 1054
    //   1050: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1053: athrow
    //   1054: iconst_0
    //   1055: istore #58
    //   1057: invokestatic b : ()I
    //   1060: bipush #13
    //   1062: if_icmplt -> 1096
    //   1065: aload #43
    //   1067: getstatic org/bukkit/potion/PotionEffectType.DOLPHINS_GRACE : Lorg/bukkit/potion/PotionEffectType;
    //   1070: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   1075: istore #58
    //   1077: iload #58
    //   1079: ifeq -> 1096
    //   1082: aload_0
    //   1083: invokestatic currentTimeMillis : ()J
    //   1086: putfield k : J
    //   1089: goto -> 1096
    //   1092: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1095: athrow
    //   1096: invokestatic currentTimeMillis : ()J
    //   1099: aload_0
    //   1100: getfield k : J
    //   1103: lsub
    //   1104: ldc2_w 2000
    //   1107: lcmp
    //   1108: ifge -> 1114
    //   1111: iconst_1
    //   1112: istore #58
    //   1114: invokestatic b : ()I
    //   1117: bipush #13
    //   1119: if_icmplt -> 1147
    //   1122: aload #43
    //   1124: getstatic org/bukkit/potion/PotionEffectType.SLOW_FALLING : Lorg/bukkit/potion/PotionEffectType;
    //   1127: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   1132: ifeq -> 1147
    //   1135: goto -> 1142
    //   1138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1141: athrow
    //   1142: return
    //   1143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1146: athrow
    //   1147: aload_3
    //   1148: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1151: aload_2
    //   1152: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   1155: invokevirtual subtract : (Lorg/bukkit/util/Vector;)Lorg/bukkit/util/Vector;
    //   1158: astore #59
    //   1160: iload #52
    //   1162: ifeq -> 1379
    //   1165: iload #53
    //   1167: ifne -> 1379
    //   1170: goto -> 1177
    //   1173: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1176: athrow
    //   1177: iload #56
    //   1179: ifne -> 1379
    //   1182: goto -> 1189
    //   1185: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1188: athrow
    //   1189: dload #54
    //   1191: invokestatic abs : (D)D
    //   1194: dconst_0
    //   1195: dcmpl
    //   1196: ifle -> 1379
    //   1199: goto -> 1206
    //   1202: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1205: athrow
    //   1206: dload #54
    //   1208: invokestatic abs : (D)D
    //   1211: ldc2_w 0.0625
    //   1214: dcmpg
    //   1215: ifge -> 1379
    //   1218: goto -> 1225
    //   1221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1224: athrow
    //   1225: aload_2
    //   1226: invokevirtual getY : ()D
    //   1229: dconst_1
    //   1230: drem
    //   1231: ldc2_w 0.9375
    //   1234: dcmpl
    //   1235: ifle -> 1379
    //   1238: goto -> 1245
    //   1241: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1244: athrow
    //   1245: aload_2
    //   1246: invokestatic d : (Lorg/bukkit/Location;)Z
    //   1249: ifne -> 1379
    //   1252: goto -> 1259
    //   1255: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1258: athrow
    //   1259: aload_2
    //   1260: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1263: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   1266: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1271: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   1274: ifeq -> 1379
    //   1277: goto -> 1284
    //   1280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1283: athrow
    //   1284: aload_0
    //   1285: lload #11
    //   1287: sipush #21084
    //   1290: ldc2_w 4484325473510170704
    //   1293: lload #4
    //   1295: lxor
    //   1296: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1301: new java/lang/StringBuilder
    //   1304: dup
    //   1305: invokespecial <init> : ()V
    //   1308: sipush #12719
    //   1311: ldc2_w 2293446001045947325
    //   1314: lload #4
    //   1316: lxor
    //   1317: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1322: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1325: aload #59
    //   1327: invokevirtual getY : ()D
    //   1330: invokestatic b : (D)D
    //   1333: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1336: sipush #21839
    //   1339: ldc2_w 108583774879164231
    //   1342: lload #4
    //   1344: lxor
    //   1345: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1353: aload_2
    //   1354: invokevirtual getY : ()D
    //   1357: invokestatic b : (D)D
    //   1360: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1363: ldc_w ')'
    //   1366: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1369: invokevirtual toString : ()Ljava/lang/String;
    //   1372: iconst_5
    //   1373: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1376: iconst_1
    //   1377: istore #51
    //   1379: iload #56
    //   1381: ifne -> 1651
    //   1384: iload #52
    //   1386: ifeq -> 1651
    //   1389: goto -> 1396
    //   1392: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1395: athrow
    //   1396: iload #53
    //   1398: ifne -> 1651
    //   1401: goto -> 1408
    //   1404: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1407: athrow
    //   1408: dload #45
    //   1410: ldc2_w 0.1
    //   1413: dcmpl
    //   1414: ifle -> 1651
    //   1417: goto -> 1424
    //   1420: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1423: athrow
    //   1424: aload #50
    //   1426: invokevirtual getY : ()D
    //   1429: ldc2_w -0.1
    //   1432: dcmpg
    //   1433: ifge -> 1651
    //   1436: goto -> 1443
    //   1439: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1442: athrow
    //   1443: dload #54
    //   1445: aload_0
    //   1446: getfield b : D
    //   1449: dcmpl
    //   1450: ifne -> 1651
    //   1453: goto -> 1460
    //   1456: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1459: athrow
    //   1460: dload #54
    //   1462: invokestatic abs : (D)D
    //   1465: ldc2_w 0.001
    //   1468: dcmpl
    //   1469: ifle -> 1651
    //   1472: goto -> 1479
    //   1475: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1478: athrow
    //   1479: dload #54
    //   1481: invokestatic abs : (D)D
    //   1484: ldc2_w 0.002
    //   1487: dcmpg
    //   1488: ifge -> 1651
    //   1491: goto -> 1498
    //   1494: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1497: athrow
    //   1498: aload_2
    //   1499: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1502: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   1505: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1510: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1515: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   1518: if_acmpne -> 1651
    //   1521: goto -> 1528
    //   1524: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1527: athrow
    //   1528: aload_0
    //   1529: lload #11
    //   1531: sipush #11579
    //   1534: ldc2_w 5363619897884466966
    //   1537: lload #4
    //   1539: lxor
    //   1540: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1545: new java/lang/StringBuilder
    //   1548: dup
    //   1549: invokespecial <init> : ()V
    //   1552: sipush #5025
    //   1555: ldc2_w 5597943406526751148
    //   1558: lload #4
    //   1560: lxor
    //   1561: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1566: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1569: aload #59
    //   1571: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   1574: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1577: sipush #10993
    //   1580: ldc2_w 7853542490454087921
    //   1583: lload #4
    //   1585: lxor
    //   1586: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1591: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1594: iload #56
    //   1596: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   1599: sipush #30039
    //   1602: ldc2_w 5173806627349464945
    //   1605: lload #4
    //   1607: lxor
    //   1608: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1613: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1616: aload #44
    //   1618: getfield x : D
    //   1621: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1624: sipush #28812
    //   1627: ldc2_w 5531081690013336215
    //   1630: lload #4
    //   1632: lxor
    //   1633: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1638: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1641: invokevirtual toString : ()Ljava/lang/String;
    //   1644: iconst_4
    //   1645: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1648: iconst_1
    //   1649: istore #51
    //   1651: iload #52
    //   1653: ifeq -> 1895
    //   1656: iload #53
    //   1658: ifne -> 1895
    //   1661: goto -> 1668
    //   1664: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1667: athrow
    //   1668: iload #56
    //   1670: ifne -> 1895
    //   1673: goto -> 1680
    //   1676: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1679: athrow
    //   1680: dload #54
    //   1682: dconst_0
    //   1683: dcmpl
    //   1684: ifle -> 1895
    //   1687: goto -> 1694
    //   1690: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1693: athrow
    //   1694: dload #54
    //   1696: ldc2_w 0.01
    //   1699: dcmpg
    //   1700: ifge -> 1895
    //   1703: goto -> 1710
    //   1706: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1709: athrow
    //   1710: aload #50
    //   1712: invokevirtual getY : ()D
    //   1715: ldc2_w -0.08
    //   1718: dcmpg
    //   1719: ifge -> 1895
    //   1722: goto -> 1729
    //   1725: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1728: athrow
    //   1729: aload_0
    //   1730: getfield b : D
    //   1733: invokestatic abs : (D)D
    //   1736: ldc2_w 0.01
    //   1739: dcmpg
    //   1740: ifge -> 1895
    //   1743: goto -> 1750
    //   1746: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1749: athrow
    //   1750: aload_2
    //   1751: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   1754: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   1757: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   1762: invokestatic p : (Lorg/bukkit/block/Block;)Z
    //   1765: ifeq -> 1895
    //   1768: goto -> 1775
    //   1771: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1774: athrow
    //   1775: aload_2
    //   1776: getstatic org/bukkit/Material.LAVA : Lorg/bukkit/Material;
    //   1779: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   1782: ifne -> 1895
    //   1785: goto -> 1792
    //   1788: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1791: athrow
    //   1792: aload_0
    //   1793: lload #11
    //   1795: sipush #19176
    //   1798: ldc2_w 115441766142785739
    //   1801: lload #4
    //   1803: lxor
    //   1804: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1809: new java/lang/StringBuilder
    //   1812: dup
    //   1813: invokespecial <init> : ()V
    //   1816: sipush #19202
    //   1819: ldc2_w 3425488895951649063
    //   1822: lload #4
    //   1824: lxor
    //   1825: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1830: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1833: dload #54
    //   1835: invokestatic b : (D)D
    //   1838: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1841: sipush #1535
    //   1844: ldc2_w 1553450336387397617
    //   1847: lload #4
    //   1849: lxor
    //   1850: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1855: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1858: aload_0
    //   1859: getfield b : D
    //   1862: invokestatic b : (D)D
    //   1865: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1868: sipush #18503
    //   1871: ldc2_w 1602997581237762643
    //   1874: lload #4
    //   1876: lxor
    //   1877: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1882: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1885: invokevirtual toString : ()Ljava/lang/String;
    //   1888: iconst_5
    //   1889: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1892: iconst_1
    //   1893: istore #51
    //   1895: dload #54
    //   1897: ldc2_w 0.42
    //   1900: dcmpl
    //   1901: ifle -> 2173
    //   1904: ldc2_w 0.5
    //   1907: aload #43
    //   1909: iload #32
    //   1911: getstatic org/bukkit/potion/PotionEffectType.JUMP : Lorg/bukkit/potion/PotionEffectType;
    //   1914: iload #33
    //   1916: i2s
    //   1917: iload #34
    //   1919: i2s
    //   1920: invokestatic b : (Lorg/bukkit/entity/Player;ILorg/bukkit/potion/PotionEffectType;SS)I
    //   1923: i2d
    //   1924: ldc2_w 0.1
    //   1927: dmul
    //   1928: dadd
    //   1929: dstore #60
    //   1931: aload_3
    //   1932: invokestatic t : (Lorg/bukkit/Location;)Z
    //   1935: ifeq -> 1946
    //   1938: dload #60
    //   1940: ldc2_w 0.5
    //   1943: dadd
    //   1944: dstore #60
    //   1946: aload_0
    //   1947: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1950: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   1953: iload #20
    //   1955: i2b
    //   1956: lload #21
    //   1958: invokevirtual b : (BJ)Z
    //   1961: ifeq -> 1984
    //   1964: dload #60
    //   1966: aload_0
    //   1967: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   1970: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   1973: lload #40
    //   1975: iload #42
    //   1977: i2b
    //   1978: invokevirtual b : (JB)D
    //   1981: dadd
    //   1982: dstore #60
    //   1984: invokestatic b : ()I
    //   1987: bipush #9
    //   1989: if_icmplt -> 2015
    //   1992: aload #43
    //   1994: invokeinterface isGliding : ()Z
    //   1999: ifeq -> 2015
    //   2002: goto -> 2009
    //   2005: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2008: athrow
    //   2009: dload #60
    //   2011: dconst_1
    //   2012: dadd
    //   2013: dstore #60
    //   2015: invokestatic b : ()I
    //   2018: bipush #13
    //   2020: if_icmplt -> 2053
    //   2023: aload_2
    //   2024: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2027: invokeinterface getType : ()Lorg/bukkit/Material;
    //   2032: getstatic org/bukkit/Material.BUBBLE_COLUMN : Lorg/bukkit/Material;
    //   2035: if_acmpne -> 2053
    //   2038: goto -> 2045
    //   2041: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2044: athrow
    //   2045: dload #60
    //   2047: ldc2_w 1.5
    //   2050: dadd
    //   2051: dstore #60
    //   2053: dload #54
    //   2055: dload #60
    //   2057: dcmpl
    //   2058: ifle -> 2173
    //   2061: aload_2
    //   2062: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2065: invokeinterface isLiquid : ()Z
    //   2070: ifeq -> 2173
    //   2073: goto -> 2080
    //   2076: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2079: athrow
    //   2080: aload_3
    //   2081: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2084: invokeinterface isLiquid : ()Z
    //   2089: ifne -> 2173
    //   2092: goto -> 2099
    //   2095: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2098: athrow
    //   2099: aload_0
    //   2100: lload #11
    //   2102: sipush #6955
    //   2105: ldc2_w 7251851429983021314
    //   2108: lload #4
    //   2110: lxor
    //   2111: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2116: new java/lang/StringBuilder
    //   2119: dup
    //   2120: invokespecial <init> : ()V
    //   2123: sipush #19202
    //   2126: ldc2_w 3425488895951649063
    //   2129: lload #4
    //   2131: lxor
    //   2132: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2140: dload #54
    //   2142: invokestatic b : (D)D
    //   2145: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2148: ldc_w ')'
    //   2151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2154: invokevirtual toString : ()Ljava/lang/String;
    //   2157: iconst_5
    //   2158: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2161: aload_1
    //   2162: aload_2
    //   2163: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2166: goto -> 2173
    //   2169: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2172: athrow
    //   2173: dload #54
    //   2175: invokestatic abs : (D)D
    //   2178: ldc2_w 0.1
    //   2181: dcmpl
    //   2182: ifle -> 2693
    //   2185: iload #57
    //   2187: ifne -> 2693
    //   2190: goto -> 2197
    //   2193: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2196: athrow
    //   2197: aload #43
    //   2199: invokestatic c : (Lorg/bukkit/entity/Player;)Z
    //   2202: ifeq -> 2693
    //   2205: goto -> 2212
    //   2208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2211: athrow
    //   2212: aload_0
    //   2213: getfield g : I
    //   2216: iconst_3
    //   2217: if_icmple -> 2693
    //   2220: goto -> 2227
    //   2223: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2226: athrow
    //   2227: aload_3
    //   2228: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2231: invokeinterface isLiquid : ()Z
    //   2236: ifeq -> 2693
    //   2239: goto -> 2246
    //   2242: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2245: athrow
    //   2246: aload_3
    //   2247: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2250: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   2253: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   2258: invokeinterface isLiquid : ()Z
    //   2263: ifeq -> 2693
    //   2266: goto -> 2273
    //   2269: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2272: athrow
    //   2273: iconst_0
    //   2274: istore #60
    //   2276: invokestatic b : ()I
    //   2279: bipush #9
    //   2281: if_icmplt -> 2304
    //   2284: aload #43
    //   2286: invokeinterface isGliding : ()Z
    //   2291: ifeq -> 2304
    //   2294: goto -> 2301
    //   2297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2300: athrow
    //   2301: iconst_1
    //   2302: istore #60
    //   2304: iload #53
    //   2306: ifeq -> 2312
    //   2309: iconst_1
    //   2310: istore #60
    //   2312: invokestatic b : ()I
    //   2315: bipush #13
    //   2317: if_icmplt -> 2345
    //   2320: aload_2
    //   2321: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2324: invokeinterface getType : ()Lorg/bukkit/Material;
    //   2329: getstatic org/bukkit/Material.BUBBLE_COLUMN : Lorg/bukkit/Material;
    //   2332: if_acmpne -> 2345
    //   2335: goto -> 2342
    //   2338: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2341: athrow
    //   2342: iconst_1
    //   2343: istore #60
    //   2345: invokestatic currentTimeMillis : ()J
    //   2348: aload_0
    //   2349: getfield i : J
    //   2352: lsub
    //   2353: ldc2_w 1500
    //   2356: lcmp
    //   2357: ifge -> 2363
    //   2360: iconst_1
    //   2361: istore #60
    //   2363: iload #60
    //   2365: ifne -> 2693
    //   2368: ldc2_w 0.19
    //   2371: dstore #61
    //   2373: aload_2
    //   2374: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2377: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   2380: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   2385: invokeinterface isLiquid : ()Z
    //   2390: ifeq -> 2412
    //   2393: aload_2
    //   2394: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2397: invokeinterface isLiquid : ()Z
    //   2402: ifne -> 2417
    //   2405: goto -> 2412
    //   2408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2411: athrow
    //   2412: ldc2_w 0.44
    //   2415: dstore #61
    //   2417: aload #50
    //   2419: invokevirtual getY : ()D
    //   2422: invokestatic abs : (D)D
    //   2425: ldc2_w 0.19
    //   2428: dcmpl
    //   2429: ifle -> 2449
    //   2432: dload #61
    //   2434: aload #50
    //   2436: invokevirtual getY : ()D
    //   2439: invokestatic abs : (D)D
    //   2442: ldc2_w 1.2
    //   2445: dmul
    //   2446: dadd
    //   2447: dstore #61
    //   2449: dload #54
    //   2451: dconst_0
    //   2452: dcmpg
    //   2453: ifge -> 2464
    //   2456: dload #61
    //   2458: ldc2_w 0.21
    //   2461: dadd
    //   2462: dstore #61
    //   2464: invokestatic currentTimeMillis : ()J
    //   2467: aload_0
    //   2468: getfield t : J
    //   2471: lsub
    //   2472: ldc2_w 1000
    //   2475: lcmp
    //   2476: ifge -> 2487
    //   2479: dload #61
    //   2481: ldc2_w 0.2
    //   2484: dadd
    //   2485: dstore #61
    //   2487: iload #23
    //   2489: i2s
    //   2490: iload #24
    //   2492: iload #25
    //   2494: aload_2
    //   2495: invokestatic l : (SIILorg/bukkit/Location;)Z
    //   2498: ifeq -> 2509
    //   2501: dload #61
    //   2503: ldc2_w 0.15
    //   2506: dadd
    //   2507: dstore #61
    //   2509: aload_2
    //   2510: invokestatic d : (Lorg/bukkit/Location;)Z
    //   2513: ifeq -> 2524
    //   2516: dload #61
    //   2518: ldc2_w 0.15
    //   2521: dadd
    //   2522: dstore #61
    //   2524: invokestatic b : ()I
    //   2527: bipush #13
    //   2529: if_icmplt -> 2557
    //   2532: aload_2
    //   2533: getstatic org/bukkit/Material.BUBBLE_COLUMN : Lorg/bukkit/Material;
    //   2536: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   2539: ifeq -> 2557
    //   2542: goto -> 2549
    //   2545: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2548: athrow
    //   2549: dload #61
    //   2551: ldc2_w 0.2
    //   2554: dadd
    //   2555: dstore #61
    //   2557: dload #54
    //   2559: invokestatic abs : (D)D
    //   2562: dload #61
    //   2564: dcmpl
    //   2565: ifle -> 2693
    //   2568: aload_0
    //   2569: lload #11
    //   2571: sipush #11700
    //   2574: ldc2_w 6518128265683623810
    //   2577: lload #4
    //   2579: lxor
    //   2580: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2585: new java/lang/StringBuilder
    //   2588: dup
    //   2589: invokespecial <init> : ()V
    //   2592: sipush #26908
    //   2595: ldc2_w 3919881501990689539
    //   2598: lload #4
    //   2600: lxor
    //   2601: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2606: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2609: dload #54
    //   2611: invokestatic b : (D)D
    //   2614: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2617: sipush #17405
    //   2620: ldc2_w 3015668659796259327
    //   2623: lload #4
    //   2625: lxor
    //   2626: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2631: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2634: dload #61
    //   2636: invokestatic abs : (D)D
    //   2639: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   2642: sipush #16178
    //   2645: ldc2_w 4001377545487011107
    //   2648: lload #4
    //   2650: lxor
    //   2651: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2656: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2659: invokevirtual toString : ()Ljava/lang/String;
    //   2662: iconst_5
    //   2663: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   2666: iconst_1
    //   2667: istore #51
    //   2669: dload #54
    //   2671: invokestatic abs : (D)D
    //   2674: ldc2_w 0.421
    //   2677: dcmpl
    //   2678: ifle -> 2693
    //   2681: aload_1
    //   2682: aload_2
    //   2683: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   2686: goto -> 2693
    //   2689: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2692: athrow
    //   2693: iload #56
    //   2695: ifeq -> 3080
    //   2698: aload #50
    //   2700: invokevirtual getY : ()D
    //   2703: ldc2_w -0.1
    //   2706: dcmpg
    //   2707: ifge -> 3080
    //   2710: goto -> 2717
    //   2713: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2716: athrow
    //   2717: iload #57
    //   2719: ifne -> 3080
    //   2722: goto -> 2729
    //   2725: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2728: athrow
    //   2729: lload #18
    //   2731: aload_2
    //   2732: invokestatic b : (JLorg/bukkit/Location;)Z
    //   2735: ifeq -> 3080
    //   2738: goto -> 2745
    //   2741: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2744: athrow
    //   2745: aload_2
    //   2746: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2749: invokeinterface getType : ()Lorg/bukkit/Material;
    //   2754: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   2757: if_acmpeq -> 2786
    //   2760: goto -> 2767
    //   2763: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2766: athrow
    //   2767: aload_2
    //   2768: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   2771: invokeinterface isLiquid : ()Z
    //   2776: ifeq -> 3080
    //   2779: goto -> 2786
    //   2782: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2785: athrow
    //   2786: invokestatic currentTimeMillis : ()J
    //   2789: aload_0
    //   2790: getfield s : J
    //   2793: lsub
    //   2794: ldc2_w 1000
    //   2797: lcmp
    //   2798: ifge -> 2816
    //   2801: goto -> 2808
    //   2804: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2807: athrow
    //   2808: iconst_1
    //   2809: goto -> 2817
    //   2812: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2815: athrow
    //   2816: iconst_0
    //   2817: istore #60
    //   2819: invokestatic currentTimeMillis : ()J
    //   2822: aload_0
    //   2823: getfield r : J
    //   2826: lsub
    //   2827: ldc2_w 1000
    //   2830: lcmp
    //   2831: ifge -> 2837
    //   2834: iconst_1
    //   2835: istore #60
    //   2837: iload #53
    //   2839: ifne -> 2864
    //   2842: invokestatic currentTimeMillis : ()J
    //   2845: aload_0
    //   2846: getfield t : J
    //   2849: lsub
    //   2850: ldc2_w 1000
    //   2853: lcmp
    //   2854: ifge -> 2867
    //   2857: goto -> 2864
    //   2860: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2863: athrow
    //   2864: iconst_1
    //   2865: istore #60
    //   2867: dload #54
    //   2869: ldc2_w 0.0784
    //   2872: dadd
    //   2873: invokestatic abs : (D)D
    //   2876: ldc2_w 1.0E-4
    //   2879: dcmpg
    //   2880: ifge -> 2904
    //   2883: aload_2
    //   2884: invokevirtual getY : ()D
    //   2887: dconst_1
    //   2888: drem
    //   2889: dconst_0
    //   2890: dcmpl
    //   2891: ifeq -> 2904
    //   2894: goto -> 2901
    //   2897: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   2900: athrow
    //   2901: iconst_1
    //   2902: istore #60
    //   2904: aload_2
    //   2905: getstatic me/rerere/matrix/internal/da.f : Lorg/bukkit/Material;
    //   2908: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Material;)Z
    //   2911: ifeq -> 2917
    //   2914: iconst_1
    //   2915: istore #60
    //   2917: aload_2
    //   2918: invokestatic c : (Lorg/bukkit/Location;)Z
    //   2921: ifeq -> 2927
    //   2924: iconst_1
    //   2925: istore #60
    //   2927: iload #60
    //   2929: ifne -> 3080
    //   2932: aload_0
    //   2933: lload #11
    //   2935: sipush #18328
    //   2938: ldc2_w 5780692876213695872
    //   2941: lload #4
    //   2943: lxor
    //   2944: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2949: new java/lang/StringBuilder
    //   2952: dup
    //   2953: invokespecial <init> : ()V
    //   2956: sipush #19202
    //   2959: ldc2_w 3425488895951649063
    //   2962: lload #4
    //   2964: lxor
    //   2965: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2970: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2973: aload #59
    //   2975: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   2978: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2981: sipush #1578
    //   2984: ldc2_w 861565365960897563
    //   2987: lload #4
    //   2989: lxor
    //   2990: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   2995: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2998: aload_2
    //   2999: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   3002: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   3005: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3010: invokeinterface getType : ()Lorg/bukkit/Material;
    //   3015: invokevirtual name : ()Ljava/lang/String;
    //   3018: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3021: sipush #26670
    //   3024: ldc2_w 2538287192881535515
    //   3027: lload #4
    //   3029: lxor
    //   3030: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3035: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3038: aload #50
    //   3040: invokevirtual getY : ()D
    //   3043: invokestatic b : (D)D
    //   3046: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3049: sipush #25809
    //   3052: ldc2_w 9100753447369512642
    //   3055: lload #4
    //   3057: lxor
    //   3058: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3063: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3066: invokevirtual toString : ()Ljava/lang/String;
    //   3069: iconst_5
    //   3070: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   3073: iconst_1
    //   3074: istore #51
    //   3076: aload_2
    //   3077: invokestatic b : (Lorg/bukkit/Location;)V
    //   3080: iload #56
    //   3082: ifne -> 3252
    //   3085: iload #53
    //   3087: ifne -> 3252
    //   3090: goto -> 3097
    //   3093: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3096: athrow
    //   3097: lload #18
    //   3099: aload_2
    //   3100: invokestatic b : (JLorg/bukkit/Location;)Z
    //   3103: ifeq -> 3252
    //   3106: goto -> 3113
    //   3109: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3112: athrow
    //   3113: dload #54
    //   3115: dconst_0
    //   3116: dcmpl
    //   3117: ifne -> 3252
    //   3120: goto -> 3127
    //   3123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3126: athrow
    //   3127: aload #50
    //   3129: invokevirtual getY : ()D
    //   3132: ldc2_w -1.0
    //   3135: dcmpg
    //   3136: ifge -> 3252
    //   3139: goto -> 3146
    //   3142: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3145: athrow
    //   3146: aload_2
    //   3147: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   3150: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   3153: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3158: invokeinterface getType : ()Lorg/bukkit/Material;
    //   3163: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   3166: if_acmpne -> 3252
    //   3169: goto -> 3176
    //   3172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3175: athrow
    //   3176: aload_0
    //   3177: lload #11
    //   3179: sipush #4936
    //   3182: ldc2_w 3954188961278091626
    //   3185: lload #4
    //   3187: lxor
    //   3188: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3193: new java/lang/StringBuilder
    //   3196: dup
    //   3197: invokespecial <init> : ()V
    //   3200: sipush #19202
    //   3203: ldc2_w 3425488895951649063
    //   3206: lload #4
    //   3208: lxor
    //   3209: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3217: aload #59
    //   3219: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   3222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3225: sipush #24808
    //   3228: ldc2_w 7302251998765257410
    //   3231: lload #4
    //   3233: lxor
    //   3234: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3239: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3242: invokevirtual toString : ()Ljava/lang/String;
    //   3245: iconst_3
    //   3246: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   3249: iconst_1
    //   3250: istore #51
    //   3252: iload #56
    //   3254: ifeq -> 3505
    //   3257: iload #52
    //   3259: ifne -> 3505
    //   3262: goto -> 3269
    //   3265: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3268: athrow
    //   3269: dload #54
    //   3271: dconst_0
    //   3272: dcmpl
    //   3273: ifne -> 3505
    //   3276: goto -> 3283
    //   3279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3282: athrow
    //   3283: aload_2
    //   3284: invokevirtual getY : ()D
    //   3287: dconst_1
    //   3288: drem
    //   3289: dconst_0
    //   3290: dcmpl
    //   3291: ifne -> 3505
    //   3294: goto -> 3301
    //   3297: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3300: athrow
    //   3301: aload_2
    //   3302: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   3305: invokeinterface getType : ()Lorg/bukkit/Material;
    //   3310: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   3313: if_acmpne -> 3505
    //   3316: goto -> 3323
    //   3319: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3322: athrow
    //   3323: aload_2
    //   3324: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   3327: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   3330: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3335: invokeinterface isLiquid : ()Z
    //   3340: ifeq -> 3505
    //   3343: goto -> 3350
    //   3346: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3349: athrow
    //   3350: aload_2
    //   3351: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   3354: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   3357: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3362: astore #60
    //   3364: iconst_1
    //   3365: istore #61
    //   3367: getstatic me/rerere/matrix/internal/na.v : [Lorg/bukkit/block/BlockFace;
    //   3370: astore #62
    //   3372: aload #62
    //   3374: arraylength
    //   3375: istore #63
    //   3377: iconst_0
    //   3378: istore #64
    //   3380: iload #64
    //   3382: iload #63
    //   3384: if_icmpge -> 3420
    //   3387: aload #62
    //   3389: iload #64
    //   3391: aaload
    //   3392: astore #65
    //   3394: aload #60
    //   3396: aload #65
    //   3398: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3403: invokeinterface isLiquid : ()Z
    //   3408: ifne -> 3414
    //   3411: iconst_0
    //   3412: istore #61
    //   3414: iinc #64, 1
    //   3417: goto -> 3380
    //   3420: iload #61
    //   3422: ifeq -> 3505
    //   3425: aload_0
    //   3426: lload #11
    //   3428: sipush #21411
    //   3431: ldc2_w 2994471072927785383
    //   3434: lload #4
    //   3436: lxor
    //   3437: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3442: new java/lang/StringBuilder
    //   3445: dup
    //   3446: invokespecial <init> : ()V
    //   3449: sipush #19202
    //   3452: ldc2_w 3425488895951649063
    //   3455: lload #4
    //   3457: lxor
    //   3458: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3466: aload #59
    //   3468: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   3471: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3474: sipush #7979
    //   3477: ldc2_w 3500080796711644456
    //   3480: lload #4
    //   3482: lxor
    //   3483: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3488: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3491: invokevirtual toString : ()Ljava/lang/String;
    //   3494: iconst_3
    //   3495: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   3498: iconst_1
    //   3499: istore #51
    //   3501: aload_2
    //   3502: invokestatic b : (Lorg/bukkit/Location;)V
    //   3505: aload #50
    //   3507: invokevirtual getY : ()D
    //   3510: ldc2_w -0.1
    //   3513: dcmpg
    //   3514: ifge -> 4228
    //   3517: aload_3
    //   3518: invokevirtual getY : ()D
    //   3521: aload_2
    //   3522: invokevirtual getY : ()D
    //   3525: dcmpl
    //   3526: ifge -> 3562
    //   3529: goto -> 3536
    //   3532: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3535: athrow
    //   3536: aload_2
    //   3537: invokevirtual getY : ()D
    //   3540: aload_3
    //   3541: invokevirtual getY : ()D
    //   3544: dsub
    //   3545: invokestatic abs : (D)D
    //   3548: ldc2_w 0.005
    //   3551: dcmpg
    //   3552: ifge -> 4228
    //   3555: goto -> 3562
    //   3558: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3561: athrow
    //   3562: aload_2
    //   3563: astore #60
    //   3565: aload #60
    //   3567: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   3570: astore #61
    //   3572: aload #44
    //   3574: getfield x : D
    //   3577: dconst_0
    //   3578: dcmpl
    //   3579: ifle -> 3922
    //   3582: aload_0
    //   3583: getfield g : I
    //   3586: iconst_2
    //   3587: if_icmple -> 3922
    //   3590: goto -> 3597
    //   3593: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3596: athrow
    //   3597: dload #47
    //   3599: ldc2_w 8.0
    //   3602: dcmpl
    //   3603: ifle -> 3922
    //   3606: goto -> 3613
    //   3609: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3612: athrow
    //   3613: aload_3
    //   3614: invokevirtual getY : ()D
    //   3617: aload_2
    //   3618: invokevirtual getY : ()D
    //   3621: dcmpl
    //   3622: ifne -> 3922
    //   3625: goto -> 3632
    //   3628: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3631: athrow
    //   3632: aload_0
    //   3633: getfield b : D
    //   3636: dconst_0
    //   3637: dcmpl
    //   3638: ifne -> 3922
    //   3641: goto -> 3648
    //   3644: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3647: athrow
    //   3648: iload #52
    //   3650: ifeq -> 3922
    //   3653: goto -> 3660
    //   3656: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3659: athrow
    //   3660: aload #61
    //   3662: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   3665: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3670: invokeinterface isLiquid : ()Z
    //   3675: ifne -> 3922
    //   3678: goto -> 3685
    //   3681: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3684: athrow
    //   3685: iload #49
    //   3687: ifne -> 3922
    //   3690: goto -> 3697
    //   3693: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3696: athrow
    //   3697: aload #43
    //   3699: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   3704: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   3707: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   3710: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3715: invokeinterface isLiquid : ()Z
    //   3720: ifeq -> 3922
    //   3723: goto -> 3730
    //   3726: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3729: athrow
    //   3730: aload #61
    //   3732: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   3735: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3740: invokeinterface getType : ()Lorg/bukkit/Material;
    //   3745: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   3748: if_acmpne -> 3922
    //   3751: goto -> 3758
    //   3754: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3757: athrow
    //   3758: iload #53
    //   3760: ifne -> 3922
    //   3763: goto -> 3770
    //   3766: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3769: athrow
    //   3770: aload #61
    //   3772: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   3775: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3780: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   3783: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   3788: invokeinterface getType : ()Lorg/bukkit/Material;
    //   3793: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   3796: if_acmpne -> 3922
    //   3799: goto -> 3806
    //   3802: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3805: athrow
    //   3806: aload_2
    //   3807: invokestatic u : (Lorg/bukkit/Location;)Z
    //   3810: ifne -> 3922
    //   3813: goto -> 3820
    //   3816: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3819: athrow
    //   3820: aload_0
    //   3821: lload #11
    //   3823: sipush #25291
    //   3826: ldc2_w 794769707705405655
    //   3829: lload #4
    //   3831: lxor
    //   3832: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3837: new java/lang/StringBuilder
    //   3840: dup
    //   3841: invokespecial <init> : ()V
    //   3844: sipush #1890
    //   3847: ldc2_w 5413039596197180781
    //   3850: lload #4
    //   3852: lxor
    //   3853: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3858: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3861: aload_0
    //   3862: getfield g : I
    //   3865: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3868: sipush #17666
    //   3871: ldc2_w 5424474625869297431
    //   3874: lload #4
    //   3876: lxor
    //   3877: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3882: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3885: dload #47
    //   3887: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3890: sipush #27713
    //   3893: ldc2_w 5680904955488673389
    //   3896: lload #4
    //   3898: lxor
    //   3899: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   3904: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3907: dload #54
    //   3909: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   3912: invokevirtual toString : ()Ljava/lang/String;
    //   3915: iconst_3
    //   3916: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   3919: iconst_1
    //   3920: istore #51
    //   3922: aload_3
    //   3923: invokevirtual getY : ()D
    //   3926: aload_2
    //   3927: invokevirtual getY : ()D
    //   3930: dcmpl
    //   3931: ifne -> 4228
    //   3934: aload_0
    //   3935: getfield b : D
    //   3938: dconst_0
    //   3939: dcmpl
    //   3940: ifne -> 4228
    //   3943: goto -> 3950
    //   3946: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3949: athrow
    //   3950: iload #53
    //   3952: ifne -> 4228
    //   3955: goto -> 3962
    //   3958: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3961: athrow
    //   3962: iload #49
    //   3964: ifne -> 4228
    //   3967: goto -> 3974
    //   3970: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3973: athrow
    //   3974: iload #52
    //   3976: ifeq -> 4228
    //   3979: goto -> 3986
    //   3982: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   3985: athrow
    //   3986: aload_0
    //   3987: getfield g : I
    //   3990: bipush #20
    //   3992: if_icmplt -> 4228
    //   3995: goto -> 4002
    //   3998: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4001: athrow
    //   4002: iload #56
    //   4004: ifne -> 4228
    //   4007: goto -> 4014
    //   4010: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4013: athrow
    //   4014: aload #61
    //   4016: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   4019: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   4024: invokeinterface isLiquid : ()Z
    //   4029: ifeq -> 4228
    //   4032: goto -> 4039
    //   4035: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4038: athrow
    //   4039: aload_2
    //   4040: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   4043: invokeinterface isLiquid : ()Z
    //   4048: ifeq -> 4228
    //   4051: goto -> 4058
    //   4054: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4057: athrow
    //   4058: aload_3
    //   4059: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   4062: invokeinterface isLiquid : ()Z
    //   4067: ifeq -> 4228
    //   4070: goto -> 4077
    //   4073: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4076: athrow
    //   4077: aload #43
    //   4079: invokeinterface getEyeLocation : ()Lorg/bukkit/Location;
    //   4084: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   4087: invokeinterface isLiquid : ()Z
    //   4092: ifne -> 4228
    //   4095: goto -> 4102
    //   4098: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4101: athrow
    //   4102: aload #61
    //   4104: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   4107: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   4112: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   4115: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   4120: invokeinterface getType : ()Lorg/bukkit/Material;
    //   4125: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   4128: if_acmpne -> 4228
    //   4131: goto -> 4138
    //   4134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4137: athrow
    //   4138: aload_2
    //   4139: invokestatic u : (Lorg/bukkit/Location;)Z
    //   4142: ifne -> 4228
    //   4145: goto -> 4152
    //   4148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4151: athrow
    //   4152: aload_0
    //   4153: lload #11
    //   4155: sipush #19790
    //   4158: ldc2_w 859937420885213024
    //   4161: lload #4
    //   4163: lxor
    //   4164: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4169: new java/lang/StringBuilder
    //   4172: dup
    //   4173: invokespecial <init> : ()V
    //   4176: sipush #19202
    //   4179: ldc2_w 3425488895951649063
    //   4182: lload #4
    //   4184: lxor
    //   4185: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4193: aload #59
    //   4195: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   4198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4201: sipush #26980
    //   4204: ldc2_w 3240803234105236323
    //   4207: lload #4
    //   4209: lxor
    //   4210: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4218: invokevirtual toString : ()Ljava/lang/String;
    //   4221: iconst_3
    //   4222: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   4225: iconst_1
    //   4226: istore #51
    //   4228: iload #52
    //   4230: ifeq -> 4479
    //   4233: dload #45
    //   4235: dconst_0
    //   4236: dcmpl
    //   4237: ifle -> 4479
    //   4240: goto -> 4247
    //   4243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4246: athrow
    //   4247: aload #43
    //   4249: invokeinterface getEyeLocation : ()Lorg/bukkit/Location;
    //   4254: astore #60
    //   4256: iload #53
    //   4258: ifne -> 4479
    //   4261: aload #60
    //   4263: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   4266: invokeinterface getType : ()Lorg/bukkit/Material;
    //   4271: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   4274: if_acmpne -> 4479
    //   4277: goto -> 4284
    //   4280: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4283: athrow
    //   4284: aload_2
    //   4285: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   4288: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   4291: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   4296: invokeinterface isLiquid : ()Z
    //   4301: ifeq -> 4479
    //   4304: goto -> 4311
    //   4307: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4310: athrow
    //   4311: dload #47
    //   4313: dconst_0
    //   4314: dcmpl
    //   4315: ifne -> 4479
    //   4318: goto -> 4325
    //   4321: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4324: athrow
    //   4325: dload #54
    //   4327: invokestatic abs : (D)D
    //   4330: ldc2_w 1.0E-4
    //   4333: dcmpg
    //   4334: ifge -> 4479
    //   4337: goto -> 4344
    //   4340: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4343: athrow
    //   4344: iload #56
    //   4346: ifne -> 4479
    //   4349: goto -> 4356
    //   4352: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4355: athrow
    //   4356: aload_2
    //   4357: invokestatic d : (Lorg/bukkit/Location;)Z
    //   4360: ifne -> 4479
    //   4363: goto -> 4370
    //   4366: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4369: athrow
    //   4370: aload #60
    //   4372: invokestatic u : (Lorg/bukkit/Location;)Z
    //   4375: ifne -> 4479
    //   4378: goto -> 4385
    //   4381: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4384: athrow
    //   4385: aload #43
    //   4387: invokeinterface getAllowFlight : ()Z
    //   4392: ifne -> 4479
    //   4395: goto -> 4402
    //   4398: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4401: athrow
    //   4402: aload_0
    //   4403: lload #11
    //   4405: sipush #18265
    //   4408: ldc2_w 3372059811158013267
    //   4411: lload #4
    //   4413: lxor
    //   4414: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4419: new java/lang/StringBuilder
    //   4422: dup
    //   4423: invokespecial <init> : ()V
    //   4426: sipush #19202
    //   4429: ldc2_w 3425488895951649063
    //   4432: lload #4
    //   4434: lxor
    //   4435: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4440: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4443: aload #59
    //   4445: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   4448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4451: sipush #6734
    //   4454: ldc2_w 534918497082140741
    //   4457: lload #4
    //   4459: lxor
    //   4460: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4465: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4468: invokevirtual toString : ()Ljava/lang/String;
    //   4471: bipush #7
    //   4473: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   4476: iconst_1
    //   4477: istore #51
    //   4479: dload #54
    //   4481: ldc2_w 0.175
    //   4484: aload_0
    //   4485: getfield b : D
    //   4488: dadd
    //   4489: dcmpl
    //   4490: ifle -> 4667
    //   4493: aload_2
    //   4494: lload #30
    //   4496: invokestatic n : (Lorg/bukkit/Location;J)Z
    //   4499: ifeq -> 4667
    //   4502: goto -> 4509
    //   4505: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4508: athrow
    //   4509: aload_3
    //   4510: invokestatic v : (Lorg/bukkit/Location;)Z
    //   4513: ifne -> 4667
    //   4516: goto -> 4523
    //   4519: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4522: athrow
    //   4523: aload_2
    //   4524: invokestatic b : (Lorg/bukkit/Location;)Z
    //   4527: ifne -> 4667
    //   4530: goto -> 4537
    //   4533: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4536: athrow
    //   4537: aload_3
    //   4538: invokestatic b : (Lorg/bukkit/Location;)Z
    //   4541: ifne -> 4667
    //   4544: goto -> 4551
    //   4547: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4550: athrow
    //   4551: invokestatic j : ()J
    //   4554: aload_0
    //   4555: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   4558: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   4561: invokevirtual j : ()J
    //   4564: lsub
    //   4565: ldc2_w 1200
    //   4568: lcmp
    //   4569: iflt -> 4667
    //   4572: goto -> 4579
    //   4575: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4578: athrow
    //   4579: iload #53
    //   4581: ifne -> 4667
    //   4584: goto -> 4591
    //   4587: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4590: athrow
    //   4591: aload_0
    //   4592: lload #11
    //   4594: sipush #15308
    //   4597: ldc2_w 6550324156543683029
    //   4600: lload #4
    //   4602: lxor
    //   4603: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4608: new java/lang/StringBuilder
    //   4611: dup
    //   4612: invokespecial <init> : ()V
    //   4615: sipush #19202
    //   4618: ldc2_w 3425488895951649063
    //   4621: lload #4
    //   4623: lxor
    //   4624: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4629: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4632: aload #59
    //   4634: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   4637: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4640: sipush #6048
    //   4643: ldc2_w 3270574467823068599
    //   4646: lload #4
    //   4648: lxor
    //   4649: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4654: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4657: invokevirtual toString : ()Ljava/lang/String;
    //   4660: iconst_3
    //   4661: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   4664: iconst_1
    //   4665: istore #51
    //   4667: iload #52
    //   4669: ifne -> 4825
    //   4672: aload_0
    //   4673: getfield f : Z
    //   4676: ifeq -> 4825
    //   4679: goto -> 4686
    //   4682: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4685: athrow
    //   4686: dload #45
    //   4688: aload_0
    //   4689: getfield v : D
    //   4692: dcmpl
    //   4693: ifle -> 4825
    //   4696: goto -> 4703
    //   4699: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4702: athrow
    //   4703: dload #45
    //   4705: ldc2_w 0.2
    //   4708: dcmpl
    //   4709: ifle -> 4825
    //   4712: goto -> 4719
    //   4715: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4718: athrow
    //   4719: dload #54
    //   4721: ldc2_w 0.415
    //   4724: dcmpg
    //   4725: ifge -> 4825
    //   4728: goto -> 4735
    //   4731: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4734: athrow
    //   4735: aload_2
    //   4736: invokestatic b : (Lorg/bukkit/Location;)Z
    //   4739: ifne -> 4825
    //   4742: goto -> 4749
    //   4745: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4748: athrow
    //   4749: aload_0
    //   4750: lload #11
    //   4752: sipush #12317
    //   4755: ldc2_w 4284398025380512283
    //   4758: lload #4
    //   4760: lxor
    //   4761: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4766: new java/lang/StringBuilder
    //   4769: dup
    //   4770: invokespecial <init> : ()V
    //   4773: sipush #19202
    //   4776: ldc2_w 3425488895951649063
    //   4779: lload #4
    //   4781: lxor
    //   4782: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4787: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4790: aload #59
    //   4792: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   4795: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4798: sipush #6504
    //   4801: ldc2_w 8861265139861285704
    //   4804: lload #4
    //   4806: lxor
    //   4807: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4812: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4815: invokevirtual toString : ()Ljava/lang/String;
    //   4818: iconst_3
    //   4819: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   4822: iconst_1
    //   4823: istore #51
    //   4825: iload #52
    //   4827: ifeq -> 5018
    //   4830: dload #54
    //   4832: dconst_0
    //   4833: dcmpl
    //   4834: ifle -> 5018
    //   4837: goto -> 4844
    //   4840: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4843: athrow
    //   4844: dload #45
    //   4846: ldc2_w 0.15
    //   4849: dcmpl
    //   4850: ifle -> 5018
    //   4853: goto -> 4860
    //   4856: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4859: athrow
    //   4860: aload_3
    //   4861: invokestatic v : (Lorg/bukkit/Location;)Z
    //   4864: ifne -> 5018
    //   4867: goto -> 4874
    //   4870: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4873: athrow
    //   4874: iload #53
    //   4876: ifne -> 5018
    //   4879: goto -> 4886
    //   4882: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4885: athrow
    //   4886: aload_3
    //   4887: invokestatic b : (Lorg/bukkit/Location;)Z
    //   4890: ifne -> 5018
    //   4893: goto -> 4900
    //   4896: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4899: athrow
    //   4900: invokestatic j : ()J
    //   4903: aload_0
    //   4904: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   4907: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   4910: invokevirtual j : ()J
    //   4913: lsub
    //   4914: ldc2_w 1200
    //   4917: lcmp
    //   4918: iflt -> 5018
    //   4921: goto -> 4928
    //   4924: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   4927: athrow
    //   4928: aload_0
    //   4929: lload #11
    //   4931: sipush #9435
    //   4934: ldc2_w 4804223132079969990
    //   4937: lload #4
    //   4939: lxor
    //   4940: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4945: new java/lang/StringBuilder
    //   4948: dup
    //   4949: invokespecial <init> : ()V
    //   4952: sipush #5486
    //   4955: ldc2_w 2210402857690720112
    //   4958: lload #4
    //   4960: lxor
    //   4961: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   4966: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4969: aload #59
    //   4971: invokestatic b : (Lorg/bukkit/util/Vector;)Ljava/lang/String;
    //   4974: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4977: ldc_w '/'
    //   4980: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4983: dload #45
    //   4985: invokestatic b : (D)D
    //   4988: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   4991: sipush #24457
    //   4994: ldc2_w 4177139887338663336
    //   4997: lload #4
    //   4999: lxor
    //   5000: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5005: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5008: invokevirtual toString : ()Ljava/lang/String;
    //   5011: iconst_3
    //   5012: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   5015: iconst_1
    //   5016: istore #51
    //   5018: getstatic me/rerere/matrix/internal/pd.w : Z
    //   5021: ifeq -> 5109
    //   5024: sipush #2678
    //   5027: ldc2_w 7430100204805257284
    //   5030: lload #4
    //   5032: lxor
    //   5033: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5038: bipush #6
    //   5040: anewarray java/lang/Object
    //   5043: dup
    //   5044: iconst_0
    //   5045: aload #43
    //   5047: invokeinterface getName : ()Ljava/lang/String;
    //   5052: aastore
    //   5053: dup
    //   5054: iconst_1
    //   5055: iload #52
    //   5057: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5060: aastore
    //   5061: dup
    //   5062: iconst_2
    //   5063: dload #54
    //   5065: invokestatic valueOf : (D)Ljava/lang/Double;
    //   5068: aastore
    //   5069: dup
    //   5070: iconst_3
    //   5071: aload_3
    //   5072: invokevirtual getY : ()D
    //   5075: invokestatic valueOf : (D)Ljava/lang/Double;
    //   5078: aastore
    //   5079: dup
    //   5080: iconst_4
    //   5081: dload #45
    //   5083: invokestatic valueOf : (D)Ljava/lang/Double;
    //   5086: aastore
    //   5087: dup
    //   5088: iconst_5
    //   5089: dload #47
    //   5091: invokestatic valueOf : (D)Ljava/lang/Double;
    //   5094: aastore
    //   5095: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   5098: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   5101: pop
    //   5102: goto -> 5109
    //   5105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5108: athrow
    //   5109: iload #52
    //   5111: ifeq -> 6385
    //   5114: aload_2
    //   5115: invokestatic d : (Lorg/bukkit/Location;)Z
    //   5118: istore #60
    //   5120: aload #43
    //   5122: lload #28
    //   5124: invokestatic h : (Lorg/bukkit/entity/Player;J)Z
    //   5127: istore #61
    //   5129: iload #8
    //   5131: iload #9
    //   5133: aload #43
    //   5135: iload #10
    //   5137: i2b
    //   5138: invokestatic d : (IILorg/bukkit/entity/Player;B)Z
    //   5141: ifeq -> 5686
    //   5144: ldc2_w 0.12
    //   5147: dstore #62
    //   5149: iload #53
    //   5151: ifne -> 5176
    //   5154: invokestatic currentTimeMillis : ()J
    //   5157: aload_0
    //   5158: getfield t : J
    //   5161: lsub
    //   5162: ldc2_w 1500
    //   5165: lcmp
    //   5166: ifge -> 5181
    //   5169: goto -> 5176
    //   5172: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5175: athrow
    //   5176: ldc2_w 0.21
    //   5179: dstore #62
    //   5181: aload #43
    //   5183: lload #28
    //   5185: invokestatic h : (Lorg/bukkit/entity/Player;J)Z
    //   5188: ifeq -> 5199
    //   5191: dload #62
    //   5193: ldc2_w 0.1
    //   5196: dadd
    //   5197: dstore #62
    //   5199: dload #47
    //   5201: ldc2_w 20.0
    //   5204: dcmpg
    //   5205: ifge -> 5216
    //   5208: dload #62
    //   5210: ldc2_w 0.6
    //   5213: dadd
    //   5214: dstore #62
    //   5216: dload #47
    //   5218: ldc2_w 20.0
    //   5221: dcmpl
    //   5222: iflt -> 5249
    //   5225: dload #47
    //   5227: ldc2_w 40.0
    //   5230: dcmpg
    //   5231: ifge -> 5249
    //   5234: goto -> 5241
    //   5237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5240: athrow
    //   5241: dload #62
    //   5243: ldc2_w 0.3
    //   5246: dadd
    //   5247: dstore #62
    //   5249: iload #49
    //   5251: ifeq -> 5279
    //   5254: dload #62
    //   5256: ldc2_w 0.2
    //   5259: aload_0
    //   5260: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   5263: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   5266: lload #26
    //   5268: invokevirtual j : (J)D
    //   5271: ldc2_w 1.5
    //   5274: dmul
    //   5275: dadd
    //   5276: dadd
    //   5277: dstore #62
    //   5279: iload #61
    //   5281: ifeq -> 5292
    //   5284: dload #62
    //   5286: ldc2_w 0.15
    //   5289: dadd
    //   5290: dstore #62
    //   5292: iload #56
    //   5294: ifeq -> 5305
    //   5297: dload #62
    //   5299: ldc2_w 0.1
    //   5302: dadd
    //   5303: dstore #62
    //   5305: invokestatic b : ()I
    //   5308: bipush #13
    //   5310: if_icmplt -> 5385
    //   5313: iload #58
    //   5315: ifeq -> 5333
    //   5318: goto -> 5325
    //   5321: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5324: athrow
    //   5325: dload #62
    //   5327: ldc2_w 1.5
    //   5330: dadd
    //   5331: dstore #62
    //   5333: aload #43
    //   5335: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   5340: invokevirtual getType : ()Lorg/bukkit/Material;
    //   5343: getstatic org/bukkit/Material.TRIDENT : Lorg/bukkit/Material;
    //   5346: if_acmpne -> 5385
    //   5349: aload #43
    //   5351: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   5356: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   5359: getstatic org/bukkit/enchantments/Enchantment.RIPTIDE : Lorg/bukkit/enchantments/Enchantment;
    //   5362: invokeinterface hasEnchant : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   5367: ifeq -> 5385
    //   5370: goto -> 5377
    //   5373: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5376: athrow
    //   5377: dload #62
    //   5379: ldc2_w 3.0
    //   5382: dadd
    //   5383: dstore #62
    //   5385: iload #57
    //   5387: ifne -> 5412
    //   5390: invokestatic currentTimeMillis : ()J
    //   5393: aload_0
    //   5394: getfield u : J
    //   5397: lsub
    //   5398: ldc2_w 1500
    //   5401: lcmp
    //   5402: ifge -> 5420
    //   5405: goto -> 5412
    //   5408: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5411: athrow
    //   5412: dload #62
    //   5414: ldc2_w 3.0
    //   5417: dadd
    //   5418: dstore #62
    //   5420: aload #43
    //   5422: iload #37
    //   5424: i2c
    //   5425: lload #38
    //   5427: invokestatic j : (Lorg/bukkit/entity/Player;CJ)I
    //   5430: ifle -> 5462
    //   5433: dload #62
    //   5435: ldc2_w 0.15
    //   5438: dadd
    //   5439: dstore #62
    //   5441: aload #43
    //   5443: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   5446: invokeinterface hasPotionEffect : (Lorg/bukkit/potion/PotionEffectType;)Z
    //   5451: ifeq -> 5462
    //   5454: dload #62
    //   5456: ldc2_w 0.4
    //   5459: dadd
    //   5460: dstore #62
    //   5462: invokestatic currentTimeMillis : ()J
    //   5465: aload_0
    //   5466: getfield z : J
    //   5469: lsub
    //   5470: ldc2_w 1500
    //   5473: lcmp
    //   5474: ifge -> 5485
    //   5477: dload #62
    //   5479: ldc2_w 0.35
    //   5482: dadd
    //   5483: dstore #62
    //   5485: iload #60
    //   5487: ifeq -> 5498
    //   5490: dload #62
    //   5492: ldc2_w 0.5
    //   5495: dadd
    //   5496: dstore #62
    //   5498: dload #45
    //   5500: dload #62
    //   5502: dcmpl
    //   5503: ifle -> 5686
    //   5506: aload_0
    //   5507: lload #11
    //   5509: sipush #30371
    //   5512: ldc2_w 7240624084668744874
    //   5515: lload #4
    //   5517: lxor
    //   5518: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5523: new java/lang/StringBuilder
    //   5526: dup
    //   5527: invokespecial <init> : ()V
    //   5530: sipush #28943
    //   5533: ldc2_w 6447505068800410424
    //   5536: lload #4
    //   5538: lxor
    //   5539: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5547: dload #45
    //   5549: invokestatic b : (D)D
    //   5552: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   5555: sipush #4635
    //   5558: ldc2_w 2800238057177079819
    //   5561: lload #4
    //   5563: lxor
    //   5564: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5569: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5572: dload #62
    //   5574: invokestatic b : (D)D
    //   5577: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   5580: sipush #24214
    //   5583: ldc2_w 6221450515449392294
    //   5586: lload #4
    //   5588: lxor
    //   5589: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5594: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5597: iload #49
    //   5599: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   5602: sipush #8614
    //   5605: ldc2_w 6306454550881227666
    //   5608: lload #4
    //   5610: lxor
    //   5611: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5616: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5619: iload #60
    //   5621: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   5624: sipush #3393
    //   5627: ldc2_w 8822709198878474075
    //   5630: lload #4
    //   5632: lxor
    //   5633: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   5638: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5641: invokevirtual toString : ()Ljava/lang/String;
    //   5644: iconst_3
    //   5645: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   5648: iconst_1
    //   5649: istore #51
    //   5651: iload #53
    //   5653: ifne -> 5686
    //   5656: invokestatic b : ()I
    //   5659: bipush #13
    //   5661: if_icmplt -> 5686
    //   5664: goto -> 5671
    //   5667: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5670: athrow
    //   5671: aload #43
    //   5673: iconst_0
    //   5674: invokeinterface setSprinting : (Z)V
    //   5679: goto -> 5686
    //   5682: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5685: athrow
    //   5686: aload_2
    //   5687: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   5690: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   5693: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   5698: invokeinterface getType : ()Lorg/bukkit/Material;
    //   5703: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   5706: if_acmpne -> 6385
    //   5709: ldc2_w 0.16
    //   5712: dstore #62
    //   5714: iload #53
    //   5716: ifne -> 5741
    //   5719: invokestatic j : ()J
    //   5722: aload_0
    //   5723: getfield t : J
    //   5726: lsub
    //   5727: ldc2_w 1000
    //   5730: lcmp
    //   5731: ifge -> 5749
    //   5734: goto -> 5741
    //   5737: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5740: athrow
    //   5741: dload #62
    //   5743: ldc2_w 0.55
    //   5746: dadd
    //   5747: dstore #62
    //   5749: dload #47
    //   5751: ldc2_w 20.0
    //   5754: dcmpg
    //   5755: ifge -> 5766
    //   5758: dload #62
    //   5760: ldc2_w 1.3
    //   5763: dadd
    //   5764: dstore #62
    //   5766: iload #61
    //   5768: ifeq -> 5779
    //   5771: dload #62
    //   5773: ldc2_w 0.15
    //   5776: dadd
    //   5777: dstore #62
    //   5779: dload #47
    //   5781: ldc2_w 20.0
    //   5784: dcmpl
    //   5785: iflt -> 5812
    //   5788: dload #47
    //   5790: ldc2_w 40.0
    //   5793: dcmpg
    //   5794: ifge -> 5812
    //   5797: goto -> 5804
    //   5800: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5803: athrow
    //   5804: dload #62
    //   5806: ldc2_w 0.7
    //   5809: dadd
    //   5810: dstore #62
    //   5812: iload #49
    //   5814: ifeq -> 5842
    //   5817: dload #62
    //   5819: ldc2_w 0.2
    //   5822: aload_0
    //   5823: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   5826: invokevirtual b : ()Lme/rerere/matrix/internal/sl;
    //   5829: lload #26
    //   5831: invokevirtual j : (J)D
    //   5834: ldc2_w 3.0
    //   5837: dmul
    //   5838: dadd
    //   5839: dadd
    //   5840: dstore #62
    //   5842: iload #57
    //   5844: ifne -> 5869
    //   5847: invokestatic currentTimeMillis : ()J
    //   5850: aload_0
    //   5851: getfield u : J
    //   5854: lsub
    //   5855: ldc2_w 1500
    //   5858: lcmp
    //   5859: ifge -> 5877
    //   5862: goto -> 5869
    //   5865: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5868: athrow
    //   5869: dload #62
    //   5871: ldc2_w 3.0
    //   5874: dadd
    //   5875: dstore #62
    //   5877: invokestatic b : ()I
    //   5880: bipush #13
    //   5882: if_icmplt -> 5957
    //   5885: iload #58
    //   5887: ifeq -> 5905
    //   5890: goto -> 5897
    //   5893: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5896: athrow
    //   5897: dload #62
    //   5899: ldc2_w 1.5
    //   5902: dadd
    //   5903: dstore #62
    //   5905: aload #43
    //   5907: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   5912: invokevirtual getType : ()Lorg/bukkit/Material;
    //   5915: getstatic org/bukkit/Material.TRIDENT : Lorg/bukkit/Material;
    //   5918: if_acmpne -> 5957
    //   5921: aload #43
    //   5923: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   5928: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   5931: getstatic org/bukkit/enchantments/Enchantment.RIPTIDE : Lorg/bukkit/enchantments/Enchantment;
    //   5934: invokeinterface hasEnchant : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   5939: ifeq -> 5957
    //   5942: goto -> 5949
    //   5945: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   5948: athrow
    //   5949: dload #62
    //   5951: ldc2_w 3.0
    //   5954: dadd
    //   5955: dstore #62
    //   5957: aload #43
    //   5959: iload #37
    //   5961: i2c
    //   5962: lload #38
    //   5964: invokestatic j : (Lorg/bukkit/entity/Player;CJ)I
    //   5967: ifle -> 6000
    //   5970: dload #62
    //   5972: ldc2_w 0.25
    //   5975: aload #43
    //   5977: iload #32
    //   5979: getstatic org/bukkit/potion/PotionEffectType.SPEED : Lorg/bukkit/potion/PotionEffectType;
    //   5982: iload #33
    //   5984: i2s
    //   5985: iload #34
    //   5987: i2s
    //   5988: invokestatic b : (Lorg/bukkit/entity/Player;ILorg/bukkit/potion/PotionEffectType;SS)I
    //   5991: i2d
    //   5992: ldc2_w 0.1
    //   5995: dmul
    //   5996: dadd
    //   5997: dadd
    //   5998: dstore #62
    //   6000: iload #60
    //   6002: ifeq -> 6023
    //   6005: dload #62
    //   6007: ldc2_w 0.5
    //   6010: dadd
    //   6011: dstore #62
    //   6013: aload_0
    //   6014: invokestatic currentTimeMillis : ()J
    //   6017: putfield x : J
    //   6020: goto -> 6046
    //   6023: invokestatic currentTimeMillis : ()J
    //   6026: aload_0
    //   6027: getfield x : J
    //   6030: lsub
    //   6031: ldc2_w 1500
    //   6034: lcmp
    //   6035: ifge -> 6046
    //   6038: dload #62
    //   6040: ldc2_w 0.5
    //   6043: dadd
    //   6044: dstore #62
    //   6046: invokestatic j : ()J
    //   6049: aload_0
    //   6050: getfield z : J
    //   6053: lsub
    //   6054: ldc2_w 1500
    //   6057: lcmp
    //   6058: ifge -> 6069
    //   6061: dload #62
    //   6063: ldc2_w 0.35
    //   6066: dadd
    //   6067: dstore #62
    //   6069: dload #45
    //   6071: dload #62
    //   6073: dcmpl
    //   6074: ifle -> 6232
    //   6077: invokestatic currentTimeMillis : ()J
    //   6080: aload_0
    //   6081: getfield a : J
    //   6084: lsub
    //   6085: ldc2_w 500
    //   6088: lcmp
    //   6089: ifle -> 6232
    //   6092: goto -> 6099
    //   6095: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6098: athrow
    //   6099: aload_2
    //   6100: invokevirtual getY : ()D
    //   6103: aload_2
    //   6104: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   6107: invokeinterface getY : ()I
    //   6112: i2d
    //   6113: ldc2_w 0.9375
    //   6116: dadd
    //   6117: dcmpl
    //   6118: iflt -> 6232
    //   6121: goto -> 6128
    //   6124: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6127: athrow
    //   6128: getstatic me/rerere/matrix/internal/pd.w : Z
    //   6131: ifeq -> 6219
    //   6134: goto -> 6141
    //   6137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6140: athrow
    //   6141: sipush #17577
    //   6144: ldc2_w 5252966139112666796
    //   6147: lload #4
    //   6149: lxor
    //   6150: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   6155: iconst_4
    //   6156: anewarray java/lang/Object
    //   6159: dup
    //   6160: iconst_0
    //   6161: aload #43
    //   6163: invokeinterface getName : ()Ljava/lang/String;
    //   6168: aastore
    //   6169: dup
    //   6170: iconst_1
    //   6171: dload #45
    //   6173: invokestatic b : (D)D
    //   6176: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6179: aastore
    //   6180: dup
    //   6181: iconst_2
    //   6182: dload #62
    //   6184: invokestatic b : (D)D
    //   6187: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6190: aastore
    //   6191: dup
    //   6192: iconst_3
    //   6193: invokestatic currentTimeMillis : ()J
    //   6196: aload_0
    //   6197: getfield a : J
    //   6200: lsub
    //   6201: invokestatic valueOf : (J)Ljava/lang/Long;
    //   6204: aastore
    //   6205: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   6208: invokestatic broadcastMessage : (Ljava/lang/String;)I
    //   6211: pop
    //   6212: goto -> 6219
    //   6215: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6218: athrow
    //   6219: dload #62
    //   6221: dconst_1
    //   6222: dadd
    //   6223: dstore #62
    //   6225: aload_0
    //   6226: invokestatic currentTimeMillis : ()J
    //   6229: putfield a : J
    //   6232: dload #45
    //   6234: dload #62
    //   6236: dcmpl
    //   6237: ifle -> 6385
    //   6240: aload_0
    //   6241: lload #11
    //   6243: sipush #15030
    //   6246: ldc2_w 6372307588063479953
    //   6249: lload #4
    //   6251: lxor
    //   6252: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   6257: new java/lang/StringBuilder
    //   6260: dup
    //   6261: invokespecial <init> : ()V
    //   6264: sipush #22504
    //   6267: ldc2_w 8575679369631442395
    //   6270: lload #4
    //   6272: lxor
    //   6273: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   6278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6281: dload #45
    //   6283: invokestatic b : (D)D
    //   6286: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   6289: sipush #17664
    //   6292: ldc2_w 3495569983288260388
    //   6295: lload #4
    //   6297: lxor
    //   6298: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   6303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6306: dload #62
    //   6308: invokestatic b : (D)D
    //   6311: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   6314: sipush #13528
    //   6317: ldc2_w 4043833714661115639
    //   6320: lload #4
    //   6322: lxor
    //   6323: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   6328: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6331: iload #49
    //   6333: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   6336: sipush #29068
    //   6339: ldc2_w 3849452266887054258
    //   6342: lload #4
    //   6344: lxor
    //   6345: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   6350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6353: iload #60
    //   6355: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   6358: sipush #4011
    //   6361: ldc2_w 6562163980510952835
    //   6364: lload #4
    //   6366: lxor
    //   6367: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   6372: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6375: invokevirtual toString : ()Ljava/lang/String;
    //   6378: iconst_4
    //   6379: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   6382: iconst_1
    //   6383: istore #51
    //   6385: iload #51
    //   6387: ifeq -> 6450
    //   6390: getstatic me/rerere/matrix/internal/wn.l : I
    //   6393: iconst_m1
    //   6394: if_icmpeq -> 6450
    //   6397: goto -> 6404
    //   6400: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6403: athrow
    //   6404: aload_0
    //   6405: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   6408: invokevirtual b : ()Lme/rerere/matrix/internal/qd;
    //   6411: aload_0
    //   6412: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   6415: lload #13
    //   6417: dup2_x1
    //   6418: pop2
    //   6419: invokevirtual b : (JLme/rerere/matrix/internal/yk;)I
    //   6422: getstatic me/rerere/matrix/internal/wn.l : I
    //   6425: if_icmplt -> 6450
    //   6428: goto -> 6435
    //   6431: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6434: athrow
    //   6435: aload_1
    //   6436: aload_2
    //   6437: invokevirtual clone : ()Lorg/bukkit/Location;
    //   6440: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   6443: goto -> 6450
    //   6446: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   6449: athrow
    //   6450: aload_0
    //   6451: dload #54
    //   6453: putfield b : D
    //   6456: aload_0
    //   6457: iload #52
    //   6459: putfield f : Z
    //   6462: aload_0
    //   6463: dload #45
    //   6465: putfield v : D
    //   6468: return
    // Exception table:
    //   from	to	target	type
    //   304	333	336	java/lang/RuntimeException
    //   312	350	350	java/lang/RuntimeException
    //   354	379	382	java/lang/RuntimeException
    //   394	430	433	java/lang/RuntimeException
    //   409	441	441	java/lang/RuntimeException
    //   460	471	471	java/lang/RuntimeException
    //   475	501	504	java/lang/RuntimeException
    //   488	509	509	java/lang/RuntimeException
    //   513	537	537	java/lang/RuntimeException
    //   541	559	562	java/lang/RuntimeException
    //   549	574	574	java/lang/RuntimeException
    //   578	610	613	java/lang/RuntimeException
    //   590	640	643	java/lang/RuntimeException
    //   617	654	657	java/lang/RuntimeException
    //   661	683	683	java/lang/RuntimeException
    //   738	755	755	java/lang/RuntimeException
    //   766	790	793	java/lang/RuntimeException
    //   771	806	806	java/lang/RuntimeException
    //   815	829	832	java/lang/RuntimeException
    //   821	849	852	java/lang/RuntimeException
    //   836	860	860	java/lang/RuntimeException
    //   867	880	883	java/lang/RuntimeException
    //   896	909	912	java/lang/RuntimeException
    //   904	929	932	java/lang/RuntimeException
    //   916	940	940	java/lang/RuntimeException
    //   947	959	962	java/lang/RuntimeException
    //   966	980	983	java/lang/RuntimeException
    //   1035	1047	1050	java/lang/RuntimeException
    //   1077	1089	1092	java/lang/RuntimeException
    //   1114	1135	1138	java/lang/RuntimeException
    //   1122	1143	1143	java/lang/RuntimeException
    //   1160	1170	1173	java/lang/RuntimeException
    //   1165	1182	1185	java/lang/RuntimeException
    //   1177	1199	1202	java/lang/RuntimeException
    //   1189	1218	1221	java/lang/RuntimeException
    //   1206	1238	1241	java/lang/RuntimeException
    //   1225	1252	1255	java/lang/RuntimeException
    //   1245	1277	1280	java/lang/RuntimeException
    //   1379	1389	1392	java/lang/RuntimeException
    //   1384	1401	1404	java/lang/RuntimeException
    //   1396	1417	1420	java/lang/RuntimeException
    //   1408	1436	1439	java/lang/RuntimeException
    //   1424	1453	1456	java/lang/RuntimeException
    //   1443	1472	1475	java/lang/RuntimeException
    //   1460	1491	1494	java/lang/RuntimeException
    //   1479	1521	1524	java/lang/RuntimeException
    //   1651	1661	1664	java/lang/RuntimeException
    //   1656	1673	1676	java/lang/RuntimeException
    //   1668	1687	1690	java/lang/RuntimeException
    //   1680	1703	1706	java/lang/RuntimeException
    //   1694	1722	1725	java/lang/RuntimeException
    //   1710	1743	1746	java/lang/RuntimeException
    //   1729	1768	1771	java/lang/RuntimeException
    //   1750	1785	1788	java/lang/RuntimeException
    //   1984	2002	2005	java/lang/RuntimeException
    //   2015	2038	2041	java/lang/RuntimeException
    //   2053	2073	2076	java/lang/RuntimeException
    //   2061	2092	2095	java/lang/RuntimeException
    //   2080	2166	2169	java/lang/RuntimeException
    //   2173	2190	2193	java/lang/RuntimeException
    //   2185	2205	2208	java/lang/RuntimeException
    //   2197	2220	2223	java/lang/RuntimeException
    //   2212	2239	2242	java/lang/RuntimeException
    //   2227	2266	2269	java/lang/RuntimeException
    //   2276	2294	2297	java/lang/RuntimeException
    //   2312	2335	2338	java/lang/RuntimeException
    //   2373	2405	2408	java/lang/RuntimeException
    //   2524	2542	2545	java/lang/RuntimeException
    //   2669	2686	2689	java/lang/RuntimeException
    //   2693	2710	2713	java/lang/RuntimeException
    //   2698	2722	2725	java/lang/RuntimeException
    //   2717	2738	2741	java/lang/RuntimeException
    //   2729	2760	2763	java/lang/RuntimeException
    //   2745	2779	2782	java/lang/RuntimeException
    //   2767	2801	2804	java/lang/RuntimeException
    //   2786	2812	2812	java/lang/RuntimeException
    //   2837	2857	2860	java/lang/RuntimeException
    //   2867	2894	2897	java/lang/RuntimeException
    //   3080	3090	3093	java/lang/RuntimeException
    //   3085	3106	3109	java/lang/RuntimeException
    //   3097	3120	3123	java/lang/RuntimeException
    //   3113	3139	3142	java/lang/RuntimeException
    //   3127	3169	3172	java/lang/RuntimeException
    //   3252	3262	3265	java/lang/RuntimeException
    //   3257	3276	3279	java/lang/RuntimeException
    //   3269	3294	3297	java/lang/RuntimeException
    //   3283	3316	3319	java/lang/RuntimeException
    //   3301	3343	3346	java/lang/RuntimeException
    //   3505	3529	3532	java/lang/RuntimeException
    //   3517	3555	3558	java/lang/RuntimeException
    //   3572	3590	3593	java/lang/RuntimeException
    //   3582	3606	3609	java/lang/RuntimeException
    //   3597	3625	3628	java/lang/RuntimeException
    //   3613	3641	3644	java/lang/RuntimeException
    //   3632	3653	3656	java/lang/RuntimeException
    //   3648	3678	3681	java/lang/RuntimeException
    //   3660	3690	3693	java/lang/RuntimeException
    //   3685	3723	3726	java/lang/RuntimeException
    //   3697	3751	3754	java/lang/RuntimeException
    //   3730	3763	3766	java/lang/RuntimeException
    //   3758	3799	3802	java/lang/RuntimeException
    //   3770	3813	3816	java/lang/RuntimeException
    //   3922	3943	3946	java/lang/RuntimeException
    //   3934	3955	3958	java/lang/RuntimeException
    //   3950	3967	3970	java/lang/RuntimeException
    //   3962	3979	3982	java/lang/RuntimeException
    //   3974	3995	3998	java/lang/RuntimeException
    //   3986	4007	4010	java/lang/RuntimeException
    //   4002	4032	4035	java/lang/RuntimeException
    //   4014	4051	4054	java/lang/RuntimeException
    //   4039	4070	4073	java/lang/RuntimeException
    //   4058	4095	4098	java/lang/RuntimeException
    //   4077	4131	4134	java/lang/RuntimeException
    //   4102	4145	4148	java/lang/RuntimeException
    //   4228	4240	4243	java/lang/RuntimeException
    //   4256	4277	4280	java/lang/RuntimeException
    //   4261	4304	4307	java/lang/RuntimeException
    //   4284	4318	4321	java/lang/RuntimeException
    //   4311	4337	4340	java/lang/RuntimeException
    //   4325	4349	4352	java/lang/RuntimeException
    //   4344	4363	4366	java/lang/RuntimeException
    //   4356	4378	4381	java/lang/RuntimeException
    //   4370	4395	4398	java/lang/RuntimeException
    //   4479	4502	4505	java/lang/RuntimeException
    //   4493	4516	4519	java/lang/RuntimeException
    //   4509	4530	4533	java/lang/RuntimeException
    //   4523	4544	4547	java/lang/RuntimeException
    //   4537	4572	4575	java/lang/RuntimeException
    //   4551	4584	4587	java/lang/RuntimeException
    //   4667	4679	4682	java/lang/RuntimeException
    //   4672	4696	4699	java/lang/RuntimeException
    //   4686	4712	4715	java/lang/RuntimeException
    //   4703	4728	4731	java/lang/RuntimeException
    //   4719	4742	4745	java/lang/RuntimeException
    //   4825	4837	4840	java/lang/RuntimeException
    //   4830	4853	4856	java/lang/RuntimeException
    //   4844	4867	4870	java/lang/RuntimeException
    //   4860	4879	4882	java/lang/RuntimeException
    //   4874	4893	4896	java/lang/RuntimeException
    //   4886	4921	4924	java/lang/RuntimeException
    //   5018	5102	5105	java/lang/RuntimeException
    //   5149	5169	5172	java/lang/RuntimeException
    //   5216	5234	5237	java/lang/RuntimeException
    //   5305	5318	5321	java/lang/RuntimeException
    //   5333	5370	5373	java/lang/RuntimeException
    //   5385	5405	5408	java/lang/RuntimeException
    //   5651	5664	5667	java/lang/RuntimeException
    //   5656	5679	5682	java/lang/RuntimeException
    //   5714	5734	5737	java/lang/RuntimeException
    //   5779	5797	5800	java/lang/RuntimeException
    //   5842	5862	5865	java/lang/RuntimeException
    //   5877	5890	5893	java/lang/RuntimeException
    //   5905	5942	5945	java/lang/RuntimeException
    //   6069	6092	6095	java/lang/RuntimeException
    //   6077	6121	6124	java/lang/RuntimeException
    //   6099	6134	6137	java/lang/RuntimeException
    //   6128	6212	6215	java/lang/RuntimeException
    //   6385	6397	6400	java/lang/RuntimeException
    //   6390	6428	6431	java/lang/RuntimeException
    //   6404	6443	6446	java/lang/RuntimeException
  }
  
  public wn(yl paramyl) {
    super(paramyl, yk.y);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6999;
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
        throw new RuntimeException("me/rerere/matrix/internal/wn", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/wn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\wn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
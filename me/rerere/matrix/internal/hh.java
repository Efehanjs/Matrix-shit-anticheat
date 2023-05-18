package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.reflect.StructureModifier;
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
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class hh extends zk {
  private int y = 0;
  
  private double m;
  
  private static boolean o;
  
  private double q = 0.0D;
  
  private double t = 0.0D;
  
  private double g = 0.0D;
  
  private double a = 0.0D;
  
  private boolean s = false;
  
  private double u = 0.0D;
  
  private double w = 0.0D;
  
  private static int f;
  
  private double l;
  
  private double r;
  
  @Nullable
  private Vector x;
  
  private boolean z = false;
  
  private double k;
  
  private int v;
  
  private static final int b = 8;
  
  @Nullable
  private StringBuilder i = new StringBuilder();
  
  private static final long c = o3.a(815972553318378433L, -3133363278686428333L, MethodHandles.lookup().lookupClass()).a(248956058628886L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map h = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/hh.c : J
    //   3: ldc2_w 12650931874119
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #29446
    //   15: ldc2_w 4054859390846347817
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/hh.o : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #1404
    //   41: ldc2_w 7832162017272224840
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   51: iconst_3
    //   52: invokeinterface getInt : (Ljava/lang/String;I)I
    //   57: putstatic me/rerere/matrix/internal/hh.f : I
    //   60: return
  }
  
  public hh(yl paramyl) {
    super(paramyl);
    b(yk.l);
  }
  
  public boolean b(@NotNull PacketType paramPacketType, @NotNull PacketContainer paramPacketContainer, @NotNull PacketEvent paramPacketEvent) {
    try {
      if (paramPacketType == PacketType.Play.Server.ENTITY_VELOCITY && !paramPacketEvent.isCancelled()) {
        StructureModifier structureModifier = paramPacketContainer.getIntegers();
        int i = ((Integer)structureModifier.read(0)).intValue();
        Player player = paramPacketEvent.getPlayer();
        try {
          if (player != null && i == player.getEntityId()) {
            double d1 = ((Integer)structureModifier.readSafely(1)).intValue() / 8000.0D;
            double d2 = ((Integer)structureModifier.readSafely(2)).intValue() / 8000.0D;
            double d3 = ((Integer)structureModifier.readSafely(3)).intValue() / 8000.0D;
            try {
              if (f >= 0)
                try {
                  if (d2 > 0.1D)
                    try {
                      if (d2 <= 0.75D)
                        try {
                          if (Math.abs(d1) < 1.5D)
                            try {
                              if (Math.abs(d3) < 1.5D)
                                try {
                                  if (zb.b(d1, d3) > 0.1D) {
                                    this.r = d2;
                                    this.k = d1;
                                    this.l = d3;
                                    this.x = null;
                                    this.v = 0;
                                    this.s = false;
                                    this.z = true;
                                    this.a = 0.0D;
                                    this.g = 0.0D;
                                    this.y = 0;
                                    this.m = 0.0D;
                                    this.u = -1.0D;
                                    this.i = null;
                                    this.i = new StringBuilder();
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
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = c ^ 0x78E3720B2289L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[31];
    boolean bool = false;
    String str;
    int i = (str = "8Ú\007¢\035ÕmÎ?ì}\týßéÓ?¯7¯ãÚ¨¯|çðúÖ ºîê½Ðë¢ð¡Z®/\020åÍ,JT«Ú\002É[r\023£·®Xág\035T\020@R&\022Z6(\032óç$(ß°\fÛpåÛ²\021ïÙW½×\b\005y[KüúEÁU2É2&\001k\0325MÙçÞ¹\031ØiJ5ä¡äÜ°âÙ!ËPG\025âî\020|0p\007å!KÕF%©Ì\025x\r\020{ÄiÌ`Ê]ÃÐS\005Jö®å D¢Ò[qç\037<>¥bï¹u¿\002)Zë\\ÍBêà!5\030â5ëö$\r8\024\0013»h\021ûò2\"ò\030%¢\004î= ¢.vµZoÏ\001©Àã¤é\027åÓïÉµ\025§!É6D\023Ï£\020\034<ñÀÉ\004¢E:¡´\030n8\020«(gD\016/\023ÆeYñQÔ]éô(E½2V\000ÿ¸D­Lï ò©=\016÷Á«(\017bE^ÀöMÀ#l°+\023b¶\020WÇO\020 6y\002zíZ÷\020 G¢\002\013»µrZC¶ûlÙÄ\001\025Ð\023ÜcP©\\+ÇÁ¸$,\020°Än¹\037(Áäí \007à_[ç\020%®Ã²´ð«É^|AWÓ\030qï\fk\013tÜ-+1Û\000M1£ü¤TÓS \0055-ªo²ÊÍá\031«?\035_8AÉ$»\017T¾°eGãËøÄ \f>ó\t\034LÛ¾îèHÈßà·1ì'ð\024¢ÆªP´\020Äm ]û,\021Èaì1\025ã¤ ¥¯¥ó \\¡A`HÉ´ÿIv¯\024Ìþ4\000Þ¸\016®øÊ\036¯@Ëö\022¢Áß¢\004Û\033@ wöá×ÉT+M\\íSÌÞ#o8É\016;b}K¿ÐeøÌ¹8^\013H\t\017çOÜ\001ü®û:\020¥\034|.ó2Ð4pMhàö¸Ä\020\013¯\017+ÍXOÞ\035²§Ë\023(\020Ê\030\016¿|ºIè¼y\026ÁØ¡£\020AÃ¤\013\013I\022\030»¾L²|\020¶æ\034\002ß6\"qßl°¹\n´\020ÏX®¯ÿ\033!ûd\021+ºJè¸{@c\021UcëãÂ\026±QdEÔXd\013L8èPjàVÅ\024\"»ïUq\021*C£{o«`\000\020ÃO·²h®«ÛK\004\f\033î\021\rf\026×0Mó¯Y¦Q)oÉIõ)È\002Z«GmEd: .DLXÌH¬\np²¦\\Æµq\007t:").length();
    byte b2 = 48;
    byte b = -1;
    while (true);
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/hh.c : J
    //   3: ldc2_w 125367208693017
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 97560646786312
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 52505769969781
    //   22: lxor
    //   23: lstore #8
    //   25: dup2
    //   26: ldc2_w 31452344419112
    //   29: lxor
    //   30: lstore #10
    //   32: dup2
    //   33: ldc2_w 32886367926638
    //   36: lxor
    //   37: dup2
    //   38: bipush #32
    //   40: lushr
    //   41: l2i
    //   42: istore #12
    //   44: dup2
    //   45: bipush #32
    //   47: lshl
    //   48: bipush #32
    //   50: lushr
    //   51: lstore #13
    //   53: pop2
    //   54: dup2
    //   55: ldc2_w 37579749197918
    //   58: lxor
    //   59: dup2
    //   60: bipush #32
    //   62: lushr
    //   63: l2i
    //   64: istore #15
    //   66: dup2
    //   67: bipush #32
    //   69: lshl
    //   70: bipush #48
    //   72: lushr
    //   73: l2i
    //   74: istore #16
    //   76: dup2
    //   77: bipush #48
    //   79: lshl
    //   80: bipush #48
    //   82: lushr
    //   83: l2i
    //   84: istore #17
    //   86: pop2
    //   87: dup2
    //   88: ldc2_w 28779424759124
    //   91: lxor
    //   92: dup2
    //   93: bipush #16
    //   95: lushr
    //   96: lstore #18
    //   98: dup2
    //   99: bipush #48
    //   101: lshl
    //   102: bipush #48
    //   104: lushr
    //   105: l2i
    //   106: istore #20
    //   108: pop2
    //   109: dup2
    //   110: ldc2_w 40409504239005
    //   113: lxor
    //   114: lstore #21
    //   116: dup2
    //   117: ldc2_w 76347382582132
    //   120: lxor
    //   121: dup2
    //   122: bipush #48
    //   124: lushr
    //   125: l2i
    //   126: istore #23
    //   128: dup2
    //   129: bipush #16
    //   131: lshl
    //   132: bipush #32
    //   134: lushr
    //   135: l2i
    //   136: istore #24
    //   138: dup2
    //   139: bipush #48
    //   141: lshl
    //   142: bipush #48
    //   144: lushr
    //   145: l2i
    //   146: istore #25
    //   148: pop2
    //   149: pop2
    //   150: aload_0
    //   151: getfield z : Z
    //   154: ifne -> 162
    //   157: return
    //   158: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   161: athrow
    //   162: aload_1
    //   163: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   166: astore #26
    //   168: aload_0
    //   169: getfield s : Z
    //   172: ifne -> 589
    //   175: aload_3
    //   176: invokevirtual getY : ()D
    //   179: aload_2
    //   180: invokevirtual getY : ()D
    //   183: dsub
    //   184: dstore #27
    //   186: dload #27
    //   188: aload_0
    //   189: getfield r : D
    //   192: dsub
    //   193: invokestatic abs : (D)D
    //   196: ldc2_w 0.005
    //   199: dcmpg
    //   200: ifgt -> 588
    //   203: aload_0
    //   204: aload_3
    //   205: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   208: putfield x : Lorg/bukkit/util/Vector;
    //   211: aload_0
    //   212: iconst_1
    //   213: putfield s : Z
    //   216: aload_0
    //   217: iconst_0
    //   218: putfield v : I
    //   221: aload_0
    //   222: aload_2
    //   223: aload_3
    //   224: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;)D
    //   227: putfield u : D
    //   230: aload_0
    //   231: aload_1
    //   232: aload_2
    //   233: iload #12
    //   235: lload #13
    //   237: aload_3
    //   238: invokespecial j : (Lorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/Location;IJLorg/bukkit/Location;)V
    //   241: aload_0
    //   242: getfield i : Ljava/lang/StringBuilder;
    //   245: sipush #18471
    //   248: ldc2_w 3475312791895127375
    //   251: lload #4
    //   253: lxor
    //   254: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: aload_0
    //   263: getfield u : D
    //   266: invokestatic b : (D)D
    //   269: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   272: pop
    //   273: aload_0
    //   274: getfield u : D
    //   277: aload_0
    //   278: getfield k : D
    //   281: invokestatic abs : (D)D
    //   284: aload_0
    //   285: getfield l : D
    //   288: invokestatic abs : (D)D
    //   291: invokestatic max : (DD)D
    //   294: ldc2_w 0.1
    //   297: dmul
    //   298: dcmpg
    //   299: ifge -> 460
    //   302: goto -> 309
    //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   308: athrow
    //   309: aload_0
    //   310: aload #26
    //   312: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   317: lload #6
    //   319: dup2_x1
    //   320: pop2
    //   321: aload #26
    //   323: invokespecial b : (JLorg/bukkit/Location;Lorg/bukkit/entity/Player;)Z
    //   326: ifeq -> 460
    //   329: goto -> 336
    //   332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   335: athrow
    //   336: aload_0
    //   337: lload #8
    //   339: sipush #14700
    //   342: ldc2_w 7297832501915894801
    //   345: lload #4
    //   347: lxor
    //   348: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   353: new java/lang/StringBuilder
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: sipush #11668
    //   363: ldc2_w 6021761543657967855
    //   366: lload #4
    //   368: lxor
    //   369: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   374: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: aload_0
    //   378: getfield k : D
    //   381: invokestatic b : (D)D
    //   384: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   387: sipush #15155
    //   390: ldc2_w 1710799860655933002
    //   393: lload #4
    //   395: lxor
    //   396: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   401: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: aload_0
    //   405: getfield l : D
    //   408: invokestatic b : (D)D
    //   411: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   414: sipush #13299
    //   417: ldc2_w 9097833823711743640
    //   420: lload #4
    //   422: lxor
    //   423: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   428: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   431: aload_0
    //   432: getfield u : D
    //   435: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   438: ldc_w ')'
    //   441: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: invokevirtual toString : ()Ljava/lang/String;
    //   447: getstatic me/rerere/matrix/internal/hh.f : I
    //   450: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   453: goto -> 460
    //   456: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   459: athrow
    //   460: getstatic me/rerere/matrix/internal/pd.w : Z
    //   463: ifeq -> 588
    //   466: new java/lang/StringBuilder
    //   469: dup
    //   470: invokespecial <init> : ()V
    //   473: sipush #16596
    //   476: ldc2_w 4680821279122210218
    //   479: lload #4
    //   481: lxor
    //   482: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   487: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   490: aload #26
    //   492: invokeinterface getName : ()Ljava/lang/String;
    //   497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   500: sipush #14220
    //   503: ldc2_w 683536386139671295
    //   506: lload #4
    //   508: lxor
    //   509: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   514: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   517: aload_0
    //   518: getfield u : D
    //   521: invokestatic b : (D)D
    //   524: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   527: sipush #16391
    //   530: ldc2_w 4768887455169232253
    //   533: lload #4
    //   535: lxor
    //   536: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   541: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   544: aload_0
    //   545: getfield k : D
    //   548: invokestatic b : (D)D
    //   551: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   554: ldc_w ','
    //   557: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: aload_0
    //   561: getfield l : D
    //   564: invokestatic b : (D)D
    //   567: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   570: invokevirtual toString : ()Ljava/lang/String;
    //   573: lload #18
    //   575: iload #20
    //   577: i2s
    //   578: invokestatic b : (Ljava/lang/String;JS)V
    //   581: goto -> 588
    //   584: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   587: athrow
    //   588: return
    //   589: aload_0
    //   590: dup
    //   591: getfield v : I
    //   594: iconst_1
    //   595: iadd
    //   596: putfield v : I
    //   599: iload #15
    //   601: iload #16
    //   603: i2s
    //   604: aload #26
    //   606: iload #17
    //   608: invokestatic t : (ISLorg/bukkit/entity/Player;I)Z
    //   611: ifne -> 631
    //   614: aload_0
    //   615: dup
    //   616: getfield y : I
    //   619: iconst_1
    //   620: iadd
    //   621: putfield y : I
    //   624: goto -> 631
    //   627: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   630: athrow
    //   631: aload_3
    //   632: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   635: aload_0
    //   636: getfield x : Lorg/bukkit/util/Vector;
    //   639: invokestatic b : (Lorg/bukkit/util/Vector;Lorg/bukkit/util/Vector;)D
    //   642: dstore #27
    //   644: aload_3
    //   645: invokevirtual getX : ()D
    //   648: aload_2
    //   649: invokevirtual getX : ()D
    //   652: dsub
    //   653: dstore #29
    //   655: aload_3
    //   656: invokevirtual getZ : ()D
    //   659: aload_2
    //   660: invokevirtual getZ : ()D
    //   663: dsub
    //   664: dstore #31
    //   666: dload #29
    //   668: aload_0
    //   669: getfield w : D
    //   672: dsub
    //   673: dstore #33
    //   675: dload #31
    //   677: aload_0
    //   678: getfield q : D
    //   681: dsub
    //   682: dstore #35
    //   684: dload #33
    //   686: dload #33
    //   688: dmul
    //   689: dload #35
    //   691: dload #35
    //   693: dmul
    //   694: dadd
    //   695: invokestatic sqrt : (D)D
    //   698: dstore #37
    //   700: dload #37
    //   702: aload_0
    //   703: lload #21
    //   705: invokespecial b : (J)D
    //   708: dcmpl
    //   709: ifle -> 949
    //   712: aload_0
    //   713: dup
    //   714: getfield m : D
    //   717: dload #37
    //   719: aload_0
    //   720: lload #21
    //   722: invokespecial b : (J)D
    //   725: dsub
    //   726: dadd
    //   727: putfield m : D
    //   730: aload_0
    //   731: getfield i : Ljava/lang/StringBuilder;
    //   734: sipush #8907
    //   737: ldc2_w 4480915391246491557
    //   740: lload #4
    //   742: lxor
    //   743: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   748: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   751: dload #37
    //   753: invokestatic b : (D)D
    //   756: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   759: ldc_w '/'
    //   762: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   765: aload_0
    //   766: lload #21
    //   768: invokespecial b : (J)D
    //   771: invokestatic b : (D)D
    //   774: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   777: ldc_w '/'
    //   780: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   783: new org/bukkit/util/Vector
    //   786: dup
    //   787: dload #29
    //   789: dconst_0
    //   790: dload #31
    //   792: invokespecial <init> : (DDD)V
    //   795: invokevirtual length : ()D
    //   798: invokestatic b : (D)D
    //   801: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   804: ldc_w '/'
    //   807: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   810: dload #33
    //   812: invokestatic b : (D)D
    //   815: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   818: ldc_w '-'
    //   821: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   824: dload #35
    //   826: invokestatic b : (D)D
    //   829: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   832: pop
    //   833: getstatic me/rerere/matrix/internal/pd.w : Z
    //   836: ifeq -> 949
    //   839: goto -> 846
    //   842: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   845: athrow
    //   846: new java/lang/StringBuilder
    //   849: dup
    //   850: invokespecial <init> : ()V
    //   853: sipush #1370
    //   856: ldc2_w 3887130360825509926
    //   859: lload #4
    //   861: lxor
    //   862: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   867: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   870: aload #26
    //   872: invokeinterface getName : ()Ljava/lang/String;
    //   877: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   880: sipush #22359
    //   883: ldc2_w 1694867248704072240
    //   886: lload #4
    //   888: lxor
    //   889: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   894: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   897: dload #37
    //   899: invokestatic b : (D)D
    //   902: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   905: sipush #31215
    //   908: ldc2_w 9198260819394299037
    //   911: lload #4
    //   913: lxor
    //   914: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: aload_0
    //   923: lload #21
    //   925: invokespecial b : (J)D
    //   928: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   931: invokevirtual toString : ()Ljava/lang/String;
    //   934: lload #18
    //   936: iload #20
    //   938: i2s
    //   939: invokestatic b : (Ljava/lang/String;JS)V
    //   942: goto -> 949
    //   945: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   948: athrow
    //   949: aload_0
    //   950: getfield v : I
    //   953: iconst_1
    //   954: if_icmpne -> 1134
    //   957: aload_3
    //   958: invokevirtual getY : ()D
    //   961: aload_2
    //   962: invokevirtual getY : ()D
    //   965: dsub
    //   966: dstore #39
    //   968: aload_0
    //   969: getfield r : D
    //   972: ldc2_w 0.08
    //   975: dsub
    //   976: ldc2_w 0.98
    //   979: dmul
    //   980: dstore #41
    //   982: dload #41
    //   984: dconst_0
    //   985: dcmpl
    //   986: ifle -> 1134
    //   989: dload #39
    //   991: dconst_0
    //   992: dcmpg
    //   993: ifge -> 1134
    //   996: goto -> 1003
    //   999: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1002: athrow
    //   1003: dload #41
    //   1005: dload #39
    //   1007: dsub
    //   1008: invokestatic abs : (D)D
    //   1011: ldc2_w 0.43
    //   1014: dcmpl
    //   1015: ifle -> 1134
    //   1018: goto -> 1025
    //   1021: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1024: athrow
    //   1025: aload_3
    //   1026: lload #10
    //   1028: invokestatic p : (Lorg/bukkit/Location;J)Z
    //   1031: ifeq -> 1134
    //   1034: goto -> 1041
    //   1037: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1040: athrow
    //   1041: aload_2
    //   1042: invokestatic f : (Lorg/bukkit/Location;)Z
    //   1045: ifeq -> 1134
    //   1048: goto -> 1055
    //   1051: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1054: athrow
    //   1055: aload_0
    //   1056: lload #8
    //   1058: sipush #14700
    //   1061: ldc2_w 7297832501915894801
    //   1064: lload #4
    //   1066: lxor
    //   1067: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   1072: new java/lang/StringBuilder
    //   1075: dup
    //   1076: invokespecial <init> : ()V
    //   1079: sipush #7940
    //   1082: ldc2_w 5702950097148273254
    //   1085: lload #4
    //   1087: lxor
    //   1088: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   1093: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1096: dload #39
    //   1098: invokestatic b : (D)D
    //   1101: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1104: ldc_w ','
    //   1107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1110: dload #41
    //   1112: invokestatic b : (D)D
    //   1115: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   1118: invokevirtual toString : ()Ljava/lang/String;
    //   1121: getstatic me/rerere/matrix/internal/hh.f : I
    //   1124: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1127: goto -> 1134
    //   1130: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1133: athrow
    //   1134: aload_0
    //   1135: aload_1
    //   1136: aload_2
    //   1137: iload #12
    //   1139: lload #13
    //   1141: aload_3
    //   1142: invokespecial j : (Lorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/Location;IJLorg/bukkit/Location;)V
    //   1145: dload #27
    //   1147: aload_0
    //   1148: getfield g : D
    //   1151: dcmpl
    //   1152: ifle -> 1168
    //   1155: aload_0
    //   1156: dload #27
    //   1158: putfield g : D
    //   1161: goto -> 1168
    //   1164: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1167: athrow
    //   1168: aload_0
    //   1169: getfield v : I
    //   1172: bipush #8
    //   1174: if_icmplt -> 1206
    //   1177: aload_0
    //   1178: dload #27
    //   1180: putfield a : D
    //   1183: aload_0
    //   1184: iload #23
    //   1186: i2s
    //   1187: iload #24
    //   1189: iload #25
    //   1191: i2s
    //   1192: invokespecial h : (SIS)V
    //   1195: aload_0
    //   1196: invokespecial t : ()V
    //   1199: goto -> 1206
    //   1202: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1205: athrow
    //   1206: return
    // Exception table:
    //   from	to	target	type
    //   150	158	158	java/lang/RuntimeException
    //   186	302	305	java/lang/RuntimeException
    //   203	329	332	java/lang/RuntimeException
    //   309	453	456	java/lang/RuntimeException
    //   460	581	584	java/lang/RuntimeException
    //   589	624	627	java/lang/RuntimeException
    //   700	839	842	java/lang/RuntimeException
    //   712	942	945	java/lang/RuntimeException
    //   982	996	999	java/lang/RuntimeException
    //   989	1018	1021	java/lang/RuntimeException
    //   1003	1034	1037	java/lang/RuntimeException
    //   1025	1048	1051	java/lang/RuntimeException
    //   1041	1127	1130	java/lang/RuntimeException
    //   1134	1161	1164	java/lang/RuntimeException
    //   1168	1199	1202	java/lang/RuntimeException
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x66FF;
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
        throw new RuntimeException("me/rerere/matrix/internal/hh", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/hh'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\hh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
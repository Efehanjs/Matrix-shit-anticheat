package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers;
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
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;

public class xj extends zk {
  private long k;
  
  private static String v;
  
  private static final Set b;
  
  private static boolean i;
  
  private static final long a = o3.a(3020412617366776396L, -1783853606641056694L, MethodHandles.lookup().lookupClass()).a(94800318216541L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xj.a : J
    //   3: ldc2_w 120420758012373
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #18121
    //   15: ldc2_w 7364798288115730325
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/xj.i : Z
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #30034
    //   41: ldc2_w 7434036456275358725
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   51: sipush #11541
    //   54: ldc2_w 6284998774200495183
    //   57: lload_1
    //   58: lxor
    //   59: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   64: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   69: putstatic me/rerere/matrix/internal/xj.v : Ljava/lang/String;
    //   72: return
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    if (paramPacketType == PacketType.Play.Client.BLOCK_DIG) {
      EnumWrappers.PlayerDigType playerDigType = (EnumWrappers.PlayerDigType)paramPacketContainer.getPlayerDigTypes().read(0);
      try {
        if (playerDigType == EnumWrappers.PlayerDigType.STOP_DESTROY_BLOCK)
          this.k = System.currentTimeMillis(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public xj(yl paramyl) {
    super(paramyl);
    b(yk.k);
  }
  
  static {
    long l = a ^ 0x6029581B9E1FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[12];
    boolean bool = false;
    String str;
    int i = (str = "Lä\002ðKû &\033)Á\037Ç6Ê\022,¤Ú¼ºJ-\003suVö@ÿc\r\006í\013\016º\r\f4r\003\nâ«jÿ\nå½õ«Ù^$#øu¹ª â\005wêWH\037Y\020E3p\025\032_3ùFpH* @7ÏÊUc·\0079ÄH\035A§\n\032DN\007TJ\fXöão\030Ãì\034ª¬>D@\032\025FH$xW×ì[õ\n\020òâ$HA¥°íÐ_ö\004WXå\030]6>ÌÇ\016qÞè\035ù\030#I\001\037S[ñÌ\0204Í8ÀÏ÷45Q6f\020\016 t}SºÌì\030\004î¶ÙrÒû\020zh\\\026\r«ª»1\034L»Î5 ¡\030Îwò\004¬Ê)CB¹±f¥ax¼È¯v\036").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  public void b(short paramShort, int paramInt1, int paramInt2, @NotNull BlockBreakEvent paramBlockBreakEvent) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: lstore #5
    //   25: lload #5
    //   27: dup2
    //   28: ldc2_w 101506893736025
    //   31: lxor
    //   32: lstore #7
    //   34: dup2
    //   35: ldc2_w 74633120587191
    //   38: lxor
    //   39: lstore #9
    //   41: dup2
    //   42: ldc2_w 98532970959861
    //   45: lxor
    //   46: lstore #11
    //   48: dup2
    //   49: ldc2_w 80440252907746
    //   52: lxor
    //   53: lstore #13
    //   55: dup2
    //   56: ldc2_w 96239953607718
    //   59: lxor
    //   60: dup2
    //   61: bipush #48
    //   63: lushr
    //   64: l2i
    //   65: istore #15
    //   67: dup2
    //   68: bipush #16
    //   70: lshl
    //   71: bipush #32
    //   73: lushr
    //   74: l2i
    //   75: istore #16
    //   77: dup2
    //   78: bipush #48
    //   80: lshl
    //   81: bipush #48
    //   83: lushr
    //   84: l2i
    //   85: istore #17
    //   87: pop2
    //   88: pop2
    //   89: aload #4
    //   91: invokevirtual getClass : ()Ljava/lang/Class;
    //   94: ldc_w org/bukkit/event/block/BlockBreakEvent
    //   97: if_acmpeq -> 105
    //   100: return
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: getstatic me/rerere/matrix/internal/xj.i : Z
    //   108: ifne -> 116
    //   111: return
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: getstatic me/rerere/matrix/internal/xj.v : Ljava/lang/String;
    //   119: sipush #8414
    //   122: ldc2_w 8011750140172193678
    //   125: lload #5
    //   127: lxor
    //   128: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   133: invokevirtual equals : (Ljava/lang/Object;)Z
    //   136: ifne -> 144
    //   139: return
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: aload #4
    //   146: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   149: astore #18
    //   151: aload #18
    //   153: invokeinterface getType : ()Lorg/bukkit/Material;
    //   158: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   161: if_acmpne -> 169
    //   164: return
    //   165: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   168: athrow
    //   169: aload #4
    //   171: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   174: astore #19
    //   176: aload #19
    //   178: invokeinterface getGameMode : ()Lorg/bukkit/GameMode;
    //   183: getstatic org/bukkit/GameMode.CREATIVE : Lorg/bukkit/GameMode;
    //   186: if_acmpne -> 194
    //   189: return
    //   190: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   193: athrow
    //   194: aload #18
    //   196: invokeinterface getType : ()Lorg/bukkit/Material;
    //   201: invokestatic h : (Lorg/bukkit/Material;)Z
    //   204: ifne -> 212
    //   207: return
    //   208: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   211: athrow
    //   212: aload #19
    //   214: sipush #15464
    //   217: ldc2_w 6247083279329415994
    //   220: lload #5
    //   222: lxor
    //   223: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   228: invokeinterface hasMetadata : (Ljava/lang/String;)Z
    //   233: ifeq -> 241
    //   236: return
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: iconst_0
    //   242: istore #20
    //   244: iconst_0
    //   245: istore #21
    //   247: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   250: astore #22
    //   252: aload #19
    //   254: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   259: iload #15
    //   261: i2c
    //   262: swap
    //   263: lload #7
    //   265: aload #19
    //   267: aload_0
    //   268: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   271: invokestatic b : (JLorg/bukkit/entity/Player;Lme/rerere/matrix/internal/yl;)D
    //   274: iload #16
    //   276: dup_x2
    //   277: pop
    //   278: getstatic me/rerere/matrix/internal/xj.b : Ljava/util/Set;
    //   281: bipush #7
    //   283: iload #17
    //   285: i2s
    //   286: invokestatic b : (CLorg/bukkit/Location;IDLjava/util/Set;IS)Ljava/util/List;
    //   289: invokeinterface iterator : ()Ljava/util/Iterator;
    //   294: astore #23
    //   296: aload #23
    //   298: invokeinterface hasNext : ()Z
    //   303: ifeq -> 673
    //   306: aload #23
    //   308: invokeinterface next : ()Ljava/lang/Object;
    //   313: checkcast org/bukkit/block/Block
    //   316: astore #24
    //   318: aload #24
    //   320: aload #18
    //   322: invokevirtual equals : (Ljava/lang/Object;)Z
    //   325: ifeq -> 334
    //   328: iconst_1
    //   329: istore #21
    //   331: goto -> 673
    //   334: aload #24
    //   336: lload #11
    //   338: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   341: invokestatic b : (Lorg/bukkit/block/Block;JLme/rerere/matrix/internal/ya;)[Lme/rerere/matrix/internal/sa;
    //   344: astore #25
    //   346: aload #25
    //   348: arraylength
    //   349: ifne -> 359
    //   352: goto -> 296
    //   355: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   358: athrow
    //   359: aload #25
    //   361: arraylength
    //   362: iconst_1
    //   363: if_icmple -> 373
    //   366: goto -> 296
    //   369: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   372: athrow
    //   373: invokestatic b : ()I
    //   376: bipush #14
    //   378: if_icmplt -> 408
    //   381: aload #24
    //   383: invokeinterface getType : ()Lorg/bukkit/Material;
    //   388: getstatic org/bukkit/Material.SCAFFOLDING : Lorg/bukkit/Material;
    //   391: if_acmpne -> 408
    //   394: goto -> 401
    //   397: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   400: athrow
    //   401: goto -> 296
    //   404: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   407: athrow
    //   408: aload #24
    //   410: invokeinterface getType : ()Lorg/bukkit/Material;
    //   415: getstatic org/bukkit/Material.SAND : Lorg/bukkit/Material;
    //   418: if_acmpne -> 428
    //   421: goto -> 296
    //   424: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   427: athrow
    //   428: invokestatic b : ()I
    //   431: bipush #13
    //   433: if_icmpge -> 463
    //   436: aload #24
    //   438: invokeinterface getType : ()Lorg/bukkit/Material;
    //   443: invokestatic f : (Lorg/bukkit/Material;)Z
    //   446: ifeq -> 463
    //   449: goto -> 456
    //   452: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   455: athrow
    //   456: goto -> 296
    //   459: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   462: athrow
    //   463: aload #24
    //   465: invokeinterface getType : ()Lorg/bukkit/Material;
    //   470: invokestatic r : (Lorg/bukkit/Material;)Z
    //   473: ifne -> 670
    //   476: aload #24
    //   478: invokeinterface isLiquid : ()Z
    //   483: ifne -> 670
    //   486: goto -> 493
    //   489: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   492: athrow
    //   493: aload #25
    //   495: invokestatic b : ([Lme/rerere/matrix/internal/sa;)Z
    //   498: ifeq -> 670
    //   501: goto -> 508
    //   504: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   507: athrow
    //   508: iconst_0
    //   509: istore #26
    //   511: aload #24
    //   513: invokeinterface getType : ()Lorg/bukkit/Material;
    //   518: getstatic org/bukkit/Material.COBBLESTONE : Lorg/bukkit/Material;
    //   521: if_acmpeq -> 544
    //   524: aload #24
    //   526: invokeinterface getType : ()Lorg/bukkit/Material;
    //   531: getstatic org/bukkit/Material.STONE : Lorg/bukkit/Material;
    //   534: if_acmpne -> 646
    //   537: goto -> 544
    //   540: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   543: athrow
    //   544: getstatic me/rerere/matrix/internal/na.v : [Lorg/bukkit/block/BlockFace;
    //   547: astore #27
    //   549: aload #27
    //   551: arraylength
    //   552: istore #28
    //   554: iconst_0
    //   555: istore #29
    //   557: iload #29
    //   559: iload #28
    //   561: if_icmpge -> 600
    //   564: aload #27
    //   566: iload #29
    //   568: aaload
    //   569: astore #30
    //   571: aload #24
    //   573: aload #30
    //   575: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   580: invokeinterface isLiquid : ()Z
    //   585: ifeq -> 594
    //   588: iconst_1
    //   589: istore #26
    //   591: goto -> 600
    //   594: iinc #29, 1
    //   597: goto -> 557
    //   600: aload #24
    //   602: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   605: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   610: invokeinterface isLiquid : ()Z
    //   615: ifne -> 643
    //   618: aload #24
    //   620: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   623: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   628: invokeinterface isLiquid : ()Z
    //   633: ifeq -> 646
    //   636: goto -> 643
    //   639: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   642: athrow
    //   643: iconst_1
    //   644: istore #26
    //   646: iload #26
    //   648: ifeq -> 658
    //   651: goto -> 296
    //   654: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   657: athrow
    //   658: iconst_1
    //   659: istore #20
    //   661: aload #24
    //   663: invokeinterface getType : ()Lorg/bukkit/Material;
    //   668: astore #22
    //   670: goto -> 296
    //   673: aload #19
    //   675: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   680: astore #23
    //   682: aload #18
    //   684: invokeinterface getType : ()Lorg/bukkit/Material;
    //   689: getstatic org/bukkit/Material.NETHERRACK : Lorg/bukkit/Material;
    //   692: if_acmpne -> 768
    //   695: aload #23
    //   697: ifnull -> 768
    //   700: goto -> 707
    //   703: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   706: athrow
    //   707: aload #23
    //   709: invokevirtual getType : ()Lorg/bukkit/Material;
    //   712: getstatic org/bukkit/Material.AIR : Lorg/bukkit/Material;
    //   715: if_acmpeq -> 768
    //   718: goto -> 725
    //   721: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   724: athrow
    //   725: aload #23
    //   727: invokevirtual getType : ()Lorg/bukkit/Material;
    //   730: invokevirtual name : ()Ljava/lang/String;
    //   733: sipush #10196
    //   736: ldc2_w 2249419870331685003
    //   739: lload #5
    //   741: lxor
    //   742: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   747: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   750: ifeq -> 768
    //   753: goto -> 760
    //   756: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   759: athrow
    //   760: iconst_1
    //   761: goto -> 769
    //   764: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   767: athrow
    //   768: iconst_0
    //   769: istore #24
    //   771: aload #23
    //   773: ifnull -> 833
    //   776: aload #23
    //   778: invokevirtual hasItemMeta : ()Z
    //   781: ifeq -> 833
    //   784: goto -> 791
    //   787: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   790: athrow
    //   791: aload #23
    //   793: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   796: getstatic org/bukkit/enchantments/Enchantment.DIG_SPEED : Lorg/bukkit/enchantments/Enchantment;
    //   799: invokeinterface hasEnchant : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   804: ifeq -> 833
    //   807: goto -> 814
    //   810: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   813: athrow
    //   814: aload #23
    //   816: getstatic org/bukkit/enchantments/Enchantment.DIG_SPEED : Lorg/bukkit/enchantments/Enchantment;
    //   819: invokevirtual getEnchantmentLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   822: istore #25
    //   824: iload #25
    //   826: iconst_3
    //   827: if_icmple -> 833
    //   830: iconst_1
    //   831: istore #24
    //   833: aload #22
    //   835: getstatic org/bukkit/Material.HOPPER : Lorg/bukkit/Material;
    //   838: if_acmpne -> 844
    //   841: iconst_1
    //   842: istore #24
    //   844: invokestatic currentTimeMillis : ()J
    //   847: aload_0
    //   848: getfield k : J
    //   851: lsub
    //   852: ldc2_w 500
    //   855: lcmp
    //   856: ifle -> 862
    //   859: iconst_1
    //   860: istore #24
    //   862: aload #19
    //   864: invokeinterface isInsideVehicle : ()Z
    //   869: ifeq -> 875
    //   872: iconst_1
    //   873: istore #24
    //   875: iload #21
    //   877: ifne -> 991
    //   880: iload #24
    //   882: ifne -> 991
    //   885: goto -> 892
    //   888: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   891: athrow
    //   892: lload #13
    //   894: invokestatic b : (J)Z
    //   897: ifne -> 991
    //   900: goto -> 907
    //   903: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   906: athrow
    //   907: aload_0
    //   908: sipush #7023
    //   911: ldc2_w 8320866378209260602
    //   914: lload #5
    //   916: lxor
    //   917: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   922: new java/lang/StringBuilder
    //   925: dup
    //   926: invokespecial <init> : ()V
    //   929: sipush #17701
    //   932: ldc2_w 226861353455430264
    //   935: lload #5
    //   937: lxor
    //   938: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   943: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   946: aload #18
    //   948: invokeinterface getType : ()Lorg/bukkit/Material;
    //   953: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   956: ldc_w ')'
    //   959: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   962: invokevirtual toString : ()Ljava/lang/String;
    //   965: lload #9
    //   967: iconst_0
    //   968: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;JI)Z
    //   971: istore #25
    //   973: iload #25
    //   975: ifeq -> 991
    //   978: aload #4
    //   980: iconst_1
    //   981: invokevirtual setCancelled : (Z)V
    //   984: goto -> 991
    //   987: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   990: athrow
    //   991: iload #20
    //   993: ifeq -> 1195
    //   996: iload #24
    //   998: ifne -> 1195
    //   1001: goto -> 1008
    //   1004: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1007: athrow
    //   1008: lload #13
    //   1010: invokestatic b : (J)Z
    //   1013: ifne -> 1195
    //   1016: goto -> 1023
    //   1019: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1022: athrow
    //   1023: aload #22
    //   1025: aload #18
    //   1027: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1032: if_acmpne -> 1077
    //   1035: goto -> 1042
    //   1038: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1041: athrow
    //   1042: aload #22
    //   1044: getstatic org/bukkit/Material.STONE : Lorg/bukkit/Material;
    //   1047: if_acmpeq -> 1072
    //   1050: goto -> 1057
    //   1053: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1056: athrow
    //   1057: aload #22
    //   1059: getstatic org/bukkit/Material.COBBLESTONE : Lorg/bukkit/Material;
    //   1062: if_acmpne -> 1077
    //   1065: goto -> 1072
    //   1068: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1071: athrow
    //   1072: return
    //   1073: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1076: athrow
    //   1077: aload_0
    //   1078: sipush #3124
    //   1081: ldc2_w 6341880164085556074
    //   1084: lload #5
    //   1086: lxor
    //   1087: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1092: new java/lang/StringBuilder
    //   1095: dup
    //   1096: invokespecial <init> : ()V
    //   1099: sipush #22566
    //   1102: ldc2_w 8045814232951043952
    //   1105: lload #5
    //   1107: lxor
    //   1108: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1116: aload #22
    //   1118: invokevirtual name : ()Ljava/lang/String;
    //   1121: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1127: sipush #15786
    //   1130: ldc2_w 7808183590875157246
    //   1133: lload #5
    //   1135: lxor
    //   1136: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   1141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1144: aload #18
    //   1146: invokeinterface getType : ()Lorg/bukkit/Material;
    //   1151: invokevirtual name : ()Ljava/lang/String;
    //   1154: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   1157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1160: ldc_w ')'
    //   1163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1166: invokevirtual toString : ()Ljava/lang/String;
    //   1169: lload #9
    //   1171: iconst_0
    //   1172: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;JI)Z
    //   1175: istore #25
    //   1177: iload #25
    //   1179: ifeq -> 1195
    //   1182: aload #4
    //   1184: iconst_1
    //   1185: invokevirtual setCancelled : (Z)V
    //   1188: goto -> 1195
    //   1191: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1194: athrow
    //   1195: return
    // Exception table:
    //   from	to	target	type
    //   89	101	101	java/lang/RuntimeException
    //   105	112	112	java/lang/RuntimeException
    //   116	140	140	java/lang/RuntimeException
    //   151	165	165	java/lang/RuntimeException
    //   176	190	190	java/lang/RuntimeException
    //   194	208	208	java/lang/RuntimeException
    //   212	237	237	java/lang/RuntimeException
    //   346	355	355	java/lang/RuntimeException
    //   359	369	369	java/lang/RuntimeException
    //   373	394	397	java/lang/RuntimeException
    //   381	404	404	java/lang/RuntimeException
    //   408	424	424	java/lang/RuntimeException
    //   428	449	452	java/lang/RuntimeException
    //   436	459	459	java/lang/RuntimeException
    //   463	486	489	java/lang/RuntimeException
    //   476	501	504	java/lang/RuntimeException
    //   511	537	540	java/lang/RuntimeException
    //   600	636	639	java/lang/RuntimeException
    //   646	654	654	java/lang/RuntimeException
    //   682	700	703	java/lang/RuntimeException
    //   695	718	721	java/lang/RuntimeException
    //   707	753	756	java/lang/RuntimeException
    //   725	764	764	java/lang/RuntimeException
    //   771	784	787	java/lang/RuntimeException
    //   776	807	810	java/lang/RuntimeException
    //   875	885	888	java/lang/RuntimeException
    //   880	900	903	java/lang/RuntimeException
    //   973	984	987	java/lang/RuntimeException
    //   991	1001	1004	java/lang/RuntimeException
    //   996	1016	1019	java/lang/RuntimeException
    //   1008	1035	1038	java/lang/RuntimeException
    //   1023	1050	1053	java/lang/RuntimeException
    //   1042	1065	1068	java/lang/RuntimeException
    //   1057	1073	1073	java/lang/RuntimeException
    //   1177	1188	1191	java/lang/RuntimeException
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7E9D;
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
        throw new RuntimeException("me/rerere/matrix/internal/xj", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/xj'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
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
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffectType;

public class cl extends zk {
  private static int f;
  
  private static boolean l;
  
  private boolean r = false;
  
  private static final Set x;
  
  private long z;
  
  private static int k;
  
  private boolean v;
  
  private int b = 0;
  
  private boolean i = false;
  
  private static final long a = o3.a(-231533558484434009L, -1610682720313703311L, MethodHandles.lookup().lookupClass()).a(6641589936634L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    if (paramPacketType == PacketType.Play.Client.BLOCK_DIG) {
      EnumWrappers.PlayerDigType playerDigType = (EnumWrappers.PlayerDigType)paramPacketContainer.getPlayerDigTypes().read(0);
      try {
        if (playerDigType == EnumWrappers.PlayerDigType.START_DESTROY_BLOCK)
          this.r = true; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (playerDigType == EnumWrappers.PlayerDigType.ABORT_DESTROY_BLOCK)
          this.r = false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (playerDigType == EnumWrappers.PlayerDigType.STOP_DESTROY_BLOCK) {
          this.v = true;
          this.r = false;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return false;
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
    //   28: ldc2_w 116304695450592
    //   31: lxor
    //   32: dup2
    //   33: bipush #48
    //   35: lushr
    //   36: l2i
    //   37: istore #7
    //   39: dup2
    //   40: bipush #16
    //   42: lshl
    //   43: bipush #16
    //   45: lushr
    //   46: lstore #8
    //   48: pop2
    //   49: dup2
    //   50: ldc2_w 8862140038023
    //   53: lxor
    //   54: lstore #10
    //   56: dup2
    //   57: ldc2_w 74633120587191
    //   60: lxor
    //   61: lstore #12
    //   63: dup2
    //   64: ldc2_w 2893308757749
    //   67: lxor
    //   68: lstore #14
    //   70: dup2
    //   71: ldc2_w 80440252907746
    //   74: lxor
    //   75: lstore #16
    //   77: dup2
    //   78: ldc2_w 47250088142809
    //   81: lxor
    //   82: dup2
    //   83: bipush #32
    //   85: lushr
    //   86: l2i
    //   87: istore #18
    //   89: dup2
    //   90: bipush #32
    //   92: lshl
    //   93: bipush #48
    //   95: lushr
    //   96: l2i
    //   97: istore #19
    //   99: dup2
    //   100: bipush #48
    //   102: lshl
    //   103: bipush #48
    //   105: lushr
    //   106: l2i
    //   107: istore #20
    //   109: pop2
    //   110: pop2
    //   111: aload #4
    //   113: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   116: astore #21
    //   118: aload #4
    //   120: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   123: astore #22
    //   125: aload_0
    //   126: getfield v : Z
    //   129: ifne -> 137
    //   132: return
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: aload_0
    //   138: iconst_0
    //   139: putfield v : Z
    //   142: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   145: invokevirtual b : ()Lme/rerere/matrix/internal/yj;
    //   148: iload #18
    //   150: iload #19
    //   152: iload #20
    //   154: invokevirtual b : (III)Lme/rerere/matrix/internal/k;
    //   157: aload #21
    //   159: lload #14
    //   161: aload #22
    //   163: invokeinterface b : (Lorg/bukkit/entity/Player;JLorg/bukkit/block/Block;)F
    //   168: fstore #23
    //   170: fconst_1
    //   171: fload #23
    //   173: fdiv
    //   174: f2i
    //   175: istore #24
    //   177: aload_0
    //   178: getfield b : I
    //   181: iload #24
    //   183: if_icmpge -> 224
    //   186: aload_0
    //   187: getfield b : I
    //   190: iload #24
    //   192: isub
    //   193: invokestatic abs : (I)I
    //   196: iconst_1
    //   197: if_icmpgt -> 224
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   206: athrow
    //   207: aload_0
    //   208: dup
    //   209: getfield b : I
    //   212: iconst_1
    //   213: iadd
    //   214: putfield b : I
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   223: athrow
    //   224: aload_0
    //   225: getfield i : Z
    //   228: ifeq -> 283
    //   231: aload_0
    //   232: getfield b : I
    //   235: iload #24
    //   237: if_icmpge -> 283
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   246: athrow
    //   247: aload_0
    //   248: getfield b : I
    //   251: i2d
    //   252: iload #24
    //   254: i2d
    //   255: ldc2_w 0.75
    //   258: dmul
    //   259: dcmpl
    //   260: ifle -> 283
    //   263: goto -> 270
    //   266: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   269: athrow
    //   270: aload_0
    //   271: iload #24
    //   273: putfield b : I
    //   276: goto -> 283
    //   279: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   282: athrow
    //   283: iload #7
    //   285: i2c
    //   286: lload #8
    //   288: aload #21
    //   290: invokestatic b : (CJLorg/bukkit/entity/Player;)Ljava/util/Optional;
    //   293: astore #25
    //   295: aload #25
    //   297: invokevirtual isPresent : ()Z
    //   300: ifeq -> 393
    //   303: aload #25
    //   305: invokevirtual get : ()Ljava/lang/Object;
    //   308: checkcast org/bukkit/inventory/ItemStack
    //   311: astore #26
    //   313: aload #26
    //   315: invokevirtual hasItemMeta : ()Z
    //   318: ifeq -> 393
    //   321: aload #26
    //   323: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   326: sipush #8833
    //   329: ldc2_w 6177786772960137853
    //   332: lload #5
    //   334: lxor
    //   335: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   340: invokestatic requireNonNull : (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   343: checkcast org/bukkit/inventory/meta/ItemMeta
    //   346: getstatic org/bukkit/enchantments/Enchantment.DIG_SPEED : Lorg/bukkit/enchantments/Enchantment;
    //   349: invokeinterface hasEnchant : (Lorg/bukkit/enchantments/Enchantment;)Z
    //   354: ifeq -> 393
    //   357: goto -> 364
    //   360: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   363: athrow
    //   364: aload #26
    //   366: invokevirtual getItemMeta : ()Lorg/bukkit/inventory/meta/ItemMeta;
    //   369: getstatic org/bukkit/enchantments/Enchantment.DIG_SPEED : Lorg/bukkit/enchantments/Enchantment;
    //   372: invokeinterface getEnchantLevel : (Lorg/bukkit/enchantments/Enchantment;)I
    //   377: iconst_5
    //   378: if_icmple -> 393
    //   381: goto -> 388
    //   384: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   387: athrow
    //   388: return
    //   389: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   392: athrow
    //   393: aload #22
    //   395: invokeinterface getType : ()Lorg/bukkit/Material;
    //   400: getstatic org/bukkit/Material.COBBLESTONE : Lorg/bukkit/Material;
    //   403: if_acmpeq -> 426
    //   406: aload #22
    //   408: invokeinterface getType : ()Lorg/bukkit/Material;
    //   413: getstatic org/bukkit/Material.STONE : Lorg/bukkit/Material;
    //   416: if_acmpne -> 542
    //   419: goto -> 426
    //   422: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   425: athrow
    //   426: iconst_0
    //   427: istore #26
    //   429: getstatic me/rerere/matrix/internal/na.v : [Lorg/bukkit/block/BlockFace;
    //   432: astore #27
    //   434: aload #27
    //   436: arraylength
    //   437: istore #28
    //   439: iconst_0
    //   440: istore #29
    //   442: iload #29
    //   444: iload #28
    //   446: if_icmpge -> 485
    //   449: aload #27
    //   451: iload #29
    //   453: aaload
    //   454: astore #30
    //   456: aload #22
    //   458: aload #30
    //   460: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   465: invokeinterface isLiquid : ()Z
    //   470: ifeq -> 479
    //   473: iconst_1
    //   474: istore #26
    //   476: goto -> 485
    //   479: iinc #29, 1
    //   482: goto -> 442
    //   485: aload #22
    //   487: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
    //   490: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   495: invokeinterface isLiquid : ()Z
    //   500: ifne -> 528
    //   503: aload #22
    //   505: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
    //   508: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
    //   513: invokeinterface isLiquid : ()Z
    //   518: ifeq -> 531
    //   521: goto -> 528
    //   524: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   527: athrow
    //   528: iconst_1
    //   529: istore #26
    //   531: iload #26
    //   533: ifeq -> 542
    //   536: iload #24
    //   538: iconst_4
    //   539: idiv
    //   540: istore #24
    //   542: getstatic me/rerere/matrix/internal/cl.x : Ljava/util/Set;
    //   545: aload #22
    //   547: invokeinterface getType : ()Lorg/bukkit/Material;
    //   552: invokeinterface contains : (Ljava/lang/Object;)Z
    //   557: ifeq -> 565
    //   560: return
    //   561: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   564: athrow
    //   565: invokestatic b : ()I
    //   568: bipush #16
    //   570: if_icmpge -> 704
    //   573: aload_0
    //   574: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   577: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   580: invokevirtual ordinal : ()I
    //   583: getstatic me/rerere/matrix/internal/q.o : Lme/rerere/matrix/internal/q;
    //   586: invokevirtual ordinal : ()I
    //   589: if_icmplt -> 704
    //   592: goto -> 599
    //   595: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   598: athrow
    //   599: aload #21
    //   601: invokeinterface getItemInHand : ()Lorg/bukkit/inventory/ItemStack;
    //   606: invokevirtual getType : ()Lorg/bukkit/Material;
    //   609: invokevirtual name : ()Ljava/lang/String;
    //   612: sipush #1759
    //   615: ldc2_w 4075058962195281448
    //   618: lload #5
    //   620: lxor
    //   621: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   626: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   629: ifeq -> 704
    //   632: goto -> 639
    //   635: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   638: athrow
    //   639: aload #22
    //   641: invokeinterface getType : ()Lorg/bukkit/Material;
    //   646: astore #26
    //   648: aload #26
    //   650: getstatic org/bukkit/Material.HAY_BLOCK : Lorg/bukkit/Material;
    //   653: if_acmpeq -> 671
    //   656: aload #26
    //   658: getstatic org/bukkit/Material.SPONGE : Lorg/bukkit/Material;
    //   661: if_acmpne -> 676
    //   664: goto -> 671
    //   667: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   670: athrow
    //   671: return
    //   672: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   675: athrow
    //   676: invokestatic b : ()I
    //   679: bipush #10
    //   681: if_icmplt -> 704
    //   684: aload #26
    //   686: getstatic org/bukkit/Material.NETHER_WART_BLOCK : Lorg/bukkit/Material;
    //   689: if_acmpne -> 704
    //   692: goto -> 699
    //   695: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   698: athrow
    //   699: return
    //   700: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   703: athrow
    //   704: aload_0
    //   705: invokevirtual b : ()Lme/rerere/matrix/internal/yl;
    //   708: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   711: invokevirtual ordinal : ()I
    //   714: getstatic me/rerere/matrix/internal/q.f : Lme/rerere/matrix/internal/q;
    //   717: invokevirtual ordinal : ()I
    //   720: if_icmpge -> 780
    //   723: invokestatic b : ()I
    //   726: bipush #17
    //   728: if_icmplt -> 780
    //   731: goto -> 738
    //   734: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   737: athrow
    //   738: aload #22
    //   740: invokeinterface getType : ()Lorg/bukkit/Material;
    //   745: invokevirtual name : ()Ljava/lang/String;
    //   748: sipush #21879
    //   751: ldc2_w 5866948581349762441
    //   754: lload #5
    //   756: lxor
    //   757: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   762: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   765: ifeq -> 780
    //   768: goto -> 775
    //   771: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   774: athrow
    //   775: return
    //   776: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   779: athrow
    //   780: invokestatic j : ()J
    //   783: aload_0
    //   784: getfield z : J
    //   787: lsub
    //   788: ldc2_w 1000
    //   791: iload #24
    //   793: i2l
    //   794: ldc2_w 50
    //   797: lmul
    //   798: ladd
    //   799: lcmp
    //   800: ifgt -> 821
    //   803: aload_0
    //   804: getfield b : I
    //   807: iconst_2
    //   808: if_icmplt -> 821
    //   811: goto -> 818
    //   814: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   817: athrow
    //   818: iconst_2
    //   819: istore #24
    //   821: getstatic me/rerere/matrix/internal/cl.l : Z
    //   824: ifeq -> 1028
    //   827: aload_0
    //   828: getfield b : I
    //   831: iload #24
    //   833: if_icmpge -> 1028
    //   836: goto -> 843
    //   839: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   842: athrow
    //   843: lload #16
    //   845: invokestatic b : (J)Z
    //   848: ifne -> 1028
    //   851: goto -> 858
    //   854: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   857: athrow
    //   858: aload_0
    //   859: sipush #18915
    //   862: ldc2_w 4571123788456016149
    //   865: lload #5
    //   867: lxor
    //   868: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   873: new java/lang/StringBuilder
    //   876: dup
    //   877: invokespecial <init> : ()V
    //   880: sipush #23168
    //   883: ldc2_w 5317670984503503487
    //   886: lload #5
    //   888: lxor
    //   889: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   894: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   897: aload_0
    //   898: getfield b : I
    //   901: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   904: ldc_w '/'
    //   907: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   910: iload #24
    //   912: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   915: sipush #18626
    //   918: ldc2_w 7553593193899669567
    //   921: lload #5
    //   923: lxor
    //   924: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   929: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   932: aload #22
    //   934: invokeinterface getType : ()Lorg/bukkit/Material;
    //   939: invokevirtual name : ()Ljava/lang/String;
    //   942: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   945: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   948: sipush #9865
    //   951: ldc2_w 7764889973511509627
    //   954: lload #5
    //   956: lxor
    //   957: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   962: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   965: aload_0
    //   966: getfield i : Z
    //   969: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   972: ldc_w ')'
    //   975: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   978: invokevirtual toString : ()Ljava/lang/String;
    //   981: lload #12
    //   983: getstatic me/rerere/matrix/internal/cl.f : I
    //   986: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;JI)Z
    //   989: istore #26
    //   991: iload #26
    //   993: ifeq -> 1028
    //   996: aload_0
    //   997: lload #10
    //   999: invokevirtual j : (J)I
    //   1002: getstatic me/rerere/matrix/internal/cl.k : I
    //   1005: if_icmplt -> 1028
    //   1008: goto -> 1015
    //   1011: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1014: athrow
    //   1015: aload #4
    //   1017: iconst_1
    //   1018: invokevirtual setCancelled : (Z)V
    //   1021: goto -> 1028
    //   1024: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1027: athrow
    //   1028: aload_0
    //   1029: iconst_0
    //   1030: putfield b : I
    //   1033: aload_0
    //   1034: iconst_0
    //   1035: putfield i : Z
    //   1038: return
    // Exception table:
    //   from	to	target	type
    //   125	133	133	java/lang/RuntimeException
    //   177	200	203	java/lang/RuntimeException
    //   186	217	220	java/lang/RuntimeException
    //   224	240	243	java/lang/RuntimeException
    //   231	263	266	java/lang/RuntimeException
    //   247	276	279	java/lang/RuntimeException
    //   313	357	360	java/lang/RuntimeException
    //   321	381	384	java/lang/RuntimeException
    //   364	389	389	java/lang/RuntimeException
    //   393	419	422	java/lang/RuntimeException
    //   485	521	524	java/lang/RuntimeException
    //   542	561	561	java/lang/RuntimeException
    //   565	592	595	java/lang/RuntimeException
    //   573	632	635	java/lang/RuntimeException
    //   648	664	667	java/lang/RuntimeException
    //   656	672	672	java/lang/RuntimeException
    //   676	692	695	java/lang/RuntimeException
    //   684	700	700	java/lang/RuntimeException
    //   704	731	734	java/lang/RuntimeException
    //   723	768	771	java/lang/RuntimeException
    //   738	776	776	java/lang/RuntimeException
    //   780	811	814	java/lang/RuntimeException
    //   821	836	839	java/lang/RuntimeException
    //   827	851	854	java/lang/RuntimeException
    //   991	1008	1011	java/lang/RuntimeException
    //   996	1021	1024	java/lang/RuntimeException
  }
  
  public void b(char paramChar, int paramInt, @NotNull PlayerInteractEvent paramPlayerInteractEvent, short paramShort) {
    try {
      if (paramPlayerInteractEvent.getAction() == Action.LEFT_CLICK_BLOCK) {
        this.b = 0;
        this.i = false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l = a ^ 0x7B57FBDA91E3L;
    int i = (int)((l ^ 0x222DB79A085EL) >>> 32L);
    int j = (int)((l ^ 0x222DB79A085EL) << 32L >>> 48L);
    int k = (int)((l ^ 0x222DB79A085EL) << 48L >>> 48L);
    l ^ 0x222DB79A085EL;
    try {
      if (ta.t(i, (short)j, paramPlayerMoveEvent.getPlayer(), k))
        try {
          if (paramLocation2.getY() - paramLocation1.getY() > 0.0D)
            this.i = true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public cl(yl paramyl) {
    super(paramyl);
    b(yk.r);
  }
  
  public void b(@NotNull PlayerAnimationEvent paramPlayerAnimationEvent) {
    try {
      this.b++;
      if (this.r)
        try {
          if (paramPlayerAnimationEvent.getPlayer().hasPotionEffect(PotionEffectType.FAST_DIGGING))
            this.z = pc.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/cl.a : J
    //   3: ldc2_w 3106039838141
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   12: invokevirtual b : ()Lme/rerere/matrix/internal/ci;
    //   15: invokevirtual j : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   18: sipush #15908
    //   21: ldc2_w 810272534346916058
    //   24: lload_1
    //   25: lxor
    //   26: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   31: bipush #10
    //   33: invokeinterface getInt : (Ljava/lang/String;I)I
    //   38: putstatic me/rerere/matrix/internal/cl.k : I
    //   41: aload_0
    //   42: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   45: sipush #27621
    //   48: ldc2_w 1566903811141154068
    //   51: lload_1
    //   52: lxor
    //   53: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   58: iconst_1
    //   59: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   64: putstatic me/rerere/matrix/internal/cl.l : Z
    //   67: aload_0
    //   68: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   71: sipush #25215
    //   74: ldc2_w 6683597107956530319
    //   77: lload_1
    //   78: lxor
    //   79: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   84: invokeinterface getInt : (Ljava/lang/String;)I
    //   89: putstatic me/rerere/matrix/internal/cl.f : I
    //   92: return
  }
  
  static {
    long l = a ^ 0xED90BC4F16L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[13];
    boolean bool = false;
    String str;
    int i = (str = "ÔU`Ùph¥wãWýùLs\021|\020­;G\të\032ÄÎ¾î0½7ukùÓÃ²\021¡;PO\fB§\022r:ÏzV5ôx!E\002³+ÇÖvXí¼d°Ý8³Ð0\031·\b¶U¥ôûbE\\Z!»báåÞccoï\0161Û'ü£±$oz5ß(JByÎºñ;+\000\030Ç\034\bÚ@©©!\024ð¯_dD£ùæ-\"8õM\036z²Ð²\023¯\rô<á®EH\006ò\006¯e½¡6\r­Ê û0X\035\023\000¾\002á#°T0ÑG8\006|\013}oK\0011í;3Kôg5ÅZÂèÚñÑÁ.Êåø\004ÃÞ::ýÒ\013C^)wçæBºêÂÝá\0016Æ\020º-\007\016öüo°)àï´s¯\020\032\f7ÃU}\"Õï¿éw±\017¡ Z\035Þil|\027\0213®Ø\032+)µÍ!8IÚ\004ôo\f\022ÑÃ\020PÝ\034ÄKá/ó\037\0258fM]\020p1_\035Ï«\025æ1û×'½½AÂ").length();
    byte b2 = 32;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6134;
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
        throw new RuntimeException("me/rerere/matrix/internal/cl", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/cl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\cl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
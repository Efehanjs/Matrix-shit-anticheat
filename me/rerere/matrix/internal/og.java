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
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import net.minecraft.world.item.EnumAnimation;
import net.minecraft.world.item.ItemStack;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_18_R1.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;

public final class og implements k {
  private static final String[] a;
  
  private static final String[] b;
  
  private static final Map c = new HashMap<>(13);
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 130153169974451
    //   5: lxor
    //   6: lstore #4
    //   8: pop2
    //   9: aload_0
    //   10: aload_3
    //   11: lload #4
    //   13: invokevirtual b : (Lorg/bukkit/block/Block;J)Ljava/lang/Object;
    //   16: dup
    //   17: sipush #21187
    //   20: ldc2_w 4692169358703502989
    //   23: lload_1
    //   24: lxor
    //   25: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   30: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   33: checkcast net/minecraft/world/level/block/Block
    //   36: invokevirtual i : ()F
    //   39: freturn
  }
  
  @NotNull
  public sa b(long paramLong, @NotNull Entity paramEntity) {
    // Byte code:
    //   0: aload_3
    //   1: sipush #25522
    //   4: ldc2_w 2594578949430006255
    //   7: lload_1
    //   8: lxor
    //   9: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_3
    //   18: checkcast org/bukkit/craftbukkit/v1_18_R1/entity/CraftEntity
    //   21: astore #4
    //   23: aload #4
    //   25: invokevirtual getHandle : ()Lnet/minecraft/world/entity/Entity;
    //   28: astore #5
    //   30: aload #5
    //   32: invokevirtual cw : ()Lnet/minecraft/world/phys/AxisAlignedBB;
    //   35: dup
    //   36: ifnonnull -> 54
    //   39: pop
    //   40: aload_3
    //   41: invokeinterface getLocation : ()Lorg/bukkit/Location;
    //   46: invokestatic b : (Lorg/bukkit/Location;)Lme/rerere/matrix/internal/sa;
    //   49: areturn
    //   50: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   53: athrow
    //   54: astore #6
    //   56: new me/rerere/matrix/internal/sa
    //   59: dup
    //   60: aload #6
    //   62: getfield a : D
    //   65: aload #6
    //   67: getfield b : D
    //   70: aload #6
    //   72: getfield c : D
    //   75: aload #6
    //   77: getfield d : D
    //   80: aload #6
    //   82: getfield e : D
    //   85: aload #6
    //   87: getfield f : D
    //   90: invokespecial <init> : (DDDDDD)V
    //   93: areturn
    // Exception table:
    //   from	to	target	type
    //   30	50	50	java/lang/RuntimeException
  }
  
  @NotNull
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   6: dup
    //   7: sipush #26375
    //   10: ldc2_w 3521993154556006320
    //   13: lload_2
    //   14: lxor
    //   15: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   20: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   23: checkcast org/bukkit/craftbukkit/v1_18_R1/CraftWorld
    //   26: invokevirtual getHandle : ()Lnet/minecraft/server/level/WorldServer;
    //   29: checkcast net/minecraft/world/level/World
    //   32: astore #5
    //   34: new net/minecraft/core/BlockPosition
    //   37: dup
    //   38: aload_1
    //   39: invokeinterface getX : ()I
    //   44: aload_1
    //   45: invokeinterface getY : ()I
    //   50: aload_1
    //   51: invokeinterface getZ : ()I
    //   56: invokespecial <init> : (III)V
    //   59: astore #6
    //   61: aload #5
    //   63: aload #6
    //   65: invokevirtual a_ : (Lnet/minecraft/core/BlockPosition;)Lnet/minecraft/world/level/block/state/IBlockData;
    //   68: astore #7
    //   70: aload #4
    //   72: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   75: if_acmpne -> 97
    //   78: aload #7
    //   80: aload #5
    //   82: checkcast net/minecraft/world/level/IBlockAccess
    //   85: aload #6
    //   87: invokevirtual j : (Lnet/minecraft/world/level/IBlockAccess;Lnet/minecraft/core/BlockPosition;)Lnet/minecraft/world/phys/shapes/VoxelShape;
    //   90: goto -> 109
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload #7
    //   99: aload #5
    //   101: checkcast net/minecraft/world/level/IBlockAccess
    //   104: aload #6
    //   106: invokevirtual k : (Lnet/minecraft/world/level/IBlockAccess;Lnet/minecraft/core/BlockPosition;)Lnet/minecraft/world/phys/shapes/VoxelShape;
    //   109: astore #8
    //   111: aload #8
    //   113: invokevirtual d : ()Ljava/util/List;
    //   116: astore #9
    //   118: aload #9
    //   120: invokeinterface size : ()I
    //   125: anewarray me/rerere/matrix/internal/sa
    //   128: astore #10
    //   130: iconst_0
    //   131: istore #11
    //   133: aload #9
    //   135: invokeinterface iterator : ()Ljava/util/Iterator;
    //   140: astore #12
    //   142: aload #12
    //   144: invokeinterface hasNext : ()Z
    //   149: ifeq -> 260
    //   152: aload #12
    //   154: invokeinterface next : ()Ljava/lang/Object;
    //   159: checkcast net/minecraft/world/phys/AxisAlignedBB
    //   162: astore #13
    //   164: aload #10
    //   166: iload #11
    //   168: iinc #11, 1
    //   171: new me/rerere/matrix/internal/sa
    //   174: dup
    //   175: aload_1
    //   176: invokeinterface getX : ()I
    //   181: i2d
    //   182: aload #13
    //   184: getfield a : D
    //   187: dadd
    //   188: aload_1
    //   189: invokeinterface getY : ()I
    //   194: i2d
    //   195: aload #13
    //   197: getfield b : D
    //   200: dadd
    //   201: aload_1
    //   202: invokeinterface getZ : ()I
    //   207: i2d
    //   208: aload #13
    //   210: getfield c : D
    //   213: dadd
    //   214: aload_1
    //   215: invokeinterface getX : ()I
    //   220: i2d
    //   221: aload #13
    //   223: getfield d : D
    //   226: dadd
    //   227: aload_1
    //   228: invokeinterface getY : ()I
    //   233: i2d
    //   234: aload #13
    //   236: getfield e : D
    //   239: dadd
    //   240: aload_1
    //   241: invokeinterface getZ : ()I
    //   246: i2d
    //   247: aload #13
    //   249: getfield f : D
    //   252: dadd
    //   253: invokespecial <init> : (DDDDDD)V
    //   256: aastore
    //   257: goto -> 142
    //   260: aload #10
    //   262: areturn
    // Exception table:
    //   from	to	target	type
    //   70	93	93	java/lang/RuntimeException
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #20229
    //   4: ldc2_w 2371231514245496093
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_18_R1/entity/CraftPlayer
    //   21: invokevirtual getHandle : ()Lnet/minecraft/server/level/EntityPlayer;
    //   24: invokevirtual eR : ()V
    //   27: return
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  public boolean b(@NotNull World paramWorld, int paramInt1, int paramInt2) {
    return paramWorld.isChunkLoaded(paramInt1, paramInt2);
  }
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #22560
    //   4: ldc2_w 7591975325330979223
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_18_R1/entity/CraftLivingEntity
    //   21: invokevirtual getHandle : ()Lnet/minecraft/world/entity/EntityLiving;
    //   24: dup
    //   25: sipush #32104
    //   28: ldc2_w 3247053530659495131
    //   31: lload_2
    //   32: lxor
    //   33: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   38: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   41: checkcast net/minecraft/world/entity/player/EntityHuman
    //   44: astore #4
    //   46: aload #4
    //   48: invokevirtual eC : ()F
    //   51: freturn
  }
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    return itemStack.c().b(itemStack);
  }
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #27624
    //   4: ldc2_w 149011515904518936
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_18_R1/block/CraftBlock
    //   21: astore #4
    //   23: aload #4
    //   25: invokevirtual getNMS : ()Lnet/minecraft/world/level/block/state/IBlockData;
    //   28: invokevirtual b : ()Lnet/minecraft/world/level/block/Block;
    //   31: areturn
  }
  
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    BoundingBox boundingBox = paramBlock.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    // Byte code:
    //   0: aload #4
    //   2: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   7: dup
    //   8: sipush #25035
    //   11: ldc2_w 7792482533976797916
    //   14: lload_2
    //   15: lxor
    //   16: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   21: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   24: checkcast org/bukkit/craftbukkit/v1_18_R1/CraftWorld
    //   27: invokevirtual getHandle : ()Lnet/minecraft/server/level/WorldServer;
    //   30: checkcast net/minecraft/world/level/World
    //   33: astore #5
    //   35: new net/minecraft/core/BlockPosition
    //   38: dup
    //   39: aload #4
    //   41: invokeinterface getX : ()I
    //   46: aload #4
    //   48: invokeinterface getY : ()I
    //   53: aload #4
    //   55: invokeinterface getZ : ()I
    //   60: invokespecial <init> : (III)V
    //   63: astore #6
    //   65: aload #5
    //   67: aload #6
    //   69: invokevirtual a_ : (Lnet/minecraft/core/BlockPosition;)Lnet/minecraft/world/level/block/state/IBlockData;
    //   72: astore #7
    //   74: aload #7
    //   76: aload_1
    //   77: sipush #29429
    //   80: ldc2_w 833162827220804070
    //   83: lload_2
    //   84: lxor
    //   85: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   90: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   93: aload_1
    //   94: checkcast org/bukkit/craftbukkit/v1_18_R1/entity/CraftPlayer
    //   97: invokevirtual getHandle : ()Lnet/minecraft/server/level/EntityPlayer;
    //   100: checkcast net/minecraft/world/entity/player/EntityHuman
    //   103: aload #5
    //   105: checkcast net/minecraft/world/level/IBlockAccess
    //   108: aload #6
    //   110: invokevirtual a : (Lnet/minecraft/world/entity/player/EntityHuman;Lnet/minecraft/world/level/IBlockAccess;Lnet/minecraft/core/BlockPosition;)F
    //   113: freturn
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return paramEntity.isOnGround();
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #2240
    //   4: ldc2_w 517695034091516116
    //   7: lload_3
    //   8: lxor
    //   9: <illegal opcode> n : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_18_R1/entity/CraftEntity
    //   21: invokevirtual getHandle : ()Lnet/minecraft/world/entity/Entity;
    //   24: iload_2
    //   25: invokevirtual c : (Z)V
    //   28: return
  }
  
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (itemStack.c().c(itemStack) != EnumAnimation.a);
  }
  
  static {
    long l = o3.a(6285116447848293960L, 6163290992778482111L, MethodHandles.lookup().lookupClass()).a(144414120254388L) ^ 0x60C589936D42L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[10];
    boolean bool = false;
    String str;
    int i = (str = "OÇFðY½²}Z\"1}¶ò\005¸­\001«Qs¡Á£,Ò÷y*\024r¨Éç¯ó¥ID?$¢dQ\021Ãø\036<íúôN\023SÃN±gYhtö\021^'tÝuÝ\026×jYsë7rTåðd9\0239-ñC;ÐÔQá§*7\016åÍÒ}g\025Á\022\000<\023o8ßÎñiXcq,¬Ú}\003ö\034@Y^-«-dä\016\006[\032mÐº([[\031«+åFûPk}BS74+>\037\0073ßT}@`ä\027YÙçkòÛ)¥é\032³rÎ;`á\\O®X¶³¦¿xCoV\tí-Y\002Z\003o\nC\001\003&s& 0ø°×Ò=Q:*IDÈÍÁ\027§ï¾ÒM9\020i\032É\001x\036d¬rD+kXgþ{íÜ\037øëÖ88+ü_d{\022*K,¡>\f\\ú\026Lli©©1¡k|\001\005Dõì^¬åäRË'\036ÉUUq3ÐÎ ±Wý\b°õËãá¼\037©üø\027ßÈêÉÐ2uv&\0223\000\030¤=¦¾DùX{Ö\001zZ]{\027Ê¹\024÷SMÙ\001Ñëà¦X·,éå?Ào'B¯ý{¶<FP\nSJ»3M}ÚZn+\033ÈÜ=Ê\031þ\024Rìw»\007tzh!\\³¼\\ò»¦>*¼ÅÞC¹\022f*â¥Qp­\022OGd´¬acü\023ýèC°ô°RuïUâ;â1\021Á9ý\030ê;S+_ó±îö\026_ÉvË\\d¢ù<\nb\024×ÒêK3A5àé­;ÿ\b÷¾EÍ¬-ª´È©3Å¶\002y)\003G\"°Äkº¾þ'å0k\bþodä4EDò_HÁ¦V\034Ôb\0240rÐ<¤\020Nl¿vðkÍëh8±OÚá\003(Õó-ÑDÝ\013$JêÍÒ\t\030æ\027:$»lÅÀ-\025f\013ßE¤ÝÖ\000\023-Ëdí¸\"9\030Ów¦ãËÙáxÅ®ÅØ¦N_¦­]]\"ÀOÊ»É0« kí\tNaÇd°¸U¢8*¿mgNÙãíýx©]£\035¼ïÌÀÌ\007r\030RÐúï§'Z&Ê\005S.\023eH\f¥q\f0Oªó´MîSTýÚS\006²@\033\021¸]³8â=3\021/p\000AÓæµ¯-²<ô5¼_ÿºÅ\006´\013Ûz/\005Ñ<\035Øoè\006oÑ2R\002+Ûå S&.D¤\013iÓ3(|À¾\021á«!¸Yãº\022l5{yò\006Þ\002Ì!Ü­?<«\004Û\007ëM¨\037Ë¦~O³\033âÐ(À\tB\r}H#\000×V¬À¾\\îÂ\002èþKæ\003O¾7\034É´ù\002¨\\ôÀ½ã»Í°lA\b¢\006\026\033úÜ¤ÞÒÃo¼lCw>Qcõû\035¢äÅõ*I:8ìG\017#B±YÔ}YûwY\037ÙÅ4¯g`ÿ äßË/¢Ò\f±Í÷£\017þÐcð°;qc#äj\0005áü¦¿nºÇãe@ýr").length();
    char c = '';
    byte b1 = -1;
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
  
  private static String b(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x42A;
    if (b[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])c.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          c.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/og", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = a[i].getBytes("ISO-8859-1");
      b[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return b[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = b(i, l);
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
    //   66: ldc_w 'me/rerere/matrix/internal/og'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\og.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
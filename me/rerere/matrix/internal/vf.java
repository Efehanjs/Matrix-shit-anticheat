package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import net.minecraft.world.item.EnumAnimation;
import net.minecraft.world.item.ItemStack;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_19_R1.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public final class vf implements k {
  @NotNull
  private final MethodHandle l;
  
  @NotNull
  private final MethodHandle r;
  
  @NotNull
  private final MethodHandle x;
  
  @NotNull
  private final MethodHandle z;
  
  @NotNull
  private final MethodHandle k;
  
  @NotNull
  private final MethodHandle v;
  
  @NotNull
  private final MethodHandle b;
  
  @NotNull
  private final MethodHandle i;
  
  private static final long a = o3.a(-2841228511315026373L, 4543594795465589553L, MethodHandles.lookup().lookupClass()).a(216536609196140L);
  
  private static final String[] c;
  
  private static final String[] f;
  
  private static final Map g = new HashMap<>(13);
  
  @NotNull
  public sa b(long paramLong, @NotNull Entity paramEntity) {
    BoundingBox boundingBox = paramEntity.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #29788
    //   4: ldc2_w 7670501746966867903
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_19_R1/entity/CraftPlayer
    //   21: invokevirtual getHandle : ()Lnet/minecraft/server/level/EntityPlayer;
    //   24: astore #4
    //   26: aload_0
    //   27: getfield z : Ljava/lang/invoke/MethodHandle;
    //   30: aload #4
    //   32: invokevirtual invoke : (Lnet/minecraft/server/level/EntityPlayer;)V
    //   35: return
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    return paramBlock.getBreakSpeed(paramPlayer);
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/lang/invoke/MethodHandle;
    //   4: aload_1
    //   5: sipush #21501
    //   8: ldc2_w 2220375049828925977
    //   11: lload_3
    //   12: lxor
    //   13: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   18: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_1
    //   22: checkcast org/bukkit/craftbukkit/v1_19_R1/entity/CraftEntity
    //   25: invokevirtual getHandle : ()Lnet/minecraft/world/entity/Entity;
    //   28: iload_2
    //   29: invokevirtual invoke : (Lnet/minecraft/world/entity/Entity;Z)V
    //   32: return
  }
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    Intrinsics.checkNotNull(paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED));
    return (float)paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
  }
  
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    BoundingBox boundingBox = paramBlock.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  @Nullable
  public on b(@NotNull World paramWorld, @NotNull Vector paramVector1, @NotNull Vector paramVector2, double paramDouble) {
    RayTraceResult rayTraceResult;
    try {
      if (paramWorld.rayTraceBlocks(paramVector1.toLocation(paramWorld), paramVector2, paramDouble) == null) {
        paramWorld.rayTraceBlocks(paramVector1.toLocation(paramWorld), paramVector2, paramDouble);
        return null;
      } 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return new on(rayTraceResult.getHitPosition(), rayTraceResult.getHitBlock(), rayTraceResult.getHitEntity(), rayTraceResult.getHitBlockFace());
  }
  
  @NotNull
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   6: dup
    //   7: sipush #3994
    //   10: ldc2_w 7189680440885219027
    //   13: lload_2
    //   14: lxor
    //   15: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   20: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   23: checkcast org/bukkit/craftbukkit/v1_19_R1/CraftWorld
    //   26: invokevirtual getHandle : ()Lnet/minecraft/server/level/WorldServer;
    //   29: astore #5
    //   31: aload_0
    //   32: getfield i : Ljava/lang/invoke/MethodHandle;
    //   35: aload_1
    //   36: invokeinterface getX : ()I
    //   41: aload_1
    //   42: invokeinterface getY : ()I
    //   47: aload_1
    //   48: invokeinterface getZ : ()I
    //   53: invokevirtual invoke : (III)Ljava/lang/Object;
    //   56: astore #6
    //   58: aload_0
    //   59: getfield v : Ljava/lang/invoke/MethodHandle;
    //   62: aload #5
    //   64: aload #6
    //   66: invokevirtual invoke : (Lnet/minecraft/server/level/WorldServer;Ljava/lang/Object;)Ljava/lang/Object;
    //   69: astore #7
    //   71: aload #4
    //   73: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   76: if_acmpne -> 99
    //   79: aload_0
    //   80: getfield l : Ljava/lang/invoke/MethodHandle;
    //   83: aload #7
    //   85: aload #5
    //   87: aload #6
    //   89: invokevirtual invoke : (Ljava/lang/Object;Lnet/minecraft/server/level/WorldServer;Ljava/lang/Object;)Lnet/minecraft/world/phys/shapes/VoxelShape;
    //   92: goto -> 112
    //   95: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   98: athrow
    //   99: aload_0
    //   100: getfield x : Ljava/lang/invoke/MethodHandle;
    //   103: aload #7
    //   105: aload #5
    //   107: aload #6
    //   109: invokevirtual invoke : (Ljava/lang/Object;Lnet/minecraft/server/level/WorldServer;Ljava/lang/Object;)Lnet/minecraft/world/phys/shapes/VoxelShape;
    //   112: astore #8
    //   114: aload #8
    //   116: invokevirtual d : ()Ljava/util/List;
    //   119: astore #9
    //   121: aload #9
    //   123: invokeinterface size : ()I
    //   128: anewarray me/rerere/matrix/internal/sa
    //   131: astore #10
    //   133: iconst_0
    //   134: istore #11
    //   136: aload #9
    //   138: invokeinterface iterator : ()Ljava/util/Iterator;
    //   143: astore #12
    //   145: aload #12
    //   147: invokeinterface hasNext : ()Z
    //   152: ifeq -> 263
    //   155: aload #12
    //   157: invokeinterface next : ()Ljava/lang/Object;
    //   162: checkcast net/minecraft/world/phys/AxisAlignedBB
    //   165: astore #13
    //   167: aload #10
    //   169: iload #11
    //   171: iinc #11, 1
    //   174: new me/rerere/matrix/internal/sa
    //   177: dup
    //   178: aload_1
    //   179: invokeinterface getX : ()I
    //   184: i2d
    //   185: aload #13
    //   187: getfield a : D
    //   190: dadd
    //   191: aload_1
    //   192: invokeinterface getY : ()I
    //   197: i2d
    //   198: aload #13
    //   200: getfield b : D
    //   203: dadd
    //   204: aload_1
    //   205: invokeinterface getZ : ()I
    //   210: i2d
    //   211: aload #13
    //   213: getfield c : D
    //   216: dadd
    //   217: aload_1
    //   218: invokeinterface getX : ()I
    //   223: i2d
    //   224: aload #13
    //   226: getfield d : D
    //   229: dadd
    //   230: aload_1
    //   231: invokeinterface getY : ()I
    //   236: i2d
    //   237: aload #13
    //   239: getfield e : D
    //   242: dadd
    //   243: aload_1
    //   244: invokeinterface getZ : ()I
    //   249: i2d
    //   250: aload #13
    //   252: getfield f : D
    //   255: dadd
    //   256: invokespecial <init> : (DDDDDD)V
    //   259: aastore
    //   260: goto -> 145
    //   263: aload #10
    //   265: areturn
    // Exception table:
    //   from	to	target	type
    //   71	95	95	java/util/NoSuchElementException
  }
  
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (itemStack.c().c(itemStack) != EnumAnimation.a);
  }
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    return itemStack.c().b(itemStack);
  }
  
  public vf(char paramChar, int paramInt1, int paramInt2) {
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
    //   23: getstatic me/rerere/matrix/internal/vf.a : J
    //   26: lxor
    //   27: lstore #4
    //   29: lload #4
    //   31: dup2
    //   32: ldc2_w 76035555123938
    //   35: lxor
    //   36: lstore #6
    //   38: dup2
    //   39: ldc2_w 55341521364210
    //   42: lxor
    //   43: lstore #8
    //   45: pop2
    //   46: aload_0
    //   47: invokespecial <init> : ()V
    //   50: aload_0
    //   51: sipush #4021
    //   54: ldc2_w 3106762352209649778
    //   57: lload #4
    //   59: lxor
    //   60: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   65: lload #8
    //   67: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   70: ldc_w 'A'
    //   73: iconst_0
    //   74: anewarray java/lang/Class
    //   77: swap
    //   78: dup_x2
    //   79: pop
    //   80: dup2_x1
    //   81: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   84: swap
    //   85: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   88: lload #6
    //   90: dup2_x1
    //   91: pop2
    //   92: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   95: putfield z : Ljava/lang/invoke/MethodHandle;
    //   98: aload_0
    //   99: sipush #21035
    //   102: ldc2_w 6922710450007358959
    //   105: lload #4
    //   107: lxor
    //   108: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   113: lload #8
    //   115: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   118: iconst_3
    //   119: anewarray java/lang/Class
    //   122: astore #10
    //   124: aload #10
    //   126: iconst_0
    //   127: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   130: aastore
    //   131: aload #10
    //   133: iconst_1
    //   134: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   137: aastore
    //   138: aload #10
    //   140: iconst_2
    //   141: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   144: aastore
    //   145: aload #10
    //   147: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   150: invokestatic b : (Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;
    //   153: putfield i : Ljava/lang/invoke/MethodHandle;
    //   156: aload_0
    //   157: sipush #27308
    //   160: ldc2_w 8404387786566894944
    //   163: lload #4
    //   165: lxor
    //   166: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   171: lload #8
    //   173: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   176: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   179: astore #10
    //   181: astore #17
    //   183: iconst_0
    //   184: istore #11
    //   186: iconst_0
    //   187: istore #12
    //   189: aload #10
    //   191: arraylength
    //   192: istore #13
    //   194: iload #12
    //   196: iload #13
    //   198: if_icmpge -> 255
    //   201: aload #10
    //   203: iload #12
    //   205: aaload
    //   206: astore #14
    //   208: aload #14
    //   210: astore #15
    //   212: iconst_0
    //   213: istore #16
    //   215: aload #15
    //   217: invokevirtual getName : ()Ljava/lang/String;
    //   220: sipush #5086
    //   223: ldc2_w 8077248114482543643
    //   226: lload #4
    //   228: lxor
    //   229: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   234: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   237: ifeq -> 249
    //   240: aload #14
    //   242: goto -> 277
    //   245: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   248: athrow
    //   249: iinc #12, 1
    //   252: goto -> 194
    //   255: new java/util/NoSuchElementException
    //   258: dup
    //   259: sipush #16675
    //   262: ldc2_w 8063066579664482030
    //   265: lload #4
    //   267: lxor
    //   268: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   273: invokespecial <init> : (Ljava/lang/String;)V
    //   276: athrow
    //   277: aload #17
    //   279: swap
    //   280: lload #6
    //   282: dup2_x1
    //   283: pop2
    //   284: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   287: putfield v : Ljava/lang/invoke/MethodHandle;
    //   290: aload_0
    //   291: sipush #7450
    //   294: ldc2_w 6712024692657550033
    //   297: lload #4
    //   299: lxor
    //   300: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   305: lload #8
    //   307: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   310: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   313: astore #10
    //   315: astore #17
    //   317: iconst_0
    //   318: istore #11
    //   320: iconst_0
    //   321: istore #12
    //   323: aload #10
    //   325: arraylength
    //   326: istore #13
    //   328: iload #12
    //   330: iload #13
    //   332: if_icmpge -> 406
    //   335: aload #10
    //   337: iload #12
    //   339: aaload
    //   340: astore #14
    //   342: aload #14
    //   344: astore #15
    //   346: iconst_0
    //   347: istore #16
    //   349: aload #15
    //   351: invokevirtual getName : ()Ljava/lang/String;
    //   354: ldc_w 'j'
    //   357: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   360: ifeq -> 387
    //   363: aload #15
    //   365: invokevirtual getParameterCount : ()I
    //   368: iconst_2
    //   369: if_icmpne -> 387
    //   372: goto -> 379
    //   375: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   378: athrow
    //   379: iconst_1
    //   380: goto -> 388
    //   383: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   386: athrow
    //   387: iconst_0
    //   388: ifeq -> 400
    //   391: aload #14
    //   393: goto -> 428
    //   396: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   399: athrow
    //   400: iinc #12, 1
    //   403: goto -> 328
    //   406: new java/util/NoSuchElementException
    //   409: dup
    //   410: sipush #30752
    //   413: ldc2_w 255275019936012270
    //   416: lload #4
    //   418: lxor
    //   419: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   424: invokespecial <init> : (Ljava/lang/String;)V
    //   427: athrow
    //   428: aload #17
    //   430: swap
    //   431: lload #6
    //   433: dup2_x1
    //   434: pop2
    //   435: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   438: putfield l : Ljava/lang/invoke/MethodHandle;
    //   441: aload_0
    //   442: sipush #10037
    //   445: ldc2_w 903760360201177334
    //   448: lload #4
    //   450: lxor
    //   451: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   456: lload #8
    //   458: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   461: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   464: astore #10
    //   466: astore #17
    //   468: iconst_0
    //   469: istore #11
    //   471: iconst_0
    //   472: istore #12
    //   474: aload #10
    //   476: arraylength
    //   477: istore #13
    //   479: iload #12
    //   481: iload #13
    //   483: if_icmpge -> 557
    //   486: aload #10
    //   488: iload #12
    //   490: aaload
    //   491: astore #14
    //   493: aload #14
    //   495: astore #15
    //   497: iconst_0
    //   498: istore #16
    //   500: aload #15
    //   502: invokevirtual getName : ()Ljava/lang/String;
    //   505: ldc_w 'k'
    //   508: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   511: ifeq -> 538
    //   514: aload #15
    //   516: invokevirtual getParameterCount : ()I
    //   519: iconst_2
    //   520: if_icmpne -> 538
    //   523: goto -> 530
    //   526: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   529: athrow
    //   530: iconst_1
    //   531: goto -> 539
    //   534: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   537: athrow
    //   538: iconst_0
    //   539: ifeq -> 551
    //   542: aload #14
    //   544: goto -> 579
    //   547: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   550: athrow
    //   551: iinc #12, 1
    //   554: goto -> 479
    //   557: new java/util/NoSuchElementException
    //   560: dup
    //   561: sipush #30752
    //   564: ldc2_w 255275019936012270
    //   567: lload #4
    //   569: lxor
    //   570: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   575: invokespecial <init> : (Ljava/lang/String;)V
    //   578: athrow
    //   579: aload #17
    //   581: swap
    //   582: lload #6
    //   584: dup2_x1
    //   585: pop2
    //   586: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   589: putfield x : Ljava/lang/invoke/MethodHandle;
    //   592: aload_0
    //   593: sipush #10037
    //   596: ldc2_w 903760360201177334
    //   599: lload #4
    //   601: lxor
    //   602: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   607: lload #8
    //   609: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   612: ldc_w 'b'
    //   615: iconst_0
    //   616: anewarray java/lang/Class
    //   619: swap
    //   620: dup_x2
    //   621: pop
    //   622: dup2_x1
    //   623: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   626: swap
    //   627: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   630: lload #6
    //   632: dup2_x1
    //   633: pop2
    //   634: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   637: putfield b : Ljava/lang/invoke/MethodHandle;
    //   640: aload_0
    //   641: sipush #15207
    //   644: ldc2_w 4703821011138958504
    //   647: lload #4
    //   649: lxor
    //   650: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   655: lload #8
    //   657: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   660: ldc_w 'c'
    //   663: iconst_1
    //   664: anewarray java/lang/Class
    //   667: astore #10
    //   669: aload #10
    //   671: iconst_0
    //   672: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   675: aastore
    //   676: aload #10
    //   678: swap
    //   679: dup_x2
    //   680: pop
    //   681: dup2_x1
    //   682: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   685: swap
    //   686: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   689: lload #6
    //   691: dup2_x1
    //   692: pop2
    //   693: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   696: putfield k : Ljava/lang/invoke/MethodHandle;
    //   699: aload_0
    //   700: sipush #22037
    //   703: ldc2_w 8887617880669829587
    //   706: lload #4
    //   708: lxor
    //   709: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   714: lload #8
    //   716: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   719: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   722: astore #10
    //   724: astore #17
    //   726: iconst_0
    //   727: istore #11
    //   729: iconst_0
    //   730: istore #12
    //   732: aload #10
    //   734: arraylength
    //   735: istore #13
    //   737: iload #12
    //   739: iload #13
    //   741: if_icmpge -> 820
    //   744: aload #10
    //   746: iload #12
    //   748: aaload
    //   749: astore #14
    //   751: aload #14
    //   753: astore #15
    //   755: iconst_0
    //   756: istore #16
    //   758: aload #15
    //   760: invokevirtual getName : ()Ljava/lang/String;
    //   763: ldc_w 'h'
    //   766: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   769: ifeq -> 801
    //   772: aload #15
    //   774: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   777: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   780: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   783: ifeq -> 801
    //   786: goto -> 793
    //   789: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   792: athrow
    //   793: iconst_1
    //   794: goto -> 802
    //   797: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   800: athrow
    //   801: iconst_0
    //   802: ifeq -> 814
    //   805: aload #14
    //   807: goto -> 842
    //   810: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   813: athrow
    //   814: iinc #12, 1
    //   817: goto -> 737
    //   820: new java/util/NoSuchElementException
    //   823: dup
    //   824: sipush #30752
    //   827: ldc2_w 255275019936012270
    //   830: lload #4
    //   832: lxor
    //   833: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   838: invokespecial <init> : (Ljava/lang/String;)V
    //   841: athrow
    //   842: aload #17
    //   844: swap
    //   845: lload #6
    //   847: dup2_x1
    //   848: pop2
    //   849: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   852: putfield r : Ljava/lang/invoke/MethodHandle;
    //   855: return
    // Exception table:
    //   from	to	target	type
    //   215	245	245	java/util/NoSuchElementException
    //   349	372	375	java/util/NoSuchElementException
    //   363	383	383	java/util/NoSuchElementException
    //   388	396	396	java/util/NoSuchElementException
    //   500	523	526	java/util/NoSuchElementException
    //   514	534	534	java/util/NoSuchElementException
    //   539	547	547	java/util/NoSuchElementException
    //   758	786	789	java/util/NoSuchElementException
    //   772	797	797	java/util/NoSuchElementException
    //   802	810	810	java/util/NoSuchElementException
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    Object object = b(paramBlock, l);
    return this.r.invoke(object);
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return paramEntity.isOnGround();
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  public boolean b(@NotNull World paramWorld, int paramInt1, int paramInt2) {
    return paramWorld.isChunkLoaded(paramInt1, paramInt2);
  }
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #5882
    //   4: ldc2_w 7099269903156019197
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> c : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_19_R1/block/CraftBlock
    //   21: astore #4
    //   23: aload_0
    //   24: getfield b : Ljava/lang/invoke/MethodHandle;
    //   27: aload #4
    //   29: invokevirtual getNMS : ()Lnet/minecraft/world/level/block/state/IBlockData;
    //   32: invokevirtual invoke : (Lnet/minecraft/world/level/block/state/IBlockData;)Ljava/lang/Object;
    //   35: areturn
  }
  
  static {
    long l = a ^ 0x7615B42597D1L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "²Ó~ï4sh·`¤Öixa½ó\tÖ,(ú\"¹\021|»g¡#¬¡\017âv8¥ã7Z+Ø(òY³Bsk¹\022¤°¡kGÏíÝ\"JNÀ\035¤ýæÍ\033.À\027%Ü\021Y=9\031\036bÅkõ(\026¢\022ÆÒÎ\002Sø´Dºmoé±¦\021,ºÁø `Ê|VÜøuÃ(¨[Å\020æ0£?)xÙ´oKwY¥ø\025\bÅ!!PÔÌFR\007céÏÔßoºÑc\027aå°¬\rKÿùW©/Ú\006Áq\035{<¸ô] ú45­Ñ< Ó«£kÞ\t|XÖBau\027ýÓã\031¢Ø¦\\¬¯xÞ¡È`©¦R\t³´ËÉóB÷Ëþ\031\007Fk\013|\022R/IuµÉ7\035ã@°µjHG°Ei\025¢øLQ*ptèY¡\037ª%àý\016¨´oG1\032ðÕFÿ\\%©ffû\020¶ôRØ|ñ°øký6Ñ¤¿wÝÏNzaùC%nô Qè7=)úÁ\021ÐêyT\017Zó\032é'¦\013DLh\006\rûÛ{ÿf^s}O»fB_\025U\034¢Jid§)\024¨ÎºÈcý\026ÞÍdk©\036<Î­¤Ä3(&Wr\007ô3\017ßs(ÝåÅ}Lès!-\b£\fþ\021\024å×ço?yz\007&Ô¾·À\000æÐkÈï\017×bM\032|k®_]¼ÏzõÒì:\037\nå¿44Ü»Dý{%÷P¬ëål¬^Î¢5ÔÃ³§/V\026[ÚX´EÓH$«òÁ¡w¿_NÀæ!ÔäÂvÈÈÓüñ2?äZºK\027õW\013ÈnUvfí8îÚÊ\0074·õ©$]cm .\005ÖK\003i\022tÃ¦uöÎ{©yÅ``J¼\004Ù\037N4\026 /ëÃ\032E´\033È+eÈ¯Ý\004Ú9D\004?n¢(¬&Ä^G÷F{8·Þ»5\ng¡F\027ý¦N\026ÑüxhÐËÕÕãÐ×Ìòèû.ûª3 ¾¤\n\034¤Ä(íE«L\017Tüj\006\034Dúàó÷ua­¡;Ó)<2¥Ý§\031Ê8§j0¢ÀZi(Õs¦ýWâ¤DrFþDyÃáuÍþLpçâEéAßÀà÷üQXé£L°\bb\033£\033qZØzHsG«\027P\fP\000Ï\\\0163¼M=PJ\0074k¤Ðî:d÷\fºrÞó/ØÛTªø\0066\\çj\004S\021\027n\nÿJO_W\003Æ\023-w]÷Î³*WA").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x6DD5;
    if (f[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])g.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          g.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/vf", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      f[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return f[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/vf'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\vf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
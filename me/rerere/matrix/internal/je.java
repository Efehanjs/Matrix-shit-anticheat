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
import net.minecraft.world.item.EnumAnimation;
import net.minecraft.world.item.ItemStack;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_18_R2.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;

public final class je implements k {
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
  
  private static final long a = o3.a(1278502764764734346L, -8786560362126293476L, MethodHandles.lookup().lookupClass()).a(81901252368713L);
  
  private static final String[] c;
  
  private static final String[] f;
  
  private static final Map g = new HashMap<>(13);
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #29697
    //   4: ldc2_w 4777797296550896440
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_18_R2/block/CraftBlock
    //   21: astore #4
    //   23: aload_0
    //   24: getfield z : Ljava/lang/invoke/MethodHandle;
    //   27: aload #4
    //   29: invokevirtual getNMS : ()Lnet/minecraft/world/level/block/state/IBlockData;
    //   32: invokevirtual invoke : (Lnet/minecraft/world/level/block/state/IBlockData;)Ljava/lang/Object;
    //   35: areturn
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    return paramBlock.getBreakSpeed(paramPlayer);
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #24806
    //   4: ldc2_w 7911472810484090164
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_18_R2/entity/CraftPlayer
    //   21: invokevirtual getHandle : ()Lnet/minecraft/server/level/EntityPlayer;
    //   24: astore #4
    //   26: aload_0
    //   27: getfield r : Ljava/lang/invoke/MethodHandle;
    //   30: aload #4
    //   32: invokevirtual invoke : (Lnet/minecraft/server/level/EntityPlayer;)V
    //   35: return
  }
  
  @NotNull
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   6: dup
    //   7: sipush #15374
    //   10: ldc2_w 2149295997291709296
    //   13: lload_2
    //   14: lxor
    //   15: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   20: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   23: checkcast org/bukkit/craftbukkit/v1_18_R2/CraftWorld
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
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    Intrinsics.checkNotNull(paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED));
    return (float)paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return paramEntity.isOnGround();
  }
  
  public boolean b(@NotNull World paramWorld, int paramInt1, int paramInt2) {
    return paramWorld.isChunkLoaded(paramInt1, paramInt2);
  }
  
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    try {
    
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return (itemStack.c().c(itemStack) != EnumAnimation.a);
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : Ljava/lang/invoke/MethodHandle;
    //   4: aload_1
    //   5: sipush #3041
    //   8: ldc2_w 7058528219765777465
    //   11: lload_3
    //   12: lxor
    //   13: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   18: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_1
    //   22: checkcast org/bukkit/craftbukkit/v1_18_R2/entity/CraftEntity
    //   25: invokevirtual getHandle : ()Lnet/minecraft/world/entity/Entity;
    //   28: iload_2
    //   29: invokevirtual invoke : (Lnet/minecraft/world/entity/Entity;Z)V
    //   32: return
  }
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    return itemStack.c().b(itemStack);
  }
  
  public je(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/je.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 71089612848010
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 61390331510170
    //   17: lxor
    //   18: lstore #5
    //   20: pop2
    //   21: aload_0
    //   22: invokespecial <init> : ()V
    //   25: aload_0
    //   26: sipush #13674
    //   29: ldc2_w 3570380882784337396
    //   32: lload_1
    //   33: lxor
    //   34: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   39: lload #5
    //   41: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   44: sipush #31368
    //   47: ldc2_w 3987550166589207068
    //   50: lload_1
    //   51: lxor
    //   52: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   57: iconst_0
    //   58: anewarray java/lang/Class
    //   61: swap
    //   62: dup_x2
    //   63: pop
    //   64: dup2_x1
    //   65: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   68: swap
    //   69: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   72: lload_3
    //   73: dup2_x1
    //   74: pop2
    //   75: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   78: putfield r : Ljava/lang/invoke/MethodHandle;
    //   81: aload_0
    //   82: sipush #20041
    //   85: ldc2_w 1570006936014735057
    //   88: lload_1
    //   89: lxor
    //   90: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   95: lload #5
    //   97: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   100: iconst_3
    //   101: anewarray java/lang/Class
    //   104: astore #7
    //   106: aload #7
    //   108: iconst_0
    //   109: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   112: aastore
    //   113: aload #7
    //   115: iconst_1
    //   116: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   119: aastore
    //   120: aload #7
    //   122: iconst_2
    //   123: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   126: aastore
    //   127: aload #7
    //   129: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   132: invokestatic b : (Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;
    //   135: putfield i : Ljava/lang/invoke/MethodHandle;
    //   138: aload_0
    //   139: sipush #28868
    //   142: ldc2_w 1950201576975366233
    //   145: lload_1
    //   146: lxor
    //   147: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   152: lload #5
    //   154: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   157: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   160: astore #7
    //   162: astore #14
    //   164: iconst_0
    //   165: istore #8
    //   167: iconst_0
    //   168: istore #9
    //   170: aload #7
    //   172: arraylength
    //   173: istore #10
    //   175: iload #9
    //   177: iload #10
    //   179: if_icmpge -> 235
    //   182: aload #7
    //   184: iload #9
    //   186: aaload
    //   187: astore #11
    //   189: aload #11
    //   191: astore #12
    //   193: iconst_0
    //   194: istore #13
    //   196: aload #12
    //   198: invokevirtual getName : ()Ljava/lang/String;
    //   201: sipush #1019
    //   204: ldc2_w 4007279300768303976
    //   207: lload_1
    //   208: lxor
    //   209: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   214: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   217: ifeq -> 229
    //   220: aload #11
    //   222: goto -> 256
    //   225: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   228: athrow
    //   229: iinc #9, 1
    //   232: goto -> 175
    //   235: new java/util/NoSuchElementException
    //   238: dup
    //   239: sipush #28252
    //   242: ldc2_w 7948420965480064716
    //   245: lload_1
    //   246: lxor
    //   247: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   252: invokespecial <init> : (Ljava/lang/String;)V
    //   255: athrow
    //   256: aload #14
    //   258: swap
    //   259: lload_3
    //   260: dup2_x1
    //   261: pop2
    //   262: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   265: putfield v : Ljava/lang/invoke/MethodHandle;
    //   268: aload_0
    //   269: sipush #17812
    //   272: ldc2_w 738962285753191686
    //   275: lload_1
    //   276: lxor
    //   277: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   282: lload #5
    //   284: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   287: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   290: astore #7
    //   292: astore #14
    //   294: iconst_0
    //   295: istore #8
    //   297: iconst_0
    //   298: istore #9
    //   300: aload #7
    //   302: arraylength
    //   303: istore #10
    //   305: iload #9
    //   307: iload #10
    //   309: if_icmpge -> 383
    //   312: aload #7
    //   314: iload #9
    //   316: aaload
    //   317: astore #11
    //   319: aload #11
    //   321: astore #12
    //   323: iconst_0
    //   324: istore #13
    //   326: aload #12
    //   328: invokevirtual getName : ()Ljava/lang/String;
    //   331: ldc_w 'j'
    //   334: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   337: ifeq -> 364
    //   340: aload #12
    //   342: invokevirtual getParameterCount : ()I
    //   345: iconst_2
    //   346: if_icmpne -> 364
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   355: athrow
    //   356: iconst_1
    //   357: goto -> 365
    //   360: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   363: athrow
    //   364: iconst_0
    //   365: ifeq -> 377
    //   368: aload #11
    //   370: goto -> 404
    //   373: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   376: athrow
    //   377: iinc #9, 1
    //   380: goto -> 305
    //   383: new java/util/NoSuchElementException
    //   386: dup
    //   387: sipush #18066
    //   390: ldc2_w 5276905784456891907
    //   393: lload_1
    //   394: lxor
    //   395: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   400: invokespecial <init> : (Ljava/lang/String;)V
    //   403: athrow
    //   404: aload #14
    //   406: swap
    //   407: lload_3
    //   408: dup2_x1
    //   409: pop2
    //   410: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   413: putfield l : Ljava/lang/invoke/MethodHandle;
    //   416: aload_0
    //   417: sipush #13848
    //   420: ldc2_w 1745728228521852545
    //   423: lload_1
    //   424: lxor
    //   425: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   430: lload #5
    //   432: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   435: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   438: astore #7
    //   440: astore #14
    //   442: iconst_0
    //   443: istore #8
    //   445: iconst_0
    //   446: istore #9
    //   448: aload #7
    //   450: arraylength
    //   451: istore #10
    //   453: iload #9
    //   455: iload #10
    //   457: if_icmpge -> 531
    //   460: aload #7
    //   462: iload #9
    //   464: aaload
    //   465: astore #11
    //   467: aload #11
    //   469: astore #12
    //   471: iconst_0
    //   472: istore #13
    //   474: aload #12
    //   476: invokevirtual getName : ()Ljava/lang/String;
    //   479: ldc_w 'k'
    //   482: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   485: ifeq -> 512
    //   488: aload #12
    //   490: invokevirtual getParameterCount : ()I
    //   493: iconst_2
    //   494: if_icmpne -> 512
    //   497: goto -> 504
    //   500: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   503: athrow
    //   504: iconst_1
    //   505: goto -> 513
    //   508: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   511: athrow
    //   512: iconst_0
    //   513: ifeq -> 525
    //   516: aload #11
    //   518: goto -> 552
    //   521: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   524: athrow
    //   525: iinc #9, 1
    //   528: goto -> 453
    //   531: new java/util/NoSuchElementException
    //   534: dup
    //   535: sipush #18066
    //   538: ldc2_w 5276905784456891907
    //   541: lload_1
    //   542: lxor
    //   543: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   548: invokespecial <init> : (Ljava/lang/String;)V
    //   551: athrow
    //   552: aload #14
    //   554: swap
    //   555: lload_3
    //   556: dup2_x1
    //   557: pop2
    //   558: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   561: putfield x : Ljava/lang/invoke/MethodHandle;
    //   564: aload_0
    //   565: sipush #13848
    //   568: ldc2_w 1745728228521852545
    //   571: lload_1
    //   572: lxor
    //   573: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   578: lload #5
    //   580: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   583: ldc_w 'b'
    //   586: iconst_0
    //   587: anewarray java/lang/Class
    //   590: swap
    //   591: dup_x2
    //   592: pop
    //   593: dup2_x1
    //   594: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   597: swap
    //   598: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   601: lload_3
    //   602: dup2_x1
    //   603: pop2
    //   604: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   607: putfield z : Ljava/lang/invoke/MethodHandle;
    //   610: aload_0
    //   611: sipush #31375
    //   614: ldc2_w 9046247288049005077
    //   617: lload_1
    //   618: lxor
    //   619: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   624: lload #5
    //   626: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   629: ldc_w 'c'
    //   632: iconst_1
    //   633: anewarray java/lang/Class
    //   636: astore #7
    //   638: aload #7
    //   640: iconst_0
    //   641: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   644: aastore
    //   645: aload #7
    //   647: swap
    //   648: dup_x2
    //   649: pop
    //   650: dup2_x1
    //   651: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   654: swap
    //   655: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   658: lload_3
    //   659: dup2_x1
    //   660: pop2
    //   661: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   664: putfield k : Ljava/lang/invoke/MethodHandle;
    //   667: aload_0
    //   668: sipush #8384
    //   671: ldc2_w 2406637466954639447
    //   674: lload_1
    //   675: lxor
    //   676: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   681: lload #5
    //   683: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   686: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   689: astore #7
    //   691: astore #14
    //   693: iconst_0
    //   694: istore #8
    //   696: iconst_0
    //   697: istore #9
    //   699: aload #7
    //   701: arraylength
    //   702: istore #10
    //   704: iload #9
    //   706: iload #10
    //   708: if_icmpge -> 787
    //   711: aload #7
    //   713: iload #9
    //   715: aaload
    //   716: astore #11
    //   718: aload #11
    //   720: astore #12
    //   722: iconst_0
    //   723: istore #13
    //   725: aload #12
    //   727: invokevirtual getName : ()Ljava/lang/String;
    //   730: ldc_w 'i'
    //   733: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   736: ifeq -> 768
    //   739: aload #12
    //   741: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   744: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   747: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   750: ifeq -> 768
    //   753: goto -> 760
    //   756: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   759: athrow
    //   760: iconst_1
    //   761: goto -> 769
    //   764: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   767: athrow
    //   768: iconst_0
    //   769: ifeq -> 781
    //   772: aload #11
    //   774: goto -> 808
    //   777: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   780: athrow
    //   781: iinc #9, 1
    //   784: goto -> 704
    //   787: new java/util/NoSuchElementException
    //   790: dup
    //   791: sipush #18066
    //   794: ldc2_w 5276905784456891907
    //   797: lload_1
    //   798: lxor
    //   799: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   804: invokespecial <init> : (Ljava/lang/String;)V
    //   807: athrow
    //   808: aload #14
    //   810: swap
    //   811: lload_3
    //   812: dup2_x1
    //   813: pop2
    //   814: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   817: putfield b : Ljava/lang/invoke/MethodHandle;
    //   820: return
    // Exception table:
    //   from	to	target	type
    //   196	225	225	java/util/NoSuchElementException
    //   326	349	352	java/util/NoSuchElementException
    //   340	360	360	java/util/NoSuchElementException
    //   365	373	373	java/util/NoSuchElementException
    //   474	497	500	java/util/NoSuchElementException
    //   488	508	508	java/util/NoSuchElementException
    //   513	521	521	java/util/NoSuchElementException
    //   725	753	756	java/util/NoSuchElementException
    //   739	764	764	java/util/NoSuchElementException
    //   769	777	777	java/util/NoSuchElementException
  }
  
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    BoundingBox boundingBox = paramBlock.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  @NotNull
  public sa b(long paramLong, @NotNull Entity paramEntity) {
    BoundingBox boundingBox = paramEntity.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    Object object = b(paramBlock, l);
    return this.b.invoke(object);
  }
  
  static {
    long l = a ^ 0x6F82A119A791L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[15];
    boolean bool = false;
    String str;
    int i = (str = "_E\027ÝÞ(Ô_¸fH1àUäs¹Û@O\034t¸î¶u¦\0160¥<Åçù7<¸Z$\bªÊÄ(\002è,¥ÀWºQæØyÓÉe¼5µü(|9¶w!Þ:GæE3kn\006å@ZZ¶×K±Ã8eöA\037åõ\000Î\013¥_\0041ú¼çýµ\023eCþá\007^ È>ÓÁ ÒU9\030\000äb\016¨`F~¾Ëd\032\016mÌN¿Á?)xÛ\025r@{xöñ\036\033 v»a#ð\031Ç³Ly\007MC.ÓÂÇX\023\026\013ÛÒ#ª¹%}-i²Ø\032\r4.C¤0Lá\0323ÚÎ\000üOX:#/(\b&äÖ`!\013ÔÇÕËïÀ|Â¯güÉC|\002×Ô\006\027¼öó*ðº ®(CýªÚÆßGô\033Çk\000À7ÿ¸\025×Öÿ½¹x|$\rG\007>\021&½þ\032Ã.(Á\005¨\031×ZøNè\033$Sô¬]à5\035à½¼÷W@\035Rã¦M\023\002oÞÄú5ºfÈ\034dÕ=;¿u[]FçaVî)XÞ±}åfv\022ÎY'.x²Ä©!å?á\006ªÉÄ6¯3È[ã\024wçu%@Z~\"«¼\031ÊIu\020Óû\017XÝ¬Ê»p£È\024Ý>#Æ³«U\035\0257Ô|ê\031ÀppUÂÊç@ÛÃ±á?Ûü\023\007·UC\002Rp°qÏ+{Àé\004g\007aòáó¡Á\"ªú¸Ó_}ôÉÁ×\0243«Ä4ôb Ec§÷\030kæù'åóôTMO:\032;íLhB®ã@(FÂr:¼ö ¤\006HÜWîcï!s\036\004û*C\016ý\007Kuo0¿õé\002CºÝ;¯<Ô¿ó(î:é_Õ¦(\001û%KÃ}WwèÏ\022z6AA'këÄ\016s«Dy`ðÇ\nF|s\bdýÐòíIgÀBtà1\026+ÉÃå4\037f\013ó;)'\002¼d\f×vë\025Ð°PÃ'ºD^I¯9\\\n\t6E\000Éäa¿IÇÅpWµ§\007o]Îf\007ÒOË\024LGfñ¦<$34Pz9t·Á\001~å~4:\006DÅ@®«}\036\027\006ÂÂõÜsCA¯\016\024§ðÁfc%¯;^ãtlá\020$+¦¡ëñè<L\031\tÃï\022·¼ú\002aëf°nÁ\020³÷\034À³!kÙgÀ!*P\035F±\020çÙÁ·\016­ÁÄó\bÑd\031\000à\033\022\031þùfóq(ñ¶6Y÷£\032¼\026È\bªäïõ]\017&1A\0211e«kWj\023Ü£í\036\007]T$\001=Îè\034ùPôd\\\026N\013§d =\004s\f×u¡O>A\026ËFõ0é@ \004Jÿs×\006±kpDOÁSÓGÛû^Pâî£C\021ÅÓÛÊ\030$ÐÊ\030\001ùÚXØ¼CësE3N\r^eE¯nÙæå/\006æÝx²UaS\022®®£Y\"u&FgÈ^WLGsµÛÓBûòs\017").length();
    byte b2 = 72;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x13E2;
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
        throw new RuntimeException("me/rerere/matrix/internal/je", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/je'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\je.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
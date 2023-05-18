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
import org.bukkit.craftbukkit.v1_19_R2.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

public final class td implements k {
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
  
  private static final long a = o3.a(6862001061525664263L, -7236280078539535274L, MethodHandles.lookup().lookupClass()).a(146352674731352L);
  
  private static final String[] c;
  
  private static final String[] f;
  
  private static final Map g = new HashMap<>(13);
  
  public td(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/td.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 106797602864799
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 24548335843471
    //   17: lxor
    //   18: lstore #5
    //   20: pop2
    //   21: aload_0
    //   22: invokespecial <init> : ()V
    //   25: aload_0
    //   26: sipush #3268
    //   29: ldc2_w 1999836993579336178
    //   32: lload_1
    //   33: lxor
    //   34: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   39: lload #5
    //   41: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   44: ldc 'A'
    //   46: iconst_0
    //   47: anewarray java/lang/Class
    //   50: swap
    //   51: dup_x2
    //   52: pop
    //   53: dup2_x1
    //   54: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   57: swap
    //   58: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   61: lload_3
    //   62: dup2_x1
    //   63: pop2
    //   64: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   67: putfield b : Ljava/lang/invoke/MethodHandle;
    //   70: aload_0
    //   71: sipush #14954
    //   74: ldc2_w 916784066301982548
    //   77: lload_1
    //   78: lxor
    //   79: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   84: lload #5
    //   86: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   89: iconst_3
    //   90: anewarray java/lang/Class
    //   93: astore #7
    //   95: aload #7
    //   97: iconst_0
    //   98: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   101: aastore
    //   102: aload #7
    //   104: iconst_1
    //   105: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   108: aastore
    //   109: aload #7
    //   111: iconst_2
    //   112: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   115: aastore
    //   116: aload #7
    //   118: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   121: invokestatic b : (Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;
    //   124: putfield l : Ljava/lang/invoke/MethodHandle;
    //   127: aload_0
    //   128: sipush #4194
    //   131: ldc2_w 1136962694198811995
    //   134: lload_1
    //   135: lxor
    //   136: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   141: lload #5
    //   143: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   146: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   149: astore #7
    //   151: astore #14
    //   153: iconst_0
    //   154: istore #8
    //   156: iconst_0
    //   157: istore #9
    //   159: aload #7
    //   161: arraylength
    //   162: istore #10
    //   164: iload #9
    //   166: iload #10
    //   168: if_icmpge -> 224
    //   171: aload #7
    //   173: iload #9
    //   175: aaload
    //   176: astore #11
    //   178: aload #11
    //   180: astore #12
    //   182: iconst_0
    //   183: istore #13
    //   185: aload #12
    //   187: invokevirtual getName : ()Ljava/lang/String;
    //   190: sipush #19082
    //   193: ldc2_w 398402940733163442
    //   196: lload_1
    //   197: lxor
    //   198: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   203: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   206: ifeq -> 218
    //   209: aload #11
    //   211: goto -> 245
    //   214: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   217: athrow
    //   218: iinc #9, 1
    //   221: goto -> 164
    //   224: new java/util/NoSuchElementException
    //   227: dup
    //   228: sipush #3858
    //   231: ldc2_w 6958161250267349551
    //   234: lload_1
    //   235: lxor
    //   236: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   241: invokespecial <init> : (Ljava/lang/String;)V
    //   244: athrow
    //   245: aload #14
    //   247: swap
    //   248: lload_3
    //   249: dup2_x1
    //   250: pop2
    //   251: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   254: putfield k : Ljava/lang/invoke/MethodHandle;
    //   257: aload_0
    //   258: sipush #27436
    //   261: ldc2_w 8725563666433680918
    //   264: lload_1
    //   265: lxor
    //   266: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   271: lload #5
    //   273: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   276: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   279: astore #7
    //   281: astore #14
    //   283: iconst_0
    //   284: istore #8
    //   286: iconst_0
    //   287: istore #9
    //   289: aload #7
    //   291: arraylength
    //   292: istore #10
    //   294: iload #9
    //   296: iload #10
    //   298: if_icmpge -> 371
    //   301: aload #7
    //   303: iload #9
    //   305: aaload
    //   306: astore #11
    //   308: aload #11
    //   310: astore #12
    //   312: iconst_0
    //   313: istore #13
    //   315: aload #12
    //   317: invokevirtual getName : ()Ljava/lang/String;
    //   320: ldc 'j'
    //   322: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   325: ifeq -> 352
    //   328: aload #12
    //   330: invokevirtual getParameterCount : ()I
    //   333: iconst_2
    //   334: if_icmpne -> 352
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   343: athrow
    //   344: iconst_1
    //   345: goto -> 353
    //   348: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   351: athrow
    //   352: iconst_0
    //   353: ifeq -> 365
    //   356: aload #11
    //   358: goto -> 392
    //   361: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   364: athrow
    //   365: iinc #9, 1
    //   368: goto -> 294
    //   371: new java/util/NoSuchElementException
    //   374: dup
    //   375: sipush #8346
    //   378: ldc2_w 1363412617058938277
    //   381: lload_1
    //   382: lxor
    //   383: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   388: invokespecial <init> : (Ljava/lang/String;)V
    //   391: athrow
    //   392: aload #14
    //   394: swap
    //   395: lload_3
    //   396: dup2_x1
    //   397: pop2
    //   398: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   401: putfield v : Ljava/lang/invoke/MethodHandle;
    //   404: aload_0
    //   405: sipush #12256
    //   408: ldc2_w 7461046575363678935
    //   411: lload_1
    //   412: lxor
    //   413: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   418: lload #5
    //   420: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   423: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   426: astore #7
    //   428: astore #14
    //   430: iconst_0
    //   431: istore #8
    //   433: iconst_0
    //   434: istore #9
    //   436: aload #7
    //   438: arraylength
    //   439: istore #10
    //   441: iload #9
    //   443: iload #10
    //   445: if_icmpge -> 518
    //   448: aload #7
    //   450: iload #9
    //   452: aaload
    //   453: astore #11
    //   455: aload #11
    //   457: astore #12
    //   459: iconst_0
    //   460: istore #13
    //   462: aload #12
    //   464: invokevirtual getName : ()Ljava/lang/String;
    //   467: ldc 'k'
    //   469: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   472: ifeq -> 499
    //   475: aload #12
    //   477: invokevirtual getParameterCount : ()I
    //   480: iconst_2
    //   481: if_icmpne -> 499
    //   484: goto -> 491
    //   487: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   490: athrow
    //   491: iconst_1
    //   492: goto -> 500
    //   495: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   498: athrow
    //   499: iconst_0
    //   500: ifeq -> 512
    //   503: aload #11
    //   505: goto -> 539
    //   508: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   511: athrow
    //   512: iinc #9, 1
    //   515: goto -> 441
    //   518: new java/util/NoSuchElementException
    //   521: dup
    //   522: sipush #8346
    //   525: ldc2_w 1363412617058938277
    //   528: lload_1
    //   529: lxor
    //   530: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   535: invokespecial <init> : (Ljava/lang/String;)V
    //   538: athrow
    //   539: aload #14
    //   541: swap
    //   542: lload_3
    //   543: dup2_x1
    //   544: pop2
    //   545: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   548: putfield i : Ljava/lang/invoke/MethodHandle;
    //   551: aload_0
    //   552: sipush #12256
    //   555: ldc2_w 7461046575363678935
    //   558: lload_1
    //   559: lxor
    //   560: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   565: lload #5
    //   567: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   570: ldc 'b'
    //   572: iconst_0
    //   573: anewarray java/lang/Class
    //   576: swap
    //   577: dup_x2
    //   578: pop
    //   579: dup2_x1
    //   580: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   583: swap
    //   584: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   587: lload_3
    //   588: dup2_x1
    //   589: pop2
    //   590: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   593: putfield z : Ljava/lang/invoke/MethodHandle;
    //   596: aload_0
    //   597: sipush #22489
    //   600: ldc2_w 4546473254356163298
    //   603: lload_1
    //   604: lxor
    //   605: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   610: lload #5
    //   612: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   615: ldc 'c'
    //   617: iconst_1
    //   618: anewarray java/lang/Class
    //   621: astore #7
    //   623: aload #7
    //   625: iconst_0
    //   626: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   629: aastore
    //   630: aload #7
    //   632: swap
    //   633: dup_x2
    //   634: pop
    //   635: dup2_x1
    //   636: invokestatic b : (Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;
    //   639: swap
    //   640: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   643: lload_3
    //   644: dup2_x1
    //   645: pop2
    //   646: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   649: putfield x : Ljava/lang/invoke/MethodHandle;
    //   652: aload_0
    //   653: sipush #17390
    //   656: ldc2_w 3756569672334511826
    //   659: lload_1
    //   660: lxor
    //   661: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   666: lload #5
    //   668: invokestatic b : (Ljava/lang/String;J)Ljava/lang/Class;
    //   671: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   674: astore #7
    //   676: astore #14
    //   678: iconst_0
    //   679: istore #8
    //   681: iconst_0
    //   682: istore #9
    //   684: aload #7
    //   686: arraylength
    //   687: istore #10
    //   689: iload #9
    //   691: iload #10
    //   693: if_icmpge -> 771
    //   696: aload #7
    //   698: iload #9
    //   700: aaload
    //   701: astore #11
    //   703: aload #11
    //   705: astore #12
    //   707: iconst_0
    //   708: istore #13
    //   710: aload #12
    //   712: invokevirtual getName : ()Ljava/lang/String;
    //   715: ldc 'h'
    //   717: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   720: ifeq -> 752
    //   723: aload #12
    //   725: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   728: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
    //   731: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   734: ifeq -> 752
    //   737: goto -> 744
    //   740: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   743: athrow
    //   744: iconst_1
    //   745: goto -> 753
    //   748: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   751: athrow
    //   752: iconst_0
    //   753: ifeq -> 765
    //   756: aload #11
    //   758: goto -> 792
    //   761: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   764: athrow
    //   765: iinc #9, 1
    //   768: goto -> 689
    //   771: new java/util/NoSuchElementException
    //   774: dup
    //   775: sipush #8346
    //   778: ldc2_w 1363412617058938277
    //   781: lload_1
    //   782: lxor
    //   783: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   788: invokespecial <init> : (Ljava/lang/String;)V
    //   791: athrow
    //   792: aload #14
    //   794: swap
    //   795: lload_3
    //   796: dup2_x1
    //   797: pop2
    //   798: invokestatic b : (JLjava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    //   801: putfield r : Ljava/lang/invoke/MethodHandle;
    //   804: return
    // Exception table:
    //   from	to	target	type
    //   185	214	214	java/util/NoSuchElementException
    //   315	337	340	java/util/NoSuchElementException
    //   328	348	348	java/util/NoSuchElementException
    //   353	361	361	java/util/NoSuchElementException
    //   462	484	487	java/util/NoSuchElementException
    //   475	495	495	java/util/NoSuchElementException
    //   500	508	508	java/util/NoSuchElementException
    //   710	737	740	java/util/NoSuchElementException
    //   723	748	748	java/util/NoSuchElementException
    //   753	761	761	java/util/NoSuchElementException
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    Object object = b(paramBlock, l);
    return this.r.invoke(object);
  }
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #11920
    //   4: ldc2_w 5631750423574116626
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_19_R2/block/CraftBlock
    //   21: astore #4
    //   23: aload_0
    //   24: getfield z : Ljava/lang/invoke/MethodHandle;
    //   27: aload #4
    //   29: invokevirtual getNMS : ()Lnet/minecraft/world/level/block/state/IBlockData;
    //   32: invokevirtual invoke : (Lnet/minecraft/world/level/block/state/IBlockData;)Ljava/lang/Object;
    //   35: areturn
  }
  
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    BoundingBox boundingBox = paramBlock.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
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
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    Intrinsics.checkNotNull(paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED));
    return (float)paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    return paramBlock.getBreakSpeed(paramPlayer);
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
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : Ljava/lang/invoke/MethodHandle;
    //   4: aload_1
    //   5: sipush #240
    //   8: ldc2_w 3355925957772865432
    //   11: lload_3
    //   12: lxor
    //   13: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   18: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_1
    //   22: checkcast org/bukkit/craftbukkit/v1_19_R2/entity/CraftEntity
    //   25: invokevirtual getHandle : ()Lnet/minecraft/world/entity/Entity;
    //   28: iload_2
    //   29: invokevirtual invoke : (Lnet/minecraft/world/entity/Entity;Z)V
    //   32: return
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    // Byte code:
    //   0: aload_1
    //   1: sipush #31580
    //   4: ldc2_w 8875986140879691313
    //   7: lload_2
    //   8: lxor
    //   9: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   14: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_1
    //   18: checkcast org/bukkit/craftbukkit/v1_19_R2/entity/CraftPlayer
    //   21: invokevirtual getHandle : ()Lnet/minecraft/server/level/EntityPlayer;
    //   24: astore #4
    //   26: aload_0
    //   27: getfield b : Ljava/lang/invoke/MethodHandle;
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
    //   7: sipush #32690
    //   10: ldc2_w 1622206389754904693
    //   13: lload_2
    //   14: lxor
    //   15: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   20: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   23: checkcast org/bukkit/craftbukkit/v1_19_R2/CraftWorld
    //   26: invokevirtual getHandle : ()Lnet/minecraft/server/level/WorldServer;
    //   29: astore #5
    //   31: aload_0
    //   32: getfield l : Ljava/lang/invoke/MethodHandle;
    //   35: aload_1
    //   36: invokeinterface getX : ()I
    //   41: aload_1
    //   42: invokeinterface getY : ()I
    //   47: aload_1
    //   48: invokeinterface getZ : ()I
    //   53: invokevirtual invoke : (III)Ljava/lang/Object;
    //   56: astore #6
    //   58: aload_0
    //   59: getfield k : Ljava/lang/invoke/MethodHandle;
    //   62: aload #5
    //   64: aload #6
    //   66: invokevirtual invoke : (Lnet/minecraft/server/level/WorldServer;Ljava/lang/Object;)Ljava/lang/Object;
    //   69: astore #7
    //   71: aload #4
    //   73: getstatic me/rerere/matrix/internal/ya.v : Lme/rerere/matrix/internal/ya;
    //   76: if_acmpne -> 99
    //   79: aload_0
    //   80: getfield v : Ljava/lang/invoke/MethodHandle;
    //   83: aload #7
    //   85: aload #5
    //   87: aload #6
    //   89: invokevirtual invoke : (Ljava/lang/Object;Lnet/minecraft/server/level/WorldServer;Ljava/lang/Object;)Lnet/minecraft/world/phys/shapes/VoxelShape;
    //   92: goto -> 112
    //   95: invokestatic a : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
    //   98: athrow
    //   99: aload_0
    //   100: getfield i : Ljava/lang/invoke/MethodHandle;
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
  
  public boolean b(@NotNull World paramWorld, int paramInt1, int paramInt2) {
    return paramWorld.isChunkLoaded(paramInt1, paramInt2);
  }
  
  @NotNull
  public sa b(long paramLong, @NotNull Entity paramEntity) {
    BoundingBox boundingBox = paramEntity.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return paramEntity.isOnGround();
  }
  
  static {
    long l = a ^ 0x7FC32779F9D8L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "\003Ò\036ö}Rba\0335Ap\005ø`BHk Æ¬8*_<²7gUPÈ ÿU=ßPH8wOòªBÀ]r%\033Ì§\fÎJ¨¢m!Wu\002\n§Ó¯xT\033=-\021´ÚJ 3Äî»³v÷\034\027åúîýy\017ÃTA\033ôÓâ)ôg-µ\024¥\002\022d(¤ù\nAta0å}}±Dâ[Ý\0163ÙènÒo\021é±ù,µ\001öÊè£ó²\032Â\020ß¤\022<\007\016×\007ñÕ#\033[+$P¸£¨vô«G\000u®Eù3®\017îÎJäª7ÓD­ÐÝ¯.bè2wcÀéñ\tHÈ\022Þ²!ÃÍ}Í!\002ÑÛó\0247év\024G\030ã_Ûe\bÿ\005¹,.+ï÷ª J,^ú\nÌ\016àÅJÞýxõãb?\016éKz\r2\b\033ßj(X¬Âå_\016<\"Ò÷\017úâÔéóáÜc\"Ø±þ\001?×¹,ª\036¸QjÜo\017g=¤\t\022\005Ã\035È\nË¨Ä\031iû^¯zÙqV©)£Y=Y:íp\005\034Ú¦»¶Ð\017\034 \005Ë(Ë\f´î<Þ\030±éZsËbÒJxµO:Õ\007¹Æ·Ñc\030}Xg²\000%CYxTAU¶?Ä\033\007g¤oç4²Ï å·¿ÄZy\031\rËvÈeÙ1ðáÝ\025üÍ°%4®{@TºÐ|vAõ_¼°\032\022Â©eò9\036m\for\0023üw\023ÄÔ!2\033\020ÿ~ç¦\021)nfD\b\005ç\nîq'&´|>\005<S³]/04ºWÿxJ;\027ø¾x\n]æN4ÍRÛ)`E\0334V|1ìg\037l·Yyl2LîÚÕ+¢qØ\023÷º>rñx¥yeÎ6\004N&àº¥P¶BN÷ÀDÌÂ´\031 ë¤/÷#\0309(÷\035v%L\013u:lÑÄRu\rú\000àBî|êÄ-+?\036\004gw-ó¦ªÜ0 \\\013 !S$\020Ðò\036ÍáË@`ÑÝ£Dl| g´ÁÈGDo½2,Cô\035óïÖRï_sÕÞm£i%GKmÕ\031_\035\034\013ÞH\"Cc\036dc7ë%üßêbÁ\000I\026yå\017¿,©C¼ú\004õ0ÛÍ©VÔ\\áB EÒzÂçú\017»ÌÀ\007+ñ\"£\tQÜ´¾L\006L\035ù²\000Qr)Í\000D8~´\036\bÅ\006y\035IR£üõ9Ùl\033ûDÙN Á|Ðsú Ù=$4ÚÕÏ>Mº¢\024ÏùH©\bj64âöèÓ\tèÍ}ô9íª ¢\b};ðV÷uöoEFT´Ì\003¢´ÆfãJö\036î\037©êÐNå\036$D\033òF]È\023è,÷C\026,v\036Ì\033ê\007\023´û\001ý{\024S'o").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5355;
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
        throw new RuntimeException("me/rerere/matrix/internal/td", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/td'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\td.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
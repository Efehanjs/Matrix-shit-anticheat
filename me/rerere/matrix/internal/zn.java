package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import net.minecraft.server.v1_12_R1.AxisAlignedBB;
import net.minecraft.server.v1_12_R1.Block;
import net.minecraft.server.v1_12_R1.BlockFence;
import net.minecraft.server.v1_12_R1.BlockPosition;
import net.minecraft.server.v1_12_R1.BlockThin;
import net.minecraft.server.v1_12_R1.Chunk;
import net.minecraft.server.v1_12_R1.ChunkProviderServer;
import net.minecraft.server.v1_12_R1.Entity;
import net.minecraft.server.v1_12_R1.EntityHuman;
import net.minecraft.server.v1_12_R1.EntityLiving;
import net.minecraft.server.v1_12_R1.EntityPlayer;
import net.minecraft.server.v1_12_R1.EnumAnimation;
import net.minecraft.server.v1_12_R1.EnumDirection;
import net.minecraft.server.v1_12_R1.IBlockAccess;
import net.minecraft.server.v1_12_R1.IBlockData;
import net.minecraft.server.v1_12_R1.IBlockState;
import net.minecraft.server.v1_12_R1.ItemStack;
import net.minecraft.server.v1_12_R1.MobEffect;
import net.minecraft.server.v1_12_R1.MobEffectList;
import net.minecraft.server.v1_12_R1.MovingObjectPosition;
import net.minecraft.server.v1_12_R1.Vec3D;
import net.minecraft.server.v1_12_R1.World;
import net.minecraft.server.v1_12_R1.WorldServer;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class zn implements k {
  private static Material[] i;
  
  private static final long a = o3.a(-4491023540800254549L, -100887779260641192L, MethodHandles.lookup().lookupClass()).a(199883302900736L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map f = new HashMap<>(13);
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    return (float)paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
  }
  
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    ChunkProviderServer chunkProviderServer = worldServer.getChunkProviderServer();
    Chunk chunk = chunkProviderServer.getChunkIfLoaded(paramBlock.getX() >> 4, paramBlock.getZ() >> 4);
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    IBlockData iBlockData = chunk.getBlockData(blockPosition);
    Block block = iBlockData.getBlock();
    try {
      if (paramya == ya.v) {
        if (block.a(iBlockData, false)) {
          AxisAlignedBB axisAlignedBB = iBlockData.e((IBlockAccess)worldServer, blockPosition);
          sa sa = new sa(axisAlignedBB.a, axisAlignedBB.b, axisAlignedBB.c, axisAlignedBB.d, axisAlignedBB.e, axisAlignedBB.f);
          sa.b(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
          return new sa[] { sa };
        } 
        return new sa[0];
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (paramya == ya.b) {
      ArrayList<AxisAlignedBB> arrayList = new ArrayList();
      AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPosition);
      iBlockData.a((World)worldServer, blockPosition, axisAlignedBB, arrayList, null, false);
      sa[] arrayOfSa = new sa[arrayList.size()];
      for (byte b = 0; b < arrayList.size(); b++) {
        AxisAlignedBB axisAlignedBB1 = arrayList.get(b);
        arrayOfSa[b] = new sa(axisAlignedBB1.a, axisAlignedBB1.b, axisAlignedBB1.c, axisAlignedBB1.d, axisAlignedBB1.e, axisAlignedBB1.f);
      } 
      return arrayOfSa;
    } 
    return new sa[0];
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    return ((Block)b(paramBlock, l)).frictionFactor;
  }
  
  @NotNull
  public sa b(long paramLong, @NotNull Entity paramEntity) {
    CraftEntity craftEntity = (CraftEntity)paramEntity;
    Entity entity = craftEntity.getHandle();
    AxisAlignedBB axisAlignedBB = entity.getBoundingBox();
    try {
      if (axisAlignedBB == null)
        return sa.b(paramEntity.getLocation()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new sa(axisAlignedBB.a, axisAlignedBB.b, axisAlignedBB.c, axisAlignedBB.d, axisAlignedBB.e, axisAlignedBB.f);
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    (((CraftEntity)paramEntity).getHandle()).onGround = paramBoolean;
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  @Deprecated
  public static Material b(int paramInt) {
    try {
      if (i.length > paramInt)
        try {
          if (paramInt >= 0)
            return i[paramInt]; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    EntityPlayer entityPlayer = ((CraftPlayer)paramPlayer).getHandle();
    entityPlayer.clearActiveItem();
  }
  
  public int b(@NotNull Player paramPlayer, @NotNull PotionEffectType paramPotionEffectType) {
    CraftLivingEntity craftLivingEntity = (CraftLivingEntity)paramPlayer;
    EntityLiving entityLiving = craftLivingEntity.getHandle();
    MobEffect mobEffect = entityLiving.getEffect(MobEffectList.fromId(paramPotionEffectType.getId()));
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (mobEffect == null) ? 0 : (mobEffect.getAmplifier() + 1);
  }
  
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (itemStack.getItem().f(itemStack) != EnumAnimation.NONE);
  }
  
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    IBlockData iBlockData = worldServer.getType(blockPosition);
    AxisAlignedBB axisAlignedBB = iBlockData.e((IBlockAccess)worldServer, blockPosition).a(blockPosition);
    try {
      if (axisAlignedBB == null)
        return sa.b(paramBlock.getLocation()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new sa(axisAlignedBB.a, axisAlignedBB.b, axisAlignedBB.c, axisAlignedBB.d, axisAlignedBB.e, axisAlignedBB.f);
  }
  
  public boolean b(World paramWorld, int paramInt1, int paramInt2) {
    CraftWorld craftWorld = (CraftWorld)paramWorld;
    WorldServer worldServer = craftWorld.getHandle();
    return worldServer.getChunkProviderServer().isLoaded(paramInt1, paramInt2);
  }
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    ChunkProviderServer chunkProviderServer = worldServer.getChunkProviderServer();
    int i = paramBlock.getX();
    int j = paramBlock.getY();
    int m = paramBlock.getZ();
    Chunk chunk = chunkProviderServer.getChunkIfLoaded(paramBlock.getX() >> 4, paramBlock.getZ() >> 4);
    try {
      if (chunk == null)
        return Material.AIR; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return chunk.getBlockData(new BlockPosition(i, j, m)).getBlock();
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    IBlockData iBlockData = worldServer.getType(blockPosition);
    return iBlockData.a((EntityHuman)((CraftPlayer)paramPlayer).getHandle(), (World)worldServer, blockPosition);
  }
  
  @Nullable
  public on b(@NotNull World paramWorld, @NotNull Vector paramVector1, @NotNull Vector paramVector2, double paramDouble) {
    Vec3D vec3D1 = new Vec3D(paramVector1.getX(), paramVector1.getY(), paramVector1.getZ());
    Vector vector = paramVector1.clone().add(paramVector2.clone().normalize().multiply(paramDouble));
    Vec3D vec3D2 = new Vec3D(vector.getX(), vector.getY(), vector.getZ());
    MovingObjectPosition movingObjectPosition = ((CraftWorld)paramWorld).getHandle().rayTrace(vec3D1, vec3D2);
    try {
      if (movingObjectPosition != null)
        try {
          if (movingObjectPosition.type != MovingObjectPosition.EnumMovingObjectType.MISS) {
            Entity entity = movingObjectPosition.entity;
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return new on(new Vector(movingObjectPosition.pos.x, movingObjectPosition.pos.y, movingObjectPosition.pos.z), paramWorld.getBlockAt(movingObjectPosition.a().getX(), movingObjectPosition.a().getY(), movingObjectPosition.a().getZ()), (entity == null) ? null : (Entity)entity.getBukkitEntity(), b(movingObjectPosition.direction));
          } 
          return null;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  public zn(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/zn.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: invokespecial <init> : ()V
    //   10: aconst_null
    //   11: astore_3
    //   12: ldc_w org/bukkit/Material
    //   15: sipush #28545
    //   18: ldc2_w 5564228620457086214
    //   21: lload_1
    //   22: lxor
    //   23: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   28: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   31: astore_3
    //   32: aload_3
    //   33: iconst_1
    //   34: invokevirtual setAccessible : (Z)V
    //   37: aload_3
    //   38: aconst_null
    //   39: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   42: checkcast [Lorg/bukkit/Material;
    //   45: checkcast [Lorg/bukkit/Material;
    //   48: putstatic me/rerere/matrix/internal/zn.i : [Lorg/bukkit/Material;
    //   51: goto -> 72
    //   54: astore #4
    //   56: sipush #11920
    //   59: ldc2_w 893894738269326358
    //   62: lload_1
    //   63: lxor
    //   64: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   69: invokestatic b : (Ljava/lang/String;)V
    //   72: return
    // Exception table:
    //   from	to	target	type
    //   12	51	54	java/lang/NoSuchFieldException
    //   12	51	54	java/lang/IllegalAccessException
  }
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    return itemStack.getItem().e(itemStack);
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return (((CraftEntity)paramEntity).getHandle()).onGround;
  }
  
  static {
    long l = a ^ 0x430D415B3A02L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "\b\034-gmÆ¬°Pq7\0350//Á@a×c\001Ê2ÍZºÂ±®%,Çù\022ê:m[¯ÄHI%ßoï»]K\007OFQ\\s¯81jZ\020]\0060W\032\026)UEÂn").length();
    byte b2 = 16;
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
  
  private static String b(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x52AF;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/zn", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/zn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
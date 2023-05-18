package me.rerere.matrix.internal;

import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import net.minecraft.server.v1_13_R1.AxisAlignedBB;
import net.minecraft.server.v1_13_R1.Block;
import net.minecraft.server.v1_13_R1.BlockPosition;
import net.minecraft.server.v1_13_R1.Entity;
import net.minecraft.server.v1_13_R1.EntityHuman;
import net.minecraft.server.v1_13_R1.EntityPlayer;
import net.minecraft.server.v1_13_R1.EnumAnimation;
import net.minecraft.server.v1_13_R1.IBlockAccess;
import net.minecraft.server.v1_13_R1.IBlockData;
import net.minecraft.server.v1_13_R1.ItemStack;
import net.minecraft.server.v1_13_R1.VoxelShape;
import net.minecraft.server.v1_13_R1.WorldServer;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_13_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_13_R1.block.CraftBlock;
import org.bukkit.craftbukkit.v1_13_R1.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_13_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_13_R1.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@Deprecated
public class ff implements k {
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    CraftBlock craftBlock = (CraftBlock)paramBlock;
    IBlockData iBlockData = craftBlock.getNMS();
    Block block = iBlockData.getBlock();
    VoxelShape voxelShape = iBlockData.g((IBlockAccess)((CraftWorld)craftBlock.getWorld()).getHandle(), new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ()));
    try {
      if (voxelShape.b())
        return sa.b(paramBlock.getLocation()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    AxisAlignedBB axisAlignedBB = voxelShape.a();
    Location location = paramBlock.getLocation();
    return new sa(location.getX() + axisAlignedBB.a, location.getY() + axisAlignedBB.b, location.getZ() + axisAlignedBB.c, location.getX() + axisAlignedBB.d, location.getY() + axisAlignedBB.e, location.getZ() + axisAlignedBB.f);
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    EntityPlayer entityPlayer = ((CraftPlayer)paramPlayer).getHandle();
    entityPlayer.clearActiveItem();
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return (((CraftEntity)paramEntity).getHandle()).onGround;
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    CraftBlock craftBlock = (CraftBlock)paramBlock;
    IBlockData iBlockData = craftBlock.getNMS();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    WorldServer worldServer = craftBlock.getCraftWorld().getHandle();
    return iBlockData.getDamage((EntityHuman)((CraftPlayer)paramPlayer).getHandle(), (IBlockAccess)worldServer, blockPosition);
  }
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    return (float)paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    (((CraftEntity)paramEntity).getHandle()).onGround = paramBoolean;
  }
  
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (itemStack.getItem().d(itemStack) != EnumAnimation.NONE);
  }
  
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    CraftBlock craftBlock = (CraftBlock)paramBlock;
    IBlockData iBlockData = craftBlock.getNMS();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    WorldServer worldServer = craftBlock.getCraftWorld().getHandle();
    Block block = iBlockData.getBlock();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    VoxelShape voxelShape = (paramya == ya.v) ? iBlockData.g((IBlockAccess)worldServer, blockPosition) : iBlockData.h((IBlockAccess)worldServer, blockPosition);
    try {
      if (voxelShape.b())
        return new sa[] { sa.b(paramBlock.getLocation()) }; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List list = voxelShape.d();
    sa[] arrayOfSa = new sa[list.size()];
    byte b = 0;
    for (AxisAlignedBB axisAlignedBB : list)
      arrayOfSa[b++] = new sa(paramBlock.getX() + axisAlignedBB.a, paramBlock.getY() + axisAlignedBB.b, paramBlock.getZ() + axisAlignedBB.c, paramBlock.getX() + axisAlignedBB.d, paramBlock.getY() + axisAlignedBB.e, paramBlock.getZ() + axisAlignedBB.f); 
    return arrayOfSa;
  }
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    return itemStack.getItem().c(itemStack);
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
  
  public boolean b(World paramWorld, int paramInt1, int paramInt2) {
    CraftWorld craftWorld = (CraftWorld)paramWorld;
    WorldServer worldServer = craftWorld.getHandle();
    return worldServer.getChunkProviderServer().isLoaded(paramInt1, paramInt2);
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    CraftBlock craftBlock = (CraftBlock)paramBlock;
    return craftBlock.getNMS().getBlock();
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    return ((Block)b(paramBlock, l)).n();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ff.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
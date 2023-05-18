package me.rerere.matrix.internal;

import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import net.minecraft.server.v1_16_R3.AxisAlignedBB;
import net.minecraft.server.v1_16_R3.Block;
import net.minecraft.server.v1_16_R3.BlockPosition;
import net.minecraft.server.v1_16_R3.Chunk;
import net.minecraft.server.v1_16_R3.Entity;
import net.minecraft.server.v1_16_R3.EntityHuman;
import net.minecraft.server.v1_16_R3.EnumAnimation;
import net.minecraft.server.v1_16_R3.IBlockAccess;
import net.minecraft.server.v1_16_R3.IBlockData;
import net.minecraft.server.v1_16_R3.ItemStack;
import net.minecraft.server.v1_16_R3.VoxelShape;
import net.minecraft.server.v1_16_R3.WorldServer;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_16_R3.CraftChunk;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftLivingEntity;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;

public class ej implements k {
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    BoundingBox boundingBox = paramBlock.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (itemStack.getItem().d_(itemStack) != EnumAnimation.NONE);
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    ((CraftEntity)paramEntity).getHandle().setOnGround(paramBoolean);
  }
  
  public boolean b(@NotNull Entity paramEntity) {
    return ((CraftEntity)paramEntity).getHandle().isOnGround();
  }
  
  public boolean b(@NotNull World paramWorld, int paramInt1, int paramInt2) {
    return paramWorld.isChunkLoaded(paramInt1, paramInt2);
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    IBlockData iBlockData = worldServer.getType(blockPosition);
    return iBlockData.getDamage((EntityHuman)((CraftPlayer)paramPlayer).getHandle(), (IBlockAccess)worldServer, blockPosition);
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    Chunk chunk = ((CraftChunk)paramBlock.getChunk()).getHandle();
    IBlockData iBlockData = chunk.getType(blockPosition);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    VoxelShape voxelShape = (paramya == ya.v) ? iBlockData.getShape((IBlockAccess)worldServer, blockPosition) : iBlockData.getCollisionShape((IBlockAccess)worldServer, blockPosition);
    List list = voxelShape.d();
    sa[] arrayOfSa = new sa[list.size()];
    byte b = 0;
    for (AxisAlignedBB axisAlignedBB : list)
      arrayOfSa[b++] = new sa(paramBlock.getX() + axisAlignedBB.minX, paramBlock.getY() + axisAlignedBB.minY, paramBlock.getZ() + axisAlignedBB.minZ, paramBlock.getX() + axisAlignedBB.maxX, paramBlock.getY() + axisAlignedBB.maxY, paramBlock.getZ() + axisAlignedBB.maxZ); 
    return arrayOfSa;
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
    return new sa(axisAlignedBB.minX, axisAlignedBB.minY, axisAlignedBB.minZ, axisAlignedBB.maxX, axisAlignedBB.maxY, axisAlignedBB.maxZ);
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    ((CraftPlayer)paramPlayer).getHandle().clearActiveItem();
  }
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    EntityHuman entityHuman = (EntityHuman)((CraftLivingEntity)paramLivingEntity).getHandle();
    return entityHuman.dN();
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    return ((Block)b(paramBlock, l)).getFrictionFactor();
  }
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    Chunk chunk = ((CraftChunk)paramBlock.getChunk()).getHandle();
    IBlockData iBlockData = chunk.getType(new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ()));
    return iBlockData.getBlock();
  }
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    return itemStack.getItem().e_(itemStack);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ej.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
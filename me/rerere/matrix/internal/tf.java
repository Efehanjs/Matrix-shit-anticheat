package me.rerere.matrix.internal;

import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import net.minecraft.server.v1_14_R1.AxisAlignedBB;
import net.minecraft.server.v1_14_R1.Block;
import net.minecraft.server.v1_14_R1.BlockPosition;
import net.minecraft.server.v1_14_R1.Entity;
import net.minecraft.server.v1_14_R1.EntityHuman;
import net.minecraft.server.v1_14_R1.EntityPlayer;
import net.minecraft.server.v1_14_R1.EnumAnimation;
import net.minecraft.server.v1_14_R1.IBlockAccess;
import net.minecraft.server.v1_14_R1.IBlockData;
import net.minecraft.server.v1_14_R1.ItemStack;
import net.minecraft.server.v1_14_R1.VoxelShape;
import net.minecraft.server.v1_14_R1.WorldServer;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_14_R1.CraftWorld;
import org.bukkit.craftbukkit.v1_14_R1.block.CraftBlock;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_14_R1.inventory.CraftItemStack;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.BoundingBox;

@Deprecated
public class tf implements k {
  public boolean b(@NotNull ItemStack paramItemStack, long paramLong) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (itemStack.getItem().e_(itemStack) != EnumAnimation.NONE);
  }
  
  public float b(long paramLong, @NotNull Block paramBlock) {
    long l = paramLong ^ 0x765FA57674B3L;
    return ((Block)b(paramBlock, l)).m();
  }
  
  public void b(@NotNull Player paramPlayer, long paramLong) {
    EntityPlayer entityPlayer = ((CraftPlayer)paramPlayer).getHandle();
    entityPlayer.clearActiveItem();
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
  
  public int b(long paramLong, @NotNull ItemStack paramItemStack) {
    ItemStack itemStack = CraftItemStack.asNMSCopy(paramItemStack);
    return itemStack.getItem().f_(itemStack);
  }
  
  public float b(@NotNull Player paramPlayer, long paramLong, @NotNull Block paramBlock) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    IBlockData iBlockData = worldServer.getType(blockPosition);
    return iBlockData.getDamage((EntityHuman)((CraftPlayer)paramPlayer).getHandle(), (IBlockAccess)worldServer, blockPosition);
  }
  
  public sa[] b(@NotNull Block paramBlock, long paramLong, @NotNull ya paramya) {
    WorldServer worldServer = ((CraftWorld)paramBlock.getWorld()).getHandle();
    BlockPosition blockPosition = new BlockPosition(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
    IBlockData iBlockData = worldServer.getType(blockPosition);
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
  
  public boolean b(@NotNull Entity paramEntity) {
    return (((CraftEntity)paramEntity).getHandle()).onGround;
  }
  
  public boolean b(World paramWorld, int paramInt1, int paramInt2) {
    CraftWorld craftWorld = (CraftWorld)paramWorld;
    WorldServer worldServer = craftWorld.getHandle();
    return worldServer.getChunkProvider().isLoaded(paramInt1, paramInt2);
  }
  
  @NotNull
  public Object b(@NotNull Block paramBlock, long paramLong) {
    CraftBlock craftBlock = (CraftBlock)paramBlock;
    return craftBlock.getNMS().getBlock();
  }
  
  public float b(@NotNull LivingEntity paramLivingEntity, long paramLong) {
    return (float)paramLivingEntity.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
  }
  
  public boolean b(@NotNull Player paramPlayer) {
    return paramPlayer.isHandRaised();
  }
  
  public void b(@NotNull Entity paramEntity, boolean paramBoolean, long paramLong) {
    (((CraftEntity)paramEntity).getHandle()).onGround = paramBoolean;
  }
  
  @NotNull
  public sa b(@NotNull Block paramBlock) {
    BoundingBox boundingBox = paramBlock.getBoundingBox();
    return new sa(boundingBox.getMinX(), boundingBox.getMinY(), boundingBox.getMinZ(), boundingBox.getMaxX(), boundingBox.getMaxY(), boundingBox.getMaxZ());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\tf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
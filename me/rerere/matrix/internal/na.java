package me.rerere.matrix.internal;

import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Levelled;
import org.bukkit.block.data.Openable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public final class na {
  public static final BlockFace[] v;
  
  public static int b;
  
  public static final int i;
  
  private static final long a = o3.a(-4238089651500232069L, -5566877604321173394L, MethodHandles.lookup().lookupClass()).a(179915230499727L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @Deprecated
  public static boolean j(@NotNull Location paramLocation, boolean paramBoolean, long paramLong) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x764ACE4F3168L;
    db db = db.b(paramLocation);
    Material material = db.b();
    try {
      if (a(paramLocation))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramBoolean && da.n(material)) {
        Block block = db.b(l);
        try {
          if (b.b() < 13) {
            try {
            
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return (block.getData() > 3);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Openable openable = (Openable)block.getBlockData();
        return openable.isOpen();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean d(int paramInt1, int paramInt2, @NotNull Player paramPlayer, byte paramByte) {
    long l1 = (paramInt1 << 32L | paramInt2 << 40L >>> 32L | paramByte << 56L >>> 56L) ^ a;
    long l2 = l1 ^ 0x2EC761635929L;
    Location location = paramPlayer.getLocation();
    Block block1 = location.getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    try {
      if (da.b(l2, block1) && da.b(l2, block2)) {
        for (BlockFace blockFace : v) {
          try {
            if (!da.b(l2, block2.getRelative(blockFace)))
              return false; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          try {
            if (!da.b(l2, block1.getRelative(blockFace)))
              return false; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } 
        return true;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean a(@NotNull Location paramLocation) {
    Material material = paramLocation.getBlock().getType();
    try {
      if (material != Material.LADDER)
        try {
          if (material != Material.VINE) {
            boolean bool = false;
            for (db db : b(paramLocation, 0.1D)) {
              Material material1 = db.b();
              try {
                if (material1 == Material.LADDER || material1 == Material.VINE) {
                  bool = true;
                  break;
                } 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } 
            return bool;
          } 
          return true;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public static Material b(@NotNull Location paramLocation) {
    return b(paramLocation.getWorld(), paramLocation.getBlockX(), paramLocation.getBlockY(), paramLocation.getBlockZ());
  }
  
  public static float b(@NotNull Block paramBlock, long paramLong) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x75E9579939A3L;
    int i = (int)((paramLong ^ 0x1E6B521AFFDDL) >>> 32L);
    int j = (int)((paramLong ^ 0x1E6B521AFFDDL) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x1E6B521AFFDDL) << 48L >>> 48L);
    paramLong ^ 0x1E6B521AFFDDL;
    return Matrix.b().b().b(i, j, k).b(l, paramBlock);
  }
  
  public static boolean o(@NotNull Location paramLocation) {
    try {
      if (b.b() < 13)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    World world = paramLocation.getWorld();
    try {
      if (world == null)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = paramLocation.getBlockY() - 3;
    for (int j = paramLocation.getBlockY(); j >= i; j--) {
      Block block = world.getBlockAt(paramLocation.getBlockX(), j, paramLocation.getBlockZ());
      try {
        if (b(block) == Material.BUBBLE_COLUMN)
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      for (BlockFace blockFace : v) {
        try {
          if (b(block.getRelative(blockFace)) == Material.BUBBLE_COLUMN)
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } 
    return false;
  }
  
  public static boolean v(@NotNull Location paramLocation) {
    Block block = paramLocation.getBlock();
    try {
      if (block.isLiquid())
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return block.getRelative(BlockFace.UP).isLiquid();
  }
  
  public static boolean m(Material paramMaterial) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (paramMaterial == Material.SLIME_BLOCK);
  }
  
  public static boolean f(@NotNull Location paramLocation) {
    try {
      if (da.r(b(paramLocation)))
        return da.r(b(paramLocation.clone().add(0.0D, 1.0D, 0.0D))); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean b(@NotNull Location paramLocation, Material paramMaterial) {
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    Block block3 = block1.getRelative(BlockFace.DOWN);
    try {
      if (b(block1) != paramMaterial)
        try {
          if (b(block2) != paramMaterial)
            try {
              if (b(block3) != paramMaterial) {
                for (BlockFace blockFace : v) {
                  try {
                    if (b(block1.getRelative(blockFace)) == paramMaterial)
                      return true; 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  } 
                  try {
                    if (b(block2.getRelative(blockFace)) == paramMaterial)
                      return true; 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  } 
                  try {
                    if (b(block3.getRelative(blockFace)) == paramMaterial)
                      return true; 
                  } catch (IllegalStateException illegalStateException) {
                    throw a(null);
                  } 
                } 
                return false;
              } 
              return true;
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return true;
  }
  
  public static void b(@NotNull Block paramBlock) {
    paramBlock.getState().update();
  }
  
  public static boolean n(@NotNull Player paramPlayer) {
    Location location = paramPlayer.getLocation();
    Material material = location.getBlock().getType();
    try {
      if (material != Material.LADDER) {
        try {
          if (material == Material.VINE);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static boolean s(@NotNull Location paramLocation) {
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    for (BlockFace blockFace : v) {
      try {
        if (!da.p(block1.getRelative(blockFace)))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (!da.p(block2.getRelative(blockFace)))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean u(@NotNull Location paramLocation) {
    db db1 = db.b(paramLocation);
    db db2 = db1.b(BlockFace.UP);
    try {
      if (!da.r(db1.b()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!da.r(db2.b()))
        try {
          if (da.r(db1.b()))
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (!da.r(db2.b(blockFace).b()))
          try {
            if (da.r(db1.b()))
              try {
                if (da.r(db1.b(blockFace).b()))
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean b(long paramLong, @NotNull Location paramLocation, boolean paramBoolean) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x57981C3FC43L;
    db db = db.b(paramLocation);
    Material material = db.b();
    try {
      if (a(paramLocation))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 16)
        try {
          if (p(material))
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 17)
        try {
          if (material != Material.CAVE_VINES) {
            try {
              if (material == Material.CAVE_VINES_PLANT)
                return true; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
          } else {
            return true;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramBoolean && da.n(material)) {
        Block block = db.b(l);
        try {
          if (b.b() < 13) {
            try {
            
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return (block.getData() > 3);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        Openable openable = (Openable)block.getBlockData();
        return openable.isOpen();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean w(@NotNull Location paramLocation) {
    World world = paramLocation.getWorld();
    sa sa = new sa(paramLocation.toVector(), 0.4D, 2.0D);
    return sa.b(world).stream().anyMatch(paramBlock -> {
          try {
          
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
          return !da.p(paramBlock);
        });
  }
  
  public static boolean l(short paramShort, int paramInt1, int paramInt2, @NotNull Location paramLocation) {
    long l1 = (paramShort << 48L | paramInt1 << 32L >>> 16L | paramInt2 << 48L >>> 48L) ^ a;
    long l2 = l1 ^ 0xF374D42E7CCL;
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    try {
      if (!da.b(l2, block1))
        try {
          if (!da.r(block1.getType()))
            try {
              if (block1.getType().isSolid())
                return true; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!da.b(l2, block2))
        try {
          if (!da.r(block2.getType()))
            try {
              if (block2.getType().isSolid())
                return true; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (p(block1.getRelative(blockFace)))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (p(block2.getRelative(blockFace)))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean x(@NotNull Location paramLocation) {
    db db1 = db.b(paramLocation);
    db db2 = db1.b(BlockFace.DOWN);
    try {
      if (da.f(db1.b()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (da.f(db2.b()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (da.f(db1.b(blockFace).b()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (da.f(db2.b(blockFace).b()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean g(@NotNull Location paramLocation) {
    db db1 = db.b(paramLocation);
    db db2 = db1.b(BlockFace.DOWN);
    try {
      if (da.l(db1.b()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (da.l(db2.b()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (da.l(db2.b(blockFace).b()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (da.l(db1.b(blockFace).b()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static void b(@NotNull Location paramLocation) {
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.DOWN);
    b(block1);
    b(block2);
    for (BlockFace blockFace : v) {
      b(block1.getRelative(blockFace));
      b(block2.getRelative(blockFace));
    } 
  }
  
  public static boolean e(long paramLong, @NotNull Location paramLocation) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x6DE37B914881L;
    for (Block block : b(paramLocation).collect(Collectors.toSet())) {
      try {
        if (block.getY() <= paramLocation.getBlockY())
          try {
            if (block.getY() >= paramLocation.getBlockY() - 1)
              try {
                if (fa.b(block, l, paramLocation))
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean c(@NotNull Player paramPlayer) {
    Location location = paramPlayer.getLocation();
    Block block = location.getBlock();
    try {
      if (da.j(block))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return da.j(block.getRelative(BlockFace.UP));
  }
  
  @NotNull
  public static List b(@NotNull Location paramLocation) {
    World world = paramLocation.getWorld();
    ArrayList<Block> arrayList = new ArrayList();
    int i = paramLocation.getBlockX();
    int j = paramLocation.getBlockY();
    int k = paramLocation.getBlockZ();
    for (int m = i - 1; m <= i + 1; m++) {
      for (int n = j - 1; n <= j + 2; n++) {
        for (int i1 = k - 1; i1 <= k + 1; i1++) {
          Block block = world.getBlockAt(m, n, i1);
          arrayList.add(block);
        } 
      } 
    } 
    return arrayList;
  }
  
  @NotNull
  public static Material b(@Nullable Block paramBlock) {
    try {
      if (paramBlock == null)
        return Material.AIR; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return b(paramBlock.getWorld(), paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
  }
  
  public static boolean r(@NotNull Location paramLocation) {
    World world = paramLocation.getWorld();
    int i = paramLocation.getBlockX();
    int j = paramLocation.getBlockY();
    int k = paramLocation.getBlockZ();
    for (int m = i - 2; m <= i + 2; m++) {
      for (int n = j - 3; n <= j + 2; n++) {
        for (int i1 = k - 2; i1 <= k + 2; i1++) {
          Block block = b(world, m, n, i1);
          try {
            if (da.b(b(block)))
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } 
      } 
    } 
    return false;
  }
  
  @NotNull
  public static BlockData b(long paramLong, @NotNull Block paramBlock) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/na.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: invokestatic b : ()I
    //   9: bipush #13
    //   11: if_icmpge -> 39
    //   14: new java/lang/IllegalStateException
    //   17: dup
    //   18: sipush #19563
    //   21: ldc2_w 6236791028278595818
    //   24: lload_0
    //   25: lxor
    //   26: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   31: invokespecial <init> : (Ljava/lang/String;)V
    //   34: athrow
    //   35: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   38: athrow
    //   39: aload_2
    //   40: invokeinterface getBlockData : ()Lorg/bukkit/block/data/BlockData;
    //   45: areturn
    // Exception table:
    //   from	to	target	type
    //   6	35	35	java/lang/IllegalStateException
  }
  
  public static boolean d(@NotNull Location paramLocation) {
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    try {
      if (!b(block1))
        try {
          if (!b(block2)) {
            for (BlockFace blockFace : v) {
              try {
                if (b(block1.getRelative(blockFace)))
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              try {
                if (b(block2.getRelative(blockFace)))
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } 
            return false;
          } 
          return true;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return true;
  }
  
  public static boolean n(@NotNull Location paramLocation, long paramLong) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x365C40113155L;
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    try {
      if (!da.b(l, block1))
        try {
          if (!da.b(l, block2)) {
            for (BlockFace blockFace : v) {
              try {
                if (da.b(l, block1.getRelative(blockFace)))
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              try {
                if (da.b(l, block2.getRelative(blockFace)))
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
            } 
            return false;
          } 
          return true;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return true;
  }
  
  public static boolean p(Material paramMaterial) {
    try {
      if (paramMaterial != Material.TWISTING_VINES_PLANT)
        try {
          if (paramMaterial != Material.WEEPING_VINES_PLANT)
            try {
              if (paramMaterial != Material.TWISTING_VINES) {
                try {
                  if (paramMaterial == Material.WEEPING_VINES);
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                } 
                return false;
              } 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static boolean i(@NotNull Player paramPlayer) {
    Location location = paramPlayer.getLocation();
    Block block1 = location.getBlock();
    Block block2 = block1.getRelative(BlockFace.DOWN);
    try {
      if (b(block2.getType()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Block block3 = block2.getRelative(BlockFace.DOWN);
    try {
      if (b(block3.getType()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (b(block2.getRelative(blockFace).getType()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (b(block3.getRelative(blockFace).getType()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean c(@NotNull Location paramLocation) {
    for (Entity entity : j(paramLocation, 2.0D)) {
      EntityType entityType = entity.getType();
      try {
        if (b(entityType))
          try {
            if (entity.getLocation().getY() <= paramLocation.getY())
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (b.b() >= 9)
          try {
            if (entity.getType() == EntityType.SHULKER)
              try {
                if (entity.getLocation().getY() <= paramLocation.getY())
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  @NotNull
  public static Block b(@NotNull World paramWorld, int paramInt1, int paramInt2, int paramInt3) {
    return paramWorld.getBlockAt(paramInt1, paramInt2, paramInt3);
  }
  
  public static boolean t(@NotNull Player paramPlayer) {
    Location location = paramPlayer.getLocation();
    Block block1 = location.getBlock();
    try {
      if (m(b(block1)))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Block block2 = block1.getRelative(BlockFace.DOWN);
    try {
      if (m(b(block2)))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Block block3 = block2.getRelative(BlockFace.DOWN);
    try {
      if (m(b(block3)))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (m(b(block2.getRelative(blockFace))))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (m(b(block3.getRelative(blockFace))))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean i(@NotNull Location paramLocation) {
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.DOWN);
    try {
      if (j(block2.getType()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Block block3 = block2.getRelative(BlockFace.DOWN);
    try {
      if (j(block3.getType()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (j(block2.getRelative(blockFace).getType()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (j(block3.getRelative(blockFace).getType()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  @NotNull
  public static Set j(@NotNull Location paramLocation, double paramDouble) {
    HashSet<Entity> hashSet = new HashSet();
    World world = paramLocation.getWorld();
    try {
      if (world == null)
        return new HashSet(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    int i = ra.b(paramLocation.getX() - paramDouble) >> 4;
    while (i <= ra.b(paramLocation.getX() + paramDouble) >> 4) {
      int j = ra.b(paramLocation.getZ() - paramDouble) >> 4;
      while (true) {
        try {
          if (j <= ra.b(paramLocation.getZ() + paramDouble) >> 4) {
            if (world.isChunkLoaded(i, j)) {
              Chunk chunk = world.getChunkAt(i, j);
              for (Entity entity : chunk.getEntities()) {
                try {
                  if (world == entity.getWorld())
                    try {
                      if (entity.getLocation().distanceSquared(paramLocation) <= paramDouble * paramDouble)
                        hashSet.add(entity); 
                    } catch (IllegalStateException illegalStateException) {
                      throw a(null);
                    }  
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                } 
              } 
            } 
            j++;
            continue;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        i++;
      } 
    } 
    return hashSet;
  }
  
  @NotNull
  public static Set b(@NotNull Location paramLocation, double paramDouble) {
    double d1 = paramLocation.getX();
    double d2 = paramLocation.getZ();
    double d3 = d1 % 1.0D;
    double d4 = d2 % 1.0D;
    LinkedHashSet<db> linkedHashSet = Sets.newLinkedHashSet();
    try {
      if (Math.abs(d3 + paramDouble) > 0.0D)
        linkedHashSet.add(db.b(paramLocation.clone().add(paramDouble, 0.0D, 0.0D))); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (Math.abs(d3 - paramDouble) > 0.0D)
        linkedHashSet.add(db.b(paramLocation.clone().add(-paramDouble, 0.0D, 0.0D))); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (Math.abs(d4 + paramDouble) > 0.0D)
        linkedHashSet.add(db.b(paramLocation.clone().add(0.0D, 0.0D, paramDouble))); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (Math.abs(d4 - paramDouble) > 0.0D)
        linkedHashSet.add(db.b(paramLocation.clone().add(0.0D, 0.0D, -paramDouble))); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return linkedHashSet;
  }
  
  @NotNull
  public static String b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/na.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: sipush #6839
    //   9: ldc2_w 7798543602852448481
    //   12: lload_0
    //   13: lxor
    //   14: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   19: areturn
  }
  
  @NotNull
  public static BlockFace b(@NotNull Block paramBlock1, Block paramBlock2) {
    for (BlockFace blockFace : v) {
      try {
        if (paramBlock1.getRelative(blockFace).equals(paramBlock2))
          return blockFace; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return BlockFace.SELF;
  }
  
  public static boolean t(@NotNull Location paramLocation) {
    db db1 = db.b(paramLocation);
    try {
      if (!da.r(db1.b()))
        try {
          if (db1.b().isSolid())
            try {
              if (!da.d(db1.b()))
                return true; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    db db2 = db1.b(BlockFace.DOWN);
    try {
      if (!da.r(db2.b()))
        try {
          if (!da.d(db2.b()))
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      db db3 = db1.b(blockFace);
      db db4 = db3.b(BlockFace.DOWN);
      try {
        if (!da.r(db3.b()))
          try {
            if (db3.b().isSolid())
              try {
                if (!da.d(db3.b()))
                  return true; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              }  
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (!da.r(db4.b()))
          try {
            if (!da.d(db4.b()))
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean h(@NotNull Player paramPlayer) {
    Location location = paramPlayer.getLocation();
    Block block1 = location.getBlock();
    Block block2 = block1.getRelative(BlockFace.DOWN);
    try {
      if (j(b(block2)))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Block block3 = block2.getRelative(BlockFace.DOWN);
    try {
      if (j(b(block3)))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (j(b(block2.getRelative(blockFace))))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (j(b(block3.getRelative(blockFace))))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean j(Material paramMaterial) {
    try {
      if (paramMaterial == Material.ICE)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramMaterial == Material.PACKED_ICE)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 12)
        try {
          if (paramMaterial == Material.FROSTED_ICE)
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 13) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return (paramMaterial == Material.BLUE_ICE);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static Stream b(@NotNull Location paramLocation) {
    World world = paramLocation.getWorld();
    Objects.requireNonNull(world);
    Stream.Builder<?> builder = Stream.builder();
    for (int i = paramLocation.getBlockX() - 3; i <= paramLocation.getBlockX() + 4; i++) {
      for (int j = paramLocation.getBlockZ() - 3; j <= paramLocation.getBlockZ() + 4; j++) {
        for (int k = paramLocation.getBlockY() - 2; k <= paramLocation.getBlockY() + 1; k++) {
          Block block = b(world, i, k, j);
          builder.accept(block);
        } 
      } 
    } 
    return builder.build();
  }
  
  public static int b(@NotNull Block paramBlock) {
    byte b = 0;
    for (BlockFace blockFace : v) {
      try {
        if (!da.r(paramBlock.getRelative(blockFace).getType()))
          b++; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return b;
  }
  
  public static boolean b(EntityType paramEntityType) {
    try {
      if (paramEntityType == EntityType.BOAT)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 19)
        try {
          if (paramEntityType == EntityType.CHEST_BOAT);
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean m(@NotNull Player paramPlayer) {
    Location location = paramPlayer.getLocation();
    try {
      if (da.p(location.getBlock()))
        return da.p(location.getBlock().getRelative(BlockFace.UP)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    long l = a ^ 0x6C497A3647DBL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[2];
    boolean bool = false;
    String str;
    int i = (str = "ÜÐdô´mV\"qQ½\n#]Y'`MU\003*\031@Û?H«äX\035Õ\022É²\035y¥3kUÂt\fÏhÏ·®:ÄTX\034 ÿvTW£>-O\013?ê%\033^G\002»\bR{ïtÙö\016\tPãª\f\032­?³jR¦\037\017-e$\033ºVÀ»pÉ'asH").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
    throw a(-1);
  }
  
  public static boolean p(char paramChar, @Nullable Player paramPlayer, int paramInt1, int paramInt2) {
    long l1 = (paramChar << 48L | paramInt1 << 32L >>> 16L | paramInt2 << 48L >>> 48L) ^ a;
    long l2 = l1 ^ 0x45C2270B01EFL;
    try {
      if (paramPlayer == null)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Block block1 = paramPlayer.getLocation().getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    for (BlockFace blockFace : v) {
      try {
        if (!da.p(block1.getRelative(blockFace)))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (!da.p(block2.getRelative(blockFace)))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return b(paramPlayer, l2);
  }
  
  public static boolean j(@NotNull Player paramPlayer) {
    Block block = paramPlayer.getLocation().getBlock();
    try {
      if (da.h(b(block)))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (da.h(b(block.getRelative(BlockFace.DOWN))))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (da.h(b(block.getRelative(blockFace))))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public static boolean b(@NotNull Player paramPlayer, long paramLong) {
    paramLong = a ^ paramLong;
    long l1 = paramLong ^ 0x3210508F6F52L;
    long l2 = paramLong ^ 0x1A9CED60C078L;
    db db1 = db.b(paramPlayer.getEyeLocation());
    db db2 = db1.b(BlockFace.UP);
    try {
      if (!da.r(db1.b()))
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!da.r(db2.b()))
        try {
          if (da.r(db1.b()))
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      try {
        if (!da.r(db2.b(blockFace).b()))
          try {
            if (da.r(db1.b(blockFace).b()))
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      if (!da.r(db1.b(blockFace).b())) {
        double d = fa.p(fa.b(db1.b(blockFace).b(l2), l1, ya.b));
        try {
          if (d > 0.0D)
            try {
              if (d < 1.0D)
                return true; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            }  
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } 
    return false;
  }
  
  public static Material[] b() {
    return new Material[] { Material.TWISTING_VINES_PLANT, Material.WEEPING_VINES_PLANT, Material.TWISTING_VINES, Material.WEEPING_VINES };
  }
  
  @NotNull
  public static Material j(@NotNull World paramWorld, int paramInt1, int paramInt2, int paramInt3) {
    return b(paramWorld, paramInt1, paramInt2, paramInt3);
  }
  
  public static boolean h(@NotNull Location paramLocation) {
    World world = paramLocation.getWorld();
    Objects.requireNonNull(world);
    for (int i = paramLocation.getBlockX() - 3; i <= paramLocation.getBlockX() + 4; i++) {
      for (int j = paramLocation.getBlockZ() - 3; j <= paramLocation.getBlockZ() + 4; j++) {
        for (int k = paramLocation.getBlockY() - 3; k <= paramLocation.getBlockY() + 1; k++) {
          Block block = world.getBlockAt(i, k, j);
          try {
            if (da.b(b(block)))
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          } 
        } 
      } 
    } 
    return false;
  }
  
  public static boolean m(long paramLong, @NotNull Location paramLocation) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0x370AB33A06A1L;
    Block block1 = paramLocation.getBlock();
    Block block2 = block1.getRelative(BlockFace.UP);
    try {
      if (!fa.b(l, block1)) {
        try {
          if (fa.b(l, block2));
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public static boolean p(@NotNull Location paramLocation) {
    yf yf = Matrix.b().b();
    return b(paramLocation).anyMatch(yf::b);
  }
  
  public static Optional b(char paramChar1, @NotNull Location paramLocation, int paramInt, char paramChar2) {
    long l1 = (paramChar1 << 48L | paramInt << 32L >>> 16L | paramChar2 << 48L >>> 48L) ^ a;
    long l2 = l1 ^ 0x64FAB15948E3L;
    for (Block block : b(paramLocation).collect(Collectors.toSet())) {
      try {
        if (fa.b(block, l2, paramLocation))
          return Optional.of(block); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return Optional.empty();
  }
  
  public static boolean j(@NotNull Location paramLocation) {
    yf yf = Matrix.b().b();
    for (Block block : b(paramLocation).filter(yf::b).collect(Collectors.toSet())) {
      try {
        if (b(block, paramLocation.toVector()))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  @NotNull
  public static Material b(@NotNull World paramWorld, int paramInt1, int paramInt2, int paramInt3) {
    return paramWorld.getBlockAt(paramInt1, paramInt2, paramInt3).getType();
  }
  
  public static boolean b(@NotNull Location paramLocation) {
    db db1 = db.b(paramLocation);
    try {
      if (!da.r(db1.b()))
        try {
          if (!da.d(db1.b()))
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    db db2 = db1.b(BlockFace.DOWN);
    try {
      if (!da.r(db2.b()))
        try {
          if (!da.d(db2.b()))
            return true; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    for (BlockFace blockFace : v) {
      db db3 = db1.b(blockFace);
      db db4 = db3.b(BlockFace.DOWN);
      try {
        if (!da.r(db3.b()))
          try {
            if (!da.d(db3.b()))
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (!da.r(db4.b()))
          try {
            if (!da.d(db4.b()))
              return true; 
          } catch (IllegalStateException illegalStateException) {
            throw a(null);
          }  
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
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
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1ECD;
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
        throw new RuntimeException("me/rerere/matrix/internal/na", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/na'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\na.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
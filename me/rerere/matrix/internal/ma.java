package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public final class ma {
  @NotNull
  public static final ma i;
  
  private static final long a = o3.a(-2917048584614663258L, 2061149530777610651L, MethodHandles.lookup().lookupClass()).a(234697890692674L);
  
  @NotNull
  public static final ka b(@NotNull Location paramLocation1, @NotNull Location paramLocation2, @NotNull Player paramPlayer, @NotNull yl paramyl, long paramLong) {
    paramLong = a ^ paramLong;
    long l1 = paramLong ^ 0x646B18DA0BEEL;
    long l2 = paramLong ^ 0x39A7B8BA6B3EL;
    long l3 = paramLong ^ 0x728F2851C714L;
    int i = (int)((paramLong ^ 0x32DDB99797C1L) >>> 32L);
    int j = (int)((paramLong ^ 0x32DDB99797C1L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x32DDB99797C1L) << 48L >>> 48L);
    paramLong ^ 0x32DDB99797C1L;
    long l4 = paramLong ^ 0x1FFFC297ABCDL;
    long l5 = paramLong ^ 0x2F65E8442397L;
    Intrinsics.checkNotNull(paramLocation1.getWorld());
    aa aa = ja.b(l4, paramPlayer, paramLocation1.getWorld(), paramLocation1, paramLocation2);
    Material[] arrayOfMaterial = new Material[1];
    arrayOfMaterial[0] = Material.SLIME_BLOCK;
    boolean bool1 = aa.b(l3, arrayOfMaterial);
    boolean bool2 = aa.b(da.w, l1);
    boolean bool3 = (paramyl.b()).f.b(paramLocation1, l2);
    (paramyl.b()).f.b(i, (char)j, k);
    return new ka(l5, bool3, bool1, bool2, aa);
  }
  
  static {
    i = new ma();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ma.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.api;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.internal.ge;
import me.rerere.matrix.internal.gl;
import me.rerere.matrix.internal.ia;
import me.rerere.matrix.internal.mn;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.internal.pc;
import me.rerere.matrix.internal.qd;
import me.rerere.matrix.internal.wa;
import me.rerere.matrix.internal.yk;
import me.rerere.matrix.internal.yl;
import me.rerere.matrix.internal.zc;
import me.rerere.matrix.internal.zg;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class MatrixAPIBack implements MatrixAPI {
  private static final long a = o3.a(-2292551112562158581L, -8348864618095685247L, MethodHandles.lookup().lookupClass()).a(181859552417798L);
  
  public void markAsBedrockPlayer(@NotNull Player paramPlayer) {
    long l1 = a ^ 0x7874C27D81C2L;
    long l2 = l1 ^ 0x3B1BCF0E74AL;
    Matrix.b().b().b(paramPlayer.getUniqueId()).m(l2);
  }
  
  public void setViolations(@NotNull Player paramPlayer, @NotNull HackType paramHackType, int paramInt) {
    mn mn = Matrix.b().b();
    qd qd = mn.b(paramPlayer.getUniqueId()).b();
    zg zg = (zg)qd.j().get(getCheckTypeByHackType(paramHackType));
    zg.j(paramInt);
  }
  
  public void registerClientBlock(@NotNull Block paramBlock) {
    Matrix.b().b().b(paramBlock.getWorld(), paramBlock.getX(), paramBlock.getY(), paramBlock.getZ());
  }
  
  public void flag(@Nullable Player paramPlayer, @NotNull HackType paramHackType, @Nullable String paramString1, @Nullable String paramString2, int paramInt) {
    long l1 = a ^ 0x717E399E8CC7L;
    int i = (int)((l1 ^ 0x70AED8EBB9FCL) >>> 32L);
    int j = (int)((l1 ^ 0x70AED8EBB9FCL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x70AED8EBB9FCL) << 48L >>> 48L);
    l1 ^ 0x70AED8EBB9FCL;
    long l2 = l1 ^ 0x2E6F1A3D7DF2L;
    long l3 = l1 ^ 0x3D0E7B108D41L;
    int m = (int)((l1 ^ 0x1DAD778DF65FL) >>> 32L);
    int n = (int)((l1 ^ 0x1DAD778DF65FL) << 32L >>> 56L);
    int i1 = (int)((l1 ^ 0x1DAD778DF65FL) << 40L >>> 40L);
    l1 ^ 0x1DAD778DF65FL;
    try {
      if (paramPlayer == null)
        throw new IllegalArgumentException("null player"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramString1 == null)
        throw new IllegalArgumentException("null message"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramString2 == null)
        throw new IllegalArgumentException("null component"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramInt < 0)
        throw new IllegalArgumentException("Negative VL"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Bukkit.isPrimaryThread())
        throw new IllegalStateException("You cannot call this method asynchronously!"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    mn mn = Matrix.b().b();
    yl yl = mn.b(paramPlayer.getUniqueId());
    try {
      if (yl == null)
        throw new IllegalArgumentException("No statistics found for this player"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    qd qd = yl.b();
    String str1 = paramPlayer.getName();
    yk yk = getCheckTypeByHackType(paramHackType);
    String str2 = yk.j();
    int i2 = wa.b(l3, paramPlayer);
    double d = zc.b(ia.j(), 2);
    int i3 = (int)yl.x;
    int i4 = qd.b(l2, yk) + paramInt;
    String str3 = gl.x.replace("%player%", str1).replace("%check%", str2).replace("%message%", paramString1).replace("%add_vl%", String.valueOf(paramInt)).replace("%vl%", String.valueOf(i4)).replace("%ping%", String.valueOf(i2)).replace("%tps%", String.valueOf(d)).replace("%component%", paramString2).replace("%version%", yl.b().b()).replace("%lp%", String.valueOf(i3));
    try {
      if (Matrix.j())
        Matrix.b(str3); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    for (yl yl1 : mn.b().values()) {
      try {
        if (yl1.b()) {
          try {
            if (yl1.j() != null) {
              try {
                if (yl1.j() != null)
                  try {
                    if (paramPlayer.getUniqueId().equals(yl1.j()))
                      continue; 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  }  
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      continue;
      SYNTHETIC_LOCAL_VARIABLE_31.j(m, (byte)n, i1).sendMessage(gl.r + str3);
    } 
    try {
      if (ge.s)
        Matrix.b().b().b(() -> {
              long l = a ^ 0x582A210EF2EDL;
              int i = (int)((l ^ 0x6465E9F13E61L) >>> 32L);
              int j = (int)((l ^ 0x6465E9F13E61L) << 32L >>> 48L);
              int k = (int)((l ^ 0x6465E9F13E61L) << 48L >>> 48L);
              l ^ 0x6465E9F13E61L;
              Matrix.b().b().b(paramString, i, (short)j, k);
            }); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    qd.b(yl, i, yk, paramInt, paramString2, paramString1, j, (char)k);
  }
  
  public void setVerbose(@NotNull Player paramPlayer1, boolean paramBoolean, @Nullable Player paramPlayer2) {
    try {
      Matrix.b().b().b(paramPlayer1.getUniqueId()).b(paramBoolean);
      if (paramBoolean)
        try {
          if (paramPlayer2 != null) {
            Matrix.b().b().b(paramPlayer1.getUniqueId()).b(paramPlayer2.getUniqueId());
            return;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Matrix.b().b().b(paramPlayer1.getUniqueId()).b(null);
  }
  
  public boolean isEnable(@NotNull HackType paramHackType) {
    long l1 = a ^ 0x49BA854524A9L;
    long l2 = l1 ^ 0x68742641C63CL;
    return getCheckTypeByHackType(paramHackType).b(l2);
  }
  
  public double getTPS() {
    return ia.j();
  }
  
  public boolean hasVerbose(@NotNull Player paramPlayer) {
    return Matrix.b().b().b(paramPlayer.getUniqueId()).b();
  }
  
  public void tempBypass(@NotNull Player paramPlayer, @NotNull HackType paramHackType, Long paramLong) {
    long l = a ^ 0x10769A0CA0C5L;
    try {
      Objects.requireNonNull(paramPlayer, "null player!");
      if (paramLong.longValue() <= 0L)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    mn mn = Matrix.b().b();
    yl yl = mn.b(paramPlayer.getUniqueId());
    try {
      if (yl == null)
        throw new IllegalArgumentException("No statistics found for this player"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    yl.b(getCheckTypeByHackType(paramHackType), pc.j() + paramLong.longValue());
  }
  
  public boolean isBypass(@NotNull Player paramPlayer) {
    long l = a ^ 0x534ABBAE68CCL;
    int i = (int)((l ^ 0x2085BD478519L) >>> 32L);
    int j = (int)((l ^ 0x2085BD478519L) << 32L >>> 48L);
    int k = (int)((l ^ 0x2085BD478519L) << 48L >>> 48L);
    l ^ 0x2085BD478519L;
    mn mn = Matrix.b().b();
    yl yl = mn.b(paramPlayer.getUniqueId());
    try {
      if (yl != null)
        return yl.t(i, (short)j, k); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public void reloadPermissionCache(@NotNull Player paramPlayer) {
    Matrix.b().b().b(paramPlayer);
  }
  
  public void setEnable(@NotNull HackType paramHackType, boolean paramBoolean) {
    getCheckTypeByHackType(paramHackType).b(paramBoolean);
  }
  
  public int getLatency(Player paramPlayer) {
    long l1 = a ^ 0x6D516318D373L;
    long l2 = l1 ^ 0x21212196D2F5L;
    return wa.b(l2, paramPlayer);
  }
  
  public boolean isBypass(@NotNull Player paramPlayer, @NotNull HackType paramHackType) {
    long l1 = a ^ 0x3713F347D7D3L;
    long l2 = l1 ^ 0x5C5A00D396BEL;
    mn mn = Matrix.b().b();
    yl yl = mn.b(paramPlayer.getUniqueId());
    try {
      if (yl != null)
        try {
          if (yl.b(l2, getCheckTypeByHackType(paramHackType)));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public void setVerbose(@NotNull Player paramPlayer, boolean paramBoolean) {
    try {
      Matrix.b().b().b(paramPlayer.getUniqueId()).b(paramBoolean);
      if (!paramBoolean)
        Matrix.b().b().b(paramPlayer.getUniqueId()).b(null); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public int getViolations(@NotNull Player paramPlayer, @NotNull HackType paramHackType) {
    long l1 = a ^ 0x4AFD088ABD60L;
    long l2 = l1 ^ 0x15EC2B294C55L;
    mn mn = Matrix.b().b();
    try {
      if (mn == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    yl yl = mn.b(paramPlayer.getUniqueId());
    try {
      if (yl == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    qd qd = yl.b();
    try {
      if (qd == null)
        return 0; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return qd.b(l2, getCheckTypeByHackType(paramHackType));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\api\MatrixAPIBack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
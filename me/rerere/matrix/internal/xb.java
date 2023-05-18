package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;

public final class xb {
  public static final long b() {
    return System.currentTimeMillis();
  }
  
  public static final long b(long paramLong) {
    return b() - paramLong;
  }
  
  public static final void b(@NotNull String paramString) {
    Bukkit.broadcastMessage(paramString);
  }
  
  public static final long b(long paramLong1, long paramLong2) {
    return paramLong1 - paramLong2;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
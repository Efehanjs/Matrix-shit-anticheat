package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.geysermc.connector.GeyserConnector;

public final class p {
  @NotNull
  public static final p i;
  
  private static final long a = o3.a(-6195117787049971177L, 6495217970512121393L, MethodHandles.lookup().lookupClass()).a(276653678552128L);
  
  public static final boolean b(@NotNull Player paramPlayer, char paramChar, short paramShort, int paramInt) {
    long l = (paramChar << 48L | paramShort << 48L >>> 16L | paramInt << 32L >>> 32L) ^ a;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (GeyserConnector.getInstance().getPlayerByUuid(paramPlayer.getUniqueId()) != null);
  }
  
  static {
    i = new p();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\p.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
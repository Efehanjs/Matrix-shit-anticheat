package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public final class ol extends Lambda implements Function1 {
  public static final ol i;
  
  private static final long a = o3.a(-3201277785813997834L, -7449112840582697271L, MethodHandles.lookup().lookupClass()).a(87924080725186L);
  
  static {
    i = new ol();
  }
  
  @NotNull
  public final Boolean b(@NotNull Pair paramPair, long paramLong) {
    paramLong = a ^ paramLong;
    Player player = (Player)paramPair.component1();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Boolean.valueOf((player != null));
  }
  
  public ol() {
    super(1);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
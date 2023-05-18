package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.ia;
import me.rerere.matrix.internal.o3;
import org.bukkit.entity.Player;

public class PlaceholderTPS extends AbstractStandardPlaceholder {
  private static final long a = o3.a(-3334756460381817726L, 1516140292147798741L, MethodHandles.lookup().lookupClass()).a(160328149205707L);
  
  public double getStat(Player paramPlayer) {
    return ia.j();
  }
  
  public PlaceholderTPS() {
    super("tps");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderTPS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
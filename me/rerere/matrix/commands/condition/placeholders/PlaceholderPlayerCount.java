package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlaceholderPlayerCount extends AbstractStandardPlaceholder {
  private static final long a = o3.a(-1713614987370824477L, 2596700351351715340L, MethodHandles.lookup().lookupClass()).a(267394048403998L);
  
  public double getStat(Player paramPlayer) {
    return Bukkit.getOnlinePlayers().size();
  }
  
  public PlaceholderPlayerCount() {
    super("player_count");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderPlayerCount.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
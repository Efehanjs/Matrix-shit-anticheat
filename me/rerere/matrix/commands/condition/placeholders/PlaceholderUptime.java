package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class PlaceholderUptime extends AbstractStandardPlaceholder {
  private long startupTimeMS;
  
  private static final long a = o3.a(-2182813821599166799L, 6488871748125992652L, MethodHandles.lookup().lookupClass()).a(13248172383632L);
  
  public PlaceholderUptime() {
    super("uptime");
  }
  
  public void init(Plugin paramPlugin) {
    this.startupTimeMS = System.currentTimeMillis();
  }
  
  public double getStat(Player paramPlayer) {
    return ((System.currentTimeMillis() - this.startupTimeMS) / 50L);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderUptime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
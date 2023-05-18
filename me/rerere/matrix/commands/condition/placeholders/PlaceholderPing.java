package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.internal.wa;
import org.bukkit.entity.Player;

public class PlaceholderPing extends AbstractStandardPlaceholder {
  private static final long a = o3.a(-7660949626721333024L, -5066069353476710270L, MethodHandles.lookup().lookupClass()).a(54555242325067L);
  
  public double getStat(Player paramPlayer) {
    long l1 = a ^ 0x63328E471065L;
    long l2 = l1 ^ 0x29BD030C3B27L;
    return wa.b(l2, paramPlayer);
  }
  
  public PlaceholderPing() {
    super("ping");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderPing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
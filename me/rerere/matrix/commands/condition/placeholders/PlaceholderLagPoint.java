package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public class PlaceholderLagPoint extends AbstractStandardPlaceholder {
  private static final long a = o3.a(-5221209043104850956L, 3468721929665857216L, MethodHandles.lookup().lookupClass()).a(169768543089444L);
  
  public double getStat(@NotNull Player paramPlayer) {
    return (Matrix.b().b().b(paramPlayer.getUniqueId())).x;
  }
  
  public PlaceholderLagPoint() {
    super("lp");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderLagPoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
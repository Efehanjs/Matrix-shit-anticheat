package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadLocalRandom;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public class PlaceholderChance extends AbstractParameteredPlaceholder {
  private static final long b = o3.a(8980463283246874897L, 1484685947305535005L, MethodHandles.lookup().lookupClass()).a(77655560051393L);
  
  @NotNull
  public String getSub(Player paramPlayer, @NotNull String paramString) {
    double d;
    long l = b ^ 0x2BCF24266F6CL;
    try {
      if (!paramString.endsWith("%"))
        throw new RuntimeException("Invalid chance parameter format, expecting <num>%"); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      d = Double.parseDouble(paramString.substring(0, paramString.length() - 1));
    } catch (NumberFormatException numberFormatException) {
      throw new RuntimeException("Invalid number format: " + paramString, numberFormatException);
    } 
    try {
      if (d <= 100.0D)
        try {
          if (d >= 0.0D) {
            double d1 = ThreadLocalRandom.current().nextDouble() * 100.0D;
            try {
              if (d1 < d)
                return "1.0"; 
            } catch (NumberFormatException numberFormatException) {
              throw a(null);
            } 
            return "0.0";
          } 
          throw new RuntimeException("Expecting percentage between 0 and 100");
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    throw new RuntimeException("Expecting percentage between 0 and 100");
  }
  
  public PlaceholderChance() {
    super("chance");
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderChance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
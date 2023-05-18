package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public class PlaceholderPerm extends AbstractParameteredPlaceholder {
  private static final Pattern PERM_PATTERN;
  
  private static final long b = o3.a(2971725127721437342L, -6652130025546490701L, MethodHandles.lookup().lookupClass()).a(257157184292023L);
  
  @NotNull
  public String getSub(@NotNull Player paramPlayer, @NotNull String paramString) {
    long l = b ^ 0x5014FB3855F6L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramPlayer.hasPermission(paramString) ? "1.0" : "0.0";
  }
  
  public PlaceholderPerm() {
    super("perm");
  }
  
  static {
    long l = b ^ 0x7632E201E13L;
    PERM_PATTERN = Pattern.compile("-perm:([A-Za-z0-9.]*)-");
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderPerm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.api.MatrixAPIProvider;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.internal.yk;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public class PlaceholderMatrixVL extends AbstractParameteredPlaceholder {
  private static final long b = o3.a(2971066225624034954L, -7802252114761108317L, MethodHandles.lookup().lookupClass()).a(183485760478416L);
  
  public PlaceholderMatrixVL() {
    super("vl");
  }
  
  @NotNull
  public String getSub(Player paramPlayer, @NotNull String paramString) {
    long l = b ^ 0x10FF99E33412L;
    int i = (int)((l ^ 0x53D7233F2D71L) >>> 48L);
    int j = (int)((l ^ 0x53D7233F2D71L) << 16L >>> 32L);
    int k = (int)((l ^ 0x53D7233F2D71L) << 48L >>> 48L);
    l ^ 0x53D7233F2D71L;
    int m = (int)((l ^ 0x644CF1B438BEL) >>> 32L);
    int n = (int)((l ^ 0x644CF1B438BEL) << 32L >>> 32L);
    l ^ 0x644CF1B438BEL;
    yk yk = yk.b((char)i, paramString.toLowerCase(), j, (char)k);
    try {
      if (yk == null) {
        System.out.println("[Matrix/ConditionalCommands] Unknown CheckType: " + paramString);
        return Integer.toString(0);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Integer.toString(MatrixAPIProvider.getAPI().getViolations(paramPlayer, yk.b(m, n)));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderMatrixVL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
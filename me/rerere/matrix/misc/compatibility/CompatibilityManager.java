package me.rerere.matrix.misc.compatibility;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.misc.compatibility.modules.crazyenchantments.CrazyEnchantmentsHooker;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class CompatibilityManager {
  private static final long a = o3.a(587342524143511953L, 913661045675109374L, MethodHandles.lookup().lookupClass()).a(17680666831294L);
  
  public void load() {
    long l = a ^ 0xE3818BA37C3L;
    PluginManager pluginManager = Bukkit.getPluginManager();
    try {
      if (pluginManager.getPlugin("CrazyEnchantments") != null)
        try {
          if (((Plugin)Objects.<Plugin>requireNonNull(pluginManager.getPlugin("CrazyEnchantments"))).isEnabled()) {
            Bukkit.getPluginManager().registerEvents((Listener)new CrazyEnchantmentsHooker(), (Plugin)Matrix.b());
            Matrix.b("(Compatibility) Hooked with CrazyEnchantments");
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\misc\compatibility\CompatibilityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
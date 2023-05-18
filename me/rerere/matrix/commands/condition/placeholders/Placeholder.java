package me.rerere.matrix.commands.condition.placeholders;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public interface Placeholder {
  void init(Plugin paramPlugin);
  
  @NotNull
  String doSubstitution(String paramString, Player paramPlayer);
  
  boolean shouldApply(String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\Placeholder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
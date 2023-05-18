package me.rerere.matrix.commands.condition.placeholders;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public abstract class AbstractStandardPlaceholder implements Placeholder {
  private final String matcher;
  
  public void init(Plugin paramPlugin) {}
  
  public abstract double getStat(Player paramPlayer);
  
  public AbstractStandardPlaceholder(String paramString) {
    this.matcher = '-' + paramString + '-';
  }
  
  public final boolean shouldApply(@NotNull String paramString) {
    return paramString.contains(this.matcher);
  }
  
  @NotNull
  public final String doSubstitution(@NotNull String paramString, Player paramPlayer) {
    return paramString.replaceAll(this.matcher, Double.toString(getStat(paramPlayer)));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\AbstractStandardPlaceholder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
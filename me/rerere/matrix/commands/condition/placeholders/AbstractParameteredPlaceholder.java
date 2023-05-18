package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public abstract class AbstractParameteredPlaceholder implements Placeholder {
  @NotNull
  private final Pattern pattern;
  
  private static final long a = o3.a(-5466419313016685016L, -7768360134142944639L, MethodHandles.lookup().lookupClass()).a(276245228651362L);
  
  public AbstractParameteredPlaceholder(String paramString) {
    this.pattern = Pattern.compile("-" + paramString + ":([A-Za-z0-9%.]*)-");
  }
  
  @NotNull
  public String doSubstitution(@NotNull String paramString, Player paramPlayer) {
    Matcher matcher = this.pattern.matcher(paramString);
    while (matcher.find())
      paramString = paramString.replaceAll(Pattern.quote(matcher.group()), getSub(paramPlayer, matcher.group(1))); 
    return paramString;
  }
  
  public boolean shouldApply(@NotNull String paramString) {
    return this.pattern.matcher(paramString).find();
  }
  
  public void init(Plugin paramPlugin) {}
  
  @NotNull
  public abstract String getSub(Player paramPlayer, String paramString);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\AbstractParameteredPlaceholder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
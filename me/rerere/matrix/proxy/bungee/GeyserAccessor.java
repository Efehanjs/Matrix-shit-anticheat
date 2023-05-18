package me.rerere.matrix.proxy.bungee;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import org.geysermc.connector.GeyserConnector;

public final class GeyserAccessor {
  @NotNull
  public static final GeyserAccessor INSTANCE = new GeyserAccessor();
  
  public static final boolean isBedrockPlayer(@NotNull ProxiedPlayer paramProxiedPlayer) {
    return (GeyserConnector.getInstance().getPlayerByUuid(paramProxiedPlayer.getUniqueId()) != null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\proxy\bungee\GeyserAccessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
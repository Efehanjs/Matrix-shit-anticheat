package me.rerere.matrix.proxy.velocity;

import com.velocitypowered.api.proxy.Player;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.geysermc.connector.GeyserConnector;

public final class GeyserAccessor {
  @NotNull
  public static final GeyserAccessor INSTANCE = new GeyserAccessor();
  
  public static final boolean isBedrockPlayer(@NotNull Player paramPlayer) {
    return (GeyserConnector.getInstance().getPlayerByUuid(paramPlayer.getUniqueId()) != null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\proxy\velocity\GeyserAccessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
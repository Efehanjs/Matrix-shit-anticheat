package me.rerere.matrix.api.events;

import java.util.UUID;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Deprecated
public class MatrixKillAuraNPCSpawnEvent extends Event {
  private final int botId;
  
  private final String botName;
  
  private final Player observer;
  
  private final UUID botUuid;
  
  private static final HandlerList handlers = new HandlerList();
  
  public int getBotId() {
    return this.botId;
  }
  
  @NotNull
  public HandlerList getHandlers() {
    return handlers;
  }
  
  public String getBotName() {
    return this.botName;
  }
  
  public UUID getBotUuid() {
    return this.botUuid;
  }
  
  @NotNull
  public static HandlerList getHandlerList() {
    return handlers;
  }
  
  public Player getObserver() {
    return this.observer;
  }
  
  public MatrixKillAuraNPCSpawnEvent(Player paramPlayer, int paramInt, UUID paramUUID, String paramString) {
    super(!Bukkit.isPrimaryThread());
    this.observer = paramPlayer;
    this.botId = paramInt;
    this.botUuid = paramUUID;
    this.botName = paramString;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\api\events\MatrixKillAuraNPCSpawnEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
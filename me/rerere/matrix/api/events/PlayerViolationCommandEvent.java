package me.rerere.matrix.api.events;

import me.rerere.matrix.api.HackType;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerViolationCommandEvent extends Event implements Cancellable {
  private final String command;
  
  private final Player player;
  
  private static final HandlerList handlers = new HandlerList();
  
  private final HackType hackType;
  
  private boolean cancel = false;
  
  @NotNull
  public static HandlerList getHandlerList() {
    return handlers;
  }
  
  public boolean isCancelled() {
    return this.cancel;
  }
  
  public Player getPlayer() {
    return this.player;
  }
  
  @NotNull
  public HandlerList getHandlers() {
    return handlers;
  }
  
  public HackType getHackType() {
    return this.hackType;
  }
  
  public void setCancelled(boolean paramBoolean) {
    this.cancel = paramBoolean;
  }
  
  public PlayerViolationCommandEvent(Player paramPlayer, HackType paramHackType, String paramString) {
    super(!Bukkit.isPrimaryThread());
    this.player = paramPlayer;
    this.hackType = paramHackType;
    this.command = paramString;
  }
  
  public String getCommand() {
    return this.command;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\api\events\PlayerViolationCommandEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
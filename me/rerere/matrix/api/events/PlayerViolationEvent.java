package me.rerere.matrix.api.events;

import me.rerere.matrix.api.HackType;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerViolationEvent extends Event implements Cancellable {
  private boolean cancel = false;
  
  private int violations;
  
  private final Player player;
  
  private final HackType hackType;
  
  private final String component;
  
  private static final HandlerList handlers = new HandlerList();
  
  private final String message;
  
  public boolean isCancelled() {
    return this.cancel;
  }
  
  public String getComponent() {
    return this.component;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  @NotNull
  public HandlerList getHandlers() {
    return handlers;
  }
  
  public Player getPlayer() {
    return this.player;
  }
  
  public HackType getHackType() {
    return this.hackType;
  }
  
  public PlayerViolationEvent(Player paramPlayer, String paramString1, HackType paramHackType, String paramString2, int paramInt) {
    super(!Bukkit.isPrimaryThread());
    this.player = paramPlayer;
    this.hackType = paramHackType;
    this.component = paramString1;
    this.message = paramString2;
    this.violations = paramInt;
  }
  
  @NotNull
  public static HandlerList getHandlerList() {
    return handlers;
  }
  
  public void setViolations(int paramInt) {
    this.violations = paramInt;
  }
  
  public int getViolations() {
    return this.violations;
  }
  
  public void setCancelled(boolean paramBoolean) {
    this.cancel = paramBoolean;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\api\events\PlayerViolationEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
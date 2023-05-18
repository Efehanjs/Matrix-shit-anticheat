package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;

public interface n {
  default void b(@NotNull PlayerRespawnEvent paramPlayerRespawnEvent) {}
  
  default void b(@NotNull PlayerAnimationEvent paramPlayerAnimationEvent) {}
  
  default void b(@NotNull VehicleExitEvent paramVehicleExitEvent) {}
  
  default void j() {}
  
  default void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {}
  
  default void p(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {}
  
  default void b(boolean paramBoolean) {}
  
  default void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {}
  
  default void j(char paramChar, short paramShort, @NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, int paramInt) {}
  
  default void b(char paramChar, int paramInt, @NotNull PlayerInteractEvent paramPlayerInteractEvent, short paramShort) {}
  
  default void b(@NotNull PlayerChangedWorldEvent paramPlayerChangedWorldEvent, long paramLong) {}
  
  default void b(long paramLong, @NotNull AsyncPlayerChatEvent paramAsyncPlayerChatEvent) {}
  
  default void b(@NotNull PlayerToggleFlightEvent paramPlayerToggleFlightEvent) {}
  
  default void j(@NotNull PlayerFishEvent paramPlayerFishEvent) {}
  
  default void b(@NotNull InventoryClickEvent paramInventoryClickEvent, long paramLong) {}
  
  default void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {}
  
  default void b(@NotNull PlayerVelocityEvent paramPlayerVelocityEvent) {}
  
  default void b(long paramLong, @NotNull EntityRegainHealthEvent paramEntityRegainHealthEvent) {}
  
  default void b(@NotNull PlayerBedEnterEvent paramPlayerBedEnterEvent) {}
  
  default void b(long paramLong, @NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {}
  
  default void b(char paramChar, long paramLong, @NotNull EntityShootBowEvent paramEntityShootBowEvent) {}
  
  default void b(@NotNull BlockDamageEvent paramBlockDamageEvent) {}
  
  default void b(@NotNull VehicleEnterEvent paramVehicleEnterEvent, long paramLong) {}
  
  default void b(@NotNull PlayerItemHeldEvent paramPlayerItemHeldEvent) {}
  
  default void b(@NotNull EntityDamageEvent paramEntityDamageEvent) {}
  
  default void b(int paramInt, short paramShort, char paramChar, @NotNull PlayerItemConsumeEvent paramPlayerItemConsumeEvent) {}
  
  default void b(short paramShort, int paramInt1, int paramInt2, @NotNull BlockBreakEvent paramBlockBreakEvent) {}
  
  default void b(@NotNull PlayerDropItemEvent paramPlayerDropItemEvent) {}
  
  default void b(@NotNull PlayerFishEvent paramPlayerFishEvent) {}
  
  default void b(@NotNull PlayerToggleSprintEvent paramPlayerToggleSprintEvent) {}
  
  default void b(int paramInt1, int paramInt2) {}
  
  default void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
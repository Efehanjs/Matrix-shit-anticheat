package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class e implements Listener {
  @NotNull
  private final Map b = bc.b();
  
  private static final int i = 15;
  
  private static final long a = o3.a(9202914467882919919L, -1393294634260873100L, MethodHandles.lookup().lookupClass()).a(149359040413276L);
  
  @EventHandler(priority = EventPriority.LOWEST)
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent) {
    long l = a ^ 0x1F8BC5B53A42L;
    Location location = paramPlayerMoveEvent.getTo();
    Player player = paramPlayerMoveEvent.getPlayer();
    int i = yl.r();
    try {
      if (i != 0)
        if (location == null)
          return;  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Queue<a> queue = (Queue)this.b.get(player.getUniqueId());
    try {
      if (i != 0) {
        if (queue == null) {
          queue = new ArrayDeque();
          this.b.put(player.getUniqueId(), queue);
        } 
        queue.add(new a(b(location), pc.j()));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i != 0)
        try {
          if (queue.size() > 15) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Queue b(UUID paramUUID) {
    long l = a ^ 0x3E2323DEA9E1L;
    int i = yl.r();
    try {
      if (i != 0) {
        try {
          if (this.b.containsKey(paramUUID));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return (Queue)this.b.get(paramUUID);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new ArrayDeque();
  }
  
  public e() {
    Bukkit.getPluginManager().registerEvents(this, (Plugin)Matrix.b());
  }
  
  @NotNull
  public static Location b(@NotNull Location paramLocation) {
    return new Location(paramLocation.getWorld(), paramLocation.getX(), paramLocation.getY(), paramLocation.getZ(), paramLocation.getYaw(), paramLocation.getPitch());
  }
  
  @NotNull
  public Set b() {
    return this.b.keySet();
  }
  
  @EventHandler
  public void b(@NotNull PlayerQuitEvent paramPlayerQuitEvent) {
    this.b.remove(paramPlayerQuitEvent.getPlayer().getUniqueId());
  }
  
  public Queue b(@NotNull Player paramPlayer) {
    long l = a ^ 0x643D0E484AE8L;
    int i = yl.a();
    try {
      if (i == 0) {
        try {
          if (this.b.containsKey(paramPlayer.getUniqueId()));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return (Queue)this.b.get(paramPlayer.getUniqueId());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new ArrayDeque();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
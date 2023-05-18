package me.rerere.matrix.commands.condition.placeholders;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class PlaceholderTimeOnline extends AbstractStandardPlaceholder implements Listener {
  private final Map loginTime = new HashMap<>();
  
  private static final long a = o3.a(-751865874965245579L, 8482540169373054377L, MethodHandles.lookup().lookupClass()).a(217129749051357L);
  
  @EventHandler
  public void onPlayerKick(@NotNull PlayerKickEvent paramPlayerKickEvent) {
    this.loginTime.remove(paramPlayerKickEvent.getPlayer());
  }
  
  @EventHandler
  public void onPlayerJoin(@NotNull PlayerJoinEvent paramPlayerJoinEvent) {
    this.loginTime.put(paramPlayerJoinEvent.getPlayer(), Long.valueOf(System.currentTimeMillis()));
  }
  
  @NotNull
  public static String c() {
    long l = a ^ 0x1825482D4730L;
    return "Cracked by LuckerCracker";
  }
  
  public double getStat(Player paramPlayer) {
    return (System.currentTimeMillis() - ((Long)this.loginTime.get(paramPlayer)).longValue());
  }
  
  @NotNull
  public static String b() {
    long l = a ^ 0x72FF35E6CBC2L;
    return "Cracked by LuckerCracker";
  }
  
  public void init(@NotNull Plugin paramPlugin) {
    paramPlugin.getServer().getPluginManager().registerEvents(this, paramPlugin);
    for (Player player : paramPlugin.getServer().getOnlinePlayers())
      this.loginTime.put(player, Long.valueOf(System.currentTimeMillis())); 
  }
  
  @EventHandler
  public void onPlayerQuit(@NotNull PlayerQuitEvent paramPlayerQuitEvent) {
    this.loginTime.remove(paramPlayerQuitEvent.getPlayer());
  }
  
  @NotNull
  public static String a() {
    long l = a ^ 0x4C0FBE4EFB58L;
    return "75";
  }
  
  @NotNull
  public static String d() {
    long l = a ^ 0x203A0D3E5E8AL;
    return "true";
  }
  
  public PlaceholderTimeOnline() {
    super("time_online");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\commands\condition\placeholders\PlaceholderTimeOnline.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
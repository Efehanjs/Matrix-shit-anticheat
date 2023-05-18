package me.rerere.matrix.proxy.bungee;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.connection.Server;
import net.md_5.bungee.api.event.PluginMessageEvent;
import net.md_5.bungee.api.event.ServerSwitchEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import org.geysermc.floodgate.api.FloodgateApi;

public class MatrixBungee extends Plugin implements Listener {
  private static boolean FLOODGATE = false;
  
  @EventHandler
  public void onMessageRece(@NotNull PluginMessageEvent paramPluginMessageEvent) {
    if (paramPluginMessageEvent.getTag().equalsIgnoreCase("matrix:geyser") && paramPluginMessageEvent.getSender() instanceof ProxiedPlayer) {
      paramPluginMessageEvent.setCancelled(true);
      getLogger().info("[MatrixBungee] Prevented a illegal channel message (" + ((ProxiedPlayer)paramPluginMessageEvent.getSender()).getName() + ")");
    } 
  }
  
  @EventHandler
  public void onChangeServer(@NotNull ServerSwitchEvent paramServerSwitchEvent) {
    ProxiedPlayer proxiedPlayer = paramServerSwitchEvent.getPlayer();
    Server server = proxiedPlayer.getServer();
    if (!isBedrockPlayer(proxiedPlayer)) {
      getLogger().info("[Debug] " + proxiedPlayer.getName() + " is not a bedrock player! (f:" + FLOODGATE + ")");
      return;
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    try {
      dataOutputStream.writeUTF(proxiedPlayer.getName());
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    getProxy().getScheduler().schedule(this, () -> {
          paramServer.sendData("matrix:geyser", paramByteArrayOutputStream.toByteArray());
          getLogger().info("[GeyserCompatibility] sent data to server " + paramServer.getInfo().getName() + " for " + paramProxiedPlayer.getName());
        }500L, TimeUnit.MILLISECONDS);
  }
  
  public void onEnable() {
    getLogger().info("§5    __  ______  __________  _____  __");
    getLogger().info("§5   /  |/  /   |/_  __/ __ /  _/ |/ /");
    getLogger().info("§5  / /|_/ / /| | / / / /_/ // / |   / ");
    getLogger().info("§5 / /  / / ___ |/ / / _, _// / /   |  ");
    getLogger().info("§5/_/  /_/_/  |_/_/ /_/ |_/___//_/|_|  ");
    getLogger().info("");
    getLogger().info("Detecting the Environment");
    checkGeyser();
    getLogger().info("Registering the listeners");
    getProxy().getPluginManager().registerListener(this, this);
    if (getProxy().getPluginManager().getPlugin("floodgate") != null) {
      FLOODGATE = true;
      getLogger().info("Detected Floodgate");
    } 
    getLogger().info("MatrixBungee Loaded <3");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\proxy\bungee\MatrixBungee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
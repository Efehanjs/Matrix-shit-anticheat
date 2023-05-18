package me.rerere.matrix.proxy.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Dependency;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

@Plugin(id = "matrixbungee", name = "MatrixBungee", version = "1.0.0", description = "Matrix Geyser Support for Velocity Proxy", authors = {"RE"}, dependencies = {@Dependency(id = "geyser")})
public class MatrixVelocity {
  private final ProxyServer server;
  
  public static boolean FLOODGATE = false;
  
  @Inject
  public MatrixVelocity(ProxyServer paramProxyServer) {
    this.server = paramProxyServer;
    System.out.println("    __  ______  __________  _____  __");
    System.out.println("   /  |/  /   |/_  __/ __ /  _/ |/ /");
    System.out.println("  / /|_/ / /| | / / / /_/ // / |   / ");
    System.out.println(" / /  / / ___ |/ / / _, _// / /   |  ");
    System.out.println("/_/  /_/_/  |_/_/ /_/ |_/___//_/|_|  ");
    System.out.println();
    System.out.println("Loaded MatrixVelocity for Geyser Support!");
  }
  
  @Subscribe
  public void onProxyInitialization(ProxyInitializeEvent paramProxyInitializeEvent) {
    this.server.getEventManager().register(this, new EventListener(this, this.server));
    if (this.server.getPluginManager().getPlugin("floodgate").isPresent()) {
      FLOODGATE = true;
      System.out.println("Detected Floodgate");
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\proxy\velocity\MatrixVelocity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.proxy.velocity;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.PluginMessageEvent;
import com.velocitypowered.api.event.player.ServerConnectedEvent;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.MinecraftChannelIdentifier;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.geysermc.floodgate.api.FloodgateApi;

public final class EventListener {
  @NotNull
  private static final ChannelIdentifier identifier;
  
  @NotNull
  public static final EventListener$Companion Companion = new EventListener$Companion(null);
  
  @NotNull
  private final MatrixVelocity plugin;
  
  @NotNull
  private final ProxyServer proxyServer;
  
  @Subscribe
  public final void onPm(@NotNull PluginMessageEvent paramPluginMessageEvent) {
    PluginMessageEvent pluginMessageEvent2 = paramPluginMessageEvent;
    PluginMessageEvent pluginMessageEvent3 = pluginMessageEvent2;
    boolean bool = false;
    PluginMessageEvent pluginMessageEvent1 = StringsKt.equals(pluginMessageEvent3.getIdentifier().getId(), "matrix:geyser", true) ? pluginMessageEvent2 : null;
    if (pluginMessageEvent1 != null) {
      pluginMessageEvent3 = pluginMessageEvent1;
      PluginMessageEvent pluginMessageEvent = pluginMessageEvent3;
      boolean bool1 = false;
      pluginMessageEvent2 = (pluginMessageEvent.getSource() instanceof Player) ? pluginMessageEvent3 : null;
      if (pluginMessageEvent2 != null) {
        pluginMessageEvent = pluginMessageEvent2;
        bool1 = false;
        pluginMessageEvent.setResult(PluginMessageEvent.ForwardResult.handled());
        Intrinsics.checkNotNull(pluginMessageEvent.getSource(), "null cannot be cast to non-null type com.velocitypowered.api.proxy.Player");
        System.out.println("[Matrix] Prevented illegal plugin message from " + ((Player)pluginMessageEvent.getSource()).getUsername());
      } 
    } 
  }
  
  public EventListener(@NotNull MatrixVelocity paramMatrixVelocity, @NotNull ProxyServer paramProxyServer) {
    this.plugin = paramMatrixVelocity;
    this.proxyServer = paramProxyServer;
  }
  
  @Subscribe
  public final void onSwitch(@NotNull ServerConnectedEvent paramServerConnectedEvent) {
    if (!isBedrockPlayer(paramServerConnectedEvent.getPlayer()))
      return; 
    ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
    byteArrayDataOutput.writeUTF(paramServerConnectedEvent.getPlayer().getUsername());
    this.proxyServer.getScheduler().buildTask(this.plugin, () -> {
          Player player2 = paramServerConnectedEvent.getPlayer();
          Player player3 = player2;
          boolean bool = false;
          Player player1 = player3.isActive() ? player2 : null;
          if (player1 != null) {
            Optional optional = player1.getCurrentServer();
            if (optional != null) {
              optional.ifPresent(());
              return;
            } 
          } 
        }).delay(500L, TimeUnit.MILLISECONDS).schedule();
  }
  
  static {
    identifier = (ChannelIdentifier)MinecraftChannelIdentifier.create("matrix", "geyser");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\proxy\velocity\EventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
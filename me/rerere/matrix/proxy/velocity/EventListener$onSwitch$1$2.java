package me.rerere.matrix.proxy.velocity;

import com.google.common.io.ByteArrayDataOutput;
import com.velocitypowered.api.event.player.ServerConnectedEvent;
import com.velocitypowered.api.proxy.ServerConnection;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class EventListener$onSwitch$1$2 extends Lambda implements Function1 {
  public final void invoke(@NotNull ServerConnection paramServerConnection) {
    paramServerConnection.sendPluginMessage(EventListener.access$getIdentifier$cp(), this.$out.toByteArray());
    System.out.println("[Matrix] sent a data to make matrix ignore " + this.$event.getPlayer().getUsername());
  }
  
  public EventListener$onSwitch$1$2(ByteArrayDataOutput paramByteArrayDataOutput, ServerConnectedEvent paramServerConnectedEvent) {
    super(1);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\proxy\velocity\EventListener$onSwitch$1$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
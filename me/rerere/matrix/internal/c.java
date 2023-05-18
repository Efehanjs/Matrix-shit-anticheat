package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;

public interface c {
  default boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    return false;
  }
  
  default void b(int paramInt, long paramLong) {}
  
  default void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, long paramLong, @NotNull Location paramLocation2, boolean paramBoolean1, boolean paramBoolean2) {}
  
  default boolean b(@NotNull PacketType paramPacketType, @NotNull PacketContainer paramPacketContainer, @NotNull PacketEvent paramPacketEvent) {
    return false;
  }
  
  default boolean b(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    return false;
  }
  
  default void b(long paramLong, @NotNull PacketType paramPacketType, float paramFloat1, float paramFloat2) {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
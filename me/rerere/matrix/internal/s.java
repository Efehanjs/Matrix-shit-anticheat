package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class s {
  private final long b;
  
  @NotNull
  private final PacketContainer i;
  
  private static String a;
  
  @NotNull
  public final PacketType b() {
    return this.i.getType();
  }
  
  @NotNull
  public final PacketContainer b() {
    return this.i;
  }
  
  public final long b() {
    return this.b;
  }
  
  public s(@NotNull PacketContainer paramPacketContainer, long paramLong) {
    this.i = paramPacketContainer;
    this.b = paramLong;
  }
  
  public static void J(String paramString) {
    a = paramString;
  }
  
  public static String l() {
    return a;
  }
  
  static {
    if (l() == null)
      J("ntuakc"); 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class zf extends zk {
  @NotNull
  private final List v = new ArrayList(40);
  
  private long b;
  
  private long i;
  
  public zf(@NotNull yl paramyl) {
    super(paramyl);
    b(yk.o);
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    long l = paramLong ^ 0x24D765D0E236L;
    try {
      if (v.j(l, paramPacketType))
        t(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
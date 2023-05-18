package me.rerere.matrix.internal;

import com.viaversion.viaversion.bukkit.platform.BukkitViaAPI;
import java.util.UUID;
import org.bukkit.entity.Player;

public final class r implements w {
  public int b(Player paramPlayer) {
    return this.i.getPlayerVersion(paramPlayer);
  }
  
  public boolean b() {
    return this.i.isProtocolSupport();
  }
  
  public boolean b(int paramInt, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield i : Lcom/viaversion/viaversion/bukkit/platform/BukkitViaAPI;
    //   4: invokevirtual getServerVersion : ()Lcom/viaversion/viaversion/api/protocol/version/ServerProtocolVersion;
    //   7: invokeinterface lowestSupportedVersion : ()I
    //   12: istore #5
    //   14: invokestatic r : ()I
    //   17: aload_0
    //   18: getfield i : Lcom/viaversion/viaversion/bukkit/platform/BukkitViaAPI;
    //   21: invokevirtual getServerVersion : ()Lcom/viaversion/viaversion/api/protocol/version/ServerProtocolVersion;
    //   24: invokeinterface highestSupportedVersion : ()I
    //   29: istore #6
    //   31: istore #4
    //   33: iload_1
    //   34: iload #5
    //   36: iload #4
    //   38: ifeq -> 73
    //   41: if_icmplt -> 80
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   50: athrow
    //   51: iload_1
    //   52: iload #4
    //   54: ifeq -> 77
    //   57: goto -> 64
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: iload #6
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: if_icmpgt -> 80
    //   76: iconst_1
    //   77: goto -> 81
    //   80: iconst_0
    //   81: ireturn
    // Exception table:
    //   from	to	target	type
    //   33	44	47	java/lang/RuntimeException
    //   41	57	60	java/lang/RuntimeException
    //   51	66	69	java/lang/RuntimeException
  }
  
  public boolean b(UUID paramUUID) {
    return this.i.isInjected(paramUUID);
  }
  
  public r(BukkitViaAPI paramBukkitViaAPI) {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
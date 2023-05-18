package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public final class do implements Listener {
  private static final long a = o3.a(121241118591094747L, -7044338348577863399L, MethodHandles.lookup().lookupClass()).a(42622792562859L);
  
  @EventHandler
  public final void b(@NotNull PlayerShearEntityEvent paramPlayerShearEntityEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/do.a : J
    //   3: ldc2_w 68273743747494
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifne -> 48
    //   19: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   22: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   27: getstatic org/bukkit/entity/EntityType.MUSHROOM_COW : Lorg/bukkit/entity/EntityType;
    //   30: if_acmpne -> 111
    //   33: goto -> 40
    //   36: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   39: athrow
    //   40: aload_1
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   51: getstatic org/bukkit/Material.SHEARS : Lorg/bukkit/Material;
    //   54: iload #4
    //   56: ifne -> 105
    //   59: invokeinterface hasCooldown : (Lorg/bukkit/Material;)Z
    //   64: ifeq -> 91
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_1
    //   75: iconst_1
    //   76: invokevirtual setCancelled : (Z)V
    //   79: iload #4
    //   81: ifeq -> 111
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload_1
    //   92: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   95: getstatic org/bukkit/Material.SHEARS : Lorg/bukkit/Material;
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: iconst_2
    //   106: invokeinterface setCooldown : (Lorg/bukkit/Material;I)V
    //   111: return
    // Exception table:
    //   from	to	target	type
    //   13	33	36	java/lang/RuntimeException
    //   19	41	44	java/lang/RuntimeException
    //   48	67	70	java/lang/RuntimeException
    //   59	84	87	java/lang/RuntimeException
    //   74	98	101	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\do.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
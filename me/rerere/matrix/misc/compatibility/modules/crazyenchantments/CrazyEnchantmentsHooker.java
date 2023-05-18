package me.rerere.matrix.misc.compatibility.modules.crazyenchantments;

import java.util.HashMap;
import java.util.Map;
import me.badbones69.crazyenchantments.api.events.BlastUseEvent;
import me.rerere.matrix.api.events.PlayerViolationEvent;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class CrazyEnchantmentsHooker implements Listener {
  private final Map exemptPlayers = new HashMap<>();
  
  @EventHandler
  public void onQuit(@NotNull PlayerQuitEvent paramPlayerQuitEvent) {
    Player player = paramPlayerQuitEvent.getPlayer();
    this.exemptPlayers.remove(player.getUniqueId());
  }
  
  @EventHandler
  public void onUseEnchant(@NotNull BlastUseEvent paramBlastUseEvent) {
    Player player = paramBlastUseEvent.getPlayer();
    this.exemptPlayers.put(player.getUniqueId(), Long.valueOf(System.currentTimeMillis()));
  }
  
  @EventHandler
  public void onFlag(@NotNull PlayerViolationEvent paramPlayerViolationEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   4: astore_2
    //   5: aload_1
    //   6: invokevirtual getHackType : ()Lme/rerere/matrix/api/HackType;
    //   9: getstatic me/rerere/matrix/api/HackType.INTERACT : Lme/rerere/matrix/api/HackType;
    //   12: if_acmpeq -> 32
    //   15: aload_1
    //   16: invokevirtual getHackType : ()Lme/rerere/matrix/api/HackType;
    //   19: getstatic me/rerere/matrix/api/HackType.BLOCK : Lme/rerere/matrix/api/HackType;
    //   22: if_acmpne -> 103
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   31: athrow
    //   32: aload_0
    //   33: getfield exemptPlayers : Ljava/util/Map;
    //   36: aload_2
    //   37: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   42: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   47: ifeq -> 103
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: invokestatic currentTimeMillis : ()J
    //   60: aload_0
    //   61: getfield exemptPlayers : Ljava/util/Map;
    //   64: aload_2
    //   65: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   70: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   75: checkcast java/lang/Long
    //   78: invokevirtual longValue : ()J
    //   81: lsub
    //   82: lstore_3
    //   83: lload_3
    //   84: ldc2_w 150
    //   87: lcmp
    //   88: ifgt -> 103
    //   91: aload_1
    //   92: iconst_1
    //   93: invokevirtual setCancelled : (Z)V
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: return
    // Exception table:
    //   from	to	target	type
    //   5	25	28	java/lang/RuntimeException
    //   15	50	53	java/lang/RuntimeException
    //   83	96	99	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\misc\compatibility\modules\crazyenchantments\CrazyEnchantmentsHooker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
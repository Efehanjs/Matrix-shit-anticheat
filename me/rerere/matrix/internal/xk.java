package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.util.Vector;

public class xk implements Listener {
  private static final Set b;
  
  private static Class i;
  
  private static final long a;
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e;
  
  @EventHandler
  public void b(@NotNull EntityExplodeEvent paramEntityExplodeEvent) {
    paramEntityExplodeEvent.blockList().forEach(Matrix.b().b()::b);
  }
  
  @EventHandler
  public void b(@NotNull ChunkLoadEvent paramChunkLoadEvent) {
    Chunk chunk = paramChunkLoadEvent.getChunk();
    Matrix.b().b().b(chunk);
  }
  
  @EventHandler(priority = EventPriority.HIGH)
  public void b(@NotNull PlayerInteractEvent paramPlayerInteractEvent) {
    long l1 = a ^ 0x634647DD7132L;
    long l2 = l1 ^ 0x53B5631D9F4CL;
    long l3 = l1 ^ 0x77989C006A68L;
    int i = (int)((l1 ^ 0x1B4C6F0900CL) >>> 32L);
    int j = (int)((l1 ^ 0x1B4C6F0900CL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x1B4C6F0900CL) << 48L >>> 48L);
    l1 ^ 0x1B4C6F0900CL;
    int m = (int)((l1 ^ 0xEF622DF9FB3L) >>> 48L);
    int n = (int)((l1 ^ 0xEF622DF9FB3L) << 16L >>> 32L);
    int i1 = (int)((l1 ^ 0xEF622DF9FB3L) << 48L >>> 48L);
    l1 ^ 0xEF622DF9FB3L;
    try {
      if (paramPlayerInteractEvent.getClass() != PlayerInteractEvent.class)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Player player = paramPlayerInteractEvent.getPlayer();
    try {
      if (!i.isInstance(player))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b((char)m, n, paramPlayerInteractEvent, (short)i1); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void j(@NotNull PlayerFishEvent paramPlayerFishEvent) {
    long l1 = a ^ 0x3B428C26CEBAL;
    long l2 = l1 ^ 0xBB1A8E620C4L;
    long l3 = l1 ^ 0x2F9C57FBD5E0L;
    int i = (int)((l1 ^ 0x59B00D0B2F84L) >>> 32L);
    int j = (int)((l1 ^ 0x59B00D0B2F84L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x59B00D0B2F84L) << 48L >>> 48L);
    l1 ^ 0x59B00D0B2F84L;
    Player player = paramPlayerFishEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.j(paramPlayerFishEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public void j(@NotNull VehicleEnterEvent paramVehicleEnterEvent) {
    long l1 = a ^ 0x783F5D07AE5L;
    long l2 = l1 ^ 0xD934860AD49L;
    if (paramVehicleEnterEvent.getEntered() instanceof Player) {
      Player player = (Player)paramVehicleEnterEvent.getEntered();
      yl yl = Matrix.b().b().b(player.getUniqueId());
      try {
        if (yl != null)
          yl.b().j(1.0D, l2, 1.0D, 1.0D); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull PlayerToggleSprintEvent paramPlayerToggleSprintEvent) {
    long l1 = a ^ 0x3EB0D5811F91L;
    long l2 = l1 ^ 0xE43F141F1EFL;
    long l3 = l1 ^ 0x2A6E0E5C04CBL;
    int i = (int)((l1 ^ 0x5C4254ACFEAFL) >>> 32L);
    int j = (int)((l1 ^ 0x5C4254ACFEAFL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x5C4254ACFEAFL) << 48L >>> 48L);
    l1 ^ 0x5C4254ACFEAFL;
    Player player = paramPlayerToggleSprintEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerToggleSprintEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
  public void b(@NotNull EntityRegainHealthEvent paramEntityRegainHealthEvent) {
    long l1 = a ^ 0x1757CB3CE2B8L;
    long l2 = l1 ^ 0x27A4EFFC0CC6L;
    long l3 = l1 ^ 0x38910E1F9E2L;
    long l4 = l1 ^ 0x20CCCC1CA8F7L;
    int i = (int)((l1 ^ 0x75A54A110386L) >>> 32L);
    int j = (int)((l1 ^ 0x75A54A110386L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x75A54A110386L) << 48L >>> 48L);
    l1 ^ 0x75A54A110386L;
    if (paramEntityRegainHealthEvent.getEntityType() == EntityType.PLAYER) {
      Player player = (Player)paramEntityRegainHealthEvent.getEntity();
      yl yl = Matrix.b().b().b(player.getUniqueId());
      try {
        if (yl == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      for (zk zk : yl.b().b()) {
        try {
          if (zk.b().b(l2))
            try {
              if (!yl.t(i, (short)j, k))
                try {
                  if (zk.b().b(l3, player.getWorld()))
                    zk.b(l4, paramEntityRegainHealthEvent); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull PlayerChangedWorldEvent paramPlayerChangedWorldEvent) {
    long l1 = a ^ 0x584E669FBF27L;
    long l2 = l1 ^ 0x68BD425F5159L;
    long l3 = l1 ^ 0x232B860A8E88L;
    int i = (int)((l1 ^ 0x3ABCE7B25E19L) >>> 32L);
    int j = (int)((l1 ^ 0x3ABCE7B25E19L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x3ABCE7B25E19L) << 48L >>> 48L);
    l1 ^ 0x3ABCE7B25E19L;
    Player player = paramPlayerChangedWorldEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (yl.b() != null) {
        (yl.b()).l = null;
        yl.b().b((Location)null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              zk.b(paramPlayerChangedWorldEvent, l3); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.LOWEST)
  public void j(@NotNull AsyncPlayerChatEvent paramAsyncPlayerChatEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 35386436979871
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 117252922398274
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 130297606852694
    //   20: lxor
    //   21: dup2
    //   22: bipush #32
    //   24: lushr
    //   25: l2i
    //   26: istore #6
    //   28: dup2
    //   29: bipush #32
    //   31: lshl
    //   32: bipush #32
    //   34: lushr
    //   35: l2i
    //   36: istore #7
    //   38: pop2
    //   39: pop2
    //   40: aload_1
    //   41: invokevirtual getMessage : ()Ljava/lang/String;
    //   44: sipush #29572
    //   47: ldc2_w 2482283107464896698
    //   50: lload_2
    //   51: lxor
    //   52: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   57: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   60: ifeq -> 654
    //   63: aload_1
    //   64: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   67: invokeinterface getName : ()Ljava/lang/String;
    //   72: sipush #11504
    //   75: ldc2_w 7835005037343391697
    //   78: lload_2
    //   79: lxor
    //   80: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   85: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   88: ifeq -> 654
    //   91: goto -> 98
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_1
    //   99: iconst_1
    //   100: invokevirtual setCancelled : (Z)V
    //   103: aload_1
    //   104: sipush #6297
    //   107: ldc2_w 7472136121205689257
    //   110: lload_2
    //   111: lxor
    //   112: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   117: invokevirtual setMessage : (Ljava/lang/String;)V
    //   120: aload_1
    //   121: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   124: astore #8
    //   126: aload #8
    //   128: new java/lang/StringBuilder
    //   131: dup
    //   132: invokespecial <init> : ()V
    //   135: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   138: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   141: sipush #14677
    //   144: ldc2_w 5036734354325613160
    //   147: lload_2
    //   148: lxor
    //   149: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   165: new net/md_5/bungee/api/chat/TextComponent
    //   168: dup
    //   169: new java/lang/StringBuilder
    //   172: dup
    //   173: invokespecial <init> : ()V
    //   176: sipush #24881
    //   179: ldc2_w 249444682795774494
    //   182: lload_2
    //   183: lxor
    //   184: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: lload #4
    //   194: invokestatic b : (J)Ljava/lang/String;
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: invokevirtual toString : ()Ljava/lang/String;
    //   203: invokespecial <init> : (Ljava/lang/String;)V
    //   206: astore #9
    //   208: aload #9
    //   210: new net/md_5/bungee/api/chat/ClickEvent
    //   213: dup
    //   214: getstatic net/md_5/bungee/api/chat/ClickEvent$Action.SUGGEST_COMMAND : Lnet/md_5/bungee/api/chat/ClickEvent$Action;
    //   217: lload #4
    //   219: invokestatic b : (J)Ljava/lang/String;
    //   222: invokespecial <init> : (Lnet/md_5/bungee/api/chat/ClickEvent$Action;Ljava/lang/String;)V
    //   225: invokevirtual setClickEvent : (Lnet/md_5/bungee/api/chat/ClickEvent;)V
    //   228: aload #8
    //   230: invokeinterface spigot : ()Lorg/bukkit/entity/Player$Spigot;
    //   235: aload #9
    //   237: invokevirtual sendMessage : (Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   240: new net/md_5/bungee/api/chat/TextComponent
    //   243: dup
    //   244: new java/lang/StringBuilder
    //   247: dup
    //   248: invokespecial <init> : ()V
    //   251: sipush #13046
    //   254: ldc2_w 2219547836269961680
    //   257: lload_2
    //   258: lxor
    //   259: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: iload #6
    //   269: iload #7
    //   271: invokestatic b : (II)Ljava/lang/String;
    //   274: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: invokevirtual toString : ()Ljava/lang/String;
    //   280: invokespecial <init> : (Ljava/lang/String;)V
    //   283: astore #10
    //   285: aload #10
    //   287: new net/md_5/bungee/api/chat/ClickEvent
    //   290: dup
    //   291: getstatic net/md_5/bungee/api/chat/ClickEvent$Action.SUGGEST_COMMAND : Lnet/md_5/bungee/api/chat/ClickEvent$Action;
    //   294: iload #6
    //   296: iload #7
    //   298: invokestatic b : (II)Ljava/lang/String;
    //   301: invokespecial <init> : (Lnet/md_5/bungee/api/chat/ClickEvent$Action;Ljava/lang/String;)V
    //   304: invokevirtual setClickEvent : (Lnet/md_5/bungee/api/chat/ClickEvent;)V
    //   307: aload #8
    //   309: invokeinterface spigot : ()Lorg/bukkit/entity/Player$Spigot;
    //   314: aload #10
    //   316: invokevirtual sendMessage : (Lnet/md_5/bungee/api/chat/BaseComponent;)V
    //   319: aload #8
    //   321: ldc_w ''
    //   324: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   329: aload #8
    //   331: new java/lang/StringBuilder
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: sipush #15071
    //   341: ldc2_w 551649374684195315
    //   344: lload_2
    //   345: lxor
    //   346: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   357: invokevirtual getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
    //   360: invokevirtual getVersion : ()Ljava/lang/String;
    //   363: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   366: sipush #3611
    //   369: ldc2_w 8659021339845664040
    //   372: lload_2
    //   373: lxor
    //   374: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   379: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: invokestatic getVersion : ()Ljava/lang/String;
    //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: invokevirtual toString : ()Ljava/lang/String;
    //   391: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   396: aload #8
    //   398: new java/lang/StringBuilder
    //   401: dup
    //   402: invokespecial <init> : ()V
    //   405: sipush #8578
    //   408: ldc2_w 2102367791378215610
    //   411: lload_2
    //   412: lxor
    //   413: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   418: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   421: invokestatic values : ()[Lme/rerere/matrix/internal/yk;
    //   424: invokestatic of : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   427: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   432: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   437: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   442: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   447: ldc_w ','
    //   450: invokestatic joining : (Ljava/lang/CharSequence;)Ljava/util/stream/Collector;
    //   453: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   458: checkcast java/lang/String
    //   461: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   464: invokevirtual toString : ()Ljava/lang/String;
    //   467: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   472: aload #8
    //   474: new java/lang/StringBuilder
    //   477: dup
    //   478: invokespecial <init> : ()V
    //   481: sipush #9027
    //   484: ldc2_w 6934406333429067889
    //   487: lload_2
    //   488: lxor
    //   489: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: invokestatic a : ()Ljava/lang/String;
    //   500: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: sipush #15113
    //   506: ldc2_w 7422817896886937633
    //   509: lload_2
    //   510: lxor
    //   511: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: invokestatic b : ()Ljava/lang/String;
    //   522: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   525: invokevirtual toString : ()Ljava/lang/String;
    //   528: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   533: aload #8
    //   535: new java/lang/StringBuilder
    //   538: dup
    //   539: invokespecial <init> : ()V
    //   542: sipush #32623
    //   545: ldc2_w 6930685650706164804
    //   548: lload_2
    //   549: lxor
    //   550: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   555: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   558: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   561: sipush #1869
    //   564: ldc2_w 1716686852166980726
    //   567: lload_2
    //   568: lxor
    //   569: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   574: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   579: ifnull -> 590
    //   582: iconst_1
    //   583: goto -> 591
    //   586: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   589: athrow
    //   590: iconst_0
    //   591: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   594: sipush #1958
    //   597: ldc2_w 8274680846179570835
    //   600: lload_2
    //   601: lxor
    //   602: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   607: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   610: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   613: sipush #20672
    //   616: ldc2_w 2357377293300614140
    //   619: lload_2
    //   620: lxor
    //   621: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   626: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   631: ifnull -> 642
    //   634: iconst_1
    //   635: goto -> 643
    //   638: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   641: athrow
    //   642: iconst_0
    //   643: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   646: invokevirtual toString : ()Ljava/lang/String;
    //   649: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   654: return
    // Exception table:
    //   from	to	target	type
    //   40	91	94	java/lang/RuntimeException
    //   285	586	586	java/lang/RuntimeException
    //   591	638	638	java/lang/RuntimeException
  }
  
  @EventHandler
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    long l1 = a ^ 0x5CB82CF46E05L;
    int i = (int)((l1 ^ 0x76843B31EF09L) >>> 48L);
    int j = (int)((l1 ^ 0x76843B31EF09L) << 16L >>> 48L);
    int k = (int)((l1 ^ 0x76843B31EF09L) << 32L >>> 32L);
    l1 ^ 0x76843B31EF09L;
    long l2 = l1 ^ 0x6C4B0834807BL;
    long l3 = l1 ^ 0x4866F729755FL;
    int m = (int)((l1 ^ 0x3E4AADD98F3BL) >>> 32L);
    int n = (int)((l1 ^ 0x3E4AADD98F3BL) << 32L >>> 48L);
    int i1 = (int)((l1 ^ 0x3E4AADD98F3BL) << 48L >>> 48L);
    l1 ^ 0x3E4AADD98F3BL;
    try {
      if (!(paramEntityDamageByEntityEvent.getEntity() instanceof Vehicle))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vehicle vehicle = (Vehicle)paramEntityDamageByEntityEvent.getEntity();
    Player player = null;
    if (b.b() >= 12) {
      for (Entity entity : vehicle.getPassengers()) {
        if (entity.getType() == EntityType.PLAYER)
          player = (Player)entity; 
      } 
    } else {
      Entity entity = vehicle.getPassenger();
      try {
        if (entity != null && entity.getType() == EntityType.PLAYER)
          player = (Player)entity; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    if (player != null) {
      yl yl = Matrix.b().b().b(player.getUniqueId());
      try {
        if (yl == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      for (zk zk : yl.b().b()) {
        try {
          if (zk.b().b(l2))
            try {
              if (!yl.t(m, (short)n, i1))
                try {
                  if (zk.b().b(l3, player.getWorld()))
                    zk.j((char)i, (short)j, paramEntityDamageByEntityEvent, k); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull BlockPistonRetractEvent paramBlockPistonRetractEvent) {
    long l1 = a ^ 0x187963CAE41AL;
    long l2 = l1 ^ 0x6B0AD176035CL;
    for (Block block : paramBlockPistonRetractEvent.getBlocks()) {
      for (Player player : ta.b(block.getLocation(), l2)) {
        yl yl = Matrix.b().b().b(player.getUniqueId());
        try {
          if (yl != null)
            (yl.b()).f.b(block); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
    for (Player player : ta.b(paramBlockPistonRetractEvent.getBlock().getLocation(), l2)) {
      yl yl = Matrix.b().b().b(player.getUniqueId());
      try {
        if (yl != null)
          (yl.b()).f.b(paramBlockPistonRetractEvent.getBlock()); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void j(PlayerJoinEvent paramPlayerJoinEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 57304226288550
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 77420935463573
    //   13: lxor
    //   14: lstore #4
    //   16: pop2
    //   17: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   20: lload #4
    //   22: invokevirtual p : (J)Z
    //   25: ifeq -> 162
    //   28: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
    //   31: invokeinterface size : ()I
    //   36: bipush #50
    //   38: if_icmple -> 162
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   47: athrow
    //   48: aload_1
    //   49: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   52: sipush #32306
    //   55: ldc2_w 5757896251877536300
    //   58: lload_2
    //   59: lxor
    //   60: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   65: invokeinterface kickPlayer : (Ljava/lang/String;)V
    //   70: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   73: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   76: new java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: sipush #3522
    //   86: ldc2_w 1855990843548352985
    //   89: lload_2
    //   90: lxor
    //   91: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: aload_1
    //   100: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   103: invokeinterface getName : ()Ljava/lang/String;
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: sipush #9819
    //   114: ldc2_w 6718233079431686741
    //   117: lload_2
    //   118: lxor
    //   119: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual toString : ()Ljava/lang/String;
    //   130: invokevirtual warning : (Ljava/lang/String;)V
    //   133: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   136: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   139: sipush #8655
    //   142: ldc2_w 1103715391152745941
    //   145: lload_2
    //   146: lxor
    //   147: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   152: invokevirtual warning : (Ljava/lang/String;)V
    //   155: goto -> 162
    //   158: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   161: athrow
    //   162: return
    // Exception table:
    //   from	to	target	type
    //   17	41	44	java/lang/RuntimeException
    //   28	155	158	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
  public void b(@NotNull InventoryClickEvent paramInventoryClickEvent) {
    long l1 = a ^ 0x3A99C8E9431AL;
    long l2 = l1 ^ 0x10E463CB95F8L;
    long l3 = l1 ^ 0xA6AEC29AD64L;
    long l4 = l1 ^ 0x2E4713345840L;
    int i = (int)((l1 ^ 0x586B49C4A224L) >>> 32L);
    int j = (int)((l1 ^ 0x586B49C4A224L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x586B49C4A224L) << 48L >>> 48L);
    l1 ^ 0x586B49C4A224L;
    if (paramInventoryClickEvent.getWhoClicked() instanceof Player) {
      Player player = (Player)paramInventoryClickEvent.getWhoClicked();
      yl yl = Matrix.b().b().b(player.getUniqueId());
      try {
        if (yl == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      for (zk zk : yl.b().b()) {
        try {
          if (zk.b().b(l3))
            try {
              if (!yl.t(i, (short)j, k))
                try {
                  if (zk.b().b(l4, player.getWorld()))
                    zk.b(paramInventoryClickEvent, l2); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull PlayerJoinEvent paramPlayerJoinEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 120170280477709
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   12: astore #4
    //   14: aload #4
    //   16: invokeinterface getName : ()Ljava/lang/String;
    //   21: sipush #3376
    //   24: ldc2_w 106969347984684691
    //   27: lload_2
    //   28: lxor
    //   29: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   34: invokevirtual equals : (Ljava/lang/Object;)Z
    //   37: ifeq -> 69
    //   40: invokestatic getScheduler : ()Lorg/bukkit/scheduler/BukkitScheduler;
    //   43: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   46: aload #4
    //   48: <illegal opcode> run : (Lorg/bukkit/entity/Player;)Ljava/lang/Runnable;
    //   53: ldc2_w 20
    //   56: invokeinterface runTaskLater : (Lorg/bukkit/plugin/Plugin;Ljava/lang/Runnable;J)Lorg/bukkit/scheduler/BukkitTask;
    //   61: pop
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: return
    // Exception table:
    //   from	to	target	type
    //   14	62	65	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  public void b(@NotNull AsyncPlayerChatEvent paramAsyncPlayerChatEvent) {
    long l1 = a ^ 0x1FA76C5B7024L;
    long l2 = l1 ^ 0x7329FE100CA8L;
    long l3 = l1 ^ 0x2F54489B9E5AL;
    long l4 = l1 ^ 0xB79B7866B7EL;
    int i = (int)((l1 ^ 0x7D55ED76911AL) >>> 32L);
    int j = (int)((l1 ^ 0x7D55ED76911AL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x7D55ED76911AL) << 48L >>> 48L);
    l1 ^ 0x7D55ED76911AL;
    Player player = paramAsyncPlayerChatEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l3))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l4, player.getWorld()))
                  zk.b(l2, paramAsyncPlayerChatEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.HIGH)
  public void b(@NotNull EntityDamageEvent paramEntityDamageEvent) {
    long l1 = a ^ 0x5798F1F4B46BL;
    long l2 = l1 ^ 0x676BD5345A15L;
    long l3 = l1 ^ 0x43462A29AF31L;
    int i = (int)((l1 ^ 0x356A70D95555L) >>> 32L);
    int j = (int)((l1 ^ 0x356A70D95555L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x356A70D95555L) << 48L >>> 48L);
    l1 ^ 0x356A70D95555L;
    try {
      if (!(paramEntityDamageEvent.getEntity() instanceof Player))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Player player = (Player)paramEntityDamageEvent.getEntity();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramEntityDamageEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.LOW)
  public void p(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 126107048761108
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 72854206462314
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 112628236373070
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 85535668552685
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 17880300500522
    //   34: lxor
    //   35: dup2
    //   36: bipush #32
    //   38: lushr
    //   39: l2i
    //   40: istore #10
    //   42: dup2
    //   43: bipush #32
    //   45: lshl
    //   46: bipush #48
    //   48: lushr
    //   49: l2i
    //   50: istore #11
    //   52: dup2
    //   53: bipush #48
    //   55: lshl
    //   56: bipush #48
    //   58: lushr
    //   59: l2i
    //   60: istore #12
    //   62: pop2
    //   63: dup2
    //   64: ldc2_w 71349852587
    //   67: lxor
    //   68: lstore #13
    //   70: pop2
    //   71: aload_1
    //   72: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   75: instanceof org/bukkit/entity/Player
    //   78: ifne -> 86
    //   81: return
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_1
    //   87: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   90: checkcast org/bukkit/entity/Player
    //   93: astore #15
    //   95: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   98: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   101: aload #15
    //   103: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   108: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   111: astore #16
    //   113: aload #16
    //   115: ifnonnull -> 123
    //   118: return
    //   119: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   122: athrow
    //   123: aload #15
    //   125: sipush #23717
    //   128: ldc2_w 4098139873376146449
    //   131: lload_2
    //   132: lxor
    //   133: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   138: invokeinterface hasMetadata : (Ljava/lang/String;)Z
    //   143: ifeq -> 151
    //   146: return
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload #16
    //   153: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   156: invokevirtual b : ()Ljava/util/List;
    //   159: invokeinterface iterator : ()Ljava/util/Iterator;
    //   164: astore #17
    //   166: aload #17
    //   168: invokeinterface hasNext : ()Z
    //   173: ifeq -> 341
    //   176: aload #17
    //   178: invokeinterface next : ()Ljava/lang/Object;
    //   183: checkcast me/rerere/matrix/internal/zk
    //   186: astore #18
    //   188: aload #18
    //   190: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   193: lload #4
    //   195: invokevirtual b : (J)Z
    //   198: ifeq -> 338
    //   201: aload #16
    //   203: iload #10
    //   205: iload #11
    //   207: i2s
    //   208: iload #12
    //   210: invokevirtual t : (ISI)Z
    //   213: ifne -> 338
    //   216: goto -> 223
    //   219: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   222: athrow
    //   223: aload #18
    //   225: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   228: aload #15
    //   230: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   235: lload #6
    //   237: dup2_x1
    //   238: pop2
    //   239: invokevirtual b : (JLorg/bukkit/World;)Z
    //   242: ifeq -> 338
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   251: athrow
    //   252: aload_1
    //   253: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   256: instanceof org/bukkit/entity/LivingEntity
    //   259: ifeq -> 277
    //   262: aload #18
    //   264: aload_1
    //   265: lload #8
    //   267: invokevirtual m : (Lorg/bukkit/event/entity/EntityDamageByEntityEvent;J)V
    //   270: goto -> 277
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: aload #18
    //   279: lload #13
    //   281: aload_1
    //   282: invokevirtual b : (JLorg/bukkit/event/entity/EntityDamageByEntityEvent;)V
    //   285: goto -> 338
    //   288: astore #19
    //   290: aload #19
    //   292: invokevirtual printStackTrace : ()V
    //   295: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   298: new java/lang/StringBuilder
    //   301: dup
    //   302: invokespecial <init> : ()V
    //   305: sipush #8880
    //   308: ldc2_w 3766137494693538322
    //   311: lload_2
    //   312: lxor
    //   313: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: aload #18
    //   323: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   326: invokevirtual j : ()Ljava/lang/String;
    //   329: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: invokevirtual toString : ()Ljava/lang/String;
    //   335: invokevirtual println : (Ljava/lang/String;)V
    //   338: goto -> 166
    //   341: return
    // Exception table:
    //   from	to	target	type
    //   71	82	82	java/lang/Exception
    //   113	119	119	java/lang/Exception
    //   123	147	147	java/lang/Exception
    //   188	216	219	java/lang/Exception
    //   201	245	248	java/lang/Exception
    //   252	270	273	java/lang/Exception
    //   252	285	288	java/lang/Exception
  }
  
  @EventHandler
  public void b(PlayerFishEvent paramPlayerFishEvent) {
    long l1 = a ^ 0x7847F46D1D08L;
    long l2 = l1 ^ 0x71EF8037437BL;
    long l3 = l1 ^ 0x48B4D0ADF376L;
    long l4 = l1 ^ 0x6C992FB00652L;
    int i = (int)((l1 ^ 0x1AB57540FC36L) >>> 32L);
    int j = (int)((l1 ^ 0x1AB57540FC36L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x1AB57540FC36L) << 48L >>> 48L);
    l1 ^ 0x1AB57540FC36L;
    try {
      if (paramPlayerFishEvent.getState() == PlayerFishEvent.State.CAUGHT_ENTITY)
        try {
          if (paramPlayerFishEvent.getCaught() != null && paramPlayerFishEvent.getCaught() instanceof Player) {
            Player player = (Player)paramPlayerFishEvent.getCaught();
            yl yl = Matrix.b().b().b(player.getUniqueId());
            try {
              if (yl == null)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            Vector vector = paramPlayerFishEvent.getPlayer().getLocation().toVector().subtract(paramPlayerFishEvent.getCaught().getLocation().toVector()).multiply(0.1D).multiply(1.2D);
            yl.b().b(vector, l2);
            for (zk zk : yl.b().b()) {
              try {
                if (zk.b().b(l3))
                  try {
                    if (!yl.t(i, (short)j, k))
                      try {
                        if (zk.b().b(l4, player.getWorld()))
                          zk.b(paramPlayerFishEvent); 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      }  
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public xk() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 92635993367307
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokespecial <init> : ()V
    //   12: getstatic me/rerere/matrix/internal/ge.m : Ljava/util/Map;
    //   15: invokeinterface size : ()I
    //   20: ifne -> 24
    //   23: return
    //   24: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   27: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   30: sipush #7006
    //   33: ldc2_w 8890351390563067876
    //   36: lload_1
    //   37: lxor
    //   38: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   43: invokevirtual warning : (Ljava/lang/String;)V
    //   46: aload_0
    //   47: invokevirtual getClass : ()Ljava/lang/Class;
    //   50: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   53: astore_3
    //   54: aload_3
    //   55: arraylength
    //   56: istore #4
    //   58: iconst_0
    //   59: istore #5
    //   61: iload #5
    //   63: iload #4
    //   65: if_icmpge -> 300
    //   68: aload_3
    //   69: iload #5
    //   71: aaload
    //   72: astore #6
    //   74: aload #6
    //   76: invokevirtual getParameterCount : ()I
    //   79: iconst_1
    //   80: if_icmpne -> 294
    //   83: getstatic me/rerere/matrix/internal/ge.m : Ljava/util/Map;
    //   86: aload #6
    //   88: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   91: iconst_0
    //   92: aaload
    //   93: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   96: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   101: ifeq -> 294
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   110: athrow
    //   111: aload #6
    //   113: ldc_w org/bukkit/event/EventHandler
    //   116: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   119: checkcast org/bukkit/event/EventHandler
    //   122: astore #7
    //   124: aload #7
    //   126: invokestatic getInvocationHandler : (Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
    //   129: astore #8
    //   131: aload #8
    //   133: invokevirtual getClass : ()Ljava/lang/Class;
    //   136: sipush #4260
    //   139: ldc2_w 3120806694434466836
    //   142: lload_1
    //   143: lxor
    //   144: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   149: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   152: astore #9
    //   154: aload #9
    //   156: iconst_1
    //   157: invokevirtual setAccessible : (Z)V
    //   160: aload #9
    //   162: aload #8
    //   164: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   167: checkcast java/util/Map
    //   170: astore #10
    //   172: getstatic me/rerere/matrix/internal/ge.m : Ljava/util/Map;
    //   175: aload #6
    //   177: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   180: iconst_0
    //   181: aaload
    //   182: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   185: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   190: checkcast org/bukkit/event/EventPriority
    //   193: astore #11
    //   195: aload #10
    //   197: sipush #5063
    //   200: ldc2_w 1094455733479599990
    //   203: lload_1
    //   204: lxor
    //   205: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   210: aload #11
    //   212: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: new java/lang/StringBuilder
    //   221: dup
    //   222: invokespecial <init> : ()V
    //   225: sipush #23430
    //   228: ldc2_w 4647913904627328804
    //   231: lload_1
    //   232: lxor
    //   233: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   241: aload #6
    //   243: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   246: iconst_0
    //   247: aaload
    //   248: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   251: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: sipush #24607
    //   257: ldc2_w 6400320307494821035
    //   260: lload_1
    //   261: lxor
    //   262: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: aload #11
    //   272: invokevirtual name : ()Ljava/lang/String;
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: invokevirtual toString : ()Ljava/lang/String;
    //   281: invokestatic b : (Ljava/lang/String;)V
    //   284: goto -> 294
    //   287: astore #9
    //   289: aload #9
    //   291: invokevirtual printStackTrace : ()V
    //   294: iinc #5, 1
    //   297: goto -> 61
    //   300: return
    // Exception table:
    //   from	to	target	type
    //   74	104	107	java/lang/NoSuchFieldException
    //   131	284	287	java/lang/NoSuchFieldException
    //   131	284	287	java/lang/IllegalAccessException
  }
  
  @EventHandler
  public void b(@NotNull PlayerToggleFlightEvent paramPlayerToggleFlightEvent) {
    long l1 = a ^ 0x37D74CF60FB8L;
    long l2 = l1 ^ 0x7246836E1C6L;
    long l3 = l1 ^ 0x2309972B14E2L;
    int i = (int)((l1 ^ 0x5525CDDBEE86L) >>> 32L);
    int j = (int)((l1 ^ 0x5525CDDBEE86L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x5525CDDBEE86L) << 48L >>> 48L);
    l1 ^ 0x5525CDDBEE86L;
    long l4 = l1 ^ 0x3DC7F146D814L;
    Player player = paramPlayerToggleFlightEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerToggleFlightEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    yl.b().j(0.0D, l4, 1.0D, 0.0D);
  }
  
  @EventHandler
  public void b(@NotNull VehicleEnterEvent paramVehicleEnterEvent) {
    long l1 = a ^ 0x37C9E013AEFFL;
    long l2 = l1 ^ 0x73AC4D34081L;
    long l3 = l1 ^ 0x23173BCEB5A5L;
    int i = (int)((l1 ^ 0x553B613E4FC1L) >>> 32L);
    int j = (int)((l1 ^ 0x553B613E4FC1L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x553B613E4FC1L) << 48L >>> 48L);
    l1 ^ 0x553B613E4FC1L;
    long l4 = l1 ^ 0x1E9B14FE5E05L;
    try {
      if (!(paramVehicleEnterEvent.getEntered() instanceof Player))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Player player = (Player)paramVehicleEnterEvent.getEntered();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramVehicleEnterEvent, l4); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
  public void b(@NotNull PlayerBedEnterEvent paramPlayerBedEnterEvent) {
    long l1 = a ^ 0x4E45779B1EF6L;
    long l2 = l1 ^ 0x7EB6535BF088L;
    long l3 = l1 ^ 0x5A9BAC4605ACL;
    int i = (int)((l1 ^ 0x2CB7F6B6FFC8L) >>> 32L);
    int j = (int)((l1 ^ 0x2CB7F6B6FFC8L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x2CB7F6B6FFC8L) << 48L >>> 48L);
    l1 ^ 0x2CB7F6B6FFC8L;
    Player player = paramPlayerBedEnterEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerBedEnterEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull PlayerDropItemEvent paramPlayerDropItemEvent) {
    long l1 = a ^ 0x277E919D5ABBL;
    long l2 = l1 ^ 0x178DB55DB4C5L;
    long l3 = l1 ^ 0x33A04A4041E1L;
    int i = (int)((l1 ^ 0x458C10B0BB85L) >>> 32L);
    int j = (int)((l1 ^ 0x458C10B0BB85L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x458C10B0BB85L) << 48L >>> 48L);
    l1 ^ 0x458C10B0BB85L;
    Player player = paramPlayerDropItemEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerDropItemEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void j(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    long l1 = a ^ 0x5C5BCC1E30A3L;
    long l2 = l1 ^ 0x564B71AEE70FL;
    try {
      if (paramEntityDamageByEntityEvent.getEntityType() == EntityType.PLAYER && paramEntityDamageByEntityEvent.getDamager().getType() == EntityType.ENDER_CRYSTAL) {
        Player player = (Player)paramEntityDamageByEntityEvent.getEntity();
        yl yl = Matrix.b().b().b(player.getUniqueId());
        try {
          if (yl != null)
            yl.b().j(0.5D, l2, 1.0D, 0.5D); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @EventHandler(priority = EventPriority.LOW)
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 104805674173539
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 73493438618084
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 122745270184477
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 83078142222137
    //   27: lxor
    //   28: lstore #8
    //   30: dup2
    //   31: ldc2_w 58117890935007
    //   34: lxor
    //   35: lstore #10
    //   37: dup2
    //   38: ldc2_w 104590451711707
    //   41: lxor
    //   42: lstore #12
    //   44: dup2
    //   45: ldc2_w 69285896875700
    //   48: lxor
    //   49: lstore #14
    //   51: dup2
    //   52: ldc2_w 135268132850204
    //   55: lxor
    //   56: lstore #16
    //   58: dup2
    //   59: ldc2_w 67772333106525
    //   62: lxor
    //   63: dup2
    //   64: bipush #32
    //   66: lushr
    //   67: l2i
    //   68: istore #18
    //   70: dup2
    //   71: bipush #32
    //   73: lshl
    //   74: bipush #48
    //   76: lushr
    //   77: l2i
    //   78: istore #19
    //   80: dup2
    //   81: bipush #48
    //   83: lshl
    //   84: bipush #48
    //   86: lushr
    //   87: l2i
    //   88: istore #20
    //   90: pop2
    //   91: pop2
    //   92: aload_1
    //   93: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   96: astore #21
    //   98: aload_1
    //   99: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   102: astore #22
    //   104: aload_1
    //   105: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   108: astore #23
    //   110: aload #22
    //   112: invokestatic b : (Lorg/bukkit/Location;)Z
    //   115: ifeq -> 133
    //   118: aload #23
    //   120: invokestatic b : (Lorg/bukkit/Location;)Z
    //   123: ifne -> 149
    //   126: goto -> 133
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: aload_1
    //   134: iconst_1
    //   135: invokevirtual setCancelled : (Z)V
    //   138: aload_1
    //   139: aload #22
    //   141: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   144: return
    //   145: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   148: athrow
    //   149: aload_1
    //   150: invokevirtual getFrom : ()Lorg/bukkit/Location;
    //   153: invokevirtual getYaw : ()F
    //   156: invokestatic b : (F)Z
    //   159: ifeq -> 182
    //   162: aload_1
    //   163: invokevirtual getTo : ()Lorg/bukkit/Location;
    //   166: invokevirtual getYaw : ()F
    //   169: invokestatic b : (F)Z
    //   172: ifne -> 198
    //   175: goto -> 182
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: aload_1
    //   183: iconst_1
    //   184: invokevirtual setCancelled : (Z)V
    //   187: aload_1
    //   188: aload #22
    //   190: invokevirtual setTo : (Lorg/bukkit/Location;)V
    //   193: return
    //   194: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   197: athrow
    //   198: aload #23
    //   200: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   203: aload #22
    //   205: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   208: invokevirtual equals : (Ljava/lang/Object;)Z
    //   211: ifne -> 219
    //   214: return
    //   215: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   218: athrow
    //   219: aload #21
    //   221: invokeinterface isDead : ()Z
    //   226: ifeq -> 234
    //   229: return
    //   230: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   233: athrow
    //   234: aload #23
    //   236: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   239: aload #23
    //   241: invokevirtual getX : ()D
    //   244: aload #23
    //   246: invokevirtual getZ : ()D
    //   249: lload #16
    //   251: invokestatic b : (Lorg/bukkit/World;DDJ)Z
    //   254: ifne -> 262
    //   257: return
    //   258: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   261: athrow
    //   262: aload #22
    //   264: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   267: aload #22
    //   269: invokevirtual getX : ()D
    //   272: aload #22
    //   274: invokevirtual getZ : ()D
    //   277: lload #16
    //   279: invokestatic b : (Lorg/bukkit/World;DDJ)Z
    //   282: ifne -> 290
    //   285: return
    //   286: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   289: athrow
    //   290: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   293: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   296: aload #21
    //   298: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   303: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   306: astore #24
    //   308: aload #24
    //   310: ifnonnull -> 318
    //   313: return
    //   314: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   317: athrow
    //   318: getstatic me/rerere/matrix/internal/yk.y : Lme/rerere/matrix/internal/yk;
    //   321: lload #6
    //   323: invokevirtual b : (J)Z
    //   326: ifeq -> 357
    //   329: aload #24
    //   331: invokevirtual b : ()Lme/rerere/matrix/internal/vk;
    //   334: aload #22
    //   336: aload #23
    //   338: aload #21
    //   340: aload #24
    //   342: lload #4
    //   344: invokestatic b : (Lorg/bukkit/Location;Lorg/bukkit/Location;Lorg/bukkit/entity/Player;Lme/rerere/matrix/internal/yl;J)Lme/rerere/matrix/internal/ka;
    //   347: putfield w : Lme/rerere/matrix/internal/ka;
    //   350: goto -> 407
    //   353: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   356: athrow
    //   357: aload #24
    //   359: invokevirtual b : ()Lme/rerere/matrix/internal/vk;
    //   362: new me/rerere/matrix/internal/ka
    //   365: dup
    //   366: lload #12
    //   368: iconst_0
    //   369: iconst_0
    //   370: iconst_0
    //   371: new me/rerere/matrix/internal/aa
    //   374: dup
    //   375: aload #22
    //   377: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   380: aload #23
    //   382: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
    //   385: lload #10
    //   387: dup2_x1
    //   388: pop2
    //   389: getstatic me/rerere/matrix/internal/xk.b : Ljava/util/Set;
    //   392: iconst_0
    //   393: iconst_0
    //   394: iconst_0
    //   395: getstatic me/rerere/matrix/internal/xk.b : Ljava/util/Set;
    //   398: invokespecial <init> : (Lorg/bukkit/util/Vector;JLorg/bukkit/util/Vector;Ljava/util/Set;ZZZLjava/util/Set;)V
    //   401: invokespecial <init> : (JZZZLme/rerere/matrix/internal/aa;)V
    //   404: putfield w : Lme/rerere/matrix/internal/ka;
    //   407: aload #24
    //   409: invokevirtual b : ()Lme/rerere/matrix/internal/vk;
    //   412: iconst_0
    //   413: putfield z : Z
    //   416: aload #24
    //   418: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   421: invokevirtual b : ()Ljava/util/List;
    //   424: invokeinterface iterator : ()Ljava/util/Iterator;
    //   429: astore #25
    //   431: aload #25
    //   433: invokeinterface hasNext : ()Z
    //   438: ifeq -> 537
    //   441: aload #25
    //   443: invokeinterface next : ()Ljava/lang/Object;
    //   448: checkcast me/rerere/matrix/internal/zk
    //   451: astore #26
    //   453: aload #26
    //   455: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   458: lload #6
    //   460: invokevirtual b : (J)Z
    //   463: ifeq -> 534
    //   466: aload #24
    //   468: iload #18
    //   470: iload #19
    //   472: i2s
    //   473: iload #20
    //   475: invokevirtual t : (ISI)Z
    //   478: ifne -> 534
    //   481: goto -> 488
    //   484: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   487: athrow
    //   488: aload #26
    //   490: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   493: aload #21
    //   495: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   500: lload #8
    //   502: dup2_x1
    //   503: pop2
    //   504: invokevirtual b : (JLorg/bukkit/World;)Z
    //   507: ifeq -> 534
    //   510: goto -> 517
    //   513: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   516: athrow
    //   517: aload #26
    //   519: aload_1
    //   520: aload #22
    //   522: aload #23
    //   524: invokevirtual b : (Lorg/bukkit/event/player/PlayerMoveEvent;Lorg/bukkit/Location;Lorg/bukkit/Location;)V
    //   527: goto -> 534
    //   530: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   533: athrow
    //   534: goto -> 431
    //   537: aload #24
    //   539: lload #14
    //   541: aload #21
    //   543: invokestatic p : (JLorg/bukkit/entity/Player;)Z
    //   546: invokevirtual t : (Z)V
    //   549: return
    // Exception table:
    //   from	to	target	type
    //   110	126	129	java/lang/RuntimeException
    //   118	145	145	java/lang/RuntimeException
    //   149	175	178	java/lang/RuntimeException
    //   162	194	194	java/lang/RuntimeException
    //   198	215	215	java/lang/RuntimeException
    //   219	230	230	java/lang/RuntimeException
    //   234	258	258	java/lang/RuntimeException
    //   262	286	286	java/lang/RuntimeException
    //   308	314	314	java/lang/RuntimeException
    //   318	353	353	java/lang/RuntimeException
    //   453	481	484	java/lang/RuntimeException
    //   466	510	513	java/lang/RuntimeException
    //   488	527	530	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.HIGH)
  public void b(@NotNull PlayerItemConsumeEvent paramPlayerItemConsumeEvent) {
    long l1 = a ^ 0x7DD839F6CA42L;
    long l2 = l1 ^ 0x4D2B1D36243CL;
    long l3 = l1 ^ 0x6906E22BD118L;
    int i = (int)((l1 ^ 0x719B33CF5B0AL) >>> 32L);
    int j = (int)((l1 ^ 0x719B33CF5B0AL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x719B33CF5B0AL) << 48L >>> 48L);
    l1 ^ 0x719B33CF5B0AL;
    int m = (int)((l1 ^ 0x1F2AB8DB2B7CL) >>> 32L);
    int n = (int)((l1 ^ 0x1F2AB8DB2B7CL) << 32L >>> 48L);
    int i1 = (int)((l1 ^ 0x1F2AB8DB2B7CL) << 48L >>> 48L);
    l1 ^ 0x1F2AB8DB2B7CL;
    Player player = paramPlayerItemConsumeEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(m, (short)n, i1))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(i, (short)j, (char)k, paramPlayerItemConsumeEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull BlockPistonExtendEvent paramBlockPistonExtendEvent) {
    long l1 = a ^ 0x5F3EA9BD5EF4L;
    long l2 = l1 ^ 0x2C4D1B01B9B2L;
    for (Block block : paramBlockPistonExtendEvent.getBlocks()) {
      for (Player player : ta.b(block.getLocation(), l2)) {
        yl yl = Matrix.b().b().b(player.getUniqueId());
        try {
          if (yl != null)
            (yl.b()).f.b(block); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
    for (Player player : ta.b(paramBlockPistonExtendEvent.getBlock().getLocation(), l2)) {
      yl yl = Matrix.b().b().b(player.getUniqueId());
      try {
        if (yl != null)
          (yl.b()).f.b(paramBlockPistonExtendEvent.getBlock()); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull BlockExplodeEvent paramBlockExplodeEvent) {
    paramBlockExplodeEvent.blockList().forEach(Matrix.b().b()::b);
  }
  
  @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
  public void b(@NotNull EntityShootBowEvent paramEntityShootBowEvent) {
    long l1 = a ^ 0x339009AEE045L;
    long l2 = l1 ^ 0x3632D6E0E3BL;
    long l3 = l1 ^ 0x274ED273FB1FL;
    int i = (int)((l1 ^ 0x1EB7811DE504L) >>> 48L);
    long l4 = (l1 ^ 0x1EB7811DE504L) << 16L >>> 16L;
    l1 ^ 0x1EB7811DE504L;
    int j = (int)((l1 ^ 0x51628883017BL) >>> 32L);
    int k = (int)((l1 ^ 0x51628883017BL) << 32L >>> 48L);
    int m = (int)((l1 ^ 0x51628883017BL) << 48L >>> 48L);
    l1 ^ 0x51628883017BL;
    if (paramEntityShootBowEvent.getEntity() instanceof Player) {
      Player player = (Player)paramEntityShootBowEvent.getEntity();
      yl yl = Matrix.b().b().b(player.getUniqueId());
      try {
        if (yl == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      for (zk zk : yl.b().b()) {
        try {
          if (zk.b().b(l2))
            try {
              if (!yl.t(j, (short)k, m))
                try {
                  if (zk.b().b(l3, player.getWorld()))
                    zk.b((char)i, l4, paramEntityShootBowEvent); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull VehicleExitEvent paramVehicleExitEvent) {
    long l1 = a ^ 0x24E75A9F4FA0L;
    long l2 = l1 ^ 0x14147E5FA1DEL;
    long l3 = l1 ^ 0x3039814254FAL;
    int i = (int)((l1 ^ 0x4615DBB2AE9EL) >>> 32L);
    int j = (int)((l1 ^ 0x4615DBB2AE9EL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x4615DBB2AE9EL) << 48L >>> 48L);
    l1 ^ 0x4615DBB2AE9EL;
    if (paramVehicleExitEvent.getExited() instanceof Player) {
      Player player = (Player)paramVehicleExitEvent.getExited();
      yl yl = Matrix.b().b().b(player.getUniqueId());
      if (yl != null)
        for (zk zk : yl.b().b()) {
          try {
            if (zk.b().b(l2))
              try {
                if (!yl.t(i, (short)j, k))
                  try {
                    if (zk.b().b(l3, player.getWorld()))
                      zk.b(paramVehicleExitEvent); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        }  
    } 
  }
  
  static {
    // Byte code:
    //   0: ldc2_w 4513988181818085218
    //   3: ldc2_w 6989978805437038964
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   15: ldc2_w 233439333319830
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/rerere/matrix/internal/xk.a : J
    //   26: getstatic me/rerere/matrix/internal/xk.a : J
    //   29: ldc2_w 53955470550387
    //   32: lxor
    //   33: lstore #9
    //   35: lload #9
    //   37: dup2
    //   38: ldc2_w 17019140896687
    //   41: lxor
    //   42: lstore #11
    //   44: pop2
    //   45: new java/util/HashMap
    //   48: dup
    //   49: bipush #13
    //   51: invokespecial <init> : (I)V
    //   54: putstatic me/rerere/matrix/internal/xk.e : Ljava/util/Map;
    //   57: ldc_w 'DES/CBC/PKCS5Padding'
    //   60: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   63: dup
    //   64: astore_0
    //   65: iconst_2
    //   66: ldc_w 'DES'
    //   69: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   72: bipush #8
    //   74: newarray byte
    //   76: dup
    //   77: iconst_0
    //   78: lload #9
    //   80: bipush #56
    //   82: lushr
    //   83: l2i
    //   84: i2b
    //   85: bastore
    //   86: iconst_1
    //   87: istore_1
    //   88: iload_1
    //   89: bipush #8
    //   91: if_icmpge -> 115
    //   94: dup
    //   95: iload_1
    //   96: lload #9
    //   98: iload_1
    //   99: bipush #8
    //   101: imul
    //   102: lshl
    //   103: bipush #56
    //   105: lushr
    //   106: l2i
    //   107: i2b
    //   108: bastore
    //   109: iinc #1, 1
    //   112: goto -> 88
    //   115: new javax/crypto/spec/DESKeySpec
    //   118: dup_x1
    //   119: swap
    //   120: invokespecial <init> : ([B)V
    //   123: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   126: new javax/crypto/spec/IvParameterSpec
    //   129: dup
    //   130: bipush #8
    //   132: newarray byte
    //   134: invokespecial <init> : ([B)V
    //   137: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   140: bipush #32
    //   142: anewarray java/lang/String
    //   145: astore #7
    //   147: iconst_0
    //   148: istore #5
    //   150: ldc_w '©g&ß7Tù%æ@Û®÷½¦[³Ì´Ãg®ÿÁÂ)üBgãù÷a0¥¢/5"øÚàÃ¯«û°I* <7um+8Å-#ðc8@Fà¶í¾b¶ôHÁºÅ(U#Vö®,¦ÅªT÷ØrÇq&ÿ÷¯6xî¤C sÔÑfrù³¯!'éöÜ¤üiiîS3óQß©B\\nÔ3±H¥ \Z/M¤0¶ôÙ\\tMEe¹nùs0!¸-{xSº&ÐKí  {^²$KW\\fÚA\\t{)Ü}8¿Q|t.(×»´ Ð¡ðÞUÙcHM]È·HÔÖ!Ð8v?9yJ3û8¸¿`~ä$ß¡\\tL,\\nQCR$ÔJ|Ý>s¶®sN[ô!l?êø²¸æÿìN |£ZtS%µCî(ôíòVñ=p¦kM.:R§$J)H>¢K4?{±º(6¹~K"¨ÍP:5ÍðhèüXkÛÝ¸\\f*¤{À­Bº0\\n·Ï¸Á»½·\Í-Eìp×îÌºÀO´Ôrÿy¹Ü[Ü"e#LImJ u© GvÛ°åØ~3v`&hNU:VÙ,Ï·1Ô\\f(*ËxRh¼Æ*~Þ,¥+ÀVpÅa*ÁäÀ+ººZr£¸(ÕìÈ;ÁáÈ1ò¨ùÞ'8iYP³Xó&5<øÌÔB oÅ\ÜÇ'Ê« °¯Î3-<`d»ÀôÏ-$q÷Qâ5­aMõ%XÑðÙ¶½÷¡}GüHz@RuÒwZôçÔéNñ'Ã¸\ÖÙ@Âµî©sð\\bÍür³Lî\\rBsáOXi{iÌ<¿hä7KjÓr¦\\nò`¿ùý¬1DO=ú1W1ÛÅØ\\b½¦Vçg­ÝÐÌWDÉÂf$,uÚo±ZÇ¹Ø o-Èv7½cIöËÈó,Ïàz<Zº²r-==Á`Öp¥ß>s6þYËmçwþ(Pw½ZµÐ¸E\\b/,Îr¡¿Ûd¯Ó¦NbË¨&rL6&ï\À\\nýy?§dBöþì ÔòÞßÜ U9p[ÑyÍSCxµ#ÁÝ¼´ü ´Ç­gpÜòÊ¸[=XA%ôMr¼âµ<[\\bë³ÁÀ,jkM("8ôg»@è¹RSP{ëêUÉ.õÍâ=]ÄB%åµ6æ'8Ñz:}\\bæú»Þ6Ì|¯ÚÝÊ A°±JýèuÛÛlØÿ_êG½jBÆ4çj\\bDÖ7(«ç1«å¡=¤ñ(e¶æ4ñX[©·¹³àÛþÞz~,2ÉÆ(ÍÖÔÁû{) å8v0°/\\f+4Oha®?Çiao¦¾áJCq hh¾ØìWÖþh\\rmñÈ7 ;ÔÐôÎÇ$Ú2ãP ^µ¯{ªúwwtÖ½D±²tôô¬Ce_¸»]Áà_$Y1{{ÆðÐtÌÿ½Ì.­ q°?V¼S²TãR¤ó»uÊ¦{ìe¶â¤hÐ]ûú:°þåáZ<ô·þAeß]F¯Î-È]0ÉàwãÄgXàÑ ßcõÔÙ;ø°ÔÛÜÜA+Ä{Í_¯ÇBjy'
    //   153: dup
    //   154: astore #4
    //   156: invokevirtual length : ()I
    //   159: istore #6
    //   161: bipush #24
    //   163: istore_3
    //   164: iconst_m1
    //   165: istore_2
    //   166: iinc #2, 1
    //   169: aload #4
    //   171: iload_2
    //   172: dup
    //   173: iload_3
    //   174: iadd
    //   175: invokevirtual substring : (II)Ljava/lang/String;
    //   178: iconst_m1
    //   179: goto -> 290
    //   182: aload #7
    //   184: swap
    //   185: iload #5
    //   187: iinc #5, 1
    //   190: swap
    //   191: aastore
    //   192: iload_2
    //   193: iload_3
    //   194: iadd
    //   195: dup
    //   196: istore_2
    //   197: iload #6
    //   199: if_icmpge -> 212
    //   202: aload #4
    //   204: iload_2
    //   205: invokevirtual charAt : (I)C
    //   208: istore_3
    //   209: goto -> 166
    //   212: ldc_w 'LGôÕZþ-}gá\\fÏèVûôðÚì£ù¬Á!A¨QfEùüá"\\rcVuîÖ»¯:ù¡óévIcf'h·å<úêö'óÎl§¦ç jDG3ç««É-[rE}OÒÕmÈ/aïA¼ \\r"¦.'
    //   215: dup
    //   216: astore #4
    //   218: invokevirtual length : ()I
    //   221: istore #6
    //   223: bipush #88
    //   225: istore_3
    //   226: iconst_m1
    //   227: istore_2
    //   228: iinc #2, 1
    //   231: aload #4
    //   233: iload_2
    //   234: dup
    //   235: iload_3
    //   236: iadd
    //   237: invokevirtual substring : (II)Ljava/lang/String;
    //   240: iconst_0
    //   241: goto -> 290
    //   244: aload #7
    //   246: swap
    //   247: iload #5
    //   249: iinc #5, 1
    //   252: swap
    //   253: aastore
    //   254: iload_2
    //   255: iload_3
    //   256: iadd
    //   257: dup
    //   258: istore_2
    //   259: iload #6
    //   261: if_icmpge -> 274
    //   264: aload #4
    //   266: iload_2
    //   267: invokevirtual charAt : (I)C
    //   270: istore_3
    //   271: goto -> 228
    //   274: aload #7
    //   276: putstatic me/rerere/matrix/internal/xk.c : [Ljava/lang/String;
    //   279: bipush #32
    //   281: anewarray java/lang/String
    //   284: putstatic me/rerere/matrix/internal/xk.d : [Ljava/lang/String;
    //   287: goto -> 332
    //   290: swap
    //   291: ldc_w 'ISO-8859-1'
    //   294: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   297: aload_0
    //   298: swap
    //   299: invokevirtual doFinal : ([B)[B
    //   302: astore #8
    //   304: aload #8
    //   306: invokestatic a : ([B)Ljava/lang/String;
    //   309: invokevirtual intern : ()Ljava/lang/String;
    //   312: swap
    //   313: tableswitch default -> 182, 0 -> 244
    //   332: sipush #9930
    //   335: ldc2_w 6624610473512524828
    //   338: lload #9
    //   340: lxor
    //   341: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   346: lload #11
    //   348: invokestatic j : (Ljava/lang/String;J)Ljava/lang/String;
    //   351: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   354: putstatic me/rerere/matrix/internal/xk.i : Ljava/lang/Class;
    //   357: goto -> 367
    //   360: astore #13
    //   362: aload #13
    //   364: invokevirtual printStackTrace : ()V
    //   367: new java/util/HashSet
    //   370: dup
    //   371: invokespecial <init> : ()V
    //   374: putstatic me/rerere/matrix/internal/xk.b : Ljava/util/Set;
    //   377: return
    // Exception table:
    //   from	to	target	type
    //   332	357	360	java/lang/ClassNotFoundException
  }
  
  @EventHandler(priority = EventPriority.HIGH)
  public void b(@NotNull BlockPlaceEvent paramBlockPlaceEvent) {
    long l1 = a ^ 0x5C229907324EL;
    int i = (int)((l1 ^ 0x22AF54C568D4L) >>> 48L);
    int j = (int)((l1 ^ 0x22AF54C568D4L) << 16L >>> 32L);
    int k = (int)((l1 ^ 0x22AF54C568D4L) << 48L >>> 48L);
    l1 ^ 0x22AF54C568D4L;
    long l2 = l1 ^ 0x6CD1BDC7DC30L;
    long l3 = l1 ^ 0x48FC42DA2914L;
    int m = (int)((l1 ^ 0x3ED0182AD370L) >>> 32L);
    int n = (int)((l1 ^ 0x3ED0182AD370L) << 32L >>> 48L);
    int i1 = (int)((l1 ^ 0x3ED0182AD370L) << 48L >>> 48L);
    l1 ^ 0x3ED0182AD370L;
    try {
      if (paramBlockPlaceEvent.getClass() != BlockPlaceEvent.class)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (pd.f)
        paramBlockPlaceEvent.setCancelled(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Player player = paramBlockPlaceEvent.getPlayer();
    try {
      if (!i.isInstance(player))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(m, (short)n, i1))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b((char)i, paramBlockPlaceEvent, j, k); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.HIGH)
  public void b(@NotNull PlayerAnimationEvent paramPlayerAnimationEvent) {
    long l1 = a ^ 0x1A49267C3E73L;
    long l2 = l1 ^ 0x2ABA02BCD00DL;
    long l3 = l1 ^ 0xE97FDA12529L;
    int i = (int)((l1 ^ 0x78BBA751DF4DL) >>> 32L);
    int j = (int)((l1 ^ 0x78BBA751DF4DL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x78BBA751DF4DL) << 48L >>> 48L);
    l1 ^ 0x78BBA751DF4DL;
    Player player = paramPlayerAnimationEvent.getPlayer();
    try {
      if (paramPlayerAnimationEvent.getAnimationType() != PlayerAnimationType.ARM_SWING)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerAnimationEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.HIGHEST)
  public void b(@NotNull PlayerRespawnEvent paramPlayerRespawnEvent) {
    long l1 = a ^ 0x23217C5896FL;
    long l2 = l1 ^ 0x32C133056711L;
    long l3 = l1 ^ 0x16ECCC189235L;
    int i = (int)((l1 ^ 0x60C096E86851L) >>> 32L);
    int j = (int)((l1 ^ 0x60C096E86851L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x60C096E86851L) << 48L >>> 48L);
    l1 ^ 0x60C096E86851L;
    Player player = paramPlayerRespawnEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerRespawnEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    long l1 = a ^ 0x2A1BF1C7D0C5L;
    long l2 = l1 ^ 0x4C6B38F7A767L;
    long l3 = l1 ^ 0x1AE8D5073EBBL;
    long l4 = l1 ^ 0x3EC52A1ACB9FL;
    int i = (int)((l1 ^ 0x48E970EA31FBL) >>> 32L);
    int j = (int)((l1 ^ 0x48E970EA31FBL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x48E970EA31FBL) << 48L >>> 48L);
    l1 ^ 0x48E970EA31FBL;
    Player player = paramPlayerTeleportEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramPlayerTeleportEvent.getTo() == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l3))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l4, player.getWorld()))
                  zk.b(l2, paramPlayerTeleportEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.LOWEST)
  public void b(@NotNull BlockBreakEvent paramBlockBreakEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 79459053423423
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 92040575428179
    //   13: lxor
    //   14: dup2
    //   15: bipush #48
    //   17: lushr
    //   18: l2i
    //   19: istore #4
    //   21: dup2
    //   22: bipush #16
    //   24: lshl
    //   25: bipush #32
    //   27: lushr
    //   28: l2i
    //   29: istore #5
    //   31: dup2
    //   32: bipush #48
    //   34: lshl
    //   35: bipush #48
    //   37: lushr
    //   38: l2i
    //   39: istore #6
    //   41: pop2
    //   42: dup2
    //   43: ldc2_w 132730132604225
    //   46: lxor
    //   47: lstore #7
    //   49: dup2
    //   50: ldc2_w 101818029461605
    //   53: lxor
    //   54: lstore #9
    //   56: dup2
    //   57: ldc2_w 46961198279169
    //   60: lxor
    //   61: dup2
    //   62: bipush #32
    //   64: lushr
    //   65: l2i
    //   66: istore #11
    //   68: dup2
    //   69: bipush #32
    //   71: lshl
    //   72: bipush #48
    //   74: lushr
    //   75: l2i
    //   76: istore #12
    //   78: dup2
    //   79: bipush #48
    //   81: lshl
    //   82: bipush #48
    //   84: lushr
    //   85: l2i
    //   86: istore #13
    //   88: pop2
    //   89: pop2
    //   90: getstatic me/rerere/matrix/internal/pd.s : Z
    //   93: ifeq -> 108
    //   96: aload_1
    //   97: iconst_1
    //   98: invokevirtual setCancelled : (Z)V
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_1
    //   109: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   112: astore #14
    //   114: getstatic me/rerere/matrix/internal/xk.i : Ljava/lang/Class;
    //   117: aload #14
    //   119: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   122: ifne -> 130
    //   125: return
    //   126: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   129: athrow
    //   130: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   133: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   136: aload #14
    //   138: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   143: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   146: astore #15
    //   148: aload #15
    //   150: ifnonnull -> 158
    //   153: return
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: aload_1
    //   159: invokevirtual getBlock : ()Lorg/bukkit/block/Block;
    //   162: sipush #27688
    //   165: ldc2_w 4537400028450994338
    //   168: lload_2
    //   169: lxor
    //   170: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   175: invokeinterface hasMetadata : (Ljava/lang/String;)Z
    //   180: ifeq -> 188
    //   183: return
    //   184: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   187: athrow
    //   188: aload_1
    //   189: invokevirtual getClass : ()Ljava/lang/Class;
    //   192: ldc_w org/bukkit/event/block/BlockBreakEvent
    //   195: if_acmpeq -> 203
    //   198: return
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: aload #15
    //   205: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   208: invokevirtual b : ()Ljava/util/List;
    //   211: invokeinterface iterator : ()Ljava/util/Iterator;
    //   216: astore #16
    //   218: aload #16
    //   220: invokeinterface hasNext : ()Z
    //   225: ifeq -> 327
    //   228: aload #16
    //   230: invokeinterface next : ()Ljava/lang/Object;
    //   235: checkcast me/rerere/matrix/internal/zk
    //   238: astore #17
    //   240: aload #17
    //   242: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   245: lload #7
    //   247: invokevirtual b : (J)Z
    //   250: ifeq -> 324
    //   253: aload #15
    //   255: iload #11
    //   257: iload #12
    //   259: i2s
    //   260: iload #13
    //   262: invokevirtual t : (ISI)Z
    //   265: ifne -> 324
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   274: athrow
    //   275: aload #17
    //   277: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   280: aload #14
    //   282: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   287: lload #9
    //   289: dup2_x1
    //   290: pop2
    //   291: invokevirtual b : (JLorg/bukkit/World;)Z
    //   294: ifeq -> 324
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   303: athrow
    //   304: aload #17
    //   306: iload #4
    //   308: i2s
    //   309: iload #5
    //   311: iload #6
    //   313: aload_1
    //   314: invokevirtual b : (SIILorg/bukkit/event/block/BlockBreakEvent;)V
    //   317: goto -> 324
    //   320: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   323: athrow
    //   324: goto -> 218
    //   327: return
    // Exception table:
    //   from	to	target	type
    //   90	101	104	java/lang/RuntimeException
    //   114	126	126	java/lang/RuntimeException
    //   148	154	154	java/lang/RuntimeException
    //   158	184	184	java/lang/RuntimeException
    //   188	199	199	java/lang/RuntimeException
    //   240	268	271	java/lang/RuntimeException
    //   253	297	300	java/lang/RuntimeException
    //   275	317	320	java/lang/RuntimeException
  }
  
  @EventHandler
  public void b(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/xk.a : J
    //   3: ldc2_w 45183538232315
    //   6: lxor
    //   7: lstore_2
    //   8: lload_2
    //   9: dup2
    //   10: ldc2_w 28498055796101
    //   13: lxor
    //   14: lstore #4
    //   16: dup2
    //   17: ldc2_w 67923958030497
    //   20: lxor
    //   21: lstore #6
    //   23: dup2
    //   24: ldc2_w 83471038094021
    //   27: lxor
    //   28: dup2
    //   29: bipush #32
    //   31: lushr
    //   32: l2i
    //   33: istore #8
    //   35: dup2
    //   36: bipush #32
    //   38: lshl
    //   39: bipush #48
    //   41: lushr
    //   42: l2i
    //   43: istore #9
    //   45: dup2
    //   46: bipush #48
    //   48: lshl
    //   49: bipush #48
    //   51: lushr
    //   52: l2i
    //   53: istore #10
    //   55: pop2
    //   56: pop2
    //   57: aload_1
    //   58: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   61: instanceof org/bukkit/entity/Player
    //   64: ifne -> 72
    //   67: return
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: aload_1
    //   73: invokevirtual getEntity : ()Lorg/bukkit/entity/Entity;
    //   76: checkcast org/bukkit/entity/Player
    //   79: astore #11
    //   81: aload_1
    //   82: invokevirtual getDamager : ()Lorg/bukkit/entity/Entity;
    //   85: instanceof org/bukkit/entity/LivingEntity
    //   88: ifne -> 96
    //   91: return
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: invokestatic b : ()Lme/rerere/matrix/Matrix;
    //   99: invokevirtual b : ()Lme/rerere/matrix/internal/mn;
    //   102: aload #11
    //   104: invokeinterface getUniqueId : ()Ljava/util/UUID;
    //   109: invokevirtual b : (Ljava/util/UUID;)Lme/rerere/matrix/internal/yl;
    //   112: astore #12
    //   114: aload #12
    //   116: ifnonnull -> 124
    //   119: return
    //   120: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   123: athrow
    //   124: aload #12
    //   126: invokevirtual b : ()Lme/rerere/matrix/internal/hn;
    //   129: invokevirtual b : ()Ljava/util/List;
    //   132: invokeinterface iterator : ()Ljava/util/Iterator;
    //   137: astore #13
    //   139: aload #13
    //   141: invokeinterface hasNext : ()Z
    //   146: ifeq -> 303
    //   149: aload #13
    //   151: invokeinterface next : ()Ljava/lang/Object;
    //   156: checkcast me/rerere/matrix/internal/zk
    //   159: astore #14
    //   161: aload #14
    //   163: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   166: lload #4
    //   168: invokevirtual b : (J)Z
    //   171: ifeq -> 300
    //   174: aload #12
    //   176: iload #8
    //   178: iload #9
    //   180: i2s
    //   181: iload #10
    //   183: invokevirtual t : (ISI)Z
    //   186: ifne -> 300
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   195: athrow
    //   196: aload #14
    //   198: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   201: aload #11
    //   203: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   208: lload #6
    //   210: dup2_x1
    //   211: pop2
    //   212: invokevirtual b : (JLorg/bukkit/World;)Z
    //   215: ifeq -> 300
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   224: athrow
    //   225: aload #14
    //   227: aload_1
    //   228: invokevirtual p : (Lorg/bukkit/event/entity/EntityDamageByEntityEvent;)V
    //   231: goto -> 300
    //   234: astore #15
    //   236: aload #15
    //   238: invokevirtual printStackTrace : ()V
    //   241: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   244: new java/lang/StringBuilder
    //   247: dup
    //   248: invokespecial <init> : ()V
    //   251: sipush #9829
    //   254: ldc2_w 2382560787189809720
    //   257: lload_2
    //   258: lxor
    //   259: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: aload #14
    //   269: invokevirtual b : ()Lme/rerere/matrix/internal/yk;
    //   272: invokevirtual j : ()Ljava/lang/String;
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: sipush #31753
    //   281: ldc2_w 3487533172697503833
    //   284: lload_2
    //   285: lxor
    //   286: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: invokevirtual toString : ()Ljava/lang/String;
    //   297: invokevirtual println : (Ljava/lang/String;)V
    //   300: goto -> 139
    //   303: return
    // Exception table:
    //   from	to	target	type
    //   57	68	68	java/lang/Exception
    //   81	92	92	java/lang/Exception
    //   114	120	120	java/lang/Exception
    //   161	189	192	java/lang/Exception
    //   174	218	221	java/lang/Exception
    //   225	231	234	java/lang/Exception
  }
  
  @EventHandler(priority = EventPriority.MONITOR)
  public void b(@NotNull PlayerVelocityEvent paramPlayerVelocityEvent) {
    long l1 = a ^ 0x42F621EAD70FL;
    long l2 = l1 ^ 0x7205052A3971L;
    long l3 = l1 ^ 0x5628FA37CC55L;
    int i = (int)((l1 ^ 0x2004A0C73631L) >>> 32L);
    int j = (int)((l1 ^ 0x2004A0C73631L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x2004A0C73631L) << 48L >>> 48L);
    l1 ^ 0x2004A0C73631L;
    Player player = paramPlayerVelocityEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerVelocityEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
  public void b(@NotNull BlockDamageEvent paramBlockDamageEvent) {
    long l1 = a ^ 0x14492E4D6A25L;
    long l2 = l1 ^ 0x24BA0A8D845BL;
    long l3 = l1 ^ 0x97F590717FL;
    int i = (int)((l1 ^ 0x76BBAF608B1BL) >>> 32L);
    int j = (int)((l1 ^ 0x76BBAF608B1BL) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x76BBAF608B1BL) << 48L >>> 48L);
    l1 ^ 0x76BBAF608B1BL;
    Player player = paramBlockDamageEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramBlockDamageEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  @EventHandler
  public void b(@NotNull PlayerItemHeldEvent paramPlayerItemHeldEvent) {
    long l1 = a ^ 0x53C8BAC22FE7L;
    long l2 = l1 ^ 0x633B9E02C199L;
    long l3 = l1 ^ 0x4716611F34BDL;
    int i = (int)((l1 ^ 0x313A3BEFCED9L) >>> 32L);
    int j = (int)((l1 ^ 0x313A3BEFCED9L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0x313A3BEFCED9L) << 48L >>> 48L);
    l1 ^ 0x313A3BEFCED9L;
    Player player = paramPlayerItemHeldEvent.getPlayer();
    yl yl = Matrix.b().b().b(player.getUniqueId());
    try {
      if (yl == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (zk zk : yl.b().b()) {
      try {
        if (zk.b().b(l2))
          try {
            if (!yl.t(i, (short)j, k))
              try {
                if (zk.b().b(l3, player.getWorld()))
                  zk.b(paramPlayerItemHeldEvent); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x630A;
    if (d[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])e.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          e.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/xk", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/internal/xk'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class rk extends BukkitRunnable implements Listener {
  @NotNull
  private final Map v = new LinkedHashMap<>();
  
  @NotNull
  private static final List b;
  
  @NotNull
  public static final oh i;
  
  private static yk[] a;
  
  private static final long c = o3.a(-2335556864567944384L, -859059183171470636L, MethodHandles.lookup().lookupClass()).a(199464890695726L);
  
  private static final String d;
  
  public rk() {
    Bukkit.getPluginManager().registerEvents(this, (Plugin)Matrix.q.b(l2));
    runTaskTimerAsynchronously((Plugin)Matrix.q.b(l2), 20L, ge.r * 20L);
  }
  
  public final void b(@NotNull Player paramPlayer) {
    long l1 = c ^ 0x6159FB1E042CL;
    long l2 = l1 ^ 0x32637243BC67L;
    long l3 = l1 ^ 0x6B240FD46953L;
    long l4 = l1 ^ 0x2C60A74C0430L;
    int i = yl.a();
    try {
      if (i == 0)
        try {
          if (!this.v.containsKey(paramPlayer.getUniqueId()))
            this.v.put(paramPlayer.getUniqueId(), new ai(paramPlayer.getUniqueId(), null, 2, l2, null)); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ai ai = (ai)this.v.get(paramPlayer.getUniqueId());
    Iterator<String> iterator = b.iterator();
    while (true) {
      while (iterator.hasNext()) {
        String str = iterator.next();
        Intrinsics.checkNotNull(ai);
        ai.b(str, paramPlayer.hasPermission(str));
        if (i == 0 && StringsKt.equals(str, d, true)) {
          yl yl = Matrix.q.b(l4).b().b(paramPlayer.getUniqueId());
          try {
            if (i == 0) {
              try {
                if (yl == null)
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              yl.h(ai.b(l3, str));
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          if (i != 0)
            break; 
        } 
      } 
      break;
    } 
  }
  
  public static final boolean j(@NotNull Player paramPlayer, @NotNull String paramString) {
    long l1 = c ^ 0x1D4FBE615950L;
    long l2 = (l1 ^ 0x4B4CF1532BL) >>> 16L;
    int i = (int)((l1 ^ 0x4B4CF1532BL) << 48L >>> 48L);
    l1 ^ 0x4B4CF1532BL;
    return i.b(paramPlayer, l2, (short)i, paramString);
  }
  
  public final boolean b(@NotNull Player paramPlayer, @NotNull String paramString) {
    long l1 = c ^ 0x275CC948091AL;
    long l2 = l1 ^ 0x2D213D826465L;
    ai ai = (ai)this.v.get(paramPlayer.getUniqueId());
    Intrinsics.checkNotNull(ai);
    return ai.b(l2, paramString);
  }
  
  static {
    long l1 = c ^ 0x6216FC3ED162L;
    long l2 = l1 ^ 0x2F2FA06CD17EL;
    if (g() != null)
      G(new yk[1]); 
    (new byte[8])[0] = (byte)(int)(l1 >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l1 << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  @EventHandler
  public final void b(@NotNull PlayerJoinEvent paramPlayerJoinEvent) {
    b(paramPlayerJoinEvent.getPlayer());
  }
  
  public void run() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/rk.c : J
    //   3: ldc2_w 32699057753484
    //   6: lxor
    //   7: lstore_1
    //   8: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
    //   11: checkcast java/lang/Iterable
    //   14: astore #4
    //   16: iconst_0
    //   17: istore #5
    //   19: invokestatic a : ()I
    //   22: aload #4
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #6
    //   31: istore_3
    //   32: aload #6
    //   34: invokeinterface hasNext : ()Z
    //   39: ifeq -> 83
    //   42: aload #6
    //   44: invokeinterface next : ()Ljava/lang/Object;
    //   49: astore #7
    //   51: aload #7
    //   53: checkcast org/bukkit/entity/Player
    //   56: astore #8
    //   58: iconst_0
    //   59: istore #9
    //   61: aload_0
    //   62: aload #8
    //   64: invokevirtual b : (Lorg/bukkit/entity/Player;)V
    //   67: nop
    //   68: iload_3
    //   69: ifne -> 84
    //   72: iload_3
    //   73: ifeq -> 32
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   82: athrow
    //   83: nop
    //   84: return
    // Exception table:
    //   from	to	target	type
    //   61	76	79	java/lang/RuntimeException
  }
  
  @EventHandler(priority = EventPriority.HIGH)
  public final void b(@NotNull PlayerQuitEvent paramPlayerQuitEvent) {
    this.v.remove(paramPlayerQuitEvent.getPlayer().getUniqueId());
  }
  
  public static void G(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] g() {
    return a;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.util.Vector;

public final class pn extends zk {
  @Nullable
  private PlayerMoveEvent u = null;
  
  private boolean w;
  
  private long f;
  
  private long l;
  
  private double r;
  
  private double x;
  
  private long z;
  
  private double k;
  
  private boolean v = false;
  
  private long b;
  
  private static boolean i;
  
  private static final long a = o3.a(-5169821802071519802L, 3940624513797435611L, MethodHandles.lookup().lookupClass()).a(232239273218051L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void b(char paramChar, int paramInt, @NotNull PlayerInteractEvent paramPlayerInteractEvent, short paramShort) {
    try {
      if (paramPlayerInteractEvent.getAction() == Action.RIGHT_CLICK_BLOCK)
        try {
          if (paramPlayerInteractEvent.getClickedBlock() != null && da.n(paramPlayerInteractEvent.getClickedBlock().getType())) {
            Block block = paramPlayerInteractEvent.getClickedBlock();
            Matrix.b().b().b(paramPlayerInteractEvent.getPlayer().getWorld(), block.getX(), block.getY(), block.getZ());
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    Block block = paramBlockPlaceEvent.getBlock();
    Player player = paramBlockPlaceEvent.getPlayer();
    try {
      if (block.getLocation().equals(paramBlockPlaceEvent.getBlockAgainst().getLocation()))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (pc.j() - this.z > 1000L)
        try {
          if (na.f(player.getLocation()))
            try {
              if (!na.t(player.getLocation()))
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Matrix.b().b().b(paramBlockPlaceEvent.getPlayer().getWorld(), block.getX(), block.getY(), block.getZ());
  }
  
  public void b(short paramShort, int paramInt1, int paramInt2, @NotNull BlockBreakEvent paramBlockBreakEvent) {
    Block block = paramBlockBreakEvent.getBlock();
    Matrix.b().b().b(paramBlockBreakEvent.getPlayer().getWorld(), block.getX(), block.getY(), block.getZ());
  }
  
  public void b(@NotNull PlayerAnimationEvent paramPlayerAnimationEvent) {
    this.z = pc.j();
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pn.a : J
    //   3: ldc2_w 38461100295962
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #9616
    //   15: ldc2_w 3797154587608641484
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> h : (IJ)Ljava/lang/String;
    //   25: iconst_0
    //   26: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   31: putstatic me/rerere/matrix/internal/pn.i : Z
    //   34: return
  }
  
  public pn(yl paramyl) {
    super(paramyl);
    b(yk.y);
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    try {
      if (b.b() == 8)
        try {
          if (paramPlayerTeleportEvent.getCause() == PlayerTeleportEvent.TeleportCause.PLUGIN)
            this.u = null; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (jb.p(paramPlayerTeleportEvent.getFrom(), paramPlayerTeleportEvent.getTo()) > 20.0D)
        this.b = pc.j(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l1 = a ^ 0x5B7E3984A344L;
    long l2 = l1 ^ 0x4DC9EAEC4DEEL;
    int i = (int)((l1 ^ 0x50753A84914AL) >>> 32L);
    int j = (int)((l1 ^ 0x50753A84914AL) << 32L >>> 56L);
    int k = (int)((l1 ^ 0x50753A84914AL) << 40L >>> 40L);
    l1 ^ 0x50753A84914AL;
    if (this.v) {
      this.v = false;
      Player player1 = b().j(i, (byte)j, k);
      Location location = player1.getLocation().clone();
      try {
        if (uf.b(location))
          b(player1, location); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    Player player = paramPlayerMoveEvent.getPlayer();
    try {
      if (!player.isFlying())
        try {
          if (!player.isInsideVehicle()) {
            try {
              if (b.b() >= 9)
                try {
                  if (player.isGliding()) {
                    this.u = null;
                    this.f = pc.j();
                    return;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (pc.j() - this.f < 2000L) {
                this.u = null;
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (player.getGameMode() != GameMode.SURVIVAL)
                try {
                  if (player.getGameMode() != GameMode.ADVENTURE) {
                    this.u = null;
                    return;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (player.isDead()) {
                this.u = null;
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (b.b() >= 13)
                try {
                  if (player.isSwimming()) {
                    this.u = null;
                    return;
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            boolean bool = ta.p(l2, player);
            try {
              if (b.b() == 8) {
                try {
                  if (this.u != null)
                    b(player, this.u, bool); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                this.u = new PlayerMoveEvent(player, paramPlayerMoveEvent.getFrom(), paramPlayerMoveEvent.getTo().clone());
              } else {
                b(player, paramPlayerMoveEvent, bool);
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            return;
          } 
          this.u = null;
          return;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.u = null;
  }
  
  public void b(@NotNull PlayerRespawnEvent paramPlayerRespawnEvent) {
    vk vk = b().b();
    vk.l = null;
  }
  
  static {
    long l = a ^ 0x158BE3C5F09FL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[12];
    boolean bool = false;
    String str;
    int i = (str = "ÕDFy)ïc8«Ûö|¨X(Ù®5Îæ´0«^+ÔS¨ÇýËà¡ú\026\0318D±C£3gúò]\01751[\021R\030ªæz¾uôtÁïM)\033\003S?xU\000\b\031?{(I°êå:(g\027ç{JéiB³ý\fuë=îév7üw$\037ºêuí~ó\0204¬4C÷@s\002C7f+ V\\âÅ\016^÷WÔ=ÕÌdv¨V·,Å3kHV¦V#ÌsA)õ\020Âèµþ%3\001½ù8J,\017\020G\"8Üã+ÞYÓV)\fXU(ï@Çæ_\034SIêYÕ\031\021n8ÔÅô\näL\035/cy\000µrB<kÙ$¨E\fÌmø\022òpÔZFk¾O|\035Öì:Ø)\036rj»I8\\-FTaÙÑ\tÑ¼qBß± ¥äbg>æÿ.é¡\037å÷B\"ÁÄ\0020°R!P8Ñ").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static String c(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x759E;
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
        throw new RuntimeException("me/rerere/matrix/internal/pn", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/pn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
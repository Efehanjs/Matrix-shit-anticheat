package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.potion.PotionEffectType;

public class kl extends zk {
  private static int r;
  
  private long x;
  
  private double z;
  
  private long k;
  
  private long v;
  
  private double b;
  
  private static boolean i;
  
  private static final long a = o3.a(6822942650816774858L, -1355346829683802166L, MethodHandles.lookup().lookupClass()).a(61355243070639L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public kl(yl paramyl) {
    super(paramyl);
    b(yk.n);
  }
  
  public void b(long paramLong, @NotNull PlayerTeleportEvent paramPlayerTeleportEvent) {
    this.v = pc.j();
  }
  
  public void m(@NotNull EntityDamageByEntityEvent paramEntityDamageByEntityEvent, long paramLong) {
    long l1 = paramLong ^ 0x5E97503FCB4L;
    long l2 = paramLong ^ 0x5F28DF443E2EL;
    Player player = (Player)paramEntityDamageByEntityEvent.getDamager();
    try {
      if (player.getGameMode() != GameMode.SURVIVAL)
        try {
          if (player.getGameMode() != GameMode.ADVENTURE)
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 9)
        try {
          if (!player.isGliding()) {
            try {
              if (pc.j() - this.x <= 1000L)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 13)
        try {
          if (player.isSwimming())
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (pc.b() - this.v <= 150L)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (player.getFallDistance() > 0.0F)
        try {
          if (!ta.p(l2, player))
            try {
              if (!player.isInsideVehicle())
                try {
                  if (!player.hasPotionEffect(PotionEffectType.BLINDNESS))
                    try {
                      if (!na.n(player))
                        try {
                          if (!na.c(player))
                            try {
                              if ((b().b()).b == 0)
                                b((EntityDamageEvent)paramEntityDamageByEntityEvent, l1, player); 
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            }  
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b = 0.0D;
  }
  
  public void b(@NotNull PlayerVelocityEvent paramPlayerVelocityEvent) {
    this.k = System.currentTimeMillis();
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    long l = a ^ 0x1A30F4A58257L;
    int i = (int)((l ^ 0x222DB79A085EL) >>> 32L);
    int j = (int)((l ^ 0x222DB79A085EL) << 32L >>> 48L);
    int k = (int)((l ^ 0x222DB79A085EL) << 48L >>> 48L);
    l ^ 0x222DB79A085EL;
    Player player = paramPlayerMoveEvent.getPlayer();
    try {
      if (ta.t(i, (short)j, player, k))
        try {
          if (paramLocation2.getY() > paramLocation1.getY())
            try {
              if (System.currentTimeMillis() - this.k > 2000L)
                this.b = paramLocation2.getY() - paramLocation1.getY(); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (b.b() >= 9)
        try {
          if (player.isGliding())
            this.x = pc.j(); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/kl.a : J
    //   3: ldc2_w 109625300592137
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #27754
    //   15: ldc2_w 7462015114544187587
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   25: iconst_5
    //   26: invokeinterface getInt : (Ljava/lang/String;I)I
    //   31: putstatic me/rerere/matrix/internal/kl.r : I
    //   34: aload_0
    //   35: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   38: sipush #945
    //   41: ldc2_w 5953948275202090783
    //   44: lload_1
    //   45: lxor
    //   46: <illegal opcode> e : (IJ)Ljava/lang/String;
    //   51: iconst_1
    //   52: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   57: putstatic me/rerere/matrix/internal/kl.i : Z
    //   60: return
  }
  
  static {
    long l = a ^ 0x2A37ADB77A61L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "z¨L4äèÝ°ß=éË\"(¾NÒ\fïð¨~È&gàê·åÃÜ8ú\020Eì\026\034ÃÌ\fOPøDtw(:\006=úmã\003\002¸-½Ò SÌÓ:GìÃø»Ôn¹½2í+\007\tLu]ÀØ´(\006,G.OÕ<¸,\026<EQ-\022\013C®QE®Pf`¡æïÏn6z|£D ·M>4§xÊÒýL\030u`+ð¥øHc>: K°¸m¡]¢qX\rvv\n i\020DNùÏö¡3¦@\r/k<nåêÎn+)ÙÍ¥Ä·ÞÂßH13\002a\\\036Ñó.\002*Sª¢gC£j´J\0168­îxDãÓI\017í\005úösqú¹ry0kaeG'Ñ&\001i¦õ±­7;ÕÙ\032-ì³±ÁÌòyu9ÒÝÂ\0204¢w\020Å\000\013Í,").length();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5B6E;
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
        throw new RuntimeException("me/rerere/matrix/internal/kl", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/kl'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\kl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
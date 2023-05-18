package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.potion.PotionEffectType;

public class qn extends zk {
  private static boolean u;
  
  private long w = pc.j();
  
  private int f;
  
  private int l;
  
  private static int r;
  
  private double x;
  
  private int z;
  
  private long k;
  
  private static final int v = 5;
  
  private final Queue b = new ArrayDeque();
  
  private static int i;
  
  private static final long a = o3.a(6309413848746617877L, -5749675643286535817L, MethodHandles.lookup().lookupClass()).a(192902449213308L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/qn.a : J
    //   3: ldc2_w 85431008873217
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #4220
    //   15: ldc2_w 1896411298335251401
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   25: bipush #10
    //   27: invokeinterface getInt : (Ljava/lang/String;I)I
    //   32: putstatic me/rerere/matrix/internal/qn.i : I
    //   35: aload_0
    //   36: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   39: sipush #29779
    //   42: ldc2_w 2727088904806023136
    //   45: lload_1
    //   46: lxor
    //   47: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   52: iconst_1
    //   53: invokeinterface getBoolean : (Ljava/lang/String;Z)Z
    //   58: putstatic me/rerere/matrix/internal/qn.u : Z
    //   61: aload_0
    //   62: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   65: sipush #8540
    //   68: ldc2_w 4184733091977882344
    //   71: lload_1
    //   72: lxor
    //   73: <illegal opcode> f : (IJ)Ljava/lang/String;
    //   78: invokeinterface getInt : (Ljava/lang/String;)I
    //   83: putstatic me/rerere/matrix/internal/qn.r : I
    //   86: return
  }
  
  public void b(char paramChar, @NotNull BlockPlaceEvent paramBlockPlaceEvent, int paramInt1, int paramInt2) {
    long l1 = paramChar << 48L | paramInt1 << 32L >>> 16L | paramInt2 << 48L >>> 48L;
    long l2 = l1 ^ 0x337086150B3L;
    long l3 = l1 ^ 0x2E7CBD05A89CL;
    try {
      if (!paramBlockPlaceEvent.isCancelled())
        try {
          if (u) {
            Block block1 = paramBlockPlaceEvent.getBlockPlaced();
            Player player = paramBlockPlaceEvent.getPlayer();
            try {
              if (player.isFlying())
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (b.b() >= 12)
                try {
                  if (player.hasPotionEffect(PotionEffectType.LEVITATION))
                    return; 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (na.n(player.getLocation(), l3))
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (player.hasPotionEffect(PotionEffectType.JUMP))
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            Block block2 = paramBlockPlaceEvent.getBlockAgainst();
            try {
              if (block1.getY() == this.l + 1)
                try {
                  if (block1.getX() == this.f)
                    try {
                      if (block1.getZ() == this.z)
                        try {
                          if (block2.getX() == block1.getX())
                            try {
                              if (block2.getZ() == block1.getZ() && block2.getY() == block1.getY() - 1) {
                                Pair pair = b(player, block1);
                                try {
                                  if (((Double)pair.getSecond()).doubleValue() < 1.13D && ((Double)pair.getFirst()).doubleValue() < 1.36D) {
                                    Location location = player.getLocation();
                                    try {
                                      if (location.getY() > block1.getY())
                                        try {
                                          if (location.getY() <= (block1.getY() + 2))
                                            try {
                                              if (location.getY() != this.x)
                                                b(paramBlockPlaceEvent, l2, block1, block2, pair); 
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
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                } 
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
            try {
              if (block1.getY() == block2.getY())
                this.k = pc.j(); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            this.f = block1.getX();
            this.l = block1.getY();
            this.z = block1.getZ();
            this.x = player.getLocation().getY();
            return;
          } 
          return;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public qn(yl paramyl) {
    super(paramyl);
    b(yk.x);
  }
  
  static {
    long l = a ^ 0x70341CA62B8AL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "\023÷2óõêyLæYwOð\013µ\033Js\007j^õT6bÑ¤cÝÖ\000n2ø·¦µ%îoØ`qr×d$XOo\020rãAXÜÉý1\020}K\t\0039àÜ#\013«¹\027&R(Þëâ@:è}dÔ\006º©j.\023o\025 ÅÁT3P0fsÄMo9rÌê%÷Õï\002\020÷ê¸÷=P¨#µÓE(\bH jdÔ~z\037¦¾jÑc²±¿ÆóP%E\024kÆQ(²¸\023\"ì>\035§ÔhØ  ÑE?á©îBÓêq$'{ñç\\øDhþÖ\034(\020b(\025.K\001\017DL¢Í_\025").length();
    byte b2 = 64;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7470;
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
        throw new RuntimeException("me/rerere/matrix/internal/qn", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/qn'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
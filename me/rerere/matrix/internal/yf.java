package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class yf extends BukkitRunnable {
  @NotNull
  private final Set i = new HashSet();
  
  private static String a;
  
  private static final long b = o3.a(8144542084948491177L, -7260580649492280492L, MethodHandles.lookup().lookupClass()).a(170179407314982L);
  
  private static final String c;
  
  public yf(int paramInt, char paramChar, short paramShort) {
    runTaskTimer((Plugin)Matrix.q.b(l2), 20L, 2L);
  }
  
  public final void b(@NotNull Block paramBlock) {
    this.i.add(new pe(paramBlock.getWorld().getName(), paramBlock.getX(), paramBlock.getY(), paramBlock.getZ()));
  }
  
  public final boolean b(short paramShort, int paramInt, @Nullable Location paramLocation, char paramChar) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/yf.b : J
    //   27: lxor
    //   28: lstore #5
    //   30: invokestatic r : ()I
    //   33: istore #7
    //   35: aload_3
    //   36: ifnull -> 106
    //   39: aload_0
    //   40: getfield i : Ljava/util/Set;
    //   43: new me/rerere/matrix/internal/pe
    //   46: dup
    //   47: aload_3
    //   48: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   51: dup
    //   52: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   55: invokeinterface getName : ()Ljava/lang/String;
    //   60: aload_3
    //   61: invokevirtual getBlockX : ()I
    //   64: aload_3
    //   65: invokevirtual getBlockY : ()I
    //   68: aload_3
    //   69: invokevirtual getBlockZ : ()I
    //   72: invokespecial <init> : (Ljava/lang/String;III)V
    //   75: invokeinterface contains : (Ljava/lang/Object;)Z
    //   80: iload #7
    //   82: ifeq -> 103
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   91: athrow
    //   92: ifeq -> 106
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   101: athrow
    //   102: iconst_1
    //   103: goto -> 107
    //   106: iconst_0
    //   107: ireturn
    // Exception table:
    //   from	to	target	type
    //   35	85	88	java/lang/NullPointerException
    //   39	95	98	java/lang/NullPointerException
  }
  
  public final void b(@NotNull World paramWorld, int paramInt1, int paramInt2, int paramInt3) {
    this.i.add(new pe(paramWorld.getName(), paramInt1, paramInt2, paramInt3));
  }
  
  @Deprecated(message = "use contains(Location) instead")
  public final boolean b(@Nullable Block paramBlock) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/yf.b : J
    //   3: ldc2_w 27251776855692
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: ifnull -> 88
    //   17: aload_0
    //   18: getfield i : Ljava/util/Set;
    //   21: new me/rerere/matrix/internal/pe
    //   24: dup
    //   25: aload_1
    //   26: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   31: invokeinterface getName : ()Ljava/lang/String;
    //   36: aload_1
    //   37: invokeinterface getX : ()I
    //   42: aload_1
    //   43: invokeinterface getY : ()I
    //   48: aload_1
    //   49: invokeinterface getZ : ()I
    //   54: invokespecial <init> : (Ljava/lang/String;III)V
    //   57: invokeinterface contains : (Ljava/lang/Object;)Z
    //   62: iload #4
    //   64: ifeq -> 85
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   73: athrow
    //   74: ifeq -> 88
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   83: athrow
    //   84: iconst_1
    //   85: goto -> 89
    //   88: iconst_0
    //   89: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	67	70	java/lang/NullPointerException
    //   17	77	80	java/lang/NullPointerException
  }
  
  public void run() {
    long l = System.currentTimeMillis();
    this.i.removeIf(paramObject -> ((Boolean)paramFunction1.invoke(paramObject)).booleanValue());
  }
  
  public final void b(long paramLong, @NotNull Location paramLocation) {
    paramLong = b ^ paramLong;
    try {
      if (paramLocation.getWorld() != null)
        try {
          if (paramLocation.getWorld().getName() != null) {
            String str = paramLocation.getWorld().getName();
            pe pe = new pe(str, paramLocation.getBlockX(), paramLocation.getBlockY(), paramLocation.getBlockZ());
            this.i.add(pe);
            return;
          } 
          paramLocation.getWorld().getName();
          throw new NullPointerException(c);
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        }  
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    paramLocation.getWorld();
    throw new NullPointerException(c);
  }
  
  public static void W(String paramString) {
    a = paramString;
  }
  
  public static String F() {
    return a;
  }
  
  static {
    long l = b ^ 0xD69C95A9FA7L;
    W("bZESh");
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\yf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
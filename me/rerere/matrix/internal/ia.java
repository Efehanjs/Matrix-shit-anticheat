package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.text.DecimalFormat;
import java.util.Deque;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.scheduler.BukkitRunnable;

public final class ia extends BukkitRunnable {
  private static final int x = 40;
  
  @NotNull
  private static final Deque z;
  
  private static long k;
  
  private static double v;
  
  @NotNull
  private static final DecimalFormat b;
  
  @NotNull
  public static final ia i;
  
  private static String a;
  
  private static final long c = o3.a(2028518112684476370L, 5019501808777076070L, MethodHandles.lookup().lookupClass()).a(51707322211913L);
  
  public static final double p(long paramLong) {
    double d;
    paramLong = c ^ paramLong;
    int i = (int)((paramLong ^ 0x3B250E06C14DL) >>> 32L);
    int j = (int)((paramLong ^ 0x3B250E06C14DL) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x3B250E06C14DL) << 48L >>> 48L);
    paramLong ^ 0x3B250E06C14DL;
    try {
      d = RangesKt.coerceAtMost(Double.parseDouble(b.format(1000.0D / i.b(i, j, k))), 20.0D);
    } catch (Exception exception) {
      d = 20.0D;
    } 
    return d;
  }
  
  public void run() {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - k;
    k = l1;
    z.removeFirst();
    z.addLast(Long.valueOf(l2));
  }
  
  public static final double j() {
    return v;
  }
  
  static {
    long l1 = c ^ 0x4734E1A2FCCFL;
    long l2 = l1 ^ 0x4D7FDA13EA31L;
    if (k() == null)
      H("hZBXFc"); 
    (new byte[8])[0] = (byte)(int)(l1 >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l1 << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  public static void H(String paramString) {
    a = paramString;
  }
  
  public static String k() {
    return a;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ia.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public enum q {
  o, t, g, s, w, f, r, x, z, b, i;
  
  private final int q;
  
  private final int a;
  
  private final int u;
  
  @NotNull
  public static final u l;
  
  @NotNull
  private final String k;
  
  private static boolean c;
  
  private static final long d = o3.a(-2513641667498187618L, -1644259266600486217L, MethodHandles.lookup().lookupClass()).a(106239660334827L);
  
  @NotNull
  public static final q j(int paramInt, long paramLong) {
    paramLong = d ^ paramLong;
    long l = paramLong ^ 0x555D847B7DC5L;
    return l.b(l, paramInt);
  }
  
  q(String paramString1, int paramInt1, int paramInt2, int paramInt3) {
    this.k = paramString1;
    this.q = paramInt1;
    this.a = paramInt2;
    this.u = paramInt3;
  }
  
  static {
    long l = d ^ 0x7A1763E7814DL;
    if (!E())
      o(true); 
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[22];
    boolean bool = false;
    String str;
    int i = (str = "qY¢è\n\\Éa\b\030`âãÀYý\b´Å[I]'=\bLgÖNµ^ë\b\035!{Ç6WÍ\b\nº2Ä¢\034\bÞ¡ë\005¶¦\b\031G°¨:\001èÀ\020aÔYlòù\005êÐ²'B\025Ç`z\bþÀ\rÀ\n¾é\b*hE­(\027 \020\004hú\030ÿv1\bã:Õà&\007\bVåe\003¦rú~\bd\005oí\034.<l\bb1¤jEÌW­\b\027f;Æ#Ó\b\bÿQ0¹ï\bE\bLW)\002õ\007\b\006ÖçÎ°¹\bt7\003ÂÑâ").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
  }
  
  public final int p() {
    return this.a;
  }
  
  @NotNull
  public static final q b(int paramInt1, long paramLong, int paramInt2) {
    long l1 = (paramLong << 32L | paramInt2 << 32L >>> 32L) ^ d;
    long l2 = l1 ^ 0x24B5E110B815L;
    return l.j(paramInt1, l2);
  }
  
  public final int j() {
    return this.u;
  }
  
  @NotNull
  public static final q b(long paramLong) {
    paramLong = d ^ paramLong;
    long l = (paramLong ^ 0x26B309CAEEC4L) >>> 16L;
    int i = (int)((paramLong ^ 0x26B309CAEEC4L) << 48L >>> 48L);
    paramLong ^ 0x26B309CAEEC4L;
    return l.b(l, (char)i);
  }
  
  public final int b() {
    return this.q;
  }
  
  @NotNull
  public final String b() {
    return this.k;
  }
  
  public static void o(boolean paramBoolean) {
    c = paramBoolean;
  }
  
  public static boolean h() {
    return c;
  }
  
  public static boolean E() {
    boolean bool = h();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
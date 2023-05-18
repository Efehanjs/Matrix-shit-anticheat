package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import sun.misc.Unsafe;

public final class yb {
  @NotNull
  public static final yb b;
  
  @NotNull
  private static final Lazy i;
  
  private static final long a = o3.a(6568323520409920236L, 6740604267846524244L, MethodHandles.lookup().lookupClass()).a(129322257604400L);
  
  private static final String c;
  
  static {
    long l = a ^ 0x7783AF6009BAL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  public final void b(short paramShort, int paramInt1, int paramInt2, @NotNull Class paramClass) throws Throwable {
    long l1 = (paramShort << 48L | paramInt1 << 32L >>> 16L | paramInt2 << 48L >>> 48L) ^ a;
    Unsafe unsafe1 = b();
    Unsafe unsafe2 = unsafe1;
    boolean bool = false;
    Field field = Class.class.getDeclaredField(c);
    long l2 = unsafe2.objectFieldOffset(field);
    unsafe2.putObject(paramClass, l2, unsafe2.getObject(Object.class, l2));
  }
  
  @NotNull
  public final Object b(@NotNull Class<?> paramClass) {
    return b().allocateInstance(paramClass);
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\yb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
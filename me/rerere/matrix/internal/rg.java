package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@Deprecated(message = "Don't use it")
public final class rg {
  @NotNull
  public static final rg i;
  
  private static yk[] a;
  
  private static final long b = o3.a(-493331886350993281L, -4204042278563086958L, MethodHandles.lookup().lookupClass()).a(33237012620146L);
  
  private static final String c;
  
  static {
    long l = b ^ 0x6F0C16067CL;
    F(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  public static final void b(@NotNull String paramString, long paramLong, short paramShort) {
    long l = (paramLong << 16L | paramShort << 48L >>> 48L) ^ b;
    try {
      if (!pd.w)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    System.out.println(c + paramString);
  }
  
  public static void F(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] X() {
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
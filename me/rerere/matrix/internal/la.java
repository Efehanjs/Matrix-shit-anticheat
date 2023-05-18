package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class la {
  private final boolean b;
  
  @NotNull
  private final Optional i;
  
  private static int[] a;
  
  private static final long c = o3.a(-5256097952356798290L, 3387574677235300593L, MethodHandles.lookup().lookupClass()).a(207350764615344L);
  
  private static final String d;
  
  public la(@NotNull Optional paramOptional, long paramLong, boolean paramBoolean) {
    if (i != 0) {
      try {
        if (paramOptional == null)
          throw new NullPointerException(d); 
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      this.i = paramOptional;
      this.b = paramBoolean;
    } 
  }
  
  @NotNull
  public Optional b() {
    return this.i;
  }
  
  public boolean b() {
    return this.b;
  }
  
  public static void g(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] N() {
    return a;
  }
  
  static {
    long l = c ^ 0x68E25FD7F4D1L;
    g(new int[4]);
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\la.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
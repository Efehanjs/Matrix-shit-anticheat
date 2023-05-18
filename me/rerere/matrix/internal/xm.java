package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@Deprecated(message = "Remove it")
public enum xm {
  f, l, r, v, i;
  
  @NotNull
  public static final mo x;
  
  private final int k;
  
  private final int b;
  
  private static int a;
  
  private static final long c = o3.a(5489306198476058362L, -6946453215490906816L, MethodHandles.lookup().lookupClass()).a(235575085338444L);
  
  @NotNull
  public static final xm b(int paramInt1, short paramShort1, short paramShort2, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramShort1 << 48L >>> 32L | paramShort2 << 48L >>> 48L) ^ c;
    long l2 = l1 ^ 0x3731F8ADCE8CL;
    return x.b(l2, paramInt2);
  }
  
  static {
    long l = c ^ 0x32E819DE19CEL;
    if (c() == 0)
      T(51); 
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[5];
    boolean bool = false;
    String str;
    int i = (str = "Tp2Ý\037Aò\b\"Ó+\002xÅOA\020{Ö A\020q¸èI4L\fã÷").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
  }
  
  xm(int paramInt1, int paramInt2) {
    this.k = paramInt1;
    this.b = paramInt2;
  }
  
  public static void T(int paramInt) {
    a = paramInt;
  }
  
  public static int c() {
    return a;
  }
  
  public static int t() {
    int i = c();
    try {
      if (i == 0)
        return 45; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\xm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
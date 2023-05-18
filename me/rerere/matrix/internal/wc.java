package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class wc {
  private static final Base64.Encoder v;
  
  @NotNull
  public static final wc b;
  
  private static final Base64.Decoder i;
  
  private static final long a = o3.a(13252878970742723L, 7425739965637245624L, MethodHandles.lookup().lookupClass()).a(13738011524390L);
  
  private static final String c;
  
  @NotNull
  public static final String j(int paramInt, short paramShort, @NotNull String paramString, char paramChar) {
    long l = (paramInt << 32L | paramShort << 48L >>> 32L | paramChar << 48L >>> 48L) ^ a;
    String str = paramString;
    Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), c);
    byte[] arrayOfByte = v.encode(str.getBytes(Charsets.UTF_8));
    return new String(arrayOfByte, Charsets.UTF_8);
  }
  
  static {
    long l = a ^ 0x296BB16F99B6L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  @NotNull
  public static final String b(@Nullable String paramString) {
    return new String(i.decode(paramString), Charsets.UTF_8);
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\wc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
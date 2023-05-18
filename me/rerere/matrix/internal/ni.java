package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ni {
  @NotNull
  private static final ie x;
  
  @NotNull
  private static final ie z;
  
  @NotNull
  public static final ni k;
  
  @NotNull
  private static final zi v;
  
  @NotNull
  private static final zi b;
  
  @NotNull
  private static final Lazy i;
  
  private static String[] a;
  
  @NotNull
  public final ie j() {
    return z;
  }
  
  static {
    long l = o3.a(-3552828274998647881L, 1061712799917278105L, MethodHandles.lookup().lookupClass()).a(214951336288282L) ^ 0x4191BDA208F5L;
    if (f() != null)
      B(new String[2]); 
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[8];
    boolean bool = false;
    String str;
    int i = (str = "(Æò4sT\n\005jT²<x\013+Ôo@\020NÎ¦Ç;õ\000N\b\022j]z\030\tU,OÀæÉÁ#ñiØõZVTµ·fkã?\030\tU,OÀæÉÊÕf\033ÉK£\016ß'ú\007\030â\037S¥Ñb%W<\034\t4ºO(vxÆ¤s\030?~õ´\016ßM&ÐÈ£\021ÊWè\001«JÞ¥").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public final List b() {
    Lazy lazy = i;
    return (List)lazy.getValue();
  }
  
  @NotNull
  public final zi j() {
    return b;
  }
  
  @NotNull
  public final zi b() {
    return v;
  }
  
  @NotNull
  public final ie b() {
    return x;
  }
  
  public static void B(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] f() {
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ni.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
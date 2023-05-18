package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public interface y {
  public static final String t;
  
  public static final String g;
  
  public static final String a;
  
  public static final String s;
  
  public static final String u;
  
  public static final String w;
  
  public static final String f;
  
  public static final String l;
  
  public static final String r;
  
  public static final String x;
  
  public static final String z;
  
  public static final String k;
  
  public static final String v;
  
  public static final String b;
  
  public static final String i;
  
  static {
    long l = o3.a(-7237332362290352933L, 3711086916976494614L, MethodHandles.lookup().lookupClass()).a(173733838270727L) ^ 0x5F97D0130C2DL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[15];
    boolean bool = false;
    String str;
    int i = (str = "\002¦P÷Ù¾À\020\020\\Ä\020H¢¿©\022Ë\031a\026u\020Æ<ú---H\n¢ê_\034Þc\bX\0062\t;Êêl\bÿtz`¼5\027\bÒ<%¡,\020.òØF²ü\037t&i\b\024\023\bè_\031ÁÜÚö\020\fOâÚx/\003Äâwmä\017{\020p¿bñÀ¸\fü\nò\004\000Ñ%\020\002)È)Ë\000ÄvÅ3\rgß9e\020ËÚdÎà­bsÉ²e=µö*\020AsS8;¥Úíh\020±_").length();
    byte b2 = 8;
    byte b = -1;
    while (true);
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\y.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
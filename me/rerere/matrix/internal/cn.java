package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.okhttp3.MediaType;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class cn {
  @NotNull
  private static final MediaType v;
  
  @NotNull
  private static final String b;
  
  @NotNull
  private static final String i;
  
  static {
    long l = o3.a(7575507587197119769L, -5643210753113100215L, MethodHandles.lookup().lookupClass()).a(86067582036363L) ^ 0x76A69D3C44DBL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "\003÷Ã²jýé,\037B1Â2ç$¸£gç{|ËÍæ&Ù\f\005\nmEÄ\034¿ä«,xË\033(u2}L[\000ÓQvëÇ¡?ða!Û\005N\004Ýº¤C.¼7\\JÒi\033mà)×KiL0OÎ:j©}p\";mõp¨r\023Å­Á]¶_t&\006k\021º:\013ÒôºemXÄ\"tó<]J4GïìÉÿªÇ´Óøx¨Ü»â»X°\0378\017=ãéßu½ZS°ª¨Ì\0208y¹iTµÕKãOhcãM}±á³ÕüïCºÉ¯ø©sçmKýÆþ4ÞßKäüª÷ølÞ§gIVÿ³·¥¶X/ó\005¼{Ä,z¡ýáüÕhojxÑPGbILà\f\023´þèUáíôs¾é¨\037öWâåBÒ:÷\006\035?ÍÐt\fÆ¨{ý3E\037/Yü[i\rÄ\027V\rÿË\t\027y&³ô³Jå G \027;O6v<Ü\"£\003C\t÷7xÁa-7\nMÖ*ªjA;+WÆW&\"[.z­pª%Òøê°4ÖG3õ\025³¤æô\030\tÿ/>ÿÃz_\034÷¿G8\026ç\026j\001Ó] t{\037ÄlÆ#¼É&ðVÈ­Ø\021ùÀI ÄðXT¨8\022P").length();
    char c = 'Ɛ';
    byte b1 = -1;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
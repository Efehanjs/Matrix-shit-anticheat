package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

@Deprecated
public class rb extends BukkitRunnable {
  @NotNull
  private final Queue i = new LinkedBlockingQueue();
  
  private static String[] a;
  
  private static final long b = o3.a(-3773279220346024264L, -8317850984555777858L, MethodHandles.lookup().lookupClass()).a(78852345542550L);
  
  private static final String c;
  
  public rb() {
    runTaskTimerAsynchronously((Plugin)Matrix.b(), 1L, 1L);
  }
  
  public void run() {
    long l = b ^ 0x6058EAF7A0B1L;
    int i = yl.a();
    while (this.i.size() > 0) {
      try {
        Runnable runnable = this.i.poll();
        try {
          if (i == 0)
            if (runnable != null) {
            
            } else {
              continue;
            }  
        } catch (Exception exception) {
          throw a(null);
        } 
        runnable.run();
      } catch (Exception exception) {
        Matrix.b(c + exception.getClass().getName());
        exception.printStackTrace();
        if (i != 0)
          break; 
      } 
    } 
  }
  
  public void b(Runnable paramRunnable) {
    this.i.add(paramRunnable);
  }
  
  public int b() {
    return this.i.size();
  }
  
  public static void w(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] L() {
    return a;
  }
  
  static {
    long l = b ^ 0x61515777F5ABL;
    w((String[])null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\rb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
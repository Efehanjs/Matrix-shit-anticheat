package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public final class db {
  @NotNull
  private final Location b;
  
  @NotNull
  public static final pb i;
  
  private static int a;
  
  private static final long c = o3.a(7216198940842243041L, -8564052596946204506L, MethodHandles.lookup().lookupClass()).a(63220296209938L);
  
  private static final String d;
  
  @NotNull
  public final Block b(long paramLong) {
    paramLong = c ^ paramLong;
    if (this.b.getWorld() == null) {
      this.b.getWorld();
      String str = d;
      throw new IllegalStateException(str.toString());
    } 
    return na.b(this.b.getWorld(), this.b.getBlockX(), this.b.getBlockY(), this.b.getBlockZ());
  }
  
  @NotNull
  public static final db b(@NotNull Location paramLocation) {
    return i.b(paramLocation);
  }
  
  @NotNull
  public final db b(@NotNull BlockFace paramBlockFace) {
    return new db(this.b.clone().add(paramBlockFace.getModX(), paramBlockFace.getModY(), paramBlockFace.getModZ()));
  }
  
  static {
    long l = c ^ 0x4FE463A7BBB4L;
    f(0);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
  }
  
  public final boolean b() {
    return da.d(b());
  }
  
  @NotNull
  public final Material b() {
    return na.b(this.b);
  }
  
  public static void f(int paramInt) {
    a = paramInt;
  }
  
  public static int s() {
    return a;
  }
  
  public static int l() {
    int i = s();
    try {
      if (i == 0)
        return 65; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\db.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
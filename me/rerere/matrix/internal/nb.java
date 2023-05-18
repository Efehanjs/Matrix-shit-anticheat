package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.math.MathKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public final class nb {
  private static int[] a;
  
  private static final long b = o3.a(-7728302221284365910L, -2840686289276621668L, MethodHandles.lookup().lookupClass()).a(73546442614278L);
  
  private static final String c;
  
  @NotNull
  public static final String b(float paramFloat) {
    return String.valueOf(b(paramFloat));
  }
  
  @NotNull
  public static final String b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, long paramLong) {
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0x3656F996D5D2L;
    try {
      if (paramLong >= 0L) {
        Intrinsics.checkNotNull(paramPlayerMoveEvent.getTo());
        if (za.p(paramPlayerMoveEvent.getTo(), l)) {
        
        } else {
          return (za.p(paramPlayerMoveEvent.getFrom(), l) ? "+" : "-") + "-";
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return za.p(paramPlayerMoveEvent.getFrom(), l) ? "+" : "-";
  }
  
  @NotNull
  public static final String j(@NotNull Iterable paramIterable) {
    return CollectionsKt.joinToString$default(paramIterable, ",", null, null, 0, null, null, 62, null);
  }
  
  public static final double b(double paramDouble) {
    return MathKt.roundToInt(paramDouble * 'Ϩ') / 1000.0D;
  }
  
  @NotNull
  public static final String b(char paramChar, short paramShort, int paramInt, @NotNull Block paramBlock) {
    long l1 = (paramChar << 48L | paramShort << 48L >>> 16L | paramInt << 32L >>> 32L) ^ b;
    int i = (int)((l1 ^ 0x7D52778E8A57L) >>> 48L);
    long l2 = (l1 ^ 0x7D52778E8A57L) << 16L >>> 16L;
    l1 ^ 0x7D52778E8A57L;
    return paramBlock.getType().name() + '(' + b(paramBlock.getLocation(), (char)i, l2) + ')';
  }
  
  @NotNull
  public static final String b(boolean paramBoolean, long paramLong) {
    paramLong = b ^ paramLong;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramBoolean ? "+" : "-";
  }
  
  @NotNull
  public static final String b(double paramDouble) {
    return String.valueOf(b(paramDouble));
  }
  
  @NotNull
  public static final String b(@NotNull Vector paramVector) {
    return b(paramVector.getX()) + ',' + b(paramVector.getY()) + ',' + b(paramVector.getZ());
  }
  
  @NotNull
  public static final String b(@NotNull Boolean[] paramArrayOfBoolean) {
    return ArraysKt.joinToString$default((Object[])paramArrayOfBoolean, ",", null, null, 0, null, hb.i, 30, null);
  }
  
  @NotNull
  public static final String b(@NotNull boolean... paramVarArgs) {
    return b(ArraysKt.toTypedArray(paramVarArgs));
  }
  
  public static final double b(float paramFloat) {
    return MathKt.roundToInt(paramFloat * 'Ϩ') / 1000.0D;
  }
  
  @NotNull
  public static final String b(@NotNull Iterable paramIterable) {
    return CollectionsKt.joinToString$default(paramIterable, ",", null, null, 0, null, wb.i, 30, null);
  }
  
  @NotNull
  public static final String b(@NotNull Location paramLocation, char paramChar, long paramLong) {
    long l = (paramChar << 48L | paramLong << 16L >>> 16L) ^ b;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ge.k ? c : (b(paramLocation.getX()) + ',' + b(paramLocation.getY()) + ',' + b(paramLocation.getZ()));
  }
  
  public static void c(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] V() {
    return a;
  }
  
  static {
    long l = b ^ 0x4F75206C2BE3L;
    c(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\nb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
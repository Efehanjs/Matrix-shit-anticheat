package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.NumberConversions;
import org.bukkit.util.Vector;

public class ra {
  private static String[] a;
  
  private static final long b = o3.a(2284534871092015671L, -5042900809803053799L, MethodHandles.lookup().lookupClass()).a(128391256800922L);
  
  public static boolean b(@NotNull World paramWorld, @NotNull Location paramLocation) {
    return j(paramWorld, paramLocation.getX(), paramLocation.getZ());
  }
  
  public static int b(double paramDouble) {
    return NumberConversions.floor(paramDouble);
  }
  
  public static boolean b(@NotNull World paramWorld, @NotNull Vector paramVector) {
    return j(paramWorld, paramVector.getX(), paramVector.getZ());
  }
  
  public static boolean j(@NotNull World paramWorld, double paramDouble1, double paramDouble2) {
    return paramWorld.isChunkLoaded(b(paramDouble1) >> 4, b(paramDouble2) >> 4);
  }
  
  public static boolean j(long paramLong, @NotNull Location paramLocation) {
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0x4387473835FFL;
    return b(paramLocation.getWorld(), paramLocation.getX(), paramLocation.getZ(), l);
  }
  
  public static boolean b(@NotNull Location paramLocation) {
    return j(paramLocation.getWorld(), paramLocation.getX(), paramLocation.getZ());
  }
  
  public static boolean b(@NotNull World paramWorld, double paramDouble1, double paramDouble2, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ra.b : J
    //   3: lload #5
    //   5: lxor
    //   6: lstore #5
    //   8: dload_1
    //   9: invokestatic b : (D)I
    //   12: iconst_4
    //   13: ishr
    //   14: istore #8
    //   16: dload_3
    //   17: invokestatic b : (D)I
    //   20: iconst_4
    //   21: ishr
    //   22: istore #9
    //   24: invokestatic a : ()I
    //   27: iload #8
    //   29: iconst_1
    //   30: isub
    //   31: istore #10
    //   33: istore #7
    //   35: iload #10
    //   37: iload #8
    //   39: iconst_1
    //   40: iadd
    //   41: if_icmpgt -> 126
    //   44: iload #9
    //   46: iconst_1
    //   47: isub
    //   48: iload #7
    //   50: ifne -> 127
    //   53: istore #11
    //   55: iload #11
    //   57: iload #9
    //   59: iconst_1
    //   60: iadd
    //   61: if_icmpgt -> 111
    //   64: aload_0
    //   65: iload #10
    //   67: iload #11
    //   69: invokeinterface isChunkLoaded : (II)Z
    //   74: iload #7
    //   76: ifne -> 37
    //   79: iload #7
    //   81: lload #5
    //   83: lconst_0
    //   84: lcmp
    //   85: iflt -> 50
    //   88: ifne -> 102
    //   91: ifne -> 103
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   100: athrow
    //   101: iconst_0
    //   102: ireturn
    //   103: iinc #11, 1
    //   106: iload #7
    //   108: ifeq -> 55
    //   111: iinc #10, 1
    //   114: iload #7
    //   116: lload #5
    //   118: lconst_0
    //   119: lcmp
    //   120: iflt -> 74
    //   123: ifeq -> 35
    //   126: iconst_1
    //   127: ireturn
    // Exception table:
    //   from	to	target	type
    //   79	94	97	java/lang/RuntimeException
  }
  
  public static void n(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] g() {
    return a;
  }
  
  static {
    if (g() != null)
      n(new String[2]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
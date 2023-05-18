package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.util.Vector;

@Deprecated
public class zb {
  private static yk[] a;
  
  private static final long b = o3.a(-7054552747989346419L, -1395944808537782998L, MethodHandles.lookup().lookupClass()).a(129512937530961L);
  
  public static float b(float paramFloat1, float paramFloat2) {
    return (float)Math.sqrt((paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2));
  }
  
  public static int b(@NotNull List paramList, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/zb.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic a : ()I
    //   9: istore_3
    //   10: aload_0
    //   11: invokeinterface size : ()I
    //   16: iload_3
    //   17: ifne -> 37
    //   20: ifne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_0
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: iconst_0
    //   37: istore #4
    //   39: aload_0
    //   40: invokeinterface iterator : ()Ljava/util/Iterator;
    //   45: astore #5
    //   47: aload #5
    //   49: invokeinterface hasNext : ()Z
    //   54: ifeq -> 93
    //   57: aload #5
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast java/lang/Integer
    //   67: astore #6
    //   69: iload #4
    //   71: aload #6
    //   73: invokevirtual intValue : ()I
    //   76: iadd
    //   77: lload_1
    //   78: lconst_0
    //   79: lcmp
    //   80: iflt -> 90
    //   83: iload_3
    //   84: ifne -> 108
    //   87: istore #4
    //   89: iload_3
    //   90: ifeq -> 47
    //   93: iload #4
    //   95: lload_1
    //   96: lconst_0
    //   97: lcmp
    //   98: ifle -> 108
    //   101: aload_0
    //   102: invokeinterface size : ()I
    //   107: idiv
    //   108: ireturn
    // Exception table:
    //   from	to	target	type
    //   10	23	26	java/lang/RuntimeException
    //   20	32	32	java/lang/RuntimeException
  }
  
  public static double b(@NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    return jb.b(paramLocation1, paramLocation2);
  }
  
  public static int b(double paramDouble, long paramLong) {
    paramLong = b ^ paramLong;
    int i = (int)((paramLong ^ 0x10FAA282EC1L) >>> 32L);
    int j = (int)((paramLong ^ 0x10FAA282EC1L) << 32L >>> 48L);
    int k = (int)((paramLong ^ 0x10FAA282EC1L) << 48L >>> 48L);
    paramLong ^ 0x10FAA282EC1L;
    return jb.b(paramDouble, i, (short)j, (char)k);
  }
  
  public static double b(@NotNull Vector paramVector1, @NotNull Vector paramVector2) {
    double d1 = paramVector2.getX() - paramVector1.getX();
    double d2 = paramVector2.getZ() - paramVector1.getZ();
    return Math.sqrt(d1 * d1 + d2 * d2);
  }
  
  public static double b(double paramDouble1, double paramDouble2) {
    return Math.sqrt(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2);
  }
  
  public static void T(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] G() {
    return a;
  }
  
  static {
    if (G() != null)
      T(new yk[3]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\zb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.math.MathKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.util.Vector;

public final class jb {
  private static String a;
  
  private static final long b = o3.a(-6366052721971433854L, -7271714531972910559L, MethodHandles.lookup().lookupClass()).a(223876131563738L);
  
  public static final double p(@NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    double d1 = paramLocation2.getX() - paramLocation1.getX();
    double d2 = paramLocation2.getZ() - paramLocation1.getZ();
    return Math.abs(d1) + Math.abs(d2);
  }
  
  public static final int b(@NotNull List paramList, long paramLong) {
    paramLong = b ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (paramList.isEmpty())
            return 0; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return MathKt.roundToInt(CollectionsKt.averageOfInt(paramList));
  }
  
  public static final double j(long paramLong, @NotNull Iterable paramIterable) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jb.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: aload_2
    //   7: invokestatic averageOfFloat : (Ljava/lang/Iterable;)D
    //   10: dstore #4
    //   12: aload_2
    //   13: astore #8
    //   15: invokestatic r : ()I
    //   18: dconst_0
    //   19: dstore #9
    //   21: istore_3
    //   22: aload #8
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #11
    //   31: aload #11
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 102
    //   41: aload #11
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: astore #12
    //   50: dload #9
    //   52: aload #12
    //   54: checkcast java/lang/Number
    //   57: invokevirtual floatValue : ()F
    //   60: fstore #13
    //   62: dstore #15
    //   64: iconst_0
    //   65: istore #14
    //   67: fload #13
    //   69: f2d
    //   70: dload #4
    //   72: dsub
    //   73: iconst_2
    //   74: i2d
    //   75: invokestatic pow : (DD)D
    //   78: nop
    //   79: dstore #17
    //   81: lload_0
    //   82: lconst_0
    //   83: lcmp
    //   84: iflt -> 98
    //   87: dload #15
    //   89: dload #17
    //   91: dadd
    //   92: iload_3
    //   93: ifeq -> 116
    //   96: dstore #9
    //   98: iload_3
    //   99: ifne -> 31
    //   102: dload #9
    //   104: lload_0
    //   105: lconst_0
    //   106: lcmp
    //   107: iflt -> 116
    //   110: aload_2
    //   111: invokestatic count : (Ljava/lang/Iterable;)I
    //   114: i2d
    //   115: ddiv
    //   116: dstore #6
    //   118: dload #6
    //   120: invokestatic sqrt : (D)D
    //   123: dreturn
  }
  
  public static final boolean b(double paramDouble1, double paramDouble2, double paramDouble3, long paramLong) {
    paramLong = b ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        if (Math.abs(paramDouble1 - paramDouble2) <= paramDouble3) {
        
        } else {
          return false;
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static final int j(double paramDouble, long paramLong) {
    paramLong = b ^ paramLong;
    int i = yl.a();
    int j = (int)paramDouble;
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramDouble > j) ? (j + 1) : j;
  }
  
  public static final int b(double paramDouble, int paramInt, short paramShort, char paramChar) {
    long l = (paramInt << 32L | paramShort << 48L >>> 32L | paramChar << 48L >>> 48L) ^ b;
    int i = yl.a();
    int j = (int)paramDouble;
    try {
      if (i == 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramDouble < j) ? (j - 1) : j;
  }
  
  @NotNull
  public static final Vector b(@NotNull Vector paramVector) {
    return new Vector(paramVector.getX(), paramVector.getY(), paramVector.getZ());
  }
  
  public static final double j(@NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    double d1 = paramLocation2.getX() - paramLocation1.getX();
    double d2 = paramLocation2.getY() - paramLocation1.getY();
    double d3 = paramLocation2.getZ() - paramLocation1.getZ();
    return Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
  }
  
  public static final long b(long paramLong, @NotNull List paramList) {
    paramLong = b ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (paramList.isEmpty())
            return 0L; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return MathKt.roundToLong(CollectionsKt.averageOfLong(paramList));
  }
  
  public static final double b(@NotNull Vector paramVector) {
    return Math.sqrt(paramVector.getX() * paramVector.getX() + paramVector.getZ() * paramVector.getZ());
  }
  
  @NotNull
  public static final Vector b(@NotNull Pair paramPair) {
    Vector vector = new Vector();
    float f1 = ((Number)paramPair.getFirst()).floatValue();
    float f2 = ((Number)paramPair.getSecond()).floatValue();
    vector.setY(-Math.sin(Math.toRadians(f2)));
    double d = Math.cos(Math.toRadians(f2));
    vector.setX(-d * Math.sin(Math.toRadians(f1)));
    vector.setZ(d * Math.cos(Math.toRadians(f1)));
    return vector;
  }
  
  public static final float b(float paramFloat1, int paramInt, long paramLong, float paramFloat2) {
    long l = (paramInt << 32L | paramLong << 32L >>> 32L) ^ b;
    int i = yl.r();
    float f = Math.abs(paramFloat1 - paramFloat2) % 360.0F;
    try {
      if (i != 0)
        try {
          if (f > 180.0F) {
          
          } else {
            return f;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static final double b(@NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    double d1 = paramLocation2.getX() - paramLocation1.getX();
    double d2 = paramLocation2.getZ() - paramLocation1.getZ();
    return Math.sqrt(d1 * d1 + d2 * d2);
  }
  
  public static final double b(@NotNull Vector paramVector1, @NotNull Vector paramVector2) {
    double d1 = paramVector2.getX() - paramVector1.getX();
    double d2 = paramVector2.getZ() - paramVector1.getZ();
    return Math.abs(d1) + Math.abs(d2);
  }
  
  public static final double b(long paramLong, @NotNull Iterable paramIterable) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jb.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: aload_2
    //   7: invokestatic averageOfLong : (Ljava/lang/Iterable;)D
    //   10: dstore #4
    //   12: invokestatic a : ()I
    //   15: aload_2
    //   16: astore #8
    //   18: dconst_0
    //   19: dstore #9
    //   21: istore_3
    //   22: aload #8
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #11
    //   31: aload #11
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 102
    //   41: aload #11
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: astore #12
    //   50: dload #9
    //   52: aload #12
    //   54: checkcast java/lang/Number
    //   57: invokevirtual longValue : ()J
    //   60: lstore #13
    //   62: dstore #16
    //   64: iconst_0
    //   65: istore #15
    //   67: lload #13
    //   69: l2d
    //   70: dload #4
    //   72: dsub
    //   73: iconst_2
    //   74: i2d
    //   75: invokestatic pow : (DD)D
    //   78: nop
    //   79: dstore #18
    //   81: lload_0
    //   82: lconst_0
    //   83: lcmp
    //   84: ifle -> 98
    //   87: dload #16
    //   89: dload #18
    //   91: dadd
    //   92: iload_3
    //   93: ifne -> 116
    //   96: dstore #9
    //   98: iload_3
    //   99: ifeq -> 31
    //   102: dload #9
    //   104: lload_0
    //   105: lconst_0
    //   106: lcmp
    //   107: ifle -> 116
    //   110: aload_2
    //   111: invokestatic count : (Ljava/lang/Iterable;)I
    //   114: i2d
    //   115: ddiv
    //   116: dstore #6
    //   118: dload #6
    //   120: invokestatic sqrt : (D)D
    //   123: dreturn
  }
  
  public static void l(String paramString) {
    a = paramString;
  }
  
  public static String U() {
    return a;
  }
  
  static {
    if (U() == null)
      l("edsmTc"); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\jb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
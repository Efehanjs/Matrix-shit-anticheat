package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import org.bukkit.Location;

public class a {
  private Location b;
  
  private long i;
  
  private static yk[] a;
  
  private static final long c = o3.a(-8423508946458448996L, -1033415309372838611L, MethodHandles.lookup().lookupClass()).a(159567184458213L);
  
  public int hashCode() {
    long l1 = c ^ 0x660F0009EAAEL;
    byte b = 59;
    int j = 1;
    long l2 = b();
    j = j * 59 + (int)(l2 >>> 32L ^ l2);
    Location location = b();
    int i = yl.r();
    try {
      if (i != 0) {
        try {
          if (location == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return j * 59 + location.hashCode();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public a(Location paramLocation, long paramLong) {
    this.b = paramLocation;
    this.i = paramLong;
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof a;
  }
  
  public Location b() {
    return this.b;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/a.c : J
    //   3: ldc2_w 135971713829227
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic r : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifeq -> 37
    //   19: aload_0
    //   20: if_acmpne -> 36
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: iconst_1
    //   31: ireturn
    //   32: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   35: athrow
    //   36: aload_1
    //   37: iload #4
    //   39: ifeq -> 62
    //   42: instanceof me/rerere/matrix/internal/a
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/a
    //   65: astore #5
    //   67: aload #5
    //   69: aload_0
    //   70: invokevirtual b : (Ljava/lang/Object;)Z
    //   73: iload #4
    //   75: ifeq -> 116
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: aload_0
    //   95: iload #4
    //   97: ifeq -> 126
    //   100: invokevirtual b : ()J
    //   103: aload #5
    //   105: invokevirtual b : ()J
    //   108: lcmp
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: ifeq -> 125
    //   119: iconst_0
    //   120: ireturn
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload_0
    //   126: invokevirtual b : ()Lorg/bukkit/Location;
    //   129: astore #6
    //   131: aload #5
    //   133: invokevirtual b : ()Lorg/bukkit/Location;
    //   136: astore #7
    //   138: aload #6
    //   140: iload #4
    //   142: ifeq -> 176
    //   145: ifnonnull -> 174
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   154: athrow
    //   155: aload #7
    //   157: ifnull -> 202
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   166: athrow
    //   167: goto -> 196
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload #6
    //   176: aload #7
    //   178: invokevirtual equals : (Ljava/lang/Object;)Z
    //   181: iload #4
    //   183: ifeq -> 203
    //   186: ifne -> 202
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   195: athrow
    //   196: iconst_0
    //   197: ireturn
    //   198: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: iconst_1
    //   203: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   67	81	84	java/lang/RuntimeException
    //   78	90	90	java/lang/RuntimeException
    //   94	109	112	java/lang/RuntimeException
    //   116	121	121	java/lang/RuntimeException
    //   138	148	151	java/lang/RuntimeException
    //   145	160	163	java/lang/RuntimeException
    //   155	170	170	java/lang/RuntimeException
    //   176	189	192	java/lang/RuntimeException
    //   186	198	198	java/lang/RuntimeException
  }
  
  public long b() {
    return this.i;
  }
  
  public static void n(yk[] paramArrayOfyk) {
    a = paramArrayOfyk;
  }
  
  public static yk[] q() {
    return a;
  }
  
  static {
    if (q() != null)
      n(new yk[5]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
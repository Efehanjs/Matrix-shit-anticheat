package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class ic {
  @Nullable
  private Object i = null;
  
  private static int a;
  
  private static final long b = o3.a(-3921793691283510953L, 3180044125687086754L, MethodHandles.lookup().lookupClass()).a(231066664465261L);
  
  public void b(Object paramObject) {
    this.i = paramObject;
  }
  
  public int hashCode() {
    long l = b ^ 0x354B722BD54DL;
    byte b = 59;
    int j = 1;
    Object object = this.i;
    int i = yl.r();
    try {
      if (i != 0) {
        try {
          if (object == null) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return j * 59 + object.hashCode();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean b(Object paramObject) {
    return paramObject instanceof ic;
  }
  
  public boolean equals(Object paramObject) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ic.b : J
    //   3: ldc2_w 57158337138350
    //   6: lxor
    //   7: lstore_2
    //   8: invokestatic a : ()I
    //   11: istore #4
    //   13: aload_1
    //   14: iload #4
    //   16: ifne -> 37
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
    //   39: ifne -> 62
    //   42: instanceof me/rerere/matrix/internal/ic
    //   45: ifne -> 61
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   54: athrow
    //   55: iconst_0
    //   56: ireturn
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_1
    //   62: checkcast me/rerere/matrix/internal/ic
    //   65: astore #5
    //   67: aload #5
    //   69: iload #4
    //   71: ifne -> 98
    //   74: aload_0
    //   75: invokevirtual b : (Ljava/lang/Object;)Z
    //   78: ifne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   87: athrow
    //   88: iconst_0
    //   89: ireturn
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: aload_0
    //   95: getfield i : Ljava/lang/Object;
    //   98: astore #6
    //   100: aload #5
    //   102: getfield i : Ljava/lang/Object;
    //   105: astore #7
    //   107: aload #6
    //   109: iload #4
    //   111: ifne -> 145
    //   114: ifnonnull -> 143
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload #7
    //   126: ifnull -> 171
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   135: athrow
    //   136: goto -> 165
    //   139: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   142: athrow
    //   143: aload #6
    //   145: aload #7
    //   147: invokevirtual equals : (Ljava/lang/Object;)Z
    //   150: iload #4
    //   152: ifne -> 172
    //   155: ifne -> 171
    //   158: goto -> 165
    //   161: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   164: athrow
    //   165: iconst_0
    //   166: ireturn
    //   167: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   170: athrow
    //   171: iconst_1
    //   172: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	23	26	java/lang/RuntimeException
    //   19	32	32	java/lang/RuntimeException
    //   37	48	51	java/lang/RuntimeException
    //   42	57	57	java/lang/RuntimeException
    //   67	81	84	java/lang/RuntimeException
    //   74	90	90	java/lang/RuntimeException
    //   107	117	120	java/lang/RuntimeException
    //   114	129	132	java/lang/RuntimeException
    //   124	139	139	java/lang/RuntimeException
    //   145	158	161	java/lang/RuntimeException
    //   155	167	167	java/lang/RuntimeException
  }
  
  public Object b(@NotNull Class paramClass) {
    return paramClass.cast(this.i);
  }
  
  public static void I(int paramInt) {
    a = paramInt;
  }
  
  public static int M() {
    return a;
  }
  
  public static int h() {
    int i = M();
    try {
      if (i == 0)
        return 111; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    if (h() != 0)
      I(65); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
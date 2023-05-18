package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class md {
  private static String a;
  
  private static final long b = o3.a(758933633933985913L, 7246451105578319577L, MethodHandles.lookup().lookupClass()).a(179024450682593L);
  
  @Nullable
  public final yk b(@Nullable String paramString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/md.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: invokestatic values : ()[Lme/rerere/matrix/internal/yk;
    //   9: astore #5
    //   11: iconst_0
    //   12: istore #6
    //   14: invokestatic r : ()I
    //   17: iconst_0
    //   18: istore #7
    //   20: aload #5
    //   22: arraylength
    //   23: istore #8
    //   25: istore #4
    //   27: iload #7
    //   29: iload #8
    //   31: if_icmpge -> 108
    //   34: aload #5
    //   36: iload #7
    //   38: aaload
    //   39: astore #9
    //   41: aload #9
    //   43: astore #10
    //   45: iconst_0
    //   46: istore #11
    //   48: iload #4
    //   50: lload_2
    //   51: lconst_0
    //   52: lcmp
    //   53: ifle -> 105
    //   56: ifeq -> 103
    //   59: aload #10
    //   61: iload #4
    //   63: ifeq -> 109
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: invokevirtual j : ()Ljava/lang/String;
    //   76: aload_1
    //   77: iconst_1
    //   78: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   81: ifeq -> 100
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: aload #9
    //   93: goto -> 109
    //   96: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   99: athrow
    //   100: iinc #7, 1
    //   103: iload #4
    //   105: ifne -> 27
    //   108: aconst_null
    //   109: areturn
    // Exception table:
    //   from	to	target	type
    //   48	66	69	java/lang/RuntimeException
    //   59	84	87	java/lang/RuntimeException
    //   73	96	96	java/lang/RuntimeException
  }
  
  public static void D(String paramString) {
    a = paramString;
  }
  
  public static String s() {
    return a;
  }
  
  static {
    if (s() != null)
      D("h7jHz"); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\md.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
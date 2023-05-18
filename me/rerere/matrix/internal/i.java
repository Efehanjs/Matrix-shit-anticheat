package me.rerere.matrix.internal;

import com.comphenix.protocol.events.PacketContainer;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class i {
  @NotNull
  private final sb i;
  
  private static String a;
  
  private static final long b = o3.a(4291690091148100577L, -5970967050227310751L, MethodHandles.lookup().lookupClass()).a(96610501900478L);
  
  public final void b(long paramLong, @NotNull PacketContainer paramPacketContainer, @NotNull Function1 paramFunction11, @NotNull Function1 paramFunction12) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/i.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 41290884307034
    //   11: lxor
    //   12: lstore #6
    //   14: dup2
    //   15: ldc2_w 100910505999078
    //   18: lxor
    //   19: lstore #8
    //   21: pop2
    //   22: invokestatic r : ()I
    //   25: istore #10
    //   27: iconst_0
    //   28: istore #11
    //   30: aload #4
    //   32: aload_3
    //   33: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   38: checkcast java/lang/Boolean
    //   41: invokevirtual booleanValue : ()Z
    //   44: iload #10
    //   46: ifeq -> 109
    //   49: ifeq -> 137
    //   52: goto -> 59
    //   55: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   58: athrow
    //   59: aload_0
    //   60: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   63: new me/rerere/matrix/internal/s
    //   66: dup
    //   67: aload_3
    //   68: invokestatic currentTimeMillis : ()J
    //   71: invokespecial <init> : (Lcom/comphenix/protocol/events/PacketContainer;J)V
    //   74: lload #8
    //   76: dup2_x1
    //   77: pop2
    //   78: invokevirtual p : (JLjava/lang/Object;)V
    //   81: aload_0
    //   82: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   85: iload #10
    //   87: ifeq -> 136
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: lload #6
    //   99: invokevirtual p : (J)Z
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   108: athrow
    //   109: ifeq -> 137
    //   112: aload #5
    //   114: aload_0
    //   115: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   118: checkcast java/lang/Iterable
    //   121: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
    //   124: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   129: goto -> 136
    //   132: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   135: athrow
    //   136: pop
    //   137: return
    // Exception table:
    //   from	to	target	type
    //   30	52	55	java/lang/RuntimeException
    //   49	90	93	java/lang/RuntimeException
    //   59	102	105	java/lang/RuntimeException
    //   109	129	132	java/lang/RuntimeException
  }
  
  public final void b() {
    this.i.b();
  }
  
  public i(int paramInt) {
    this.i = new sb(paramInt);
  }
  
  @NotNull
  public final sb b() {
    return this.i;
  }
  
  public static void y(String paramString) {
    a = paramString;
  }
  
  public static String U() {
    return a;
  }
  
  static {
    if (U() == null)
      y("I0AZVb"); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
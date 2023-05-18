package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

public class tg {
  private final List k;
  
  private final String v;
  
  private final int b;
  
  private final int i;
  
  private static final long a = o3.a(-7875178785737399964L, 5816874274568833568L, MethodHandles.lookup().lookupClass()).a(89420671059548L);
  
  public void b() {
    this.k.forEach(oe::b);
  }
  
  public int j() {
    return this.i;
  }
  
  public String b() {
    return this.v;
  }
  
  public Optional b(long paramLong, String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/tg.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aconst_null
    //   7: astore #5
    //   9: invokestatic r : ()I
    //   12: aload_0
    //   13: getfield k : Ljava/util/List;
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore #6
    //   23: istore #4
    //   25: aload #6
    //   27: invokeinterface hasNext : ()Z
    //   32: ifeq -> 200
    //   35: aload #6
    //   37: invokeinterface next : ()Ljava/lang/Object;
    //   42: checkcast me/rerere/matrix/internal/oe
    //   45: astore #7
    //   47: aload #7
    //   49: lload_1
    //   50: lconst_0
    //   51: lcmp
    //   52: ifle -> 202
    //   55: iload #4
    //   57: lload_1
    //   58: lconst_0
    //   59: lcmp
    //   60: ifle -> 68
    //   63: ifeq -> 202
    //   66: iload #4
    //   68: lload_1
    //   69: lconst_0
    //   70: lcmp
    //   71: iflt -> 112
    //   74: ifeq -> 110
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: invokevirtual b : ()Ljava/lang/String;
    //   87: aload_3
    //   88: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   91: ifne -> 108
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   100: athrow
    //   101: goto -> 25
    //   104: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   107: athrow
    //   108: aload #5
    //   110: iload #4
    //   112: lload_1
    //   113: lconst_0
    //   114: lcmp
    //   115: iflt -> 150
    //   118: ifeq -> 148
    //   121: ifnonnull -> 146
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: aload #7
    //   133: astore #5
    //   135: iload #4
    //   137: lload_1
    //   138: lconst_0
    //   139: lcmp
    //   140: iflt -> 32
    //   143: ifne -> 25
    //   146: aload #7
    //   148: iload #4
    //   150: ifeq -> 187
    //   153: invokevirtual b : ()J
    //   156: aload #5
    //   158: invokevirtual b : ()J
    //   161: lcmp
    //   162: lload_1
    //   163: lconst_0
    //   164: lcmp
    //   165: ifle -> 191
    //   168: ifge -> 189
    //   171: goto -> 178
    //   174: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   177: athrow
    //   178: aload #7
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   186: athrow
    //   187: astore #5
    //   189: iload #4
    //   191: lload_1
    //   192: lconst_0
    //   193: lcmp
    //   194: iflt -> 32
    //   197: ifne -> 25
    //   200: aload #5
    //   202: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   205: areturn
    // Exception table:
    //   from	to	target	type
    //   47	77	80	java/lang/RuntimeException
    //   66	94	97	java/lang/RuntimeException
    //   84	104	104	java/lang/RuntimeException
    //   110	124	127	java/lang/RuntimeException
    //   148	171	174	java/lang/RuntimeException
    //   153	180	183	java/lang/RuntimeException
  }
  
  public tg(String paramString, int paramInt1, List paramList, int paramInt2) {
    this.v = paramString;
    this.b = paramInt1;
    this.k = paramList;
    this.i = paramInt2;
  }
  
  public int b() {
    return this.b;
  }
  
  public List b() {
    return this.k;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\tg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
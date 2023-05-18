package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ik {
  @NotNull
  private final sb i = new sb(10);
  
  private static final long a = o3.a(737112689322862466L, 6886450634068749169L, MethodHandles.lookup().lookupClass()).a(166672300707758L);
  
  public final void b(double paramDouble, long paramLong) {
    paramLong = a ^ paramLong;
    long l = paramLong ^ 0xF29C1BA6EE5L;
    this.i.p(l, new nd(paramDouble, pc.b()));
  }
  
  public final double b(char paramChar, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/ik.a : J
    //   26: lxor
    //   27: lstore #4
    //   29: aload_0
    //   30: getfield i : Lme/rerere/matrix/internal/sb;
    //   33: checkcast java/lang/Iterable
    //   36: astore #7
    //   38: invokestatic a : ()I
    //   41: nop
    //   42: iconst_0
    //   43: istore #8
    //   45: aload #7
    //   47: astore #9
    //   49: new java/util/ArrayList
    //   52: dup
    //   53: invokespecial <init> : ()V
    //   56: checkcast java/util/Collection
    //   59: astore #10
    //   61: iconst_0
    //   62: istore #11
    //   64: istore #6
    //   66: aload #9
    //   68: invokeinterface iterator : ()Ljava/util/Iterator;
    //   73: astore #12
    //   75: aload #12
    //   77: invokeinterface hasNext : ()Z
    //   82: ifeq -> 171
    //   85: aload #12
    //   87: invokeinterface next : ()Ljava/lang/Object;
    //   92: astore #13
    //   94: aload #13
    //   96: checkcast me/rerere/matrix/internal/nd
    //   99: astore #14
    //   101: iconst_0
    //   102: istore #15
    //   104: iload_1
    //   105: iflt -> 216
    //   108: invokestatic b : ()J
    //   111: aload #14
    //   113: invokevirtual b : ()J
    //   116: lsub
    //   117: ldc2_w 1000
    //   120: lcmp
    //   121: iload #6
    //   123: ifne -> 214
    //   126: iload #6
    //   128: ifne -> 149
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: ifgt -> 152
    //   141: goto -> 148
    //   144: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: iconst_1
    //   149: goto -> 153
    //   152: iconst_0
    //   153: ifeq -> 75
    //   156: aload #10
    //   158: aload #13
    //   160: invokeinterface add : (Ljava/lang/Object;)Z
    //   165: pop
    //   166: iload #6
    //   168: ifeq -> 75
    //   171: aload #10
    //   173: checkcast java/util/List
    //   176: nop
    //   177: checkcast java/lang/Iterable
    //   180: astore #7
    //   182: nop
    //   183: iconst_0
    //   184: istore #8
    //   186: aload #7
    //   188: astore #9
    //   190: new java/util/ArrayList
    //   193: dup
    //   194: aload #7
    //   196: bipush #10
    //   198: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   201: invokespecial <init> : (I)V
    //   204: checkcast java/util/Collection
    //   207: astore #10
    //   209: iload_2
    //   210: ifle -> 216
    //   213: iconst_0
    //   214: istore #11
    //   216: aload #9
    //   218: invokeinterface iterator : ()Ljava/util/Iterator;
    //   223: astore #12
    //   225: aload #12
    //   227: invokeinterface hasNext : ()Z
    //   232: ifeq -> 300
    //   235: aload #12
    //   237: invokeinterface next : ()Ljava/lang/Object;
    //   242: astore #13
    //   244: aload #10
    //   246: aload #13
    //   248: checkcast me/rerere/matrix/internal/nd
    //   251: astore #14
    //   253: astore #16
    //   255: iconst_0
    //   256: istore #15
    //   258: iload_2
    //   259: ifle -> 284
    //   262: aload #14
    //   264: invokevirtual b : ()D
    //   267: iload #6
    //   269: ifne -> 312
    //   272: invokestatic valueOf : (D)Ljava/lang/Double;
    //   275: aload #16
    //   277: swap
    //   278: invokeinterface add : (Ljava/lang/Object;)Z
    //   283: pop
    //   284: iload #6
    //   286: ifeq -> 225
    //   289: iload_1
    //   290: iflt -> 258
    //   293: goto -> 300
    //   296: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   299: athrow
    //   300: aload #10
    //   302: checkcast java/util/List
    //   305: nop
    //   306: checkcast java/lang/Iterable
    //   309: invokestatic averageOfDouble : (Ljava/lang/Iterable;)D
    //   312: dreturn
    // Exception table:
    //   from	to	target	type
    //   104	131	134	java/lang/RuntimeException
    //   126	141	144	java/lang/RuntimeException
    //   258	289	296	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ik.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
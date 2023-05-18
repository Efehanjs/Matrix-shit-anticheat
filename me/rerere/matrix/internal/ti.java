package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashSet;
import java.util.Set;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.block.Block;

public final class ti {
  @NotNull
  private final Set i = new LinkedHashSet();
  
  private static int[] a;
  
  private static final long b = o3.a(7715115988802181895L, -8572898035635900500L, MethodHandles.lookup().lookupClass()).a(24273780706155L);
  
  public final void b(@NotNull Block paramBlock) {
    this.i.add(new dk(paramBlock.getX(), paramBlock.getY(), paramBlock.getZ()));
  }
  
  public final void b(int paramInt1, char paramChar, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramChar << 48L >>> 32L | paramInt2 << 48L >>> 48L) ^ b;
    try {
      if (this.i.isEmpty())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l2 = pc.j();
    this.i.removeIf(paramObject -> ((Boolean)paramFunction1.invoke(paramObject)).booleanValue());
  }
  
  @NotNull
  public final Set b() {
    return this.i;
  }
  
  public final boolean b(@NotNull Location paramLocation, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ti.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 12595447547770
    //   11: lxor
    //   12: lstore #4
    //   14: pop2
    //   15: invokestatic b : ()J
    //   18: lstore #7
    //   20: aload_0
    //   21: getfield i : Ljava/util/Set;
    //   24: checkcast java/lang/Iterable
    //   27: astore #9
    //   29: invokestatic a : ()I
    //   32: iconst_0
    //   33: istore #10
    //   35: istore #6
    //   37: aload #9
    //   39: iload #6
    //   41: ifne -> 99
    //   44: instanceof java/util/Collection
    //   47: ifeq -> 97
    //   50: goto -> 57
    //   53: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   56: athrow
    //   57: aload #9
    //   59: checkcast java/util/Collection
    //   62: iload #6
    //   64: ifne -> 99
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: invokeinterface isEmpty : ()Z
    //   79: ifeq -> 97
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: iconst_0
    //   90: goto -> 209
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: aload #9
    //   99: invokeinterface iterator : ()Ljava/util/Iterator;
    //   104: astore #11
    //   106: aload #11
    //   108: invokeinterface hasNext : ()Z
    //   113: ifeq -> 208
    //   116: aload #11
    //   118: invokeinterface next : ()Ljava/lang/Object;
    //   123: astore #12
    //   125: aload #12
    //   127: checkcast me/rerere/matrix/internal/dk
    //   130: astore #13
    //   132: iconst_0
    //   133: istore #14
    //   135: aload #13
    //   137: lload #4
    //   139: aload_1
    //   140: invokevirtual b : (JLorg/bukkit/Location;)Z
    //   143: iload #6
    //   145: ifne -> 170
    //   148: ifeq -> 189
    //   151: lload #7
    //   153: aload #13
    //   155: invokevirtual b : ()J
    //   158: lsub
    //   159: ldc2_w 2000
    //   162: lcmp
    //   163: goto -> 170
    //   166: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   169: athrow
    //   170: iload #6
    //   172: ifne -> 186
    //   175: ifgt -> 189
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   184: athrow
    //   185: iconst_1
    //   186: goto -> 190
    //   189: iconst_0
    //   190: ifeq -> 106
    //   193: iconst_1
    //   194: iload #6
    //   196: lload_2
    //   197: lconst_0
    //   198: lcmp
    //   199: ifle -> 145
    //   202: ifne -> 143
    //   205: goto -> 209
    //   208: iconst_0
    //   209: ireturn
    // Exception table:
    //   from	to	target	type
    //   37	50	53	java/lang/RuntimeException
    //   44	67	70	java/lang/RuntimeException
    //   57	82	85	java/lang/RuntimeException
    //   74	93	93	java/lang/RuntimeException
    //   148	163	166	java/lang/RuntimeException
    //   170	178	181	java/lang/RuntimeException
  }
  
  public static void F(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] P() {
    return a;
  }
  
  static {
    if (P() == null)
      F(new int[2]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ti.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
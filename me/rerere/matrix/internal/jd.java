package me.rerere.matrix.internal;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Chunk;
import org.bukkit.Location;

public final class jd {
  @NotNull
  private final Cache i = CacheBuilder.newBuilder().expireAfterWrite(15L, TimeUnit.SECONDS).build();
  
  private static int[] a;
  
  private static final long b = o3.a(4395716243215294579L, 2822878781467637312L, MethodHandles.lookup().lookupClass()).a(116204675836871L);
  
  public final boolean b(@NotNull Location paramLocation, long paramLong1, long paramLong2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jd.b : J
    //   3: lload #4
    //   5: lxor
    //   6: lstore #4
    //   8: aload_1
    //   9: invokevirtual getWorld : ()Lorg/bukkit/World;
    //   12: dup
    //   13: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   16: invokeinterface getName : ()Ljava/lang/String;
    //   21: astore #7
    //   23: invokestatic r : ()I
    //   26: aload_1
    //   27: invokevirtual getBlockX : ()I
    //   30: iconst_4
    //   31: ishr
    //   32: istore #8
    //   34: istore #6
    //   36: aload_1
    //   37: invokevirtual getBlockZ : ()I
    //   40: iconst_4
    //   41: ishr
    //   42: istore #9
    //   44: new me/rerere/matrix/internal/bm
    //   47: dup
    //   48: aload #7
    //   50: iload #8
    //   52: iload #9
    //   54: invokespecial <init> : (Ljava/lang/String;II)V
    //   57: astore #10
    //   59: iload #6
    //   61: ifeq -> 97
    //   64: aload_0
    //   65: getfield i : Lcom/google/common/cache/Cache;
    //   68: aload #10
    //   70: invokeinterface getIfPresent : (Ljava/lang/Object;)Ljava/lang/Object;
    //   75: checkcast java/lang/Long
    //   78: dup
    //   79: ifnonnull -> 99
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: pop
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   96: athrow
    //   97: iconst_0
    //   98: ireturn
    //   99: invokevirtual longValue : ()J
    //   102: lstore #11
    //   104: invokestatic j : ()J
    //   107: lload #11
    //   109: lsub
    //   110: lload_2
    //   111: lcmp
    //   112: iload #6
    //   114: ifeq -> 128
    //   117: ifgt -> 131
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   126: athrow
    //   127: iconst_1
    //   128: goto -> 132
    //   131: iconst_0
    //   132: ireturn
    // Exception table:
    //   from	to	target	type
    //   59	82	85	java/lang/RuntimeException
    //   64	90	93	java/lang/RuntimeException
    //   104	120	123	java/lang/RuntimeException
  }
  
  public final boolean b(long paramLong1, @NotNull Chunk paramChunk, long paramLong2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jd.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: invokestatic a : ()I
    //   9: istore #6
    //   11: aload_3
    //   12: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   17: invokeinterface getName : ()Ljava/lang/String;
    //   22: astore #7
    //   24: new me/rerere/matrix/internal/bm
    //   27: dup
    //   28: aload #7
    //   30: aload_3
    //   31: invokeinterface getX : ()I
    //   36: aload_3
    //   37: invokeinterface getZ : ()I
    //   42: invokespecial <init> : (Ljava/lang/String;II)V
    //   45: astore #8
    //   47: iload #6
    //   49: ifne -> 85
    //   52: aload_0
    //   53: getfield i : Lcom/google/common/cache/Cache;
    //   56: aload #8
    //   58: invokeinterface getIfPresent : (Ljava/lang/Object;)Ljava/lang/Object;
    //   63: checkcast java/lang/Long
    //   66: dup
    //   67: ifnonnull -> 87
    //   70: goto -> 77
    //   73: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   76: athrow
    //   77: pop
    //   78: goto -> 85
    //   81: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   84: athrow
    //   85: iconst_0
    //   86: ireturn
    //   87: invokevirtual longValue : ()J
    //   90: lstore #9
    //   92: invokestatic j : ()J
    //   95: lload #9
    //   97: lsub
    //   98: lload #4
    //   100: lcmp
    //   101: iload #6
    //   103: ifne -> 117
    //   106: ifgt -> 120
    //   109: goto -> 116
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: ireturn
    // Exception table:
    //   from	to	target	type
    //   47	70	73	java/lang/RuntimeException
    //   52	78	81	java/lang/RuntimeException
    //   92	109	112	java/lang/RuntimeException
  }
  
  public final void b(@NotNull Chunk paramChunk) {
    this.i.put(new bm(paramChunk.getWorld().getName(), paramChunk.getX(), paramChunk.getZ()), Long.valueOf(pc.j()));
  }
  
  public static void d(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] H() {
    return a;
  }
  
  static {
    if (H() != null)
      d(new int[4]); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\jd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.entity.LivingEntity;

public class h {
  private int v;
  
  @Nullable
  private WeakReference b;
  
  private final Queue i = new ArrayDeque();
  
  private static final long a = o3.a(-6900932773245731541L, -8282732320054811063L, MethodHandles.lookup().lookupClass()).a(183605830722686L);
  
  public int b() {
    return this.v;
  }
  
  public Queue b() {
    return this.i;
  }
  
  @NotNull
  public List b(long paramLong1, long paramLong2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/h.a : J
    //   3: lload_3
    //   4: lxor
    //   5: lstore_3
    //   6: new java/util/ArrayList
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore #6
    //   15: invokestatic a : ()I
    //   18: aload_0
    //   19: getfield i : Ljava/util/Queue;
    //   22: invokeinterface iterator : ()Ljava/util/Iterator;
    //   27: astore #7
    //   29: istore #5
    //   31: aload #7
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 97
    //   41: aload #7
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast me/rerere/matrix/internal/a
    //   51: astore #8
    //   53: aload #8
    //   55: invokevirtual b : ()J
    //   58: lload_1
    //   59: lcmp
    //   60: iload #5
    //   62: ifne -> 91
    //   65: iflt -> 92
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   74: athrow
    //   75: aload #6
    //   77: aload #8
    //   79: invokeinterface add : (Ljava/lang/Object;)Z
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: pop
    //   92: iload #5
    //   94: ifeq -> 31
    //   97: aload #6
    //   99: lload_3
    //   100: lconst_0
    //   101: lcmp
    //   102: ifle -> 48
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   53	68	71	java/lang/RuntimeException
    //   65	84	87	java/lang/RuntimeException
  }
  
  @Nullable
  public LivingEntity b(long paramLong, char paramChar) {
    long l = (paramLong << 16L | paramChar << 48L >>> 48L) ^ a;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (this.b == null)
            return null; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.b.get();
  }
  
  public void j() {
    this.v = 0;
    this.b = null;
    this.i.clear();
  }
  
  public void b(LivingEntity paramLivingEntity, long paramLong) {
    paramLong = a ^ paramLong;
    long l = (paramLong ^ 0x54879201C6B1L) >>> 16L;
    int i = (int)((paramLong ^ 0x54879201C6B1L) << 48L >>> 48L);
    paramLong ^ 0x54879201C6B1L;
    int j = yl.r();
    LivingEntity livingEntity = b(l, (char)i);
    try {
      if (j != 0)
        try {
          if (livingEntity == null) {
            j();
            this.b = new WeakReference<>(paramLivingEntity);
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!livingEntity.equals(paramLivingEntity)) {
        j();
        this.b = new WeakReference<>(paramLivingEntity);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void b(long paramLong) {
    paramLong = a ^ paramLong;
    long l = (paramLong ^ 0x241CDCA9A8D4L) >>> 16L;
    int i = (int)((paramLong ^ 0x241CDCA9A8D4L) << 48L >>> 48L);
    paramLong ^ 0x241CDCA9A8D4L;
    int j = yl.r();
    LivingEntity livingEntity = b(l, (char)i);
    try {
      if (j != 0)
        try {
          if (livingEntity != null) {
            this.v++;
            this.i.add(new a(livingEntity.getLocation().clone(), pc.j()));
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (j != 0)
        try {
          if (this.i.size() > 20) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
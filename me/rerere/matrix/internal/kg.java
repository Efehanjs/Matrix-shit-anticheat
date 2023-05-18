package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public final class kg {
  @NotNull
  private final List i = new ArrayList();
  
  private static final long a = o3.a(7281344475203211821L, 8446820225113222562L, MethodHandles.lookup().lookupClass()).a(85696725917531L);
  
  @NotNull
  public final Collection b(int paramInt1, char paramChar, @NotNull Player paramPlayer, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/kg.a : J
    //   27: lxor
    //   28: lstore #5
    //   30: aload_0
    //   31: getfield i : Ljava/util/List;
    //   34: checkcast java/lang/Iterable
    //   37: astore #8
    //   39: invokestatic a : ()I
    //   42: iconst_0
    //   43: istore #9
    //   45: aload #8
    //   47: astore #10
    //   49: new java/util/ArrayList
    //   52: dup
    //   53: invokespecial <init> : ()V
    //   56: checkcast java/util/Collection
    //   59: astore #11
    //   61: istore #7
    //   63: iconst_0
    //   64: istore #12
    //   66: aload #10
    //   68: invokeinterface iterator : ()Ljava/util/Iterator;
    //   73: astore #13
    //   75: aload #13
    //   77: invokeinterface hasNext : ()Z
    //   82: ifeq -> 152
    //   85: aload #13
    //   87: invokeinterface next : ()Ljava/lang/Object;
    //   92: astore #14
    //   94: aload #14
    //   96: checkcast me/rerere/matrix/internal/j
    //   99: astore #15
    //   101: iconst_0
    //   102: istore #16
    //   104: aload #15
    //   106: aload_3
    //   107: invokeinterface b : (Lorg/bukkit/entity/Player;)Ljava/util/Collection;
    //   112: checkcast java/lang/Iterable
    //   115: astore #15
    //   117: iload #4
    //   119: ifle -> 135
    //   122: aload #11
    //   124: iload #7
    //   126: ifne -> 161
    //   129: aload #15
    //   131: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
    //   134: pop
    //   135: iload #7
    //   137: ifeq -> 75
    //   140: iload #4
    //   142: iflt -> 117
    //   145: goto -> 152
    //   148: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   151: athrow
    //   152: aload #11
    //   154: checkcast java/util/List
    //   157: nop
    //   158: checkcast java/util/Collection
    //   161: areturn
    // Exception table:
    //   from	to	target	type
    //   117	140	148	java/lang/RuntimeException
  }
  
  public final void j(@NotNull j paramj) {
    this.i.remove(paramj);
  }
  
  public final void b(@NotNull j paramj) {
    this.i.add(paramj);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\kg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
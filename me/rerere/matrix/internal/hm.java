package me.rerere.matrix.internal;

import java.util.Collection;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class hm implements m {
  @NotNull
  public static final hm i = new hm();
  
  @NotNull
  public Collection b(char paramChar, int paramInt1, int paramInt2, @NotNull Collection paramCollection) {
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
    //   23: lstore #5
    //   25: aload #4
    //   27: checkcast java/lang/Iterable
    //   30: astore #8
    //   32: iconst_0
    //   33: istore #9
    //   35: invokestatic a : ()I
    //   38: aload #8
    //   40: astore #10
    //   42: new java/util/ArrayList
    //   45: dup
    //   46: aload #8
    //   48: bipush #10
    //   50: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   53: invokespecial <init> : (I)V
    //   56: checkcast java/util/Collection
    //   59: astore #11
    //   61: iconst_0
    //   62: istore #12
    //   64: istore #7
    //   66: aload #10
    //   68: invokeinterface iterator : ()Ljava/util/Iterator;
    //   73: astore #13
    //   75: aload #13
    //   77: invokeinterface hasNext : ()Z
    //   82: ifeq -> 149
    //   85: aload #13
    //   87: invokeinterface next : ()Ljava/lang/Object;
    //   92: astore #14
    //   94: aload #11
    //   96: aload #14
    //   98: checkcast me/rerere/matrix/internal/mh
    //   101: astore #15
    //   103: iload #7
    //   105: ifne -> 162
    //   108: astore #17
    //   110: iconst_0
    //   111: istore #16
    //   113: new me/rerere/matrix/internal/ym
    //   116: dup
    //   117: aload #15
    //   119: invokevirtual j : ()Ljava/lang/String;
    //   122: aload #15
    //   124: invokevirtual b : ()Ljava/lang/String;
    //   127: aload #15
    //   129: invokevirtual b : ()Ljava/util/Map;
    //   132: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //   135: aload #17
    //   137: swap
    //   138: invokeinterface add : (Ljava/lang/Object;)Z
    //   143: pop
    //   144: iload #7
    //   146: ifeq -> 75
    //   149: aload #11
    //   151: checkcast java/util/List
    //   154: nop
    //   155: iload_3
    //   156: ifle -> 92
    //   159: checkcast java/util/Collection
    //   162: areturn
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\hm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
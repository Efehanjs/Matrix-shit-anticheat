package me.rerere.matrix.internal;

import com.comphenix.protocol.events.PacketContainer;
import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class l {
  private static boolean a;
  
  private static final long b = o3.a(-7910266699627177511L, -3987027319700777919L, MethodHandles.lookup().lookupClass()).a(147176308508358L);
  
  public static final double b(@NotNull PacketContainer paramPacketContainer, int paramInt) {
    Intrinsics.checkNotNull(paramPacketContainer.getDoubles().readSafely(paramInt));
    return ((Number)paramPacketContainer.getDoubles().readSafely(paramInt)).doubleValue();
  }
  
  @NotNull
  public static final List h(@NotNull PacketContainer paramPacketContainer, @NotNull IntRange paramIntRange, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/l.b : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: aload_1
    //   7: checkcast java/lang/Iterable
    //   10: astore #5
    //   12: invokestatic r : ()I
    //   15: iconst_0
    //   16: istore #6
    //   18: istore #4
    //   20: aload #5
    //   22: astore #7
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: aload #5
    //   30: bipush #10
    //   32: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   35: invokespecial <init> : (I)V
    //   38: checkcast java/util/Collection
    //   41: astore #8
    //   43: iconst_0
    //   44: istore #9
    //   46: aload #7
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #10
    //   55: aload #10
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 111
    //   65: aload #10
    //   67: checkcast me/rerere/matrix/thirdparty/kotlin/collections/IntIterator
    //   70: invokevirtual nextInt : ()I
    //   73: istore #11
    //   75: aload #8
    //   77: iload #11
    //   79: istore #12
    //   81: iload #4
    //   83: ifeq -> 113
    //   86: astore #14
    //   88: iconst_0
    //   89: istore #13
    //   91: aload_0
    //   92: iload #12
    //   94: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)Ljava/lang/Integer;
    //   97: aload #14
    //   99: swap
    //   100: invokeinterface add : (Ljava/lang/Object;)Z
    //   105: pop
    //   106: iload #4
    //   108: ifne -> 55
    //   111: aload #8
    //   113: checkcast java/util/List
    //   116: nop
    //   117: areturn
  }
  
  @NotNull
  public static final List m(@NotNull PacketContainer paramPacketContainer, long paramLong, @NotNull IntRange paramIntRange) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/l.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_3
    //   7: checkcast java/lang/Iterable
    //   10: astore #5
    //   12: invokestatic r : ()I
    //   15: iconst_0
    //   16: istore #6
    //   18: aload #5
    //   20: astore #7
    //   22: new java/util/ArrayList
    //   25: dup
    //   26: aload #5
    //   28: bipush #10
    //   30: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   33: invokespecial <init> : (I)V
    //   36: checkcast java/util/Collection
    //   39: astore #8
    //   41: iconst_0
    //   42: istore #9
    //   44: istore #4
    //   46: aload #7
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #10
    //   55: aload #10
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 114
    //   65: aload #10
    //   67: checkcast me/rerere/matrix/thirdparty/kotlin/collections/IntIterator
    //   70: invokevirtual nextInt : ()I
    //   73: istore #11
    //   75: aload #8
    //   77: iload #11
    //   79: istore #12
    //   81: iload #4
    //   83: ifeq -> 116
    //   86: astore #14
    //   88: iconst_0
    //   89: istore #13
    //   91: aload_0
    //   92: iload #12
    //   94: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)D
    //   97: invokestatic valueOf : (D)Ljava/lang/Double;
    //   100: aload #14
    //   102: swap
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: iload #4
    //   111: ifne -> 55
    //   114: aload #8
    //   116: checkcast java/util/List
    //   119: nop
    //   120: areturn
  }
  
  @NotNull
  public static final List p(long paramLong, @NotNull PacketContainer paramPacketContainer, @NotNull IntRange paramIntRange) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/l.b : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: aload_3
    //   7: checkcast java/lang/Iterable
    //   10: astore #5
    //   12: invokestatic a : ()I
    //   15: iconst_0
    //   16: istore #6
    //   18: istore #4
    //   20: aload #5
    //   22: astore #7
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: aload #5
    //   30: bipush #10
    //   32: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   35: invokespecial <init> : (I)V
    //   38: checkcast java/util/Collection
    //   41: astore #8
    //   43: iconst_0
    //   44: istore #9
    //   46: aload #7
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #10
    //   55: aload #10
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 114
    //   65: aload #10
    //   67: checkcast me/rerere/matrix/thirdparty/kotlin/collections/IntIterator
    //   70: invokevirtual nextInt : ()I
    //   73: istore #11
    //   75: aload #8
    //   77: iload #11
    //   79: istore #12
    //   81: iload #4
    //   83: ifne -> 116
    //   86: astore #14
    //   88: iconst_0
    //   89: istore #13
    //   91: aload_2
    //   92: iload #12
    //   94: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)Z
    //   97: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   100: aload #14
    //   102: swap
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: iload #4
    //   111: ifeq -> 55
    //   114: aload #8
    //   116: checkcast java/util/List
    //   119: nop
    //   120: areturn
  }
  
  @Nullable
  public static final String b(@NotNull PacketContainer paramPacketContainer, int paramInt) {
    return (String)paramPacketContainer.getStrings().readSafely(paramInt);
  }
  
  @Nullable
  public static final Integer b(@NotNull PacketContainer paramPacketContainer, int paramInt) {
    return (Integer)paramPacketContainer.getIntegers().readSafely(paramInt);
  }
  
  @NotNull
  public static final List j(@NotNull PacketContainer paramPacketContainer, long paramLong, @NotNull IntRange paramIntRange) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/l.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_3
    //   7: checkcast java/lang/Iterable
    //   10: astore #5
    //   12: iconst_0
    //   13: istore #6
    //   15: aload #5
    //   17: astore #7
    //   19: invokestatic r : ()I
    //   22: new java/util/ArrayList
    //   25: dup
    //   26: aload #5
    //   28: bipush #10
    //   30: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   33: invokespecial <init> : (I)V
    //   36: checkcast java/util/Collection
    //   39: astore #8
    //   41: istore #4
    //   43: iconst_0
    //   44: istore #9
    //   46: aload #7
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #10
    //   55: aload #10
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 114
    //   65: aload #10
    //   67: checkcast me/rerere/matrix/thirdparty/kotlin/collections/IntIterator
    //   70: invokevirtual nextInt : ()I
    //   73: istore #11
    //   75: aload #8
    //   77: iload #11
    //   79: istore #12
    //   81: iload #4
    //   83: ifeq -> 116
    //   86: astore #14
    //   88: iconst_0
    //   89: istore #13
    //   91: aload_0
    //   92: iload #12
    //   94: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)F
    //   97: invokestatic valueOf : (F)Ljava/lang/Float;
    //   100: aload #14
    //   102: swap
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: iload #4
    //   111: ifne -> 55
    //   114: aload #8
    //   116: checkcast java/util/List
    //   119: nop
    //   120: areturn
  }
  
  public static final boolean b(@NotNull PacketContainer paramPacketContainer, int paramInt) {
    return ((Boolean)paramPacketContainer.getBooleans().readSafely(paramInt)).booleanValue();
  }
  
  @NotNull
  public static final List b(@NotNull PacketContainer paramPacketContainer, long paramLong, @NotNull IntRange paramIntRange) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/l.b : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_3
    //   7: checkcast java/lang/Iterable
    //   10: astore #5
    //   12: iconst_0
    //   13: istore #6
    //   15: invokestatic a : ()I
    //   18: aload #5
    //   20: astore #7
    //   22: new java/util/ArrayList
    //   25: dup
    //   26: aload #5
    //   28: bipush #10
    //   30: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   33: invokespecial <init> : (I)V
    //   36: checkcast java/util/Collection
    //   39: astore #8
    //   41: istore #4
    //   43: iconst_0
    //   44: istore #9
    //   46: aload #7
    //   48: invokeinterface iterator : ()Ljava/util/Iterator;
    //   53: astore #10
    //   55: aload #10
    //   57: invokeinterface hasNext : ()Z
    //   62: ifeq -> 111
    //   65: aload #10
    //   67: checkcast me/rerere/matrix/thirdparty/kotlin/collections/IntIterator
    //   70: invokevirtual nextInt : ()I
    //   73: istore #11
    //   75: aload #8
    //   77: iload #11
    //   79: istore #12
    //   81: iload #4
    //   83: ifne -> 113
    //   86: astore #14
    //   88: iconst_0
    //   89: istore #13
    //   91: aload_0
    //   92: iload #12
    //   94: invokestatic b : (Lcom/comphenix/protocol/events/PacketContainer;I)Ljava/lang/String;
    //   97: aload #14
    //   99: swap
    //   100: invokeinterface add : (Ljava/lang/Object;)Z
    //   105: pop
    //   106: iload #4
    //   108: ifeq -> 55
    //   111: aload #8
    //   113: checkcast java/util/List
    //   116: nop
    //   117: areturn
  }
  
  public static final float b(@NotNull PacketContainer paramPacketContainer, int paramInt) {
    return ((Number)paramPacketContainer.getFloat().readSafely(paramInt)).floatValue();
  }
  
  public static void G(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean u() {
    return a;
  }
  
  public static boolean Y() {
    boolean bool = u();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    if (Y())
      G(true); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
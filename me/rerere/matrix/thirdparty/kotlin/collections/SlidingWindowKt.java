package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.Iterator;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class SlidingWindowKt {
  private static final long a = o3.a(4114989497571711684L, 722868049323331066L, null).a(60756185117741L);
  
  @NotNull
  public static final Sequence windowedSequence(@NotNull Sequence paramSequence, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    long l = a ^ 0xFB0D97227A5L;
    Intrinsics.checkNotNullParameter(paramSequence, "<this>");
    checkWindowSizeStep(paramInt1, paramInt2);
    return new SlidingWindowKt$windowedSequence$$inlined$Sequence$1(paramSequence, paramInt1, paramInt2, paramBoolean1, paramBoolean2);
  }
  
  @NotNull
  public static final Iterator windowedIterator(@NotNull Iterator paramIterator, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    long l = a ^ 0x7D335BB9A925L;
    try {
      Intrinsics.checkNotNullParameter(paramIterator, "iterator");
      if (!paramIterator.hasNext())
        return EmptyIterator.INSTANCE; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return SequencesKt.iterator(new SlidingWindowKt$windowedIterator$1(paramInt1, paramInt2, paramIterator, paramBoolean2, paramBoolean1, null));
  }
  
  public static final void checkWindowSizeStep(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/collections/SlidingWindowKt.a : J
    //   3: ldc2_w 41564951600019
    //   6: lxor
    //   7: lstore_2
    //   8: iload_0
    //   9: ifle -> 31
    //   12: iload_1
    //   13: ifle -> 31
    //   16: goto -> 23
    //   19: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   22: athrow
    //   23: iconst_1
    //   24: goto -> 32
    //   27: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   30: athrow
    //   31: iconst_0
    //   32: istore #4
    //   34: iload #4
    //   36: ifne -> 127
    //   39: iconst_0
    //   40: istore #5
    //   42: iload_0
    //   43: iload_1
    //   44: if_icmpeq -> 87
    //   47: new java/lang/StringBuilder
    //   50: dup
    //   51: invokespecial <init> : ()V
    //   54: ldc 'Both size '
    //   56: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: iload_0
    //   60: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   63: ldc ' and step '
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: iload_1
    //   69: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   72: ldc ' must be greater than zero.'
    //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual toString : ()Ljava/lang/String;
    //   80: goto -> 111
    //   83: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   86: athrow
    //   87: new java/lang/StringBuilder
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: ldc 'size '
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: iload_0
    //   100: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   103: ldc ' must be greater than zero.'
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokevirtual toString : ()Ljava/lang/String;
    //   111: nop
    //   112: astore #5
    //   114: new java/lang/IllegalArgumentException
    //   117: dup
    //   118: aload #5
    //   120: invokevirtual toString : ()Ljava/lang/String;
    //   123: invokespecial <init> : (Ljava/lang/String;)V
    //   126: athrow
    //   127: return
    // Exception table:
    //   from	to	target	type
    //   8	16	19	java/lang/IllegalArgumentException
    //   12	27	27	java/lang/IllegalArgumentException
    //   42	83	83	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\SlidingWindowKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
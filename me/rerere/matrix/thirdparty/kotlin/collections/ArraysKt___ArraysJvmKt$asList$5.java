package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$5 extends AbstractList implements RandomAccess {
  public ArraysKt___ArraysJvmKt$asList$5(float[] paramArrayOffloat) {}
  
  @NotNull
  public Float get(int paramInt) {
    return Float.valueOf(this.$this_asList[paramInt]);
  }
  
  public int getSize() {
    return this.$this_asList.length;
  }
  
  public int lastIndexOf(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield $this_asList : [F
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: aload_2
    //   8: arraylength
    //   9: iconst_m1
    //   10: iadd
    //   11: istore #4
    //   13: iconst_0
    //   14: iload #4
    //   16: if_icmpgt -> 71
    //   19: iload #4
    //   21: istore #5
    //   23: iinc #4, -1
    //   26: aload_2
    //   27: iload #5
    //   29: faload
    //   30: fstore #6
    //   32: iconst_0
    //   33: istore #7
    //   35: fload #6
    //   37: invokestatic floatToIntBits : (F)I
    //   40: fload_1
    //   41: invokestatic floatToIntBits : (F)I
    //   44: if_icmpne -> 51
    //   47: iconst_1
    //   48: goto -> 52
    //   51: iconst_0
    //   52: nop
    //   53: ifeq -> 65
    //   56: iload #5
    //   58: goto -> 72
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: iconst_0
    //   66: iload #4
    //   68: if_icmple -> 19
    //   71: iconst_m1
    //   72: ireturn
    // Exception table:
    //   from	to	target	type
    //   52	61	61	java/lang/RuntimeException
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  public boolean contains(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield $this_asList : [F
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: aload_2
    //   11: arraylength
    //   12: istore #5
    //   14: iload #4
    //   16: iload #5
    //   18: if_icmpge -> 73
    //   21: aload_2
    //   22: iload #4
    //   24: faload
    //   25: fstore #6
    //   27: fload #6
    //   29: fstore #7
    //   31: iconst_0
    //   32: istore #8
    //   34: fload #7
    //   36: invokestatic floatToIntBits : (F)I
    //   39: fload_1
    //   40: invokestatic floatToIntBits : (F)I
    //   43: if_icmpne -> 54
    //   46: iconst_1
    //   47: goto -> 55
    //   50: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   53: athrow
    //   54: iconst_0
    //   55: nop
    //   56: ifeq -> 67
    //   59: iconst_1
    //   60: goto -> 74
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: iinc #4, 1
    //   70: goto -> 14
    //   73: iconst_0
    //   74: ireturn
    // Exception table:
    //   from	to	target	type
    //   34	50	50	java/lang/RuntimeException
    //   55	63	63	java/lang/RuntimeException
  }
  
  public int indexOf(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield $this_asList : [F
    //   4: astore_2
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore #4
    //   10: aload_2
    //   11: arraylength
    //   12: istore #5
    //   14: iload #4
    //   16: iload #5
    //   18: if_icmpge -> 70
    //   21: aload_2
    //   22: iload #4
    //   24: faload
    //   25: fstore #6
    //   27: iconst_0
    //   28: istore #7
    //   30: fload #6
    //   32: invokestatic floatToIntBits : (F)I
    //   35: fload_1
    //   36: invokestatic floatToIntBits : (F)I
    //   39: if_icmpne -> 50
    //   42: iconst_1
    //   43: goto -> 51
    //   46: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   49: athrow
    //   50: iconst_0
    //   51: nop
    //   52: ifeq -> 64
    //   55: iload #4
    //   57: goto -> 71
    //   60: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   63: athrow
    //   64: iinc #4, 1
    //   67: goto -> 14
    //   70: iconst_m1
    //   71: ireturn
    // Exception table:
    //   from	to	target	type
    //   30	46	46	java/lang/RuntimeException
    //   51	60	60	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
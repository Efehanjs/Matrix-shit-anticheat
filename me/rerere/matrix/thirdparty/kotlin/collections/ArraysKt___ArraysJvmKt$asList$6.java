package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.RandomAccess;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class ArraysKt___ArraysJvmKt$asList$6 extends AbstractList implements RandomAccess {
  public ArraysKt___ArraysJvmKt$asList$6(double[] paramArrayOfdouble) {}
  
  @NotNull
  public Double get(int paramInt) {
    return Double.valueOf(this.$this_asList[paramInt]);
  }
  
  public boolean contains(double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield $this_asList : [D
    //   4: astore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: iconst_0
    //   9: istore #5
    //   11: aload_3
    //   12: arraylength
    //   13: istore #6
    //   15: iload #5
    //   17: iload #6
    //   19: if_icmpge -> 75
    //   22: aload_3
    //   23: iload #5
    //   25: daload
    //   26: dstore #7
    //   28: dload #7
    //   30: dstore #9
    //   32: iconst_0
    //   33: istore #11
    //   35: dload #9
    //   37: invokestatic doubleToLongBits : (D)J
    //   40: dload_1
    //   41: invokestatic doubleToLongBits : (D)J
    //   44: lcmp
    //   45: ifne -> 56
    //   48: iconst_1
    //   49: goto -> 57
    //   52: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   55: athrow
    //   56: iconst_0
    //   57: nop
    //   58: ifeq -> 69
    //   61: iconst_1
    //   62: goto -> 76
    //   65: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   68: athrow
    //   69: iinc #5, 1
    //   72: goto -> 15
    //   75: iconst_0
    //   76: ireturn
    // Exception table:
    //   from	to	target	type
    //   35	52	52	java/lang/RuntimeException
    //   57	65	65	java/lang/RuntimeException
  }
  
  public int getSize() {
    return this.$this_asList.length;
  }
  
  public int indexOf(double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield $this_asList : [D
    //   4: astore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: iconst_0
    //   9: istore #5
    //   11: aload_3
    //   12: arraylength
    //   13: istore #6
    //   15: iload #5
    //   17: iload #6
    //   19: if_icmpge -> 72
    //   22: aload_3
    //   23: iload #5
    //   25: daload
    //   26: dstore #7
    //   28: iconst_0
    //   29: istore #9
    //   31: dload #7
    //   33: invokestatic doubleToLongBits : (D)J
    //   36: dload_1
    //   37: invokestatic doubleToLongBits : (D)J
    //   40: lcmp
    //   41: ifne -> 52
    //   44: iconst_1
    //   45: goto -> 53
    //   48: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   51: athrow
    //   52: iconst_0
    //   53: nop
    //   54: ifeq -> 66
    //   57: iload #5
    //   59: goto -> 73
    //   62: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   65: athrow
    //   66: iinc #5, 1
    //   69: goto -> 15
    //   72: iconst_m1
    //   73: ireturn
    // Exception table:
    //   from	to	target	type
    //   31	48	48	java/lang/RuntimeException
    //   53	62	62	java/lang/RuntimeException
  }
  
  public boolean isEmpty() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.$this_asList.length == 0);
  }
  
  public int lastIndexOf(double paramDouble) {
    // Byte code:
    //   0: aload_0
    //   1: getfield $this_asList : [D
    //   4: astore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: aload_3
    //   9: arraylength
    //   10: iconst_m1
    //   11: iadd
    //   12: istore #5
    //   14: iconst_0
    //   15: iload #5
    //   17: if_icmpgt -> 73
    //   20: iload #5
    //   22: istore #6
    //   24: iinc #5, -1
    //   27: aload_3
    //   28: iload #6
    //   30: daload
    //   31: dstore #7
    //   33: iconst_0
    //   34: istore #9
    //   36: dload #7
    //   38: invokestatic doubleToLongBits : (D)J
    //   41: dload_1
    //   42: invokestatic doubleToLongBits : (D)J
    //   45: lcmp
    //   46: ifne -> 53
    //   49: iconst_1
    //   50: goto -> 54
    //   53: iconst_0
    //   54: nop
    //   55: ifeq -> 67
    //   58: iload #6
    //   60: goto -> 74
    //   63: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   66: athrow
    //   67: iconst_0
    //   68: iload #5
    //   70: if_icmple -> 20
    //   73: iconst_m1
    //   74: ireturn
    // Exception table:
    //   from	to	target	type
    //   54	63	63	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt___ArraysJvmKt$asList$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
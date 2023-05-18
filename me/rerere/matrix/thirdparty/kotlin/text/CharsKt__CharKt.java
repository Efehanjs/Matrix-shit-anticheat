package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.CharRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class CharsKt__CharKt extends CharsKt__CharJVMKt {
  private static final long b = o3.a(1195896714814392180L, -4142905074091765423L, null).a(185457934069636L);
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Integer digitToIntOrNull(char paramChar) {
    Integer integer = Integer.valueOf(CharsKt.digitOf(paramChar, 10));
    int i = integer.intValue();
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return ((i >= 0)) ? integer : null;
  }
  
  public static final boolean equals(char paramChar1, char paramChar2, boolean paramBoolean) {
    try {
      if (paramChar1 == paramChar2)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      if (!paramBoolean)
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    char c1 = Character.toUpperCase(paramChar1);
    char c2 = Character.toUpperCase(paramChar2);
    try {
      if (c1 != c2) {
        try {
          if (Character.toLowerCase(c1) == Character.toLowerCase(c2));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  public static final char digitToChar(int paramInt) {
    long l = b ^ 0x4C859E308930L;
    if ((new IntRange(0, 9)).contains(paramInt))
      return (char)(48 + paramInt); 
    throw new IllegalArgumentException("Int " + paramInt + " is not a decimal digit");
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  public static final char digitToChar(int paramInt1, int paramInt2) {
    long l = b ^ 0x389FC729DC39L;
    if (!(new IntRange(2, 36)).contains(paramInt2))
      throw new IllegalArgumentException("Invalid radix: " + paramInt2 + ". Valid radix values are in range 2..36"); 
    try {
      if (paramInt1 >= 0)
        try {
          if (paramInt1 < paramInt2) {
            try {
            
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            } 
            return (paramInt1 < 10) ? (char)(48 + paramInt1) : (char)((char)(65 + paramInt1) - 10);
          } 
          throw new IllegalArgumentException("Digit " + paramInt1 + " does not represent a valid digit in radix " + paramInt2);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    throw new IllegalArgumentException("Digit " + paramInt1 + " does not represent a valid digit in radix " + paramInt2);
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public static final Integer digitToIntOrNull(char paramChar, int paramInt) {
    CharsKt.checkRadix(paramInt);
    Integer integer = Integer.valueOf(CharsKt.digitOf(paramChar, paramInt));
    int i = integer.intValue();
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return ((i >= 0)) ? integer : null;
  }
  
  @SinceKotlin(version = "1.5")
  @NotNull
  public static final String titlecase(char paramChar) {
    return _OneToManyTitlecaseMappingsKt.titlecaseImpl(paramChar);
  }
  
  public static final boolean isSurrogate(char paramChar) {
    return (new CharRange('?', '?')).contains(paramChar);
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  public static final int digitToInt(char paramChar, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/CharsKt__CharKt.b : J
    //   3: ldc2_w 123525854367975
    //   6: lxor
    //   7: lstore_2
    //   8: iload_0
    //   9: iload_1
    //   10: invokestatic digitToIntOrNull : (CI)Ljava/lang/Integer;
    //   13: dup
    //   14: ifnull -> 27
    //   17: invokevirtual intValue : ()I
    //   20: goto -> 64
    //   23: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   26: athrow
    //   27: pop
    //   28: new java/lang/IllegalArgumentException
    //   31: dup
    //   32: new java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial <init> : ()V
    //   39: ldc 'Char '
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: iload_0
    //   45: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   48: ldc ' is not a digit in the given radix='
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: iload_1
    //   54: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   57: invokevirtual toString : ()Ljava/lang/String;
    //   60: invokespecial <init> : (Ljava/lang/String;)V
    //   63: athrow
    //   64: ireturn
    // Exception table:
    //   from	to	target	type
    //   8	23	23	java/lang/IllegalArgumentException
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  public static final int digitToInt(char paramChar) {
    long l = b ^ 0x384C41C55738L;
    int i = CharsKt.digitOf(paramChar, 10);
    int j = i;
    boolean bool = false;
    try {
      if (j < 0)
        throw new IllegalArgumentException("Char " + paramChar + " is not a decimal digit"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return i;
  }
  
  private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\CharsKt__CharKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
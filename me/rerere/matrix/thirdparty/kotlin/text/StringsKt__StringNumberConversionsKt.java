package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
  private static final long h = o3.a(8508732837261669100L, 9194402922359783452L, null).a(190408649665955L);
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Long toLongOrNull(@NotNull String paramString) {
    long l = h ^ 0x2E7EA2C36CEDL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.toLongOrNull(paramString, 10);
  }
  
  @NotNull
  public static final Void numberFormatError(@NotNull String paramString) {
    long l = h ^ 0x3B994A291168L;
    Intrinsics.checkNotNullParameter(paramString, "input");
    throw new NumberFormatException("Invalid number format: '" + paramString + '\'');
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Short toShortOrNull(@NotNull String paramString) {
    long l = h ^ 0x37041B7A4973L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.toShortOrNull(paramString, 10);
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Byte toByteOrNull(@NotNull String paramString, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringNumberConversionsKt.h : J
    //   3: ldc2_w 16986299121395
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: iload_1
    //   16: invokestatic toIntOrNull : (Ljava/lang/String;I)Ljava/lang/Integer;
    //   19: dup
    //   20: ifnull -> 33
    //   23: invokevirtual intValue : ()I
    //   26: goto -> 36
    //   29: invokestatic b : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   32: athrow
    //   33: pop
    //   34: aconst_null
    //   35: areturn
    //   36: istore #4
    //   38: iload #4
    //   40: bipush #-128
    //   42: if_icmplt -> 59
    //   45: iload #4
    //   47: bipush #127
    //   49: if_icmple -> 65
    //   52: goto -> 59
    //   55: invokestatic b : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   58: athrow
    //   59: aconst_null
    //   60: areturn
    //   61: invokestatic b : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   64: athrow
    //   65: iload #4
    //   67: i2b
    //   68: invokestatic valueOf : (B)Ljava/lang/Byte;
    //   71: areturn
    // Exception table:
    //   from	to	target	type
    //   8	29	29	java/lang/NumberFormatException
    //   38	52	55	java/lang/NumberFormatException
    //   45	61	61	java/lang/NumberFormatException
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Long toLongOrNull(@NotNull String paramString, int paramInt) {
    long l1 = h ^ 0x6BFD55308200L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    CharsKt.checkRadix(paramInt);
    int i = paramString.length();
    try {
      if (i == 0)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    byte b1 = 0;
    boolean bool = false;
    long l2 = 0L;
    char c = paramString.charAt(0);
    try {
      if (Intrinsics.compare(c, 48) < 0) {
        try {
          if (i == 1)
            return null; 
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        } 
        b1 = 1;
        if (c == '-') {
          bool = true;
          l2 = Long.MIN_VALUE;
        } else if (c == '+') {
          bool = false;
          l2 = -9223372036854775807L;
        } else {
          return null;
        } 
      } else {
        b1 = 0;
        bool = false;
        l2 = -9223372036854775807L;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    long l3 = -256204778801521550L;
    long l4 = l3;
    long l5 = 0L;
    for (byte b2 = b1; b2 < i; b2++) {
      int j = CharsKt.digitOf(paramString.charAt(b2), paramInt);
      try {
        if (j < 0)
          return null; 
      } catch (NumberFormatException numberFormatException) {
        throw b(null);
      } 
      try {
        if (l5 < l4)
          if (l4 == l3) {
            l4 = l2 / paramInt;
            try {
              if (l5 < l4)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw b(null);
            } 
          } else {
            return null;
          }  
      } catch (NumberFormatException numberFormatException) {
        throw b(null);
      } 
      l5 *= paramInt;
      try {
        if (l5 < l2 + j)
          return null; 
      } catch (NumberFormatException numberFormatException) {
        throw b(null);
      } 
      l5 -= j;
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return bool ? Long.valueOf(l5) : Long.valueOf(-l5);
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Short toShortOrNull(@NotNull String paramString, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringNumberConversionsKt.h : J
    //   3: ldc2_w 100067063538285
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: iload_1
    //   16: invokestatic toIntOrNull : (Ljava/lang/String;I)Ljava/lang/Integer;
    //   19: dup
    //   20: ifnull -> 33
    //   23: invokevirtual intValue : ()I
    //   26: goto -> 36
    //   29: invokestatic b : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   32: athrow
    //   33: pop
    //   34: aconst_null
    //   35: areturn
    //   36: istore #4
    //   38: iload #4
    //   40: sipush #-32768
    //   43: if_icmplt -> 61
    //   46: iload #4
    //   48: sipush #32767
    //   51: if_icmple -> 67
    //   54: goto -> 61
    //   57: invokestatic b : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   60: athrow
    //   61: aconst_null
    //   62: areturn
    //   63: invokestatic b : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   66: athrow
    //   67: iload #4
    //   69: i2s
    //   70: invokestatic valueOf : (S)Ljava/lang/Short;
    //   73: areturn
    // Exception table:
    //   from	to	target	type
    //   8	29	29	java/lang/NumberFormatException
    //   38	54	57	java/lang/NumberFormatException
    //   46	63	63	java/lang/NumberFormatException
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Byte toByteOrNull(@NotNull String paramString) {
    long l = h ^ 0x216C006BEBABL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.toByteOrNull(paramString, 10);
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Integer toIntOrNull(@NotNull String paramString, int paramInt) {
    long l = h ^ 0x27CAF490186CL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    CharsKt.checkRadix(paramInt);
    int i = paramString.length();
    try {
      if (i == 0)
        return null; 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    byte b1 = 0;
    boolean bool = false;
    int j = 0;
    char c = paramString.charAt(0);
    try {
      if (Intrinsics.compare(c, 48) < 0) {
        try {
          if (i == 1)
            return null; 
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        } 
        b1 = 1;
        if (c == '-') {
          bool = true;
          j = Integer.MIN_VALUE;
        } else if (c == '+') {
          bool = false;
          j = -2147483647;
        } else {
          return null;
        } 
      } else {
        b1 = 0;
        bool = false;
        j = -2147483647;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    int k = -59652323;
    int m = k;
    int n = 0;
    for (byte b2 = b1; b2 < i; b2++) {
      int i1 = CharsKt.digitOf(paramString.charAt(b2), paramInt);
      try {
        if (i1 < 0)
          return null; 
      } catch (NumberFormatException numberFormatException) {
        throw b(null);
      } 
      try {
        if (n < m)
          if (m == k) {
            m = j / paramInt;
            try {
              if (n < m)
                return null; 
            } catch (NumberFormatException numberFormatException) {
              throw b(null);
            } 
          } else {
            return null;
          }  
      } catch (NumberFormatException numberFormatException) {
        throw b(null);
      } 
      n *= paramInt;
      try {
        if (n < j + i1)
          return null; 
      } catch (NumberFormatException numberFormatException) {
        throw b(null);
      } 
      n -= i1;
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return bool ? Integer.valueOf(n) : Integer.valueOf(-n);
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Integer toIntOrNull(@NotNull String paramString) {
    long l = h ^ 0xCAA06698083L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.toIntOrNull(paramString, 10);
  }
  
  private static NumberFormatException b(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringNumberConversionsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
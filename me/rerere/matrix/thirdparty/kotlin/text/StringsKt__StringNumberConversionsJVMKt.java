package me.rerere.matrix.thirdparty.kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
  private static final long g = o3.a(-5748167515218042597L, 2539885791125003877L, null).a(118076635866071L);
  
  @SinceKotlin(version = "1.2")
  @Nullable
  public static final BigDecimal toBigDecimalOrNull(@NotNull String paramString) {
    BigDecimal bigDecimal;
    long l = g ^ 0x4AFF3F5C6B1BL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    boolean bool = false;
    try {
      String str = paramString;
      boolean bool1 = false;
      bigDecimal = ScreenFloatValueRegEx.value.matches(paramString) ? new BigDecimal(str) : null;
    } catch (NumberFormatException numberFormatException) {
      bigDecimal = null;
    } 
    return bigDecimal;
  }
  
  @SinceKotlin(version = "1.2")
  @Nullable
  public static final BigInteger toBigIntegerOrNull(@NotNull String paramString, int paramInt) {
    long l = g ^ 0x5CC3448950D9L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    CharsKt.checkRadix(paramInt);
    int i = paramString.length();
    try {
      switch (i) {
        case 0:
          return null;
        case 1:
          try {
            if (CharsKt.digitOf(paramString.charAt(0), paramInt) < 0)
              return null; 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return new BigInteger(paramString, CharsKt.checkRadix(paramInt));
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    byte b1 = (paramString.charAt(0) == '-') ? 1 : 0;
    byte b2 = b1;
    while (true) {
      try {
        if (b2 < i) {
          try {
            if (CharsKt.digitOf(paramString.charAt(b2), paramInt) < 0)
              return null; 
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          b2++;
          continue;
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      break;
    } 
    return new BigInteger(paramString, CharsKt.checkRadix(paramInt));
  }
  
  @SinceKotlin(version = "1.2")
  @Nullable
  public static final BigDecimal toBigDecimalOrNull(@NotNull String paramString, @NotNull MathContext paramMathContext) {
    BigDecimal bigDecimal;
    long l = g ^ 0x1C575CD6ED99L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramMathContext, "mathContext");
    boolean bool = false;
    try {
      String str = paramString;
      boolean bool1 = false;
      bigDecimal = ScreenFloatValueRegEx.value.matches(paramString) ? new BigDecimal(str, paramMathContext) : null;
    } catch (NumberFormatException numberFormatException) {
      bigDecimal = null;
    } 
    return bigDecimal;
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Double toDoubleOrNull(@NotNull String paramString) {
    Double double_;
    long l = g ^ 0x11F405AFA323L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    boolean bool = false;
    try {
      String str = paramString;
      boolean bool1 = false;
      double_ = ScreenFloatValueRegEx.value.matches(paramString) ? Double.valueOf(Double.parseDouble(str)) : null;
    } catch (NumberFormatException numberFormatException) {
      double_ = null;
    } 
    return double_;
  }
  
  @SinceKotlin(version = "1.2")
  @Nullable
  public static final BigInteger toBigIntegerOrNull(@NotNull String paramString) {
    long l = g ^ 0x3667BFD15FE2L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.toBigIntegerOrNull(paramString, 10);
  }
  
  @SinceKotlin(version = "1.1")
  @Nullable
  public static final Float toFloatOrNull(@NotNull String paramString) {
    Float float_;
    long l = g ^ 0x4F375B7B0A01L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    boolean bool = false;
    try {
      String str = paramString;
      boolean bool1 = false;
      float_ = ScreenFloatValueRegEx.value.matches(paramString) ? Float.valueOf(Float.parseFloat(str)) : null;
    } catch (NumberFormatException numberFormatException) {
      float_ = null;
    } 
    return float_;
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringNumberConversionsJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
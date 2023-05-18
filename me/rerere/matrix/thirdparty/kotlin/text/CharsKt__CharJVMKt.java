package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Locale;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class CharsKt__CharJVMKt {
  private static final long a = o3.a(4151395206229013258L, -7915585881912251311L, null).a(171888015663081L);
  
  public static final int digitOf(char paramChar, int paramInt) {
    return Character.digit(paramChar, paramInt);
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final String uppercase(char paramChar, @NotNull Locale paramLocale) {
    long l = a ^ 0x2467D989B504L;
    Intrinsics.checkNotNullParameter(paramLocale, "locale");
    Intrinsics.checkNotNull(String.valueOf(paramChar), "null cannot be cast to non-null type java.lang.String");
    Intrinsics.checkNotNullExpressionValue(String.valueOf(paramChar).toUpperCase(paramLocale), "this as java.lang.String).toUpperCase(locale)");
    return String.valueOf(paramChar).toUpperCase(paramLocale);
  }
  
  @NotNull
  public static final CharCategory getCategory(char paramChar) {
    return CharCategory.Companion.valueOf(Character.getType(paramChar));
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final String titlecase(char paramChar, @NotNull Locale paramLocale) {
    long l = a ^ 0x14E0950AC652L;
    Intrinsics.checkNotNullParameter(paramLocale, "locale");
    String str = CharsKt.uppercase(paramChar, paramLocale);
    try {
      if (str.length() > 1) {
        try {
          char c = str.charAt(0);
          String str1 = str;
          boolean bool = true;
          Intrinsics.checkNotNull(str1, "null cannot be cast to non-null type java.lang.String");
          Intrinsics.checkNotNullExpressionValue(str1.substring(bool), "this as java.lang.String).substring(startIndex)");
          str1 = str1.substring(bool);
          Intrinsics.checkNotNull(str1, "null cannot be cast to non-null type java.lang.String");
          Intrinsics.checkNotNullExpressionValue(str1.toLowerCase(Locale.ROOT), "this as java.lang.String).toLowerCase(Locale.ROOT)");
          str1 = str1.toLowerCase(Locale.ROOT);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return (paramChar == 'ŉ') ? str : (c + str1);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(String.valueOf(paramChar), "null cannot be cast to non-null type java.lang.String");
      Intrinsics.checkNotNullExpressionValue(String.valueOf(paramChar).toUpperCase(Locale.ROOT), "this as java.lang.String).toUpperCase(Locale.ROOT)");
      if (!Intrinsics.areEqual(str, String.valueOf(paramChar).toUpperCase(Locale.ROOT)))
        return str; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return String.valueOf(Character.toTitleCase(paramChar));
  }
  
  @NotNull
  public static final CharDirectionality getDirectionality(char paramChar) {
    return CharDirectionality.Companion.valueOf(Character.getDirectionality(paramChar));
  }
  
  public static final boolean isWhitespace(char paramChar) {
    try {
      if (!Character.isWhitespace(paramChar)) {
        try {
          if (Character.isSpaceChar(paramChar));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.5")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final String lowercase(char paramChar, @NotNull Locale paramLocale) {
    long l = a ^ 0x796790558C7CL;
    Intrinsics.checkNotNullParameter(paramLocale, "locale");
    Intrinsics.checkNotNull(String.valueOf(paramChar), "null cannot be cast to non-null type java.lang.String");
    Intrinsics.checkNotNullExpressionValue(String.valueOf(paramChar).toLowerCase(paramLocale), "this as java.lang.String).toLowerCase(locale)");
    return String.valueOf(paramChar).toLowerCase(paramLocale);
  }
  
  @PublishedApi
  public static final int checkRadix(int paramInt) {
    long l = a ^ 0xEB24243CF4BL;
    if (!(new IntRange(2, 36)).contains(paramInt))
      throw new IllegalArgumentException("radix " + paramInt + " was not in valid range " + new IntRange(2, 36)); 
    return paramInt;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\CharsKt__CharJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
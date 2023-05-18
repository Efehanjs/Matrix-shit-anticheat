package me.rerere.matrix.thirdparty.kotlin.text;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecatedSinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.collections.AbstractList;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.internal.LowPriorityInOverloadResolution;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.StringCompanionObject;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
  private static final long i = o3.a(584368505167473421L, -4143281427793718702L, null).a(59401801896210L);
  
  public static final boolean isBlank(@NotNull CharSequence paramCharSequence) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsJVMKt.i : J
    //   3: ldc2_w 1368092696923
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: invokeinterface length : ()I
    //   20: ifeq -> 125
    //   23: aload_0
    //   24: invokestatic getIndices : (Ljava/lang/CharSequence;)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntRange;
    //   27: checkcast java/lang/Iterable
    //   30: astore_3
    //   31: iconst_0
    //   32: istore #4
    //   34: aload_3
    //   35: instanceof java/util/Collection
    //   38: ifeq -> 68
    //   41: aload_3
    //   42: checkcast java/util/Collection
    //   45: invokeinterface isEmpty : ()Z
    //   50: ifeq -> 68
    //   53: goto -> 60
    //   56: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   59: athrow
    //   60: iconst_1
    //   61: goto -> 122
    //   64: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   67: athrow
    //   68: aload_3
    //   69: invokeinterface iterator : ()Ljava/util/Iterator;
    //   74: astore #5
    //   76: aload #5
    //   78: invokeinterface hasNext : ()Z
    //   83: ifeq -> 121
    //   86: aload #5
    //   88: checkcast me/rerere/matrix/thirdparty/kotlin/collections/IntIterator
    //   91: invokevirtual nextInt : ()I
    //   94: istore #6
    //   96: iload #6
    //   98: istore #7
    //   100: iconst_0
    //   101: istore #8
    //   103: aload_0
    //   104: iload #7
    //   106: invokeinterface charAt : (I)C
    //   111: invokestatic isWhitespace : (C)Z
    //   114: ifne -> 76
    //   117: iconst_0
    //   118: goto -> 122
    //   121: iconst_1
    //   122: ifeq -> 133
    //   125: iconst_1
    //   126: goto -> 134
    //   129: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   132: athrow
    //   133: iconst_0
    //   134: ireturn
    // Exception table:
    //   from	to	target	type
    //   34	53	56	java/lang/IllegalArgumentException
    //   41	64	64	java/lang/IllegalArgumentException
    //   122	129	129	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final List split(@NotNull CharSequence paramCharSequence, @NotNull Pattern paramPattern, int paramInt) {
    long l = i ^ 0x12A54BC49551L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramPattern, "regex");
      StringsKt.requireNonNegativeLimit(paramInt);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    Intrinsics.checkNotNullExpressionValue(paramPattern.split(paramCharSequence, (paramInt == 0) ? -1 : paramInt), "regex.split(this, if (limit == 0) -1 else limit)");
    return ArraysKt.asList((Object[])paramPattern.split(paramCharSequence, (paramInt == 0) ? -1 : paramInt));
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final String concatToString(@NotNull char[] paramArrayOfchar) {
    long l = i ^ 0x1B2570D298E6L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    return new String(paramArrayOfchar);
  }
  
  @NotNull
  public static final String repeat(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = i ^ 0x4A2C02CFFBA6L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str1 = "Count 'n' must be non-negative, but was " + paramInt + '.';
      throw new IllegalArgumentException(str1.toString());
    } 
    try {
      switch (paramInt) {
        case 0:
        
        case 1:
        
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      char c;
      char c1;
      boolean bool1;
      byte b;
      char[] arrayOfChar1;
      char[] arrayOfChar2;
      switch (paramCharSequence.length()) {
        case 0:
        
        case 1:
          c = paramCharSequence.charAt(0);
          c1 = c;
          bool1 = false;
          b = 0;
          arrayOfChar2 = new char[paramInt];
          while (b < paramInt) {
            byte b1 = b;
            arrayOfChar2[b1] = c1;
            b++;
          } 
          arrayOfChar1 = arrayOfChar2;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(paramInt * paramCharSequence.length());
    IntIterator intIterator = (new IntRange(1, paramInt)).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      stringBuilder.append(paramCharSequence);
    } 
    String str = stringBuilder.toString();
    Intrinsics.checkNotNullExpressionValue(str, "{\n                    va…tring()\n                }");
    return str;
  }
  
  public static final int compareTo(@NotNull String paramString1, @NotNull String paramString2, boolean paramBoolean) {
    long l = i ^ 0x5CEFCC8B6EE0L;
    try {
      Intrinsics.checkNotNullParameter(paramString1, "<this>");
      Intrinsics.checkNotNullParameter(paramString2, "other");
      if (paramBoolean)
        return paramString1.compareToIgnoreCase(paramString2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return paramString1.compareTo(paramString2);
  }
  
  public static final boolean regionMatches(@NotNull String paramString1, int paramInt1, @NotNull String paramString2, int paramInt2, int paramInt3, boolean paramBoolean) {
    long l = i ^ 0x5C3D4BF3E5FCL;
    try {
      Intrinsics.checkNotNullParameter(paramString1, "<this>");
      Intrinsics.checkNotNullParameter(paramString2, "other");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return !paramBoolean ? paramString1.regionMatches(paramInt1, paramString2, paramInt2, paramInt3) : paramString1.regionMatches(paramBoolean, paramInt1, paramString2, paramInt2, paramInt3);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final byte[] encodeToByteArray(@NotNull String paramString) {
    long l = i ^ 0x7037FD4F6705L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    String str = paramString;
    Intrinsics.checkNotNullExpressionValue(str.getBytes(Charsets.UTF_8), "this as java.lang.String).getBytes(charset)");
    return str.getBytes(Charsets.UTF_8);
  }
  
  @NotNull
  public static final String replaceFirst(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, boolean paramBoolean) {
    long l = i ^ 0x43CDB7C9956DL;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "oldValue");
    Intrinsics.checkNotNullParameter(paramString3, "newValue");
    int i = StringsKt.indexOf$default(paramString1, paramString2, 0, paramBoolean, 2, (Object)null);
    try {
      String str = paramString1;
      int j = i + paramString2.length();
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (i < 0) ? paramString1 : StringsKt.replaceRange(str, i, j, paramString3).toString();
  }
  
  @NotNull
  public static final String replaceFirst(@NotNull String paramString, char paramChar1, char paramChar2, boolean paramBoolean) {
    long l = i ^ 0x6A7996825040L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    int i = StringsKt.indexOf$default(paramString, paramChar1, 0, paramBoolean, 2, (Object)null);
    try {
      String str1 = paramString;
      int j = i + 1;
      String str2 = String.valueOf(paramChar2);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (i < 0) ? paramString : StringsKt.replaceRange(str1, i, j, str2).toString();
  }
  
  @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  @NotNull
  public static final String capitalize(@NotNull String paramString) {
    long l = i ^ 0x193954248792L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullExpressionValue(Locale.getDefault(), "getDefault()");
    return StringsKt.capitalize(paramString, Locale.getDefault());
  }
  
  @SinceKotlin(version = "1.5")
  public static final boolean contentEquals(@Nullable CharSequence paramCharSequence1, @Nullable CharSequence paramCharSequence2) {
    try {
      if (paramCharSequence1 instanceof String)
        try {
          if (paramCharSequence2 != null);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return StringsKt.contentEqualsImpl(paramCharSequence1, paramCharSequence2);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final String concatToString(@NotNull char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    long l = i ^ 0x1D396A5DC561L;
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "<this>");
    AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfchar.length);
    return new String(paramArrayOfchar, paramInt1, paramInt2 - paramInt1);
  }
  
  public static final boolean startsWith(@NotNull String paramString1, @NotNull String paramString2, int paramInt, boolean paramBoolean) {
    long l = i ^ 0x652E3089F9CAL;
    try {
      Intrinsics.checkNotNullParameter(paramString1, "<this>");
      Intrinsics.checkNotNullParameter(paramString2, "prefix");
      if (!paramBoolean)
        return paramString1.startsWith(paramString2, paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return StringsKt.regionMatches(paramString1, paramInt, paramString2, 0, paramString2.length(), paramBoolean);
  }
  
  @NotNull
  public static final String replace(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, boolean paramBoolean) {
    long l = i ^ 0x5EAFC9D400D6L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "oldValue");
    Intrinsics.checkNotNullParameter(paramString3, "newValue");
    String str1 = paramString1;
    String str2 = str1;
    boolean bool = false;
    int i = StringsKt.indexOf(str2, paramString2, 0, paramBoolean);
    try {
      if (i < 0)
        return str2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    int j = paramString2.length();
    int k = RangesKt.coerceAtLeast(j, 1);
    int m = str2.length() - j + paramString3.length();
    try {
      if (m < 0)
        throw new OutOfMemoryError(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(m);
    int n = 0;
    while (true) {
      stringBuilder.append(str2, n, i).append(paramString3);
      n = i + j;
      if (i < str2.length()) {
        i = StringsKt.indexOf(str2, paramString2, i + k, paramBoolean);
        if (i <= 0)
          break; 
        continue;
      } 
      break;
    } 
    Intrinsics.checkNotNullExpressionValue(stringBuilder.append(str2, n, str2.length()).toString(), "stringBuilder.append(this, i, length).toString()");
    return stringBuilder.append(str2, n, str2.length()).toString();
  }
  
  public static final boolean endsWith(@NotNull String paramString1, @NotNull String paramString2, boolean paramBoolean) {
    long l = i ^ 0x65ACA4A369FCL;
    try {
      Intrinsics.checkNotNullParameter(paramString1, "<this>");
      Intrinsics.checkNotNullParameter(paramString2, "suffix");
      if (!paramBoolean)
        return paramString1.endsWith(paramString2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return StringsKt.regionMatches(paramString1, paramString1.length() - paramString2.length(), paramString2, 0, paramString2.length(), true);
  }
  
  @NotNull
  public static final String replace(@NotNull String paramString, char paramChar1, char paramChar2, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsJVMKt.i : J
    //   3: ldc2_w 86790872124471
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: iload_3
    //   16: ifne -> 37
    //   19: aload_0
    //   20: iload_1
    //   21: iload_2
    //   22: invokevirtual replace : (CC)Ljava/lang/String;
    //   25: dup
    //   26: ldc_w 'this as java.lang.String…replace(oldChar, newChar)'
    //   29: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   32: areturn
    //   33: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   36: athrow
    //   37: aload_0
    //   38: invokevirtual length : ()I
    //   41: istore #6
    //   43: new java/lang/StringBuilder
    //   46: dup
    //   47: iload #6
    //   49: invokespecial <init> : (I)V
    //   52: astore #7
    //   54: aload #7
    //   56: astore #8
    //   58: iconst_0
    //   59: istore #9
    //   61: aload_0
    //   62: checkcast java/lang/CharSequence
    //   65: astore #10
    //   67: iconst_0
    //   68: istore #11
    //   70: iconst_0
    //   71: istore #12
    //   73: iload #12
    //   75: aload #10
    //   77: invokeinterface length : ()I
    //   82: if_icmpge -> 137
    //   85: aload #10
    //   87: iload #12
    //   89: invokeinterface charAt : (I)C
    //   94: istore #13
    //   96: iload #13
    //   98: istore #14
    //   100: iconst_0
    //   101: istore #15
    //   103: aload #8
    //   105: iload #14
    //   107: iload_1
    //   108: iload_3
    //   109: invokestatic equals : (CCZ)Z
    //   112: ifeq -> 123
    //   115: iload_2
    //   116: goto -> 125
    //   119: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   122: athrow
    //   123: iload #14
    //   125: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: nop
    //   130: nop
    //   131: iinc #12, 1
    //   134: goto -> 73
    //   137: nop
    //   138: nop
    //   139: aload #7
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: dup
    //   145: ldc_w 'StringBuilder(capacity).…builderAction).toString()'
    //   148: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   151: areturn
    // Exception table:
    //   from	to	target	type
    //   9	33	33	java/lang/IllegalArgumentException
    //   103	119	119	java/lang/IllegalArgumentException
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final String decodeToString(@NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) {
    long l = i ^ 0x1A9C1510E9A8L;
    try {
      Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
      AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(paramInt1, paramInt2, paramArrayOfbyte.length);
      if (!paramBoolean)
        return new String(paramArrayOfbyte, paramInt1, paramInt2 - paramInt1, Charsets.UTF_8); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    CharsetDecoder charsetDecoder = Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    Intrinsics.checkNotNullExpressionValue(charsetDecoder.decode(ByteBuffer.wrap(paramArrayOfbyte, paramInt1, paramInt2 - paramInt1)).toString(), "decoder.decode(ByteBuffe…- startIndex)).toString()");
    return charsetDecoder.decode(ByteBuffer.wrap(paramArrayOfbyte, paramInt1, paramInt2 - paramInt1)).toString();
  }
  
  @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @LowPriorityInOverloadResolution
  @NotNull
  public static final String decapitalize(@NotNull String paramString, @NotNull Locale paramLocale) {
    long l = i ^ 0x1DD56451E4FL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
      Intrinsics.checkNotNullParameter(paramLocale, "locale");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      String str = paramString;
      boolean bool1 = false;
      boolean bool2 = true;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool1, bool2), "this as java.lang.String…ing(startIndex, endIndex)");
      str = str.substring(bool1, bool2);
      Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
      Intrinsics.checkNotNullExpressionValue(str.toLowerCase(paramLocale), "this as java.lang.String).toLowerCase(locale)");
      str = paramString;
      bool1 = true;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool1), "this as java.lang.String).substring(startIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (((paramString.length() > 0)) && !Character.isLowerCase(paramString.charAt(0))) ? (str.toLowerCase(paramLocale) + str.substring(bool1)) : paramString;
  }
  
  @NotNull
  public static final Comparator getCASE_INSENSITIVE_ORDER(@NotNull StringCompanionObject paramStringCompanionObject) {
    long l = i ^ 0x6BBA03531896L;
    Intrinsics.checkNotNullParameter(paramStringCompanionObject, "<this>");
    Intrinsics.checkNotNullExpressionValue(String.CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    return String.CASE_INSENSITIVE_ORDER;
  }
  
  public static final boolean regionMatches(@NotNull CharSequence paramCharSequence1, int paramInt1, @NotNull CharSequence paramCharSequence2, int paramInt2, int paramInt3, boolean paramBoolean) {
    long l = i ^ 0x1A0160D3A4D9L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
      if (paramCharSequence1 instanceof String)
        try {
          if (paramCharSequence2 instanceof String)
            return StringsKt.regionMatches((String)paramCharSequence1, paramInt1, (String)paramCharSequence2, paramInt2, paramInt3, paramBoolean); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return StringsKt.regionMatchesImpl(paramCharSequence1, paramInt1, paramCharSequence2, paramInt2, paramInt3, paramBoolean);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final String decodeToString(@NotNull byte[] paramArrayOfbyte) {
    long l = i ^ 0x1E72DD8F0E97L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "<this>");
    return new String(paramArrayOfbyte, Charsets.UTF_8);
  }
  
  public static final boolean equals(@Nullable String paramString1, @Nullable String paramString2, boolean paramBoolean) {
    try {
      if (paramString1 == null) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        return (paramString2 == null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return !paramBoolean ? paramString1.equals(paramString2) : paramString1.equalsIgnoreCase(paramString2);
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final char[] toCharArray(@NotNull String paramString, int paramInt1, int paramInt2) {
    long l = i ^ 0x7CBBA905B078L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(paramInt1, paramInt2, paramString.length());
    String str = paramString;
    char[] arrayOfChar = new char[paramInt2 - paramInt1];
    boolean bool = false;
    str.getChars(paramInt1, paramInt2, arrayOfChar, bool);
    return arrayOfChar;
  }
  
  @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @LowPriorityInOverloadResolution
  @NotNull
  public static final String capitalize(@NotNull String paramString, @NotNull Locale paramLocale) {
    long l = i ^ 0x1D9972C818FEL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
      Intrinsics.checkNotNullParameter(paramLocale, "locale");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    if ((paramString.length() > 0)) {
      char c = paramString.charAt(0);
      if (Character.isLowerCase(c)) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = stringBuilder1;
        boolean bool1 = false;
        char c1 = Character.toTitleCase(c);
        try {
          if (c1 != Character.toUpperCase(c)) {
            stringBuilder2.append(c1);
          } else {
            String str1 = paramString;
            boolean bool3 = false;
            boolean bool4 = true;
            Intrinsics.checkNotNullExpressionValue(str1.substring(bool3, bool4), "this as java.lang.String…ing(startIndex, endIndex)");
            str1 = str1.substring(bool3, bool4);
            Intrinsics.checkNotNull(str1, "null cannot be cast to non-null type java.lang.String");
            Intrinsics.checkNotNullExpressionValue(str1.toUpperCase(paramLocale), "this as java.lang.String).toUpperCase(locale)");
            stringBuilder2.append(str1.toUpperCase(paramLocale));
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        String str = paramString;
        boolean bool2 = true;
        Intrinsics.checkNotNullExpressionValue(str.substring(bool2), "this as java.lang.String).substring(startIndex)");
        stringBuilder2.append(str.substring(bool2));
        Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
        return stringBuilder1.toString();
      } 
    } 
    return paramString;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final byte[] encodeToByteArray(@NotNull String paramString, int paramInt1, int paramInt2, boolean paramBoolean) {
    long l = i ^ 0x1EBF70B75C97L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(paramInt1, paramInt2, paramString.length());
    if (!paramBoolean) {
      Intrinsics.checkNotNullExpressionValue(paramString.substring(paramInt1, paramInt2), "this as java.lang.String…ing(startIndex, endIndex)");
      String str = paramString.substring(paramInt1, paramInt2);
      Charset charset = Charsets.UTF_8;
      Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
      Intrinsics.checkNotNullExpressionValue(str.getBytes(charset), "this as java.lang.String).getBytes(charset)");
      return str.getBytes(charset);
    } 
    CharsetEncoder charsetEncoder = Charsets.UTF_8.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    ByteBuffer byteBuffer = charsetEncoder.encode(CharBuffer.wrap(paramString, paramInt1, paramInt2));
    try {
      if (byteBuffer.hasArray())
        try {
          if (byteBuffer.arrayOffset() == 0)
            try {
              Intrinsics.checkNotNull(byteBuffer.array());
              if (byteBuffer.remaining() == (byteBuffer.array()).length)
                Intrinsics.checkNotNullExpressionValue(byteBuffer.array(), "{\n        byteBuffer.array()\n    }"); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw b(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    byte[] arrayOfByte1 = new byte[byteBuffer.remaining()];
    byte[] arrayOfByte2 = arrayOfByte1;
    boolean bool = false;
    byteBuffer.get(arrayOfByte2);
    return arrayOfByte1;
  }
  
  @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
  @DeprecatedSinceKotlin(warningSince = "1.5")
  @NotNull
  public static final String decapitalize(@NotNull String paramString) {
    long l = i ^ 0x33242E5B7B6AL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      String str = paramString;
      boolean bool1 = false;
      boolean bool2 = true;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool1, bool2), "this as java.lang.String…ing(startIndex, endIndex)");
      str = str.substring(bool1, bool2);
      Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
      Intrinsics.checkNotNullExpressionValue(str.toLowerCase(), "this as java.lang.String).toLowerCase()");
      str = paramString;
      bool1 = true;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool1), "this as java.lang.String).substring(startIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return (((paramString.length() > 0)) && !Character.isLowerCase(paramString.charAt(0))) ? (str.toLowerCase() + str.substring(bool1)) : paramString;
  }
  
  @SinceKotlin(version = "1.5")
  public static final boolean contentEquals(@Nullable CharSequence paramCharSequence1, @Nullable CharSequence paramCharSequence2, boolean paramBoolean) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return paramBoolean ? StringsKt.contentEqualsIgnoreCaseImpl(paramCharSequence1, paramCharSequence2) : StringsKt.contentEquals(paramCharSequence1, paramCharSequence2);
  }
  
  public static final boolean startsWith(@NotNull String paramString1, @NotNull String paramString2, boolean paramBoolean) {
    long l = i ^ 0x3A1B977A3A4DL;
    try {
      Intrinsics.checkNotNullParameter(paramString1, "<this>");
      Intrinsics.checkNotNullParameter(paramString2, "prefix");
      if (!paramBoolean)
        return paramString1.startsWith(paramString2); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    return StringsKt.regionMatches(paramString1, 0, paramString2, 0, paramString2.length(), paramBoolean);
  }
  
  private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringsJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
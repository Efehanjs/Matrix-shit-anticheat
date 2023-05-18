package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.OverloadResolutionByLambdaReturnType;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.collections.CharIterator;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.IntIterator;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
  private static final long j = o3.a(1285178761228261619L, -6119195102256763270L, null).a(93796695642010L);
  
  @NotNull
  public static final String substringAfterLast(@NotNull String paramString1, char paramChar, @NotNull String paramString2) {
    long l = j ^ 0x4BDB4E92D5E1L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + 1;
      int k = paramString1.length();
      Intrinsics.checkNotNullExpressionValue(str.substring(j, k), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString2 : str.substring(j, k);
  }
  
  public static final int lastIndexOf(@NotNull CharSequence paramCharSequence, char paramChar, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x47DBF85A1D55L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      char[] arrayOfChar = new char[1];
      arrayOfChar[0] = paramChar;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (paramBoolean || !(paramCharSequence instanceof String)) ? StringsKt.lastIndexOfAny(paramCharSequence, arrayOfChar, paramInt, paramBoolean) : ((String)paramCharSequence).lastIndexOf(paramChar, paramInt);
  }
  
  public static final int lastIndexOfAny(@NotNull CharSequence paramCharSequence, @NotNull char[] paramArrayOfchar, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 124080057165878
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 'chars'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: iload_3
    //   22: ifne -> 69
    //   25: aload_1
    //   26: arraylength
    //   27: iconst_1
    //   28: if_icmpne -> 69
    //   31: goto -> 38
    //   34: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: instanceof java/lang/String
    //   42: ifeq -> 69
    //   45: goto -> 52
    //   48: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   51: athrow
    //   52: aload_1
    //   53: invokestatic single : ([C)C
    //   56: istore #6
    //   58: aload_0
    //   59: checkcast java/lang/String
    //   62: iload #6
    //   64: iload_2
    //   65: invokevirtual lastIndexOf : (II)I
    //   68: ireturn
    //   69: iload_2
    //   70: aload_0
    //   71: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
    //   74: invokestatic coerceAtMost : (II)I
    //   77: istore #6
    //   79: iconst_m1
    //   80: iload #6
    //   82: if_icmpge -> 172
    //   85: aload_0
    //   86: iload #6
    //   88: invokeinterface charAt : (I)C
    //   93: istore #7
    //   95: aload_1
    //   96: astore #8
    //   98: iconst_0
    //   99: istore #9
    //   101: iconst_0
    //   102: istore #10
    //   104: aload #8
    //   106: arraylength
    //   107: istore #11
    //   109: iload #10
    //   111: iload #11
    //   113: if_icmpge -> 155
    //   116: aload #8
    //   118: iload #10
    //   120: caload
    //   121: istore #12
    //   123: iload #12
    //   125: istore #13
    //   127: iconst_0
    //   128: istore #14
    //   130: iload #13
    //   132: iload #7
    //   134: iload_3
    //   135: invokestatic equals : (CCZ)Z
    //   138: ifeq -> 149
    //   141: iconst_1
    //   142: goto -> 156
    //   145: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   148: athrow
    //   149: iinc #10, 1
    //   152: goto -> 109
    //   155: iconst_0
    //   156: ifeq -> 166
    //   159: iload #6
    //   161: ireturn
    //   162: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   165: athrow
    //   166: iinc #6, -1
    //   169: goto -> 79
    //   172: iconst_m1
    //   173: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	31	34	java/lang/IllegalArgumentException
    //   25	45	48	java/lang/IllegalArgumentException
    //   130	145	145	java/lang/IllegalArgumentException
    //   156	162	162	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final Sequence splitToSequence(@NotNull CharSequence paramCharSequence, @NotNull String[] paramArrayOfString, boolean paramBoolean, int paramInt) {
    long l = j ^ 0x5D2EE9FFCDEBL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "delimiters");
    return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(paramCharSequence, paramArrayOfString, 0, paramBoolean, paramInt, 2, (Object)null), new StringsKt__StringsKt$splitToSequence$1(paramCharSequence));
  }
  
  @NotNull
  public static final String trim(@NotNull String paramString, @NotNull char... paramVarArgs) {
    long l = j ^ 0x14D510EC3012L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramVarArgs, "chars");
    String str = paramString;
    boolean bool1 = false;
    CharSequence charSequence = str;
    boolean bool2 = false;
    byte b = 0;
    int i = charSequence.length() - 1;
    boolean bool3 = false;
    while (true) {
      try {
        if (b <= i) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          boolean bool4 = !bool3 ? b : i;
          char c = charSequence.charAt(bool4);
          boolean bool5 = false;
          boolean bool = ArraysKt.contains(paramVarArgs, c);
          try {
            if (!bool3) {
              if (!bool) {
                bool3 = true;
                continue;
              } 
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          try {
            if (!bool)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          i--;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      break;
    } 
    return charSequence.subSequence(b, i + 1).toString();
  }
  
  @NotNull
  public static final String replaceBefore(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String paramString4) {
    long l = j ^ 0x200349EC55E7L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "replacement");
    Intrinsics.checkNotNullParameter(paramString4, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString4 : StringsKt.replaceRange(str, bool, i, paramString3).toString();
  }
  
  @SinceKotlin(version = "1.5")
  @Nullable
  public static final Boolean toBooleanStrictOrNull(@NotNull String paramString) {
    long l = j ^ 0x6FA87A92376AL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    String str = paramString;
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return Intrinsics.areEqual(str, "true") ? Boolean.valueOf(true) : (Intrinsics.areEqual(str, "false") ? Boolean.valueOf(false) : null);
  }
  
  @NotNull
  public static final CharSequence replaceRange(@NotNull CharSequence paramCharSequence1, int paramInt1, int paramInt2, @NotNull CharSequence paramCharSequence2) {
    long l = j ^ 0x270FF3E1571CL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "replacement");
      if (paramInt2 < paramInt1)
        throw new IndexOutOfBoundsException("End index (" + paramInt2 + ") is less than start index (" + paramInt1 + ")."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    Intrinsics.checkNotNullExpressionValue(stringBuilder.append(paramCharSequence1, 0, paramInt1), "this.append(value, startIndex, endIndex)");
    stringBuilder.append(paramCharSequence1, 0, paramInt1);
    stringBuilder.append(paramCharSequence2);
    Intrinsics.checkNotNullExpressionValue(stringBuilder.append(paramCharSequence1, paramInt2, paramCharSequence1.length()), "this.append(value, startIndex, endIndex)");
    stringBuilder.append(paramCharSequence1, paramInt2, paramCharSequence1.length());
    return stringBuilder;
  }
  
  public static final int indexOfAny(@NotNull CharSequence paramCharSequence, @NotNull char[] paramArrayOfchar, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 18918224877790
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: ldc '<this>'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 'chars'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: iload_3
    //   22: ifne -> 69
    //   25: aload_1
    //   26: arraylength
    //   27: iconst_1
    //   28: if_icmpne -> 69
    //   31: goto -> 38
    //   34: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   37: athrow
    //   38: aload_0
    //   39: instanceof java/lang/String
    //   42: ifeq -> 69
    //   45: goto -> 52
    //   48: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   51: athrow
    //   52: aload_1
    //   53: invokestatic single : ([C)C
    //   56: istore #6
    //   58: aload_0
    //   59: checkcast java/lang/String
    //   62: iload #6
    //   64: iload_2
    //   65: invokevirtual indexOf : (II)I
    //   68: ireturn
    //   69: new me/rerere/matrix/thirdparty/kotlin/ranges/IntRange
    //   72: dup
    //   73: iload_2
    //   74: iconst_0
    //   75: invokestatic coerceAtLeast : (II)I
    //   78: aload_0
    //   79: invokestatic getLastIndex : (Ljava/lang/CharSequence;)I
    //   82: invokespecial <init> : (II)V
    //   85: invokevirtual iterator : ()Lme/rerere/matrix/thirdparty/kotlin/collections/IntIterator;
    //   88: astore #6
    //   90: aload #6
    //   92: invokevirtual hasNext : ()Z
    //   95: ifeq -> 182
    //   98: aload #6
    //   100: invokevirtual nextInt : ()I
    //   103: istore #7
    //   105: aload_0
    //   106: iload #7
    //   108: invokeinterface charAt : (I)C
    //   113: istore #8
    //   115: aload_1
    //   116: astore #9
    //   118: iconst_0
    //   119: istore #10
    //   121: iconst_0
    //   122: istore #11
    //   124: aload #9
    //   126: arraylength
    //   127: istore #12
    //   129: iload #11
    //   131: iload #12
    //   133: if_icmpge -> 175
    //   136: aload #9
    //   138: iload #11
    //   140: caload
    //   141: istore #13
    //   143: iload #13
    //   145: istore #14
    //   147: iconst_0
    //   148: istore #15
    //   150: iload #14
    //   152: iload #8
    //   154: iload_3
    //   155: invokestatic equals : (CCZ)Z
    //   158: ifeq -> 169
    //   161: iconst_1
    //   162: goto -> 176
    //   165: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   168: athrow
    //   169: iinc #11, 1
    //   172: goto -> 129
    //   175: iconst_0
    //   176: ifeq -> 90
    //   179: iload #7
    //   181: ireturn
    //   182: iconst_m1
    //   183: ireturn
    // Exception table:
    //   from	to	target	type
    //   9	31	34	java/lang/IllegalArgumentException
    //   25	45	48	java/lang/IllegalArgumentException
    //   150	165	165	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final CharSequence trim(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x476D2312E805L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    byte b = 0;
    int i = paramCharSequence.length() - 1;
    boolean bool2 = false;
    while (true) {
      try {
        if (b <= i) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          boolean bool = !bool2 ? b : i;
          boolean bool3 = ((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(bool)))).booleanValue();
          try {
            if (!bool2) {
              if (!bool3) {
                bool2 = true;
                continue;
              } 
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          try {
            if (!bool3)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          i--;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      break;
    } 
    return paramCharSequence.subSequence(b, i + 1);
  }
  
  @NotNull
  public static final CharSequence removeSurrounding(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2) {
    long l = j ^ 0x53C67AE112FEL;
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "delimiter");
    return StringsKt.removeSurrounding(paramCharSequence1, paramCharSequence2, paramCharSequence2);
  }
  
  @NotNull
  public static final CharSequence removeSurrounding(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, @NotNull CharSequence paramCharSequence3) {
    long l = j ^ 0x17860216CAFEL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
      Intrinsics.checkNotNullParameter(paramCharSequence3, "suffix");
      if (paramCharSequence1.length() >= paramCharSequence2.length() + paramCharSequence3.length())
        try {
          if (StringsKt.startsWith$default(paramCharSequence1, paramCharSequence2, false, 2, (Object)null))
            try {
              if (StringsKt.endsWith$default(paramCharSequence1, paramCharSequence3, false, 2, (Object)null))
                return paramCharSequence1.subSequence(paramCharSequence2.length(), paramCharSequence1.length() - paramCharSequence3.length()); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramCharSequence1.subSequence(0, paramCharSequence1.length());
  }
  
  @NotNull
  public static final String padEnd(@NotNull String paramString, int paramInt, char paramChar) {
    long l = j ^ 0xED8DFF9C0EL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.padEnd(paramString, paramInt, paramChar).toString();
  }
  
  @NotNull
  public static final String substringBeforeLast(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x1BB55A2FFE24L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool, i), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : str.substring(bool, i);
  }
  
  @NotNull
  public static final CharSequence trim(@NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x33DFE58F9E55L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    CharSequence charSequence = paramCharSequence;
    boolean bool1 = false;
    byte b = 0;
    int i = charSequence.length() - 1;
    boolean bool2 = false;
    while (true) {
      try {
        if (b <= i) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          boolean bool3 = !bool2 ? b : i;
          char c = charSequence.charAt(bool3);
          boolean bool4 = false;
          boolean bool = CharsKt.isWhitespace(c);
          try {
            if (!bool2) {
              if (!bool) {
                bool2 = true;
                continue;
              } 
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          try {
            if (!bool)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          i--;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      break;
    } 
    return charSequence.subSequence(b, i + 1);
  }
  
  @NotNull
  public static final String substringAfterLast(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x67289210BFFBL;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + paramString2.length();
      int k = paramString1.length();
      Intrinsics.checkNotNullExpressionValue(str.substring(j, k), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : str.substring(j, k);
  }
  
  @NotNull
  public static final String padStart(@NotNull String paramString, int paramInt, char paramChar) {
    long l = j ^ 0x1D9031EC546CL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return StringsKt.padStart(paramString, paramInt, paramChar).toString();
  }
  
  @NotNull
  public static final CharSequence trimEnd(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x22C6879CC4FL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    int i = paramCharSequence.length() + -1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(j)))).booleanValue())
          return paramCharSequence.subSequence(0, j + 1); 
      } while (0 <= i); 
    return "";
  }
  
  @NotNull
  public static final List split(@NotNull CharSequence paramCharSequence, @NotNull char[] paramArrayOfchar, boolean paramBoolean, int paramInt) {
    long l = j ^ 0x4F62526CF0AEL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramArrayOfchar, "delimiters");
      if (paramArrayOfchar.length == 1)
        return split$StringsKt__StringsKt(paramCharSequence, String.valueOf(paramArrayOfchar[0]), paramBoolean, paramInt); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    Iterable iterable1 = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(paramCharSequence, paramArrayOfchar, 0, paramBoolean, paramInt, 2, (Object)null));
    boolean bool1 = false;
    Iterable iterable2 = iterable1;
    ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10));
    boolean bool2 = false;
    for (IntRange intRange1 : iterable2) {
      IntRange intRange2 = intRange1;
      ArrayList<String> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(StringsKt.substring(paramCharSequence, intRange2));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final CharSequence removeRange(@NotNull CharSequence paramCharSequence, @NotNull IntRange paramIntRange) {
    long l = j ^ 0x477D2729B2FAL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramIntRange, "range");
    return StringsKt.removeRange(paramCharSequence, paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1);
  }
  
  @NotNull
  public static final String trimEnd(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 35932038989248
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc_w 'predicate'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: iconst_0
    //   22: istore #4
    //   24: aload_0
    //   25: checkcast java/lang/CharSequence
    //   28: astore #5
    //   30: iconst_0
    //   31: istore #6
    //   33: aload #5
    //   35: invokeinterface length : ()I
    //   40: iconst_m1
    //   41: iadd
    //   42: istore #7
    //   44: iconst_0
    //   45: iload #7
    //   47: if_icmpgt -> 105
    //   50: iload #7
    //   52: istore #8
    //   54: iinc #7, -1
    //   57: aload_1
    //   58: aload #5
    //   60: iload #8
    //   62: invokeinterface charAt : (I)C
    //   67: invokestatic valueOf : (C)Ljava/lang/Character;
    //   70: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   75: checkcast java/lang/Boolean
    //   78: invokevirtual booleanValue : ()Z
    //   81: ifne -> 99
    //   84: aload #5
    //   86: iconst_0
    //   87: iload #8
    //   89: iconst_1
    //   90: iadd
    //   91: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   96: goto -> 111
    //   99: iconst_0
    //   100: iload #7
    //   102: if_icmple -> 50
    //   105: ldc_w ''
    //   108: checkcast java/lang/CharSequence
    //   111: invokevirtual toString : ()Ljava/lang/String;
    //   114: areturn
  }
  
  @NotNull
  public static final String substringAfter(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x7E4D4E7C6417L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + paramString2.length();
      int k = paramString1.length();
      Intrinsics.checkNotNullExpressionValue(str.substring(j, k), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : str.substring(j, k);
  }
  
  @NotNull
  public static final List lines(@NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x788747E8CB38L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return SequencesKt.toList(StringsKt.lineSequence(paramCharSequence));
  }
  
  public static final int indexOfAny(@NotNull CharSequence paramCharSequence, @NotNull Collection paramCollection, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x5098D9C193DCL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramCollection, "strings");
      findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, false);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, false) != null) ? ((Number)findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, false).getFirst()).intValue() : -1;
  }
  
  public static final boolean contains(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, boolean paramBoolean) {
    long l = j ^ 0x6092DAEF3F2L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
      if (paramCharSequence2 instanceof String) {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
      } else {
        try {
        
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (indexOf$StringsKt__StringsKt$default(paramCharSequence1, paramCharSequence2, 0, paramCharSequence1.length(), paramBoolean, false, 16, (Object)null) >= 0);
  }
  
  @NotNull
  public static final String replaceBeforeLast(@NotNull String paramString1, char paramChar, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x22BDEADAAD40L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "replacement");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : StringsKt.replaceRange(str, bool, i, paramString2).toString();
  }
  
  @NotNull
  public static final String replaceAfter(@NotNull String paramString1, char paramChar, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x36427EE29391L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "replacement");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + 1;
      int k = paramString1.length();
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : StringsKt.replaceRange(str, j, k, paramString2).toString();
  }
  
  @NotNull
  public static final Sequence splitToSequence(@NotNull CharSequence paramCharSequence, @NotNull char[] paramArrayOfchar, boolean paramBoolean, int paramInt) {
    long l = j ^ 0x711A046DD2C3L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfchar, "delimiters");
    return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(paramCharSequence, paramArrayOfchar, 0, paramBoolean, paramInt, 2, (Object)null), new StringsKt__StringsKt$splitToSequence$2(paramCharSequence));
  }
  
  @NotNull
  public static final String trim(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x50A14313B7CEL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    CharSequence charSequence = paramString;
    boolean bool2 = false;
    byte b = 0;
    int i = charSequence.length() - 1;
    boolean bool3 = false;
    while (true) {
      try {
        if (b <= i) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          boolean bool = !bool3 ? b : i;
          boolean bool4 = ((Boolean)paramFunction1.invoke(Character.valueOf(charSequence.charAt(bool)))).booleanValue();
          try {
            if (!bool3) {
              if (!bool4) {
                bool3 = true;
                continue;
              } 
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          try {
            if (!bool4)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          i--;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      break;
    } 
    return charSequence.subSequence(b, i + 1).toString();
  }
  
  @NotNull
  public static final String substringBeforeLast(@NotNull String paramString1, char paramChar, @NotNull String paramString2) {
    long l = j ^ 0x1BD2F6E5EBEAL;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool, i), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString2 : str.substring(bool, i);
  }
  
  @NotNull
  public static final CharSequence trimEnd(@NotNull CharSequence paramCharSequence, @NotNull char... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 113461503732405
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'chars'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: astore #4
    //   23: iconst_0
    //   24: istore #5
    //   26: aload #4
    //   28: invokeinterface length : ()I
    //   33: iconst_m1
    //   34: iadd
    //   35: istore #6
    //   37: iconst_0
    //   38: iload #6
    //   40: if_icmpgt -> 94
    //   43: iload #6
    //   45: istore #7
    //   47: iinc #6, -1
    //   50: aload #4
    //   52: iload #7
    //   54: invokeinterface charAt : (I)C
    //   59: istore #8
    //   61: iconst_0
    //   62: istore #9
    //   64: aload_1
    //   65: iload #8
    //   67: invokestatic contains : ([CC)Z
    //   70: ifne -> 88
    //   73: aload #4
    //   75: iconst_0
    //   76: iload #7
    //   78: iconst_1
    //   79: iadd
    //   80: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   85: goto -> 100
    //   88: iconst_0
    //   89: iload #6
    //   91: if_icmple -> 43
    //   94: ldc_w ''
    //   97: checkcast java/lang/CharSequence
    //   100: areturn
  }
  
  @NotNull
  public static final String commonSuffixWith(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, boolean paramBoolean) {
    long l = j ^ 0x6BCE221286C1L;
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
    int i = paramCharSequence1.length();
    int j = paramCharSequence2.length();
    int k = Math.min(i, j);
    byte b = 0;
    while (true) {
      try {
        if (b < k)
          try {
            if (CharsKt.equals(paramCharSequence1.charAt(i - b - 1), paramCharSequence2.charAt(j - b - 1), paramBoolean)) {
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      break;
    } 
    try {
      if (!StringsKt.hasSurrogatePairAt(paramCharSequence1, i - b - 1)) {
        try {
          if (StringsKt.hasSurrogatePairAt(paramCharSequence2, j - b - 1))
            return paramCharSequence1.subSequence(i - --b, i).toString(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return paramCharSequence1.subSequence(i - b, i).toString();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramCharSequence1.subSequence(i - --b, i).toString();
  }
  
  @NotNull
  public static final String replaceAfter(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String paramString4) {
    long l = j ^ 0x45E74A48AF3AL;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "replacement");
    Intrinsics.checkNotNullParameter(paramString4, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + paramString2.length();
      int k = paramString1.length();
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString4 : StringsKt.replaceRange(str, j, k, paramString3).toString();
  }
  
  public static final boolean startsWith(@NotNull CharSequence paramCharSequence, char paramChar, boolean paramBoolean) {
    long l = j ^ 0x55B27EC95F6AL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramCharSequence.length() > 0)
        try {
          if (CharsKt.equals(paramCharSequence.charAt(0), paramChar, paramBoolean));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return false;
  }
  
  @NotNull
  public static final CharSequence trimStart(@NotNull CharSequence paramCharSequence) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 60817020973740
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: astore_3
    //   16: iconst_0
    //   17: istore #4
    //   19: iconst_0
    //   20: istore #5
    //   22: aload_3
    //   23: invokeinterface length : ()I
    //   28: istore #6
    //   30: iload #5
    //   32: iload #6
    //   34: if_icmpge -> 85
    //   37: aload_3
    //   38: iload #5
    //   40: invokeinterface charAt : (I)C
    //   45: istore #7
    //   47: iconst_0
    //   48: istore #8
    //   50: iload #7
    //   52: invokestatic isWhitespace : (C)Z
    //   55: ifne -> 79
    //   58: aload_3
    //   59: iload #5
    //   61: aload_3
    //   62: invokeinterface length : ()I
    //   67: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   72: goto -> 91
    //   75: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   78: athrow
    //   79: iinc #5, 1
    //   82: goto -> 30
    //   85: ldc_w ''
    //   88: checkcast java/lang/CharSequence
    //   91: areturn
    // Exception table:
    //   from	to	target	type
    //   50	75	75	java/lang/IllegalArgumentException
  }
  
  public static final boolean contentEqualsImpl(@Nullable CharSequence paramCharSequence1, @Nullable CharSequence paramCharSequence2) {
    try {
      if (paramCharSequence1 instanceof String)
        try {
          if (paramCharSequence2 instanceof String)
            return Intrinsics.areEqual(paramCharSequence1, paramCharSequence2); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (paramCharSequence1 == paramCharSequence2)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (paramCharSequence1 != null)
        try {
          if (paramCharSequence2 != null)
            try {
              if (paramCharSequence1.length() == paramCharSequence2.length()) {
                byte b = 0;
                int i = paramCharSequence1.length();
                while (true) {
                  try {
                    if (b < i) {
                      try {
                        if (paramCharSequence1.charAt(b) != paramCharSequence2.charAt(b))
                          return false; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw c(null);
                      } 
                      b++;
                      continue;
                    } 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw c(null);
                  } 
                  return true;
                } 
              } 
              return false;
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return false;
  }
  
  public static final boolean endsWith(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, boolean paramBoolean) {
    long l = j ^ 0x7881F9DC5BE0L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "suffix");
      if (!paramBoolean)
        try {
          if (paramCharSequence1 instanceof String)
            try {
              if (paramCharSequence2 instanceof String)
                return StringsKt.endsWith$default((String)paramCharSequence1, (String)paramCharSequence2, false, 2, (Object)null); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return StringsKt.regionMatchesImpl(paramCharSequence1, paramCharSequence1.length() - paramCharSequence2.length(), paramCharSequence2, 0, paramCharSequence2.length(), paramBoolean);
  }
  
  @NotNull
  public static final CharSequence trimStart(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x4A024BECCFF9L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool = false;
    byte b = 0;
    int i = paramCharSequence.length();
    while (true) {
      try {
        if (b < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(paramCharSequence.charAt(b)))).booleanValue())
              return paramCharSequence.subSequence(b, paramCharSequence.length()); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          b++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      return "";
    } 
  }
  
  @SinceKotlin(version = "1.5")
  public static final boolean toBooleanStrict(@NotNull String paramString) {
    long l = j ^ 0xBF0E64992B4L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    String str = paramString;
    try {
      try {
        if (Intrinsics.areEqual(str, "false")) {
        
        } else {
          throw new IllegalArgumentException("The string doesn't represent a boolean value: " + paramString);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return Intrinsics.areEqual(str, "true") ? true : "JD-Core does not support Kotlin";
  }
  
  public static final int indexOf(@NotNull CharSequence paramCharSequence, @NotNull String paramString, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x16C9DF294118L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramString, "string");
      if (!paramBoolean) {
        try {
          if (!(paramCharSequence instanceof String));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return ((String)paramCharSequence).indexOf(paramString, paramInt);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  public static final boolean regionMatchesImpl(@NotNull CharSequence paramCharSequence1, int paramInt1, @NotNull CharSequence paramCharSequence2, int paramInt2, int paramInt3, boolean paramBoolean) {
    long l = j ^ 0x4470DEC69534L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
      if (paramInt2 >= 0)
        try {
          if (paramInt1 >= 0)
            try {
              if (paramInt1 <= paramCharSequence1.length() - paramInt3)
                try {
                  if (paramInt2 <= paramCharSequence2.length() - paramInt3) {
                    byte b = 0;
                    while (true) {
                      try {
                        if (b < paramInt3) {
                          try {
                            if (!CharsKt.equals(paramCharSequence1.charAt(paramInt1 + b), paramCharSequence2.charAt(paramInt2 + b), paramBoolean))
                              return false; 
                          } catch (IllegalArgumentException illegalArgumentException) {
                            throw c(null);
                          } 
                          b++;
                          continue;
                        } 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw c(null);
                      } 
                      return true;
                    } 
                  } 
                  return false;
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw c(null);
                }  
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return false;
  }
  
  public static final boolean contains(@NotNull CharSequence paramCharSequence, char paramChar, boolean paramBoolean) {
    long l = j ^ 0x5EFB94C10161L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (StringsKt.indexOf$default(paramCharSequence, paramChar, 0, paramBoolean, 2, (Object)null) >= 0);
  }
  
  public static final boolean endsWith(@NotNull CharSequence paramCharSequence, char paramChar, boolean paramBoolean) {
    long l = j ^ 0x375B0D304AB0L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramCharSequence.length() > 0)
        try {
          if (CharsKt.equals(paramCharSequence.charAt(StringsKt.getLastIndex(paramCharSequence)), paramChar, paramBoolean));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return false;
  }
  
  @NotNull
  public static final String removePrefix(@NotNull String paramString, @NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x44B5C5A1E415L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence, "prefix");
    if (StringsKt.startsWith$default(paramString, paramCharSequence, false, 2, (Object)null)) {
      String str = paramString;
      int i = paramCharSequence.length();
      Intrinsics.checkNotNullExpressionValue(str.substring(i), "this as java.lang.String).substring(startIndex)");
      return str.substring(i);
    } 
    return paramString;
  }
  
  @Nullable
  public static final Pair findAnyOf(@NotNull CharSequence paramCharSequence, @NotNull Collection paramCollection, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x6FA527775ABCL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "strings");
    return findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, false);
  }
  
  @NotNull
  public static final String substringBefore(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x7CD52BDC6260L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool, i), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : str.substring(bool, i);
  }
  
  public static final boolean contentEqualsIgnoreCaseImpl(@Nullable CharSequence paramCharSequence1, @Nullable CharSequence paramCharSequence2) {
    try {
      if (paramCharSequence1 instanceof String)
        try {
          if (paramCharSequence2 instanceof String)
            return StringsKt.equals((String)paramCharSequence1, (String)paramCharSequence2, true); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (paramCharSequence1 == paramCharSequence2)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (paramCharSequence1 != null)
        try {
          if (paramCharSequence2 != null)
            try {
              if (paramCharSequence1.length() == paramCharSequence2.length()) {
                byte b = 0;
                int i = paramCharSequence1.length();
                while (true) {
                  try {
                    if (b < i) {
                      try {
                        if (!CharsKt.equals(paramCharSequence1.charAt(b), paramCharSequence2.charAt(b), true))
                          return false; 
                      } catch (IllegalArgumentException illegalArgumentException) {
                        throw c(null);
                      } 
                      b++;
                      continue;
                    } 
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw c(null);
                  } 
                  return true;
                } 
              } 
              return false;
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return false;
  }
  
  @NotNull
  public static final CharSequence padStart(@NotNull CharSequence paramCharSequence, int paramInt, char paramChar) {
    long l = j ^ 0x7B67795A7DAL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramInt < 0)
        throw new IllegalArgumentException("Desired length " + paramInt + " is less than zero."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (paramInt <= paramCharSequence.length())
        return paramCharSequence.subSequence(0, paramCharSequence.length()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(paramInt);
    IntIterator intIterator = (new IntRange(1, paramInt - paramCharSequence.length())).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      stringBuilder.append(paramChar);
    } 
    stringBuilder.append(paramCharSequence);
    return stringBuilder;
  }
  
  @NotNull
  public static final String substring(@NotNull String paramString, @NotNull IntRange paramIntRange) {
    long l = j ^ 0x257C2030005L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramIntRange, "range");
    String str = paramString;
    int i = paramIntRange.getStart().intValue();
    int j = paramIntRange.getEndInclusive().intValue() + 1;
    Intrinsics.checkNotNullExpressionValue(str.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
    return str.substring(i, j);
  }
  
  public static final int lastIndexOf(@NotNull CharSequence paramCharSequence, @NotNull String paramString, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x4B70D1ACE921L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramString, "string");
      if (!paramBoolean) {
        try {
          if (!(paramCharSequence instanceof String));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return ((String)paramCharSequence).lastIndexOf(paramString, paramInt);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
  }
  
  @NotNull
  public static final String commonPrefixWith(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, boolean paramBoolean) {
    long l = j ^ 0xE5A7B9107BAL;
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "other");
    int i = Math.min(paramCharSequence1.length(), paramCharSequence2.length());
    byte b = 0;
    while (true) {
      try {
        if (b < i)
          try {
            if (CharsKt.equals(paramCharSequence1.charAt(b), paramCharSequence2.charAt(b), paramBoolean)) {
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      break;
    } 
    try {
      if (!StringsKt.hasSurrogatePairAt(paramCharSequence1, b - 1)) {
        try {
          if (StringsKt.hasSurrogatePairAt(paramCharSequence2, b - 1))
            return paramCharSequence1.subSequence(0, --b).toString(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        } 
        return paramCharSequence1.subSequence(0, b).toString();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramCharSequence1.subSequence(0, --b).toString();
  }
  
  @NotNull
  public static final String substringBefore(@NotNull String paramString1, char paramChar, @NotNull String paramString2) {
    long l = j ^ 0x6208FDDD1AF4L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(str.substring(bool, i), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString2 : str.substring(bool, i);
  }
  
  @Nullable
  public static final Pair findLastAnyOf(@NotNull CharSequence paramCharSequence, @NotNull Collection paramCollection, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x2E17C8505804L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramCollection, "strings");
    return findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, true);
  }
  
  @NotNull
  public static final CharSequence padEnd(@NotNull CharSequence paramCharSequence, int paramInt, char paramChar) {
    long l = j ^ 0xDC8C92DD28CL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramInt < 0)
        throw new IllegalArgumentException("Desired length " + paramInt + " is less than zero."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (paramInt <= paramCharSequence.length())
        return paramCharSequence.subSequence(0, paramCharSequence.length()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(paramInt);
    stringBuilder.append(paramCharSequence);
    IntIterator intIterator = (new IntRange(1, paramInt - paramCharSequence.length())).iterator();
    while (intIterator.hasNext()) {
      int i = intIterator.nextInt();
      stringBuilder.append(paramChar);
    } 
    return stringBuilder;
  }
  
  public static final boolean hasSurrogatePairAt(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = j ^ 0x2F0F975D2433L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if ((new IntRange(0, paramCharSequence.length() - 2)).contains(paramInt))
        try {
          if (Character.isHighSurrogate(paramCharSequence.charAt(paramInt)))
            try {
              if (Character.isLowSurrogate(paramCharSequence.charAt(paramInt + 1)));
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return false;
  }
  
  @NotNull
  public static final String trimStart(@NotNull String paramString, @NotNull char... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 20387195004491
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'chars'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: astore #4
    //   23: iconst_0
    //   24: istore #5
    //   26: aload #4
    //   28: checkcast java/lang/CharSequence
    //   31: astore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: iconst_0
    //   37: istore #8
    //   39: aload #6
    //   41: invokeinterface length : ()I
    //   46: istore #9
    //   48: iload #8
    //   50: iload #9
    //   52: if_icmpge -> 107
    //   55: aload #6
    //   57: iload #8
    //   59: invokeinterface charAt : (I)C
    //   64: istore #10
    //   66: iconst_0
    //   67: istore #11
    //   69: aload_1
    //   70: iload #10
    //   72: invokestatic contains : ([CC)Z
    //   75: ifne -> 101
    //   78: aload #6
    //   80: iload #8
    //   82: aload #6
    //   84: invokeinterface length : ()I
    //   89: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   94: goto -> 113
    //   97: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   100: athrow
    //   101: iinc #8, 1
    //   104: goto -> 48
    //   107: ldc_w ''
    //   110: checkcast java/lang/CharSequence
    //   113: invokevirtual toString : ()Ljava/lang/String;
    //   116: areturn
    // Exception table:
    //   from	to	target	type
    //   69	97	97	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final String replaceBeforeLast(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String paramString4) {
    long l = j ^ 0x6873F42CAFEFL;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "replacement");
    Intrinsics.checkNotNullParameter(paramString4, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString4 : StringsKt.replaceRange(str, bool, i, paramString3).toString();
  }
  
  @NotNull
  public static final CharIterator iterator(@NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x3D7806CD4097L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return new StringsKt__StringsKt$iterator$1(paramCharSequence);
  }
  
  @NotNull
  public static final CharSequence trim(@NotNull CharSequence paramCharSequence, @NotNull char... paramVarArgs) {
    long l = j ^ 0x7106F25577C6L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramVarArgs, "chars");
    CharSequence charSequence = paramCharSequence;
    boolean bool1 = false;
    byte b = 0;
    int i = charSequence.length() - 1;
    boolean bool2 = false;
    while (true) {
      try {
        if (b <= i) {
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          boolean bool3 = !bool2 ? b : i;
          char c = charSequence.charAt(bool3);
          boolean bool4 = false;
          boolean bool = ArraysKt.contains(paramVarArgs, c);
          try {
            if (!bool2) {
              if (!bool) {
                bool2 = true;
                continue;
              } 
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          try {
            if (!bool)
              break; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
          i--;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      break;
    } 
    return charSequence.subSequence(b, i + 1);
  }
  
  @NotNull
  public static final String replaceAfterLast(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String paramString4) {
    long l = j ^ 0x1A9DB16764BFL;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "delimiter");
    Intrinsics.checkNotNullParameter(paramString3, "replacement");
    Intrinsics.checkNotNullParameter(paramString4, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramString2, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + paramString2.length();
      int k = paramString1.length();
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString4 : StringsKt.replaceRange(str, j, k, paramString3).toString();
  }
  
  @NotNull
  public static final CharSequence trimEnd(@NotNull CharSequence paramCharSequence) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 40643566918789
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: astore_3
    //   16: iconst_0
    //   17: istore #4
    //   19: aload_3
    //   20: invokeinterface length : ()I
    //   25: iconst_m1
    //   26: iadd
    //   27: istore #5
    //   29: iconst_0
    //   30: iload #5
    //   32: if_icmpgt -> 83
    //   35: iload #5
    //   37: istore #6
    //   39: iinc #5, -1
    //   42: aload_3
    //   43: iload #6
    //   45: invokeinterface charAt : (I)C
    //   50: istore #7
    //   52: iconst_0
    //   53: istore #8
    //   55: iload #7
    //   57: invokestatic isWhitespace : (C)Z
    //   60: ifne -> 77
    //   63: aload_3
    //   64: iconst_0
    //   65: iload #6
    //   67: iconst_1
    //   68: iadd
    //   69: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   74: goto -> 89
    //   77: iconst_0
    //   78: iload #5
    //   80: if_icmple -> 35
    //   83: ldc_w ''
    //   86: checkcast java/lang/CharSequence
    //   89: areturn
  }
  
  @NotNull
  public static final String trimEnd(@NotNull String paramString, @NotNull char... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 93056839034417
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'chars'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: astore #4
    //   23: iconst_0
    //   24: istore #5
    //   26: aload #4
    //   28: checkcast java/lang/CharSequence
    //   31: astore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: aload #6
    //   38: invokeinterface length : ()I
    //   43: iconst_m1
    //   44: iadd
    //   45: istore #8
    //   47: iconst_0
    //   48: iload #8
    //   50: if_icmpgt -> 104
    //   53: iload #8
    //   55: istore #9
    //   57: iinc #8, -1
    //   60: aload #6
    //   62: iload #9
    //   64: invokeinterface charAt : (I)C
    //   69: istore #10
    //   71: iconst_0
    //   72: istore #11
    //   74: aload_1
    //   75: iload #10
    //   77: invokestatic contains : ([CC)Z
    //   80: ifne -> 98
    //   83: aload #6
    //   85: iconst_0
    //   86: iload #9
    //   88: iconst_1
    //   89: iadd
    //   90: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   95: goto -> 110
    //   98: iconst_0
    //   99: iload #8
    //   101: if_icmple -> 53
    //   104: ldc_w ''
    //   107: checkcast java/lang/CharSequence
    //   110: invokevirtual toString : ()Ljava/lang/String;
    //   113: areturn
  }
  
  @NotNull
  public static final CharSequence removeRange(@NotNull CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    long l = j ^ 0x49E43F92C2DL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      if (paramInt2 < paramInt1)
        throw new IndexOutOfBoundsException("End index (" + paramInt2 + ") is less than start index (" + paramInt1 + ")."); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    try {
      if (paramInt2 == paramInt1)
        return paramCharSequence.subSequence(0, paramCharSequence.length()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    StringBuilder stringBuilder = new StringBuilder(paramCharSequence.length() - paramInt2 - paramInt1);
    Intrinsics.checkNotNullExpressionValue(stringBuilder.append(paramCharSequence, 0, paramInt1), "this.append(value, startIndex, endIndex)");
    stringBuilder.append(paramCharSequence, 0, paramInt1);
    Intrinsics.checkNotNullExpressionValue(stringBuilder.append(paramCharSequence, paramInt2, paramCharSequence.length()), "this.append(value, startIndex, endIndex)");
    stringBuilder.append(paramCharSequence, paramInt2, paramCharSequence.length());
    return stringBuilder;
  }
  
  @NotNull
  public static final String substring(@NotNull CharSequence paramCharSequence, @NotNull IntRange paramIntRange) {
    long l = j ^ 0x462BB5FAE121L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramIntRange, "range");
    return paramCharSequence.subSequence(paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1).toString();
  }
  
  @NotNull
  public static final String removeSuffix(@NotNull String paramString, @NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x30ADCBFF8B15L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence, "suffix");
    if (StringsKt.endsWith$default(paramString, paramCharSequence, false, 2, (Object)null)) {
      String str = paramString;
      boolean bool = false;
      int i = paramString.length() - paramCharSequence.length();
      Intrinsics.checkNotNullExpressionValue(str.substring(bool, i), "this as java.lang.String…ing(startIndex, endIndex)");
      return str.substring(bool, i);
    } 
    return paramString;
  }
  
  @NotNull
  public static final Sequence lineSequence(@NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x13219E3B44E4L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "\r\n";
    arrayOfString[1] = "\n";
    arrayOfString[2] = "\r";
    return StringsKt.splitToSequence$default(paramCharSequence, arrayOfString, false, 0, 6, (Object)null);
  }
  
  public static final boolean startsWith(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, int paramInt, boolean paramBoolean) {
    long l = j ^ 0xF81E1E0F576L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
      if (!paramBoolean)
        try {
          if (paramCharSequence1 instanceof String)
            try {
              if (paramCharSequence2 instanceof String)
                return StringsKt.startsWith$default((String)paramCharSequence1, (String)paramCharSequence2, paramInt, false, 4, (Object)null); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return StringsKt.regionMatchesImpl(paramCharSequence1, paramInt, paramCharSequence2, 0, paramCharSequence2.length(), paramBoolean);
  }
  
  @NotNull
  public static final CharSequence subSequence(@NotNull CharSequence paramCharSequence, @NotNull IntRange paramIntRange) {
    long l = j ^ 0x3E4B234FCDADL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramIntRange, "range");
    return paramCharSequence.subSequence(paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1);
  }
  
  public static final int getLastIndex(@NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x3560CEC3A9ABL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return paramCharSequence.length() - 1;
  }
  
  @NotNull
  public static final List split(@NotNull CharSequence paramCharSequence, @NotNull String[] paramArrayOfString, boolean paramBoolean, int paramInt) {
    long l = j ^ 0x4E44734F993CL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfString, "delimiters");
    if (paramArrayOfString.length == 1) {
      String str = paramArrayOfString[0];
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      try {
        if (!((((CharSequence)str).length() == 0) ? 1 : 0))
          return split$StringsKt__StringsKt(paramCharSequence, str, paramBoolean, paramInt); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
    } 
    Iterable iterable1 = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(paramCharSequence, paramArrayOfString, 0, paramBoolean, paramInt, 2, (Object)null));
    boolean bool1 = false;
    Iterable iterable2 = iterable1;
    ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10));
    boolean bool2 = false;
    for (IntRange intRange1 : iterable2) {
      IntRange intRange2 = intRange1;
      ArrayList<String> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(StringsKt.substring(paramCharSequence, intRange2));
    } 
    return arrayList;
  }
  
  @NotNull
  public static final IntRange getIndices(@NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x1965EEDA0B66L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
    return new IntRange(0, paramCharSequence.length() - 1);
  }
  
  public static final boolean startsWith(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2, boolean paramBoolean) {
    long l = j ^ 0x6B7EDDD53144L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
      if (!paramBoolean)
        try {
          if (paramCharSequence1 instanceof String)
            try {
              if (paramCharSequence2 instanceof String)
                return StringsKt.startsWith$default((String)paramCharSequence1, (String)paramCharSequence2, false, 2, (Object)null); 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw c(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return StringsKt.regionMatchesImpl(paramCharSequence1, 0, paramCharSequence2, 0, paramCharSequence2.length(), paramBoolean);
  }
  
  public static final int indexOf(@NotNull CharSequence paramCharSequence, char paramChar, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x4E5E4B744D4AL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      char[] arrayOfChar = new char[1];
      arrayOfChar[0] = paramChar;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (paramBoolean || !(paramCharSequence instanceof String)) ? StringsKt.indexOfAny(paramCharSequence, arrayOfChar, paramInt, paramBoolean) : ((String)paramCharSequence).indexOf(paramChar, paramInt);
  }
  
  @NotNull
  public static final CharSequence removeSuffix(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2) {
    long l = j ^ 0x4DCAB22635E4L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "suffix");
      if (StringsKt.endsWith$default(paramCharSequence1, paramCharSequence2, false, 2, (Object)null))
        return paramCharSequence1.subSequence(0, paramCharSequence1.length() - paramCharSequence2.length()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramCharSequence1.subSequence(0, paramCharSequence1.length());
  }
  
  @NotNull
  public static final CharSequence removePrefix(@NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2) {
    long l = j ^ 0x46F940F92AA2L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "prefix");
      if (StringsKt.startsWith$default(paramCharSequence1, paramCharSequence2, false, 2, (Object)null))
        return paramCharSequence1.subSequence(paramCharSequence2.length(), paramCharSequence1.length()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramCharSequence1.subSequence(0, paramCharSequence1.length());
  }
  
  @NotNull
  public static final String replaceBefore(@NotNull String paramString1, char paramChar, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x10171800EDC7L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "replacement");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      boolean bool = false;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : StringsKt.replaceRange(str, bool, i, paramString2).toString();
  }
  
  @NotNull
  public static final String removeSurrounding(@NotNull String paramString, @NotNull CharSequence paramCharSequence1, @NotNull CharSequence paramCharSequence2) {
    long l = j ^ 0x1CDFA88FDC5DL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "<this>");
      Intrinsics.checkNotNullParameter(paramCharSequence1, "prefix");
      Intrinsics.checkNotNullParameter(paramCharSequence2, "suffix");
      if (paramString.length() >= paramCharSequence1.length() + paramCharSequence2.length())
        try {
          if (StringsKt.startsWith$default(paramString, paramCharSequence1, false, 2, (Object)null) && StringsKt.endsWith$default(paramString, paramCharSequence2, false, 2, (Object)null)) {
            String str = paramString;
            int i = paramCharSequence1.length();
            int j = paramString.length() - paramCharSequence2.length();
            Intrinsics.checkNotNullExpressionValue(str.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
            return str.substring(i, j);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw c(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return paramString;
  }
  
  @NotNull
  public static final String trimStart(@NotNull String paramString, @NotNull Function1 paramFunction1) {
    long l = j ^ 0x66D054CA868CL;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "predicate");
    boolean bool1 = false;
    CharSequence charSequence = paramString;
    boolean bool2 = false;
    byte b = 0;
    int i = charSequence.length();
    while (true) {
      try {
        if (b < i) {
          try {
            if (!((Boolean)paramFunction1.invoke(Character.valueOf(charSequence.charAt(b)))).booleanValue()) {
            
            } else {
              b++;
              continue;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw c(null);
          } 
        } else {
        
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw c(null);
      } 
      return ((CharSequence)"").toString();
    } 
  }
  
  @NotNull
  public static final String removeSurrounding(@NotNull String paramString, @NotNull CharSequence paramCharSequence) {
    long l = j ^ 0x1659BFE113D8L;
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence, "delimiter");
    return StringsKt.removeSurrounding(paramString, paramCharSequence, paramCharSequence);
  }
  
  @NotNull
  public static final CharSequence replaceRange(@NotNull CharSequence paramCharSequence1, @NotNull IntRange paramIntRange, @NotNull CharSequence paramCharSequence2) {
    long l = j ^ 0x568DB9A6A3FEL;
    Intrinsics.checkNotNullParameter(paramCharSequence1, "<this>");
    Intrinsics.checkNotNullParameter(paramIntRange, "range");
    Intrinsics.checkNotNullParameter(paramCharSequence2, "replacement");
    return StringsKt.replaceRange(paramCharSequence1, paramIntRange.getStart().intValue(), paramIntRange.getEndInclusive().intValue() + 1, paramCharSequence2);
  }
  
  public static final void requireNonNegativeLimit(int paramInt) {
    long l = j ^ 0x283C01827F6EL;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    boolean bool = (paramInt >= 0) ? true : false;
    if (!bool) {
      boolean bool1 = false;
      String str = "Limit must be non-negative, but was " + paramInt;
      throw new IllegalArgumentException(str.toString());
    } 
  }
  
  @NotNull
  public static final CharSequence trimStart(@NotNull CharSequence paramCharSequence, @NotNull char... paramVarArgs) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/text/StringsKt__StringsKt.j : J
    //   3: ldc2_w 19930729355968
    //   6: lxor
    //   7: lstore_2
    //   8: aload_0
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc 'chars'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: astore #4
    //   23: iconst_0
    //   24: istore #5
    //   26: iconst_0
    //   27: istore #6
    //   29: aload #4
    //   31: invokeinterface length : ()I
    //   36: istore #7
    //   38: iload #6
    //   40: iload #7
    //   42: if_icmpge -> 97
    //   45: aload #4
    //   47: iload #6
    //   49: invokeinterface charAt : (I)C
    //   54: istore #8
    //   56: iconst_0
    //   57: istore #9
    //   59: aload_1
    //   60: iload #8
    //   62: invokestatic contains : ([CC)Z
    //   65: ifne -> 91
    //   68: aload #4
    //   70: iload #6
    //   72: aload #4
    //   74: invokeinterface length : ()I
    //   79: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
    //   84: goto -> 103
    //   87: invokestatic c : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   90: athrow
    //   91: iinc #6, 1
    //   94: goto -> 38
    //   97: ldc_w ''
    //   100: checkcast java/lang/CharSequence
    //   103: areturn
    // Exception table:
    //   from	to	target	type
    //   59	87	87	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public static final String replaceAfterLast(@NotNull String paramString1, char paramChar, @NotNull String paramString2, @NotNull String paramString3) {
    long l = j ^ 0x485DD915547AL;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "replacement");
    Intrinsics.checkNotNullParameter(paramString3, "missingDelimiterValue");
    int i = StringsKt.lastIndexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + 1;
      int k = paramString1.length();
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString3 : StringsKt.replaceRange(str, j, k, paramString2).toString();
  }
  
  public static final int lastIndexOfAny(@NotNull CharSequence paramCharSequence, @NotNull Collection paramCollection, int paramInt, boolean paramBoolean) {
    long l = j ^ 0x2A7B2C9165D0L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "<this>");
      Intrinsics.checkNotNullParameter(paramCollection, "strings");
      findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, true);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, true) != null) ? ((Number)findAnyOf$StringsKt__StringsKt(paramCharSequence, paramCollection, paramInt, paramBoolean, true).getFirst()).intValue() : -1;
  }
  
  @NotNull
  public static final String substringAfter(@NotNull String paramString1, char paramChar, @NotNull String paramString2) {
    long l = j ^ 0x2BD6864A9698L;
    Intrinsics.checkNotNullParameter(paramString1, "<this>");
    Intrinsics.checkNotNullParameter(paramString2, "missingDelimiterValue");
    int i = StringsKt.indexOf$default(paramString1, paramChar, 0, false, 6, (Object)null);
    try {
      String str = paramString1;
      int j = i + 1;
      int k = paramString1.length();
      Intrinsics.checkNotNullExpressionValue(str.substring(j, k), "this as java.lang.String…ing(startIndex, endIndex)");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw c(null);
    } 
    return (i == -1) ? paramString2 : str.substring(j, k);
  }
  
  private static IllegalArgumentException c(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
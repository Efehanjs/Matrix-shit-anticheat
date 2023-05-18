package me.rerere.matrix.thirdparty.kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Regex implements Serializable {
  @NotNull
  public static final Regex$Companion Companion;
  
  @Nullable
  private Set _options;
  
  @NotNull
  private final Pattern nativePattern;
  
  private static final long a = o3.a(-8917786390660138693L, 2028183802053149146L, null).a(75254009615793L);
  
  @Nullable
  public final MatchResult find(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x167C92F48CD8L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    Intrinsics.checkNotNullExpressionValue(this.nativePattern.matcher(paramCharSequence), "nativePattern.matcher(input)");
    return RegexKt.access$findNext(this.nativePattern.matcher(paramCharSequence), paramInt, paramCharSequence);
  }
  
  @NotNull
  public final String getPattern() {
    long l = a ^ 0x256F541AFD9L;
    Intrinsics.checkNotNullExpressionValue(this.nativePattern.pattern(), "nativePattern.pattern()");
    return this.nativePattern.pattern();
  }
  
  @SinceKotlin(version = "1.7")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @Nullable
  public final MatchResult matchAt(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x3C3FD5F30961L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    Matcher matcher1 = this.nativePattern.matcher(paramCharSequence).useAnchoringBounds(false).useTransparentBounds(true).region(paramInt, paramCharSequence.length());
    Matcher matcher2 = matcher1;
    boolean bool = false;
    try {
      Intrinsics.checkNotNullExpressionValue(matcher2, "this");
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return matcher2.lookingAt() ? new MatcherMatchResult(matcher2, paramCharSequence) : null;
  }
  
  public Regex(@NotNull String paramString, @NotNull Set paramSet) {
    this(Pattern.compile(paramString, Regex$Companion.access$ensureUnicodeCase(Companion, RegexKt.access$toInt(paramSet))));
  }
  
  @NotNull
  public final String replace(@NotNull CharSequence paramCharSequence, @NotNull Function1 paramFunction1) {
    MatchResult matchResult;
    long l = a ^ 0x373B93A80807L;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "input");
      Intrinsics.checkNotNullParameter(paramFunction1, "transform");
      if (find$default(this, paramCharSequence, 0, 2, null) == null) {
        find$default(this, paramCharSequence, 0, 2, null);
        return paramCharSequence.toString();
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    int i = 0;
    int j = paramCharSequence.length();
    StringBuilder stringBuilder = new StringBuilder(j);
    do {
      MatchResult matchResult1 = matchResult;
      stringBuilder.append(paramCharSequence, i, matchResult1.getRange().getStart().intValue());
      stringBuilder.append((CharSequence)paramFunction1.invoke(matchResult1));
      i = matchResult1.getRange().getEndInclusive().intValue() + 1;
      matchResult = matchResult1.next();
    } while (i < j && matchResult != null);
    try {
      if (i < j)
        stringBuilder.append(paramCharSequence, i, j); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    Intrinsics.checkNotNullExpressionValue(stringBuilder.toString(), "sb.toString()");
    return stringBuilder.toString();
  }
  
  @Nullable
  public final MatchResult matchEntire(@NotNull CharSequence paramCharSequence) {
    long l = a ^ 0x5047C49637C6L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    Intrinsics.checkNotNullExpressionValue(this.nativePattern.matcher(paramCharSequence), "nativePattern.matcher(input)");
    return RegexKt.access$matchEntire(this.nativePattern.matcher(paramCharSequence), paramCharSequence);
  }
  
  @NotNull
  public final String replaceFirst(@NotNull CharSequence paramCharSequence, @NotNull String paramString) {
    long l = a ^ 0x58E86723E265L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    Intrinsics.checkNotNullParameter(paramString, "replacement");
    Intrinsics.checkNotNullExpressionValue(this.nativePattern.matcher(paramCharSequence).replaceFirst(paramString), "nativePattern.matcher(in…replaceFirst(replacement)");
    return this.nativePattern.matcher(paramCharSequence).replaceFirst(paramString);
  }
  
  public Regex(@NotNull String paramString, @NotNull RegexOption paramRegexOption) {
    this(Pattern.compile(paramString, Regex$Companion.access$ensureUnicodeCase(Companion, paramRegexOption.getValue())));
  }
  
  @NotNull
  public final Pattern toPattern() {
    return this.nativePattern;
  }
  
  @NotNull
  public final Set getOptions() {
    long l = a ^ 0x1A0A659FA073L;
    if (this._options == null) {
      int i = this.nativePattern.flags();
      boolean bool1 = false;
      EnumSet<RegexOption> enumSet1 = EnumSet.allOf(RegexOption.class);
      EnumSet<RegexOption> enumSet2 = enumSet1;
      boolean bool3 = false;
      Intrinsics.checkNotNullExpressionValue(enumSet2, "fromInt$lambda$1");
      CollectionsKt.retainAll(enumSet2, new Regex$special$$inlined$fromInt$1(i));
      Intrinsics.checkNotNullExpressionValue(Collections.unmodifiableSet(enumSet1), "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
      Set<RegexOption> set1 = Collections.unmodifiableSet(enumSet1);
      Set<RegexOption> set2 = set1;
      boolean bool2 = false;
      this._options = set2;
    } 
    return set1;
  }
  
  @NotNull
  public final Sequence findAll(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x6BB8C5E64B3AL;
    try {
      Intrinsics.checkNotNullParameter(paramCharSequence, "input");
      if (paramInt >= 0)
        try {
          if (paramInt <= paramCharSequence.length())
            return SequencesKt.generateSequence(new Regex$findAll$1(this, paramCharSequence, paramInt), Regex$findAll$2.INSTANCE); 
          throw new IndexOutOfBoundsException("Start index out of bounds: " + paramInt + ", input length: " + paramCharSequence.length());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException("Start index out of bounds: " + paramInt + ", input length: " + paramCharSequence.length());
  }
  
  @SinceKotlin(version = "1.7")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  public final boolean matchesAt(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x3DE23E4AC5A8L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    return this.nativePattern.matcher(paramCharSequence).useAnchoringBounds(false).useTransparentBounds(true).region(paramInt, paramCharSequence.length()).lookingAt();
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x56B37FFE0DE0L;
    Intrinsics.checkNotNullExpressionValue(this.nativePattern.toString(), "nativePattern.toString()");
    return this.nativePattern.toString();
  }
  
  static {
    Companion = new Regex$Companion(null);
  }
  
  public final boolean containsMatchIn(@NotNull CharSequence paramCharSequence) {
    long l = a ^ 0x5D9BD87F1732L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    return this.nativePattern.matcher(paramCharSequence).find();
  }
  
  @NotNull
  public final String replace(@NotNull CharSequence paramCharSequence, @NotNull String paramString) {
    long l = a ^ 0x205BED8E73DEL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    Intrinsics.checkNotNullParameter(paramString, "replacement");
    Intrinsics.checkNotNullExpressionValue(this.nativePattern.matcher(paramCharSequence).replaceAll(paramString), "nativePattern.matcher(in…).replaceAll(replacement)");
    return this.nativePattern.matcher(paramCharSequence).replaceAll(paramString);
  }
  
  public Regex(@NotNull String paramString) {
    this(Pattern.compile(paramString));
  }
  
  @NotNull
  public final List split(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x6F77A631D751L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    StringsKt.requireNonNegativeLimit(paramInt);
    Matcher matcher = this.nativePattern.matcher(paramCharSequence);
    try {
      if (paramInt != 1)
        try {
          if (matcher.find()) {
            try {
            
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
              throw a(null);
            } 
            ArrayList<String> arrayList = new ArrayList((paramInt > 0) ? RangesKt.coerceAtMost(paramInt, 10) : 10);
            int i = 0;
            int j = paramInt - 1;
            while (true) {
              arrayList.add(paramCharSequence.subSequence(i, matcher.start()).toString());
              i = matcher.end();
              if (j >= 0) {
                try {
                  if (arrayList.size() != j)
                    continue; 
                } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                  throw a(null);
                } 
                break;
              } 
              continue;
              if (!matcher.find())
                break; 
            } 
            arrayList.add(paramCharSequence.subSequence(i, paramCharSequence.length()).toString());
            return arrayList;
          } 
          return CollectionsKt.listOf(paramCharSequence.toString());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return CollectionsKt.listOf(paramCharSequence.toString());
  }
  
  public final boolean matches(@NotNull CharSequence paramCharSequence) {
    long l = a ^ 0x737D67F6DA99L;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    return this.nativePattern.matcher(paramCharSequence).matches();
  }
  
  @SinceKotlin(version = "1.6")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public final Sequence splitToSequence(@NotNull CharSequence paramCharSequence, int paramInt) {
    long l = a ^ 0x126C1356176EL;
    Intrinsics.checkNotNullParameter(paramCharSequence, "input");
    StringsKt.requireNonNegativeLimit(paramInt);
    return SequencesKt.sequence(new Regex$splitToSequence$1(this, paramCharSequence, paramInt, null));
  }
  
  @PublishedApi
  public Regex(@NotNull Pattern paramPattern) {
    this.nativePattern = paramPattern;
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\Regex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
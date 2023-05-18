package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Regex$Companion {
  private static final long a = o3.a(-8746923648515029918L, 39609057471009468L, null).a(28913871630012L);
  
  @NotNull
  public final String escapeReplacement(@NotNull String paramString) {
    long l = a ^ 0x701C45B49FCCL;
    Intrinsics.checkNotNullParameter(paramString, "literal");
    Intrinsics.checkNotNullExpressionValue(Matcher.quoteReplacement(paramString), "quoteReplacement(literal)");
    return Matcher.quoteReplacement(paramString);
  }
  
  @NotNull
  public final Regex fromLiteral(@NotNull String paramString) {
    long l = a ^ 0x22D20787FC62L;
    Intrinsics.checkNotNullParameter(paramString, "literal");
    return new Regex(paramString, RegexOption.LITERAL);
  }
  
  @NotNull
  public final String escape(@NotNull String paramString) {
    long l = a ^ 0x3A3A630DE18L;
    Intrinsics.checkNotNullParameter(paramString, "literal");
    Intrinsics.checkNotNullExpressionValue(Pattern.quote(paramString), "quote(literal)");
    return Pattern.quote(paramString);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\Regex$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
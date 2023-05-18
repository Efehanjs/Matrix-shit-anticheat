package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt {
  private static final long e = o3.a(-5912264595477117531L, 2067218133703623132L, null).a(271225673954209L);
  
  @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final StringBuilder appendln(@NotNull StringBuilder paramStringBuilder) {
    long l = e ^ 0x1F38B123280EL;
    Intrinsics.checkNotNullParameter(paramStringBuilder, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramStringBuilder.append(SystemProperties.LINE_SEPARATOR), "append(SystemProperties.LINE_SEPARATOR)");
    return paramStringBuilder.append(SystemProperties.LINE_SEPARATOR);
  }
  
  @Deprecated(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}), level = DeprecationLevel.WARNING)
  @NotNull
  public static final Appendable appendln(@NotNull Appendable paramAppendable) {
    long l = e ^ 0x40375D2D2292L;
    Intrinsics.checkNotNullParameter(paramAppendable, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramAppendable.append(SystemProperties.LINE_SEPARATOR), "append(SystemProperties.LINE_SEPARATOR)");
    return paramAppendable.append(SystemProperties.LINE_SEPARATOR);
  }
  
  @SinceKotlin(version = "1.3")
  @NotNull
  public static final StringBuilder clear(@NotNull StringBuilder paramStringBuilder) {
    long l = e ^ 0x427743E13808L;
    Intrinsics.checkNotNullParameter(paramStringBuilder, "<this>");
    StringBuilder stringBuilder1 = paramStringBuilder;
    StringBuilder stringBuilder2 = stringBuilder1;
    boolean bool = false;
    stringBuilder2.setLength(0);
    return stringBuilder1;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringBuilderJVMKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
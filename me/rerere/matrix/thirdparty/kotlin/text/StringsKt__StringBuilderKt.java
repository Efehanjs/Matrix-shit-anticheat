package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class StringsKt__StringBuilderKt extends StringsKt__StringBuilderJVMKt {
  private static final long f = o3.a(4173742413981208038L, 219534893964843824L, null).a(203782954195635L);
  
  @NotNull
  public static final StringBuilder append(@NotNull StringBuilder paramStringBuilder, @NotNull Object... paramVarArgs) {
    long l = f ^ 0x4F14E97097B4L;
    Intrinsics.checkNotNullParameter(paramStringBuilder, "<this>");
    Intrinsics.checkNotNullParameter(paramVarArgs, "value");
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      Object object = paramVarArgs[b];
      paramStringBuilder.append(object);
      b++;
    } 
    return paramStringBuilder;
  }
  
  @NotNull
  public static final StringBuilder append(@NotNull StringBuilder paramStringBuilder, @NotNull String... paramVarArgs) {
    long l = f ^ 0x16A2276C7851L;
    Intrinsics.checkNotNullParameter(paramStringBuilder, "<this>");
    Intrinsics.checkNotNullParameter(paramVarArgs, "value");
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      String str = paramVarArgs[b];
      paramStringBuilder.append(str);
      b++;
    } 
    return paramStringBuilder;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__StringBuilderKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
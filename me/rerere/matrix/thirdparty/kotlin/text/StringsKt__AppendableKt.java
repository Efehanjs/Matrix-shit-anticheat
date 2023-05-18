package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExperimentalStdlibApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.WasExperimental;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class StringsKt__AppendableKt {
  private static final long a = o3.a(-5640338862598088692L, 698190459753439663L, null).a(156561341119536L);
  
  public static final void appendElement(@NotNull Appendable paramAppendable, Object paramObject, @Nullable Function1 paramFunction1) {
    long l = a ^ 0x292E9C1FAAD5L;
    try {
      Intrinsics.checkNotNullParameter(paramAppendable, "<this>");
      if (paramFunction1 != null) {
        paramAppendable.append((CharSequence)paramFunction1.invoke(paramObject));
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if ((paramObject == null) ? true : (paramObject instanceof CharSequence)) {
            paramAppendable.append((CharSequence)paramObject);
          } else {
            try {
              if (paramObject instanceof Character) {
                paramAppendable.append(((Character)paramObject).charValue());
              } else {
                paramAppendable.append(String.valueOf(paramObject));
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public static final Appendable append(@NotNull Appendable paramAppendable, @NotNull CharSequence... paramVarArgs) {
    long l = a ^ 0x783DF7E9B5BAL;
    Intrinsics.checkNotNullParameter(paramAppendable, "<this>");
    Intrinsics.checkNotNullParameter(paramVarArgs, "value");
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      CharSequence charSequence = paramVarArgs[b];
      paramAppendable.append(charSequence);
      b++;
    } 
    return paramAppendable;
  }
  
  @SinceKotlin(version = "1.4")
  @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
  @NotNull
  public static final Appendable appendRange(@NotNull Appendable paramAppendable, @NotNull CharSequence paramCharSequence, int paramInt1, int paramInt2) {
    long l = a ^ 0x4C207EF9887FL;
    Intrinsics.checkNotNullParameter(paramAppendable, "<this>");
    Intrinsics.checkNotNullParameter(paramCharSequence, "value");
    Intrinsics.checkNotNull(paramAppendable.append(paramCharSequence, paramInt1, paramInt2), "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
    return paramAppendable.append(paramCharSequence, paramInt1, paramInt2);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\StringsKt__AppendableKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
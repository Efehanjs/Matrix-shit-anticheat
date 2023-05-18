package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Locale;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class _OneToManyTitlecaseMappingsKt {
  private static final long a = o3.a(-1864962006025646399L, 1407466502644317679L, null).a(30437079136881L);
  
  @NotNull
  public static final String titlecaseImpl(char paramChar) {
    long l = a ^ 0x1AD46DA75D21L;
    Intrinsics.checkNotNull(String.valueOf(paramChar), "null cannot be cast to non-null type java.lang.String");
    Intrinsics.checkNotNullExpressionValue(String.valueOf(paramChar).toUpperCase(Locale.ROOT), "this as java.lang.String).toUpperCase(Locale.ROOT)");
    String str = String.valueOf(paramChar).toUpperCase(Locale.ROOT);
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
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return (paramChar == 'ŉ') ? str : (c + str1);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return String.valueOf(Character.toTitleCase(paramChar));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\_OneToManyTitlecaseMappingsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
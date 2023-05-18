package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.internal.ProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Headers$Companion {
  private static final long a = o3.a(-3410012678154710544L, 5911332513986554573L, MethodHandles.lookup().lookupClass()).a(205012838460227L);
  
  @Deprecated(message = "function moved to extension", replaceWith = @ReplaceWith(expression = "headers.toHeaders()", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Headers -deprecated_of(@NotNull Map paramMap) {
    long l = a ^ 0x3620A2F8171CL;
    Intrinsics.checkNotNullParameter(paramMap, "headers");
    return of(paramMap);
  }
  
  @Deprecated(message = "function name changed", replaceWith = @ReplaceWith(expression = "headersOf(*namesAndValues)", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Headers -deprecated_of(@NotNull String... paramVarArgs) {
    long l = a ^ 0x4E9255F97391L;
    Intrinsics.checkNotNullParameter(paramVarArgs, "namesAndValues");
    return of(Arrays.<String>copyOf(paramVarArgs, paramVarArgs.length));
  }
  
  @NotNull
  public final Headers of(@NotNull Map paramMap) {
    long l = a ^ 0x1BE4B0213E75L;
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    String[] arrayOfString = new String[paramMap.size() * 2];
    byte b = 0;
    for (Map.Entry entry : paramMap.entrySet()) {
      String str1 = (String)entry.getKey();
      String str2 = (String)entry.getValue();
      String str3 = StringsKt.trim(str1).toString();
      String str4 = StringsKt.trim(str2).toString();
      checkName(str3);
      checkValue(str4, str3);
      arrayOfString[b] = str3;
      arrayOfString[b + 1] = str4;
      b += 2;
    } 
    return new Headers(arrayOfString, null);
  }
  
  @NotNull
  public final Headers of(@NotNull String... paramVarArgs) {
    long l = a ^ 0x21DF1E41F262L;
    try {
      Intrinsics.checkNotNullParameter(paramVarArgs, "namesAndValues");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (!((paramVarArgs.length % 2 == 0) ? 1 : 0)) {
      boolean bool = false;
      String str = "Expected alternating header names and values";
      throw new IllegalArgumentException(str.toString());
    } 
    String[] arrayOfString = (String[])paramVarArgs.clone();
    int i = 0;
    int j = arrayOfString.length;
    while (i < j) {
      int m = i;
      try {
        i++;
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (!((arrayOfString[m] != null) ? 1 : 0)) {
        boolean bool = false;
        String str = "Headers cannot be null";
        throw new IllegalArgumentException(str.toString());
      } 
      arrayOfString[m] = StringsKt.trim(arrayOfString[m]).toString();
    } 
    i = arrayOfString.length + -1;
    j = 0;
    int k = ProgressionUtilKt.getProgressionLastElement(0, i, 2);
    if (j <= k) {
      int m;
      do {
        m = j;
        j += 2;
        String str1 = arrayOfString[m];
        String str2 = arrayOfString[m + 1];
        checkName(str1);
        checkValue(str2, str1);
      } while (m != k);
    } 
    return new Headers(arrayOfString, null);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Headers$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
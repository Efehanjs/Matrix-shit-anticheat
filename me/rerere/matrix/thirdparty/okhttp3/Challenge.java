package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Challenge {
  @NotNull
  private final Map authParams;
  
  @NotNull
  private final String scheme;
  
  private static final long a = o3.a(-2761404135263553432L, 2849175191185583578L, MethodHandles.lookup().lookupClass()).a(200107391871911L);
  
  public int hashCode() {
    null = 29;
    null = 31 * null + this.scheme.hashCode();
    return 31 * null + this.authParams.hashCode();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "realm", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final String -deprecated_realm() {
    return realm();
  }
  
  @NotNull
  public final Challenge withCharset(@NotNull Charset paramCharset) {
    long l = a ^ 0x24E36A9A1A7DL;
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    Map<String, String> map = MapsKt.toMutableMap(this.authParams);
    String str = paramCharset.name();
    Intrinsics.checkNotNullExpressionValue(str, "charset.name()");
    map.put("charset", str);
    return new Challenge(this.scheme, map);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_scheme() {
    return this.scheme;
  }
  
  @NotNull
  public final Map authParams() {
    return this.authParams;
  }
  
  @NotNull
  public final String scheme() {
    return this.scheme;
  }
  
  public Challenge(@NotNull String paramString1, @NotNull String paramString2) {
    this(paramString1, map);
  }
  
  @NotNull
  public final Charset charset() {
    long l = a ^ 0x51B1EDBCD68L;
    String str = (String)this.authParams.get("charset");
    if (str != null)
      try {
        Charset charset1 = Charset.forName(str);
        Intrinsics.checkNotNullExpressionValue(charset1, "forName(charset)");
        return charset1;
      } catch (Exception exception) {} 
    Charset charset = StandardCharsets.ISO_8859_1;
    Intrinsics.checkNotNullExpressionValue(charset, "ISO_8859_1");
    return charset;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "authParams", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Map -deprecated_authParams() {
    return this.authParams;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Challenge)
        try {
          if (Intrinsics.areEqual(((Challenge)paramObject).scheme, this.scheme))
            try {
              if (Intrinsics.areEqual(((Challenge)paramObject).authParams, this.authParams));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x1C2FF8859BFL;
    return this.scheme + " authParams=" + this.authParams;
  }
  
  public Challenge(@NotNull String paramString, @NotNull Map paramMap) {
    this.scheme = paramString;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    for (Map.Entry entry : paramMap.entrySet()) {
      String str1 = (String)entry.getKey();
      String str2 = (String)entry.getValue();
      try {
        String str;
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "US");
        locale = locale;
        Intrinsics.checkNotNullExpressionValue(str.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      String str3 = (str1 == null) ? null : str.toLowerCase(locale);
      linkedHashMap.put(str3, str2);
    } 
    Map<Object, Object> map = Collections.unmodifiableMap(linkedHashMap);
    Intrinsics.checkNotNullExpressionValue(map, "unmodifiableMap<String?, String>(newAuthParams)");
    this.authParams = map;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "charset", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Charset -deprecated_charset() {
    return charset();
  }
  
  @Nullable
  public final String realm() {
    long l = a ^ 0x27024D796B3CL;
    return (String)this.authParams.get("realm");
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Challenge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
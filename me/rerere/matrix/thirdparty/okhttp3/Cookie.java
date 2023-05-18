package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.DatesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Cookie {
  @NotNull
  public static final Cookie$Companion Companion;
  
  @NotNull
  private final String domain;
  
  @NotNull
  private final String path;
  
  private final boolean httpOnly;
  
  private static final Pattern DAY_OF_MONTH_PATTERN;
  
  private static final Pattern TIME_PATTERN;
  
  private static final Pattern MONTH_PATTERN;
  
  @NotNull
  private final String value;
  
  private final long expiresAt;
  
  private static final Pattern YEAR_PATTERN;
  
  private final boolean persistent;
  
  @NotNull
  private final String name;
  
  private final boolean hostOnly;
  
  private final boolean secure;
  
  private static final long a = o3.a(2467088958864927343L, 4842520246520000951L, MethodHandles.lookup().lookupClass()).a(92498705670027L);
  
  public final boolean httpOnly() {
    return this.httpOnly;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "httpOnly", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_httpOnly() {
    return this.httpOnly;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Cookie)
        try {
          if (Intrinsics.areEqual(((Cookie)paramObject).name, this.name))
            try {
              if (Intrinsics.areEqual(((Cookie)paramObject).value, this.value))
                try {
                  if (((Cookie)paramObject).expiresAt == this.expiresAt)
                    try {
                      if (Intrinsics.areEqual(((Cookie)paramObject).domain, this.domain))
                        try {
                          if (Intrinsics.areEqual(((Cookie)paramObject).path, this.path))
                            try {
                              if (((Cookie)paramObject).secure == this.secure)
                                try {
                                  if (((Cookie)paramObject).httpOnly == this.httpOnly)
                                    try {
                                      if (((Cookie)paramObject).persistent == this.persistent)
                                        try {
                                          if (((Cookie)paramObject).hostOnly == this.hostOnly);
                                        } catch (RuntimeException runtimeException) {
                                          throw a(null);
                                        }  
                                    } catch (RuntimeException runtimeException) {
                                      throw a(null);
                                    }  
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                }  
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            }  
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
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
  
  public final boolean secure() {
    return this.secure;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "hostOnly", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_hostOnly() {
    return this.hostOnly;
  }
  
  public int hashCode() {
    null = 17;
    null = 31 * null + this.name.hashCode();
    null = 31 * null + this.value.hashCode();
    null = 31 * null + Long.hashCode(this.expiresAt);
    null = 31 * null + this.domain.hashCode();
    null = 31 * null + this.path.hashCode();
    null = 31 * null + Boolean.hashCode(this.secure);
    null = 31 * null + Boolean.hashCode(this.httpOnly);
    null = 31 * null + Boolean.hashCode(this.persistent);
    return 31 * null + Boolean.hashCode(this.hostOnly);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "name", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_name() {
    return this.name;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "secure", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_secure() {
    return this.secure;
  }
  
  static {
    long l = a ^ 0x500411A8E3C6L;
    Companion = new Cookie$Companion(null);
    YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "value", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_value() {
    return this.value;
  }
  
  @NotNull
  public final String domain() {
    return this.domain;
  }
  
  @NotNull
  public String toString() {
    return toString$okhttp(false);
  }
  
  @NotNull
  public final String value() {
    return this.value;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "path", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_path() {
    return this.path;
  }
  
  @NotNull
  public static final List parseAll(@NotNull HttpUrl paramHttpUrl, @NotNull Headers paramHeaders) {
    return Companion.parseAll(paramHttpUrl, paramHeaders);
  }
  
  public final long expiresAt() {
    return this.expiresAt;
  }
  
  @NotNull
  public final String path() {
    return this.path;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "domain", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_domain() {
    return this.domain;
  }
  
  public final boolean persistent() {
    return this.persistent;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "persistent", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_persistent() {
    return this.persistent;
  }
  
  @NotNull
  public final String toString$okhttp(boolean paramBoolean) {
    long l = a ^ 0x194DBE0FB1DBL;
    StringBuilder stringBuilder = new StringBuilder();
    boolean bool = false;
    try {
      stringBuilder.append(name());
      stringBuilder.append('=');
      stringBuilder.append(value());
      if (persistent())
        try {
          if (expiresAt() == Long.MIN_VALUE) {
            stringBuilder.append("; max-age=0");
          } else {
            stringBuilder.append("; expires=").append(DatesKt.toHttpDateString(new Date(expiresAt())));
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!hostOnly()) {
        try {
          stringBuilder.append("; domain=");
          if (paramBoolean)
            stringBuilder.append("."); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        stringBuilder.append(domain());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      stringBuilder.append("; path=").append(path());
      if (secure())
        stringBuilder.append("; secure"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (httpOnly())
        stringBuilder.append("; httponly"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = stringBuilder.toString();
    Intrinsics.checkNotNullExpressionValue(str, "toString()");
    return str;
  }
  
  @Nullable
  public static final Cookie parse(@NotNull HttpUrl paramHttpUrl, @NotNull String paramString) {
    return Companion.parse(paramHttpUrl, paramString);
  }
  
  @NotNull
  public final String name() {
    return this.name;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "expiresAt", imports = {}), level = DeprecationLevel.ERROR)
  public final long -deprecated_expiresAt() {
    return this.expiresAt;
  }
  
  public final boolean matches(@NotNull HttpUrl paramHttpUrl) {
    long l = a ^ 0x225C2134B4D6L;
    try {
      Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = this.hostOnly ? Intrinsics.areEqual(paramHttpUrl.host(), this.domain) : Cookie$Companion.access$domainMatch(Companion, paramHttpUrl.host(), this.domain);
    try {
      if (!bool)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Cookie$Companion.access$pathMatch(Companion, paramHttpUrl, this.path))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.secure) {
        try {
          if (paramHttpUrl.isHttps());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final boolean hostOnly() {
    return this.hostOnly;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cookie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
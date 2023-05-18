package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CacheControl {
  private final boolean isPrivate;
  
  private final boolean immutable;
  
  @JvmField
  @NotNull
  public static final CacheControl FORCE_NETWORK;
  
  private final boolean isPublic;
  
  private final boolean onlyIfCached;
  
  @Nullable
  private String headerValue;
  
  private final int minFreshSeconds;
  
  private final boolean mustRevalidate;
  
  private final boolean noStore;
  
  private final int maxStaleSeconds;
  
  private final boolean noTransform;
  
  private final int sMaxAgeSeconds;
  
  @JvmField
  @NotNull
  public static final CacheControl FORCE_CACHE;
  
  @NotNull
  public static final CacheControl$Companion Companion;
  
  private final boolean noCache;
  
  private final int maxAgeSeconds;
  
  private static final long a = o3.a(-7775019698308108719L, 2746538037736786470L, MethodHandles.lookup().lookupClass()).a(148941925089227L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x77B623A27FB2L;
    String str = this.headerValue;
    if (str == null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      StringBuilder stringBuilder2 = stringBuilder1;
      boolean bool = false;
      try {
        if (noCache())
          stringBuilder2.append("no-cache, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (noStore())
          stringBuilder2.append("no-store, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (maxAgeSeconds() != -1)
          stringBuilder2.append("max-age=").append(maxAgeSeconds()).append(", "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (sMaxAgeSeconds() != -1)
          stringBuilder2.append("s-maxage=").append(sMaxAgeSeconds()).append(", "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (isPrivate())
          stringBuilder2.append("private, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (isPublic())
          stringBuilder2.append("public, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (mustRevalidate())
          stringBuilder2.append("must-revalidate, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (maxStaleSeconds() != -1)
          stringBuilder2.append("max-stale=").append(maxStaleSeconds()).append(", "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (minFreshSeconds() != -1)
          stringBuilder2.append("min-fresh=").append(minFreshSeconds()).append(", "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (onlyIfCached())
          stringBuilder2.append("only-if-cached, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (noTransform())
          stringBuilder2.append("no-transform, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (immutable())
          stringBuilder2.append("immutable, "); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if ((stringBuilder2.length() == 0))
          return ""; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      stringBuilder2.delete(stringBuilder2.length() - 2, stringBuilder2.length());
      Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
      str = stringBuilder1.toString();
      this.headerValue = str;
    } 
    return str;
  }
  
  public final boolean noCache() {
    return this.noCache;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_immutable() {
    return this.immutable;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_maxAgeSeconds() {
    return this.maxAgeSeconds;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_maxStaleSeconds() {
    return this.maxStaleSeconds;
  }
  
  public final boolean immutable() {
    return this.immutable;
  }
  
  @NotNull
  public static final CacheControl parse(@NotNull Headers paramHeaders) {
    return Companion.parse(paramHeaders);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_mustRevalidate() {
    return this.mustRevalidate;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_noCache() {
    return this.noCache;
  }
  
  public final boolean mustRevalidate() {
    return this.mustRevalidate;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_minFreshSeconds() {
    return this.minFreshSeconds;
  }
  
  public final boolean isPublic() {
    return this.isPublic;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_noStore() {
    return this.noStore;
  }
  
  public final int maxAgeSeconds() {
    return this.maxAgeSeconds;
  }
  
  public final boolean noStore() {
    return this.noStore;
  }
  
  public final boolean onlyIfCached() {
    return this.onlyIfCached;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_noTransform() {
    return this.noTransform;
  }
  
  static {
    Companion = new CacheControl$Companion(null);
    FORCE_NETWORK = (new CacheControl$Builder()).noCache().build();
    FORCE_CACHE = (new CacheControl$Builder()).onlyIfCached().maxStale(2147483647, TimeUnit.SECONDS).build();
  }
  
  public final int sMaxAgeSeconds() {
    return this.sMaxAgeSeconds;
  }
  
  public final int minFreshSeconds() {
    return this.minFreshSeconds;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}), level = DeprecationLevel.ERROR)
  public final boolean -deprecated_onlyIfCached() {
    return this.onlyIfCached;
  }
  
  public final int maxStaleSeconds() {
    return this.maxStaleSeconds;
  }
  
  public final boolean isPrivate() {
    return this.isPrivate;
  }
  
  public final boolean noTransform() {
    return this.noTransform;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_sMaxAgeSeconds() {
    return this.sMaxAgeSeconds;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CacheControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
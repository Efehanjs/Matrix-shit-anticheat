package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CacheControl$Builder {
  private boolean noCache;
  
  private boolean noStore;
  
  private boolean onlyIfCached;
  
  private int maxAgeSeconds = -1;
  
  private boolean noTransform;
  
  private int minFreshSeconds = -1;
  
  private boolean immutable;
  
  private int maxStaleSeconds = -1;
  
  private static final long a = o3.a(-3961588640387350200L, 2643186890912360272L, MethodHandles.lookup().lookupClass()).a(21085507389808L);
  
  @NotNull
  public final CacheControl$Builder noStore() {
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    cacheControl$Builder2.noStore = true;
    return cacheControl$Builder1;
  }
  
  @NotNull
  public final CacheControl$Builder minFresh(int paramInt, @NotNull TimeUnit paramTimeUnit) {
    long l1 = a ^ 0xD1452190850L;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "timeUnit");
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    try {
      if (!((paramInt >= 0) ? 1 : 0)) {
        boolean bool1 = false;
        String str = Intrinsics.stringPlus("minFresh < 0: ", Integer.valueOf(paramInt));
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = paramTimeUnit.toSeconds(paramInt);
    cacheControl$Builder2.minFreshSeconds = cacheControl$Builder2.clampToInt(l2);
    return cacheControl$Builder1;
  }
  
  @NotNull
  public final CacheControl$Builder onlyIfCached() {
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    cacheControl$Builder2.onlyIfCached = true;
    return cacheControl$Builder1;
  }
  
  @NotNull
  public final CacheControl$Builder immutable() {
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    cacheControl$Builder2.immutable = true;
    return cacheControl$Builder1;
  }
  
  @NotNull
  public final CacheControl$Builder maxStale(int paramInt, @NotNull TimeUnit paramTimeUnit) {
    long l1 = a ^ 0x6583803A1CDBL;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "timeUnit");
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    try {
      if (!((paramInt >= 0) ? 1 : 0)) {
        boolean bool1 = false;
        String str = Intrinsics.stringPlus("maxStale < 0: ", Integer.valueOf(paramInt));
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = paramTimeUnit.toSeconds(paramInt);
    cacheControl$Builder2.maxStaleSeconds = cacheControl$Builder2.clampToInt(l2);
    return cacheControl$Builder1;
  }
  
  @NotNull
  public final CacheControl$Builder noTransform() {
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    cacheControl$Builder2.noTransform = true;
    return cacheControl$Builder1;
  }
  
  @NotNull
  public final CacheControl$Builder noCache() {
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    cacheControl$Builder2.noCache = true;
    return cacheControl$Builder1;
  }
  
  @NotNull
  public final CacheControl build() {
    return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
  }
  
  @NotNull
  public final CacheControl$Builder maxAge(int paramInt, @NotNull TimeUnit paramTimeUnit) {
    long l1 = a ^ 0x15E95090AFFDL;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "timeUnit");
    CacheControl$Builder cacheControl$Builder1 = this;
    CacheControl$Builder cacheControl$Builder2 = cacheControl$Builder1;
    boolean bool = false;
    try {
      if (!((paramInt >= 0) ? 1 : 0)) {
        boolean bool1 = false;
        String str = Intrinsics.stringPlus("maxAge < 0: ", Integer.valueOf(paramInt));
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = paramTimeUnit.toSeconds(paramInt);
    cacheControl$Builder2.maxAgeSeconds = cacheControl$Builder2.clampToInt(l2);
    return cacheControl$Builder1;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CacheControl$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CacheStrategy {
  @NotNull
  public static final CacheStrategy$Companion Companion = new CacheStrategy$Companion(null);
  
  @Nullable
  private final Response cacheResponse;
  
  @Nullable
  private final Request networkRequest;
  
  public CacheStrategy(@Nullable Request paramRequest, @Nullable Response paramResponse) {
    this.networkRequest = paramRequest;
    this.cacheResponse = paramResponse;
  }
  
  @Nullable
  public final Response getCacheResponse() {
    return this.cacheResponse;
  }
  
  @Nullable
  public final Request getNetworkRequest() {
    return this.networkRequest;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\CacheStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
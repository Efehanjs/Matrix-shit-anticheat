package me.rerere.matrix.thirdparty.okhttp3.internal.cache;

import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.CacheControl;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.DatesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CacheStrategy$Factory {
  private final long nowMillis;
  
  @NotNull
  private final Request request;
  
  private int ageSeconds;
  
  @Nullable
  private String lastModifiedString;
  
  @Nullable
  private String etag;
  
  @Nullable
  private Date expires;
  
  @Nullable
  private Date lastModified;
  
  private long sentRequestMillis;
  
  @Nullable
  private final Response cacheResponse;
  
  private long receivedResponseMillis;
  
  @Nullable
  private String servedDateString;
  
  @Nullable
  private Date servedDate;
  
  private static final long a = o3.a(-5654489666430942028L, 8691600039708383789L, MethodHandles.lookup().lookupClass()).a(217588035015592L);
  
  @NotNull
  public final CacheStrategy compute() {
    CacheStrategy cacheStrategy = computeCandidate();
    try {
      if (cacheStrategy.getNetworkRequest() != null)
        try {
          if (this.request.cacheControl().onlyIfCached())
            return new CacheStrategy(null, null); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return cacheStrategy;
  }
  
  public CacheStrategy$Factory(long paramLong, @NotNull Request paramRequest, @Nullable Response paramResponse) {
    this.nowMillis = paramLong;
    this.request = paramRequest;
    this.cacheResponse = paramResponse;
    this.ageSeconds = -1;
    if (this.cacheResponse != null) {
      this.sentRequestMillis = this.cacheResponse.sentRequestAtMillis();
      this.receivedResponseMillis = this.cacheResponse.receivedResponseAtMillis();
      Headers headers = this.cacheResponse.headers();
      byte b = 0;
      int i = headers.size();
      while (b < i) {
        byte b1 = b;
        b++;
        String str1 = headers.name(b1);
        String str2 = headers.value(b1);
        try {
          if (StringsKt.equals(str1, "Date", true)) {
            this.servedDate = DatesKt.toHttpDateOrNull(str2);
            this.servedDateString = str2;
            continue;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (StringsKt.equals(str1, "Expires", true)) {
            this.expires = DatesKt.toHttpDateOrNull(str2);
            continue;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (StringsKt.equals(str1, "Last-Modified", true)) {
            this.lastModified = DatesKt.toHttpDateOrNull(str2);
            this.lastModifiedString = str2;
            continue;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (StringsKt.equals(str1, "ETag", true)) {
            this.etag = str2;
            continue;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        if (StringsKt.equals(str1, "Age", true))
          this.ageSeconds = Util.toNonNegativeInt(str2, -1); 
      } 
    } 
  }
  
  @NotNull
  public final Request getRequest$okhttp() {
    return this.request;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\cache\CacheStrategy$Factory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
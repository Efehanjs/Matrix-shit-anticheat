package me.rerere.matrix.thirdparty.okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.Exchange;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Response implements Closeable {
  @Nullable
  private final Exchange exchange;
  
  private final int code;
  
  @NotNull
  private final Protocol protocol;
  
  @NotNull
  private final String message;
  
  @Nullable
  private final Response priorResponse;
  
  @NotNull
  private final Headers headers;
  
  @Nullable
  private final ResponseBody body;
  
  @Nullable
  private final Response networkResponse;
  
  @NotNull
  private final Request request;
  
  @Nullable
  private final Response cacheResponse;
  
  @Nullable
  private final Handshake handshake;
  
  private final long receivedResponseAtMillis;
  
  private final long sentRequestAtMillis;
  
  @Nullable
  private CacheControl lazyCacheControl;
  
  private static final long a = o3.a(-4746260671663471952L, 4686444429127907740L, MethodHandles.lookup().lookupClass()).a(56302683500610L);
  
  @Nullable
  public final Handshake handshake() {
    return this.handshake;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "protocol", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Protocol -deprecated_protocol() {
    return this.protocol;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final CacheControl -deprecated_cacheControl() {
    return cacheControl();
  }
  
  @Nullable
  public final Response cacheResponse() {
    return this.cacheResponse;
  }
  
  public final boolean isSuccessful() {
    int i = this.code;
    try {
      if (200 <= i) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  @NotNull
  public final Request request() {
    return this.request;
  }
  
  public Response(@NotNull Request paramRequest, @NotNull Protocol paramProtocol, @NotNull String paramString, int paramInt, @Nullable Handshake paramHandshake, @NotNull Headers paramHeaders, @Nullable ResponseBody paramResponseBody, @Nullable Response paramResponse1, @Nullable Response paramResponse2, @Nullable Response paramResponse3, long paramLong1, long paramLong2, @Nullable Exchange paramExchange) {
    this.request = paramRequest;
    this.protocol = paramProtocol;
    this.message = paramString;
    this.code = paramInt;
    this.handshake = paramHandshake;
    this.headers = paramHeaders;
    this.body = paramResponseBody;
    this.networkResponse = paramResponse1;
    this.cacheResponse = paramResponse2;
    this.priorResponse = paramResponse3;
    this.sentRequestAtMillis = paramLong1;
    this.receivedResponseAtMillis = paramLong2;
    this.exchange = paramExchange;
  }
  
  public final boolean isRedirect() {
    try {
      switch (this.code) {
        case 300:
        case 301:
        case 302:
        case 303:
        case 307:
        case 308:
        
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final ResponseBody -deprecated_body() {
    return this.body;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "handshake", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Handshake -deprecated_handshake() {
    return this.handshake;
  }
  
  public void close() {
    long l = a ^ 0x5E6C63A9AB9AL;
    if (this.body == null) {
      boolean bool = false;
      String str = "response is not eligible for a body and must not be closed";
      throw new IllegalStateException(str.toString());
    } 
    this.body.close();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "code", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_code() {
    return this.code;
  }
  
  @Nullable
  public final Response networkResponse() {
    return this.networkResponse;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "message", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_message() {
    return this.message;
  }
  
  @JvmOverloads
  @Nullable
  public final String header(@NotNull String paramString1, @Nullable String paramString2) {
    long l = a ^ 0x7E08558C23B4L;
    try {
      Intrinsics.checkNotNullParameter(paramString1, "name");
      if (this.headers.get(paramString1) == null)
        this.headers.get(paramString1); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return paramString2;
  }
  
  @Nullable
  public final ResponseBody body() {
    return this.body;
  }
  
  @NotNull
  public final CacheControl cacheControl() {
    CacheControl cacheControl = this.lazyCacheControl;
    if (cacheControl == null) {
      cacheControl = CacheControl.Companion.parse(this.headers);
      this.lazyCacheControl = cacheControl;
    } 
    return cacheControl;
  }
  
  public final int code() {
    return this.code;
  }
  
  @NotNull
  public final String message() {
    return this.message;
  }
  
  @JvmOverloads
  @Nullable
  public final String header(@NotNull String paramString) {
    long l = a ^ 0x22D08399A8BL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    return header$default(this, paramString, null, 2, null);
  }
  
  @NotNull
  public final List headers(@NotNull String paramString) {
    long l = a ^ 0x7A4E3072D8AEL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    return this.headers.values(paramString);
  }
  
  @NotNull
  public final ResponseBody peekBody(long paramLong) throws IOException {
    Intrinsics.checkNotNull(this.body);
    BufferedSource bufferedSource = this.body.source().peek();
    Buffer buffer = new Buffer();
    bufferedSource.request(paramLong);
    long l = bufferedSource.getBuffer().size();
    buffer.write((Source)bufferedSource, Math.min(paramLong, l));
    return ResponseBody.Companion.create((BufferedSource)buffer, this.body.contentType(), buffer.size());
  }
  
  @Nullable
  public final Exchange exchange() {
    return this.exchange;
  }
  
  @NotNull
  public final Protocol protocol() {
    return this.protocol;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheResponse", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Response -deprecated_cacheResponse() {
    return this.cacheResponse;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "receivedResponseAtMillis", imports = {}), level = DeprecationLevel.ERROR)
  public final long -deprecated_receivedResponseAtMillis() {
    return this.receivedResponseAtMillis;
  }
  
  @NotNull
  public final Headers trailers() throws IOException {
    long l = a ^ 0x671D912C33DEL;
    if (this.exchange == null) {
      boolean bool = false;
      String str = "trailers not available";
      throw new IllegalStateException(str.toString());
    } 
    return this.exchange.trailers();
  }
  
  public final long receivedResponseAtMillis() {
    return this.receivedResponseAtMillis;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "priorResponse", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Response -deprecated_priorResponse() {
    return this.priorResponse;
  }
  
  @NotNull
  public final List challenges() {
    long l = a ^ 0x456441D9755FL;
    try {
      switch (this.code) {
        case 401:
        
        case 407:
        
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return CollectionsKt.emptyList();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "request", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Request -deprecated_request() {
    return this.request;
  }
  
  @NotNull
  public final Headers headers() {
    return this.headers;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "sentRequestAtMillis", imports = {}), level = DeprecationLevel.ERROR)
  public final long -deprecated_sentRequestAtMillis() {
    return this.sentRequestAtMillis;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "networkResponse", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final Response -deprecated_networkResponse() {
    return this.networkResponse;
  }
  
  @NotNull
  public final Response$Builder newBuilder() {
    return new Response$Builder(this);
  }
  
  @Nullable
  public final Response priorResponse() {
    return this.priorResponse;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x3AB710310510L;
    return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
  }
  
  public final long sentRequestAtMillis() {
    return this.sentRequestAtMillis;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Headers -deprecated_headers() {
    return this.headers;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Response.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
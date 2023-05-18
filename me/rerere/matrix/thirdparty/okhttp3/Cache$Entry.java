package me.rerere.matrix.thirdparty.okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.io.CloseableKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.cache.DiskLruCache;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.StatusLine;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.okio.Okio;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Cache$Entry {
  private final int code;
  
  @NotNull
  private final String requestMethod;
  
  @NotNull
  private final HttpUrl url;
  
  @NotNull
  private static final String SENT_MILLIS;
  
  @NotNull
  public static final Cache$Entry$Companion Companion;
  
  @NotNull
  private final Headers varyHeaders;
  
  @NotNull
  private final Headers responseHeaders;
  
  private final long receivedResponseMillis;
  
  @NotNull
  private final Protocol protocol;
  
  @NotNull
  private final String message;
  
  @NotNull
  private static final String RECEIVED_MILLIS;
  
  private final long sentRequestMillis;
  
  @Nullable
  private final Handshake handshake;
  
  private static final long a = o3.a(-7768104818757763790L, -5905910937935364763L, MethodHandles.lookup().lookupClass()).a(10285949801012L);
  
  public Cache$Entry(@NotNull Source paramSource) throws IOException {
    Closeable closeable = (Closeable)paramSource;
    Throwable throwable = null;
    try {
      Source source = (Source)closeable;
      boolean bool = false;
      BufferedSource bufferedSource = Okio.buffer(paramSource);
      String str1 = bufferedSource.readUtf8LineStrict();
      HttpUrl httpUrl = HttpUrl.Companion.parse(str1);
      if (httpUrl == null) {
        IOException iOException1 = new IOException(Intrinsics.stringPlus("Cache corruption for ", str1));
        IOException iOException2 = iOException1;
        Cache$Entry cache$Entry = this;
        boolean bool1 = false;
        Platform.Companion.get().log("cache corruption", 5, iOException2);
        throw iOException1;
      } 
      cache$Entry.url = httpUrl;
      this.requestMethod = bufferedSource.readUtf8LineStrict();
      Headers$Builder headers$Builder1 = new Headers$Builder();
      int i = Cache.Companion.readInt$okhttp(bufferedSource);
      byte b1 = 0;
      while (b1 < i) {
        byte b = b1;
        b1++;
        headers$Builder1.addLenient$okhttp(bufferedSource.readUtf8LineStrict());
      } 
      this.varyHeaders = headers$Builder1.build();
      StatusLine statusLine = StatusLine.Companion.parse(bufferedSource.readUtf8LineStrict());
      this.protocol = statusLine.protocol;
      this.code = statusLine.code;
      this.message = statusLine.message;
      Headers$Builder headers$Builder2 = new Headers$Builder();
      int j = Cache.Companion.readInt$okhttp(bufferedSource);
      byte b2 = 0;
      while (b2 < j) {
        byte b = b2;
        b2++;
        headers$Builder2.addLenient$okhttp(bufferedSource.readUtf8LineStrict());
      } 
      String str2 = headers$Builder2.get(SENT_MILLIS);
      String str3 = headers$Builder2.get(RECEIVED_MILLIS);
      headers$Builder2.removeAll(SENT_MILLIS);
      headers$Builder2.removeAll(RECEIVED_MILLIS);
      String str4 = str2;
      try {
        long l1 = Long.parseLong(str4);
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      this.sentRequestMillis = (str4 == null) ? 0L : l1;
      str4 = str3;
      try {
        long l1 = Long.parseLong(str4);
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      this.receivedResponseMillis = (str4 == null) ? 0L : l1;
      this.responseHeaders = headers$Builder2.build();
      if (isHttps()) {
        str4 = bufferedSource.readUtf8LineStrict();
        try {
        
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        try {
          if ((((CharSequence)str4).length() > 0))
            throw new IOException("expected \"\" but was \"" + str4 + '"'); 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        String str = bufferedSource.readUtf8LineStrict();
        CipherSuite cipherSuite = CipherSuite.Companion.forJavaName(str);
        List list1 = readCertificateList(bufferedSource);
        List list2 = readCertificateList(bufferedSource);
        try {
        
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        TlsVersion tlsVersion = !bufferedSource.exhausted() ? TlsVersion.Companion.forJavaName(bufferedSource.readUtf8LineStrict()) : TlsVersion.SSL_3_0;
        this.handshake = Handshake.Companion.get(tlsVersion, cipherSuite, list1, list2);
      } else {
        this.handshake = null;
      } 
      Unit unit = Unit.INSTANCE;
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
  }
  
  static {
    long l = a ^ 0x21014CBD170EL;
    Companion = new Cache$Entry$Companion(null);
    SENT_MILLIS = Intrinsics.stringPlus(Platform.Companion.get().getPrefix(), "-Sent-Millis");
    RECEIVED_MILLIS = Intrinsics.stringPlus(Platform.Companion.get().getPrefix(), "-Received-Millis");
  }
  
  public final boolean matches(@NotNull Request paramRequest, @NotNull Response paramResponse) {
    long l = a ^ 0x72D965BCD525L;
    try {
      Intrinsics.checkNotNullParameter(paramRequest, "request");
      Intrinsics.checkNotNullParameter(paramResponse, "response");
      if (Intrinsics.areEqual(this.url, paramRequest.url()))
        try {
          if (Intrinsics.areEqual(this.requestMethod, paramRequest.method()))
            try {
              if (Cache.Companion.varyMatches(paramResponse, this.varyHeaders, paramRequest));
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
  public final Response response(@NotNull DiskLruCache.Snapshot paramSnapshot) {
    long l = a ^ 0x2D1F0672D1FFL;
    Intrinsics.checkNotNullParameter(paramSnapshot, "snapshot");
    String str1 = this.responseHeaders.get("Content-Type");
    String str2 = this.responseHeaders.get("Content-Length");
    Request request = (new Request$Builder()).url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build();
    return (new Response$Builder()).request(request).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new Cache$CacheResponseBody(paramSnapshot, str1, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
  }
  
  public Cache$Entry(@NotNull Response paramResponse) {
    this.url = paramResponse.request().url();
    this.varyHeaders = Cache.Companion.varyHeaders(paramResponse);
    this.requestMethod = paramResponse.request().method();
    this.protocol = paramResponse.protocol();
    this.code = paramResponse.code();
    this.message = paramResponse.message();
    this.responseHeaders = paramResponse.headers();
    this.handshake = paramResponse.handshake();
    this.sentRequestMillis = paramResponse.sentRequestAtMillis();
    this.receivedResponseMillis = paramResponse.receivedResponseAtMillis();
  }
  
  public final void writeTo(@NotNull DiskLruCache.Editor paramEditor) throws IOException {
    long l = a ^ 0x4821C87BF13DL;
    Intrinsics.checkNotNullParameter(paramEditor, "editor");
    Closeable closeable = (Closeable)Okio.buffer(paramEditor.newSink(0));
    Throwable throwable = null;
    try {
      BufferedSink bufferedSink = (BufferedSink)closeable;
      boolean bool = false;
      bufferedSink.writeUtf8(this.url.toString()).writeByte(10);
      bufferedSink.writeUtf8(this.requestMethod).writeByte(10);
      bufferedSink.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
      byte b = 0;
      int i = this.varyHeaders.size();
      while (b < i) {
        byte b1 = b;
        b++;
        bufferedSink.writeUtf8(this.varyHeaders.name(b1)).writeUtf8(": ").writeUtf8(this.varyHeaders.value(b1)).writeByte(10);
      } 
      bufferedSink.writeUtf8((new StatusLine(this.protocol, this.code, this.message)).toString()).writeByte(10);
      bufferedSink.writeDecimalLong((this.responseHeaders.size() + 2)).writeByte(10);
      b = 0;
      i = this.responseHeaders.size();
      while (b < i) {
        byte b1 = b;
        b++;
        bufferedSink.writeUtf8(this.responseHeaders.name(b1)).writeUtf8(": ").writeUtf8(this.responseHeaders.value(b1)).writeByte(10);
      } 
      try {
        bufferedSink.writeUtf8(SENT_MILLIS).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
        bufferedSink.writeUtf8(RECEIVED_MILLIS).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
        if (isHttps()) {
          bufferedSink.writeByte(10);
          Intrinsics.checkNotNull(this.handshake);
          bufferedSink.writeUtf8(this.handshake.cipherSuite().javaName()).writeByte(10);
          writeCertList(bufferedSink, this.handshake.peerCertificates());
          writeCertList(bufferedSink, this.handshake.localCertificates());
          bufferedSink.writeUtf8(this.handshake.tlsVersion().javaName()).writeByte(10);
        } 
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(closeable, throwable);
    } 
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Cache$Entry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.lang.invoke.MethodHandles;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Headers;
import me.rerere.matrix.thirdparty.okhttp3.Protocol;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.RequestLine;
import me.rerere.matrix.thirdparty.okhttp3.internal.http.StatusLine;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2ExchangeCodec$Companion {
  private static final long a = o3.a(-8091742919010329812L, -66637216377571532L, MethodHandles.lookup().lookupClass()).a(217139511240480L);
  
  @NotNull
  public final Response.Builder readHttp2HeadersList(@NotNull Headers paramHeaders, @NotNull Protocol paramProtocol) {
    long l = a ^ 0x435482AEBB12L;
    Intrinsics.checkNotNullParameter(paramHeaders, "headerBlock");
    Intrinsics.checkNotNullParameter(paramProtocol, "protocol");
    StatusLine statusLine = null;
    Headers.Builder builder = new Headers.Builder();
    byte b = 0;
    int i = paramHeaders.size();
    while (b < i) {
      byte b1 = b;
      b++;
      String str1 = paramHeaders.name(b1);
      String str2 = paramHeaders.value(b1);
      if (Intrinsics.areEqual(str1, ":status")) {
        statusLine = StatusLine.Companion.parse(Intrinsics.stringPlus("HTTP/1.1 ", str2));
        continue;
      } 
      if (!Http2ExchangeCodec.access$getHTTP_2_SKIPPED_RESPONSE_HEADERS$cp().contains(str1))
        builder.addLenient$okhttp(str1, str2); 
    } 
    try {
      if (statusLine == null)
        throw new ProtocolException("Expected ':status' header not present"); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (new Response.Builder()).protocol(paramProtocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
  }
  
  @NotNull
  public final List http2HeadersList(@NotNull Request paramRequest) {
    long l = a ^ 0x279227A3E163L;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    Headers headers = paramRequest.headers();
    ArrayList<Header> arrayList = new ArrayList(headers.size() + 4);
    arrayList.add(new Header(Header.TARGET_METHOD, paramRequest.method()));
    arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(paramRequest.url())));
    String str = paramRequest.header("Host");
    try {
      if (str != null)
        arrayList.add(new Header(Header.TARGET_AUTHORITY, str)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    arrayList.add(new Header(Header.TARGET_SCHEME, paramRequest.url().scheme()));
    byte b = 0;
    int i = headers.size();
    while (b < i) {
      byte b1 = b;
      b++;
      Locale locale = Locale.US;
      Intrinsics.checkNotNullExpressionValue(locale, "US");
      Intrinsics.checkNotNullExpressionValue(headers.name(b1).toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
      String str1 = headers.name(b1).toLowerCase(locale);
      try {
        if (!Http2ExchangeCodec.access$getHTTP_2_SKIPPED_REQUEST_HEADERS$cp().contains(str1) || (Intrinsics.areEqual(str1, "te") && Intrinsics.areEqual(headers.value(b1), "trailers")))
          arrayList.add(new Header(str1, headers.value(b1))); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return arrayList;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2ExchangeCodec$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
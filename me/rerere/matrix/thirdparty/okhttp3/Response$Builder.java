package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.Exchange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class Response$Builder {
  @Nullable
  private String message;
  
  @Nullable
  private Response priorResponse;
  
  @NotNull
  private Headers$Builder headers;
  
  @Nullable
  private Handshake handshake;
  
  private long sentRequestAtMillis;
  
  @Nullable
  private Request request;
  
  @Nullable
  private Exchange exchange;
  
  private int code = -1;
  
  private long receivedResponseAtMillis;
  
  @Nullable
  private Response networkResponse;
  
  @Nullable
  private Protocol protocol;
  
  @Nullable
  private ResponseBody body;
  
  @Nullable
  private Response cacheResponse;
  
  private static final long a = o3.a(-9145402072055435751L, -3268150704528121236L, MethodHandles.lookup().lookupClass()).a(81162451668948L);
  
  @NotNull
  public final Headers$Builder getHeaders$okhttp() {
    return this.headers;
  }
  
  @NotNull
  public Response$Builder headers(@NotNull Headers paramHeaders) {
    long l = a ^ 0x273EC36A26B4L;
    Intrinsics.checkNotNullParameter(paramHeaders, "headers");
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setHeaders$okhttp(paramHeaders.newBuilder());
    return response$Builder1;
  }
  
  @NotNull
  public Response$Builder sentRequestAtMillis(long paramLong) {
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setSentRequestAtMillis$okhttp(paramLong);
    return response$Builder1;
  }
  
  public final void setHandshake$okhttp(@Nullable Handshake paramHandshake) {
    this.handshake = paramHandshake;
  }
  
  @Nullable
  public final Response getPriorResponse$okhttp() {
    return this.priorResponse;
  }
  
  @NotNull
  public Response$Builder body(@Nullable ResponseBody paramResponseBody) {
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setBody$okhttp(paramResponseBody);
    return response$Builder1;
  }
  
  public final void setRequest$okhttp(@Nullable Request paramRequest) {
    this.request = paramRequest;
  }
  
  @Nullable
  public final ResponseBody getBody$okhttp() {
    return this.body;
  }
  
  @Nullable
  public final Protocol getProtocol$okhttp() {
    return this.protocol;
  }
  
  public Response$Builder() {
    this.headers = new Headers$Builder();
  }
  
  @NotNull
  public Response$Builder protocol(@NotNull Protocol paramProtocol) {
    long l = a ^ 0x2AA6E123055L;
    Intrinsics.checkNotNullParameter(paramProtocol, "protocol");
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setProtocol$okhttp(paramProtocol);
    return response$Builder1;
  }
  
  public final void setExchange$okhttp(@Nullable Exchange paramExchange) {
    this.exchange = paramExchange;
  }
  
  public final void setPriorResponse$okhttp(@Nullable Response paramResponse) {
    this.priorResponse = paramResponse;
  }
  
  @Nullable
  public final Request getRequest$okhttp() {
    return this.request;
  }
  
  public final void setCode$okhttp(int paramInt) {
    this.code = paramInt;
  }
  
  public final long getSentRequestAtMillis$okhttp() {
    return this.sentRequestAtMillis;
  }
  
  @Nullable
  public final String getMessage$okhttp() {
    return this.message;
  }
  
  @NotNull
  public Response$Builder addHeader(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x50123E8296F3L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.getHeaders$okhttp().add(paramString1, paramString2);
    return response$Builder1;
  }
  
  @NotNull
  public Response build() {
    Protocol protocol;
    long l1 = a ^ 0x6531C2564AAFL;
    try {
      if (!((this.code >= 0) ? 1 : 0)) {
        boolean bool = false;
        String str = Intrinsics.stringPlus("code < 0: ", Integer.valueOf(getCode$okhttp()));
        throw new IllegalStateException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (this.request == null) {
      boolean bool = false;
      String str = "request == null";
      throw new IllegalStateException(str.toString());
    } 
    if (this.protocol == null) {
      Protocol protocol1 = this.protocol;
      boolean bool = false;
      String str = "protocol == null";
      throw new IllegalStateException(str.toString());
    } 
    if (this.message == null) {
      Protocol protocol1;
      String str4 = this.message;
      boolean bool = false;
      String str5 = "message == null";
      String str3 = str5;
      throw new IllegalStateException(str3.toString());
    } 
    Exchange exchange = this.exchange;
    long l2 = this.receivedResponseAtMillis;
    long l3 = this.sentRequestAtMillis;
    Response response1 = this.priorResponse;
    Response response2 = this.cacheResponse;
    Response response3 = this.networkResponse;
    ResponseBody responseBody = this.body;
    Headers headers = this.headers.build();
    Handshake handshake = this.handshake;
    int i = this.code;
    String str1 = this.message;
    String str2 = str1;
    return new Response((Request)protocol, (Protocol)str2, str1, i, handshake, headers, responseBody, response3, response2, response1, l3, l2, exchange);
  }
  
  @NotNull
  public Response$Builder priorResponse(@Nullable Response paramResponse) {
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.checkPriorResponse(paramResponse);
    response$Builder2.setPriorResponse$okhttp(paramResponse);
    return response$Builder1;
  }
  
  @NotNull
  public Response$Builder receivedResponseAtMillis(long paramLong) {
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setReceivedResponseAtMillis$okhttp(paramLong);
    return response$Builder1;
  }
  
  public final long getReceivedResponseAtMillis$okhttp() {
    return this.receivedResponseAtMillis;
  }
  
  @Nullable
  public final Response getCacheResponse$okhttp() {
    return this.cacheResponse;
  }
  
  public final void setBody$okhttp(@Nullable ResponseBody paramResponseBody) {
    this.body = paramResponseBody;
  }
  
  public final void setSentRequestAtMillis$okhttp(long paramLong) {
    this.sentRequestAtMillis = paramLong;
  }
  
  @NotNull
  public Response$Builder networkResponse(@Nullable Response paramResponse) {
    long l = a ^ 0x7FAAC1E4D1FFL;
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.checkSupportResponse("networkResponse", paramResponse);
    response$Builder2.setNetworkResponse$okhttp(paramResponse);
    return response$Builder1;
  }
  
  public final void setHeaders$okhttp(@NotNull Headers$Builder paramHeaders$Builder) {
    long l = a ^ 0x7873121CE415L;
    Intrinsics.checkNotNullParameter(paramHeaders$Builder, "<set-?>");
    this.headers = paramHeaders$Builder;
  }
  
  @NotNull
  public Response$Builder cacheResponse(@Nullable Response paramResponse) {
    long l = a ^ 0x1B9B96A26646L;
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.checkSupportResponse("cacheResponse", paramResponse);
    response$Builder2.setCacheResponse$okhttp(paramResponse);
    return response$Builder1;
  }
  
  public final void setNetworkResponse$okhttp(@Nullable Response paramResponse) {
    this.networkResponse = paramResponse;
  }
  
  public Response$Builder(@NotNull Response paramResponse) {
    this.request = paramResponse.request();
    this.protocol = paramResponse.protocol();
    this.code = paramResponse.code();
    this.message = paramResponse.message();
    this.handshake = paramResponse.handshake();
    this.headers = paramResponse.headers().newBuilder();
    this.body = paramResponse.body();
    this.networkResponse = paramResponse.networkResponse();
    this.cacheResponse = paramResponse.cacheResponse();
    this.priorResponse = paramResponse.priorResponse();
    this.sentRequestAtMillis = paramResponse.sentRequestAtMillis();
    this.receivedResponseAtMillis = paramResponse.receivedResponseAtMillis();
    this.exchange = paramResponse.exchange();
  }
  
  @Nullable
  public final Handshake getHandshake$okhttp() {
    return this.handshake;
  }
  
  public final int getCode$okhttp() {
    return this.code;
  }
  
  @NotNull
  public Response$Builder message(@NotNull String paramString) {
    long l = a ^ 0x22021E268A4BL;
    Intrinsics.checkNotNullParameter(paramString, "message");
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setMessage$okhttp(paramString);
    return response$Builder1;
  }
  
  @NotNull
  public Response$Builder code(int paramInt) {
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setCode$okhttp(paramInt);
    return response$Builder1;
  }
  
  public final void setReceivedResponseAtMillis$okhttp(long paramLong) {
    this.receivedResponseAtMillis = paramLong;
  }
  
  @NotNull
  public Response$Builder removeHeader(@NotNull String paramString) {
    long l = a ^ 0x164FD3872456L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.getHeaders$okhttp().removeAll(paramString);
    return response$Builder1;
  }
  
  @NotNull
  public Response$Builder request(@NotNull Request paramRequest) {
    long l = a ^ 0x7486A1C6470EL;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setRequest$okhttp(paramRequest);
    return response$Builder1;
  }
  
  @Nullable
  public final Response getNetworkResponse$okhttp() {
    return this.networkResponse;
  }
  
  public final void setMessage$okhttp(@Nullable String paramString) {
    this.message = paramString;
  }
  
  public final void setCacheResponse$okhttp(@Nullable Response paramResponse) {
    this.cacheResponse = paramResponse;
  }
  
  @Nullable
  public final Exchange getExchange$okhttp() {
    return this.exchange;
  }
  
  public final void setProtocol$okhttp(@Nullable Protocol paramProtocol) {
    this.protocol = paramProtocol;
  }
  
  @NotNull
  public Response$Builder header(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x6288257B21E2L;
    Intrinsics.checkNotNullParameter(paramString1, "name");
    Intrinsics.checkNotNullParameter(paramString2, "value");
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.getHeaders$okhttp().set(paramString1, paramString2);
    return response$Builder1;
  }
  
  public final void initExchange$okhttp(@NotNull Exchange paramExchange) {
    long l = a ^ 0x6B887AB1B3A0L;
    Intrinsics.checkNotNullParameter(paramExchange, "deferredTrailers");
    this.exchange = paramExchange;
  }
  
  @NotNull
  public Response$Builder handshake(@Nullable Handshake paramHandshake) {
    Response$Builder response$Builder1 = this;
    Response$Builder response$Builder2 = response$Builder1;
    boolean bool = false;
    response$Builder2.setHandshake$okhttp(paramHandshake);
    return response$Builder1;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Response$Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
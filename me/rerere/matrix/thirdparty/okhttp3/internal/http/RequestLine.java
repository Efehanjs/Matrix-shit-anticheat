package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.lang.invoke.MethodHandles;
import java.net.Proxy;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RequestLine {
  @NotNull
  public static final RequestLine INSTANCE;
  
  private static final long a = o3.a(-9150825122586269668L, -4284217046684091468L, MethodHandles.lookup().lookupClass()).a(128833223464122L);
  
  @NotNull
  public final String get(@NotNull Request paramRequest, @NotNull Proxy.Type paramType) {
    long l = a ^ 0x7CBAAB78195CL;
    Intrinsics.checkNotNullParameter(paramRequest, "request");
    Intrinsics.checkNotNullParameter(paramType, "proxyType");
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = stringBuilder1;
    boolean bool = false;
    try {
      stringBuilder2.append(paramRequest.method());
      stringBuilder2.append(' ');
      if (INSTANCE.includeAuthorityInRequestLine(paramRequest, paramType)) {
        stringBuilder2.append(paramRequest.url());
      } else {
        stringBuilder2.append(INSTANCE.requestPath(paramRequest.url()));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    stringBuilder2.append(" HTTP/1.1");
    Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder().apply(builderAction).toString()");
    return stringBuilder1.toString();
  }
  
  @NotNull
  public final String requestPath(@NotNull HttpUrl paramHttpUrl) {
    long l = a ^ 0x34F798758FCAL;
    Intrinsics.checkNotNullParameter(paramHttpUrl, "url");
    String str1 = paramHttpUrl.encodedPath();
    String str2 = paramHttpUrl.encodedQuery();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (str2 != null) ? (str1 + '?' + str2) : str1;
  }
  
  static {
    INSTANCE = new RequestLine();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\RequestLine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
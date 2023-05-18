package me.rerere.matrix.thirdparty.okhttp3.internal.authenticator;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.Authenticator;
import me.rerere.matrix.thirdparty.okhttp3.Challenge;
import me.rerere.matrix.thirdparty.okhttp3.Credentials;
import me.rerere.matrix.thirdparty.okhttp3.Dns;
import me.rerere.matrix.thirdparty.okhttp3.HttpUrl;
import me.rerere.matrix.thirdparty.okhttp3.Request;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.okhttp3.Route;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class JavaNetAuthenticator implements Authenticator {
  @NotNull
  private final Dns defaultDns;
  
  private static final long a = o3.a(-6047545375580803325L, -6113537385079986349L, MethodHandles.lookup().lookupClass()).a(152199918670057L);
  
  @Nullable
  public Request authenticate(@Nullable Route paramRoute, @NotNull Response paramResponse) throws IOException {
    long l = a ^ 0x6A30ADADC68AL;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    List list = paramResponse.challenges();
    Request request = paramResponse.request();
    HttpUrl httpUrl = request.url();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    boolean bool = (paramResponse.code() == 407) ? true : false;
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (((paramRoute == null) ? null : paramRoute.proxy()) == null)
        (paramRoute == null) ? null : paramRoute.proxy(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Proxy proxy = Proxy.NO_PROXY;
    for (Challenge challenge : list) {
      try {
        if (!StringsKt.equals("Basic", challenge.scheme(), true))
          continue; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        try {
          paramRoute.address();
        } catch (IOException iOException) {
          throw a(null);
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (((paramRoute == null) ? null : ((paramRoute.address() == null) ? null : paramRoute.address().dns())) == null)
          (paramRoute == null) ? null : ((paramRoute.address() == null) ? null : paramRoute.address().dns()); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      Dns dns = this.defaultDns;
      try {
        try {
          if (proxy.address() == null) {
            proxy.address();
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        InetSocketAddress inetSocketAddress = (InetSocketAddress)proxy.address();
        Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
        Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
      } catch (IOException iOException) {
        throw a(null);
      } 
      PasswordAuthentication passwordAuthentication = bool ? Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), connectToInetAddress(proxy, httpUrl, dns), inetSocketAddress.getPort(), httpUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrl.url(), Authenticator.RequestorType.PROXY) : Authenticator.requestPasswordAuthentication(httpUrl.host(), connectToInetAddress(proxy, httpUrl, dns), httpUrl.port(), httpUrl.scheme(), challenge.realm(), challenge.scheme(), httpUrl.url(), Authenticator.RequestorType.SERVER);
      if (passwordAuthentication != null) {
        try {
        
        } catch (IOException iOException) {
          throw a(null);
        } 
        String str1 = bool ? "Proxy-Authorization" : "Authorization";
        String str3 = passwordAuthentication.getUserName();
        Intrinsics.checkNotNullExpressionValue(str3, "auth.userName");
        char[] arrayOfChar = passwordAuthentication.getPassword();
        Intrinsics.checkNotNullExpressionValue(arrayOfChar, "auth.password");
        String str2 = Credentials.basic(str3, new String(arrayOfChar), challenge.charset());
        return request.newBuilder().header(str1, str2).build();
      } 
    } 
    return null;
  }
  
  public JavaNetAuthenticator(@NotNull Dns paramDns) {
    this.defaultDns = paramDns;
  }
  
  public JavaNetAuthenticator() {
    this(null, 1, null);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\authenticator\JavaNetAuthenticator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
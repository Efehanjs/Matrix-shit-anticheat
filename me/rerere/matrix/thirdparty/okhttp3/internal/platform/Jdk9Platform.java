package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.SuppressSignatureCheck;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class Jdk9Platform extends Platform {
  @NotNull
  public static final Jdk9Platform$Companion Companion;
  
  private static final boolean isAvailable;
  
  private static final long a = o3.a(-6035230175047535016L, -4810269567313609021L, MethodHandles.lookup().lookupClass()).a(18404218826401L);
  
  static {
    long l = a ^ 0x9DACD3548D5L;
    Companion = new Jdk9Platform$Companion(null);
    String str = System.getProperty("java.specification.version");
    try {
    
    } catch (NoSuchMethodException noSuchMethodException) {
      throw a(null);
    } 
    Integer integer = (str == null) ? null : StringsKt.toIntOrNull(str);
    try {
      if (integer != null) {
        try {
        
        } catch (NoSuchMethodException noSuchMethodException) {
          throw a(null);
        } 
      } else {
        boolean bool;
        try {
          SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
          bool = true;
        } catch (NoSuchMethodException noSuchMethodException) {
          bool = false;
        } 
      } 
    } catch (NoSuchMethodException noSuchMethodException) {
      throw a(null);
    } 
    isAvailable = bool;
  }
  
  @Nullable
  public X509TrustManager trustManager(@NotNull SSLSocketFactory paramSSLSocketFactory) {
    long l = a ^ 0x23FA57BE7FF0L;
    Intrinsics.checkNotNullParameter(paramSSLSocketFactory, "sslSocketFactory");
    throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
  }
  
  @SuppressSignatureCheck
  @Nullable
  public String getSelectedProtocol(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x67526A03158EL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    try {
      String str = paramSSLSocket.getApplicationProtocol();
      try {
      
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      try {
      
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      return ((str == null) ? true : Intrinsics.areEqual(str, "")) ? null : str;
    } catch (UnsupportedOperationException unsupportedOperationException) {
      return null;
    } 
  }
  
  @SuppressSignatureCheck
  public void configureTlsExtensions(@NotNull SSLSocket paramSSLSocket, @Nullable String paramString, @NotNull List paramList) {
    long l = a ^ 0x4F011F25E96AL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    Intrinsics.checkNotNullParameter(paramList, "protocols");
    SSLParameters sSLParameters = paramSSLSocket.getSSLParameters();
    List list1 = Platform.Companion.alpnProtocolNames(paramList);
    List list2 = list1;
    boolean bool = false;
    List list3 = list2;
    try {
      if (list3.toArray((Object[])new String[0]) == null) {
        list3.toArray((Object[])new String[0]);
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    list3.toArray((Object[])new String[0]).setApplicationProtocols((String[])list3.toArray((Object[])new String[0]));
    paramSSLSocket.setSSLParameters(sSLParameters);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Jdk9Platform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
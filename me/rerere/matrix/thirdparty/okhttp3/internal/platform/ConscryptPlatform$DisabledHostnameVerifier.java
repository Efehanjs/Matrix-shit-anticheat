package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.conscrypt.ConscryptHostnameVerifier;

public final class ConscryptPlatform$DisabledHostnameVerifier implements ConscryptHostnameVerifier {
  @NotNull
  public static final ConscryptPlatform$DisabledHostnameVerifier INSTANCE = new ConscryptPlatform$DisabledHostnameVerifier();
  
  public final boolean verify(@Nullable String paramString, @Nullable SSLSession paramSSLSession) {
    return true;
  }
  
  public boolean verify(@Nullable X509Certificate[] paramArrayOfX509Certificate, @Nullable String paramString, @Nullable SSLSession paramSSLSession) {
    return true;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\ConscryptPlatform$DisabledHostnameVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
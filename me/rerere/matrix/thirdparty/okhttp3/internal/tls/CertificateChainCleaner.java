package me.rerere.matrix.thirdparty.okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class CertificateChainCleaner {
  @NotNull
  public static final CertificateChainCleaner$Companion Companion = new CertificateChainCleaner$Companion(null);
  
  @NotNull
  public abstract List clean(@NotNull List paramList, @NotNull String paramString) throws SSLPeerUnverifiedException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\tls\CertificateChainCleaner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface TrustRootIndex {
  @Nullable
  X509Certificate findByIssuerAndSignature(@NotNull X509Certificate paramX509Certificate);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\tls\TrustRootIndex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
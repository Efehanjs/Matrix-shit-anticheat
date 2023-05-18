package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public enum TlsVersion {
  TLS_1_2,
  TLS_1_0,
  SSL_3_0,
  TLS_1_3("TLSv1.3"),
  TLS_1_1("TLSv1.3");
  
  @NotNull
  public static final TlsVersion$Companion Companion;
  
  @NotNull
  private final String javaName;
  
  TlsVersion(String paramString1) {
    this.javaName = paramString1;
  }
  
  @NotNull
  public static final TlsVersion forJavaName(@NotNull String paramString) {
    return Companion.forJavaName(paramString);
  }
  
  @NotNull
  public final String javaName() {
    return this.javaName;
  }
  
  static {
    TLS_1_2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
    TLS_1_1 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
    TLS_1_0 = new TlsVersion("TLS_1_0", 3, "TLSv1");
    SSL_3_0 = new TlsVersion("SSL_3_0", 4, "SSLv3");
    $VALUES = $values();
    Companion = new TlsVersion$Companion(null);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "javaName", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_javaName() {
    return this.javaName;
  }
  
  static {
    long l = o3.a(975374181825682159L, -4960393370687298715L, MethodHandles.lookup().lookupClass()).a(191110748411508L) ^ 0x61BEABCDC1AAL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\TlsVersion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
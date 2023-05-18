package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public enum Protocol {
  HTTP_1_0("http/1.0"),
  SPDY_3("http/1.0"),
  H2_PRIOR_KNOWLEDGE("http/1.0"),
  QUIC("http/1.0"),
  HTTP_1_1("http/1.1"),
  HTTP_2("http/1.1");
  
  @NotNull
  private final String protocol;
  
  @NotNull
  public static final Protocol$Companion Companion;
  
  Protocol(String paramString1) {
    this.protocol = paramString1;
  }
  
  static {
    SPDY_3 = new Protocol("SPDY_3", 2, "spdy/3.1");
    HTTP_2 = new Protocol("HTTP_2", 3, "h2");
    H2_PRIOR_KNOWLEDGE = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
    QUIC = new Protocol("QUIC", 5, "quic");
    $VALUES = $values();
    Companion = new Protocol$Companion(null);
  }
  
  @NotNull
  public String toString() {
    return this.protocol;
  }
  
  @NotNull
  public static final Protocol get(@NotNull String paramString) throws IOException {
    return Companion.get(paramString);
  }
  
  static {
    long l = o3.a(-1691785677191045412L, 6638084939667358211L, MethodHandles.lookup().lookupClass()).a(233673202772793L) ^ 0x20CF5E21A6C1L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Protocol.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
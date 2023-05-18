package me.rerere.matrix.thirdparty.okhttp3;

import java.net.UnknownHostException;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface Dns {
  @JvmField
  @NotNull
  public static final Dns SYSTEM;
  
  @NotNull
  public static final Dns$Companion Companion = Dns$Companion.$$INSTANCE;
  
  @NotNull
  List lookup(@NotNull String paramString) throws UnknownHostException;
  
  static {
    SYSTEM = new Dns$Companion$DnsSystem();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Dns.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
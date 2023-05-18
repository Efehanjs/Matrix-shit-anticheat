package me.rerere.matrix.thirdparty.okhttp3;

import java.io.IOException;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.okhttp3.internal.authenticator.JavaNetAuthenticator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public interface Authenticator {
  @NotNull
  public static final Authenticator$Companion Companion = Authenticator$Companion.$$INSTANCE;
  
  @JvmField
  @NotNull
  public static final Authenticator NONE = new Authenticator$Companion$AuthenticatorNone();
  
  @JvmField
  @NotNull
  public static final Authenticator JAVA_NET_AUTHENTICATOR = (Authenticator)new JavaNetAuthenticator(null, 1, null);
  
  @Nullable
  Request authenticate(@Nullable Route paramRoute, @NotNull Response paramResponse) throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Authenticator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
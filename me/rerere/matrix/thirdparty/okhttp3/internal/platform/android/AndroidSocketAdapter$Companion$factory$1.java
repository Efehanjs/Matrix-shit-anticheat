package me.rerere.matrix.thirdparty.okhttp3.internal.platform.android;

import java.lang.invoke.MethodHandles;
import javax.net.ssl.SSLSocket;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AndroidSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter$Factory {
  private static final long a = o3.a(9052083832263277034L, 1117462893737437956L, MethodHandles.lookup().lookupClass()).a(250023011026588L);
  
  public boolean matchesSocket(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x4F6470D152BCL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    String str = paramSSLSocket.getClass().getName();
    Intrinsics.checkNotNullExpressionValue(str, "sslSocket.javaClass.name");
    return StringsKt.startsWith$default(str, Intrinsics.stringPlus(this.$packageName, "."), false, 2, null);
  }
  
  public AndroidSocketAdapter$Companion$factory$1(String paramString) {}
  
  @NotNull
  public SocketAdapter create(@NotNull SSLSocket paramSSLSocket) {
    long l = a ^ 0x2215B030DA4DL;
    Intrinsics.checkNotNullParameter(paramSSLSocket, "sslSocket");
    return AndroidSocketAdapter$Companion.access$build(AndroidSocketAdapter.Companion, paramSSLSocket.getClass());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\android\AndroidSocketAdapter$Companion$factory$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
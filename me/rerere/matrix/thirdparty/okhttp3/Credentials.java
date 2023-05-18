package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Credentials {
  @NotNull
  public static final Credentials INSTANCE;
  
  private static final long a = o3.a(300187037097647714L, -424201569176362887L, MethodHandles.lookup().lookupClass()).a(125649316975403L);
  
  static {
    INSTANCE = new Credentials();
  }
  
  @JvmOverloads
  @NotNull
  public static final String basic(@NotNull String paramString1, @NotNull String paramString2, @NotNull Charset paramCharset) {
    long l = a ^ 0x4CFE133F2F55L;
    Intrinsics.checkNotNullParameter(paramString1, "username");
    Intrinsics.checkNotNullParameter(paramString2, "password");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    String str1 = paramString1 + ':' + paramString2;
    String str2 = ByteString.Companion.encodeString(str1, paramCharset).base64();
    return Intrinsics.stringPlus("Basic ", str2);
  }
  
  @JvmOverloads
  @NotNull
  public static final String basic(@NotNull String paramString1, @NotNull String paramString2) {
    long l = a ^ 0x372935DC64EL;
    Intrinsics.checkNotNullParameter(paramString1, "username");
    Intrinsics.checkNotNullParameter(paramString2, "password");
    return basic$default(paramString1, paramString2, null, 4, null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Credentials.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
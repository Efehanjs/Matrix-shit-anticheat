package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Authenticator$Companion$AuthenticatorNone implements Authenticator {
  private static final long a = o3.a(1521433666158338402L, 373378241826733269L, MethodHandles.lookup().lookupClass()).a(205971880179791L);
  
  @Nullable
  public Request authenticate(@Nullable Route paramRoute, @NotNull Response paramResponse) {
    long l = a ^ 0x60097E599E5BL;
    Intrinsics.checkNotNullParameter(paramResponse, "response");
    return null;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Authenticator$Companion$AuthenticatorNone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
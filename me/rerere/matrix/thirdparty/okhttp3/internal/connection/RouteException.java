package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.ExceptionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RouteException extends RuntimeException {
  @NotNull
  private IOException lastConnectException;
  
  @NotNull
  private final IOException firstConnectException;
  
  private static final long a = o3.a(698488085693228544L, 7135813063643357479L, MethodHandles.lookup().lookupClass()).a(110449920589967L);
  
  public RouteException(@NotNull IOException paramIOException) {
    super(paramIOException);
    this.firstConnectException = paramIOException;
    this.lastConnectException = this.firstConnectException;
  }
  
  public final void addConnectException(@NotNull IOException paramIOException) {
    Intrinsics.checkNotNullParameter(paramIOException, "e");
    ExceptionsKt.addSuppressed(this.firstConnectException, paramIOException);
    this.lastConnectException = paramIOException;
  }
  
  @NotNull
  public final IOException getFirstConnectException() {
    return this.firstConnectException;
  }
  
  @NotNull
  public final IOException getLastConnectException() {
    return this.lastConnectException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RouteException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
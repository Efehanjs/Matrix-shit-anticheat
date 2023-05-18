package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class ForwardingSource implements Source {
  @NotNull
  private final Source delegate;
  
  private static final long b = o3.a(6310125023648211499L, -8137805794264993955L, MethodHandles.lookup().lookupClass()).a(25868574288970L);
  
  @NotNull
  public String toString() {
    return getClass().getSimpleName() + '(' + this.delegate + ')';
  }
  
  public ForwardingSource(@NotNull Source paramSource) {
    this.delegate = paramSource;
  }
  
  @NotNull
  public final Source delegate() {
    return this.delegate;
  }
  
  public void close() throws IOException {
    this.delegate.close();
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = b ^ 0x3B9F81166B34L;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    return this.delegate.read(paramBuffer, paramLong);
  }
  
  @NotNull
  public Timeout timeout() {
    return this.delegate.timeout();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Source -deprecated_delegate() {
    return this.delegate;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\ForwardingSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class ForwardingSink implements Sink {
  @NotNull
  private final Sink delegate;
  
  private static final long b = o3.a(-9137820169798046734L, -5246454920228295292L, MethodHandles.lookup().lookupClass()).a(213004842252493L);
  
  @NotNull
  public Timeout timeout() {
    return this.delegate.timeout();
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) throws IOException {
    long l = b ^ 0x4A17A2F76434L;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    this.delegate.write(paramBuffer, paramLong);
  }
  
  public void close() throws IOException {
    this.delegate.close();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Sink -deprecated_delegate() {
    return this.delegate;
  }
  
  public void flush() throws IOException {
    this.delegate.flush();
  }
  
  public ForwardingSink(@NotNull Sink paramSink) {
    this.delegate = paramSink;
  }
  
  @NotNull
  public final Sink delegate() {
    return this.delegate;
  }
  
  @NotNull
  public String toString() {
    return getClass().getSimpleName() + '(' + this.delegate + ')';
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\ForwardingSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
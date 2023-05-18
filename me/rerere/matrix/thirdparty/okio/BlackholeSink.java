package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class BlackholeSink implements Sink {
  private static final long a = o3.a(3288359232870035050L, 1526992010382601446L, MethodHandles.lookup().lookupClass()).a(99167955479227L);
  
  public void close() {}
  
  public void flush() {}
  
  @NotNull
  public Timeout timeout() {
    return Timeout.NONE;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x218CC6E023FEL;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    paramBuffer.skip(paramLong);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\BlackholeSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
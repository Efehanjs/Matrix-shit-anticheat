package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class -GzipSinkExtensions {
  private static final long a = o3.a(7894148454912209156L, 8117071537102879083L, MethodHandles.lookup().lookupClass()).a(222549023087664L);
  
  @NotNull
  public static final GzipSink gzip(@NotNull Sink paramSink) {
    long l = a ^ 0x158DAC495523L;
    Intrinsics.checkNotNullParameter(paramSink, "<this>");
    boolean bool = false;
    return new GzipSink(paramSink);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\-GzipSinkExtensions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.zip.Deflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class -DeflaterSinkExtensions {
  private static final long a = o3.a(-7345078021924337617L, 7438353198855184129L, MethodHandles.lookup().lookupClass()).a(91681992019269L);
  
  @NotNull
  public static final DeflaterSink deflate(@NotNull Sink paramSink, @NotNull Deflater paramDeflater) {
    long l = a ^ 0x64D2AF27683EL;
    Intrinsics.checkNotNullParameter(paramSink, "<this>");
    Intrinsics.checkNotNullParameter(paramDeflater, "deflater");
    boolean bool = false;
    return new DeflaterSink(paramSink, paramDeflater);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\-DeflaterSinkExtensions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
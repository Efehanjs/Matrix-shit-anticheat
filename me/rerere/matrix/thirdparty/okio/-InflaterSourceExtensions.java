package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.zip.Inflater;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class -InflaterSourceExtensions {
  private static final long a = o3.a(-4494875994994499706L, 4589495031275045508L, MethodHandles.lookup().lookupClass()).a(179581989790036L);
  
  @NotNull
  public static final InflaterSource inflate(@NotNull Source paramSource, @NotNull Inflater paramInflater) {
    long l = a ^ 0x4650C1F17B97L;
    Intrinsics.checkNotNullParameter(paramSource, "<this>");
    Intrinsics.checkNotNullParameter(paramInflater, "inflater");
    boolean bool = false;
    return new InflaterSource(paramSource, paramInflater);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\-InflaterSourceExtensions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
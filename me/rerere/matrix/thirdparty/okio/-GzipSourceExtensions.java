package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class -GzipSourceExtensions {
  private static final int FCOMMENT = 4;
  
  private static final int FEXTRA = 2;
  
  private static final byte SECTION_BODY = 1;
  
  private static final int FHCRC = 1;
  
  private static final byte SECTION_DONE = 3;
  
  private static final byte SECTION_HEADER = 0;
  
  private static final byte SECTION_TRAILER = 2;
  
  private static final int FNAME = 3;
  
  private static final long a = o3.a(-6981849800454356835L, -1800737340179076209L, MethodHandles.lookup().lookupClass()).a(112493334822762L);
  
  @NotNull
  public static final GzipSource gzip(@NotNull Source paramSource) {
    long l = a ^ 0x483C14D53C91L;
    Intrinsics.checkNotNullParameter(paramSource, "<this>");
    boolean bool = false;
    return new GzipSource(paramSource);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\-GzipSourceExtensions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
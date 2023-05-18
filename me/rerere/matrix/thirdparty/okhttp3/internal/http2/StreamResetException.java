package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class StreamResetException extends IOException {
  @JvmField
  @NotNull
  public final ErrorCode errorCode;
  
  private static final long a = o3.a(771762885087590048L, 6747724411581048720L, MethodHandles.lookup().lookupClass()).a(184155104009675L);
  
  public StreamResetException(@NotNull ErrorCode paramErrorCode) {
    super(Intrinsics.stringPlus("stream was reset: ", paramErrorCode));
    this.errorCode = paramErrorCode;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\StreamResetException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
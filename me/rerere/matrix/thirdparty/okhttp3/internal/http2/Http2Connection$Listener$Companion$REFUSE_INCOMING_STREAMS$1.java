package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection$Listener {
  private static final long a = o3.a(5919145402496208903L, 1778818487759896249L, MethodHandles.lookup().lookupClass()).a(269887297924218L);
  
  public void onStream(@NotNull Http2Stream paramHttp2Stream) throws IOException {
    long l = a ^ 0x6D68EE3BCC60L;
    Intrinsics.checkNotNullParameter(paramHttp2Stream, "stream");
    paramHttp2Stream.close(ErrorCode.REFUSED_STREAM, null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
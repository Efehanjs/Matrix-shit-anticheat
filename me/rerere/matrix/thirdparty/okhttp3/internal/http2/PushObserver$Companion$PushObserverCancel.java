package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class PushObserver$Companion$PushObserverCancel implements PushObserver {
  private static final long a = o3.a(-3636407491338796041L, -198203833551547228L, MethodHandles.lookup().lookupClass()).a(269054226067124L);
  
  public boolean onRequest(int paramInt, @NotNull List paramList) {
    long l = a ^ 0x30FE6EB1AEE5L;
    Intrinsics.checkNotNullParameter(paramList, "requestHeaders");
    return true;
  }
  
  public void onReset(int paramInt, @NotNull ErrorCode paramErrorCode) {
    long l = a ^ 0x11079A10DB64L;
    Intrinsics.checkNotNullParameter(paramErrorCode, "errorCode");
  }
  
  public boolean onHeaders(int paramInt, @NotNull List paramList, boolean paramBoolean) {
    long l = a ^ 0x5B12811D7356L;
    Intrinsics.checkNotNullParameter(paramList, "responseHeaders");
    return true;
  }
  
  public boolean onData(int paramInt1, @NotNull BufferedSource paramBufferedSource, int paramInt2, boolean paramBoolean) throws IOException {
    long l = a ^ 0x219DA155A6E8L;
    Intrinsics.checkNotNullParameter(paramBufferedSource, "source");
    paramBufferedSource.skip(paramInt2);
    return true;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\PushObserver$Companion$PushObserverCancel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
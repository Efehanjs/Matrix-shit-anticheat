package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface PushObserver {
  @JvmField
  @NotNull
  public static final PushObserver CANCEL;
  
  @NotNull
  public static final PushObserver$Companion Companion = PushObserver$Companion.$$INSTANCE;
  
  static {
    CANCEL = new PushObserver$Companion$PushObserverCancel();
  }
  
  boolean onRequest(int paramInt, @NotNull List paramList);
  
  void onReset(int paramInt, @NotNull ErrorCode paramErrorCode);
  
  boolean onData(int paramInt1, @NotNull BufferedSource paramBufferedSource, int paramInt2, boolean paramBoolean) throws IOException;
  
  boolean onHeaders(int paramInt, @NotNull List paramList, boolean paramBoolean);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\PushObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
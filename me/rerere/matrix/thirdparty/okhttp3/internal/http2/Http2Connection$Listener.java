package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public abstract class Http2Connection$Listener {
  @NotNull
  public static final Http2Connection$Listener$Companion Companion;
  
  @JvmField
  @NotNull
  public static final Http2Connection$Listener REFUSE_INCOMING_STREAMS;
  
  private static final long b = o3.a(4831723061964313876L, -1749586269110375690L, MethodHandles.lookup().lookupClass()).a(36919002859878L);
  
  public void onSettings(@NotNull Http2Connection paramHttp2Connection, @NotNull Settings paramSettings) {
    long l = b ^ 0x32FB855EABB7L;
    Intrinsics.checkNotNullParameter(paramHttp2Connection, "connection");
    Intrinsics.checkNotNullParameter(paramSettings, "settings");
  }
  
  public abstract void onStream(@NotNull Http2Stream paramHttp2Stream) throws IOException;
  
  static {
    Companion = new Http2Connection$Listener$Companion(null);
    REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2Connection$Listener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
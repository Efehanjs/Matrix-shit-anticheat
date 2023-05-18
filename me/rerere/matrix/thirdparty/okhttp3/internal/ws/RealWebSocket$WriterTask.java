package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.Task;

public final class RealWebSocket$WriterTask extends Task {
  private static final long b = o3.a(-8943303167432998445L, -5539924948112913290L, MethodHandles.lookup().lookupClass()).a(38796071970069L);
  
  public long runOnce() {
    try {
      try {
        if (RealWebSocket.this.writeOneFrame$okhttp())
          return 0L; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (IOException iOException) {
      RealWebSocket.this.failWebSocket(iOException, null);
    } 
    return -1L;
  }
  
  public RealWebSocket$WriterTask() {
    super(Intrinsics.stringPlus(RealWebSocket.access$getName$p(paramRealWebSocket), " writer"), false, 2, null);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\RealWebSocket$WriterTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealCall$CallReference extends WeakReference {
  @Nullable
  private final Object callStackTrace;
  
  private static final long a = o3.a(7504116371104927383L, 8403946538036255814L, MethodHandles.lookup().lookupClass()).a(40419257884432L);
  
  public RealCall$CallReference(@NotNull RealCall paramRealCall, @Nullable Object paramObject) {
    super((T)paramRealCall);
    this.callStackTrace = paramObject;
  }
  
  @Nullable
  public final Object getCallStackTrace() {
    return this.callStackTrace;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealCall$CallReference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
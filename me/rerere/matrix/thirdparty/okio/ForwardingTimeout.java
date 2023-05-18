package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class ForwardingTimeout extends Timeout {
  @NotNull
  private Timeout delegate;
  
  private static final long a = o3.a(3936851087843975741L, 4219025138771378098L, MethodHandles.lookup().lookupClass()).a(37607554745984L);
  
  public ForwardingTimeout(@NotNull Timeout paramTimeout) {
    this.delegate = paramTimeout;
  }
  
  @NotNull
  public final Timeout delegate() {
    return this.delegate;
  }
  
  public long deadlineNanoTime() {
    return this.delegate.deadlineNanoTime();
  }
  
  public boolean hasDeadline() {
    return this.delegate.hasDeadline();
  }
  
  @NotNull
  public Timeout clearDeadline() {
    return this.delegate.clearDeadline();
  }
  
  @NotNull
  public Timeout clearTimeout() {
    return this.delegate.clearTimeout();
  }
  
  @NotNull
  public Timeout timeout(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = a ^ 0x1A992D600E44L;
    Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    return this.delegate.timeout(paramLong, paramTimeUnit);
  }
  
  public long timeoutNanos() {
    return this.delegate.timeoutNanos();
  }
  
  public void throwIfReached() throws IOException {
    this.delegate.throwIfReached();
  }
  
  @NotNull
  public final ForwardingTimeout setDelegate(@NotNull Timeout paramTimeout) {
    long l = a ^ 0x519545875D4DL;
    Intrinsics.checkNotNullParameter(paramTimeout, "delegate");
    this.delegate = paramTimeout;
    return this;
  }
  
  @NotNull
  public Timeout deadlineNanoTime(long paramLong) {
    return this.delegate.deadlineNanoTime(paramLong);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\ForwardingTimeout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
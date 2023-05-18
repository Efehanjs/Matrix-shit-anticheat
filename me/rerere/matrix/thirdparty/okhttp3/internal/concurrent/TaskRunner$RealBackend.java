package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TaskRunner$RealBackend implements TaskRunner$Backend {
  @NotNull
  private final ThreadPoolExecutor executor;
  
  private static final long a = o3.a(-1137217886248464640L, -8594198625881233555L, MethodHandles.lookup().lookupClass()).a(268011816749749L);
  
  public final void shutdown() {
    this.executor.shutdown();
  }
  
  public void execute(@NotNull Runnable paramRunnable) {
    long l = a ^ 0x4C828D25628CL;
    Intrinsics.checkNotNullParameter(paramRunnable, "runnable");
    this.executor.execute(paramRunnable);
  }
  
  public void coordinatorNotify(@NotNull TaskRunner paramTaskRunner) {
    long l = a ^ 0x370F89508205L;
    Intrinsics.checkNotNullParameter(paramTaskRunner, "taskRunner");
    TaskRunner taskRunner = paramTaskRunner;
    boolean bool = false;
    taskRunner.notify();
  }
  
  public long nanoTime() {
    return System.nanoTime();
  }
  
  public void coordinatorWait(@NotNull TaskRunner paramTaskRunner, long paramLong) throws InterruptedException {
    long l1 = a ^ 0x54DB6BAE4176L;
    Intrinsics.checkNotNullParameter(paramTaskRunner, "taskRunner");
    long l2 = paramLong / 1000000L;
    long l3 = paramLong - l2 * 1000000L;
    try {
      if (l2 <= 0L) {
        try {
          if (paramLong > 0L) {
            paramTaskRunner.wait(l2, (int)l3);
            return;
          } 
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
        return;
      } 
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    paramTaskRunner.wait(l2, (int)l3);
  }
  
  public void beforeTask(@NotNull TaskRunner paramTaskRunner) {
    long l = a ^ 0x7E8B69DF2818L;
    Intrinsics.checkNotNullParameter(paramTaskRunner, "taskRunner");
  }
  
  public TaskRunner$RealBackend(@NotNull ThreadFactory paramThreadFactory) {
    this.executor = new ThreadPoolExecutor(0, 2147483647, 60L, TimeUnit.SECONDS, new SynchronousQueue<>(), paramThreadFactory);
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskRunner$RealBackend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.CountDownLatch;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TaskQueue$AwaitIdleTask extends Task {
  @NotNull
  private final CountDownLatch latch = new CountDownLatch(1);
  
  private static final long b = o3.a(8129496603597405969L, 1122599219621483233L, MethodHandles.lookup().lookupClass()).a(104584985429268L);
  
  @NotNull
  public final CountDownLatch getLatch() {
    return this.latch;
  }
  
  public TaskQueue$AwaitIdleTask() {
    super(Intrinsics.stringPlus(Util.okHttpName, " awaitIdle"), false);
  }
  
  public long runOnce() {
    this.latch.countDown();
    return -1L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskQueue$AwaitIdleTask.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public abstract class Task {
  @NotNull
  private final String name;
  
  private long nextExecuteNanoTime;
  
  @Nullable
  private TaskQueue queue;
  
  private final boolean cancelable;
  
  private static final long a = o3.a(6891852368845917453L, 8402706455274741110L, MethodHandles.lookup().lookupClass()).a(22703436128903L);
  
  public final void initQueue$okhttp(@NotNull TaskQueue paramTaskQueue) {
    long l = a ^ 0x7F7ABAB21CB6L;
    try {
      Intrinsics.checkNotNullParameter(paramTaskQueue, "queue");
      if (this.queue == paramTaskQueue)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!((this.queue == null) ? 1 : 0)) {
        boolean bool = false;
        String str = "task is in multiple queues";
        throw new IllegalStateException(str.toString());
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.queue = paramTaskQueue;
  }
  
  @NotNull
  public final String getName() {
    return this.name;
  }
  
  public final boolean getCancelable() {
    return this.cancelable;
  }
  
  public final void setNextExecuteNanoTime$okhttp(long paramLong) {
    this.nextExecuteNanoTime = paramLong;
  }
  
  public Task(@NotNull String paramString, boolean paramBoolean) {
    this.name = paramString;
    this.cancelable = paramBoolean;
    this.nextExecuteNanoTime = -1L;
  }
  
  public abstract long runOnce();
  
  public final long getNextExecuteNanoTime$okhttp() {
    return this.nextExecuteNanoTime;
  }
  
  @Nullable
  public final TaskQueue getQueue$okhttp() {
    return this.queue;
  }
  
  @NotNull
  public String toString() {
    return this.name;
  }
  
  public final void setQueue$okhttp(@Nullable TaskQueue paramTaskQueue) {
    this.queue = paramTaskQueue;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\Task.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
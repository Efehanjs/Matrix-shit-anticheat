package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class TaskRunner {
  private long coordinatorWakeUpAt;
  
  @NotNull
  private static final Logger logger;
  
  private int nextQueueName;
  
  @NotNull
  private final List readyQueues;
  
  @NotNull
  private final TaskRunner$Backend backend;
  
  private boolean coordinatorWaiting;
  
  @NotNull
  private final Runnable runnable;
  
  @JvmField
  @NotNull
  public static final TaskRunner INSTANCE;
  
  @NotNull
  private final List busyQueues;
  
  @NotNull
  public static final TaskRunner$Companion Companion;
  
  private static final long a = o3.a(-6514323014130295625L, -713613694957968187L, MethodHandles.lookup().lookupClass()).a(218895662074245L);
  
  public TaskRunner(@NotNull TaskRunner$Backend paramTaskRunner$Backend) {
    this.backend = paramTaskRunner$Backend;
    this.nextQueueName = 10000;
    this.busyQueues = new ArrayList();
    this.readyQueues = new ArrayList();
    this.runnable = new TaskRunner$runnable$1(this);
  }
  
  @NotNull
  public final List activeQueues() {
    synchronized (this) {
      boolean bool = false;
      return CollectionsKt.plus(this.busyQueues, this.readyQueues);
    } 
  }
  
  @Nullable
  public final Task awaitTaskToRun() {
    long l = a ^ 0x33245A5E932FL;
    TaskRunner taskRunner = this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(taskRunner))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner); 
        } catch (InterruptedException interruptedException) {
          throw a(null);
        }  
    } catch (InterruptedException interruptedException) {
      throw a(null);
    } 
    while (true) {
      try {
        if (this.readyQueues.isEmpty())
          return null; 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      long l1 = this.backend.nanoTime();
      long l2 = Long.MAX_VALUE;
      Task task = null;
      boolean bool1 = false;
      for (TaskQueue taskQueue : this.readyQueues) {
        Task task1 = taskQueue.getFutureTasks$okhttp().get(0);
        long l4 = 0L;
        long l5 = task1.getNextExecuteNanoTime$okhttp() - l1;
        long l3 = Math.max(l4, l5);
        if (l3 > 0L) {
          l2 = Math.min(l3, l2);
          continue;
        } 
        if (task != null) {
          bool1 = true;
          break;
        } 
        task = task1;
      } 
      try {
        if (task != null) {
          try {
            beforeRun(task);
            if (!bool1) {
              try {
                if (!this.coordinatorWaiting) {
                  try {
                  
                  } catch (InterruptedException interruptedException) {
                    throw a(null);
                  } 
                  try {
                    if (!this.readyQueues.isEmpty()) {
                      this.backend.execute(this.runnable);
                      return task;
                    } 
                  } catch (InterruptedException interruptedException) {
                    throw a(null);
                  } 
                } 
              } catch (InterruptedException interruptedException) {
                throw a(null);
              } 
              return task;
            } 
          } catch (InterruptedException interruptedException) {
            throw a(null);
          } 
        } else {
          try {
            if (this.coordinatorWaiting) {
              try {
                if (l2 < this.coordinatorWakeUpAt - l1)
                  this.backend.coordinatorNotify(this); 
              } catch (InterruptedException interruptedException) {
                throw a(null);
              } 
              return null;
            } 
          } catch (InterruptedException interruptedException) {
            throw a(null);
          } 
          this.coordinatorWaiting = true;
          this.coordinatorWakeUpAt = l1 + l2;
          try {
            this.backend.coordinatorWait(this, l2);
          } catch (InterruptedException interruptedException) {
            cancelAll();
          } finally {
            this.coordinatorWaiting = false;
          } 
          continue;
        } 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      this.backend.execute(this.runnable);
      return task;
    } 
  }
  
  static {
    long l = a ^ 0x4E964EC185D4L;
    Companion = new TaskRunner$Companion(null);
    INSTANCE = new TaskRunner(new TaskRunner$RealBackend(Util.threadFactory(Intrinsics.stringPlus(Util.okHttpName, " TaskRunner"), true)));
    Logger logger = Logger.getLogger(TaskRunner.class.getName());
    Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
    logger = logger;
  }
  
  @NotNull
  public final TaskRunner$Backend getBackend() {
    return this.backend;
  }
  
  @NotNull
  public final TaskQueue newQueue() {
    synchronized (this) {
      int j = 0;
      int k = this.nextQueueName;
      this.nextQueueName = k + 1;
      j = k;
    } 
    int i = j;
    return new TaskQueue(this, Intrinsics.stringPlus("Q", Integer.valueOf(i)));
  }
  
  public final void kickCoordinator$okhttp(@NotNull TaskQueue paramTaskQueue) {
    long l = a ^ 0x2E172DEB4002L;
    Intrinsics.checkNotNullParameter(paramTaskQueue, "taskQueue");
    TaskRunner taskRunner = this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(taskRunner))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner); 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramTaskQueue.getActiveTask$okhttp() == null) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        try {
          if (!paramTaskQueue.getFutureTasks$okhttp().isEmpty()) {
            Util.addIfAbsent(this.readyQueues, paramTaskQueue);
          } else {
            this.readyQueues.remove(paramTaskQueue);
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.coordinatorWaiting) {
        this.backend.coordinatorNotify(this);
      } else {
        this.backend.execute(this.runnable);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public final void cancelAll() {
    int i = this.busyQueues.size() - 1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        ((TaskQueue)this.busyQueues.get(j)).cancelAllAndDecide$okhttp();
      } while (0 <= i); 
    i = this.readyQueues.size() - 1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        TaskQueue taskQueue = this.readyQueues.get(j);
        taskQueue.cancelAllAndDecide$okhttp();
        if (!taskQueue.getFutureTasks$okhttp().isEmpty())
          continue; 
        this.readyQueues.remove(j);
      } while (0 <= i); 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskRunner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
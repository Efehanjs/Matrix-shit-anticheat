package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import java.lang.invoke.MethodHandles;
import java.util.logging.Level;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;

public final class TaskRunner$runnable$1 implements Runnable {
  private static final long a = o3.a(4226537520463104720L, -8678218236216203299L, MethodHandles.lookup().lookupClass()).a(65033989280442L);
  
  public void run() {
    long l = a ^ 0x2BE508503B9FL;
    while (true) {
      TaskRunner taskRunner1 = TaskRunner.this;
      TaskRunner taskRunner2 = TaskRunner.this;
      synchronized (taskRunner1) {
        boolean bool3 = false;
        Task task = taskRunner2.awaitTaskToRun();
      } 
      Task task2 = task;
      try {
        if (task2 == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Task task1 = task2;
      Intrinsics.checkNotNull(task1.getQueue$okhttp());
      TaskQueue taskQueue = task1.getQueue$okhttp();
      taskRunner1 = TaskRunner.this;
      boolean bool1 = false;
      long l1 = -1L;
      boolean bool = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
      if (bool) {
        l1 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
        TaskLoggerKt.access$log(task1, taskQueue, "starting");
      } 
      boolean bool2 = false;
      try {
        Unit unit1;
        boolean bool3 = false;
        boolean bool4 = false;
        try {
          TaskRunner.access$runTask(taskRunner1, task1);
          bool4 = true;
        } finally {
          taskRunner1.getBackend().execute(this);
        } 
        bool2 = true;
        Unit unit2 = unit1;
      } finally {
        if (bool) {
          long l2 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - l1;
          try {
            if (bool2) {
              TaskLoggerKt.access$log(task1, taskQueue, Intrinsics.stringPlus("finished run in ", TaskLoggerKt.formatDuration(l2)));
            } else {
              TaskLoggerKt.access$log(task1, taskQueue, Intrinsics.stringPlus("failed a run in ", TaskLoggerKt.formatDuration(l2)));
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } 
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskRunner$runnable$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
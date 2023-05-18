package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public interface TaskRunner$Backend {
  long nanoTime();
  
  void beforeTask(@NotNull TaskRunner paramTaskRunner);
  
  void execute(@NotNull Runnable paramRunnable);
  
  void coordinatorWait(@NotNull TaskRunner paramTaskRunner, long paramLong);
  
  void coordinatorNotify(@NotNull TaskRunner paramTaskRunner);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskRunner$Backend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
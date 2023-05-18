package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class TaskQueue {
  @NotNull
  private final String name;
  
  @NotNull
  private final TaskRunner taskRunner;
  
  private boolean cancelActiveTask;
  
  @Nullable
  private Task activeTask;
  
  private boolean shutdown;
  
  @NotNull
  private final List futureTasks;
  
  private static final long a = o3.a(1809701345116892320L, 5781880279241927687L, MethodHandles.lookup().lookupClass()).a(149370379687700L);
  
  @NotNull
  public final List getScheduledTasks() {
    synchronized (this.taskRunner) {
      boolean bool = false;
      List list = CollectionsKt.toList(getFutureTasks$okhttp());
    } 
    return list;
  }
  
  public final void schedule(@NotNull String paramString, long paramLong, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x19D272C22C78L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool = false;
    schedule(new TaskQueue$schedule$2(paramString, paramFunction0), paramLong);
  }
  
  public final void setCancelActiveTask$okhttp(boolean paramBoolean) {
    this.cancelActiveTask = paramBoolean;
  }
  
  public final boolean getShutdown$okhttp() {
    return this.shutdown;
  }
  
  public final void setShutdown$okhttp(boolean paramBoolean) {
    this.shutdown = paramBoolean;
  }
  
  @NotNull
  public final CountDownLatch idleLatch() {
    synchronized (this.taskRunner) {
      boolean bool = false;
      try {
        if (getActiveTask$okhttp() == null && getFutureTasks$okhttp().isEmpty())
          return new CountDownLatch(0); 
      } catch (RejectedExecutionException rejectedExecutionException) {
        throw a(null);
      } 
      Task task = getActiveTask$okhttp();
      if (task instanceof TaskQueue$AwaitIdleTask)
        return ((TaskQueue$AwaitIdleTask)task).getLatch(); 
      for (Task task1 : getFutureTasks$okhttp()) {
        if (task1 instanceof TaskQueue$AwaitIdleTask)
          return ((TaskQueue$AwaitIdleTask)task1).getLatch(); 
      } 
      TaskQueue$AwaitIdleTask taskQueue$AwaitIdleTask = new TaskQueue$AwaitIdleTask();
      try {
        if (scheduleAndDecide$okhttp(taskQueue$AwaitIdleTask, 0L, false))
          getTaskRunner$okhttp().kickCoordinator$okhttp(this); 
      } catch (RejectedExecutionException rejectedExecutionException) {
        throw a(null);
      } 
      return taskQueue$AwaitIdleTask.getLatch();
    } 
  }
  
  public final boolean cancelAllAndDecide$okhttp() {
    long l = a ^ 0x37FE987F2499L;
    try {
      if (this.activeTask != null)
        try {
          Intrinsics.checkNotNull(this.activeTask);
          if (this.activeTask.getCancelable())
            this.cancelActiveTask = true; 
        } catch (RejectedExecutionException rejectedExecutionException) {
          throw a(null);
        }  
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    boolean bool = false;
    int i = this.futureTasks.size() - 1;
    if (0 <= i)
      do {
        int j = i;
        i--;
        if (!((Task)this.futureTasks.get(j)).getCancelable())
          continue; 
        Task task = this.futureTasks.get(j);
        boolean bool1 = false;
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
          TaskQueue taskQueue = this;
          Task task1 = task;
          boolean bool2 = false;
          String str = "canceled";
          TaskLoggerKt.access$log(task1, taskQueue, str);
        } 
        bool = true;
        this.futureTasks.remove(j);
      } while (0 <= i); 
    return bool;
  }
  
  @NotNull
  public final TaskRunner getTaskRunner$okhttp() {
    return this.taskRunner;
  }
  
  public TaskQueue(@NotNull TaskRunner paramTaskRunner, @NotNull String paramString) {
    this.taskRunner = paramTaskRunner;
    this.name = paramString;
    this.futureTasks = new ArrayList();
  }
  
  public final boolean scheduleAndDecide$okhttp(@NotNull Task paramTask, long paramLong, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue.a : J
    //   3: ldc2_w 72401759633813
    //   6: lxor
    //   7: lstore #5
    //   9: aload_1
    //   10: ldc 'task'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: aload_0
    //   17: invokevirtual initQueue$okhttp : (Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;)V
    //   20: aload_0
    //   21: getfield taskRunner : Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskRunner;
    //   24: invokevirtual getBackend : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskRunner$Backend;
    //   27: invokeinterface nanoTime : ()J
    //   32: lstore #7
    //   34: lload #7
    //   36: lload_2
    //   37: ladd
    //   38: lstore #9
    //   40: aload_0
    //   41: getfield futureTasks : Ljava/util/List;
    //   44: aload_1
    //   45: invokeinterface indexOf : (Ljava/lang/Object;)I
    //   50: istore #11
    //   52: iload #11
    //   54: iconst_m1
    //   55: if_icmpeq -> 130
    //   58: aload_1
    //   59: invokevirtual getNextExecuteNanoTime$okhttp : ()J
    //   62: lload #9
    //   64: lcmp
    //   65: ifgt -> 118
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/util/concurrent/RejectedExecutionException;)Ljava/util/concurrent/RejectedExecutionException;
    //   74: athrow
    //   75: iconst_0
    //   76: istore #12
    //   78: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskRunner.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskRunner$Companion;
    //   81: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   84: getstatic java/util/logging/Level.FINE : Ljava/util/logging/Level;
    //   87: invokevirtual isLoggable : (Ljava/util/logging/Level;)Z
    //   90: ifeq -> 115
    //   93: aload_1
    //   94: aload_0
    //   95: astore #21
    //   97: astore #20
    //   99: iconst_0
    //   100: istore #13
    //   102: ldc 'already scheduled'
    //   104: astore #22
    //   106: aload #20
    //   108: aload #21
    //   110: aload #22
    //   112: invokestatic access$log : (Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task;Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V
    //   115: nop
    //   116: iconst_0
    //   117: ireturn
    //   118: aload_0
    //   119: getfield futureTasks : Ljava/util/List;
    //   122: iload #11
    //   124: invokeinterface remove : (I)Ljava/lang/Object;
    //   129: pop
    //   130: aload_1
    //   131: lload #9
    //   133: invokevirtual setNextExecuteNanoTime$okhttp : (J)V
    //   136: iconst_0
    //   137: istore #12
    //   139: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskRunner.Companion : Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskRunner$Companion;
    //   142: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   145: getstatic java/util/logging/Level.FINE : Ljava/util/logging/Level;
    //   148: invokevirtual isLoggable : (Ljava/util/logging/Level;)Z
    //   151: ifeq -> 213
    //   154: aload_1
    //   155: aload_0
    //   156: astore #21
    //   158: astore #20
    //   160: iconst_0
    //   161: istore #13
    //   163: iload #4
    //   165: ifeq -> 188
    //   168: ldc 'run again after '
    //   170: lload #9
    //   172: lload #7
    //   174: lsub
    //   175: invokestatic formatDuration : (J)Ljava/lang/String;
    //   178: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   181: goto -> 201
    //   184: invokestatic a : (Ljava/util/concurrent/RejectedExecutionException;)Ljava/util/concurrent/RejectedExecutionException;
    //   187: athrow
    //   188: ldc 'scheduled after '
    //   190: lload #9
    //   192: lload #7
    //   194: lsub
    //   195: invokestatic formatDuration : (J)Ljava/lang/String;
    //   198: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   201: nop
    //   202: astore #22
    //   204: aload #20
    //   206: aload #21
    //   208: aload #22
    //   210: invokestatic access$log : (Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task;Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V
    //   213: nop
    //   214: aload_0
    //   215: getfield futureTasks : Ljava/util/List;
    //   218: astore #13
    //   220: iconst_0
    //   221: istore #14
    //   223: iconst_0
    //   224: istore #15
    //   226: aload #13
    //   228: invokeinterface iterator : ()Ljava/util/Iterator;
    //   233: astore #16
    //   235: aload #16
    //   237: invokeinterface hasNext : ()Z
    //   242: ifeq -> 304
    //   245: aload #16
    //   247: invokeinterface next : ()Ljava/lang/Object;
    //   252: astore #17
    //   254: aload #17
    //   256: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task
    //   259: astore #18
    //   261: iconst_0
    //   262: istore #19
    //   264: aload #18
    //   266: invokevirtual getNextExecuteNanoTime$okhttp : ()J
    //   269: lload #7
    //   271: lsub
    //   272: lload_2
    //   273: lcmp
    //   274: ifle -> 285
    //   277: iconst_1
    //   278: goto -> 286
    //   281: invokestatic a : (Ljava/util/concurrent/RejectedExecutionException;)Ljava/util/concurrent/RejectedExecutionException;
    //   284: athrow
    //   285: iconst_0
    //   286: ifeq -> 298
    //   289: iload #15
    //   291: goto -> 305
    //   294: invokestatic a : (Ljava/util/concurrent/RejectedExecutionException;)Ljava/util/concurrent/RejectedExecutionException;
    //   297: athrow
    //   298: iinc #15, 1
    //   301: goto -> 235
    //   304: iconst_m1
    //   305: istore #12
    //   307: iload #12
    //   309: iconst_m1
    //   310: if_icmpne -> 324
    //   313: aload_0
    //   314: getfield futureTasks : Ljava/util/List;
    //   317: invokeinterface size : ()I
    //   322: istore #12
    //   324: aload_0
    //   325: getfield futureTasks : Ljava/util/List;
    //   328: iload #12
    //   330: aload_1
    //   331: invokeinterface add : (ILjava/lang/Object;)V
    //   336: iload #12
    //   338: ifne -> 349
    //   341: iconst_1
    //   342: goto -> 350
    //   345: invokestatic a : (Ljava/util/concurrent/RejectedExecutionException;)Ljava/util/concurrent/RejectedExecutionException;
    //   348: athrow
    //   349: iconst_0
    //   350: ireturn
    // Exception table:
    //   from	to	target	type
    //   52	68	71	java/util/concurrent/RejectedExecutionException
    //   163	184	184	java/util/concurrent/RejectedExecutionException
    //   264	281	281	java/util/concurrent/RejectedExecutionException
    //   286	294	294	java/util/concurrent/RejectedExecutionException
    //   324	345	345	java/util/concurrent/RejectedExecutionException
  }
  
  public final void cancelAll() {
    long l = a ^ 0x5AEEEE7C49F7L;
    TaskQueue taskQueue = this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(taskQueue))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + taskQueue); 
        } catch (RejectedExecutionException rejectedExecutionException) {
          throw a(null);
        }  
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    synchronized (this.taskRunner) {
      boolean bool1 = false;
      try {
        if (cancelAllAndDecide$okhttp())
          getTaskRunner$okhttp().kickCoordinator$okhttp(this); 
      } catch (RejectedExecutionException rejectedExecutionException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  @NotNull
  public String toString() {
    return this.name;
  }
  
  @NotNull
  public final String getName$okhttp() {
    return this.name;
  }
  
  public final boolean getCancelActiveTask$okhttp() {
    return this.cancelActiveTask;
  }
  
  public final void schedule(@NotNull Task paramTask, long paramLong) {
    long l = a ^ 0x3717B59BD71CL;
    Intrinsics.checkNotNullParameter(paramTask, "task");
    synchronized (this.taskRunner) {
      boolean bool = false;
      try {
        if (getShutdown$okhttp()) {
          if (paramTask.getCancelable()) {
            boolean bool2 = false;
            if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
              TaskQueue taskQueue = this;
              Task task = paramTask;
              boolean bool3 = false;
              String str = "schedule canceled (queue is shutdown)";
              TaskLoggerKt.access$log(task, taskQueue, str);
            } 
            return;
          } 
          boolean bool1 = false;
          if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskQueue taskQueue = this;
            Task task = paramTask;
            boolean bool2 = false;
            String str = "schedule failed (queue is shutdown)";
            TaskLoggerKt.access$log(task, taskQueue, str);
          } 
          throw new RejectedExecutionException();
        } 
      } catch (RejectedExecutionException rejectedExecutionException) {
        throw a(null);
      } 
      try {
        if (scheduleAndDecide$okhttp(paramTask, paramLong, false))
          getTaskRunner$okhttp().kickCoordinator$okhttp(this); 
      } catch (RejectedExecutionException rejectedExecutionException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  @Nullable
  public final Task getActiveTask$okhttp() {
    return this.activeTask;
  }
  
  @NotNull
  public final List getFutureTasks$okhttp() {
    return this.futureTasks;
  }
  
  public final void shutdown() {
    long l = a ^ 0x2A7ADA215061L;
    TaskQueue taskQueue = this;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (Thread.holdsLock(taskQueue))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + taskQueue); 
        } catch (RejectedExecutionException rejectedExecutionException) {
          throw a(null);
        }  
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    synchronized (this.taskRunner) {
      boolean bool1 = false;
      try {
        setShutdown$okhttp(true);
        if (cancelAllAndDecide$okhttp())
          getTaskRunner$okhttp().kickCoordinator$okhttp(this); 
      } catch (RejectedExecutionException rejectedExecutionException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
    } 
  }
  
  public final void setActiveTask$okhttp(@Nullable Task paramTask) {
    this.activeTask = paramTask;
  }
  
  public final void execute(@NotNull String paramString, long paramLong, boolean paramBoolean, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x2B32911059F2L;
    Intrinsics.checkNotNullParameter(paramString, "name");
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool = false;
    schedule(new TaskQueue$execute$1(paramString, paramBoolean, paramFunction0), paramLong);
  }
  
  private static RejectedExecutionException a(RejectedExecutionException paramRejectedExecutionException) {
    return paramRejectedExecutionException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
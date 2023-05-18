package me.rerere.matrix.thirdparty.okhttp3.internal.concurrent;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.logging.Level;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TaskLoggerKt {
  private static final long a = o3.a(1888795547064803152L, -97008882630886817L, MethodHandles.lookup().lookupClass()).a(164677254881902L);
  
  public static final Object logElapsed(@NotNull Task paramTask, @NotNull TaskQueue paramTaskQueue, @NotNull Function0 paramFunction0) {
    long l1 = a ^ 0x737DD60EB99EL;
    Intrinsics.checkNotNullParameter(paramTask, "task");
    Intrinsics.checkNotNullParameter(paramTaskQueue, "queue");
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool1 = false;
    long l2 = -1L;
    boolean bool = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
    if (bool) {
      l2 = paramTaskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
      access$log(paramTask, paramTaskQueue, "starting");
    } 
    boolean bool2 = false;
    try {
      Object object = paramFunction0.invoke();
      bool2 = true;
      return object;
    } finally {
      InlineMarker.finallyStart(1);
      if (bool) {
        long l = paramTaskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - l2;
        try {
          if (bool2) {
            access$log(paramTask, paramTaskQueue, Intrinsics.stringPlus("finished run in ", formatDuration(l)));
          } else {
            access$log(paramTask, paramTaskQueue, Intrinsics.stringPlus("failed a run in ", formatDuration(l)));
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
      InlineMarker.finallyEnd(1);
    } 
  }
  
  @NotNull
  public static final String formatDuration(long paramLong) {
    long l = a ^ 0x23EAFB5163E4L;
    try {
      try {
        try {
          try {
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str1 = (paramLong <= -999500000L) ? (((paramLong - 500000000L) / 1000000000L) + " s ") : ((paramLong <= -999500L) ? (((paramLong - 500000L) / 1000000L) + " ms") : ((paramLong <= 0L) ? (((paramLong - 500L) / 1000L) + " µs") : ((paramLong < 999500L) ? (((paramLong + 500L) / 1000L) + " µs") : ((paramLong < 999500000L) ? (((paramLong + 500000L) / 1000000L) + " ms") : (((paramLong + 500000000L) / 1000000000L) + " s ")))));
    String str2 = "%6s";
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = str1;
    arrayOfObject = arrayOfObject;
    Intrinsics.checkNotNullExpressionValue(String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(format, *args)");
    return String.format(str2, Arrays.copyOf(arrayOfObject, arrayOfObject.length));
  }
  
  public static final void taskLog(@NotNull Task paramTask, @NotNull TaskQueue paramTaskQueue, @NotNull Function0 paramFunction0) {
    long l = a ^ 0x60E1667577E2L;
    Intrinsics.checkNotNullParameter(paramTask, "task");
    Intrinsics.checkNotNullParameter(paramTaskQueue, "queue");
    Intrinsics.checkNotNullParameter(paramFunction0, "messageBlock");
    boolean bool = false;
    try {
      if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE))
        access$log(paramTask, paramTaskQueue, (String)paramFunction0.invoke()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\concurrent\TaskLoggerKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
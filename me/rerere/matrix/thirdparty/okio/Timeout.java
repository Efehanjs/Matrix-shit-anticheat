package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class Timeout {
  private long deadlineNanoTime;
  
  private long timeoutNanos;
  
  @JvmField
  @NotNull
  public static final Timeout NONE;
  
  private boolean hasDeadline;
  
  @NotNull
  public static final Timeout$Companion Companion;
  
  private static final long c = o3.a(3108376576419875996L, 1385366407707287472L, MethodHandles.lookup().lookupClass()).a(63388643431222L);
  
  public long timeoutNanos() {
    return this.timeoutNanos;
  }
  
  static {
    Companion = new Timeout$Companion(null);
    NONE = new Timeout$Companion$NONE$1();
  }
  
  public boolean hasDeadline() {
    return this.hasDeadline;
  }
  
  public final void waitUntilNotified(@NotNull Object paramObject) throws InterruptedIOException {
    long l = c ^ 0x6018C663EA9L;
    Intrinsics.checkNotNullParameter(paramObject, "monitor");
    try {
      boolean bool = hasDeadline();
      long l1 = timeoutNanos();
      try {
        if (!bool)
          try {
            if (l1 == 0L) {
              paramObject.wait();
              return;
            } 
          } catch (InterruptedException interruptedException) {
            throw b(null);
          }  
      } catch (InterruptedException interruptedException) {
        throw b(null);
      } 
      long l2 = System.nanoTime();
      try {
        long l5 = deadlineNanoTime() - l2;
        boolean bool1 = false;
        try {
        
        } catch (InterruptedException interruptedException) {
          throw b(null);
        } 
      } catch (InterruptedException interruptedException) {
        throw b(null);
      } 
      long l3 = (bool && l1 != 0L) ? Math.min(l1, l5) : (bool ? (deadlineNanoTime() - l2) : l1);
      long l4 = 0L;
      if (l3 > 0L) {
        long l5 = l3 / 1000000L;
        paramObject.wait(l5, (int)(l3 - l5 * 1000000L));
        l4 = System.nanoTime() - l2;
      } 
      try {
        if (l4 >= l3)
          throw new InterruptedIOException("timeout"); 
      } catch (InterruptedException interruptedException) {
        throw b(null);
      } 
    } catch (InterruptedException interruptedException) {
      Thread.currentThread().interrupt();
      throw new InterruptedIOException("interrupted");
    } 
  }
  
  @NotNull
  public final Timeout deadline(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = c ^ 0xC81CBEC3493L;
    try {
      Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    boolean bool1 = (paramLong > 0L) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("duration <= 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    return deadlineNanoTime(System.nanoTime() + paramTimeUnit.toNanos(paramLong));
  }
  
  @NotNull
  public Timeout deadlineNanoTime(long paramLong) {
    this.hasDeadline = true;
    this.deadlineNanoTime = paramLong;
    return this;
  }
  
  @NotNull
  public Timeout clearDeadline() {
    this.hasDeadline = false;
    return this;
  }
  
  @NotNull
  public Timeout timeout(long paramLong, @NotNull TimeUnit paramTimeUnit) {
    long l = c ^ 0x57655D7B8217L;
    try {
      Intrinsics.checkNotNullParameter(paramTimeUnit, "unit");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    boolean bool1 = (paramLong >= 0L) ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("timeout < 0: ", Long.valueOf(paramLong));
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    this.timeoutNanos = paramTimeUnit.toNanos(paramLong);
    return this;
  }
  
  public final Object intersectWith(@NotNull Timeout paramTimeout, @NotNull Function0 paramFunction0) {
    long l1 = c ^ 0x71469AC19258L;
    Intrinsics.checkNotNullParameter(paramTimeout, "other");
    Intrinsics.checkNotNullParameter(paramFunction0, "block");
    boolean bool = false;
    long l2 = timeoutNanos();
    timeout(Companion.minTimeout(paramTimeout.timeoutNanos(), timeoutNanos()), TimeUnit.NANOSECONDS);
    if (hasDeadline()) {
      long l = deadlineNanoTime();
      try {
        if (paramTimeout.hasDeadline())
          deadlineNanoTime(Math.min(deadlineNanoTime(), paramTimeout.deadlineNanoTime())); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      try {
        return paramFunction0.invoke();
      } finally {
        try {
          InlineMarker.finallyStart(1);
          timeout(l2, TimeUnit.NANOSECONDS);
          if (paramTimeout.hasDeadline())
            deadlineNanoTime(l); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw b(null);
        } 
        InlineMarker.finallyEnd(1);
      } 
    } 
    try {
      if (paramTimeout.hasDeadline())
        deadlineNanoTime(paramTimeout.deadlineNanoTime()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw b(null);
    } 
    try {
      return paramFunction0.invoke();
    } finally {
      try {
        InlineMarker.finallyStart(1);
        timeout(l2, TimeUnit.NANOSECONDS);
        if (paramTimeout.hasDeadline())
          clearDeadline(); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw b(null);
      } 
      InlineMarker.finallyEnd(1);
    } 
  }
  
  @NotNull
  public Timeout clearTimeout() {
    this.timeoutNanos = 0L;
    return this;
  }
  
  public long deadlineNanoTime() {
    long l = c ^ 0x4E9182C84C2BL;
    boolean bool = this.hasDeadline;
    boolean bool1 = false;
    boolean bool2 = false;
    if (!bool) {
      boolean bool3 = false;
      String str = "No deadline";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    return this.deadlineNanoTime;
  }
  
  public void throwIfReached() throws IOException {
    long l = c ^ 0x6B2B7FBC719CL;
    try {
      if (Thread.currentThread().isInterrupted())
        throw new InterruptedIOException("interrupted"); 
    } catch (IOException iOException) {
      throw b(null);
    } 
    try {
      if (this.hasDeadline)
        try {
          if (this.deadlineNanoTime - System.nanoTime() <= 0L)
            throw new InterruptedIOException("deadline reached"); 
        } catch (IOException iOException) {
          throw b(null);
        }  
    } catch (IOException iOException) {
      throw b(null);
    } 
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Timeout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
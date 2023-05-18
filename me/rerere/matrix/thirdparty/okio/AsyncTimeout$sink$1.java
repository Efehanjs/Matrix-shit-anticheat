package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AsyncTimeout$sink$1 implements Sink {
  private static final long a = o3.a(-3298893989085274506L, -1217662242279029570L, MethodHandles.lookup().lookupClass()).a(94299136996823L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x75B7771D14DL;
    return "AsyncTimeout.sink(" + this.$sink + ')';
  }
  
  public void flush() {
    AsyncTimeout asyncTimeout = AsyncTimeout.this;
    Sink sink = this.$sink;
    boolean bool1 = false;
    boolean bool2 = false;
    asyncTimeout.enter();
    try {
      boolean bool = false;
      sink.flush();
      Unit unit1 = Unit.INSTANCE;
      bool2 = true;
      Unit unit2 = unit1;
    } catch (IOException iOException) {
      try {
      
      } catch (IOException iOException1) {
        throw a(null);
      } 
      throw !asyncTimeout.exit() ? (Throwable)iOException : (Throwable)asyncTimeout.access$newTimeoutException(iOException);
    } finally {
      boolean bool = asyncTimeout.exit();
      try {
        if (bool)
          try {
            if (bool2)
              throw asyncTimeout.access$newTimeoutException(null); 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  public AsyncTimeout$sink$1(Sink paramSink) {}
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x99CD7A7CB8BL;
    Intrinsics.checkNotNullParameter(paramBuffer, "source");
    _UtilKt.checkOffsetAndCount(paramBuffer.size(), 0L, paramLong);
    long l2;
    for (l2 = paramLong; l2 > 0L; l2 -= l) {
      long l = 0L;
      Intrinsics.checkNotNull(paramBuffer.head);
      for (Segment segment = paramBuffer.head; l < 65536L; segment = segment.next) {
        int i = segment.limit - segment.pos;
        l += i;
        if (l >= l2) {
          l = l2;
          break;
        } 
        Intrinsics.checkNotNull(segment.next);
      } 
      AsyncTimeout asyncTimeout = AsyncTimeout.this;
      Sink sink = this.$sink;
      boolean bool1 = false;
      boolean bool2 = false;
      asyncTimeout.enter();
      try {
        boolean bool = false;
        sink.write(paramBuffer, l);
        Unit unit1 = Unit.INSTANCE;
        bool2 = true;
        Unit unit2 = unit1;
      } catch (IOException iOException) {
        try {
        
        } catch (IOException iOException1) {
          throw a(null);
        } 
        throw !asyncTimeout.exit() ? (Throwable)iOException : (Throwable)asyncTimeout.access$newTimeoutException(iOException);
      } finally {
        boolean bool = asyncTimeout.exit();
        try {
          if (bool)
            try {
              if (bool2)
                throw asyncTimeout.access$newTimeoutException(null); 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } 
  }
  
  public void close() {
    AsyncTimeout asyncTimeout = AsyncTimeout.this;
    Sink sink = this.$sink;
    boolean bool1 = false;
    boolean bool2 = false;
    asyncTimeout.enter();
    try {
      boolean bool = false;
      sink.close();
      Unit unit1 = Unit.INSTANCE;
      bool2 = true;
      Unit unit2 = unit1;
    } catch (IOException iOException) {
      try {
      
      } catch (IOException iOException1) {
        throw a(null);
      } 
      throw !asyncTimeout.exit() ? (Throwable)iOException : (Throwable)asyncTimeout.access$newTimeoutException(iOException);
    } finally {
      boolean bool = asyncTimeout.exit();
      try {
        if (bool)
          try {
            if (bool2)
              throw asyncTimeout.access$newTimeoutException(null); 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
  }
  
  @NotNull
  public AsyncTimeout timeout() {
    return AsyncTimeout.this;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\AsyncTimeout$sink$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okio;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class AsyncTimeout$source$1 implements Source {
  private static final long a = o3.a(-1217801524626823493L, 4979747424012109324L, MethodHandles.lookup().lookupClass()).a(19878042537386L);
  
  public AsyncTimeout$source$1(Source paramSource) {}
  
  @NotNull
  public String toString() {
    long l = a ^ 0x59053DA966FAL;
    return "AsyncTimeout.source(" + this.$source + ')';
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x5D14D415C57BL;
    Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    AsyncTimeout asyncTimeout = AsyncTimeout.this;
    Source source = this.$source;
    boolean bool1 = false;
    boolean bool2 = false;
    asyncTimeout.enter();
    try {
      boolean bool = false;
      long l1 = source.read(paramBuffer, paramLong);
      bool2 = true;
      long l2 = l1;
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
    return l2;
  }
  
  @NotNull
  public AsyncTimeout timeout() {
    return AsyncTimeout.this;
  }
  
  public void close() {
    AsyncTimeout asyncTimeout = AsyncTimeout.this;
    Source source = this.$source;
    boolean bool1 = false;
    boolean bool2 = false;
    asyncTimeout.enter();
    try {
      boolean bool = false;
      source.close();
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
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\AsyncTimeout$source$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
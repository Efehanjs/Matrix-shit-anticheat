package me.rerere.matrix.thirdparty.okio;

import java.io.RandomAccessFile;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class JvmFileHandle extends FileHandle {
  @NotNull
  private final RandomAccessFile randomAccessFile;
  
  private static final long b = o3.a(-3318736751982695768L, 1994816742706387624L, MethodHandles.lookup().lookupClass()).a(10213448168309L);
  
  public synchronized long protectedSize() {
    return this.randomAccessFile.length();
  }
  
  public JvmFileHandle(boolean paramBoolean, @NotNull RandomAccessFile paramRandomAccessFile) {
    super(paramBoolean);
    this.randomAccessFile = paramRandomAccessFile;
  }
  
  public synchronized void protectedFlush() {
    this.randomAccessFile.getFD().sync();
  }
  
  public synchronized void protectedWrite(long paramLong, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = b ^ 0x2BD859F1138DL;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    this.randomAccessFile.seek(paramLong);
    this.randomAccessFile.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public synchronized void protectedClose() {
    this.randomAccessFile.close();
  }
  
  public synchronized int protectedRead(long paramLong, @NotNull byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = b ^ 0x30AB3AB52FC0L;
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    this.randomAccessFile.seek(paramLong);
    int i;
    for (i = 0; i < paramInt2; i += j) {
      int j = this.randomAccessFile.read(paramArrayOfbyte, paramInt1, paramInt2 - i);
      try {
        if (j == -1) {
          try {
            if (i == 0)
              return -1; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          break;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return i;
  }
  
  public synchronized void protectedResize(long paramLong) {
    long l1 = size();
    long l2 = paramLong - l1;
    try {
      if (l2 > 0L) {
        protectedWrite(l1, new byte[(int)l2], 0, (int)l2);
      } else {
        this.randomAccessFile.setLength(paramLong);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\JvmFileHandle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
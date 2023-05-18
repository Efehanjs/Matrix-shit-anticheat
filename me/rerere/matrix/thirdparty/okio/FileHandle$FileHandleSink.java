package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FileHandle$FileHandleSink implements Sink {
  private long position;
  
  @NotNull
  private final FileHandle fileHandle;
  
  private boolean closed;
  
  private static final long a = o3.a(1697164724854086409L, -2912653405796948126L, MethodHandles.lookup().lookupClass()).a(98461085283042L);
  
  @NotNull
  public Timeout timeout() {
    return Timeout.NONE;
  }
  
  public final boolean getClosed() {
    return this.closed;
  }
  
  public void write(@NotNull Buffer paramBuffer, long paramLong) {
    long l = a ^ 0x624E2A3ADD94L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "source");
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool1 = !this.closed ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    FileHandle.access$writeNoCloseCheck(this.fileHandle, this.position, paramBuffer, paramLong);
    FileHandle$FileHandleSink fileHandle$FileHandleSink = this;
    fileHandle$FileHandleSink.position += paramLong;
  }
  
  @NotNull
  public final FileHandle getFileHandle() {
    return this.fileHandle;
  }
  
  public final long getPosition() {
    return this.position;
  }
  
  public FileHandle$FileHandleSink(@NotNull FileHandle paramFileHandle, long paramLong) {
    this.fileHandle = paramFileHandle;
    this.position = paramLong;
  }
  
  public final void setClosed(boolean paramBoolean) {
    this.closed = paramBoolean;
  }
  
  public void close() {
    try {
      if (this.closed)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.closed = true;
    FileHandle fileHandle = this.fileHandle;
    boolean bool1 = false;
    boolean bool2 = false;
    synchronized (false) {
      boolean bool = false;
      FileHandle fileHandle1 = getFileHandle();
      int i = FileHandle.access$getOpenStreamCount$p(fileHandle1);
      try {
        FileHandle.access$setOpenStreamCount$p(fileHandle1, i + -1);
        if (FileHandle.access$getOpenStreamCount$p(getFileHandle()) != 0 || !FileHandle.access$getClosed$p(getFileHandle())) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{me/rerere/matrix/thirdparty/okio/FileHandle}, name=null} */
          return;
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      Unit unit = Unit.INSTANCE;
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{me/rerere/matrix/thirdparty/okio/FileHandle}, name=null} */
    } 
    this.fileHandle.protectedClose();
  }
  
  public final void setPosition(long paramLong) {
    this.position = paramLong;
  }
  
  public void flush() {
    long l = a ^ 0x4E53D746F19BL;
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool1 = !this.closed ? true : false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      boolean bool = false;
      String str = "closed";
      throw (Throwable)new IllegalStateException(str.toString());
    } 
    this.fileHandle.protectedFlush();
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\FileHandle$FileHandleSink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
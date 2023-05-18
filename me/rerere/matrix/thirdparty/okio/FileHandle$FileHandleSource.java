package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class FileHandle$FileHandleSource implements Source {
  private boolean closed;
  
  @NotNull
  private final FileHandle fileHandle;
  
  private long position;
  
  private static final long a = o3.a(-2842267742189905227L, 3869097622522974769L, MethodHandles.lookup().lookupClass()).a(55731777385624L);
  
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
  
  @NotNull
  public Timeout timeout() {
    return Timeout.NONE;
  }
  
  public final void setClosed(boolean paramBoolean) {
    this.closed = paramBoolean;
  }
  
  public FileHandle$FileHandleSource(@NotNull FileHandle paramFileHandle, long paramLong) {
    this.fileHandle = paramFileHandle;
    this.position = paramLong;
  }
  
  @NotNull
  public final FileHandle getFileHandle() {
    return this.fileHandle;
  }
  
  public final long getPosition() {
    return this.position;
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = a ^ 0x416421A976B5L;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "sink");
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
    long l2 = FileHandle.access$readNoCloseCheck(this.fileHandle, this.position, paramBuffer, paramLong);
    if (l2 != -1L) {
      FileHandle$FileHandleSource fileHandle$FileHandleSource = this;
      fileHandle$FileHandleSource.position += l2;
    } 
    return l2;
  }
  
  public final boolean getClosed() {
    return this.closed;
  }
  
  public final void setPosition(long paramLong) {
    this.position = paramLong;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\FileHandle$FileHandleSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
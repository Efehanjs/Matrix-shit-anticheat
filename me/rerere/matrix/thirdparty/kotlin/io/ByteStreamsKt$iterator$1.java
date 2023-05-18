package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.BufferedInputStream;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ByteIterator;

public final class ByteStreamsKt$iterator$1 extends ByteIterator {
  private boolean finished;
  
  private boolean nextPrepared;
  
  private int nextByte = -1;
  
  private static final long b = o3.a(-3224600614965116682L, 5744871961210831558L, null).a(5600530727688L);
  
  public final void setNextPrepared(boolean paramBoolean) {
    this.nextPrepared = paramBoolean;
  }
  
  public ByteStreamsKt$iterator$1(BufferedInputStream paramBufferedInputStream) {}
  
  public final boolean getNextPrepared() {
    return this.nextPrepared;
  }
  
  public final void setFinished(boolean paramBoolean) {
    this.finished = paramBoolean;
  }
  
  public byte nextByte() {
    long l = b ^ 0x1161686E036AL;
    try {
      prepareNext();
      if (this.finished)
        throw new NoSuchElementException("Input stream is over."); 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    byte b = (byte)this.nextByte;
    this.nextPrepared = false;
    return b;
  }
  
  public final int getNextByte() {
    return this.nextByte;
  }
  
  public final void setNextByte(int paramInt) {
    this.nextByte = paramInt;
  }
  
  public boolean hasNext() {
    try {
      prepareNext();
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    return !this.finished;
  }
  
  public final boolean getFinished() {
    return this.finished;
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\ByteStreamsKt$iterator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
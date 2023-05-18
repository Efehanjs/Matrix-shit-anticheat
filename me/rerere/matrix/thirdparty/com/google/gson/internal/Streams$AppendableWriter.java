package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.IOException;
import java.io.Writer;

public final class Streams$AppendableWriter extends Writer {
  private final Appendable appendable;
  
  private final Streams$AppendableWriter$CurrentWrite currentWrite = new Streams$AppendableWriter$CurrentWrite();
  
  public void close() {}
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    this.currentWrite.chars = paramArrayOfchar;
    this.appendable.append(this.currentWrite, paramInt1, paramInt1 + paramInt2);
  }
  
  public Streams$AppendableWriter(Appendable paramAppendable) {
    this.appendable = paramAppendable;
  }
  
  public void write(int paramInt) throws IOException {
    this.appendable.append((char)paramInt);
  }
  
  public void flush() {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\Streams$AppendableWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
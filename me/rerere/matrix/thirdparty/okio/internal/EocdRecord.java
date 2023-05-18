package me.rerere.matrix.thirdparty.okio.internal;

public final class EocdRecord {
  private final long centralDirectoryOffset;
  
  private final long entryCount;
  
  private final int commentByteCount;
  
  public final long getEntryCount() {
    return this.entryCount;
  }
  
  public final int getCommentByteCount() {
    return this.commentByteCount;
  }
  
  public final long getCentralDirectoryOffset() {
    return this.centralDirectoryOffset;
  }
  
  public EocdRecord(long paramLong1, long paramLong2, int paramInt) {
    this.entryCount = paramLong1;
    this.centralDirectoryOffset = paramLong2;
    this.commentByteCount = paramInt;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\EocdRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
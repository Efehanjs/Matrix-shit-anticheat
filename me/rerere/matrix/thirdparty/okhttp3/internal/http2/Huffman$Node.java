package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Huffman$Node {
  private final int terminalBitCount;
  
  @Nullable
  private final Huffman$Node[] children = null;
  
  private final int symbol;
  
  public final int getSymbol() {
    return this.symbol;
  }
  
  public Huffman$Node(int paramInt1, int paramInt2) {
    this.symbol = paramInt1;
    int i = paramInt2 & 0x7;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.terminalBitCount = (i == 0) ? 8 : i;
  }
  
  public final int getTerminalBitCount() {
    return this.terminalBitCount;
  }
  
  public Huffman$Node() {
    this.symbol = 0;
    this.terminalBitCount = 0;
  }
  
  @Nullable
  public final Huffman$Node[] getChildren() {
    return this.children;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Huffman$Node.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
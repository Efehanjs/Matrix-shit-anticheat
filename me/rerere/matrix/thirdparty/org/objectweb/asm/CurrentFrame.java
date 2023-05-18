package me.rerere.matrix.thirdparty.org.objectweb.asm;

public final class CurrentFrame extends Frame {
  public void execute(int paramInt1, int paramInt2, Symbol paramSymbol, SymbolTable paramSymbolTable) {
    super.execute(paramInt1, paramInt2, paramSymbol, paramSymbolTable);
    Frame frame = new Frame(null);
    merge(paramSymbolTable, frame, 0);
    copyFrom(frame);
  }
  
  public CurrentFrame(Label paramLabel) {
    super(paramLabel);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\CurrentFrame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
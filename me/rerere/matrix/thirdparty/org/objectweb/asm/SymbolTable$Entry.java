package me.rerere.matrix.thirdparty.org.objectweb.asm;

public class SymbolTable$Entry extends Symbol {
  public final int hashCode;
  
  public SymbolTable$Entry next;
  
  public SymbolTable$Entry(int paramInt1, int paramInt2, String paramString, long paramLong, int paramInt3) {
    super(paramInt1, paramInt2, null, null, paramString, paramLong);
    this.hashCode = paramInt3;
  }
  
  public SymbolTable$Entry(int paramInt1, int paramInt2, long paramLong, int paramInt3) {
    super(paramInt1, paramInt2, null, null, null, paramLong);
    this.hashCode = paramInt3;
  }
  
  public SymbolTable$Entry(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, long paramLong, int paramInt3) {
    super(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramLong);
    this.hashCode = paramInt3;
  }
  
  public SymbolTable$Entry(int paramInt1, int paramInt2, String paramString, int paramInt3) {
    super(paramInt1, paramInt2, null, null, paramString, 0L);
    this.hashCode = paramInt3;
  }
  
  public SymbolTable$Entry(int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3) {
    super(paramInt1, paramInt2, null, paramString1, paramString2, 0L);
    this.hashCode = paramInt3;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\SymbolTable$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
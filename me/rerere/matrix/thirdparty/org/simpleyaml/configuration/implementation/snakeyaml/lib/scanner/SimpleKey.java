package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class SimpleKey {
  private final int column;
  
  private final int index;
  
  private final boolean required;
  
  private final Mark mark;
  
  private final int line;
  
  private final int tokenNumber;
  
  private static final long a = o3.a(-9065734256362904291L, -569373061637683789L, MethodHandles.lookup().lookupClass()).a(6047852022894L);
  
  public boolean isRequired() {
    return this.required;
  }
  
  public int getLine() {
    return this.line;
  }
  
  public int getTokenNumber() {
    return this.tokenNumber;
  }
  
  public int getIndex() {
    return this.index;
  }
  
  public SimpleKey(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, Mark paramMark) {
    this.tokenNumber = paramInt1;
    this.required = paramBoolean;
    this.index = paramInt2;
    this.line = paramInt3;
    this.column = paramInt4;
    this.mark = paramMark;
  }
  
  public int getColumn() {
    return this.column;
  }
  
  public Mark getMark() {
    return this.mark;
  }
  
  public String toString() {
    long l = a ^ 0x239EBFE4FD09L;
    return "SimpleKey - tokenNumber=" + this.tokenNumber + " required=" + this.required + " index=" + this.index + " line=" + this.line + " column=" + this.column;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\scanner\SimpleKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
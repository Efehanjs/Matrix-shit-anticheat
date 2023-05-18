package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner.Constant;

public final class Mark implements Serializable {
  private final int line;
  
  private final int column;
  
  private final int pointer;
  
  private final int[] buffer;
  
  private final String name;
  
  private final int index;
  
  private static final long a = o3.a(-7197027833666209253L, -2577973470785099801L, MethodHandles.lookup().lookupClass()).a(9258126657766L);
  
  public int getColumn() {
    return this.column;
  }
  
  public int[] getBuffer() {
    return this.buffer;
  }
  
  public int getIndex() {
    return this.index;
  }
  
  public int getLine() {
    return this.line;
  }
  
  @Deprecated
  public Mark(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4) {
    this(paramString1, paramInt1, paramInt2, paramInt3, paramString2.toCharArray(), paramInt4);
  }
  
  public String getName() {
    return this.name;
  }
  
  public String toString() {
    long l = a ^ 0x426123093B58L;
    String str = get_snippet();
    return " in " + this.name + ", line " + (this.line + 1) + ", column " + (this.column + 1) + ":\n" + str;
  }
  
  public int getPointer() {
    return this.pointer;
  }
  
  public String get_snippet(int paramInt1, int paramInt2) {
    long l = a ^ 0x751434A99122L;
    float f = paramInt2 / 2.0F - 1.0F;
    int i = this.pointer;
    String str1 = "";
    while (i > 0) {
      try {
        if (!isLineBreak(this.buffer[i - 1]))
          if ((this.pointer - --i) > f) {
            str1 = " ... ";
            i += 5;
            break;
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    String str2 = "";
    int j = this.pointer;
    while (j < this.buffer.length) {
      try {
        if (!isLineBreak(this.buffer[j]))
          if ((++j - this.pointer) > f) {
            str2 = " ... ";
            j -= 5;
            break;
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    int k = 0;
    try {
      while (k < paramInt1) {
        stringBuilder.append(" ");
        k++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    stringBuilder.append(str1);
    k = i;
    try {
      while (k < j) {
        stringBuilder.appendCodePoint(this.buffer[k]);
        k++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    stringBuilder.append(str2);
    stringBuilder.append("\n");
    k = 0;
    try {
      while (k < paramInt1 + this.pointer - i + str1.length()) {
        stringBuilder.append(" ");
        k++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    stringBuilder.append("^");
    return stringBuilder.toString();
  }
  
  public Mark(String paramString, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint, int paramInt4) {
    this.name = paramString;
    this.index = paramInt1;
    this.line = paramInt2;
    this.column = paramInt3;
    this.buffer = paramArrayOfint;
    this.pointer = paramInt4;
  }
  
  public String get_snippet() {
    return get_snippet(4, 75);
  }
  
  public Mark(String paramString, int paramInt1, int paramInt2, int paramInt3, char[] paramArrayOfchar, int paramInt4) {
    this(paramString, paramInt1, paramInt2, paramInt3, toCodePoints(paramArrayOfchar), paramInt4);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\error\Mark.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
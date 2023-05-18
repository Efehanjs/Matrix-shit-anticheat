package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class ClassTooLargeException extends IndexOutOfBoundsException {
  private static final long serialVersionUID = 160715609518896765L;
  
  private final int constantPoolCount;
  
  private final String className;
  
  private static final long a = o3.a(-7227104232467010945L, -3981716787858589594L, null).a(19565170620554L);
  
  public String getClassName() {
    return this.className;
  }
  
  public ClassTooLargeException(String paramString, int paramInt) {
    super("Class too large: " + paramString);
    this.className = paramString;
    this.constantPoolCount = paramInt;
  }
  
  public int getConstantPoolCount() {
    return this.constantPoolCount;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ClassTooLargeException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
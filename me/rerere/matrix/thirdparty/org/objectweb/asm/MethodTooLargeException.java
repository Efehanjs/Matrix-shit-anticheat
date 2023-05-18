package me.rerere.matrix.thirdparty.org.objectweb.asm;

import me.rerere.matrix.internal.o3;

public final class MethodTooLargeException extends IndexOutOfBoundsException {
  private final int codeSize;
  
  private static final long serialVersionUID = 6807380416709738314L;
  
  private final String className;
  
  private final String methodName;
  
  private final String descriptor;
  
  private static final long a = o3.a(-6147283487411049926L, -3133912985799870930L, null).a(170252438171338L);
  
  public MethodTooLargeException(String paramString1, String paramString2, String paramString3, int paramInt) {
    super("Method too large: " + paramString1 + "." + paramString2 + " " + paramString3);
    this.className = paramString1;
    this.methodName = paramString2;
    this.descriptor = paramString3;
    this.codeSize = paramInt;
  }
  
  public int getCodeSize() {
    return this.codeSize;
  }
  
  public String getClassName() {
    return this.className;
  }
  
  public String getDescriptor() {
    return this.descriptor;
  }
  
  public String getMethodName() {
    return this.methodName;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\MethodTooLargeException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
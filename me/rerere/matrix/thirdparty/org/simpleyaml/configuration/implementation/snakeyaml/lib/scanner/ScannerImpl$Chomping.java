package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner;

public class ScannerImpl$Chomping {
  private final Boolean value;
  
  private final int increment;
  
  public boolean chompTailIsNotFalse() {
    try {
      if (this.value != null) {
        try {
          if (this.value.booleanValue());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean chompTailIsTrue() {
    try {
      if (this.value != null)
        try {
          if (this.value.booleanValue());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public int getIncrement() {
    return this.increment;
  }
  
  public ScannerImpl$Chomping(Boolean paramBoolean, int paramInt) {
    this.value = paramBoolean;
    this.increment = paramInt;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\scanner\ScannerImpl$Chomping.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
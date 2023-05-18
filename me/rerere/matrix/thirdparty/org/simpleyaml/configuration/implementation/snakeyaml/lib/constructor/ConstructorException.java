package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.MarkedYAMLException;

public class ConstructorException extends MarkedYAMLException {
  private static final long serialVersionUID = -8816339931365239910L;
  
  public ConstructorException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2, Throwable paramThrowable) {
    super(paramString1, paramMark1, paramString2, paramMark2, paramThrowable);
  }
  
  public ConstructorException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2) {
    this(paramString1, paramMark1, paramString2, paramMark2, null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\ConstructorException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
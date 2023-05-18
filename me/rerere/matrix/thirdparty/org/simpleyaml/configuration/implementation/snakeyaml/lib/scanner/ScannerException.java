package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.MarkedYAMLException;

public class ScannerException extends MarkedYAMLException {
  private static final long serialVersionUID = 4782293188600445954L;
  
  public ScannerException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2) {
    this(paramString1, paramMark1, paramString2, paramMark2, null);
  }
  
  public ScannerException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2, String paramString3) {
    super(paramString1, paramMark1, paramString2, paramMark2, paramString3);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\scanner\ScannerException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
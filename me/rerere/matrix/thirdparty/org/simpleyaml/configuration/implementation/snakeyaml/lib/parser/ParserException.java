package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.MarkedYAMLException;

public class ParserException extends MarkedYAMLException {
  private static final long serialVersionUID = -2349253802798398038L;
  
  public ParserException(String paramString1, Mark paramMark1, String paramString2, Mark paramMark2) {
    super(paramString1, paramMark1, paramString2, paramMark2, null, null);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
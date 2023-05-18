package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.scanner;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public interface Scanner {
  boolean checkToken(Token.ID... paramVarArgs);
  
  Token peekToken();
  
  Token getToken();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\scanner\Scanner.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
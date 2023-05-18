package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;

public abstract class Token {
  private final Mark startMark;
  
  private final Mark endMark;
  
  private static final long b = o3.a(4479517278622024937L, -7563487166560134828L, MethodHandles.lookup().lookupClass()).a(222844040347195L);
  
  public abstract Token$ID getTokenId();
  
  public Mark getStartMark() {
    return this.startMark;
  }
  
  public Token(Mark paramMark1, Mark paramMark2) {
    if (paramMark1 != null)
      try {
        if (paramMark2 != null) {
          this.startMark = paramMark1;
          this.endMark = paramMark2;
          return;
        } 
        throw new YAMLException("Token requires marks.");
      } catch (YAMLException yAMLException) {
        throw b(null);
      }  
    throw new YAMLException("Token requires marks.");
  }
  
  public Mark getEndMark() {
    return this.endMark;
  }
  
  private static YAMLException b(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\Token.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class AliasToken extends Token {
  private final String value;
  
  private static final long a = o3.a(-8092632733750556994L, -6555782565272928738L, MethodHandles.lookup().lookupClass()).a(112380229238937L);
  
  public String getValue() {
    return this.value;
  }
  
  public Token$ID getTokenId() {
    return Token$ID.Alias;
  }
  
  public AliasToken(String paramString, Mark paramMark1, Mark paramMark2) {
    super(paramMark1, paramMark2);
    if (paramString == null)
      throw new NullPointerException("alias is expected"); 
    this.value = paramString;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\AliasToken.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
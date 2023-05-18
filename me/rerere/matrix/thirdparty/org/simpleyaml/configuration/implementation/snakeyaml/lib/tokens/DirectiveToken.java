package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;

public final class DirectiveToken extends Token {
  private final List value;
  
  private final String name;
  
  private static final long a = o3.a(9040659423357690270L, 4448678247484190220L, MethodHandles.lookup().lookupClass()).a(160593922603749L);
  
  public List getValue() {
    return this.value;
  }
  
  public String getName() {
    return this.name;
  }
  
  public Token$ID getTokenId() {
    return Token$ID.Directive;
  }
  
  public DirectiveToken(String paramString, List paramList, Mark paramMark1, Mark paramMark2) {
    super(paramMark1, paramMark2);
    this.name = paramString;
    if (paramList != null)
      try {
        if (paramList.size() != 2)
          throw new YAMLException("Two strings must be provided instead of " + paramList.size()); 
      } catch (YAMLException yAMLException) {
        throw a(null);
      }  
    this.value = paramList;
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\DirectiveToken.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
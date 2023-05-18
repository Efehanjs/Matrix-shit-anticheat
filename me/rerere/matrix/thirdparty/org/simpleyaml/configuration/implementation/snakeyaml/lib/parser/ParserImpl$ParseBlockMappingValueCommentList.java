package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.util.List;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;

public class ParserImpl$ParseBlockMappingValueCommentList implements Production {
  public List tokens;
  
  public ParserImpl$ParseBlockMappingValueCommentList(List paramList) {
    this.tokens = paramList;
  }
  
  public Event produce() {
    try {
      if (!this.tokens.isEmpty())
        return (Event)ParserImpl.access$300(ParserImpl.this, this.tokens.remove(0)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (new ParserImpl$ParseBlockMappingKey(ParserImpl.this, null)).produce();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseBlockMappingValueCommentList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
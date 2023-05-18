package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.CommentEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseFlowEndComment implements Production {
  public Event produce() {
    CommentEvent commentEvent = ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment }))
        ParserImpl.access$102(ParserImpl.this, (Production)ParserImpl.access$500(ParserImpl.this).pop()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (Event)commentEvent;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowEndComment.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
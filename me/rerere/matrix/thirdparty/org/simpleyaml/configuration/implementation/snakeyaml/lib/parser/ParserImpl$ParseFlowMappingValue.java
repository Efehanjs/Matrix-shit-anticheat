package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseFlowMappingValue implements Production {
  public Event produce() {
    if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Value })) {
      Token token1 = ParserImpl.this.scanner.getToken();
      try {
        if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.FlowEntry, Token.ID.FlowMappingEnd })) {
          ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseFlowMappingKey(ParserImpl.this, false));
          return ParserImpl.access$2400(ParserImpl.this);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowMappingKey(ParserImpl.this, false));
      return ParserImpl.access$1100(ParserImpl.this, token1.getEndMark());
    } 
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowMappingKey(ParserImpl.this, false));
    Token token = ParserImpl.this.scanner.peekToken();
    return ParserImpl.access$1100(ParserImpl.this, token.getStartMark());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowMappingValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
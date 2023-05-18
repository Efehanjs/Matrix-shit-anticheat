package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseFlowSequenceEntryMappingKey implements Production {
  public Event produce() {
    Token token = ParserImpl.this.scanner.getToken();
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Value, Token.ID.FlowEntry, Token.ID.FlowSequenceEnd })) {
        ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseFlowSequenceEntryMappingValue(ParserImpl.this, null));
        return ParserImpl.access$2400(ParserImpl.this);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowSequenceEntryMappingValue(ParserImpl.this, null));
    return ParserImpl.access$1100(ParserImpl.this, token.getEndMark());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowSequenceEntryMappingKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
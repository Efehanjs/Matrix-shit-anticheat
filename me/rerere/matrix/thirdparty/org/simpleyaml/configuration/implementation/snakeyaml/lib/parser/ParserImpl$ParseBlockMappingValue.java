package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseBlockMappingValue implements Production {
  public Event produce() {
    if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Value })) {
      Token token1 = ParserImpl.this.scanner.getToken();
      try {
        if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
          ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockMappingValueComment(ParserImpl.this, null));
          return ParserImpl.access$100(ParserImpl.this).produce();
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd })) {
          ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseBlockMappingKey(ParserImpl.this, null));
          return ParserImpl.access$2100(ParserImpl.this);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockMappingKey(ParserImpl.this, null));
      return ParserImpl.access$1100(ParserImpl.this, token1.getEndMark());
    } 
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Scalar })) {
        ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseBlockMappingKey(ParserImpl.this, null));
        return ParserImpl.access$2100(ParserImpl.this);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockMappingKey(ParserImpl.this, null));
    Token token = ParserImpl.this.scanner.peekToken();
    return ParserImpl.access$1100(ParserImpl.this, token.getStartMark());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseBlockMappingValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
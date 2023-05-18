package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseBlockMappingKey implements Production {
  private static final long a = o3.a(-4320416974550526603L, -6588803669272937248L, MethodHandles.lookup().lookupClass()).a(124621715963746L);
  
  public Event produce() {
    long l = a ^ 0x1445802E480EL;
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockMappingKey());
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Key })) {
      Token token1 = ParserImpl.this.scanner.getToken();
      try {
        if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd })) {
          ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseBlockMappingValue(ParserImpl.this, null));
          return ParserImpl.access$2100(ParserImpl.this);
        } 
      } catch (ParserException parserException) {
        throw a(null);
      } 
      ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockMappingValue(ParserImpl.this, null));
      return ParserImpl.access$1100(ParserImpl.this, token1.getEndMark());
    } 
    if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.BlockEnd })) {
      Token token1 = ParserImpl.this.scanner.peekToken();
      throw new ParserException("while parsing a block mapping", (Mark)ParserImpl.access$1000(ParserImpl.this).pop(), "expected <block end>, but found '" + token1.getTokenId() + "'", token1.getStartMark());
    } 
    Token token = ParserImpl.this.scanner.getToken();
    MappingEndEvent mappingEndEvent = new MappingEndEvent(token.getStartMark(), token.getEndMark());
    ParserImpl.access$102(ParserImpl.this, (Production)ParserImpl.access$500(ParserImpl.this).pop());
    ParserImpl.access$1000(ParserImpl.this).pop();
    return (Event)mappingEndEvent;
  }
  
  private static ParserException a(ParserException paramParserException) {
    return paramParserException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseBlockMappingKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseFlowMappingKey implements Production {
  private final boolean first;
  
  private static final long a = o3.a(-18512570544968663L, 1233063006883279375L, MethodHandles.lookup().lookupClass()).a(28845388620109L);
  
  public Event produce() {
    long l = a ^ 0x3B1733B20290L;
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowMappingKey(this.first));
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.FlowMappingEnd })) {
        try {
          if (!this.first)
            try {
              if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.FlowEntry })) {
                try {
                  ParserImpl.this.scanner.getToken();
                  if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
                    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowMappingKey(true));
                    return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
                  } 
                } catch (ParserException parserException) {
                  throw a(null);
                } 
              } else {
                Token token1 = ParserImpl.this.scanner.peekToken();
                throw new ParserException("while parsing a flow mapping", (Mark)ParserImpl.access$1000(ParserImpl.this).pop(), "expected ',' or '}', but got " + token1.getTokenId(), token1.getStartMark());
              } 
            } catch (ParserException parserException) {
              throw a(null);
            }  
        } catch (ParserException parserException) {
          throw a(null);
        } 
        if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Key })) {
          Token token1 = ParserImpl.this.scanner.getToken();
          try {
            if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Value, Token.ID.FlowEntry, Token.ID.FlowMappingEnd })) {
              ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseFlowMappingValue(ParserImpl.this, null));
              return ParserImpl.access$2400(ParserImpl.this);
            } 
          } catch (ParserException parserException) {
            throw a(null);
          } 
          ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowMappingValue(ParserImpl.this, null));
          return ParserImpl.access$1100(ParserImpl.this, token1.getEndMark());
        } 
        try {
          if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.FlowMappingEnd })) {
            ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseFlowMappingEmptyValue(ParserImpl.this, null));
            return ParserImpl.access$2400(ParserImpl.this);
          } 
        } catch (ParserException parserException) {
          throw a(null);
        } 
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    Token token = ParserImpl.this.scanner.getToken();
    MappingEndEvent mappingEndEvent = new MappingEndEvent(token.getStartMark(), token.getEndMark());
    try {
      ParserImpl.access$1000(ParserImpl.this).pop();
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, (Production)ParserImpl.access$500(ParserImpl.this).pop());
      } else {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowEndComment(ParserImpl.this, null));
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    return (Event)mappingEndEvent;
  }
  
  public ParserImpl$ParseFlowMappingKey(boolean paramBoolean) {
    this.first = paramBoolean;
  }
  
  private static ParserException a(ParserException paramParserException) {
    return paramParserException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowMappingKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
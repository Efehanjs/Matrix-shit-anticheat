package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.util.LinkedList;
import java.util.List;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseBlockMappingValueComment implements Production {
  public List tokens = new LinkedList();
  
  public Event produce() {
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        this.tokens.add((CommentToken)ParserImpl.this.scanner.getToken());
        return produce();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd })) {
        try {
          if (!this.tokens.isEmpty())
            return (Event)ParserImpl.access$300(ParserImpl.this, this.tokens.remove(0)); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseBlockMappingKey(ParserImpl.this, null));
        return ParserImpl.access$2100(ParserImpl.this);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockMappingValueCommentList(ParserImpl.this, this.tokens));
    return ParserImpl.access$1100(ParserImpl.this, ParserImpl.this.scanner.peekToken().getStartMark());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseBlockMappingValueComment.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.SequenceEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockEntryToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseIndentlessSequenceEntryKey implements Production {
  public Event produce() {
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseIndentlessSequenceEntryKey());
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.BlockEntry })) {
      BlockEntryToken blockEntryToken = (BlockEntryToken)ParserImpl.this.scanner.getToken();
      return (new ParserImpl$ParseIndentlessSequenceEntryValue(ParserImpl.this, blockEntryToken)).produce();
    } 
    Token token = ParserImpl.this.scanner.peekToken();
    SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
    ParserImpl.access$102(ParserImpl.this, (Production)ParserImpl.access$500(ParserImpl.this).pop());
    return (Event)sequenceEndEvent;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseIndentlessSequenceEntryKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
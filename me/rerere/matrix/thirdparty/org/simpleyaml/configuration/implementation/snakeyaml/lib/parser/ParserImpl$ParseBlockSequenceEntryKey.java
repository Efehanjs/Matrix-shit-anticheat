package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.SequenceEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockEntryToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseBlockSequenceEntryKey implements Production {
  private static final long a = o3.a(-8311418214929520080L, -5935521019863892718L, MethodHandles.lookup().lookupClass()).a(90256628523676L);
  
  public Event produce() {
    long l = a ^ 0x5B64BA22D26AL;
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockSequenceEntryKey());
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (ParserException parserException) {
      throw a(null);
    } 
    if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.BlockEntry })) {
      BlockEntryToken blockEntryToken = (BlockEntryToken)ParserImpl.this.scanner.getToken();
      return (new ParserImpl$ParseBlockSequenceEntryValue(ParserImpl.this, blockEntryToken)).produce();
    } 
    if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.BlockEnd })) {
      Token token1 = ParserImpl.this.scanner.peekToken();
      throw new ParserException("while parsing a block collection", (Mark)ParserImpl.access$1000(ParserImpl.this).pop(), "expected <block end>, but found '" + token1.getTokenId() + "'", token1.getStartMark());
    } 
    Token token = ParserImpl.this.scanner.getToken();
    SequenceEndEvent sequenceEndEvent = new SequenceEndEvent(token.getStartMark(), token.getEndMark());
    ParserImpl.access$102(ParserImpl.this, (Production)ParserImpl.access$500(ParserImpl.this).pop());
    ParserImpl.access$1000(ParserImpl.this).pop();
    return (Event)sequenceEndEvent;
  }
  
  private static ParserException a(ParserException paramParserException) {
    return paramParserException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseBlockSequenceEntryKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
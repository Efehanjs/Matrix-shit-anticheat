package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockEntryToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseBlockSequenceEntryValue implements Production {
  public BlockEntryToken token;
  
  public Event produce() {
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockSequenceEntryValue(this.token));
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.BlockEntry, Token.ID.BlockEnd })) {
        ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseBlockSequenceEntryKey(ParserImpl.this, null));
        return (new ParserImpl$ParseBlockNode(ParserImpl.this, null)).produce();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockSequenceEntryKey(ParserImpl.this, null));
    return ParserImpl.access$1100(ParserImpl.this, this.token.getEndMark());
  }
  
  public ParserImpl$ParseBlockSequenceEntryValue(BlockEntryToken paramBlockEntryToken) {
    this.token = paramBlockEntryToken;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseBlockSequenceEntryValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
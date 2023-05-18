package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.BlockEntryToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseIndentlessSequenceEntryValue implements Production {
  public BlockEntryToken token;
  
  public Event produce() {
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseIndentlessSequenceEntryValue(this.token));
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.BlockEntry, Token.ID.Key, Token.ID.Value, Token.ID.BlockEnd })) {
        ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseIndentlessSequenceEntryKey(ParserImpl.this, null));
        return (new ParserImpl$ParseBlockNode(ParserImpl.this, null)).produce();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseIndentlessSequenceEntryKey(ParserImpl.this, null));
    return ParserImpl.access$1100(ParserImpl.this, this.token.getEndMark());
  }
  
  public ParserImpl$ParseIndentlessSequenceEntryValue(BlockEntryToken paramBlockEntryToken) {
    this.token = paramBlockEntryToken;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseIndentlessSequenceEntryValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.DocumentStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.CommentToken;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseImplicitDocumentStart implements Production {
  public Event produce() {
    try {
      if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Comment })) {
        ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseImplicitDocumentStart());
        return (Event)ParserImpl.access$300(ParserImpl.this, (CommentToken)ParserImpl.this.scanner.getToken());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (!ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.Directive, Token.ID.DocumentStart, Token.ID.StreamEnd })) {
      Token token = ParserImpl.this.scanner.peekToken();
      Mark mark1 = token.getStartMark();
      Mark mark2 = mark1;
      DocumentStartEvent documentStartEvent = new DocumentStartEvent(mark1, mark2, false, null, null);
      ParserImpl.access$500(ParserImpl.this).push(new ParserImpl$ParseDocumentEnd(ParserImpl.this, null));
      ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseBlockNode(ParserImpl.this, null));
      return (Event)documentStartEvent;
    } 
    return (new ParserImpl$ParseDocumentStart(ParserImpl.this, null)).produce();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseImplicitDocumentStart.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
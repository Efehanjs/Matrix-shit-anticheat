package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.DocumentEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseDocumentEnd implements Production {
  public Event produce() {
    Token token = ParserImpl.this.scanner.peekToken();
    Mark mark1 = token.getStartMark();
    Mark mark2 = mark1;
    boolean bool = false;
    if (ParserImpl.this.scanner.checkToken(new Token.ID[] { Token.ID.DocumentEnd })) {
      token = ParserImpl.this.scanner.getToken();
      mark2 = token.getEndMark();
      bool = true;
    } 
    DocumentEndEvent documentEndEvent = new DocumentEndEvent(mark1, mark2, bool);
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseDocumentStart(ParserImpl.this, null));
    return (Event)documentEndEvent;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseDocumentEnd.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
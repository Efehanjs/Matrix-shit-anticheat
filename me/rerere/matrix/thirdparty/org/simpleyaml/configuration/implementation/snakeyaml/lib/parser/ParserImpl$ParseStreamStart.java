package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.StreamStartEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.StreamStartToken;

public class ParserImpl$ParseStreamStart implements Production {
  public Event produce() {
    StreamStartToken streamStartToken = (StreamStartToken)ParserImpl.this.scanner.getToken();
    StreamStartEvent streamStartEvent = new StreamStartEvent(streamStartToken.getStartMark(), streamStartToken.getEndMark());
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseImplicitDocumentStart(ParserImpl.this, null));
    return (Event)streamStartEvent;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseStreamStart.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
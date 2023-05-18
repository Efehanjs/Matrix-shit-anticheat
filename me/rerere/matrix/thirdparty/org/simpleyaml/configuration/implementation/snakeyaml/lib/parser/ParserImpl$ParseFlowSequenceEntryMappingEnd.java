package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingEndEvent;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseFlowSequenceEntryMappingEnd implements Production {
  public Event produce() {
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowSequenceEntry(ParserImpl.this, false));
    Token token = ParserImpl.this.scanner.peekToken();
    return (Event)new MappingEndEvent(token.getStartMark(), token.getEndMark());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowSequenceEntryMappingEnd.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
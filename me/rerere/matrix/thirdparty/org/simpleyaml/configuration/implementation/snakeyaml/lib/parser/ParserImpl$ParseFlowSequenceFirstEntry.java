package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens.Token;

public class ParserImpl$ParseFlowSequenceFirstEntry implements Production {
  public Event produce() {
    Token token = ParserImpl.this.scanner.getToken();
    ParserImpl.access$1000(ParserImpl.this).push(token.getStartMark());
    return (new ParserImpl$ParseFlowSequenceEntry(ParserImpl.this, true)).produce();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowSequenceFirstEntry.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
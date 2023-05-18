package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;

public class ParserImpl$ParseFlowMappingEmptyValue implements Production {
  public Event produce() {
    ParserImpl.access$102(ParserImpl.this, new ParserImpl$ParseFlowMappingKey(ParserImpl.this, false));
    return ParserImpl.access$1100(ParserImpl.this, ParserImpl.this.scanner.peekToken().getStartMark());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\ParserImpl$ParseFlowMappingEmptyValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
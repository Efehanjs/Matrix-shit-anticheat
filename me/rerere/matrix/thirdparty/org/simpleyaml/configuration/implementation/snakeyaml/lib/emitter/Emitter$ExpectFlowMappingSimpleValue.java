package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectFlowMappingSimpleValue implements EmitterState {
  public void expect() throws IOException {
    Emitter.this.writeIndicator(":", false, false, false);
    Emitter.access$102(Emitter.this, Emitter.access$2300(Emitter.this).collectEventsAndPoll(Emitter.access$100(Emitter.this)));
    Emitter.access$2400(Emitter.this);
    Emitter.access$1700(Emitter.this).push(new Emitter$ExpectFlowMappingKey(Emitter.this, null));
    Emitter.access$1800(Emitter.this, false, true, false);
    Emitter.access$2300(Emitter.this).collectEvents(Emitter.access$100(Emitter.this));
    Emitter.access$2400(Emitter.this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectFlowMappingSimpleValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
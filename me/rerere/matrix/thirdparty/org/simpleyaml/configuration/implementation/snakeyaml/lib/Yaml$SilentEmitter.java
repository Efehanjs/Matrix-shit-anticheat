package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter.Emitable;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;

public class Yaml$SilentEmitter implements Emitable {
  private final List events = new ArrayList(100);
  
  public List getEvents() {
    return this.events;
  }
  
  public void emit(Event paramEvent) throws IOException {
    this.events.add(paramEvent);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\Yaml$SilentEmitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
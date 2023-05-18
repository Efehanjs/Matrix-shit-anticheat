package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectBlockMappingKey implements EmitterState {
  private final boolean first;
  
  public void expect() throws IOException {
    try {
      Emitter.access$102(Emitter.this, Emitter.access$1400(Emitter.this).collectEventsAndPoll(Emitter.access$100(Emitter.this)));
      Emitter.access$1500(Emitter.this);
      if (!this.first)
        try {
          if (Emitter.access$100(Emitter.this) instanceof me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.MappingEndEvent) {
            Emitter.access$2002(Emitter.this, (Integer)Emitter.access$2100(Emitter.this).pop());
            Emitter.access$202(Emitter.this, (EmitterState)Emitter.access$1700(Emitter.this).pop());
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      Emitter.this.writeIndent();
      if (Emitter.access$3100(Emitter.this)) {
        Emitter.access$1700(Emitter.this).push(new Emitter$ExpectBlockMappingSimpleValue(Emitter.this, null));
        Emitter.access$1800(Emitter.this, false, true, true);
      } else {
        Emitter.this.writeIndicator("?", true, false, true);
        Emitter.access$1700(Emitter.this).push(new Emitter$ExpectBlockMappingValue(Emitter.this, null));
        Emitter.access$1800(Emitter.this, false, true, false);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Emitter$ExpectBlockMappingKey(boolean paramBoolean) {
    this.first = paramBoolean;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectBlockMappingKey.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
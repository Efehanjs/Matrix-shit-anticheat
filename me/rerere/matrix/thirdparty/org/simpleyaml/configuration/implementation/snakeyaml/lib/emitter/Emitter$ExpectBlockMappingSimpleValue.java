package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectBlockMappingSimpleValue implements EmitterState {
  public void expect() throws IOException {
    try {
      Emitter.this.writeIndicator(":", false, false, false);
      Emitter.access$102(Emitter.this, Emitter.access$2300(Emitter.this).collectEventsAndPoll(Emitter.access$100(Emitter.this)));
      if (!Emitter.access$4500(Emitter.this, Emitter.access$100(Emitter.this)))
        try {
          if (Emitter.access$2400(Emitter.this)) {
            Emitter.access$3900(Emitter.this, true, false);
            Emitter.this.writeIndent();
            Emitter.access$2002(Emitter.this, (Integer)Emitter.access$2100(Emitter.this).pop());
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      Emitter.access$102(Emitter.this, Emitter.access$1400(Emitter.this).collectEventsAndPoll(Emitter.access$100(Emitter.this)));
      if (!Emitter.access$1400(Emitter.this).isEmpty()) {
        Emitter.access$3900(Emitter.this, true, false);
        Emitter.access$1500(Emitter.this);
        Emitter.this.writeIndent();
        Emitter.access$2002(Emitter.this, (Integer)Emitter.access$2100(Emitter.this).pop());
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Emitter.access$1700(Emitter.this).push(new Emitter$ExpectBlockMappingKey(Emitter.this, false));
    Emitter.access$1800(Emitter.this, false, true, false);
    Emitter.access$2300(Emitter.this).collectEvents();
    Emitter.access$2400(Emitter.this);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectBlockMappingSimpleValue.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
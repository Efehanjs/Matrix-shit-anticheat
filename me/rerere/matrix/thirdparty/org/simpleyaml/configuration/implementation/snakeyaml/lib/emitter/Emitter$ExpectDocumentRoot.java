package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectDocumentRoot implements EmitterState {
  public void expect() throws IOException {
    try {
      Emitter.access$102(Emitter.this, Emitter.access$1400(Emitter.this).collectEventsAndPoll(Emitter.access$100(Emitter.this)));
      if (!Emitter.access$1400(Emitter.this).isEmpty())
        try {
          Emitter.access$1500(Emitter.this);
          if (Emitter.access$100(Emitter.this) instanceof me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.DocumentEndEvent) {
            (new Emitter$ExpectDocumentEnd(Emitter.this, null)).expect();
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    Emitter.access$1700(Emitter.this).push(new Emitter$ExpectDocumentEnd(Emitter.this, null));
    Emitter.access$1800(Emitter.this, true, false, false);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectDocumentRoot.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
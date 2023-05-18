package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.DocumentEndEvent;

public class Emitter$ExpectDocumentEnd implements EmitterState {
  private static final long a = o3.a(2899182292767210963L, -8357723202468861886L, MethodHandles.lookup().lookupClass()).a(135028253951765L);
  
  public void expect() throws IOException {
    long l = a ^ 0x6505D81F7E31L;
    try {
      Emitter.access$102(Emitter.this, Emitter.access$1400(Emitter.this).collectEventsAndPoll(Emitter.access$100(Emitter.this)));
      Emitter.access$1500(Emitter.this);
      if (Emitter.access$100(Emitter.this) instanceof DocumentEndEvent) {
        try {
          Emitter.this.writeIndent();
          if (((DocumentEndEvent)Emitter.access$100(Emitter.this)).getExplicit()) {
            Emitter.this.writeIndicator("...", true, false, false);
            Emitter.this.writeIndent();
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        Emitter.this.flushStream();
        Emitter.access$202(Emitter.this, new Emitter$ExpectDocumentStart(Emitter.this, false));
      } else {
        throw new EmitterException("expected DocumentEndEvent, but got " + Emitter.access$100(Emitter.this));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectDocumentEnd.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
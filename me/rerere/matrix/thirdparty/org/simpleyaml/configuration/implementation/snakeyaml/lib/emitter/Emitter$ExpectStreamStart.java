package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class Emitter$ExpectStreamStart implements EmitterState {
  private static final long a = o3.a(2708076266560642081L, 7458969256574847745L, MethodHandles.lookup().lookupClass()).a(219453617384914L);
  
  public void expect() throws IOException {
    long l = a ^ 0x37491CF23E86L;
    try {
      if (Emitter.access$100(Emitter.this) instanceof me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.StreamStartEvent) {
        Emitter.this.writeStreamStart();
        Emitter.access$202(Emitter.this, new Emitter$ExpectFirstDocumentStart(Emitter.this, null));
      } else {
        throw new EmitterException("expected StreamStartEvent, but got " + Emitter.access$100(Emitter.this));
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectStreamStart.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
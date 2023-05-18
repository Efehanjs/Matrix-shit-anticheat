package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class Emitter$ExpectNothing implements EmitterState {
  private static final long a = o3.a(-4994748880426682446L, 4722423108186470112L, MethodHandles.lookup().lookupClass()).a(216815113480017L);
  
  public void expect() throws IOException {
    long l = a ^ 0x4310200282L;
    throw new EmitterException("expecting nothing, but got " + Emitter.access$100(Emitter.this));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectNothing.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.emitter;

import java.io.IOException;

public class Emitter$ExpectFirstBlockSequenceItem implements EmitterState {
  public void expect() throws IOException {
    (new Emitter$ExpectBlockSequenceItem(Emitter.this, true)).expect();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\emitter\Emitter$ExpectFirstBlockSequenceItem.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
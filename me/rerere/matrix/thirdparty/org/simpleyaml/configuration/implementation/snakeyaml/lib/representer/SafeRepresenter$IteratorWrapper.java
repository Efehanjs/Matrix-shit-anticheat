package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.util.Iterator;

public class SafeRepresenter$IteratorWrapper implements Iterable {
  private final Iterator iter;
  
  public SafeRepresenter$IteratorWrapper(Iterator paramIterator) {
    this.iter = paramIterator;
  }
  
  public Iterator iterator() {
    return this.iter;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$IteratorWrapper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
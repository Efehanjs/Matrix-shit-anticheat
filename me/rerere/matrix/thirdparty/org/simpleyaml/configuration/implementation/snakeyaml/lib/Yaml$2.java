package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.composer.Composer;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class Yaml$2 implements Iterator {
  private static final long a = o3.a(7835007436985692340L, 222976508623385472L, MethodHandles.lookup().lookupClass()).a(206973427713695L);
  
  public boolean hasNext() {
    return composer.checkNode();
  }
  
  public Node next() {
    long l = a ^ 0x6C151D25DC9CL;
    Node node = composer.getNode();
    try {
      if (node != null)
        return node; 
    } catch (NoSuchElementException noSuchElementException) {
      throw a(null);
    } 
    throw new NoSuchElementException("No Node is available.");
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  private static NoSuchElementException a(NoSuchElementException paramNoSuchElementException) {
    return paramNoSuchElementException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\Yaml$2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
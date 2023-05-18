package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser.Parser;

public class Yaml$3 implements Iterator {
  private static final long a = o3.a(-3417853557853155472L, -7097259844013144972L, MethodHandles.lookup().lookupClass()).a(49003069408765L);
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  public Event next() {
    long l = a ^ 0x691EC399190CL;
    Event event = parser.getEvent();
    try {
      if (event != null)
        return event; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    throw new NoSuchElementException("No Event is available.");
  }
  
  public boolean hasNext() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (parser.peekEvent() != null);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\Yaml$3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.comments;

import java.util.AbstractQueue;
import java.util.Iterator;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events.Event;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser.Parser;

public class CommentEventsCollector$1 extends AbstractQueue {
  public Event poll() {
    return parser.getEvent();
  }
  
  public boolean offer(Event paramEvent) {
    throw new UnsupportedOperationException();
  }
  
  public int size() {
    throw new UnsupportedOperationException();
  }
  
  public Iterator iterator() {
    throw new UnsupportedOperationException();
  }
  
  public Event peek() {
    return parser.peekEvent();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\comments\CommentEventsCollector$1.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
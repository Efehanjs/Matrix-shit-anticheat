package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public abstract class Event {
  private final Mark startMark;
  
  private final Mark endMark;
  
  private static final long b = o3.a(-4971273622373489655L, -2259223740987058422L, MethodHandles.lookup().lookupClass()).a(63138838375420L);
  
  public Event(Mark paramMark1, Mark paramMark2) {
    this.startMark = paramMark1;
    this.endMark = paramMark2;
  }
  
  public String getArguments() {
    return "";
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject instanceof Event)
        return toString().equals(paramObject.toString()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return toString().hashCode();
  }
  
  public Mark getStartMark() {
    return this.startMark;
  }
  
  public boolean is(Event$ID paramEvent$ID) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (getEventId() == paramEvent$ID);
  }
  
  public String toString() {
    long l = b ^ 0xB3436924AA0L;
    return "<" + getClass().getName() + "(" + getArguments() + ")>";
  }
  
  public abstract Event$ID getEventId();
  
  public Mark getEndMark() {
    return this.endMark;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\Event.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class AliasEvent extends NodeEvent {
  private static final long a = o3.a(-7124367496438785787L, 2316076957991372738L, MethodHandles.lookup().lookupClass()).a(187028211998381L);
  
  public AliasEvent(String paramString, Mark paramMark1, Mark paramMark2) {
    super(paramString, paramMark1, paramMark2);
    if (paramString == null)
      throw new NullPointerException("anchor is not specified for alias"); 
  }
  
  public Event$ID getEventId() {
    return Event$ID.Alias;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\AliasEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public abstract class NodeEvent extends Event {
  private final String anchor;
  
  private static final long c = o3.a(7652757138518553662L, -1102993672293221307L, MethodHandles.lookup().lookupClass()).a(105648117646444L);
  
  public String getAnchor() {
    return this.anchor;
  }
  
  public String getArguments() {
    long l = c ^ 0x73FE88676733L;
    return "anchor=" + this.anchor;
  }
  
  public NodeEvent(String paramString, Mark paramMark1, Mark paramMark2) {
    super(paramMark1, paramMark2);
    this.anchor = paramString;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\NodeEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
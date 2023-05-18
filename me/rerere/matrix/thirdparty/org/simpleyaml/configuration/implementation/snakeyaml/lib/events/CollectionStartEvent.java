package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public abstract class CollectionStartEvent extends NodeEvent {
  private final String tag;
  
  private final boolean implicit;
  
  private final DumperOptions.FlowStyle flowStyle;
  
  private static final long a = o3.a(992941715454048962L, -4899453597940117831L, MethodHandles.lookup().lookupClass()).a(117305866275897L);
  
  public boolean isFlow() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (DumperOptions.FlowStyle.FLOW == this.flowStyle);
  }
  
  @Deprecated
  public CollectionStartEvent(String paramString1, String paramString2, boolean paramBoolean, Mark paramMark1, Mark paramMark2, Boolean paramBoolean1) {
    this(paramString1, paramString2, paramBoolean, paramMark1, paramMark2, DumperOptions.FlowStyle.fromBoolean(paramBoolean1));
  }
  
  public String getTag() {
    return this.tag;
  }
  
  public boolean getImplicit() {
    return this.implicit;
  }
  
  public DumperOptions.FlowStyle getFlowStyle() {
    return this.flowStyle;
  }
  
  public String getArguments() {
    long l = a ^ 0x35999DB02AC3L;
    return super.getArguments() + ", tag=" + this.tag + ", implicit=" + this.implicit;
  }
  
  public CollectionStartEvent(String paramString1, String paramString2, boolean paramBoolean, Mark paramMark1, Mark paramMark2, DumperOptions.FlowStyle paramFlowStyle) {
    super(paramString1, paramMark1, paramMark2);
    this.tag = paramString2;
    this.implicit = paramBoolean;
    if (paramFlowStyle == null)
      throw new NullPointerException("Flow style must be provided."); 
    this.flowStyle = paramFlowStyle;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\CollectionStartEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
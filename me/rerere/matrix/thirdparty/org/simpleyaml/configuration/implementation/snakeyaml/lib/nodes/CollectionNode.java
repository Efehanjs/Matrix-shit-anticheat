package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public abstract class CollectionNode extends Node {
  private DumperOptions.FlowStyle flowStyle;
  
  private static final long a = o3.a(6692204377496944782L, 7753868344039612911L, MethodHandles.lookup().lookupClass()).a(105285635554919L);
  
  public DumperOptions.FlowStyle getFlowStyle() {
    return this.flowStyle;
  }
  
  public void setFlowStyle(DumperOptions.FlowStyle paramFlowStyle) {
    long l = a ^ 0x70BE0EC229F5L;
    try {
      if (paramFlowStyle == null)
        throw new NullPointerException("Flow style must be provided."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.flowStyle = paramFlowStyle;
  }
  
  public abstract List getValue();
  
  @Deprecated
  public void setFlowStyle(Boolean paramBoolean) {
    setFlowStyle(DumperOptions.FlowStyle.fromBoolean(paramBoolean));
  }
  
  @Deprecated
  public CollectionNode(Tag paramTag, Mark paramMark1, Mark paramMark2, Boolean paramBoolean) {
    this(paramTag, paramMark1, paramMark2, DumperOptions.FlowStyle.fromBoolean(paramBoolean));
  }
  
  public void setEndMark(Mark paramMark) {
    this.endMark = paramMark;
  }
  
  public CollectionNode(Tag paramTag, Mark paramMark1, Mark paramMark2, DumperOptions.FlowStyle paramFlowStyle) {
    super(paramTag, paramMark1, paramMark2);
    setFlowStyle(paramFlowStyle);
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\CollectionNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
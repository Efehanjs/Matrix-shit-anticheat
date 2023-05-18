package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public class SequenceNode extends CollectionNode {
  private final List value;
  
  private static final long b = o3.a(-7532539380761188778L, -1799199814086218579L, MethodHandles.lookup().lookupClass()).a(138760549108493L);
  
  public SequenceNode(Tag paramTag, boolean paramBoolean, List paramList, Mark paramMark1, Mark paramMark2, DumperOptions.FlowStyle paramFlowStyle) {
    super(paramTag, paramMark1, paramMark2, paramFlowStyle);
    if (paramList == null)
      throw new NullPointerException("value in a Node is required."); 
    this.value = paramList;
    this.resolved = paramBoolean;
  }
  
  @Deprecated
  public SequenceNode(Tag paramTag, List paramList, Boolean paramBoolean) {
    this(paramTag, paramList, DumperOptions.FlowStyle.fromBoolean(paramBoolean));
  }
  
  public void setListType(Class paramClass) {
    for (Node node : this.value)
      node.setType(paramClass); 
  }
  
  public SequenceNode(Tag paramTag, List paramList, DumperOptions.FlowStyle paramFlowStyle) {
    this(paramTag, true, paramList, (Mark)null, (Mark)null, paramFlowStyle);
  }
  
  public NodeId getNodeId() {
    return NodeId.sequence;
  }
  
  @Deprecated
  public SequenceNode(Tag paramTag, boolean paramBoolean, List paramList, Mark paramMark1, Mark paramMark2, Boolean paramBoolean1) {
    this(paramTag, paramBoolean, paramList, paramMark1, paramMark2, DumperOptions.FlowStyle.fromBoolean(paramBoolean1));
  }
  
  public List getValue() {
    return this.value;
  }
  
  public String toString() {
    long l = b ^ 0x5D011D8F67BAL;
    return "<" + getClass().getName() + " (tag=" + getTag() + ", value=" + getValue() + ")>";
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\SequenceNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
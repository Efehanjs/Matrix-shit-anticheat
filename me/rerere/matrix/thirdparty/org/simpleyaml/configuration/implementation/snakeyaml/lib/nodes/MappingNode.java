package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public class MappingNode extends CollectionNode {
  private boolean merged = false;
  
  private List value;
  
  private static final long b = o3.a(8140546058435486381L, 3537839731404925254L, MethodHandles.lookup().lookupClass()).a(219284552810810L);
  
  public void setTypes(Class paramClass1, Class paramClass2) {
    for (NodeTuple nodeTuple : this.value) {
      nodeTuple.getValueNode().setType(paramClass2);
      nodeTuple.getKeyNode().setType(paramClass1);
    } 
  }
  
  @Deprecated
  public MappingNode(Tag paramTag, boolean paramBoolean, List paramList, Mark paramMark1, Mark paramMark2, Boolean paramBoolean1) {
    this(paramTag, paramBoolean, paramList, paramMark1, paramMark2, DumperOptions.FlowStyle.fromBoolean(paramBoolean1));
  }
  
  public boolean isMerged() {
    return this.merged;
  }
  
  public MappingNode(Tag paramTag, List paramList, DumperOptions.FlowStyle paramFlowStyle) {
    this(paramTag, true, paramList, (Mark)null, (Mark)null, paramFlowStyle);
  }
  
  public MappingNode(Tag paramTag, boolean paramBoolean, List paramList, Mark paramMark1, Mark paramMark2, DumperOptions.FlowStyle paramFlowStyle) {
    super(paramTag, paramMark1, paramMark2, paramFlowStyle);
    if (paramList == null)
      throw new NullPointerException("value in a Node is required."); 
    this.value = paramList;
    this.resolved = paramBoolean;
  }
  
  public List getValue() {
    return this.value;
  }
  
  public String toString() {
    long l = b ^ 0x243558BA60D2L;
    StringBuilder stringBuilder = new StringBuilder();
    for (NodeTuple nodeTuple : getValue()) {
      try {
        stringBuilder.append("{ key=");
        stringBuilder.append(nodeTuple.getKeyNode());
        stringBuilder.append("; value=");
        if (nodeTuple.getValueNode() instanceof CollectionNode) {
          stringBuilder.append(System.identityHashCode(nodeTuple.getValueNode()));
        } else {
          stringBuilder.append(nodeTuple);
        } 
      } catch (NullPointerException nullPointerException) {
        throw b(null);
      } 
      stringBuilder.append(" }");
    } 
    String str = stringBuilder.toString();
    return "<" + getClass().getName() + " (tag=" + getTag() + ", values=" + str + ")>";
  }
  
  public NodeId getNodeId() {
    return NodeId.mapping;
  }
  
  public void setMerged(boolean paramBoolean) {
    this.merged = paramBoolean;
  }
  
  public void setValue(List paramList) {
    this.value = paramList;
  }
  
  @Deprecated
  public MappingNode(Tag paramTag, List paramList, Boolean paramBoolean) {
    this(paramTag, paramList, DumperOptions.FlowStyle.fromBoolean(paramBoolean));
  }
  
  public void setOnlyKeyType(Class paramClass) {
    for (NodeTuple nodeTuple : this.value)
      nodeTuple.getKeyNode().setType(paramClass); 
  }
  
  private static NullPointerException b(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\MappingNode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;

public class SafeConstructor$ConstructYamlSeq implements Construct {
  private static final long a = o3.a(-3710397433771606973L, -3925391168353729440L, MethodHandles.lookup().lookupClass()).a(34107850397585L);
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    long l = a ^ 0x128A26470631L;
    try {
      if (paramNode.isTwoStepsConstruction()) {
        SafeConstructor.this.constructSequenceStep2((SequenceNode)paramNode, (List)paramObject);
      } else {
        throw new YAMLException("Unexpected recursive sequence structure. Node: " + paramNode);
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  public Object construct(Node paramNode) {
    SequenceNode sequenceNode = (SequenceNode)paramNode;
    try {
      if (paramNode.isTwoStepsConstruction())
        return SafeConstructor.this.newList(sequenceNode); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return SafeConstructor.this.constructSequence(sequenceNode);
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlSeq.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
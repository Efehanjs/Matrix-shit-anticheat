package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.SequenceNode;

public class SafeConstructor$ConstructYamlPairs extends AbstractConstruct {
  private static final long b = o3.a(-509358306398077657L, 5913824294610333319L, MethodHandles.lookup().lookupClass()).a(17263980990258L);
  
  public Object construct(Node paramNode) {
    long l = b ^ 0x101A07280BA6L;
    try {
      if (!(paramNode instanceof SequenceNode))
        throw new ConstructorException("while constructing pairs", paramNode.getStartMark(), "expected a sequence, but found " + paramNode.getNodeId(), paramNode.getStartMark()); 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    SequenceNode sequenceNode = (SequenceNode)paramNode;
    ArrayList<Object[]> arrayList = new ArrayList(sequenceNode.getValue().size());
    for (Node node1 : sequenceNode.getValue()) {
      try {
        if (!(node1 instanceof MappingNode))
          throw new ConstructorException("while constructingpairs", paramNode.getStartMark(), "expected a mapping of length 1, but found " + node1.getNodeId(), node1.getStartMark()); 
      } catch (ConstructorException constructorException) {
        throw a(null);
      } 
      MappingNode mappingNode = (MappingNode)node1;
      try {
        if (mappingNode.getValue().size() != 1)
          throw new ConstructorException("while constructing pairs", paramNode.getStartMark(), "expected a single mapping item, but found " + mappingNode.getValue().size() + " items", mappingNode.getStartMark()); 
      } catch (ConstructorException constructorException) {
        throw a(null);
      } 
      Node node2 = ((NodeTuple)mappingNode.getValue().get(0)).getKeyNode();
      Node node3 = ((NodeTuple)mappingNode.getValue().get(0)).getValueNode();
      Object object1 = SafeConstructor.this.constructObject(node2);
      Object object2 = SafeConstructor.this.constructObject(node3);
      arrayList.add(new Object[] { object1, object2 });
    } 
    return arrayList;
  }
  
  private static ConstructorException a(ConstructorException paramConstructorException) {
    return paramConstructorException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlPairs.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
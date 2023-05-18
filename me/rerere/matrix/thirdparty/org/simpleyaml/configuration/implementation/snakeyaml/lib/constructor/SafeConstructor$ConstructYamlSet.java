package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class SafeConstructor$ConstructYamlSet implements Construct {
  private static final long a = o3.a(-3418806393998880532L, 688378745758876720L, MethodHandles.lookup().lookupClass()).a(25904223011115L);
  
  public Object construct(Node paramNode) {
    try {
      if (paramNode.isTwoStepsConstruction()) {
        try {
        
        } catch (YAMLException yAMLException) {
          throw a(null);
        } 
        return SafeConstructor.this.constructedObjects.containsKey(paramNode) ? SafeConstructor.this.constructedObjects.get(paramNode) : SafeConstructor.this.createDefaultSet(((MappingNode)paramNode).getValue().size());
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return SafeConstructor.this.constructSet((MappingNode)paramNode);
  }
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    long l = a ^ 0x5EAF5A768A0FL;
    try {
      if (paramNode.isTwoStepsConstruction()) {
        SafeConstructor.this.constructSet2ndStep((MappingNode)paramNode, (Set)paramObject);
      } else {
        throw new YAMLException("Unexpected recursive set structure. Node: " + paramNode);
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
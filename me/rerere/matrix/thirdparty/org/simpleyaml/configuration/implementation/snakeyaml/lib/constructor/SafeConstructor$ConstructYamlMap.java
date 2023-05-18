package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class SafeConstructor$ConstructYamlMap implements Construct {
  private static final long b = o3.a(-7478404560323084282L, -3490796305294428143L, MethodHandles.lookup().lookupClass()).a(181437051069286L);
  
  public Object construct(Node paramNode) {
    MappingNode mappingNode = (MappingNode)paramNode;
    try {
      if (paramNode.isTwoStepsConstruction())
        return SafeConstructor.this.createDefaultMap(mappingNode.getValue().size()); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return SafeConstructor.this.constructMapping(mappingNode);
  }
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    long l = b ^ 0x3733FFC02AFBL;
    try {
      if (paramNode.isTwoStepsConstruction()) {
        SafeConstructor.this.constructMapping2ndStep((MappingNode)paramNode, (Map)paramObject);
      } else {
        throw new YAMLException("Unexpected recursive mapping structure. Node: " + paramNode);
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlMap.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
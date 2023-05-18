package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor.SafeConstructor;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.MappingNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.NodeTuple;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SnakeYamlConstructor extends SafeConstructor {
  private static final long a = o3.a(5254330348170804576L, 2394729974092297951L, MethodHandles.lookup().lookupClass()).a(141212121806598L);
  
  public Object construct(Node paramNode) {
    return constructObject(paramNode);
  }
  
  public void flattenMapping(MappingNode paramMappingNode) {
    super.flattenMapping(paramMappingNode);
  }
  
  public SnakeYamlConstructor() {
    this.yamlConstructors.put(Tag.MAP, new SnakeYamlConstructor$ConstructCustomObject(this, null));
  }
  
  public boolean hasSerializedTypeKey(MappingNode paramMappingNode) {
    long l = a ^ 0x47FECC53872DL;
    for (NodeTuple nodeTuple : paramMappingNode.getValue()) {
      Node node = nodeTuple.getKeyNode();
      if (node instanceof ScalarNode) {
        String str = ((ScalarNode)node).getValue();
        try {
          if (str.equals("=="))
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlConstructor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
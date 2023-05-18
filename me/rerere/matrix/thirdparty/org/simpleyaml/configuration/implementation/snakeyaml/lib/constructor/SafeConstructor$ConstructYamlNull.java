package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlNull extends AbstractConstruct {
  public Object construct(Node paramNode) {
    try {
      if (paramNode != null)
        SafeConstructor.this.constructScalar((ScalarNode)paramNode); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlNull.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlStr extends AbstractConstruct {
  public Object construct(Node paramNode) {
    return SafeConstructor.this.constructScalar((ScalarNode)paramNode);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlStr.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
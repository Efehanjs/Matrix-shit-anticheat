package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlBool extends AbstractConstruct {
  public Object construct(Node paramNode) {
    String str = SafeConstructor.this.constructScalar((ScalarNode)paramNode);
    return SafeConstructor.access$000().get(str.toLowerCase());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlBool.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public interface Construct {
  Object construct(Node paramNode);
  
  void construct2ndStep(Node paramNode, Object paramObject);
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\Construct.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
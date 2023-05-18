package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.util.IdentityHashMap;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.AnchorNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class BaseRepresenter$1 extends IdentityHashMap {
  private static final long serialVersionUID = -5576159264232131854L;
  
  public Node put(Object paramObject, Node paramNode) {
    return (Node)super.put(paramObject, new AnchorNode(paramNode));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\BaseRepresenter$1.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
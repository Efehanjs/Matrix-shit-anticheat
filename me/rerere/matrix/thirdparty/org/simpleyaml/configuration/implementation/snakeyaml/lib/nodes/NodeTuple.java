package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public final class NodeTuple {
  private final Node valueNode;
  
  private final Node keyNode;
  
  private static final long a = o3.a(5383002697241374969L, 4625640032114213713L, MethodHandles.lookup().lookupClass()).a(30946516826226L);
  
  public NodeTuple(Node paramNode1, Node paramNode2) {
    if (paramNode1 != null)
      try {
        if (paramNode2 != null) {
          this.keyNode = paramNode1;
          this.valueNode = paramNode2;
          return;
        } 
        throw new NullPointerException("Nodes must be provided.");
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      }  
    throw new NullPointerException("Nodes must be provided.");
  }
  
  public String toString() {
    long l = a ^ 0x74007DFE3005L;
    return "<NodeTuple keyNode=" + this.keyNode + "; valueNode=" + this.valueNode + ">";
  }
  
  public Node getKeyNode() {
    return this.keyNode;
  }
  
  public Node getValueNode() {
    return this.valueNode;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\NodeTuple.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public abstract class AbstractConstruct implements Construct {
  private static final long a = o3.a(6415729422972400819L, 2170902157233901160L, MethodHandles.lookup().lookupClass()).a(193551843812566L);
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    long l = a ^ 0x5E897F6758C6L;
    try {
      if (paramNode.isTwoStepsConstruction())
        throw new IllegalStateException("Not Implemented in " + getClass().getName()); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new YAMLException("Unexpected recursive structure for Node: " + paramNode);
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\AbstractConstruct.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
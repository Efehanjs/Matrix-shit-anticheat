package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum NodeId {
  mapping, sequence, anchor, scalar;
  
  static {
    sequence = new NodeId("sequence", 1);
    mapping = new NodeId("mapping", 2);
    anchor = new NodeId("anchor", 3);
    $VALUES = new NodeId[] { scalar, sequence, mapping, anchor };
  }
  
  static {
    long l = o3.a(6499972299141357492L, -90225478077346699L, MethodHandles.lookup().lookupClass()).a(170820181251981L) ^ 0x6C2050DC57CDL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\nodes\NodeId.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
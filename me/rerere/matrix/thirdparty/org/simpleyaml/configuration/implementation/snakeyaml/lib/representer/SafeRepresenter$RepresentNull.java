package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentNull implements Represent {
  private static final long a = o3.a(-8344917914287203420L, 722720669793247261L, MethodHandles.lookup().lookupClass()).a(165227442942623L);
  
  public Node representData(Object paramObject) {
    long l = a ^ 0x2BFE72D0CD5EL;
    return SafeRepresenter.this.representScalar(Tag.NULL, "null");
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentNull.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
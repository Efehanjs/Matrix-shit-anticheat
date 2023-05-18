package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentBoolean implements Represent {
  private static final long a = o3.a(1658458158330774283L, 3474361844292495178L, MethodHandles.lookup().lookupClass()).a(167341283558370L);
  
  public Node representData(Object paramObject) {
    String str;
    long l = a ^ 0x22173081697L;
    if (Boolean.TRUE.equals(paramObject)) {
      str = "true";
    } else {
      str = "false";
    } 
    return SafeRepresenter.this.representScalar(Tag.BOOL, str);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentBoolean.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
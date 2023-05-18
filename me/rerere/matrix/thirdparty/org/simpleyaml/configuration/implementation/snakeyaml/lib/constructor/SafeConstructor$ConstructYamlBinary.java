package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.biz.base64Coder.Base64Coder;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlBinary extends AbstractConstruct {
  private static final long b = o3.a(7196511351991562739L, -814065715457113085L, MethodHandles.lookup().lookupClass()).a(117995294056877L);
  
  public Object construct(Node paramNode) {
    long l = b ^ 0x576BBD0DF017L;
    String str = SafeConstructor.this.constructScalar((ScalarNode)paramNode).replaceAll("\\s", "");
    return Base64Coder.decode(str.toCharArray());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlBinary.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
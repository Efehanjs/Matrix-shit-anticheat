package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.biz.base64Coder.Base64Coder;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentByteArray implements Represent {
  public Node representData(Object paramObject) {
    char[] arrayOfChar = Base64Coder.encode((byte[])paramObject);
    return SafeRepresenter.this.representScalar(Tag.BINARY, String.valueOf(arrayOfChar), DumperOptions.ScalarStyle.LITERAL);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentByteArray.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
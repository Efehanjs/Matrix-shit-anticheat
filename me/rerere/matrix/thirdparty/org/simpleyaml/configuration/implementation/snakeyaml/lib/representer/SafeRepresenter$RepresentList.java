package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.util.List;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentList implements Represent {
  public Node representData(Object paramObject) {
    return SafeRepresenter.this.representSequence(SafeRepresenter.this.getTag(paramObject.getClass(), Tag.SEQ), (List)paramObject, DumperOptions.FlowStyle.AUTO);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentList.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
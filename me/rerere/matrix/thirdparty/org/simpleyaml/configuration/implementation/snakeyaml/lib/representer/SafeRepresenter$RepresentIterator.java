package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.util.Iterator;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentIterator implements Represent {
  public Node representData(Object paramObject) {
    Iterator iterator = (Iterator)paramObject;
    return SafeRepresenter.this.representSequence(SafeRepresenter.this.getTag(paramObject.getClass(), Tag.SEQ), new SafeRepresenter$IteratorWrapper(iterator), DumperOptions.FlowStyle.AUTO);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentIterator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
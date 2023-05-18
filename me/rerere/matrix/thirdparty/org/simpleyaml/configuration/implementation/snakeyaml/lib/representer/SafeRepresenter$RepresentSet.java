package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.util.LinkedHashMap;
import java.util.Set;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentSet implements Represent {
  public Node representData(Object paramObject) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    Set set = (Set)paramObject;
    for (Object object : set)
      linkedHashMap.put(object, null); 
    return SafeRepresenter.this.representMapping(SafeRepresenter.this.getTag(paramObject.getClass(), Tag.SET), linkedHashMap, DumperOptions.FlowStyle.AUTO);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
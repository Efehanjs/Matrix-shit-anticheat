package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer.SafeRepresenter;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.serialization.ConfigurationSerializable;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.serialization.ConfigurationSerialization;

public final class SnakeYamlRepresenter$RepresentConfigurationSerializable extends SafeRepresenter.RepresentMap {
  private static final long a = o3.a(7034548222294009722L, -5433081845925861039L, MethodHandles.lookup().lookupClass()).a(198014777531006L);
  
  public Node representData(Object paramObject) {
    long l = a ^ 0x29EB627F5388L;
    ConfigurationSerializable configurationSerializable = (ConfigurationSerializable)paramObject;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put("==", ConfigurationSerialization.getAlias(configurationSerializable.getClass()));
    linkedHashMap.putAll(configurationSerializable.serialize());
    return super.representData(linkedHashMap);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlRepresenter$RepresentConfigurationSerializable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
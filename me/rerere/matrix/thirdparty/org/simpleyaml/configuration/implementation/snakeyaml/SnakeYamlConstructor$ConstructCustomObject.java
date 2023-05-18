package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml;

import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor.SafeConstructor;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.serialization.ConfigurationSerialization;

public final class SnakeYamlConstructor$ConstructCustomObject extends SafeConstructor.ConstructYamlMap {
  private static final long a = o3.a(-6864410051675200853L, -1352890187159590619L, MethodHandles.lookup().lookupClass()).a(91654959096533L);
  
  public Object construct(Node paramNode) {
    long l = a ^ 0x2F809C432C95L;
    try {
      if (paramNode.isTwoStepsConstruction())
        throw new YAMLException("Unexpected referential mapping structure. Node: " + paramNode); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Map map = (Map)super.construct(paramNode);
    try {
      if (!map.containsKey("=="))
        return map; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>(map.size());
    for (Map.Entry entry : map.entrySet())
      linkedHashMap.put(entry.getKey().toString(), entry.getValue()); 
    try {
      return ConfigurationSerialization.deserializeObject(linkedHashMap);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new YAMLException("Could not deserialize object", illegalArgumentException);
    } 
  }
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    long l = a ^ 0x4DC8D316EBC7L;
    throw new YAMLException("Unexpected referential mapping structure. Node: " + paramNode);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\SnakeYamlConstructor$ConstructCustomObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
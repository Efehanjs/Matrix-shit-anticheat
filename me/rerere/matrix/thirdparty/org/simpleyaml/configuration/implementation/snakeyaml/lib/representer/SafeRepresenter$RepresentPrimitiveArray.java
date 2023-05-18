package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentPrimitiveArray implements Represent {
  private static final long a = o3.a(-7299821528128599926L, -1505609815930585354L, MethodHandles.lookup().lookupClass()).a(208509313341224L);
  
  public Node representData(Object paramObject) {
    long l = a ^ 0x13645BC82965L;
    Class<?> clazz = paramObject.getClass().getComponentType();
    try {
      if (byte.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asByteList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (short.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asShortList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (int.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asIntList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (long.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asLongList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (float.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asFloatList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (double.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asDoubleList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (char.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asCharList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (boolean.class == clazz)
        return SafeRepresenter.this.representSequence(Tag.SEQ, asBooleanList(paramObject), DumperOptions.FlowStyle.AUTO); 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    throw new YAMLException("Unexpected primitive '" + clazz.getCanonicalName() + "'");
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentPrimitiveArray.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
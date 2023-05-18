package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public class Constructor$ConstructYamlObject implements Construct {
  private static final long a = o3.a(1587344909723956464L, -5256772128492737122L, MethodHandles.lookup().lookupClass()).a(220844572560416L);
  
  public void construct2ndStep(Node paramNode, Object paramObject) {
    long l = a ^ 0x71175415A811L;
    try {
      getConstructor(paramNode).construct2ndStep(paramNode, paramObject);
    } catch (Exception exception) {
      throw new ConstructorException(null, null, "Can't construct a second step for a java object for " + paramNode.getTag() + "; exception=" + exception.getMessage(), paramNode.getStartMark(), exception);
    } 
  }
  
  public Object construct(Node paramNode) {
    long l = a ^ 0x135F1B406F43L;
    try {
      return getConstructor(paramNode).construct(paramNode);
    } catch (ConstructorException constructorException) {
      throw constructorException;
    } catch (Exception exception) {
      throw new ConstructorException(null, null, "Can't construct a java object for " + paramNode.getTag() + "; exception=" + exception.getMessage(), paramNode.getStartMark(), exception);
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\Constructor$ConstructYamlObject.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
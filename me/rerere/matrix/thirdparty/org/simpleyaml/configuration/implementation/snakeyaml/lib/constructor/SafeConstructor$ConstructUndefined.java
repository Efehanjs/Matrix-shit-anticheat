package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;

public final class SafeConstructor$ConstructUndefined extends AbstractConstruct {
  private static final long b = o3.a(-5468187823878594319L, 2921577541735477111L, MethodHandles.lookup().lookupClass()).a(53759969936204L);
  
  public Object construct(Node paramNode) {
    long l = b ^ 0x7DCF41A0809DL;
    throw new ConstructorException(null, null, "could not determine a constructor for the tag " + paramNode.getTag(), paramNode.getStartMark());
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructUndefined.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
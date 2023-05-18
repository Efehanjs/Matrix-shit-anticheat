package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public class DuplicateKeyException extends ConstructorException {
  private static final long a = o3.a(4877379255161291804L, -8382053285784103652L, MethodHandles.lookup().lookupClass()).a(119432535753351L);
  
  public DuplicateKeyException(Mark paramMark1, Object paramObject, Mark paramMark2) {
    super("while constructing a mapping", paramMark1, "found duplicate key " + paramObject, paramMark2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\DuplicateKeyException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
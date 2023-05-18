package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.introspector;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum BeanAccess {
  DEFAULT, PROPERTY, FIELD;
  
  static {
    PROPERTY = new BeanAccess("PROPERTY", 2);
    $VALUES = new BeanAccess[] { DEFAULT, FIELD, PROPERTY };
  }
  
  static {
    long l = o3.a(8620628500583823124L, -6223614835593440284L, MethodHandles.lookup().lookupClass()).a(27334231610090L) ^ 0x7762107027CBL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\introspector\BeanAccess.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
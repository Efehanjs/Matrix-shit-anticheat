package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class Constructor$ConstructScalar extends AbstractConstruct {
  private static final long b = o3.a(-8723511830034118393L, -3587108862256039215L, MethodHandles.lookup().lookupClass()).a(12664285577273L);
  
  public Object construct(Node paramNode) {
    long l = b ^ 0x58050F41EF0CL;
    ScalarNode scalarNode = (ScalarNode)paramNode;
    Class<String> clazz = scalarNode.getType();
    Object object = Constructor.this.newInstance(clazz, (Node)scalarNode, false);
    try {
      if (object != BaseConstructor.NOT_INSTANTIATED_OBJECT)
        return object; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (!clazz.isPrimitive())
        try {
          if (clazz != String.class)
            try {
              if (!Number.class.isAssignableFrom(clazz))
                try {
                  if (clazz != Boolean.class)
                    try {
                      if (!Date.class.isAssignableFrom(clazz))
                        try {
                          if (clazz != Character.class)
                            try {
                              if (clazz != BigInteger.class)
                                try {
                                  if (clazz != BigDecimal.class)
                                    try {
                                      if (!Enum.class.isAssignableFrom(clazz))
                                        try {
                                          if (!Tag.BINARY.equals(scalarNode.getTag())) {
                                            Object object1;
                                            Object object2;
                                            try {
                                              if (Calendar.class.isAssignableFrom(clazz) || clazz == UUID.class)
                                                return constructStandardJavaInstance(clazz, scalarNode); 
                                            } catch (Exception exception) {
                                              throw a(null);
                                            } 
                                            Constructor[] arrayOfConstructor = (Constructor[])clazz.getDeclaredConstructors();
                                            byte b = 0;
                                            Constructor<String> constructor = null;
                                            for (Constructor constructor1 : arrayOfConstructor) {
                                              if ((constructor1.getParameterTypes()).length == 1) {
                                                b++;
                                                constructor = constructor1;
                                              } 
                                            } 
                                            try {
                                              if (constructor == null)
                                                throw new YAMLException("No single argument constructor found for " + clazz); 
                                            } catch (Exception exception) {
                                              throw a(null);
                                            } 
                                            if (b == 1) {
                                              object2 = constructStandardJavaInstance(constructor.getParameterTypes()[0], scalarNode);
                                            } else {
                                              object2 = Constructor.this.constructScalar(scalarNode);
                                              try {
                                                constructor = clazz.getDeclaredConstructor(new Class[] { String.class });
                                              } catch (Exception exception) {
                                                throw new YAMLException("Can't construct a java object for scalar " + scalarNode.getTag() + "; No String constructor found. Exception=" + exception.getMessage(), exception);
                                              } 
                                            } 
                                            try {
                                              constructor.setAccessible(true);
                                              object1 = constructor.newInstance(new Object[] { object2 });
                                            } catch (Exception exception) {
                                              throw new ConstructorException(null, null, "Can't construct a java object for scalar " + scalarNode.getTag() + "; exception=" + exception.getMessage(), scalarNode.getStartMark(), exception);
                                            } 
                                            return object1;
                                          } 
                                        } catch (Exception exception) {
                                          throw a(null);
                                        }  
                                    } catch (Exception exception) {
                                      throw a(null);
                                    }  
                                } catch (Exception exception) {
                                  throw a(null);
                                }  
                            } catch (Exception exception) {
                              throw a(null);
                            }  
                        } catch (Exception exception) {
                          throw a(null);
                        }  
                    } catch (Exception exception) {
                      throw a(null);
                    }  
                } catch (Exception exception) {
                  throw a(null);
                }  
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        }  
    } catch (Exception exception) {
      throw a(null);
    } 
    return constructStandardJavaInstance(clazz, scalarNode);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\Constructor$ConstructScalar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
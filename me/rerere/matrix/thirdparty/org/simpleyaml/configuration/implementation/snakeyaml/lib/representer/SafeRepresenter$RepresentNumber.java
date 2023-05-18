package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public class SafeRepresenter$RepresentNumber implements Represent {
  private static final long a = o3.a(-3408601116211931561L, -2364943961749167362L, MethodHandles.lookup().lookupClass()).a(33753343434766L);
  
  public Node representData(Object paramObject) {
    long l = a ^ 0x3951D5FBE258L;
    try {
      if (!(paramObject instanceof Byte))
        try {
          if (!(paramObject instanceof Short))
            try {
              if (!(paramObject instanceof Integer)) {
                String str1;
                try {
                  if (paramObject instanceof Long || paramObject instanceof java.math.BigInteger) {
                    Tag tag2 = Tag.INT;
                    str1 = paramObject.toString();
                    return SafeRepresenter.this.representScalar(SafeRepresenter.this.getTag(paramObject.getClass(), tag2), str1);
                  } 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                Number number = (Number)paramObject;
                Tag tag1 = Tag.FLOAT;
                if (number.equals(Double.valueOf(Double.NaN))) {
                  str1 = ".NaN";
                } else if (number.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                  str1 = ".inf";
                } else if (number.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                  str1 = "-.inf";
                } else {
                  str1 = number.toString();
                } 
                return SafeRepresenter.this.representScalar(SafeRepresenter.this.getTag(paramObject.getClass(), tag1), str1);
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Tag tag = Tag.INT;
    String str = paramObject.toString();
    return SafeRepresenter.this.representScalar(SafeRepresenter.this.getTag(paramObject.getClass(), tag), str);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentNumber.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlFloat extends AbstractConstruct {
  private static final long b = o3.a(488335825009808588L, 471858305678506401L, MethodHandles.lookup().lookupClass()).a(19963033345989L);
  
  public Object construct(Node paramNode) {
    long l = b ^ 0x7764AC4A45E3L;
    String str1 = SafeConstructor.this.constructScalar((ScalarNode)paramNode).replaceAll("_", "");
    try {
      if (str1.isEmpty())
        throw new ConstructorException("while constructing a float", paramNode.getStartMark(), "found empty value", paramNode.getStartMark()); 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    byte b = 1;
    char c = str1.charAt(0);
    if (c == '-') {
      b = -1;
      str1 = str1.substring(1);
    } else if (c == '+') {
      str1 = str1.substring(1);
    } 
    String str2 = str1.toLowerCase();
    try {
      if (".inf".equals(str2)) {
        try {
        
        } catch (ConstructorException constructorException) {
          throw a(null);
        } 
        return Double.valueOf((b == -1) ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
      } 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    try {
      if (".nan".equals(str2))
        return Double.valueOf(Double.NaN); 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    if (str1.indexOf(':') != -1) {
      String[] arrayOfString = str1.split(":");
      int i = 1;
      double d = 0.0D;
      byte b1 = 0;
      int j = arrayOfString.length;
      while (b1 < j) {
        d += Double.parseDouble(arrayOfString[j - b1 - 1]) * i;
        i *= 60;
        b1++;
      } 
      return Double.valueOf(b * d);
    } 
    Double double_ = Double.valueOf(str1);
    return Double.valueOf(double_.doubleValue() * b);
  }
  
  private static ConstructorException a(ConstructorException paramConstructorException) {
    return paramConstructorException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlFloat.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
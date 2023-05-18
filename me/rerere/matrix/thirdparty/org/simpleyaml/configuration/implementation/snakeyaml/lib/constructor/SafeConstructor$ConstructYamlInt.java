package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.constructor;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.ScalarNode;

public class SafeConstructor$ConstructYamlInt extends AbstractConstruct {
  private static final long b = o3.a(-5110201534734976102L, 7323180193839586790L, MethodHandles.lookup().lookupClass()).a(117576424350970L);
  
  public Object construct(Node paramNode) {
    long l = b ^ 0x37230387AD9DL;
    String str = SafeConstructor.this.constructScalar((ScalarNode)paramNode).replaceAll("_", "");
    try {
      if (str.isEmpty())
        throw new ConstructorException("while constructing an int", paramNode.getStartMark(), "found empty value", paramNode.getStartMark()); 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    byte b = 1;
    char c = str.charAt(0);
    if (c == '-') {
      b = -1;
      str = str.substring(1);
    } else if (c == '+') {
      str = str.substring(1);
    } 
    byte b1 = 10;
    try {
      if ("0".equals(str))
        return Integer.valueOf(0); 
    } catch (ConstructorException constructorException) {
      throw a(null);
    } 
    if (str.startsWith("0b")) {
      str = str.substring(2);
      b1 = 2;
    } else if (str.startsWith("0x")) {
      str = str.substring(2);
      b1 = 16;
    } else if (str.startsWith("0")) {
      str = str.substring(1);
      b1 = 8;
    } else {
      if (str.indexOf(':') != -1) {
        String[] arrayOfString = str.split(":");
        int i = 1;
        int j = 0;
        byte b2 = 0;
        int k = arrayOfString.length;
        while (b2 < k) {
          j = (int)(j + Long.parseLong(arrayOfString[k - b2 - 1]) * i);
          i *= 60;
          b2++;
        } 
        return SafeConstructor.access$100(SafeConstructor.this, b, String.valueOf(j), 10);
      } 
      return SafeConstructor.access$100(SafeConstructor.this, b, str, 10);
    } 
    return SafeConstructor.access$100(SafeConstructor.this, b, str, b1);
  }
  
  private static ConstructorException a(ConstructorException paramConstructorException) {
    return paramConstructorException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\constructor\SafeConstructor$ConstructYamlInt.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
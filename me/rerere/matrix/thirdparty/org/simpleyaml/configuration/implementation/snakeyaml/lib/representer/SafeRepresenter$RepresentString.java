package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.representer;

import java.lang.invoke.MethodHandles;
import java.nio.charset.StandardCharsets;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.biz.base64Coder.Base64Coder;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Node;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader.StreamReader;

public class SafeRepresenter$RepresentString implements Represent {
  private static final long a = o3.a(-1281302496029506442L, -1725657133777934103L, MethodHandles.lookup().lookupClass()).a(90632198882596L);
  
  public Node representData(Object paramObject) {
    long l = a ^ 0x3306FB9ED24BL;
    Tag tag = Tag.STR;
    DumperOptions.ScalarStyle scalarStyle = null;
    String str = paramObject.toString();
    try {
      if (SafeRepresenter.this.nonPrintableStyle == DumperOptions.NonPrintableStyle.BINARY && !StreamReader.isPrintable(str)) {
        tag = Tag.BINARY;
        byte[] arrayOfByte = str.getBytes(StandardCharsets.UTF_8);
        String str1 = new String(arrayOfByte, StandardCharsets.UTF_8);
        try {
          if (!str1.equals(str))
            throw new YAMLException("invalid string value has occurred"); 
        } catch (YAMLException yAMLException) {
          throw a(null);
        } 
        char[] arrayOfChar = Base64Coder.encode(arrayOfByte);
        str = String.valueOf(arrayOfChar);
        scalarStyle = DumperOptions.ScalarStyle.LITERAL;
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      if (SafeRepresenter.this.defaultScalarStyle == DumperOptions.ScalarStyle.PLAIN && SafeRepresenter.access$000().matcher(str).find())
        scalarStyle = DumperOptions.ScalarStyle.LITERAL; 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    return SafeRepresenter.this.representScalar(tag, str, scalarStyle);
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\representer\SafeRepresenter$RepresentString.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
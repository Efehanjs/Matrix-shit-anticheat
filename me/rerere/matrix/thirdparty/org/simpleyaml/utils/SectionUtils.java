package me.rerere.matrix.thirdparty.org.simpleyaml.utils;

import java.util.Map;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.ConfigurationSection;

public final class SectionUtils {
  public static void convertMapsToSections(Map paramMap, ConfigurationSection paramConfigurationSection) {
    try {
      if (paramMap == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (Map.Entry entry : paramMap.entrySet()) {
      String str;
      Object object1 = entry.getKey();
      if (object1 == null) {
        str = "";
      } else {
        str = object1.toString();
      } 
      Object object2 = entry.getValue();
      try {
        if (object2 instanceof Map) {
          convertMapsToSections((Map)object2, paramConfigurationSection.createSection(str));
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      paramConfigurationSection.set(str, object2);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyam\\utils\SectionUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
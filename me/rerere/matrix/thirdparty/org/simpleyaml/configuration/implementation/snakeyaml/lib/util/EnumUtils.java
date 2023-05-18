package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public class EnumUtils {
  private static final long a = o3.a(-1253482642292576475L, -1642926689333780482L, MethodHandles.lookup().lookupClass()).a(240593691540865L);
  
  public static Enum findEnumInsensitiveCase(Class<Enum> paramClass, String paramString) {
    long l = a ^ 0x679221288BAAL;
    for (Enum enum_ : (Enum[])paramClass.getEnumConstants()) {
      try {
        if (enum_.name().compareToIgnoreCase(paramString) == 0)
          return enum_; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    throw new IllegalArgumentException("No enum constant " + paramClass.getCanonicalName() + "." + paramString);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\li\\util\EnumUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
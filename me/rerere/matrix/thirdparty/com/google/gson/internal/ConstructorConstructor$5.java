package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.JsonIOException;

public class ConstructorConstructor$5 implements ObjectConstructor {
  private static final long a = o3.a(8868166541000987932L, 3255133169398696912L, null).a(76752886821389L);
  
  public Object construct() {
    long l = a ^ 0x3C3658A80F7CL;
    if (type instanceof ParameterizedType) {
      Type type = ((ParameterizedType)type).getActualTypeArguments()[0];
      try {
        if (type instanceof Class)
          return EnumSet.noneOf((Class<Enum>)type); 
      } catch (JsonIOException jsonIOException) {
        throw a(null);
      } 
      throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    } 
    throw new JsonIOException("Invalid EnumSet type: " + type.toString());
  }
  
  private static JsonIOException a(JsonIOException paramJsonIOException) {
    return paramJsonIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\ConstructorConstructor$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
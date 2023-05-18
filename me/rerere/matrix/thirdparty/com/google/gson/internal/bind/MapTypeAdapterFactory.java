package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.lang.reflect.Type;
import java.util.Map;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ConstructorConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ObjectConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class MapTypeAdapterFactory implements TypeAdapterFactory {
  private final ConstructorConstructor constructorConstructor;
  
  public final boolean complexMapKeySerialization;
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Type type = paramTypeToken.getType();
    Class<?> clazz = paramTypeToken.getRawType();
    try {
      if (!Map.class.isAssignableFrom(clazz))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Class clazz1 = .Gson.Types.getRawType(type);
    Type[] arrayOfType = .Gson.Types.getMapKeyAndValueTypes(type, clazz1);
    TypeAdapter typeAdapter1 = getKeyAdapter(paramGson, arrayOfType[0]);
    TypeAdapter typeAdapter2 = paramGson.getAdapter(TypeToken.get(arrayOfType[1]));
    ObjectConstructor objectConstructor = this.constructorConstructor.get(paramTypeToken);
    return new MapTypeAdapterFactory$Adapter(this, paramGson, arrayOfType[0], typeAdapter1, arrayOfType[1], typeAdapter2, objectConstructor);
  }
  
  public MapTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, boolean paramBoolean) {
    this.constructorConstructor = paramConstructorConstructor;
    this.complexMapKeySerialization = paramBoolean;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\MapTypeAdapterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
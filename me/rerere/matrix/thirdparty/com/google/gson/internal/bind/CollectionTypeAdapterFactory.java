package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.lang.reflect.Type;
import java.util.Collection;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.internal.;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ConstructorConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ObjectConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
  private final ConstructorConstructor constructorConstructor;
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Type type1 = paramTypeToken.getType();
    Class<?> clazz = paramTypeToken.getRawType();
    try {
      if (!Collection.class.isAssignableFrom(clazz))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Type type2 = .Gson.Types.getCollectionElementType(type1, clazz);
    TypeAdapter typeAdapter = paramGson.getAdapter(TypeToken.get(type2));
    ObjectConstructor objectConstructor = this.constructorConstructor.get(paramTypeToken);
    return new CollectionTypeAdapterFactory$Adapter(paramGson, type2, typeAdapter, objectConstructor);
  }
  
  public CollectionTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor) {
    this.constructorConstructor = paramConstructorConstructor;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\CollectionTypeAdapterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
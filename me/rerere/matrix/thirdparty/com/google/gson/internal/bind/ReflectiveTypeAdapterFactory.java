package me.rerere.matrix.thirdparty.com.google.gson.internal.bind;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.FieldNamingStrategy;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.annotations.JsonAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.annotations.SerializedName;
import me.rerere.matrix.thirdparty.com.google.gson.internal.;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ConstructorConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Excluder;
import me.rerere.matrix.thirdparty.com.google.gson.internal.ObjectConstructor;
import me.rerere.matrix.thirdparty.com.google.gson.internal.Primitives;
import me.rerere.matrix.thirdparty.com.google.gson.internal.reflect.ReflectionAccessor;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
  private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
  
  private final ConstructorConstructor constructorConstructor;
  
  private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
  
  private final FieldNamingStrategy fieldNamingPolicy;
  
  private final Excluder excluder;
  
  private static final long a = o3.a(4684190238123592457L, -1256540829667565034L, null).a(144836251306106L);
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    Class<?> clazz = paramTypeToken.getRawType();
    try {
      if (!Object.class.isAssignableFrom(clazz))
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    ObjectConstructor objectConstructor = this.constructorConstructor.get(paramTypeToken);
    return new ReflectiveTypeAdapterFactory$Adapter(objectConstructor, getBoundFields(paramGson, paramTypeToken, clazz));
  }
  
  public static boolean excludeField(Field paramField, boolean paramBoolean, Excluder paramExcluder) {
    try {
      if (!paramExcluder.excludeClass(paramField.getType(), paramBoolean))
        try {
          if (!paramExcluder.excludeField(paramField, paramBoolean));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  public ReflectiveTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, FieldNamingStrategy paramFieldNamingStrategy, Excluder paramExcluder, JsonAdapterAnnotationTypeAdapterFactory paramJsonAdapterAnnotationTypeAdapterFactory) {
    this.constructorConstructor = paramConstructorConstructor;
    this.fieldNamingPolicy = paramFieldNamingStrategy;
    this.excluder = paramExcluder;
    this.jsonAdapterFactory = paramJsonAdapterAnnotationTypeAdapterFactory;
  }
  
  public boolean excludeField(Field paramField, boolean paramBoolean) {
    return excludeField(paramField, paramBoolean, this.excluder);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
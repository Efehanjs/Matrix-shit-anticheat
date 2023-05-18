package me.rerere.matrix.thirdparty.com.google.gson.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.com.google.gson.internal.;

public class TypeToken {
  public final Type type = getSuperclassTypeParameter(getClass());
  
  public final Class rawType = .Gson.Types.getRawType(this.type);
  
  public final int hashCode = this.type.hashCode();
  
  private static final long a = o3.a(-8929535977611405643L, 3865106013317376131L, null).a(44397817152465L);
  
  public static TypeToken getParameterized(Type paramType, Type... paramVarArgs) {
    return new TypeToken(.Gson.Types.newParameterizedTypeWithOwner(null, paramType, paramVarArgs));
  }
  
  public static TypeToken get(Class paramClass) {
    return new TypeToken(paramClass);
  }
  
  @Deprecated
  public boolean isAssignableFrom(TypeToken paramTypeToken) {
    return isAssignableFrom(paramTypeToken.getType());
  }
  
  public final String toString() {
    return .Gson.Types.typeToString(this.type);
  }
  
  public final Type getType() {
    return this.type;
  }
  
  public TypeToken() {}
  
  public static Type getSuperclassTypeParameter(Class paramClass) {
    long l = a ^ 0x5592614326D4L;
    Type type = paramClass.getGenericSuperclass();
    try {
      if (type instanceof Class)
        throw new RuntimeException("Missing type parameter."); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ParameterizedType parameterizedType = (ParameterizedType)type;
    return .Gson.Types.canonicalize(parameterizedType.getActualTypeArguments()[0]);
  }
  
  public final int hashCode() {
    return this.hashCode;
  }
  
  public final boolean equals(Object paramObject) {
    try {
      if (paramObject instanceof TypeToken)
        try {
          if (.Gson.Types.equals(this.type, ((TypeToken)paramObject).type));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @Deprecated
  public boolean isAssignableFrom(Type paramType) {
    try {
      if (paramType == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.type.equals(paramType))
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.type instanceof Class)
        return this.rawType.isAssignableFrom(.Gson.Types.getRawType(paramType)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.type instanceof ParameterizedType)
        return isAssignableFrom(paramType, (ParameterizedType)this.type, new HashMap<Object, Object>()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.type instanceof GenericArrayType) {
        try {
          if (this.rawType.isAssignableFrom(.Gson.Types.getRawType(paramType)))
            try {
              if (isAssignableFrom(paramType, (GenericArrayType)this.type));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    throw buildUnexpectedTypeError(this.type, new Class[] { Class.class, ParameterizedType.class, GenericArrayType.class });
  }
  
  public static TypeToken getArray(Type paramType) {
    return new TypeToken(.Gson.Types.arrayOf(paramType));
  }
  
  public final Class getRawType() {
    return this.rawType;
  }
  
  public TypeToken(Type paramType) {}
  
  public static TypeToken get(Type paramType) {
    return new TypeToken(paramType);
  }
  
  @Deprecated
  public boolean isAssignableFrom(Class paramClass) {
    return isAssignableFrom(paramClass);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\reflect\TypeToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
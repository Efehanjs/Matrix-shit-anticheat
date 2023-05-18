package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import me.rerere.matrix.internal.o3;

public final class $Gson$Types {
  public static final Type[] EMPTY_TYPE_ARRAY;
  
  private static final long a = o3.a(-3126526484667474974L, 3683897499778971516L, null).a(32520809861416L);
  
  static {
    EMPTY_TYPE_ARRAY = new Type[0];
  }
  
  public static Type canonicalize(Type paramType) {
    if (paramType instanceof Class) {
      Class clazz = (Class)paramType;
      try {
      
      } catch (UnsupportedOperationException unsupportedOperationException) {
        throw a(null);
      } 
      return clazz.isArray() ? new $Gson$Types$GenericArrayTypeImpl(canonicalize(clazz.getComponentType())) : clazz;
    } 
    if (paramType instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType)paramType;
      return new $Gson$Types$ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
    } 
    if (paramType instanceof GenericArrayType) {
      GenericArrayType genericArrayType = (GenericArrayType)paramType;
      return new $Gson$Types$GenericArrayTypeImpl(genericArrayType.getGenericComponentType());
    } 
    if (paramType instanceof WildcardType) {
      WildcardType wildcardType = (WildcardType)paramType;
      return new $Gson$Types$WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    } 
    return paramType;
  }
  
  public static WildcardType supertypeOf(Type paramType) {
    Type[] arrayOfType;
    if (paramType instanceof WildcardType) {
      arrayOfType = ((WildcardType)paramType).getLowerBounds();
    } else {
      arrayOfType = new Type[] { paramType };
    } 
    return new $Gson$Types$WildcardTypeImpl(new Type[] { Object.class }, arrayOfType);
  }
  
  public static String typeToString(Type paramType) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramType instanceof Class) ? ((Class)paramType).getName() : paramType.toString();
  }
  
  public static Type resolveTypeVariable(Type paramType, Class paramClass, TypeVariable paramTypeVariable) {
    Class clazz = declaringClassOf(paramTypeVariable);
    try {
      if (clazz == null)
        return paramTypeVariable; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Type type = getGenericSupertype(paramType, paramClass, clazz);
    if (type instanceof ParameterizedType) {
      int i = indexOf((Object[])clazz.getTypeParameters(), paramTypeVariable);
      return ((ParameterizedType)type).getActualTypeArguments()[i];
    } 
    return paramTypeVariable;
  }
  
  public static int hashCodeOrZero(Object paramObject) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramObject != null) ? paramObject.hashCode() : 0;
  }
  
  public static Type getCollectionElementType(Type paramType, Class paramClass) {
    Type type = getSupertype(paramType, paramClass, Collection.class);
    if (type instanceof WildcardType)
      type = ((WildcardType)type).getUpperBounds()[0]; 
    try {
      if (type instanceof ParameterizedType)
        return ((ParameterizedType)type).getActualTypeArguments()[0]; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return Object.class;
  }
  
  public static boolean equals(Type paramType1, Type paramType2) {
    try {
      if (paramType1 == paramType2)
        return true; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramType1 instanceof Class)
        return paramType1.equals(paramType2); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramType1 instanceof ParameterizedType) {
        try {
          if (!(paramType2 instanceof ParameterizedType))
            return false; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        ParameterizedType parameterizedType1 = (ParameterizedType)paramType1;
        ParameterizedType parameterizedType2 = (ParameterizedType)paramType2;
        try {
          if (equal(parameterizedType1.getOwnerType(), parameterizedType2.getOwnerType()))
            try {
              if (parameterizedType1.getRawType().equals(parameterizedType2.getRawType()))
                try {
                  if (Arrays.equals((Object[])parameterizedType1.getActualTypeArguments(), (Object[])parameterizedType2.getActualTypeArguments()));
                } catch (UnsupportedOperationException unsupportedOperationException) {
                  throw a(null);
                }  
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramType1 instanceof GenericArrayType) {
        try {
          if (!(paramType2 instanceof GenericArrayType))
            return false; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        GenericArrayType genericArrayType1 = (GenericArrayType)paramType1;
        GenericArrayType genericArrayType2 = (GenericArrayType)paramType2;
        return equals(genericArrayType1.getGenericComponentType(), genericArrayType2.getGenericComponentType());
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramType1 instanceof WildcardType) {
        try {
          if (!(paramType2 instanceof WildcardType))
            return false; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        WildcardType wildcardType1 = (WildcardType)paramType1;
        WildcardType wildcardType2 = (WildcardType)paramType2;
        try {
          if (Arrays.equals((Object[])wildcardType1.getUpperBounds(), (Object[])wildcardType2.getUpperBounds()))
            try {
              if (Arrays.equals((Object[])wildcardType1.getLowerBounds(), (Object[])wildcardType2.getLowerBounds()));
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramType1 instanceof TypeVariable) {
        try {
          if (!(paramType2 instanceof TypeVariable))
            return false; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        TypeVariable typeVariable1 = (TypeVariable)paramType1;
        TypeVariable typeVariable2 = (TypeVariable)paramType2;
        try {
          if (typeVariable1.getGenericDeclaration() == typeVariable2.getGenericDeclaration())
            try {
              if (typeVariable1.getName().equals(typeVariable2.getName()));
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return false;
  }
  
  public static Type getArrayComponentType(Type paramType) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramType instanceof GenericArrayType) ? ((GenericArrayType)paramType).getGenericComponentType() : ((Class)paramType).getComponentType();
  }
  
  public static ParameterizedType newParameterizedTypeWithOwner(Type paramType1, Type paramType2, Type... paramVarArgs) {
    return new $Gson$Types$ParameterizedTypeImpl(paramType1, paramType2, paramVarArgs);
  }
  
  public static Type getSupertype(Type paramType, Class<?> paramClass1, Class paramClass2) {
    if (paramType instanceof WildcardType)
      paramType = ((WildcardType)paramType).getUpperBounds()[0]; 
    $Gson$Preconditions.checkArgument(paramClass2.isAssignableFrom(paramClass1));
    return resolve(paramType, paramClass1, getGenericSupertype(paramType, paramClass1, paramClass2));
  }
  
  public static WildcardType subtypeOf(Type paramType) {
    Type[] arrayOfType;
    if (paramType instanceof WildcardType) {
      arrayOfType = ((WildcardType)paramType).getUpperBounds();
    } else {
      arrayOfType = new Type[] { paramType };
    } 
    return new $Gson$Types$WildcardTypeImpl(arrayOfType, EMPTY_TYPE_ARRAY);
  }
  
  public static Type[] getMapKeyAndValueTypes(Type paramType, Class paramClass) {
    try {
      if (paramType == Properties.class)
        return new Type[] { String.class, String.class }; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Type type = getSupertype(paramType, paramClass, Map.class);
    if (type instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType)type;
      return parameterizedType.getActualTypeArguments();
    } 
    return new Type[] { Object.class, Object.class };
  }
  
  public static Type getGenericSupertype(Type paramType, Class<Object> paramClass1, Class<? super Object> paramClass2) {
    try {
      if (paramClass2 == paramClass1)
        return paramType; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    if (paramClass2.isInterface()) {
      Class[] arrayOfClass = paramClass1.getInterfaces();
      byte b = 0;
      int i = arrayOfClass.length;
      while (true) {
        try {
          if (b < i) {
            try {
              if (arrayOfClass[b] == paramClass2)
                return paramClass1.getGenericInterfaces()[b]; 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            try {
              if (paramClass2.isAssignableFrom(arrayOfClass[b]))
                return getGenericSupertype(paramClass1.getGenericInterfaces()[b], arrayOfClass[b], paramClass2); 
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            } 
            b++;
            continue;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        break;
      } 
    } 
    try {
      if (!paramClass1.isInterface())
        while (paramClass1 != Object.class) {
          Class<? super Object> clazz2 = paramClass1.getSuperclass();
          try {
            if (clazz2 == paramClass2)
              return paramClass1.getGenericSuperclass(); 
          } catch (UnsupportedOperationException unsupportedOperationException) {
            throw a(null);
          } 
          try {
            if (paramClass2.isAssignableFrom(clazz2))
              return getGenericSupertype(paramClass1.getGenericSuperclass(), clazz2, paramClass2); 
          } catch (UnsupportedOperationException unsupportedOperationException) {
            throw a(null);
          } 
          Class<? super Object> clazz1 = clazz2;
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return paramClass2;
  }
  
  public static Class getRawType(Type paramType) {
    long l = a ^ 0x3CC124D11F8BL;
    try {
      if (paramType instanceof Class)
        return (Class)paramType; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    if (paramType instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType)paramType;
      Type type = parameterizedType.getRawType();
      $Gson$Preconditions.checkArgument(type instanceof Class);
      return (Class)type;
    } 
    if (paramType instanceof GenericArrayType) {
      Type type = ((GenericArrayType)paramType).getGenericComponentType();
      return Array.newInstance(getRawType(type), 0).getClass();
    } 
    try {
      if (paramType instanceof TypeVariable)
        return Object.class; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (paramType instanceof WildcardType)
        return getRawType(((WildcardType)paramType).getUpperBounds()[0]); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    String str = (paramType == null) ? "null" : paramType.getClass().getName();
    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + paramType + "> is of type " + str);
  }
  
  public static GenericArrayType arrayOf(Type paramType) {
    return new $Gson$Types$GenericArrayTypeImpl(paramType);
  }
  
  public static void checkNotPrimitive(Type paramType) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/lang/Class
    //   4: ifeq -> 24
    //   7: aload_0
    //   8: checkcast java/lang/Class
    //   11: invokevirtual isPrimitive : ()Z
    //   14: ifne -> 32
    //   17: goto -> 24
    //   20: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   23: athrow
    //   24: iconst_1
    //   25: goto -> 33
    //   28: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   31: athrow
    //   32: iconst_0
    //   33: invokestatic checkArgument : (Z)V
    //   36: return
    // Exception table:
    //   from	to	target	type
    //   0	17	20	java/lang/UnsupportedOperationException
    //   7	28	28	java/lang/UnsupportedOperationException
  }
  
  public static Type resolve(Type paramType1, Class paramClass, Type paramType2) {
    return resolve(paramType1, paramClass, paramType2, new HashSet());
  }
  
  public static boolean equal(Object paramObject1, Object paramObject2) {
    try {
      if (paramObject1 != paramObject2) {
        try {
          if (paramObject1 != null)
            try {
              if (paramObject1.equals(paramObject2));
            } catch (UnsupportedOperationException unsupportedOperationException) {
              throw a(null);
            }  
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\$Gson$Types.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import me.rerere.matrix.internal.o3;

public final class $Gson$Types$GenericArrayTypeImpl implements GenericArrayType, Serializable {
  private static final long serialVersionUID = 0L;
  
  private final Type componentType;
  
  private static final long a = o3.a(-3731423387455174025L, 2067172285998689718L, null).a(26713750912297L);
  
  public int hashCode() {
    return this.componentType.hashCode();
  }
  
  public String toString() {
    long l = a ^ 0x43325E7871E1L;
    return $Gson$Types.typeToString(this.componentType) + "[]";
  }
  
  public $Gson$Types$GenericArrayTypeImpl(Type paramType) {
    this.componentType = $Gson$Types.canonicalize(paramType);
  }
  
  public Type getGenericComponentType() {
    return this.componentType;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject instanceof GenericArrayType)
        try {
          if ($Gson$Types.equals(this, (GenericArrayType)paramObject));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\$Gson$Types$GenericArrayTypeImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
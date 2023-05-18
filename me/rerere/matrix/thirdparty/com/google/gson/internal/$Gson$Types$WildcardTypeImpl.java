package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import me.rerere.matrix.internal.o3;

public final class $Gson$Types$WildcardTypeImpl implements WildcardType, Serializable {
  private final Type lowerBound;
  
  private final Type upperBound;
  
  private static final long serialVersionUID = 0L;
  
  private static final long a = o3.a(1405610301554746438L, -4273330701083519503L, null).a(88769959609073L);
  
  public $Gson$Types$WildcardTypeImpl(Type[] paramArrayOfType1, Type[] paramArrayOfType2) {
    try {
      $Gson$Preconditions.checkArgument((paramArrayOfType2.length <= 1));
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      $Gson$Preconditions.checkArgument((paramArrayOfType1.length == 1));
      if (paramArrayOfType2.length == 1) {
        try {
          $Gson$Preconditions.checkNotNull(paramArrayOfType2[0]);
          $Gson$Types.checkNotPrimitive(paramArrayOfType2[0]);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        $Gson$Preconditions.checkArgument((paramArrayOfType1[0] == Object.class));
        this.lowerBound = $Gson$Types.canonicalize(paramArrayOfType2[0]);
        this.upperBound = Object.class;
      } else {
        $Gson$Preconditions.checkNotNull(paramArrayOfType1[0]);
        $Gson$Types.checkNotPrimitive(paramArrayOfType1[0]);
        this.lowerBound = null;
        this.upperBound = $Gson$Types.canonicalize(paramArrayOfType1[0]);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Type[] getLowerBounds() {
    try {
      (new Type[1])[0] = this.lowerBound;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.lowerBound != null) ? new Type[1] : $Gson$Types.EMPTY_TYPE_ARRAY;
  }
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((this.lowerBound != null) ? (31 + this.lowerBound.hashCode()) : 1) ^ 31 + this.upperBound.hashCode();
  }
  
  public Type[] getUpperBounds() {
    return new Type[] { this.upperBound };
  }
  
  public String toString() {
    long l = a ^ 0x7FC8D0326E6BL;
    try {
      if (this.lowerBound != null)
        return "? super " + $Gson$Types.typeToString(this.lowerBound); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.upperBound == Object.class)
        return "?"; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "? extends " + $Gson$Types.typeToString(this.upperBound);
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject instanceof WildcardType)
        try {
          if ($Gson$Types.equals(this, (WildcardType)paramObject));
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\$Gson$Types$WildcardTypeImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
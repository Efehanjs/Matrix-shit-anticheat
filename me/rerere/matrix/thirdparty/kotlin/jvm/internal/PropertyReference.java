package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;

public abstract class PropertyReference extends CallableReference implements KProperty {
  private static final long b = o3.a(-4343853924284704335L, 6025017286764701626L, null).a(176907711536662L);
  
  public String toString() {
    long l = b ^ 0x6C50E9FBE13AL;
    KCallable kCallable = compute();
    try {
      if (kCallable != this)
        return kCallable.toString(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "property " + getName() + " (Kotlin reflection is not available)";
  }
  
  public PropertyReference() {}
  
  @SinceKotlin(version = "1.1")
  public KProperty getReflected() {
    return (KProperty)super.getReflected();
  }
  
  @SinceKotlin(version = "1.1")
  public PropertyReference(Object paramObject) {
    super(paramObject);
  }
  
  public int hashCode() {
    return (getOwner().hashCode() * 31 + getName().hashCode()) * 31 + getSignature().hashCode();
  }
  
  @SinceKotlin(version = "1.4")
  public PropertyReference(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, ((paramInt & 0x1) == 1));
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isLateinit() {
    return getReflected().isLateinit();
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (paramObject instanceof PropertyReference) {
      PropertyReference propertyReference = (PropertyReference)paramObject;
      try {
        if (getOwner().equals(propertyReference.getOwner()))
          try {
            if (getName().equals(propertyReference.getName()))
              try {
                if (getSignature().equals(propertyReference.getSignature()))
                  try {
                    if (Intrinsics.areEqual(getBoundReceiver(), propertyReference.getBoundReceiver()));
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return false;
    } 
    try {
      if (paramObject instanceof KProperty)
        return paramObject.equals(compute()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isConst() {
    return getReflected().isConst();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\PropertyReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
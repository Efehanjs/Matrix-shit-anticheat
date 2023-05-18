package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty;

public abstract class MutablePropertyReference extends PropertyReference implements KMutableProperty {
  @SinceKotlin(version = "1.4")
  public MutablePropertyReference(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
  
  @SinceKotlin(version = "1.1")
  public MutablePropertyReference(Object paramObject) {
    super(paramObject);
  }
  
  public MutablePropertyReference() {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\MutablePropertyReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
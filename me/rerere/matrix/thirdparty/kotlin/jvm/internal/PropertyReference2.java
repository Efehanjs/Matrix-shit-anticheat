package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty2;

public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
  public PropertyReference2() {}
  
  @SinceKotlin(version = "1.1")
  public Object getDelegate(Object paramObject1, Object paramObject2) {
    return ((KProperty2)getReflected()).getDelegate(paramObject1, paramObject2);
  }
  
  @SinceKotlin(version = "1.4")
  public PropertyReference2(Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(NO_RECEIVER, paramClass, paramString1, paramString2, paramInt);
  }
  
  public Object invoke(Object paramObject1, Object paramObject2) {
    return get(paramObject1, paramObject2);
  }
  
  public KProperty2.Getter getGetter() {
    return ((KProperty2)getReflected()).getGetter();
  }
  
  public KCallable computeReflected() {
    return (KCallable)Reflection.property2(this);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\PropertyReference2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
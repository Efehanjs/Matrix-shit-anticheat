package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty0;

public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
  @SinceKotlin(version = "1.1")
  public PropertyReference0(Object paramObject) {
    super(paramObject);
  }
  
  @SinceKotlin(version = "1.4")
  public PropertyReference0(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
  
  @SinceKotlin(version = "1.1")
  public Object getDelegate() {
    return ((KProperty0)getReflected()).getDelegate();
  }
  
  public KCallable computeReflected() {
    return (KCallable)Reflection.property0(this);
  }
  
  public KProperty0.Getter getGetter() {
    return ((KProperty0)getReflected()).getGetter();
  }
  
  public Object invoke() {
    return get();
  }
  
  public PropertyReference0() {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\PropertyReference0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
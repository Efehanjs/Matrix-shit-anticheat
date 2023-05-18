package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty1;

public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
  @SinceKotlin(version = "1.1")
  public Object getDelegate(Object paramObject) {
    return ((KProperty1)getReflected()).getDelegate(paramObject);
  }
  
  public PropertyReference1() {}
  
  public KProperty1.Getter getGetter() {
    return ((KProperty1)getReflected()).getGetter();
  }
  
  public KCallable computeReflected() {
    return (KCallable)Reflection.property1(this);
  }
  
  public Object invoke(Object paramObject) {
    return get(paramObject);
  }
  
  @SinceKotlin(version = "1.1")
  public PropertyReference1(Object paramObject) {
    super(paramObject);
  }
  
  @SinceKotlin(version = "1.4")
  public PropertyReference1(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\PropertyReference1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
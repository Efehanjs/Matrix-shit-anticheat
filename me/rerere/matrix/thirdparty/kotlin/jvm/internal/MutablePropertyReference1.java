package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty1;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty1;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KMutableProperty1 {
  public KMutableProperty1.Setter getSetter() {
    return ((KMutableProperty1)getReflected()).getSetter();
  }
  
  public MutablePropertyReference1() {}
  
  public KProperty1.Getter getGetter() {
    return ((KMutableProperty1)getReflected()).getGetter();
  }
  
  @SinceKotlin(version = "1.4")
  public MutablePropertyReference1(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
  
  public Object invoke(Object paramObject) {
    return get(paramObject);
  }
  
  public KCallable computeReflected() {
    return (KCallable)Reflection.mutableProperty1(this);
  }
  
  @SinceKotlin(version = "1.1")
  public Object getDelegate(Object paramObject) {
    return ((KMutableProperty1)getReflected()).getDelegate(paramObject);
  }
  
  @SinceKotlin(version = "1.1")
  public MutablePropertyReference1(Object paramObject) {
    super(paramObject);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\MutablePropertyReference1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
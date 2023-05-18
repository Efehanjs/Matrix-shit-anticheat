package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty0;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty0;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
  public KCallable computeReflected() {
    return (KCallable)Reflection.mutableProperty0(this);
  }
  
  @SinceKotlin(version = "1.1")
  public Object getDelegate() {
    return ((KMutableProperty0)getReflected()).getDelegate();
  }
  
  @SinceKotlin(version = "1.4")
  public MutablePropertyReference0(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
  
  public KMutableProperty0.Setter getSetter() {
    return ((KMutableProperty0)getReflected()).getSetter();
  }
  
  @SinceKotlin(version = "1.1")
  public MutablePropertyReference0(Object paramObject) {
    super(paramObject);
  }
  
  public Object invoke() {
    return get();
  }
  
  public KProperty0.Getter getGetter() {
    return ((KMutableProperty0)getReflected()).getGetter();
  }
  
  public MutablePropertyReference0() {}
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\MutablePropertyReference0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty2;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty2;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
  @SinceKotlin(version = "1.1")
  public Object getDelegate(Object paramObject1, Object paramObject2) {
    return ((KMutableProperty2)getReflected()).getDelegate(paramObject1, paramObject2);
  }
  
  @SinceKotlin(version = "1.4")
  public MutablePropertyReference2(Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(NO_RECEIVER, paramClass, paramString1, paramString2, paramInt);
  }
  
  public KCallable computeReflected() {
    return (KCallable)Reflection.mutableProperty2(this);
  }
  
  public MutablePropertyReference2() {}
  
  public Object invoke(Object paramObject1, Object paramObject2) {
    return get(paramObject1, paramObject2);
  }
  
  public KMutableProperty2.Setter getSetter() {
    return ((KMutableProperty2)getReflected()).getSetter();
  }
  
  public KProperty2.Getter getGetter() {
    return ((KMutableProperty2)getReflected()).getGetter();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\MutablePropertyReference2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
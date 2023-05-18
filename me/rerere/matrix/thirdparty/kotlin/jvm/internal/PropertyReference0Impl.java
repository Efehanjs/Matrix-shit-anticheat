package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KDeclarationContainer;

public class PropertyReference0Impl extends PropertyReference0 {
  @SinceKotlin(version = "1.4")
  public PropertyReference0Impl(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
  
  public Object get() {
    return getGetter().call(new Object[0]);
  }
  
  public PropertyReference0Impl(KDeclarationContainer paramKDeclarationContainer, String paramString1, String paramString2) {
    super(NO_RECEIVER, ((ClassBasedDeclarationContainer)paramKDeclarationContainer).getJClass(), paramString1, paramString2, (paramKDeclarationContainer instanceof me.rerere.matrix.thirdparty.kotlin.reflect.KClass) ? 0 : 1);
  }
  
  @SinceKotlin(version = "1.4")
  public PropertyReference0Impl(Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(NO_RECEIVER, paramClass, paramString1, paramString2, paramInt);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\PropertyReference0Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
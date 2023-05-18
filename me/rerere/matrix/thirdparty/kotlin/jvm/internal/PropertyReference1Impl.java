package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KDeclarationContainer;

public class PropertyReference1Impl extends PropertyReference1 {
  public Object get(Object paramObject) {
    return getGetter().call(new Object[] { paramObject });
  }
  
  public PropertyReference1Impl(KDeclarationContainer paramKDeclarationContainer, String paramString1, String paramString2) {
    super(NO_RECEIVER, ((ClassBasedDeclarationContainer)paramKDeclarationContainer).getJClass(), paramString1, paramString2, (paramKDeclarationContainer instanceof me.rerere.matrix.thirdparty.kotlin.reflect.KClass) ? 0 : 1);
  }
  
  @SinceKotlin(version = "1.4")
  public PropertyReference1Impl(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(paramObject, paramClass, paramString1, paramString2, paramInt);
  }
  
  @SinceKotlin(version = "1.4")
  public PropertyReference1Impl(Class paramClass, String paramString1, String paramString2, int paramInt) {
    super(NO_RECEIVER, paramClass, paramString1, paramString2, paramInt);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\PropertyReference1Impl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KDeclarationContainer;

public class FunctionReferenceImpl extends FunctionReference {
  public FunctionReferenceImpl(int paramInt, KDeclarationContainer paramKDeclarationContainer, String paramString1, String paramString2) {
    super(paramInt, NO_RECEIVER, ((ClassBasedDeclarationContainer)paramKDeclarationContainer).getJClass(), paramString1, paramString2, (paramKDeclarationContainer instanceof me.rerere.matrix.thirdparty.kotlin.reflect.KClass) ? 0 : 1);
  }
  
  @SinceKotlin(version = "1.4")
  public FunctionReferenceImpl(int paramInt1, Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt2) {
    super(paramInt1, paramObject, paramClass, paramString1, paramString2, paramInt2);
  }
  
  @SinceKotlin(version = "1.4")
  public FunctionReferenceImpl(int paramInt1, Class paramClass, String paramString1, String paramString2, int paramInt2) {
    super(paramInt1, NO_RECEIVER, paramClass, paramString1, paramString2, paramInt2);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\FunctionReferenceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
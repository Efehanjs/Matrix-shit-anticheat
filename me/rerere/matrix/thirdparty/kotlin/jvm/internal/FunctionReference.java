package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KFunction;

public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
  private final int arity;
  
  @SinceKotlin(version = "1.4")
  private final int flags;
  
  private static final long a = o3.a(6991443038284446769L, -7770445718396725582L, null).a(150404120737531L);
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (((getOwner() == null) ? 0 : (getOwner().hashCode() * 31)) + getName().hashCode()) * 31 + getSignature().hashCode();
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isSuspend() {
    return getReflected().isSuspend();
  }
  
  public String toString() {
    long l = a ^ 0x535813EBAA42L;
    KCallable kCallable = compute();
    try {
      if (kCallable != this)
        return kCallable.toString(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "<init>".equals(getName()) ? "constructor (Kotlin reflection is not available)" : ("function " + getName() + " (Kotlin reflection is not available)");
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (paramObject == this)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (paramObject instanceof FunctionReference) {
      FunctionReference functionReference = (FunctionReference)paramObject;
      try {
        if (getName().equals(functionReference.getName()))
          try {
            if (getSignature().equals(functionReference.getSignature()))
              try {
                if (this.flags == functionReference.flags)
                  try {
                    if (this.arity == functionReference.arity)
                      try {
                        if (Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver()))
                          try {
                            if (Intrinsics.areEqual(getOwner(), functionReference.getOwner()));
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          }  
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      }  
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return false;
    } 
    try {
      if (paramObject instanceof KFunction)
        return paramObject.equals(compute()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public int getArity() {
    return this.arity;
  }
  
  @SinceKotlin(version = "1.1")
  public FunctionReference(int paramInt, Object paramObject) {
    this(paramInt, paramObject, (Class)null, (String)null, (String)null, 0);
  }
  
  @SinceKotlin(version = "1.1")
  public KCallable computeReflected() {
    return (KCallable)Reflection.function(this);
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isExternal() {
    return getReflected().isExternal();
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isInline() {
    return getReflected().isInline();
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isOperator() {
    return getReflected().isOperator();
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isInfix() {
    return getReflected().isInfix();
  }
  
  @SinceKotlin(version = "1.1")
  public KFunction getReflected() {
    return (KFunction)super.getReflected();
  }
  
  @SinceKotlin(version = "1.4")
  public FunctionReference(int paramInt1, Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt2) {
    super(paramObject, paramClass, paramString1, paramString2, ((paramInt2 & 0x1) == 1));
    this.arity = paramInt1;
    this.flags = paramInt2 >> 1;
  }
  
  public FunctionReference(int paramInt) {
    this(paramInt, NO_RECEIVER, (Class)null, (String)null, (String)null, 0);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\FunctionReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.KotlinReflectionNotSupportedError;
import me.rerere.matrix.thirdparty.kotlin.reflect.KCallable;
import me.rerere.matrix.thirdparty.kotlin.reflect.KDeclarationContainer;
import me.rerere.matrix.thirdparty.kotlin.reflect.KType;
import me.rerere.matrix.thirdparty.kotlin.reflect.KVisibility;

public abstract class CallableReference implements KCallable, Serializable {
  @SinceKotlin(version = "1.4")
  private final String signature;
  
  @SinceKotlin(version = "1.4")
  private final String name;
  
  @SinceKotlin(version = "1.1")
  public final Object receiver;
  
  private transient KCallable reflected;
  
  @SinceKotlin(version = "1.1")
  public static final Object NO_RECEIVER = CallableReference$NoReceiver.access$000();
  
  @SinceKotlin(version = "1.4")
  private final boolean isTopLevel;
  
  @SinceKotlin(version = "1.4")
  private final Class owner;
  
  public String getSignature() {
    return this.signature;
  }
  
  @SinceKotlin(version = "1.4")
  public CallableReference(Object paramObject, Class paramClass, String paramString1, String paramString2, boolean paramBoolean) {
    this.receiver = paramObject;
    this.owner = paramClass;
    this.name = paramString1;
    this.signature = paramString2;
    this.isTopLevel = paramBoolean;
  }
  
  public abstract KCallable computeReflected();
  
  @SinceKotlin(version = "1.1")
  public KCallable compute() {
    KCallable kCallable = this.reflected;
    if (kCallable == null) {
      kCallable = computeReflected();
      this.reflected = kCallable;
    } 
    return kCallable;
  }
  
  public List getParameters() {
    return getReflected().getParameters();
  }
  
  public List getAnnotations() {
    return getReflected().getAnnotations();
  }
  
  public Object call(Object... paramVarArgs) {
    return getReflected().call(paramVarArgs);
  }
  
  @SinceKotlin(version = "1.1")
  public KCallable getReflected() {
    KCallable kCallable = compute();
    try {
      if (kCallable == this)
        throw new KotlinReflectionNotSupportedError(); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return kCallable;
  }
  
  @SinceKotlin(version = "1.3")
  public boolean isSuspend() {
    return getReflected().isSuspend();
  }
  
  public String getName() {
    return this.name;
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isFinal() {
    return getReflected().isFinal();
  }
  
  @SinceKotlin(version = "1.1")
  public Object getBoundReceiver() {
    return this.receiver;
  }
  
  @SinceKotlin(version = "1.1")
  public CallableReference(Object paramObject) {
    this(paramObject, null, null, null, false);
  }
  
  @SinceKotlin(version = "1.1")
  public List getTypeParameters() {
    return getReflected().getTypeParameters();
  }
  
  public KType getReturnType() {
    return getReflected().getReturnType();
  }
  
  public CallableReference() {
    this(NO_RECEIVER);
  }
  
  @SinceKotlin(version = "1.1")
  public KVisibility getVisibility() {
    return getReflected().getVisibility();
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isOpen() {
    return getReflected().isOpen();
  }
  
  public KDeclarationContainer getOwner() {
    try {
      try {
      
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return (this.owner == null) ? null : (this.isTopLevel ? Reflection.getOrCreateKotlinPackage(this.owner) : (KDeclarationContainer)Reflection.getOrCreateKotlinClass(this.owner));
  }
  
  @SinceKotlin(version = "1.1")
  public boolean isAbstract() {
    return getReflected().isAbstract();
  }
  
  public Object callBy(Map paramMap) {
    return getReflected().callBy(paramMap);
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\CallableReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import me.rerere.matrix.internal.av;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ModuleNameRetriever {
  @NotNull
  private static final ModuleNameRetriever$Cache notOnJava9;
  
  @NotNull
  public static final ModuleNameRetriever INSTANCE;
  
  @Nullable
  private static ModuleNameRetriever$Cache cache;
  
  private static final long a = o3.a(2894158122814967881L, 6754386541530049625L, null).a(146723700529525L);
  
  static {
    INSTANCE = new ModuleNameRetriever();
    notOnJava9 = new ModuleNameRetriever$Cache(null, null, null);
  }
  
  @Nullable
  public final String getModuleName(@NotNull BaseContinuationImpl paramBaseContinuationImpl) {
    Object object1;
    Object object2;
    long l = a ^ 0xEA584B640AL;
    try {
      Intrinsics.checkNotNullParameter(paramBaseContinuationImpl, "continuation");
      if (cache == null);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ModuleNameRetriever$Cache moduleNameRetriever$Cache = buildCache(paramBaseContinuationImpl);
    try {
      if (moduleNameRetriever$Cache == notOnJava9)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((moduleNameRetriever$Cache.getModuleMethod != null) ? moduleNameRetriever$Cache.getModuleMethod.invoke(paramBaseContinuationImpl.getClass(), new Object[0]) : null) == null) {
        (moduleNameRetriever$Cache.getModuleMethod != null) ? moduleNameRetriever$Cache.getModuleMethod.invoke(paramBaseContinuationImpl.getClass(), new Object[0]) : null;
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((moduleNameRetriever$Cache.getDescriptorMethod != null) ? moduleNameRetriever$Cache.getDescriptorMethod.invoke(object1, new Object[0]) : null) == null) {
        (moduleNameRetriever$Cache.getDescriptorMethod != null) ? moduleNameRetriever$Cache.getDescriptorMethod.invoke(object1, new Object[0]) : null;
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Object object3 = (moduleNameRetriever$Cache.nameMethod != null) ? moduleNameRetriever$Cache.nameMethod.invoke(object2, new Object[0]) : null;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (object3 instanceof String) ? (String)object3 : null;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\ModuleNameRetriever.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
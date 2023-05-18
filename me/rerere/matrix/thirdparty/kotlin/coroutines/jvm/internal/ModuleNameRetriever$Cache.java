package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ModuleNameRetriever$Cache {
  @JvmField
  @Nullable
  public final Method getDescriptorMethod;
  
  @JvmField
  @Nullable
  public final Method getModuleMethod;
  
  @JvmField
  @Nullable
  public final Method nameMethod;
  
  public ModuleNameRetriever$Cache(@Nullable Method paramMethod1, @Nullable Method paramMethod2, @Nullable Method paramMethod3) {
    this.getModuleMethod = paramMethod1;
    this.getDescriptorMethod = paramMethod2;
    this.nameMethod = paramMethod3;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\ModuleNameRetriever$Cache.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
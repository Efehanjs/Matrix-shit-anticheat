package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.Collection;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.KotlinReflectionNotSupportedError;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
public final class PackageReference implements ClassBasedDeclarationContainer {
  @NotNull
  private final String moduleName;
  
  @NotNull
  private final Class jClass;
  
  private static final long a = o3.a(-9029660740264162263L, -6581955538474140265L, null).a(176872562581679L);
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof PackageReference)
        try {
          if (Intrinsics.areEqual(getJClass(), ((PackageReference)paramObject).getJClass()));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return getJClass().hashCode();
  }
  
  @NotNull
  public Collection getMembers() {
    throw new KotlinReflectionNotSupportedError();
  }
  
  public PackageReference(@NotNull Class paramClass, @NotNull String paramString) {
    this.jClass = paramClass;
    this.moduleName = paramString;
  }
  
  @NotNull
  public Class getJClass() {
    return this.jClass;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x3B1865B61D53L;
    return getJClass().toString() + " (Kotlin reflection is not available)";
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\PackageReference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
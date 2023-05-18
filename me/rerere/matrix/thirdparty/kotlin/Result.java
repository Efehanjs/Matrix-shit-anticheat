package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmInline;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@JvmInline
@SinceKotlin(version = "1.3")
public final class Result implements Serializable {
  @Nullable
  private final Object value;
  
  @NotNull
  public static final Result$Companion Companion;
  
  private static final long a = o3.a(979925417414129692L, -2010196098190422296L, null).a(193506904976127L);
  
  public static final boolean isFailure-impl(Object paramObject) {
    return paramObject instanceof Result$Failure;
  }
  
  public int hashCode() {
    return hashCode-impl(this.value);
  }
  
  public static boolean equals-impl(Object paramObject1, Object paramObject2) {
    try {
      if (!(paramObject2 instanceof Result))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(paramObject1, ((Result)paramObject2).unbox-impl()))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public String toString() {
    return toString-impl(this.value);
  }
  
  public static int hashCode-impl(Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramObject == null) ? 0 : paramObject.hashCode();
  }
  
  public static final boolean equals-impl0(Object paramObject1, Object paramObject2) {
    return Intrinsics.areEqual(paramObject1, paramObject2);
  }
  
  @Nullable
  public static final Throwable exceptionOrNull-impl(Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramObject instanceof Result$Failure) ? ((Result$Failure)paramObject).exception : null;
  }
  
  public boolean equals(Object paramObject) {
    return equals-impl(this.value, paramObject);
  }
  
  @NotNull
  public static String toString-impl(Object paramObject) {
    long l = a ^ 0xBE73192C9F0L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramObject instanceof Result$Failure) ? ((Result$Failure)paramObject).toString() : ("Success(" + paramObject + ')');
  }
  
  @PublishedApi
  @NotNull
  public static Object constructor-impl(@Nullable Object paramObject) {
    return paramObject;
  }
  
  public static final boolean isSuccess-impl(Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !(paramObject instanceof Result$Failure);
  }
  
  static {
    Companion = new Result$Companion(null);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\Result.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class qb {
  private static int a;
  
  private static final long b = o3.a(5888271710831372292L, -7522179047718744834L, MethodHandles.lookup().lookupClass()).a(193360493175995L);
  
  @NotNull
  public static final MethodHandle b(long paramLong, @NotNull Method paramMethod) {
    paramLong = b ^ paramLong;
    int i = yl.a();
    try {
      if (i == 0)
        try {
          if (!paramMethod.isAccessible()) {
          
          } else {
            return MethodHandles.lookup().unreflect(paramMethod);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramMethod.setAccessible(true);
    return MethodHandles.lookup().unreflect(paramMethod);
  }
  
  @NotNull
  public static final MethodHandle b(@NotNull Field paramField, long paramLong) {
    paramLong = b ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        try {
          if (!paramField.isAccessible()) {
          
          } else {
            return MethodHandles.lookup().unreflectGetter(paramField);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramField.setAccessible(true);
    return MethodHandles.lookup().unreflectGetter(paramField);
  }
  
  @NotNull
  public static final MethodHandle b(@NotNull Constructor<?> paramConstructor) {
    return MethodHandles.lookup().unreflectConstructor(paramConstructor);
  }
  
  @NotNull
  public static final Class j(char paramChar1, char paramChar2, int paramInt, @NotNull String paramString) {
    long l1 = (paramChar1 << 48L | paramChar2 << 48L >>> 16L | paramInt << 32L >>> 32L) ^ b;
    long l2 = l1 ^ 0x7CB281868F24L;
    return Class.forName(xa.j(paramString, l2));
  }
  
  @NotNull
  public static final Class b(@NotNull String paramString, long paramLong) {
    paramLong = b ^ paramLong;
    long l = paramLong ^ 0x505002F01AA5L;
    return Class.forName(xa.b(paramString, l));
  }
  
  public static void E(int paramInt) {
    a = paramInt;
  }
  
  public static int L() {
    return a;
  }
  
  public static int A() {
    int i = L();
    try {
      if (i == 0)
        return 98; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  static {
    if (L() == 0)
      E(113); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
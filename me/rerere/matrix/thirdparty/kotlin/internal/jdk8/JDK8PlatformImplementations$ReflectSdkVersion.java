package me.rerere.matrix.thirdparty.kotlin.internal.jdk8;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class JDK8PlatformImplementations$ReflectSdkVersion {
  @NotNull
  public static final JDK8PlatformImplementations$ReflectSdkVersion INSTANCE = new JDK8PlatformImplementations$ReflectSdkVersion();
  
  @JvmField
  @Nullable
  public static final Integer sdkVersion = null;
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    Object object2;
    long l = o3.a(7727762687363865376L, -8954707961664467153L, MethodHandles.lookup().lookupClass()).a(84961159725371L) ^ 0x6480F868B408L;
  }
  
  static {
    try {
      object2 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      object2 = (object2 instanceof Integer) ? object2 : null;
    } catch (Throwable throwable) {
      object2 = null;
    } 
    Object object1 = object2;
    if (object1 != null) {
      object2 = object1;
      int i = ((Number)object2).intValue();
      boolean bool = false;
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
      
      } catch (Throwable throwable) {
        throw a(null);
      } 
    } else {
    
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\jdk8\JDK8PlatformImplementations$ReflectSdkVersion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
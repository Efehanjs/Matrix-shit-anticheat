package me.rerere.matrix.thirdparty.kotlin.jvm;

import java.lang.annotation.Annotation;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.ClassBasedDeclarationContainer;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Reflection;
import me.rerere.matrix.thirdparty.kotlin.reflect.KClass;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class JvmClassMappingKt {
  private static final long a = o3.a(7115510866383487232L, 6672822946816853671L, null).a(172883105781181L);
  
  @NotNull
  public static final Class getJavaClass(@NotNull KClass paramKClass) {
    long l = a ^ 0x33554F5F6178L;
    Intrinsics.checkNotNullParameter(paramKClass, "<this>");
    Intrinsics.checkNotNull(((ClassBasedDeclarationContainer)paramKClass).getJClass(), "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
    return ((ClassBasedDeclarationContainer)paramKClass).getJClass();
  }
  
  @NotNull
  public static final Class getJavaClass(@NotNull Object paramObject) {
    long l = a ^ 0x4436AE24052CL;
    Intrinsics.checkNotNullParameter(paramObject, "<this>");
    boolean bool = false;
    Intrinsics.checkNotNull(paramObject.getClass(), "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
    return paramObject.getClass();
  }
  
  @Nullable
  public static final Class getJavaPrimitiveType(@NotNull KClass paramKClass) {
    long l = a ^ 0x264660850DA9L;
    Intrinsics.checkNotNullParameter(paramKClass, "<this>");
    Class clazz = ((ClassBasedDeclarationContainer)paramKClass).getJClass();
    try {
      if (clazz.isPrimitive()) {
        Intrinsics.checkNotNull(clazz, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
        return clazz;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = clazz.getName();
    try {
      if (str != null)
        try {
          switch (str.hashCode()) {
            case -527879800:
              try {
                if (!str.equals("java.lang.Float"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 399092968:
              try {
                if (!str.equals("java.lang.Void"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 155276373:
              try {
                if (!str.equals("java.lang.Character"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 398795216:
              try {
                if (!str.equals("java.lang.Long"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 761287205:
              try {
                if (!str.equals("java.lang.Double"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case -515992664:
              try {
                if (!str.equals("java.lang.Short"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 344809556:
              try {
                if (!str.equals("java.lang.Boolean"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 398507100:
              try {
                if (!str.equals("java.lang.Byte"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case -2056817302:
              try {
                if (!str.equals("java.lang.Integer"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  @NotNull
  public static final Class getRuntimeClassOfKClassInstance(@NotNull KClass paramKClass) {
    long l = a ^ 0x7200040E18BAL;
    Intrinsics.checkNotNullParameter(paramKClass, "<this>");
    boolean bool = false;
    Intrinsics.checkNotNull(paramKClass.getClass(), "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
    return paramKClass.getClass();
  }
  
  @NotNull
  public static final KClass getAnnotationClass(@NotNull Annotation paramAnnotation) {
    long l = a ^ 0x508C450772F6L;
    Intrinsics.checkNotNullParameter(paramAnnotation, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramAnnotation.annotationType(), "this as java.lang.annota…otation).annotationType()");
    Intrinsics.checkNotNull(getKotlinClass(paramAnnotation.annotationType()), "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
    return getKotlinClass(paramAnnotation.annotationType());
  }
  
  @NotNull
  public static final KClass getKotlinClass(@NotNull Class paramClass) {
    long l = a ^ 0x7D429F04C60L;
    Intrinsics.checkNotNullParameter(paramClass, "<this>");
    return Reflection.getOrCreateKotlinClass(paramClass);
  }
  
  @NotNull
  public static final Class getJavaObjectType(@NotNull KClass paramKClass) {
    long l = a ^ 0x46206419F43AL;
    Intrinsics.checkNotNullParameter(paramKClass, "<this>");
    Class clazz = ((ClassBasedDeclarationContainer)paramKClass).getJClass();
    try {
      if (!clazz.isPrimitive()) {
        Intrinsics.checkNotNull(clazz, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clazz;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = clazz.getName();
    try {
      if (str != null)
        try {
          switch (str.hashCode()) {
            case 64711720:
              try {
                if (!str.equals("boolean"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 3625364:
              try {
                if (!str.equals("void"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 3039496:
              try {
                if (!str.equals("byte"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case -1325958191:
              try {
                if (!str.equals("double"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 3052374:
              try {
                if (!str.equals("char"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 109413500:
              try {
                if (!str.equals("short"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 97526364:
              try {
                if (!str.equals("float"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 104431:
              try {
                if (!str.equals("int"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            case 3327612:
              try {
                if (!str.equals("long"))
                  break; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(clazz, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
    return clazz;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\JvmClassMappingKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
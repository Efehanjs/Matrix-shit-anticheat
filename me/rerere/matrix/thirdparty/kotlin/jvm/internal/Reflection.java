package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.reflect.KClass;
import me.rerere.matrix.thirdparty.kotlin.reflect.KClassifier;
import me.rerere.matrix.thirdparty.kotlin.reflect.KDeclarationContainer;
import me.rerere.matrix.thirdparty.kotlin.reflect.KFunction;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty0;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty1;
import me.rerere.matrix.thirdparty.kotlin.reflect.KMutableProperty2;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty0;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty1;
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty2;
import me.rerere.matrix.thirdparty.kotlin.reflect.KType;
import me.rerere.matrix.thirdparty.kotlin.reflect.KTypeParameter;
import me.rerere.matrix.thirdparty.kotlin.reflect.KTypeProjection;
import me.rerere.matrix.thirdparty.kotlin.reflect.KVariance;

public class Reflection {
  private static final KClass[] EMPTY_K_CLASS_ARRAY;
  
  public static final String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
  
  private static final ReflectionFactory factory;
  
  public static KProperty2 property2(PropertyReference2 paramPropertyReference2) {
    return factory.property2(paramPropertyReference2);
  }
  
  public static KClass createKotlinClass(Class paramClass) {
    return factory.createKotlinClass(paramClass);
  }
  
  @SinceKotlin(version = "1.4")
  public static KType typeOf(Class paramClass) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), Collections.emptyList(), false);
  }
  
  @SinceKotlin(version = "1.4")
  public static KType nullableTypeOf(Class paramClass, KTypeProjection... paramVarArgs) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), ArraysKt.toList((Object[])paramVarArgs), true);
  }
  
  public static KMutableProperty0 mutableProperty0(MutablePropertyReference0 paramMutablePropertyReference0) {
    return factory.mutableProperty0(paramMutablePropertyReference0);
  }
  
  @SinceKotlin(version = "1.4")
  public static KType nullableTypeOf(KClassifier paramKClassifier) {
    return factory.typeOf(paramKClassifier, Collections.emptyList(), true);
  }
  
  public static KClass getOrCreateKotlinClass(Class paramClass, String paramString) {
    return factory.getOrCreateKotlinClass(paramClass, paramString);
  }
  
  public static KClass getOrCreateKotlinClass(Class paramClass) {
    return factory.getOrCreateKotlinClass(paramClass);
  }
  
  public static KMutableProperty2 mutableProperty2(MutablePropertyReference2 paramMutablePropertyReference2) {
    return factory.mutableProperty2(paramMutablePropertyReference2);
  }
  
  @SinceKotlin(version = "1.6")
  public static KType platformType(KType paramKType1, KType paramKType2) {
    return factory.platformType(paramKType1, paramKType2);
  }
  
  static {
    ReflectionFactory reflectionFactory;
    long l = o3.a(7293213351104591286L, -5574309561355781354L, null).a(207525422641629L) ^ 0x143E6822014AL;
    try {
      Class<?> clazz = Class.forName("me.rerere.matrix.thirdparty.kotlin.reflect.jvm.internal.ReflectionFactoryImpl");
      reflectionFactory = (ReflectionFactory)clazz.newInstance();
    } catch (ClassCastException classCastException) {
      reflectionFactory = null;
    } catch (ClassNotFoundException classNotFoundException) {
      reflectionFactory = null;
    } catch (InstantiationException instantiationException) {
      reflectionFactory = null;
    } catch (IllegalAccessException illegalAccessException) {
      reflectionFactory = null;
    } 
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    factory = (reflectionFactory != null) ? reflectionFactory : new ReflectionFactory();
    EMPTY_K_CLASS_ARRAY = new KClass[0];
  }
  
  public static KDeclarationContainer getOrCreateKotlinPackage(Class paramClass, String paramString) {
    return factory.getOrCreateKotlinPackage(paramClass, paramString);
  }
  
  @SinceKotlin(version = "1.4")
  public static KType typeOf(Class paramClass, KTypeProjection... paramVarArgs) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), ArraysKt.toList((Object[])paramVarArgs), false);
  }
  
  @SinceKotlin(version = "1.6")
  public static KType mutableCollectionType(KType paramKType) {
    return factory.mutableCollectionType(paramKType);
  }
  
  @SinceKotlin(version = "1.6")
  public static KType nothingType(KType paramKType) {
    return factory.nothingType(paramKType);
  }
  
  @SinceKotlin(version = "1.4")
  public static KType typeOf(Class paramClass, KTypeProjection paramKTypeProjection) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), Collections.singletonList(paramKTypeProjection), false);
  }
  
  public static KFunction function(FunctionReference paramFunctionReference) {
    return factory.function(paramFunctionReference);
  }
  
  @SinceKotlin(version = "1.4")
  public static KType nullableTypeOf(Class paramClass) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), Collections.emptyList(), true);
  }
  
  @SinceKotlin(version = "1.4")
  public static KType nullableTypeOf(Class paramClass, KTypeProjection paramKTypeProjection1, KTypeProjection paramKTypeProjection2) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), Arrays.asList(new KTypeProjection[] { paramKTypeProjection1, paramKTypeProjection2 }, ), true);
  }
  
  public static KClass[] getOrCreateKotlinClasses(Class[] paramArrayOfClass) {
    int i = paramArrayOfClass.length;
    try {
      if (i == 0)
        return EMPTY_K_CLASS_ARRAY; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    KClass[] arrayOfKClass = new KClass[i];
    byte b = 0;
    try {
      while (b < i) {
        arrayOfKClass[b] = getOrCreateKotlinClass(paramArrayOfClass[b]);
        b++;
      } 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return arrayOfKClass;
  }
  
  @SinceKotlin(version = "1.4")
  public static KType typeOf(KClassifier paramKClassifier) {
    return factory.typeOf(paramKClassifier, Collections.emptyList(), false);
  }
  
  @SinceKotlin(version = "1.4")
  public static void setUpperBounds(KTypeParameter paramKTypeParameter, KType... paramVarArgs) {
    factory.setUpperBounds(paramKTypeParameter, ArraysKt.toList((Object[])paramVarArgs));
  }
  
  @SinceKotlin(version = "1.4")
  public static KType nullableTypeOf(Class paramClass, KTypeProjection paramKTypeProjection) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), Collections.singletonList(paramKTypeProjection), true);
  }
  
  public static KProperty0 property0(PropertyReference0 paramPropertyReference0) {
    return factory.property0(paramPropertyReference0);
  }
  
  public static KProperty1 property1(PropertyReference1 paramPropertyReference1) {
    return factory.property1(paramPropertyReference1);
  }
  
  @SinceKotlin(version = "1.4")
  public static void setUpperBounds(KTypeParameter paramKTypeParameter, KType paramKType) {
    factory.setUpperBounds(paramKTypeParameter, Collections.singletonList(paramKType));
  }
  
  @SinceKotlin(version = "1.4")
  public static KType typeOf(Class paramClass, KTypeProjection paramKTypeProjection1, KTypeProjection paramKTypeProjection2) {
    return factory.typeOf((KClassifier)getOrCreateKotlinClass(paramClass), Arrays.asList(new KTypeProjection[] { paramKTypeProjection1, paramKTypeProjection2 }, ), false);
  }
  
  @SinceKotlin(version = "1.4")
  public static KDeclarationContainer getOrCreateKotlinPackage(Class paramClass) {
    return factory.getOrCreateKotlinPackage(paramClass, "");
  }
  
  @SinceKotlin(version = "1.4")
  public static KTypeParameter typeParameter(Object paramObject, String paramString, KVariance paramKVariance, boolean paramBoolean) {
    return factory.typeParameter(paramObject, paramString, paramKVariance, paramBoolean);
  }
  
  public static KMutableProperty1 mutableProperty1(MutablePropertyReference1 paramMutablePropertyReference1) {
    return factory.mutableProperty1(paramMutablePropertyReference1);
  }
  
  @SinceKotlin(version = "1.3")
  public static String renderLambdaToString(FunctionBase paramFunctionBase) {
    return factory.renderLambdaToString(paramFunctionBase);
  }
  
  @SinceKotlin(version = "1.1")
  public static String renderLambdaToString(Lambda paramLambda) {
    return factory.renderLambdaToString(paramLambda);
  }
  
  public static KClass createKotlinClass(Class paramClass, String paramString) {
    return factory.createKotlinClass(paramClass, paramString);
  }
  
  private static ClassCastException a(ClassCastException paramClassCastException) {
    return paramClassCastException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\Reflection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
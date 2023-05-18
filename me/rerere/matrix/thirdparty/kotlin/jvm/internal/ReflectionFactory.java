package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
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
import me.rerere.matrix.thirdparty.kotlin.reflect.KVariance;

public class ReflectionFactory {
  private static final String KOTLIN_JVM_FUNCTIONS = "me.rerere.matrix.thirdparty.kotlin.jvm.functions.";
  
  private static final long a = o3.a(-4463717985629774176L, 3247589707829166329L, null).a(36183221104144L);
  
  public KMutableProperty1 mutableProperty1(MutablePropertyReference1 paramMutablePropertyReference1) {
    return paramMutablePropertyReference1;
  }
  
  public KMutableProperty0 mutableProperty0(MutablePropertyReference0 paramMutablePropertyReference0) {
    return paramMutablePropertyReference0;
  }
  
  public KClass createKotlinClass(Class paramClass, String paramString) {
    return new ClassReference(paramClass);
  }
  
  public KProperty2 property2(PropertyReference2 paramPropertyReference2) {
    return paramPropertyReference2;
  }
  
  public KProperty1 property1(PropertyReference1 paramPropertyReference1) {
    return paramPropertyReference1;
  }
  
  public KClass createKotlinClass(Class paramClass) {
    return new ClassReference(paramClass);
  }
  
  public KProperty0 property0(PropertyReference0 paramPropertyReference0) {
    return paramPropertyReference0;
  }
  
  @SinceKotlin(version = "1.1")
  public String renderLambdaToString(Lambda paramLambda) {
    return renderLambdaToString(paramLambda);
  }
  
  @SinceKotlin(version = "1.3")
  public String renderLambdaToString(FunctionBase paramFunctionBase) {
    long l = a ^ 0x67567DB937E8L;
    String str = paramFunctionBase.getClass().getGenericInterfaces()[0].toString();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return str.startsWith("me.rerere.matrix.thirdparty.kotlin.jvm.functions.") ? str.substring("me.rerere.matrix.thirdparty.kotlin.jvm.functions.".length()) : str;
  }
  
  public KFunction function(FunctionReference paramFunctionReference) {
    return paramFunctionReference;
  }
  
  @SinceKotlin(version = "1.6")
  public KType mutableCollectionType(KType paramKType) {
    TypeReference typeReference = (TypeReference)paramKType;
    return new TypeReference(paramKType.getClassifier(), paramKType.getArguments(), typeReference.getPlatformTypeUpperBound$kotlin_stdlib(), typeReference.getFlags$kotlin_stdlib() | 0x2);
  }
  
  public KDeclarationContainer getOrCreateKotlinPackage(Class paramClass, String paramString) {
    return new PackageReference(paramClass, paramString);
  }
  
  public KMutableProperty2 mutableProperty2(MutablePropertyReference2 paramMutablePropertyReference2) {
    return paramMutablePropertyReference2;
  }
  
  @SinceKotlin(version = "1.4")
  public KType typeOf(KClassifier paramKClassifier, List paramList, boolean paramBoolean) {
    return new TypeReference(paramKClassifier, paramList, paramBoolean);
  }
  
  @SinceKotlin(version = "1.6")
  public KType nothingType(KType paramKType) {
    TypeReference typeReference = (TypeReference)paramKType;
    return new TypeReference(paramKType.getClassifier(), paramKType.getArguments(), typeReference.getPlatformTypeUpperBound$kotlin_stdlib(), typeReference.getFlags$kotlin_stdlib() | 0x4);
  }
  
  @SinceKotlin(version = "1.4")
  public KTypeParameter typeParameter(Object paramObject, String paramString, KVariance paramKVariance, boolean paramBoolean) {
    return new TypeParameterReference(paramObject, paramString, paramKVariance, paramBoolean);
  }
  
  public KClass getOrCreateKotlinClass(Class paramClass, String paramString) {
    return new ClassReference(paramClass);
  }
  
  @SinceKotlin(version = "1.6")
  public KType platformType(KType paramKType1, KType paramKType2) {
    return new TypeReference(paramKType1.getClassifier(), paramKType1.getArguments(), paramKType2, ((TypeReference)paramKType1).getFlags$kotlin_stdlib());
  }
  
  @SinceKotlin(version = "1.4")
  public void setUpperBounds(KTypeParameter paramKTypeParameter, List paramList) {
    ((TypeParameterReference)paramKTypeParameter).setUpperBounds(paramList);
  }
  
  public KClass getOrCreateKotlinClass(Class paramClass) {
    return new ClassReference(paramClass);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ReflectionFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
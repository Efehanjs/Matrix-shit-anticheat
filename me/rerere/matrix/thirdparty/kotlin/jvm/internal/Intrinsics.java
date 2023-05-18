package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.KotlinNullPointerException;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.UninitializedPropertyAccessException;

public class Intrinsics {
  private static final long a = o3.a(4584184178856391353L, 1773493198582406355L, null).a(174461932777140L);
  
  public static void reifiedOperationMarker(int paramInt, String paramString1, String paramString2) {
    throwUndefinedForReified(paramString2);
  }
  
  public static void throwUndefinedForReified() {
    long l = a ^ 0xBA06B7EF7EAL;
    throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
  }
  
  public static void checkHasClass(String paramString1, String paramString2) throws ClassNotFoundException {
    long l = a ^ 0x3FF3498D0EF3L;
    String str = paramString1.replace('/', '.');
    try {
      Class.forName(str);
    } catch (ClassNotFoundException classNotFoundException) {
      throw (ClassNotFoundException)sanitizeStackTrace(new ClassNotFoundException("Class " + str + " is not found: this code requires the Kotlin runtime of version at least " + paramString2, classNotFoundException));
    } 
  }
  
  @SinceKotlin(version = "1.1")
  public static boolean areEqual(Double paramDouble, double paramDouble1) {
    try {
      if (paramDouble != null)
        try {
          if (paramDouble.doubleValue() == paramDouble1);
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        }  
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void throwIllegalArgument(String paramString) {
    throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException(paramString));
  }
  
  public static void checkFieldIsNotNull(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(paramString)); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void checkReturnedValueIsNotNull(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(paramString)); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void throwNpe() {
    throw (KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException());
  }
  
  public static void checkHasClass(String paramString) throws ClassNotFoundException {
    long l = a ^ 0x6F7763DC7755L;
    String str = paramString.replace('/', '.');
    try {
      Class.forName(str);
    } catch (ClassNotFoundException classNotFoundException) {
      throw (ClassNotFoundException)sanitizeStackTrace(new ClassNotFoundException("Class " + str + " is not found. Please update the Kotlin runtime to the latest version", classNotFoundException));
    } 
  }
  
  public static void throwIllegalArgument() {
    throw (IllegalArgumentException)sanitizeStackTrace(new IllegalArgumentException());
  }
  
  public static String stringPlus(String paramString, Object paramObject) {
    return paramString + paramObject;
  }
  
  public static void needClassReification() {
    throwUndefinedForReified();
  }
  
  @SinceKotlin(version = "1.1")
  public static boolean areEqual(Float paramFloat1, Float paramFloat2) {
    try {
      if (paramFloat1 == null) {
        try {
        
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramFloat2 != null)
            try {
              if (paramFloat1.floatValue() == paramFloat2.floatValue());
            } catch (KotlinNullPointerException kotlinNullPointerException) {
              throw a(null);
            }  
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        } 
      } 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  @SinceKotlin(version = "1.1")
  public static boolean areEqual(Float paramFloat, float paramFloat1) {
    try {
      if (paramFloat != null)
        try {
          if (paramFloat.floatValue() == paramFloat1);
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        }  
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void checkFieldIsNotNull(Object paramObject, String paramString1, String paramString2) {
    long l = a ^ 0x42A196D56FD8L;
    try {
      if (paramObject == null)
        throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException("Field specified as non-null is null: " + paramString1 + "." + paramString2)); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void reifiedOperationMarker(int paramInt, String paramString) {
    throwUndefinedForReified();
  }
  
  public static void checkNotNullExpressionValue(Object paramObject, String paramString) {
    long l = a ^ 0x6F7D5B5BD7B6L;
    try {
      if (paramObject == null)
        throw (NullPointerException)sanitizeStackTrace(new NullPointerException(paramString + " must not be null")); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static boolean areEqual(Object paramObject1, Object paramObject2) {
    try {
      if (paramObject1 == null) {
        try {
        
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        } 
      } else {
      
      } 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return paramObject1.equals(paramObject2);
  }
  
  @SinceKotlin(version = "1.1")
  public static boolean areEqual(float paramFloat, Float paramFloat1) {
    try {
      if (paramFloat1 != null)
        try {
          if (paramFloat == paramFloat1.floatValue());
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        }  
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void throwNpe(String paramString) {
    throw (KotlinNullPointerException)sanitizeStackTrace(new KotlinNullPointerException(paramString));
  }
  
  public static int compare(long paramLong1, long paramLong2) {
    try {
      try {
      
      } catch (KotlinNullPointerException kotlinNullPointerException) {
        throw a(null);
      } 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return (paramLong1 < paramLong2) ? -1 : ((paramLong1 == paramLong2) ? 0 : 1);
  }
  
  public static void needClassReification(String paramString) {
    throwUndefinedForReified(paramString);
  }
  
  public static void checkNotNull(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throwJavaNpe(paramString); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void checkExpressionValueIsNotNull(Object paramObject, String paramString) {
    long l = a ^ 0x75827C61C372L;
    try {
      if (paramObject == null)
        throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(paramString + " must not be null")); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void throwIllegalState() {
    throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException());
  }
  
  @SinceKotlin(version = "1.4")
  public static void throwJavaNpe() {
    throw (NullPointerException)sanitizeStackTrace(new NullPointerException());
  }
  
  public static void throwAssert(String paramString) {
    throw (AssertionError)sanitizeStackTrace(new AssertionError(paramString));
  }
  
  public static Throwable sanitizeStackTrace(Throwable paramThrowable, String paramString) {
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    int i = arrayOfStackTraceElement.length;
    byte b = -1;
    byte b1 = 0;
    while (true) {
      try {
        if (b1 < i) {
          if (paramString.equals(arrayOfStackTraceElement[b1].getClassName()))
            b = b1; 
          b1++;
          continue;
        } 
      } catch (KotlinNullPointerException kotlinNullPointerException) {
        throw a(null);
      } 
      StackTraceElement[] arrayOfStackTraceElement1 = Arrays.<StackTraceElement>copyOfRange(arrayOfStackTraceElement, b + 1, i);
      paramThrowable.setStackTrace(arrayOfStackTraceElement1);
      return paramThrowable;
    } 
  }
  
  @SinceKotlin(version = "1.1")
  public static boolean areEqual(double paramDouble, Double paramDouble1) {
    try {
      if (paramDouble1 != null)
        try {
          if (paramDouble == paramDouble1.doubleValue());
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        }  
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void checkNotNull(Object paramObject) {
    try {
      if (paramObject == null)
        throwJavaNpe(); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void throwUndefinedForReified(String paramString) {
    throw new UnsupportedOperationException(paramString);
  }
  
  public static int compare(int paramInt1, int paramInt2) {
    try {
      try {
      
      } catch (KotlinNullPointerException kotlinNullPointerException) {
        throw a(null);
      } 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return (paramInt1 < paramInt2) ? -1 : ((paramInt1 == paramInt2) ? 0 : 1);
  }
  
  public static void throwIllegalState(String paramString) {
    throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException(paramString));
  }
  
  public static void throwAssert() {
    throw (AssertionError)sanitizeStackTrace(new AssertionError());
  }
  
  public static void checkNotNullParameter(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throwParameterIsNullNPE(paramString); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  @SinceKotlin(version = "1.4")
  public static void throwJavaNpe(String paramString) {
    throw (NullPointerException)sanitizeStackTrace(new NullPointerException(paramString));
  }
  
  public static void checkReturnedValueIsNotNull(Object paramObject, String paramString1, String paramString2) {
    long l = a ^ 0x4C1DF727CEDBL;
    try {
      if (paramObject == null)
        throw (IllegalStateException)sanitizeStackTrace(new IllegalStateException("Method specified as non-null returned null: " + paramString1 + "." + paramString2)); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void checkParameterIsNotNull(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throwParameterIsNullIAE(paramString); 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
  }
  
  public static void throwUninitializedProperty(String paramString) {
    throw (UninitializedPropertyAccessException)sanitizeStackTrace(new UninitializedPropertyAccessException(paramString));
  }
  
  public static void throwUninitializedPropertyAccessException(String paramString) {
    long l = a ^ 0x1C7262C94B64L;
    throwUninitializedProperty("lateinit property " + paramString + " has not been initialized");
  }
  
  @SinceKotlin(version = "1.1")
  public static boolean areEqual(Double paramDouble1, Double paramDouble2) {
    try {
      if (paramDouble1 == null) {
        try {
        
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        } 
      } else {
        try {
          if (paramDouble2 != null)
            try {
              if (paramDouble1.doubleValue() == paramDouble2.doubleValue());
            } catch (KotlinNullPointerException kotlinNullPointerException) {
              throw a(null);
            }  
        } catch (KotlinNullPointerException kotlinNullPointerException) {
          throw a(null);
        } 
      } 
    } catch (KotlinNullPointerException kotlinNullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private static KotlinNullPointerException a(KotlinNullPointerException paramKotlinNullPointerException) {
    return paramKotlinNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\Intrinsics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
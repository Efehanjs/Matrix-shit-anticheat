package me.rerere.matrix.thirdparty.com.google.gson.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.rerere.matrix.thirdparty.com.google.gson.ExclusionStrategy;
import me.rerere.matrix.thirdparty.com.google.gson.FieldAttributes;
import me.rerere.matrix.thirdparty.com.google.gson.Gson;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapter;
import me.rerere.matrix.thirdparty.com.google.gson.TypeAdapterFactory;
import me.rerere.matrix.thirdparty.com.google.gson.annotations.Expose;
import me.rerere.matrix.thirdparty.com.google.gson.annotations.Since;
import me.rerere.matrix.thirdparty.com.google.gson.annotations.Until;
import me.rerere.matrix.thirdparty.com.google.gson.reflect.TypeToken;

public final class Excluder implements TypeAdapterFactory, Cloneable {
  private double version = -1.0D;
  
  private int modifiers = 136;
  
  private List deserializationStrategies = Collections.emptyList();
  
  private boolean serializeInnerClasses = true;
  
  private static final double IGNORE_VERSIONS = -1.0D;
  
  public static final Excluder DEFAULT = new Excluder();
  
  private boolean requireExpose;
  
  private List serializationStrategies = Collections.emptyList();
  
  public Excluder excludeFieldsWithoutExposeAnnotation() {
    Excluder excluder = clone();
    excluder.requireExpose = true;
    return excluder;
  }
  
  public boolean excludeClass(Class paramClass, boolean paramBoolean) {
    try {
      if (!excludeClassChecks(paramClass)) {
        try {
          if (excludeClassInStrategy(paramClass, paramBoolean));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Excluder withVersion(double paramDouble) {
    Excluder excluder = clone();
    excluder.version = paramDouble;
    return excluder;
  }
  
  public boolean excludeField(Field paramField, boolean paramBoolean) {
    try {
      if ((this.modifiers & paramField.getModifiers()) != 0)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.version != -1.0D)
        try {
          if (!isValidVersion(paramField.<Since>getAnnotation(Since.class), paramField.<Until>getAnnotation(Until.class)))
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramField.isSynthetic())
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (this.requireExpose) {
      Expose expose = paramField.<Expose>getAnnotation(Expose.class);
      try {
        if (expose != null) {
          try {
            if (paramBoolean) {
              try {
                if (!expose.serialize())
                  return true; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } else {
              try {
                if (!expose.deserialize())
                  return true; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
          return true;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (!this.serializeInnerClasses)
        try {
          if (isInnerClass(paramField.getType()))
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (isAnonymousOrLocal(paramField.getType()))
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List list = paramBoolean ? this.serializationStrategies : this.deserializationStrategies;
    if (!list.isEmpty()) {
      FieldAttributes fieldAttributes = new FieldAttributes(paramField);
      for (ExclusionStrategy exclusionStrategy : list) {
        try {
          if (exclusionStrategy.shouldSkipField(fieldAttributes))
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
    return false;
  }
  
  public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual getRawType : ()Ljava/lang/Class;
    //   4: astore_3
    //   5: aload_0
    //   6: aload_3
    //   7: invokespecial excludeClassChecks : (Ljava/lang/Class;)Z
    //   10: istore #4
    //   12: iload #4
    //   14: ifne -> 33
    //   17: aload_0
    //   18: aload_3
    //   19: iconst_1
    //   20: invokespecial excludeClassInStrategy : (Ljava/lang/Class;Z)Z
    //   23: ifeq -> 41
    //   26: goto -> 33
    //   29: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   32: athrow
    //   33: iconst_1
    //   34: goto -> 42
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: iconst_0
    //   42: istore #5
    //   44: iload #4
    //   46: ifne -> 65
    //   49: aload_0
    //   50: aload_3
    //   51: iconst_0
    //   52: invokespecial excludeClassInStrategy : (Ljava/lang/Class;Z)Z
    //   55: ifeq -> 73
    //   58: goto -> 65
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: iconst_1
    //   66: goto -> 74
    //   69: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   72: athrow
    //   73: iconst_0
    //   74: istore #6
    //   76: iload #5
    //   78: ifne -> 99
    //   81: iload #6
    //   83: ifne -> 99
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: aconst_null
    //   94: areturn
    //   95: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   98: athrow
    //   99: new me/rerere/matrix/thirdparty/com/google/gson/internal/Excluder$1
    //   102: dup
    //   103: aload_0
    //   104: iload #6
    //   106: iload #5
    //   108: aload_1
    //   109: aload_2
    //   110: invokespecial <init> : (Lme/rerere/matrix/thirdparty/com/google/gson/internal/Excluder;ZZLme/rerere/matrix/thirdparty/com/google/gson/Gson;Lme/rerere/matrix/thirdparty/com/google/gson/reflect/TypeToken;)V
    //   113: areturn
    // Exception table:
    //   from	to	target	type
    //   12	26	29	java/lang/RuntimeException
    //   17	37	37	java/lang/RuntimeException
    //   44	58	61	java/lang/RuntimeException
    //   49	69	69	java/lang/RuntimeException
    //   76	86	89	java/lang/RuntimeException
    //   81	95	95	java/lang/RuntimeException
  }
  
  public Excluder disableInnerClassSerialization() {
    Excluder excluder = clone();
    excluder.serializeInnerClasses = false;
    return excluder;
  }
  
  public Excluder withExclusionStrategy(ExclusionStrategy paramExclusionStrategy, boolean paramBoolean1, boolean paramBoolean2) {
    Excluder excluder = clone();
    try {
      if (paramBoolean1) {
        excluder.serializationStrategies = new ArrayList(this.serializationStrategies);
        excluder.serializationStrategies.add(paramExclusionStrategy);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramBoolean2) {
        excluder.deserializationStrategies = new ArrayList(this.deserializationStrategies);
        excluder.deserializationStrategies.add(paramExclusionStrategy);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return excluder;
  }
  
  public Excluder clone() {
    try {
      return (Excluder)super.clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public Excluder withModifiers(int... paramVarArgs) {
    Excluder excluder = clone();
    excluder.modifiers = 0;
    for (int i : paramVarArgs)
      excluder.modifiers |= i; 
    return excluder;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\internal\Excluder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
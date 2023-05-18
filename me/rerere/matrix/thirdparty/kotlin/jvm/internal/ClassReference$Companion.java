package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmClassMappingKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ClassReference$Companion {
  private static final long a = o3.a(1023894124052116112L, 1594789403063792988L, null).a(23486940964436L);
  
  @Nullable
  public final String getClassSimpleName(@NotNull Class paramClass) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/kotlin/jvm/internal/ClassReference$Companion.a : J
    //   3: ldc2_w 2317837838462
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'jClass'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: nop
    //   15: aload_1
    //   16: invokevirtual isAnonymousClass : ()Z
    //   19: ifeq -> 30
    //   22: aconst_null
    //   23: goto -> 313
    //   26: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   29: athrow
    //   30: aload_1
    //   31: invokevirtual isLocalClass : ()Z
    //   34: ifeq -> 191
    //   37: aload_1
    //   38: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   41: astore #4
    //   43: aload_1
    //   44: invokevirtual getEnclosingMethod : ()Ljava/lang/reflect/Method;
    //   47: dup
    //   48: ifnull -> 103
    //   51: astore #6
    //   53: aload #6
    //   55: astore #7
    //   57: iconst_0
    //   58: istore #8
    //   60: aload #4
    //   62: ldc 'name'
    //   64: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   67: aload #4
    //   69: new java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: aload #7
    //   78: invokevirtual getName : ()Ljava/lang/String;
    //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: bipush #36
    //   86: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: aconst_null
    //   93: iconst_2
    //   94: aconst_null
    //   95: invokestatic substringAfter$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   98: nop
    //   99: dup
    //   100: ifnonnull -> 313
    //   103: pop
    //   104: aload_1
    //   105: invokevirtual getEnclosingConstructor : ()Ljava/lang/reflect/Constructor;
    //   108: dup
    //   109: ifnull -> 169
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: astore #7
    //   121: aload #7
    //   123: astore #8
    //   125: iconst_0
    //   126: istore #9
    //   128: aload #4
    //   130: ldc 'name'
    //   132: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   135: aload #4
    //   137: new java/lang/StringBuilder
    //   140: dup
    //   141: invokespecial <init> : ()V
    //   144: aload #8
    //   146: invokevirtual getName : ()Ljava/lang/String;
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: bipush #36
    //   154: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: aconst_null
    //   161: iconst_2
    //   162: aconst_null
    //   163: invokestatic substringAfter$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   166: goto -> 313
    //   169: pop
    //   170: nop
    //   171: aload #4
    //   173: ldc 'name'
    //   175: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   178: aload #4
    //   180: bipush #36
    //   182: aconst_null
    //   183: iconst_2
    //   184: aconst_null
    //   185: invokestatic substringAfter$default : (Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   188: goto -> 313
    //   191: aload_1
    //   192: invokevirtual isArray : ()Z
    //   195: ifeq -> 282
    //   198: aload_1
    //   199: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   202: astore #4
    //   204: nop
    //   205: aload #4
    //   207: invokevirtual isPrimitive : ()Z
    //   210: ifeq -> 267
    //   213: invokestatic access$getSimpleNames$cp : ()Ljava/util/Map;
    //   216: aload #4
    //   218: invokevirtual getName : ()Ljava/lang/String;
    //   221: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   226: checkcast java/lang/String
    //   229: astore #5
    //   231: aload #5
    //   233: ifnull -> 263
    //   236: new java/lang/StringBuilder
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: aload #5
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: ldc 'Array'
    //   250: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: goto -> 268
    //   259: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   262: athrow
    //   263: aconst_null
    //   264: goto -> 268
    //   267: aconst_null
    //   268: dup
    //   269: ifnonnull -> 313
    //   272: pop
    //   273: ldc 'Array'
    //   275: goto -> 313
    //   278: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   281: athrow
    //   282: invokestatic access$getSimpleNames$cp : ()Ljava/util/Map;
    //   285: aload_1
    //   286: invokevirtual getName : ()Ljava/lang/String;
    //   289: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   294: checkcast java/lang/String
    //   297: dup
    //   298: ifnonnull -> 313
    //   301: pop
    //   302: aload_1
    //   303: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: areturn
    // Exception table:
    //   from	to	target	type
    //   8	26	26	java/lang/RuntimeException
    //   60	112	115	java/lang/RuntimeException
    //   231	259	259	java/lang/RuntimeException
    //   268	278	278	java/lang/RuntimeException
    //   282	306	309	java/lang/RuntimeException
  }
  
  public final boolean isInstance(@Nullable Object paramObject, @NotNull Class paramClass) {
    long l = a ^ 0x3E6D22F2BEB7L;
    Intrinsics.checkNotNullParameter(paramClass, "jClass");
    Intrinsics.checkNotNull(ClassReference.access$getFUNCTION_CLASSES$cp(), "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
    Integer integer = (Integer)ClassReference.access$getFUNCTION_CLASSES$cp().get(paramClass);
    if (integer != null) {
      Integer integer1 = integer;
      int i = integer1.intValue();
      boolean bool = false;
      return TypeIntrinsics.isFunctionOfArity(paramObject, i);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Class clazz = paramClass.isPrimitive() ? JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(paramClass)) : paramClass;
    return clazz.isInstance(paramObject);
  }
  
  @Nullable
  public final String getClassQualifiedName(@NotNull Class paramClass) {
    long l = a ^ 0x269D7449C4BCL;
    try {
      Intrinsics.checkNotNullParameter(paramClass, "jClass");
      try {
        if (paramClass.isArray()) {
          Class<?> clazz = paramClass.getComponentType();
          if (clazz.isPrimitive()) {
            String str = (String)ClassReference.access$getClassFqNames$cp().get(clazz.getName());
            try {
            
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } else {
          
          } 
          try {
            if (null == null)
              null; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } else {
          try {
            if ((String)ClassReference.access$getClassFqNames$cp().get(paramClass.getName()) == null)
              (String)ClassReference.access$getClassFqNames$cp().get(paramClass.getName()); 
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
    return paramClass.isAnonymousClass() ? null : (paramClass.isLocalClass() ? null : paramClass.getCanonicalName());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\ClassReference$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.internal;

import java.lang.reflect.Method;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class PlatformImplementations$ReflectThrowable {
  @JvmField
  @Nullable
  public static final Method addSuppressed;
  
  @NotNull
  public static final PlatformImplementations$ReflectThrowable INSTANCE;
  
  @JvmField
  @Nullable
  public static final Method getSuppressed;
  
  static {
    // Byte code:
    //   0: ldc2_w 86592719886888468
    //   3: ldc2_w 4807981661488445915
    //   6: aconst_null
    //   7: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   10: ldc2_w 162922230766933
    //   13: invokeinterface a : (J)J
    //   18: ldc2_w 59496843011761
    //   21: lxor
    //   22: lstore_0
    //   23: new me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations$ReflectThrowable
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: putstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations$ReflectThrowable.INSTANCE : Lme/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations$ReflectThrowable;
    //   33: ldc java/lang/Throwable
    //   35: astore_2
    //   36: aload_2
    //   37: invokevirtual getMethods : ()[Ljava/lang/reflect/Method;
    //   40: astore_3
    //   41: aload_3
    //   42: ldc 'throwableMethods'
    //   44: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   47: aload_3
    //   48: astore #4
    //   50: iconst_0
    //   51: istore #5
    //   53: aload #4
    //   55: arraylength
    //   56: istore #6
    //   58: iload #5
    //   60: iload #6
    //   62: if_icmpge -> 150
    //   65: aload #4
    //   67: iload #5
    //   69: aaload
    //   70: astore #7
    //   72: aload #7
    //   74: astore #8
    //   76: iconst_0
    //   77: istore #9
    //   79: aload #8
    //   81: invokevirtual getName : ()Ljava/lang/String;
    //   84: ldc 'addSuppressed'
    //   86: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   89: ifeq -> 131
    //   92: aload #8
    //   94: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   97: dup
    //   98: ldc 'it.parameterTypes'
    //   100: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   103: checkcast [Ljava/lang/Object;
    //   106: invokestatic singleOrNull : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   109: aload_2
    //   110: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   113: ifeq -> 131
    //   116: goto -> 123
    //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   122: athrow
    //   123: iconst_1
    //   124: goto -> 132
    //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   130: athrow
    //   131: iconst_0
    //   132: ifeq -> 144
    //   135: aload #7
    //   137: goto -> 151
    //   140: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   143: athrow
    //   144: iinc #5, 1
    //   147: goto -> 58
    //   150: aconst_null
    //   151: putstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations$ReflectThrowable.addSuppressed : Ljava/lang/reflect/Method;
    //   154: aload_3
    //   155: astore #4
    //   157: iconst_0
    //   158: istore #5
    //   160: aload #4
    //   162: arraylength
    //   163: istore #6
    //   165: iload #5
    //   167: iload #6
    //   169: if_icmpge -> 214
    //   172: aload #4
    //   174: iload #5
    //   176: aaload
    //   177: astore #7
    //   179: aload #7
    //   181: astore #8
    //   183: iconst_0
    //   184: istore #9
    //   186: aload #8
    //   188: invokevirtual getName : ()Ljava/lang/String;
    //   191: ldc 'getSuppressed'
    //   193: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   196: ifeq -> 208
    //   199: aload #7
    //   201: goto -> 215
    //   204: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   207: athrow
    //   208: iinc #5, 1
    //   211: goto -> 165
    //   214: aconst_null
    //   215: putstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations$ReflectThrowable.getSuppressed : Ljava/lang/reflect/Method;
    //   218: return
    // Exception table:
    //   from	to	target	type
    //   79	116	119	java/lang/RuntimeException
    //   92	127	127	java/lang/RuntimeException
    //   132	140	140	java/lang/RuntimeException
    //   186	204	204	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\PlatformImplementations$ReflectThrowable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
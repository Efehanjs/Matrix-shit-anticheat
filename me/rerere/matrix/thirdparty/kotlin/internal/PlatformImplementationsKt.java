package me.rerere.matrix.thirdparty.kotlin.internal;

import me.rerere.matrix.thirdparty.kotlin.KotlinVersion;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class PlatformImplementationsKt {
  @JvmField
  @NotNull
  public static final PlatformImplementations IMPLEMENTATIONS;
  
  private static final long a;
  
  @PublishedApi
  @SinceKotlin(version = "1.2")
  public static final boolean apiVersionIsAtLeast(int paramInt1, int paramInt2, int paramInt3) {
    return KotlinVersion.CURRENT.isAtLeast(paramInt1, paramInt2, paramInt3);
  }
  
  static {
    // Byte code:
    //   0: ldc2_w -2760524793095759356
    //   3: ldc2_w 5082501329339221439
    //   6: aconst_null
    //   7: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   10: ldc2_w 184903988505578
    //   13: invokeinterface a : (J)J
    //   18: putstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementationsKt.a : J
    //   21: getstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementationsKt.a : J
    //   24: ldc2_w 61860945392049
    //   27: lxor
    //   28: lstore_0
    //   29: iconst_0
    //   30: istore_2
    //   31: invokestatic getJavaVersion : ()I
    //   34: istore_3
    //   35: iload_3
    //   36: ldc 65544
    //   38: if_icmpge -> 54
    //   41: iload_3
    //   42: ldc 65536
    //   44: if_icmpge -> 310
    //   47: goto -> 54
    //   50: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   53: athrow
    //   54: nop
    //   55: ldc 'me.rerere.matrix.thirdparty.kotlin.internal.jdk8.JDK8PlatformImplementations'
    //   57: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   60: invokevirtual newInstance : ()Ljava/lang/Object;
    //   63: dup
    //   64: ldc 'forName("kotlin.internal…entations").newInstance()'
    //   66: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   69: astore #4
    //   71: nop
    //   72: aload #4
    //   74: dup
    //   75: ifnonnull -> 92
    //   78: new java/lang/NullPointerException
    //   81: dup
    //   82: ldc 'null cannot be cast to non-null type kotlin.internal.PlatformImplementations'
    //   84: invokespecial <init> : (Ljava/lang/String;)V
    //   87: athrow
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: checkcast me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   95: goto -> 177
    //   98: astore #5
    //   100: aload #4
    //   102: invokevirtual getClass : ()Ljava/lang/Class;
    //   105: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   108: astore #6
    //   110: ldc me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   112: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   115: astore #7
    //   117: aload #6
    //   119: aload #7
    //   121: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   124: ifne -> 174
    //   127: new java/lang/ClassNotFoundException
    //   130: dup
    //   131: new java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial <init> : ()V
    //   138: ldc 'Instance class was loaded from a different classloader: '
    //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: aload #6
    //   145: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   148: ldc ', base type classloader: '
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: aload #7
    //   155: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   158: invokevirtual toString : ()Ljava/lang/String;
    //   161: aload #5
    //   163: checkcast java/lang/Throwable
    //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: athrow
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload #5
    //   176: athrow
    //   177: goto -> 592
    //   180: astore #4
    //   182: nop
    //   183: ldc 'me.rerere.matrix.thirdparty.kotlin.internal.JRE8PlatformImplementations'
    //   185: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   188: invokevirtual newInstance : ()Ljava/lang/Object;
    //   191: dup
    //   192: ldc 'forName("kotlin.internal…entations").newInstance()'
    //   194: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   197: astore #4
    //   199: nop
    //   200: aload #4
    //   202: dup
    //   203: ifnonnull -> 220
    //   206: new java/lang/NullPointerException
    //   209: dup
    //   210: ldc 'null cannot be cast to non-null type kotlin.internal.PlatformImplementations'
    //   212: invokespecial <init> : (Ljava/lang/String;)V
    //   215: athrow
    //   216: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   219: athrow
    //   220: checkcast me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   223: goto -> 305
    //   226: astore #5
    //   228: aload #4
    //   230: invokevirtual getClass : ()Ljava/lang/Class;
    //   233: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   236: astore #6
    //   238: ldc me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   240: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   243: astore #7
    //   245: aload #6
    //   247: aload #7
    //   249: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   252: ifne -> 302
    //   255: new java/lang/ClassNotFoundException
    //   258: dup
    //   259: new java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial <init> : ()V
    //   266: ldc 'Instance class was loaded from a different classloader: '
    //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: aload #6
    //   273: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   276: ldc ', base type classloader: '
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   281: aload #7
    //   283: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   286: invokevirtual toString : ()Ljava/lang/String;
    //   289: aload #5
    //   291: checkcast java/lang/Throwable
    //   294: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   297: athrow
    //   298: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   301: athrow
    //   302: aload #5
    //   304: athrow
    //   305: goto -> 592
    //   308: astore #4
    //   310: iload_3
    //   311: ldc 65543
    //   313: if_icmpge -> 329
    //   316: iload_3
    //   317: ldc 65536
    //   319: if_icmpge -> 585
    //   322: goto -> 329
    //   325: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   328: athrow
    //   329: nop
    //   330: ldc 'me.rerere.matrix.thirdparty.kotlin.internal.jdk7.JDK7PlatformImplementations'
    //   332: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   335: invokevirtual newInstance : ()Ljava/lang/Object;
    //   338: dup
    //   339: ldc 'forName("kotlin.internal…entations").newInstance()'
    //   341: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   344: astore #4
    //   346: nop
    //   347: aload #4
    //   349: dup
    //   350: ifnonnull -> 367
    //   353: new java/lang/NullPointerException
    //   356: dup
    //   357: ldc 'null cannot be cast to non-null type kotlin.internal.PlatformImplementations'
    //   359: invokespecial <init> : (Ljava/lang/String;)V
    //   362: athrow
    //   363: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   366: athrow
    //   367: checkcast me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   370: goto -> 452
    //   373: astore #5
    //   375: aload #4
    //   377: invokevirtual getClass : ()Ljava/lang/Class;
    //   380: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   383: astore #6
    //   385: ldc me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   387: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   390: astore #7
    //   392: aload #6
    //   394: aload #7
    //   396: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   399: ifne -> 449
    //   402: new java/lang/ClassNotFoundException
    //   405: dup
    //   406: new java/lang/StringBuilder
    //   409: dup
    //   410: invokespecial <init> : ()V
    //   413: ldc 'Instance class was loaded from a different classloader: '
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: aload #6
    //   420: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   423: ldc ', base type classloader: '
    //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   428: aload #7
    //   430: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   433: invokevirtual toString : ()Ljava/lang/String;
    //   436: aload #5
    //   438: checkcast java/lang/Throwable
    //   441: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   444: athrow
    //   445: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   448: athrow
    //   449: aload #5
    //   451: athrow
    //   452: goto -> 592
    //   455: astore #4
    //   457: nop
    //   458: ldc 'me.rerere.matrix.thirdparty.kotlin.internal.JRE7PlatformImplementations'
    //   460: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   463: invokevirtual newInstance : ()Ljava/lang/Object;
    //   466: dup
    //   467: ldc 'forName("kotlin.internal…entations").newInstance()'
    //   469: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   472: astore #4
    //   474: nop
    //   475: aload #4
    //   477: dup
    //   478: ifnonnull -> 495
    //   481: new java/lang/NullPointerException
    //   484: dup
    //   485: ldc 'null cannot be cast to non-null type kotlin.internal.PlatformImplementations'
    //   487: invokespecial <init> : (Ljava/lang/String;)V
    //   490: athrow
    //   491: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   494: athrow
    //   495: checkcast me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   498: goto -> 580
    //   501: astore #5
    //   503: aload #4
    //   505: invokevirtual getClass : ()Ljava/lang/Class;
    //   508: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   511: astore #6
    //   513: ldc me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   515: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   518: astore #7
    //   520: aload #6
    //   522: aload #7
    //   524: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   527: ifne -> 577
    //   530: new java/lang/ClassNotFoundException
    //   533: dup
    //   534: new java/lang/StringBuilder
    //   537: dup
    //   538: invokespecial <init> : ()V
    //   541: ldc 'Instance class was loaded from a different classloader: '
    //   543: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: aload #6
    //   548: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   551: ldc ', base type classloader: '
    //   553: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: aload #7
    //   558: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   561: invokevirtual toString : ()Ljava/lang/String;
    //   564: aload #5
    //   566: checkcast java/lang/Throwable
    //   569: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   572: athrow
    //   573: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   576: athrow
    //   577: aload #5
    //   579: athrow
    //   580: goto -> 592
    //   583: astore #4
    //   585: new me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations
    //   588: dup
    //   589: invokespecial <init> : ()V
    //   592: nop
    //   593: putstatic me/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementationsKt.IMPLEMENTATIONS : Lme/rerere/matrix/thirdparty/kotlin/internal/PlatformImplementations;
    //   596: return
    // Exception table:
    //   from	to	target	type
    //   35	47	50	java/lang/ClassCastException
    //   54	180	180	java/lang/ClassNotFoundException
    //   71	88	88	java/lang/ClassCastException
    //   71	98	98	java/lang/ClassCastException
    //   117	170	170	java/lang/ClassCastException
    //   182	308	308	java/lang/ClassNotFoundException
    //   199	216	216	java/lang/ClassCastException
    //   199	226	226	java/lang/ClassCastException
    //   245	298	298	java/lang/ClassCastException
    //   310	322	325	java/lang/ClassCastException
    //   329	455	455	java/lang/ClassNotFoundException
    //   346	363	363	java/lang/ClassCastException
    //   346	373	373	java/lang/ClassCastException
    //   392	445	445	java/lang/ClassCastException
    //   457	583	583	java/lang/ClassNotFoundException
    //   474	491	491	java/lang/ClassCastException
    //   474	501	501	java/lang/ClassCastException
    //   520	573	573	java/lang/ClassCastException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\PlatformImplementationsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
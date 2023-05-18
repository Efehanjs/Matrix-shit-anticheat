package me.rerere.matrix.thirdparty.okhttp3.internal.platform;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Jdk8WithJettyBootPlatform$AlpnProvider implements InvocationHandler {
  private boolean unsupported;
  
  @NotNull
  private final List protocols;
  
  @Nullable
  private String selected;
  
  private static final long a = o3.a(-8704158578204753083L, 6104387237483075779L, MethodHandles.lookup().lookupClass()).a(165611822320827L);
  
  @Nullable
  public final String getSelected() {
    return this.selected;
  }
  
  @Nullable
  public Object invoke(@NotNull Object paramObject, @NotNull Method paramMethod, @Nullable Object[] paramArrayOfObject) throws Throwable {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider.a : J
    //   3: ldc2_w 8552911568115
    //   6: lxor
    //   7: lstore #4
    //   9: aload_1
    //   10: ldc 'proxy'
    //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_2
    //   16: ldc 'method'
    //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_3
    //   22: dup
    //   23: ifnonnull -> 38
    //   26: pop
    //   27: iconst_0
    //   28: anewarray java/lang/Object
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   37: athrow
    //   38: astore #6
    //   40: aload_2
    //   41: invokevirtual getName : ()Ljava/lang/String;
    //   44: astore #7
    //   46: aload_2
    //   47: invokevirtual getReturnType : ()Ljava/lang/Class;
    //   50: astore #8
    //   52: aload #7
    //   54: ldc 'supports'
    //   56: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   59: ifeq -> 89
    //   62: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
    //   65: aload #8
    //   67: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   70: ifeq -> 89
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   79: athrow
    //   80: iconst_1
    //   81: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   84: areturn
    //   85: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   88: athrow
    //   89: aload #7
    //   91: ldc 'unsupported'
    //   93: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   96: ifeq -> 128
    //   99: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
    //   102: aload #8
    //   104: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   107: ifeq -> 128
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   116: athrow
    //   117: aload_0
    //   118: iconst_1
    //   119: putfield unsupported : Z
    //   122: aconst_null
    //   123: areturn
    //   124: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   127: athrow
    //   128: aload #7
    //   130: ldc 'protocols'
    //   132: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   135: ifeq -> 172
    //   138: aload #6
    //   140: arraylength
    //   141: ifne -> 159
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   150: athrow
    //   151: iconst_1
    //   152: goto -> 160
    //   155: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   158: athrow
    //   159: iconst_0
    //   160: ifeq -> 172
    //   163: aload_0
    //   164: getfield protocols : Ljava/util/List;
    //   167: areturn
    //   168: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   171: athrow
    //   172: aload #7
    //   174: ldc 'selectProtocol'
    //   176: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   179: ifne -> 199
    //   182: aload #7
    //   184: ldc 'select'
    //   186: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   189: ifeq -> 395
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   198: athrow
    //   199: ldc java/lang/String
    //   201: aload #8
    //   203: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   206: ifeq -> 395
    //   209: goto -> 216
    //   212: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   215: athrow
    //   216: aload #6
    //   218: arraylength
    //   219: iconst_1
    //   220: if_icmpne -> 395
    //   223: goto -> 230
    //   226: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   229: athrow
    //   230: aload #6
    //   232: iconst_0
    //   233: aaload
    //   234: instanceof java/util/List
    //   237: ifeq -> 395
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   246: athrow
    //   247: aload #6
    //   249: iconst_0
    //   250: aaload
    //   251: dup
    //   252: ifnonnull -> 277
    //   255: goto -> 262
    //   258: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   261: athrow
    //   262: pop
    //   263: new java/lang/NullPointerException
    //   266: dup
    //   267: ldc 'null cannot be cast to non-null type kotlin.collections.List<*>'
    //   269: invokespecial <init> : (Ljava/lang/String;)V
    //   272: athrow
    //   273: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   276: athrow
    //   277: checkcast java/util/List
    //   280: astore #9
    //   282: iconst_0
    //   283: istore #10
    //   285: aload #9
    //   287: invokeinterface size : ()I
    //   292: istore #11
    //   294: iload #10
    //   296: iload #11
    //   298: if_icmpgt -> 373
    //   301: iload #10
    //   303: istore #12
    //   305: iinc #10, 1
    //   308: aload #9
    //   310: iload #12
    //   312: invokeinterface get : (I)Ljava/lang/Object;
    //   317: dup
    //   318: ifnonnull -> 332
    //   321: pop
    //   322: new java/lang/NullPointerException
    //   325: dup
    //   326: ldc 'null cannot be cast to non-null type kotlin.String'
    //   328: invokespecial <init> : (Ljava/lang/String;)V
    //   331: athrow
    //   332: checkcast java/lang/String
    //   335: astore #13
    //   337: aload_0
    //   338: getfield protocols : Ljava/util/List;
    //   341: aload #13
    //   343: invokeinterface contains : (Ljava/lang/Object;)Z
    //   348: ifeq -> 366
    //   351: aload_0
    //   352: aload #13
    //   354: putfield selected : Ljava/lang/String;
    //   357: aload_0
    //   358: getfield selected : Ljava/lang/String;
    //   361: areturn
    //   362: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   365: athrow
    //   366: iload #12
    //   368: iload #11
    //   370: if_icmpne -> 301
    //   373: aload_0
    //   374: aload_0
    //   375: getfield protocols : Ljava/util/List;
    //   378: iconst_0
    //   379: invokeinterface get : (I)Ljava/lang/Object;
    //   384: checkcast java/lang/String
    //   387: putfield selected : Ljava/lang/String;
    //   390: aload_0
    //   391: getfield selected : Ljava/lang/String;
    //   394: areturn
    //   395: aload #7
    //   397: ldc 'protocolSelected'
    //   399: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   402: ifne -> 422
    //   405: aload #7
    //   407: ldc 'selected'
    //   409: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   412: ifeq -> 475
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   421: athrow
    //   422: aload #6
    //   424: arraylength
    //   425: iconst_1
    //   426: if_icmpne -> 475
    //   429: goto -> 436
    //   432: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   435: athrow
    //   436: aload_0
    //   437: aload #6
    //   439: iconst_0
    //   440: aaload
    //   441: dup
    //   442: ifnonnull -> 467
    //   445: goto -> 452
    //   448: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   451: athrow
    //   452: pop
    //   453: new java/lang/NullPointerException
    //   456: dup
    //   457: ldc 'null cannot be cast to non-null type kotlin.String'
    //   459: invokespecial <init> : (Ljava/lang/String;)V
    //   462: athrow
    //   463: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   466: athrow
    //   467: checkcast java/lang/String
    //   470: putfield selected : Ljava/lang/String;
    //   473: aconst_null
    //   474: areturn
    //   475: aload_2
    //   476: aload_0
    //   477: aload #6
    //   479: aload #6
    //   481: arraylength
    //   482: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   485: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   488: areturn
    // Exception table:
    //   from	to	target	type
    //   9	31	34	java/lang/Throwable
    //   52	73	76	java/lang/Throwable
    //   62	85	85	java/lang/Throwable
    //   89	110	113	java/lang/Throwable
    //   99	124	124	java/lang/Throwable
    //   128	144	147	java/lang/Throwable
    //   138	155	155	java/lang/Throwable
    //   160	168	168	java/lang/Throwable
    //   172	192	195	java/lang/Throwable
    //   182	209	212	java/lang/Throwable
    //   199	223	226	java/lang/Throwable
    //   216	240	243	java/lang/Throwable
    //   230	255	258	java/lang/Throwable
    //   247	273	273	java/lang/Throwable
    //   337	362	362	java/lang/Throwable
    //   395	415	418	java/lang/Throwable
    //   405	429	432	java/lang/Throwable
    //   422	445	448	java/lang/Throwable
    //   436	463	463	java/lang/Throwable
  }
  
  public Jdk8WithJettyBootPlatform$AlpnProvider(@NotNull List paramList) {
    this.protocols = paramList;
  }
  
  public final void setSelected(@Nullable String paramString) {
    this.selected = paramString;
  }
  
  public final void setUnsupported(boolean paramBoolean) {
    this.unsupported = paramBoolean;
  }
  
  public final boolean getUnsupported() {
    return this.unsupported;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\platform\Jdk8WithJettyBootPlatform$AlpnProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
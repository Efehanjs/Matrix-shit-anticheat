package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.security.cert.X509Certificate;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class CertificatePinner$Pin {
  @NotNull
  private final ByteString hash;
  
  @NotNull
  private final String hashAlgorithm;
  
  @NotNull
  private final String pattern;
  
  private static final long a = o3.a(6709419418369561383L, 6596227700023508767L, MethodHandles.lookup().lookupClass()).a(194878368638892L);
  
  @NotNull
  public final String getHashAlgorithm() {
    return this.hashAlgorithm;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof CertificatePinner$Pin))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.pattern, ((CertificatePinner$Pin)paramObject).pattern))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.hashAlgorithm, ((CertificatePinner$Pin)paramObject).hashAlgorithm))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.hash, ((CertificatePinner$Pin)paramObject).hash))
        return false; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public final ByteString getHash() {
    return this.hash;
  }
  
  public final boolean matchesHostname(@NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/CertificatePinner$Pin.a : J
    //   3: ldc2_w 124171080826636
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'hostname'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: nop
    //   15: aload_0
    //   16: getfield pattern : Ljava/lang/String;
    //   19: ldc '**.'
    //   21: iconst_0
    //   22: iconst_2
    //   23: aconst_null
    //   24: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   27: ifeq -> 119
    //   30: aload_0
    //   31: getfield pattern : Ljava/lang/String;
    //   34: invokevirtual length : ()I
    //   37: iconst_3
    //   38: isub
    //   39: istore #4
    //   41: aload_1
    //   42: invokevirtual length : ()I
    //   45: iload #4
    //   47: isub
    //   48: istore #5
    //   50: aload_1
    //   51: aload_1
    //   52: invokevirtual length : ()I
    //   55: iload #4
    //   57: isub
    //   58: aload_0
    //   59: getfield pattern : Ljava/lang/String;
    //   62: iconst_3
    //   63: iload #4
    //   65: iconst_0
    //   66: bipush #16
    //   68: aconst_null
    //   69: invokestatic regionMatches$default : (Ljava/lang/String;ILjava/lang/String;IIZILjava/lang/Object;)Z
    //   72: ifeq -> 115
    //   75: iload #5
    //   77: ifeq -> 107
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   86: athrow
    //   87: aload_1
    //   88: iload #5
    //   90: iconst_1
    //   91: isub
    //   92: invokevirtual charAt : (I)C
    //   95: bipush #46
    //   97: if_icmpne -> 115
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   106: athrow
    //   107: iconst_1
    //   108: goto -> 226
    //   111: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   114: athrow
    //   115: iconst_0
    //   116: goto -> 226
    //   119: aload_0
    //   120: getfield pattern : Ljava/lang/String;
    //   123: ldc '*.'
    //   125: iconst_0
    //   126: iconst_2
    //   127: aconst_null
    //   128: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   131: ifeq -> 218
    //   134: aload_0
    //   135: getfield pattern : Ljava/lang/String;
    //   138: invokevirtual length : ()I
    //   141: iconst_1
    //   142: isub
    //   143: istore #4
    //   145: aload_1
    //   146: invokevirtual length : ()I
    //   149: iload #4
    //   151: isub
    //   152: istore #5
    //   154: aload_1
    //   155: aload_1
    //   156: invokevirtual length : ()I
    //   159: iload #4
    //   161: isub
    //   162: aload_0
    //   163: getfield pattern : Ljava/lang/String;
    //   166: iconst_1
    //   167: iload #4
    //   169: iconst_0
    //   170: bipush #16
    //   172: aconst_null
    //   173: invokestatic regionMatches$default : (Ljava/lang/String;ILjava/lang/String;IIZILjava/lang/Object;)Z
    //   176: ifeq -> 214
    //   179: aload_1
    //   180: checkcast java/lang/CharSequence
    //   183: bipush #46
    //   185: iload #5
    //   187: iconst_1
    //   188: isub
    //   189: iconst_0
    //   190: iconst_4
    //   191: aconst_null
    //   192: invokestatic lastIndexOf$default : (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
    //   195: iconst_m1
    //   196: if_icmpne -> 214
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   205: athrow
    //   206: iconst_1
    //   207: goto -> 226
    //   210: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   213: athrow
    //   214: iconst_0
    //   215: goto -> 226
    //   218: aload_1
    //   219: aload_0
    //   220: getfield pattern : Ljava/lang/String;
    //   223: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   226: ireturn
    // Exception table:
    //   from	to	target	type
    //   50	80	83	java/lang/IllegalArgumentException
    //   75	100	103	java/lang/IllegalArgumentException
    //   87	111	111	java/lang/IllegalArgumentException
    //   154	199	202	java/lang/IllegalArgumentException
    //   179	210	210	java/lang/IllegalArgumentException
  }
  
  @NotNull
  public final String getPattern() {
    return this.pattern;
  }
  
  public int hashCode() {
    null = this.pattern.hashCode();
    null = 31 * null + this.hashAlgorithm.hashCode();
    return 31 * null + this.hash.hashCode();
  }
  
  public final boolean matchesCertificate(@NotNull X509Certificate paramX509Certificate) {
    long l = a ^ 0x57763D27AA12L;
    Intrinsics.checkNotNullParameter(paramX509Certificate, "certificate");
    String str = this.hashAlgorithm;
    try {
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return Intrinsics.areEqual(str, "sha256") ? Intrinsics.areEqual(this.hash, CertificatePinner.Companion.sha256Hash(paramX509Certificate)) : (Intrinsics.areEqual(str, "sha1") ? Intrinsics.areEqual(this.hash, CertificatePinner.Companion.sha1Hash(paramX509Certificate)) : false);
  }
  
  @NotNull
  public String toString() {
    return this.hashAlgorithm + '/' + this.hash.base64();
  }
  
  public CertificatePinner$Pin(@NotNull String paramString1, @NotNull String paramString2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/CertificatePinner$Pin.a : J
    //   3: ldc2_w 109839992515986
    //   6: lxor
    //   7: lstore_3
    //   8: aload_1
    //   9: ldc 'pattern'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_2
    //   15: ldc 'pin'
    //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_0
    //   21: invokespecial <init> : ()V
    //   24: nop
    //   25: aload_1
    //   26: ldc '*.'
    //   28: iconst_0
    //   29: iconst_2
    //   30: aconst_null
    //   31: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   34: ifeq -> 54
    //   37: aload_1
    //   38: checkcast java/lang/CharSequence
    //   41: ldc '*'
    //   43: iconst_1
    //   44: iconst_0
    //   45: iconst_4
    //   46: aconst_null
    //   47: invokestatic indexOf$default : (Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
    //   50: iconst_m1
    //   51: if_icmpeq -> 122
    //   54: aload_1
    //   55: ldc '**.'
    //   57: iconst_0
    //   58: iconst_2
    //   59: aconst_null
    //   60: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   63: ifeq -> 97
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   72: athrow
    //   73: aload_1
    //   74: checkcast java/lang/CharSequence
    //   77: ldc '*'
    //   79: iconst_2
    //   80: iconst_0
    //   81: iconst_4
    //   82: aconst_null
    //   83: invokestatic indexOf$default : (Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
    //   86: iconst_m1
    //   87: if_icmpeq -> 122
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   96: athrow
    //   97: aload_1
    //   98: checkcast java/lang/CharSequence
    //   101: ldc '*'
    //   103: iconst_0
    //   104: iconst_0
    //   105: bipush #6
    //   107: aconst_null
    //   108: invokestatic indexOf$default : (Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I
    //   111: iconst_m1
    //   112: if_icmpne -> 130
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   121: athrow
    //   122: iconst_1
    //   123: goto -> 131
    //   126: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   129: athrow
    //   130: iconst_0
    //   131: ifne -> 158
    //   134: iconst_0
    //   135: istore #5
    //   137: ldc 'Unexpected pattern: '
    //   139: aload_1
    //   140: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   143: astore #5
    //   145: new java/lang/IllegalArgumentException
    //   148: dup
    //   149: aload #5
    //   151: invokevirtual toString : ()Ljava/lang/String;
    //   154: invokespecial <init> : (Ljava/lang/String;)V
    //   157: athrow
    //   158: aload_0
    //   159: aload_1
    //   160: invokestatic toCanonicalHost : (Ljava/lang/String;)Ljava/lang/String;
    //   163: dup
    //   164: ifnonnull -> 186
    //   167: pop
    //   168: new java/lang/IllegalArgumentException
    //   171: dup
    //   172: ldc 'Invalid pattern: '
    //   174: aload_1
    //   175: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   178: invokespecial <init> : (Ljava/lang/String;)V
    //   181: athrow
    //   182: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   185: athrow
    //   186: putfield pattern : Ljava/lang/String;
    //   189: nop
    //   190: aload_2
    //   191: ldc 'sha1/'
    //   193: iconst_0
    //   194: iconst_2
    //   195: aconst_null
    //   196: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   199: ifeq -> 266
    //   202: aload_0
    //   203: ldc 'sha1'
    //   205: putfield hashAlgorithm : Ljava/lang/String;
    //   208: aload_0
    //   209: getstatic me/rerere/matrix/thirdparty/okio/ByteString.Companion : Lme/rerere/matrix/thirdparty/okio/ByteString$Companion;
    //   212: aload_2
    //   213: ldc 'sha1/'
    //   215: invokevirtual length : ()I
    //   218: invokevirtual substring : (I)Ljava/lang/String;
    //   221: dup
    //   222: ldc 'this as java.lang.String).substring(startIndex)'
    //   224: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   227: invokevirtual decodeBase64 : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   230: dup
    //   231: ifnonnull -> 260
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   240: athrow
    //   241: pop
    //   242: new java/lang/IllegalArgumentException
    //   245: dup
    //   246: ldc 'Invalid pin hash: '
    //   248: aload_2
    //   249: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   252: invokespecial <init> : (Ljava/lang/String;)V
    //   255: athrow
    //   256: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   259: athrow
    //   260: putfield hash : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   263: goto -> 356
    //   266: aload_2
    //   267: ldc 'sha256/'
    //   269: iconst_0
    //   270: iconst_2
    //   271: aconst_null
    //   272: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   275: ifeq -> 342
    //   278: aload_0
    //   279: ldc 'sha256'
    //   281: putfield hashAlgorithm : Ljava/lang/String;
    //   284: aload_0
    //   285: getstatic me/rerere/matrix/thirdparty/okio/ByteString.Companion : Lme/rerere/matrix/thirdparty/okio/ByteString$Companion;
    //   288: aload_2
    //   289: ldc 'sha256/'
    //   291: invokevirtual length : ()I
    //   294: invokevirtual substring : (I)Ljava/lang/String;
    //   297: dup
    //   298: ldc 'this as java.lang.String).substring(startIndex)'
    //   300: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   303: invokevirtual decodeBase64 : (Ljava/lang/String;)Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   306: dup
    //   307: ifnonnull -> 336
    //   310: goto -> 317
    //   313: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   316: athrow
    //   317: pop
    //   318: new java/lang/IllegalArgumentException
    //   321: dup
    //   322: ldc 'Invalid pin hash: '
    //   324: aload_2
    //   325: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   328: invokespecial <init> : (Ljava/lang/String;)V
    //   331: athrow
    //   332: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   335: athrow
    //   336: putfield hash : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   339: goto -> 356
    //   342: new java/lang/IllegalArgumentException
    //   345: dup
    //   346: ldc 'pins must start with 'sha256/' or 'sha1/': '
    //   348: aload_2
    //   349: invokestatic stringPlus : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    //   352: invokespecial <init> : (Ljava/lang/String;)V
    //   355: athrow
    //   356: nop
    //   357: return
    // Exception table:
    //   from	to	target	type
    //   37	66	69	java/lang/IllegalArgumentException
    //   54	90	93	java/lang/IllegalArgumentException
    //   73	115	118	java/lang/IllegalArgumentException
    //   97	126	126	java/lang/IllegalArgumentException
    //   158	182	182	java/lang/IllegalArgumentException
    //   186	234	237	java/lang/IllegalArgumentException
    //   202	256	256	java/lang/IllegalArgumentException
    //   266	310	313	java/lang/IllegalArgumentException
    //   278	332	332	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\CertificatePinner$Pin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
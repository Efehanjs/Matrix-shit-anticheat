package me.rerere.matrix.thirdparty.okhttp3.internal.tls;

import java.lang.invoke.MethodHandles;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class BasicTrustRootIndex implements TrustRootIndex {
  @NotNull
  private final Map subjectToCaCerts;
  
  private static final long a = o3.a(7432872136975426523L, 4039866136665703858L, MethodHandles.lookup().lookupClass()).a(259873895595309L);
  
  public BasicTrustRootIndex(@NotNull X509Certificate... paramVarArgs) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    byte b = 0;
    int i = paramVarArgs.length;
    while (b < i) {
      X509Certificate x509Certificate = paramVarArgs[b];
      b++;
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
      Intrinsics.checkNotNullExpressionValue(x500Principal, "caCert.subjectX500Principal");
      x500Principal = x500Principal;
      boolean bool1 = false;
      Object object = linkedHashMap1.get(x500Principal);
      boolean bool2 = false;
      LinkedHashSet<X509Certificate> linkedHashSet = new LinkedHashSet();
      linkedHashMap1.put(x500Principal, linkedHashSet);
      ((Set<X509Certificate>)((object == null) ? linkedHashSet : (Set<X509Certificate>)object)).add(x509Certificate);
    } 
    this.subjectToCaCerts = linkedHashMap;
  }
  
  @Nullable
  public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate paramX509Certificate) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/tls/BasicTrustRootIndex.a : J
    //   3: ldc2_w 99535245265913
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'cert'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokevirtual getIssuerX500Principal : ()Ljavax/security/auth/x500/X500Principal;
    //   18: astore #4
    //   20: aload_0
    //   21: getfield subjectToCaCerts : Ljava/util/Map;
    //   24: aload #4
    //   26: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   31: checkcast java/util/Set
    //   34: dup
    //   35: ifnonnull -> 45
    //   38: pop
    //   39: aconst_null
    //   40: areturn
    //   41: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   44: athrow
    //   45: astore #5
    //   47: aload #5
    //   49: checkcast java/lang/Iterable
    //   52: astore #6
    //   54: iconst_0
    //   55: istore #7
    //   57: aload #6
    //   59: invokeinterface iterator : ()Ljava/util/Iterator;
    //   64: astore #8
    //   66: aload #8
    //   68: invokeinterface hasNext : ()Z
    //   73: ifeq -> 120
    //   76: aload #8
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: astore #9
    //   85: aload #9
    //   87: checkcast java/security/cert/X509Certificate
    //   90: astore #10
    //   92: iconst_0
    //   93: istore #11
    //   95: nop
    //   96: aload_1
    //   97: aload #10
    //   99: invokevirtual getPublicKey : ()Ljava/security/PublicKey;
    //   102: invokevirtual verify : (Ljava/security/PublicKey;)V
    //   105: iconst_1
    //   106: goto -> 112
    //   109: astore #12
    //   111: iconst_0
    //   112: ifeq -> 66
    //   115: aload #9
    //   117: goto -> 121
    //   120: aconst_null
    //   121: checkcast java/security/cert/X509Certificate
    //   124: areturn
    // Exception table:
    //   from	to	target	type
    //   20	41	41	java/lang/Exception
    //   95	109	109	java/lang/Exception
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject != this) {
        try {
          if (paramObject instanceof BasicTrustRootIndex)
            try {
              if (Intrinsics.areEqual(((BasicTrustRootIndex)paramObject).subjectToCaCerts, this.subjectToCaCerts));
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public int hashCode() {
    return this.subjectToCaCerts.hashCode();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\tls\BasicTrustRootIndex.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
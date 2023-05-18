package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.Regex;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class HttpUrl {
  @Nullable
  private final List queryNamesAndValues;
  
  @NotNull
  public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
  
  private final int port;
  
  @NotNull
  private final String username;
  
  @NotNull
  private final String scheme;
  
  @NotNull
  public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
  
  @NotNull
  private static final char[] HEX_DIGITS;
  
  @NotNull
  private final List pathSegments;
  
  @NotNull
  public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
  
  @NotNull
  private final String host;
  
  @NotNull
  public static final HttpUrl$Companion Companion;
  
  @NotNull
  public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
  
  @NotNull
  private final String password;
  
  @NotNull
  public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
  
  private final boolean isHttps;
  
  @NotNull
  public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
  
  @NotNull
  public static final String QUERY_ENCODE_SET = " \"'<>#";
  
  @NotNull
  public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
  
  @NotNull
  private final String url;
  
  @NotNull
  public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
  
  @Nullable
  private final String fragment;
  
  @NotNull
  public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
  
  @NotNull
  public static final String FRAGMENT_ENCODE_SET = "";
  
  private static final long a = o3.a(-4380838860105239951L, 7788591255019594719L, MethodHandles.lookup().lookupClass()).a(173021378624659L);
  
  @NotNull
  public final String scheme() {
    return this.scheme;
  }
  
  @NotNull
  public final HttpUrl$Builder newBuilder() {
    HttpUrl$Builder httpUrl$Builder = new HttpUrl$Builder();
    try {
      httpUrl$Builder.setScheme$okhttp(this.scheme);
      httpUrl$Builder.setEncodedUsername$okhttp(encodedUsername());
      httpUrl$Builder.setEncodedPassword$okhttp(encodedPassword());
      httpUrl$Builder.setHost$okhttp(this.host);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    httpUrl$Builder.setPort$okhttp((this.port != Companion.defaultPort(this.scheme)) ? this.port : -1);
    httpUrl$Builder.getEncodedPathSegments$okhttp().clear();
    httpUrl$Builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
    httpUrl$Builder.encodedQuery(encodedQuery());
    httpUrl$Builder.setEncodedFragment$okhttp(encodedFragment());
    return httpUrl$Builder;
  }
  
  @NotNull
  public final String encodedUsername() {
    long l = a ^ 0x6F7FC3198076L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((((CharSequence)this.username).length() == 0))
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = this.scheme.length() + 3;
    int j = Util.delimiterOffset(this.url, ":@", i, this.url.length());
    Intrinsics.checkNotNullExpressionValue(this.url.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
    return this.url.substring(i, j);
  }
  
  @NotNull
  public static final HttpUrl get(@NotNull String paramString) {
    return Companion.get(paramString);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_port() {
    return this.port;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Set -deprecated_queryParameterNames() {
    return queryParameterNames();
  }
  
  public int hashCode() {
    return this.url.hashCode();
  }
  
  @NotNull
  public final List queryParameterValues(@NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.a : J
    //   3: ldc2_w 85326014315429
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'name'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield queryNamesAndValues : Ljava/util/List;
    //   18: ifnonnull -> 29
    //   21: invokestatic emptyList : ()Ljava/util/List;
    //   24: areturn
    //   25: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   28: athrow
    //   29: new java/util/ArrayList
    //   32: dup
    //   33: invokespecial <init> : ()V
    //   36: checkcast java/util/List
    //   39: astore #4
    //   41: iconst_0
    //   42: aload_0
    //   43: getfield queryNamesAndValues : Ljava/util/List;
    //   46: invokeinterface size : ()I
    //   51: invokestatic until : (II)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntRange;
    //   54: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   57: iconst_2
    //   58: invokestatic step : (Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;I)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;
    //   61: astore #5
    //   63: aload #5
    //   65: invokevirtual getFirst : ()I
    //   68: istore #6
    //   70: aload #5
    //   72: invokevirtual getLast : ()I
    //   75: istore #7
    //   77: aload #5
    //   79: invokevirtual getStep : ()I
    //   82: istore #8
    //   84: iload #8
    //   86: ifle -> 103
    //   89: iload #6
    //   91: iload #7
    //   93: if_icmple -> 129
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   102: athrow
    //   103: iload #8
    //   105: ifge -> 186
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: iload #7
    //   117: iload #6
    //   119: if_icmpgt -> 186
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   128: athrow
    //   129: iload #6
    //   131: istore #9
    //   133: iload #6
    //   135: iload #8
    //   137: iadd
    //   138: istore #6
    //   140: aload_1
    //   141: aload_0
    //   142: getfield queryNamesAndValues : Ljava/util/List;
    //   145: iload #9
    //   147: invokeinterface get : (I)Ljava/lang/Object;
    //   152: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   155: ifeq -> 179
    //   158: aload #4
    //   160: aload_0
    //   161: getfield queryNamesAndValues : Ljava/util/List;
    //   164: iload #9
    //   166: iconst_1
    //   167: iadd
    //   168: invokeinterface get : (I)Ljava/lang/Object;
    //   173: invokeinterface add : (Ljava/lang/Object;)Z
    //   178: pop
    //   179: iload #9
    //   181: iload #7
    //   183: if_icmpne -> 129
    //   186: aload #4
    //   188: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   191: astore #5
    //   193: aload #5
    //   195: ldc_w 'unmodifiableList(result)'
    //   198: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   201: aload #5
    //   203: areturn
    // Exception table:
    //   from	to	target	type
    //   8	25	25	java/lang/RuntimeException
    //   84	96	99	java/lang/RuntimeException
    //   89	108	111	java/lang/RuntimeException
    //   103	122	125	java/lang/RuntimeException
  }
  
  @Nullable
  public final String queryParameter(@NotNull String paramString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.a : J
    //   3: ldc2_w 80125440910565
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'name'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield queryNamesAndValues : Ljava/util/List;
    //   18: ifnonnull -> 27
    //   21: aconst_null
    //   22: areturn
    //   23: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   26: athrow
    //   27: iconst_0
    //   28: aload_0
    //   29: getfield queryNamesAndValues : Ljava/util/List;
    //   32: invokeinterface size : ()I
    //   37: invokestatic until : (II)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntRange;
    //   40: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   43: iconst_2
    //   44: invokestatic step : (Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;I)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;
    //   47: astore #4
    //   49: aload #4
    //   51: invokevirtual getFirst : ()I
    //   54: istore #5
    //   56: aload #4
    //   58: invokevirtual getLast : ()I
    //   61: istore #6
    //   63: aload #4
    //   65: invokevirtual getStep : ()I
    //   68: istore #7
    //   70: iload #7
    //   72: ifle -> 89
    //   75: iload #5
    //   77: iload #6
    //   79: if_icmple -> 115
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   88: athrow
    //   89: iload #7
    //   91: ifge -> 168
    //   94: goto -> 101
    //   97: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   100: athrow
    //   101: iload #6
    //   103: iload #5
    //   105: if_icmpgt -> 168
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: iload #5
    //   117: istore #8
    //   119: iload #5
    //   121: iload #7
    //   123: iadd
    //   124: istore #5
    //   126: aload_1
    //   127: aload_0
    //   128: getfield queryNamesAndValues : Ljava/util/List;
    //   131: iload #8
    //   133: invokeinterface get : (I)Ljava/lang/Object;
    //   138: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   141: ifeq -> 161
    //   144: aload_0
    //   145: getfield queryNamesAndValues : Ljava/util/List;
    //   148: iload #8
    //   150: iconst_1
    //   151: iadd
    //   152: invokeinterface get : (I)Ljava/lang/Object;
    //   157: checkcast java/lang/String
    //   160: areturn
    //   161: iload #8
    //   163: iload #6
    //   165: if_icmpne -> 115
    //   168: aconst_null
    //   169: areturn
    // Exception table:
    //   from	to	target	type
    //   8	23	23	java/lang/RuntimeException
    //   70	82	85	java/lang/RuntimeException
    //   75	94	97	java/lang/RuntimeException
    //   89	108	111	java/lang/RuntimeException
  }
  
  static {
    Companion = new HttpUrl$Companion(null);
    char[] arrayOfChar = new char[16];
    arrayOfChar[0] = '0';
    arrayOfChar[1] = '1';
    arrayOfChar[2] = '2';
    arrayOfChar[3] = '3';
    arrayOfChar[4] = '4';
    arrayOfChar[5] = '5';
    arrayOfChar[6] = '6';
    arrayOfChar[7] = '7';
    arrayOfChar[8] = '8';
    arrayOfChar[9] = '9';
    arrayOfChar[10] = 'A';
    arrayOfChar[11] = 'B';
    arrayOfChar[12] = 'C';
    arrayOfChar[13] = 'D';
    arrayOfChar[14] = 'E';
    arrayOfChar[15] = 'F';
    HEX_DIGITS = arrayOfChar;
  }
  
  @NotNull
  public String toString() {
    return this.url;
  }
  
  public static final int defaultPort(@NotNull String paramString) {
    return Companion.defaultPort(paramString);
  }
  
  @Nullable
  public final String fragment() {
    return this.fragment;
  }
  
  @NotNull
  public final Set queryParameterNames() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/HttpUrl.a : J
    //   3: ldc2_w 46957950312988
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield queryNamesAndValues : Ljava/util/List;
    //   12: ifnonnull -> 23
    //   15: invokestatic emptySet : ()Ljava/util/Set;
    //   18: areturn
    //   19: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   22: athrow
    //   23: new java/util/LinkedHashSet
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: astore_3
    //   31: iconst_0
    //   32: aload_0
    //   33: getfield queryNamesAndValues : Ljava/util/List;
    //   36: invokeinterface size : ()I
    //   41: invokestatic until : (II)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntRange;
    //   44: checkcast me/rerere/matrix/thirdparty/kotlin/ranges/IntProgression
    //   47: iconst_2
    //   48: invokestatic step : (Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;I)Lme/rerere/matrix/thirdparty/kotlin/ranges/IntProgression;
    //   51: astore #4
    //   53: aload #4
    //   55: invokevirtual getFirst : ()I
    //   58: istore #5
    //   60: aload #4
    //   62: invokevirtual getLast : ()I
    //   65: istore #6
    //   67: aload #4
    //   69: invokevirtual getStep : ()I
    //   72: istore #7
    //   74: iload #7
    //   76: ifle -> 93
    //   79: iload #5
    //   81: iload #6
    //   83: if_icmple -> 119
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   92: athrow
    //   93: iload #7
    //   95: ifge -> 157
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   104: athrow
    //   105: iload #6
    //   107: iload #5
    //   109: if_icmpgt -> 157
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: iload #5
    //   121: istore #8
    //   123: iload #5
    //   125: iload #7
    //   127: iadd
    //   128: istore #5
    //   130: aload_3
    //   131: aload_0
    //   132: getfield queryNamesAndValues : Ljava/util/List;
    //   135: iload #8
    //   137: invokeinterface get : (I)Ljava/lang/Object;
    //   142: dup
    //   143: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   146: invokevirtual add : (Ljava/lang/Object;)Z
    //   149: pop
    //   150: iload #8
    //   152: iload #6
    //   154: if_icmpne -> 119
    //   157: aload_3
    //   158: checkcast java/util/Set
    //   161: invokestatic unmodifiableSet : (Ljava/util/Set;)Ljava/util/Set;
    //   164: astore #4
    //   166: aload #4
    //   168: ldc_w 'unmodifiableSet(result)'
    //   171: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   174: aload #4
    //   176: areturn
    // Exception table:
    //   from	to	target	type
    //   8	19	19	java/lang/RuntimeException
    //   74	86	89	java/lang/RuntimeException
    //   79	98	101	java/lang/RuntimeException
    //   93	112	115	java/lang/RuntimeException
  }
  
  @Nullable
  public final String topPrivateDomain() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Util.canParseAsIpAddress(this.host) ? (String)null : PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
  }
  
  @NotNull
  public final String password() {
    return this.password;
  }
  
  public final int querySize() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.queryNamesAndValues != null) ? (this.queryNamesAndValues.size() / 2) : 0;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final String -deprecated_encodedQuery() {
    return encodedQuery();
  }
  
  public final int port() {
    return this.port;
  }
  
  @Nullable
  public static final HttpUrl get(@NotNull URI paramURI) {
    return Companion.get(paramURI);
  }
  
  @NotNull
  public final String encodedPassword() {
    long l = a ^ 0x5A936A8C13A8L;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if ((((CharSequence)this.password).length() == 0))
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = StringsKt.indexOf$default(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1;
    int j = StringsKt.indexOf$default(this.url, '@', 0, false, 6, null);
    Intrinsics.checkNotNullExpressionValue(this.url.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
    return this.url.substring(i, j);
  }
  
  @NotNull
  public final URI uri() {
    URI uRI;
    long l = a ^ 0x1E713ECCC223L;
    String str = newBuilder().reencodeForUri$okhttp().toString();
    try {
      uRI = new URI(str);
    } catch (URISyntaxException uRISyntaxException) {
      URI uRI2;
      try {
        CharSequence charSequence = str;
        Regex regex = new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
        String str2 = "";
        String str1 = regex.replace(charSequence, str2);
        uRI2 = URI.create(str1);
      } catch (Exception exception) {
        throw new RuntimeException((Throwable)uRISyntaxException);
      } 
      URI uRI1 = uRI2;
      Intrinsics.checkNotNullExpressionValue(uRI1, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
      uRI = uRI1;
    } 
    return uRI;
  }
  
  @Nullable
  public static final HttpUrl parse(@NotNull String paramString) {
    return Companion.parse(paramString);
  }
  
  @NotNull
  public final String redact() {
    long l = a ^ 0xC3CFAD6DC48L;
    Intrinsics.checkNotNull(newBuilder("/..."));
    return newBuilder("/...").username("").password("").build().toString();
  }
  
  @NotNull
  public final String queryParameterName(int paramInt) {
    try {
      if (this.queryNamesAndValues == null)
        throw new IndexOutOfBoundsException(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.queryNamesAndValues.get(paramInt * 2));
    return (String)this.queryNamesAndValues.get(paramInt * 2);
  }
  
  @Deprecated(message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final URL -deprecated_url() {
    return url();
  }
  
  public final boolean isHttps() {
    return this.isHttps;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_querySize() {
    return querySize();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_encodedPassword() {
    return encodedPassword();
  }
  
  @NotNull
  public final List encodedPathSegments() {
    long l = a ^ 0x287F7BF61119L;
    int i = StringsKt.indexOf$default(this.url, '/', this.scheme.length() + 3, false, 4, null);
    int j = Util.delimiterOffset(this.url, "?#", i, this.url.length());
    ArrayList<String> arrayList = new ArrayList();
    int k;
    for (k = i; k < j; k = m) {
      int m = k;
      k = m + 1;
      m = Util.delimiterOffset(this.url, '/', k, j);
      Intrinsics.checkNotNullExpressionValue(this.url.substring(k, m), "this as java.lang.String…ing(startIndex, endIndex)");
      arrayList.add(this.url.substring(k, m));
    } 
    return arrayList;
  }
  
  public final int pathSize() {
    return this.pathSegments.size();
  }
  
  @Deprecated(message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final URI -deprecated_uri() {
    return uri();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "query", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final String -deprecated_query() {
    return query();
  }
  
  @NotNull
  public final String host() {
    return this.host;
  }
  
  @Nullable
  public final HttpUrl resolve(@NotNull String paramString) {
    long l = a ^ 0x2A853B67896EL;
    try {
      Intrinsics.checkNotNullParameter(paramString, "link");
      newBuilder(paramString);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (newBuilder(paramString) == null) ? null : newBuilder(paramString).build();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final String -deprecated_encodedFragment() {
    return encodedFragment();
  }
  
  public HttpUrl(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String paramString4, int paramInt, @NotNull List paramList1, @Nullable List paramList2, @Nullable String paramString5, @NotNull String paramString6) {
    this.scheme = paramString1;
    this.username = paramString2;
    this.password = paramString3;
    this.host = paramString4;
    this.port = paramInt;
    this.pathSegments = paramList1;
    this.queryNamesAndValues = paramList2;
    this.fragment = paramString5;
    this.url = paramString6;
    this.isHttps = Intrinsics.areEqual(this.scheme, "https");
  }
  
  @NotNull
  public final List pathSegments() {
    return this.pathSegments;
  }
  
  @NotNull
  public final URL url() {
    try {
      return new URL(this.url);
    } catch (MalformedURLException malformedURLException) {
      throw new RuntimeException((Throwable)malformedURLException);
    } 
  }
  
  @Nullable
  public final HttpUrl$Builder newBuilder(@NotNull String paramString) {
    HttpUrl$Builder httpUrl$Builder;
    long l = a ^ 0x108043B3246EL;
    Intrinsics.checkNotNullParameter(paramString, "link");
    try {
      httpUrl$Builder = (new HttpUrl$Builder()).parse$okhttp(this, paramString);
    } catch (IllegalArgumentException illegalArgumentException) {
      httpUrl$Builder = (HttpUrl$Builder)null;
    } 
    return httpUrl$Builder;
  }
  
  @NotNull
  public final String username() {
    return this.username;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_encodedPath() {
    return encodedPath();
  }
  
  @Nullable
  public final String encodedQuery() {
    long l = a ^ 0x5340CD2454C3L;
    try {
      if (this.queryNamesAndValues == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = StringsKt.indexOf$default(this.url, '?', 0, false, 6, null) + 1;
    int j = Util.delimiterOffset(this.url, '#', i, this.url.length());
    Intrinsics.checkNotNullExpressionValue(this.url.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
    return this.url.substring(i, j);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof HttpUrl)
        try {
          if (Intrinsics.areEqual(((HttpUrl)paramObject).url, this.url));
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @Nullable
  public final String query() {
    try {
      if (this.queryNamesAndValues == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    Companion.toQueryString$okhttp(this.queryNamesAndValues, stringBuilder);
    return stringBuilder.toString();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_encodedPathSegments() {
    return encodedPathSegments();
  }
  
  @Nullable
  public final String queryParameterValue(int paramInt) {
    try {
      if (this.queryNamesAndValues == null)
        throw new IndexOutOfBoundsException(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.queryNamesAndValues.get(paramInt * 2 + 1);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_host() {
    return this.host;
  }
  
  @Nullable
  public static final HttpUrl get(@NotNull URL paramURL) {
    return Companion.get(paramURL);
  }
  
  @Nullable
  public final String encodedFragment() {
    long l = a ^ 0x2EFF28041AA2L;
    try {
      if (this.fragment == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = StringsKt.indexOf$default(this.url, '#', 0, false, 6, null) + 1;
    Intrinsics.checkNotNullExpressionValue(this.url.substring(i), "this as java.lang.String).substring(startIndex)");
    return this.url.substring(i);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_encodedUsername() {
    return encodedUsername();
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final List -deprecated_pathSegments() {
    return this.pathSegments;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}), level = DeprecationLevel.ERROR)
  @Nullable
  public final String -deprecated_fragment() {
    return this.fragment;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_scheme() {
    return this.scheme;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "password", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_password() {
    return this.password;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}), level = DeprecationLevel.ERROR)
  public final int -deprecated_pathSize() {
    return pathSize();
  }
  
  @NotNull
  public final String encodedPath() {
    long l = a ^ 0x178D76C3EB23L;
    int i = StringsKt.indexOf$default(this.url, '/', this.scheme.length() + 3, false, 4, null);
    int j = Util.delimiterOffset(this.url, "?#", i, this.url.length());
    Intrinsics.checkNotNullExpressionValue(this.url.substring(i, j), "this as java.lang.String…ing(startIndex, endIndex)");
    return this.url.substring(i, j);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "username", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_username() {
    return this.username;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\HttpUrl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
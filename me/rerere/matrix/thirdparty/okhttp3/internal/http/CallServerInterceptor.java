package me.rerere.matrix.thirdparty.okhttp3.internal.http;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okhttp3.Interceptor;
import me.rerere.matrix.thirdparty.okhttp3.Response;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CallServerInterceptor implements Interceptor {
  private final boolean forWebSocket;
  
  private static final long a = o3.a(7901309143523133625L, -4538485388991255374L, MethodHandles.lookup().lookupClass()).a(92351299773275L);
  
  @NotNull
  public Response intercept(@NotNull Interceptor.Chain paramChain) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/http/CallServerInterceptor.a : J
    //   3: ldc2_w 122694089518637
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'chain'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/http/RealInterceptorChain
    //   18: astore #4
    //   20: aload #4
    //   22: invokevirtual getExchange$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/Exchange;
    //   25: dup
    //   26: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   29: astore #5
    //   31: aload #4
    //   33: invokevirtual getRequest$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/Request;
    //   36: astore #6
    //   38: aload #6
    //   40: invokevirtual body : ()Lme/rerere/matrix/thirdparty/okhttp3/RequestBody;
    //   43: astore #7
    //   45: invokestatic currentTimeMillis : ()J
    //   48: lstore #8
    //   50: aload #5
    //   52: aload #6
    //   54: invokevirtual writeRequestHeaders : (Lme/rerere/matrix/thirdparty/okhttp3/Request;)V
    //   57: iconst_1
    //   58: istore #10
    //   60: aconst_null
    //   61: astore #11
    //   63: aload #6
    //   65: invokevirtual method : ()Ljava/lang/String;
    //   68: invokestatic permitsRequestBody : (Ljava/lang/String;)Z
    //   71: ifeq -> 236
    //   74: aload #7
    //   76: ifnull -> 236
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   85: athrow
    //   86: ldc '100-continue'
    //   88: aload #6
    //   90: ldc 'Expect'
    //   92: invokevirtual header : (Ljava/lang/String;)Ljava/lang/String;
    //   95: iconst_1
    //   96: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   99: ifeq -> 130
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   108: athrow
    //   109: aload #5
    //   111: invokevirtual flushRequest : ()V
    //   114: aload #5
    //   116: iconst_1
    //   117: invokevirtual readResponseHeaders : (Z)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   120: astore #11
    //   122: aload #5
    //   124: invokevirtual responseHeadersStart : ()V
    //   127: iconst_0
    //   128: istore #10
    //   130: aload #11
    //   132: ifnonnull -> 208
    //   135: aload #7
    //   137: invokevirtual isDuplex : ()Z
    //   140: ifeq -> 178
    //   143: goto -> 150
    //   146: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   149: athrow
    //   150: aload #5
    //   152: invokevirtual flushRequest : ()V
    //   155: aload #5
    //   157: aload #6
    //   159: iconst_1
    //   160: invokevirtual createRequestBody : (Lme/rerere/matrix/thirdparty/okhttp3/Request;Z)Lme/rerere/matrix/thirdparty/okio/Sink;
    //   163: invokestatic buffer : (Lme/rerere/matrix/thirdparty/okio/Sink;)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   166: astore #12
    //   168: aload #7
    //   170: aload #12
    //   172: invokevirtual writeTo : (Lme/rerere/matrix/thirdparty/okio/BufferedSink;)V
    //   175: goto -> 241
    //   178: aload #5
    //   180: aload #6
    //   182: iconst_0
    //   183: invokevirtual createRequestBody : (Lme/rerere/matrix/thirdparty/okhttp3/Request;Z)Lme/rerere/matrix/thirdparty/okio/Sink;
    //   186: invokestatic buffer : (Lme/rerere/matrix/thirdparty/okio/Sink;)Lme/rerere/matrix/thirdparty/okio/BufferedSink;
    //   189: astore #12
    //   191: aload #7
    //   193: aload #12
    //   195: invokevirtual writeTo : (Lme/rerere/matrix/thirdparty/okio/BufferedSink;)V
    //   198: aload #12
    //   200: invokeinterface close : ()V
    //   205: goto -> 241
    //   208: aload #5
    //   210: invokevirtual noRequestBody : ()V
    //   213: aload #5
    //   215: invokevirtual getConnection$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;
    //   218: invokevirtual isMultiplexed$okhttp : ()Z
    //   221: ifne -> 241
    //   224: aload #5
    //   226: invokevirtual noNewExchangesOnConnection : ()V
    //   229: goto -> 241
    //   232: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   235: athrow
    //   236: aload #5
    //   238: invokevirtual noRequestBody : ()V
    //   241: aload #7
    //   243: ifnull -> 261
    //   246: aload #7
    //   248: invokevirtual isDuplex : ()Z
    //   251: ifne -> 273
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   260: athrow
    //   261: aload #5
    //   263: invokevirtual finishRequest : ()V
    //   266: goto -> 273
    //   269: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   272: athrow
    //   273: aload #11
    //   275: ifnonnull -> 303
    //   278: aload #5
    //   280: iconst_0
    //   281: invokevirtual readResponseHeaders : (Z)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   284: dup
    //   285: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   288: astore #11
    //   290: iload #10
    //   292: ifeq -> 303
    //   295: aload #5
    //   297: invokevirtual responseHeadersStart : ()V
    //   300: iconst_0
    //   301: istore #10
    //   303: aload #11
    //   305: aload #6
    //   307: invokevirtual request : (Lme/rerere/matrix/thirdparty/okhttp3/Request;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   310: aload #5
    //   312: invokevirtual getConnection$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;
    //   315: invokevirtual handshake : ()Lme/rerere/matrix/thirdparty/okhttp3/Handshake;
    //   318: invokevirtual handshake : (Lme/rerere/matrix/thirdparty/okhttp3/Handshake;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   321: lload #8
    //   323: invokevirtual sentRequestAtMillis : (J)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   326: invokestatic currentTimeMillis : ()J
    //   329: invokevirtual receivedResponseAtMillis : (J)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   332: invokevirtual build : ()Lme/rerere/matrix/thirdparty/okhttp3/Response;
    //   335: astore #12
    //   337: aload #12
    //   339: invokevirtual code : ()I
    //   342: istore #13
    //   344: iload #13
    //   346: bipush #100
    //   348: if_icmpne -> 421
    //   351: aload #5
    //   353: iconst_0
    //   354: invokevirtual readResponseHeaders : (Z)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   357: dup
    //   358: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   361: astore #11
    //   363: iload #10
    //   365: ifeq -> 380
    //   368: aload #5
    //   370: invokevirtual responseHeadersStart : ()V
    //   373: goto -> 380
    //   376: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   379: athrow
    //   380: aload #11
    //   382: aload #6
    //   384: invokevirtual request : (Lme/rerere/matrix/thirdparty/okhttp3/Request;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   387: aload #5
    //   389: invokevirtual getConnection$okhttp : ()Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnection;
    //   392: invokevirtual handshake : ()Lme/rerere/matrix/thirdparty/okhttp3/Handshake;
    //   395: invokevirtual handshake : (Lme/rerere/matrix/thirdparty/okhttp3/Handshake;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   398: lload #8
    //   400: invokevirtual sentRequestAtMillis : (J)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   403: invokestatic currentTimeMillis : ()J
    //   406: invokevirtual receivedResponseAtMillis : (J)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   409: invokevirtual build : ()Lme/rerere/matrix/thirdparty/okhttp3/Response;
    //   412: astore #12
    //   414: aload #12
    //   416: invokevirtual code : ()I
    //   419: istore #13
    //   421: aload #5
    //   423: aload #12
    //   425: invokevirtual responseHeadersEnd : (Lme/rerere/matrix/thirdparty/okhttp3/Response;)V
    //   428: aload_0
    //   429: getfield forWebSocket : Z
    //   432: ifeq -> 470
    //   435: iload #13
    //   437: bipush #101
    //   439: if_icmpne -> 470
    //   442: goto -> 449
    //   445: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   448: athrow
    //   449: aload #12
    //   451: invokevirtual newBuilder : ()Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   454: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.EMPTY_RESPONSE : Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;
    //   457: invokevirtual body : (Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   460: invokevirtual build : ()Lme/rerere/matrix/thirdparty/okhttp3/Response;
    //   463: goto -> 488
    //   466: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   469: athrow
    //   470: aload #12
    //   472: invokevirtual newBuilder : ()Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   475: aload #5
    //   477: aload #12
    //   479: invokevirtual openResponseBody : (Lme/rerere/matrix/thirdparty/okhttp3/Response;)Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;
    //   482: invokevirtual body : (Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;)Lme/rerere/matrix/thirdparty/okhttp3/Response$Builder;
    //   485: invokevirtual build : ()Lme/rerere/matrix/thirdparty/okhttp3/Response;
    //   488: astore #12
    //   490: ldc 'close'
    //   492: aload #12
    //   494: invokevirtual request : ()Lme/rerere/matrix/thirdparty/okhttp3/Request;
    //   497: ldc 'Connection'
    //   499: invokevirtual header : (Ljava/lang/String;)Ljava/lang/String;
    //   502: iconst_1
    //   503: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   506: ifne -> 535
    //   509: ldc 'close'
    //   511: aload #12
    //   513: ldc 'Connection'
    //   515: aconst_null
    //   516: iconst_2
    //   517: aconst_null
    //   518: invokestatic header$default : (Lme/rerere/matrix/thirdparty/okhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    //   521: iconst_1
    //   522: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
    //   525: ifeq -> 547
    //   528: goto -> 535
    //   531: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   534: athrow
    //   535: aload #5
    //   537: invokevirtual noNewExchangesOnConnection : ()V
    //   540: goto -> 547
    //   543: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   546: athrow
    //   547: iload #13
    //   549: sipush #204
    //   552: if_icmpeq -> 570
    //   555: iload #13
    //   557: sipush #205
    //   560: if_icmpne -> 676
    //   563: goto -> 570
    //   566: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   569: athrow
    //   570: aload #12
    //   572: invokevirtual body : ()Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;
    //   575: dup
    //   576: ifnonnull -> 597
    //   579: goto -> 586
    //   582: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   585: athrow
    //   586: pop
    //   587: ldc2_w -1
    //   590: goto -> 604
    //   593: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   596: athrow
    //   597: invokevirtual contentLength : ()J
    //   600: lstore #14
    //   602: lload #14
    //   604: lconst_0
    //   605: lcmp
    //   606: ifle -> 676
    //   609: new java/net/ProtocolException
    //   612: dup
    //   613: new java/lang/StringBuilder
    //   616: dup
    //   617: invokespecial <init> : ()V
    //   620: ldc 'HTTP '
    //   622: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: iload #13
    //   627: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   630: ldc ' had non-zero Content-Length: '
    //   632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: aload #12
    //   637: invokevirtual body : ()Lme/rerere/matrix/thirdparty/okhttp3/ResponseBody;
    //   640: dup
    //   641: ifnonnull -> 660
    //   644: goto -> 651
    //   647: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   650: athrow
    //   651: pop
    //   652: aconst_null
    //   653: goto -> 666
    //   656: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   659: athrow
    //   660: invokevirtual contentLength : ()J
    //   663: invokestatic valueOf : (J)Ljava/lang/Long;
    //   666: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   669: invokevirtual toString : ()Ljava/lang/String;
    //   672: invokespecial <init> : (Ljava/lang/String;)V
    //   675: athrow
    //   676: aload #12
    //   678: areturn
    // Exception table:
    //   from	to	target	type
    //   63	79	82	java/io/IOException
    //   74	102	105	java/io/IOException
    //   130	143	146	java/io/IOException
    //   208	232	232	java/io/IOException
    //   241	254	257	java/io/IOException
    //   246	266	269	java/io/IOException
    //   363	373	376	java/io/IOException
    //   421	442	445	java/io/IOException
    //   435	466	466	java/io/IOException
    //   490	528	531	java/io/IOException
    //   509	540	543	java/io/IOException
    //   547	563	566	java/io/IOException
    //   555	579	582	java/io/IOException
    //   570	593	593	java/io/IOException
    //   604	644	647	java/io/IOException
    //   609	656	656	java/io/IOException
  }
  
  public CallServerInterceptor(boolean paramBoolean) {
    this.forWebSocket = paramBoolean;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http\CallServerInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
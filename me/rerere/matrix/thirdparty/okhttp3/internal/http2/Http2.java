package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http2 {
  @NotNull
  public static final Http2 INSTANCE;
  
  public static final int FLAG_END_PUSH_PROMISE = 4;
  
  public static final int TYPE_RST_STREAM = 3;
  
  @NotNull
  private static final String[] BINARY;
  
  @JvmField
  @NotNull
  public static final ByteString CONNECTION_PREFACE;
  
  @NotNull
  private static final String[] FRAME_NAMES;
  
  public static final int TYPE_DATA = 0;
  
  public static final int FLAG_PADDED = 8;
  
  public static final int TYPE_PRIORITY = 2;
  
  public static final int FLAG_ACK = 1;
  
  public static final int TYPE_PING = 6;
  
  public static final int FLAG_PRIORITY = 32;
  
  public static final int FLAG_END_STREAM = 1;
  
  public static final int FLAG_NONE = 0;
  
  public static final int TYPE_WINDOW_UPDATE = 8;
  
  public static final int TYPE_CONTINUATION = 9;
  
  public static final int TYPE_PUSH_PROMISE = 5;
  
  public static final int INITIAL_MAX_FRAME_SIZE = 16384;
  
  @NotNull
  private static final String[] FLAGS;
  
  public static final int FLAG_END_HEADERS = 4;
  
  public static final int TYPE_GOAWAY = 7;
  
  public static final int TYPE_HEADERS = 1;
  
  public static final int TYPE_SETTINGS = 4;
  
  public static final int FLAG_COMPRESSED = 32;
  
  private static final long a = o3.a(-8774796733778388198L, -2974987148027165655L, MethodHandles.lookup().lookupClass()).a(229496994440848L);
  
  @NotNull
  public final String frameLog(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    long l = a ^ 0x20E02F71C2ADL;
    String str1 = formattedType$okhttp(paramInt3);
    String str2 = formatFlags(paramInt3, paramInt4);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str3 = paramBoolean ? "<<" : ">>";
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = str3;
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = str1;
    arrayOfObject[4] = str2;
    return Util.format("%s 0x%08x %5d %-13s %s", arrayOfObject);
  }
  
  static {
    long l = a ^ 0xB1DBA19477CL;
    INSTANCE = new Http2();
    CONNECTION_PREFACE = ByteString.Companion.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    String[] arrayOfString1 = new String[10];
    arrayOfString1[0] = "DATA";
    arrayOfString1[1] = "HEADERS";
    arrayOfString1[2] = "PRIORITY";
    arrayOfString1[3] = "RST_STREAM";
    arrayOfString1[4] = "SETTINGS";
    arrayOfString1[5] = "PUSH_PROMISE";
    arrayOfString1[6] = "PING";
    arrayOfString1[7] = "GOAWAY";
    arrayOfString1[8] = "WINDOW_UPDATE";
    arrayOfString1[9] = "CONTINUATION";
    FRAME_NAMES = arrayOfString1;
    FLAGS = new String[64];
    int i = 0;
    String[] arrayOfString2 = new String[256];
    while (i < 256) {
      int m = i;
      Object[] arrayOfObject = new Object[1];
      String str = Integer.toBinaryString(m);
      Intrinsics.checkNotNullExpressionValue(str, "toBinaryString(it)");
      arrayOfObject[0] = str;
      arrayOfString2[m] = StringsKt.replace$default(Util.format("%8s", arrayOfObject), ' ', '0', false, 4, null);
      i++;
    } 
    BINARY = arrayOfString2;
    FLAGS[0] = "";
    FLAGS[1] = "END_STREAM";
    int[] arrayOfInt3 = new int[1];
    arrayOfInt3[0] = 1;
    int[] arrayOfInt1 = arrayOfInt3;
    FLAGS[8] = "PADDED";
    byte b1 = 0;
    int j = arrayOfInt1.length;
    while (b1 < j) {
      int m = arrayOfInt1[b1];
      b1++;
      FLAGS[m | 0x8] = Intrinsics.stringPlus(FLAGS[m], "|PADDED");
    } 
    FLAGS[4] = "END_HEADERS";
    FLAGS[32] = "PRIORITY";
    FLAGS[36] = "END_HEADERS|PRIORITY";
    int[] arrayOfInt4 = new int[3];
    arrayOfInt4[0] = 4;
    arrayOfInt4[1] = 32;
    arrayOfInt4[2] = 36;
    int[] arrayOfInt2 = arrayOfInt4;
    byte b2 = 0;
    int k = arrayOfInt2.length;
    while (b2 < k) {
      int m = arrayOfInt2[b2];
      b2++;
      byte b = 0;
      int n = arrayOfInt1.length;
      while (b < n) {
        int i1 = arrayOfInt1[b];
        b++;
        FLAGS[i1 | m] = FLAGS[i1] + '|' + FLAGS[m];
        FLAGS[i1 | m | 0x8] = FLAGS[i1] + '|' + FLAGS[m] + "|PADDED";
      } 
    } 
    b2 = 0;
    k = FLAGS.length;
    while (b2 < k) {
      byte b = b2;
      b2++;
      if (FLAGS[b] == null)
        FLAGS[b] = BINARY[b]; 
    } 
  }
  
  @NotNull
  public final String formatFlags(int paramInt1, int paramInt2) {
    long l = a ^ 0x2CDAF0C9BE49L;
    try {
      if (paramInt2 == 0)
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      switch (paramInt1) {
        case 4:
        case 6:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return (paramInt2 == 1) ? "ACK" : BINARY[paramInt2];
        case 2:
        case 3:
        case 7:
        case 8:
          return BINARY[paramInt2];
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      Intrinsics.checkNotNull(FLAGS[paramInt2]);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = (paramInt2 < FLAGS.length) ? FLAGS[paramInt2] : BINARY[paramInt2];
    try {
      if (paramInt1 == 5)
        try {
          if ((paramInt2 & 0x4) != 0);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt1 == 0)
        try {
          if ((paramInt2 & 0x20) != 0);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return str;
  }
  
  @NotNull
  public final String formattedType$okhttp(int paramInt) {
    long l = a ^ 0xAD2049F1FB4L;
    try {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramInt < FRAME_NAMES.length) ? FRAME_NAMES[paramInt] : Util.format("0x%02x", arrayOfObject);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Http2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
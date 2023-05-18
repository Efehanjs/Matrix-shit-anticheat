package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Hpack {
  private static final int PREFIX_4_BITS = 15;
  
  @NotNull
  private static final Map NAME_TO_FIRST_INDEX;
  
  @NotNull
  public static final Hpack INSTANCE;
  
  private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
  
  @NotNull
  private static final Header[] STATIC_HEADER_TABLE;
  
  private static final int PREFIX_7_BITS = 127;
  
  private static final int PREFIX_6_BITS = 63;
  
  private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
  
  private static final int PREFIX_5_BITS = 31;
  
  private static final long a = o3.a(-4466382896817805555L, 4407074222903121204L, MethodHandles.lookup().lookupClass()).a(42300046339626L);
  
  @NotNull
  public final Header[] getSTATIC_HEADER_TABLE() {
    return STATIC_HEADER_TABLE;
  }
  
  @NotNull
  public final ByteString checkLowercase(@NotNull ByteString paramByteString) throws IOException {
    long l = a ^ 0x7D2A63CFACBBL;
    Intrinsics.checkNotNullParameter(paramByteString, "name");
    byte b = 0;
    int i = paramByteString.size();
    while (b < i) {
      byte b1 = b;
      b++;
      byte b2 = paramByteString.getByte(b1);
      try {
        if (65 <= b2) {
          try {
          
          } catch (IOException iOException) {
            throw a(null);
          } 
        } else {
        
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      if (false)
        throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR response malformed: mixed case name: ", paramByteString.utf8())); 
    } 
    return paramByteString;
  }
  
  static {
    long l = a ^ 0x6EAFF00C6F6CL;
    INSTANCE = new Hpack();
    Header[] arrayOfHeader = new Header[61];
    arrayOfHeader[0] = new Header(Header.TARGET_AUTHORITY, "");
    arrayOfHeader[1] = new Header(Header.TARGET_METHOD, "GET");
    arrayOfHeader[2] = new Header(Header.TARGET_METHOD, "POST");
    arrayOfHeader[3] = new Header(Header.TARGET_PATH, "/");
    arrayOfHeader[4] = new Header(Header.TARGET_PATH, "/index.html");
    arrayOfHeader[5] = new Header(Header.TARGET_SCHEME, "http");
    arrayOfHeader[6] = new Header(Header.TARGET_SCHEME, "https");
    arrayOfHeader[7] = new Header(Header.RESPONSE_STATUS, "200");
    arrayOfHeader[8] = new Header(Header.RESPONSE_STATUS, "204");
    arrayOfHeader[9] = new Header(Header.RESPONSE_STATUS, "206");
    arrayOfHeader[10] = new Header(Header.RESPONSE_STATUS, "304");
    arrayOfHeader[11] = new Header(Header.RESPONSE_STATUS, "400");
    arrayOfHeader[12] = new Header(Header.RESPONSE_STATUS, "404");
    arrayOfHeader[13] = new Header(Header.RESPONSE_STATUS, "500");
    arrayOfHeader[14] = new Header("accept-charset", "");
    arrayOfHeader[15] = new Header("accept-encoding", "gzip, deflate");
    arrayOfHeader[16] = new Header("accept-language", "");
    arrayOfHeader[17] = new Header("accept-ranges", "");
    arrayOfHeader[18] = new Header("accept", "");
    arrayOfHeader[19] = new Header("access-control-allow-origin", "");
    arrayOfHeader[20] = new Header("age", "");
    arrayOfHeader[21] = new Header("allow", "");
    arrayOfHeader[22] = new Header("authorization", "");
    arrayOfHeader[23] = new Header("cache-control", "");
    arrayOfHeader[24] = new Header("content-disposition", "");
    arrayOfHeader[25] = new Header("content-encoding", "");
    arrayOfHeader[26] = new Header("content-language", "");
    arrayOfHeader[27] = new Header("content-length", "");
    arrayOfHeader[28] = new Header("content-location", "");
    arrayOfHeader[29] = new Header("content-range", "");
    arrayOfHeader[30] = new Header("content-type", "");
    arrayOfHeader[31] = new Header("cookie", "");
    arrayOfHeader[32] = new Header("date", "");
    arrayOfHeader[33] = new Header("etag", "");
    arrayOfHeader[34] = new Header("expect", "");
    arrayOfHeader[35] = new Header("expires", "");
    arrayOfHeader[36] = new Header("from", "");
    arrayOfHeader[37] = new Header("host", "");
    arrayOfHeader[38] = new Header("if-match", "");
    arrayOfHeader[39] = new Header("if-modified-since", "");
    arrayOfHeader[40] = new Header("if-none-match", "");
    arrayOfHeader[41] = new Header("if-range", "");
    arrayOfHeader[42] = new Header("if-unmodified-since", "");
    arrayOfHeader[43] = new Header("last-modified", "");
    arrayOfHeader[44] = new Header("link", "");
    arrayOfHeader[45] = new Header("location", "");
    arrayOfHeader[46] = new Header("max-forwards", "");
    arrayOfHeader[47] = new Header("proxy-authenticate", "");
    arrayOfHeader[48] = new Header("proxy-authorization", "");
    arrayOfHeader[49] = new Header("range", "");
    arrayOfHeader[50] = new Header("referer", "");
    arrayOfHeader[51] = new Header("refresh", "");
    arrayOfHeader[52] = new Header("retry-after", "");
    arrayOfHeader[53] = new Header("server", "");
    arrayOfHeader[54] = new Header("set-cookie", "");
    arrayOfHeader[55] = new Header("strict-transport-security", "");
    arrayOfHeader[56] = new Header("transfer-encoding", "");
    arrayOfHeader[57] = new Header("user-agent", "");
    arrayOfHeader[58] = new Header("vary", "");
    arrayOfHeader[59] = new Header("via", "");
    arrayOfHeader[60] = new Header("www-authenticate", "");
    STATIC_HEADER_TABLE = arrayOfHeader;
    NAME_TO_FIRST_INDEX = INSTANCE.nameToFirstIndex();
  }
  
  @NotNull
  public final Map getNAME_TO_FIRST_INDEX() {
    return NAME_TO_FIRST_INDEX;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Hpack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
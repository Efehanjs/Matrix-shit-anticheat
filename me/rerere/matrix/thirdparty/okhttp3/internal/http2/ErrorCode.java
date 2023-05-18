package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public enum ErrorCode {
  COMPRESSION_ERROR,
  NO_ERROR(0),
  STREAM_CLOSED(0),
  CONNECT_ERROR(0),
  FLOW_CONTROL_ERROR(0),
  SETTINGS_TIMEOUT(0),
  REFUSED_STREAM(0),
  FRAME_SIZE_ERROR(0),
  HTTP_1_1_REQUIRED(0),
  ENHANCE_YOUR_CALM(0),
  INTERNAL_ERROR(0),
  PROTOCOL_ERROR(1),
  CANCEL(1),
  INADEQUATE_SECURITY(1);
  
  @NotNull
  public static final ErrorCode$Companion Companion;
  
  private final int httpCode;
  
  static {
    INTERNAL_ERROR = new ErrorCode("INTERNAL_ERROR", 2, 2);
    FLOW_CONTROL_ERROR = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
    SETTINGS_TIMEOUT = new ErrorCode("SETTINGS_TIMEOUT", 4, 4);
    STREAM_CLOSED = new ErrorCode("STREAM_CLOSED", 5, 5);
    FRAME_SIZE_ERROR = new ErrorCode("FRAME_SIZE_ERROR", 6, 6);
    REFUSED_STREAM = new ErrorCode("REFUSED_STREAM", 7, 7);
    CANCEL = new ErrorCode("CANCEL", 8, 8);
    COMPRESSION_ERROR = new ErrorCode("COMPRESSION_ERROR", 9, 9);
    CONNECT_ERROR = new ErrorCode("CONNECT_ERROR", 10, 10);
    ENHANCE_YOUR_CALM = new ErrorCode("ENHANCE_YOUR_CALM", 11, 11);
    INADEQUATE_SECURITY = new ErrorCode("INADEQUATE_SECURITY", 12, 12);
    HTTP_1_1_REQUIRED = new ErrorCode("HTTP_1_1_REQUIRED", 13, 13);
    $VALUES = $values();
    Companion = new ErrorCode$Companion(null);
  }
  
  ErrorCode(int paramInt1) {
    this.httpCode = paramInt1;
  }
  
  public final int getHttpCode() {
    return this.httpCode;
  }
  
  static {
    long l = o3.a(-8065948516466596246L, 7207873672914841661L, MethodHandles.lookup().lookupClass()).a(228656191369803L) ^ 0x6C31AAA1E79DL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\ErrorCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
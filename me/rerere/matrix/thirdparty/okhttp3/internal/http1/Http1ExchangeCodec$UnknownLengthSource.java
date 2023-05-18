package me.rerere.matrix.thirdparty.okhttp3.internal.http1;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Http1ExchangeCodec$UnknownLengthSource extends Http1ExchangeCodec$AbstractSource {
  private boolean inputExhausted;
  
  private static final long b = o3.a(1730045061922376313L, 7720245859987795652L, MethodHandles.lookup().lookupClass()).a(260810616531094L);
  
  public Http1ExchangeCodec$UnknownLengthSource() {
    super(paramHttp1ExchangeCodec);
  }
  
  public void close() {
    try {
      if (getClosed())
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!this.inputExhausted)
        responseBodyComplete(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    setClosed(true);
  }
  
  public long read(@NotNull Buffer paramBuffer, long paramLong) {
    long l1 = b ^ 0x1D089F7C4D3EL;
    try {
      Intrinsics.checkNotNullParameter(paramBuffer, "sink");
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    if (!((paramLong >= 0L) ? 1 : 0)) {
      boolean bool = false;
      String str = Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(paramLong));
      throw new IllegalArgumentException(str.toString());
    } 
    try {
      if (!(!getClosed() ? 1 : 0)) {
        boolean bool = false;
        String str = "closed";
        throw new IllegalStateException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (this.inputExhausted)
        return -1L; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    long l2 = super.read(paramBuffer, paramLong);
    try {
      if (l2 == -1L) {
        this.inputExhausted = true;
        responseBodyComplete();
        return -1L;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return l2;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http1\Http1ExchangeCodec$UnknownLengthSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
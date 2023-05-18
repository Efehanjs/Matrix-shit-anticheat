package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class RealWebSocket$Message {
  @NotNull
  private final ByteString data;
  
  private final int formatOpcode;
  
  private static final long a = o3.a(-5067535409661799793L, -8924311206834108126L, MethodHandles.lookup().lookupClass()).a(30004295048963L);
  
  @NotNull
  public final ByteString getData() {
    return this.data;
  }
  
  public final int getFormatOpcode() {
    return this.formatOpcode;
  }
  
  public RealWebSocket$Message(int paramInt, @NotNull ByteString paramByteString) {
    this.formatOpcode = paramInt;
    this.data = paramByteString;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\RealWebSocket$Message.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
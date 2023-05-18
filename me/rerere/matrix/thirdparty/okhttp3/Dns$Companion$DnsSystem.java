package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Dns$Companion$DnsSystem implements Dns {
  private static final long a = o3.a(-3854014613285974533L, 764694130049362488L, MethodHandles.lookup().lookupClass()).a(22430761261679L);
  
  @NotNull
  public List lookup(@NotNull String paramString) {
    long l = a ^ 0x22B0B6B3F959L;
    Intrinsics.checkNotNullParameter(paramString, "hostname");
    try {
      InetAddress[] arrayOfInetAddress = InetAddress.getAllByName(paramString);
      Intrinsics.checkNotNullExpressionValue(arrayOfInetAddress, "getAllByName(hostname)");
      return ArraysKt.toList((Object[])arrayOfInetAddress);
    } catch (NullPointerException nullPointerException) {
      UnknownHostException unknownHostException1 = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", paramString));
      UnknownHostException unknownHostException2 = unknownHostException1;
      boolean bool = false;
      unknownHostException2.initCause(nullPointerException);
      throw (Throwable)unknownHostException1;
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Dns$Companion$DnsSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
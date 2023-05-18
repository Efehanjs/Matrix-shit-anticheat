package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.net.InetSocketAddress;
import java.net.Proxy;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Route {
  @NotNull
  private final Address address;
  
  @NotNull
  private final InetSocketAddress socketAddress;
  
  @NotNull
  private final Proxy proxy;
  
  private static final long a = o3.a(-4825134039109659388L, -7702837532854077693L, MethodHandles.lookup().lookupClass()).a(238018047428160L);
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "address", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Address -deprecated_address() {
    return this.address;
  }
  
  public int hashCode() {
    null = 17;
    null = 31 * null + this.address.hashCode();
    null = 31 * null + this.proxy.hashCode();
    return 31 * null + this.socketAddress.hashCode();
  }
  
  @NotNull
  public final Address address() {
    return this.address;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "proxy", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Proxy -deprecated_proxy() {
    return this.proxy;
  }
  
  @NotNull
  public final Proxy proxy() {
    return this.proxy;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "socketAddress", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final InetSocketAddress -deprecated_socketAddress() {
    return this.socketAddress;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x5B68580F6CD4L;
    return "Route{" + this.socketAddress + '}';
  }
  
  @NotNull
  public final InetSocketAddress socketAddress() {
    return this.socketAddress;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof Route)
        try {
          if (Intrinsics.areEqual(((Route)paramObject).address, this.address))
            try {
              if (Intrinsics.areEqual(((Route)paramObject).proxy, this.proxy))
                try {
                  if (Intrinsics.areEqual(((Route)paramObject).socketAddress, this.socketAddress));
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public Route(@NotNull Address paramAddress, @NotNull Proxy paramProxy, @NotNull InetSocketAddress paramInetSocketAddress) {
    this.address = paramAddress;
    this.proxy = paramProxy;
    this.socketAddress = paramInetSocketAddress;
  }
  
  public final boolean requiresTunnel() {
    try {
      if (this.address.sslSocketFactory() != null)
        try {
          if (this.proxy.type() == Proxy.Type.HTTP);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Route.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
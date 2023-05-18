package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class WebSocketExtensions {
  @JvmField
  @Nullable
  public final Integer serverMaxWindowBits;
  
  @JvmField
  public final boolean clientNoContextTakeover;
  
  @JvmField
  public final boolean serverNoContextTakeover;
  
  @NotNull
  public static final WebSocketExtensions$Companion Companion;
  
  @NotNull
  private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
  
  @JvmField
  public final boolean perMessageDeflate;
  
  @JvmField
  @Nullable
  public final Integer clientMaxWindowBits;
  
  @JvmField
  public final boolean unknownValues;
  
  private static final long a = o3.a(3287557384263955780L, 7136334572362792038L, MethodHandles.lookup().lookupClass()).a(225324384236187L);
  
  @NotNull
  public final WebSocketExtensions copy(boolean paramBoolean1, @Nullable Integer paramInteger1, boolean paramBoolean2, @Nullable Integer paramInteger2, boolean paramBoolean3, boolean paramBoolean4) {
    return new WebSocketExtensions(paramBoolean1, paramInteger1, paramBoolean2, paramInteger2, paramBoolean3, paramBoolean4);
  }
  
  static {
    Companion = new WebSocketExtensions$Companion(null);
  }
  
  public final boolean component1() {
    return this.perMessageDeflate;
  }
  
  public final boolean component5() {
    return this.serverNoContextTakeover;
  }
  
  public final boolean component3() {
    return this.clientNoContextTakeover;
  }
  
  public WebSocketExtensions() {
    this(false, null, false, null, false, false, 63, null);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof WebSocketExtensions))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    WebSocketExtensions webSocketExtensions = (WebSocketExtensions)paramObject;
    try {
      if (this.perMessageDeflate != webSocketExtensions.perMessageDeflate)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.clientNoContextTakeover != webSocketExtensions.clientNoContextTakeover)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.serverNoContextTakeover != webSocketExtensions.serverNoContextTakeover)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.unknownValues != webSocketExtensions.unknownValues)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public int hashCode() {
    try {
      if (this.perMessageDeflate);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    null = 1;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    null = null * 31 + ((this.clientMaxWindowBits == null) ? 0 : this.clientMaxWindowBits.hashCode());
    try {
      if (this.clientNoContextTakeover);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    null = null * 31 + 1;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    null = null * 31 + ((this.serverMaxWindowBits == null) ? 0 : this.serverMaxWindowBits.hashCode());
    try {
      if (this.serverNoContextTakeover);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    null = null * 31 + 1;
    try {
      if (this.unknownValues);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null * 31 + 1;
  }
  
  @Nullable
  public final Integer component4() {
    return this.serverMaxWindowBits;
  }
  
  public WebSocketExtensions(boolean paramBoolean1, @Nullable Integer paramInteger1, boolean paramBoolean2, @Nullable Integer paramInteger2, boolean paramBoolean3, boolean paramBoolean4) {
    this.perMessageDeflate = paramBoolean1;
    this.clientMaxWindowBits = paramInteger1;
    this.clientNoContextTakeover = paramBoolean2;
    this.serverMaxWindowBits = paramInteger2;
    this.serverNoContextTakeover = paramBoolean3;
    this.unknownValues = paramBoolean4;
  }
  
  public final boolean noContextTakeover(boolean paramBoolean) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramBoolean ? this.clientNoContextTakeover : this.serverNoContextTakeover;
  }
  
  @Nullable
  public final Integer component2() {
    return this.clientMaxWindowBits;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x1624F0B50CAL;
    return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
  }
  
  public final boolean component6() {
    return this.unknownValues;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\WebSocketExtensions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
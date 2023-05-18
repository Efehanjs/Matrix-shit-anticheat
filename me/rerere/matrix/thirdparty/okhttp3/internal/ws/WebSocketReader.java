package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSource;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class WebSocketReader implements Closeable {
  private boolean closed;
  
  private final boolean perMessageDeflate;
  
  @NotNull
  private final WebSocketReader$FrameCallback frameCallback;
  
  @NotNull
  private final BufferedSource source;
  
  private boolean isControlFrame;
  
  private final boolean noContextTakeover;
  
  @NotNull
  private final Buffer controlFrameBuffer;
  
  private boolean isFinalFrame;
  
  private boolean readingCompressedMessage;
  
  @Nullable
  private MessageInflater messageInflater;
  
  private final boolean isClient;
  
  private long frameLength;
  
  @Nullable
  private final Buffer.UnsafeCursor maskCursor;
  
  private int opcode;
  
  @Nullable
  private final byte[] maskKey;
  
  @NotNull
  private final Buffer messageFrameBuffer;
  
  private static final long a = o3.a(8047247551123428660L, -6938546070916061470L, MethodHandles.lookup().lookupClass()).a(87799396076116L);
  
  public WebSocketReader(boolean paramBoolean1, @NotNull BufferedSource paramBufferedSource, @NotNull WebSocketReader$FrameCallback paramWebSocketReader$FrameCallback, boolean paramBoolean2, boolean paramBoolean3) {
    this.isClient = paramBoolean1;
    this.source = paramBufferedSource;
    this.frameCallback = paramWebSocketReader$FrameCallback;
    this.perMessageDeflate = paramBoolean2;
    this.noContextTakeover = paramBoolean3;
    this.controlFrameBuffer = new Buffer();
    this.messageFrameBuffer = new Buffer();
    try {
      this.maskKey = this.isClient ? null : new byte[4];
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.maskCursor = this.isClient ? null : new Buffer.UnsafeCursor();
  }
  
  public final void processNextFrame() throws IOException {
    try {
      readHeader();
      if (this.isControlFrame) {
        readControlFrame();
      } else {
        readMessageFrame();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public final BufferedSource getSource() {
    return this.source;
  }
  
  public void close() throws IOException {
    try {
      if (this.messageInflater == null) {
      
      } else {
        this.messageInflater.close();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\WebSocketReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
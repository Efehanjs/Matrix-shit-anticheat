package me.rerere.matrix.thirdparty.okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class WebSocketWriter implements Closeable {
  @NotNull
  private final BufferedSink sink;
  
  @NotNull
  private final Random random;
  
  private final boolean noContextTakeover;
  
  @Nullable
  private final byte[] maskKey;
  
  private boolean writerClosed;
  
  @NotNull
  private final Buffer messageBuffer;
  
  @Nullable
  private MessageDeflater messageDeflater;
  
  private final boolean perMessageDeflate;
  
  @Nullable
  private final Buffer.UnsafeCursor maskCursor;
  
  private final boolean isClient;
  
  private final long minimumDeflateSize;
  
  @NotNull
  private final Buffer sinkBuffer;
  
  private static final long a = o3.a(2323587662263931496L, 793829239219540903L, MethodHandles.lookup().lookupClass()).a(214844545234504L);
  
  @NotNull
  public final Random getRandom() {
    return this.random;
  }
  
  public final void writeMessageFrame(int paramInt, @NotNull ByteString paramByteString) throws IOException {
    long l1 = a ^ 0x24AB665B63F9L;
    try {
      Intrinsics.checkNotNullParameter(paramByteString, "data");
      if (this.writerClosed)
        throw new IOException("closed"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.messageBuffer.write(paramByteString);
    int i = paramInt | 0x80;
    try {
      if (this.perMessageDeflate && paramByteString.size() >= this.minimumDeflateSize) {
        MessageDeflater messageDeflater2 = this.messageDeflater;
        MessageDeflater messageDeflater3 = new MessageDeflater(this.noContextTakeover);
        MessageDeflater messageDeflater4 = messageDeflater3;
        boolean bool = false;
        this.messageDeflater = messageDeflater4;
        MessageDeflater messageDeflater1 = (messageDeflater2 == null) ? messageDeflater3 : messageDeflater2;
        messageDeflater1.deflate(this.messageBuffer);
        i |= 0x40;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    long l2 = this.messageBuffer.size();
    this.sinkBuffer.writeByte(i);
    int j = 0;
    if (this.isClient)
      j |= 0x80; 
    if (l2 <= 125L) {
      j |= (int)l2;
      this.sinkBuffer.writeByte(j);
    } else if (l2 <= 65535L) {
      j |= 0x7E;
      this.sinkBuffer.writeByte(j);
      this.sinkBuffer.writeShort((int)l2);
    } else {
      j |= 0x7F;
      this.sinkBuffer.writeByte(j);
      this.sinkBuffer.writeLong(l2);
    } 
    try {
      if (this.isClient)
        try {
          Intrinsics.checkNotNull(this.maskKey);
          this.random.nextBytes(this.maskKey);
          this.sinkBuffer.write(this.maskKey);
          if (l2 > 0L) {
            Intrinsics.checkNotNull(this.maskCursor);
            this.messageBuffer.readAndWriteUnsafe(this.maskCursor);
            this.maskCursor.seek(0L);
            WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
            this.maskCursor.close();
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.sinkBuffer.write(this.messageBuffer, l2);
    this.sink.emit();
  }
  
  public final void writePong(@NotNull ByteString paramByteString) throws IOException {
    long l = a ^ 0xD8D0B290622L;
    Intrinsics.checkNotNullParameter(paramByteString, "payload");
    writeControlFrame(10, paramByteString);
  }
  
  public WebSocketWriter(boolean paramBoolean1, @NotNull BufferedSink paramBufferedSink, @NotNull Random paramRandom, boolean paramBoolean2, boolean paramBoolean3, long paramLong) {
    this.isClient = paramBoolean1;
    this.sink = paramBufferedSink;
    this.random = paramRandom;
    this.perMessageDeflate = paramBoolean2;
    this.noContextTakeover = paramBoolean3;
    this.minimumDeflateSize = paramLong;
    this.messageBuffer = new Buffer();
    this.sinkBuffer = this.sink.getBuffer();
    try {
      this.maskKey = this.isClient ? new byte[4] : null;
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.maskCursor = this.isClient ? new Buffer.UnsafeCursor() : null;
  }
  
  public final void writeClose(int paramInt, @Nullable ByteString paramByteString) throws IOException {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/ByteString.EMPTY : Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   3: astore_3
    //   4: iload_1
    //   5: ifne -> 19
    //   8: aload_2
    //   9: ifnull -> 88
    //   12: goto -> 19
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: iload_1
    //   20: ifeq -> 44
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   29: athrow
    //   30: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/ws/WebSocketProtocol.INSTANCE : Lme/rerere/matrix/thirdparty/okhttp3/internal/ws/WebSocketProtocol;
    //   33: iload_1
    //   34: invokevirtual validateCloseCode : (I)V
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   43: athrow
    //   44: new me/rerere/matrix/thirdparty/okio/Buffer
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: astore #5
    //   53: iconst_0
    //   54: istore #6
    //   56: aload #5
    //   58: iload_1
    //   59: invokevirtual writeShort : (I)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   62: pop
    //   63: aload_2
    //   64: ifnull -> 81
    //   67: aload #5
    //   69: aload_2
    //   70: invokevirtual write : (Lme/rerere/matrix/thirdparty/okio/ByteString;)Lme/rerere/matrix/thirdparty/okio/Buffer;
    //   73: pop
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload #5
    //   83: invokevirtual readByteString : ()Lme/rerere/matrix/thirdparty/okio/ByteString;
    //   86: nop
    //   87: astore_3
    //   88: nop
    //   89: aload_0
    //   90: bipush #8
    //   92: aload_3
    //   93: invokespecial writeControlFrame : (ILme/rerere/matrix/thirdparty/okio/ByteString;)V
    //   96: aload_0
    //   97: iconst_1
    //   98: putfield writerClosed : Z
    //   101: goto -> 114
    //   104: astore #4
    //   106: aload_0
    //   107: iconst_1
    //   108: putfield writerClosed : Z
    //   111: aload #4
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	12	15	java/io/IOException
    //   8	23	26	java/io/IOException
    //   19	37	40	java/io/IOException
    //   56	74	77	java/io/IOException
    //   88	96	104	finally
    //   104	106	104	finally
  }
  
  public void close() {
    try {
      if (this.messageDeflater == null) {
      
      } else {
        this.messageDeflater.close();
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  @NotNull
  public final BufferedSink getSink() {
    return this.sink;
  }
  
  public final void writePing(@NotNull ByteString paramByteString) throws IOException {
    long l = a ^ 0xE78A7E8DB68L;
    Intrinsics.checkNotNullParameter(paramByteString, "payload");
    writeControlFrame(9, paramByteString);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\ws\WebSocketWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.utils;

import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.MethodHandles;
import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.rerere.matrix.internal.o3;

public class DumperBus extends Writer {
  private final BlockingQueue lineQueue;
  
  private final ExecutorService executor = Executors.newSingleThreadExecutor();
  
  private final DumperBus$Dumper source;
  
  private StringBuffer lineBuffer;
  
  private static final long a = o3.a(-8032776660683233059L, 7319676564541135058L, MethodHandles.lookup().lookupClass()).a(156226206824822L);
  
  public DumperBus(DumperBus$Dumper paramDumperBus$Dumper, int paramInt) {
    Validate.notNull(paramDumperBus$Dumper, "Source not provided");
    this.source = paramDumperBus$Dumper;
    this.lineQueue = new ArrayBlockingQueue(paramInt, true);
  }
  
  public void flush() throws IOException {
    try {
      if (this.lineBuffer.length() > 0)
        append(this.lineBuffer.toString()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.lineBuffer.setLength(0);
  }
  
  public void runThread(DumperBus$Task paramDumperBus$Task) throws IOException {
    try {
      this.executor.submit(() -> {
            paramDumperBus$Task.run();
            return null;
          });
    } catch (Exception exception) {
      throw new IOException(exception);
    } 
  }
  
  public boolean isClosed() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.lineBuffer == null);
  }
  
  public String await() throws IOException {
    try {
      try {
        if (this.lineQueue.isEmpty() && isClosed())
          return null; 
      } catch (InterruptedException interruptedException) {
        throw a(null);
      } 
      return ((Optional<String>)this.lineQueue.take()).orElse(null);
    } catch (InterruptedException interruptedException) {
      return null;
    } catch (Exception exception) {
      throw new IOException(exception);
    } 
  }
  
  public DumperBus(DumperBus$Dumper paramDumperBus$Dumper) {
    this(paramDumperBus$Dumper, 100);
  }
  
  public DumperBus$Dumper source() {
    return this.source;
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: aload_0
    //   1: getfield lock : Ljava/lang/Object;
    //   4: dup
    //   5: astore #4
    //   7: monitorenter
    //   8: iload_2
    //   9: iload_3
    //   10: iadd
    //   11: iconst_1
    //   12: isub
    //   13: istore #5
    //   15: iload #5
    //   17: iload_2
    //   18: if_icmplt -> 125
    //   21: iload #5
    //   23: aload_1
    //   24: arraylength
    //   25: if_icmpge -> 125
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   34: athrow
    //   35: aload_1
    //   36: iload #5
    //   38: caload
    //   39: bipush #10
    //   41: if_icmpne -> 125
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   50: athrow
    //   51: iinc #5, -1
    //   54: iinc #3, -1
    //   57: iload #5
    //   59: iload_2
    //   60: if_icmplt -> 96
    //   63: goto -> 70
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: aload_1
    //   71: iload #5
    //   73: caload
    //   74: bipush #13
    //   76: if_icmpne -> 96
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: iinc #3, -1
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: iload_3
    //   97: ifle -> 118
    //   100: aload_0
    //   101: getfield lineBuffer : Ljava/lang/StringBuffer;
    //   104: aload_1
    //   105: iload_2
    //   106: iload_3
    //   107: invokevirtual append : ([CII)Ljava/lang/StringBuffer;
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload_0
    //   119: invokevirtual flush : ()V
    //   122: goto -> 136
    //   125: aload_0
    //   126: getfield lineBuffer : Ljava/lang/StringBuffer;
    //   129: aload_1
    //   130: iload_2
    //   131: iload_3
    //   132: invokevirtual append : ([CII)Ljava/lang/StringBuffer;
    //   135: pop
    //   136: aload #4
    //   138: monitorexit
    //   139: goto -> 150
    //   142: astore #6
    //   144: aload #4
    //   146: monitorexit
    //   147: aload #6
    //   149: athrow
    //   150: return
    // Exception table:
    //   from	to	target	type
    //   8	139	142	finally
    //   15	28	31	java/io/IOException
    //   21	44	47	java/io/IOException
    //   35	63	66	java/io/IOException
    //   51	79	82	java/io/IOException
    //   70	89	92	java/io/IOException
    //   96	111	114	java/io/IOException
    //   142	147	142	finally
  }
  
  public void dump() throws IOException {
    this.lineBuffer = new StringBuffer();
    runThread(() -> {
          try {
            this.source.dump(this);
          } finally {
            close();
          } 
        });
  }
  
  public void close() throws IOException {
    try {
      if (!isClosed()) {
        flush();
        this.lineBuffer = null;
        append(null);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.executor.shutdown();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyam\\utils\DumperBus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
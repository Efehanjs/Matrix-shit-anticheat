package me.rerere.matrix.thirdparty.okhttp3.internal.connection;

import java.lang.invoke.MethodHandles;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.Address;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskQueue;
import me.rerere.matrix.thirdparty.okhttp3.internal.concurrent.TaskRunner;
import me.rerere.matrix.thirdparty.okhttp3.internal.platform.Platform;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class RealConnectionPool {
  @NotNull
  private final RealConnectionPool$cleanupTask$1 cleanupTask;
  
  @NotNull
  public static final RealConnectionPool$Companion Companion;
  
  @NotNull
  private final ConcurrentLinkedQueue connections;
  
  private final long keepAliveDurationNs;
  
  private final int maxIdleConnections;
  
  @NotNull
  private final TaskQueue cleanupQueue;
  
  private static final long a = o3.a(-5292409409258363898L, 8664529242003827758L, MethodHandles.lookup().lookupClass()).a(143439310189632L);
  
  public final boolean callAcquirePooledConnection(@NotNull Address paramAddress, @NotNull RealCall paramRealCall, @Nullable List paramList, boolean paramBoolean) {
    long l = a ^ 0x15FE176E085L;
    Intrinsics.checkNotNullParameter(paramAddress, "address");
    Intrinsics.checkNotNullParameter(paramRealCall, "call");
    for (RealConnection realConnection : this.connections) {
      Intrinsics.checkNotNullExpressionValue(realConnection, "connection");
      synchronized (realConnection) {
        boolean bool = false;
        try {
          if (paramBoolean)
            try {
              if (!realConnection.isMultiplexed$okhttp())
                continue; 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        try {
          if (realConnection.isEligible$okhttp(paramAddress, paramList)) {
            paramRealCall.acquireConnectionNoEvents(realConnection);
            return true;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
      continue;
      unit = Unit.INSTANCE;
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_9} */
    } 
    return false;
  }
  
  public final void put(@NotNull RealConnection paramRealConnection) {
    long l = a ^ 0x72040F2A3DD2L;
    Intrinsics.checkNotNullParameter(paramRealConnection, "connection");
    RealConnection realConnection = paramRealConnection;
    boolean bool = false;
    try {
      if (Util.assertionsEnabled)
        try {
          if (!Thread.holdsLock(realConnection))
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + realConnection); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.connections.add(paramRealConnection);
    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
  }
  
  public final long cleanup(long paramLong) {
    long l1 = a ^ 0x41923B8AF125L;
    int i = 0;
    int j = 0;
    RealConnection realConnection = null;
    long l2 = 0L;
    l2 = Long.MIN_VALUE;
    for (RealConnection realConnection1 : this.connections) {
      Intrinsics.checkNotNullExpressionValue(realConnection1, "connection");
      synchronized (realConnection1) {
        boolean bool = false;
        int k = i;
        i = k + 1;
        k = j;
        j = k + 1;
        long l = paramLong - realConnection1.getIdleAtNs$okhttp();
        if (l > l2) {
          l2 = l;
          realConnection = realConnection1;
        } else {
        
        } 
        bool = (pruneAndGetAllocationCount(realConnection1, paramLong) > 0) ? Integer.valueOf(k) : Unit.INSTANCE;
      } 
    } 
    try {
      if (l2 >= this.keepAliveDurationNs || j > this.maxIdleConnections) {
        Intrinsics.checkNotNull(realConnection);
        RealConnection realConnection1 = realConnection;
        synchronized (realConnection1) {
          boolean bool = false;
          try {
            if (!realConnection1.getCalls().isEmpty())
              return 0L; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          if (realConnection1.getIdleAtNs$okhttp() + l2 != paramLong)
            return 0L; 
          realConnection1.setNoNewExchanges(true);
          bool = this.connections.remove(realConnection);
        } 
        try {
          Util.closeQuietly(realConnection1.socket());
          if (this.connections.isEmpty())
            this.cleanupQueue.cancelAll(); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return 0L;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (j > 0)
        return this.keepAliveDurationNs - l2; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (i > 0)
        return this.keepAliveDurationNs; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return -1L;
  }
  
  static {
    Companion = new RealConnectionPool$Companion(null);
  }
  
  public final void evictAll() {
    long l = a ^ 0x670AA369AA33L;
    Iterator<RealConnection> iterator2 = this.connections.iterator();
    Intrinsics.checkNotNullExpressionValue(iterator2, "connections.iterator()");
    Iterator<RealConnection> iterator1 = iterator2;
    while (iterator1.hasNext()) {
      RealConnection realConnection = iterator1.next();
      Intrinsics.checkNotNullExpressionValue(realConnection, "connection");
      synchronized (realConnection) {
        boolean bool = false;
        try {
          iterator1.remove();
          realConnection.setNoNewExchanges(true);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        Socket socket1 = realConnection.getCalls().isEmpty() ? realConnection.socket() : null;
      } 
      Socket socket = socket1;
      try {
        if (socket == null)
          continue; 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      Util.closeQuietly(socket);
    } 
    try {
      if (this.connections.isEmpty())
        this.cleanupQueue.cancelAll(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public final boolean connectionBecameIdle(@NotNull RealConnection paramRealConnection) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnectionPool.a : J
    //   3: ldc2_w 78689861159823
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc 'connection'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: astore #4
    //   17: iconst_0
    //   18: istore #5
    //   20: getstatic me/rerere/matrix/thirdparty/okhttp3/internal/Util.assertionsEnabled : Z
    //   23: ifeq -> 87
    //   26: aload #4
    //   28: invokestatic holdsLock : (Ljava/lang/Object;)Z
    //   31: ifne -> 87
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   40: athrow
    //   41: new java/lang/AssertionError
    //   44: dup
    //   45: new java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: ldc 'Thread '
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokestatic currentThread : ()Ljava/lang/Thread;
    //   60: invokevirtual getName : ()Ljava/lang/String;
    //   63: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   66: ldc ' MUST hold lock on '
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: aload #4
    //   73: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   76: invokevirtual toString : ()Ljava/lang/String;
    //   79: invokespecial <init> : (Ljava/lang/Object;)V
    //   82: athrow
    //   83: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   86: athrow
    //   87: nop
    //   88: aload_1
    //   89: invokevirtual getNoNewExchanges : ()Z
    //   92: ifne -> 109
    //   95: aload_0
    //   96: getfield maxIdleConnections : I
    //   99: ifne -> 158
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   108: athrow
    //   109: aload_1
    //   110: iconst_1
    //   111: invokevirtual setNoNewExchanges : (Z)V
    //   114: aload_0
    //   115: getfield connections : Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   118: aload_1
    //   119: invokevirtual remove : (Ljava/lang/Object;)Z
    //   122: pop
    //   123: aload_0
    //   124: getfield connections : Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   127: invokevirtual isEmpty : ()Z
    //   130: ifeq -> 154
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   139: athrow
    //   140: aload_0
    //   141: getfield cleanupQueue : Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;
    //   144: invokevirtual cancelAll : ()V
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   153: athrow
    //   154: iconst_1
    //   155: goto -> 176
    //   158: aload_0
    //   159: getfield cleanupQueue : Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;
    //   162: aload_0
    //   163: getfield cleanupTask : Lme/rerere/matrix/thirdparty/okhttp3/internal/connection/RealConnectionPool$cleanupTask$1;
    //   166: checkcast me/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task
    //   169: lconst_0
    //   170: iconst_2
    //   171: aconst_null
    //   172: invokestatic schedule$default : (Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/TaskQueue;Lme/rerere/matrix/thirdparty/okhttp3/internal/concurrent/Task;JILjava/lang/Object;)V
    //   175: iconst_0
    //   176: ireturn
    // Exception table:
    //   from	to	target	type
    //   20	34	37	java/lang/IllegalArgumentException
    //   26	83	83	java/lang/IllegalArgumentException
    //   87	102	105	java/lang/IllegalArgumentException
    //   95	133	136	java/lang/IllegalArgumentException
    //   109	147	150	java/lang/IllegalArgumentException
  }
  
  public final int connectionCount() {
    return this.connections.size();
  }
  
  public final int idleConnectionCount() {
    long l = a ^ 0x55B7B3F8CCD5L;
    ConcurrentLinkedQueue concurrentLinkedQueue = this.connections;
    boolean bool = false;
    try {
      if (concurrentLinkedQueue instanceof java.util.Collection)
        try {
          if (concurrentLinkedQueue.isEmpty());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    byte b = 0;
    for (RealConnection realConnection1 : concurrentLinkedQueue) {
      RealConnection realConnection2 = realConnection1;
      boolean bool1 = false;
      Intrinsics.checkNotNullExpressionValue(realConnection2, "it");
      synchronized (realConnection2) {
        boolean bool2 = false;
        bool2 = realConnection2.getCalls().isEmpty();
      } 
      if (bool2 && ++b < 0)
        CollectionsKt.throwCountOverflow(); 
    } 
    return b;
  }
  
  public RealConnectionPool(@NotNull TaskRunner paramTaskRunner, int paramInt, long paramLong, @NotNull TimeUnit paramTimeUnit) {
    this.maxIdleConnections = paramInt;
    this.keepAliveDurationNs = paramTimeUnit.toNanos(paramLong);
    this.cleanupQueue = paramTaskRunner.newQueue();
    String str = Intrinsics.stringPlus(Util.okHttpName, " ConnectionPool");
    this.cleanupTask = new RealConnectionPool$cleanupTask$1(this, str);
    this.connections = new ConcurrentLinkedQueue();
    if (!((paramLong > 0L) ? 1 : 0)) {
      boolean bool = false;
      String str1 = Intrinsics.stringPlus("keepAliveDuration <= 0: ", Long.valueOf(paramLong));
      throw new IllegalArgumentException(str1.toString());
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\connection\RealConnectionPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
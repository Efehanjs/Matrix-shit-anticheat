package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okhttp3.internal.Util;
import me.rerere.matrix.thirdparty.okhttp3.internal.connection.RealCall;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Dispatcher {
  @NotNull
  private final ArrayDeque readyAsyncCalls = new ArrayDeque();
  
  @NotNull
  private final ArrayDeque runningSyncCalls = new ArrayDeque();
  
  private int maxRequestsPerHost = 5;
  
  private int maxRequests = 64;
  
  @Nullable
  private Runnable idleCallback;
  
  @Nullable
  private ExecutorService executorServiceOrNull;
  
  @NotNull
  private final ArrayDeque runningAsyncCalls = new ArrayDeque();
  
  private static final long a = o3.a(-4056436128424288952L, 1192284993586685311L, MethodHandles.lookup().lookupClass()).a(232186286903344L);
  
  @NotNull
  public final synchronized ExecutorService executorService() {
    long l = a ^ 0x5F335AA9E22FL;
    try {
      if (this.executorServiceOrNull == null)
        this.executorServiceOrNull = new ThreadPoolExecutor(0, 2147483647, 60L, TimeUnit.SECONDS, new SynchronousQueue<>(), Util.threadFactory(Intrinsics.stringPlus(Util.okHttpName, " Dispatcher"), false)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Intrinsics.checkNotNull(this.executorServiceOrNull);
    return this.executorServiceOrNull;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "executorService", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final ExecutorService -deprecated_executorService() {
    return executorService();
  }
  
  public final synchronized int getMaxRequestsPerHost() {
    return this.maxRequestsPerHost;
  }
  
  public Dispatcher(@NotNull ExecutorService paramExecutorService) {
    this();
    this.executorServiceOrNull = paramExecutorService;
  }
  
  public final synchronized int queuedCallsCount() {
    return this.readyAsyncCalls.size();
  }
  
  @NotNull
  public final synchronized List runningCalls() {
    long l = a ^ 0x15CE8B577F1BL;
    ArrayDeque arrayDeque1 = this.runningAsyncCalls;
    ArrayDeque arrayDeque3 = this.runningSyncCalls;
    boolean bool1 = false;
    ArrayDeque arrayDeque2 = arrayDeque1;
    ArrayList<RealCall> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque1, 10));
    boolean bool2 = false;
    for (RealCall.AsyncCall asyncCall1 : arrayDeque2) {
      RealCall.AsyncCall asyncCall2 = asyncCall1;
      ArrayList<RealCall> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(asyncCall2.getCall());
    } 
    List<?> list = Collections.unmodifiableList(CollectionsKt.plus(arrayDeque3, arrayList));
    Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(running…yncCalls.map { it.call })");
    return list;
  }
  
  public final void finished$okhttp(@NotNull RealCall.AsyncCall paramAsyncCall) {
    long l = a ^ 0x46125FD11832L;
    Intrinsics.checkNotNullParameter(paramAsyncCall, "call");
    paramAsyncCall.getCallsPerHost().decrementAndGet();
    finished(this.runningAsyncCalls, paramAsyncCall);
  }
  
  public final void finished$okhttp(@NotNull RealCall paramRealCall) {
    long l = a ^ 0x1C01748CE7CL;
    Intrinsics.checkNotNullParameter(paramRealCall, "call");
    finished(this.runningSyncCalls, paramRealCall);
  }
  
  public final void setMaxRequests(int paramInt) {
    long l = a ^ 0x71A02F1C41DAL;
    try {
      if (!((paramInt >= 1) ? 1 : 0)) {
        boolean bool = false;
        String str = Intrinsics.stringPlus("max < 1: ", Integer.valueOf(paramInt));
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    synchronized (this) {
      boolean bool = false;
      this.maxRequests = paramInt;
      Unit unit = Unit.INSTANCE;
    } 
    promoteAndExecute();
  }
  
  public final void enqueue$okhttp(@NotNull RealCall.AsyncCall paramAsyncCall) {
    long l = a ^ 0x2A6C44EE8461L;
    Intrinsics.checkNotNullParameter(paramAsyncCall, "call");
    synchronized (this) {
      boolean bool = false;
      this.readyAsyncCalls.add(paramAsyncCall);
      if (!paramAsyncCall.getCall().getForWebSocket()) {
        RealCall.AsyncCall asyncCall = findExistingCallWithHost(paramAsyncCall.getHost());
        try {
          if (asyncCall != null)
            paramAsyncCall.reuseCallsPerHostFrom(asyncCall); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
      Unit unit = Unit.INSTANCE;
    } 
    promoteAndExecute();
  }
  
  public final synchronized int getMaxRequests() {
    return this.maxRequests;
  }
  
  public final synchronized void cancelAll() {
    for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls)
      asyncCall.getCall().cancel(); 
    for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls)
      asyncCall.getCall().cancel(); 
    for (RealCall realCall : this.runningSyncCalls)
      realCall.cancel(); 
  }
  
  public Dispatcher() {}
  
  public final synchronized int runningCallsCount() {
    return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
  }
  
  public final synchronized void executed$okhttp(@NotNull RealCall paramRealCall) {
    long l = a ^ 0x6D24130D45C9L;
    Intrinsics.checkNotNullParameter(paramRealCall, "call");
    this.runningSyncCalls.add(paramRealCall);
  }
  
  @Nullable
  public final synchronized Runnable getIdleCallback() {
    return this.idleCallback;
  }
  
  @NotNull
  public final synchronized List queuedCalls() {
    long l = a ^ 0x6BE9A400C4BEL;
    ArrayDeque arrayDeque1 = this.readyAsyncCalls;
    boolean bool1 = false;
    ArrayDeque arrayDeque2 = arrayDeque1;
    ArrayList<RealCall> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayDeque1, 10));
    boolean bool2 = false;
    for (RealCall.AsyncCall asyncCall1 : arrayDeque2) {
      RealCall.AsyncCall asyncCall2 = asyncCall1;
      ArrayList<RealCall> arrayList1 = arrayList;
      boolean bool = false;
      arrayList1.add(asyncCall2.getCall());
    } 
    List<RealCall> list = Collections.unmodifiableList(arrayList);
    Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(readyAsyncCalls.map { it.call })");
    return list;
  }
  
  public final void setMaxRequestsPerHost(int paramInt) {
    long l = a ^ 0x2AD4120ECDA1L;
    try {
      if (!((paramInt >= 1) ? 1 : 0)) {
        boolean bool = false;
        String str = Intrinsics.stringPlus("max < 1: ", Integer.valueOf(paramInt));
        throw new IllegalArgumentException(str.toString());
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    synchronized (this) {
      boolean bool = false;
      this.maxRequestsPerHost = paramInt;
      Unit unit = Unit.INSTANCE;
    } 
    promoteAndExecute();
  }
  
  public final synchronized void setIdleCallback(@Nullable Runnable paramRunnable) {
    this.idleCallback = paramRunnable;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\Dispatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
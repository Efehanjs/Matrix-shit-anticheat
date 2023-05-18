package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;

public final class AsyncTimeout$Watchdog extends Thread {
  private static final long a = o3.a(7144698411914104001L, -4897335536423160431L, MethodHandles.lookup().lookupClass()).a(266756644443352L);
  
  public AsyncTimeout$Watchdog() {
    super("Okio Watchdog");
    setDaemon(true);
  }
  
  public void run() {
    while (true) {
      try {
        AsyncTimeout asyncTimeout1 = null;
        Class<AsyncTimeout> clazz = AsyncTimeout.class;
        boolean bool1 = false;
        boolean bool2 = false;
        synchronized (false) {
          boolean bool = false;
          asyncTimeout1 = AsyncTimeout.Companion.awaitTimeout$okio();
          if (asyncTimeout1 == AsyncTimeout.access$getHead$cp()) {
            AsyncTimeout.access$setHead$cp(null);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Class<ObjectType{me/rerere/matrix/thirdparty/okio/AsyncTimeout}>}, name=null} */
            return;
          } 
          Unit unit = Unit.INSTANCE;
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Class<ObjectType{me/rerere/matrix/thirdparty/okio/AsyncTimeout}>}, name=null} */
        } 
        AsyncTimeout asyncTimeout2 = asyncTimeout1;
        try {
          if (asyncTimeout2 == null)
            continue; 
        } catch (InterruptedException interruptedException) {
          throw a(null);
        } 
        asyncTimeout2.timedOut();
      } catch (InterruptedException interruptedException) {}
    } 
  }
  
  private static InterruptedException a(InterruptedException paramInterruptedException) {
    return paramInterruptedException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\AsyncTimeout$Watchdog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
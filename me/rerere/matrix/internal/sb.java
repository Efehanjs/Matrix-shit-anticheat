package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import me.rerere.matrix.thirdparty.kotlin.collections.ArrayDeque;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class sb implements Iterable, KMappedMarker {
  private final int b;
  
  @NotNull
  private final ArrayDeque i;
  
  private static boolean a;
  
  private static final long c = o3.a(-678890092701457599L, -5761605895008752169L, MethodHandles.lookup().lookupClass()).a(39090352401762L);
  
  public final void p(long paramLong, Object paramObject) {
    paramLong = c ^ paramLong;
    int i = yl.a();
    try {
      this.i.add(paramObject);
      if (i == 0)
        try {
          if (this.i.size() > this.b) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final boolean b(Object paramObject) {
    return CollectionsKt.contains(this, paramObject);
  }
  
  @Nullable
  public final Object b(long paramLong, int paramInt) {
    paramLong = c ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0) {
        try {
          if (this.i.size() <= paramInt) {
          
          } else {
          
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return this.i.get(this.i.size() - 1 - paramInt);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final void j(int paramInt, char paramChar, short paramShort, Object paramObject) {
    long l = (paramInt << 32L | paramChar << 48L >>> 32L | paramShort << 48L >>> 48L) ^ c;
    int i = yl.a();
    try {
      this.i.add(paramObject);
      if (i == 0)
        try {
          if (this.i.size() > this.b) {
          
          } else {
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final void b() {
    this.i.clear();
  }
  
  @NotNull
  public Iterator iterator() {
    return this.i.iterator();
  }
  
  public final boolean p(long paramLong) {
    paramLong = c ^ paramLong;
    int i = yl.r();
    try {
      if (i != 0)
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.i.size() == this.b);
  }
  
  public final boolean j(short paramShort1, short paramShort2, int paramInt) {
    long l = (paramShort1 << 48L | paramShort2 << 48L >>> 16L | paramInt << 32L >>> 32L) ^ c;
    int i = yl.a();
    try {
      if (i == 0)
        if (!((Collection)this.i).isEmpty()) {
        
        } else {
          return false;
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public final Object b() {
    return this.i.last();
  }
  
  public final boolean b() {
    return this.i.isEmpty();
  }
  
  public final void b(Object paramObject) {
    this.i.remove(paramObject);
  }
  
  public final int b() {
    return this.i.size();
  }
  
  public sb(int paramInt) {
    this.b = paramInt;
    this.i = new ArrayDeque();
  }
  
  public static void T(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  public static boolean h() {
    return a;
  }
  
  public static boolean o() {
    boolean bool = h();
    try {
      if (!bool)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    if (o())
      T(true); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
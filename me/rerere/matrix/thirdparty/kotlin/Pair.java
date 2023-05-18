package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Pair implements Serializable {
  private final Object first;
  
  private final Object second;
  
  private static final long a = o3.a(2682649763922024412L, -3307480279390780575L, null).a(98491583600460L);
  
  public int hashCode() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    null = (this.first == null) ? 0 : this.first.hashCode();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null * 31 + ((this.second == null) ? 0 : this.second.hashCode());
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Pair))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Pair pair = (Pair)paramObject;
    try {
      if (!Intrinsics.areEqual(this.first, pair.first))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.second, pair.second))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  @NotNull
  public final Pair copy(Object paramObject1, Object paramObject2) {
    return new Pair(paramObject1, paramObject2);
  }
  
  public final Object component1() {
    return this.first;
  }
  
  public final Object getFirst() {
    return this.first;
  }
  
  public final Object component2() {
    return this.second;
  }
  
  public Pair(Object paramObject1, Object paramObject2) {
    this.first = paramObject1;
    this.second = paramObject2;
  }
  
  public final Object getSecond() {
    return this.second;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x1579155A4796L;
    return '(' + this.first + ", " + this.second + ')';
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\Pair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
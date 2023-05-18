package me.rerere.matrix.thirdparty.kotlin;

import java.io.Serializable;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Triple implements Serializable {
  private final Object second;
  
  private final Object third;
  
  private final Object first;
  
  private static final long a = o3.a(1451221535441294257L, -2043529860469730480L, null).a(42287085179965L);
  
  public final Object getFirst() {
    return this.first;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Triple))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Triple triple = (Triple)paramObject;
    try {
      if (!Intrinsics.areEqual(this.first, triple.first))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.second, triple.second))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.third, triple.third))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public final Object getSecond() {
    return this.second;
  }
  
  public final Object component2() {
    return this.second;
  }
  
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
    null = null * 31 + ((this.second == null) ? 0 : this.second.hashCode());
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null * 31 + ((this.third == null) ? 0 : this.third.hashCode());
  }
  
  public final Object component3() {
    return this.third;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x2CC72222EC77L;
    return '(' + this.first + ", " + this.second + ", " + this.third + ')';
  }
  
  public final Object component1() {
    return this.first;
  }
  
  public final Object getThird() {
    return this.third;
  }
  
  public Triple(Object paramObject1, Object paramObject2, Object paramObject3) {
    this.first = paramObject1;
    this.second = paramObject2;
    this.third = paramObject3;
  }
  
  @NotNull
  public final Triple copy(Object paramObject1, Object paramObject2, Object paramObject3) {
    return new Triple(paramObject1, paramObject2, paramObject3);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\Triple.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
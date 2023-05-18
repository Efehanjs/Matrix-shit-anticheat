package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class IndexedValue {
  private final Object value;
  
  private final int index;
  
  private static final long a = o3.a(-9036021260586426361L, 1957590029128031354L, null).a(66867538750778L);
  
  @NotNull
  public String toString() {
    long l = a ^ 0x2E62C162EEB8L;
    return "IndexedValue(index=" + this.index + ", value=" + this.value + ')';
  }
  
  public final Object getValue() {
    return this.value;
  }
  
  public final int getIndex() {
    return this.index;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof IndexedValue))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    IndexedValue indexedValue = (IndexedValue)paramObject;
    try {
      if (this.index != indexedValue.index)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!Intrinsics.areEqual(this.value, indexedValue.value))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public final Object component2() {
    return this.value;
  }
  
  public IndexedValue(int paramInt, Object paramObject) {
    this.index = paramInt;
    this.value = paramObject;
  }
  
  @NotNull
  public final IndexedValue copy(int paramInt, Object paramObject) {
    return new IndexedValue(paramInt, paramObject);
  }
  
  public final int component1() {
    return this.index;
  }
  
  public int hashCode() {
    null = this.index;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null * 31 + ((this.value == null) ? 0 : this.value.hashCode());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\IndexedValue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
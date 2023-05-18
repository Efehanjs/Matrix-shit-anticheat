package me.rerere.matrix.internal;

import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.Set;
import me.rerere.matrix.thirdparty.kotlin.collections.SetsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class tb {
  @NotNull
  public static final tb i;
  
  private static int a;
  
  private static final long b = o3.a(-5402585906612035046L, 759784421236652019L, MethodHandles.lookup().lookupClass()).a(280707216035977L);
  
  @NotNull
  public static final LinkedHashSet b(Object paramObject) {
    LinkedHashSet<Object> linkedHashSet = Sets.newLinkedHashSet();
    linkedHashSet.add(paramObject);
    return linkedHashSet;
  }
  
  @NotNull
  public static final Set b(@NotNull Collection<Enum> paramCollection, long paramLong) {
    paramLong = b ^ paramLong;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramCollection.isEmpty() ? SetsKt.emptySet() : EnumSet.<Enum>copyOf(paramCollection);
  }
  
  static {
    i = new tb();
    N(44);
  }
  
  public static void N(int paramInt) {
    a = paramInt;
  }
  
  public static int z() {
    return a;
  }
  
  public static int w() {
    int i = z();
    try {
      if (i == 0)
        return 40; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\tb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
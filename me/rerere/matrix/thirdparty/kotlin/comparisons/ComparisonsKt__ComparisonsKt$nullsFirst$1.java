package me.rerere.matrix.thirdparty.kotlin.comparisons;

import java.util.Comparator;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ComparisonsKt__ComparisonsKt$nullsFirst$1 implements Comparator {
  public final int compare(@Nullable Object paramObject1, @Nullable Object paramObject2) {
    try {
      try {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramObject1 == paramObject2) ? 0 : ((paramObject1 == null) ? -1 : ((paramObject2 == null) ? 1 : this.$comparator.compare(paramObject1, paramObject2)));
  }
  
  public ComparisonsKt__ComparisonsKt$nullsFirst$1(Comparator paramComparator) {}
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\comparisons\ComparisonsKt__ComparisonsKt$nullsFirst$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
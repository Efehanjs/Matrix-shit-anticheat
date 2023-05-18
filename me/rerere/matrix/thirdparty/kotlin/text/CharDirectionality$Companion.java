package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CharDirectionality$Companion {
  private static final long a = o3.a(-7621726641804932831L, -2519103797694156170L, null).a(275668255871639L);
  
  @NotNull
  public final CharDirectionality valueOf(int paramInt) {
    long l = a ^ 0x4A0C994E13AFL;
    try {
      if ((CharDirectionality)getDirectionalityMap().get(Integer.valueOf(paramInt)) == null) {
        (CharDirectionality)getDirectionalityMap().get(Integer.valueOf(paramInt));
        throw new IllegalArgumentException("Directionality #" + paramInt + " is not defined.");
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (CharDirectionality)getDirectionalityMap().get(Integer.valueOf(paramInt));
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\CharDirectionality$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
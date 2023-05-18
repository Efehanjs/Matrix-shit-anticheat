package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.ranges.IntRange;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CharCategory$Companion {
  private static final long a = o3.a(5709776975356690150L, -8718920728496307710L, null).a(74021685772599L);
  
  @NotNull
  public final CharCategory valueOf(int paramInt) {
    long l = a ^ 0x5E11A4E56880L;
    int i = paramInt;
    try {
      if ((new IntRange(18, 30)).contains(i)) {
      
      } else {
        throw new IllegalArgumentException("Category #" + paramInt + " is not defined.");
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (new IntRange(0, 16)).contains(i) ? CharCategory.values()[paramInt] : (CharCategory)"JD-Core does not support Kotlin";
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\CharCategory$Companion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CharDirectionality$Companion$directionalityMap$2 extends Lambda implements Function0 {
  public static final CharDirectionality$Companion$directionalityMap$2 INSTANCE = new CharDirectionality$Companion$directionalityMap$2();
  
  public CharDirectionality$Companion$directionalityMap$2() {
    super(0);
  }
  
  @NotNull
  public final Map invoke() {
    CharDirectionality[] arrayOfCharDirectionality1 = CharDirectionality.values();
    boolean bool1 = false;
    int i = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfCharDirectionality1.length), 16);
    CharDirectionality[] arrayOfCharDirectionality2 = arrayOfCharDirectionality1;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>(i);
    boolean bool2 = false;
    byte b = 0;
    int j = arrayOfCharDirectionality2.length;
    while (b < j) {
      CharDirectionality charDirectionality1 = arrayOfCharDirectionality2[b];
      CharDirectionality charDirectionality2 = charDirectionality1;
      LinkedHashMap<Object, Object> linkedHashMap1 = linkedHashMap;
      boolean bool = false;
      linkedHashMap1.put(Integer.valueOf(charDirectionality2.getValue()), charDirectionality1);
      b++;
    } 
    return linkedHashMap;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\CharDirectionality$Companion$directionalityMap$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
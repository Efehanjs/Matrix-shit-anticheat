package me.rerere.matrix.thirdparty.kotlin.text;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.kotlin.LazyKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public enum CharDirectionality {
  SEGMENT_SEPARATOR,
  BOUNDARY_NEUTRAL,
  ARABIC_NUMBER,
  UNDEFINED(-1),
  NONSPACING_MARK(-1),
  RIGHT_TO_LEFT_EMBEDDING(-1),
  EUROPEAN_NUMBER(-1),
  RIGHT_TO_LEFT_ARABIC(-1),
  POP_DIRECTIONAL_FORMAT(-1),
  LEFT_TO_RIGHT_EMBEDDING(-1),
  COMMON_NUMBER_SEPARATOR(-1),
  OTHER_NEUTRALS(-1),
  PARAGRAPH_SEPARATOR(-1),
  EUROPEAN_NUMBER_SEPARATOR(-1),
  RIGHT_TO_LEFT(-1),
  LEFT_TO_RIGHT_OVERRIDE(-1),
  RIGHT_TO_LEFT_OVERRIDE(-1),
  EUROPEAN_NUMBER_TERMINATOR(-1),
  LEFT_TO_RIGHT(0),
  WHITESPACE(0);
  
  @NotNull
  private static final Lazy directionalityMap$delegate;
  
  private final int value;
  
  @NotNull
  public static final CharDirectionality$Companion Companion;
  
  static {
    RIGHT_TO_LEFT = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);
    RIGHT_TO_LEFT_ARABIC = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
    EUROPEAN_NUMBER = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);
    EUROPEAN_NUMBER_SEPARATOR = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    EUROPEAN_NUMBER_TERMINATOR = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    ARABIC_NUMBER = new CharDirectionality("ARABIC_NUMBER", 7, 6);
    COMMON_NUMBER_SEPARATOR = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
    NONSPACING_MARK = new CharDirectionality("NONSPACING_MARK", 9, 8);
    BOUNDARY_NEUTRAL = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
    PARAGRAPH_SEPARATOR = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
    SEGMENT_SEPARATOR = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
    WHITESPACE = new CharDirectionality("WHITESPACE", 13, 12);
    OTHER_NEUTRALS = new CharDirectionality("OTHER_NEUTRALS", 14, 13);
    LEFT_TO_RIGHT_EMBEDDING = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    LEFT_TO_RIGHT_OVERRIDE = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    RIGHT_TO_LEFT_EMBEDDING = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    RIGHT_TO_LEFT_OVERRIDE = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    POP_DIRECTIONAL_FORMAT = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);
    $VALUES = $values();
    Companion = new CharDirectionality$Companion(null);
    directionalityMap$delegate = LazyKt.lazy(CharDirectionality$Companion$directionalityMap$2.INSTANCE);
  }
  
  public final int getValue() {
    return this.value;
  }
  
  CharDirectionality(int paramInt1) {
    this.value = paramInt1;
  }
  
  static {
    long l = o3.a(5049674139233091795L, 3366610015984525533L, null).a(800936576750L) ^ 0x51B943DFC338L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\CharDirectionality.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
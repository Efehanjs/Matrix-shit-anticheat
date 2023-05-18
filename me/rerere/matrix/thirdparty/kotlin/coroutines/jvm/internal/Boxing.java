package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Boxing {
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Character boxChar(char paramChar) {
    return new Character(paramChar);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Integer boxInt(int paramInt) {
    return new Integer(paramInt);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Byte boxByte(byte paramByte) {
    return Byte.valueOf(paramByte);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Float boxFloat(float paramFloat) {
    return new Float(paramFloat);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Short boxShort(short paramShort) {
    return new Short(paramShort);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Long boxLong(long paramLong) {
    return new Long(paramLong);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Double boxDouble(double paramDouble) {
    return new Double(paramDouble);
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final Boolean boxBoolean(boolean paramBoolean) {
    return Boolean.valueOf(paramBoolean);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\Boxing.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
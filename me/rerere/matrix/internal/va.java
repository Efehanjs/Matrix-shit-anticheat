package me.rerere.matrix.internal;

import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.util.Vector;

public final class va {
  @NotNull
  public static final Vector j(@NotNull Vector paramVector1, @NotNull Vector paramVector2) {
    return paramVector1.clone().subtract(paramVector2);
  }
  
  public static final double p(@NotNull Vector paramVector) {
    return paramVector.getZ();
  }
  
  public static final double j(@NotNull Vector paramVector) {
    return paramVector.getY();
  }
  
  @NotNull
  public static final Vector b(@NotNull Vector paramVector1, @NotNull Vector paramVector2) {
    return paramVector1.clone().add(paramVector2);
  }
  
  @NotNull
  public static final Vector b(@NotNull Vector paramVector, int paramInt) {
    return paramVector.clone().multiply(paramInt);
  }
  
  public static final double b(@NotNull Vector paramVector) {
    return paramVector.getX();
  }
  
  @NotNull
  public static final Vector b(@NotNull Vector paramVector, double paramDouble) {
    return paramVector.clone().multiply(paramDouble);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\va.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
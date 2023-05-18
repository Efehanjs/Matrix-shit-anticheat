package me.rerere.matrix.api;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class MatrixAPIProvider {
  @Nullable
  private static MatrixAPI apiInstance;
  
  private static final long a = o3.a(1951697442113692029L, -1621026546728359061L, MethodHandles.lookup().lookupClass()).a(132187302617892L);
  
  static {
    apiInstance = null;
  }
  
  public static void register(MatrixAPI paramMatrixAPI) {
    apiInstance = paramMatrixAPI;
  }
  
  @NotNull
  public static MatrixAPI getAPI() {
    long l = a ^ 0x16797F610060L;
    try {
      if (apiInstance == null)
        throw new IllegalStateException("ERROR#132PA"); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return apiInstance;
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\api\MatrixAPIProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.kotlin.math;

import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Constants {
  @JvmField
  public static final double upper_taylor_n_bound;
  
  @JvmField
  public static final double taylor_2_bound;
  
  @JvmField
  public static final double upper_taylor_2_bound;
  
  @JvmField
  public static final double epsilon;
  
  @NotNull
  public static final Constants INSTANCE = new Constants();
  
  @JvmField
  public static final double taylor_n_bound;
  
  @JvmField
  public static final double LN2 = Math.log(2.0D);
  
  static {
    epsilon = Math.ulp(1.0D);
    taylor_2_bound = Math.sqrt(epsilon);
    taylor_n_bound = Math.sqrt(taylor_2_bound);
    upper_taylor_2_bound = true / taylor_2_bound;
    upper_taylor_n_bound = true / taylor_n_bound;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\math\Constants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
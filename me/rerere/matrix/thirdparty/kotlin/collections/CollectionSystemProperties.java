package me.rerere.matrix.thirdparty.kotlin.collections;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class CollectionSystemProperties {
  @JvmField
  public static final boolean brittleContainsOptimizationEnabled;
  
  @NotNull
  public static final CollectionSystemProperties INSTANCE = new CollectionSystemProperties();
  
  static {
    System.getProperty("me.rerere.matrix.thirdparty.kotlin.collections.convert_arg_to_set_in_removeAll");
    brittleContainsOptimizationEnabled = (System.getProperty("me.rerere.matrix.thirdparty.kotlin.collections.convert_arg_to_set_in_removeAll") != null) ? Boolean.parseBoolean(System.getProperty("me.rerere.matrix.thirdparty.kotlin.collections.convert_arg_to_set_in_removeAll")) : false;
  }
  
  static {
    long l = o3.a(6776113441212951047L, -7238773134559801437L, null).a(157434585149513L) ^ 0xC33D12855F2L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\CollectionSystemProperties.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum DumperOptions$FlowStyle {
  FLOW, AUTO, BLOCK;
  
  private final Boolean styleBoolean;
  
  private static final long a = o3.a(-3662623382351579484L, -6157073095366804350L, MethodHandles.lookup().lookupClass()).a(264806367335339L);
  
  @Deprecated
  public Boolean getStyleBoolean() {
    return this.styleBoolean;
  }
  
  static {
    long l = a ^ 0x3BB4D9495C32L;
    FLOW = new DumperOptions$FlowStyle("FLOW", 0, Boolean.TRUE);
    BLOCK = new DumperOptions$FlowStyle("BLOCK", 1, Boolean.FALSE);
    AUTO = new DumperOptions$FlowStyle("AUTO", 2, null);
    $VALUES = new DumperOptions$FlowStyle[] { FLOW, BLOCK, AUTO };
  }
  
  @Deprecated
  public static DumperOptions$FlowStyle fromBoolean(Boolean paramBoolean) {
    try {
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramBoolean == null) ? AUTO : (paramBoolean.booleanValue() ? FLOW : BLOCK);
  }
  
  DumperOptions$FlowStyle(Boolean paramBoolean) {
    this.styleBoolean = paramBoolean;
  }
  
  public String toString() {
    long l = a ^ 0x22D6BC65744L;
    return "Flow style: '" + this.styleBoolean + "'";
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\DumperOptions$FlowStyle.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
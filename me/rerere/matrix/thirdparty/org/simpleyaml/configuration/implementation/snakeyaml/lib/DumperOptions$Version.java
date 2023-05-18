package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum DumperOptions$Version {
  V1_0, V1_1;
  
  private final Integer[] version;
  
  private static final long a = o3.a(-105548022627526022L, -209995496416965099L, MethodHandles.lookup().lookupClass()).a(181728213297828L);
  
  public String getRepresentation() {
    return this.version[0] + "." + this.version[1];
  }
  
  static {
    long l = a ^ 0x56A0EC681DE1L;
    V1_0 = new DumperOptions$Version("V1_0", 0, new Integer[] { Integer.valueOf(1), Integer.valueOf(0) });
    V1_1 = new DumperOptions$Version("V1_1", 1, new Integer[] { Integer.valueOf(1), Integer.valueOf(1) });
    $VALUES = new DumperOptions$Version[] { V1_0, V1_1 };
  }
  
  public int major() {
    return this.version[0].intValue();
  }
  
  public String toString() {
    long l = a ^ 0x228BCD75869CL;
    return "Version: " + getRepresentation();
  }
  
  DumperOptions$Version(Integer[] paramArrayOfInteger) {
    this.version = paramArrayOfInteger;
  }
  
  public int minor() {
    return this.version[1].intValue();
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\DumperOptions$Version.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
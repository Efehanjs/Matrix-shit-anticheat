package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum DumperOptions$LineBreak {
  MAC, WIN, UNIX;
  
  private final String lineBreak;
  
  private static final long a = o3.a(-7800908135167386852L, 7937294962438005173L, MethodHandles.lookup().lookupClass()).a(189046218864655L);
  
  static {
    long l = a ^ 0x29830545FCD2L;
    WIN = new DumperOptions$LineBreak("WIN", 0, "\r\n");
    MAC = new DumperOptions$LineBreak("MAC", 1, "\r");
    UNIX = new DumperOptions$LineBreak("UNIX", 2, "\n");
    $VALUES = new DumperOptions$LineBreak[] { WIN, MAC, UNIX };
  }
  
  public String toString() {
    long l = a ^ 0x239FCE6C04F0L;
    return "Line break: " + name();
  }
  
  public String getString() {
    return this.lineBreak;
  }
  
  DumperOptions$LineBreak(String paramString1) {
    this.lineBreak = paramString1;
  }
  
  public static DumperOptions$LineBreak getPlatformLineBreak() {
    long l = a ^ 0x5E9F69FA439AL;
    String str = System.getProperty("line.separator");
    for (DumperOptions$LineBreak dumperOptions$LineBreak : values()) {
      try {
        if (dumperOptions$LineBreak.lineBreak.equals(str))
          return dumperOptions$LineBreak; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return UNIX;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\DumperOptions$LineBreak.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
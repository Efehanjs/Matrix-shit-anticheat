package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.parser;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;

public class VersionTagsTuple {
  private final DumperOptions.Version version;
  
  private final Map tags;
  
  private static final long a = o3.a(-8453616316909734802L, 4154939009525193148L, MethodHandles.lookup().lookupClass()).a(97229969104479L);
  
  public Map getTags() {
    return this.tags;
  }
  
  public VersionTagsTuple(DumperOptions.Version paramVersion, Map paramMap) {
    this.version = paramVersion;
    this.tags = paramMap;
  }
  
  public DumperOptions.Version getVersion() {
    return this.version;
  }
  
  public String toString() {
    long l = a ^ 0x4099D4DC2AD9L;
    return String.format("VersionTagsTuple<%s, %s>", new Object[] { this.version, this.tags });
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\parser\VersionTagsTuple.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
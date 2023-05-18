package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public final class TagTuple {
  private final String handle;
  
  private final String suffix;
  
  private static final long a = o3.a(-278248161620459700L, -8066467690050904726L, MethodHandles.lookup().lookupClass()).a(5662133780617L);
  
  public String getHandle() {
    return this.handle;
  }
  
  public String getSuffix() {
    return this.suffix;
  }
  
  public TagTuple(String paramString1, String paramString2) {
    if (paramString2 == null)
      throw new NullPointerException("Suffix must be provided."); 
    this.handle = paramString1;
    this.suffix = paramString2;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\TagTuple.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.resolver;

import java.lang.invoke.MethodHandles;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.nodes.Tag;

public final class ResolverTuple {
  private final int limit;
  
  private final Tag tag;
  
  private final Pattern regexp;
  
  private static final long a = o3.a(-6587831714257742776L, -4595544588537451016L, MethodHandles.lookup().lookupClass()).a(199154715073173L);
  
  public Tag getTag() {
    return this.tag;
  }
  
  public String toString() {
    long l = a ^ 0x5640544E819AL;
    return "Tuple tag=" + this.tag + " regexp=" + this.regexp + " limit=" + this.limit;
  }
  
  public int getLimit() {
    return this.limit;
  }
  
  public ResolverTuple(Tag paramTag, Pattern paramPattern, int paramInt) {
    this.tag = paramTag;
    this.regexp = paramPattern;
    this.limit = paramInt;
  }
  
  public Pattern getRegexp() {
    return this.regexp;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\resolver\ResolverTuple.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
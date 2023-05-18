package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.tokens;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class ScalarToken extends Token {
  private final DumperOptions.ScalarStyle style;
  
  private final String value;
  
  private final boolean plain;
  
  private static final long a = o3.a(-5613279899267423372L, -3154673703024671975L, MethodHandles.lookup().lookupClass()).a(207473348151350L);
  
  public boolean getPlain() {
    return this.plain;
  }
  
  public Token$ID getTokenId() {
    return Token$ID.Scalar;
  }
  
  public DumperOptions.ScalarStyle getStyle() {
    return this.style;
  }
  
  public ScalarToken(String paramString, Mark paramMark1, Mark paramMark2, boolean paramBoolean) {
    this(paramString, paramBoolean, paramMark1, paramMark2, DumperOptions.ScalarStyle.PLAIN);
  }
  
  public ScalarToken(String paramString, boolean paramBoolean, Mark paramMark1, Mark paramMark2, DumperOptions.ScalarStyle paramScalarStyle) {
    super(paramMark1, paramMark2);
    this.value = paramString;
    this.plain = paramBoolean;
    if (paramScalarStyle == null)
      throw new NullPointerException("Style must be provided."); 
    this.style = paramScalarStyle;
  }
  
  public String getValue() {
    return this.value;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\tokens\ScalarToken.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
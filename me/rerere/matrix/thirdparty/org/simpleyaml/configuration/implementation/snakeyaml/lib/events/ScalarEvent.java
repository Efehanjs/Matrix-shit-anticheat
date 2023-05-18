package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.events;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.DumperOptions;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.Mark;

public final class ScalarEvent extends NodeEvent {
  private final String tag;
  
  private final ImplicitTuple implicit;
  
  private final DumperOptions.ScalarStyle style;
  
  private final String value;
  
  private static final long a = o3.a(-248680130696260482L, -2615747513851927470L, MethodHandles.lookup().lookupClass()).a(233614736266396L);
  
  @Deprecated
  public ScalarEvent(String paramString1, String paramString2, ImplicitTuple paramImplicitTuple, String paramString3, Mark paramMark1, Mark paramMark2, Character paramCharacter) {
    this(paramString1, paramString2, paramImplicitTuple, paramString3, paramMark1, paramMark2, DumperOptions.ScalarStyle.createStyle(paramCharacter));
  }
  
  @Deprecated
  public Character getStyle() {
    return this.style.getChar();
  }
  
  public Event$ID getEventId() {
    return Event$ID.Scalar;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public ImplicitTuple getImplicit() {
    return this.implicit;
  }
  
  public String getTag() {
    return this.tag;
  }
  
  public ScalarEvent(String paramString1, String paramString2, ImplicitTuple paramImplicitTuple, String paramString3, Mark paramMark1, Mark paramMark2, DumperOptions.ScalarStyle paramScalarStyle) {
    super(paramString1, paramMark1, paramMark2);
    this.tag = paramString2;
    this.implicit = paramImplicitTuple;
    if (paramString3 == null)
      throw new NullPointerException("Value must be provided."); 
    try {
      this.value = paramString3;
      if (paramScalarStyle == null)
        throw new NullPointerException("Style must be provided."); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.style = paramScalarStyle;
  }
  
  public boolean isPlain() {
    try {
    
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return (this.style == DumperOptions.ScalarStyle.PLAIN);
  }
  
  public DumperOptions.ScalarStyle getScalarStyle() {
    return this.style;
  }
  
  public String getArguments() {
    long l = a ^ 0x10B5693A4A43L;
    return super.getArguments() + ", tag=" + this.tag + ", " + this.implicit + ", value=" + this.value;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\events\ScalarEvent.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
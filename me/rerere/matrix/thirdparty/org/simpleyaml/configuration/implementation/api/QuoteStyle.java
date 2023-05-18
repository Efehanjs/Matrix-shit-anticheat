package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.api;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;

public enum QuoteStyle {
  LITERAL, SINGLE, FOLDED, PLAIN, DOUBLE;
  
  static {
    PLAIN = new QuoteStyle("PLAIN", 2);
    LITERAL = new QuoteStyle("LITERAL", 3);
    FOLDED = new QuoteStyle("FOLDED", 4);
    $VALUES = new QuoteStyle[] { SINGLE, DOUBLE, PLAIN, LITERAL, FOLDED };
  }
  
  static {
    long l = o3.a(-1799056632813370852L, -2547987903468315193L, MethodHandles.lookup().lookupClass()).a(273950529704396L) ^ 0x5C41035C2C10L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\api\QuoteStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
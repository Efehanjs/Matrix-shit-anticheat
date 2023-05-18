package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.reader;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;

public class ReaderException extends YAMLException {
  private final int position;
  
  private final String name;
  
  private static final long serialVersionUID = 8710781187529689083L;
  
  private final int codePoint;
  
  private static final long a = o3.a(4660308245676665433L, -4930775493347506337L, MethodHandles.lookup().lookupClass()).a(104767250873484L);
  
  public String toString() {
    long l = a ^ 0x6DC8D5F7C3E0L;
    String str = new String(Character.toChars(this.codePoint));
    return "unacceptable code point '" + str + "' (0x" + Integer.toHexString(this.codePoint).toUpperCase() + ") " + getMessage() + "\nin \"" + this.name + "\", position " + this.position;
  }
  
  public String getName() {
    return this.name;
  }
  
  public ReaderException(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    super(paramString2);
    this.name = paramString1;
    this.codePoint = paramInt2;
    this.position = paramInt1;
  }
  
  public int getPosition() {
    return this.position;
  }
  
  public int getCodePoint() {
    return this.codePoint;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\reader\ReaderException.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
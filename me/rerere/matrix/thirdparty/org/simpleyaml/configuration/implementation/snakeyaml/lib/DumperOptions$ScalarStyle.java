package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib;

import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;

public enum DumperOptions$ScalarStyle {
  FOLDED, SINGLE_QUOTED, PLAIN, DOUBLE_QUOTED, LITERAL;
  
  private final Character styleChar;
  
  private static final long a = o3.a(1303418305627628594L, -893640908670685057L, MethodHandles.lookup().lookupClass()).a(37484400062573L);
  
  public static DumperOptions$ScalarStyle createStyle(Character paramCharacter) {
    long l = a ^ 0x5216C812556FL;
    try {
      if (paramCharacter == null)
        return PLAIN; 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    try {
      switch (paramCharacter.charValue()) {
        case '"':
          return DOUBLE_QUOTED;
        case '\'':
          return SINGLE_QUOTED;
        case '|':
          return LITERAL;
        case '>':
          return FOLDED;
      } 
    } catch (YAMLException yAMLException) {
      throw a(null);
    } 
    throw new YAMLException("Unknown scalar style character: " + paramCharacter);
  }
  
  DumperOptions$ScalarStyle(Character paramCharacter) {
    this.styleChar = paramCharacter;
  }
  
  static {
    long l = a ^ 0x1FBA250E5777L;
    DOUBLE_QUOTED = new DumperOptions$ScalarStyle("DOUBLE_QUOTED", 0, Character.valueOf('"'));
    SINGLE_QUOTED = new DumperOptions$ScalarStyle("SINGLE_QUOTED", 1, Character.valueOf('\''));
    LITERAL = new DumperOptions$ScalarStyle("LITERAL", 2, Character.valueOf('|'));
    FOLDED = new DumperOptions$ScalarStyle("FOLDED", 3, Character.valueOf('>'));
    PLAIN = new DumperOptions$ScalarStyle("PLAIN", 4, null);
    $VALUES = new DumperOptions$ScalarStyle[] { DOUBLE_QUOTED, SINGLE_QUOTED, LITERAL, FOLDED, PLAIN };
  }
  
  public String toString() {
    long l = a ^ 0x59604FF0396EL;
    return "Scalar style: '" + this.styleChar + "'";
  }
  
  public Character getChar() {
    return this.styleChar;
  }
  
  private static YAMLException a(YAMLException paramYAMLException) {
    return paramYAMLException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\lib\DumperOptions$ScalarStyle.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
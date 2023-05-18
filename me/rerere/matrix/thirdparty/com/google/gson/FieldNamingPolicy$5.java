package me.rerere.matrix.thirdparty.com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

public enum FieldNamingPolicy$5 {
  public String translateName(Field paramField) {
    return separateCamelCase(paramField.getName(), "-").toLowerCase(Locale.ENGLISH);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\FieldNamingPolicy$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
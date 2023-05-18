package me.rerere.matrix.thirdparty.com.google.gson;

import java.lang.reflect.Field;

public enum FieldNamingPolicy$3 {
  public String translateName(Field paramField) {
    return upperCaseFirstLetter(separateCamelCase(paramField.getName(), " "));
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\FieldNamingPolicy$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
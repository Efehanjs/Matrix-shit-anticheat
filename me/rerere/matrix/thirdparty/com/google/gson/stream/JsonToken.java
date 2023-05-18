package me.rerere.matrix.thirdparty.com.google.gson.stream;

import me.rerere.matrix.internal.o3;

public enum JsonToken {
  BEGIN_OBJECT, NULL, BEGIN_ARRAY, NUMBER, NAME, END_OBJECT, END_ARRAY, STRING, END_DOCUMENT, BOOLEAN;
  
  static {
    BEGIN_OBJECT = new JsonToken("BEGIN_OBJECT", 2);
    END_OBJECT = new JsonToken("END_OBJECT", 3);
    NAME = new JsonToken("NAME", 4);
    STRING = new JsonToken("STRING", 5);
    NUMBER = new JsonToken("NUMBER", 6);
    BOOLEAN = new JsonToken("BOOLEAN", 7);
    NULL = new JsonToken("NULL", 8);
    END_DOCUMENT = new JsonToken("END_DOCUMENT", 9);
    $VALUES = new JsonToken[] { BEGIN_ARRAY, END_ARRAY, BEGIN_OBJECT, END_OBJECT, NAME, STRING, NUMBER, BOOLEAN, NULL, END_DOCUMENT };
  }
  
  static {
    long l = o3.a(117064929886028805L, -7694397089897575443L, null).a(125789750083386L) ^ 0x15EE1341776AL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\stream\JsonToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
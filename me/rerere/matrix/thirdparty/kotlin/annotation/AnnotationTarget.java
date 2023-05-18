package me.rerere.matrix.thirdparty.kotlin.annotation;

import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;

public enum AnnotationTarget {
  LOCAL_VARIABLE, TYPEALIAS, TYPE, PROPERTY_GETTER, PROPERTY_SETTER, FILE, FUNCTION, CONSTRUCTOR, EXPRESSION, FIELD, VALUE_PARAMETER, ANNOTATION_CLASS, CLASS, PROPERTY, TYPE_PARAMETER;
  
  static {
    ANNOTATION_CLASS = new AnnotationTarget("ANNOTATION_CLASS", 1);
    TYPE_PARAMETER = new AnnotationTarget("TYPE_PARAMETER", 2);
    PROPERTY = new AnnotationTarget("PROPERTY", 3);
    FIELD = new AnnotationTarget("FIELD", 4);
    LOCAL_VARIABLE = new AnnotationTarget("LOCAL_VARIABLE", 5);
    VALUE_PARAMETER = new AnnotationTarget("VALUE_PARAMETER", 6);
    CONSTRUCTOR = new AnnotationTarget("CONSTRUCTOR", 7);
    FUNCTION = new AnnotationTarget("FUNCTION", 8);
    PROPERTY_GETTER = new AnnotationTarget("PROPERTY_GETTER", 9);
    PROPERTY_SETTER = new AnnotationTarget("PROPERTY_SETTER", 10);
    TYPE = new AnnotationTarget("TYPE", 11);
    EXPRESSION = new AnnotationTarget("EXPRESSION", 12);
    FILE = new AnnotationTarget("FILE", 13);
    TYPEALIAS = new AnnotationTarget("TYPEALIAS", 14);
    $VALUES = $values();
  }
  
  static {
    long l = o3.a(-1867180007965399032L, -2977352685760395689L, null).a(63971325401213L) ^ 0x21456F9BAD62L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\annotation\AnnotationTarget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.misc.compatibility;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public interface WeakProtection extends Annotation {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\misc\compatibility\WeakProtection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
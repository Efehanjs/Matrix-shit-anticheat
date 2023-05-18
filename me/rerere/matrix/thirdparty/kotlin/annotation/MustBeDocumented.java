package me.rerere.matrix.thirdparty.kotlin.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
public @interface MustBeDocumented {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\annotation\MustBeDocumented.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
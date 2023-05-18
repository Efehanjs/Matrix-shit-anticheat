package me.rerere.matrix.thirdparty.kotlin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE})
public @interface Target {
  AnnotationTarget[] allowedTargets();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\annotation\Target.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
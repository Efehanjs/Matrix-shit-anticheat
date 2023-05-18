package me.rerere.matrix.thirdparty.kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.MustBeDocumented;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.TYPEALIAS})
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@SinceKotlin(version = "1.4")
public @interface DeprecatedSinceKotlin {
  String hiddenSince() default "";
  
  String errorSince() default "";
  
  String warningSince() default "";
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\DeprecatedSinceKotlin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
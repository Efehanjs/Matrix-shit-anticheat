package me.rerere.matrix.thirdparty.kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationRetention;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.MustBeDocumented;
import me.rerere.matrix.thirdparty.kotlin.annotation.Retention;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@SinceKotlin(version = "1.1")
public @interface PublishedApi {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\PublishedApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
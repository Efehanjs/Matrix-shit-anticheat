package me.rerere.matrix.thirdparty.kotlin.experimental;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.RequiresOptIn;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationRetention;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.MustBeDocumented;
import me.rerere.matrix.thirdparty.kotlin.annotation.Retention;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE})
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@SinceKotlin(version = "1.3")
public @interface ExperimentalTypeInference {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\experimental\ExperimentalTypeInference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
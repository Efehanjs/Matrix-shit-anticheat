package me.rerere.matrix.thirdparty.kotlin.time;

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
@Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.FIELD, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.TYPEALIAS})
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
@SinceKotlin(version = "1.3")
public @interface ExperimentalTime {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\time\ExperimentalTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
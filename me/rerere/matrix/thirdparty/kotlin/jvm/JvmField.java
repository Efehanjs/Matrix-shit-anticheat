package me.rerere.matrix.thirdparty.kotlin.jvm;

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

@Target(allowedTargets = {AnnotationTarget.FIELD})
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
public @interface JvmField {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\JvmField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
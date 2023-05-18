package me.rerere.matrix.thirdparty.kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationRetention;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.Retention;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
public @interface HidesMembers {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\internal\HidesMembers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
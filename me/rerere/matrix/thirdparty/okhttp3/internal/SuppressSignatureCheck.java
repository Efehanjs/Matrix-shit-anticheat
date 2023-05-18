package me.rerere.matrix.thirdparty.okhttp3.internal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationRetention;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.Retention;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@Retention(AnnotationRetention.BINARY)
@Documented
@Target(allowedTargets = {AnnotationTarget.CONSTRUCTOR, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface SuppressSignatureCheck {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\SuppressSignatureCheck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
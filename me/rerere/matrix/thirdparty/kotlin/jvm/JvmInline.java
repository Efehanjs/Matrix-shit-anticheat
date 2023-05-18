package me.rerere.matrix.thirdparty.kotlin.jvm;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationRetention;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.MustBeDocumented;
import me.rerere.matrix.thirdparty.kotlin.annotation.Retention;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.5")
public @interface JvmInline {}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\JvmInline.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
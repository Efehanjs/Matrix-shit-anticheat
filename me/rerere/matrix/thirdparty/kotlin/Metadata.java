package me.rerere.matrix.thirdparty.kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationRetention;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.Retention;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
public @interface Metadata {
  int[] bv() default {1, 0, 3};
  
  String xs() default "";
  
  int xi() default 0;
  
  int k() default 1;
  
  String pn() default "";
  
  String[] d1() default {};
  
  String[] d2() default {};
  
  int[] mv() default {};
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\Metadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
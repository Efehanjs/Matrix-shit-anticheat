package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.annotation.AnnotationTarget;
import me.rerere.matrix.thirdparty.kotlin.annotation.Target;

@Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@SinceKotlin(version = "1.3")
public @interface DebugMetadata {
  String[] n() default {};
  
  String f() default "";
  
  int[] l() default {};
  
  String m() default "";
  
  int[] i() default {};
  
  String[] s() default {};
  
  int v() default 1;
  
  String c() default "";
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\DebugMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.com.google.gson.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Expose {
  boolean deserialize() default true;
  
  boolean serialize() default true;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\annotations\Expose.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
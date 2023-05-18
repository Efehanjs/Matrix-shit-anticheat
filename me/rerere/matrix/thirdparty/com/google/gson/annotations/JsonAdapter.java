package me.rerere.matrix.thirdparty.com.google.gson.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface JsonAdapter {
  boolean nullSafe() default true;
  
  Class value();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\annotations\JsonAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
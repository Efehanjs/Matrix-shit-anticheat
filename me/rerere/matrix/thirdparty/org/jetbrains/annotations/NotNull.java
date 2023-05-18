package me.rerere.matrix.thirdparty.org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface NotNull {
  String value() default "";
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\jetbrains\annotations\NotNull.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
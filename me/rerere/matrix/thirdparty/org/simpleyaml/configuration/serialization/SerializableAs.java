package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface SerializableAs {
  String value();
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\serialization\SerializableAs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
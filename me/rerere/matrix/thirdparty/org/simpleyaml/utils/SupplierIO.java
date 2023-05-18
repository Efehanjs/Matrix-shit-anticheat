package me.rerere.matrix.thirdparty.org.simpleyaml.utils;

import java.io.Closeable;
import java.io.IOException;

@FunctionalInterface
public interface SupplierIO {
  Closeable get() throws IOException;
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyam\\utils\SupplierIO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.com.google.gson.stream;

import java.io.IOException;

public final class MalformedJsonException extends IOException {
  private static final long serialVersionUID = 1L;
  
  public MalformedJsonException(Throwable paramThrowable) {
    initCause(paramThrowable);
  }
  
  public MalformedJsonException(String paramString, Throwable paramThrowable) {
    super(paramString);
    initCause(paramThrowable);
  }
  
  public MalformedJsonException(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\stream\MalformedJsonException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
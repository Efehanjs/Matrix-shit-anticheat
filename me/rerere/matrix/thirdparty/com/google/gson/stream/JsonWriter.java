package me.rerere.matrix.thirdparty.com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import me.rerere.matrix.internal.o3;

public class JsonWriter implements Closeable, Flushable {
  private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
  
  private String indent;
  
  private String deferredName;
  
  private static final String[] REPLACEMENT_CHARS;
  
  private boolean lenient;
  
  private String separator;
  
  private int[] stack = new int[32];
  
  private boolean htmlSafe;
  
  private int stackSize = 0;
  
  private final Writer out;
  
  private boolean serializeNulls;
  
  private static final long b = o3.a(-599791815495233519L, 3831148746099456418L, null).a(278725121082269L);
  
  static {
    long l = b ^ 0x27716FBABFA4L;
    REPLACEMENT_CHARS = new String[128];
    byte b = 0;
    try {
      while (b <= 31) {
        REPLACEMENT_CHARS[b] = String.format("\\u%04x", new Object[] { Integer.valueOf(b) });
        b++;
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    REPLACEMENT_CHARS[34] = "\\\"";
    REPLACEMENT_CHARS[92] = "\\\\";
    REPLACEMENT_CHARS[9] = "\\t";
    REPLACEMENT_CHARS[8] = "\\b";
    REPLACEMENT_CHARS[10] = "\\n";
    REPLACEMENT_CHARS[13] = "\\r";
    REPLACEMENT_CHARS[12] = "\\f";
    HTML_SAFE_REPLACEMENT_CHARS = (String[])REPLACEMENT_CHARS.clone();
    HTML_SAFE_REPLACEMENT_CHARS[60] = "\\u003c";
    HTML_SAFE_REPLACEMENT_CHARS[62] = "\\u003e";
    HTML_SAFE_REPLACEMENT_CHARS[38] = "\\u0026";
    HTML_SAFE_REPLACEMENT_CHARS[61] = "\\u003d";
    HTML_SAFE_REPLACEMENT_CHARS[39] = "\\u0027";
  }
  
  public void flush() throws IOException {
    long l = b ^ 0x35375A12FD90L;
    try {
      if (this.stackSize == 0)
        throw new IllegalStateException("JsonWriter is closed."); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.out.flush();
  }
  
  public final void setSerializeNulls(boolean paramBoolean) {
    this.serializeNulls = paramBoolean;
  }
  
  public final boolean getSerializeNulls() {
    return this.serializeNulls;
  }
  
  public final void setHtmlSafe(boolean paramBoolean) {
    this.htmlSafe = paramBoolean;
  }
  
  public JsonWriter value(Number paramNumber) throws IOException {
    long l = b ^ 0x426602048AB6L;
    try {
      if (paramNumber == null)
        return nullValue(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    writeDeferredName();
    String str = paramNumber.toString();
    try {
      if (!this.lenient)
        try {
          if (!str.equals("-Infinity")) {
            try {
              if (!str.equals("Infinity")) {
                try {
                  if (str.equals("NaN"))
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber); 
                } catch (IOException iOException) {
                  throw a(null);
                } 
              } else {
                throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber);
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    beforeValue();
    this.out.append(str);
    return this;
  }
  
  public JsonWriter endArray() throws IOException {
    return close(1, 2, "]");
  }
  
  public final void setIndent(String paramString) {
    long l = b ^ 0x6C4A78F4C29EL;
    try {
      if (paramString.length() == 0) {
        this.indent = null;
        this.separator = ":";
      } else {
        this.indent = paramString;
        this.separator = ": ";
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public JsonWriter endObject() throws IOException {
    return close(3, 5, "}");
  }
  
  public JsonWriter nullValue() throws IOException {
    long l = b ^ 0x77F46C0F55EAL;
    try {
      if (this.deferredName != null)
        try {
          if (this.serializeNulls) {
            writeDeferredName();
          } else {
            this.deferredName = null;
            return this;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    beforeValue();
    this.out.write("null");
    return this;
  }
  
  public JsonWriter name(String paramString) throws IOException {
    long l = b ^ 0x1487E75C2E41L;
    try {
      if (paramString == null)
        throw new NullPointerException("name == null"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.deferredName != null)
        throw new IllegalStateException(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.stackSize == 0)
        throw new IllegalStateException("JsonWriter is closed."); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.deferredName = paramString;
    return this;
  }
  
  public JsonWriter value(long paramLong) throws IOException {
    writeDeferredName();
    beforeValue();
    this.out.write(Long.toString(paramLong));
    return this;
  }
  
  public JsonWriter value(Boolean paramBoolean) throws IOException {
    long l = b ^ 0x43C71894545BL;
    try {
      if (paramBoolean == null)
        return nullValue(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      writeDeferredName();
      beforeValue();
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.out.write(paramBoolean.booleanValue() ? "true" : "false");
    return this;
  }
  
  public JsonWriter value(boolean paramBoolean) throws IOException {
    long l = b ^ 0x970ACD41161L;
    try {
      writeDeferredName();
      beforeValue();
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.out.write(paramBoolean ? "true" : "false");
    return this;
  }
  
  public JsonWriter jsonValue(String paramString) throws IOException {
    try {
      if (paramString == null)
        return nullValue(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    writeDeferredName();
    beforeValue();
    this.out.append(paramString);
    return this;
  }
  
  public JsonWriter beginArray() throws IOException {
    writeDeferredName();
    return open(1, "[");
  }
  
  public boolean isLenient() {
    return this.lenient;
  }
  
  public JsonWriter value(double paramDouble) throws IOException {
    long l = b ^ 0x4422821E982DL;
    try {
      writeDeferredName();
      if (!this.lenient)
        try {
          if (!Double.isNaN(paramDouble)) {
            try {
              if (Double.isInfinite(paramDouble))
                throw new IllegalArgumentException("Numeric values must be finite, but was " + paramDouble); 
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + paramDouble);
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    beforeValue();
    this.out.append(Double.toString(paramDouble));
    return this;
  }
  
  public final boolean isHtmlSafe() {
    return this.htmlSafe;
  }
  
  public JsonWriter(Writer paramWriter) {
    push(6);
    this.separator = ":";
    this.serializeNulls = true;
    if (paramWriter == null)
      throw new NullPointerException("out == null"); 
    this.out = paramWriter;
  }
  
  public JsonWriter value(String paramString) throws IOException {
    try {
      if (paramString == null)
        return nullValue(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    writeDeferredName();
    beforeValue();
    string(paramString);
    return this;
  }
  
  public final void setLenient(boolean paramBoolean) {
    this.lenient = paramBoolean;
  }
  
  public JsonWriter beginObject() throws IOException {
    writeDeferredName();
    return open(3, "{");
  }
  
  public void close() throws IOException {
    long l = b ^ 0x56E6E8470C1DL;
    this.out.close();
    int i = this.stackSize;
    try {
      if (i <= 1) {
        try {
          if (i == 1)
            try {
              if (this.stack[i - 1] != 7)
                throw new IOException("Incomplete document"); 
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
      } else {
        throw new IOException("Incomplete document");
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.stackSize = 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\com\google\gson\stream\JsonWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
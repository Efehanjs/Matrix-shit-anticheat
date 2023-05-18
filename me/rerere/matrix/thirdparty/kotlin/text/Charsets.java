package me.rerere.matrix.thirdparty.kotlin.text;

import java.nio.charset.Charset;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Charsets {
  @JvmField
  @NotNull
  public static final Charset UTF_16LE;
  
  @JvmField
  @NotNull
  public static final Charset UTF_16BE;
  
  @JvmField
  @NotNull
  public static final Charset UTF_16;
  
  @Nullable
  private static Charset utf_32;
  
  @JvmField
  @NotNull
  public static final Charset ISO_8859_1;
  
  @NotNull
  public static final Charsets INSTANCE;
  
  @Nullable
  private static Charset utf_32le;
  
  @JvmField
  @NotNull
  public static final Charset UTF_8;
  
  @JvmField
  @NotNull
  public static final Charset US_ASCII;
  
  @Nullable
  private static Charset utf_32be;
  
  private static final long a = o3.a(6860636171851745790L, 5810500486927676591L, null).a(58536117771171L);
  
  static {
    long l = a ^ 0x5E40033502CL;
    INSTANCE = new Charsets();
    Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-8"), "forName(\"UTF-8\")");
    UTF_8 = Charset.forName("UTF-8");
    Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
    UTF_16 = Charset.forName("UTF-16");
    Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
    UTF_16BE = Charset.forName("UTF-16BE");
    Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
    UTF_16LE = Charset.forName("UTF-16LE");
    Intrinsics.checkNotNullExpressionValue(Charset.forName("US-ASCII"), "forName(\"US-ASCII\")");
    US_ASCII = Charset.forName("US-ASCII");
    Intrinsics.checkNotNullExpressionValue(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    ISO_8859_1 = Charset.forName("ISO-8859-1");
  }
  
  @NotNull
  public final Charset UTF32() {
    long l = a ^ 0x62EEEC8C5FC2L;
    if (utf_32 == null) {
      Charsets charsets1 = this;
      Charsets charsets2 = charsets1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-32"), "forName(\"UTF-32\")");
      Charset charset = Charset.forName("UTF-32");
      utf_32 = charset;
    } 
    return charset;
  }
  
  @NotNull
  public final Charset UTF32_BE() {
    long l = a ^ 0x56891CA70536L;
    if (utf_32be == null) {
      Charsets charsets1 = this;
      Charsets charsets2 = charsets1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-32BE"), "forName(\"UTF-32BE\")");
      Charset charset = Charset.forName("UTF-32BE");
      utf_32be = charset;
    } 
    return charset;
  }
  
  @NotNull
  public final Charset UTF32_LE() {
    long l = a ^ 0x7481F21DE23CL;
    if (utf_32le == null) {
      Charsets charsets1 = this;
      Charsets charsets2 = charsets1;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-32LE"), "forName(\"UTF-32LE\")");
      Charset charset = Charset.forName("UTF-32LE");
      utf_32le = charset;
    } 
    return charset;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\text\Charsets.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
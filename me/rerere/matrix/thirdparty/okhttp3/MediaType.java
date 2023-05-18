package me.rerere.matrix.thirdparty.okhttp3;

import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.internal.ProgressionUtilKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class MediaType {
  @NotNull
  private final String[] parameterNamesAndValues;
  
  @NotNull
  private final String mediaType;
  
  @NotNull
  private final String type;
  
  private static final Pattern PARAMETER;
  
  @NotNull
  private final String subtype;
  
  @NotNull
  private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
  
  @NotNull
  private static final String QUOTED = "\"([^\"]*)\"";
  
  @NotNull
  public static final MediaType$Companion Companion;
  
  private static final Pattern TYPE_SUBTYPE;
  
  private static final long a = o3.a(7831093261244260834L, 6675260400001339385L, MethodHandles.lookup().lookupClass()).a(33468662342429L);
  
  public int hashCode() {
    return this.mediaType.hashCode();
  }
  
  @NotNull
  public String toString() {
    return this.mediaType;
  }
  
  @JvmOverloads
  @Nullable
  public final Charset charset(@Nullable Charset paramCharset) {
    String str;
    Charset charset;
    long l = a ^ 0x6815D2CC142CL;
    try {
      if (parameter("charset") == null) {
        parameter("charset");
        return paramCharset;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      charset = Charset.forName(str);
    } catch (IllegalArgumentException illegalArgumentException) {
      charset = paramCharset;
    } 
    return charset;
  }
  
  @NotNull
  public final String type() {
    return this.type;
  }
  
  public boolean equals(@Nullable Object paramObject) {
    try {
      if (paramObject instanceof MediaType)
        try {
          if (Intrinsics.areEqual(((MediaType)paramObject).mediaType, this.mediaType));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "subtype", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_subtype() {
    return this.subtype;
  }
  
  @NotNull
  public final String subtype() {
    return this.subtype;
  }
  
  @JvmOverloads
  @Nullable
  public final Charset charset() {
    return charset$default(this, null, 1, null);
  }
  
  @Nullable
  public static final MediaType parse(@NotNull String paramString) {
    return Companion.parse(paramString);
  }
  
  @Deprecated(message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}), level = DeprecationLevel.ERROR)
  @NotNull
  public final String -deprecated_type() {
    return this.type;
  }
  
  static {
    long l = a ^ 0x55EDD483529DL;
    Companion = new MediaType$Companion(null);
    TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
  }
  
  @Nullable
  public final String parameter(@NotNull String paramString) {
    long l = a ^ 0x247FD8F231DFL;
    Intrinsics.checkNotNullParameter(paramString, "name");
    int i = this.parameterNamesAndValues.length + -1;
    byte b = 0;
    int j = ProgressionUtilKt.getProgressionLastElement(0, i, 2);
    if (b <= j) {
      byte b1;
      do {
        b1 = b;
        b += 2;
        if (StringsKt.equals(this.parameterNamesAndValues[b1], paramString, true))
          return this.parameterNamesAndValues[b1 + 1]; 
      } while (b1 != j);
    } 
    return null;
  }
  
  @NotNull
  public static final MediaType get(@NotNull String paramString) {
    return Companion.get(paramString);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\MediaType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
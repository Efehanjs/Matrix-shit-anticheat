package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.util;

import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.error.YAMLException;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.com.google.gdata.util.common.base.Escaper;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.implementation.snakeyaml.lib.external.com.google.gdata.util.common.base.PercentEscaper;

public abstract class UriEncoder {
  private static final String SAFE_CHARS = "-_.!~*'()@:$&,;=[]/";
  
  private static final CharsetDecoder UTF8Decoder;
  
  private static final Escaper escaper;
  
  private static final long a = o3.a(9010243491720715818L, -7565438390255915116L, MethodHandles.lookup().lookupClass()).a(24169559707038L);
  
  public static String encode(String paramString) {
    return escaper.escape(paramString);
  }
  
  public static String decode(ByteBuffer paramByteBuffer) throws CharacterCodingException {
    CharBuffer charBuffer = UTF8Decoder.decode(paramByteBuffer);
    return charBuffer.toString();
  }
  
  public static String decode(String paramString) {
    long l = a ^ 0x6FAC20A5B95BL;
    try {
      return URLDecoder.decode(paramString, "UTF-8");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new YAMLException(unsupportedEncodingException);
    } 
  }
  
  static {
    long l = a ^ 0x14F4A668F50CL;
    UTF8Decoder = StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT);
    escaper = (Escaper)new PercentEscaper("-_.!~*'()@:$&,;=[]/", false);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\implementation\snakeyaml\li\\util\UriEncoder.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
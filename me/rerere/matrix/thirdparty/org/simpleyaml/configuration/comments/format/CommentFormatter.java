package me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.format;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.CommentType;
import me.rerere.matrix.thirdparty.org.simpleyaml.configuration.comments.KeyTree;
import me.rerere.matrix.thirdparty.org.simpleyaml.utils.StringUtils;

public interface CommentFormatter {
  default String parse(String paramString, CommentType paramCommentType, KeyTree.Node paramNode) throws IOException {
    return parse(new StringReader(paramString), paramCommentType, paramNode);
  }
  
  default String parse(String paramString) throws IOException {
    return parse(paramString, CommentType.BLOCK);
  }
  
  default String parse(Reader paramReader) throws IOException {
    return parse(paramReader, CommentType.BLOCK);
  }
  
  default String parse(String paramString, CommentType paramCommentType) throws IOException {
    return parse(paramString, paramCommentType, (KeyTree.Node)null);
  }
  
  default String parse(Reader paramReader, CommentType paramCommentType) throws IOException {
    return parse(paramReader, paramCommentType, (KeyTree.Node)null);
  }
  
  static String format(int paramInt, String paramString1, String paramString2, String paramString3, CommentType paramCommentType, String paramString4, String paramString5) {
    try {
      if (paramString3 == null)
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Stream<String> stream = Arrays.stream(StringUtils.lines(paramString3, paramString3.trim().isEmpty()));
    String str1 = StringUtils.indentation(paramInt);
    String str2 = "\n" + str1;
    if (paramString4 == null) {
      str3 = str2;
    } else {
      str3 = String.join(str2, (CharSequence[])StringUtils.lines(paramString4, false)) + str2;
    } 
    if (paramString1 == null) {
      paramString1 = "";
    } else {
      paramString1 = String.join(str2, (CharSequence[])StringUtils.lines(paramString1, false));
    } 
    if (paramString2 == null) {
      paramString2 = paramString1;
    } else {
      paramString2 = String.join(str2, (CharSequence[])StringUtils.lines(paramString2, false));
    } 
    if (paramCommentType == CommentType.BLOCK)
      paramString1 = str1 + paramString1; 
    String str3 = str3 + paramString2;
    if (paramString5 == null) {
      paramString5 = "";
    } else {
      paramString5 = String.join(str2, (CharSequence[])StringUtils.lines(paramString5, false));
    } 
    return stream.collect(Collectors.joining(str3, paramString1, paramString5));
  }
  
  String dump(String paramString, CommentType paramCommentType, KeyTree.Node paramNode);
  
  static String format(int paramInt, String paramString, CommentType paramCommentType, CommentFormatterConfiguration paramCommentFormatterConfiguration) {
    return format(paramInt, paramCommentFormatterConfiguration.prefixFirst(), paramCommentFormatterConfiguration.prefixMultiline(), paramString, paramCommentType, paramCommentFormatterConfiguration.suffixMultiline(), paramCommentFormatterConfiguration.suffixLast());
  }
  
  default String dump(String paramString, CommentType paramCommentType) {
    return dump(paramString, paramCommentType, null);
  }
  
  static String format(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    return format(0, paramString1, paramString2, paramString3, CommentType.BLOCK, paramString4, paramString5);
  }
  
  String parse(Reader paramReader, CommentType paramCommentType, KeyTree.Node paramNode) throws IOException;
  
  default String dump(String paramString) {
    return dump(paramString, CommentType.BLOCK);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyaml\configuration\comments\format\CommentFormatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
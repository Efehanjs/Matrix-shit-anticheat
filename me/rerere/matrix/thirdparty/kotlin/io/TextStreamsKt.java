package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.sequences.Sequence;
import me.rerere.matrix.thirdparty.kotlin.sequences.SequencesKt;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class TextStreamsKt {
  private static final long a = o3.a(5983032402550916587L, -2941367707835194043L, null).a(203130298204657L);
  
  @NotNull
  public static final Sequence lineSequence(@NotNull BufferedReader paramBufferedReader) {
    long l = a ^ 0x4E2A1452899L;
    Intrinsics.checkNotNullParameter(paramBufferedReader, "<this>");
    return SequencesKt.constrainOnce(new LinesSequence(paramBufferedReader));
  }
  
  @NotNull
  public static final byte[] readBytes(@NotNull URL paramURL) {
    long l = a ^ 0x3D5CE243395FL;
    Intrinsics.checkNotNullParameter(paramURL, "<this>");
    InputStream inputStream = paramURL.openStream();
    Throwable throwable = null;
    try {
      InputStream inputStream1 = inputStream;
      boolean bool = false;
      Intrinsics.checkNotNullExpressionValue(inputStream1, "it");
      byte[] arrayOfByte = ByteStreamsKt.readBytes(inputStream1);
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(inputStream, throwable);
    } 
    return arrayOfByte;
  }
  
  public static final long copyTo(@NotNull Reader paramReader, @NotNull Writer paramWriter, int paramInt) {
    long l1 = a ^ 0x505051AA1F04L;
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    Intrinsics.checkNotNullParameter(paramWriter, "out");
    long l2 = 0L;
    char[] arrayOfChar = new char[paramInt];
    int i;
    for (i = paramReader.read(arrayOfChar); i >= 0; i = paramReader.read(arrayOfChar)) {
      paramWriter.write(arrayOfChar, 0, i);
      l2 += i;
    } 
    return l2;
  }
  
  public static final void forEachLine(@NotNull Reader paramReader, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x53F2BBDF085BL;
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    Reader reader1 = paramReader;
    boolean bool = false;
    Reader reader2 = reader1;
    char c = ' ';
    try {
    
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    reader2 = (reader2 instanceof BufferedReader) ? reader2 : new BufferedReader(reader2, c);
    Throwable throwable = null;
    try {
      BufferedReader bufferedReader = (BufferedReader)reader2;
      boolean bool1 = false;
      Sequence sequence1 = lineSequence(bufferedReader);
      boolean bool2 = false;
      Sequence sequence2 = sequence1;
      boolean bool3 = false;
      for (Object object : sequence2)
        paramFunction1.invoke(object); 
      Unit unit = Unit.INSTANCE;
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(reader2, throwable);
    } 
  }
  
  @NotNull
  public static final String readText(@NotNull Reader paramReader) {
    long l = a ^ 0x762E3BA9C7D2L;
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    StringWriter stringWriter = new StringWriter();
    copyTo$default(paramReader, stringWriter, 0, 2, null);
    Intrinsics.checkNotNullExpressionValue(stringWriter.toString(), "buffer.toString()");
    return stringWriter.toString();
  }
  
  public static final Object useLines(@NotNull Reader paramReader, @NotNull Function1 paramFunction1) {
    long l = a ^ 0x20E3D15D6F98L;
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    boolean bool = false;
    Reader reader = paramReader;
    char c = ' ';
    try {
    
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    reader = (reader instanceof BufferedReader) ? reader : new BufferedReader(reader, c);
    Throwable throwable = null;
    try {
      BufferedReader bufferedReader = (BufferedReader)reader;
      boolean bool1 = false;
      Object object = paramFunction1.invoke(lineSequence(bufferedReader));
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      InlineMarker.finallyStart(1);
      CloseableKt.closeFinally(reader, throwable);
      InlineMarker.finallyEnd(1);
    } 
    return object;
  }
  
  @NotNull
  public static final List readLines(@NotNull Reader paramReader) {
    long l = a ^ 0x481874375BA0L;
    Intrinsics.checkNotNullParameter(paramReader, "<this>");
    ArrayList arrayList = new ArrayList();
    forEachLine(paramReader, new TextStreamsKt$readLines$1(arrayList));
    return arrayList;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\TextStreamsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
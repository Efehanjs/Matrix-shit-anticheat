package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.InlineMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.kotlin.text.Charsets;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
  private static final long b = o3.a(6882958704565245441L, -2801404243219562994L, null).a(21595379346789L);
  
  public static final void appendText(@NotNull File paramFile, @NotNull String paramString, @NotNull Charset paramCharset) {
    long l = b ^ 0x487097A0E826L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "text");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    Intrinsics.checkNotNullExpressionValue(paramString.getBytes(paramCharset), "this as java.lang.String).getBytes(charset)");
    FilesKt.appendBytes(paramFile, paramString.getBytes(paramCharset));
  }
  
  public static final Object useLines(@NotNull File paramFile, @NotNull Charset paramCharset, @NotNull Function1 paramFunction1) {
    long l = b ^ 0x1F515F999B35L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    Intrinsics.checkNotNullParameter(paramFunction1, "block");
    boolean bool = false;
    File file1 = paramFile;
    char c = ' ';
    File file2 = file1;
    null = new InputStreamReader(new FileInputStream(file2), paramCharset);
    try {
    
    } catch (Throwable throwable1) {
      throw a(null);
    } 
    BufferedReader bufferedReader = (null instanceof BufferedReader) ? (BufferedReader)null : new BufferedReader(null, c);
    Throwable throwable = null;
    try {
      BufferedReader bufferedReader1 = bufferedReader;
      boolean bool1 = false;
      Object object = paramFunction1.invoke(TextStreamsKt.lineSequence(bufferedReader1));
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      InlineMarker.finallyStart(1);
      CloseableKt.closeFinally(bufferedReader, throwable);
      InlineMarker.finallyEnd(1);
    } 
    return object;
  }
  
  @NotNull
  public static final byte[] readBytes(@NotNull File paramFile) {
    long l = b ^ 0x7FFB5F88F803L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    Throwable throwable = null;
    try {
      FileInputStream fileInputStream1 = fileInputStream;
      boolean bool = false;
      int i = 0;
      long l1 = paramFile.length();
      long l2 = l1;
      int j = 0;
      try {
        if (l2 > 2147483647L)
          throw new OutOfMemoryError("File " + paramFile + " is too big (" + l2 + " bytes) to fit in memory."); 
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      int k = (int)l1;
      byte[] arrayOfByte2 = new byte[k];
      while (k > 0) {
        int m = fileInputStream1.read(arrayOfByte2, i, k);
        if (m >= 0) {
          k -= m;
          i += m;
        } 
      } 
      try {
        Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte2, i), "copyOf(this, newSize)");
        int m = fileInputStream1.read();
        try {
          ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new ExposingBufferByteArrayOutputStream(8193);
          exposingBufferByteArrayOutputStream.write(m);
          ByteStreamsKt.copyTo$default(fileInputStream1, exposingBufferByteArrayOutputStream, 0, 2, null);
          j = arrayOfByte2.length + exposingBufferByteArrayOutputStream.size();
          try {
            if (j < 0)
              throw new OutOfMemoryError("File " + paramFile + " is too big to fit in memory."); 
          } catch (Throwable throwable1) {
            throw a(null);
          } 
          Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfByte2, j), "copyOf(this, newSize)");
        } catch (Throwable throwable1) {
          throw a(null);
        } 
      } catch (Throwable throwable1) {
        throw a(null);
      } 
      byte[] arrayOfByte1 = (k > 0) ? Arrays.copyOf(arrayOfByte2, i) : ((m == -1) ? arrayOfByte2 : ArraysKt.copyInto(exposingBufferByteArrayOutputStream.getBuffer(), Arrays.copyOf(arrayOfByte2, j), arrayOfByte2.length, 0, exposingBufferByteArrayOutputStream.size()));
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(fileInputStream, throwable);
    } 
    return arrayOfByte1;
  }
  
  @NotNull
  public static final String readText(@NotNull File paramFile, @NotNull Charset paramCharset) {
    long l = b ^ 0x3089EA343CDBL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    File file = paramFile;
    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), paramCharset);
    Throwable throwable = null;
    try {
      InputStreamReader inputStreamReader1 = inputStreamReader;
      boolean bool = false;
      String str = TextStreamsKt.readText(inputStreamReader1);
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(inputStreamReader, throwable);
    } 
    return str;
  }
  
  @NotNull
  public static final List readLines(@NotNull File paramFile, @NotNull Charset paramCharset) {
    long l = b ^ 0x688E0646ABE6L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    ArrayList arrayList = new ArrayList();
    FilesKt.forEachLine(paramFile, paramCharset, new FilesKt__FileReadWriteKt$readLines$1(arrayList));
    return arrayList;
  }
  
  public static final void appendBytes(@NotNull File paramFile, @NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x6E275A4AB7ECL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile, true);
    Throwable throwable = null;
    try {
      FileOutputStream fileOutputStream1 = fileOutputStream;
      boolean bool = false;
      fileOutputStream1.write(paramArrayOfbyte);
      Unit unit = Unit.INSTANCE;
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(fileOutputStream, throwable);
    } 
  }
  
  public static final void writeBytes(@NotNull File paramFile, @NotNull byte[] paramArrayOfbyte) {
    long l = b ^ 0x6317045DC046L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfbyte, "array");
    FileOutputStream fileOutputStream = new FileOutputStream(paramFile);
    Throwable throwable = null;
    try {
      FileOutputStream fileOutputStream1 = fileOutputStream;
      boolean bool = false;
      fileOutputStream1.write(paramArrayOfbyte);
      Unit unit = Unit.INSTANCE;
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(fileOutputStream, throwable);
    } 
  }
  
  public static final void writeText(@NotNull File paramFile, @NotNull String paramString, @NotNull Charset paramCharset) {
    long l = b ^ 0x2DBA7B12959AL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "text");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    Intrinsics.checkNotNullExpressionValue(paramString.getBytes(paramCharset), "this as java.lang.String).getBytes(charset)");
    FilesKt.writeBytes(paramFile, paramString.getBytes(paramCharset));
  }
  
  public static final void forEachBlock(@NotNull File paramFile, @NotNull Function2 paramFunction2) {
    long l = b ^ 0x6875D2B62426L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    FilesKt.forEachBlock(paramFile, 4096, paramFunction2);
  }
  
  public static final void forEachBlock(@NotNull File paramFile, int paramInt, @NotNull Function2 paramFunction2) {
    long l = b ^ 0x1EDAE2C0F62DL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramFunction2, "action");
    byte[] arrayOfByte = new byte[RangesKt.coerceAtLeast(paramInt, 512)];
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    Throwable throwable = null;
    try {
      FileInputStream fileInputStream1 = fileInputStream;
      boolean bool = false;
      while (true) {
        int i = fileInputStream1.read(arrayOfByte);
        try {
          if (i <= 0) {
            Unit unit = Unit.INSTANCE;
            return;
          } 
        } catch (Throwable throwable1) {
          throw a(null);
        } 
        paramFunction2.invoke(arrayOfByte, Integer.valueOf(i));
      } 
    } catch (Throwable throwable1) {
      throwable = throwable1;
      throw throwable1;
    } finally {
      CloseableKt.closeFinally(fileInputStream, throwable);
    } 
  }
  
  public static final void forEachLine(@NotNull File paramFile, @NotNull Charset paramCharset, @NotNull Function1 paramFunction1) {
    long l = b ^ 0x20D9153236B8L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullParameter(paramCharset, "charset");
    Intrinsics.checkNotNullParameter(paramFunction1, "action");
    TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(paramFile), paramCharset)), paramFunction1);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilesKt__FileReadWriteKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
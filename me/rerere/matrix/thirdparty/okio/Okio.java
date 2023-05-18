package me.rerere.matrix.thirdparty.okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Okio {
  @NotNull
  public static final Source source(@NotNull File paramFile) throws FileNotFoundException {
    return Okio__JvmOkioKt.source(paramFile);
  }
  
  @NotNull
  public static final BufferedSink buffer(@NotNull Sink paramSink) {
    return Okio__OkioKt.buffer(paramSink);
  }
  
  @NotNull
  public static final Sink sink(@NotNull Socket paramSocket) throws IOException {
    return Okio__JvmOkioKt.sink(paramSocket);
  }
  
  public static final Object use(Closeable paramCloseable, @NotNull Function1 paramFunction1) {
    return Okio__OkioKt.use(paramCloseable, paramFunction1);
  }
  
  @NotNull
  public static final CipherSource cipherSource(@NotNull Source paramSource, @NotNull Cipher paramCipher) {
    return Okio__JvmOkioKt.cipherSource(paramSource, paramCipher);
  }
  
  @NotNull
  public static final CipherSink cipherSink(@NotNull Sink paramSink, @NotNull Cipher paramCipher) {
    return Okio__JvmOkioKt.cipherSink(paramSink, paramCipher);
  }
  
  @NotNull
  public static final HashingSink hashingSink(@NotNull Sink paramSink, @NotNull Mac paramMac) {
    return Okio__JvmOkioKt.hashingSink(paramSink, paramMac);
  }
  
  public static final Source source(@NotNull Path paramPath, @NotNull OpenOption... paramVarArgs) throws IOException {
    return Okio__JvmOkioKt.source(paramPath, paramVarArgs);
  }
  
  public static final Sink sink(@NotNull Path paramPath, @NotNull OpenOption... paramVarArgs) throws IOException {
    return Okio__JvmOkioKt.sink(paramPath, paramVarArgs);
  }
  
  @JvmOverloads
  @NotNull
  public static final Sink sink(@NotNull File paramFile, boolean paramBoolean) throws FileNotFoundException {
    return Okio__JvmOkioKt.sink(paramFile, paramBoolean);
  }
  
  @NotNull
  public static final FileSystem asResourceFileSystem(@NotNull ClassLoader paramClassLoader) {
    return Okio__JvmOkioKt.asResourceFileSystem(paramClassLoader);
  }
  
  @NotNull
  public static final FileSystem openZip(@NotNull FileSystem paramFileSystem, @NotNull Path paramPath) throws IOException {
    return Okio__JvmOkioKt.openZip(paramFileSystem, paramPath);
  }
  
  @NotNull
  public static final Source source(@NotNull Socket paramSocket) throws IOException {
    return Okio__JvmOkioKt.source(paramSocket);
  }
  
  @NotNull
  public static final HashingSource hashingSource(@NotNull Source paramSource, @NotNull MessageDigest paramMessageDigest) {
    return Okio__JvmOkioKt.hashingSource(paramSource, paramMessageDigest);
  }
  
  @NotNull
  public static final HashingSink hashingSink(@NotNull Sink paramSink, @NotNull MessageDigest paramMessageDigest) {
    return Okio__JvmOkioKt.hashingSink(paramSink, paramMessageDigest);
  }
  
  @NotNull
  public static final HashingSource hashingSource(@NotNull Source paramSource, @NotNull Mac paramMac) {
    return Okio__JvmOkioKt.hashingSource(paramSource, paramMac);
  }
  
  @NotNull
  public static final Sink blackhole() {
    return Okio__OkioKt.blackhole();
  }
  
  @NotNull
  public static final Sink appendingSink(@NotNull File paramFile) throws FileNotFoundException {
    return Okio__JvmOkioKt.appendingSink(paramFile);
  }
  
  @NotNull
  public static final Sink sink(@NotNull OutputStream paramOutputStream) {
    return Okio__JvmOkioKt.sink(paramOutputStream);
  }
  
  @NotNull
  public static final BufferedSource buffer(@NotNull Source paramSource) {
    return Okio__OkioKt.buffer(paramSource);
  }
  
  @NotNull
  public static final Source source(@NotNull InputStream paramInputStream) {
    return Okio__JvmOkioKt.source(paramInputStream);
  }
  
  @JvmOverloads
  @NotNull
  public static final Sink sink(@NotNull File paramFile) throws FileNotFoundException {
    return Okio__JvmOkioKt.sink(paramFile);
  }
  
  public static final boolean isAndroidGetsocknameError(@NotNull AssertionError paramAssertionError) {
    return Okio__JvmOkioKt.isAndroidGetsocknameError(paramAssertionError);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Okio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
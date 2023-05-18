package me.rerere.matrix.thirdparty.okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.DeprecationLevel;
import me.rerere.matrix.thirdparty.kotlin.ReplaceWith;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

@Deprecated(message = "changed in Okio 2.x")
public final class -DeprecatedOkio {
  @NotNull
  public static final -DeprecatedOkio INSTANCE;
  
  private static final long a = o3.a(-7229118786849537771L, -673949604101332532L, MethodHandles.lookup().lookupClass()).a(20973042301671L);
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.sink()", imports = {"me.rerere.matrix.thirdparty.okio.sink"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Sink sink(@NotNull File paramFile) {
    long l = a ^ 0x6FCFC792FB9EL;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return Okio.sink$default(paramFile, false, 1, null);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.sink(*options)", imports = {"me.rerere.matrix.thirdparty.okio.sink"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Sink sink(@NotNull Path paramPath, @NotNull OpenOption... paramVarArgs) {
    long l = a ^ 0x3E11C5C687D3L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    Intrinsics.checkNotNullParameter(paramVarArgs, "options");
    return Okio.sink(paramPath, Arrays.<OpenOption>copyOf(paramVarArgs, paramVarArgs.length));
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "path.source(*options)", imports = {"me.rerere.matrix.thirdparty.okio.source"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Source source(@NotNull Path paramPath, @NotNull OpenOption... paramVarArgs) {
    long l = a ^ 0x6C7AFA566895L;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    Intrinsics.checkNotNullParameter(paramVarArgs, "options");
    return Okio.source(paramPath, Arrays.<OpenOption>copyOf(paramVarArgs, paramVarArgs.length));
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.source()", imports = {"me.rerere.matrix.thirdparty.okio.source"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Source source(@NotNull File paramFile) {
    long l = a ^ 0x75ACD540CE3BL;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return Okio.source(paramFile);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "sink.buffer()", imports = {"me.rerere.matrix.thirdparty.okio.buffer"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final BufferedSink buffer(@NotNull Sink paramSink) {
    long l = a ^ 0x7D04B4CB8F7AL;
    Intrinsics.checkNotNullParameter(paramSink, "sink");
    return Okio.buffer(paramSink);
  }
  
  static {
    INSTANCE = new -DeprecatedOkio();
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "source.buffer()", imports = {"me.rerere.matrix.thirdparty.okio.buffer"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final BufferedSource buffer(@NotNull Source paramSource) {
    long l = a ^ 0x5BF57DF3927BL;
    Intrinsics.checkNotNullParameter(paramSource, "source");
    return Okio.buffer(paramSource);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "file.appendingSink()", imports = {"me.rerere.matrix.thirdparty.okio.appendingSink"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Sink appendingSink(@NotNull File paramFile) {
    long l = a ^ 0x68AB96EE4E3CL;
    Intrinsics.checkNotNullParameter(paramFile, "file");
    return Okio.appendingSink(paramFile);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.sink()", imports = {"me.rerere.matrix.thirdparty.okio.sink"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Sink sink(@NotNull Socket paramSocket) {
    long l = a ^ 0x7663924D9912L;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    return Okio.sink(paramSocket);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "socket.source()", imports = {"me.rerere.matrix.thirdparty.okio.source"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Source source(@NotNull Socket paramSocket) {
    long l = a ^ 0x5EC87CCB0759L;
    Intrinsics.checkNotNullParameter(paramSocket, "socket");
    return Okio.source(paramSocket);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "blackholeSink()", imports = {"me.rerere.matrix.thirdparty.okio.blackholeSink"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Sink blackhole() {
    return Okio.blackhole();
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputStream.source()", imports = {"me.rerere.matrix.thirdparty.okio.source"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Source source(@NotNull InputStream paramInputStream) {
    long l = a ^ 0x7235F5062F70L;
    Intrinsics.checkNotNullParameter(paramInputStream, "inputStream");
    return Okio.source(paramInputStream);
  }
  
  @Deprecated(message = "moved to extension function", replaceWith = @ReplaceWith(expression = "outputStream.sink()", imports = {"me.rerere.matrix.thirdparty.okio.sink"}), level = DeprecationLevel.ERROR)
  @NotNull
  public final Sink sink(@NotNull OutputStream paramOutputStream) {
    long l = a ^ 0x77488E26A893L;
    Intrinsics.checkNotNullParameter(paramOutputStream, "outputStream");
    return Okio.sink(paramOutputStream);
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\-DeprecatedOkio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
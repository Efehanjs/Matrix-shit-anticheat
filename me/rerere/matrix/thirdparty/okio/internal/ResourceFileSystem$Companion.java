package me.rerere.matrix.thirdparty.okio.internal;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URL;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.okio.FileSystem;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.okio.ZipFileSystem;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ResourceFileSystem$Companion {
  private static final long a = o3.a(-4935509744762493587L, 8661079839627009715L, MethodHandles.lookup().lookupClass()).a(188655570650262L);
  
  @Nullable
  public final Pair toFileRoot(@NotNull URL paramURL) {
    long l = a ^ 0x5609EA4437F1L;
    try {
      Intrinsics.checkNotNullParameter(paramURL, "<this>");
      if (!Intrinsics.areEqual(paramURL.getProtocol(), "file"))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return TuplesKt.to(FileSystem.SYSTEM, Path.Companion.get$default(Path.Companion, new File(paramURL.toURI()), false, 1, null));
  }
  
  @Nullable
  public final Pair toJarRoot(@NotNull URL paramURL) {
    long l = a ^ 0x51F922BC68AEL;
    Intrinsics.checkNotNullParameter(paramURL, "<this>");
    String str2 = paramURL.toString();
    Intrinsics.checkNotNullExpressionValue(str2, "toString()");
    String str1 = str2;
    try {
      if (!StringsKt.startsWith$default(str1, "jar:file:", false, 2, null))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = StringsKt.lastIndexOf$default(str1, "!", 0, false, 6, null);
    try {
      if (i == -1)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str3 = str1;
    int j = "jar:".length();
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(str3.substring(j, i), "(this as java.lang.Strin…ing(startIndex, endIndex)");
    Path path = Path.Companion.get$default(Path.Companion, new File(URI.create(str3.substring(j, i))), false, 1, null);
    ZipFileSystem zipFileSystem = ZipKt.openZip(path, FileSystem.SYSTEM, ResourceFileSystem$Companion$toJarRoot$zip$1.INSTANCE);
    return TuplesKt.to(zipFileSystem, getROOT());
  }
  
  @NotNull
  public final Path getROOT() {
    return ResourceFileSystem.access$getROOT$cp();
  }
  
  @NotNull
  public final List toClasspathRoots(@NotNull ClassLoader paramClassLoader) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/okio/internal/ResourceFileSystem$Companion.a : J
    //   3: ldc2_w 77909584032413
    //   6: lxor
    //   7: lstore_2
    //   8: aload_1
    //   9: ldc '<this>'
    //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   14: aload_1
    //   15: ldc ''
    //   17: invokevirtual getResources : (Ljava/lang/String;)Ljava/util/Enumeration;
    //   20: astore #4
    //   22: aload #4
    //   24: ldc 'getResources("")'
    //   26: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   29: aload #4
    //   31: astore #4
    //   33: iconst_0
    //   34: istore #5
    //   36: aload #4
    //   38: invokestatic list : (Ljava/util/Enumeration;)Ljava/util/ArrayList;
    //   41: dup
    //   42: ldc 'java.util.Collections.list(this)'
    //   44: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   47: checkcast java/util/List
    //   50: checkcast java/lang/Iterable
    //   53: astore #4
    //   55: nop
    //   56: iconst_0
    //   57: istore #5
    //   59: aload #4
    //   61: astore #6
    //   63: new java/util/ArrayList
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: checkcast java/util/Collection
    //   73: astore #7
    //   75: iconst_0
    //   76: istore #8
    //   78: aload #6
    //   80: astore #9
    //   82: iconst_0
    //   83: istore #10
    //   85: aload #9
    //   87: invokeinterface iterator : ()Ljava/util/Iterator;
    //   92: astore #11
    //   94: aload #11
    //   96: invokeinterface hasNext : ()Z
    //   101: ifeq -> 182
    //   104: aload #11
    //   106: invokeinterface next : ()Ljava/lang/Object;
    //   111: astore #12
    //   113: aload #12
    //   115: astore #13
    //   117: iconst_0
    //   118: istore #14
    //   120: aload #13
    //   122: checkcast java/net/URL
    //   125: astore #15
    //   127: iconst_0
    //   128: istore #16
    //   130: invokestatic access$getCompanion$p : ()Lme/rerere/matrix/thirdparty/okio/internal/ResourceFileSystem$Companion;
    //   133: aload #15
    //   135: ldc 'it'
    //   137: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   140: aload #15
    //   142: invokevirtual toFileRoot : (Ljava/net/URL;)Lme/rerere/matrix/thirdparty/kotlin/Pair;
    //   145: dup
    //   146: ifnull -> 177
    //   149: astore #17
    //   151: iconst_0
    //   152: istore #18
    //   154: iconst_0
    //   155: istore #19
    //   157: aload #17
    //   159: astore #20
    //   161: iconst_0
    //   162: istore #21
    //   164: aload #7
    //   166: aload #20
    //   168: invokeinterface add : (Ljava/lang/Object;)Z
    //   173: pop
    //   174: goto -> 178
    //   177: pop
    //   178: nop
    //   179: goto -> 94
    //   182: nop
    //   183: aload #7
    //   185: checkcast java/util/List
    //   188: nop
    //   189: checkcast java/util/Collection
    //   192: aload_1
    //   193: ldc 'META-INF/MANIFEST.MF'
    //   195: invokevirtual getResources : (Ljava/lang/String;)Ljava/util/Enumeration;
    //   198: astore #4
    //   200: aload #4
    //   202: ldc 'getResources("META-INF/MANIFEST.MF")'
    //   204: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   207: aload #4
    //   209: astore #4
    //   211: iconst_0
    //   212: istore #5
    //   214: aload #4
    //   216: invokestatic list : (Ljava/util/Enumeration;)Ljava/util/ArrayList;
    //   219: dup
    //   220: ldc 'java.util.Collections.list(this)'
    //   222: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   225: checkcast java/util/List
    //   228: checkcast java/lang/Iterable
    //   231: astore #4
    //   233: astore #22
    //   235: iconst_0
    //   236: istore #5
    //   238: aload #4
    //   240: astore #6
    //   242: new java/util/ArrayList
    //   245: dup
    //   246: invokespecial <init> : ()V
    //   249: checkcast java/util/Collection
    //   252: astore #7
    //   254: iconst_0
    //   255: istore #8
    //   257: aload #6
    //   259: astore #9
    //   261: iconst_0
    //   262: istore #10
    //   264: aload #9
    //   266: invokeinterface iterator : ()Ljava/util/Iterator;
    //   271: astore #11
    //   273: aload #11
    //   275: invokeinterface hasNext : ()Z
    //   280: ifeq -> 361
    //   283: aload #11
    //   285: invokeinterface next : ()Ljava/lang/Object;
    //   290: astore #12
    //   292: aload #12
    //   294: astore #13
    //   296: iconst_0
    //   297: istore #14
    //   299: aload #13
    //   301: checkcast java/net/URL
    //   304: astore #15
    //   306: iconst_0
    //   307: istore #16
    //   309: invokestatic access$getCompanion$p : ()Lme/rerere/matrix/thirdparty/okio/internal/ResourceFileSystem$Companion;
    //   312: aload #15
    //   314: ldc 'it'
    //   316: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   319: aload #15
    //   321: invokevirtual toJarRoot : (Ljava/net/URL;)Lme/rerere/matrix/thirdparty/kotlin/Pair;
    //   324: dup
    //   325: ifnull -> 356
    //   328: astore #17
    //   330: iconst_0
    //   331: istore #18
    //   333: iconst_0
    //   334: istore #19
    //   336: aload #17
    //   338: astore #20
    //   340: iconst_0
    //   341: istore #21
    //   343: aload #7
    //   345: aload #20
    //   347: invokeinterface add : (Ljava/lang/Object;)Z
    //   352: pop
    //   353: goto -> 357
    //   356: pop
    //   357: nop
    //   358: goto -> 273
    //   361: nop
    //   362: aload #7
    //   364: checkcast java/util/List
    //   367: nop
    //   368: astore #23
    //   370: aload #22
    //   372: aload #23
    //   374: checkcast java/lang/Iterable
    //   377: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
    //   380: areturn
  }
  
  @NotNull
  public final Path removeBase(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = a ^ 0x6CD006B1B4C9L;
    Intrinsics.checkNotNullParameter(paramPath1, "<this>");
    Intrinsics.checkNotNullParameter(paramPath2, "base");
    String str = paramPath2.toString();
    return getROOT().resolve(StringsKt.replace$default(StringsKt.removePrefix(paramPath1.toString(), str), '\\', '/', false, 4, null));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ResourceFileSystem$Companion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
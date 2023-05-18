package me.rerere.matrix.thirdparty.okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Lazy;
import me.rerere.matrix.thirdparty.kotlin.LazyKt;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.FileHandle;
import me.rerere.matrix.thirdparty.okio.FileMetadata;
import me.rerere.matrix.thirdparty.okio.FileSystem;
import me.rerere.matrix.thirdparty.okio.Path;
import me.rerere.matrix.thirdparty.okio.Sink;
import me.rerere.matrix.thirdparty.okio.Source;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class ResourceFileSystem extends FileSystem {
  @NotNull
  private static final ResourceFileSystem$Companion Companion;
  
  @Deprecated
  @NotNull
  private static final Path ROOT;
  
  @NotNull
  private final Lazy roots$delegate;
  
  private static final long b = o3.a(2604141183420974204L, 7793903546667338123L, MethodHandles.lookup().lookupClass()).a(45021127628150L);
  
  public ResourceFileSystem(@NotNull ClassLoader paramClassLoader, boolean paramBoolean) {
    this.roots$delegate = LazyKt.lazy(new ResourceFileSystem$roots$2(paramClassLoader));
    if (paramBoolean)
      getRoots().size(); 
  }
  
  @NotNull
  public List list(@NotNull Path paramPath) {
    long l = b ^ 0x3D7F233EA519L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    String str = toRelativePath(paramPath);
    boolean bool = false;
    LinkedHashSet linkedHashSet = new LinkedHashSet();
    bool = false;
    for (Pair pair : getRoots()) {
      FileSystem fileSystem = (FileSystem)pair.component1();
      Path path = (Path)pair.component2();
      try {
        LinkedHashSet linkedHashSet1 = linkedHashSet;
        List<Path> list1 = fileSystem.list(path.resolve(str));
        boolean bool1 = false;
        List<Path> list2 = list1;
        ArrayList<Path> arrayList = new ArrayList();
        boolean bool2 = false;
        for (Path path1 : list2) {
          Path path2 = path1;
          boolean bool3 = false;
          if (ResourceFileSystem$Companion.access$keepPath(Companion, path2))
            arrayList.add(path1); 
        } 
        list1 = arrayList;
        bool1 = false;
        list2 = list1;
        arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list1, 10));
        bool2 = false;
        for (Path path1 : list2) {
          Path path2 = path1;
          ArrayList<Path> arrayList1 = arrayList;
          boolean bool3 = false;
          Path path3 = Companion.removeBase(path2, path);
          arrayList1.add(path3);
        } 
        list1 = arrayList;
        bool1 = false;
        CollectionsKt.addAll(linkedHashSet1, list1);
        bool = true;
      } catch (IOException iOException) {}
    } 
    try {
      if (!bool)
        throw new FileNotFoundException(Intrinsics.stringPlus("file not found: ", paramPath)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return CollectionsKt.toList(linkedHashSet);
  }
  
  @NotNull
  public Source source(@NotNull Path paramPath) {
    long l = b ^ 0x731212952C0L;
    try {
      Intrinsics.checkNotNullParameter(paramPath, "file");
      if (!ResourceFileSystem$Companion.access$keepPath(Companion, paramPath))
        throw new FileNotFoundException(Intrinsics.stringPlus("file not found: ", paramPath)); 
    } catch (FileNotFoundException fileNotFoundException) {
      throw a(null);
    } 
    String str = toRelativePath(paramPath);
    for (Pair pair : getRoots()) {
      FileSystem fileSystem = (FileSystem)pair.component1();
      Path path = (Path)pair.component2();
      try {
        return fileSystem.source(path.resolve(str));
      } catch (FileNotFoundException fileNotFoundException) {}
    } 
    throw new FileNotFoundException(Intrinsics.stringPlus("file not found: ", paramPath));
  }
  
  @NotNull
  public FileHandle openReadWrite(@NotNull Path paramPath, boolean paramBoolean1, boolean paramBoolean2) {
    long l = b ^ 0x29080F46194DL;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    throw new IOException("resources are not writable");
  }
  
  public void createSymlink(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = b ^ 0x16E71936CE74L;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    throw new IOException(this + " is read-only");
  }
  
  @Nullable
  public List listOrNull(@NotNull Path paramPath) {
    long l = b ^ 0xF476E7BB64CL;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    String str = toRelativePath(paramPath);
    boolean bool = false;
    LinkedHashSet linkedHashSet = new LinkedHashSet();
    bool = false;
    for (Pair pair : getRoots()) {
      FileSystem fileSystem = (FileSystem)pair.component1();
      Path path = (Path)pair.component2();
      List<Path> list = fileSystem.listOrNull(path.resolve(str));
      try {
        List<Path> list1 = list;
        boolean bool1 = false;
        List<Path> list2 = list1;
        ArrayList<Path> arrayList2 = new ArrayList();
        boolean bool2 = false;
        for (Path path1 : list2) {
          Path path2 = path1;
          boolean bool3 = false;
          if (ResourceFileSystem$Companion.access$keepPath(Companion, path2))
            arrayList2.add(path1); 
        } 
        ArrayList<Path> arrayList1 = arrayList2;
        list1 = arrayList1;
        bool1 = false;
        list2 = list1;
        arrayList2 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list1, 10));
        bool2 = false;
        for (Path path1 : list2) {
          Path path2 = path1;
          ArrayList<Path> arrayList3 = arrayList2;
          boolean bool3 = false;
          Path path3 = Companion.removeBase(path2, path);
          arrayList3.add(path3);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ArrayList<Path> arrayList = (list == null) ? null : arrayList2;
      if (arrayList != null) {
        LinkedHashSet linkedHashSet1 = linkedHashSet;
        boolean bool1 = false;
        CollectionsKt.addAll(linkedHashSet1, arrayList);
        bool = true;
      } 
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return bool ? CollectionsKt.toList(linkedHashSet) : null;
  }
  
  @NotNull
  public Path canonicalize(@NotNull Path paramPath) {
    long l = b ^ 0x122330DFDD9FL;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    return canonicalizeInternal(paramPath);
  }
  
  @Nullable
  public FileMetadata metadataOrNull(@NotNull Path paramPath) {
    long l = b ^ 0x44C46D3E397BL;
    try {
      Intrinsics.checkNotNullParameter(paramPath, "path");
      if (!ResourceFileSystem$Companion.access$keepPath(Companion, paramPath))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = toRelativePath(paramPath);
    for (Pair pair : getRoots()) {
      FileSystem fileSystem = (FileSystem)pair.component1();
      Path path = (Path)pair.component2();
      FileMetadata fileMetadata = fileSystem.metadataOrNull(path.resolve(str));
      try {
        if (fileMetadata == null)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return fileMetadata;
    } 
    return null;
  }
  
  public void atomicMove(@NotNull Path paramPath1, @NotNull Path paramPath2) {
    long l = b ^ 0x3D09941EC6F8L;
    Intrinsics.checkNotNullParameter(paramPath1, "source");
    Intrinsics.checkNotNullParameter(paramPath2, "target");
    throw new IOException(this + " is read-only");
  }
  
  public void delete(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x2652883E676FL;
    Intrinsics.checkNotNullParameter(paramPath, "path");
    throw new IOException(this + " is read-only");
  }
  
  static {
    Companion = new ResourceFileSystem$Companion(null);
    ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, null);
  }
  
  @NotNull
  public Sink appendingSink(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x7CF638CB3CA4L;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    throw new IOException(this + " is read-only");
  }
  
  public void createDirectory(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x7B29B4EB3F85L;
    Intrinsics.checkNotNullParameter(paramPath, "dir");
    throw new IOException(this + " is read-only");
  }
  
  @NotNull
  public Sink sink(@NotNull Path paramPath, boolean paramBoolean) {
    long l = b ^ 0x23A5D38AAAE9L;
    Intrinsics.checkNotNullParameter(paramPath, "file");
    throw new IOException(this + " is read-only");
  }
  
  @NotNull
  public FileHandle openReadOnly(@NotNull Path paramPath) {
    long l = b ^ 0x76D5B8C21607L;
    try {
      Intrinsics.checkNotNullParameter(paramPath, "file");
      if (!ResourceFileSystem$Companion.access$keepPath(Companion, paramPath))
        throw new FileNotFoundException(Intrinsics.stringPlus("file not found: ", paramPath)); 
    } catch (FileNotFoundException fileNotFoundException) {
      throw a(null);
    } 
    String str = toRelativePath(paramPath);
    for (Pair pair : getRoots()) {
      FileSystem fileSystem = (FileSystem)pair.component1();
      Path path = (Path)pair.component2();
      try {
        return fileSystem.openReadOnly(path.resolve(str));
      } catch (FileNotFoundException fileNotFoundException) {}
    } 
    throw new FileNotFoundException(Intrinsics.stringPlus("file not found: ", paramPath));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ResourceFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
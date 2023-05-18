package me.rerere.matrix.thirdparty.okio;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.internal._PathKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class Path implements Comparable {
  @NotNull
  private final ByteString bytes;
  
  @JvmField
  @NotNull
  public static final String DIRECTORY_SEPARATOR;
  
  @NotNull
  public static final Path$Companion Companion;
  
  private static final long a = o3.a(2892007189106410287L, 6963690018698962918L, MethodHandles.lookup().lookupClass()).a(255238240478797L);
  
  @NotNull
  public final Path resolve(@NotNull String paramString, boolean paramBoolean) {
    long l = a ^ 0x6C76862F057FL;
    Intrinsics.checkNotNullParameter(paramString, "child");
    Path path1 = this;
    boolean bool1 = false;
    Path path2 = path1;
    Buffer buffer = (new Buffer()).writeUtf8(paramString);
    boolean bool2 = false;
    return _PathKt.commonResolve(path2, _PathKt.toPath(buffer, false), paramBoolean);
  }
  
  public int hashCode() {
    Path path = this;
    boolean bool = false;
    return path.getBytes$okio().hashCode();
  }
  
  public Path(@NotNull ByteString paramByteString) {
    this.bytes = paramByteString;
  }
  
  @NotNull
  public final File toFile() {
    return new File(toString());
  }
  
  @Nullable
  public final Character volumeLetter() {
    Path path = this;
    boolean bool = false;
    try {
      try {
        char c = ':';
        boolean bool1 = false;
        try {
          c = (char)path.getBytes$okio().getByte(0);
          try {
            if ('a' <= c) {
              try {
              
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } else {
            
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          try {
            if (!false) {
              try {
                if ('A' <= c) {
                  try {
                  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                } else {
                
                } 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
              try {
                if (!false);
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (ByteString.indexOf$default(path.getBytes$okio(), _PathKt.access$getSLASH$p(), 0, 2, (Object)null) != -1) ? null : ((path.getBytes$okio().size() < 2) ? null : ((path.getBytes$okio().getByte(1) != (byte)c) ? null : Character.valueOf(c)));
  }
  
  @JvmOverloads
  public static final Path get(@NotNull java.nio.file.Path paramPath) {
    return Companion.get(paramPath);
  }
  
  @JvmOverloads
  @NotNull
  public static final Path get(@NotNull String paramString, boolean paramBoolean) {
    return Companion.get(paramString, paramBoolean);
  }
  
  @NotNull
  public final Path resolve(@NotNull String paramString) {
    long l = a ^ 0x2774D18C22BEL;
    Intrinsics.checkNotNullParameter(paramString, "child");
    Path path1 = this;
    boolean bool1 = false;
    boolean bool2 = false;
    Path path2 = path1;
    Buffer buffer = (new Buffer()).writeUtf8(paramString);
    boolean bool3 = false;
    return _PathKt.commonResolve(path2, _PathKt.toPath(buffer, false), bool1);
  }
  
  @NotNull
  public String toString() {
    Path path = this;
    boolean bool = false;
    return path.getBytes$okio().utf8();
  }
  
  @JvmOverloads
  public static final Path get(@NotNull java.nio.file.Path paramPath, boolean paramBoolean) {
    return Companion.get(paramPath, paramBoolean);
  }
  
  @NotNull
  public final Path resolve(@NotNull ByteString paramByteString) {
    long l = a ^ 0x3EA9EFA1157BL;
    Intrinsics.checkNotNullParameter(paramByteString, "child");
    Path path1 = this;
    boolean bool1 = false;
    boolean bool2 = false;
    Path path2 = path1;
    Buffer buffer = (new Buffer()).write(paramByteString);
    boolean bool3 = false;
    return _PathKt.commonResolve(path2, _PathKt.toPath(buffer, false), bool1);
  }
  
  public final boolean isRoot() {
    Path path = this;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (_PathKt.access$rootLength(path) == path.getBytes$okio().size());
  }
  
  @Nullable
  public final Path parent() {
    Path path = this;
    boolean bool = false;
    try {
      if (!Intrinsics.areEqual(path.getBytes$okio(), _PathKt.access$getDOT$p()))
        try {
          if (!Intrinsics.areEqual(path.getBytes$okio(), _PathKt.access$getSLASH$p()))
            try {
              if (!Intrinsics.areEqual(path.getBytes$okio(), _PathKt.access$getBACKSLASH$p())) {
                try {
                  if (_PathKt.access$lastSegmentIsDotDot(path));
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                int i = _PathKt.access$getIndexOfLastSlash(path);
                try {
                  if (i == 2)
                    try {
                      if (path.volumeLetter() != null) {
                        try {
                        
                        } catch (IllegalArgumentException illegalArgumentException) {
                          throw a(null);
                        } 
                        return (path.getBytes$okio().size() == 3) ? null : new Path(ByteString.substring$default(path.getBytes$okio(), 0, 3, 1, null));
                      } 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  if (i == 1)
                    try {
                      if (path.getBytes$okio().startsWith(_PathKt.access$getBACKSLASH$p()));
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  if (i == -1)
                    try {
                      if (path.volumeLetter() != null) {
                        try {
                        
                        } catch (IllegalArgumentException illegalArgumentException) {
                          throw a(null);
                        } 
                        return (path.getBytes$okio().size() == 2) ? null : new Path(ByteString.substring$default(path.getBytes$okio(), 0, 2, 1, null));
                      } 
                    } catch (IllegalArgumentException illegalArgumentException) {
                      throw a(null);
                    }  
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                try {
                  try {
                  
                  } catch (IllegalArgumentException illegalArgumentException) {
                    throw a(null);
                  } 
                } catch (IllegalArgumentException illegalArgumentException) {
                  throw a(null);
                } 
                return (i == -1) ? new Path(_PathKt.access$getDOT$p()) : ((i == 0) ? new Path(ByteString.substring$default(path.getBytes$okio(), 0, 1, 1, null)) : new Path(ByteString.substring$default(path.getBytes$okio(), 0, i, 1, null)));
              } 
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            }  
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  static {
    long l = a ^ 0x1EB9AA512CE1L;
    Companion = new Path$Companion(null);
    String str = File.separator;
    Intrinsics.checkNotNullExpressionValue(str, "separator");
    DIRECTORY_SEPARATOR = str;
  }
  
  @NotNull
  public final ByteString nameBytes() {
    Path path = this;
    boolean bool = false;
    int i = _PathKt.access$getIndexOfLastSlash(path);
    try {
      try {
        if (path.volumeLetter() != null)
          try {
            if (path.getBytes$okio().size() == 2);
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i != -1) ? ByteString.substring$default(path.getBytes$okio(), i + 1, 0, 2, null) : path.getBytes$okio();
  }
  
  @NotNull
  public final String name() {
    Path path = this;
    boolean bool = false;
    return path.nameBytes().utf8();
  }
  
  @NotNull
  public final Path resolve(@NotNull Path paramPath, boolean paramBoolean) {
    long l = a ^ 0x1A40362F4CE1L;
    Intrinsics.checkNotNullParameter(paramPath, "child");
    return _PathKt.commonResolve(this, paramPath, paramBoolean);
  }
  
  @JvmOverloads
  @NotNull
  public static final Path get(@NotNull File paramFile) {
    return Companion.get(paramFile);
  }
  
  @NotNull
  public final Path resolve(@NotNull ByteString paramByteString, boolean paramBoolean) {
    long l = a ^ 0x22F8F2B1A30L;
    Intrinsics.checkNotNullParameter(paramByteString, "child");
    Path path1 = this;
    boolean bool1 = false;
    Path path2 = path1;
    Buffer buffer = (new Buffer()).write(paramByteString);
    boolean bool2 = false;
    return _PathKt.commonResolve(path2, _PathKt.toPath(buffer, false), paramBoolean);
  }
  
  public int compareTo(@NotNull Path paramPath) {
    long l = a ^ 0x37530576E7DEL;
    Intrinsics.checkNotNullParameter(paramPath, "other");
    Path path = this;
    boolean bool = false;
    return path.getBytes$okio().compareTo(paramPath.getBytes$okio());
  }
  
  @Nullable
  public final Path getRoot() {
    Path path = this;
    boolean bool = false;
    int i = _PathKt.access$rootLength(path);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (i == -1) ? null : new Path(path.getBytes$okio().substring(0, i));
  }
  
  @NotNull
  public final List getSegmentsBytes() {
    Path path = this;
    boolean bool = false;
    int i = 0;
    ArrayList<ByteString> arrayList = new ArrayList();
    i = _PathKt.access$rootLength(path);
    if (i == -1) {
      i = 0;
    } else {
      int m = 92;
      boolean bool1 = false;
      if (i < path.getBytes$okio().size() && path.getBytes$okio().getByte(i) == (byte)m) {
        m = i;
        i = m + 1;
      } 
    } 
    int j = i;
    int k = path.getBytes$okio().size();
    if (j < k)
      do {
        int m = j;
        j++;
        byte b = 47;
        boolean bool1 = false;
        b = 92;
        bool1 = false;
        if (path.getBytes$okio().getByte(m) != (byte)b && path.getBytes$okio().getByte(m) != (byte)b)
          continue; 
        ArrayList<ByteString> arrayList1 = arrayList;
        ByteString byteString = path.getBytes$okio().substring(i, m);
        boolean bool2 = false;
        arrayList1.add(byteString);
        i = m + 1;
      } while (j < k); 
    if (i < path.getBytes$okio().size()) {
      ArrayList<ByteString> arrayList1 = arrayList;
      ByteString byteString = path.getBytes$okio().substring(i, path.getBytes$okio().size());
      boolean bool1 = false;
      arrayList1.add(byteString);
    } 
    return arrayList;
  }
  
  public final boolean isRelative() {
    Path path = this;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (_PathKt.access$rootLength(path) == -1);
  }
  
  public boolean equals(@Nullable Object paramObject) {
    Path path = this;
    boolean bool = false;
    try {
      if (paramObject instanceof Path)
        try {
          if (Intrinsics.areEqual(((Path)paramObject).getBytes$okio(), path.getBytes$okio()));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  @JvmOverloads
  @NotNull
  public static final Path get(@NotNull String paramString) {
    return Companion.get(paramString);
  }
  
  @NotNull
  public final List getSegments() {
    Path path1 = this;
    boolean bool1 = false;
    Path path2 = path1;
    boolean bool2 = false;
    int i = 0;
    ArrayList<ByteString> arrayList3 = new ArrayList();
    i = _PathKt.access$rootLength(path2);
    if (i == -1) {
      i = 0;
    } else {
      int m = 92;
      boolean bool = false;
      if (i < path2.getBytes$okio().size() && path2.getBytes$okio().getByte(i) == (byte)m) {
        m = i;
        i = m + 1;
      } 
    } 
    int j = i;
    int k = path2.getBytes$okio().size();
    if (j < k)
      do {
        int m = j;
        j++;
        byte b = 47;
        boolean bool3 = false;
        b = 92;
        bool3 = false;
        if (path2.getBytes$okio().getByte(m) != (byte)b && path2.getBytes$okio().getByte(m) != (byte)b)
          continue; 
        ArrayList<ByteString> arrayList = arrayList3;
        ByteString byteString = path2.getBytes$okio().substring(i, m);
        boolean bool4 = false;
        arrayList.add(byteString);
        i = m + 1;
      } while (j < k); 
    if (i < path2.getBytes$okio().size()) {
      ArrayList<ByteString> arrayList = arrayList3;
      ByteString byteString = path2.getBytes$okio().substring(i, path2.getBytes$okio().size());
      boolean bool = false;
      arrayList.add(byteString);
    } 
    ArrayList<ByteString> arrayList1 = arrayList3;
    bool2 = false;
    ArrayList<ByteString> arrayList2 = arrayList1;
    arrayList3 = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(arrayList1, 10));
    j = 0;
    for (ByteString byteString1 : arrayList2) {
      ByteString byteString2 = byteString1;
      ArrayList<ByteString> arrayList = arrayList3;
      boolean bool = false;
      String str = byteString2.utf8();
      arrayList.add(str);
    } 
    return arrayList3;
  }
  
  @NotNull
  public final ByteString getBytes$okio() {
    return this.bytes;
  }
  
  @NotNull
  public final Path resolve(@NotNull Path paramPath) {
    long l = a ^ 0x12028455E736L;
    Intrinsics.checkNotNullParameter(paramPath, "child");
    return _PathKt.commonResolve(this, paramPath, false);
  }
  
  @NotNull
  public final Path normalized() {
    Path path = this;
    boolean bool = false;
    return Companion.get(path.toString(), true);
  }
  
  public final java.nio.file.Path toNioPath() {
    long l = a ^ 0x66FF359597F2L;
    java.nio.file.Path path = Paths.get(toString(), new String[0]);
    Intrinsics.checkNotNullExpressionValue(path, "get(toString())");
    return path;
  }
  
  @NotNull
  public final Path relativeTo(@NotNull Path paramPath) {
    long l = a ^ 0x680AA4DD3682L;
    Intrinsics.checkNotNullParameter(paramPath, "other");
    Path path = this;
    boolean bool1 = false;
    boolean bool = Intrinsics.areEqual(path.getRoot(), paramPath.getRoot());
    boolean bool2 = false;
    int i = 0;
    if (!bool) {
      boolean bool4 = false;
      String str = "Paths of different roots cannot be relative to each other: " + path + " and " + paramPath;
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    List<ByteString> list = path.getSegmentsBytes();
    List list1 = paramPath.getSegmentsBytes();
    i = 0;
    int k = list.size();
    int m = list1.size();
    boolean bool3 = false;
    int j = Math.min(k, m);
    while (true) {
      try {
        if (i < j && Intrinsics.areEqual(list.get(i), list1.get(i))) {
          k = i;
          i = k + 1;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
    try {
      if (i == j)
        try {
          if (path.getBytes$okio().size() == paramPath.getBytes$okio().size());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    k = (list1.subList(i, list1.size()).indexOf(_PathKt.access$getDOT_DOT$p()) == -1) ? 1 : 0;
    m = 0;
    bool3 = false;
    if (k == 0) {
      boolean bool4 = false;
      String str = "Impossible relative path to resolve: " + path + " and " + paramPath;
      throw (Throwable)new IllegalArgumentException(str.toString());
    } 
    Buffer buffer = new Buffer();
    ByteString byteString2 = _PathKt.access$getSlash(paramPath);
    if (byteString2 == null) {
      ByteString byteString = _PathKt.access$getSlash(path);
      try {
      
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } else {
    
    } 
    ByteString byteString1 = byteString2;
    int n = i;
    int i1 = list1.size();
    if (n < i1)
      do {
        int i2 = n;
        n++;
        buffer.write(_PathKt.access$getDOT_DOT$p());
        buffer.write(byteString1);
      } while (n < i1); 
    n = i;
    i1 = list.size();
    if (n < i1)
      while (true) {
        int i2 = n;
        try {
          n++;
          buffer.write(list.get(i2));
          buffer.write(byteString1);
          if (n >= i1);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      }  
  }
  
  public final boolean isAbsolute() {
    Path path = this;
    boolean bool = false;
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (_PathKt.access$rootLength(path) != -1);
  }
  
  @JvmOverloads
  @NotNull
  public static final Path get(@NotNull File paramFile, boolean paramBoolean) {
    return Companion.get(paramFile, paramBoolean);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\Path.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
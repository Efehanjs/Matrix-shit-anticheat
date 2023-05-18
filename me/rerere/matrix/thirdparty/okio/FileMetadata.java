package me.rerere.matrix.thirdparty.okio;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Map;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.collections.MapsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.reflect.KClass;
import me.rerere.matrix.thirdparty.kotlin.reflect.KClasses;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class FileMetadata {
  private final boolean isRegularFile;
  
  @Nullable
  private final Long createdAtMillis;
  
  @Nullable
  private final Long lastAccessedAtMillis;
  
  @Nullable
  private final Long size;
  
  private final boolean isDirectory;
  
  @Nullable
  private final Long lastModifiedAtMillis;
  
  @Nullable
  private final Path symlinkTarget;
  
  @NotNull
  private final Map extras;
  
  private static final long a = o3.a(8372277433439206828L, -3455356720802191347L, MethodHandles.lookup().lookupClass()).a(183490265767104L);
  
  public final boolean isDirectory() {
    return this.isDirectory;
  }
  
  @Nullable
  public final Path getSymlinkTarget() {
    return this.symlinkTarget;
  }
  
  @Nullable
  public final Long getSize() {
    return this.size;
  }
  
  @NotNull
  public final Map getExtras() {
    return this.extras;
  }
  
  @Nullable
  public final Long getLastAccessedAtMillis() {
    return this.lastAccessedAtMillis;
  }
  
  public FileMetadata(boolean paramBoolean1, boolean paramBoolean2, @Nullable Path paramPath, @Nullable Long paramLong1, @Nullable Long paramLong2, @Nullable Long paramLong3, @Nullable Long paramLong4, @NotNull Map paramMap) {
    this.isRegularFile = paramBoolean1;
    this.isDirectory = paramBoolean2;
    this.symlinkTarget = paramPath;
    this.size = paramLong1;
    this.createdAtMillis = paramLong2;
    this.lastModifiedAtMillis = paramLong3;
    this.lastAccessedAtMillis = paramLong4;
    this.extras = MapsKt.toMap(paramMap);
  }
  
  public FileMetadata() {
    this(false, false, null, null, null, null, null, null, 255, null);
  }
  
  @Nullable
  public final Long getCreatedAtMillis() {
    return this.createdAtMillis;
  }
  
  @NotNull
  public String toString() {
    long l = a ^ 0x64E62976FA1AL;
    boolean bool1 = false;
    ArrayList<String> arrayList = new ArrayList();
    if (this.isRegularFile) {
      ArrayList<String> arrayList1 = arrayList;
      String str = "isRegularFile";
      boolean bool = false;
      arrayList1.add(str);
    } 
    if (this.isDirectory) {
      ArrayList<String> arrayList1 = arrayList;
      String str = "isDirectory";
      boolean bool = false;
      arrayList1.add(str);
    } 
    if (this.size != null) {
      ArrayList<String> arrayList1 = arrayList;
      String str = Intrinsics.stringPlus("byteCount=", this.size);
      boolean bool = false;
      arrayList1.add(str);
    } 
    if (this.createdAtMillis != null) {
      ArrayList<String> arrayList1 = arrayList;
      String str = Intrinsics.stringPlus("createdAt=", this.createdAtMillis);
      boolean bool = false;
      arrayList1.add(str);
    } 
    if (this.lastModifiedAtMillis != null) {
      ArrayList<String> arrayList1 = arrayList;
      String str = Intrinsics.stringPlus("lastModifiedAt=", this.lastModifiedAtMillis);
      boolean bool = false;
      arrayList1.add(str);
    } 
    if (this.lastAccessedAtMillis != null) {
      ArrayList<String> arrayList1 = arrayList;
      String str = Intrinsics.stringPlus("lastAccessedAt=", this.lastAccessedAtMillis);
      boolean bool = false;
      arrayList1.add(str);
    } 
    Map map = this.extras;
    boolean bool2 = false;
    try {
      if (!map.isEmpty()) {
        ArrayList<String> arrayList1 = arrayList;
        String str = Intrinsics.stringPlus("extras=", this.extras);
        boolean bool = false;
        arrayList1.add(str);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
  }
  
  @Nullable
  public final Long getLastModifiedAtMillis() {
    return this.lastModifiedAtMillis;
  }
  
  public final boolean isRegularFile() {
    return this.isRegularFile;
  }
  
  @Nullable
  public final Object extra(@NotNull KClass paramKClass) {
    long l = a ^ 0x1F36863C1A12L;
    Intrinsics.checkNotNullParameter(paramKClass, "type");
    Object object2 = this.extras.get(paramKClass);
    try {
      if (object2 == null)
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Object object1 = object2;
    return KClasses.cast(paramKClass, object1);
  }
  
  @NotNull
  public final FileMetadata copy(boolean paramBoolean1, boolean paramBoolean2, @Nullable Path paramPath, @Nullable Long paramLong1, @Nullable Long paramLong2, @Nullable Long paramLong3, @Nullable Long paramLong4, @NotNull Map paramMap) {
    long l = a ^ 0x55A23747DD78L;
    Intrinsics.checkNotNullParameter(paramMap, "extras");
    return new FileMetadata(paramBoolean1, paramBoolean2, paramPath, paramLong1, paramLong2, paramLong3, paramLong4, paramMap);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\FileMetadata.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
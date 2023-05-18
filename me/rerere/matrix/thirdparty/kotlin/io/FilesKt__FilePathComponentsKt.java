package me.rerere.matrix.thirdparty.kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.CollectionsKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.text.StringsKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public class FilesKt__FilePathComponentsKt {
  private static final long a = o3.a(3149018822867593338L, -6620894008970330523L, null).a(2754472248103L);
  
  public static final boolean isRooted(@NotNull File paramFile) {
    long l = a ^ 0x6615B78902BDL;
    try {
      Intrinsics.checkNotNullParameter(paramFile, "<this>");
      Intrinsics.checkNotNullExpressionValue(paramFile.getPath(), "path");
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (getRootLength$FilesKt__FilePathComponentsKt(paramFile.getPath()) > 0);
  }
  
  @NotNull
  public static final String getRootName(@NotNull File paramFile) {
    long l = a ^ 0x15958AA9842CL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    Intrinsics.checkNotNullExpressionValue(paramFile.getPath(), "path");
    String str = paramFile.getPath();
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(paramFile.getPath(), "path");
    int i = getRootLength$FilesKt__FilePathComponentsKt(paramFile.getPath());
    Intrinsics.checkNotNullExpressionValue(str.substring(bool, i), "this as java.lang.String…ing(startIndex, endIndex)");
    return str.substring(bool, i);
  }
  
  @NotNull
  public static final FilePathComponents toComponents(@NotNull File paramFile) {
    long l = a ^ 0x3A0E9AEEA45EL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    String str1 = paramFile.getPath();
    Intrinsics.checkNotNullExpressionValue(str1, "path");
    int i = getRootLength$FilesKt__FilePathComponentsKt(str1);
    String str3 = str1;
    boolean bool = false;
    Intrinsics.checkNotNullExpressionValue(str3.substring(bool, i), "this as java.lang.String…ing(startIndex, endIndex)");
    String str2 = str3.substring(bool, i);
    Intrinsics.checkNotNullExpressionValue(str1.substring(i), "this as java.lang.String).substring(startIndex)");
    str3 = str1.substring(i);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      char[] arrayOfChar = new char[1];
      arrayOfChar[0] = File.separatorChar;
      List list1 = StringsKt.split$default(str3, arrayOfChar, false, 0, 6, null);
      boolean bool1 = false;
      List list2 = list1;
      ArrayList<File> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
      boolean bool2 = false;
      for (String str4 : list2) {
        String str5 = str4;
        ArrayList<File> arrayList1 = arrayList;
        boolean bool3 = false;
        arrayList1.add(new File(str5));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List list = ((((CharSequence)str3).length() == 0)) ? CollectionsKt.emptyList() : arrayList;
    return new FilePathComponents(new File(str2), list);
  }
  
  @NotNull
  public static final File subPath(@NotNull File paramFile, int paramInt1, int paramInt2) {
    long l = a ^ 0x6A02CA63B8FEL;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    return FilesKt.toComponents(paramFile).subPath(paramInt1, paramInt2);
  }
  
  @NotNull
  public static final File getRoot(@NotNull File paramFile) {
    long l = a ^ 0x1CA5D8270DC0L;
    Intrinsics.checkNotNullParameter(paramFile, "<this>");
    return new File(FilesKt.getRootName(paramFile));
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\io\FilesKt__FilePathComponentsKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
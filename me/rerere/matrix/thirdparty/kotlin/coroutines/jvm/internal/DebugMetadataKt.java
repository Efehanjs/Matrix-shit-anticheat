package me.rerere.matrix.thirdparty.kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public final class DebugMetadataKt {
  private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;
  
  private static final long a = o3.a(-5466229275304006509L, 7867388171717567732L, null).a(83933965040692L);
  
  @SinceKotlin(version = "1.3")
  @Nullable
  public static final StackTraceElement getStackTraceElement(@NotNull BaseContinuationImpl paramBaseContinuationImpl) {
    DebugMetadata debugMetadata;
    long l = a ^ 0x6DCD991E29C7L;
    try {
      Intrinsics.checkNotNullParameter(paramBaseContinuationImpl, "<this>");
      if (getDebugMetadataAnnotation(paramBaseContinuationImpl) == null) {
        getDebugMetadataAnnotation(paramBaseContinuationImpl);
        return null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    checkDebugMetadataVersion(1, debugMetadata.v());
    int i = getLabel(paramBaseContinuationImpl);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    boolean bool = (i < 0) ? true : debugMetadata.l()[i];
    String str1 = ModuleNameRetriever.INSTANCE.getModuleName(paramBaseContinuationImpl);
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    String str2 = (str1 == null) ? debugMetadata.c() : (str1 + '/' + debugMetadata.c());
    return new StackTraceElement(str2, debugMetadata.m(), debugMetadata.f(), bool);
  }
  
  @SinceKotlin(version = "1.3")
  @Nullable
  public static final String[] getSpilledVariableFieldMapping(@NotNull BaseContinuationImpl paramBaseContinuationImpl) {
    DebugMetadata debugMetadata;
    long l = a ^ 0x449E67AB560CL;
    try {
      Intrinsics.checkNotNullParameter(paramBaseContinuationImpl, "<this>");
      if (getDebugMetadataAnnotation(paramBaseContinuationImpl) == null) {
        getDebugMetadataAnnotation(paramBaseContinuationImpl);
        return null;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    checkDebugMetadataVersion(1, debugMetadata.v());
    ArrayList<String> arrayList1 = new ArrayList();
    int i = getLabel(paramBaseContinuationImpl);
    int[] arrayOfInt = debugMetadata.i();
    byte b = 0;
    int j = arrayOfInt.length;
    while (b < j) {
      byte b1 = b;
      int k = arrayOfInt[b];
      try {
        if (k == i) {
          arrayList1.add(debugMetadata.s()[b1]);
          arrayList1.add(debugMetadata.n()[b1]);
        } 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      b++;
    } 
    ArrayList<String> arrayList2 = arrayList1;
    b = 0;
    ArrayList<String> arrayList3 = arrayList2;
    Intrinsics.checkNotNull(arrayList3.toArray(new String[0]), "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    return arrayList3.toArray(new String[0]);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\coroutines\jvm\internal\DebugMetadataKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
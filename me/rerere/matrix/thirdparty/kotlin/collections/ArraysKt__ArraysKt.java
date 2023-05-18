package me.rerere.matrix.thirdparty.kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Pair;
import me.rerere.matrix.thirdparty.kotlin.PublishedApi;
import me.rerere.matrix.thirdparty.kotlin.SinceKotlin;
import me.rerere.matrix.thirdparty.kotlin.TuplesKt;
import me.rerere.matrix.thirdparty.kotlin.UByteArray;
import me.rerere.matrix.thirdparty.kotlin.UIntArray;
import me.rerere.matrix.thirdparty.kotlin.ULongArray;
import me.rerere.matrix.thirdparty.kotlin.UShortArray;
import me.rerere.matrix.thirdparty.kotlin.collections.unsigned.UArraysKt;
import me.rerere.matrix.thirdparty.kotlin.internal.InlineOnly;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.kotlin.ranges.RangesKt;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

public class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
  private static final long b = o3.a(-9157622476052283816L, 687681705609656995L, null).a(211981034119775L);
  
  @NotNull
  public static final List flatten(@NotNull Object[][] paramArrayOfObject) {
    long l = b ^ 0x31D1DD5E187CL;
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Object[] arrayOfObject = (Object[])paramArrayOfObject;
    int i = 0;
    byte b2 = 0;
    int j = arrayOfObject.length;
    while (b2 < j) {
      Object object = arrayOfObject[b2];
      Object[] arrayOfObject1 = (Object[])object;
      int m = i;
      boolean bool = false;
      int n = arrayOfObject1.length;
      i = m + n;
      b2++;
    } 
    int k = i;
    ArrayList arrayList = new ArrayList(k);
    byte b1 = 0;
    i = ((Object[])paramArrayOfObject).length;
    while (b1 < i) {
      Object[] arrayOfObject1 = paramArrayOfObject[b1];
      CollectionsKt.addAll(arrayList, arrayOfObject1);
      b1++;
    } 
    return arrayList;
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  public static final boolean contentDeepEquals(@Nullable Object[] paramArrayOfObject1, @Nullable Object[] paramArrayOfObject2) {
    try {
      if (paramArrayOfObject1 == paramArrayOfObject2)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramArrayOfObject1 != null)
        try {
          if (paramArrayOfObject2 != null)
            try {
              if (paramArrayOfObject1.length == paramArrayOfObject2.length) {
                byte b = 0;
                int i = paramArrayOfObject1.length;
                while (b < i) {
                  Object object1 = paramArrayOfObject1[b];
                  Object object2 = paramArrayOfObject2[b];
                  try {
                    if (object1 == object2)
                      continue; 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  try {
                    if (object1 != null)
                      try {
                        if (object2 != null) {
                          try {
                            if (object1 instanceof Object[] && object2 instanceof Object[]) {
                              Object[] arrayOfObject1 = (Object[])object1;
                              Object[] arrayOfObject2 = (Object[])object2;
                              try {
                                if (!ArraysKt.contentDeepEquals(arrayOfObject1, arrayOfObject2))
                                  return false; 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              } 
                              continue;
                            } 
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof byte[])
                              try {
                                if (object2 instanceof byte[]) {
                                  try {
                                    if (!Arrays.equals((byte[])object1, (byte[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof short[])
                              try {
                                if (object2 instanceof short[]) {
                                  try {
                                    if (!Arrays.equals((short[])object1, (short[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof int[])
                              try {
                                if (object2 instanceof int[]) {
                                  try {
                                    if (!Arrays.equals((int[])object1, (int[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof long[])
                              try {
                                if (object2 instanceof long[]) {
                                  try {
                                    if (!Arrays.equals((long[])object1, (long[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof float[])
                              try {
                                if (object2 instanceof float[]) {
                                  try {
                                    if (!Arrays.equals((float[])object1, (float[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof double[])
                              try {
                                if (object2 instanceof double[]) {
                                  try {
                                    if (!Arrays.equals((double[])object1, (double[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof char[])
                              try {
                                if (object2 instanceof char[]) {
                                  try {
                                    if (!Arrays.equals((char[])object1, (char[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof boolean[])
                              try {
                                if (object2 instanceof boolean[]) {
                                  try {
                                    if (!Arrays.equals((boolean[])object1, (boolean[])object2))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof UByteArray)
                              try {
                                if (object2 instanceof UByteArray) {
                                  try {
                                    if (!UArraysKt.contentEquals-kV0jMPg(((UByteArray)object1).unbox-impl(), ((UByteArray)object2).unbox-impl()))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof UShortArray)
                              try {
                                if (object2 instanceof UShortArray) {
                                  try {
                                    if (!UArraysKt.contentEquals-FGO6Aew(((UShortArray)object1).unbox-impl(), ((UShortArray)object2).unbox-impl()))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof UIntArray)
                              try {
                                if (object2 instanceof UIntArray) {
                                  try {
                                    if (!UArraysKt.contentEquals-KJPZfPQ(((UIntArray)object1).unbox-impl(), ((UIntArray)object2).unbox-impl()))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (object1 instanceof ULongArray)
                              try {
                                if (object2 instanceof ULongArray) {
                                  try {
                                    if (!UArraysKt.contentEquals-lec5QzE(((ULongArray)object1).unbox-impl(), ((ULongArray)object2).unbox-impl()))
                                      return false; 
                                  } catch (RuntimeException runtimeException) {
                                    throw a(null);
                                  } 
                                  continue;
                                } 
                              } catch (RuntimeException runtimeException) {
                                throw a(null);
                              }  
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          try {
                            if (!Intrinsics.areEqual(object1, object2))
                              return false; 
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          } 
                          continue;
                        } 
                        return false;
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      }  
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  return false;
                  b++;
                } 
                return true;
              } 
              return false;
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  @SinceKotlin(version = "1.3")
  @PublishedApi
  @NotNull
  public static final String contentDeepToString(@Nullable Object[] paramArrayOfObject) {
    long l = b ^ 0x7CF31AB7D1AEL;
    try {
      if (paramArrayOfObject == null)
        return "null"; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = RangesKt.coerceAtMost(paramArrayOfObject.length, 429496729) * 5 + 2;
    StringBuilder stringBuilder1 = new StringBuilder(i);
    StringBuilder stringBuilder2 = stringBuilder1;
    boolean bool = false;
    contentDeepToStringInternal$ArraysKt__ArraysKt(paramArrayOfObject, stringBuilder2, new ArrayList());
    Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "StringBuilder(capacity).…builderAction).toString()");
    return stringBuilder1.toString();
  }
  
  @NotNull
  public static final Pair unzip(@NotNull Pair[] paramArrayOfPair) {
    long l = b ^ 0x234FD4AF4213L;
    Intrinsics.checkNotNullParameter(paramArrayOfPair, "<this>");
    ArrayList<Object> arrayList1 = new ArrayList(paramArrayOfPair.length);
    ArrayList<Object> arrayList2 = new ArrayList(paramArrayOfPair.length);
    byte b = 0;
    int i = paramArrayOfPair.length;
    while (b < i) {
      Pair pair = paramArrayOfPair[b];
      arrayList1.add(pair.getFirst());
      arrayList2.add(pair.getSecond());
      b++;
    } 
    return TuplesKt.to(arrayList1, arrayList2);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\collections\ArraysKt__ArraysKt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
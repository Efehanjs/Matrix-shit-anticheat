package me.rerere.matrix.thirdparty.kotlin.jvm.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import me.rerere.matrix.internal.o3;

public class TypeIntrinsics {
  private static final long a = o3.a(-8824528244135164329L, -7512420606773561417L, null).a(27218611977776L);
  
  public static Collection asMutableCollection(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableCollection))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToCollection(paramObject);
  }
  
  public static List castToList(Object paramObject) {
    try {
      return (List)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static List asMutableList(Object paramObject) {
    long l = a ^ 0x633F7090F942L;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableList))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableList"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToList(paramObject);
  }
  
  public static boolean isMutableList(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/util/List
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableList
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static Map asMutableMap(Object paramObject) {
    long l = a ^ 0xEB69C3C3A81L;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableMap))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableMap"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToMap(paramObject);
  }
  
  public static Iterator castToIterator(Object paramObject) {
    try {
      return (Iterator)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static boolean isMutableIterable(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/lang/Iterable
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableIterable
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static boolean isMutableCollection(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/util/Collection
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableCollection
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static ListIterator asMutableListIterator(Object paramObject) {
    long l = a ^ 0x2087290B5DC7L;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableListIterator))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableListIterator"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToListIterator(paramObject);
  }
  
  public static Set asMutableSet(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableSet))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToSet(paramObject);
  }
  
  public static Set castToSet(Object paramObject) {
    try {
      return (Set)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static Object beforeCheckcastToFunctionOfArity(Object paramObject, int paramInt) {
    long l = a ^ 0x7333D56B7396L;
    try {
      if (paramObject != null)
        try {
          if (!isFunctionOfArity(paramObject, paramInt))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function" + paramInt); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return paramObject;
  }
  
  public static ClassCastException throwCce(ClassCastException paramClassCastException) {
    throw (ClassCastException)sanitizeStackTrace(paramClassCastException);
  }
  
  public static boolean isMutableListIterator(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/util/ListIterator
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableListIterator
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static boolean isMutableMap(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/util/Map
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableMap
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static Map castToMap(Object paramObject) {
    try {
      return (Map)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static Collection castToCollection(Object paramObject) {
    try {
      return (Collection)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static void throwCce(String paramString) {
    throw throwCce(new ClassCastException(paramString));
  }
  
  public static Iterable asMutableIterable(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterable))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToIterable(paramObject);
  }
  
  public static Collection asMutableCollection(Object paramObject) {
    long l = a ^ 0x2B79CC44444CL;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableCollection))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableCollection"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToCollection(paramObject);
  }
  
  public static Iterator asMutableIterator(Object paramObject) {
    long l = a ^ 0x7FAE5A8F14C5L;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterator))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableIterator"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToIterator(paramObject);
  }
  
  public static boolean isMutableIterator(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/util/Iterator
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableIterator
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static boolean isMutableMapEntry(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/util/Map$Entry
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableMap$Entry
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static ListIterator asMutableListIterator(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableListIterator))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToListIterator(paramObject);
  }
  
  public static Iterable asMutableIterable(Object paramObject) {
    long l = a ^ 0x51B8F234D718L;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterable))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableIterable"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToIterable(paramObject);
  }
  
  public static Set asMutableSet(Object paramObject) {
    long l = a ^ 0x306FE0154479L;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableSet))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableSet"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToSet(paramObject);
  }
  
  public static List asMutableList(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableList))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToList(paramObject);
  }
  
  public static Iterator asMutableIterator(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableIterator))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToIterator(paramObject);
  }
  
  public static Map asMutableMap(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableMap))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToMap(paramObject);
  }
  
  public static boolean isFunctionOfArity(Object paramObject, int paramInt) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.Function)
        try {
          if (getFunctionArity(paramObject) == paramInt);
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean isMutableSet(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof java/util/Set
    //   4: ifeq -> 43
    //   7: aload_0
    //   8: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMappedMarker
    //   11: ifeq -> 35
    //   14: goto -> 21
    //   17: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   20: athrow
    //   21: aload_0
    //   22: instanceof me/rerere/matrix/thirdparty/kotlin/jvm/internal/markers/KMutableSet
    //   25: ifeq -> 43
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   34: athrow
    //   35: iconst_1
    //   36: goto -> 44
    //   39: invokestatic a : (Ljava/lang/ClassCastException;)Ljava/lang/ClassCastException;
    //   42: athrow
    //   43: iconst_0
    //   44: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	14	17	java/lang/ClassCastException
    //   7	28	31	java/lang/ClassCastException
    //   21	39	39	java/lang/ClassCastException
  }
  
  public static Map.Entry asMutableMapEntry(Object paramObject) {
    long l = a ^ 0x121FDA9F01F5L;
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableMap.Entry))
            throwCce(paramObject, "me.rerere.matrix.thirdparty.kotlin.collections.MutableMap.MutableEntry"); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToMapEntry(paramObject);
  }
  
  public static Map.Entry asMutableMapEntry(Object paramObject, String paramString) {
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMappedMarker)
        try {
          if (!(paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.internal.markers.KMutableMap.Entry))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return castToMapEntry(paramObject);
  }
  
  public static int getFunctionArity(Object paramObject) {
    try {
      if (paramObject instanceof FunctionBase)
        return ((FunctionBase)paramObject).getArity(); 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function0)
        return 0; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function1)
        return 1; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2)
        return 2; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function3)
        return 3; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function4)
        return 4; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function5)
        return 5; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function6)
        return 6; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function7)
        return 7; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function8)
        return 8; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function9)
        return 9; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function10)
        return 10; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function11)
        return 11; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function12)
        return 12; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function13)
        return 13; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function14)
        return 14; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function15)
        return 15; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function16)
        return 16; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function17)
        return 17; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function18)
        return 18; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function19)
        return 19; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function20)
        return 20; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function21)
        return 21; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    try {
      if (paramObject instanceof me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function22)
        return 22; 
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return -1;
  }
  
  public static Object beforeCheckcastToFunctionOfArity(Object paramObject, int paramInt, String paramString) {
    try {
      if (paramObject != null)
        try {
          if (!isFunctionOfArity(paramObject, paramInt))
            throwCce(paramString); 
        } catch (ClassCastException classCastException) {
          throw a(null);
        }  
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    return paramObject;
  }
  
  public static ListIterator castToListIterator(Object paramObject) {
    try {
      return (ListIterator)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static Map.Entry castToMapEntry(Object paramObject) {
    try {
      return (Map.Entry)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static Iterable castToIterable(Object paramObject) {
    try {
      return (Iterable)paramObject;
    } catch (ClassCastException classCastException) {
      throw throwCce(classCastException);
    } 
  }
  
  public static void throwCce(Object paramObject, String paramString) {
    long l = a ^ 0x4517ABE99F0AL;
    try {
    
    } catch (ClassCastException classCastException) {
      throw a(null);
    } 
    String str = (paramObject == null) ? "null" : paramObject.getClass().getName();
    throwCce(str + " cannot be cast to " + paramString);
  }
  
  private static ClassCastException a(ClassCastException paramClassCastException) {
    return paramClassCastException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\kotlin\jvm\internal\TypeIntrinsics.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */
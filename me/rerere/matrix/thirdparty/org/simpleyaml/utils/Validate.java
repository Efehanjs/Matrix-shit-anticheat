package me.rerere.matrix.thirdparty.org.simpleyaml.utils;

import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import me.rerere.matrix.internal.o3;

public class Validate {
  private static final long a = o3.a(-504279664212166678L, -853574025023487289L, MethodHandles.lookup().lookupClass()).a(41494915127193L);
  
  public static void notNull(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        throw new IllegalArgumentException(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static void notEmpty(Object[] paramArrayOfObject) {
    long l = a ^ 0x2C422482C3C9L;
    notEmpty(paramArrayOfObject, "The validated array is empty");
  }
  
  public static void isTrue(boolean paramBoolean, String paramString, Object paramObject) {
    try {
      if (!paramBoolean)
        throw new IllegalArgumentException(paramString + paramObject); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static void notEmpty(Map paramMap, String paramString) {
    try {
      if (paramMap != null)
        try {
          if (paramMap.size() != 0)
            return; 
          throw new IllegalArgumentException(paramString);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(paramString);
  }
  
  public static void isTrue(boolean paramBoolean) {
    long l = a ^ 0x1D3901C1547AL;
    try {
      if (!paramBoolean)
        throw new IllegalArgumentException("The validated expression is false"); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static void noNullElements(Collection paramCollection) {
    long l = a ^ 0x1006B88B5F16L;
    notNull(paramCollection);
    byte b = 0;
    Iterator iterator = paramCollection.iterator();
    while (true) {
      try {
        if (iterator.hasNext()) {
          try {
            if (iterator.next() == null)
              throw new IllegalArgumentException("The validated collection contains null element at index: " + b); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  public static void allElementsOfType(Collection paramCollection, Class paramClass) {
    long l = a ^ 0x5234C962F7D7L;
    notNull(paramCollection);
    notNull(paramClass);
    byte b = 0;
    Iterator iterator = paramCollection.iterator();
    while (true) {
      try {
        if (iterator.hasNext()) {
          try {
            if (!paramClass.isInstance(iterator.next()))
              throw new IllegalArgumentException("The validated collection contains an element not of type " + paramClass.getName() + " at index: " + b); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  public static void noNullElements(Object[] paramArrayOfObject) {
    long l = a ^ 0x62BA49F107ACL;
    notNull(paramArrayOfObject);
    byte b = 0;
    while (true) {
      try {
        if (b < paramArrayOfObject.length) {
          try {
            if (paramArrayOfObject[b] == null)
              throw new IllegalArgumentException("The validated array contains null element at index: " + b); 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          b++;
          continue;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      break;
    } 
  }
  
  public static void allElementsOfType(Collection paramCollection, Class paramClass, String paramString) {
    notNull(paramCollection);
    notNull(paramClass);
    for (Object object : paramCollection) {
      try {
        if (!paramClass.isInstance(object))
          throw new IllegalArgumentException(paramString); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public static void notEmpty(Map paramMap) {
    long l = a ^ 0x61F56EDF5963L;
    notEmpty(paramMap, "The validated map is empty");
  }
  
  public static void isTrue(boolean paramBoolean, String paramString) {
    try {
      if (!paramBoolean)
        throw new IllegalArgumentException(paramString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static void noNullElements(Object[] paramArrayOfObject, String paramString) {
    notNull(paramArrayOfObject);
    for (Object object : paramArrayOfObject) {
      try {
        if (object == null)
          throw new IllegalArgumentException(paramString); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public static void notEmpty(Object[] paramArrayOfObject, String paramString) {
    try {
      if (paramArrayOfObject != null)
        try {
          if (paramArrayOfObject.length != 0)
            return; 
          throw new IllegalArgumentException(paramString);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(paramString);
  }
  
  public static void notEmpty(Collection paramCollection) {
    long l = a ^ 0x517A145A7625L;
    notEmpty(paramCollection, "The validated collection is empty");
  }
  
  public static void notEmpty(Collection paramCollection, String paramString) {
    try {
      if (paramCollection != null)
        try {
          if (paramCollection.size() != 0)
            return; 
          throw new IllegalArgumentException(paramString);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(paramString);
  }
  
  public static void isTrue(boolean paramBoolean, String paramString, long paramLong) {
    try {
      if (!paramBoolean)
        throw new IllegalArgumentException(paramString + paramLong); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static void notEmpty(String paramString) {
    long l = a ^ 0x76740722A0E3L;
    notEmpty(paramString, "The validated string is empty");
  }
  
  public static void noNullElements(Collection paramCollection, String paramString) {
    notNull(paramCollection);
    for (Object object : paramCollection) {
      try {
        if (object == null)
          throw new IllegalArgumentException(paramString); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
  }
  
  public static void isTrue(boolean paramBoolean, String paramString, double paramDouble) {
    try {
      if (!paramBoolean)
        throw new IllegalArgumentException(paramString + paramDouble); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static void notEmpty(String paramString1, String paramString2) {
    try {
      if (paramString1 != null)
        try {
          if (paramString1.length() != 0)
            return; 
          throw new IllegalArgumentException(paramString2);
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(paramString2);
  }
  
  public static void notNull(Object paramObject) {
    long l = a ^ 0x24E59BD641F6L;
    notNull(paramObject, "The validated object is null");
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\simpleyam\\utils\Validate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
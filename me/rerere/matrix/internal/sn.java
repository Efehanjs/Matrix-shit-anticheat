package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class sn {
  @NotNull
  public static final sn b;
  
  @NotNull
  private static final String i;
  
  private static final long a = o3.a(-1425710799659972301L, 6786107625250154058L, MethodHandles.lookup().lookupClass()).a(122250276772689L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  static {
    long l = a ^ 0xE094C87257EL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "À\000?¼8\036.&YÿÔíÐ¾\006cf¸\\iÍ>ÏçhDJç&ä8±=&ãqð4¯\032Õ|\020(¾Cø@]r)3f\0012.pßs1³aþZ)\007«8TgÛ!Îd (\004Ñ±9r\021e¡Á%N×\023É\022ç^_¶¦~u+(¿d­Í:ïuñÔWËÉ2\000\006båFZÆ\016\"}\032j1å°\032Ézî7\r`î¾)<­%¼\026Fñ'/ó¦¹],èy\030pî¶\013jªú@?\007\002ðìÜ\034\b \007gí-M,G\rúbìÀNö\027-Z¿ÜI\034âmÕË\f×¨\036²må§\003&c\017S@¡Öõ\035c}q#\000\022ñÕ{[QÇÜËô¶\027È&\0134\020eDB-(Ð\035Gt§MµØÏ\016\007¡MÀ¬º±!áíì¸\033¢~ö\tn\002>áØ©ù\002ðàºuhQlQ%CÖ}Z÷¼±¾õ\"(éLL-2æû÷;Í\022\"j\024}qÁqIíy\021)¡¶(Å\024_SÃJ¥ìE\b\024! æ üàwÛ¦i\024þ\001~N7ÿ:¼Ýª\026Gm¤w>_À%È\02340\rû3/AG\0234ò=Úï\027ØÝuI->#0N¶\026ÑàE¼\025U.stm:[BýF\036HFP¨áu\024Ö\020\tÁ5;JØYnkd-ZI\020ÆRÒÑ¥@Ì¶5æ¯e!yåÇÚâ©)\017åÃNL\nuk0p@ª+\023þ`V\006\\¥½]Ò:Ö;Dw~@\t\035ìó").length();
    byte b2 = 120;
    byte b = -1;
    while (true);
  }
  
  public static final void main(@NotNull String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sn.a : J
    //   3: ldc2_w 102011447396260
    //   6: lxor
    //   7: lstore_1
    //   8: new me/rerere/matrix/thirdparty/kotlin/text/Regex
    //   11: dup
    //   12: sipush #2512
    //   15: ldc2_w 2068937733489080493
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   25: invokespecial <init> : (Ljava/lang/String;)V
    //   28: sipush #3155
    //   31: ldc2_w 7215882747408203051
    //   34: lload_1
    //   35: lxor
    //   36: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   41: checkcast java/lang/CharSequence
    //   44: invokevirtual matches : (Ljava/lang/CharSequence;)Z
    //   47: istore_3
    //   48: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   51: iload_3
    //   52: invokevirtual println : (Z)V
    //   55: return
  }
  
  public static final void b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/sn.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 39234037523206
    //   11: lxor
    //   12: lstore_2
    //   13: dup2
    //   14: ldc2_w 115368979723630
    //   17: lxor
    //   18: lstore #4
    //   20: pop2
    //   21: getstatic me/rerere/matrix/internal/eb.v : Lme/rerere/matrix/internal/eb;
    //   24: lload_2
    //   25: invokevirtual h : (J)Z
    //   28: ifne -> 81
    //   31: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   34: new java/lang/StringBuilder
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: ldc ''
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: getstatic org/bukkit/ChatColor.GREEN : Lorg/bukkit/ChatColor;
    //   49: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   52: sipush #18951
    //   55: ldc2_w 2972737192268879633
    //   58: lload_0
    //   59: lxor
    //   60: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   65: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual toString : ()Ljava/lang/String;
    //   71: lload #4
    //   73: invokevirtual b : (Ljava/lang/String;J)V
    //   76: return
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: nop
    //   82: invokestatic getRootLogger : ()Lorg/apache/logging/log4j/Logger;
    //   85: dup
    //   86: sipush #2567
    //   89: ldc2_w 1159921174296205079
    //   92: lload_0
    //   93: lxor
    //   94: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   99: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   102: checkcast org/apache/logging/log4j/core/Logger
    //   105: astore #6
    //   107: ldc org/apache/logging/log4j/core/filter/RegexFilter
    //   109: invokevirtual getDeclaredConstructors : ()[Ljava/lang/reflect/Constructor;
    //   112: iconst_0
    //   113: aaload
    //   114: astore #8
    //   116: aload #8
    //   118: astore #9
    //   120: iconst_0
    //   121: istore #10
    //   123: aload #9
    //   125: iconst_1
    //   126: invokevirtual setAccessible : (Z)V
    //   129: aload #8
    //   131: astore #7
    //   133: aload #7
    //   135: iconst_4
    //   136: anewarray java/lang/Object
    //   139: astore #9
    //   141: aload #9
    //   143: iconst_0
    //   144: iconst_1
    //   145: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   148: aastore
    //   149: aload #9
    //   151: iconst_1
    //   152: sipush #20128
    //   155: ldc2_w 2143649758207824824
    //   158: lload_0
    //   159: lxor
    //   160: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   165: iconst_2
    //   166: invokestatic compile : (Ljava/lang/String;I)Ljava/util/regex/Pattern;
    //   169: aastore
    //   170: aload #9
    //   172: iconst_2
    //   173: getstatic org/apache/logging/log4j/core/Filter$Result.DENY : Lorg/apache/logging/log4j/core/Filter$Result;
    //   176: aastore
    //   177: aload #9
    //   179: iconst_3
    //   180: getstatic org/apache/logging/log4j/core/Filter$Result.NEUTRAL : Lorg/apache/logging/log4j/core/Filter$Result;
    //   183: aastore
    //   184: aload #9
    //   186: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   189: astore #8
    //   191: aload #6
    //   193: aload #8
    //   195: sipush #9658
    //   198: ldc2_w 8061866420462794921
    //   201: lload_0
    //   202: lxor
    //   203: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   208: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
    //   211: aload #8
    //   213: checkcast org/apache/logging/log4j/core/Filter
    //   216: invokevirtual addFilter : (Lorg/apache/logging/log4j/core/Filter;)V
    //   219: sipush #16650
    //   222: ldc2_w 4014748615139482655
    //   225: lload_0
    //   226: lxor
    //   227: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   232: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   235: swap
    //   236: invokevirtual println : (Ljava/lang/Object;)V
    //   239: goto -> 275
    //   242: astore #6
    //   244: sipush #11493
    //   247: aload #6
    //   249: invokevirtual printStackTrace : ()V
    //   252: ldc2_w 9049849392001921527
    //   255: lload_0
    //   256: lxor
    //   257: <illegal opcode> i : (IJ)Ljava/lang/String;
    //   262: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   265: swap
    //   266: invokevirtual println : (Ljava/lang/Object;)V
    //   269: ldc2_w 1000
    //   272: invokestatic sleep : (J)V
    //   275: return
    // Exception table:
    //   from	to	target	type
    //   21	77	77	java/lang/Exception
    //   81	239	242	java/lang/Exception
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5F67;
    if (d[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])e.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          e.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/sn", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 104
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w 'me/rerere/matrix/internal/sn'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: ldc_w ' : '
    //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: aload_1
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc_w ' : '
    //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_2
    //   89: invokevirtual toString : ()Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: aload #4
    //   100: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   103: athrow
    //   104: aload_3
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
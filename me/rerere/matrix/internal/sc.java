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
import me.rerere.matrix.Matrix;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

@Deprecated(message = "Use PluginCloud API instead")
public final class sc {
  @JvmField
  @NotNull
  public static String v;
  
  @NotNull
  public static final sc b;
  
  @NotNull
  private static final String i;
  
  private static String[] a;
  
  private static final long c = o3.a(252983810426254438L, -5691105525346583333L, MethodHandles.lookup().lookupClass()).a(199862391548750L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  static {
    c(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    String str;
    int i = (str = "Cÿ½>iõJô¤Ö¯R\024_\020{@î^æ\000«áôÚþ1c£\"8¸ñq;·ö4ü8I5[aÚ¾G\037hvl\036P\033wôJCi |\026[¶'­Í®&ÐS£¼¿¼²Whí{o5\006\ni÷6ð\000Õ¬ÎÜúpØÕv·\005,v³LQïy\tùü¥\027ey+ºnèÝH0}ÌâÞ«AÜ\021BSÀê\036nX_Q<0\\¹Ä\nîJ|[+$7ø\001ºéÂä]UdPê1'1WíÂî(8\004yß\020É¯%öòÄ5$Öck)\036ÔöÐëÿO+]áP¥ið³òeJx&Ù¥}õ\017í\032\034¬ìÁL%ír@E{\022%ý\024uE~?¬3i®Q^ua½D«\006v¿åÙ6Dt9 \023gRh@±É³#\024¤6º?×K}!\036*1\013µ\026ñkû±m TXF\"hø\006\n0g2_Åì(¶ ÕbP¬Ï3Ôd»FYV\005À#Ü¢¹\0050áõ¿éÖp´-¤µÔtyò,\fª ³OBÕ«zå\te`d7@´6½&ýeö'Ü\027X»FÌQ¨¼¨I\006\030N¶ëÒcù7wv\025\020/ÀM\032Q÷_V\016\030\f\006M(²\017È¼;è\033\007\026¤O£k²ô]-Ô\036ÛDò\tgÉJ«\b\035\017ðæªÃf:¯ 9\005\0000\037®[¬\004EpE)hKn:ö\031¿o Ï1®êèU0\020É\025ýgË«Ý·÷14C'Öç¨8'\031uú\0224Ó\035\033IàAoÒJå U«|\0321pb\t\rÓù¤Ùù!ÖYëÆrV8yyLe®b}o{:=").length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  public static final void j(long paramLong) {
    paramLong = c ^ paramLong;
    long l = paramLong ^ 0x4A1EED3E8947L;
    try {
      if (!ge.o)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Runnable runnable = () -> {
        // Byte code:
        //   0: getstatic me/rerere/matrix/internal/sc.c : J
        //   3: ldc2_w 96792921033549
        //   6: lxor
        //   7: lstore_0
        //   8: lload_0
        //   9: dup2
        //   10: ldc2_w 10441047270251
        //   13: lxor
        //   14: lstore_2
        //   15: dup2
        //   16: ldc2_w 112416870730194
        //   19: lxor
        //   20: dup2
        //   21: bipush #32
        //   23: lushr
        //   24: l2i
        //   25: istore #4
        //   27: dup2
        //   28: bipush #32
        //   30: lshl
        //   31: bipush #48
        //   33: lushr
        //   34: l2i
        //   35: istore #5
        //   37: dup2
        //   38: bipush #48
        //   40: lshl
        //   41: bipush #48
        //   43: lushr
        //   44: l2i
        //   45: istore #6
        //   47: pop2
        //   48: dup2
        //   49: ldc2_w 75749843356069
        //   52: lxor
        //   53: lstore #7
        //   55: dup2
        //   56: ldc2_w 76315872837743
        //   59: lxor
        //   60: lstore #9
        //   62: pop2
        //   63: invokestatic r : ()I
        //   66: istore #11
        //   68: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
        //   71: sipush #7299
        //   74: ldc2_w 2638659015716501215
        //   77: lload_0
        //   78: lxor
        //   79: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   84: lload_2
        //   85: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
        //   88: lload #7
        //   90: invokevirtual b : (Ljava/lang/String;J)V
        //   93: iload #11
        //   95: ifeq -> 131
        //   98: getstatic me/rerere/matrix/internal/sc.b : Lme/rerere/matrix/internal/sc;
        //   101: iload #4
        //   103: iload #5
        //   105: i2c
        //   106: iload #6
        //   108: i2c
        //   109: invokespecial b : (ICC)Ljava/lang/String;
        //   112: dup
        //   113: ifnonnull -> 132
        //   116: goto -> 123
        //   119: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   122: athrow
        //   123: pop
        //   124: goto -> 131
        //   127: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   130: athrow
        //   131: return
        //   132: astore #12
        //   134: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
        //   137: lload #9
        //   139: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
        //   142: invokevirtual getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
        //   145: invokevirtual getVersion : ()Ljava/lang/String;
        //   148: invokestatic p : (Ljava/lang/String;)Ljava/lang/String;
        //   151: astore #13
        //   153: getstatic me/rerere/matrix/internal/sc.b : Lme/rerere/matrix/internal/sc;
        //   156: sipush #3040
        //   159: ldc2_w 7899714703009636795
        //   162: lload_0
        //   163: lxor
        //   164: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   169: lload_2
        //   170: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
        //   173: iload #11
        //   175: ifeq -> 491
        //   178: invokespecial b : (Ljava/lang/String;)V
        //   181: aload #12
        //   183: aload #13
        //   185: invokestatic b : (Ljava/lang/String;Ljava/lang/String;)I
        //   188: ifle -> 435
        //   191: goto -> 198
        //   194: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   197: athrow
        //   198: new java/lang/StringBuilder
        //   201: dup
        //   202: invokespecial <init> : ()V
        //   205: sipush #29896
        //   208: ldc2_w 6828592414401044126
        //   211: lload_0
        //   212: lxor
        //   213: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: sipush #4654
        //   224: ldc2_w 1353138877886199921
        //   227: lload_0
        //   228: lxor
        //   229: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   234: lload_2
        //   235: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
        //   238: astore #15
        //   240: aload #15
        //   242: iload #11
        //   244: ifeq -> 290
        //   247: ifnull -> 345
        //   250: goto -> 257
        //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   256: athrow
        //   257: aload #15
        //   259: sipush #4802
        //   262: ldc2_w 7779365782356195474
        //   265: lload_0
        //   266: lxor
        //   267: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   272: aload #12
        //   274: invokestatic j : (Ljava/lang/String;)Ljava/lang/String;
        //   277: iconst_0
        //   278: iconst_4
        //   279: aconst_null
        //   280: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //   283: goto -> 290
        //   286: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   289: athrow
        //   290: astore #16
        //   292: aload #16
        //   294: iload #11
        //   296: ifeq -> 342
        //   299: ifnull -> 345
        //   302: goto -> 309
        //   305: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   308: athrow
        //   309: aload #16
        //   311: sipush #16822
        //   314: ldc2_w 6565645721059568616
        //   317: lload_0
        //   318: lxor
        //   319: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   324: aload #13
        //   326: invokestatic j : (Ljava/lang/String;)Ljava/lang/String;
        //   329: iconst_0
        //   330: iconst_4
        //   331: aconst_null
        //   332: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
        //   335: goto -> 342
        //   338: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   341: athrow
        //   342: goto -> 346
        //   345: aconst_null
        //   346: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: invokevirtual toString : ()Ljava/lang/String;
        //   352: astore #14
        //   354: getstatic me/rerere/matrix/internal/sc.b : Lme/rerere/matrix/internal/sc;
        //   357: aload #14
        //   359: invokespecial b : (Ljava/lang/String;)V
        //   362: getstatic me/rerere/matrix/internal/sc.b : Lme/rerere/matrix/internal/sc;
        //   365: new java/lang/StringBuilder
        //   368: dup
        //   369: invokespecial <init> : ()V
        //   372: sipush #30369
        //   375: ldc2_w 5675961907550264566
        //   378: lload_0
        //   379: lxor
        //   380: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   385: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: sipush #9997
        //   391: ldc2_w 705507628864195928
        //   394: lload_0
        //   395: lxor
        //   396: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   401: lload_2
        //   402: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
        //   405: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   408: sipush #3700
        //   411: ldc2_w 8686752197365654565
        //   414: lload_0
        //   415: lxor
        //   416: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   424: invokevirtual toString : ()Ljava/lang/String;
        //   427: invokespecial b : (Ljava/lang/String;)V
        //   430: iload #11
        //   432: ifne -> 494
        //   435: getstatic me/rerere/matrix/internal/sc.b : Lme/rerere/matrix/internal/sc;
        //   438: new java/lang/StringBuilder
        //   441: dup
        //   442: invokespecial <init> : ()V
        //   445: sipush #30369
        //   448: ldc2_w 5675961907550264566
        //   451: lload_0
        //   452: lxor
        //   453: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   458: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   461: sipush #9597
        //   464: ldc2_w 7530632440790961966
        //   467: lload_0
        //   468: lxor
        //   469: <illegal opcode> i : (IJ)Ljava/lang/String;
        //   474: lload_2
        //   475: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
        //   478: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   481: invokevirtual toString : ()Ljava/lang/String;
        //   484: goto -> 491
        //   487: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
        //   490: athrow
        //   491: invokespecial b : (Ljava/lang/String;)V
        //   494: return
        // Exception table:
        //   from	to	target	type
        //   68	116	119	java/lang/RuntimeException
        //   98	124	127	java/lang/RuntimeException
        //   153	191	194	java/lang/RuntimeException
        //   240	250	253	java/lang/RuntimeException
        //   247	283	286	java/lang/RuntimeException
        //   292	302	305	java/lang/RuntimeException
        //   299	335	338	java/lang/RuntimeException
        //   354	484	487	java/lang/RuntimeException
      };
    Bukkit.getScheduler().runTaskAsynchronously((Plugin)Matrix.q.b(l), runnable);
  }
  
  public static void c(String[] paramArrayOfString) {
    a = paramArrayOfString;
  }
  
  public static String[] O() {
    return a;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x14EB;
    if (e[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])f.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          f.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/sc", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = d[i].getBytes("ISO-8859-1");
      e[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return e[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/sc'
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
  
  static {
    long l = c ^ 0x3150967AA13FL;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\sc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
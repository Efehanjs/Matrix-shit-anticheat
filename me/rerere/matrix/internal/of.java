package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class of {
  @NotNull
  private static final List i;
  
  private static final long a = o3.a(-2376884203144332448L, 7720589845508371612L, MethodHandles.lookup().lookupClass()).a(144545942036066L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  static {
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[20];
    boolean bool = false;
    String str;
    int i = (str = "F\001¦ÙC¶|\004\025æ&qkÒªÓãâC\013ó8eJ­tp\021\016]j$õK§Wõ\007Ú!ì{]gÍ¯{ÓvÂRÉ3%@C8õ9\004ra\036½\004V#-\003sõeuy+\017ÍB\022É¿+G\fQâÑ\0221äýð@\001n´*Aëï\035\034º\021Bì Èã1ö@\016\026- |\020~ä¯YµI\035åÚÅð´®\033\027÷\030\007XR0\"S¯ØÅC\"\fG>:ÈV}¦Ü ÙîdÀXa9éB6VO\022fB×åø$0¦·[¨ñ¨úr\023sÜñâÉ½\007%ÕXrPY?i#B\001ÿë¶Í]FÕêÖe_\013bPÕLq[\037Ãüq\"°)ÿ7\032\022Ã]\035\031{Ç\013\013ÈÖ×Êw\025.n¾t$çZ5y\023*¬Ã\032|Ôí'ìà¢y3i¯eäÒÛ»\035Yv\"\023Rä5\0008\030¾ñfÊo¤oèAæÊ½N\027®Ü¶!­mö(TözCI2­~sÛ\020ê\"\033Z«ã:ó­u*X©·ÍDk(Aö$|ý\006íAåP¾ïð4û©\036ú\006³­b2c\023 \034(\022\001äRþ+¯B.\033Æu#Ê~ºZeô@Ý<¹5C£ek.\022QM²t>&\037èÅÜ;\\.?P\txì¢L´tè(c â\004Bl8«\001PPÊ8Ve +èáÄznu¦ý<\f\006Ô\036w+OÊ©Ý C\037übÒÄhX\000²áäZ9éð3]C\f¢ÔwåÊ\003X\034«Ê¸´0ÁµÛ#nLºÓêR{g{E`±uò¡\036\r§¼iðøn,%üîÙ^1ç¨há\005×qLù½3×)£Ú}Qª\005 \025Êà&xê!EÖ/­¯Ö`½;\0135\0213x;0\026U¯D\036Üy«Æ{\tgÅ\036|TðÞvñ¦ßná±}¹]ÎdÝ<'×k:úçF\022çyo\0243\"\000'¡Â$&ºAÎJd>ZÉü¸+ør»ò¤-ÓÝ\001k,åç\016wl[\016\016.z\rÝÂ|1úÚÙ'\rY\"Nj©5{q\000°]e3 \025|Í«\005öGN_\025VÄLóß{Ñ¬R\003Ï²Û\030Mi¨±F_JA $µvÉÏßM\023¤Òõ\0362\032\"æÎ ¢ Å7hæ~z\fñ:ñ\006À\035t¼ÍÆ? z{S4ñÞDÑ\017Õû`?ßñ\004ã\003)Ù§\030w±9\002 \036áìu¨Ô¬z\034ðT2Lö\" òðjüä\006ÀýÞ°vçù½mO]/4Õ\")F§ØÒïöçË¯ ÷PkøB\026ý¬ÚÞ¡\034uÁê-\\Uÿâ:.ßh³Ëún¡\tÐt\f\013¿HGÇ2g»\026ÇÕhâ¿&{\030\025ü\n\001sa¶\n¾\"xtàC¾\n­´ùÖPâ SÔ=|~mþìJ\024§GbaUêHÅ\004ÈÈ<ÐFÊ¯ß$¦óHOÈ\035xªKPþVUåäÖw\016\017ç«è¹5Áû_æ\n'SY\027Ö-àìáNòtßX\001¿õþ5Þ¥M=ê¡%iÿaRÏ³\024#ØE0ùQ\035½\020ÝÎ\021\\\030ÂDDÃ_·\001¥È¡è\033ñ@[ÕüHxyÄ9ñ ûÌ×;1½ù~\034Q\037æ2±æ\017ká:Ã ¼ÆÅ}xx9Zæ×Í®|hß{\020r¤M$ÎýAq^ø®{r\013Ñ#\022JÈ\001çÿ,.\003PûÄÄY&~Ú\tòQ\nßÐè³c6.=\030þ\006`ý¨4ÚbÍöâiY«[Ëº(ø:l\020*fWîA\nÝÑÖÂªtBk#Â\027W\"`ç{¹Ö@\033±±¶cÕ\021¯\rÇÜÖ0Å¤?ï\000oCKr®GË­ÚfPqô!ï\000ºH\026ãqñ\026T\027aÍ?DÀÁ*6Xª\037t6p").length();
    byte b2 = 64;
    byte b = -1;
    while (true);
  }
  
  public static final void b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/of.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: lload_0
    //   7: dup2
    //   8: ldc2_w 93994052555565
    //   11: lxor
    //   12: dup2
    //   13: bipush #32
    //   15: lushr
    //   16: l2i
    //   17: istore_2
    //   18: dup2
    //   19: bipush #32
    //   21: lshl
    //   22: bipush #32
    //   24: lushr
    //   25: l2i
    //   26: istore_3
    //   27: pop2
    //   28: dup2
    //   29: ldc2_w 69958274169242
    //   32: lxor
    //   33: lstore #4
    //   35: pop2
    //   36: sipush #19672
    //   39: ldc2_w 6024108172518867824
    //   42: lload_0
    //   43: lxor
    //   44: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   49: astore #6
    //   51: aload #6
    //   53: lload #4
    //   55: invokestatic b : (Ljava/lang/String;J)Lme/rerere/matrix/internal/gg;
    //   58: astore #7
    //   60: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   63: aload #7
    //   65: invokevirtual println : (Ljava/lang/Object;)V
    //   68: aload #7
    //   70: iconst_0
    //   71: iload_2
    //   72: iload_3
    //   73: invokevirtual b : (III)Lme/rerere/matrix/internal/gg;
    //   76: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   79: swap
    //   80: invokevirtual println : (Ljava/lang/Object;)V
    //   83: return
  }
  
  @NotNull
  public static final gg b(@NotNull String paramString, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/of.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 127427012195440
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 41395757701400
    //   17: lxor
    //   18: lstore #5
    //   20: dup2
    //   21: ldc2_w 124941816408086
    //   24: lxor
    //   25: dup2
    //   26: bipush #48
    //   28: lushr
    //   29: l2i
    //   30: istore #7
    //   32: dup2
    //   33: bipush #16
    //   35: lshl
    //   36: bipush #48
    //   38: lushr
    //   39: l2i
    //   40: istore #8
    //   42: dup2
    //   43: bipush #32
    //   45: lshl
    //   46: bipush #32
    //   48: lushr
    //   49: l2i
    //   50: istore #9
    //   52: pop2
    //   53: pop2
    //   54: lload #5
    //   56: aload_0
    //   57: invokestatic b : (JLjava/lang/String;)Ljava/lang/String;
    //   60: checkcast java/lang/CharSequence
    //   63: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   66: invokevirtual toString : ()Ljava/lang/String;
    //   69: astore #11
    //   71: iload #7
    //   73: i2s
    //   74: iload #8
    //   76: i2s
    //   77: iload #9
    //   79: aload #11
    //   81: invokestatic b : (SSILjava/lang/String;)Ljava/util/List;
    //   84: astore #12
    //   86: aload #12
    //   88: iconst_0
    //   89: invokeinterface get : (I)Ljava/lang/Object;
    //   94: checkcast me/rerere/matrix/internal/ef
    //   97: invokevirtual b : ()Ljava/lang/String;
    //   100: astore #13
    //   102: invokestatic r : ()I
    //   105: aload #12
    //   107: lload_3
    //   108: invokestatic b : (Ljava/util/List;J)Ljava/util/List;
    //   111: astore #14
    //   113: new java/util/ArrayList
    //   116: dup
    //   117: invokespecial <init> : ()V
    //   120: checkcast java/util/List
    //   123: astore #15
    //   125: new java/util/LinkedHashMap
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: checkcast java/util/Map
    //   135: astore #16
    //   137: istore #10
    //   139: aload #14
    //   141: checkcast java/lang/Iterable
    //   144: astore #17
    //   146: iconst_0
    //   147: istore #18
    //   149: aload #17
    //   151: invokeinterface iterator : ()Ljava/util/Iterator;
    //   156: astore #19
    //   158: aload #19
    //   160: invokeinterface hasNext : ()Z
    //   165: ifeq -> 369
    //   168: aload #19
    //   170: invokeinterface next : ()Ljava/lang/Object;
    //   175: astore #20
    //   177: aload #20
    //   179: checkcast java/lang/String
    //   182: astore #21
    //   184: iconst_0
    //   185: istore #22
    //   187: aload #21
    //   189: checkcast java/lang/CharSequence
    //   192: astore #23
    //   194: iload #10
    //   196: lload_1
    //   197: lconst_0
    //   198: lcmp
    //   199: iflt -> 230
    //   202: ifeq -> 376
    //   205: new me/rerere/matrix/thirdparty/kotlin/text/Regex
    //   208: dup
    //   209: sipush #2781
    //   212: ldc2_w 3346842729229752297
    //   215: lload_1
    //   216: lxor
    //   217: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   222: invokespecial <init> : (Ljava/lang/String;)V
    //   225: aload #23
    //   227: invokevirtual matches : (Ljava/lang/CharSequence;)Z
    //   230: iload #10
    //   232: ifeq -> 361
    //   235: goto -> 242
    //   238: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   241: athrow
    //   242: ifeq -> 352
    //   245: aload #21
    //   247: checkcast java/lang/CharSequence
    //   250: bipush #61
    //   252: iconst_0
    //   253: iconst_0
    //   254: bipush #6
    //   256: aconst_null
    //   257: invokestatic indexOf$default : (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
    //   260: istore #23
    //   262: nop
    //   263: aload #21
    //   265: iconst_0
    //   266: iload #23
    //   268: invokevirtual substring : (II)Ljava/lang/String;
    //   271: dup
    //   272: sipush #5371
    //   275: ldc2_w 43315309619415518
    //   278: lload_1
    //   279: lxor
    //   280: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   285: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   288: checkcast java/lang/CharSequence
    //   291: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   294: invokevirtual toString : ()Ljava/lang/String;
    //   297: astore #24
    //   299: nop
    //   300: aload #21
    //   302: iload #23
    //   304: iconst_1
    //   305: iadd
    //   306: invokevirtual substring : (I)Ljava/lang/String;
    //   309: dup
    //   310: sipush #17718
    //   313: ldc2_w 4686118093962401796
    //   316: lload_1
    //   317: lxor
    //   318: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   323: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   326: checkcast java/lang/CharSequence
    //   329: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    //   332: invokevirtual toString : ()Ljava/lang/String;
    //   335: astore #25
    //   337: aload #16
    //   339: aload #24
    //   341: aload #25
    //   343: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   348: pop
    //   349: goto -> 362
    //   352: aload #15
    //   354: aload #21
    //   356: invokeinterface add : (Ljava/lang/Object;)Z
    //   361: pop
    //   362: nop
    //   363: nop
    //   364: iload #10
    //   366: ifne -> 158
    //   369: lload_1
    //   370: lconst_0
    //   371: lcmp
    //   372: ifle -> 376
    //   375: nop
    //   376: new me/rerere/matrix/internal/gg
    //   379: dup
    //   380: aload #13
    //   382: aload #14
    //   384: aload #15
    //   386: aload #16
    //   388: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V
    //   391: areturn
    // Exception table:
    //   from	to	target	type
    //   194	235	238	java/lang/IllegalStateException
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4CFD;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/of", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = b[i].getBytes("ISO-8859-1");
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   66: ldc_w 'me/rerere/matrix/internal/of'
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
    long l = a ^ 0x464C90DED690L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\of.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
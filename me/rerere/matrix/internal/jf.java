package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class jf implements CommandExecutor, TabCompleter {
  @NotNull
  private final List v = new ArrayList();
  
  private static final int b = 5;
  
  private static Field i;
  
  private static final long a;
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e;
  
  public boolean onCommand(@NotNull CommandSender paramCommandSender, @NotNull Command paramCommand, @NotNull String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jf.a : J
    //   3: ldc2_w 56228048685105
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 7619002488208
    //   15: lxor
    //   16: lstore #7
    //   18: dup2
    //   19: ldc2_w 42763276382328
    //   22: lxor
    //   23: lstore #9
    //   25: pop2
    //   26: invokestatic a : ()I
    //   29: istore #11
    //   31: aload_1
    //   32: instanceof org/bukkit/entity/Player
    //   35: iload #11
    //   37: ifne -> 133
    //   40: ifeq -> 130
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: aload_1
    //   51: checkcast org/bukkit/entity/Player
    //   54: sipush #16390
    //   57: ldc2_w 7807981682523662078
    //   60: lload #5
    //   62: lxor
    //   63: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   68: invokestatic j : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Z
    //   71: iload #11
    //   73: ifne -> 133
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   82: athrow
    //   83: ifne -> 130
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: aload_1
    //   94: bipush #38
    //   96: getstatic me/rerere/matrix/internal/jf.i : Ljava/lang/reflect/Field;
    //   99: aconst_null
    //   100: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   103: checkcast java/lang/String
    //   106: invokestatic translateAlternateColorCodes : (CLjava/lang/String;)Ljava/lang/String;
    //   109: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   114: goto -> 128
    //   117: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   120: athrow
    //   121: astore #12
    //   123: aload #12
    //   125: invokevirtual printStackTrace : ()V
    //   128: iconst_1
    //   129: ireturn
    //   130: aload #4
    //   132: arraylength
    //   133: ifne -> 157
    //   136: aload_0
    //   137: aload_1
    //   138: aload #4
    //   140: lload #9
    //   142: invokespecial j : (Lorg/bukkit/command/CommandSender;[Ljava/lang/String;J)V
    //   145: iload #11
    //   147: ifeq -> 173
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload_0
    //   158: aload_1
    //   159: aload #4
    //   161: lload #7
    //   163: invokespecial b : (Lorg/bukkit/command/CommandSender;[Ljava/lang/String;J)V
    //   166: goto -> 173
    //   169: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: iconst_1
    //   174: ireturn
    // Exception table:
    //   from	to	target	type
    //   31	43	46	java/lang/IllegalAccessException
    //   40	76	79	java/lang/IllegalAccessException
    //   50	86	89	java/lang/IllegalAccessException
    //   83	117	117	java/lang/RuntimeException
    //   93	114	121	java/lang/IllegalAccessException
    //   133	150	153	java/lang/IllegalAccessException
    //   136	166	169	java/lang/IllegalAccessException
  }
  
  public List onTabComplete(@NotNull CommandSender paramCommandSender, @NotNull Command paramCommand, @NotNull String paramString, String[] paramArrayOfString) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/jf.a : J
    //   3: ldc2_w 55562939380148
    //   6: lxor
    //   7: lstore #5
    //   9: lload #5
    //   11: dup2
    //   12: ldc2_w 45151754467979
    //   15: lxor
    //   16: lstore #7
    //   18: pop2
    //   19: invokestatic r : ()I
    //   22: istore #9
    //   24: aload #4
    //   26: arraylength
    //   27: iload #9
    //   29: ifeq -> 80
    //   32: ifne -> 77
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   41: athrow
    //   42: aload_0
    //   43: getfield v : Ljava/util/List;
    //   46: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   51: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   56: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   61: invokestatic toList : ()Ljava/util/stream/Collector;
    //   64: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   69: checkcast java/util/List
    //   72: areturn
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload #4
    //   79: arraylength
    //   80: iconst_1
    //   81: iload #9
    //   83: ifeq -> 258
    //   86: if_icmpne -> 254
    //   89: goto -> 96
    //   92: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   95: athrow
    //   96: aload_0
    //   97: getfield v : Ljava/util/List;
    //   100: invokeinterface iterator : ()Ljava/util/Iterator;
    //   105: astore #10
    //   107: aload #10
    //   109: invokeinterface hasNext : ()Z
    //   114: ifeq -> 223
    //   117: aload #10
    //   119: invokeinterface next : ()Ljava/lang/Object;
    //   124: checkcast me/rerere/matrix/internal/xl
    //   127: astore #11
    //   129: aload #11
    //   131: invokevirtual b : ()Ljava/lang/String;
    //   134: iload #9
    //   136: ifeq -> 250
    //   139: aload #4
    //   141: iconst_0
    //   142: aaload
    //   143: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   146: iload #9
    //   148: ifeq -> 199
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: ifeq -> 218
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   167: athrow
    //   168: aload #11
    //   170: invokevirtual b : ()Ljava/lang/String;
    //   173: iload #9
    //   175: ifeq -> 214
    //   178: goto -> 185
    //   181: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   184: athrow
    //   185: aload #4
    //   187: iconst_0
    //   188: aaload
    //   189: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   192: goto -> 199
    //   195: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   198: athrow
    //   199: ifne -> 218
    //   202: aload #11
    //   204: invokevirtual b : ()Ljava/lang/String;
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
    //   217: areturn
    //   218: iload #9
    //   220: ifne -> 107
    //   223: aload_0
    //   224: getfield v : Ljava/util/List;
    //   227: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   232: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   237: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   242: invokestatic toList : ()Ljava/util/stream/Collector;
    //   245: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   250: checkcast java/util/List
    //   253: areturn
    //   254: aload #4
    //   256: arraylength
    //   257: iconst_2
    //   258: if_icmpne -> 341
    //   261: aload_0
    //   262: getfield v : Ljava/util/List;
    //   265: invokeinterface iterator : ()Ljava/util/Iterator;
    //   270: astore #10
    //   272: aload #10
    //   274: invokeinterface hasNext : ()Z
    //   279: ifeq -> 341
    //   282: aload #10
    //   284: invokeinterface next : ()Ljava/lang/Object;
    //   289: checkcast me/rerere/matrix/internal/xl
    //   292: astore #11
    //   294: aload #11
    //   296: iload #9
    //   298: ifeq -> 330
    //   301: invokevirtual b : ()Ljava/lang/String;
    //   304: aload #4
    //   306: iconst_0
    //   307: aaload
    //   308: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   311: ifeq -> 336
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   320: athrow
    //   321: aload #11
    //   323: goto -> 330
    //   326: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   329: athrow
    //   330: lload #7
    //   332: invokevirtual b : (J)Ljava/util/List;
    //   335: areturn
    //   336: iload #9
    //   338: ifne -> 272
    //   341: aconst_null
    //   342: areturn
    // Exception table:
    //   from	to	target	type
    //   24	35	38	java/lang/RuntimeException
    //   32	73	73	java/lang/RuntimeException
    //   80	89	92	java/lang/RuntimeException
    //   129	151	154	java/lang/RuntimeException
    //   139	161	164	java/lang/RuntimeException
    //   158	178	181	java/lang/RuntimeException
    //   168	192	195	java/lang/RuntimeException
    //   199	207	210	java/lang/RuntimeException
    //   294	314	317	java/lang/RuntimeException
    //   301	323	326	java/lang/RuntimeException
  }
  
  public void b(int paramInt1, short paramShort, int paramInt2) {
    long l1 = (paramInt1 << 32L | paramShort << 48L >>> 32L | paramInt2 << 48L >>> 48L) ^ a;
    int i = (int)((l1 ^ 0xE62B8440F00L) >>> 32L);
    int j = (int)((l1 ^ 0xE62B8440F00L) << 32L >>> 48L);
    int k = (int)((l1 ^ 0xE62B8440F00L) << 48L >>> 48L);
    l1 ^ 0xE62B8440F00L;
    long l2 = l1 ^ 0x2A3FA0AADF79L;
    long l3 = l1 ^ 0x7E4A13B66965L;
    long l4 = l1 ^ 0x4AA2A2235764L;
    long l5 = l1 ^ 0x3CF7E630DD92L;
    long l6 = (l1 ^ 0x4E4CB9FEE040L) >>> 16L;
    int m = (int)((l1 ^ 0x4E4CB9FEE040L) << 48L >>> 48L);
    l1 ^ 0x4E4CB9FEE040L;
    long l7 = l1 ^ 0x226683F526C0L;
    long l8 = l1 ^ 0x9A7CF90DFB1L;
    long l9 = l1 ^ 0x6D9989907944L;
    int n = (int)((l1 ^ 0x4FA47ADAB0C2L) >>> 48L);
    int i1 = (int)((l1 ^ 0x4FA47ADAB0C2L) << 16L >>> 48L);
    int i2 = (int)((l1 ^ 0x4FA47ADAB0C2L) << 32L >>> 32L);
    l1 ^ 0x4FA47ADAB0C2L;
    long l10 = (l1 ^ 0x1FEFD59467CL) >>> 8L;
    int i3 = (int)((l1 ^ 0x1FEFD59467CL) << 56L >>> 56L);
    l1 ^ 0x1FEFD59467CL;
    long l11 = (l1 ^ 0x2E8389752FA8L) >>> 8L;
    int i4 = (int)((l1 ^ 0x2E8389752FA8L) << 56L >>> 56L);
    l1 ^ 0x2E8389752FA8L;
    long l12 = l1 ^ 0xBAE706E6DA7L;
    hw.d(-5174369953829534922L, l1);
    try {
      hw.d(-5174369953829534922L, l1).invoke(this.v, hw.b());
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new dj(l2)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new dd(l11, (byte)i4)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new il(l9)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new pf(l3)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new ne(l7)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new gh(l10, (byte)i3)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new fn(l5)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new nl(l12)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new th(i, (char)j, (short)k)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new bn((char)n, (char)i1, i2)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new pk(l4)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new sf(l8)));
    hw.d(-5178021430610485127L, l1);
    try {
    
    } catch (InvocationTargetException invocationTargetException) {
      throw null.getTargetException();
    } 
    hw.d(-5178021430610485127L, l1).invoke(this.v, hw.a(new pd(l6, (short)m)));
  }
  
  static {
    // Byte code:
    //   0: ldc2_w 4520011294980239764
    //   3: ldc2_w 3616793769008335611
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   15: ldc2_w 193729268212827
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/rerere/matrix/internal/jf.a : J
    //   26: getstatic me/rerere/matrix/internal/jf.a : J
    //   29: ldc2_w 53374231169024
    //   32: lxor
    //   33: lstore #9
    //   35: new java/util/HashMap
    //   38: dup
    //   39: bipush #13
    //   41: invokespecial <init> : (I)V
    //   44: putstatic me/rerere/matrix/internal/jf.e : Ljava/util/Map;
    //   47: ldc_w 'DES/CBC/PKCS5Padding'
    //   50: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   53: dup
    //   54: astore_0
    //   55: iconst_2
    //   56: ldc_w 'DES'
    //   59: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   62: bipush #8
    //   64: newarray byte
    //   66: dup
    //   67: iconst_0
    //   68: lload #9
    //   70: bipush #56
    //   72: lushr
    //   73: l2i
    //   74: i2b
    //   75: bastore
    //   76: iconst_1
    //   77: istore_1
    //   78: iload_1
    //   79: bipush #8
    //   81: if_icmpge -> 105
    //   84: dup
    //   85: iload_1
    //   86: lload #9
    //   88: iload_1
    //   89: bipush #8
    //   91: imul
    //   92: lshl
    //   93: bipush #56
    //   95: lushr
    //   96: l2i
    //   97: i2b
    //   98: bastore
    //   99: iinc #1, 1
    //   102: goto -> 78
    //   105: new javax/crypto/spec/DESKeySpec
    //   108: dup_x1
    //   109: swap
    //   110: invokespecial <init> : ([B)V
    //   113: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   116: new javax/crypto/spec/IvParameterSpec
    //   119: dup
    //   120: bipush #8
    //   122: newarray byte
    //   124: invokespecial <init> : ([B)V
    //   127: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   130: bipush #32
    //   132: anewarray java/lang/String
    //   135: astore #7
    //   137: iconst_0
    //   138: istore #5
    //   140: ldc_w 'å:Þìûâ$ùH\\nKoÍtdZ ¸D}¼Û(5KxY4[ò×­+øàXØ«câ{\\t½\\böÀwgUdlÝç }û£®²©7ºfwõa­QÓuöxÅ#\\t>Iq 5àjÿ­%ùjH¸Ê®T5½\\bÙeXÅjÚÊÉÜIU´uTæ(»oX7#¢±f\\fÛônª7àÝ @ZËÅÓR°³\\rÉvöHS0\\b§E·<¶¶À¤\\fþ|MÐ%r¸8´JZÛAØ?Ök¯Û`û&v":Ë\\tÒ3ÙðÞX>oï]86µÚHthà¤"÷éCôIVÔûå¶}TÂ81Ï\\bø4Þe®Õ+P\\fÞ"N­Ê¯Íâ*âçýrQ5ÿ ¬}¡*¸,ßµÂÑôCò8Ñ_k%P.üÃ½@_ÁXðf.`Ï¹£uâdAc£Eò;ÄÛ².\\nbÛÂ;Dï¤G,©lCQ3lQàd8ò:_ E"Çþ×¯Â òAë»HbhLjÈ oGæ8½öAÊ7¢»Ä¯yÄÇ]"¹Î´ðÜR½ )ÅµÖUuÓÉB?GgÁÿN*hôî°ÕlèQ2 ÍXOåÆ¦Â\\n<¡\ñ7ðÿ0²Ux~ú,Ý\\n²(&\\r`¯¢'ìÊlÌ «6.¡¡0Ç}Ó¾Ý7(é×ULJ!RÇ(´T®õöÚ \\tõaUy,`÷(ÄºÕtjYÚ=éáL:.Ø6'° 'Í¤J^«]úf$B )9Ï#ÁRÏnÉòjÌrf¥¿­ùÍÂáâ sâ8ÂWªÇà'.®TÔPÍËc´p¥½ÞÀ8ë<µÁ|Bô'uûÜµÆés@3É§]ª0¾Z8ycwÂ¯õBô{D\\f\\tîÚP8a O¶³Ït}Xá"tgØ%2Ù»·`ØØ¿ÆEÎømÓ¢4Xªá²± !hð" AGÇa[¬À?Ò¼Kßßë'1Ó+ k7LÄEí©b>UÞqç²T]xÏÅÛ¸yíê\\nËü+ GEÆé-O=·Á\\f¯Lmßw@d« ?ÛmV¹¶]8þR§íC`âß_\\tÙòVÖ5^=e  t£\\t­ Îiy@\\b³ýØ=ä>ÀYÏmn eüL°jÓ7Áô×©l©ÞüÌgqä÷qÝyÄêÈRõ\\f8Ì²¯ñ`DÀ%\\bàKª" £¶¯tÒ2czc5ã÷ú}ÚZøkc;î­Ô'
    //   143: dup
    //   144: astore #4
    //   146: invokevirtual length : ()I
    //   149: istore #6
    //   151: bipush #32
    //   153: istore_3
    //   154: iconst_m1
    //   155: istore_2
    //   156: iinc #2, 1
    //   159: aload #4
    //   161: iload_2
    //   162: dup
    //   163: iload_3
    //   164: iadd
    //   165: invokevirtual substring : (II)Ljava/lang/String;
    //   168: iconst_m1
    //   169: goto -> 280
    //   172: aload #7
    //   174: swap
    //   175: iload #5
    //   177: iinc #5, 1
    //   180: swap
    //   181: aastore
    //   182: iload_2
    //   183: iload_3
    //   184: iadd
    //   185: dup
    //   186: istore_2
    //   187: iload #6
    //   189: if_icmpge -> 202
    //   192: aload #4
    //   194: iload_2
    //   195: invokevirtual charAt : (I)C
    //   198: istore_3
    //   199: goto -> 156
    //   202: ldc_w '¤+{ÉÀBhª¥ÝÕãÜÕn^@ë2@S&®V¡Yná¢- iG¦Ïp·m~¨ñX'
    //   205: dup
    //   206: astore #4
    //   208: invokevirtual length : ()I
    //   211: istore #6
    //   213: bipush #40
    //   215: istore_3
    //   216: iconst_m1
    //   217: istore_2
    //   218: iinc #2, 1
    //   221: aload #4
    //   223: iload_2
    //   224: dup
    //   225: iload_3
    //   226: iadd
    //   227: invokevirtual substring : (II)Ljava/lang/String;
    //   230: iconst_0
    //   231: goto -> 280
    //   234: aload #7
    //   236: swap
    //   237: iload #5
    //   239: iinc #5, 1
    //   242: swap
    //   243: aastore
    //   244: iload_2
    //   245: iload_3
    //   246: iadd
    //   247: dup
    //   248: istore_2
    //   249: iload #6
    //   251: if_icmpge -> 264
    //   254: aload #4
    //   256: iload_2
    //   257: invokevirtual charAt : (I)C
    //   260: istore_3
    //   261: goto -> 218
    //   264: aload #7
    //   266: putstatic me/rerere/matrix/internal/jf.c : [Ljava/lang/String;
    //   269: bipush #32
    //   271: anewarray java/lang/String
    //   274: putstatic me/rerere/matrix/internal/jf.d : [Ljava/lang/String;
    //   277: goto -> 320
    //   280: swap
    //   281: ldc_w 'ISO-8859-1'
    //   284: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   287: aload_0
    //   288: swap
    //   289: invokevirtual doFinal : ([B)[B
    //   292: astore #8
    //   294: aload #8
    //   296: invokestatic a : ([B)Ljava/lang/String;
    //   299: invokevirtual intern : ()Ljava/lang/String;
    //   302: swap
    //   303: tableswitch default -> 172, 0 -> 234
    //   320: sipush #2940
    //   323: ldc2_w 181192939480919470
    //   326: lload #9
    //   328: lxor
    //   329: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   334: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   337: invokestatic fromClass : (Ljava/lang/Class;)Lcom/comphenix/protocol/reflect/FuzzyReflection;
    //   340: sipush #4148
    //   343: ldc2_w 8433992730992195312
    //   346: lload #9
    //   348: lxor
    //   349: <illegal opcode> l : (IJ)Ljava/lang/String;
    //   354: invokevirtual getFieldByName : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   357: putstatic me/rerere/matrix/internal/jf.i : Ljava/lang/reflect/Field;
    //   360: goto -> 370
    //   363: astore #11
    //   365: aload #11
    //   367: invokevirtual printStackTrace : ()V
    //   370: return
    // Exception table:
    //   from	to	target	type
    //   320	360	363	java/lang/ClassNotFoundException
  }
  
  public jf(long paramLong) {
    b(i, (short)j, k);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4FB2;
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
        throw new RuntimeException("me/rerere/matrix/internal/jf", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/jf'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\jf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.entity.Player;

public class oa {
  private static Field b;
  
  private static final String[] i;
  
  private static final long a;
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e;
  
  @NotNull
  public static String b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/oa.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: iconst_5
    //   7: new java/util/Random
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: bipush #6
    //   16: invokevirtual nextInt : (I)I
    //   19: iadd
    //   20: istore_3
    //   21: invokestatic a : ()I
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: astore #4
    //   33: istore_2
    //   34: iconst_0
    //   35: istore #5
    //   37: iload #5
    //   39: iload_3
    //   40: if_icmpge -> 91
    //   43: aload #4
    //   45: getstatic me/rerere/matrix/internal/oa.i : [Ljava/lang/String;
    //   48: new java/util/Random
    //   51: dup
    //   52: invokespecial <init> : ()V
    //   55: getstatic me/rerere/matrix/internal/oa.i : [Ljava/lang/String;
    //   58: arraylength
    //   59: invokevirtual nextInt : (I)I
    //   62: aaload
    //   63: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: iload_2
    //   67: ifne -> 93
    //   70: pop
    //   71: iinc #5, 1
    //   74: iload_2
    //   75: ifeq -> 37
    //   78: lload_0
    //   79: lconst_0
    //   80: lcmp
    //   81: ifle -> 74
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload #4
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: areturn
    // Exception table:
    //   from	to	target	type
    //   43	78	87	java/lang/RuntimeException
  }
  
  static {
    // Byte code:
    //   0: ldc2_w 3836890144165452598
    //   3: ldc2_w 2755972182369207253
    //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
    //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
    //   12: invokestatic a : (JJLjava/lang/Object;)Lme/rerere/matrix/internal/w2;
    //   15: ldc2_w 267759959496288
    //   18: invokeinterface a : (J)J
    //   23: putstatic me/rerere/matrix/internal/oa.a : J
    //   26: getstatic me/rerere/matrix/internal/oa.a : J
    //   29: ldc2_w 32374485960582
    //   32: lxor
    //   33: lstore #9
    //   35: lload #9
    //   37: dup2
    //   38: ldc2_w 84693287149159
    //   41: lxor
    //   42: lstore #11
    //   44: pop2
    //   45: new java/util/HashMap
    //   48: dup
    //   49: bipush #13
    //   51: invokespecial <init> : (I)V
    //   54: putstatic me/rerere/matrix/internal/oa.e : Ljava/util/Map;
    //   57: ldc 'DES/CBC/PKCS5Padding'
    //   59: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   62: dup
    //   63: astore_0
    //   64: iconst_2
    //   65: ldc 'DES'
    //   67: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
    //   70: bipush #8
    //   72: newarray byte
    //   74: dup
    //   75: iconst_0
    //   76: lload #9
    //   78: bipush #56
    //   80: lushr
    //   81: l2i
    //   82: i2b
    //   83: bastore
    //   84: iconst_1
    //   85: istore_1
    //   86: iload_1
    //   87: bipush #8
    //   89: if_icmpge -> 113
    //   92: dup
    //   93: iload_1
    //   94: lload #9
    //   96: iload_1
    //   97: bipush #8
    //   99: imul
    //   100: lshl
    //   101: bipush #56
    //   103: lushr
    //   104: l2i
    //   105: i2b
    //   106: bastore
    //   107: iinc #1, 1
    //   110: goto -> 86
    //   113: new javax/crypto/spec/DESKeySpec
    //   116: dup_x1
    //   117: swap
    //   118: invokespecial <init> : ([B)V
    //   121: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
    //   124: new javax/crypto/spec/IvParameterSpec
    //   127: dup
    //   128: bipush #8
    //   130: newarray byte
    //   132: invokespecial <init> : ([B)V
    //   135: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   138: bipush #8
    //   140: anewarray java/lang/String
    //   143: astore #7
    //   145: iconst_0
    //   146: istore #5
    //   148: ldc '!®£0LÖw'#;6å¹Ð&ÈH\\t§-Ëd;z ¬s«)©¤ ·Qþ-ç\\n¨ö­!O]÷C_bQhKçÉB#*=XÎÜk¿Fb|«Hü­µwS\\rÿ!\\t¯F(¶¡³9:^ÝlI,·Ü1'¿7sqZ<OdãÏ@ïã?5F üP×TcRíyiiv8u%ú/èÿ8G¸`Ã<(ù¥£ïwc9 Däè­&ô´ûûNóêR¶Á@Ýf\\bïËõ _g:.\\tSÍV¢íe±yÍäVò(eZß,²üý hNgßÊÕ.Ò¼ÓÂ¯u£%Y^|PþÆÁ{'
    //   150: dup
    //   151: astore #4
    //   153: invokevirtual length : ()I
    //   156: istore #6
    //   158: bipush #16
    //   160: istore_3
    //   161: iconst_m1
    //   162: istore_2
    //   163: iinc #2, 1
    //   166: aload #4
    //   168: iload_2
    //   169: dup
    //   170: iload_3
    //   171: iadd
    //   172: invokevirtual substring : (II)Ljava/lang/String;
    //   175: iconst_m1
    //   176: goto -> 286
    //   179: aload #7
    //   181: swap
    //   182: iload #5
    //   184: iinc #5, 1
    //   187: swap
    //   188: aastore
    //   189: iload_2
    //   190: iload_3
    //   191: iadd
    //   192: dup
    //   193: istore_2
    //   194: iload #6
    //   196: if_icmpge -> 209
    //   199: aload #4
    //   201: iload_2
    //   202: invokevirtual charAt : (I)C
    //   205: istore_3
    //   206: goto -> 163
    //   209: ldc '?R8­ååñãj\\t¤â¬ú|u {' d^:øÒCäïúÖ~ÜÛãæ±MÐ¢¥è`¸*Ù1ÔçgïF'
    //   211: dup
    //   212: astore #4
    //   214: invokevirtual length : ()I
    //   217: istore #6
    //   219: bipush #40
    //   221: istore_3
    //   222: iconst_m1
    //   223: istore_2
    //   224: iinc #2, 1
    //   227: aload #4
    //   229: iload_2
    //   230: dup
    //   231: iload_3
    //   232: iadd
    //   233: invokevirtual substring : (II)Ljava/lang/String;
    //   236: iconst_0
    //   237: goto -> 286
    //   240: aload #7
    //   242: swap
    //   243: iload #5
    //   245: iinc #5, 1
    //   248: swap
    //   249: aastore
    //   250: iload_2
    //   251: iload_3
    //   252: iadd
    //   253: dup
    //   254: istore_2
    //   255: iload #6
    //   257: if_icmpge -> 270
    //   260: aload #4
    //   262: iload_2
    //   263: invokevirtual charAt : (I)C
    //   266: istore_3
    //   267: goto -> 224
    //   270: aload #7
    //   272: putstatic me/rerere/matrix/internal/oa.c : [Ljava/lang/String;
    //   275: bipush #8
    //   277: anewarray java/lang/String
    //   280: putstatic me/rerere/matrix/internal/oa.d : [Ljava/lang/String;
    //   283: goto -> 328
    //   286: swap
    //   287: ldc 'ISO-8859-1'
    //   289: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   292: aload_0
    //   293: swap
    //   294: invokevirtual doFinal : ([B)[B
    //   297: astore #8
    //   299: aload #8
    //   301: invokestatic a : ([B)Ljava/lang/String;
    //   304: invokevirtual intern : ()Ljava/lang/String;
    //   307: swap
    //   308: tableswitch default -> 179, 0 -> 240
    //   328: bipush #26
    //   330: anewarray java/lang/String
    //   333: dup
    //   334: iconst_0
    //   335: ldc 'a'
    //   337: aastore
    //   338: dup
    //   339: iconst_1
    //   340: ldc 'b'
    //   342: aastore
    //   343: dup
    //   344: iconst_2
    //   345: ldc 'c'
    //   347: aastore
    //   348: dup
    //   349: iconst_3
    //   350: ldc 'd'
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: ldc 'e'
    //   357: aastore
    //   358: dup
    //   359: iconst_5
    //   360: ldc 'f'
    //   362: aastore
    //   363: dup
    //   364: bipush #6
    //   366: ldc 'g'
    //   368: aastore
    //   369: dup
    //   370: bipush #7
    //   372: ldc 'h'
    //   374: aastore
    //   375: dup
    //   376: bipush #8
    //   378: ldc 'i'
    //   380: aastore
    //   381: dup
    //   382: bipush #9
    //   384: ldc 'j'
    //   386: aastore
    //   387: dup
    //   388: bipush #10
    //   390: ldc 'k'
    //   392: aastore
    //   393: dup
    //   394: bipush #11
    //   396: ldc 'l'
    //   398: aastore
    //   399: dup
    //   400: bipush #12
    //   402: ldc 'm'
    //   404: aastore
    //   405: dup
    //   406: bipush #13
    //   408: ldc 'n'
    //   410: aastore
    //   411: dup
    //   412: bipush #14
    //   414: ldc 'o'
    //   416: aastore
    //   417: dup
    //   418: bipush #15
    //   420: ldc 'p'
    //   422: aastore
    //   423: dup
    //   424: bipush #16
    //   426: ldc 'q'
    //   428: aastore
    //   429: dup
    //   430: bipush #17
    //   432: ldc 'r'
    //   434: aastore
    //   435: dup
    //   436: bipush #18
    //   438: ldc 's'
    //   440: aastore
    //   441: dup
    //   442: bipush #19
    //   444: ldc 't'
    //   446: aastore
    //   447: dup
    //   448: bipush #20
    //   450: ldc 'u'
    //   452: aastore
    //   453: dup
    //   454: bipush #21
    //   456: ldc 'v'
    //   458: aastore
    //   459: dup
    //   460: bipush #22
    //   462: ldc 'w'
    //   464: aastore
    //   465: dup
    //   466: bipush #23
    //   468: ldc 'x'
    //   470: aastore
    //   471: dup
    //   472: bipush #24
    //   474: ldc 'y'
    //   476: aastore
    //   477: dup
    //   478: bipush #25
    //   480: ldc 'z'
    //   482: aastore
    //   483: putstatic me/rerere/matrix/internal/oa.i : [Ljava/lang/String;
    //   486: invokestatic b : ()I
    //   489: bipush #17
    //   491: if_icmpge -> 516
    //   494: sipush #11423
    //   497: ldc2_w 650504558406587002
    //   500: lload #9
    //   502: lxor
    //   503: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   508: lload #11
    //   510: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   513: goto -> 535
    //   516: sipush #7281
    //   519: ldc2_w 7196123684355236498
    //   522: lload #9
    //   524: lxor
    //   525: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   530: lload #11
    //   532: invokestatic b : (Ljava/lang/String;J)Ljava/lang/String;
    //   535: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   538: astore #13
    //   540: invokestatic b : ()I
    //   543: bipush #17
    //   545: if_icmpge -> 583
    //   548: aload #13
    //   550: sipush #15125
    //   553: ldc2_w 2005592271631304180
    //   556: lload #9
    //   558: lxor
    //   559: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   564: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   567: astore #14
    //   569: aload #14
    //   571: iconst_1
    //   572: invokevirtual setAccessible : (Z)V
    //   575: aload #14
    //   577: putstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   580: goto -> 650
    //   583: aload #13
    //   585: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
    //   588: astore #14
    //   590: aload #14
    //   592: arraylength
    //   593: istore #15
    //   595: iconst_0
    //   596: istore #16
    //   598: iload #16
    //   600: iload #15
    //   602: if_icmpge -> 650
    //   605: aload #14
    //   607: iload #16
    //   609: aaload
    //   610: astore #17
    //   612: aload #17
    //   614: invokevirtual getType : ()Ljava/lang/Class;
    //   617: ldc_w java/util/concurrent/atomic/AtomicInteger
    //   620: invokevirtual equals : (Ljava/lang/Object;)Z
    //   623: ifeq -> 644
    //   626: aload #17
    //   628: iconst_1
    //   629: invokevirtual setAccessible : (Z)V
    //   632: aload #17
    //   634: putstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   637: goto -> 650
    //   640: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   643: athrow
    //   644: iinc #16, 1
    //   647: goto -> 598
    //   650: goto -> 660
    //   653: astore #13
    //   655: aload #13
    //   657: invokevirtual printStackTrace : ()V
    //   660: return
    // Exception table:
    //   from	to	target	type
    //   486	650	653	java/lang/ClassNotFoundException
    //   486	650	653	java/lang/NoSuchFieldException
    //   612	640	640	java/lang/ClassNotFoundException
  }
  
  public static int b(boolean paramBoolean, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/oa.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 98949067827514
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: invokestatic a : ()I
    //   17: istore #5
    //   19: invokestatic isPrimaryThread : ()Z
    //   22: iload #5
    //   24: ifne -> 84
    //   27: ifeq -> 60
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iload_0
    //   38: iload #5
    //   40: ifne -> 86
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: ifeq -> 85
    //   53: goto -> 60
    //   56: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   59: athrow
    //   60: ldc_w 100000
    //   63: new java/util/Random
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: sipush #10000
    //   73: invokevirtual nextInt : (I)I
    //   76: iadd
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   83: athrow
    //   84: ireturn
    //   85: iconst_m1
    //   86: istore #6
    //   88: getstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   91: invokevirtual getType : ()Ljava/lang/Class;
    //   94: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
    //   97: iload #5
    //   99: ifne -> 274
    //   102: if_acmpne -> 246
    //   105: goto -> 112
    //   108: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   111: athrow
    //   112: getstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   115: aconst_null
    //   116: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   119: checkcast java/lang/Integer
    //   122: invokevirtual intValue : ()I
    //   125: istore #6
    //   127: iload #5
    //   129: lload_1
    //   130: lconst_0
    //   131: lcmp
    //   132: ifle -> 140
    //   135: ifne -> 225
    //   138: iload #6
    //   140: iconst_m1
    //   141: if_icmpne -> 211
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   154: new java/lang/StringBuilder
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: sipush #28532
    //   164: ldc2_w 4738768597053376883
    //   167: lload_1
    //   168: lxor
    //   169: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: invokestatic getVersion : ()Ljava/lang/String;
    //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: sipush #13872
    //   186: ldc2_w 6023387609955684400
    //   189: lload_1
    //   190: lxor
    //   191: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: invokevirtual toString : ()Ljava/lang/String;
    //   202: invokevirtual println : (Ljava/lang/String;)V
    //   205: iconst_1
    //   206: lload_3
    //   207: invokestatic b : (ZJ)I
    //   210: ireturn
    //   211: getstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   214: aconst_null
    //   215: iload #6
    //   217: iconst_1
    //   218: iadd
    //   219: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   222: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   225: goto -> 368
    //   228: astore #7
    //   230: aload #7
    //   232: invokevirtual printStackTrace : ()V
    //   235: iload #5
    //   237: lload_1
    //   238: lconst_0
    //   239: lcmp
    //   240: iflt -> 370
    //   243: ifeq -> 368
    //   246: getstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   249: invokevirtual getType : ()Ljava/lang/Class;
    //   252: iload #5
    //   254: ifne -> 284
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   263: athrow
    //   264: ldc_w java/util/concurrent/atomic/AtomicInteger
    //   267: goto -> 274
    //   270: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   273: athrow
    //   274: if_acmpne -> 317
    //   277: getstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   280: aconst_null
    //   281: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   284: checkcast java/util/concurrent/atomic/AtomicInteger
    //   287: astore #7
    //   289: aload #7
    //   291: invokevirtual incrementAndGet : ()I
    //   294: istore #6
    //   296: goto -> 368
    //   299: astore #7
    //   301: aload #7
    //   303: invokevirtual printStackTrace : ()V
    //   306: iload #5
    //   308: lload_1
    //   309: lconst_0
    //   310: lcmp
    //   311: ifle -> 370
    //   314: ifeq -> 368
    //   317: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   320: new java/lang/StringBuilder
    //   323: dup
    //   324: invokespecial <init> : ()V
    //   327: sipush #9388
    //   330: ldc2_w 8035878954345251498
    //   333: lload_1
    //   334: lxor
    //   335: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: getstatic me/rerere/matrix/internal/oa.b : Ljava/lang/reflect/Field;
    //   346: invokevirtual getType : ()Ljava/lang/Class;
    //   349: invokevirtual getName : ()Ljava/lang/String;
    //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: invokevirtual toString : ()Ljava/lang/String;
    //   358: invokevirtual println : (Ljava/lang/String;)V
    //   361: goto -> 368
    //   364: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   367: athrow
    //   368: iload #6
    //   370: iload #5
    //   372: lload_1
    //   373: lconst_0
    //   374: lcmp
    //   375: iflt -> 382
    //   378: ifne -> 458
    //   381: iconst_m1
    //   382: if_icmpne -> 456
    //   385: goto -> 392
    //   388: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   391: athrow
    //   392: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   395: new java/lang/StringBuilder
    //   398: dup
    //   399: invokespecial <init> : ()V
    //   402: sipush #13127
    //   405: ldc2_w 1133564785542124867
    //   408: lload_1
    //   409: lxor
    //   410: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: invokestatic getVersion : ()Ljava/lang/String;
    //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   424: sipush #9144
    //   427: ldc2_w 4386184284626798010
    //   430: lload_1
    //   431: lxor
    //   432: <illegal opcode> g : (IJ)Ljava/lang/String;
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: invokevirtual toString : ()Ljava/lang/String;
    //   443: invokevirtual println : (Ljava/lang/String;)V
    //   446: iconst_1
    //   447: lload_3
    //   448: invokestatic b : (ZJ)I
    //   451: ireturn
    //   452: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   455: athrow
    //   456: iload #6
    //   458: ireturn
    // Exception table:
    //   from	to	target	type
    //   19	30	33	java/lang/IllegalAccessException
    //   27	43	46	java/lang/IllegalAccessException
    //   37	53	56	java/lang/IllegalAccessException
    //   50	77	80	java/lang/IllegalAccessException
    //   88	105	108	java/lang/IllegalAccessException
    //   112	210	228	java/lang/IllegalAccessException
    //   127	144	147	java/lang/IllegalAccessException
    //   211	225	228	java/lang/IllegalAccessException
    //   230	257	260	java/lang/IllegalAccessException
    //   246	267	270	java/lang/IllegalAccessException
    //   277	296	299	java/lang/IllegalAccessException
    //   301	361	364	java/lang/IllegalAccessException
    //   368	385	388	java/lang/IllegalAccessException
    //   381	452	452	java/lang/IllegalAccessException
  }
  
  @NotNull
  public static String b(@NotNull Set<?> paramSet, Player paramPlayer) {
    ArrayList<Player> arrayList = new ArrayList(paramSet);
    arrayList.remove(paramPlayer);
    return ((Player)arrayList.get((new Random()).nextInt(arrayList.size()))).getName();
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x5059;
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
        throw new RuntimeException("me/rerere/matrix/internal/oa", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/oa'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\oa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
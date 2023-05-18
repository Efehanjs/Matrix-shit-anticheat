package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class tm {
  @NotNull
  private final SimpleDateFormat b;
  
  @NotNull
  private final SimpleDateFormat i;
  
  private static int[] a;
  
  private static final long c = o3.a(2714072799404771201L, -5222812882799201306L, MethodHandles.lookup().lookupClass()).a(118363886499852L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public tm(int paramInt, short paramShort, char paramChar) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/rerere/matrix/internal/tm.c : J
    //   26: lxor
    //   27: lstore #4
    //   29: aload_0
    //   30: invokespecial <init> : ()V
    //   33: aload_0
    //   34: new java/text/SimpleDateFormat
    //   37: dup
    //   38: sipush #15500
    //   41: ldc2_w 2297395019015726951
    //   44: lload #4
    //   46: lxor
    //   47: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   52: invokespecial <init> : (Ljava/lang/String;)V
    //   55: putfield i : Ljava/text/SimpleDateFormat;
    //   58: aload_0
    //   59: new java/text/SimpleDateFormat
    //   62: dup
    //   63: sipush #6218
    //   66: ldc2_w 8787426787090891689
    //   69: lload #4
    //   71: lxor
    //   72: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   77: invokespecial <init> : (Ljava/lang/String;)V
    //   80: putfield b : Ljava/text/SimpleDateFormat;
    //   83: return
  }
  
  public final void b(int paramInt, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/tm.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 9727004001043
    //   11: lxor
    //   12: lstore #4
    //   14: dup2
    //   15: ldc2_w 10260414909145
    //   18: lxor
    //   19: lstore #6
    //   21: pop2
    //   22: invokestatic r : ()I
    //   25: istore #8
    //   27: iload_1
    //   28: iload #8
    //   30: ifeq -> 45
    //   33: ifge -> 44
    //   36: goto -> 43
    //   39: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   42: athrow
    //   43: return
    //   44: iload_1
    //   45: iload #8
    //   47: lload_2
    //   48: lconst_0
    //   49: lcmp
    //   50: iflt -> 57
    //   53: ifeq -> 121
    //   56: iconst_3
    //   57: if_icmpge -> 99
    //   60: goto -> 67
    //   63: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   70: lload #6
    //   72: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   75: invokevirtual getLogger : ()Ljava/util/logging/Logger;
    //   78: sipush #25526
    //   81: ldc2_w 2866128003219744323
    //   84: lload_2
    //   85: lxor
    //   86: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   91: invokevirtual warning : (Ljava/lang/String;)V
    //   94: return
    //   95: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   102: sipush #28126
    //   105: ldc2_w 6753678168795080745
    //   108: lload_2
    //   109: lxor
    //   110: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   115: lload #4
    //   117: invokevirtual b : (Ljava/lang/String;J)V
    //   120: iconst_0
    //   121: istore #9
    //   123: new java/io/File
    //   126: dup
    //   127: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   130: lload #6
    //   132: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   135: invokevirtual getDataFolder : ()Ljava/io/File;
    //   138: sipush #22034
    //   141: ldc2_w 2405886126382470121
    //   144: lload_2
    //   145: lxor
    //   146: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   151: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   154: astore #10
    //   156: invokestatic j : ()J
    //   159: lstore #11
    //   161: aload #10
    //   163: astore #14
    //   165: aload #14
    //   167: astore #15
    //   169: iconst_0
    //   170: istore #16
    //   172: aload #15
    //   174: iload #8
    //   176: ifeq -> 201
    //   179: invokevirtual exists : ()Z
    //   182: ifeq -> 204
    //   185: goto -> 192
    //   188: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   191: athrow
    //   192: aload #14
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: goto -> 205
    //   204: aconst_null
    //   205: astore #13
    //   207: aload #13
    //   209: iload #8
    //   211: ifeq -> 230
    //   214: ifnull -> 653
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   223: athrow
    //   224: aload #13
    //   226: astore #15
    //   228: aload #15
    //   230: astore #16
    //   232: iconst_0
    //   233: istore #17
    //   235: aload #16
    //   237: iload #8
    //   239: ifeq -> 264
    //   242: invokevirtual isDirectory : ()Z
    //   245: ifeq -> 267
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   254: athrow
    //   255: aload #15
    //   257: goto -> 264
    //   260: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   263: athrow
    //   264: goto -> 268
    //   267: aconst_null
    //   268: astore #14
    //   270: aload #14
    //   272: iload #8
    //   274: ifeq -> 289
    //   277: ifnull -> 653
    //   280: goto -> 287
    //   283: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   286: athrow
    //   287: aload #14
    //   289: invokevirtual listFiles : ()[Ljava/io/File;
    //   292: astore #15
    //   294: aload #15
    //   296: iload #8
    //   298: ifeq -> 313
    //   301: ifnull -> 653
    //   304: goto -> 311
    //   307: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   310: athrow
    //   311: aload #15
    //   313: invokestatic asSequence : ([Ljava/lang/Object;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   316: astore #16
    //   318: aload #16
    //   320: iload #8
    //   322: ifeq -> 353
    //   325: ifnull -> 653
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   334: athrow
    //   335: aload #16
    //   337: getstatic me/rerere/matrix/internal/ig.i : Lme/rerere/matrix/internal/ig;
    //   340: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   343: invokestatic filter : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   346: goto -> 353
    //   349: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   352: athrow
    //   353: astore #17
    //   355: aload #17
    //   357: iload #8
    //   359: ifeq -> 390
    //   362: ifnull -> 653
    //   365: goto -> 372
    //   368: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   371: athrow
    //   372: aload #17
    //   374: getstatic me/rerere/matrix/internal/tn.i : Lme/rerere/matrix/internal/tn;
    //   377: checkcast me/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1
    //   380: invokestatic filter : (Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;Lme/rerere/matrix/thirdparty/kotlin/jvm/functions/Function1;)Lme/rerere/matrix/thirdparty/kotlin/sequences/Sequence;
    //   383: goto -> 390
    //   386: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   389: athrow
    //   390: astore #18
    //   392: aload #18
    //   394: iload #8
    //   396: ifeq -> 411
    //   399: ifnull -> 653
    //   402: goto -> 409
    //   405: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   408: athrow
    //   409: aload #18
    //   411: astore #19
    //   413: nop
    //   414: iconst_0
    //   415: istore #20
    //   417: aload #19
    //   419: invokeinterface iterator : ()Ljava/util/Iterator;
    //   424: astore #21
    //   426: aload #21
    //   428: invokeinterface hasNext : ()Z
    //   433: ifeq -> 635
    //   436: aload #21
    //   438: invokeinterface next : ()Ljava/lang/Object;
    //   443: astore #22
    //   445: aload #22
    //   447: checkcast java/io/File
    //   450: astore #23
    //   452: iconst_0
    //   453: istore #24
    //   455: nop
    //   456: aload #23
    //   458: invokevirtual getName : ()Ljava/lang/String;
    //   461: bipush #11
    //   463: bipush #21
    //   465: invokevirtual substring : (II)Ljava/lang/String;
    //   468: dup
    //   469: sipush #11280
    //   472: ldc2_w 8238926478865410543
    //   475: lload_2
    //   476: lxor
    //   477: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   482: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   485: astore #25
    //   487: aload_0
    //   488: getfield i : Ljava/text/SimpleDateFormat;
    //   491: aload #25
    //   493: invokevirtual parse : (Ljava/lang/String;)Ljava/util/Date;
    //   496: astore #26
    //   498: lload #11
    //   500: aload #26
    //   502: invokevirtual getTime : ()J
    //   505: lsub
    //   506: getstatic me/rerere/matrix/thirdparty/kotlin/time/Duration.Companion : Lme/rerere/matrix/thirdparty/kotlin/time/Duration$Companion;
    //   509: pop
    //   510: iconst_1
    //   511: getstatic me/rerere/matrix/thirdparty/kotlin/time/DurationUnit.DAYS : Lme/rerere/matrix/thirdparty/kotlin/time/DurationUnit;
    //   514: invokestatic toDuration : (ILme/rerere/matrix/thirdparty/kotlin/time/DurationUnit;)J
    //   517: invokestatic getInWholeMilliseconds-impl : (J)J
    //   520: ldiv
    //   521: l2i
    //   522: istore #27
    //   524: iload #8
    //   526: lload_2
    //   527: lconst_0
    //   528: lcmp
    //   529: ifle -> 650
    //   532: ifeq -> 642
    //   535: iload #8
    //   537: lload_2
    //   538: lconst_0
    //   539: lcmp
    //   540: ifle -> 632
    //   543: ifeq -> 630
    //   546: goto -> 553
    //   549: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   552: athrow
    //   553: lload_2
    //   554: lconst_0
    //   555: lcmp
    //   556: iflt -> 629
    //   559: iload #27
    //   561: iload_1
    //   562: if_icmplt -> 628
    //   565: goto -> 572
    //   568: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   571: athrow
    //   572: lload_2
    //   573: lconst_0
    //   574: lcmp
    //   575: iflt -> 618
    //   578: aload #23
    //   580: invokevirtual delete : ()Z
    //   583: iload #8
    //   585: ifeq -> 616
    //   588: goto -> 595
    //   591: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   594: athrow
    //   595: ifeq -> 628
    //   598: goto -> 605
    //   601: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   604: athrow
    //   605: iload #9
    //   607: iconst_1
    //   608: iadd
    //   609: goto -> 616
    //   612: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   615: athrow
    //   616: istore #9
    //   618: goto -> 628
    //   621: astore #25
    //   623: aload #25
    //   625: invokevirtual printStackTrace : ()V
    //   628: nop
    //   629: nop
    //   630: iload #8
    //   632: ifne -> 426
    //   635: lload_2
    //   636: lconst_0
    //   637: lcmp
    //   638: iflt -> 642
    //   641: nop
    //   642: lload_2
    //   643: lconst_0
    //   644: lcmp
    //   645: iflt -> 716
    //   648: iload #8
    //   650: ifne -> 661
    //   653: nop
    //   654: goto -> 661
    //   657: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   660: athrow
    //   661: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   664: new java/lang/StringBuilder
    //   667: dup
    //   668: invokespecial <init> : ()V
    //   671: sipush #18643
    //   674: ldc2_w 4155330917595106601
    //   677: lload_2
    //   678: lxor
    //   679: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   684: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   687: iload #9
    //   689: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   692: sipush #17015
    //   695: ldc2_w 3989738838361032587
    //   698: lload_2
    //   699: lxor
    //   700: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   705: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   708: invokevirtual toString : ()Ljava/lang/String;
    //   711: lload #4
    //   713: invokevirtual b : (Ljava/lang/String;J)V
    //   716: return
    // Exception table:
    //   from	to	target	type
    //   27	36	39	java/text/ParseException
    //   45	60	63	java/text/ParseException
    //   56	95	95	java/text/ParseException
    //   172	185	188	java/text/ParseException
    //   179	194	197	java/text/ParseException
    //   207	217	220	java/text/ParseException
    //   235	248	251	java/text/ParseException
    //   242	257	260	java/text/ParseException
    //   270	280	283	java/text/ParseException
    //   294	304	307	java/text/ParseException
    //   318	328	331	java/text/ParseException
    //   325	346	349	java/text/ParseException
    //   355	365	368	java/text/ParseException
    //   362	383	386	java/text/ParseException
    //   392	402	405	java/text/ParseException
    //   455	618	621	java/text/ParseException
    //   524	546	549	java/text/ParseException
    //   535	565	568	java/text/ParseException
    //   553	588	591	java/text/ParseException
    //   572	598	601	java/text/ParseException
    //   595	609	612	java/text/ParseException
    //   642	654	657	java/text/ParseException
  }
  
  public final void b(@NotNull String paramString, int paramInt1, short paramShort, int paramInt2) {
    // Byte code:
    //   0: iload_2
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_3
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload #4
    //   16: i2l
    //   17: bipush #48
    //   19: lshl
    //   20: bipush #48
    //   22: lushr
    //   23: lor
    //   24: getstatic me/rerere/matrix/internal/tm.c : J
    //   27: lxor
    //   28: lstore #5
    //   30: lload #5
    //   32: dup2
    //   33: ldc2_w 125396874339358
    //   36: lxor
    //   37: lstore #7
    //   39: dup2
    //   40: ldc2_w 75534836598398
    //   43: lxor
    //   44: lstore #9
    //   46: dup2
    //   47: ldc2_w 101683074242763
    //   50: lxor
    //   51: lstore #11
    //   53: dup2
    //   54: ldc2_w 103313852436737
    //   57: lxor
    //   58: lstore #13
    //   60: pop2
    //   61: invokestatic a : ()I
    //   64: istore #15
    //   66: getstatic me/rerere/matrix/internal/ge.s : Z
    //   69: ifne -> 77
    //   72: return
    //   73: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   76: athrow
    //   77: nop
    //   78: new java/io/File
    //   81: dup
    //   82: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   85: lload #13
    //   87: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   90: invokevirtual getDataFolder : ()Ljava/io/File;
    //   93: sipush #9944
    //   96: ldc2_w 6903201928279324916
    //   99: lload #5
    //   101: lxor
    //   102: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   107: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   110: astore #16
    //   112: aload #16
    //   114: iload #15
    //   116: ifne -> 163
    //   119: invokevirtual exists : ()Z
    //   122: ifne -> 145
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   131: athrow
    //   132: aload #16
    //   134: invokevirtual mkdirs : ()Z
    //   137: pop
    //   138: goto -> 145
    //   141: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   144: athrow
    //   145: new java/io/File
    //   148: dup
    //   149: aload #16
    //   151: aload_0
    //   152: aconst_null
    //   153: iconst_1
    //   154: lload #9
    //   156: aconst_null
    //   157: invokestatic b : (Lme/rerere/matrix/internal/tm;Ljava/util/Date;IJLjava/lang/Object;)Ljava/lang/String;
    //   160: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   163: astore #17
    //   165: iload_3
    //   166: ifgt -> 241
    //   169: aload #17
    //   171: iload #15
    //   173: ifne -> 204
    //   176: invokevirtual exists : ()Z
    //   179: ifne -> 202
    //   182: goto -> 189
    //   185: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   188: athrow
    //   189: aload #17
    //   191: invokevirtual createNewFile : ()Z
    //   194: pop
    //   195: goto -> 202
    //   198: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   201: athrow
    //   202: aload #17
    //   204: new java/lang/StringBuilder
    //   207: dup
    //   208: invokespecial <init> : ()V
    //   211: aload_0
    //   212: lload #7
    //   214: invokespecial b : (J)Ljava/lang/String;
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: aload_1
    //   221: invokestatic stripColor : (Ljava/lang/String;)Ljava/lang/String;
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: bipush #10
    //   229: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   232: invokevirtual toString : ()Ljava/lang/String;
    //   235: aconst_null
    //   236: iconst_2
    //   237: aconst_null
    //   238: invokestatic appendText$default : (Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    //   241: goto -> 294
    //   244: astore #16
    //   246: aload #16
    //   248: invokevirtual printStackTrace : ()V
    //   251: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   254: new java/lang/StringBuilder
    //   257: dup
    //   258: invokespecial <init> : ()V
    //   261: sipush #25136
    //   264: ldc2_w 1186112073317923857
    //   267: lload #5
    //   269: lxor
    //   270: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   275: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: aload #16
    //   280: invokevirtual getMessage : ()Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: invokevirtual toString : ()Ljava/lang/String;
    //   289: lload #11
    //   291: invokevirtual b : (Ljava/lang/String;J)V
    //   294: return
    // Exception table:
    //   from	to	target	type
    //   66	73	73	java/io/IOException
    //   77	241	244	java/io/IOException
    //   112	125	128	java/io/IOException
    //   119	138	141	java/io/IOException
    //   165	182	185	java/io/IOException
    //   176	195	198	java/io/IOException
  }
  
  public static void Y(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] q() {
    return a;
  }
  
  static {
    long l = c ^ 0x645236DE890AL;
    Y(null);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[13];
    boolean bool = false;
    String str;
    int i = (str = "T´\021:¾\002òËü0¢aU \030Â×ÉZ$Né\001I\030êtÆÁ\016Òê(p¼Á:\036â°`^]â4±X\bØª\000s%ËÀf ªÅÁTiíRè~\nK$am° 4-ÊsÖµêÜz\001Í£Æ/äc\016½\021DWÅ4)ü\020ûÇúbM÷í©üóa#(øÇ*;6d?,NÈòýn*×J>¦\007Þ\rj\000RnÔæ\005­\037¦% Oý\024¬.\020ÄþÍ¿ó¯+8ÁCÅ_jrx MVqv£\034ÃÊ'\f\027}\035ðð\nQ©\030Ý¦,l¾Oód¥0O\006ÿsåZÌGkzåi¨ï|3>¦ãdð=ï¶¬u´{WéI\021ÕørÞ\\SËÇP\020{\020Õ;ÙÜ(f^v\003xçË Ód03[Ì$@\\\024<Tcï\r²Î\036\037\005­\026\bë1¼j¹\"ËÌ\022jfæ\032µÑ>|º\030¶\030õq\020ß-{#&Úé\f¼\004ëh¶n7xHêè¥{Còà¦0Â\005¯ÜÎJ0³oÎ\002^¯á0\004\025ãe»:«\006{¶_Õ¡ =ÑX°\nivbÈ\027]Q%\030\033U_|`b\017»V").length();
    byte b2 = 88;
    byte b = -1;
    while (true);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x71F5;
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
        throw new RuntimeException("me/rerere/matrix/internal/tm", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/tm'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\tm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
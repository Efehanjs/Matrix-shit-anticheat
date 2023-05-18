package me.rerere.matrix.thirdparty.org.objectweb.asm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import me.rerere.matrix.internal.o3;

public class ClassReader {
  private final ConstantDynamic[] constantDynamicValues;
  
  public static final int SKIP_DEBUG = 2;
  
  private final int maxStringLength;
  
  public static final int EXPAND_FRAMES = 8;
  
  public final byte[] classFileBuffer;
  
  private final int[] cpInfoOffsets;
  
  public static final int SKIP_FRAMES = 4;
  
  private final int[] bootstrapMethodOffsets;
  
  private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;
  
  public final int header;
  
  public static final int EXPAND_ASM_INSNS = 256;
  
  private static final int MAX_BUFFER_SIZE = 1048576;
  
  private final String[] constantUtf8Values;
  
  @Deprecated
  public final byte[] b;
  
  public static final int SKIP_CODE = 1;
  
  private static final long a = o3.a(5590141067367672234L, -1929406274385453186L, null).a(180678505160307L);
  
  public String readPackage(int paramInt, char[] paramArrayOfchar) {
    return readStringish(paramInt, paramArrayOfchar);
  }
  
  public String readModule(int paramInt, char[] paramArrayOfchar) {
    return readStringish(paramInt, paramArrayOfchar);
  }
  
  public ClassReader(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/ClassReader.a : J
    //   3: ldc2_w 126808998763011
    //   6: lxor
    //   7: lstore #4
    //   9: aload_0
    //   10: invokespecial <init> : ()V
    //   13: aload_0
    //   14: aload_1
    //   15: putfield classFileBuffer : [B
    //   18: aload_0
    //   19: aload_1
    //   20: putfield b : [B
    //   23: iload_3
    //   24: ifeq -> 79
    //   27: aload_0
    //   28: iload_2
    //   29: bipush #6
    //   31: iadd
    //   32: invokevirtual readShort : (I)S
    //   35: bipush #64
    //   37: if_icmple -> 79
    //   40: new java/lang/IllegalArgumentException
    //   43: dup
    //   44: new java/lang/StringBuilder
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: ldc_w 'Unsupported class file major version '
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: aload_0
    //   58: iload_2
    //   59: bipush #6
    //   61: iadd
    //   62: invokevirtual readShort : (I)S
    //   65: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   68: invokevirtual toString : ()Ljava/lang/String;
    //   71: invokespecial <init> : (Ljava/lang/String;)V
    //   74: athrow
    //   75: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   78: athrow
    //   79: aload_0
    //   80: iload_2
    //   81: bipush #8
    //   83: iadd
    //   84: invokevirtual readUnsignedShort : (I)I
    //   87: istore #6
    //   89: aload_0
    //   90: iload #6
    //   92: newarray int
    //   94: putfield cpInfoOffsets : [I
    //   97: aload_0
    //   98: iload #6
    //   100: anewarray java/lang/String
    //   103: putfield constantUtf8Values : [Ljava/lang/String;
    //   106: iconst_1
    //   107: istore #7
    //   109: iload_2
    //   110: bipush #10
    //   112: iadd
    //   113: istore #8
    //   115: iconst_0
    //   116: istore #9
    //   118: iconst_0
    //   119: istore #10
    //   121: iconst_0
    //   122: istore #11
    //   124: iload #7
    //   126: iload #6
    //   128: if_icmpge -> 341
    //   131: aload_0
    //   132: getfield cpInfoOffsets : [I
    //   135: iload #7
    //   137: iinc #7, 1
    //   140: iload #8
    //   142: iconst_1
    //   143: iadd
    //   144: iastore
    //   145: aload_1
    //   146: iload #8
    //   148: baload
    //   149: tableswitch default -> 323, 1 -> 285, 2 -> 323, 3 -> 248, 4 -> 248, 5 -> 275, 6 -> 275, 7 -> 317, 8 -> 317, 9 -> 248, 10 -> 248, 11 -> 248, 12 -> 248, 13 -> 323, 14 -> 323, 15 -> 311, 16 -> 317, 17 -> 254, 18 -> 266, 19 -> 317, 20 -> 317
    //   244: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   247: athrow
    //   248: iconst_5
    //   249: istore #12
    //   251: goto -> 331
    //   254: iconst_5
    //   255: istore #12
    //   257: iconst_1
    //   258: istore #10
    //   260: iconst_1
    //   261: istore #11
    //   263: goto -> 331
    //   266: iconst_5
    //   267: istore #12
    //   269: iconst_1
    //   270: istore #10
    //   272: goto -> 331
    //   275: bipush #9
    //   277: istore #12
    //   279: iinc #7, 1
    //   282: goto -> 331
    //   285: iconst_3
    //   286: aload_0
    //   287: iload #8
    //   289: iconst_1
    //   290: iadd
    //   291: invokevirtual readUnsignedShort : (I)I
    //   294: iadd
    //   295: istore #12
    //   297: iload #12
    //   299: iload #9
    //   301: if_icmple -> 331
    //   304: iload #12
    //   306: istore #9
    //   308: goto -> 331
    //   311: iconst_4
    //   312: istore #12
    //   314: goto -> 331
    //   317: iconst_3
    //   318: istore #12
    //   320: goto -> 331
    //   323: new java/lang/IllegalArgumentException
    //   326: dup
    //   327: invokespecial <init> : ()V
    //   330: athrow
    //   331: iload #8
    //   333: iload #12
    //   335: iadd
    //   336: istore #8
    //   338: goto -> 124
    //   341: aload_0
    //   342: iload #9
    //   344: putfield maxStringLength : I
    //   347: aload_0
    //   348: iload #8
    //   350: putfield header : I
    //   353: aload_0
    //   354: iload #11
    //   356: ifeq -> 371
    //   359: iload #6
    //   361: anewarray me/rerere/matrix/thirdparty/org/objectweb/asm/ConstantDynamic
    //   364: goto -> 372
    //   367: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   370: athrow
    //   371: aconst_null
    //   372: putfield constantDynamicValues : [Lme/rerere/matrix/thirdparty/org/objectweb/asm/ConstantDynamic;
    //   375: aload_0
    //   376: iload #10
    //   378: ifeq -> 394
    //   381: aload_0
    //   382: iload #9
    //   384: invokespecial readBootstrapMethodsAttribute : (I)[I
    //   387: goto -> 395
    //   390: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   393: athrow
    //   394: aconst_null
    //   395: putfield bootstrapMethodOffsets : [I
    //   398: return
    // Exception table:
    //   from	to	target	type
    //   27	75	75	java/lang/IllegalArgumentException
    //   124	244	244	java/lang/IllegalArgumentException
    //   341	367	367	java/lang/IllegalArgumentException
    //   372	390	390	java/lang/IllegalArgumentException
  }
  
  public void accept(ClassVisitor paramClassVisitor, int paramInt) {
    accept(paramClassVisitor, new Attribute[0], paramInt);
  }
  
  public int getItem(int paramInt) {
    return this.cpInfoOffsets[paramInt];
  }
  
  public short readShort(int paramInt) {
    byte[] arrayOfByte = this.classFileBuffer;
    return (short)((arrayOfByte[paramInt] & 0xFF) << 8 | arrayOfByte[paramInt + 1] & 0xFF);
  }
  
  public int readByte(int paramInt) {
    return this.classFileBuffer[paramInt] & 0xFF;
  }
  
  public ClassReader(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int readUnsignedShort(int paramInt) {
    byte[] arrayOfByte = this.classFileBuffer;
    return (arrayOfByte[paramInt] & 0xFF) << 8 | arrayOfByte[paramInt + 1] & 0xFF;
  }
  
  public void accept(ClassVisitor paramClassVisitor, Attribute[] paramArrayOfAttribute, int paramInt) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/thirdparty/org/objectweb/asm/ClassReader.a : J
    //   3: ldc2_w 81780524089103
    //   6: lxor
    //   7: lstore #4
    //   9: new me/rerere/matrix/thirdparty/org/objectweb/asm/Context
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #6
    //   18: aload #6
    //   20: aload_2
    //   21: putfield attributePrototypes : [Lme/rerere/matrix/thirdparty/org/objectweb/asm/Attribute;
    //   24: aload #6
    //   26: iload_3
    //   27: putfield parsingOptions : I
    //   30: aload #6
    //   32: aload_0
    //   33: getfield maxStringLength : I
    //   36: newarray char
    //   38: putfield charBuffer : [C
    //   41: aload #6
    //   43: getfield charBuffer : [C
    //   46: astore #7
    //   48: aload_0
    //   49: getfield header : I
    //   52: istore #8
    //   54: aload_0
    //   55: iload #8
    //   57: invokevirtual readUnsignedShort : (I)I
    //   60: istore #9
    //   62: aload_0
    //   63: iload #8
    //   65: iconst_2
    //   66: iadd
    //   67: aload #7
    //   69: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   72: astore #10
    //   74: aload_0
    //   75: iload #8
    //   77: iconst_4
    //   78: iadd
    //   79: aload #7
    //   81: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   84: astore #11
    //   86: aload_0
    //   87: iload #8
    //   89: bipush #6
    //   91: iadd
    //   92: invokevirtual readUnsignedShort : (I)I
    //   95: anewarray java/lang/String
    //   98: astore #12
    //   100: iinc #8, 8
    //   103: iconst_0
    //   104: istore #13
    //   106: iload #13
    //   108: aload #12
    //   110: arraylength
    //   111: if_icmpge -> 140
    //   114: aload #12
    //   116: iload #13
    //   118: aload_0
    //   119: iload #8
    //   121: aload #7
    //   123: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   126: aastore
    //   127: iinc #8, 2
    //   130: iinc #13, 1
    //   133: goto -> 106
    //   136: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   139: athrow
    //   140: iconst_0
    //   141: istore #13
    //   143: iconst_0
    //   144: istore #14
    //   146: aconst_null
    //   147: astore #15
    //   149: aconst_null
    //   150: astore #16
    //   152: aconst_null
    //   153: astore #17
    //   155: iconst_0
    //   156: istore #18
    //   158: iconst_0
    //   159: istore #19
    //   161: iconst_0
    //   162: istore #20
    //   164: iconst_0
    //   165: istore #21
    //   167: iconst_0
    //   168: istore #22
    //   170: iconst_0
    //   171: istore #23
    //   173: aconst_null
    //   174: astore #24
    //   176: aconst_null
    //   177: astore #25
    //   179: iconst_0
    //   180: istore #26
    //   182: iconst_0
    //   183: istore #27
    //   185: iconst_0
    //   186: istore #28
    //   188: aconst_null
    //   189: astore #29
    //   191: aload_0
    //   192: invokevirtual getFirstAttributeOffset : ()I
    //   195: istore #30
    //   197: aload_0
    //   198: iload #30
    //   200: iconst_2
    //   201: isub
    //   202: invokevirtual readUnsignedShort : (I)I
    //   205: istore #31
    //   207: iload #31
    //   209: ifle -> 685
    //   212: aload_0
    //   213: iload #30
    //   215: aload #7
    //   217: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   220: astore #32
    //   222: aload_0
    //   223: iload #30
    //   225: iconst_2
    //   226: iadd
    //   227: invokevirtual readInt : (I)I
    //   230: istore #33
    //   232: iinc #30, 6
    //   235: ldc_w 'SourceFile'
    //   238: aload #32
    //   240: invokevirtual equals : (Ljava/lang/Object;)Z
    //   243: ifeq -> 259
    //   246: aload_0
    //   247: iload #30
    //   249: aload #7
    //   251: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   254: astore #16
    //   256: goto -> 672
    //   259: ldc_w 'InnerClasses'
    //   262: aload #32
    //   264: invokevirtual equals : (Ljava/lang/Object;)Z
    //   267: ifeq -> 277
    //   270: iload #30
    //   272: istore #13
    //   274: goto -> 672
    //   277: ldc_w 'EnclosingMethod'
    //   280: aload #32
    //   282: invokevirtual equals : (Ljava/lang/Object;)Z
    //   285: ifeq -> 295
    //   288: iload #30
    //   290: istore #14
    //   292: goto -> 672
    //   295: ldc_w 'NestHost'
    //   298: aload #32
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifeq -> 319
    //   306: aload_0
    //   307: iload #30
    //   309: aload #7
    //   311: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   314: astore #25
    //   316: goto -> 672
    //   319: ldc_w 'NestMembers'
    //   322: aload #32
    //   324: invokevirtual equals : (Ljava/lang/Object;)Z
    //   327: ifeq -> 337
    //   330: iload #30
    //   332: istore #26
    //   334: goto -> 672
    //   337: ldc_w 'PermittedSubclasses'
    //   340: aload #32
    //   342: invokevirtual equals : (Ljava/lang/Object;)Z
    //   345: ifeq -> 355
    //   348: iload #30
    //   350: istore #27
    //   352: goto -> 672
    //   355: ldc 'Signature'
    //   357: aload #32
    //   359: invokevirtual equals : (Ljava/lang/Object;)Z
    //   362: ifeq -> 378
    //   365: aload_0
    //   366: iload #30
    //   368: aload #7
    //   370: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   373: astore #15
    //   375: goto -> 672
    //   378: ldc 'RuntimeVisibleAnnotations'
    //   380: aload #32
    //   382: invokevirtual equals : (Ljava/lang/Object;)Z
    //   385: ifeq -> 395
    //   388: iload #30
    //   390: istore #18
    //   392: goto -> 672
    //   395: ldc 'RuntimeVisibleTypeAnnotations'
    //   397: aload #32
    //   399: invokevirtual equals : (Ljava/lang/Object;)Z
    //   402: ifeq -> 412
    //   405: iload #30
    //   407: istore #20
    //   409: goto -> 672
    //   412: ldc 'Deprecated'
    //   414: aload #32
    //   416: invokevirtual equals : (Ljava/lang/Object;)Z
    //   419: ifeq -> 432
    //   422: iload #9
    //   424: ldc 131072
    //   426: ior
    //   427: istore #9
    //   429: goto -> 672
    //   432: ldc 'Synthetic'
    //   434: aload #32
    //   436: invokevirtual equals : (Ljava/lang/Object;)Z
    //   439: ifeq -> 453
    //   442: iload #9
    //   444: sipush #4096
    //   447: ior
    //   448: istore #9
    //   450: goto -> 672
    //   453: ldc_w 'SourceDebugExtension'
    //   456: aload #32
    //   458: invokevirtual equals : (Ljava/lang/Object;)Z
    //   461: ifeq -> 513
    //   464: iload #33
    //   466: aload_0
    //   467: getfield classFileBuffer : [B
    //   470: arraylength
    //   471: iload #30
    //   473: isub
    //   474: if_icmple -> 496
    //   477: goto -> 484
    //   480: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   483: athrow
    //   484: new java/lang/IllegalArgumentException
    //   487: dup
    //   488: invokespecial <init> : ()V
    //   491: athrow
    //   492: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   495: athrow
    //   496: aload_0
    //   497: iload #30
    //   499: iload #33
    //   501: iload #33
    //   503: newarray char
    //   505: invokespecial readUtf : (II[C)Ljava/lang/String;
    //   508: astore #17
    //   510: goto -> 672
    //   513: ldc 'RuntimeInvisibleAnnotations'
    //   515: aload #32
    //   517: invokevirtual equals : (Ljava/lang/Object;)Z
    //   520: ifeq -> 530
    //   523: iload #30
    //   525: istore #19
    //   527: goto -> 672
    //   530: ldc 'RuntimeInvisibleTypeAnnotations'
    //   532: aload #32
    //   534: invokevirtual equals : (Ljava/lang/Object;)Z
    //   537: ifeq -> 547
    //   540: iload #30
    //   542: istore #21
    //   544: goto -> 672
    //   547: ldc_w 'Record'
    //   550: aload #32
    //   552: invokevirtual equals : (Ljava/lang/Object;)Z
    //   555: ifeq -> 573
    //   558: iload #30
    //   560: istore #28
    //   562: iload #9
    //   564: ldc_w 65536
    //   567: ior
    //   568: istore #9
    //   570: goto -> 672
    //   573: ldc_w 'Module'
    //   576: aload #32
    //   578: invokevirtual equals : (Ljava/lang/Object;)Z
    //   581: ifeq -> 591
    //   584: iload #30
    //   586: istore #22
    //   588: goto -> 672
    //   591: ldc_w 'ModuleMainClass'
    //   594: aload #32
    //   596: invokevirtual equals : (Ljava/lang/Object;)Z
    //   599: ifeq -> 615
    //   602: aload_0
    //   603: iload #30
    //   605: aload #7
    //   607: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   610: astore #24
    //   612: goto -> 672
    //   615: ldc_w 'ModulePackages'
    //   618: aload #32
    //   620: invokevirtual equals : (Ljava/lang/Object;)Z
    //   623: ifeq -> 633
    //   626: iload #30
    //   628: istore #23
    //   630: goto -> 672
    //   633: ldc_w 'BootstrapMethods'
    //   636: aload #32
    //   638: invokevirtual equals : (Ljava/lang/Object;)Z
    //   641: ifne -> 672
    //   644: aload_0
    //   645: aload_2
    //   646: aload #32
    //   648: iload #30
    //   650: iload #33
    //   652: aload #7
    //   654: iconst_m1
    //   655: aconst_null
    //   656: invokespecial readAttribute : ([Lme/rerere/matrix/thirdparty/org/objectweb/asm/Attribute;Ljava/lang/String;II[CI[Lme/rerere/matrix/thirdparty/org/objectweb/asm/Label;)Lme/rerere/matrix/thirdparty/org/objectweb/asm/Attribute;
    //   659: astore #34
    //   661: aload #34
    //   663: aload #29
    //   665: putfield nextAttribute : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Attribute;
    //   668: aload #34
    //   670: astore #29
    //   672: iload #30
    //   674: iload #33
    //   676: iadd
    //   677: istore #30
    //   679: iinc #31, -1
    //   682: goto -> 207
    //   685: aload_1
    //   686: aload_0
    //   687: aload_0
    //   688: getfield cpInfoOffsets : [I
    //   691: iconst_1
    //   692: iaload
    //   693: bipush #7
    //   695: isub
    //   696: invokevirtual readInt : (I)I
    //   699: iload #9
    //   701: aload #10
    //   703: aload #15
    //   705: aload #11
    //   707: aload #12
    //   709: invokevirtual visit : (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    //   712: iload_3
    //   713: iconst_2
    //   714: iand
    //   715: ifne -> 757
    //   718: aload #16
    //   720: ifnonnull -> 742
    //   723: goto -> 730
    //   726: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   729: athrow
    //   730: aload #17
    //   732: ifnull -> 757
    //   735: goto -> 742
    //   738: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   741: athrow
    //   742: aload_1
    //   743: aload #16
    //   745: aload #17
    //   747: invokevirtual visitSource : (Ljava/lang/String;Ljava/lang/String;)V
    //   750: goto -> 757
    //   753: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   756: athrow
    //   757: iload #22
    //   759: ifeq -> 782
    //   762: aload_0
    //   763: aload_1
    //   764: aload #6
    //   766: iload #22
    //   768: iload #23
    //   770: aload #24
    //   772: invokespecial readModuleAttributes : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor;Lme/rerere/matrix/thirdparty/org/objectweb/asm/Context;IILjava/lang/String;)V
    //   775: goto -> 782
    //   778: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   781: athrow
    //   782: aload #25
    //   784: ifnull -> 800
    //   787: aload_1
    //   788: aload #25
    //   790: invokevirtual visitNestHost : (Ljava/lang/String;)V
    //   793: goto -> 800
    //   796: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   799: athrow
    //   800: iload #14
    //   802: ifeq -> 893
    //   805: aload_0
    //   806: iload #14
    //   808: aload #7
    //   810: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   813: astore #31
    //   815: aload_0
    //   816: iload #14
    //   818: iconst_2
    //   819: iadd
    //   820: invokevirtual readUnsignedShort : (I)I
    //   823: istore #32
    //   825: iload #32
    //   827: ifne -> 838
    //   830: aconst_null
    //   831: goto -> 851
    //   834: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   837: athrow
    //   838: aload_0
    //   839: aload_0
    //   840: getfield cpInfoOffsets : [I
    //   843: iload #32
    //   845: iaload
    //   846: aload #7
    //   848: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   851: astore #33
    //   853: iload #32
    //   855: ifne -> 866
    //   858: aconst_null
    //   859: goto -> 881
    //   862: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   865: athrow
    //   866: aload_0
    //   867: aload_0
    //   868: getfield cpInfoOffsets : [I
    //   871: iload #32
    //   873: iaload
    //   874: iconst_2
    //   875: iadd
    //   876: aload #7
    //   878: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   881: astore #34
    //   883: aload_1
    //   884: aload #31
    //   886: aload #33
    //   888: aload #34
    //   890: invokevirtual visitOuterClass : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   893: iload #18
    //   895: ifeq -> 954
    //   898: aload_0
    //   899: iload #18
    //   901: invokevirtual readUnsignedShort : (I)I
    //   904: istore #31
    //   906: iload #18
    //   908: iconst_2
    //   909: iadd
    //   910: istore #32
    //   912: iload #31
    //   914: iinc #31, -1
    //   917: ifle -> 954
    //   920: aload_0
    //   921: iload #32
    //   923: aload #7
    //   925: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   928: astore #33
    //   930: iinc #32, 2
    //   933: aload_0
    //   934: aload_1
    //   935: aload #33
    //   937: iconst_1
    //   938: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;
    //   941: iload #32
    //   943: iconst_1
    //   944: aload #7
    //   946: invokespecial readElementValues : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;IZ[C)I
    //   949: istore #32
    //   951: goto -> 912
    //   954: iload #19
    //   956: ifeq -> 1015
    //   959: aload_0
    //   960: iload #19
    //   962: invokevirtual readUnsignedShort : (I)I
    //   965: istore #31
    //   967: iload #19
    //   969: iconst_2
    //   970: iadd
    //   971: istore #32
    //   973: iload #31
    //   975: iinc #31, -1
    //   978: ifle -> 1015
    //   981: aload_0
    //   982: iload #32
    //   984: aload #7
    //   986: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   989: astore #33
    //   991: iinc #32, 2
    //   994: aload_0
    //   995: aload_1
    //   996: aload #33
    //   998: iconst_0
    //   999: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;
    //   1002: iload #32
    //   1004: iconst_1
    //   1005: aload #7
    //   1007: invokespecial readElementValues : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;IZ[C)I
    //   1010: istore #32
    //   1012: goto -> 973
    //   1015: iload #20
    //   1017: ifeq -> 1096
    //   1020: aload_0
    //   1021: iload #20
    //   1023: invokevirtual readUnsignedShort : (I)I
    //   1026: istore #31
    //   1028: iload #20
    //   1030: iconst_2
    //   1031: iadd
    //   1032: istore #32
    //   1034: iload #31
    //   1036: iinc #31, -1
    //   1039: ifle -> 1096
    //   1042: aload_0
    //   1043: aload #6
    //   1045: iload #32
    //   1047: invokespecial readTypeAnnotationTarget : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/Context;I)I
    //   1050: istore #32
    //   1052: aload_0
    //   1053: iload #32
    //   1055: aload #7
    //   1057: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   1060: astore #33
    //   1062: iinc #32, 2
    //   1065: aload_0
    //   1066: aload_1
    //   1067: aload #6
    //   1069: getfield currentTypeAnnotationTarget : I
    //   1072: aload #6
    //   1074: getfield currentTypeAnnotationTargetPath : Lme/rerere/matrix/thirdparty/org/objectweb/asm/TypePath;
    //   1077: aload #33
    //   1079: iconst_1
    //   1080: invokevirtual visitTypeAnnotation : (ILme/rerere/matrix/thirdparty/org/objectweb/asm/TypePath;Ljava/lang/String;Z)Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;
    //   1083: iload #32
    //   1085: iconst_1
    //   1086: aload #7
    //   1088: invokespecial readElementValues : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;IZ[C)I
    //   1091: istore #32
    //   1093: goto -> 1034
    //   1096: iload #21
    //   1098: ifeq -> 1177
    //   1101: aload_0
    //   1102: iload #21
    //   1104: invokevirtual readUnsignedShort : (I)I
    //   1107: istore #31
    //   1109: iload #21
    //   1111: iconst_2
    //   1112: iadd
    //   1113: istore #32
    //   1115: iload #31
    //   1117: iinc #31, -1
    //   1120: ifle -> 1177
    //   1123: aload_0
    //   1124: aload #6
    //   1126: iload #32
    //   1128: invokespecial readTypeAnnotationTarget : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/Context;I)I
    //   1131: istore #32
    //   1133: aload_0
    //   1134: iload #32
    //   1136: aload #7
    //   1138: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   1141: astore #33
    //   1143: iinc #32, 2
    //   1146: aload_0
    //   1147: aload_1
    //   1148: aload #6
    //   1150: getfield currentTypeAnnotationTarget : I
    //   1153: aload #6
    //   1155: getfield currentTypeAnnotationTargetPath : Lme/rerere/matrix/thirdparty/org/objectweb/asm/TypePath;
    //   1158: aload #33
    //   1160: iconst_0
    //   1161: invokevirtual visitTypeAnnotation : (ILme/rerere/matrix/thirdparty/org/objectweb/asm/TypePath;Ljava/lang/String;Z)Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;
    //   1164: iload #32
    //   1166: iconst_1
    //   1167: aload #7
    //   1169: invokespecial readElementValues : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/AnnotationVisitor;IZ[C)I
    //   1172: istore #32
    //   1174: goto -> 1115
    //   1177: aload #29
    //   1179: ifnull -> 1208
    //   1182: aload #29
    //   1184: getfield nextAttribute : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Attribute;
    //   1187: astore #31
    //   1189: aload #29
    //   1191: aconst_null
    //   1192: putfield nextAttribute : Lme/rerere/matrix/thirdparty/org/objectweb/asm/Attribute;
    //   1195: aload_1
    //   1196: aload #29
    //   1198: invokevirtual visitAttribute : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/Attribute;)V
    //   1201: aload #31
    //   1203: astore #29
    //   1205: goto -> 1177
    //   1208: iload #26
    //   1210: ifeq -> 1257
    //   1213: aload_0
    //   1214: iload #26
    //   1216: invokevirtual readUnsignedShort : (I)I
    //   1219: istore #31
    //   1221: iload #26
    //   1223: iconst_2
    //   1224: iadd
    //   1225: istore #32
    //   1227: iload #31
    //   1229: iinc #31, -1
    //   1232: ifle -> 1257
    //   1235: aload_1
    //   1236: aload_0
    //   1237: iload #32
    //   1239: aload #7
    //   1241: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   1244: invokevirtual visitNestMember : (Ljava/lang/String;)V
    //   1247: iinc #32, 2
    //   1250: goto -> 1227
    //   1253: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1256: athrow
    //   1257: iload #27
    //   1259: ifeq -> 1306
    //   1262: aload_0
    //   1263: iload #27
    //   1265: invokevirtual readUnsignedShort : (I)I
    //   1268: istore #31
    //   1270: iload #27
    //   1272: iconst_2
    //   1273: iadd
    //   1274: istore #32
    //   1276: iload #31
    //   1278: iinc #31, -1
    //   1281: ifle -> 1306
    //   1284: aload_1
    //   1285: aload_0
    //   1286: iload #32
    //   1288: aload #7
    //   1290: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   1293: invokevirtual visitPermittedSubclass : (Ljava/lang/String;)V
    //   1296: iinc #32, 2
    //   1299: goto -> 1276
    //   1302: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1305: athrow
    //   1306: iload #13
    //   1308: ifeq -> 1384
    //   1311: aload_0
    //   1312: iload #13
    //   1314: invokevirtual readUnsignedShort : (I)I
    //   1317: istore #31
    //   1319: iload #13
    //   1321: iconst_2
    //   1322: iadd
    //   1323: istore #32
    //   1325: iload #31
    //   1327: iinc #31, -1
    //   1330: ifle -> 1384
    //   1333: aload_1
    //   1334: aload_0
    //   1335: iload #32
    //   1337: aload #7
    //   1339: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   1342: aload_0
    //   1343: iload #32
    //   1345: iconst_2
    //   1346: iadd
    //   1347: aload #7
    //   1349: invokevirtual readClass : (I[C)Ljava/lang/String;
    //   1352: aload_0
    //   1353: iload #32
    //   1355: iconst_4
    //   1356: iadd
    //   1357: aload #7
    //   1359: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
    //   1362: aload_0
    //   1363: iload #32
    //   1365: bipush #6
    //   1367: iadd
    //   1368: invokevirtual readUnsignedShort : (I)I
    //   1371: invokevirtual visitInnerClass : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    //   1374: iinc #32, 8
    //   1377: goto -> 1325
    //   1380: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1383: athrow
    //   1384: iload #28
    //   1386: ifeq -> 1422
    //   1389: aload_0
    //   1390: iload #28
    //   1392: invokevirtual readUnsignedShort : (I)I
    //   1395: istore #31
    //   1397: iinc #28, 2
    //   1400: iload #31
    //   1402: iinc #31, -1
    //   1405: ifle -> 1422
    //   1408: aload_0
    //   1409: aload_1
    //   1410: aload #6
    //   1412: iload #28
    //   1414: invokespecial readRecordComponent : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor;Lme/rerere/matrix/thirdparty/org/objectweb/asm/Context;I)I
    //   1417: istore #28
    //   1419: goto -> 1400
    //   1422: aload_0
    //   1423: iload #8
    //   1425: invokevirtual readUnsignedShort : (I)I
    //   1428: istore #31
    //   1430: iinc #8, 2
    //   1433: iload #31
    //   1435: iinc #31, -1
    //   1438: ifle -> 1455
    //   1441: aload_0
    //   1442: aload_1
    //   1443: aload #6
    //   1445: iload #8
    //   1447: invokespecial readField : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor;Lme/rerere/matrix/thirdparty/org/objectweb/asm/Context;I)I
    //   1450: istore #8
    //   1452: goto -> 1433
    //   1455: aload_0
    //   1456: iload #8
    //   1458: invokevirtual readUnsignedShort : (I)I
    //   1461: istore #32
    //   1463: iinc #8, 2
    //   1466: iload #32
    //   1468: iinc #32, -1
    //   1471: ifle -> 1488
    //   1474: aload_0
    //   1475: aload_1
    //   1476: aload #6
    //   1478: iload #8
    //   1480: invokespecial readMethod : (Lme/rerere/matrix/thirdparty/org/objectweb/asm/ClassVisitor;Lme/rerere/matrix/thirdparty/org/objectweb/asm/Context;I)I
    //   1483: istore #8
    //   1485: goto -> 1466
    //   1488: aload_1
    //   1489: invokevirtual visitEnd : ()V
    //   1492: return
    // Exception table:
    //   from	to	target	type
    //   106	136	136	java/lang/IllegalArgumentException
    //   453	477	480	java/lang/IllegalArgumentException
    //   464	492	492	java/lang/IllegalArgumentException
    //   685	723	726	java/lang/IllegalArgumentException
    //   718	735	738	java/lang/IllegalArgumentException
    //   730	750	753	java/lang/IllegalArgumentException
    //   757	775	778	java/lang/IllegalArgumentException
    //   782	793	796	java/lang/IllegalArgumentException
    //   825	834	834	java/lang/IllegalArgumentException
    //   853	862	862	java/lang/IllegalArgumentException
    //   1227	1253	1253	java/lang/IllegalArgumentException
    //   1276	1302	1302	java/lang/IllegalArgumentException
    //   1325	1380	1380	java/lang/IllegalArgumentException
  }
  
  public ClassReader(String paramString) throws IOException {
    this(readStream(ClassLoader.getSystemResourceAsStream(paramString.replace('.', '/') + ".class"), true));
  }
  
  public String readClass(int paramInt, char[] paramArrayOfchar) {
    return readStringish(paramInt, paramArrayOfchar);
  }
  
  public String getSuperName() {
    return readClass(this.header + 4, new char[this.maxStringLength]);
  }
  
  public long readLong(int paramInt) {
    long l1 = readInt(paramInt);
    long l2 = readInt(paramInt + 4) & 0xFFFFFFFFL;
    return l1 << 32L | l2;
  }
  
  public String getClassName() {
    return readClass(this.header + 2, new char[this.maxStringLength]);
  }
  
  public String readUTF8(int paramInt, char[] paramArrayOfchar) {
    int i = readUnsignedShort(paramInt);
    try {
      if (paramInt != 0)
        try {
          return (i != 0) ? readUtf(i, paramArrayOfchar) : null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  public int getMaxStringLength() {
    return this.maxStringLength;
  }
  
  public int getItemCount() {
    return this.cpInfoOffsets.length;
  }
  
  public int readInt(int paramInt) {
    byte[] arrayOfByte = this.classFileBuffer;
    return (arrayOfByte[paramInt] & 0xFF) << 24 | (arrayOfByte[paramInt + 1] & 0xFF) << 16 | (arrayOfByte[paramInt + 2] & 0xFF) << 8 | arrayOfByte[paramInt + 3] & 0xFF;
  }
  
  public int getAccess() {
    return readUnsignedShort(this.header);
  }
  
  public Label readLabel(int paramInt, Label[] paramArrayOfLabel) {
    try {
      if (paramArrayOfLabel[paramInt] == null)
        paramArrayOfLabel[paramInt] = new Label(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return paramArrayOfLabel[paramInt];
  }
  
  public Object readConst(int paramInt, char[] paramArrayOfchar) {
    int i = this.cpInfoOffsets[paramInt];
    try {
      int j;
      int k;
      int m;
      String str1;
      String str2;
      String str3;
      boolean bool;
      switch (this.classFileBuffer[i - 1]) {
        case 3:
          return Integer.valueOf(readInt(i));
        case 4:
          return Float.valueOf(Float.intBitsToFloat(readInt(i)));
        case 5:
          return Long.valueOf(readLong(i));
        case 6:
          return Double.valueOf(Double.longBitsToDouble(readLong(i)));
        case 7:
          return Type.getObjectType(readUTF8(i, paramArrayOfchar));
        case 8:
          return readUTF8(i, paramArrayOfchar);
        case 16:
          return Type.getMethodType(readUTF8(i, paramArrayOfchar));
        case 15:
          j = readByte(i);
          k = this.cpInfoOffsets[readUnsignedShort(i + 1)];
          m = this.cpInfoOffsets[readUnsignedShort(k + 2)];
          str1 = readClass(k, paramArrayOfchar);
          str2 = readUTF8(m, paramArrayOfchar);
          str3 = readUTF8(m + 2, paramArrayOfchar);
          try {
          
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          } 
          bool = (this.classFileBuffer[k - 1] == 11) ? true : false;
          return new Handle(j, str1, str2, str3, bool);
        case 17:
          return readConstantDynamic(paramInt, paramArrayOfchar);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException();
  }
  
  public String[] getInterfaces() {
    int i = this.header + 6;
    int j = readUnsignedShort(i);
    String[] arrayOfString = new String[j];
    if (j > 0) {
      char[] arrayOfChar = new char[this.maxStringLength];
      byte b = 0;
      try {
        while (b < j) {
          i += 2;
          arrayOfString[b] = readClass(i, arrayOfChar);
          b++;
        } 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    return arrayOfString;
  }
  
  public ClassReader(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this(paramArrayOfbyte, paramInt1, true);
  }
  
  public ClassReader(InputStream paramInputStream) throws IOException {
    this(readStream(paramInputStream, false));
  }
  
  public final int getFirstAttributeOffset() {
    int i = this.header + 8 + readUnsignedShort(this.header + 6) * 2;
    int j = readUnsignedShort(i);
    i += 2;
    while (j-- > 0) {
      int m = readUnsignedShort(i + 6);
      for (i += 8; m-- > 0; i += 6 + readInt(i + 2));
    } 
    int k = readUnsignedShort(i);
    i += 2;
    while (k-- > 0) {
      int m = readUnsignedShort(i + 6);
      for (i += 8; m-- > 0; i += 6 + readInt(i + 2));
    } 
    return i + 2;
  }
  
  public final String readUtf(int paramInt, char[] paramArrayOfchar) {
    String str = this.constantUtf8Values[paramInt];
    try {
      if (str != null)
        return str; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    int i = this.cpInfoOffsets[paramInt];
    this.constantUtf8Values[paramInt] = readUtf(i + 2, readUnsignedShort(i), paramArrayOfchar);
    return readUtf(i + 2, readUnsignedShort(i), paramArrayOfchar);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\org\objectweb\asm\ClassReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */
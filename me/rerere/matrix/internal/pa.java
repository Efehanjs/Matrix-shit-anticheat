package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class pa {
  @JvmField
  public static boolean v;
  
  @NotNull
  private static String b;
  
  @NotNull
  public static final pa i;
  
  private static final long a = o3.a(123393827236785633L, 1346402742268015073L, MethodHandles.lookup().lookupClass()).a(25216408187951L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  @NotNull
  public final List j(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pa.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 86216732015608
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 116062079050208
    //   17: lxor
    //   18: lstore #5
    //   20: pop2
    //   21: new java/util/ArrayList
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: checkcast java/util/List
    //   31: astore #8
    //   33: ldc2_w 1.073741824E9
    //   36: dstore #9
    //   38: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   41: invokevirtual totalMemory : ()J
    //   44: l2d
    //   45: dload #9
    //   47: ddiv
    //   48: dstore #11
    //   50: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   53: invokevirtual freeMemory : ()J
    //   56: l2d
    //   57: dload #9
    //   59: ddiv
    //   60: dstore #13
    //   62: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   65: invokevirtual maxMemory : ()J
    //   68: l2d
    //   69: dload #9
    //   71: ddiv
    //   72: dstore #15
    //   74: aload #8
    //   76: sipush #9306
    //   79: ldc2_w 5567952453885968879
    //   82: lload_1
    //   83: lxor
    //   84: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   89: invokeinterface add : (Ljava/lang/Object;)Z
    //   94: pop
    //   95: invokestatic a : ()I
    //   98: aload #8
    //   100: new java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: sipush #9365
    //   110: ldc2_w 8219557171987398938
    //   113: lload_1
    //   114: lxor
    //   115: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: sipush #20343
    //   126: ldc2_w 3479707202066590430
    //   129: lload_1
    //   130: lxor
    //   131: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   136: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   139: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual toString : ()Ljava/lang/String;
    //   145: invokeinterface add : (Ljava/lang/Object;)Z
    //   150: pop
    //   151: aload #8
    //   153: new java/lang/StringBuilder
    //   156: dup
    //   157: invokespecial <init> : ()V
    //   160: sipush #25364
    //   163: ldc2_w 8103340904770700965
    //   166: lload_1
    //   167: lxor
    //   168: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   173: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: sipush #32150
    //   179: ldc2_w 6842789872904771612
    //   182: lload_1
    //   183: lxor
    //   184: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   189: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual toString : ()Ljava/lang/String;
    //   198: invokeinterface add : (Ljava/lang/Object;)Z
    //   203: pop
    //   204: aload #8
    //   206: new java/lang/StringBuilder
    //   209: dup
    //   210: invokespecial <init> : ()V
    //   213: sipush #6921
    //   216: ldc2_w 5632282399366020770
    //   219: lload_1
    //   220: lxor
    //   221: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   226: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: sipush #10360
    //   232: ldc2_w 5550251947931094485
    //   235: lload_1
    //   236: lxor
    //   237: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   242: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: invokevirtual toString : ()Ljava/lang/String;
    //   251: invokeinterface add : (Ljava/lang/Object;)Z
    //   256: pop
    //   257: aload #8
    //   259: new java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial <init> : ()V
    //   266: sipush #18069
    //   269: ldc2_w 8153918130633941802
    //   272: lload_1
    //   273: lxor
    //   274: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: sipush #29555
    //   285: ldc2_w 4231209632185521865
    //   288: lload_1
    //   289: lxor
    //   290: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   295: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
    //   298: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   301: invokevirtual toString : ()Ljava/lang/String;
    //   304: invokeinterface add : (Ljava/lang/Object;)Z
    //   309: pop
    //   310: aload #8
    //   312: new java/lang/StringBuilder
    //   315: dup
    //   316: invokespecial <init> : ()V
    //   319: sipush #15282
    //   322: ldc2_w 4671318260912840213
    //   325: lload_1
    //   326: lxor
    //   327: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   338: invokevirtual availableProcessors : ()I
    //   341: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   344: invokevirtual toString : ()Ljava/lang/String;
    //   347: invokeinterface add : (Ljava/lang/Object;)Z
    //   352: pop
    //   353: aload #8
    //   355: new java/lang/StringBuilder
    //   358: dup
    //   359: invokespecial <init> : ()V
    //   362: sipush #25767
    //   365: ldc2_w 3186769705056895251
    //   368: lload_1
    //   369: lxor
    //   370: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: dload #11
    //   380: invokestatic b : (D)D
    //   383: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   386: bipush #47
    //   388: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   391: dload #13
    //   393: invokestatic b : (D)D
    //   396: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   399: invokevirtual toString : ()Ljava/lang/String;
    //   402: invokeinterface add : (Ljava/lang/Object;)Z
    //   407: pop
    //   408: aload #8
    //   410: new java/lang/StringBuilder
    //   413: dup
    //   414: invokespecial <init> : ()V
    //   417: sipush #18364
    //   420: ldc2_w 8921386084567392769
    //   423: lload_1
    //   424: lxor
    //   425: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: invokestatic getThreadMXBean : ()Ljava/lang/management/ThreadMXBean;
    //   436: invokeinterface getThreadCount : ()I
    //   441: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   444: invokevirtual toString : ()Ljava/lang/String;
    //   447: invokeinterface add : (Ljava/lang/Object;)Z
    //   452: pop
    //   453: aload #8
    //   455: ldc ''
    //   457: invokeinterface add : (Ljava/lang/Object;)Z
    //   462: pop
    //   463: aload #8
    //   465: sipush #6375
    //   468: ldc2_w 2629333598380260700
    //   471: lload_1
    //   472: lxor
    //   473: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   478: invokeinterface add : (Ljava/lang/Object;)Z
    //   483: pop
    //   484: aload #8
    //   486: new java/lang/StringBuilder
    //   489: dup
    //   490: invokespecial <init> : ()V
    //   493: sipush #864
    //   496: ldc2_w 6729001235657582278
    //   499: lload_1
    //   500: lxor
    //   501: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   506: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: lload_3
    //   510: invokestatic b : (J)Ljava/lang/String;
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: invokevirtual toString : ()Ljava/lang/String;
    //   519: invokeinterface add : (Ljava/lang/Object;)Z
    //   524: pop
    //   525: aload #8
    //   527: new java/lang/StringBuilder
    //   530: dup
    //   531: invokespecial <init> : ()V
    //   534: sipush #25778
    //   537: ldc2_w 7070547019669274937
    //   540: lload_1
    //   541: lxor
    //   542: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   547: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   550: invokestatic getServer : ()Lorg/bukkit/Server;
    //   553: invokeinterface getVersion : ()Ljava/lang/String;
    //   558: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: invokevirtual toString : ()Ljava/lang/String;
    //   564: invokeinterface add : (Ljava/lang/Object;)Z
    //   569: pop
    //   570: aload #8
    //   572: new java/lang/StringBuilder
    //   575: dup
    //   576: invokespecial <init> : ()V
    //   579: sipush #5176
    //   582: ldc2_w 5470120043061637531
    //   585: lload_1
    //   586: lxor
    //   587: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   592: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: invokestatic getServer : ()Lorg/bukkit/Server;
    //   598: invokeinterface getBukkitVersion : ()Ljava/lang/String;
    //   603: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: invokevirtual toString : ()Ljava/lang/String;
    //   609: invokeinterface add : (Ljava/lang/Object;)Z
    //   614: pop
    //   615: aload #8
    //   617: new java/lang/StringBuilder
    //   620: dup
    //   621: invokespecial <init> : ()V
    //   624: sipush #16501
    //   627: ldc2_w 8543568563026765277
    //   630: lload_1
    //   631: lxor
    //   632: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   637: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   640: invokestatic j : ()D
    //   643: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   646: invokevirtual toString : ()Ljava/lang/String;
    //   649: invokeinterface add : (Ljava/lang/Object;)Z
    //   654: pop
    //   655: aload #8
    //   657: new java/lang/StringBuilder
    //   660: dup
    //   661: invokespecial <init> : ()V
    //   664: bipush #44
    //   666: ldc2_w 4396751842045879682
    //   669: lload_1
    //   670: lxor
    //   671: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   676: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: invokestatic getServer : ()Lorg/bukkit/Server;
    //   682: invokeinterface getWorlds : ()Ljava/util/List;
    //   687: invokeinterface size : ()I
    //   692: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   695: invokevirtual toString : ()Ljava/lang/String;
    //   698: invokeinterface add : (Ljava/lang/Object;)Z
    //   703: pop
    //   704: aload #8
    //   706: new java/lang/StringBuilder
    //   709: dup
    //   710: invokespecial <init> : ()V
    //   713: sipush #14410
    //   716: ldc2_w 3985753015944895992
    //   719: lload_1
    //   720: lxor
    //   721: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   726: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   729: invokestatic getOnlinePlayers : ()Ljava/util/Collection;
    //   732: invokeinterface size : ()I
    //   737: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   740: invokevirtual toString : ()Ljava/lang/String;
    //   743: invokeinterface add : (Ljava/lang/Object;)Z
    //   748: pop
    //   749: aload #8
    //   751: new java/lang/StringBuilder
    //   754: dup
    //   755: invokespecial <init> : ()V
    //   758: sipush #28387
    //   761: ldc2_w 8668220778599910210
    //   764: lload_1
    //   765: lxor
    //   766: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   771: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   774: getstatic me/rerere/matrix/internal/t.i : Z
    //   777: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   780: sipush #4833
    //   783: ldc2_w 7290218583721080654
    //   786: lload_1
    //   787: lxor
    //   788: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   793: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   796: getstatic me/rerere/matrix/internal/ge.w : Z
    //   799: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   802: invokevirtual toString : ()Ljava/lang/String;
    //   805: invokeinterface add : (Ljava/lang/Object;)Z
    //   810: pop
    //   811: aload #8
    //   813: ldc ''
    //   815: invokeinterface add : (Ljava/lang/Object;)Z
    //   820: pop
    //   821: aload #8
    //   823: sipush #712
    //   826: ldc2_w 7086465762536712034
    //   829: lload_1
    //   830: lxor
    //   831: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   836: invokeinterface add : (Ljava/lang/Object;)Z
    //   841: pop
    //   842: aload #8
    //   844: new java/lang/StringBuilder
    //   847: dup
    //   848: invokespecial <init> : ()V
    //   851: sipush #11079
    //   854: ldc2_w 1323980038823759589
    //   857: lload_1
    //   858: lxor
    //   859: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   864: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   867: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   870: lload #5
    //   872: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   875: invokevirtual getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
    //   878: invokevirtual getVersion : ()Ljava/lang/String;
    //   881: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   884: invokevirtual toString : ()Ljava/lang/String;
    //   887: invokeinterface add : (Ljava/lang/Object;)Z
    //   892: pop
    //   893: aload #8
    //   895: new java/lang/StringBuilder
    //   898: dup
    //   899: invokespecial <init> : ()V
    //   902: sipush #14496
    //   905: ldc2_w 6859722683238112558
    //   908: lload_1
    //   909: lxor
    //   910: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   915: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   918: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   921: sipush #5940
    //   924: ldc2_w 7648555837555110545
    //   927: lload_1
    //   928: lxor
    //   929: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   934: invokeinterface getPlugin : (Ljava/lang/String;)Lorg/bukkit/plugin/Plugin;
    //   939: dup
    //   940: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   943: invokeinterface getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
    //   948: invokevirtual getVersion : ()Ljava/lang/String;
    //   951: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   954: invokevirtual toString : ()Ljava/lang/String;
    //   957: invokeinterface add : (Ljava/lang/Object;)Z
    //   962: pop
    //   963: aload #8
    //   965: ldc ''
    //   967: invokeinterface add : (Ljava/lang/Object;)Z
    //   972: pop
    //   973: aload #8
    //   975: sipush #12314
    //   978: ldc2_w 9070916370416326061
    //   981: lload_1
    //   982: lxor
    //   983: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   988: invokeinterface add : (Ljava/lang/Object;)Z
    //   993: pop
    //   994: aload #8
    //   996: new java/lang/StringBuilder
    //   999: dup
    //   1000: invokespecial <init> : ()V
    //   1003: sipush #1344
    //   1006: ldc2_w 7865181249899454669
    //   1009: lload_1
    //   1010: lxor
    //   1011: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1016: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1019: getstatic me/rerere/matrix/internal/sc.v : Ljava/lang/String;
    //   1022: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1025: invokevirtual toString : ()Ljava/lang/String;
    //   1028: invokeinterface add : (Ljava/lang/Object;)Z
    //   1033: pop
    //   1034: aload #8
    //   1036: new java/lang/StringBuilder
    //   1039: dup
    //   1040: invokespecial <init> : ()V
    //   1043: sipush #2083
    //   1046: ldc2_w 405961395519516058
    //   1049: lload_1
    //   1050: lxor
    //   1051: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   1056: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1059: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   1062: lload #5
    //   1064: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   1067: invokevirtual getDescription : ()Lorg/bukkit/plugin/PluginDescriptionFile;
    //   1070: invokevirtual getVersion : ()Ljava/lang/String;
    //   1073: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1076: invokevirtual toString : ()Ljava/lang/String;
    //   1079: invokeinterface add : (Ljava/lang/Object;)Z
    //   1084: pop
    //   1085: istore #7
    //   1087: aload #8
    //   1089: iload #7
    //   1091: ifeq -> 1107
    //   1094: ldc_w 'C2qX'
    //   1097: invokestatic p : (Ljava/lang/String;)V
    //   1100: goto -> 1107
    //   1103: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1106: athrow
    //   1107: areturn
    // Exception table:
    //   from	to	target	type
    //   1087	1100	1103	java/lang/RuntimeException
  }
  
  @NotNull
  public final List b(long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/pa.a : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: new java/util/ArrayList
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: checkcast java/util/List
    //   16: astore #4
    //   18: invokestatic r : ()I
    //   21: aload #4
    //   23: sipush #23701
    //   26: ldc2_w 3725845452800147437
    //   29: lload_1
    //   30: lxor
    //   31: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   36: invokeinterface add : (Ljava/lang/Object;)Z
    //   41: pop
    //   42: istore_3
    //   43: aload #4
    //   45: new java/lang/StringBuilder
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: sipush #19040
    //   55: ldc2_w 958493700122257690
    //   58: lload_1
    //   59: lxor
    //   60: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   65: iload_3
    //   66: ifeq -> 111
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: getstatic me/rerere/matrix/internal/pa.v : Z
    //   75: lload_1
    //   76: lconst_0
    //   77: lcmp
    //   78: iflt -> 117
    //   81: ifeq -> 114
    //   84: goto -> 91
    //   87: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   90: athrow
    //   91: sipush #9310
    //   94: ldc2_w 924311195818739490
    //   97: lload_1
    //   98: lxor
    //   99: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   104: goto -> 111
    //   107: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   110: athrow
    //   111: goto -> 127
    //   114: sipush #12267
    //   117: ldc2_w 2312281793390922883
    //   120: lload_1
    //   121: lxor
    //   122: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   130: invokevirtual toString : ()Ljava/lang/String;
    //   133: invokeinterface add : (Ljava/lang/Object;)Z
    //   138: pop
    //   139: aload #4
    //   141: new java/lang/StringBuilder
    //   144: dup
    //   145: invokespecial <init> : ()V
    //   148: sipush #11226
    //   151: lload_1
    //   152: lconst_0
    //   153: lcmp
    //   154: ifle -> 177
    //   157: ldc2_w 1980206495744641198
    //   160: lload_1
    //   161: lxor
    //   162: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   167: iload_3
    //   168: ifeq -> 213
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: getstatic me/rerere/matrix/internal/pa.v : Z
    //   177: lload_1
    //   178: lconst_0
    //   179: lcmp
    //   180: ifle -> 219
    //   183: ifeq -> 216
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   192: athrow
    //   193: sipush #24450
    //   196: ldc2_w 3450383830292020469
    //   199: lload_1
    //   200: lxor
    //   201: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   206: goto -> 213
    //   209: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   212: athrow
    //   213: goto -> 229
    //   216: sipush #10189
    //   219: ldc2_w 7108560736374441093
    //   222: lload_1
    //   223: lxor
    //   224: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual toString : ()Ljava/lang/String;
    //   235: invokeinterface add : (Ljava/lang/Object;)Z
    //   240: pop
    //   241: lload_1
    //   242: lconst_0
    //   243: lcmp
    //   244: iflt -> 291
    //   247: aload #4
    //   249: iload_3
    //   250: ifeq -> 358
    //   253: new java/lang/StringBuilder
    //   256: dup
    //   257: invokespecial <init> : ()V
    //   260: sipush #16046
    //   263: ldc2_w 7237154810369433034
    //   266: lload_1
    //   267: lxor
    //   268: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: getstatic me/rerere/matrix/internal/pa.b : Ljava/lang/String;
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: invokevirtual toString : ()Ljava/lang/String;
    //   285: invokeinterface add : (Ljava/lang/Object;)Z
    //   290: pop
    //   291: getstatic me/rerere/matrix/internal/pa.v : Z
    //   294: ifne -> 356
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   303: athrow
    //   304: aload #4
    //   306: ldc ''
    //   308: invokeinterface add : (Ljava/lang/Object;)Z
    //   313: pop
    //   314: aload #4
    //   316: sipush #12818
    //   319: ldc2_w 8284791324316848479
    //   322: lload_1
    //   323: lxor
    //   324: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   329: invokeinterface add : (Ljava/lang/Object;)Z
    //   334: pop
    //   335: aload #4
    //   337: sipush #19645
    //   340: ldc2_w 9065274471307063247
    //   343: lload_1
    //   344: lxor
    //   345: <illegal opcode> k : (IJ)Ljava/lang/String;
    //   350: invokeinterface add : (Ljava/lang/Object;)Z
    //   355: pop
    //   356: aload #4
    //   358: areturn
    // Exception table:
    //   from	to	target	type
    //   43	84	87	java/lang/RuntimeException
    //   69	104	107	java/lang/RuntimeException
    //   127	186	189	java/lang/RuntimeException
    //   171	206	209	java/lang/RuntimeException
    //   229	297	300	java/lang/RuntimeException
  }
  
  public final void b(@NotNull String paramString) {
    b = paramString;
  }
  
  static {
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[39];
    boolean bool = false;
    String str;
    int i = (str = "¤!h®H¸\005Ê?Q êØ\016Ô³\034%É}©xÿî\021 z\0066|æ<ï\024äR[ \020­¶¦±vÙÁuwQs|9'Zb0\036ÓÆ2×\r\036q~Ò\0208ÏW'\033'»\036qGì\024Ä©Uä\020\035\033!«\025¬}\025æ\016ÜP/è #PóZ\000Ñyh±ÀÿÝ×Ñ\"\027(¥Ã#hmY\002Þ\016uU\004(ÅÓ,ÇNÇå#GÊÈÈAÞósp(\t \003ö\036\002âR\007È_so<Ãìó\030×³9¾\003¢L\013\036 ÎhDAc\033k£\027\037È¿\"\020tq¤{\024è\020¶ëª®k÷¹õ éµ*c¤pøäkcpÄÈÀW/Ô4æÑöÀî\036\001I\020wÉÕÈVUÀw\032\007TL\007&\003 ¸¯Ô\\Q¥ÊêàË\001WsK\036ø\035\025N\000wEgvæd(\tiØ%R\024\\H\036Re\\\025\003fÉÈÒ¶oÌ(I÷\036D°\021âr¸`4(s\002i½sÜtà7×ÔÍ%\017î\036Ep\0054²R-\017gûª8\006U<<²wòñ »þ\037}%¹qvu 5i\022<°\021áû!{ªÍÈ\032u´\030÷8>ï\r×­Á+Zûá(\f\007 µ\035\r)µ ÝÂ$îÒK/ØF\033¤¢³Ïè½êq*Ä\027\0250¨\003F(xúß:¼-Ú^:7»BKýä\034N]fû°û&ã¿ Çª Fw\t5\\ \026ij ê;\bG\033dÁJ÷¸.¸ë«l]>é\022ëÒ S)2ÈêÐ¾µ¤W\ríEÅÃ]ª­ÓNz\032½\007L\033Ï(\" À¼=ª\024\035zPÁ<M6Ù©ªÔA\025Jð(o\030ñº?Í\t@,\037R(¡\\ó\nE¢PºÜ\rÿ\025gÃ'\0132\027\004ßÆ;¼dÂ\b\031b<ÉôaØí\001Ç \n1ö&3¹\004ûçÇÉ§¢Ê\b&¦ÄX¦çõÄJ\007¡d(ÚÕ¸ns:ÎáEi\025ïei\023ìÆ£ì%ëY#ß1ËÐl].¡»\020u3ö?\ta\017)ôï\021GÐ(uH[\r56´{\005`>HBü8ÞI.þH»×Í;6ÿeg\025ÚThg×`Xó$,ÞïpãO÷Ya²ÿ·\031v/:'-°håÓ¶\f}Ôä6È \030£Úºv¹eÛÙÑñd¹4¬³\bQÃNT%k0ÉÇmí1«®+ÇN{©)Ë}µÌ4sU\027'\035K(î\b­©\f¾H¥_5,6 AÎ\022\"RDj¼]9ù\003\bþ®9<\003[¡QV °9¨\020Àuä|¨Á\021^ÛOeÞ)àUÇ6ÇÓè¿8Aytù\030+¸]Ñz·å\034æ¬±Vá[S!ä~³o¬É \007R¶8\033õA\022Tqu\003¶Kõ_y/Òp]NÞ°\022BäØ\030U¡MÙ[/ú£#\026«\006>\016\rqåL!\021í(IÁ#ô\026\016ÆÊ\001ù4î\013L¸¦kÅ\"Xß,8\035\rï2_è&Õ)[\036ù_ Un\034b]üæ÷¬t ¿<·þz\025óé\031\007q¬tp'C¹k ­ý*?%äÝaM²i» ¯ÛÈ\030Ã³\034±eR(\001õD\006ÖÐÑ\017¢­ÖYd³(\036¥\033^$¦HÏýÅò¹Ü\n\0016¤\030\n§ W.º¡ptÓW8\037ÆCzì!nßÅ@r]\037\fJh¥§Fp(øYè\025uq0ní\0378É^ðx¡\007.·o$²o\025¥';õ6¨U×Þ\016\016­").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  @NotNull
  public final String b() {
    return b;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3A9C;
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
        throw new RuntimeException("me/rerere/matrix/internal/pa", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/pa'
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
    long l = a ^ 0x7414A61A331L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\pa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
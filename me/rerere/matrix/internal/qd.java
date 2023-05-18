package me.rerere.matrix.internal;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.Deprecated;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;

@Deprecated(message = "Use New VL System")
public final class qd {
  @NotNull
  private final Map b;
  
  @NotNull
  private final UUID i;
  
  private static int[] a;
  
  private static final long c = o3.a(7284856946962863236L, -4825516289212838798L, MethodHandles.lookup().lookupClass()).a(20196264079442L);
  
  private static final String[] d;
  
  private static final String[] e;
  
  private static final Map f = new HashMap<>(13);
  
  public final int b(long paramLong, @NotNull yk paramyk) {
    paramLong = c ^ paramLong;
    try {
      (zg)this.b.get(paramyk);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((zg)this.b.get(paramyk) != null) ? ((zg)this.b.get(paramyk)).b() : 0;
  }
  
  @NotNull
  public final Map j() {
    return this.b;
  }
  
  public final int b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: getstatic me/rerere/matrix/internal/qd.c : J
    //   17: lxor
    //   18: lstore_3
    //   19: aload_0
    //   20: getfield b : Ljava/util/Map;
    //   23: invokeinterface values : ()Ljava/util/Collection;
    //   28: checkcast java/lang/Iterable
    //   31: astore #6
    //   33: iconst_0
    //   34: istore #7
    //   36: invokestatic a : ()I
    //   39: aload #6
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #8
    //   48: istore #5
    //   50: aload #8
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 111
    //   60: aload #8
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: astore #9
    //   69: iload #7
    //   71: aload #9
    //   73: checkcast me/rerere/matrix/internal/zg
    //   76: astore #10
    //   78: istore #12
    //   80: iconst_0
    //   81: istore #11
    //   83: aload #10
    //   85: invokevirtual b : ()I
    //   88: istore #13
    //   90: iload #12
    //   92: iload #13
    //   94: iadd
    //   95: iload_1
    //   96: ifle -> 108
    //   99: iload #5
    //   101: ifne -> 113
    //   104: istore #7
    //   106: iload #5
    //   108: ifeq -> 50
    //   111: iload #7
    //   113: ireturn
  }
  
  public final void b(@NotNull yl paramyl, int paramInt1, @NotNull yk paramyk, int paramInt2, @Nullable String paramString1, @Nullable String paramString2, int paramInt3, char paramChar) {
    // Byte code:
    //   0: iload_2
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload #7
    //   7: i2l
    //   8: bipush #48
    //   10: lshl
    //   11: bipush #32
    //   13: lushr
    //   14: lor
    //   15: iload #8
    //   17: i2l
    //   18: bipush #48
    //   20: lshl
    //   21: bipush #48
    //   23: lushr
    //   24: lor
    //   25: getstatic me/rerere/matrix/internal/qd.c : J
    //   28: lxor
    //   29: lstore #9
    //   31: lload #9
    //   33: dup2
    //   34: ldc2_w 11741121112452
    //   37: lxor
    //   38: dup2
    //   39: bipush #32
    //   41: lushr
    //   42: l2i
    //   43: istore #11
    //   45: dup2
    //   46: bipush #32
    //   48: lshl
    //   49: bipush #32
    //   51: lushr
    //   52: l2i
    //   53: istore #12
    //   55: pop2
    //   56: dup2
    //   57: ldc2_w 131550588436973
    //   60: lxor
    //   61: lstore #13
    //   63: dup2
    //   64: ldc2_w 62367405334028
    //   67: lxor
    //   68: lstore #15
    //   70: dup2
    //   71: ldc2_w 95683525049075
    //   74: lxor
    //   75: dup2
    //   76: bipush #32
    //   78: lushr
    //   79: l2i
    //   80: istore #17
    //   82: dup2
    //   83: bipush #32
    //   85: lshl
    //   86: bipush #56
    //   88: lushr
    //   89: l2i
    //   90: istore #18
    //   92: dup2
    //   93: bipush #40
    //   95: lshl
    //   96: bipush #40
    //   98: lushr
    //   99: l2i
    //   100: istore #19
    //   102: pop2
    //   103: dup2
    //   104: ldc2_w 23081677672181
    //   107: lxor
    //   108: lstore #20
    //   110: pop2
    //   111: invokestatic a : ()I
    //   114: istore #22
    //   116: iload #4
    //   118: ifne -> 126
    //   121: return
    //   122: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   125: athrow
    //   126: aload_0
    //   127: getfield b : Ljava/util/Map;
    //   130: aload_3
    //   131: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   136: checkcast me/rerere/matrix/internal/zg
    //   139: dup
    //   140: ifnull -> 879
    //   143: astore #23
    //   145: iconst_0
    //   146: istore #24
    //   148: aload #23
    //   150: invokevirtual b : ()I
    //   153: istore #25
    //   155: aload #23
    //   157: lload #15
    //   159: iload #4
    //   161: invokevirtual b : (JI)V
    //   164: aload #23
    //   166: invokevirtual b : ()I
    //   169: istore #26
    //   171: aload_3
    //   172: invokevirtual b : ()Ljava/util/Map;
    //   175: astore #27
    //   177: iconst_0
    //   178: istore #28
    //   180: aload #27
    //   182: astore #29
    //   184: new java/util/LinkedHashMap
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: checkcast java/util/Map
    //   194: astore #30
    //   196: iconst_0
    //   197: istore #31
    //   199: aload #29
    //   201: invokeinterface entrySet : ()Ljava/util/Set;
    //   206: invokeinterface iterator : ()Ljava/util/Iterator;
    //   211: astore #32
    //   213: aload #32
    //   215: invokeinterface hasNext : ()Z
    //   220: ifeq -> 373
    //   223: aload #32
    //   225: invokeinterface next : ()Ljava/lang/Object;
    //   230: checkcast java/util/Map$Entry
    //   233: astore #33
    //   235: aload #33
    //   237: astore #34
    //   239: iconst_0
    //   240: istore #35
    //   242: iload #25
    //   244: iconst_1
    //   245: iadd
    //   246: istore #36
    //   248: aload #34
    //   250: invokeinterface getKey : ()Ljava/lang/Object;
    //   255: checkcast java/lang/Number
    //   258: invokevirtual intValue : ()I
    //   261: istore #37
    //   263: iload #8
    //   265: ifle -> 387
    //   268: iload #36
    //   270: iload #22
    //   272: ifne -> 385
    //   275: iload #37
    //   277: iload #8
    //   279: iflt -> 327
    //   282: iload #22
    //   284: ifne -> 327
    //   287: goto -> 294
    //   290: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   293: athrow
    //   294: if_icmpgt -> 342
    //   297: goto -> 304
    //   300: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   303: athrow
    //   304: iload #37
    //   306: iload #22
    //   308: ifne -> 339
    //   311: goto -> 318
    //   314: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   317: athrow
    //   318: iload #26
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   326: athrow
    //   327: if_icmpgt -> 338
    //   330: iconst_1
    //   331: goto -> 343
    //   334: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   337: athrow
    //   338: iconst_0
    //   339: goto -> 343
    //   342: iconst_0
    //   343: ifeq -> 213
    //   346: aload #30
    //   348: aload #33
    //   350: invokeinterface getKey : ()Ljava/lang/Object;
    //   355: aload #33
    //   357: invokeinterface getValue : ()Ljava/lang/Object;
    //   362: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   367: pop
    //   368: iload #22
    //   370: ifeq -> 213
    //   373: aload #30
    //   375: nop
    //   376: astore #27
    //   378: nop
    //   379: iload #7
    //   381: iflt -> 387
    //   384: iconst_0
    //   385: istore #28
    //   387: aload #27
    //   389: invokeinterface entrySet : ()Ljava/util/Set;
    //   394: invokeinterface iterator : ()Ljava/util/Iterator;
    //   399: astore #29
    //   401: aload #29
    //   403: invokeinterface hasNext : ()Z
    //   408: ifeq -> 870
    //   411: aload #29
    //   413: invokeinterface next : ()Ljava/lang/Object;
    //   418: checkcast java/util/Map$Entry
    //   421: astore #30
    //   423: aload #30
    //   425: astore #31
    //   427: iconst_0
    //   428: istore #32
    //   430: aload #31
    //   432: invokeinterface getValue : ()Ljava/lang/Object;
    //   437: checkcast java/util/List
    //   440: astore #33
    //   442: aload #33
    //   444: checkcast java/lang/Iterable
    //   447: astore #34
    //   449: iconst_0
    //   450: istore #35
    //   452: iload #22
    //   454: ifne -> 876
    //   457: aload #34
    //   459: invokeinterface iterator : ()Ljava/util/Iterator;
    //   464: astore #36
    //   466: aload #36
    //   468: invokeinterface hasNext : ()Z
    //   473: ifeq -> 857
    //   476: aload #36
    //   478: invokeinterface next : ()Ljava/lang/Object;
    //   483: astore #37
    //   485: aload #37
    //   487: checkcast java/lang/String
    //   490: astore #38
    //   492: iconst_0
    //   493: istore #39
    //   495: aload_1
    //   496: iload #17
    //   498: iload #18
    //   500: i2b
    //   501: iload #19
    //   503: invokevirtual j : (IBI)Lorg/bukkit/entity/Player;
    //   506: astore #40
    //   508: aload #38
    //   510: sipush #11856
    //   513: ldc2_w 3573978651679870985
    //   516: lload #9
    //   518: lxor
    //   519: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   524: aload #40
    //   526: invokeinterface getName : ()Ljava/lang/String;
    //   531: iconst_0
    //   532: iconst_4
    //   533: aconst_null
    //   534: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   537: sipush #11034
    //   540: ldc2_w 5326519962706400591
    //   543: lload #9
    //   545: lxor
    //   546: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   551: lload #13
    //   553: aload #40
    //   555: invokestatic b : (JLorg/bukkit/entity/Player;)I
    //   558: invokestatic valueOf : (I)Ljava/lang/String;
    //   561: iconst_0
    //   562: iconst_4
    //   563: aconst_null
    //   564: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   567: sipush #14322
    //   570: ldc2_w 3585045540500195750
    //   573: lload #9
    //   575: lxor
    //   576: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   581: aload #40
    //   583: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   588: invokeinterface getName : ()Ljava/lang/String;
    //   593: iconst_0
    //   594: iconst_4
    //   595: aconst_null
    //   596: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   599: sipush #8261
    //   602: ldc2_w 1463585446133915154
    //   605: lload #9
    //   607: lxor
    //   608: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   613: invokestatic j : ()D
    //   616: invokestatic valueOf : (D)Ljava/lang/String;
    //   619: iconst_0
    //   620: iconst_4
    //   621: aconst_null
    //   622: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   625: sipush #19385
    //   628: ldc2_w 4583168215376803311
    //   631: lload #9
    //   633: lxor
    //   634: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   639: aload_1
    //   640: invokevirtual b : ()Lme/rerere/matrix/internal/q;
    //   643: invokevirtual b : ()Ljava/lang/String;
    //   646: iconst_0
    //   647: iconst_4
    //   648: aconst_null
    //   649: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   652: sipush #22230
    //   655: ldc2_w 642278132721100932
    //   658: lload #9
    //   660: lxor
    //   661: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   666: aload #6
    //   668: dup
    //   669: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   672: iconst_0
    //   673: iconst_4
    //   674: aconst_null
    //   675: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   678: sipush #12837
    //   681: ldc2_w 8756196964305063028
    //   684: lload #9
    //   686: lxor
    //   687: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   692: aload #5
    //   694: dup
    //   695: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   698: iconst_0
    //   699: iconst_4
    //   700: aconst_null
    //   701: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   704: sipush #1038
    //   707: ldc2_w 7926796557588953694
    //   710: lload #9
    //   712: lxor
    //   713: <illegal opcode> s : (IJ)Ljava/lang/String;
    //   718: iload #26
    //   720: invokestatic valueOf : (I)Ljava/lang/String;
    //   723: iconst_0
    //   724: iconst_4
    //   725: aconst_null
    //   726: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    //   729: astore #41
    //   731: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   734: invokevirtual j : ()Z
    //   737: iload #22
    //   739: ifne -> 408
    //   742: ifeq -> 754
    //   745: aload #40
    //   747: aload #41
    //   749: invokestatic setPlaceholders : (Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/lang/String;
    //   752: astore #41
    //   754: new me/rerere/matrix/api/events/PlayerViolationCommandEvent
    //   757: dup
    //   758: aload #40
    //   760: aload_3
    //   761: iload #11
    //   763: iload #12
    //   765: invokevirtual b : (II)Lme/rerere/matrix/api/HackType;
    //   768: aload #41
    //   770: invokespecial <init> : (Lorg/bukkit/entity/Player;Lme/rerere/matrix/api/HackType;Ljava/lang/String;)V
    //   773: astore #42
    //   775: invokestatic getPluginManager : ()Lorg/bukkit/plugin/PluginManager;
    //   778: aload #42
    //   780: checkcast org/bukkit/event/Event
    //   783: invokeinterface callEvent : (Lorg/bukkit/event/Event;)V
    //   788: iload #22
    //   790: iload #8
    //   792: ifle -> 854
    //   795: ifne -> 852
    //   798: aload #42
    //   800: invokevirtual isCancelled : ()Z
    //   803: ifne -> 850
    //   806: goto -> 813
    //   809: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   812: athrow
    //   813: invokestatic getConsoleSender : ()Lorg/bukkit/command/ConsoleCommandSender;
    //   816: checkcast org/bukkit/command/CommandSender
    //   819: aload #41
    //   821: invokestatic dispatchCommand : (Lorg/bukkit/command/CommandSender;Ljava/lang/String;)Z
    //   824: pop
    //   825: aload #41
    //   827: astore #43
    //   829: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   832: lload #20
    //   834: invokevirtual b : (J)Lme/rerere/matrix/Matrix;
    //   837: invokevirtual b : ()Lme/rerere/matrix/internal/rb;
    //   840: aload #43
    //   842: <illegal opcode> run : (Ljava/lang/String;)Ljava/lang/Runnable;
    //   847: invokevirtual b : (Ljava/lang/Runnable;)V
    //   850: nop
    //   851: nop
    //   852: iload #22
    //   854: ifeq -> 466
    //   857: nop
    //   858: nop
    //   859: nop
    //   860: iload #22
    //   862: iload #7
    //   864: ifle -> 408
    //   867: ifeq -> 401
    //   870: nop
    //   871: iload_2
    //   872: iflt -> 876
    //   875: nop
    //   876: goto -> 881
    //   879: pop
    //   880: nop
    //   881: return
    // Exception table:
    //   from	to	target	type
    //   116	122	122	java/lang/RuntimeException
    //   263	287	290	java/lang/RuntimeException
    //   275	297	300	java/lang/RuntimeException
    //   294	311	314	java/lang/RuntimeException
    //   304	320	323	java/lang/RuntimeException
    //   327	334	334	java/lang/RuntimeException
    //   775	806	809	java/lang/RuntimeException
  }
  
  public qd(@NotNull UUID paramUUID, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/qd.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: aload_0
    //   7: invokespecial <init> : ()V
    //   10: aload_0
    //   11: aload_1
    //   12: putfield i : Ljava/util/UUID;
    //   15: aload_0
    //   16: new java/util/LinkedHashMap
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: checkcast java/util/Map
    //   26: astore #5
    //   28: aload #5
    //   30: astore #6
    //   32: astore #12
    //   34: iconst_0
    //   35: istore #7
    //   37: invokestatic values : ()[Lme/rerere/matrix/internal/yk;
    //   40: astore #8
    //   42: iconst_0
    //   43: istore #9
    //   45: invokestatic a : ()I
    //   48: aload #8
    //   50: arraylength
    //   51: istore #10
    //   53: istore #4
    //   55: iload #9
    //   57: iload #10
    //   59: if_icmpge -> 124
    //   62: aload #8
    //   64: iload #9
    //   66: aaload
    //   67: astore #11
    //   69: aload #6
    //   71: aload #11
    //   73: new me/rerere/matrix/internal/zg
    //   76: dup
    //   77: aload_0
    //   78: getfield i : Ljava/util/UUID;
    //   81: aload #11
    //   83: invokespecial <init> : (Ljava/util/UUID;Lme/rerere/matrix/internal/yk;)V
    //   86: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: iinc #9, 1
    //   95: iload #4
    //   97: lload_2
    //   98: lconst_0
    //   99: lcmp
    //   100: ifle -> 108
    //   103: ifne -> 132
    //   106: iload #4
    //   108: ifeq -> 55
    //   111: lload_2
    //   112: lconst_0
    //   113: lcmp
    //   114: ifle -> 95
    //   117: goto -> 124
    //   120: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: nop
    //   125: aload #12
    //   127: aload #5
    //   129: putfield b : Ljava/util/Map;
    //   132: return
    // Exception table:
    //   from	to	target	type
    //   69	111	120	java/lang/RuntimeException
  }
  
  public final void b(byte paramByte, long paramLong) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #56
    //   4: lshl
    //   5: lload_2
    //   6: bipush #8
    //   8: lshl
    //   9: bipush #8
    //   11: lushr
    //   12: lor
    //   13: getstatic me/rerere/matrix/internal/qd.c : J
    //   16: lxor
    //   17: lstore #4
    //   19: aload_0
    //   20: getfield b : Ljava/util/Map;
    //   23: invokeinterface values : ()Ljava/util/Collection;
    //   28: checkcast java/lang/Iterable
    //   31: astore #7
    //   33: iconst_0
    //   34: istore #8
    //   36: invokestatic r : ()I
    //   39: aload #7
    //   41: invokeinterface iterator : ()Ljava/util/Iterator;
    //   46: astore #9
    //   48: istore #6
    //   50: aload #9
    //   52: invokeinterface hasNext : ()Z
    //   57: ifeq -> 115
    //   60: aload #9
    //   62: invokeinterface next : ()Ljava/lang/Object;
    //   67: astore #10
    //   69: aload #10
    //   71: checkcast me/rerere/matrix/internal/zg
    //   74: astore #11
    //   76: iconst_0
    //   77: istore #12
    //   79: aload #11
    //   81: invokevirtual b : ()V
    //   84: nop
    //   85: nop
    //   86: iload #6
    //   88: lload_2
    //   89: lconst_0
    //   90: lcmp
    //   91: iflt -> 99
    //   94: ifeq -> 116
    //   97: iload #6
    //   99: ifne -> 50
    //   102: lload_2
    //   103: lconst_0
    //   104: lcmp
    //   105: iflt -> 86
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: nop
    //   116: return
    // Exception table:
    //   from	to	target	type
    //   79	102	111	java/lang/RuntimeException
  }
  
  @NotNull
  public final UUID b() {
    return this.i;
  }
  
  @NotNull
  public final Map b(long paramLong) {
    paramLong = c ^ paramLong;
    long l = paramLong ^ 0x27776D338B45L;
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    yk[] arrayOfYk = yk.values();
    byte b = 0;
    int i = yl.r();
    int j = arrayOfYk.length;
    while (b < j) {
      yk yk = arrayOfYk[b];
      try {
        if (paramLong > 0L)
          if (i != 0) {
            try {
              if (b(l, yk) > 0) {
                Intrinsics.checkNotNull(this.b.get(yk));
                linkedHashMap.put(yk, this.b.get(yk));
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            b++;
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (i == 0)
        break; 
    } 
    return linkedHashMap;
  }
  
  public static void X(int[] paramArrayOfint) {
    a = paramArrayOfint;
  }
  
  public static int[] f() {
    return a;
  }
  
  static {
    X(new int[1]);
    long l = c ^ 0x61DE0DE452EEL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[9];
    boolean bool = false;
    String str;
    int i = (str = "ØHÎ\025íêÐG2¶_¾VoÕ9>IÔó>ÅðÃ\007týq@þ\020Ü¬\006(W\017KáîÑåx­q·Ú(¦®Å7g\r(\034´\017j~ü÷(¨µjö\026ð\004½\032ÜaÂåV\036ç\023ÜqÞgT Eí`OjÕ/(O(\n{Ckìãu¡Dê]\016kxëê\022h\020O1O¹\013&\003 ¢NÌýø\020lx*\n@c¬¨ÆáëeE.z1\020JÍoÓP9«õFõ¢6").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xE77;
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
        throw new RuntimeException("me/rerere/matrix/internal/qd", exception);
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
    //   66: ldc_w 'me/rerere/matrix/internal/qd'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\qd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
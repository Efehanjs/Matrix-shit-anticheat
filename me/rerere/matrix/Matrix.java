package me.rerere.matrix;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.commands.condition.ConditionalCommands;
import me.rerere.matrix.internal.bk;
import me.rerere.matrix.internal.de;
import me.rerere.matrix.internal.e;
import me.rerere.matrix.internal.jd;
import me.rerere.matrix.internal.jf;
import me.rerere.matrix.internal.kd;
import me.rerere.matrix.internal.mm;
import me.rerere.matrix.internal.mn;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.internal.oj;
import me.rerere.matrix.internal.ok;
import me.rerere.matrix.internal.rb;
import me.rerere.matrix.internal.rk;
import me.rerere.matrix.internal.sn;
import me.rerere.matrix.internal.tm;
import me.rerere.matrix.internal.yf;
import me.rerere.matrix.internal.yj;
import me.rerere.matrix.misc.compatibility.CompatibilityManager;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import org.bukkit.plugin.java.JavaPlugin;

public final class Matrix extends JavaPlugin {
  private de e;
  
  private static boolean n;
  
  public rb y;
  
  public yj m;
  
  public yf o;
  
  @NotNull
  public static final mm q;
  
  @NotNull
  private final bk t = new bk();
  
  private static Matrix g;
  
  private jf a;
  
  public tm s;
  
  public e u;
  
  private static boolean w;
  
  public oj f;
  
  public mn l;
  
  public kd r;
  
  private CompatibilityManager x;
  
  private ConditionalCommands z;
  
  public rk k;
  
  private Timer v;
  
  public jd b;
  
  @JvmField
  @Nullable
  public static ClassLoader i;
  
  private static int c;
  
  private static final long d = o3.a(228280564262997367L, -502839477096349652L, MethodHandles.lookup().lookupClass()).a(55830007744244L);
  
  private static final String[] h;
  
  private static final String[] j;
  
  private static final Map p = new HashMap<>(13);
  
  @NotNull
  public final jd b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 128083965469165
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield b : Lme/rerere/matrix/internal/jd;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #23986
    //   25: ldc2_w 735273762744687999
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  @NotNull
  public final rk b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 115503107518475
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield k : Lme/rerere/matrix/internal/rk;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #12819
    //   25: ldc2_w 4027434244010074909
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  @NotNull
  public final tm b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 116237628898876
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield s : Lme/rerere/matrix/internal/tm;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #1888
    //   25: ldc2_w 2272439947391080532
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  public final void b(@NotNull yf paramyf) {
    this.o = paramyf;
  }
  
  public final void b(@NotNull yj paramyj) {
    this.m = paramyj;
  }
  
  public final void p() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 46511795754244
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 136942245229265
    //   13: lxor
    //   14: lstore_3
    //   15: dup2
    //   16: ldc2_w 64434177687949
    //   19: lxor
    //   20: dup2
    //   21: bipush #32
    //   23: lushr
    //   24: l2i
    //   25: istore #5
    //   27: dup2
    //   28: bipush #32
    //   30: lshl
    //   31: bipush #48
    //   33: lushr
    //   34: l2i
    //   35: istore #6
    //   37: dup2
    //   38: bipush #48
    //   40: lshl
    //   41: bipush #48
    //   43: lushr
    //   44: l2i
    //   45: istore #7
    //   47: pop2
    //   48: dup2
    //   49: ldc2_w 104614518961770
    //   52: lxor
    //   53: dup2
    //   54: bipush #32
    //   56: lushr
    //   57: l2i
    //   58: istore #8
    //   60: dup2
    //   61: bipush #32
    //   63: lshl
    //   64: bipush #48
    //   66: lushr
    //   67: l2i
    //   68: istore #9
    //   70: dup2
    //   71: bipush #48
    //   73: lshl
    //   74: bipush #48
    //   76: lushr
    //   77: l2i
    //   78: istore #10
    //   80: pop2
    //   81: dup2
    //   82: ldc2_w 39576448963527
    //   85: lxor
    //   86: dup2
    //   87: bipush #32
    //   89: lushr
    //   90: l2i
    //   91: istore #11
    //   93: dup2
    //   94: bipush #32
    //   96: lshl
    //   97: bipush #48
    //   99: lushr
    //   100: l2i
    //   101: istore #12
    //   103: dup2
    //   104: bipush #48
    //   106: lshl
    //   107: bipush #48
    //   109: lushr
    //   110: l2i
    //   111: istore #13
    //   113: pop2
    //   114: dup2
    //   115: ldc2_w 53971725654047
    //   118: lxor
    //   119: lstore #14
    //   121: pop2
    //   122: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   125: sipush #12110
    //   128: ldc2_w 7485042673614789474
    //   131: lload_1
    //   132: lxor
    //   133: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   138: lload_3
    //   139: invokestatic a : (Ljava/lang/Object;J)[Ljava/lang/Object;
    //   142: ldc2_w -5819469861566495486
    //   145: lload_1
    //   146: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   149: swap
    //   150: aconst_null
    //   151: swap
    //   152: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   155: goto -> 162
    //   158: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   161: athrow
    //   162: lload #14
    //   164: invokestatic a : (Ljava/lang/Object;J)[Ljava/lang/Object;
    //   167: ldc2_w -5824344466764448543
    //   170: lload_1
    //   171: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   174: dup_x2
    //   175: pop
    //   176: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   179: pop
    //   180: goto -> 187
    //   183: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   186: athrow
    //   187: invokestatic g : ()I
    //   190: iconst_0
    //   191: putstatic me/rerere/matrix/internal/hn.b : Z
    //   194: istore #16
    //   196: aload_0
    //   197: invokestatic b : ()[Ljava/lang/Object;
    //   200: ldc2_w -5817111465929581695
    //   203: lload_1
    //   204: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   207: dup_x2
    //   208: pop
    //   209: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   212: goto -> 219
    //   215: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   218: athrow
    //   219: iload #5
    //   221: iload #6
    //   223: i2c
    //   224: iload #7
    //   226: i2c
    //   227: invokestatic a : (ICC)[Ljava/lang/Object;
    //   230: ldc2_w -5825129875836935801
    //   233: lload_1
    //   234: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   237: dup_x2
    //   238: pop
    //   239: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   242: pop
    //   243: goto -> 250
    //   246: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   249: athrow
    //   250: aload_0
    //   251: iload #16
    //   253: ifne -> 458
    //   256: getfield a : Lme/rerere/matrix/internal/jf;
    //   259: dup
    //   260: ifnonnull -> 316
    //   263: goto -> 270
    //   266: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   269: athrow
    //   270: pop
    //   271: sipush #12534
    //   274: ldc2_w 9194808198577325257
    //   277: lload_1
    //   278: lxor
    //   279: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   284: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   287: ldc2_w -5826495540589171957
    //   290: lload_1
    //   291: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   294: swap
    //   295: aconst_null
    //   296: swap
    //   297: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   300: pop
    //   301: goto -> 308
    //   304: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   307: athrow
    //   308: aconst_null
    //   309: goto -> 316
    //   312: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   315: athrow
    //   316: iload #8
    //   318: iload #9
    //   320: i2s
    //   321: iload #10
    //   323: invokestatic a : (ISI)[Ljava/lang/Object;
    //   326: ldc2_w -5820243515906350526
    //   329: lload_1
    //   330: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   333: dup_x2
    //   334: pop
    //   335: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   338: pop
    //   339: goto -> 346
    //   342: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   345: athrow
    //   346: aload_0
    //   347: invokestatic b : ()[Ljava/lang/Object;
    //   350: ldc2_w -5818993296491219599
    //   353: lload_1
    //   354: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   357: dup_x2
    //   358: pop
    //   359: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   362: goto -> 369
    //   365: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   368: athrow
    //   369: invokestatic b : ()[Ljava/lang/Object;
    //   372: ldc2_w -5818612025784486306
    //   375: lload_1
    //   376: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   379: dup_x2
    //   380: pop
    //   381: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   384: pop
    //   385: goto -> 392
    //   388: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   391: athrow
    //   392: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   395: sipush #26788
    //   398: ldc2_w 6089819395095026822
    //   401: lload_1
    //   402: lxor
    //   403: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   408: lload_3
    //   409: invokestatic a : (Ljava/lang/Object;J)[Ljava/lang/Object;
    //   412: ldc2_w -5819469861566495486
    //   415: lload_1
    //   416: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   419: swap
    //   420: aconst_null
    //   421: swap
    //   422: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   425: goto -> 432
    //   428: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   431: athrow
    //   432: lload #14
    //   434: invokestatic a : (Ljava/lang/Object;J)[Ljava/lang/Object;
    //   437: ldc2_w -5824344466764448543
    //   440: lload_1
    //   441: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   444: dup_x2
    //   445: pop
    //   446: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   449: pop
    //   450: goto -> 457
    //   453: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   456: athrow
    //   457: aload_0
    //   458: invokestatic b : ()[Ljava/lang/Object;
    //   461: ldc2_w -5827323673284400735
    //   464: lload_1
    //   465: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   468: dup_x2
    //   469: pop
    //   470: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   473: goto -> 480
    //   476: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   479: athrow
    //   480: sipush #1321
    //   483: ldc2_w 5408784149862134058
    //   486: lload_1
    //   487: lxor
    //   488: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   493: iload #11
    //   495: iload #12
    //   497: i2s
    //   498: iload #13
    //   500: invokestatic a : (Ljava/lang/Object;ISI)[Ljava/lang/Object;
    //   503: ldc2_w -5823517527746913333
    //   506: lload_1
    //   507: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   510: dup_x2
    //   511: pop
    //   512: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   515: pop
    //   516: goto -> 523
    //   519: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   522: athrow
    //   523: invokestatic g : ()Ljava/lang/String;
    //   526: ifnull -> 544
    //   529: iinc #16, 1
    //   532: iload #16
    //   534: invokestatic A : (I)V
    //   537: goto -> 544
    //   540: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   543: athrow
    //   544: return
    // Exception table:
    //   from	to	target	type
    //   152	155	158	java/lang/reflect/InvocationTargetException
    //   176	180	183	java/lang/reflect/InvocationTargetException
    //   196	263	266	java/lang/RuntimeException
    //   209	212	215	java/lang/reflect/InvocationTargetException
    //   239	243	246	java/lang/reflect/InvocationTargetException
    //   256	309	312	java/lang/RuntimeException
    //   297	301	304	java/lang/reflect/InvocationTargetException
    //   335	339	342	java/lang/reflect/InvocationTargetException
    //   359	362	365	java/lang/reflect/InvocationTargetException
    //   381	385	388	java/lang/reflect/InvocationTargetException
    //   422	425	428	java/lang/reflect/InvocationTargetException
    //   446	450	453	java/lang/reflect/InvocationTargetException
    //   458	537	540	java/lang/RuntimeException
    //   470	473	476	java/lang/reflect/InvocationTargetException
    //   512	516	519	java/lang/reflect/InvocationTargetException
  }
  
  public final void b(@NotNull tm paramtm) {
    this.s = paramtm;
  }
  
  @NotNull
  public final yj b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 70160549392219
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield m : Lme/rerere/matrix/internal/yj;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #14215
    //   25: ldc2_w 1739212708459280889
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  public final void b(@NotNull mn parammn) {
    this.l = parammn;
  }
  
  public static final boolean j() {
    return q.b();
  }
  
  public static final void b(@Nullable String paramString) {
    long l1 = d ^ 0x6C172B367100L;
    long l2 = l1 ^ 0x774C31AF3C1BL;
    q.b(paramString, l2);
  }
  
  public void onEnable() {
    // Byte code:
    //   0: invokestatic getConsoleSender : ()Lorg/bukkit/command/ConsoleCommandSender;
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: getstatic org/bukkit/ChatColor.AQUA : Lorg/bukkit/ChatColor;
    //   13: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   16: ldc_w 'Efehan#0001 tarafindan leaklanmistir. LOOOOOOOOOOOOOOOOOOOOL (SO EASY)'
    //   19: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: invokevirtual toString : ()Ljava/lang/String;
    //   25: invokeinterface sendMessage : (Ljava/lang/String;)V
    //   30: getstatic me/rerere/matrix/Matrix.d : J
    //   33: ldc2_w 52481286659939
    //   36: lxor
    //   37: lstore_1
    //   38: lload_1
    //   39: dup2
    //   40: ldc2_w 40538345669715
    //   43: lxor
    //   44: lstore_3
    //   45: dup2
    //   46: ldc2_w 117721591424772
    //   49: lxor
    //   50: lstore #5
    //   52: dup2
    //   53: ldc2_w 69734685428714
    //   56: lxor
    //   57: dup2
    //   58: bipush #32
    //   60: lushr
    //   61: l2i
    //   62: istore #7
    //   64: dup2
    //   65: bipush #32
    //   67: lshl
    //   68: bipush #48
    //   70: lushr
    //   71: l2i
    //   72: istore #8
    //   74: dup2
    //   75: bipush #48
    //   77: lshl
    //   78: bipush #48
    //   80: lushr
    //   81: l2i
    //   82: istore #9
    //   84: pop2
    //   85: dup2
    //   86: ldc2_w 124089872669797
    //   89: lxor
    //   90: dup2
    //   91: bipush #32
    //   93: lushr
    //   94: l2i
    //   95: istore #10
    //   97: dup2
    //   98: bipush #32
    //   100: lshl
    //   101: bipush #48
    //   103: lushr
    //   104: l2i
    //   105: istore #11
    //   107: dup2
    //   108: bipush #48
    //   110: lshl
    //   111: bipush #48
    //   113: lushr
    //   114: l2i
    //   115: istore #12
    //   117: pop2
    //   118: dup2
    //   119: ldc2_w 112853842960309
    //   122: lxor
    //   123: dup2
    //   124: bipush #32
    //   126: lushr
    //   127: l2i
    //   128: istore #13
    //   130: dup2
    //   131: bipush #32
    //   133: lshl
    //   134: bipush #48
    //   136: lushr
    //   137: l2i
    //   138: istore #14
    //   140: dup2
    //   141: bipush #48
    //   143: lshl
    //   144: bipush #48
    //   146: lushr
    //   147: l2i
    //   148: istore #15
    //   150: pop2
    //   151: dup2
    //   152: ldc2_w 58138202706552
    //   155: lxor
    //   156: lstore #16
    //   158: dup2
    //   159: ldc2_w 83528429686072
    //   162: lxor
    //   163: dup2
    //   164: bipush #32
    //   166: lushr
    //   167: l2i
    //   168: istore #18
    //   170: dup2
    //   171: bipush #32
    //   173: lshl
    //   174: bipush #56
    //   176: lushr
    //   177: l2i
    //   178: istore #19
    //   180: dup2
    //   181: bipush #40
    //   183: lshl
    //   184: bipush #40
    //   186: lushr
    //   187: l2i
    //   188: istore #20
    //   190: pop2
    //   191: dup2
    //   192: ldc2_w 124495321968583
    //   195: lxor
    //   196: lstore #21
    //   198: dup2
    //   199: ldc2_w 46048690755411
    //   202: lxor
    //   203: lstore #23
    //   205: dup2
    //   206: ldc2_w 126077998940792
    //   209: lxor
    //   210: lstore #25
    //   212: dup2
    //   213: ldc2_w 79629643728388
    //   216: lxor
    //   217: lstore #27
    //   219: dup2
    //   220: ldc2_w 41818004396448
    //   223: lxor
    //   224: dup2
    //   225: bipush #32
    //   227: lushr
    //   228: l2i
    //   229: istore #29
    //   231: dup2
    //   232: bipush #32
    //   234: lshl
    //   235: bipush #48
    //   237: lushr
    //   238: l2i
    //   239: istore #30
    //   241: dup2
    //   242: bipush #48
    //   244: lshl
    //   245: bipush #48
    //   247: lushr
    //   248: l2i
    //   249: istore #31
    //   251: pop2
    //   252: dup2
    //   253: ldc2_w 121741432251549
    //   256: lxor
    //   257: lstore #32
    //   259: pop2
    //   260: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   263: pop
    //   264: aload_0
    //   265: putstatic me/rerere/matrix/Matrix.g : Lme/rerere/matrix/Matrix;
    //   268: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   271: pop
    //   272: aload_0
    //   273: invokestatic b : ()[Ljava/lang/Object;
    //   276: ldc2_w 2676764806147875727
    //   279: lload_1
    //   280: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   283: dup_x2
    //   284: pop
    //   285: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   288: checkcast java/lang/ClassLoader
    //   291: goto -> 298
    //   294: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   297: athrow
    //   298: putstatic me/rerere/matrix/Matrix.i : Ljava/lang/ClassLoader;
    //   301: invokestatic b : ()[Ljava/lang/Object;
    //   304: ldc2_w 2675233275752669271
    //   307: lload_1
    //   308: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   311: swap
    //   312: aconst_null
    //   313: swap
    //   314: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   317: goto -> 324
    //   320: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   323: athrow
    //   324: sipush #29140
    //   327: ldc2_w 4525336753608478612
    //   330: lload_1
    //   331: lxor
    //   332: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   337: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   340: ldc2_w 2685421938307028048
    //   343: lload_1
    //   344: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   347: dup_x2
    //   348: pop
    //   349: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   352: pop
    //   353: goto -> 360
    //   356: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   359: athrow
    //   360: invokestatic I : ()I
    //   363: invokestatic b : ()[Ljava/lang/Object;
    //   366: ldc2_w 2675233275752669271
    //   369: lload_1
    //   370: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   373: swap
    //   374: aconst_null
    //   375: swap
    //   376: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   379: goto -> 386
    //   382: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   385: athrow
    //   386: sipush #17959
    //   389: ldc2_w 925376150153164879
    //   392: lload_1
    //   393: lxor
    //   394: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   399: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   402: ldc2_w 2685421938307028048
    //   405: lload_1
    //   406: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   409: dup_x2
    //   410: pop
    //   411: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   414: pop
    //   415: goto -> 422
    //   418: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   421: athrow
    //   422: istore #34
    //   424: invokestatic b : ()[Ljava/lang/Object;
    //   427: ldc2_w 2675233275752669271
    //   430: lload_1
    //   431: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   434: swap
    //   435: aconst_null
    //   436: swap
    //   437: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   440: goto -> 447
    //   443: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   446: athrow
    //   447: sipush #16389
    //   450: ldc2_w 3449702518647651919
    //   453: lload_1
    //   454: lxor
    //   455: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   460: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   463: ldc2_w 2685421938307028048
    //   466: lload_1
    //   467: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   470: dup_x2
    //   471: pop
    //   472: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   475: pop
    //   476: goto -> 483
    //   479: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   482: athrow
    //   483: invokestatic b : ()[Ljava/lang/Object;
    //   486: ldc2_w 2675233275752669271
    //   489: lload_1
    //   490: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   493: swap
    //   494: aconst_null
    //   495: swap
    //   496: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   499: goto -> 506
    //   502: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   505: athrow
    //   506: sipush #27484
    //   509: ldc2_w 1868697520096728383
    //   512: lload_1
    //   513: lxor
    //   514: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   519: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   522: ldc2_w 2685421938307028048
    //   525: lload_1
    //   526: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   529: dup_x2
    //   530: pop
    //   531: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   534: pop
    //   535: goto -> 542
    //   538: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   541: athrow
    //   542: invokestatic b : ()[Ljava/lang/Object;
    //   545: ldc2_w 2675233275752669271
    //   548: lload_1
    //   549: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   552: swap
    //   553: aconst_null
    //   554: swap
    //   555: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   558: goto -> 565
    //   561: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   564: athrow
    //   565: sipush #16149
    //   568: ldc2_w 4760097762772287808
    //   571: lload_1
    //   572: lxor
    //   573: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   578: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   581: ldc2_w 2685421938307028048
    //   584: lload_1
    //   585: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   588: dup_x2
    //   589: pop
    //   590: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   593: pop
    //   594: goto -> 601
    //   597: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   600: athrow
    //   601: invokestatic b : ()[Ljava/lang/Object;
    //   604: ldc2_w 2675233275752669271
    //   607: lload_1
    //   608: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   611: swap
    //   612: aconst_null
    //   613: swap
    //   614: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   617: goto -> 624
    //   620: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   623: athrow
    //   624: ldc_w ''
    //   627: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   630: ldc2_w 2685421938307028048
    //   633: lload_1
    //   634: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   637: dup_x2
    //   638: pop
    //   639: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   642: pop
    //   643: goto -> 650
    //   646: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   649: athrow
    //   650: invokestatic b : ()[Ljava/lang/Object;
    //   653: ldc2_w 2675233275752669271
    //   656: lload_1
    //   657: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   660: swap
    //   661: aconst_null
    //   662: swap
    //   663: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   666: goto -> 673
    //   669: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   672: athrow
    //   673: new java/lang/StringBuilder
    //   676: dup
    //   677: invokespecial <init> : ()V
    //   680: sipush #1680
    //   683: ldc2_w 3373951914263558356
    //   686: lload_1
    //   687: lxor
    //   688: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   693: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   696: ldc2_w 2689772917952442905
    //   699: lload_1
    //   700: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   703: dup_x2
    //   704: pop
    //   705: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   708: goto -> 715
    //   711: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   714: athrow
    //   715: aload_0
    //   716: invokestatic b : ()[Ljava/lang/Object;
    //   719: ldc2_w 2692963687848500114
    //   722: lload_1
    //   723: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   726: dup_x2
    //   727: pop
    //   728: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   731: goto -> 738
    //   734: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   737: athrow
    //   738: invokestatic b : ()[Ljava/lang/Object;
    //   741: ldc2_w 2684544397170872642
    //   744: lload_1
    //   745: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   748: dup_x2
    //   749: pop
    //   750: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   753: goto -> 760
    //   756: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   759: athrow
    //   760: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   763: ldc2_w 2689772917952442905
    //   766: lload_1
    //   767: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   770: dup_x2
    //   771: pop
    //   772: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   775: goto -> 782
    //   778: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   781: athrow
    //   782: sipush #32190
    //   785: ldc2_w 5021968432781640697
    //   788: lload_1
    //   789: lxor
    //   790: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   795: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   798: ldc2_w 2689772917952442905
    //   801: lload_1
    //   802: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   805: dup_x2
    //   806: pop
    //   807: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   810: goto -> 817
    //   813: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   816: athrow
    //   817: aload_0
    //   818: invokestatic b : ()[Ljava/lang/Object;
    //   821: ldc2_w 2685933878034700471
    //   824: lload_1
    //   825: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   828: dup_x2
    //   829: pop
    //   830: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   833: goto -> 840
    //   836: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   839: athrow
    //   840: invokestatic b : ()[Ljava/lang/Object;
    //   843: ldc2_w 2687190654912619555
    //   846: lload_1
    //   847: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   850: dup_x2
    //   851: pop
    //   852: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   855: goto -> 862
    //   858: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   861: athrow
    //   862: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   865: ldc2_w 2689772917952442905
    //   868: lload_1
    //   869: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   872: dup_x2
    //   873: pop
    //   874: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   877: goto -> 884
    //   880: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   883: athrow
    //   884: invokestatic b : ()[Ljava/lang/Object;
    //   887: ldc2_w 2675689096109027151
    //   890: lload_1
    //   891: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   894: dup_x2
    //   895: pop
    //   896: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   899: goto -> 906
    //   902: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   905: athrow
    //   906: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   909: ldc2_w 2685421938307028048
    //   912: lload_1
    //   913: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   916: dup_x2
    //   917: pop
    //   918: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   921: pop
    //   922: goto -> 929
    //   925: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   928: athrow
    //   929: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   932: iload #18
    //   934: iload #19
    //   936: i2b
    //   937: ldc2_w 500
    //   940: iload #20
    //   942: invokestatic a : (IBJI)[Ljava/lang/Object;
    //   945: ldc2_w 2687707645218107109
    //   948: lload_1
    //   949: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   952: dup_x2
    //   953: pop
    //   954: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   957: pop
    //   958: goto -> 965
    //   961: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   964: athrow
    //   965: aload_0
    //   966: invokestatic b : ()[Ljava/lang/Object;
    //   969: ldc2_w 2685738673163250220
    //   972: lload_1
    //   973: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   976: dup_x2
    //   977: pop
    //   978: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   981: pop
    //   982: goto -> 989
    //   985: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   988: athrow
    //   989: aload_0
    //   990: new me/rerere/matrix/internal/yj
    //   993: dup
    //   994: invokespecial <init> : ()V
    //   997: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1000: ldc2_w 2687247603550281772
    //   1003: lload_1
    //   1004: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1007: dup_x2
    //   1008: pop
    //   1009: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1012: pop
    //   1013: goto -> 1020
    //   1016: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1019: athrow
    //   1020: aload_0
    //   1021: invokestatic b : ()[Ljava/lang/Object;
    //   1024: ldc2_w 2689637800652400541
    //   1027: lload_1
    //   1028: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1031: dup_x2
    //   1032: pop
    //   1033: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1036: goto -> 1043
    //   1039: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1042: athrow
    //   1043: lload #32
    //   1045: invokestatic a : (J)[Ljava/lang/Object;
    //   1048: ldc2_w 2688874039618706069
    //   1051: lload_1
    //   1052: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1055: dup_x2
    //   1056: pop
    //   1057: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1060: pop
    //   1061: goto -> 1068
    //   1064: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1067: athrow
    //   1068: aload_0
    //   1069: new me/rerere/matrix/internal/kd
    //   1072: dup
    //   1073: lload_3
    //   1074: invokespecial <init> : (J)V
    //   1077: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1080: ldc2_w 2676321924457910377
    //   1083: lload_1
    //   1084: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1087: dup_x2
    //   1088: pop
    //   1089: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1092: pop
    //   1093: goto -> 1100
    //   1096: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1099: athrow
    //   1100: aload_0
    //   1101: invokestatic b : ()[Ljava/lang/Object;
    //   1104: ldc2_w 2675826503824495078
    //   1107: lload_1
    //   1108: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1111: dup_x2
    //   1112: pop
    //   1113: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1116: goto -> 1123
    //   1119: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1122: athrow
    //   1123: iload #7
    //   1125: iload #8
    //   1127: i2c
    //   1128: iload #9
    //   1130: i2c
    //   1131: invokestatic a : (ICC)[Ljava/lang/Object;
    //   1134: ldc2_w 2688647653538655200
    //   1137: lload_1
    //   1138: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1141: dup_x2
    //   1142: pop
    //   1143: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1146: pop
    //   1147: goto -> 1154
    //   1150: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1153: athrow
    //   1154: aload_0
    //   1155: new me/rerere/matrix/internal/rb
    //   1158: dup
    //   1159: invokespecial <init> : ()V
    //   1162: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1165: ldc2_w 2676102071483607065
    //   1168: lload_1
    //   1169: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1172: dup_x2
    //   1173: pop
    //   1174: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1177: pop
    //   1178: goto -> 1185
    //   1181: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1184: athrow
    //   1185: aload_0
    //   1186: new me/rerere/matrix/internal/rk
    //   1189: dup
    //   1190: invokespecial <init> : ()V
    //   1193: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1196: ldc2_w 2701835728113327147
    //   1199: lload_1
    //   1200: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1203: dup_x2
    //   1204: pop
    //   1205: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1208: pop
    //   1209: goto -> 1216
    //   1212: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1215: athrow
    //   1216: aload_0
    //   1217: new me/rerere/matrix/commands/condition/ConditionalCommands
    //   1220: dup
    //   1221: invokespecial <init> : ()V
    //   1224: putfield z : Lme/rerere/matrix/commands/condition/ConditionalCommands;
    //   1227: iload #34
    //   1229: ifeq -> 1316
    //   1232: aload_0
    //   1233: getfield z : Lme/rerere/matrix/commands/condition/ConditionalCommands;
    //   1236: dup
    //   1237: ifnonnull -> 1293
    //   1240: goto -> 1247
    //   1243: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1246: athrow
    //   1247: pop
    //   1248: sipush #17308
    //   1251: ldc2_w 4469911016626912724
    //   1254: lload_1
    //   1255: lxor
    //   1256: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   1261: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1264: ldc2_w 2685030326239650156
    //   1267: lload_1
    //   1268: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1271: swap
    //   1272: aconst_null
    //   1273: swap
    //   1274: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1277: pop
    //   1278: goto -> 1285
    //   1281: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1284: athrow
    //   1285: aconst_null
    //   1286: goto -> 1293
    //   1289: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1292: athrow
    //   1293: invokestatic b : ()[Ljava/lang/Object;
    //   1296: ldc2_w 2686206266560023840
    //   1299: lload_1
    //   1300: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1303: dup_x2
    //   1304: pop
    //   1305: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1308: pop
    //   1309: goto -> 1316
    //   1312: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1315: athrow
    //   1316: sipush #241
    //   1319: ldc2_w 5285028659589758653
    //   1322: lload_1
    //   1323: lxor
    //   1324: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   1329: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1332: ldc2_w 2675933807672515347
    //   1335: lload_1
    //   1336: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1339: swap
    //   1340: aconst_null
    //   1341: swap
    //   1342: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1345: checkcast org/bukkit/command/PluginCommand
    //   1348: goto -> 1355
    //   1351: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1354: athrow
    //   1355: astore #35
    //   1357: aload_0
    //   1358: new me/rerere/matrix/internal/jf
    //   1361: dup
    //   1362: lload #21
    //   1364: invokespecial <init> : (J)V
    //   1367: putfield a : Lme/rerere/matrix/internal/jf;
    //   1370: aload #35
    //   1372: dup
    //   1373: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1376: ldc2_w 2685322604342812387
    //   1379: lload_1
    //   1380: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1383: swap
    //   1384: aconst_null
    //   1385: swap
    //   1386: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1389: pop
    //   1390: goto -> 1397
    //   1393: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1396: athrow
    //   1397: aload_0
    //   1398: getfield a : Lme/rerere/matrix/internal/jf;
    //   1401: dup
    //   1402: iload #34
    //   1404: ifeq -> 1508
    //   1407: ifnonnull -> 1463
    //   1410: goto -> 1417
    //   1413: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1416: athrow
    //   1417: pop
    //   1418: sipush #5186
    //   1421: ldc2_w 6597777036191476264
    //   1424: lload_1
    //   1425: lxor
    //   1426: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   1431: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1434: ldc2_w 2685030326239650156
    //   1437: lload_1
    //   1438: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1441: swap
    //   1442: aconst_null
    //   1443: swap
    //   1444: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1447: pop
    //   1448: goto -> 1455
    //   1451: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1454: athrow
    //   1455: aconst_null
    //   1456: goto -> 1463
    //   1459: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1462: athrow
    //   1463: checkcast org/bukkit/command/CommandExecutor
    //   1466: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1469: ldc2_w 2689539069968065086
    //   1472: lload_1
    //   1473: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1476: dup_x2
    //   1477: pop
    //   1478: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1481: pop
    //   1482: goto -> 1489
    //   1485: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1488: athrow
    //   1489: aload #35
    //   1491: aload_0
    //   1492: getfield a : Lme/rerere/matrix/internal/jf;
    //   1495: iload #34
    //   1497: ifeq -> 1560
    //   1500: dup
    //   1501: goto -> 1508
    //   1504: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1507: athrow
    //   1508: ifnonnull -> 1557
    //   1511: pop
    //   1512: sipush #5186
    //   1515: ldc2_w 6597777036191476264
    //   1518: lload_1
    //   1519: lxor
    //   1520: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   1525: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1528: ldc2_w 2685030326239650156
    //   1531: lload_1
    //   1532: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1535: swap
    //   1536: aconst_null
    //   1537: swap
    //   1538: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1541: pop
    //   1542: goto -> 1549
    //   1545: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1548: athrow
    //   1549: aconst_null
    //   1550: goto -> 1557
    //   1553: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1556: athrow
    //   1557: checkcast org/bukkit/command/TabCompleter
    //   1560: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1563: ldc2_w 2691860973684219543
    //   1566: lload_1
    //   1567: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1570: dup_x2
    //   1571: pop
    //   1572: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1575: pop
    //   1576: goto -> 1583
    //   1579: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1582: athrow
    //   1583: aload_0
    //   1584: new me/rerere/matrix/internal/mn
    //   1587: dup
    //   1588: invokespecial <init> : ()V
    //   1591: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1594: ldc2_w 2689008184204140249
    //   1597: lload_1
    //   1598: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1601: dup_x2
    //   1602: pop
    //   1603: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1606: pop
    //   1607: goto -> 1614
    //   1610: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1613: athrow
    //   1614: aload_0
    //   1615: new me/rerere/matrix/internal/de
    //   1618: dup
    //   1619: invokespecial <init> : ()V
    //   1622: putfield e : Lme/rerere/matrix/internal/de;
    //   1625: invokestatic b : ()[Ljava/lang/Object;
    //   1628: ldc2_w 2675847204209339541
    //   1631: lload_1
    //   1632: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1635: swap
    //   1636: aconst_null
    //   1637: swap
    //   1638: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1641: checkcast com/comphenix/protocol/ProtocolManager
    //   1644: goto -> 1651
    //   1647: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1650: athrow
    //   1651: aload_0
    //   1652: getfield e : Lme/rerere/matrix/internal/de;
    //   1655: iload #34
    //   1657: ifeq -> 1720
    //   1660: dup
    //   1661: ifnonnull -> 1717
    //   1664: goto -> 1671
    //   1667: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1670: athrow
    //   1671: pop
    //   1672: sipush #13738
    //   1675: ldc2_w 863371288300948471
    //   1678: lload_1
    //   1679: lxor
    //   1680: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   1685: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1688: ldc2_w 2685030326239650156
    //   1691: lload_1
    //   1692: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1695: swap
    //   1696: aconst_null
    //   1697: swap
    //   1698: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1701: pop
    //   1702: goto -> 1709
    //   1705: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1708: athrow
    //   1709: aconst_null
    //   1710: goto -> 1717
    //   1713: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1716: athrow
    //   1717: checkcast com/comphenix/protocol/events/PacketListener
    //   1720: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1723: ldc2_w 2687556163404443392
    //   1726: lload_1
    //   1727: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1730: dup_x2
    //   1731: pop
    //   1732: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1735: pop
    //   1736: goto -> 1743
    //   1739: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1742: athrow
    //   1743: aload_0
    //   1744: new me/rerere/matrix/internal/e
    //   1747: dup
    //   1748: invokespecial <init> : ()V
    //   1751: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   1754: ldc2_w 2693064366638174604
    //   1757: lload_1
    //   1758: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1761: dup_x2
    //   1762: pop
    //   1763: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1766: pop
    //   1767: goto -> 1774
    //   1770: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1773: athrow
    //   1774: invokestatic b : ()[Ljava/lang/Object;
    //   1777: ldc2_w 2676005293560437891
    //   1780: lload_1
    //   1781: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1784: swap
    //   1785: aconst_null
    //   1786: swap
    //   1787: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1790: goto -> 1797
    //   1793: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1796: athrow
    //   1797: new me/rerere/matrix/internal/xk
    //   1800: dup
    //   1801: invokespecial <init> : ()V
    //   1804: checkcast org/bukkit/event/Listener
    //   1807: aload_0
    //   1808: checkcast org/bukkit/plugin/Plugin
    //   1811: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    //   1814: ldc2_w 2690675178866768089
    //   1817: lload_1
    //   1818: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1821: dup_x2
    //   1822: pop
    //   1823: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1826: pop
    //   1827: goto -> 1834
    //   1830: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1833: athrow
    //   1834: invokestatic b : ()[Ljava/lang/Object;
    //   1837: ldc2_w 2684445048765290675
    //   1840: lload_1
    //   1841: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1844: swap
    //   1845: aconst_null
    //   1846: swap
    //   1847: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1850: checkcast java/lang/Integer
    //   1853: invokevirtual intValue : ()I
    //   1856: goto -> 1863
    //   1859: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1862: athrow
    //   1863: bipush #13
    //   1865: iload #34
    //   1867: ifeq -> 1978
    //   1870: if_icmplt -> 1947
    //   1873: goto -> 1880
    //   1876: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1879: athrow
    //   1880: invokestatic b : ()[Ljava/lang/Object;
    //   1883: ldc2_w 2676005293560437891
    //   1886: lload_1
    //   1887: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1890: swap
    //   1891: aconst_null
    //   1892: swap
    //   1893: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1896: goto -> 1903
    //   1899: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1902: athrow
    //   1903: new me/rerere/matrix/internal/lf
    //   1906: dup
    //   1907: invokespecial <init> : ()V
    //   1910: checkcast org/bukkit/event/Listener
    //   1913: aload_0
    //   1914: checkcast org/bukkit/plugin/Plugin
    //   1917: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    //   1920: ldc2_w 2690675178866768089
    //   1923: lload_1
    //   1924: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1927: dup_x2
    //   1928: pop
    //   1929: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1932: pop
    //   1933: goto -> 1940
    //   1936: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1939: athrow
    //   1940: goto -> 1947
    //   1943: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1946: athrow
    //   1947: invokestatic b : ()[Ljava/lang/Object;
    //   1950: ldc2_w 2684445048765290675
    //   1953: lload_1
    //   1954: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   1957: swap
    //   1958: aconst_null
    //   1959: swap
    //   1960: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1963: checkcast java/lang/Integer
    //   1966: invokevirtual intValue : ()I
    //   1969: goto -> 1976
    //   1972: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   1975: athrow
    //   1976: bipush #8
    //   1978: iload #34
    //   1980: ifeq -> 2091
    //   1983: if_icmple -> 2060
    //   1986: goto -> 1993
    //   1989: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   1992: athrow
    //   1993: invokestatic b : ()[Ljava/lang/Object;
    //   1996: ldc2_w 2676005293560437891
    //   1999: lload_1
    //   2000: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2003: swap
    //   2004: aconst_null
    //   2005: swap
    //   2006: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2009: goto -> 2016
    //   2012: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2015: athrow
    //   2016: new me/rerere/matrix/internal/ze
    //   2019: dup
    //   2020: invokespecial <init> : ()V
    //   2023: checkcast org/bukkit/event/Listener
    //   2026: aload_0
    //   2027: checkcast org/bukkit/plugin/Plugin
    //   2030: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    //   2033: ldc2_w 2690675178866768089
    //   2036: lload_1
    //   2037: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2040: dup_x2
    //   2041: pop
    //   2042: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2045: pop
    //   2046: goto -> 2053
    //   2049: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2052: athrow
    //   2053: goto -> 2060
    //   2056: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2059: athrow
    //   2060: invokestatic b : ()[Ljava/lang/Object;
    //   2063: ldc2_w 2684445048765290675
    //   2066: lload_1
    //   2067: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2070: swap
    //   2071: aconst_null
    //   2072: swap
    //   2073: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2076: checkcast java/lang/Integer
    //   2079: invokevirtual intValue : ()I
    //   2082: goto -> 2089
    //   2085: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2088: athrow
    //   2089: bipush #12
    //   2091: if_icmplt -> 2161
    //   2094: invokestatic b : ()[Ljava/lang/Object;
    //   2097: ldc2_w 2676005293560437891
    //   2100: lload_1
    //   2101: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2104: swap
    //   2105: aconst_null
    //   2106: swap
    //   2107: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2110: goto -> 2117
    //   2113: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2116: athrow
    //   2117: new me/rerere/matrix/internal/do
    //   2120: dup
    //   2121: invokespecial <init> : ()V
    //   2124: checkcast org/bukkit/event/Listener
    //   2127: aload_0
    //   2128: checkcast org/bukkit/plugin/Plugin
    //   2131: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    //   2134: ldc2_w 2690675178866768089
    //   2137: lload_1
    //   2138: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2141: dup_x2
    //   2142: pop
    //   2143: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2146: pop
    //   2147: goto -> 2154
    //   2150: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2153: athrow
    //   2154: goto -> 2161
    //   2157: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2160: athrow
    //   2161: invokestatic b : ()[Ljava/lang/Object;
    //   2164: ldc2_w 2676005293560437891
    //   2167: lload_1
    //   2168: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2171: swap
    //   2172: aconst_null
    //   2173: swap
    //   2174: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2177: goto -> 2184
    //   2180: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2183: athrow
    //   2184: new me/rerere/matrix/internal/bi
    //   2187: dup
    //   2188: invokespecial <init> : ()V
    //   2191: checkcast org/bukkit/event/Listener
    //   2194: aload_0
    //   2195: checkcast org/bukkit/plugin/Plugin
    //   2198: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    //   2201: ldc2_w 2690675178866768089
    //   2204: lload_1
    //   2205: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2208: dup_x2
    //   2209: pop
    //   2210: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2213: pop
    //   2214: goto -> 2221
    //   2217: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2220: athrow
    //   2221: aload_0
    //   2222: new me/rerere/matrix/internal/yf
    //   2225: dup
    //   2226: iload #13
    //   2228: iload #14
    //   2230: i2c
    //   2231: iload #15
    //   2233: i2s
    //   2234: invokespecial <init> : (ICS)V
    //   2237: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2240: ldc2_w 2675462963758389529
    //   2243: lload_1
    //   2244: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2247: dup_x2
    //   2248: pop
    //   2249: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2252: pop
    //   2253: goto -> 2260
    //   2256: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2259: athrow
    //   2260: aload_0
    //   2261: new me/rerere/matrix/internal/oj
    //   2264: dup
    //   2265: invokespecial <init> : ()V
    //   2268: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2271: ldc2_w 2688123372100100700
    //   2274: lload_1
    //   2275: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2278: dup_x2
    //   2279: pop
    //   2280: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2283: pop
    //   2284: goto -> 2291
    //   2287: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2290: athrow
    //   2291: invokestatic b : ()[Ljava/lang/Object;
    //   2294: ldc2_w 2676005293560437891
    //   2297: lload_1
    //   2298: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2301: swap
    //   2302: aconst_null
    //   2303: swap
    //   2304: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2307: goto -> 2314
    //   2310: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2313: athrow
    //   2314: aload_0
    //   2315: invokestatic b : ()[Ljava/lang/Object;
    //   2318: ldc2_w 2688990044723101970
    //   2321: lload_1
    //   2322: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2325: dup_x2
    //   2326: pop
    //   2327: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2330: goto -> 2337
    //   2333: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2336: athrow
    //   2337: checkcast org/bukkit/event/Listener
    //   2340: aload_0
    //   2341: checkcast org/bukkit/plugin/Plugin
    //   2344: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    //   2347: ldc2_w 2690675178866768089
    //   2350: lload_1
    //   2351: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2354: dup_x2
    //   2355: pop
    //   2356: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2359: pop
    //   2360: goto -> 2367
    //   2363: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2366: athrow
    //   2367: invokestatic b : ()[Ljava/lang/Object;
    //   2370: ldc2_w 2688271269424832810
    //   2373: lload_1
    //   2374: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2377: swap
    //   2378: aconst_null
    //   2379: swap
    //   2380: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2383: goto -> 2390
    //   2386: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2389: athrow
    //   2390: aload_0
    //   2391: checkcast org/bukkit/plugin/Plugin
    //   2394: aload_0
    //   2395: invokestatic b : ()[Ljava/lang/Object;
    //   2398: ldc2_w 2688990044723101970
    //   2401: lload_1
    //   2402: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2405: dup_x2
    //   2406: pop
    //   2407: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2410: goto -> 2417
    //   2413: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2416: athrow
    //   2417: checkcast java/lang/Runnable
    //   2420: ldc2_w 20
    //   2423: ldc2_w 20
    //   2426: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;JJ)[Ljava/lang/Object;
    //   2429: ldc2_w 2687928982240031866
    //   2432: lload_1
    //   2433: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2436: dup_x2
    //   2437: pop
    //   2438: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2441: goto -> 2448
    //   2444: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2447: athrow
    //   2448: pop
    //   2449: aload_0
    //   2450: new me/rerere/matrix/misc/compatibility/CompatibilityManager
    //   2453: dup
    //   2454: invokespecial <init> : ()V
    //   2457: putfield x : Lme/rerere/matrix/misc/compatibility/CompatibilityManager;
    //   2460: aload_0
    //   2461: iload #34
    //   2463: ifeq -> 2687
    //   2466: getfield x : Lme/rerere/matrix/misc/compatibility/CompatibilityManager;
    //   2469: dup
    //   2470: ifnonnull -> 2526
    //   2473: goto -> 2480
    //   2476: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2479: athrow
    //   2480: pop
    //   2481: sipush #31094
    //   2484: ldc2_w 2969506274522777351
    //   2487: lload_1
    //   2488: lxor
    //   2489: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   2494: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2497: ldc2_w 2685030326239650156
    //   2500: lload_1
    //   2501: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2504: swap
    //   2505: aconst_null
    //   2506: swap
    //   2507: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2510: pop
    //   2511: goto -> 2518
    //   2514: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2517: athrow
    //   2518: aconst_null
    //   2519: goto -> 2526
    //   2522: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2525: athrow
    //   2526: invokestatic b : ()[Ljava/lang/Object;
    //   2529: ldc2_w 2691200165398533944
    //   2532: lload_1
    //   2533: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2536: dup_x2
    //   2537: pop
    //   2538: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2541: pop
    //   2542: goto -> 2549
    //   2545: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2548: athrow
    //   2549: aload_0
    //   2550: invokestatic b : ()[Ljava/lang/Object;
    //   2553: ldc2_w 2685933878034700471
    //   2556: lload_1
    //   2557: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2560: dup_x2
    //   2561: pop
    //   2562: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2565: goto -> 2572
    //   2568: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2571: athrow
    //   2572: invokestatic b : ()[Ljava/lang/Object;
    //   2575: ldc2_w 2686896788456642094
    //   2578: lload_1
    //   2579: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2582: dup_x2
    //   2583: pop
    //   2584: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2587: goto -> 2594
    //   2590: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2593: athrow
    //   2594: aload_0
    //   2595: checkcast org/bukkit/plugin/Plugin
    //   2598: sipush #18031
    //   2601: ldc2_w 6885918500050106401
    //   2604: lload_1
    //   2605: lxor
    //   2606: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   2611: new me/rerere/matrix/internal/vi
    //   2614: dup
    //   2615: invokespecial <init> : ()V
    //   2618: checkcast org/bukkit/plugin/messaging/PluginMessageListener
    //   2621: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    //   2624: ldc2_w 2676716038807862597
    //   2627: lload_1
    //   2628: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2631: dup_x2
    //   2632: pop
    //   2633: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2636: goto -> 2643
    //   2639: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2642: athrow
    //   2643: pop
    //   2644: aload_0
    //   2645: new me/rerere/matrix/internal/jd
    //   2648: dup
    //   2649: invokespecial <init> : ()V
    //   2652: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2655: ldc2_w 2686964127303171229
    //   2658: lload_1
    //   2659: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2662: dup_x2
    //   2663: pop
    //   2664: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2667: pop
    //   2668: goto -> 2675
    //   2671: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2674: athrow
    //   2675: aload_0
    //   2676: new java/util/Timer
    //   2679: dup
    //   2680: invokespecial <init> : ()V
    //   2683: putfield v : Ljava/util/Timer;
    //   2686: aload_0
    //   2687: iload #34
    //   2689: ifeq -> 3261
    //   2692: getfield v : Ljava/util/Timer;
    //   2695: dup
    //   2696: ifnonnull -> 2752
    //   2699: goto -> 2706
    //   2702: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2705: athrow
    //   2706: pop
    //   2707: sipush #23965
    //   2710: ldc2_w 1107160500336747512
    //   2713: lload_1
    //   2714: lxor
    //   2715: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   2720: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2723: ldc2_w 2685030326239650156
    //   2726: lload_1
    //   2727: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2730: swap
    //   2731: aconst_null
    //   2732: swap
    //   2733: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2736: pop
    //   2737: goto -> 2744
    //   2740: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2743: athrow
    //   2744: aconst_null
    //   2745: goto -> 2752
    //   2748: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   2751: athrow
    //   2752: getstatic me/rerere/matrix/internal/pc.i : Lme/rerere/matrix/internal/pc;
    //   2755: checkcast java/util/TimerTask
    //   2758: ldc2_w 5
    //   2761: lconst_1
    //   2762: invokestatic a : (Ljava/lang/Object;JJ)[Ljava/lang/Object;
    //   2765: ldc2_w 2684771143675025400
    //   2768: lload_1
    //   2769: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2772: dup_x2
    //   2773: pop
    //   2774: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2777: pop
    //   2778: goto -> 2785
    //   2781: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2784: athrow
    //   2785: aload_0
    //   2786: new me/rerere/matrix/internal/tm
    //   2789: dup
    //   2790: iload #10
    //   2792: iload #11
    //   2794: i2s
    //   2795: iload #12
    //   2797: i2c
    //   2798: invokespecial <init> : (ISC)V
    //   2801: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2804: ldc2_w 2691641174280879879
    //   2807: lload_1
    //   2808: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2811: dup_x2
    //   2812: pop
    //   2813: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2816: pop
    //   2817: goto -> 2824
    //   2820: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2823: athrow
    //   2824: aload_0
    //   2825: invokestatic b : ()[Ljava/lang/Object;
    //   2828: ldc2_w 2685880442724950982
    //   2831: lload_1
    //   2832: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2835: dup_x2
    //   2836: pop
    //   2837: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2840: goto -> 2847
    //   2843: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2846: athrow
    //   2847: new java/lang/StringBuilder
    //   2850: dup
    //   2851: invokespecial <init> : ()V
    //   2854: sipush #2534
    //   2857: ldc2_w 3415864998795196297
    //   2860: lload_1
    //   2861: lxor
    //   2862: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   2867: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2870: ldc2_w 2689772917952442905
    //   2873: lload_1
    //   2874: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2877: dup_x2
    //   2878: pop
    //   2879: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2882: goto -> 2889
    //   2885: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2888: athrow
    //   2889: aload_0
    //   2890: invokestatic b : ()[Ljava/lang/Object;
    //   2893: ldc2_w 2692963687848500114
    //   2896: lload_1
    //   2897: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2900: dup_x2
    //   2901: pop
    //   2902: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2905: goto -> 2912
    //   2908: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2911: athrow
    //   2912: invokestatic b : ()[Ljava/lang/Object;
    //   2915: ldc2_w 2684544397170872642
    //   2918: lload_1
    //   2919: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2922: dup_x2
    //   2923: pop
    //   2924: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2927: goto -> 2934
    //   2930: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2933: athrow
    //   2934: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   2937: ldc2_w 2689772917952442905
    //   2940: lload_1
    //   2941: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2944: dup_x2
    //   2945: pop
    //   2946: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2949: goto -> 2956
    //   2952: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2955: athrow
    //   2956: invokestatic b : ()[Ljava/lang/Object;
    //   2959: ldc2_w 2675689096109027151
    //   2962: lload_1
    //   2963: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2966: dup_x2
    //   2967: pop
    //   2968: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   2971: goto -> 2978
    //   2974: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   2977: athrow
    //   2978: iload #29
    //   2980: iload #30
    //   2982: i2s
    //   2983: iload #31
    //   2985: invokestatic a : (Ljava/lang/Object;ISI)[Ljava/lang/Object;
    //   2988: ldc2_w 2686872577724436908
    //   2991: lload_1
    //   2992: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   2995: dup_x2
    //   2996: pop
    //   2997: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3000: pop
    //   3001: goto -> 3008
    //   3004: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3007: athrow
    //   3008: aload_0
    //   3009: invokestatic b : ()[Ljava/lang/Object;
    //   3012: ldc2_w 2685880442724950982
    //   3015: lload_1
    //   3016: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3019: dup_x2
    //   3020: pop
    //   3021: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3024: goto -> 3031
    //   3027: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3030: athrow
    //   3031: getstatic me/rerere/matrix/internal/ge.t : I
    //   3034: lload #25
    //   3036: invokestatic a : (IJ)[Ljava/lang/Object;
    //   3039: ldc2_w 2686008437969471092
    //   3042: lload_1
    //   3043: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3046: dup_x2
    //   3047: pop
    //   3048: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3051: pop
    //   3052: goto -> 3059
    //   3055: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3058: athrow
    //   3059: new me/rerere/matrix/api/MatrixAPIBack
    //   3062: dup
    //   3063: invokespecial <init> : ()V
    //   3066: checkcast me/rerere/matrix/api/MatrixAPI
    //   3069: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   3072: ldc2_w 2690345060295668319
    //   3075: lload_1
    //   3076: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3079: swap
    //   3080: aconst_null
    //   3081: swap
    //   3082: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3085: pop
    //   3086: goto -> 3093
    //   3089: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3092: athrow
    //   3093: aload_0
    //   3094: invokestatic b : ()[Ljava/lang/Object;
    //   3097: ldc2_w 2692298942080975976
    //   3100: lload_1
    //   3101: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3104: dup_x2
    //   3105: pop
    //   3106: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3109: pop
    //   3110: goto -> 3117
    //   3113: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3116: athrow
    //   3117: lload #5
    //   3119: invokestatic a : (J)[Ljava/lang/Object;
    //   3122: ldc2_w 2691309908069831727
    //   3125: lload_1
    //   3126: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3129: swap
    //   3130: aconst_null
    //   3131: swap
    //   3132: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3135: pop
    //   3136: goto -> 3143
    //   3139: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3142: athrow
    //   3143: invokestatic b : ()[Ljava/lang/Object;
    //   3146: ldc2_w 2684293227922134281
    //   3149: lload_1
    //   3150: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3153: swap
    //   3154: aconst_null
    //   3155: swap
    //   3156: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3159: pop
    //   3160: goto -> 3167
    //   3163: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3166: athrow
    //   3167: lload #27
    //   3169: invokestatic a : (J)[Ljava/lang/Object;
    //   3172: ldc2_w 2690184470834141412
    //   3175: lload_1
    //   3176: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3179: swap
    //   3180: aconst_null
    //   3181: swap
    //   3182: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3185: pop
    //   3186: goto -> 3193
    //   3189: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3192: athrow
    //   3193: lload #23
    //   3195: invokestatic a : (J)[Ljava/lang/Object;
    //   3198: ldc2_w 2684635085623099082
    //   3201: lload_1
    //   3202: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3205: swap
    //   3206: aconst_null
    //   3207: swap
    //   3208: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3211: pop
    //   3212: goto -> 3219
    //   3215: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3218: athrow
    //   3219: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   3222: sipush #23828
    //   3225: ldc2_w 8231060483305399156
    //   3228: lload_1
    //   3229: lxor
    //   3230: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   3235: lload #16
    //   3237: invokestatic a : (Ljava/lang/Object;J)[Ljava/lang/Object;
    //   3240: ldc2_w 2687734625972565638
    //   3243: lload_1
    //   3244: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3247: dup_x2
    //   3248: pop
    //   3249: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3252: pop
    //   3253: goto -> 3260
    //   3256: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3259: athrow
    //   3260: aload_0
    //   3261: invokestatic b : ()[Ljava/lang/Object;
    //   3264: ldc2_w 2691913579279151442
    //   3267: lload_1
    //   3268: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   3271: dup_x2
    //   3272: pop
    //   3273: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   3276: pop
    //   3277: goto -> 3284
    //   3280: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   3283: athrow
    //   3284: iload #34
    //   3286: ifne -> 3302
    //   3289: ldc_w 'fmpnD'
    //   3292: invokestatic p : (Ljava/lang/String;)V
    //   3295: goto -> 3302
    //   3298: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   3301: athrow
    //   3302: return
    // Exception table:
    //   from	to	target	type
    //   285	291	294	java/lang/reflect/InvocationTargetException
    //   314	317	320	java/lang/reflect/InvocationTargetException
    //   349	353	356	java/lang/reflect/InvocationTargetException
    //   376	379	382	java/lang/reflect/InvocationTargetException
    //   411	415	418	java/lang/reflect/InvocationTargetException
    //   424	1240	1243	java/lang/RuntimeException
    //   437	440	443	java/lang/reflect/InvocationTargetException
    //   472	476	479	java/lang/reflect/InvocationTargetException
    //   496	499	502	java/lang/reflect/InvocationTargetException
    //   531	535	538	java/lang/reflect/InvocationTargetException
    //   555	558	561	java/lang/reflect/InvocationTargetException
    //   590	594	597	java/lang/reflect/InvocationTargetException
    //   614	617	620	java/lang/reflect/InvocationTargetException
    //   639	643	646	java/lang/reflect/InvocationTargetException
    //   663	666	669	java/lang/reflect/InvocationTargetException
    //   705	708	711	java/lang/reflect/InvocationTargetException
    //   728	731	734	java/lang/reflect/InvocationTargetException
    //   750	753	756	java/lang/reflect/InvocationTargetException
    //   772	775	778	java/lang/reflect/InvocationTargetException
    //   807	810	813	java/lang/reflect/InvocationTargetException
    //   830	833	836	java/lang/reflect/InvocationTargetException
    //   852	855	858	java/lang/reflect/InvocationTargetException
    //   874	877	880	java/lang/reflect/InvocationTargetException
    //   896	899	902	java/lang/reflect/InvocationTargetException
    //   918	922	925	java/lang/reflect/InvocationTargetException
    //   954	958	961	java/lang/reflect/InvocationTargetException
    //   978	982	985	java/lang/reflect/InvocationTargetException
    //   1009	1013	1016	java/lang/reflect/InvocationTargetException
    //   1033	1036	1039	java/lang/reflect/InvocationTargetException
    //   1057	1061	1064	java/lang/reflect/InvocationTargetException
    //   1089	1093	1096	java/lang/reflect/InvocationTargetException
    //   1113	1116	1119	java/lang/reflect/InvocationTargetException
    //   1143	1147	1150	java/lang/reflect/InvocationTargetException
    //   1174	1178	1181	java/lang/reflect/InvocationTargetException
    //   1205	1209	1212	java/lang/reflect/InvocationTargetException
    //   1232	1286	1289	java/lang/RuntimeException
    //   1274	1278	1281	java/lang/reflect/InvocationTargetException
    //   1305	1309	1312	java/lang/reflect/InvocationTargetException
    //   1342	1348	1351	java/lang/reflect/InvocationTargetException
    //   1357	1410	1413	java/lang/RuntimeException
    //   1386	1390	1393	java/lang/reflect/InvocationTargetException
    //   1407	1456	1459	java/lang/RuntimeException
    //   1444	1448	1451	java/lang/reflect/InvocationTargetException
    //   1463	1501	1504	java/lang/RuntimeException
    //   1478	1482	1485	java/lang/reflect/InvocationTargetException
    //   1508	1550	1553	java/lang/RuntimeException
    //   1538	1542	1545	java/lang/reflect/InvocationTargetException
    //   1560	1664	1667	java/lang/RuntimeException
    //   1572	1576	1579	java/lang/reflect/InvocationTargetException
    //   1603	1607	1610	java/lang/reflect/InvocationTargetException
    //   1638	1644	1647	java/lang/reflect/InvocationTargetException
    //   1660	1710	1713	java/lang/RuntimeException
    //   1698	1702	1705	java/lang/reflect/InvocationTargetException
    //   1720	1873	1876	java/lang/RuntimeException
    //   1732	1736	1739	java/lang/reflect/InvocationTargetException
    //   1763	1767	1770	java/lang/reflect/InvocationTargetException
    //   1787	1790	1793	java/lang/reflect/InvocationTargetException
    //   1823	1827	1830	java/lang/reflect/InvocationTargetException
    //   1847	1856	1859	java/lang/reflect/InvocationTargetException
    //   1870	1940	1943	java/lang/RuntimeException
    //   1893	1896	1899	java/lang/reflect/InvocationTargetException
    //   1929	1933	1936	java/lang/reflect/InvocationTargetException
    //   1960	1969	1972	java/lang/reflect/InvocationTargetException
    //   1978	1986	1989	java/lang/RuntimeException
    //   1983	2053	2056	java/lang/RuntimeException
    //   2006	2009	2012	java/lang/reflect/InvocationTargetException
    //   2042	2046	2049	java/lang/reflect/InvocationTargetException
    //   2073	2082	2085	java/lang/reflect/InvocationTargetException
    //   2091	2154	2157	java/lang/RuntimeException
    //   2107	2110	2113	java/lang/reflect/InvocationTargetException
    //   2143	2147	2150	java/lang/reflect/InvocationTargetException
    //   2161	2473	2476	java/lang/RuntimeException
    //   2174	2177	2180	java/lang/reflect/InvocationTargetException
    //   2210	2214	2217	java/lang/reflect/InvocationTargetException
    //   2249	2253	2256	java/lang/reflect/InvocationTargetException
    //   2280	2284	2287	java/lang/reflect/InvocationTargetException
    //   2304	2307	2310	java/lang/reflect/InvocationTargetException
    //   2327	2330	2333	java/lang/reflect/InvocationTargetException
    //   2356	2360	2363	java/lang/reflect/InvocationTargetException
    //   2380	2383	2386	java/lang/reflect/InvocationTargetException
    //   2407	2410	2413	java/lang/reflect/InvocationTargetException
    //   2438	2441	2444	java/lang/reflect/InvocationTargetException
    //   2466	2519	2522	java/lang/RuntimeException
    //   2507	2511	2514	java/lang/reflect/InvocationTargetException
    //   2538	2542	2545	java/lang/reflect/InvocationTargetException
    //   2562	2565	2568	java/lang/reflect/InvocationTargetException
    //   2584	2587	2590	java/lang/reflect/InvocationTargetException
    //   2633	2636	2639	java/lang/reflect/InvocationTargetException
    //   2664	2668	2671	java/lang/reflect/InvocationTargetException
    //   2687	2699	2702	java/lang/RuntimeException
    //   2692	2745	2748	java/lang/RuntimeException
    //   2733	2737	2740	java/lang/reflect/InvocationTargetException
    //   2774	2778	2781	java/lang/reflect/InvocationTargetException
    //   2813	2817	2820	java/lang/reflect/InvocationTargetException
    //   2837	2840	2843	java/lang/reflect/InvocationTargetException
    //   2879	2882	2885	java/lang/reflect/InvocationTargetException
    //   2902	2905	2908	java/lang/reflect/InvocationTargetException
    //   2924	2927	2930	java/lang/reflect/InvocationTargetException
    //   2946	2949	2952	java/lang/reflect/InvocationTargetException
    //   2968	2971	2974	java/lang/reflect/InvocationTargetException
    //   2997	3001	3004	java/lang/reflect/InvocationTargetException
    //   3021	3024	3027	java/lang/reflect/InvocationTargetException
    //   3048	3052	3055	java/lang/reflect/InvocationTargetException
    //   3082	3086	3089	java/lang/reflect/InvocationTargetException
    //   3106	3110	3113	java/lang/reflect/InvocationTargetException
    //   3132	3136	3139	java/lang/reflect/InvocationTargetException
    //   3156	3160	3163	java/lang/reflect/InvocationTargetException
    //   3182	3186	3189	java/lang/reflect/InvocationTargetException
    //   3208	3212	3215	java/lang/reflect/InvocationTargetException
    //   3249	3253	3256	java/lang/reflect/InvocationTargetException
    //   3261	3295	3298	java/lang/RuntimeException
    //   3273	3277	3280	java/lang/reflect/InvocationTargetException
  }
  
  @NotNull
  public final mn b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 137821683666438
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield l : Lme/rerere/matrix/internal/mn;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #26451
    //   25: ldc2_w 3894980660091668581
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  public static final void p(boolean paramBoolean) {
    q.j(paramBoolean);
  }
  
  @NotNull
  public final e b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 87840731387200
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield u : Lme/rerere/matrix/internal/e;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #9307
    //   25: ldc2_w 5867641139222450197
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  @NotNull
  public final bk b() {
    return this.t;
  }
  
  @NotNull
  public final yf b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 9016408459532
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield o : Lme/rerere/matrix/internal/yf;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #15036
    //   25: ldc2_w 6693136298596307585
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  public final void b(@NotNull kd paramkd) {
    this.r = paramkd;
  }
  
  public final void b(@NotNull rb paramrb) {
    this.y = paramrb;
  }
  
  public final void b(@NotNull jd paramjd) {
    this.b = paramjd;
  }
  
  public Matrix() {
    g = this;
    ok.i.j(l2);
    sn.b(l3);
  }
  
  public final void b(@NotNull e parame) {
    this.u = parame;
  }
  
  @NotNull
  public final oj b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 112634087746666
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield f : Lme/rerere/matrix/internal/oj;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #5386
    //   25: ldc2_w 483958596515387458
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  public final void b(@NotNull rk paramrk) {
    this.k = paramrk;
  }
  
  @NotNull
  public final kd b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 77185473666081
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield r : Lme/rerere/matrix/internal/kd;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #28359
    //   25: ldc2_w 1430140962155844588
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  static {
    long l = d ^ 0x270FB852B71FL;
    A(104);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[52];
    boolean bool = false;
    String str;
    int i = (str = "Åp*Foa6)!®¢´}SòÖ§ë2 Q¾QDw»UkàÝBñL®YÉ(~­\001¹Wþ\020oDu·R6 ¦¿¹J¥Á\tp\007ù:ïYSðEEôD\nPÌÂiµùÆ)Ã\r\032P*c\033¤W1³Vó8ÄÖ0--¤Òz¾\026íS\0265Çï\004AS±C%¼·n\006Pøî£ÿÝ16\\xÝ\005^dÑéß(j\001m!ÊgØ~æn¾rC¬_©± ]Þ$\"¤Ü*0ñúï¾¬ð5E'±´oº\b%÷Zpï î!aýv\003;½³õì®¿·µDAQý\0203ë:«^Þ)\030½=Z(èI#èýTË ëÕÀ\têZ\006õ\004\025ew®`î\016xw­¤\035æÐËP8pE\017÷Ï:\017Ëg²u¨mÊ§°2É¡\001b7y|±ü]`6àA\\\002\023ÎFEx\032l´\013#ÏO·\\06Ò®D^¢Ø^ ¢.tí\024aP{%M|õ\bÍ¾Ró\017ý\006pqýÕ\027À¥¤¥ÚP\rT¦_£êJÒ¥Wh(³óÜØæçz(Z°¶®!äg\031ñ»ypq¾îu\021(Ü}^(Ñ\0076Ï1v3/~Í·\000¦\036ñö\"¼jÀ¾\026Ù©!>\"\017RÇ \020å\005\003N|î\030mw1 ^( aØ<+Qÿóÿã\tÚ<±\0009\007\023®p(Ñ[¥Õ?\t\004ö\0046ÝJdXtÈ4½\034{ï5\031º?)×òß\fÝ\030ä²)Wºü\"cîÇ[¾'\f\bIº²¾\013üþ$\n»qÕÃ|fß¼\030SAÛßgÏmÀ¾ÂþÇ\033ë>:Üæô\"ù{pw1Ü ´wß8dQ\"K ¡\006\bú¾<­m\031¥\031\032»áZÞØ68\020&¼\024x\021fô¾§%?\020Ôÿ\001ÅÕH¦>JÎ7Þ^'(1\034oîñ[eûÑüa\004}1\027XÖGeCD\\TéåLèíÎ\006ú\033Úc¿±M(\006jqG¯l\000éTì3Îoè\024a§Az¾¥vå¿<*Ú¶á÷\027§\032ü(º\006º\001½?³cw\rùL%¢Å\026\033L?Ï­\fà%­µ1÷IHþæÙ\b% §Û¼á>±Wí,'-û@öbÌ&ý¿Öø$GR$)e ¤ÌÔâUê\023Ü£Ö²Ía<M\0347Ï#}uÑ5\001\nC¹\0318)V[Ãz×·¥ÞkGÑ\020{lÂØ\000\rn¹¼æ\016?ª,lcðÅaÊmO\fÜG9SHSh=Sè\037\033ªPä(\036\nõªA4Ì®:\013W ßgN'æ¸íz\003\013\rºNi-PÓiÞÂKæ&ç4ø\027KÛ\013°¥\\'¤^ËåÝ­Zl\036¢8\020Ô;Ê¸ù\b²kÝø8 Ü­8{fHß\006ÝVÙÄ\030ÀúØ5¶4qÉ²Ö©\021`lþ¢t\t\021ê¶eîzªûÈ®J¥ç``8\tÈ\0251vq»Ñ\016¹)BÅ¥\022õCMÓRÛ¸\026Çqu\n4\002aÑàÚV,3CN9ÜâTÜ\bÑ5ÃHÖænD8$¡V=s'pJÉtaOËVôé\031É¶ÿÐæ\032lþÀ\024ÿ6sû j]PÛÜ­öûöø'Û­\0161£æá¸\020íæÚm¼Jp¾\021zl$Mö½²/cÜN.eHvAÔ\006æW\016urqRþ|gA\023÷S·\013^|Áä\017\023[A'µn5Á<5òüò¡Ýu ©\036tyu£\"\fõòËÝï\021ZM\003þ¸À{¨\005°\t&;\030ý\033Êé\023µ¥¬Ê©²\025^uÊþ¢\004\023N¯ @¾0¬\021Øf\017ñâÝ¡`\016Ù\005\004tù|ðu\016\020¼Ø´F\003\nV÷%ÞI.\030Ë3ù'µË\024:\001éÐçXÐ\037·ðéXÿ8ýZog è\004är\013:ë\013®ñNß}(7k©\"`ó\031\000xo³¹õÿ·ÍtÎ;È~»Ì}r+X\013X\032ÏE¸dîý;g!¹®0Á¾@í6:\t)\023UP\r_kP\022N''yò®ìÙ¦<ÖÏ\".øWÊ|NU\000ñÐïdv*¦ã2\005D\022Úð?`á÷Ü/Nº#8\006$ÄRdkÏ¼^ã\032^!ìþ¬³_Ú²Çv0¡ä´Z²ö£S8\004\036ùwÆ\036;æ¦ÿü\034´Pï>\021Â¡Òpáèý\000±?9¸~ó§ü­0O]twøW>:wê{¹aEÞNc÷1dàÿi\0172{^ê(hê\\Y\026\0010nË5ÇÌH(è\"øS\037Í\0258oÏT]ã{\031z|éõ\033\005Íö¾\037\tX\027ÁBb\037ErH\027´Ë_Û}ÃrNo\roëº/P}¹®á÷\034â$k.Èþ±\024Ê+>\035è\027}åÇéÖCnd¿9\033¹\026åöøP\r\031ñlYàÞÒ|ÅÇ(K¢\\q\005j«Ã>å. Ì«~ÕP­ê°Êù¼ª>°\003ä-¬~Úl :>ôÉ¶n¸ÙöE¼ZñÎ\026Ep£@-?îmO[µ±ææ ¯'¢\035£Oe6;´Ø¹S\017*>7\030Ù\004éwCãâìÎ\030iBH¥q»Ó>?ÄX»¿\016º\026`\020Í+&\030$4\037QÿÞ'gËÞ(ôË¦Ä¢Aö­è¤(r\0304\024[G4\f\036º»\022\r@t°8ø²|ñ\rc$m\bPA[/SbÏãôEj§\024QÏTà¡ìÓ\fÜ½)èÕÆdù´\031Aäµ´ÒêN0©@`#\023%'7[Ùý¶HWD?Ýn\007Ð\0167¼9¶B¾{00KiPü\031gÌá$Qz$T}¸Ãü%Å%\005vôA7:'C¥'8ö÷,2h\033>\034ß8 ö\002&n$\026 \004´)\024Ä\003Ûc6\"ñ(Ð¤\023-ëåk7ô Q\"«5\f\017^ÒN^ò\032¸\026\032ÂùÙq»^q[àÚ\037\"\f\bXD\030ló´ó÷²ÎLP£Àx8°\025WQÔÊ|ÛMÁ³Ë^Àv©\021\nÅÿ~~ø\037ó\002\030úXªIÍÅò¾eIgIY°¯\036_AÓ=(#KJè\004¼­\rí]\023MãphX\036a\035\023cÕËÕý½h\002d\025]åV.öM÷j2ø±E+éOì¶\017sQ\002hÿP\003X¨éÑ@£ð\017Î\035,ÙøÓÕIB#\\8\b|bÞ\023¶XK7\025\036p\016HÊÕ_Ôr©t,söK\004måÌN«\030\005\005ôOç¾duYÉaO\037Õ\032ù@Br\025ú").length();
    byte b2 = 24;
    byte b = -1;
    while (true);
  }
  
  public static final void b(long paramLong) {
    long l = d ^ 0x5E19D86993EBL;
    int i = (int)((l ^ 0x3A55627A01B0L) >>> 32L);
    int j = (int)((l ^ 0x3A55627A01B0L) << 32L >>> 56L);
    int k = (int)((l ^ 0x3A55627A01B0L) << 40L >>> 40L);
    l ^ 0x3A55627A01B0L;
    q.b(i, (byte)j, paramLong, k);
  }
  
  @NotNull
  public final rb b() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 42168929290688
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: getfield y : Lme/rerere/matrix/internal/rb;
    //   12: dup
    //   13: ifnull -> 21
    //   16: areturn
    //   17: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   20: athrow
    //   21: pop
    //   22: sipush #28003
    //   25: ldc2_w 3114862831460877746
    //   28: lload_1
    //   29: lxor
    //   30: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   35: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    // Exception table:
    //   from	to	target	type
    //   8	17	17	java/lang/RuntimeException
  }
  
  public final void b(@NotNull oj paramoj) {
    this.f = paramoj;
  }
  
  public void onDisable() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/Matrix.d : J
    //   3: ldc2_w 53323878242683
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 47435569910880
    //   13: lxor
    //   14: lstore_3
    //   15: pop2
    //   16: invokestatic I : ()I
    //   19: istore #5
    //   21: nop
    //   22: aload_0
    //   23: checkcast org/bukkit/plugin/Plugin
    //   26: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   29: ldc2_w -2070326620488865209
    //   32: lload_1
    //   33: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   36: swap
    //   37: aconst_null
    //   38: swap
    //   39: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: goto -> 50
    //   46: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   49: athrow
    //   50: aload_0
    //   51: invokestatic b : ()[Ljava/lang/Object;
    //   54: ldc2_w -2063135276832465233
    //   57: lload_1
    //   58: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   61: dup_x2
    //   62: pop
    //   63: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   66: goto -> 73
    //   69: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   72: athrow
    //   73: invokestatic b : ()[Ljava/lang/Object;
    //   76: ldc2_w -2066631470105472970
    //   79: lload_1
    //   80: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   83: dup_x2
    //   84: pop
    //   85: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   88: goto -> 95
    //   91: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   94: athrow
    //   95: aload_0
    //   96: checkcast org/bukkit/plugin/Plugin
    //   99: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   102: ldc2_w -2071461172085993808
    //   105: lload_1
    //   106: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   109: dup_x2
    //   110: pop
    //   111: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   114: pop
    //   115: goto -> 122
    //   118: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   121: athrow
    //   122: invokestatic b : ()[Ljava/lang/Object;
    //   125: ldc2_w -2073174121830782323
    //   128: lload_1
    //   129: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   132: swap
    //   133: aconst_null
    //   134: swap
    //   135: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   138: checkcast com/comphenix/protocol/ProtocolManager
    //   141: goto -> 148
    //   144: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   147: athrow
    //   148: aload_0
    //   149: getfield e : Lme/rerere/matrix/internal/de;
    //   152: iload #5
    //   154: ifeq -> 217
    //   157: dup
    //   158: ifnonnull -> 214
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   167: athrow
    //   168: pop
    //   169: sipush #8828
    //   172: ldc2_w 5426265785094887987
    //   175: lload_1
    //   176: lxor
    //   177: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   182: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   185: ldc2_w -2063990998948993164
    //   188: lload_1
    //   189: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   192: swap
    //   193: aconst_null
    //   194: swap
    //   195: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   198: pop
    //   199: goto -> 206
    //   202: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   205: athrow
    //   206: aconst_null
    //   207: goto -> 214
    //   210: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   213: athrow
    //   214: checkcast com/comphenix/protocol/events/PacketListener
    //   217: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   220: ldc2_w -2066957677193208170
    //   223: lload_1
    //   224: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   227: dup_x2
    //   228: pop
    //   229: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   232: pop
    //   233: goto -> 240
    //   236: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   239: athrow
    //   240: invokestatic b : ()[Ljava/lang/Object;
    //   243: ldc2_w -2065261353113458894
    //   246: lload_1
    //   247: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   250: swap
    //   251: aconst_null
    //   252: swap
    //   253: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   256: goto -> 263
    //   259: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   262: athrow
    //   263: aload_0
    //   264: checkcast org/bukkit/plugin/Plugin
    //   267: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   270: ldc2_w -2067612158836296071
    //   273: lload_1
    //   274: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   277: dup_x2
    //   278: pop
    //   279: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   282: pop
    //   283: goto -> 290
    //   286: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   289: athrow
    //   290: iload #5
    //   292: ifeq -> 379
    //   295: aload_0
    //   296: getfield v : Ljava/util/Timer;
    //   299: dup
    //   300: ifnonnull -> 356
    //   303: goto -> 310
    //   306: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   309: athrow
    //   310: pop
    //   311: sipush #32210
    //   314: ldc2_w 2331536724938818952
    //   317: lload_1
    //   318: lxor
    //   319: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   324: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   327: ldc2_w -2063990998948993164
    //   330: lload_1
    //   331: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   334: swap
    //   335: aconst_null
    //   336: swap
    //   337: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   340: pop
    //   341: goto -> 348
    //   344: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   347: athrow
    //   348: aconst_null
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   355: athrow
    //   356: invokestatic b : ()[Ljava/lang/Object;
    //   359: ldc2_w -2067110348707843948
    //   362: lload_1
    //   363: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   366: dup_x2
    //   367: pop
    //   368: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   371: pop
    //   372: goto -> 379
    //   375: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   378: athrow
    //   379: goto -> 524
    //   382: astore #6
    //   384: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   387: new java/lang/StringBuilder
    //   390: dup
    //   391: invokespecial <init> : ()V
    //   394: sipush #27054
    //   397: ldc2_w 5456649726992716258
    //   400: lload_1
    //   401: lxor
    //   402: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   407: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   410: ldc2_w -2068311166099803135
    //   413: lload_1
    //   414: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   417: dup_x2
    //   418: pop
    //   419: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   422: goto -> 429
    //   425: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   428: athrow
    //   429: aload #6
    //   431: invokevirtual getClass : ()Ljava/lang/Class;
    //   434: invokestatic b : ()[Ljava/lang/Object;
    //   437: ldc2_w -2065516937657984132
    //   440: lload_1
    //   441: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   444: dup_x2
    //   445: pop
    //   446: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   449: goto -> 456
    //   452: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   455: athrow
    //   456: invokestatic a : (Ljava/lang/Object;)[Ljava/lang/Object;
    //   459: ldc2_w -2068311166099803135
    //   462: lload_1
    //   463: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   466: dup_x2
    //   467: pop
    //   468: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   471: goto -> 478
    //   474: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   477: athrow
    //   478: invokestatic b : ()[Ljava/lang/Object;
    //   481: ldc2_w -2073367998641067689
    //   484: lload_1
    //   485: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   488: dup_x2
    //   489: pop
    //   490: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   493: goto -> 500
    //   496: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   499: athrow
    //   500: lload_3
    //   501: invokestatic a : (Ljava/lang/Object;J)[Ljava/lang/Object;
    //   504: ldc2_w -2065780438936555362
    //   507: lload_1
    //   508: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   511: dup_x2
    //   512: pop
    //   513: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   516: pop
    //   517: goto -> 524
    //   520: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   523: athrow
    //   524: getstatic me/rerere/matrix/Matrix.q : Lme/rerere/matrix/internal/mm;
    //   527: sipush #2802
    //   530: ldc2_w 4483159896107020936
    //   533: lload_1
    //   534: lxor
    //   535: <illegal opcode> x : (IJ)Ljava/lang/String;
    //   540: lload_3
    //   541: invokestatic a : (Ljava/lang/Object;J)[Ljava/lang/Object;
    //   544: ldc2_w -2065780438936555362
    //   547: lload_1
    //   548: invokestatic d : (JJ)Ljava/lang/reflect/Method;
    //   551: dup_x2
    //   552: pop
    //   553: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   556: pop
    //   557: goto -> 564
    //   560: invokevirtual getTargetException : ()Ljava/lang/Throwable;
    //   563: athrow
    //   564: return
    // Exception table:
    //   from	to	target	type
    //   21	161	164	java/lang/Exception
    //   21	379	382	java/lang/Exception
    //   39	43	46	java/lang/reflect/InvocationTargetException
    //   63	66	69	java/lang/reflect/InvocationTargetException
    //   85	88	91	java/lang/reflect/InvocationTargetException
    //   111	115	118	java/lang/reflect/InvocationTargetException
    //   135	141	144	java/lang/reflect/InvocationTargetException
    //   157	207	210	java/lang/Exception
    //   195	199	202	java/lang/reflect/InvocationTargetException
    //   217	303	306	java/lang/Exception
    //   229	233	236	java/lang/reflect/InvocationTargetException
    //   253	256	259	java/lang/reflect/InvocationTargetException
    //   279	283	286	java/lang/reflect/InvocationTargetException
    //   295	349	352	java/lang/Exception
    //   337	341	344	java/lang/reflect/InvocationTargetException
    //   368	372	375	java/lang/reflect/InvocationTargetException
    //   419	422	425	java/lang/reflect/InvocationTargetException
    //   446	449	452	java/lang/reflect/InvocationTargetException
    //   468	471	474	java/lang/reflect/InvocationTargetException
    //   490	493	496	java/lang/reflect/InvocationTargetException
    //   513	517	520	java/lang/reflect/InvocationTargetException
    //   553	557	560	java/lang/reflect/InvocationTargetException
  }
  
  @NotNull
  public static final Matrix b() {
    long l1 = d ^ 0x68CD783C1C0EL;
    long l2 = l1 ^ 0x721A2C59D8DFL;
    return q.b(l2);
  }
  
  public static void A(int paramInt) {
    c = paramInt;
  }
  
  public static int I() {
    return c;
  }
  
  public static int g() {
    int i = I();
    try {
      if (i == 0)
        return 104; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1B22;
    if (j[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])p.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          p.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/Matrix", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = h[i].getBytes("ISO-8859-1");
      j[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return j[i];
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
    //   66: ldc_w 'me/rerere/matrix/Matrix'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\Matrix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
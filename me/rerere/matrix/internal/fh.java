package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
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
import me.rerere.matrix.thirdparty.kotlin.reflect.KProperty;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class fh extends zk {
  @NotNull
  private final xi j;
  
  @NotNull
  private final xi d;
  
  @NotNull
  private final xi h;
  
  @NotNull
  private final xi e;
  
  private long n;
  
  @NotNull
  private final xi y;
  
  @NotNull
  private final xi m;
  
  private int o;
  
  @NotNull
  private final i t;
  
  private double g;
  
  @NotNull
  private final xi a;
  
  private int s;
  
  private int u;
  
  private double w;
  
  private int f;
  
  private double l;
  
  @NotNull
  private final xi r;
  
  @NotNull
  private final i x;
  
  @NotNull
  private final xi z;
  
  @NotNull
  private final xi k;
  
  private double v;
  
  private double b;
  
  private double i;
  
  private static final long c = o3.a(-6075059514196684149L, 4182455974319566090L, MethodHandles.lookup().lookupClass()).a(106677155662506L);
  
  private static final String[] p;
  
  private static final String[] A;
  
  private static final Map F = new HashMap<>(13);
  
  public fh(@NotNull yl paramyl, long paramLong) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/fh.c : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: aload_0
    //   7: aload_1
    //   8: getstatic me/rerere/matrix/internal/yk.n : Lme/rerere/matrix/internal/yk;
    //   11: invokespecial <init> : (Lme/rerere/matrix/internal/yl;Lme/rerere/matrix/internal/yk;)V
    //   14: aload_0
    //   15: aload_0
    //   16: checkcast me/rerere/matrix/internal/zk
    //   19: sipush #28851
    //   22: ldc2_w 2335429080310078590
    //   25: lload_2
    //   26: lxor
    //   27: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   32: iconst_1
    //   33: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   36: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   39: putfield j : Lme/rerere/matrix/internal/xi;
    //   42: aload_0
    //   43: aload_0
    //   44: checkcast me/rerere/matrix/internal/zk
    //   47: sipush #8599
    //   50: ldc2_w 1839581514583149898
    //   53: lload_2
    //   54: lxor
    //   55: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   60: iconst_3
    //   61: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   64: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   67: putfield a : Lme/rerere/matrix/internal/xi;
    //   70: aload_0
    //   71: aload_0
    //   72: checkcast me/rerere/matrix/internal/zk
    //   75: sipush #25712
    //   78: ldc2_w 4167675999948425381
    //   81: lload_2
    //   82: lxor
    //   83: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   88: iconst_1
    //   89: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   92: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   95: putfield k : Lme/rerere/matrix/internal/xi;
    //   98: aload_0
    //   99: aload_0
    //   100: checkcast me/rerere/matrix/internal/zk
    //   103: sipush #32172
    //   106: ldc2_w 8088253092569239906
    //   109: lload_2
    //   110: lxor
    //   111: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   116: bipush #10
    //   118: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   121: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   124: putfield e : Lme/rerere/matrix/internal/xi;
    //   127: aload_0
    //   128: aload_0
    //   129: checkcast me/rerere/matrix/internal/zk
    //   132: sipush #29261
    //   135: ldc2_w 8910638196612816520
    //   138: lload_2
    //   139: lxor
    //   140: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   145: iconst_1
    //   146: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   149: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   152: putfield h : Lme/rerere/matrix/internal/xi;
    //   155: aload_0
    //   156: aload_0
    //   157: checkcast me/rerere/matrix/internal/zk
    //   160: sipush #11846
    //   163: ldc2_w 5586101325180174986
    //   166: lload_2
    //   167: lxor
    //   168: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   173: bipush #10
    //   175: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   178: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   181: putfield y : Lme/rerere/matrix/internal/xi;
    //   184: aload_0
    //   185: aload_0
    //   186: checkcast me/rerere/matrix/internal/zk
    //   189: sipush #9669
    //   192: ldc2_w 7393492952474814764
    //   195: lload_2
    //   196: lxor
    //   197: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   202: iconst_1
    //   203: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   206: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   209: putfield z : Lme/rerere/matrix/internal/xi;
    //   212: aload_0
    //   213: aload_0
    //   214: checkcast me/rerere/matrix/internal/zk
    //   217: sipush #20255
    //   220: ldc2_w 4017909005108634563
    //   223: lload_2
    //   224: lxor
    //   225: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   230: bipush #10
    //   232: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   235: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   238: putfield d : Lme/rerere/matrix/internal/xi;
    //   241: aload_0
    //   242: aload_0
    //   243: checkcast me/rerere/matrix/internal/zk
    //   246: sipush #11073
    //   249: ldc2_w 8154109673416591243
    //   252: lload_2
    //   253: lxor
    //   254: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   259: iconst_1
    //   260: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   263: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   266: putfield m : Lme/rerere/matrix/internal/xi;
    //   269: aload_0
    //   270: aload_0
    //   271: checkcast me/rerere/matrix/internal/zk
    //   274: sipush #31319
    //   277: ldc2_w 5209323525196043912
    //   280: lload_2
    //   281: lxor
    //   282: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   287: iconst_5
    //   288: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   291: invokestatic b : (Lme/rerere/matrix/internal/zk;Ljava/lang/String;Ljava/lang/Object;)Lme/rerere/matrix/internal/xi;
    //   294: putfield r : Lme/rerere/matrix/internal/xi;
    //   297: aload_0
    //   298: new me/rerere/matrix/internal/i
    //   301: dup
    //   302: iconst_3
    //   303: invokespecial <init> : (I)V
    //   306: putfield t : Lme/rerere/matrix/internal/i;
    //   309: aload_0
    //   310: new me/rerere/matrix/internal/i
    //   313: dup
    //   314: iconst_4
    //   315: invokespecial <init> : (I)V
    //   318: putfield x : Lme/rerere/matrix/internal/i;
    //   321: return
  }
  
  static {
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[40];
    boolean bool = false;
    String str;
    int j = (str = "ï²ëÅ=\rz¢w,0ú]Ë¥|\035²®Ttà+EùÌ\025\030\030àLu3h\022.\024¿\013H³v®2d¿\007Jº´%(YGõáx¦D7\017æ]0èQ\030ËßvÑHUyQY¸j¨ïû\n=8µ>%yþÉ'_b\036áÝí~\005\003T©N¹i=¾*CÊ¹ótM\000N\0277\031j\0270+ª\023¯P>\fÑâ~8kBp¨F@SéÒæ.\006½bh\002`T-\0248¸K*]\"¥£Ìså\007Ü-g\r0æõ=ê\004Ýµü\031`UÙÇ¶iAg(£\004väèqz\034\002}\006=aül|Õ\034¥M\000\035\001\035\024Ù9E'J*öè8 Õâ4OÐ}È9Cs\035 <ï\023ç,B=9/â\016«(t\001QÌ*/n\0244ü¾\021ÔzØ|·R<È°\020UÒH\017³9,U^^-|À(¾*R µ°WFZ8óT!.»9ý/ü\037\002\\Í¦n0 yÉ\0301\032x5â0kóê¾³´}\030uÙ4mp©âLJªØËK\ræ?ü¡Eìr\026ã·ëG>%JLÄ\026IÉ\030jCØü{ýxO\013N«@¾/Tw1×a³Ð m$¢Ï@ä\003ùßÎÖ¢s0x&>aÅ6\033ÒHÏxÇ$l8ú16ë\r9[1³)êy½ò\t\031\007ä[ç0­0Ú\026Ý\033\024\rÚR ¯VÅy±+ÃêâëC²ü)¯\\² fy½`LÇìP¢u-@ÞÆ¹ÂÈ¶5Y\037Ý°\030F4u\003±§F ËîK^\0062Ïñ¡$\006çªíML,N\007ùôP;@=ßIÜ \017&¡\017B6\b\bôN-ÃÆ\016òÈ¶;ePíÎ\024Ê}N\025¼ÙÉr0ÝÃJPNÖÉÐß­vÐ¨RÀ´,<¶»×¢JÆ_uc tèÊ^y\016F[ëx7{Ó\006(\022úø\t8sê&·\006\005\bN1êÖ\021~á\000xõ\007\020\006|\003Mní\005Ñ«\021P]:d5È$¸áÝ\037\037,Ã 2í\001M^³\006!«BÃx+hqL\0174\001±£!ôº/öàN¨\n¾¼l/¥úÀÁ0\017\000sQ\033P×sÇßâ¿P'\007\030|ÜmþG\006ý{¹\035fVÄ§)ùm¼£Q0\006¢¯$¬*þôÖ\017jþY\t¬«t2 0,Æ\tüË\"òÖz\025,~_2\023mñðQnÉ0Ù:%÷»¦\r=cà¤¤é[Þ\031íÕ«¥\005òVN¤IÕ¨!oà¥?ªÇ*O¬H\031hL\037ç\002(×uó/­°ä\022°æ\021ÀhGÊ\037ºSÏ%ï(£ç>¼û)û5¾ivò\0239¼HW\027y\rðwS´ÑsÒ0¿ ¥óNa\020]%«éXÍéó\004ml÷piÊ\017ýV,`øQê\r@ÝÇÔÇc´\\wúÀÁóÎM\032¶9AÂ°d|¸(?%°Ù\rëùwý\006\001²»Z 'm\032=w¨ô¶j¸ÖyµE\bNýß¼Ì¶®(.p>ð¡±ÈÑn½5î\036ý\036Æºjû>äÔÿ\rLÓé¯A.sìö×t\032\001s P?;³Úk|øðÛÁ.øÔÜ\fìk#fôÐ¾\035ßôÉÒ¼xP´ÆÏä\001Ø\034qGÈ\tZ;t 0Þ½Ò«­\035M³\004ún÷£Éü7Ð@÷íurSðÚóÆý¨:)\013>G\006\024×Õ\004o\017rºjscVC-úXM8$\037Ývh'\fèÕôC¬2¢h\007Ú!'öÈ\001Þ»[AuGì\013¤Öñ\016öÍ­U=E°ÚK*ü' 8§\f 0Á\016r\022\037oÿ¶¦o5ñÎè.z\032«Mø\031ËÒ!û\b@\030*´\037G=G]]W¿CÜ2y\025ê1\020àï(.\036ëãâhFI®¶Û£\017Îq{G³Ý3ì\032éÇoÍÇVõ#ºX8`\024ÏoÙ2Î.\034¯õ\034.0d#§)â«IðÁDèz4K \n·~ï\022\013Ìâ\000]Ù×\036tüO\032\f¥\017\032\030øø_=.ÒfM\016û¾kb\030×$\rtãRnH´ÝÒñÂÞ\035ö«Ò+ÒsX¨ur@¶v¶ný\000\f·ú\r2\035zL¢AÀ¡äv\025!ëéËBìÞ¥0)\034x®¬}jèZ\030Êû~\013zjmMFgR©3Ô+è¸Zñ \030Í3M*(â¦³ä!¨ëî%ãXBl\020\004×\037ÞW*[((ÎO;Æ\006\004\033OäaÔö¨'4Õ¯C\023U\022ÎòÜ«\037ß4\013{Í\"Ï\001± ").length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  public boolean j(@NotNull PacketType paramPacketType, long paramLong, @NotNull PacketContainer paramPacketContainer) {
    // Byte code:
    //   0: lload_2
    //   1: dup2
    //   2: ldc2_w 57264538460161
    //   5: lxor
    //   6: lstore #5
    //   8: dup2
    //   9: ldc2_w 25653092024530
    //   12: lxor
    //   13: lstore #7
    //   15: dup2
    //   16: ldc2_w 48574722703755
    //   19: lxor
    //   20: lstore #9
    //   22: dup2
    //   23: ldc2_w 90604108735287
    //   26: lxor
    //   27: lstore #11
    //   29: dup2
    //   30: ldc2_w 40507544756790
    //   33: lxor
    //   34: lstore #13
    //   36: pop2
    //   37: aload_0
    //   38: invokespecial m : ()Z
    //   41: ifeq -> 388
    //   44: aload_0
    //   45: getfield t : Lme/rerere/matrix/internal/i;
    //   48: astore #15
    //   50: iconst_0
    //   51: istore #16
    //   53: aload #4
    //   55: astore #17
    //   57: iconst_0
    //   58: istore #18
    //   60: lload #13
    //   62: aload_1
    //   63: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   66: ifne -> 86
    //   69: lload #5
    //   71: aload #4
    //   73: invokestatic b : (JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   76: ifeq -> 94
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   85: athrow
    //   86: iconst_1
    //   87: goto -> 95
    //   90: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   93: athrow
    //   94: iconst_0
    //   95: ifeq -> 387
    //   98: aload #15
    //   100: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   103: new me/rerere/matrix/internal/s
    //   106: dup
    //   107: aload #4
    //   109: invokestatic currentTimeMillis : ()J
    //   112: invokespecial <init> : (Lcom/comphenix/protocol/events/PacketContainer;J)V
    //   115: lload #11
    //   117: dup2_x1
    //   118: pop2
    //   119: invokevirtual p : (JLjava/lang/Object;)V
    //   122: aload #15
    //   124: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   127: lload #9
    //   129: invokevirtual p : (J)Z
    //   132: ifeq -> 387
    //   135: goto -> 142
    //   138: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   141: athrow
    //   142: aload #15
    //   144: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   147: checkcast java/lang/Iterable
    //   150: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
    //   153: astore #17
    //   155: iconst_0
    //   156: istore #18
    //   158: aload #17
    //   160: iconst_0
    //   161: invokeinterface get : (I)Ljava/lang/Object;
    //   166: checkcast me/rerere/matrix/internal/s
    //   169: invokevirtual b : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   172: invokevirtual getType : ()Lcom/comphenix/protocol/PacketType;
    //   175: lload #13
    //   177: dup2_x1
    //   178: pop2
    //   179: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   182: ifeq -> 385
    //   185: aload #17
    //   187: iconst_1
    //   188: invokeinterface get : (I)Ljava/lang/Object;
    //   193: checkcast me/rerere/matrix/internal/s
    //   196: invokevirtual b : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   199: invokevirtual getType : ()Lcom/comphenix/protocol/PacketType;
    //   202: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   205: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   208: ifeq -> 385
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   217: athrow
    //   218: aload #17
    //   220: iconst_2
    //   221: invokeinterface get : (I)Ljava/lang/Object;
    //   226: checkcast me/rerere/matrix/internal/s
    //   229: invokevirtual b : ()Lcom/comphenix/protocol/events/PacketContainer;
    //   232: invokevirtual getType : ()Lcom/comphenix/protocol/PacketType;
    //   235: lload #13
    //   237: dup2_x1
    //   238: pop2
    //   239: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   242: ifeq -> 385
    //   245: goto -> 252
    //   248: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   251: athrow
    //   252: aload #17
    //   254: iconst_2
    //   255: invokeinterface get : (I)Ljava/lang/Object;
    //   260: checkcast me/rerere/matrix/internal/s
    //   263: invokevirtual b : ()J
    //   266: aload #17
    //   268: iconst_1
    //   269: invokeinterface get : (I)Ljava/lang/Object;
    //   274: checkcast me/rerere/matrix/internal/s
    //   277: invokevirtual b : ()J
    //   280: invokestatic b : (JJ)J
    //   283: ldc2_w 30
    //   286: lcmp
    //   287: iflt -> 385
    //   290: goto -> 297
    //   293: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   296: athrow
    //   297: aload #17
    //   299: iconst_1
    //   300: invokeinterface get : (I)Ljava/lang/Object;
    //   305: checkcast me/rerere/matrix/internal/s
    //   308: invokevirtual b : ()J
    //   311: aload #17
    //   313: iconst_0
    //   314: invokeinterface get : (I)Ljava/lang/Object;
    //   319: checkcast me/rerere/matrix/internal/s
    //   322: invokevirtual b : ()J
    //   325: invokestatic b : (JJ)J
    //   328: ldc2_w 3
    //   331: lcmp
    //   332: ifgt -> 385
    //   335: goto -> 342
    //   338: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   341: athrow
    //   342: aload_0
    //   343: lload #7
    //   345: sipush #27628
    //   348: ldc2_w 2717591030085117170
    //   351: lload_2
    //   352: lxor
    //   353: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   358: sipush #7766
    //   361: ldc2_w 1592041695995629920
    //   364: lload_2
    //   365: lxor
    //   366: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   371: aload_0
    //   372: invokespecial t : ()I
    //   375: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   378: goto -> 385
    //   381: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   384: athrow
    //   385: nop
    //   386: nop
    //   387: nop
    //   388: aload_0
    //   389: getfield x : Lme/rerere/matrix/internal/i;
    //   392: astore #15
    //   394: iconst_0
    //   395: istore #16
    //   397: aload #4
    //   399: astore #17
    //   401: iconst_0
    //   402: istore #18
    //   404: lload #13
    //   406: aload_1
    //   407: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   410: ifne -> 486
    //   413: aload_1
    //   414: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   417: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   420: ifne -> 486
    //   423: goto -> 430
    //   426: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   429: athrow
    //   430: aload_1
    //   431: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   434: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   437: ifeq -> 469
    //   440: goto -> 447
    //   443: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   446: athrow
    //   447: aload #17
    //   449: invokevirtual getPlayerDigTypes : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   452: iconst_0
    //   453: invokevirtual read : (I)Ljava/lang/Object;
    //   456: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType.RELEASE_USE_ITEM : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerDigType;
    //   459: if_acmpeq -> 486
    //   462: goto -> 469
    //   465: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   468: athrow
    //   469: aload_1
    //   470: getstatic com/comphenix/protocol/PacketType$Play$Client.ARM_ANIMATION : Lcom/comphenix/protocol/PacketType;
    //   473: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   476: ifeq -> 494
    //   479: goto -> 486
    //   482: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   485: athrow
    //   486: iconst_1
    //   487: goto -> 495
    //   490: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   493: athrow
    //   494: iconst_0
    //   495: nop
    //   496: ifeq -> 1051
    //   499: aload #15
    //   501: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   504: new me/rerere/matrix/internal/s
    //   507: dup
    //   508: aload #4
    //   510: invokestatic currentTimeMillis : ()J
    //   513: invokespecial <init> : (Lcom/comphenix/protocol/events/PacketContainer;J)V
    //   516: lload #11
    //   518: dup2_x1
    //   519: pop2
    //   520: invokevirtual p : (JLjava/lang/Object;)V
    //   523: aload #15
    //   525: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   528: lload #9
    //   530: invokevirtual p : (J)Z
    //   533: ifeq -> 1051
    //   536: goto -> 543
    //   539: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   542: athrow
    //   543: aload #15
    //   545: invokevirtual b : ()Lme/rerere/matrix/internal/sb;
    //   548: checkcast java/lang/Iterable
    //   551: invokestatic toList : (Ljava/lang/Iterable;)Ljava/util/List;
    //   554: astore #17
    //   556: iconst_0
    //   557: istore #18
    //   559: aload_0
    //   560: invokespecial p : ()Z
    //   563: ifeq -> 743
    //   566: aload #17
    //   568: iconst_0
    //   569: invokeinterface get : (I)Ljava/lang/Object;
    //   574: checkcast me/rerere/matrix/internal/s
    //   577: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   580: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   583: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   586: ifeq -> 743
    //   589: goto -> 596
    //   592: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   595: athrow
    //   596: aload #17
    //   598: iconst_1
    //   599: invokeinterface get : (I)Ljava/lang/Object;
    //   604: checkcast me/rerere/matrix/internal/s
    //   607: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   610: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   613: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   616: ifeq -> 743
    //   619: goto -> 626
    //   622: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   625: athrow
    //   626: aload #17
    //   628: iconst_1
    //   629: invokeinterface get : (I)Ljava/lang/Object;
    //   634: checkcast me/rerere/matrix/internal/s
    //   637: invokevirtual b : ()J
    //   640: aload #17
    //   642: iconst_0
    //   643: invokeinterface get : (I)Ljava/lang/Object;
    //   648: checkcast me/rerere/matrix/internal/s
    //   651: invokevirtual b : ()J
    //   654: invokestatic b : (JJ)J
    //   657: lstore #19
    //   659: ldc2_w 40
    //   662: lload #19
    //   664: lcmp
    //   665: ifgt -> 696
    //   668: lload #19
    //   670: ldc2_w 61
    //   673: lcmp
    //   674: ifge -> 692
    //   677: goto -> 684
    //   680: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   683: athrow
    //   684: iconst_1
    //   685: goto -> 697
    //   688: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   691: athrow
    //   692: iconst_0
    //   693: goto -> 697
    //   696: iconst_0
    //   697: ifeq -> 743
    //   700: aload_0
    //   701: lload #7
    //   703: sipush #14395
    //   706: ldc2_w 3884644311060494114
    //   709: lload_2
    //   710: lxor
    //   711: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   716: sipush #10414
    //   719: ldc2_w 661263152675530664
    //   722: lload_2
    //   723: lxor
    //   724: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   729: aload_0
    //   730: invokespecial m : ()I
    //   733: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   736: goto -> 743
    //   739: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   742: athrow
    //   743: aload_0
    //   744: invokespecial b : ()Z
    //   747: ifeq -> 1049
    //   750: aload #17
    //   752: iconst_0
    //   753: invokeinterface get : (I)Ljava/lang/Object;
    //   758: checkcast me/rerere/matrix/internal/s
    //   761: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   764: lload #13
    //   766: dup2_x1
    //   767: pop2
    //   768: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   771: ifeq -> 1049
    //   774: goto -> 781
    //   777: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   780: athrow
    //   781: aload #17
    //   783: iconst_1
    //   784: invokeinterface get : (I)Ljava/lang/Object;
    //   789: checkcast me/rerere/matrix/internal/s
    //   792: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   795: getstatic com/comphenix/protocol/PacketType$Play$Client.BLOCK_DIG : Lcom/comphenix/protocol/PacketType;
    //   798: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   801: ifeq -> 1049
    //   804: goto -> 811
    //   807: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   810: athrow
    //   811: aload #17
    //   813: iconst_2
    //   814: invokeinterface get : (I)Ljava/lang/Object;
    //   819: checkcast me/rerere/matrix/internal/s
    //   822: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   825: getstatic com/comphenix/protocol/PacketType$Play$Client.ARM_ANIMATION : Lcom/comphenix/protocol/PacketType;
    //   828: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   831: ifeq -> 1049
    //   834: goto -> 841
    //   837: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   840: athrow
    //   841: aload #17
    //   843: iconst_3
    //   844: invokeinterface get : (I)Ljava/lang/Object;
    //   849: checkcast me/rerere/matrix/internal/s
    //   852: invokevirtual b : ()Lcom/comphenix/protocol/PacketType;
    //   855: getstatic com/comphenix/protocol/PacketType$Play$Client.USE_ENTITY : Lcom/comphenix/protocol/PacketType;
    //   858: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   861: ifeq -> 1049
    //   864: goto -> 871
    //   867: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   870: athrow
    //   871: aload #17
    //   873: iconst_3
    //   874: invokeinterface get : (I)Ljava/lang/Object;
    //   879: checkcast me/rerere/matrix/internal/s
    //   882: invokevirtual b : ()J
    //   885: aload #17
    //   887: iconst_2
    //   888: invokeinterface get : (I)Ljava/lang/Object;
    //   893: checkcast me/rerere/matrix/internal/s
    //   896: invokevirtual b : ()J
    //   899: invokestatic b : (JJ)J
    //   902: ldc2_w 5
    //   905: lcmp
    //   906: ifgt -> 1049
    //   909: goto -> 916
    //   912: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   915: athrow
    //   916: aload #17
    //   918: iconst_2
    //   919: invokeinterface get : (I)Ljava/lang/Object;
    //   924: checkcast me/rerere/matrix/internal/s
    //   927: invokevirtual b : ()J
    //   930: aload #17
    //   932: iconst_1
    //   933: invokeinterface get : (I)Ljava/lang/Object;
    //   938: checkcast me/rerere/matrix/internal/s
    //   941: invokevirtual b : ()J
    //   944: invokestatic b : (JJ)J
    //   947: ldc2_w 5
    //   950: lcmp
    //   951: ifgt -> 1049
    //   954: goto -> 961
    //   957: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   960: athrow
    //   961: aload #17
    //   963: iconst_1
    //   964: invokeinterface get : (I)Ljava/lang/Object;
    //   969: checkcast me/rerere/matrix/internal/s
    //   972: invokevirtual b : ()J
    //   975: aload #17
    //   977: iconst_0
    //   978: invokeinterface get : (I)Ljava/lang/Object;
    //   983: checkcast me/rerere/matrix/internal/s
    //   986: invokevirtual b : ()J
    //   989: invokestatic b : (JJ)J
    //   992: ldc2_w 40
    //   995: lcmp
    //   996: ifle -> 1049
    //   999: goto -> 1006
    //   1002: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1005: athrow
    //   1006: aload_0
    //   1007: lload #7
    //   1009: sipush #7338
    //   1012: ldc2_w 7489683332432925592
    //   1015: lload_2
    //   1016: lxor
    //   1017: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1022: sipush #4443
    //   1025: ldc2_w 4715650581119540824
    //   1028: lload_2
    //   1029: lxor
    //   1030: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1035: aload_0
    //   1036: invokespecial p : ()I
    //   1039: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1042: goto -> 1049
    //   1045: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1048: athrow
    //   1049: nop
    //   1050: nop
    //   1051: nop
    //   1052: aload_1
    //   1053: getstatic com/comphenix/protocol/PacketType$Play$Client.ENTITY_ACTION : Lcom/comphenix/protocol/PacketType;
    //   1056: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1059: ifeq -> 1098
    //   1062: aload #4
    //   1064: invokevirtual getPlayerActions : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1067: iconst_0
    //   1068: invokevirtual read : (I)Ljava/lang/Object;
    //   1071: checkcast com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction
    //   1074: astore #15
    //   1076: aload #15
    //   1078: getstatic com/comphenix/protocol/wrappers/EnumWrappers$PlayerAction.START_SPRINTING : Lcom/comphenix/protocol/wrappers/EnumWrappers$PlayerAction;
    //   1081: if_acmpne -> 1098
    //   1084: aload_0
    //   1085: invokestatic b : ()J
    //   1088: putfield n : J
    //   1091: goto -> 1098
    //   1094: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1097: athrow
    //   1098: lload #5
    //   1100: aload #4
    //   1102: invokestatic b : (JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   1105: ifeq -> 1225
    //   1108: aload_0
    //   1109: aload_0
    //   1110: getfield n : J
    //   1113: invokestatic b : (J)J
    //   1116: ldc2_w 5
    //   1119: lcmp
    //   1120: ifgt -> 1147
    //   1123: goto -> 1130
    //   1126: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1129: athrow
    //   1130: aload_0
    //   1131: getfield u : I
    //   1134: iconst_1
    //   1135: iadd
    //   1136: iconst_5
    //   1137: invokestatic coerceAtMost : (II)I
    //   1140: goto -> 1157
    //   1143: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1146: athrow
    //   1147: aload_0
    //   1148: getfield u : I
    //   1151: iconst_1
    //   1152: isub
    //   1153: iconst_0
    //   1154: invokestatic coerceAtLeast : (II)I
    //   1157: putfield u : I
    //   1160: aload_0
    //   1161: getfield u : I
    //   1164: iconst_3
    //   1165: if_icmplt -> 1225
    //   1168: aload_0
    //   1169: invokespecial j : ()Z
    //   1172: ifeq -> 1225
    //   1175: goto -> 1182
    //   1178: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1181: athrow
    //   1182: aload_0
    //   1183: lload #7
    //   1185: sipush #28907
    //   1188: ldc2_w 829459783989723100
    //   1191: lload_2
    //   1192: lxor
    //   1193: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1198: sipush #26665
    //   1201: ldc2_w 468544884485187366
    //   1204: lload_2
    //   1205: lxor
    //   1206: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   1211: aload_0
    //   1212: invokespecial h : ()I
    //   1215: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   1218: goto -> 1225
    //   1221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1224: athrow
    //   1225: lload #13
    //   1227: aload_1
    //   1228: invokestatic j : (JLcom/comphenix/protocol/PacketType;)Z
    //   1231: ifeq -> 1650
    //   1234: aload_1
    //   1235: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION : Lcom/comphenix/protocol/PacketType;
    //   1238: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1241: ifne -> 1268
    //   1244: goto -> 1251
    //   1247: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1250: athrow
    //   1251: aload_1
    //   1252: getstatic com/comphenix/protocol/PacketType$Play$Client.POSITION_LOOK : Lcom/comphenix/protocol/PacketType;
    //   1255: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1258: ifeq -> 1276
    //   1261: goto -> 1268
    //   1264: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1267: athrow
    //   1268: iconst_1
    //   1269: goto -> 1277
    //   1272: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1275: athrow
    //   1276: iconst_0
    //   1277: istore #15
    //   1279: iload #15
    //   1281: ifeq -> 1303
    //   1284: aload #4
    //   1286: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1289: iconst_0
    //   1290: invokevirtual read : (I)Ljava/lang/Object;
    //   1293: checkcast java/lang/Double
    //   1296: goto -> 1310
    //   1299: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1302: athrow
    //   1303: aload_0
    //   1304: getfield g : D
    //   1307: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1310: astore #16
    //   1312: iload #15
    //   1314: ifeq -> 1336
    //   1317: aload #4
    //   1319: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1322: iconst_1
    //   1323: invokevirtual read : (I)Ljava/lang/Object;
    //   1326: checkcast java/lang/Double
    //   1329: goto -> 1343
    //   1332: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1335: athrow
    //   1336: aload_0
    //   1337: getfield l : D
    //   1340: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1343: astore #17
    //   1345: iload #15
    //   1347: ifeq -> 1369
    //   1350: aload #4
    //   1352: invokevirtual getDoubles : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1355: iconst_2
    //   1356: invokevirtual read : (I)Ljava/lang/Object;
    //   1359: checkcast java/lang/Double
    //   1362: goto -> 1376
    //   1365: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1368: athrow
    //   1369: aload_0
    //   1370: getfield w : D
    //   1373: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1376: astore #18
    //   1378: aload #16
    //   1380: invokevirtual doubleValue : ()D
    //   1383: aload_0
    //   1384: getfield g : D
    //   1387: dsub
    //   1388: dstore #19
    //   1390: aload #17
    //   1392: invokevirtual doubleValue : ()D
    //   1395: aload_0
    //   1396: getfield l : D
    //   1399: dsub
    //   1400: dstore #21
    //   1402: aload #18
    //   1404: invokevirtual doubleValue : ()D
    //   1407: aload_0
    //   1408: getfield w : D
    //   1411: dsub
    //   1412: dstore #23
    //   1414: aload_0
    //   1415: getfield s : I
    //   1418: ifle -> 1584
    //   1421: dload #19
    //   1423: dload #19
    //   1425: dmul
    //   1426: dload #21
    //   1428: dload #21
    //   1430: dmul
    //   1431: dadd
    //   1432: dload #23
    //   1434: dload #23
    //   1436: dmul
    //   1437: dadd
    //   1438: invokestatic sqrt : (D)D
    //   1441: dstore #25
    //   1443: aload_0
    //   1444: getfield v : D
    //   1447: aload_0
    //   1448: getfield v : D
    //   1451: dmul
    //   1452: aload_0
    //   1453: getfield i : D
    //   1456: aload_0
    //   1457: getfield i : D
    //   1460: dmul
    //   1461: dadd
    //   1462: aload_0
    //   1463: getfield b : D
    //   1466: aload_0
    //   1467: getfield b : D
    //   1470: dmul
    //   1471: dadd
    //   1472: invokestatic sqrt : (D)D
    //   1475: dstore #27
    //   1477: aload_0
    //   1478: getfield s : I
    //   1481: iconst_3
    //   1482: if_icmpne -> 1584
    //   1485: dload #25
    //   1487: dload #27
    //   1489: dsub
    //   1490: invokestatic abs : (D)D
    //   1493: ldc2_w 0.001
    //   1496: dcmpg
    //   1497: ifge -> 1584
    //   1500: goto -> 1507
    //   1503: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1506: athrow
    //   1507: ldc2_w 0.28
    //   1510: dload #25
    //   1512: dcmpg
    //   1513: ifgt -> 1551
    //   1516: goto -> 1523
    //   1519: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1522: athrow
    //   1523: dload #25
    //   1525: ldc2_w 0.281
    //   1528: dcmpg
    //   1529: ifgt -> 1547
    //   1532: goto -> 1539
    //   1535: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1538: athrow
    //   1539: iconst_1
    //   1540: goto -> 1552
    //   1543: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1546: athrow
    //   1547: iconst_0
    //   1548: goto -> 1552
    //   1551: iconst_0
    //   1552: ifeq -> 1584
    //   1555: aload_0
    //   1556: getfield o : I
    //   1559: ifle -> 1584
    //   1562: goto -> 1569
    //   1565: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1568: athrow
    //   1569: aload_0
    //   1570: aload_0
    //   1571: getfield o : I
    //   1574: putfield f : I
    //   1577: goto -> 1584
    //   1580: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1583: athrow
    //   1584: aload_0
    //   1585: aload #16
    //   1587: invokevirtual doubleValue : ()D
    //   1590: putfield g : D
    //   1593: aload_0
    //   1594: aload #17
    //   1596: invokevirtual doubleValue : ()D
    //   1599: putfield l : D
    //   1602: aload_0
    //   1603: aload #18
    //   1605: invokevirtual doubleValue : ()D
    //   1608: putfield w : D
    //   1611: aload_0
    //   1612: dload #19
    //   1614: putfield v : D
    //   1617: aload_0
    //   1618: dload #21
    //   1620: putfield i : D
    //   1623: aload_0
    //   1624: dload #23
    //   1626: putfield b : D
    //   1629: aload_0
    //   1630: getfield s : I
    //   1633: ifle -> 1650
    //   1636: aload_0
    //   1637: getfield s : I
    //   1640: istore #25
    //   1642: aload_0
    //   1643: iload #25
    //   1645: iconst_m1
    //   1646: iadd
    //   1647: putfield s : I
    //   1650: lload #5
    //   1652: aload #4
    //   1654: invokestatic b : (JLcom/comphenix/protocol/events/PacketContainer;)Z
    //   1657: ifeq -> 1691
    //   1660: aload_0
    //   1661: iconst_3
    //   1662: putfield s : I
    //   1665: aload_0
    //   1666: aload #4
    //   1668: invokevirtual getIntegers : ()Lcom/comphenix/protocol/reflect/StructureModifier;
    //   1671: iconst_0
    //   1672: invokevirtual read : (I)Ljava/lang/Object;
    //   1675: checkcast java/lang/Number
    //   1678: invokevirtual intValue : ()I
    //   1681: putfield o : I
    //   1684: goto -> 1691
    //   1687: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   1690: athrow
    //   1691: iconst_0
    //   1692: ireturn
    // Exception table:
    //   from	to	target	type
    //   60	79	82	java/lang/RuntimeException
    //   69	90	90	java/lang/RuntimeException
    //   95	135	138	java/lang/RuntimeException
    //   158	211	214	java/lang/RuntimeException
    //   185	245	248	java/lang/RuntimeException
    //   218	290	293	java/lang/RuntimeException
    //   252	335	338	java/lang/RuntimeException
    //   297	378	381	java/lang/RuntimeException
    //   404	423	426	java/lang/RuntimeException
    //   413	440	443	java/lang/RuntimeException
    //   430	462	465	java/lang/RuntimeException
    //   447	479	482	java/lang/RuntimeException
    //   469	490	490	java/lang/RuntimeException
    //   495	536	539	java/lang/RuntimeException
    //   559	589	592	java/lang/RuntimeException
    //   566	619	622	java/lang/RuntimeException
    //   659	677	680	java/lang/RuntimeException
    //   668	688	688	java/lang/RuntimeException
    //   697	736	739	java/lang/RuntimeException
    //   743	774	777	java/lang/RuntimeException
    //   750	804	807	java/lang/RuntimeException
    //   781	834	837	java/lang/RuntimeException
    //   811	864	867	java/lang/RuntimeException
    //   841	909	912	java/lang/RuntimeException
    //   871	954	957	java/lang/RuntimeException
    //   916	999	1002	java/lang/RuntimeException
    //   961	1042	1045	java/lang/RuntimeException
    //   1076	1091	1094	java/lang/RuntimeException
    //   1098	1123	1126	java/lang/RuntimeException
    //   1108	1143	1143	java/lang/RuntimeException
    //   1157	1175	1178	java/lang/RuntimeException
    //   1168	1218	1221	java/lang/RuntimeException
    //   1225	1244	1247	java/lang/RuntimeException
    //   1234	1261	1264	java/lang/RuntimeException
    //   1251	1272	1272	java/lang/RuntimeException
    //   1279	1299	1299	java/lang/RuntimeException
    //   1312	1332	1332	java/lang/RuntimeException
    //   1345	1365	1365	java/lang/RuntimeException
    //   1477	1500	1503	java/lang/RuntimeException
    //   1485	1516	1519	java/lang/RuntimeException
    //   1507	1532	1535	java/lang/RuntimeException
    //   1523	1543	1543	java/lang/RuntimeException
    //   1552	1562	1565	java/lang/RuntimeException
    //   1555	1577	1580	java/lang/RuntimeException
    //   1650	1684	1687	java/lang/RuntimeException
  }
  
  public void b(int paramInt1, int paramInt2) {
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
    //   14: lstore_3
    //   15: lload_3
    //   16: dup2
    //   17: ldc2_w 78396785392265
    //   20: lxor
    //   21: lstore #5
    //   23: dup2
    //   24: ldc2_w 119942378139598
    //   27: lxor
    //   28: dup2
    //   29: bipush #56
    //   31: lushr
    //   32: l2i
    //   33: istore #7
    //   35: dup2
    //   36: bipush #8
    //   38: lshl
    //   39: bipush #8
    //   41: lushr
    //   42: lstore #8
    //   44: pop2
    //   45: dup2
    //   46: ldc2_w 13241938185666
    //   49: lxor
    //   50: lstore #10
    //   52: pop2
    //   53: aload_0
    //   54: invokespecial h : ()Z
    //   57: ifeq -> 291
    //   60: aload_0
    //   61: getfield f : I
    //   64: ifle -> 291
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   73: athrow
    //   74: aload_0
    //   75: iload #7
    //   77: i2b
    //   78: lload #8
    //   80: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   83: invokeinterface getWorld : ()Lorg/bukkit/World;
    //   88: invokeinterface getEntities : ()Ljava/util/List;
    //   93: checkcast java/lang/Iterable
    //   96: astore #13
    //   98: iconst_0
    //   99: istore #14
    //   101: aload #13
    //   103: invokeinterface iterator : ()Ljava/util/Iterator;
    //   108: astore #15
    //   110: aload #15
    //   112: invokeinterface hasNext : ()Z
    //   117: ifeq -> 170
    //   120: aload #15
    //   122: invokeinterface next : ()Ljava/lang/Object;
    //   127: astore #16
    //   129: aload #16
    //   131: checkcast org/bukkit/entity/Entity
    //   134: astore #17
    //   136: iconst_0
    //   137: istore #18
    //   139: aload #17
    //   141: invokeinterface getEntityId : ()I
    //   146: aload_0
    //   147: getfield f : I
    //   150: if_icmpne -> 161
    //   153: iconst_1
    //   154: goto -> 162
    //   157: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   160: athrow
    //   161: iconst_0
    //   162: ifeq -> 110
    //   165: aload #16
    //   167: goto -> 171
    //   170: aconst_null
    //   171: checkcast org/bukkit/entity/Entity
    //   174: astore #12
    //   176: aload #12
    //   178: ifnull -> 286
    //   181: aload #12
    //   183: invokeinterface getType : ()Lorg/bukkit/entity/EntityType;
    //   188: getstatic org/bukkit/entity/EntityType.PLAYER : Lorg/bukkit/entity/EntityType;
    //   191: if_acmpne -> 286
    //   194: goto -> 201
    //   197: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   200: athrow
    //   201: aload_0
    //   202: iload #7
    //   204: i2b
    //   205: lload #8
    //   207: invokevirtual b : (BJ)Lorg/bukkit/entity/Player;
    //   210: invokeinterface isFlying : ()Z
    //   215: ifne -> 286
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: getstatic me/rerere/matrix/internal/rl.i : Lme/rerere/matrix/internal/rl;
    //   228: lload #10
    //   230: invokevirtual b : (J)Z
    //   233: ifeq -> 286
    //   236: goto -> 243
    //   239: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   242: athrow
    //   243: aload_0
    //   244: lload #5
    //   246: sipush #1884
    //   249: ldc2_w 1958257130160681491
    //   252: lload_3
    //   253: lxor
    //   254: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   259: sipush #8162
    //   262: ldc2_w 2350784172269693578
    //   265: lload_3
    //   266: lxor
    //   267: <illegal opcode> b : (IJ)Ljava/lang/String;
    //   272: aload_0
    //   273: invokespecial i : ()I
    //   276: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   279: goto -> 286
    //   282: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   285: athrow
    //   286: aload_0
    //   287: iconst_0
    //   288: putfield f : I
    //   291: return
    // Exception table:
    //   from	to	target	type
    //   53	67	70	java/lang/RuntimeException
    //   139	157	157	java/lang/RuntimeException
    //   176	194	197	java/lang/RuntimeException
    //   181	218	221	java/lang/RuntimeException
    //   201	236	239	java/lang/RuntimeException
    //   225	279	282	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int j;
    char[] arrayOfChar = new char[j = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < j; b2++) {
      int k;
      if ((k = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)k;
      } else if (k < 224) {
        char c = (char)((char)(k & 0x1F) << 6);
        k = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(k & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < j - 2) {
        char c = (char)((char)(k & 0xF) << 12);
        k = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(k & 0x3F) << 6);
        k = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(k & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String c(int paramInt, long paramLong) {
    int j = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1C2C;
    if (A[j] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])F.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          arrayOfObject[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
          arrayOfObject[1] = SecretKeyFactory.getInstance("DES");
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          F.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        throw new RuntimeException("me/rerere/matrix/internal/fh", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = p[j].getBytes("ISO-8859-1");
      A[j] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return A[j];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int j = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(j, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
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
    //   66: ldc_w 'me/rerere/matrix/internal/fh'
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
    long l = c ^ 0x59990DFE3864L;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\fh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
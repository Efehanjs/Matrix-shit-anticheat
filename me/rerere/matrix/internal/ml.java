package me.rerere.matrix.internal;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class ml extends zk {
  private static boolean k;
  
  private static int v;
  
  @NotNull
  private final List b = new CopyOnWriteArrayList();
  
  private long i;
  
  private static final long a = o3.a(-4734446539792497631L, -7630428056126123001L, MethodHandles.lookup().lookupClass()).a(172705814893120L);
  
  private static final String[] c;
  
  private static final String[] d;
  
  private static final Map e = new HashMap<>(13);
  
  public void m() {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ml.a : J
    //   3: ldc2_w 4433114665688
    //   6: lxor
    //   7: lstore_1
    //   8: aload_0
    //   9: invokevirtual b : ()Lme/rerere/matrix/thirdparty/org/simpleyaml/configuration/ConfigurationSection;
    //   12: sipush #3050
    //   15: ldc2_w 6391192497989447944
    //   18: lload_1
    //   19: lxor
    //   20: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   25: iconst_1
    //   26: invokeinterface getInt : (Ljava/lang/String;I)I
    //   31: putstatic me/rerere/matrix/internal/ml.v : I
    //   34: getstatic me/rerere/matrix/internal/ml.v : I
    //   37: ifle -> 48
    //   40: iconst_1
    //   41: goto -> 49
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: iconst_0
    //   49: putstatic me/rerere/matrix/internal/ml.k : Z
    //   52: return
    // Exception table:
    //   from	to	target	type
    //   8	44	44	java/lang/RuntimeException
  }
  
  public void b(@NotNull PlayerRespawnEvent paramPlayerRespawnEvent) {
    this.b.clear();
  }
  
  public ml(yl paramyl) {
    super(paramyl);
    b(yk.l);
  }
  
  public boolean b(@NotNull PacketType paramPacketType, @NotNull PacketContainer paramPacketContainer, @NotNull PacketEvent paramPacketEvent) {
    if (paramPacketType == PacketType.Play.Server.ENTITY_VELOCITY) {
      int i = ((Integer)paramPacketContainer.getIntegers().read(0)).intValue();
      Player player = paramPacketEvent.getPlayer();
      try {
        if (player != null && i == player.getEntityId()) {
          double d = ((Integer)paramPacketContainer.getIntegers().read(2)).intValue() / 8000.0D;
          try {
            if (d > 0.1D)
              try {
                if (k)
                  try {
                    if (this.b.size() < 10)
                      this.b.add(new qj(d, System.currentTimeMillis())); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  }  
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  public void b(@NotNull PlayerMoveEvent paramPlayerMoveEvent, @NotNull Location paramLocation1, @NotNull Location paramLocation2) {
    // Byte code:
    //   0: getstatic me/rerere/matrix/internal/ml.a : J
    //   3: ldc2_w 138044535846534
    //   6: lxor
    //   7: lstore #4
    //   9: lload #4
    //   11: dup2
    //   12: ldc2_w 81743471904420
    //   15: lxor
    //   16: lstore #6
    //   18: dup2
    //   19: ldc2_w 52505769969781
    //   22: lxor
    //   23: lstore #8
    //   25: pop2
    //   26: aload_0
    //   27: getfield b : Ljava/util/List;
    //   30: invokeinterface size : ()I
    //   35: ifle -> 245
    //   38: aload_3
    //   39: invokevirtual getY : ()D
    //   42: aload_2
    //   43: invokevirtual getY : ()D
    //   46: dsub
    //   47: dstore #10
    //   49: aload_0
    //   50: getfield b : Ljava/util/List;
    //   53: invokeinterface iterator : ()Ljava/util/Iterator;
    //   58: astore #12
    //   60: aload #12
    //   62: invokeinterface hasNext : ()Z
    //   67: ifeq -> 228
    //   70: aload #12
    //   72: invokeinterface next : ()Ljava/lang/Object;
    //   77: checkcast me/rerere/matrix/internal/qj
    //   80: astore #13
    //   82: invokestatic currentTimeMillis : ()J
    //   85: aload #13
    //   87: invokestatic b : (Lme/rerere/matrix/internal/qj;)J
    //   90: lsub
    //   91: ldc2_w 1000
    //   94: lcmp
    //   95: ifle -> 225
    //   98: aload_0
    //   99: aload_2
    //   100: aload_1
    //   101: invokevirtual getPlayer : ()Lorg/bukkit/entity/Player;
    //   104: lload #6
    //   106: invokespecial b : (Lorg/bukkit/Location;Lorg/bukkit/entity/Player;J)Z
    //   109: ifeq -> 213
    //   112: goto -> 119
    //   115: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   118: athrow
    //   119: invokestatic currentTimeMillis : ()J
    //   122: aload_0
    //   123: getfield i : J
    //   126: lsub
    //   127: ldc2_w 2000
    //   130: lcmp
    //   131: ifge -> 206
    //   134: goto -> 141
    //   137: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   140: athrow
    //   141: aload_0
    //   142: lload #8
    //   144: sipush #26709
    //   147: ldc2_w 3685420184553764587
    //   150: lload #4
    //   152: lxor
    //   153: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   158: new java/lang/StringBuilder
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: sipush #21530
    //   168: ldc2_w 3082528138428975783
    //   171: lload #4
    //   173: lxor
    //   174: <illegal opcode> z : (IJ)Ljava/lang/String;
    //   179: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: aload #13
    //   184: invokestatic b : (Lme/rerere/matrix/internal/qj;)D
    //   187: invokevirtual append : (D)Ljava/lang/StringBuilder;
    //   190: invokevirtual toString : ()Ljava/lang/String;
    //   193: getstatic me/rerere/matrix/internal/ml.v : I
    //   196: invokevirtual b : (JLjava/lang/String;Ljava/lang/String;I)V
    //   199: goto -> 206
    //   202: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   205: athrow
    //   206: aload_0
    //   207: invokestatic currentTimeMillis : ()J
    //   210: putfield i : J
    //   213: aload_0
    //   214: getfield b : Ljava/util/List;
    //   217: aload #13
    //   219: invokeinterface remove : (Ljava/lang/Object;)Z
    //   224: pop
    //   225: goto -> 60
    //   228: aload_0
    //   229: getfield b : Ljava/util/List;
    //   232: dload #10
    //   234: <illegal opcode> test : (D)Ljava/util/function/Predicate;
    //   239: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   244: pop
    //   245: return
    // Exception table:
    //   from	to	target	type
    //   82	112	115	java/lang/RuntimeException
    //   98	134	137	java/lang/RuntimeException
    //   119	199	202	java/lang/RuntimeException
  }
  
  static {
    long l = a ^ 0x6C366D23B806L;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    String str;
    int i = (str = "í\024ÿn |uqgåùó\031Ã\034àþ\034ß\025ÐFZa`tsí v^\026*ñ ÎûÚ_@\020?Ô½\023&ÕY'HøÝRÌ¦eKWÚX1\tå\\\025mÿ3\tuúE]úYVáÖÑ IÀòúä&Í§¢Ò¿:£#ôXÆ\020û£è0ù(ÀóP{¾O\030h]´").length();
    byte b2 = 40;
    byte b = -1;
    while (true);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
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
  
  private static String c(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x4523;
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
        throw new RuntimeException("me/rerere/matrix/internal/ml", exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      byte[] arrayOfByte2 = c[i].getBytes("ISO-8859-1");
      d[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return d[i];
  }
  
  private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = c(i, l);
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
    //   66: ldc_w 'me/rerere/matrix/internal/ml'
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


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\ml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
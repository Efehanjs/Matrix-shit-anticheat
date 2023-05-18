package me.rerere.matrix.internal;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.Nullable;
import me.rerere.matrix.thirdparty.org.objectweb.asm.ClassVisitor;
import me.rerere.matrix.thirdparty.org.objectweb.asm.MethodVisitor;

public final class bl extends ClassVisitor {
  private static final long a = o3.a(3979096653381735334L, 5236047494850982008L, MethodHandles.lookup().lookupClass()).a(20610284655951L);
  
  private static final String c;
  
  public bl(@Nullable ClassVisitor paramClassVisitor) {
    super(589824, paramClassVisitor);
  }
  
  @NotNull
  public MethodVisitor visitMethod(int paramInt, @NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull String[] paramArrayOfString) {
    long l = a ^ 0x3599C3F48C25L;
    int i = yl.r();
    MethodVisitor methodVisitor = super.visitMethod(paramInt, paramString1, paramString2, paramString3, paramArrayOfString);
    try {
      if (i != 0)
        try {
          if (Intrinsics.areEqual(paramString1, "a")) {
          
          } else {
            return methodVisitor;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (Intrinsics.areEqual(paramString1, "a"))
      methodVisitor = new bg(methodVisitor); 
    return methodVisitor;
  }
  
  static {
    long l = a ^ 0x77D97B49C9DCL;
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b = 1; b < 8; b++)
      (new byte[8])[b] = (byte)(int)(l << b * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance("DES/CBC/PKCS5Padding")).init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
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
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\internal\bl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
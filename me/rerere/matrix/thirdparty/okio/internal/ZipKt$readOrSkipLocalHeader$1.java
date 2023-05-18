package me.rerere.matrix.thirdparty.okio.internal;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.okio.BufferedSource;

public final class ZipKt$readOrSkipLocalHeader$1 extends Lambda implements Function2 {
  private static final long a = o3.a(6866149023712585280L, -6988757945132709998L, MethodHandles.lookup().lookupClass()).a(186521611745736L);
  
  public ZipKt$readOrSkipLocalHeader$1(BufferedSource paramBufferedSource, Ref.ObjectRef paramObjectRef1, Ref.ObjectRef paramObjectRef2, Ref.ObjectRef paramObjectRef3) {
    super(2);
  }
  
  public final void invoke(int paramInt, long paramLong) {
    long l = a ^ 0x50E56F382596L;
    int i = paramInt;
    try {
      if (i == 21589) {
        try {
          if (paramLong < 1L)
            throw new IOException("bad zip: extended timestamp extra too short"); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        int j = this.$this_readOrSkipLocalHeader.readByte() & 0xFF;
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        boolean bool1 = ((j & 0x1) == 1) ? true : false;
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        boolean bool2 = ((j & 0x2) == 2) ? true : false;
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        boolean bool3 = ((j & 0x4) == 4) ? true : false;
        BufferedSource bufferedSource1 = this.$this_readOrSkipLocalHeader;
        boolean bool4 = false;
        boolean bool5 = false;
        BufferedSource bufferedSource2 = bufferedSource1;
        boolean bool6 = false;
        long l2 = 1L;
        if (bool1)
          l2 += 4L; 
        if (bool2)
          l2 += 4L; 
        if (bool3)
          l2 += 4L; 
        long l1 = l2;
        try {
          if (paramLong < l1)
            throw new IOException("bad zip: extended timestamp extra too short"); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (bool1)
            this.$lastModifiedAtMillis.element = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000L); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (bool2)
            this.$lastAccessedAtMillis.element = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000L); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          if (bool3)
            this.$createdAtMillis.element = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000L); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ZipKt$readOrSkipLocalHeader$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
package me.rerere.matrix.thirdparty.okio.internal;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.Unit;
import me.rerere.matrix.thirdparty.kotlin.jvm.functions.Function2;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Lambda;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Ref;
import me.rerere.matrix.thirdparty.okio.BufferedSource;

public final class ZipKt$readEntry$1 extends Lambda implements Function2 {
  private static final long a = o3.a(5922799893566412913L, -7556860068790172581L, MethodHandles.lookup().lookupClass()).a(30722513798462L);
  
  public final void invoke(int paramInt, long paramLong) {
    long l = a ^ 0x2877C9FAC874L;
    int i = paramInt;
    try {
      if (i == 1) {
        try {
          if (this.$hasZip64Extra.element)
            throw new IOException("bad zip: zip64 extra repeated"); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          this.$hasZip64Extra.element = true;
          if (paramLong < this.$requiredZip64ExtraSize)
            throw new IOException("bad zip: zip64 extra too short"); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          this.$size.element = (this.$size.element == 4294967295L) ? this.$this_readEntry.readLongLe() : this.$size.element;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        try {
          this.$compressedSize.element = (this.$compressedSize.element == 4294967295L) ? this.$this_readEntry.readLongLe() : 0L;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.$offset.element = (this.$offset.element == 4294967295L) ? this.$this_readEntry.readLongLe() : 0L;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public ZipKt$readEntry$1(Ref.BooleanRef paramBooleanRef, long paramLong, Ref.LongRef paramLongRef1, BufferedSource paramBufferedSource, Ref.LongRef paramLongRef2, Ref.LongRef paramLongRef3) {
    super(2);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okio\internal\ZipKt$readEntry$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
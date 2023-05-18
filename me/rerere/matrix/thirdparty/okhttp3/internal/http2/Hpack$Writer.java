package me.rerere.matrix.thirdparty.okhttp3.internal.http2;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import me.rerere.matrix.internal.o3;
import me.rerere.matrix.thirdparty.kotlin.collections.ArraysKt;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmField;
import me.rerere.matrix.thirdparty.kotlin.jvm.JvmOverloads;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.DefaultConstructorMarker;
import me.rerere.matrix.thirdparty.kotlin.jvm.internal.Intrinsics;
import me.rerere.matrix.thirdparty.okio.Buffer;
import me.rerere.matrix.thirdparty.okio.BufferedSink;
import me.rerere.matrix.thirdparty.okio.ByteString;
import me.rerere.matrix.thirdparty.org.jetbrains.annotations.NotNull;

public final class Hpack$Writer {
  private boolean emitDynamicTableSizeUpdate;
  
  @JvmField
  public int headerCount;
  
  @JvmField
  @NotNull
  public Header[] dynamicTable;
  
  @JvmField
  public int maxDynamicTableByteCount;
  
  @NotNull
  private final Buffer out;
  
  private int nextHeaderIndex;
  
  private final boolean useCompression;
  
  @JvmField
  public int headerTableSizeSetting;
  
  @JvmField
  public int dynamicTableByteCount;
  
  private int smallestHeaderTableSizeSetting;
  
  private static final long a = o3.a(-4959299914188866120L, -4414200230400972596L, MethodHandles.lookup().lookupClass()).a(225597781179896L);
  
  public final void writeInt(int paramInt1, int paramInt2, int paramInt3) {
    int i = paramInt1;
    try {
      if (i < paramInt2) {
        this.out.writeByte(paramInt3 | i);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.out.writeByte(paramInt3 | paramInt2);
    for (i -= paramInt2; i >= 128; i >>>= 7) {
      int j = i & 0x7F;
      this.out.writeByte(j | 0x80);
    } 
    this.out.writeByte(i);
  }
  
  public final void writeHeaders(@NotNull List<Header> paramList) throws IOException {
    long l = a ^ 0xF8E43F7CB9DL;
    try {
      Intrinsics.checkNotNullParameter(paramList, "headerBlock");
      if (this.emitDynamicTableSizeUpdate) {
        try {
          if (this.smallestHeaderTableSizeSetting < this.maxDynamicTableByteCount)
            writeInt(this.smallestHeaderTableSizeSetting, 31, 32); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        this.emitDynamicTableSizeUpdate = false;
        this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
        writeInt(this.maxDynamicTableByteCount, 31, 32);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte b = 0;
    int i = paramList.size();
    while (b < i) {
      byte b1 = b;
      b++;
      Header header = paramList.get(b1);
      ByteString byteString1 = header.name.toAsciiLowercase();
      ByteString byteString2 = header.value;
      int j = -1;
      int k = -1;
      Integer integer = (Integer)Hpack.INSTANCE.getNAME_TO_FIRST_INDEX().get(byteString1);
      if (integer != null) {
        k = integer.intValue() + 1;
        try {
          if (2 <= k) {
            try {
            
            } catch (IOException iOException) {
              throw a(null);
            } 
          } else {
          
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (false)
            if (Intrinsics.areEqual((Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[k - 1]).value, byteString2)) {
              j = k;
            } else if (Intrinsics.areEqual((Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[k]).value, byteString2)) {
              j = k + 1;
            }  
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
      if (j == -1) {
        int m = this.nextHeaderIndex + 1;
        int n = this.dynamicTable.length;
        while (m < n) {
          int i1 = m;
          m++;
          Intrinsics.checkNotNull(this.dynamicTable[i1]);
          if (Intrinsics.areEqual((this.dynamicTable[i1]).name, byteString1)) {
            Intrinsics.checkNotNull(this.dynamicTable[i1]);
            if (Intrinsics.areEqual((this.dynamicTable[i1]).value, byteString2)) {
              j = i1 - this.nextHeaderIndex + (Hpack.INSTANCE.getSTATIC_HEADER_TABLE()).length;
              break;
            } 
            if (k == -1)
              k = i1 - this.nextHeaderIndex + (Hpack.INSTANCE.getSTATIC_HEADER_TABLE()).length; 
          } 
        } 
      } 
      try {
        if (j != -1) {
          writeInt(j, 127, 128);
          continue;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (k == -1) {
          this.out.writeByte(64);
          writeByteString(byteString1);
          writeByteString(byteString2);
          insertIntoDynamicTable(header);
          continue;
        } 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (byteString1.startsWith(Header.PSEUDO_PREFIX))
          try {
            if (!Intrinsics.areEqual(Header.TARGET_AUTHORITY, byteString1)) {
              writeInt(k, 15, 0);
              writeByteString(byteString2);
              continue;
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      writeInt(k, 63, 64);
      writeByteString(byteString2);
      insertIntoDynamicTable(header);
    } 
  }
  
  @JvmOverloads
  public Hpack$Writer(int paramInt, @NotNull Buffer paramBuffer) {
    this(paramInt, false, paramBuffer, 2, null);
  }
  
  public final void writeByteString(@NotNull ByteString paramByteString) throws IOException {
    long l = a ^ 0x3028DB5E0CC4L;
    try {
      Intrinsics.checkNotNullParameter(paramByteString, "data");
      if (this.useCompression && Huffman.INSTANCE.encodedLength(paramByteString) < paramByteString.size()) {
        Buffer buffer = new Buffer();
        Huffman.INSTANCE.encode(paramByteString, (BufferedSink)buffer);
        ByteString byteString = buffer.readByteString();
        writeInt(byteString.size(), 127, 128);
        this.out.write(byteString);
      } else {
        writeInt(paramByteString.size(), 127, 0);
        this.out.write(paramByteString);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  @JvmOverloads
  public Hpack$Writer(int paramInt, boolean paramBoolean, @NotNull Buffer paramBuffer) {
    this.headerTableSizeSetting = paramInt;
    this.useCompression = paramBoolean;
    this.out = paramBuffer;
    this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
    this.maxDynamicTableByteCount = this.headerTableSizeSetting;
    this.dynamicTable = new Header[8];
    this.nextHeaderIndex = this.dynamicTable.length - 1;
  }
  
  public final void resizeHeaderTable(int paramInt) {
    this.headerTableSizeSetting = paramInt;
    char c = '䀀';
    int i = Math.min(paramInt, c);
    try {
      if (this.maxDynamicTableByteCount == i)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i < this.maxDynamicTableByteCount)
        this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, i); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.emitDynamicTableSizeUpdate = true;
    this.maxDynamicTableByteCount = i;
    adjustDynamicTableByteCount();
  }
  
  @JvmOverloads
  public Hpack$Writer(@NotNull Buffer paramBuffer) {
    this(0, false, paramBuffer, 3, null);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\Administrator\Desktop\Matrix_7.0.0_alpha28(3)(1).jar!\me\rerere\matrix\thirdparty\okhttp3\internal\http2\Hpack$Writer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */